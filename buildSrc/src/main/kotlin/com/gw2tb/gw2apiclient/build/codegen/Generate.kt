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
@file:Suppress("FunctionName", "LocalVariableName")
package com.gw2tb.gw2apiclient.build.codegen

import com.gw2tb.apigen.*
import com.gw2tb.apigen.model.*
import com.gw2tb.apigen.model.v2.*
import com.gw2tb.apigen.schema.*
import org.gradle.api.*
import org.gradle.api.tasks.*
import java.io.*
import java.util.*

const val t = "    "
const val n = "\n"

internal val schemaVersion = V2SchemaVersion.V2_SCHEMA_2020_11_17T00_30_00_000Z

@CacheableTask
open class Generate : DefaultTask() {

    @Input
    lateinit var licenseHeader: String

    @OutputDirectory
    lateinit var typesDirectory: File

    @OutputDirectory
    lateinit var apiClientDirectory: File

    @OptIn(ExperimentalStdlibApi::class)
    @TaskAction
    fun generate() {
        fun writeFile(directory: File, location: String, content: String) {
            File(directory, "kotlin/$location").also { it.parentFile.mkdirs() }.writeText(buildString {
                if (licenseHeader.isNotEmpty()) appendLine(licenseHeader.asComment)
                append(content)
            })
        }

        writeFile(
            apiClientDirectory,
            "com/gw2tb/gw2api/client/Language.kt",
            """
            |package com.gw2tb.gw2api.client
            |
            |/**
            | * A languages supported by the Guild Wars 2 API.
            | *
            | * @param code the code for the language
            | *
            | * @since   0.1.0
            | */
            |public enum class Language(public val code: String) {
            |${Language.values().map { language -> """${language.name}("${language.locale.language}")""" }.joinToString(separator = ",$n") { "$t$it" }};
            |
            |    public companion object {
            |        /**
            |         * The languages supported by V1 of the Guild Wars 2 API.
            |         *
            |         * @since  0.3.0
            |         */
            |        public val API_V1: Set<Language> = setOf(${APIVersion.API_V1.supportedLanguages.joinToString(separator = ", ") { it.name }})
            |        /**
            |         * The languages supported by V2 of the Guild Wars 2 API.
            |         *
            |         * @since  0.1.0
            |         */
            |        public val API_V2: Set<Language> = setOf(${APIVersion.API_V2.supportedLanguages.joinToString(separator = ", ") { it.name }})
            |    }
            |}
            """.trimMargin()
        )

        fun SchemaType.firstNonNestedType(): SchemaType = when (this) {
            is SchemaArray -> items.firstNonNestedType()
            else -> this
        }

        fun SchemaType.firstPossiblyNestedClassOrNull(): SchemaClass? = when (this) {
            is SchemaClass -> this
            is SchemaArray -> items.firstPossiblyNestedClassOrNull()
            else -> null
        }

        fun buildQueryFunction(
            query: APIQuery.V2,
            methodName: String,
            methodParameters: String,
            dataType: KotlinTypeInfo,
            path: String,
            pathParameterMappings: Map<String, String>,
            queryParameterMappings: Map<String, String>,
            requiredPermissions: String, // TODO
            supportedLanguages: String,
            isAllQuery: Boolean
        ): String {
            val schema = query[schemaVersion].data

            return """
                |${query.dokka(when (val type = query.queryDetails?.queryType) {
                    null -> "Creates a request used to query the resource."
                    QueryType.IDs -> "Creates a request used to query the list of available IDs."
                    is QueryType.ByID -> "Creates a request used to query a single [item](${schema.firstNonNestedType().toKotlinType(titleCaseName = schema.firstPossiblyNestedClassOrNull()?.name?.let { "GW2v2$it" })}) by its ID."
                    is QueryType.ByIDs -> if (type.supportsAll && isAllQuery)
                            "Creates a request used to query all available [items](${schema.firstNonNestedType().toKotlinType(titleCaseName = schema.firstPossiblyNestedClassOrNull()?.name?.let { "GW2v2$it" })})."
                        else
                            "Creates a request used to query one or more [items](${schema.firstNonNestedType().toKotlinType(titleCaseName = schema.firstPossiblyNestedClassOrNull()?.name?.let { "GW2v2$it" })}) by their IDs."
                    QueryType.ByPage -> "Creates a request used to query one or more [items](${schema.firstNonNestedType().toKotlinType(titleCaseName = schema.firstPossiblyNestedClassOrNull()?.name?.let { "GW2v2$it" })}) by page."
                    else -> ""
                })}
                |@JvmOverloads
                |public fun GW2APIClient.$methodName($methodParameters): RequestBuilder<$dataType> = request(
                |    path = "$path",
                |    parameters = mapOfNonNullValues(${queryParameterMappings.entries.joinToString(separator = ", ") { (k, v) -> "\"$k\" to $v" }}),
                |    replaceInPath = mapOf(${pathParameterMappings.entries.joinToString(separator = ", ") { (k, v) -> "\"$k\" to $v" }}),
                |    requiresAuthentication = ${query.security.isNotEmpty()},
                |    requiredPermissions = emptySet(),
                |    supportedLanguages = $supportedLanguages,
                |    serializer = ${dataType.serializer},
                |    configure = configure
                |)
                """.trimMargin()
        }

        APIVersion.API_V1.supportedQueries
            .groupBy { it.route.replace(Regex("/:([A-Za-z])*"), "").let {
                var res = it
                while (it.contains("//")) res = it.replace("//", "/")
                res
            }}
            .forEach { (endpoint, queries) ->
                // TODO ...
            }

        fun APIQuery.V2.toQueryFunctions() = sequence<String> {
            fun QueryType.toMethodNameSuffix(): String = when (this) {
                QueryType.IDs -> "IDs"
                is QueryType.ByID -> "ByID"
                is QueryType.ByIDs -> "ByIDs"
                QueryType.ByPage -> "ByPage"
            }

            val schema = this@toQueryFunctions[schemaVersion].data

            val methodNamePathSegment = endpoint.replace(Regex("/:([A-Za-z])*"), "").replace("/", "")
            val methodNameSuffix = when {
                querySuffix != null -> querySuffix
                queryDetails != null -> queryDetails!!.queryType.toMethodNameSuffix()
                else -> ""
            }

            val dataType = schema.toKotlinType(titleCaseName = schema.firstPossiblyNestedClassOrNull()?.name?.let { "GW2v2$it" })

            val queryType = queryDetails?.queryType

            val pathParameterMappings = pathParameters.map { (_, param) ->
                ":${param.key.toLowerCase(Locale.ENGLISH)}" to "${param.camelCaseName}${if (param.type is SchemaString) "" else ".toString()"}"
            }.toMap()

            val commonParameterMappings = buildMap<String, String> {
                queryParameters.forEach { (_, param) ->
                    put(param.key, "${param.camelCaseName}${when (param.type) {
                        is SchemaString -> ""
                        is SchemaArray -> ".joinToString(\",\")"
                        else -> ".toString()"
                    }}")
                }

                schemaVersion.identifier?.let { put("v", "\"$it\"") }
            }

            yield(buildQueryFunction(
                query = this@toQueryFunctions,
                methodName = "gw2v2$methodNamePathSegment$methodNameSuffix",
                methodParameters = buildString {
                    append(pathParameters.values.joinToString(", ") { "${it.camelCaseName}: ${it.type.toKotlinType()}" })

                    for ((_, param) in queryParameters) {
                        if (isNotEmpty()) append(", ")

                        when {
                            queryType is QueryType.ByIDs -> append("${queryType.qpCamelCase}: Collection<${(param.type as SchemaArray).items.toKotlinType()}>")
                            param.key == "page_size" -> append("pageSize: Int = 200")
                            else -> append("${param.camelCaseName}: ${param.type.toKotlinType()}")
                        }
                    }

                    if (isNotEmpty()) append(", ")
                    append("configure: RequestConfigurator<$dataType>? = null")
                },
                dataType = dataType,
                path = "/v2${route.toLowerCase(Locale.ENGLISH)}",
                pathParameterMappings = pathParameterMappings,
                queryParameterMappings = buildMap {
                    putAll(commonParameterMappings)

                    when (queryType) {
                        is QueryType.ByID -> put(queryType.qpKey, "${queryType.qpCamelCase}${if (queryDetails!!.idType is SchemaString) "" else ".toString()"}")
                        is QueryType.ByIDs -> put(queryType.qpKey, "${queryType.qpCamelCase}.joinToString(\",\")")
                        QueryType.ByPage -> {
                            put("page", "page.toString()")
                            put("page_size", "pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException(\"Illegal page size\") else it }.toString()")
                        }
                        else -> {}
                    }
                },
                requiredPermissions = security.joinToString(", ") { it.name.toLowerCase(Locale.ENGLISH) },
                supportedLanguages = if (schema.isLocalized) "Language.API_V2" else "emptySet()",
                isAllQuery = false
            ))

            if (queryType is QueryType.ByIDs && queryType.supportsAll) {
                yield(buildQueryFunction(
                    query = this@toQueryFunctions,
                    methodName = "gw2v2${methodNamePathSegment}All",
                    methodParameters = buildString {
                        append(pathParameters.values.joinToString(", ") { "${it.camelCaseName}: ${it.type.toKotlinType()}" })

                        for ((_, param) in queryParameters) {
                            if (param.key == "ids") continue

                            if (isNotEmpty()) append(", ")
                            append("${param.camelCaseName}: ${param.type.toKotlinType()}")
                        }

                        if (isNotEmpty()) append(", ")
                        append("configure: RequestConfigurator<$dataType>? = null")
                    },
                    dataType = dataType,
                    path = "/v2${route.toLowerCase(Locale.ENGLISH)}",
                    pathParameterMappings = pathParameterMappings,
                    queryParameterMappings = buildMap {
                        putAll(commonParameterMappings)

                        // Overwrite the existing value
                        put("ids", "\"all\"")
                    },
                    requiredPermissions = security.joinToString(", ") { it.name.toLowerCase(Locale.ENGLISH) },
                    supportedLanguages = if (schema.isLocalized) "Language.API_V2" else "emptySet()",
                    isAllQuery = true
                ))
            }
        }

        APIVersion.API_V2.supportedQueries
            .filter { query -> (query.since?.let { it <= schemaVersion } ?: true ) && (query.until?.let { schemaVersion < it } ?: true) }
            .groupBy { it.route.replace(Regex("/:([A-Za-z])*"), "").let {
                var res = it
                while (it.contains("//")) res = it.replace("//", "/")
                res
            }}
            .forEach { (endpoint, queries) ->
                val functions = queries.flatMap(APIQuery.V2::toQueryFunctions)
                if (functions.isEmpty()) return@forEach

                // TODO update fileName in separate commit for better diff
//                val fileName = endpoint.substringBeforeLast("/").replace("/", "").toLowerCase(Locale.ENGLISH) +
//                    endpoint.substringAfterLast("/").firstToLowerCase()

                writeFile(
                    apiClientDirectory,
                    "com/gw2tb/gw2api/client/v2/${endpoint.substringBeforeLast("/").toLowerCase(Locale.ENGLISH)}/${endpoint.replace("/", "").firstToLowerCase()}.kt",
                    """
                    |@file:JvmName("GW2v2")
                    |@file:JvmMultifileClass
                    |@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
                    |package com.gw2tb.gw2api.client.v2
                    |
                    |import com.gw2tb.gw2api.client.*
                    |import com.gw2tb.gw2api.client.internal.*
                    |import com.gw2tb.gw2api.types.v2.*
                    |import kotlinx.serialization.builtins.*
                    |import kotlin.jvm.*
                    |
                    |${functions.joinToString(separator = "$n$n")}
                    """.trimMargin()
                )
            }

        APIVersion.API_V2.supportedTypes
            .entries.groupBy { (location, _) -> location.endpoint!!.replace(Regex("/:([A-Za-z])*"), "").let { // TODO support null endpoint
                var res = it
                while (it.contains("//")) res = it.replace("//", "/")
                res
            }}
            .forEach { (endpoint, entries) ->
                fun String.nestedTypesToString(): String =
                    entries.filter { (location, _) -> location.nest == this }
                        .flatMap { it.value }
                        .joinToString(separator = "$n$n") { it.createClass(nest = this, nestedClassesFun = String::nestedTypesToString) }

                println(entries)
                val types = entries.filter { (location, _) -> location.nest.isNullOrEmpty() }.flatMap { it.value }

                val content = types.filter { it.getOrNull(schemaVersion) != null }
                    .joinToString(separator = "$n$n") { it.createClass("GW2v2", nestedClassesFun = String::nestedTypesToString) }
                if (content.isEmpty()) return@forEach

                writeFile(
                    typesDirectory,
                    "com/gw2tb/gw2api/types/v2/${endpoint.substringBeforeLast("/").toLowerCase(Locale.ENGLISH)}/${endpoint.replace("/", "").firstToLowerCase()}.kt", // TODO support null endpoint
                    """
                    |@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
                    |package com.gw2tb.gw2api.types.v2
                    |
                    |import kotlinx.serialization.*
                    |import kotlinx.serialization.builtins.*
                    |import kotlinx.serialization.json.*
                    |
                    |$content
                    """.trimMargin()
                )
            }

        writeFile(
            typesDirectory,
            "com/gw2tb/gw2api/types/mumble/MumbleLinkIdentity.kt",
            """
            |package com.gw2tb.gw2api.types.mumble
            |
            |import kotlinx.serialization.*
            |
            |${MUMBLELINK_IDENTITY_DEFINITION.createDataClass(nestedClassesFun = { "" })}
            """.trimMargin()
        )
    }

}

private fun APIType.V2.createClass(
    namePrefix: String? = null,
    nest: String? = null,
    nestedClassesFun: (String) -> String,
) = when (val schema = this[schemaVersion].data) {
    is SchemaConditional -> schema.createSealedClass(namePrefix, nest = nest, nestedClassesFun = nestedClassesFun)
    is SchemaRecord -> schema.createDataClass(
        namePrefix = namePrefix,
        nest = nest,
        nestedClassesFun = nestedClassesFun
    )
    else -> error("Unsupported SchemaType: $schema")
}

private fun Map<String, SchemaRecord.Property>.ctor(sharedProperties: Map<String, SchemaRecord.Property>): String {
    return sequence {
        yieldAll(sharedProperties.values.map { property ->
            sequence {
                if (property.isDeprecated) yield("""@Deprecated(message = "")""")
                if (property.serialName != property.camelCaseName) yield("""@SerialName("${property.serialName}")""")
                yield("override val ${property.camelCaseName}: ${property.type.toKotlinType()}${if (property.optionality !== Optionality.REQUIRED) "? = null" else ""}")
            }.joinToString(separator = n)
        })
        yieldAll(values.map { property ->
            sequence {
                if (property.isDeprecated) yield("""@Deprecated(message = "")""")
                if (property.serialName != property.camelCaseName) yield("""@SerialName("${property.serialName}")""")
                yield("val ${property.camelCaseName}: ${property.type.toKotlinType()}${if (property.optionality !== Optionality.REQUIRED) "? = null" else ""}")
            }.joinToString(separator = n)
        })
    }.map { it.prependIndentNonEmpty(t) }.joinToString(separator = ",$n", prefix = "($n", postfix = "$n)")
}

private fun SchemaConditional.createSealedClass(
    namePrefix: String?,
    nest: String?,
    nestedClassesFun: (String) -> String
): String {
    val className = if (namePrefix != null) "$namePrefix$name" else toKotlinType().name
    val currentNest = buildString {
        if (nest != null) append("$nest/")
        append(name)
    }

    return buildString {
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

        val body = sequence {
            if (sharedProperties.isNotEmpty()) {
                yield(sharedProperties.values.joinToString(separator = n) {
                    "public abstract val ${it.camelCaseName}: ${it.type.toKotlinType()}${if (it.optionality !== Optionality.REQUIRED) "?" else ""}"
                })
            }

            if (interpretations.isNotEmpty()) {
                yield(interpretations.map { (_, schema) ->
                    (schema.type as SchemaRecord).createDataClass(
                        nest = currentNest,
                        superClass = className,
                        isInterpretation = true,
                        sharedProperties = sharedProperties,
                        nestedClassesFun = nestedClassesFun
                    )
                }.joinToString(separator = "$n$n"))
            }

            val nestedClasses = nestedClassesFun(currentNest)
            if (nestedClasses.isNotEmpty()) yield(nestedClasses)
        }.joinToString(separator = "$n$n")

        if (body.isNotEmpty()) append(" {$n$n${body.prependIndentNonEmpty(t)}$n$n}")
    }
}

private fun SchemaRecord.createDataClass(
    namePrefix: String? = null,
    nest: String? = null,
    serialName: String? = null,
    superClass: String? = null,
    isInterpretation: Boolean = false,
    sharedProperties: Map<String, SchemaRecord.Property> = emptyMap(),
    nestedClassesFun: (String) -> String,
    query: APIQuery? = null,
): String {
    val className = if (namePrefix != null) "$namePrefix$name" else toKotlinType().name
    val currentNest = buildString {
        if (nest != null) append("$nest/")
        append(name)
    }

    return buildString {
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
        appendLine(if (requiresCustomPolymorphicSerializer) "@Serializable(with = __${className}Serializer::class)" else "@Serializable")
        if (serialName != null) appendLine("@SerialName($serialName)")
        append("public data class $className${properties.ctor(sharedProperties)}")
        if (superClass != null) append(" : $superClass()")

        val body = nestedClassesFun(currentNest)
        if (body.isNotEmpty()) append(" {$n$n${body.prependIndentNonEmpty(t)}$n$n}")
    }
}