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

fun sequenceOfPrintableV1Types(): Sequence<PrintableFile> =
    APIVersion.API_V1.supportedTypes.printableTypesSequence(
        "v1",
        Sequence<Map.Entry<TypeLocation, List<APIType.V1>>>::printV1TypesInNest
    )

fun sequenceOfPrintableV2Types(schemaVersion: V2SchemaVersion): Sequence<PrintableFile> =
    APIVersion.API_V2.supportedTypes.printableTypesSequence("v2") { entries, prefix, nest ->
        entries.printV2TypesInNest(schemaVersion, prefix, nest)
    }

private fun <T : APIType>  Map<TypeLocation, List<T>>.printableTypesSequence(
    apiVersion: String,
    printTypes: (entries: Sequence<Map.Entry<TypeLocation, List<T>>>, prefix: String, nest: String?) -> String
): Sequence<PrintableFile> =
    entries
        .groupByEndpoint { (loc, _) -> loc.endpoint!! }
        .asSequence()
        .mapNotNull { (endpoint, entries) ->
            val content = printTypes(entries.asSequence(), "GW2$apiVersion", null)

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

private fun Sequence<Map.Entry<TypeLocation, List<APIType.V1>>>.printV1TypesInNest(prefix: String? = null, nest: String? = null): String =
    filter { (loc, _) -> loc.nest == nest }
        .flatMap { it.value }
        .joinToString(separator = "$n$n") {
            it.schema.toClassString(nest, { nest -> printV1TypesInNest(nest = nest) }, prefix)
        }

private fun Sequence<Map.Entry<TypeLocation, List<APIType.V2>>>.printV2TypesInNest(schemaVersion: V2SchemaVersion, prefix: String? = null, nest: String? = null): String =
    filter { (loc, _) -> loc.nest == nest }
        .flatMap { it.value }
        .mapNotNull { it.getOrNull(schemaVersion) }
        .joinToString(separator = "$n$n") {
            it.data.toClassString(nest, { nest -> printV2TypesInNest(schemaVersion, nest = nest) }, prefix)
        }

fun SchemaClass.toClassString(
    nest: String?,
    nestedTypesToString: (String) -> String,
    prefix: String? = null,
    serialName: String? = null,
    superClass: String? = null,
    isInterpretation: Boolean = false,
    isNestedInterpretation: Boolean = false,
    interpretationNest: String? = null,
    inheritedSharedProperties: Map<String, SchemaRecord.Property> = emptyMap()
): String {
    val className = if (prefix != null) "$prefix$name" else toKotlinType().name
    val classNest = buildString {
        if (nest != null) append("$nest/")
        append(name)
    }

    return when (this) {
        is SchemaConditional -> {
            require(serialName == null)
            toSealedClassString(
                className,
                classNest,
                nestedTypesToString,
                superClass = superClass,
                inheritedSharedProperties = inheritedSharedProperties
            )
        }
        is SchemaRecord -> toDataClassString(
            className,
            classNest,
            nestedTypesToString,
            serialName = serialName,
            superClass = superClass,
            isInterpretation = isInterpretation,
            isNestedInterpretation = isNestedInterpretation,
            interpretationNest = interpretationNest,
            inheritedSharedProperties = inheritedSharedProperties
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
    superClass: String?,
    isInterpretation: Boolean,
    isNestedInterpretation: Boolean,
    interpretationNest: String?,
    inheritedSharedProperties: Map<String, SchemaRecord.Property>
) = buildString {
    val requiresCustomPolymorphicSerializer = properties.values.any { it.type is SchemaConditional && (it.type as SchemaConditional).disambiguationBySideProperty } || isInterpretation

    if (requiresCustomPolymorphicSerializer) {
        append(
            """
                |@Suppress("ClassName")
                |@Serializer(forClass = $className::class)
                |private object __${className}GeneratedSerializer : KSerializer<$className>
                |
                |@Suppress("ClassName")
                |private object __${className}Serializer : JsonTransformingSerializer<$className>(__${className}GeneratedSerializer) {
                |    override fun transformDeserialize(element: JsonElement): JsonElement =
                |        JsonObject(element.jsonObject${if (properties.values.any { it.type is SchemaConditional }) """|.mapValues { (key, value) ->
                |            when (key) {
                |                ${properties.values.filter { it.type is SchemaConditional }.joinToString(separator = "$n$t$t$t$t") { """"${it.serialName}" -> JsonObject(value.jsonObject + ("__virtualType" to JsonPrimitive(element.jsonObject["${(it.type as SchemaConditional).disambiguationBy}"]!!.jsonPrimitive.content)))""" }}
                |                else -> value
                |            }
                |        }
                """.trimMargin() else ""}${if (isInterpretation) " - \"__virtualType\"" else ""})
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
            yieldAll(inheritedSharedProperties.values.map { property -> buildString {
                if (property.isDeprecated)
                    appendLine("""@Deprecated(message = "")""")

                if (property.serialName != property.camelCaseName)
                    appendLine("""@SerialName("${property.serialName}")""")

                append("override val ${property.camelCaseName}: ${property.type.toKotlinType()}${if (property.optionality !== Optionality.REQUIRED) "? = null" else ""}")
            }})

            if (interpretationNest == null) {
                yieldAll(properties.values.map { property -> buildString {
                    if (property.isDeprecated)
                        appendLine("""@Deprecated(message = "")""")

                    if (property.serialName != property.camelCaseName)
                        appendLine("""@SerialName("${property.serialName}")""")

                    append("val ${property.camelCaseName}: ${property.type.toKotlinType()}${if (property.optionality !== Optionality.REQUIRED) "? = null" else ""}")
                }})
            } else {
                yield("val $interpretationNest: $className")
            }
        }.map { it.prependIndentNonEmpty(t) }.joinToString(separator = ",$n", prefix = "($n", postfix = "$n)"))
    }

    if (superClass != null)
        append(" : $superClass()")

    val body = buildList {
        if (interpretationNest != null) {
            add(this@toDataClassString.toClassString(
                null,
                { "" },
                isNestedInterpretation = true
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
    superClass: String?,
    inheritedSharedProperties: Map<String, SchemaRecord.Property>
) = buildString {
    append(
        """
            |@Suppress("ClassName")
            |private object __JsonParametricSerializer_$className : JsonContentPolymorphicSerializer<$className>($className::class) {
            |    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out $className> {
            |        return when (element.jsonObject["${if (disambiguationBySideProperty) "__virtualType" else disambiguationBy}"]!!.jsonPrimitive.content) {
            |            ${interpretations.entries.joinToString(separator = "$n$t$t$t") { (key, it) -> """"$key" -> $className.${it.type.toKotlinType().serializer}""" }}
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

    if (superClass != null)
        append(" : $superClass()")

    val body = sequence {
        if (sharedProperties.isNotEmpty())
            yield(sharedProperties.values.joinToString(separator = n) {
                "public abstract val ${it.camelCaseName}: ${it.type.toKotlinType()}${if (it.optionality != Optionality.REQUIRED) "?" else ""}"
            })

        if (interpretations.isNotEmpty())
            yield(interpretations.mapNotNull { (_, schema) ->
                when (val t = schema.type) {
                    is SchemaClass -> t.toClassString(
                        nest,
                        nestedTypesToString,
                        superClass = className,
                        isInterpretation = true,
                        interpretationNest = schema.interpretationNestProperty,
                        inheritedSharedProperties = inheritedSharedProperties + sharedProperties
                    )
                    else -> null
                }
            }.joinToString(separator = "$n$n"))

        val nestedTypes = nestedTypesToString(nest)
        if (nestedTypes.isNotBlank()) yield(nestedTypes)
    }.joinToString(separator = "$n$n")

    if (body.isNotBlank())
        append(" {$n$n${body.prependIndentNonEmpty(t)}$n$n}")
}