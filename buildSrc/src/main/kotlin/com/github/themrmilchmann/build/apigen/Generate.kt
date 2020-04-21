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

import com.github.gw2toolbelt.apigen.*
import com.github.gw2toolbelt.apigen.model.*
import com.github.gw2toolbelt.apigen.model.v2.*
import com.github.gw2toolbelt.apigen.schema.*
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

    private fun SchemaType.toKotlinType(titleCaseName: String, dataClasses: MutableMap<String, SchemaType>): KotlinTypeInfo {
        fun KotlinTypeInfo(type: String) = KotlinTypeInfo(type, "$type.serializer()")

        return when (this) {
            SchemaType.Kind.BOOLEAN -> KotlinTypeInfo("Boolean")
            SchemaType.Kind.DECIMAL -> KotlinTypeInfo("Double")
            SchemaType.Kind.INTEGER -> KotlinTypeInfo("Int")
            SchemaType.Kind.STRING -> KotlinTypeInfo("String")
            is SchemaArray -> {
                val itemType = items.toKotlinType(titleCaseName, dataClasses)
                KotlinTypeInfo("List<${itemType.name}>", "${itemType.serializer}.list")
            }
            is SchemaConditional -> KotlinTypeInfo(titleCaseName).also { dataClasses[titleCaseName] = this }
            is SchemaMap -> KotlinTypeInfo(titleCaseName).also { dataClasses[titleCaseName] = this }
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
                val routeTitleCase = endpoint.route.replace("/", "")

                val (dataClassType, rootDataClassSchema) = with (mutableMapOf<String, SchemaType>()) {
                    endpoint[schemaVersion].second.toKotlinType("GW2v2$routeTitleCase", this) to this.entries.firstOrNull()?.value
                }

                fun requestBody(
                    parameters: String,
                    serializer: String,
                    replaceInPath: String = "emptyMap()",
                    requiredPermissions: String = "emptySet()",
                    isIdsEndpoint: Boolean = false
                ) =
                    """
                    path = "/v2${endpoint.route.toLowerCase(Locale.ENGLISH)}",
                    parameters = $parameters,
                    replaceInPath = emptyMap(),
                    requiresAuthentication = ${if (endpoint.security.isNotEmpty()) "true" else "false"},
                    requiredPermissions = emptySet(),
                    supportedLanguages = ${if (endpoint.isLocalized && !isIdsEndpoint) "Language.API_V2" else "emptySet()"},
                    serializer = $serializer,
                    configure = configure
                    """.trimIndent().lines().joinToString(separator = n) { "$t$it" }

                val functions = endpoint.queryTypes.let { queryTypes -> sequence {
                    if (queryTypes.isNotEmpty()) {
                        val idType = when (endpoint.idType) {
                            is SchemaType.Kind.INTEGER -> "Int"
                            is SchemaType.Kind.STRING -> "String"
                            else -> error("Unsupported ID type for endpoint: $endpoint")
                        }

                        yield(
                            """
                            |fun GW2APIClient.gw2v2${routeTitleCase}Ids(configure: (RequestBuilder<List<$idType>>.() -> Unit)? = null): RequestBuilder<List<$idType>> = request(
                            |${requestBody(
                                parameters = """mapOf("v" to "${schemaVersion.version!!}")""",
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
                                        parameters = """mapOf("id" to id.toString(), "v" to "${schemaVersion.version!!}")""",
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
                                            parameters = """mapOf("ids" to ids.joinToString(","), "v" to "${schemaVersion.version!!}")""",
                                            serializer = dataClassType.listSerializer
                                        )}
                                        |)
                                        """.trimMargin()
                                    )

                                    if (queryType.supportsAll) yield(
                                        """
                                        |fun GW2APIClient.gw2v2${routeTitleCase}All(configure: (RequestBuilder<List<$dataClassType>>.() -> Unit)? = null): RequestBuilder<List<$dataClassType>> = request(
                                        |${requestBody(
                                            parameters = """mapOf("ids" to "all", "v" to "${schemaVersion.version!!}")""",
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
                                        parameters = """mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString(), "v" to "${schemaVersion.version!!}")""",
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
                            |fun GW2APIClient.gw2v2$routeTitleCase(configure: ($RequestBuilder.() -> Unit)? = null): $RequestBuilder = request(
                            |${requestBody(
                                parameters = """mapOf("v" to "${schemaVersion.version!!}")""",
                                serializer = dataClassType.serializer
                            )}
                            |)
                            """.trimMargin()
                        )
                    }
                }}

                File(outputDirectory, "kotlin/gw2api/v2/routes/${endpoint.route.toLowerCase(Locale.ENGLISH).substringBeforeLast("/")}/${routeTitleCase.firstToLowerCase()}.kt").also { outputFile ->
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
import kotlin.jvm.*

${functions.joinToString(separator = "$n$n")}${rootDataClassSchema.let { if (it !== null) "$n$n" + (it as SchemaMap).createDataClass("GW2v2$routeTitleCase") else "" }}
""".trimIndent()
                    )
                }
            }
        }
    }

    private fun SchemaConditional.createSealedClass(className: String, indent: String = ""): String {
        return """
        |@Serializable
        |sealed class $className {
        |
        |${interpretations.map { (name, schema) -> (schema as SchemaMap).createDataClass(name, indent = t, superClass = className) }.joinToString(separator = "$n$n")}
        |
        |}
        """.trimMargin().prependIndent(indent)
    }

    private fun SchemaMap.createDataClass(className: String, indent: String = "", serialName: String? = null, superClass: String? = null): String {
        val dataClasses = mutableMapOf<String, SchemaType>()

        return """
        |@Serializable${if (serialName !== null) "${n}SerialName($serialName)" else ""}
        |data class $className(
        |${properties.map { (_, property) ->
            StringBuilder().run {
                if (property.isDeprecated) append("""$t@Deprecated(message = "")$n""")
                if (property.serialName != property.propertyName) append("""$t@SerialName("${property.serialName}")$n""")
                append("${t}val ${property.propertyName}: ${property.type.toKotlinType(property.propertyName.firstToUpperCase(), dataClasses)}${if (property.optionality !== Optionality.REQUIRED) "? = null" else ""}")
                toString()
            }
        }.joinToString(separator = ",$n")}
        |)${if (superClass !== null) " : $superClass()" else "" }${if (dataClasses.isNotEmpty()) """
        | {
        |
        |${dataClasses.map { (name, schema) -> when(schema) {
            is SchemaConditional -> schema.createSealedClass(name, indent = t)
            is SchemaMap -> schema.createDataClass(name, indent = t)
            else -> error("")
        }}.joinToString(separator = "$n$n")}
        |
        |}
        """.trimMargin() else ""}
        """.trimMargin().prependIndent(indent)
    }

}