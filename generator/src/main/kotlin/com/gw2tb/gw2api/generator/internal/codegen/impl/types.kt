/*
 * Copyright (c) 2018-2024 Leon Linhart
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.gw2tb.gw2api.generator.internal.codegen.impl

import com.gw2tb.apigen.TestData
import com.gw2tb.apigen.model.*
import com.gw2tb.apigen.schema.*
import com.gw2tb.apigen.schema.model.APIType
import com.gw2tb.gw2api.generator.internal.codegen.*
import com.gw2tb.gw2api.generator.internal.codegen.PrintableFile
import com.gw2tb.gw2api.generator.internal.codegen.n
import com.gw2tb.gw2api.generator.internal.codegen.t
import com.gw2tb.gw2api.generator.internal.codegen.toKotlinType
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

internal fun Map<QualifiedTypeName.Declaration, APIType>.asPrintableFileSequence(apiVersion: Int): Sequence<PrintableFile> {
    fun getTypesInNest(nest: List<Name>?): Sequence<Pair<QualifiedTypeName.Declaration, APIType>> =
        entries.filter { (name, _) -> name.nest == nest }
            .map(Map.Entry<QualifiedTypeName.Declaration, APIType>::toPair)
            .asSequence()

    val topLevelTypes = getTypesInNest(nest = null)

    return topLevelTypes.map { (name, type) ->
        val content = type.printToString(
            apiVersion,
            name,
            lookupTypeDeclaration = { (it.name as? QualifiedTypeName.Declaration)?.let(this@asPrintableFileSequence::get)?.schema },
            getNestedTypes = { getTypesInNest(it) }
        )

        PrintableFile(
            "com/gw2tb/gw2api/types/v$apiVersion/${name.toKotlinName(apiVersion)}",
            """
            |@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
            |package com.gw2tb.gw2api.types.v$apiVersion
            |
            |import com.gw2tb.gw2api.types.*
            |import com.gw2tb.gw2api.types.internal.*
            |
            |import kotlinx.serialization.*
            |import kotlinx.serialization.builtins.*
            |import kotlinx.serialization.descriptors.*
            |import kotlinx.serialization.encoding.*
            |import kotlinx.serialization.json.*
            |
            |// Generated for type: ${name.joinToString(transform = Name::toTitleCase)}
            |
            |$content
            """.trimMargin()
        )
    }
}

internal fun Map<QualifiedTypeName.Declaration, APIType>.asPrintableTestFileSequence(apiVersion: Int): Sequence<PrintableFile> {
    val json = Json { prettyPrint = true }

    return entries
        .asSequence()
        .filter { (loc, _) -> loc.nest == null }
        .mapNotNull { (loc, type) ->
            val typeName = loc.toKotlinName(apiVersion)

            val content = TestData[type, type.schemaVersion]
                .mapIndexed { index, it -> (index to it) }
                .joinToString(separator = "$n$n") { (index, it) ->
                    """
                    |@Test
                    |fun testType_${index.toString().padStart(2, '0')}() {
                    |    json.decodeFromString<$typeName>(
                    |        ${"\""}""
                    |${json.encodeToString(it).prependIndent(t.repeat(2))}
                    |        ${"\""}"".trimIndent()
                    |    )
                    |}
                    """.trimMargin()
                }
                .ifBlank { null }
                ?.prependIndent(t) ?: return@mapNotNull null

            PrintableFile(
                "com/gw2tb/gw2api/types/v$apiVersion/$typeName",
                """
                |package com.gw2tb.gw2api.types.v$apiVersion
                |
                |import kotlin.test.*
                |import kotlinx.serialization.*
                |import kotlinx.serialization.json.*
                |
                |class ${typeName}Test {
                |
                |    private val json = Json {
                |        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
                |    }
                |
                |$content
                |
                |}
                """.trimMargin()
            )
        }
}

private fun APIType.printToString(
    apiVersion: Int?,
    name: QualifiedTypeName,
    lookupTypeDeclaration: (SchemaTypeReference) -> SchemaTypeDeclaration?,
    nest: List<Name> = emptyList(),
    getNestedTypes: (nest: List<Name>) -> Sequence<Pair<QualifiedTypeName.Declaration, APIType>> = { emptySequence() },
    inheritedProperties: Collection<SchemaProperty> = emptySet()
): String {
    val typeName = name.toKotlinName(apiVersion)
    return schema.printToString(
        apiVersion,
        typeName,
        lookupTypeDeclaration,
        nest,
        getNestedTypes,
        inheritedProperties,
        interpretationHint
    )
}

internal fun SchemaTypeDeclaration.printToString(
    apiVersion: Int? = null,
    typeName: String = name.toTitleCase(),
    lookupTypeDeclaration: (SchemaTypeReference) -> SchemaTypeDeclaration? = { null },
    nest: List<Name> = emptyList(),
    getNestedTypes: (nest: List<Name>) -> Sequence<Pair<QualifiedTypeName.Declaration, APIType>> = { emptySequence() },
    inheritedProperties: Collection<SchemaProperty> = emptySet(),
    interpretationHint: APIType.InterpretationHint? = null
): String {
    return when (this) {
        is SchemaAlias -> error("Unexpected schema type: SchemaAlias[${nest.joinToString(separator = ".", transform = Name::toTitleCase)}${name.toTitleCase()}]")
        is SchemaConditional -> printConditionalToString(apiVersion, typeName, lookupTypeDeclaration, nest, getNestedTypes)
        is SchemaEnum -> printEnumToString(apiVersion, typeName, lookupTypeDeclaration)
        is SchemaRecord -> printRecordToString(apiVersion, typeName, lookupTypeDeclaration, nest, getNestedTypes, inheritedProperties, interpretationHint)
        is SchemaTuple -> printTupleToString(apiVersion, typeName, lookupTypeDeclaration, nest, getNestedTypes)
    }
}

private fun SchemaConditional.printConditionalToString(
    apiVersion: Int?,
    typeName: String = name.toTitleCase(),
    lookupTypeDeclaration: (SchemaTypeReference) -> SchemaTypeDeclaration?,
    nest: List<Name> = emptyList(),
    getNestedTypes: (nest: List<Name>) -> Sequence<Pair<QualifiedTypeName.Declaration, APIType>> = { emptySequence() },
): String {
    val nestedTypes = getNestedTypes(nest + name)

    val members = buildList {
        sharedProperties.forEach { (_, property) ->
            add(property.printToString(apiVersion, isAbstract = true))
        }

        nestedTypes.forEach { (name, type) ->
            add(type.printToString(
                apiVersion = apiVersion,
                name = name,
                lookupTypeDeclaration = lookupTypeDeclaration,
                nest = nest + this@printConditionalToString.name,
                getNestedTypes = getNestedTypes,
                inheritedProperties = sharedProperties.values
            ))
        }
    }

    return buildString {
        append(
            """
            |@Suppress("ClassName")
            |private object __JsonParametricSerializer_$typeName : JsonContentPolymorphicSerializer<$typeName>($typeName::class) {
            |    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<$typeName> {
            |        return when (val type = element.jsonObject["${if (selectorInSideProperty) "__virtualType" else selector}"]?.jsonPrimitive?.content) {
            |            ${interpretations.entries.joinToString(separator = "$n$t$t$t") { (key, it) -> """"$key" -> $typeName.${it.type.toKotlinType(apiVersion).serializer}""" }}
            |            null -> throw SerializationException("Disambiguator property not found")
            |            else -> throw SerializationException("Invalid disambiguator value for $typeName: ${'$'}type")
            |        }
            |    }
            |}
            |
            |
            """.trimMargin()
        )

        appendLine(description.asDocComment)
        appendLine("@Serializable(with = __JsonParametricSerializer_$typeName::class)")
        append("public sealed class ")
        append(typeName)

        appendLine(" {$n")
        append(members.joinToString(separator = "$n$n").prependIndentNonEmpty(t))
        append("$n$n}")
    }
}

private fun SchemaEnum.printEnumToString(
    @Suppress("UNUSED_PARAMETER") apiVersion: Int?,
    typeName: String,
    @Suppress("UNUSED_PARAMETER") lookupTypeDeclaration: (SchemaTypeReference) -> SchemaTypeDeclaration?
): String {
    val valueStrings = values.map { value ->
        buildString {
            appendLine(value.description.asDocComment)
            appendLine("@Serializable")
            append("public data object ")
            append(value.name.toTitleCase())
            append(" : ")
            append(typeName)
            appendLine("() {")
            appendLine("${t}override val value: String get() = \"${value.value}\"")
            append("}")
        }
    }

    return buildString {
        appendLine(
            """
            |@Suppress("ClassName")
            |private object __${typeName}Serializer : KSerializer<${typeName}> {
            |
            |    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("$typeName", PrimitiveKind.STRING)
            |
            |    override fun deserialize(decoder: Decoder): $typeName = when (val value = decoder.decodeString()) {
            |        ${values.joinToString(separator = "$n|$t$t") { "\"${it.value}\" -> ${typeName}.${it.name.toTitleCase()}" }}
            |        else -> ${typeName}.Unknown(value)
            |    }
            |
            |    override fun serialize(encoder: Encoder, value: $typeName) {
            |        encoder.encodeString(value.value)
            |    }
            |
            |}
            |
            |
            """.trimMargin()
        )

        appendLine(description.asDocComment)
        appendLine("@Serializable(with = __${typeName}Serializer::class)")
        appendLine("public sealed class $typeName {$n")
        appendLine("${t}public abstract val value: String$n")

        appendLine(
            """
            |/** An unknown value. */
            |public data class Unknown(override val value: String) : $typeName()
            |
            """.trimMargin().prependIndentNonEmpty(t)
        )

        appendLine(valueStrings.joinToString(separator = "$n$n").prependIndentNonEmpty(t))
        append("$n}")
    }
}

private fun SchemaRecord.printRecordToString(
    apiVersion: Int?,
    typeName: String,
    lookupTypeDeclaration: (SchemaTypeReference) -> SchemaTypeDeclaration?,
    nest: List<Name> = emptyList(),
    getNestedTypes: (nest: List<Name>) -> Sequence<Pair<QualifiedTypeName.Declaration, APIType>> = { emptySequence() },
    inheritedProperties: Collection<SchemaProperty> = emptySet(),
    interpretationHint: APIType.InterpretationHint? = null
): String {
    val nestedTypes = getNestedTypes(nest + name)

    val propertyStrings = buildList {
        if (interpretationHint != null) {
            addAll(inheritedProperties.map { it.printToString(apiVersion, isOverride = true) })
        }

        if (interpretationHint?.interpretationNestProperty != null) {
            add("public val ${interpretationHint.interpretationNestProperty}: $typeName")
        } else {
            addAll(properties.values.map { it.printToString(apiVersion) })
        }
    }

    val requiresCustomPolymorphicSerializer = properties.values.any { property ->
        val type = property.type
        if (type !is SchemaTypeReference) return@any false

        val declaration = lookupTypeDeclaration(type)
        declaration is SchemaConditional && declaration.selectorInSideProperty
    } || (interpretationHint != null)

    fun serializerName(index: Int) = when (index) {
        -1 -> "__${typeName}GeneratedSerializer"
        else -> "__${typeName}Serializer$index"
    }

    val serializerChain: List<(Int) -> String> = buildList {
        if (requiresCustomPolymorphicSerializer) {
            val conditionalProperties = properties.values.mapNotNull { property ->
                (property.type as? SchemaTypeReference)?.let { lookupTypeDeclaration(it) as? SchemaConditional }?.let { property to it }
            }

            add { index ->
                """
                |@Suppress("ClassName")
                |private object ${serializerName(index)} : JsonTransformingSerializer<$typeName>(${serializerName(index - 1)}) {
                |    override fun transformDeserialize(element: JsonElement): JsonElement =
                |        JsonObject(element.jsonObject${if (conditionalProperties.isNotEmpty()) """|.mapValues { (key, value) ->
                |            when (key) {
                |                ${conditionalProperties.joinToString(separator = "$n$t$t$t$t") { (property, schema) -> """"${property.serialName}" -> JsonObject(value.jsonObject + ("__virtualType" to JsonPrimitive(element.jsonObject["${schema.selector}"]!!.jsonPrimitive.content)))""" }}
                |                else -> value
                |            }
                |        }
                """.trimMargin() else ""}${if (interpretationHint != null) " - \"__virtualType\"" else ""})
                |}
                """.trimMargin()
            }
        }

        if (properties.any { (_, v) -> v.isInline } || inheritedProperties.any { it.isInline }) {
            /*
             * Because of a bug in kotlinx.serialization, we have to generate a custom serial descriptor for classes.
             *
             * See https://github.com/Kotlin/kotlinx.serialization/issues/2549
             */
            val elements = buildList {
                @Suppress("NAME_SHADOWING")
                val nestedTypes = getNestedTypes(nest + name).map { it.second.schema }.toSet()

                for ((_, property) in properties) {
                    if (property.isInline) {
                        val s = lookupTypeDeclaration(property.type as SchemaTypeReference)
                        if (s is SchemaRecord) {
                            addAll(s.properties.values.map { p -> """element("${p.serialName}", ${p.type.toKotlinType(apiVersion, qualified = true).serializer}.descriptor, isOptional = ${p.optionality.isOptional})""" })
                        }
                    } else {
                        val isNested = (property.type as? SchemaTypeReference)?.let { lookupTypeDeclaration(it) } in nestedTypes
                        add("""element("${property.serialName}", ${if (isNested) "$typeName." else ""}${property.type.toKotlinType(apiVersion).serializer}.descriptor, isOptional = ${property.optionality.isOptional})""")
                    }
                }

                for (property in inheritedProperties) {
                    if (property.isInline) {
                        val s = lookupTypeDeclaration(property.type as SchemaTypeReference)
                        if (s is SchemaRecord) {
                            addAll(s.properties.values.map { p ->
                                val isNested = (p.type as? SchemaTypeReference)?.let { lookupTypeDeclaration(it) } in nestedTypes
                                """element("${p.serialName}", ${if (isNested) "$typeName." else ""}${p.type.toKotlinType(apiVersion).serializer}.descriptor, isOptional = ${p.optionality.isOptional})"""
                            })
                        }
                    } else {
                        val isNested = (property.type as? SchemaTypeReference)?.let { lookupTypeDeclaration(it) } in nestedTypes
                        add("""element("${property.serialName}", ${if (isNested) "$typeName." else ""}${property.type.toKotlinType(apiVersion).serializer}.descriptor, isOptional = ${property.optionality.isOptional})""")
                    }
                }
            }.joinToString(separator = "$n$t$t")

            fun transformDeserialize(decl: SchemaRecord): String = buildString {
                appendLine("buildJsonObject {")

                for ((_, property) in decl.properties) {
                    if (property.isInline) {
                        appendLine(buildString {
                            val s = lookupTypeDeclaration(property.type as SchemaTypeReference)
                            val condition = (s as SchemaRecord).properties.values.joinToString(separator = " || ") { """"${it.serialName}" in element""" }

                            appendLine("""if ($condition) put("${property.serialName}", buildJsonObject {""")

                            for ((_, p) in s.properties) {
                                appendLine("""${t}if ("${p.serialName}" in element) put("${p.serialName}", element["${p.serialName}"]!!)""")
                            }

                            append("})")
                        }.prependIndentNonEmpty(t.repeat(3)))
                    } else {
                        appendLine("""$t$t${t}if ("${property.serialName}" in element) put("${property.serialName}", element["${property.serialName}"]!!)""")
                    }
                }



//                for (property in decl.inheritedProperties) {
//                    append("${t.repeat(2)}\"${property.serialName}\" -> put(\"${property.serialName}\", ${if (property.isInline) "transformDeserialize(v)" else "v"})")
//                }

                append("$t$t}")
            }

            fun transformSerialize(decl: SchemaRecord): String = buildString {
                appendLine("buildJsonObject {")
                appendLine("$t$t${t}for ((k, v) in element.entries) when (k) {")

                for ((_, property) in decl.properties) {
                    if (!property.isInline) continue
                    appendLine("""$t$t$t$t"${property.serialName}" -> element["${property.serialName}"]!!.jsonObject.forEach { put(it.key, it.value) }""")
                }

                appendLine("$t$t$t${t}else -> put(k, v)")

//                for (property in decl.inheritedProperties) {
//                    append("${t.repeat(2)}\"${property.serialName}\" -> put(\"${property.serialName}\", ${if (property.isInline) "transformDeserialize(v)" else "v"})")
//                }

                appendLine("$t$t$t}")
                append("$t$t}")
            }

            add { index ->
                """
                |@Suppress("ClassName")
                |private object ${serializerName(index)} : JsonInlineSerializer<$typeName>(${serializerName(index - 1)}) {
                |    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("com.gw2tb.gw2api.types.v${apiVersion}.$typeName") {
                |        $elements
                |    }
                |    override fun transformDeserialize(element: JsonElement): JsonElement {
                |        require(element is JsonObject)
                |        return ${transformDeserialize(this@printRecordToString)}
                |    }
                |    override fun transformSerialize(element: JsonElement): JsonElement {
                |        require(element is JsonObject)
                |        return ${transformSerialize(this@printRecordToString)}
                |    }
                |}
                """.trimMargin()
            }
        }
    }

    return buildString {
        if (serializerChain.isNotEmpty()) {
            append(
                """
                @Suppress("ClassName")
                @Serializer(forClass = $typeName::class)
                private object __${typeName}GeneratedSerializer : KSerializer<$typeName>
                """.trimIndent()
            )

            appendLine(serializerChain.mapIndexed(::Pair).joinToString(separator = "$n$n", prefix = "$n$n", postfix = n) { (index, f) -> f(index) })
        }

        appendLine(dokka(
            sharedProperties = inheritedProperties,
            interpretationInNestedProperty = interpretationHint?.interpretationNestProperty != null
        ))

        appendLine(if (serializerChain.isNotEmpty()) "@Serializable(with = ${serializerName(serializerChain.lastIndex)}::class)" else "@Serializable")

        if (propertyStrings.isEmpty()) {
            append("public data object $typeName")
        } else {
            appendLine("public data class $typeName(")
            appendLine(propertyStrings.joinToString(separator = ",$n").prependIndent(t))
            append(")")
        }

        val nestedInterpretation = if (interpretationHint?.interpretationNestProperty != null) {
            printRecordToString(apiVersion, typeName, lookupTypeDeclaration)
        } else null

        val nestedTypesStr = nestedTypes.joinToString(separator = "$n$n") { (name, type) ->
            type.printToString(
                apiVersion = apiVersion,
                name = name,
                lookupTypeDeclaration = lookupTypeDeclaration,
                nest = nest + this@printRecordToString.name,
                getNestedTypes = getNestedTypes
            )
        }

        if (interpretationHint != null) {
            append(" : ")
            append(interpretationHint.conditionalBase.toKotlinName(apiVersion))
            append("()")
        }

        if (nestedInterpretation != null || nestedTypesStr.isNotEmpty()) {
            appendLine(" {$n")

            if (nestedInterpretation != null) {
                appendLine(nestedInterpretation.prependIndentNonEmpty(t))
                appendLine()
            }

            if (nestedTypesStr.isNotEmpty()) {
                appendLine(nestedTypesStr.prependIndentNonEmpty(t))
                appendLine()
            }

            append("}")
        }
    }
}

private fun SchemaTuple.printTupleToString(
    apiVersion: Int?,
    typeName: String,
    lookupTypeDeclaration: (SchemaTypeReference) -> SchemaTypeDeclaration?,
    nest: List<Name> = emptyList(),
    getNestedTypes: (nest: List<Name>) -> Sequence<Pair<QualifiedTypeName.Declaration, APIType>> = { emptySequence() }
): String {
    val nestedTypes = getNestedTypes(nest + name)
    val nestedTypesStr = nestedTypes.joinToString(separator = "$n$n") { (name, type) ->
        type.printToString(
            apiVersion = apiVersion,
            name = name,
            lookupTypeDeclaration = lookupTypeDeclaration,
            nest = nest + this@printTupleToString.name,
            getNestedTypes = getNestedTypes
        )
    }

    val propertyStrings = elements.map { it.printToString(apiVersion) }

    return buildString {
        appendLine(
            """
            |@Suppress("ClassName")
            |@Serializer(forClass = $typeName::class)
            |private object __${typeName}GeneratedSerializer : KSerializer<$typeName?>
            |
            |@Suppress("ClassName")
            |private object __${typeName}Serializer : JsonTupleSerializer<$typeName?>(__${typeName}GeneratedSerializer)
            |
            """.trimMargin()
        )

        appendLine(description.asDocComment)
        appendLine("@Serializable(with = __${typeName}Serializer::class)")
        appendLine("public data class $typeName(")
        appendLine(propertyStrings.joinToString(separator = ",$n").prependIndent(t))
        append(")")

        if (nestedTypesStr.isNotEmpty()) {
            appendLine(" {$n")

            if (nestedTypesStr.isNotEmpty()) {
                appendLine(nestedTypesStr.prependIndentNonEmpty(t))
                appendLine()
            }

            append("}")
        }
    }
}

private fun SchemaTuple.Element.printToString(
    apiVersion: Int?
): String {
    val typeInfo = type.toKotlinType(apiVersion)

    return buildString {
        appendLine("This field holds $description.".asDocComment)
        append("public val ${name.toCamelCase()}: ${typeInfo.name}")
    }
}

internal fun SchemaProperty.printToString(
    apiVersion: Int?,
    isAbstract: Boolean = false,
    isOverride: Boolean = false
): String {
    val typeInfo = type.toKotlinType(apiVersion)

    return buildString {
        if (!isOverride)
            appendLine("This field holds $description.".asDocComment)

        if (isDeprecated)
            appendLine("@Deprecated(message = \"This property is deprecated.\")")

        if (!isAbstract) {
            if (serialName != name.toCamelCase())
                appendLine("""@SerialName("$serialName")""")

            if (isLenient)
                appendLine("""@Serializable(with = Lenient${typeInfo.name}Serializer::class)""")

            if (isInline)
                appendLine("@SerializeInline")
        }

        if (isAbstract)
            append("public abstract ")

        if (isOverride)
            append("override ")

        append("val ")
        append(name.toCamelCase())

        append(": ")
        append(typeInfo.name)

        if (optionality.isOptional) {
            append("?")
            if (!isAbstract) append(" = null")
        }
    }
}