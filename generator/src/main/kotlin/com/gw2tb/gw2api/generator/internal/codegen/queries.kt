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
@file:OptIn(ExperimentalStdlibApi::class)
package com.gw2tb.gw2api.generator.internal.codegen

import com.gw2tb.apigen.*
import com.gw2tb.apigen.model.*
import com.gw2tb.apigen.model.v2.*
import com.gw2tb.apigen.schema.*
import org.gradle.kotlin.dsl.accessors.*
import java.util.*

internal fun sequenceOfPrintableV1Queries(): Sequence<PrintableFile> =
    API_V1.supportedQueries.printableQuerySequence(
        "v1",
        Sequence<APIQuery.V1>::printV1Queries
    )

internal fun sequenceOfPrintableV2Queries(schemaVersion: V2SchemaVersion): Sequence<PrintableFile> =
    API_V2.supportedQueries.printableQuerySequence("v2") { queries ->
        queries.printV2Queries(schemaVersion)
    }

internal fun sequenceOfPrintableQueryTests(): Sequence<PrintableFile> =
//    API_V1.supportedQueries.printableQueryTestsSequence("v1") // TODO add v2
    emptySequence()

private fun <Q : APIQuery> Set<Q>.printableQuerySequence(
    apiVersion: String,
    printQueries: (Sequence<Q>) -> String
): Sequence<PrintableFile> =
    groupByEndpoint { it.endpoint }
        .asSequence()
        .mapNotNull { (endpoint, queries) ->
            val path = buildString {
                endpoint.removeSuffix("/").let {
                    append(it.substringBeforeLast("/"))
                    append("/")
                    append(it.replace("/", ""))
                }
            }
            val content = printQueries(queries.asSequence())

            if (content.isNotEmpty()) {
                PrintableFile(
                    "com/gw2tb/gw2api/client/$apiVersion/$path",
                    """
                    |@file:JvmName("GW2$apiVersion")
                    |@file:JvmMultifileClass
                    |@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
                    |package com.gw2tb.gw2api.client.$apiVersion
                    |
                    |import com.gw2tb.gw2api.client.*
                    |import com.gw2tb.gw2api.client.internal.*
                    |import com.gw2tb.gw2api.types.$apiVersion.*
                    |import kotlinx.serialization.builtins.*
                    |import kotlin.jvm.*
                    |
                    |$content
                    """.trimMargin()
                )
            } else
                null
        }

private fun <Q : APIQuery> Set<Q>.printableQueryTestsSequence(apiVersion: String): Sequence<PrintableFile> {
    fun printV1QueryTest(query: APIQuery.V1): String {
        return ""
    }

    val content = this.groupByEndpoint(APIQuery::endpoint)
        .map { (endpoint, queries) ->


            ""
        }
        .joinToString(separator = "$n$n")


//    val content = this.joinToString(separator = "$n$n") { query ->
//        val queryName = buildString {
//            append("gw2$apiVersion")
//            append(query.endpoint.replace(Regex("/:([A-Za-z])*"), "").replace("/", ""))
//            query.querySuffix?.let { append(it) }
//        }
//
//        """
//        |@Test
//        |fun testQuery_$queryName() = runTest {
//        |    client.$queryName().execute(this).get()
//        |}
//        """.trimMargin()
//    }.prependIndent(t)

    return sequenceOf(PrintableFile(
        "com/gw2tb/gw2api/client/queries",
        """
        |@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
        |package com.gw2tb.gw2api.client.$apiVersion
        |
        |import com.gw2tb.gw2api.client.*
        |import com.gw2tb.gw2api.client.internal.*
        |import com.gw2tb.gw2api.client.ktor.*
        |import com.gw2tb.gw2api.types.$apiVersion.*
        |import kotlinx.serialization.builtins.*
        |import kotlin.jvm.*
        |
        |class OnlineTest {
        |
        |    private val client = GW2APIClient(
        |        KtorHttpClientImpl(),
        |        rateLimiter = TokenBucketRateLimiter()
        |    )
        |
        |$content
        |
        |}
        """.trimMargin()
    ))
}


private fun Sequence<APIQuery.V1>.printV1Queries(): String =
    printQueryFunctions(
        apiVersion = "v1",
        schemaSelector = APIQuery.V1::schema,
        queryFunctionsMapper = { query, schema, dataType ->
            val pathParameterMappings = query.pathParameters.map { (_, param) ->
                ":${param.key.lowercase()}" to "${param.camelCaseName}${if (param.type is SchemaString) "" else ".toString()"}"
            }.toMap()

            val parameterMappings = buildMap<String, String> {
                query.queryParameters.forEach { (_, param) ->
                    put(param.key, "${param.camelCaseName}${when (param.type) {
                        is SchemaString -> ""
                        is SchemaArray -> ".joinToString(\",\")"
                        else -> ".toString()"
                    }}")
                }
            }

            val supportedLanguages = if (schema.isLocalized) "Language.API_V1" else "emptySet()"

            yield(toKotlinQueryFunctionString(
                methodName = buildString {
                    append("gw2v1")
                    append(query.endpoint.replace(Regex("/:([A-Za-z])*"), "").replace("/", ""))
                    query.querySuffix?.let { append(it) }
                },
                methodParameters = buildString {
                    append(query.pathParameters.values.joinToString(", ") { "${it.camelCaseName}: ${it.type.toKotlinType().name}" })

                    for ((_, param) in query.queryParameters) {
                        if (isNotEmpty()) append(", ")
                        append("${param.camelCaseName}: ${param.type.toKotlinType("v1").name}")
                    }

                    if (isNotEmpty()) append(", ")
                    append("configure: RequestConfigurator<${dataType.name}>? = null")
                },
                dataType = dataType,
                path = "/v1${query.route.lowercase()}",
                pathParameterMappings = pathParameterMappings,
                queryParameterMappings = parameterMappings,
                requiredPermissions = "",
                supportedLanguages = supportedLanguages
            ))
        }
    )

private fun Sequence<APIQuery.V2>.printV2Queries(schemaVersion: V2SchemaVersion): String =
    filter { it.isSupported(schemaVersion) }
        .printQueryFunctions(
            apiVersion = "v2",
            schemaSelector = { query -> query[schemaVersion].data },
            queryFunctionsMapper = { query, schema, dataType ->
                val queryDetails = query.queryDetails
                val queryType = query.queryDetails?.queryType

                val pathParameterMappings = query.pathParameters.map { (_, param) ->
                    ":${param.key.lowercase()}" to "${param.camelCaseName}${if (param.type is SchemaString) "" else ".toString()"}"
                }.toMap()

                val commonParameterMappings = buildMap<String, String> {
                    query.queryParameters.forEach { (_, param) ->
                        put(param.key, "${param.camelCaseName}${when (param.type) {
                            is SchemaString -> ""
                            is SchemaArray -> ".joinToString(\",\")"
                            else -> ".toString()"
                        }}")
                    }

                    schemaVersion.identifier?.let { put("v", "\"$it\"") }
                }

                val prefixedMethodName = buildString {
                    append("gw2v2")
                    append(query.endpoint.replace(Regex("/:([A-Za-z])*"), "").replace("/", ""))
                }

                val requiredPermissions = query.security.joinToString(", ") { "\"${it.name.lowercase()}\"" }
                val supportedLanguages = if (schema.isLocalized) "Language.API_V2" else "emptySet()"

                yield(toKotlinQueryFunctionString(
                    methodName = buildString {
                        append(prefixedMethodName)

                        fun QueryType.toMethodNameSuffix(): String = when (this) {
                            QueryType.IDs -> "IDs"
                            is QueryType.ByID -> "ByID"
                            is QueryType.ByIDs -> "ByIDs"
                            QueryType.ByPage -> "ByPage"
                        }

                        when {
                            query.querySuffix != null -> query.querySuffix!!
                            queryDetails != null -> queryDetails.queryType.toMethodNameSuffix()
                            else -> null
                        }?.let { append(it) }
                    },
                    methodParameters = buildString {
                        append(query.pathParameters.values.joinToString(", ") { "${it.camelCaseName}: ${it.type.toKotlinType().name}" })

                        for ((_, param) in query.queryParameters) {
                            if (isNotEmpty()) append(", ")

                            when {
                                queryType is QueryType.ByIDs -> append("${queryType.qpCamelCase}: Collection<${(param.type as SchemaArray).elements.toKotlinType("v2").name}>")
                                param.key == "page_size" -> append("pageSize: Int = 200")
                                else -> append("${param.camelCaseName}: ${param.type.toKotlinType("v2").name}")
                            }
                        }

                        if (isNotEmpty()) append(", ")
                        append("configure: RequestConfigurator<${dataType.name}>? = null")
                    },
                    dataType = dataType,
                    path = "/v2${query.route.lowercase()}",
                    pathParameterMappings = pathParameterMappings,
                    queryParameterMappings = buildMap {
                        putAll(commonParameterMappings)

                        when (queryType) {
                            is QueryType.ByID -> put(queryType.qpKey, "${queryType.qpCamelCase}${if (query.queryDetails!!.idType is SchemaString) "" else ".toString()"}")
                            is QueryType.ByIDs -> put(queryType.qpKey, "${queryType.qpCamelCase}.joinToString(\",\")")
                            QueryType.ByPage -> {
                                put("page", "page.toString()")
                                put("page_size", "pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException(\"Illegal page size\") else it }.toString()")
                            }
                            else -> {}
                        }
                    },
                    requiredPermissions = requiredPermissions,
                    supportedLanguages = supportedLanguages
                ))

                if (queryType is QueryType.ByIDs && queryType.supportsAll) {
                    yield(toKotlinQueryFunctionString(
                        methodName = "${prefixedMethodName}All",
                        methodParameters = buildString {
                            append(query.pathParameters.values.joinToString(", ") { "${it.camelCaseName}: ${it.type.toKotlinType().name}" })

                            for ((_, param) in query.queryParameters) {
                                if (param.key == "ids") continue

                                if (isNotEmpty()) append(", ")
                                append("${param.camelCaseName}: ${param.type.toKotlinType("v2").name}")
                            }

                            if (isNotEmpty()) append(", ")
                            append("configure: RequestConfigurator<${dataType.name}>? = null")
                        },
                        dataType = dataType,
                        path = "/v2${query.route.lowercase()}",
                        pathParameterMappings = pathParameterMappings,
                        queryParameterMappings = buildMap {
                            putAll(commonParameterMappings)

                            // Overwrite the existing value
                            put("ids", "\"all\"")
                        },
                        requiredPermissions = requiredPermissions,
                        supportedLanguages = supportedLanguages
                    ))
                }
            }
        )

private fun <Q : APIQuery> Sequence<Q>.printQueryFunctions(
    apiVersion: String,
    schemaSelector: (Q) -> SchemaTypeUse,
    queryFunctionsMapper: suspend SequenceScope<String>.(query: Q, schema: SchemaTypeUse, dataType: KotlinTypeInfo) -> Unit
) =
    map { query ->
        val schema = schemaSelector(query)
        val schemaClass = schema.firstPossiblyNestedClassOrNull()
        val dataType = schema.toKotlinType(apiVersion, titleCaseName = schemaClass?.name?.let { "GW2$apiVersion$it" })

        sequence { queryFunctionsMapper(query, schema, dataType) }
    }
        .flatten()
        .joinToString(separator = "$n$n")

private fun SchemaTypeUse.firstPossiblyNestedClassOrNull(): SchemaTypeReference? = when (this) {
    is SchemaTypeReference -> this
    is SchemaArray -> elements.firstPossiblyNestedClassOrNull()
    is SchemaMap -> values.firstPossiblyNestedClassOrNull()
    else -> null
}

private fun toKotlinQueryFunctionString(
    methodName: String,
    methodParameters: String,
    dataType: KotlinTypeInfo,
    path: String,
    pathParameterMappings: Map<String, String>,
    queryParameterMappings: Map<String, String>,
    requiredPermissions: String,
    supportedLanguages: String
): String {
    return """
        |@JvmOverloads
        |public fun GW2APIClient.$methodName($methodParameters): RequestBuilder<${dataType.name}> = request(
        |    path = "$path",
        |    parameters = mapOfNonNullValues(${queryParameterMappings.entries.joinToString(separator = ", ") { (k, v) -> "\"$k\" to $v" }}),
        |    replaceInPath = mapOf(${pathParameterMappings.entries.joinToString(separator = ", ") { (k, v) -> "\"$k\" to $v" }}),
        |    requiredPermissions = ${if (requiredPermissions.isNotEmpty()) "setOf($requiredPermissions)" else "emptySet()"},
        |    supportedLanguages = $supportedLanguages,
        |    serializer = ${dataType.serializer},
        |    configure = configure
        |)
        """.trimMargin()
}