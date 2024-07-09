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

import com.gw2tb.apigen.model.*
import com.gw2tb.apigen.model.v2.SchemaVersion
import com.gw2tb.apigen.schema.*
import com.gw2tb.apigen.schema.model.APIQuery
import com.gw2tb.gw2api.generator.internal.codegen.KotlinTypeInfo
import com.gw2tb.gw2api.generator.internal.codegen.PrintableFile
import com.gw2tb.gw2api.generator.internal.codegen.n
import com.gw2tb.gw2api.generator.internal.codegen.toKotlinType

internal fun Iterable<APIQuery>.asPrintableFileSequence(
    apiVersion: Int,
    schemaVersion: SchemaVersion?,
    lookupAlias: (QualifiedTypeName.Alias) -> SchemaAlias
): Sequence<PrintableFile> =
    groupBy { it.endpoint }
        .asSequence()
        .mapNotNull { (endpoint, queries) ->
            val path = endpoint.path.toTitleCase().replace(Regex("/:([A-Za-z])*"), "").let {
                "${it.substringBeforeLast('/')}/${it.replace("/", "")}"
            }

            val content = queries.printToString(apiVersion, schemaVersion, lookupAlias)

            if (content.isNotEmpty()) {
                PrintableFile(
                    "com/gw2tb/gw2api/client/v$apiVersion/$path",
                    """
                    |@file:JvmName("GW2v$apiVersion")
                    |@file:JvmMultifileClass
                    |@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
                    |package com.gw2tb.gw2api.client.v$apiVersion
                    |
                    |import com.gw2tb.gw2api.client.*
                    |import com.gw2tb.gw2api.client.internal.*
                    |import com.gw2tb.gw2api.types.*
                    |import com.gw2tb.gw2api.types.v$apiVersion.*
                    |import kotlinx.serialization.builtins.*
                    |import kotlin.jvm.*
                    |
                    |$content
                    """.trimMargin()
                )
            } else
                null
        }

private fun Iterable<APIQuery>.printToString(
    apiVersion: Int,
    schemaVersion: SchemaVersion?,
    lookupAlias: (QualifiedTypeName.Alias) -> SchemaAlias
): String =
    flatMap { query ->
        query.printQueryFunctions(apiVersion, schemaVersion, lookupAlias)
    }.joinToString(separator = "$n$n")

private fun APIQuery.printQueryFunctions(
    apiVersion: Int,
    schemaVersion: SchemaVersion?,
    lookupAlias: (QualifiedTypeName.Alias) -> SchemaAlias
): List<String> {
    val functionName = buildString {
        append("gw2v$apiVersion")
        append(endpoint.path.toTitleCase().replace(Regex("/:([A-Za-z])*"), "").replace("/", ""))

        val suffix = querySuffix ?: when (details?.queryType) {
            QueryType.IDs -> "Ids"
            is QueryType.ByID -> "ById"
            is QueryType.ByIDs -> "ByIds"
            QueryType.ByPage -> "ByPage"
            else -> null
        }

        suffix?.let(::append)
    }

    val schemaClass = schema.firstPossiblyNestedClassOrNull()
    val dataType = schema.toKotlinType(apiVersion, titleCaseName = (schemaClass?.name as? QualifiedTypeName.Declaration)?.let { "GW2v$apiVersion${it.joinToString(transform = Name::toTitleCase)}" })

    val requiresJvmOverload = pathParameters.values.any { it.type is SchemaTypeReference }
        || pathParameters.values.any { it.type is SchemaArray && (it.type as SchemaArray).elements is SchemaTypeReference }
        || queryParameters.values.any { it.type is SchemaTypeReference }
        || queryParameters.values.any { it.type is SchemaArray && (it.type as SchemaArray).elements is SchemaTypeReference }

    return buildList {
        if (requiresJvmOverload) {
            add(printFunction(
                apiVersion = apiVersion,
                schemaVersion = schemaVersion,
                name = functionName,
                returnType = dataType,
                parameters = buildList {
                    pathParameters.forEach { (_, param) ->
                        val type = when {
                            param.type is SchemaTypeReference -> {
                                val name = (param.type as SchemaTypeReference).name as QualifiedTypeName.Alias
                                val alias = lookupAlias(name)

                                alias.type
                            }
                            param.type is SchemaArray && (param.type as SchemaArray).elements is SchemaTypeReference -> {
                                val name = ((param.type as SchemaArray).elements as SchemaTypeReference).name as QualifiedTypeName.Alias
                                val alias = lookupAlias(name)

                                (param.type as SchemaArray).copy(elements = alias.type)
                            }
                            else -> param.type
                        }

                        add(FunctionParameter(
                            type = type.toKotlinType(apiVersion).name,
                            name = param.name.toCamelCase()
                        ))
                    }

                    queryParameters.forEach { (_, param) ->
                        val type = when {
                            param.type is SchemaTypeReference -> {
                                val name = (param.type as SchemaTypeReference).name as QualifiedTypeName.Alias
                                val alias = lookupAlias(name)

                                alias.type
                            }
                            param.type is SchemaArray && (param.type as SchemaArray).elements is SchemaTypeReference -> {
                                val name = ((param.type as SchemaArray).elements as SchemaTypeReference).name as QualifiedTypeName.Alias
                                val alias = lookupAlias(name)

                                (param.type as SchemaArray).copy(elements = alias.type)
                            }
                            else -> param.type
                        }

                        add(FunctionParameter(
                            type = "${type.toKotlinType(apiVersion).name}${if (param.isOptional) "? = null" else ""}",
                            name = param.name.toCamelCase()
                        ))
                    }

                    add(FunctionParameter(
                        type = "RequestConfigurer? = null",
                        name = "configure"
                    ))
                },
                canHaveJvmOverloads = true
            ))
        }

        add(printFunction(
            apiVersion = apiVersion,
            schemaVersion = schemaVersion,
            name = functionName,
            returnType = dataType,
            parameters = buildList {
                pathParameters.forEach { (_, param) ->
                    add(FunctionParameter(
                        type = param.type.toKotlinType(apiVersion).name,
                        name = param.name.toCamelCase()
                    ))
                }

                queryParameters.forEach { (_, param) ->
                    add(FunctionParameter(
                        type = "${param.type.toKotlinType(apiVersion).name}${if (param.isOptional) "? = null" else ""}",
                        name = param.name.toCamelCase()
                    ))
                }

                add(FunctionParameter(
                    type = "RequestConfigurer? = null",
                    name = "configure"
                ))
            },
            canHaveJvmOverloads = !requiresJvmOverload
        ))
    }
}

private fun APIQuery.printFunction(
    apiVersion: Int,
    schemaVersion: SchemaVersion?,
    name: String,
    returnType: KotlinTypeInfo,
    parameters: List<FunctionParameter>,
    canHaveJvmOverloads: Boolean
): String {
    val queryParameterMappings = buildList {
        if (schemaVersion?.identifier != null) add("\"v\" to \"${schemaVersion.identifier}\"")
        addAll(queryParameters.values.map { "\"${it.key}\" to ${it.name.toCamelCase()}" })
    }.joinToString(separator = ", ")

    return buildString {
        if (canHaveJvmOverloads)
            appendLine("@JvmOverloads")
        else {
            appendLine("@JvmSynthetic")
            appendLine("@JvmName(\"${name}-Alias\")")
        }

        append(
            """
            public fun $name(${parameters.joinToString(separator = ", ")}): RequestTemplate<${returnType.name}> = RequestTemplate(
                path = "/v$apiVersion${endpoint.path.toSnakeCase()}",
                parameters = mapOfNonNullValues($queryParameterMappings),
                replaceInPath = mapOfNonNullValues(${pathParameters.values.joinToString(separator = ", ") { "\"${it.key}\" to ${it.name.toCamelCase()}" }}),
                requiredPermissions = setOf(${security.joinToString(", ") { "\"${it.name.lowercase()}\"" }}),
                supportedLanguages = ${if (schema.isLocalized) "Language.API_V$apiVersion" else "emptySet()"},
                serializer = ${returnType.serializer},
                configure = configure
            )
            """.trimIndent()
        )
    }
}

private data class FunctionParameter(val type: String, val name: String) {
    override fun toString(): String = "$name: $type"
}

private tailrec fun SchemaTypeUse.firstPossiblyNestedClassOrNull(): SchemaTypeReference? = when (this) {
    is SchemaTypeReference -> this
    is SchemaArray -> elements.firstPossiblyNestedClassOrNull()
    is SchemaMap -> values.firstPossiblyNestedClassOrNull()
    else -> null
}