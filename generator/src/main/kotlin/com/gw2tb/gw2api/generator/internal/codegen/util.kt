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
package com.gw2tb.gw2api.generator.internal.codegen

import com.gw2tb.apigen.*
import com.gw2tb.apigen.model.*

internal const val t = "    "
internal const val n = "\n"

internal val API_V1 = APIVersion.getV1()
internal val API_V2 = APIVersion.getV2()

internal fun TypeLocation.toKotlinName(apiVersion: String?): String =
    if (nest == null)
        "${if (apiVersion != null) "GW2${apiVersion}" else ""}$name"
    else
        when (name) {
            "Map" -> "GameMap"
            else -> name
        }

internal inline fun <T> Iterable<T>.groupByEndpoint(keySelector: (T) -> String): Map<String, List<T>> =
    groupBy { keySelector(it).replace(Regex("/:([A-Za-z])*"), "").replaceAllIteratively("//", "/") }

internal fun String.firstToLowerCase(): String =
    "${toCharArray()[0].toLowerCase()}${substring(1)}"

internal fun String.firstToUpperCase(): String =
    "${toCharArray()[0].toUpperCase()}${substring(1)}"

internal fun String.replaceAllIteratively(old: String, new: String): String {
    var res = this
    while (res.contains(old)) res = res.replace(old, new)
    return res
}

internal fun String.prependIndentNonEmpty(indent: String = "    "): String =
    lineSequence()
        .map {
            when {
                it.isBlank() -> it
                else -> indent + it
            }
        }
        .joinToString("\n")