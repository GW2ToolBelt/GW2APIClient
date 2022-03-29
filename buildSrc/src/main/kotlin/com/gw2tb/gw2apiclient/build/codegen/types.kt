/*
 * Copyright (c) 2018-2021 Leon Linhart
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
package com.gw2tb.gw2apiclient.build.codegen

import com.gw2tb.apigen.*
import com.gw2tb.apigen.model.*
import com.gw2tb.apigen.model.v2.*
import com.gw2tb.apigen.schema.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*

fun sequenceOfPrintableV1Types(): Sequence<PrintableFile> =
    API_V1.supportedTypes.printableTypesSequence(
        "v1",
        printTypes = Sequence<Map.Entry<TypeLocation, APIType.V1>>::printV1TypesInNest,
        declarationSelector = { it.schema }
    )

fun sequenceOfPrintableV1TypeTests(): Sequence<PrintableFile> =
    API_V1.printableTypeTestsSequence("v1", schemaVersionSelector = { null })

fun sequenceOfPrintableV2Types(schemaVersion: V2SchemaVersion): Sequence<PrintableFile> =
    API_V2.supportedTypes.printableTypesSequence(
        "v2",
        printTypes = { entries, apiVersion, nest, typeLookup -> entries.printV2TypesInNest(schemaVersion, apiVersion, nest, typeLookup) },
        declarationSelector = { it[schemaVersion].data }
    )

fun sequenceOfPrintableV2TypeTests(schemaVersion: V2SchemaVersion): Sequence<PrintableFile> =
    API_V2.printableTypeTestsSequence("v2", schemaVersionSelector = { it[schemaVersion].since })

private fun <T : APIType> Map<TypeLocation, T>.printableTypesSequence(
    apiVersion: String,
    printTypes: (entries: Sequence<Map.Entry<TypeLocation, T>>, apiVersion: String, filter: (TypeLocation) -> Boolean, typeLookup: (TypeLocation) -> SchemaTypeDeclaration) -> String,
    declarationSelector: (T) -> SchemaTypeDeclaration
): Sequence<PrintableFile> {
    val typeLookup: (TypeLocation) -> SchemaTypeDeclaration = { declarationSelector(this[it] ?: error("Could not find type: $it")) }

    return entries
        .groupByEndpoint { (loc, _) -> (if (loc.nest == null) loc else TypeLocation(null, loc.nest!!.substringBefore('/'))).toKotlinName(apiVersion) }
        .asSequence()
        .mapNotNull { (endpoint, entries) ->
            val content = printTypes(entries.asSequence(), apiVersion, { it.nest == null && entries.any { (loc, _) -> loc == it } }, typeLookup)

            if (content.isNotEmpty()) {
                PrintableFile(
                    "com/gw2tb/gw2api/types/$apiVersion/${endpoint.removeSuffix("/")}",
                    """
                    |@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
                    |package com.gw2tb.gw2api.types.$apiVersion
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

private fun <T : APIType> APIVersion<*, T>.printableTypeTestsSequence(apiVersion: String, schemaVersionSelector: (T) -> V2SchemaVersion?): Sequence<PrintableFile> {
    val json = Json { prettyPrint = true }

    return supportedTypes
        .entries
        .asSequence()
        .filter { (loc, _) -> loc.nest == null }
        .map { (loc, type) ->
            val typeName = loc.toKotlinName(apiVersion)

            val content = TestData[this, loc.name, schemaVersionSelector(type)]
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
                "com/gw2tb/gw2api/types/$apiVersion/$typeName",
                """
                |package com.gw2tb.gw2api.types.$apiVersion
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

private fun Sequence<Map.Entry<TypeLocation, APIType.V1>>.printV1TypesInNest(apiVersion: String, filter: (TypeLocation) -> Boolean, typeLookup: (TypeLocation) -> SchemaTypeDeclaration): String =
    filter { (location, _) -> filter(location) }
        .joinToString(separator = "$n$n") { (location, type) ->
            type.schema.toClassString(
                location,
                { nest -> printV1TypesInNest(apiVersion, filter = { it.nest == nest }, typeLookup) },
                interpretationHint = type.interpretationHint,
                apiVersion = apiVersion,
                typeLookup = typeLookup
            )
        }

private fun Sequence<Map.Entry<TypeLocation, APIType.V2>>.printV2TypesInNest(schemaVersion: V2SchemaVersion, apiVersion: String, filter: (TypeLocation) -> Boolean, typeLookup: (TypeLocation) -> SchemaTypeDeclaration): String =
    filter { (location, _) -> filter(location) }
        .mapNotNull { (location, type) -> type.getOrNull(schemaVersion)?.let { (location to (type to it)) } }
        .joinToString(separator = "$n$n") { (location, p) ->
            val (type, schema) = p

            schema.data.toClassString(
                location,
                { nest -> printV2TypesInNest(schemaVersion, apiVersion, filter = { it.nest == nest }, typeLookup) },
                interpretationHint = type.interpretationHint,
                apiVersion = apiVersion,
                typeLookup = typeLookup
            )
        }

internal fun SchemaTypeDeclaration.toClassString(
    location: TypeLocation?,
    nestedTypesToString: (String) -> String,
    serialName: String? = null,
    interpretationHint: InterpretationHint? = null,
    isNestedInterpretation: Boolean = false,
    apiVersion: String?,
    typeLookup: (TypeLocation) -> SchemaTypeDeclaration
): String {
    val className = location?.toKotlinName(apiVersion) ?: name

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
                apiVersion,
                typeLookup = typeLookup,
            )
        }
        is SchemaRecord -> toDataClassString(
            className,
            classNest,
            nestedTypesToString,
            serialName = serialName,
            interpretationHint = interpretationHint,
            isNestedInterpretation = isNestedInterpretation,
            apiVersion = apiVersion,
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
    apiVersion: String?,
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

    appendLine(dokka())

    if (serialName != null)
        appendLine("@SerialName($serialName)")

    appendLine(if (requiresCustomPolymorphicSerializer) "@Serializable(with = __${className}Serializer::class)" else "@Serializable")
    if (isNestedInterpretation && properties.isEmpty()) {
        append("public object $className")
    } else {
        append("public data class $className")
        append(sequence {
            if (conditionalBaseDeclaration != null) {
                yieldAll(conditionalBaseDeclaration.sharedProperties.values.map { property -> buildString {
                    if (property.isDeprecated)
                        appendLine("""@Deprecated(message = "")""")

                    if (property.serialName != property.camelCaseName)
                        appendLine("""@SerialName("${property.serialName}")""")

                    append("override val ${property.camelCaseName}: ${property.type.toKotlinType(apiVersion).name}${if (property.optionality !== Optionality.REQUIRED) "? = null" else ""}")
                }})
            }

            if (conditionalBaseDeclaration?.interpretationInNestedProperty != true) {
                yieldAll(properties.values.map { property -> buildString {
                    if (property.isDeprecated)
                        appendLine("""@Deprecated(message = "")""")

                    if (property.serialName != property.camelCaseName)
                        appendLine("""@SerialName("${property.serialName}")""")

                    append("val ${property.camelCaseName}: ${property.type.toKotlinType(apiVersion).name}${if (property.optionality !== Optionality.REQUIRED) "? = null" else ""}")
                }})
            } else {
                yield("val ${interpretationHint!!.interpretationNestProperty!!}: $className")
            }
        }.map { it.prependIndentNonEmpty(t) }.joinToString(separator = ",$n", prefix = "($n", postfix = "$n)"))
    }

    if (interpretationHint != null) {
        append(" : ${interpretationHint.conditionalBase.toKotlinName(apiVersion)}()")
    }

    val body = buildList {
        if (conditionalBaseDeclaration?.interpretationInNestedProperty == true) {
            add(this@toDataClassString.toClassString(
                null,
                { "" },
                isNestedInterpretation = true,
                apiVersion = apiVersion,
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
    apiVersion: String?,
    typeLookup: (TypeLocation) -> SchemaTypeDeclaration
) = buildString {
    append(
        """
        |@Suppress("ClassName")
        |private object __JsonParametricSerializer_$className : JsonContentPolymorphicSerializer<$className>($className::class) {
        |    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out $className> {
        |        return when (element.jsonObject["${if (disambiguationBySideProperty) "__virtualType" else disambiguationBy}"]!!.jsonPrimitive.content) {
        |            ${interpretations.entries.joinToString(separator = "$n$t$t$t") { (key, it) -> """"$key" -> $className.${it.type.toKotlinType(apiVersion).serializer}""" }}
        |            else -> TODO()
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

//    if (superClass != null)
//        append(" : $superClass()")

    val body = sequence {
        if (sharedProperties.isNotEmpty())
            yield(sharedProperties.values.joinToString(separator = n) {
                "public abstract val ${it.camelCaseName}: ${it.type.toKotlinType(apiVersion).name}${if (it.optionality != Optionality.REQUIRED) "?" else ""}"
            })

        val nestedTypes = nestedTypesToString(nest)
        if (nestedTypes.isNotBlank()) yield(nestedTypes)
    }.joinToString(separator = "$n$n")

    if (body.isNotBlank())
        append(" {$n$n${body.prependIndentNonEmpty(t)}$n$n}")
}