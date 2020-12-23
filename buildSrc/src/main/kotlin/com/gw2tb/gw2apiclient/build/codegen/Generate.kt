/*
 * Copyright (c) 2018-2020 Leon Linhart
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

private val schemaVersion = V2SchemaVersion.V2_SCHEMA_2020_11_17T00_30_00_000Z

@CacheableTask
open class Generate : DefaultTask() {

    @Input
    lateinit var licenseHeader: String

    @OutputDirectory
    lateinit var typesDirectory: File

    @OutputDirectory
    lateinit var apiClientDirectory: File

    @TaskAction
    fun generate() {
        fun writeFile(directory: File, location: String, content: String) {
            File(directory, "kotlin/$location").also { it.parentFile.mkdirs() }.writeText(buildString {
                if (licenseHeader.isNotEmpty()) append(licenseHeader.asComment)
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
            |         * The languages supported by V2 of the Guild Wars 2 API.
            |         *
            |         * @since  0.1.0
            |         */
            |        public val API_V2: Set<Language> = setOf(${API_V2_DEFINITION.supportedLanguages.joinToString(separator = ", ") { it.name }})
            |    }
            |}
            """.trimMargin()
        )

        with(API_V2_DEFINITION) {
            val endpointsByRoute = endpoints.groupBy { endpoint ->
                endpoint.route.replace(Regex("/:([A-Za-z])*"), "").replace("/", "")
            }

            endpointsByRoute.forEach { (routeTitleCase, endpoints) ->
                val functions = mutableListOf<String>()
                val classes = mutableListOf<String>()

                endpoints.forEach { endpoint ->
                    /* The schema for the outmost record or conditional, or null */
                    val (customRootDataClassSchema, rootDataClassNestingDepth) = let {
                        var schema: SchemaType? = endpoint[schemaVersion].second
                        var nestingDepth = 0

                        loop@ while (true) {
                            when (schema) {
                                is SchemaArray -> {
                                    nestingDepth++
                                    schema = schema.items
                                }
                                is SchemaConditional, is SchemaRecord -> {
                                    break@loop
                                }
                                else -> {
                                    schema = null
                                    break@loop
                                }
                            }
                        }

                        schema to nestingDepth
                    }

                    val dataType = if (customRootDataClassSchema != null) {
                        var type: KotlinTypeInfo = when (customRootDataClassSchema) {
                            is SchemaRecord -> {
                                val name = "GW2v2${customRootDataClassSchema.name}"
                                classes.add(customRootDataClassSchema.createDataClass(name, endpoint = endpoint))

                                KotlinTypeInfo(name)
                            }
                            is SchemaConditional -> {
                                TODO()
//
//                                val name = "GW2v2${customRootDataClassSchema.name}"
//                                classes.add(customRootDataClassSchema.createSealedClass(name))
//
//                                KotlinTypeInfo(name)
                            }
                            else -> error("")
                        }

                        for (i in 0 until rootDataClassNestingDepth) type = type.list

                        type
                    } else {
                        endpoint[schemaVersion].second.toKotlinType()
                    }

                    val replaceInPath = endpoint.pathParameters.map {
                        ":${it.key.toLowerCase(Locale.ENGLISH)}" to "${it.camelCaseName}${if (it.type is SchemaString) "" else ".toString()"}"
                    }.toMap().entries.joinToString(separator = ", ") { (key, value) ->
                        "\"$key\" to $value"
                    }

                    val pathParameters = endpoint.pathParameters.joinToString(separator = ", ") { "${it.camelCaseName}: ${it.type.toKotlinType()}" }.let { if (it.isNotEmpty()) "$it, " else "" }
                    val queryParameters = endpoint.queryParameters.joinToString(separator = ", ") { "${it.camelCaseName}: ${it.type.toKotlinType()}${if (it.isOptional) "? = null" else ""}" }.let { if (it.isNotEmpty()) "$it, " else "" }

                    fun requestBody(
                        parameters: Map<String, String> = emptyMap(),
                        serializer: String,
                        isIDsEndpoint: Boolean = false
                    ) =
                        """
                        path = "/v2${endpoint.route.toLowerCase(Locale.ENGLISH)}",
                        parameters = mapOfNonNullValues(${(parameters + ("v" to "\"${schemaVersion.identifier}\"") + endpoint.queryParameters.map { it.key to "${it.camelCaseName}${if (it.type == SchemaString) "" else ".toString()"}" }).entries.joinToString(separator = ", ") { (key, value) -> "\"$key\" to $value" }}),
                        replaceInPath = mapOf($replaceInPath),
                        requiresAuthentication = ${if (endpoint.security.isNotEmpty()) "true" else "false"},
                        requiredPermissions = emptySet(),
                        supportedLanguages = ${if (endpoint.isLocalized && !isIDsEndpoint) "Language.API_V2" else "emptySet()"},
                        serializer = $serializer,
                        configure = configure
                        """.trimIndent().prependIndent(t)

                    functions.addAll(endpoint.queryTypes.let { queryTypes -> sequence {
                        if (queryTypes.isNotEmpty()) {
                            val idType = when (endpoint.idType) {
                                null -> null
                                is SchemaInteger -> KotlinTypeInfo("Int")
                                is SchemaString -> KotlinTypeInfo("String")
                                else -> error("Unsupported ID type for endpoint: $endpoint")
                            }

                            if (idType != null) {
                                yield(
                                    """
                                    |${endpoint.dokka(
                                            queryType = "Creates a request used to query the list of available IDs."
                                        )}@JvmOverloads
                                    |public fun GW2APIClient.gw2v2${routeTitleCase}IDs(${pathParameters}${queryParameters}configure: RequestConfigurator<List<$idType>>? = null): RequestBuilder<List<$idType>> = request(
                                    |${requestBody(
                                            serializer = idType.list.serializer,
                                            isIDsEndpoint = true
                                        )}
                                    |)
                                    """.trimMargin()
                                )
                            } else {
                                yield(
                                    """
                                    |${endpoint.dokka(
                                            queryType = "Creates a request used to query all available [items]($dataType)."
                                        )}@JvmOverloads
                                    |public fun GW2APIClient.gw2v2${routeTitleCase}(${pathParameters}${queryParameters}configure: RequestConfigurator<List<$dataType>>? = null): RequestBuilder<List<$dataType>> = request(
                                    |${requestBody(
                                            serializer = dataType.list.serializer
                                        )}
                                    |)
                                    """.trimMargin()
                                )
                            }

                            queryTypes.forEach { queryType ->
                                when (queryType) {
                                    is QueryType.ByID -> yield(
                                        """
                                        |${endpoint.dokka(
                                                queryType = "Creates a request used to query a single [item]($dataType) by its ID."
                                            )}@JvmOverloads
                                        |public fun GW2APIClient.gw2v2${routeTitleCase}ByID(${pathParameters}id: $idType, ${queryParameters}configure: RequestConfigurator<$dataType>? = null): RequestBuilder<$dataType> = request(
                                        |${requestBody(
                                                parameters = mapOf("id" to "id${if (idType!!.name == "String") "" else ".toString()"}"),
                                                serializer = dataType.serializer
                                            )}
                                        |)
                                        """.trimMargin()
                                    )
                                    is QueryType.ByIDs -> {
                                        yield(
                                            """
                                            |${endpoint.dokka(
                                                    queryType = "Creates a request used to query one or more [items]($dataType) by their IDs."
                                                )}@JvmOverloads
                                            |public fun GW2APIClient.gw2v2${routeTitleCase}ByIDs(${pathParameters}ids: Collection<$idType>, ${queryParameters}configure: RequestConfigurator<List<$dataType>>? = null): RequestBuilder<List<$dataType>> = request(
                                            |${requestBody(
                                                    parameters = mapOf("ids" to "ids.joinToString(\",\")"),
                                                    serializer = dataType.list.serializer
                                                )}
                                            |)
                                            """.trimMargin()
                                        )

                                        if (queryType.supportsAll) yield(
                                            """
                                            |${endpoint.dokka(
                                                    queryType = "Creates a request used to query all available [items]($dataType)."
                                                )}@JvmOverloads
                                            |public fun GW2APIClient.gw2v2${routeTitleCase}All(${pathParameters}${queryParameters}configure: RequestConfigurator<List<$dataType>>? = null): RequestBuilder<List<$dataType>> = request(
                                            |${requestBody(
                                                    parameters = mapOf("ids" to "\"all\""),
                                                    serializer = dataType.list.serializer
                                                )}
                                            |)
                                            """.trimMargin()
                                        )
                                    }
                                    is QueryType.ByPage -> yield(
                                        """
                                        |${endpoint.dokka(
                                                queryType = "Creates a request used to query one or more [items]($dataType) by page."
                                            )}@JvmOverloads
                                        |public fun GW2APIClient.gw2v2${routeTitleCase}ByPage(${pathParameters}page: Int, pageSize: Int = 200, ${queryParameters}configure: RequestConfigurator<List<$dataType>>? = null): RequestBuilder<List<$dataType>> = request(
                                        |${requestBody(
                                                parameters = mapOf("page" to "page.toString()", "page_size" to "pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException(\"Illegal page size\") else it }.toString()"),
                                                serializer = dataType.list.serializer
                                            )}
                                        |)
                                        """.trimMargin()
                                    )
                                    else -> error("Unsupported QueryType: $queryType")
                                }
                            }
                        } else {
                            yield(
                                """
                                |${endpoint.dokka(
                                        queryType = "Creates a request used to query the resource."
                                    )}@JvmOverloads
                                |public fun GW2APIClient.gw2v2$routeTitleCase(${pathParameters}${queryParameters}configure: RequestConfigurator<$dataType>? = null): RequestBuilder<$dataType> = request(
                                |${requestBody(
                                        serializer = dataType.serializer
                                    )}
                                |)
                                """.trimMargin()
                            )
                        }
                    }})
                }

                val path = "${endpoints[0].route.replace(Regex("/:([A-Za-z])*"), "").toLowerCase(Locale.ENGLISH).substringBeforeLast("/")}/${routeTitleCase.firstToLowerCase()}.kt"

                if (functions.isNotEmpty()) {
                    writeFile(
                        apiClientDirectory,
                        "com/gw2tb/gw2api/client/v2/$path",
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

                if (classes.isNotEmpty()) {
                    writeFile(
                        typesDirectory,
                        "com/gw2tb/gw2api/types/v2/$path",
                        """
                        |@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
                        |package com.gw2tb.gw2api.types.v2
                        |
                        |import kotlinx.serialization.*
                        |import kotlinx.serialization.builtins.*
                        |import kotlinx.serialization.json.*
                        |
                        |${classes.joinToString(separator = "$n$n")}
                        """.trimMargin()
                    )
                }
            }
        }

        writeFile(
            typesDirectory,
            "com/gw2tb/gw2api/types/mumble/MumbleLinkIdentity.kt",
            """
            |package com.gw2tb.gw2api.types.mumble
            |
            |import kotlinx.serialization.*
            |
            |${MUMBLELINK_IDENTITY_DEFINITION.createDataClass("MumbleLinkIdentity")}
            """.trimMargin()
        )
    }

}

private fun Map<String, SchemaRecord.Property>.ctor(sharedProperties: Map<String, SchemaRecord.Property>, dataClasses: MutableMap<String, SchemaType>): String {
    return sequence {
        yieldAll(sharedProperties.values.map { property ->
            sequence {
                if (property.isDeprecated) yield("""@Deprecated(message = "")""")
                if (property.serialName != property.camelCaseName) yield("""@SerialName("${property.serialName}")""")
                yield("override val ${property.camelCaseName}: ${property.type.toKotlinType(property.propertyName, dataClasses)}${if (property.optionality !== Optionality.REQUIRED) "? = null" else ""}")
            }.joinToString(separator = n)
        })
        yieldAll(values.map { property ->
            sequence {
                if (property.isDeprecated) yield("""@Deprecated(message = "")""")
                if (property.serialName != property.camelCaseName) yield("""@SerialName("${property.serialName}")""")
                yield("val ${property.camelCaseName}: ${property.type.toKotlinType(property.propertyName, dataClasses)}${if (property.optionality !== Optionality.REQUIRED) "? = null" else ""}")
            }.joinToString(separator = n)
        })
    }.map { it.prependIndentNonEmpty(t) }.joinToString(separator = ",$n", prefix = "($n", postfix = "$n)")
}

private fun SchemaConditional.createSealedClass(className: String): String {
    val dataClasses = mutableMapOf<String, SchemaType>()

    return buildString {
        append(
            """
            |@Suppress("ClassName")
            |private object __JsonParametricSerializer_$className : JsonContentPolymorphicSerializer<$className>($className::class) {
            |    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out $className> {
            |        return when (element.jsonObject["${if (disambiguationBySideProperty) "__virtualType" else disambiguationBy}"]!!.jsonPrimitive.content) {
            |            ${interpretations.entries.joinToString(separator = "$n$t$t$t") { (name, _) -> """"$name" -> $className.$name.serializer()""" }}
            |            else -> TODO()
            |        }
            |    }
            |}
            |
            |
            """.trimMargin()
        )

        append(dokka())
        append("@Serializable(with = __JsonParametricSerializer_$className::class)$n")
        append("public sealed class $className")

        val body = sequence {
            if (sharedProperties.isNotEmpty()) {
                yield(sharedProperties.values.joinToString(separator = n) {
                    "public abstract val ${it.camelCaseName}: ${it.type.toKotlinType(it.propertyName, dataClasses)}${if (it.optionality !== Optionality.REQUIRED) "?" else ""}"
                })
            }

            if (interpretations.isNotEmpty()) {
                yield(interpretations.map { (name, schema) ->
                    (schema as SchemaRecord).createDataClass(name, superClass = className, isInterpretation = true, sharedProperties = sharedProperties)
                }.joinToString(separator = "$n$n"))
            }

            if (dataClasses.isNotEmpty()) {
                yield(dataClasses.map { (name, schema) -> when (schema) {
                    is SchemaConditional -> schema.createSealedClass(name)
                    is SchemaRecord -> schema.createDataClass(name)
                    else -> error("Unsupported SchemaType: $schema")
                }}.joinToString(separator = "$n$n"))
            }
        }.joinToString(separator = "$n$n")


        if (body.isNotEmpty()) append(" {$n$n${body.prependIndentNonEmpty(t)}$n$n}")
    }
}

private fun SchemaRecord.createDataClass(
    className: String,
    serialName: String? = null,
    superClass: String? = null,
    isInterpretation: Boolean = false,
    sharedProperties: Map<String, SchemaRecord.Property> = emptyMap(),
    endpoint: Endpoint? = null
): String {
    val dataClasses = mutableMapOf<String, SchemaType>()

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

        append(dokka())
        append("${if (requiresCustomPolymorphicSerializer) "@Serializable(with = __${className}Serializer::class)" else "@Serializable"}$n")
        if (serialName != null) append("@SerialName($serialName)$n")
        append("public data class $className${properties.ctor(sharedProperties, dataClasses)}")
        if (superClass != null) append(" : $superClass()")

        val body = dataClasses.map { (name, schema) -> when (schema) {
            is SchemaConditional -> schema.createSealedClass(name)
            is SchemaRecord -> schema.createDataClass(name)
            else -> error("Unsupported SchemaType: $schema")
        }}.joinToString(separator = "$n$n")
        if (body.isNotEmpty()) append(" {$n$n${body.prependIndentNonEmpty(t)}$n$n}")
    }
}