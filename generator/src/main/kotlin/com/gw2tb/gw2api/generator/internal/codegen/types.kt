/*
 * Copyright (c) 2018-2022 Leon Linhart
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
package com.gw2tb.gw2api.generator.internal.codegen

import com.gw2tb.apigen.*
import com.gw2tb.apigen.model.*
import com.gw2tb.apigen.model.v2.*
import com.gw2tb.apigen.schema.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*

internal fun sequenceOfPrintableV1Types(): Sequence<PrintableFile> =
    API_V1.supportedTypes.printableTypesSequence(
        "v1",
        printTypes = Sequence<Map.Entry<TypeLocation, APIType.V1>>::printV1TypesInNest,
        declarationSelector = { it.schema }
    )

internal fun sequenceOfPrintableV1TypeTests(): Sequence<PrintableFile> =
    API_V1.printableTypeTestsSequence("v1", schemaVersionSelector = { null })

internal fun sequenceOfPrintableV2Types(schemaVersion: V2SchemaVersion): Sequence<PrintableFile> =
    API_V2.supportedTypes.printableTypesSequence(
        "v2",
        printTypes = { entries, apiVersion, nest, typeLookup -> entries.printV2TypesInNest(schemaVersion, apiVersion, nest, typeLookup) },
        declarationSelector = { it[schemaVersion].data }
    )

internal fun sequenceOfPrintableV2TypeTests(schemaVersion: V2SchemaVersion): Sequence<PrintableFile> =
    API_V2.printableTypeTestsSequence("v2", schemaVersionSelector = { it[schemaVersion].since })

private fun <T : APIType> Map<TypeLocation, T>.printableTypesSequence(
    apiVersionInfix: String,
    printTypes: (entries: Sequence<Map.Entry<TypeLocation, T>>, apiVersion: String, filter: (TypeLocation) -> Boolean, typeLookup: (TypeLocation) -> SchemaTypeDeclaration) -> String,
    declarationSelector: (T) -> SchemaTypeDeclaration
): Sequence<PrintableFile> {
    val typeLookup: (TypeLocation) -> SchemaTypeDeclaration = { declarationSelector(this[it] ?: error("Could not find type: $it")) }

    return entries
        .groupByEndpoint { (loc, _) -> (if (loc.nest == null) loc else TypeLocation(null, loc.nest!!.substringBefore('/'))).toKotlinName(apiVersionInfix) }
        .asSequence()
        .mapNotNull { (endpoint, entries) ->
            val content = printTypes(entries.asSequence(), apiVersionInfix, { it.nest == null && entries.any { (loc, _) -> loc == it } }, typeLookup)

            if (content.isNotEmpty()) {
                PrintableFile(
                    "com/gw2tb/gw2api/types/$apiVersionInfix/${endpoint.removeSuffix("/")}",
                    """
                    |@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
                    |package com.gw2tb.gw2api.types.$apiVersionInfix
                    |
                    |import kotlinx.serialization.*
                    |import kotlinx.serialization.builtins.*
                    |import kotlinx.serialization.json.*
                    |
                    |$content
                    """.trimMargin()
                )
            } else
                null
        }
}

private fun <T : APIType> APIVersion<*, T>.printableTypeTestsSequence(apiVersionInfix: String, schemaVersionSelector: (T) -> V2SchemaVersion?): Sequence<PrintableFile> {
    val json = Json { prettyPrint = true }

    return supportedTypes
        .entries
        .asSequence()
        .filter { (loc, _) -> loc.nest == null }
        .map { (loc, type) ->
            val typeName = loc.toKotlinName(apiVersionInfix)

            val content = TestData[type, schemaVersionSelector(type)]
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
                .prependIndent(t)

            PrintableFile(
                "com/gw2tb/gw2api/types/$apiVersionInfix/$typeName",
                """
                |package com.gw2tb.gw2api.types.$apiVersionInfix
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

private fun Sequence<Map.Entry<TypeLocation, APIType.V1>>.printV1TypesInNest(apiVersionInfix: String, filter: (TypeLocation) -> Boolean, typeLookup: (TypeLocation) -> SchemaTypeDeclaration): String =
    filter { (location, _) -> filter(location) }
        .joinToString(separator = "$n$n") { (location, type) ->
            type.schema.toClassString(
                location,
                { nest -> printV1TypesInNest(apiVersionInfix, filter = { it.nest == nest }, typeLookup) },
                interpretationHint = type.interpretationHint,
                apiVersionInfix = apiVersionInfix,
                typeLookup = typeLookup
            )
        }

private fun Sequence<Map.Entry<TypeLocation, APIType.V2>>.printV2TypesInNest(schemaVersion: V2SchemaVersion, apiVersionInfix: String, filter: (TypeLocation) -> Boolean, typeLookup: (TypeLocation) -> SchemaTypeDeclaration): String =
    filter { (location, _) -> filter(location) }
        .mapNotNull { (location, type) -> type.getOrNull(schemaVersion)?.let { (location to (type to it)) } }
        .joinToString(separator = "$n$n") { (location, p) ->
            val (type, schema) = p

            schema.data.toClassString(
                location,
                { nest -> printV2TypesInNest(schemaVersion, apiVersionInfix, filter = { it.nest == nest }, typeLookup) },
                interpretationHint = type.interpretationHint,
                apiVersionInfix = apiVersionInfix,
                typeLookup = typeLookup
            )
        }

internal fun SchemaTypeDeclaration.toClassString(
    location: TypeLocation?,
    nestedTypesToString: (String) -> String,
    serialName: String? = null,
    interpretationHint: InterpretationHint? = null,
    isNestedInterpretation: Boolean = false,
    apiVersionInfix: String? = null,
    typeLookup: (TypeLocation) -> SchemaTypeDeclaration
): String {
    val className = location?.toKotlinName(apiVersionInfix) ?: name

    val classNest = buildString {
        if (location == null)
            append("__synthetic__")
        else
            if (location.nest != null) append("${location.nest}/")

        append(name)
    }

    return when (this) {
        is SchemaConditional -> {
            require(serialName == null)
            toSealedClassString(
                className,
                classNest,
                nestedTypesToString,
                apiVersionInfix
            )
        }
        is SchemaRecord -> toDataClassString(
            className,
            classNest,
            nestedTypesToString,
            serialName = serialName,
            interpretationHint = interpretationHint,
            isNestedInterpretation = isNestedInterpretation,
            apiVersionInfix = apiVersionInfix,
            typeLookup = typeLookup
        )
        else -> error("")
    }
}

@OptIn(ExperimentalStdlibApi::class)
private fun SchemaRecord.toDataClassString(
    className: String,
    nest: String,
    nestedTypesToString: (String) -> String,
    serialName: String?,
    interpretationHint: InterpretationHint?,
    isNestedInterpretation: Boolean,
    apiVersionInfix: String?,
    typeLookup: (TypeLocation) -> SchemaTypeDeclaration
) = buildString {
    val conditionalBaseDeclaration = if (interpretationHint != null) typeLookup(interpretationHint.conditionalBase) as SchemaConditional else null

    val requiresCustomPolymorphicSerializer = properties.values.any { property ->
        val type = property.type
        if (type !is SchemaTypeReference) return@any false

        val declaration = typeLookup(type.typeLocation)
        declaration is SchemaConditional && declaration.disambiguationBySideProperty
    } || (interpretationHint != null)

    if (requiresCustomPolymorphicSerializer) {
        val conditionalProperties = properties.values.mapNotNull { property ->
            (property.type as? SchemaTypeReference)?.let { typeLookup(it.typeLocation) as? SchemaConditional }?.let { property to it }
        }

        append(
            """
                |@Suppress("ClassName")
                |@Serializer(forClass = $className::class)
                |private object __${className}GeneratedSerializer : KSerializer<$className>
                |
                |@Suppress("ClassName")
                |private object __${className}Serializer : JsonTransformingSerializer<$className>(__${className}GeneratedSerializer) {
                |    override fun transformDeserialize(element: JsonElement): JsonElement =
                |        JsonObject(element.jsonObject${if (conditionalProperties.isNotEmpty()) """|.mapValues { (key, value) ->
                |            when (key) {
                |                ${conditionalProperties.joinToString(separator = "$n$t$t$t$t") { (property, schema) -> """"${property.serialName}" -> JsonObject(value.jsonObject + ("__virtualType" to JsonPrimitive(element.jsonObject["${schema.disambiguationBy}"]!!.jsonPrimitive.content)))""" }}
                |                else -> value
                |            }
                |        }
                """.trimMargin() else ""}${if (interpretationHint != null) " - \"__virtualType\"" else ""})
                |}
                |
                |
                """.trimMargin()
        )
    }

    appendLine(dokka(
        sharedProperties = conditionalBaseDeclaration?.sharedProperties ?: emptyMap(),
        interpretationInNestedProperty = interpretationHint?.interpretationNestProperty != null && conditionalBaseDeclaration?.interpretationInNestedProperty == true
    ))

    if (serialName != null)
        appendLine("@SerialName($serialName)")

    appendLine(if (requiresCustomPolymorphicSerializer) "@Serializable(with = __${className}Serializer::class)" else "@Serializable")
    if (isNestedInterpretation && properties.isEmpty()) {
        append("public object $className")
    } else {
        append("public data class $className")
        append(sequence {
            if (conditionalBaseDeclaration != null) {
                yieldAll(conditionalBaseDeclaration.sharedProperties.values.map { property ->
                    property.printToString(apiVersionInfix, isOverride = true)
                })
            }

            if (conditionalBaseDeclaration?.interpretationInNestedProperty != true) {
                yieldAll(properties.values.map { property ->
                    property.printToString(apiVersionInfix)
                })
            } else {
                yield("val ${interpretationHint!!.interpretationNestProperty!!}: $className")
            }
        }.map { it.prependIndentNonEmpty(t) }.joinToString(separator = ",$n", prefix = "($n", postfix = "$n)"))
    }

    if (interpretationHint != null) {
        append(" : ${interpretationHint.conditionalBase.toKotlinName(apiVersionInfix)}()")
    }

    val body = buildList {
        if (conditionalBaseDeclaration?.interpretationInNestedProperty == true) {
            add(this@toDataClassString.toClassString(
                null,
                { "" },
                isNestedInterpretation = true,
                apiVersionInfix = apiVersionInfix,
                typeLookup = typeLookup
            ))
        }

        val nestedTypes = nestedTypesToString(nest)
        if (nestedTypes.isNotEmpty()) add(nestedTypes)
    }.joinToString(separator = "$n$n")

    if (body.isNotBlank())
        append(" {$n$n${body.prependIndentNonEmpty(t)}$n$n}")
}

private fun SchemaConditional.toSealedClassString(
    className: String,
    nest: String,
    nestedTypesToString: (String) -> String,
    apiVersionInfix: String?
) = buildString {
    append(
        """
        |@Suppress("ClassName")
        |private object __JsonParametricSerializer_$className : JsonContentPolymorphicSerializer<$className>($className::class) {
        |    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out $className> {
        |        return when (val type = element.jsonObject["${if (disambiguationBySideProperty) "__virtualType" else disambiguationBy}"]?.jsonPrimitive?.content) {
        |            ${interpretations.entries.joinToString(separator = "$n$t$t$t") { (key, it) -> """"$key" -> $className.${it.type.toKotlinType(apiVersionInfix).serializer}""" }}
        |            null -> throw SerializationException("Disambiguator property not found")
        |            else -> throw SerializationException("Invalid disambiguator value for $className: ${'$'}type")
        |        }
        |    }
        |}
        |
        |
        """.trimMargin()
    )

    appendLine(dokka())
    appendLine("@Serializable(with = __JsonParametricSerializer_$className::class)")
    append("public sealed class $className")

    val body = sequence {
        if (sharedProperties.isNotEmpty())
            yield(sharedProperties.values.joinToString(separator = n) { property ->
                property.printToString(apiVersionInfix, isAbstract = true)
            })

        val nestedTypes = nestedTypesToString(nest)
        if (nestedTypes.isNotBlank()) yield(nestedTypes)
    }.joinToString(separator = "$n$n")

    if (body.isNotBlank())
        append(" {$n$n${body.prependIndentNonEmpty(t)}$n$n}")
}

private fun SchemaProperty.printToString(
    apiVersionInfix: String?,
    isAbstract: Boolean = false,
    isOverride: Boolean = false
): String = buildString {
    require(!(isAbstract && isOverride))

    /*
     * I'm not sure if the current behavior is the intended behavior but dokka does not seem to copy the documentation
     * from a "param" tag to a property anymore. Thus, we use `!isOverride` here instead of `isAbstract` to generate
     * property documentation everywhere.
     *
     * See https://github.com/Kotlin/dokka/issues/232
     */
    if (!isOverride) appendLine(dokka())

    if (isDeprecated) appendLine("""@Deprecated(message = "")""")

    if (!isAbstract) {
        if (serialName != camelCaseName)
            appendLine("""@SerialName("$serialName")""")

        if (isLenient)
            appendLine("""@Serializable(with = com.gw2tb.gw2api.types.internal.LenientIntSerializer::class)""")
    }

    val type = type.toKotlinType(apiVersionInfix).name

    if (isAbstract) append("public abstract ")
    if (isOverride) append("override ")

    append("val $camelCaseName: $type")

    if (optionality.isOptional) {
        if (isAbstract) {
            append("?")
        } else {
            append("? = null")
        }
    }
}