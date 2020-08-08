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
package com.github.themrmilchmann.build.apigen

import com.gw2tb.apigen.*
import com.gw2tb.apigen.model.*
import com.gw2tb.apigen.model.v2.*
import com.gw2tb.apigen.schema.*
import org.gradle.api.*
import org.gradle.api.tasks.*
import java.io.*
import java.util.*

private const val t = "    "
private const val n = "\n"

@CacheableTask
open class Generate : DefaultTask() {

    private val String.listSerializer get() = "$this.serializer().list"
    private val KotlinTypeInfo.listSerializer get() = "${serializer}.list"

    private fun SchemaPrimitive.toKotlinType(): KotlinTypeInfo = when (this) {
        SchemaBoolean -> "Boolean"
        SchemaDecimal -> "Double"
        SchemaInteger -> "Int"
        SchemaString -> "String"
    }.let { name -> KotlinTypeInfo(name, "$name.serializer()") }

    private fun SchemaType.toKotlinType(titleCaseName: String, dataClasses: MutableMap<String, SchemaType>): KotlinTypeInfo {
        fun KotlinTypeInfo(type: String) = KotlinTypeInfo(type, "$type.serializer()")

        return when (this) {
            is SchemaPrimitive -> toKotlinType()
            is SchemaArray -> {
                val itemType = items.toKotlinType(titleCaseName, dataClasses)
                KotlinTypeInfo("List<${itemType.name}${if (nullableItems) "?" else ""}>", "${itemType.serializer}.list")
            }
            is SchemaMap -> {
                val keyType = keys.toKotlinType()
                val valueType = values.toKotlinType(titleCaseName, dataClasses)
                KotlinTypeInfo("Map<${keyType.name}, ${valueType.name}${if (nullableValues) "?" else ""}>")
            }
            is SchemaConditional -> KotlinTypeInfo(titleCaseName).also { dataClasses[titleCaseName] = this }
            is SchemaRecord -> KotlinTypeInfo(titleCaseName).also { dataClasses[titleCaseName] = this }
            else -> error("Unsupported SchemaType: $this")
        }
    }

    private data class KotlinTypeInfo(
        val name: String,
        val serializer: String
    ) {
        override fun toString() = name
    }

    @Input
    lateinit var licenseHeader: String

    @OutputDirectory
    lateinit var outputDirectory: File

    @TaskAction
    fun generate() {
        fun writeFile(location: String, content: String) {
            File(outputDirectory, "kotlin/$location").writeText(
                """
                |/*
                |${licenseHeader.prependIndent(" * ")}
                | */
                |$content
                """.trimMargin()
            )
        }

        writeFile(
            "gw2api/Language.kt",
            """
            |package gw2api
            |
            |/**
            | * TODO doc
            | *
            | * @since   0.1.0
            | */
            |public enum class Language(public val code: String) {
            |${Language.values().map { language -> """${language.name}("${language.locale.language}")""" }.joinToString(separator = ",$n") { "$t$it" }};
            |
            |    companion object {
            |        val API_V2 = setOf(${API_V2_DEFINITION.supportedLanguages.joinToString(separator = ", ") { it.name }})
            |    }
            |}
            """.trimMargin()
        )

        with(API_V2_DEFINITION) {
            val schemaVersion = V2SchemaVersion.V2_SCHEMA_2019_12_19T00_00_00_000Z

            endpoints.forEach { endpoint ->
                val routeTitleCase = endpoint.route.replace(Regex("/:([A-Za-z])*"), "").replace("/", "")

                val (dataClassType, rootDataClassSchema) = with (mutableMapOf<String, SchemaType>()) {
                    endpoint[schemaVersion].second.toKotlinType("GW2v2$routeTitleCase", this) to this.entries.firstOrNull()?.value
                }

                fun requestBody(
                    parameters: String,
                    replaceInPath: Map<String, String>? = null,
                    serializer: String,
                    isIdsEndpoint: Boolean = false
                ) =
                    """
                    path = "/v2${endpoint.route.toLowerCase(Locale.ENGLISH)}",
                    parameters = $parameters,
                    replaceInPath = mapOf(${replaceInPath?.entries?.joinToString(separator = ", ") { (key, value) -> "\"$key\" to $value" } ?: ""}),
                    requiresAuthentication = ${if (endpoint.security.isNotEmpty()) "true" else "false"},
                    requiredPermissions = emptySet(),
                    supportedLanguages = ${if (endpoint.isLocalized && !isIdsEndpoint) "Language.API_V2" else "emptySet()"},
                    serializer = $serializer,
                    configure = configure
                    """.trimIndent().lines().joinToString(separator = n) { "$t$it" }

                val functions = endpoint.queryTypes.let { queryTypes -> sequence {
                    if (queryTypes.isNotEmpty()) {
                        val idType = when (endpoint.idType) {
                            is SchemaInteger -> "Int"
                            is SchemaString -> "String"
                            else -> error("Unsupported ID type for endpoint: $endpoint")
                        }

                        yield(
                            """
                            |fun GW2APIClient.gw2v2${routeTitleCase}Ids(configure: (RequestBuilder<List<$idType>>.() -> Unit)? = null): RequestBuilder<List<$idType>> = request(
                            |${requestBody(
                                parameters = """mapOf("v" to "${schemaVersion.identifier!!}")""",
                                serializer = idType.listSerializer,
                                isIdsEndpoint = true
                            )}
                            |)
                            """.trimMargin()
                        )

                        queryTypes.forEach { queryType ->
                            when (queryType) {
                                is QueryType.ById -> yield(
                                    """
                                    |fun GW2APIClient.gw2v2${routeTitleCase}ById(id: $idType, configure: (RequestBuilder<$dataClassType>.() -> Unit)? = null): RequestBuilder<$dataClassType> = request(
                                    |${requestBody(
                                        parameters = """mapOf("id" to id${if (endpoint.idType is SchemaString) "" else ".toString()"}, "v" to "${schemaVersion.identifier!!}")""",
                                        serializer = dataClassType.serializer
                                    )}
                                    |)
                                    """.trimMargin()
                                )
                                is QueryType.ByIds -> {
                                    yield(
                                        """
                                        |fun GW2APIClient.gw2v2${routeTitleCase}ByIds(ids: Collection<$idType>, configure: (RequestBuilder<List<$dataClassType>>.() -> Unit)? = null): RequestBuilder<List<$dataClassType>> = request(
                                        |${requestBody(
                                            parameters = """mapOf("ids" to ids.joinToString(","), "v" to "${schemaVersion.identifier!!}")""",
                                            serializer = dataClassType.listSerializer
                                        )}
                                        |)
                                        """.trimMargin()
                                    )

                                    if (queryType.supportsAll) yield(
                                        """
                                        |fun GW2APIClient.gw2v2${routeTitleCase}All(configure: (RequestBuilder<List<$dataClassType>>.() -> Unit)? = null): RequestBuilder<List<$dataClassType>> = request(
                                        |${requestBody(
                                            parameters = """mapOf("ids" to "all", "v" to "${schemaVersion.identifier!!}")""",
                                            serializer = dataClassType.listSerializer
                                        )}
                                        |)
                                        """.trimMargin()
                                    )
                                }
                                is QueryType.ByPage -> yield(
                                    """
                                    |fun GW2APIClient.gw2v2${routeTitleCase}ByPage(page: Int, pageSize: Int = 200, configure: (RequestBuilder<List<$dataClassType>>.() -> Unit)? = null): RequestBuilder<List<$dataClassType>> = request(
                                    |${requestBody(
                                        parameters = """mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString(), "v" to "${schemaVersion.identifier!!}")""",
                                        serializer = dataClassType.listSerializer
                                    )}
                                    |)
                                    """.trimMargin()
                                )
                                else -> error("Unsupported QueryType: $queryType")
                            }
                        }
                    } else {
                        val RequestBuilder = "RequestBuilder<${dataClassType.name}>"

                        yield(
                            """
                            |fun GW2APIClient.gw2v2$routeTitleCase(${endpoint.pathParameters.joinToString(separator = ", ") { "${it.name.firstToLowerCase()}: ${it.type.toKotlinType()}" }.let { if (it.isNotEmpty()) "$it, " else "" }}configure: ($RequestBuilder.() -> Unit)? = null): $RequestBuilder = request(
                            |${requestBody(
                                parameters = """mapOf("v" to "${schemaVersion.identifier!!}")""",
                                replaceInPath = endpoint.pathParameters.map { ":${it.key.toLowerCase(Locale.ENGLISH)}" to "${it.name.firstToLowerCase()}${if (it.type is SchemaString) "" else ".toString()"}" }.toMap(),
                                serializer = dataClassType.serializer
                            )}
                            |)
                            """.trimMargin()
                        )
                    }
                }}

                File(outputDirectory, "kotlin/gw2api/v2/routes/${endpoint.route.replace(Regex("/:([A-Za-z])*"), "").toLowerCase(Locale.ENGLISH).substringBeforeLast("/")}/${routeTitleCase.firstToLowerCase()}.kt").also { outputFile ->
                    outputFile.parentFile.mkdirs()
                    outputFile.writeText(
                        """
/*
${licenseHeader.prependIndent(" * ")}
 */
@file:JvmName("GW2v2")
@file:JvmMultifileClass
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package gw2api.v2

import gw2api.*
import gw2api.extra.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*
import kotlin.jvm.*

${functions.joinToString(separator = "$n$n")}${rootDataClassSchema.let { if (it !== null) "$n$n" + (it as SchemaRecord).createDataClass("GW2v2$routeTitleCase") else "" }}
""".trimIndent()
                    )
                }
            }
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
        }.map { it.prependIndent(t) }.joinToString(separator = ",$n", prefix = "($n", postfix = "$n)")
    }

    private fun SchemaConditional.createSealedClass(className: String, indent: String = ""): String {
        val dataClasses = mutableMapOf<String, SchemaType>()

        return """
        |@Suppress("ClassName")
        |private object __JsonParametricSerializer_$className : JsonParametricSerializer<$className>($className::class) {
        |    override fun selectSerializer(element: JsonElement): KSerializer<out $className> {
        |        return when (element.jsonObject["${if (disambiguationBySideProperty) "__virtualType" else disambiguationBy}"]!!.content) {
        |            ${interpretations.entries.joinToString(separator = "$n$t$t$t") { (name, _) -> """"$name" -> $className.$name.serializer()""" }}
        |            else -> TODO()
        |        }
        |    }
        |}
        |
        |@Serializable(with = __JsonParametricSerializer_$className::class)
        |sealed class $className {
        |${sharedProperties.values.joinToString(separator = n) { 
            "${t}abstract val ${it.camelCaseName}: ${it.type.toKotlinType(it.propertyName, dataClasses)}${if (it.optionality !== Optionality.REQUIRED) "?" else ""}"
        }.let { if (it.isNotEmpty()) "$n$it$n" else "" }}
        |${interpretations.map { (name, schema) ->
            (schema as SchemaRecord).createDataClass(name, indent = t, superClass = className, isInterpretation = true, sharedProperties = sharedProperties)
        }.joinToString(separator = "$n$n")}
        |${dataClasses.map { (name, schema) -> when(schema) {
            is SchemaConditional -> schema.createSealedClass(name, indent = t)
            is SchemaRecord -> schema.createDataClass(name, indent = t)
            else -> error("")
        }}.joinToString(separator = "$n$n").let { if (dataClasses.isNotEmpty()) "$n$it$n" else "" }}
        |}
        """.trimMargin().prependIndent(indent)
    }

    private fun SchemaRecord.createDataClass(
        className: String,
        indent: String = "",
        serialName: String? = null,
        superClass: String? = null,
        isInterpretation: Boolean = false,
        sharedProperties: Map<String, SchemaRecord.Property> = emptyMap()
    ): String {
        val dataClasses = mutableMapOf<String, SchemaType>()

        return """${if (properties.values.any { it.type is SchemaConditional && (it.type as SchemaConditional).disambiguationBySideProperty } || isInterpretation) """
        |@Suppress("ClassName")
        |@Serializer(forClass = $className::class)
        |private object __${className}GeneratedSerializer : KSerializer<$className>
        |
        |@Suppress("ClassName")
        |private object __${className}Serializer : JsonTransformingSerializer<$className>(__${className}GeneratedSerializer, "__${className}Serializer") {
        |    override fun readTransform(element: JsonElement): JsonElement =
        |        JsonObject(element.jsonObject${if (properties.values.any { it.type is SchemaConditional }) """|.mapValues { (key, value) ->
        |            when (key) {
        |                ${properties.values.filter { it.type is SchemaConditional }.joinToString(separator = "$n$t$t$t$t") { """"${it.serialName}" -> JsonObject(value.jsonObject + ("__virtualType" to JsonPrimitive(element.jsonObject["${(it.type as SchemaConditional).disambiguationBy}"]!!.primitive.content)))""" }}
        |                else -> value
        |            }
        |        }
        """.trimMargin() else ""}${if (isInterpretation) " - \"__virtualType\"" else ""})
        |}
        |
        |@Serializable(with = __${className}Serializer::class)""".trimMargin() else "@Serializable"}${if (serialName !== null) "${n}SerialName($serialName)" else ""}
        |data class $className${properties.ctor(sharedProperties, dataClasses)}${if (superClass !== null) " : $superClass()" else "" }${if (dataClasses.isNotEmpty()) """
        | {
        |
        |${dataClasses.map { (name, schema) -> when(schema) {
            is SchemaConditional -> schema.createSealedClass(name, indent = t)
            is SchemaRecord -> schema.createDataClass(name, indent = t)
            else -> error("")
        }}.joinToString(separator = "$n$n")}
        |
        |}
        """.trimMargin() else ""}
        """.trimMargin().prependIndent(indent)
    }

}