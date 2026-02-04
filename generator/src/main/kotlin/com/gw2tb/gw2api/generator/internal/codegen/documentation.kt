/*
 * Copyright (c) 2018-2025 Leon Linhart
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

import com.gw2tb.apigen.model.APIv2Endpoint
import com.gw2tb.apigen.model.QueryType
import com.gw2tb.apigen.schema.*
import com.gw2tb.apigen.schema.model.APIQuery
import kotlin.time.*

private fun Duration.normalizeCacheTime(): String {
    return when {
        isInfinite() -> "INFINITE"
        toDouble(DurationUnit.MINUTES) % 60.0 == 0.0 -> "${toDouble(DurationUnit.HOURS).toInt()}h"
        toDouble(DurationUnit.SECONDS) % 60.0 == 0.0 -> "${toDouble(DurationUnit.MINUTES)}m"
        else -> {
            require(toDouble(DurationUnit.SECONDS) >= 1.0)
            "${toDouble(DurationUnit.SECONDS).toInt()}s"
        }
    }
}

internal val String.asComment: String get() = comment({
    append(this@asComment)
})

internal val String.asDocComment: String get() = comment({
    append(this@asDocComment)
}, isDocComment = true)

private inline fun comment(action: StringBuilder.() -> Unit, isDocComment: Boolean = false): String =
    StringBuilder().apply(action).toString().lines().let {
        val start = if (isDocComment) "/**" else "/*"

        when (it.size) {
            0 -> ""
            1 -> "$start ${it[0]} */"
            else -> StringBuilder().apply(action).toString().lines().joinToString(separator = "$n *", prefix = "$start$n *", postfix = "$n */") { line ->
                if (line.isNotBlank()) " $line" else ""
            }
        }
    }

@Suppress("NOTHING_TO_INLINE")
private inline fun docComment(noinline action: StringBuilder.() -> Unit): String = comment(action, isDocComment = true)

internal fun APIQuery.dokka(siblings: Iterable<APIQuery>): String = docComment {
    val isPaginated = siblings.any { it.details?.queryType is QueryType.ByPage }
    val isBulkSupported = siblings.any { it.details?.queryType?.let { queryType -> queryType is QueryType.ByIDs } ?: false }
    val isLocalized = siblings.any { it.schema.isLocalized }

    append("$summary$n$n")
    append("""
                |```
                |Authenticated:       ${if (security.isNotEmpty()) "Yes (${security.joinToString()})" else "No"}
                |Paginated:           ${if (isPaginated) "Yes" else "No"}
                |Bulk expanded:       ${if (isBulkSupported) "Yes" else "No"}
                |Localized:           ${if (isLocalized) "Yes" else "No"}
                |Cache time:          ${cache?.normalizeCacheTime() ?: "N/A"}
                |```
            """.trimMargin() + n + n)
    append("Read more: [https://wiki.guildwars2.com/wiki/API:${if (endpoint is APIv2Endpoint) "2" else "1"}/${path.lowercase().removePrefix("/")}]$n$n")

    pathParameters.forEach { (_, param) -> appendLine("@param ${param.name.toCamelCase()} ${param.description}") }
    queryParameters.forEach { (_, param) -> appendLine("@param ${param.name.toCamelCase()} ${param.description}") }

    append("@param configure configure action for the request$n$n")
    append("@return  the request that can be executed to query the API")
}

internal fun SchemaRecord.dokka(
    sharedProperties: Collection<SchemaProperty>,
    interpretationInNestedProperty: Boolean
): String = docComment {
    append(description)

    val paramTags = buildList {
        for (property in sharedProperties)
            add("@param ${property.name.toCamelCase()} ${property.description}")

        if (!interpretationInNestedProperty) {
            for (property in properties.values)
                add("@param ${property.name.toCamelCase()} ${property.description}")
        }
    }.joinToString(separator = n)

    if (paramTags.isNotBlank()) {
        append("$n$n")
        append(paramTags)
    }
}
