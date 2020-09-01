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
package com.gw2tb.gw2apiclient.build.codegen

import com.gw2tb.apigen.model.*
import com.gw2tb.apigen.schema.*
import java.util.*
import kotlin.time.*

private fun Duration.normalizeCacheTime(): String {
    return toString() // TODO
}

private fun docComment(action: StringBuilder.() -> Unit): String =
    StringBuilder().apply(action).toString().lines().let {
        when (it.size) {
            0 -> ""
            1 -> "/** ${it[0]} */$n"
            else -> StringBuilder().apply(action).toString().lines().joinToString(separator = "$n *", prefix = "/**$n *", postfix = "$n */$n") { line ->
                if (line.isNotBlank()) " $line" else ""
            }
        }
    }



fun Endpoint.dokka(queryType: String): String = docComment {
    append("$queryType$n$n")
    append("$summary$n$n")
    append("""
                |```
                |Authenticated:       ${if (security.isNotEmpty()) "Yes (${security.joinToString()})" else "No"}
                |Paginated:           ${if (queryTypes.any { it is QueryType.ByPage }) "Yes" else "No"}
                |Bulk expanded:       ${if (queryTypes.any { it is QueryType.ByIds }) "Yes" else "No"}
                |Localized:           ${if (isLocalized) "Yes" else "No"}
                |Cache time:          ${cache?.normalizeCacheTime() ?: "N/A"}
                |```
            """.trimMargin() + n + n)
    append("Read more: [https://wiki.guildwars2.com/wiki/API:2/${route.toLowerCase(Locale.ENGLISH).removePrefix("/")}]$n$n")
    append("@receiver        the client instance used to make the request$n")
    append("@param configure configure action for the request$n$n")
    append("@return  the request that can be executed to query the API")
}

fun SchemaConditional.dokka(header: String): String = docComment {
    append(header)

    if (sharedProperties.isNotEmpty()) {
        append("$n$n")
        append(sharedProperties.values.joinToString(separator = n) { property ->
            "@param ${property.camelCaseName} ${property.description}"
        })
    }
}

fun SchemaRecord.dokka(header: String): String = docComment {
    append(header)
    append("$n$n")
    append(properties.values.joinToString(separator = n) { property ->
        "@param ${property.camelCaseName} ${property.description}"
    })
}