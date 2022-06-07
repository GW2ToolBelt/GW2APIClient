/*
 * Copyright (c) 2018-2021 Leon Linhart
 * MACHINE GENERATED FILE, DO NOT EDIT
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
@file:JvmName("GW2v2")
@file:JvmMultifileClass
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package com.gw2tb.gw2api.client.v2

import com.gw2tb.gw2api.client.*
import com.gw2tb.gw2api.client.internal.*
import com.gw2tb.gw2api.types.v2.*
import kotlinx.serialization.builtins.*
import kotlin.jvm.*

@JvmOverloads
public fun GW2APIClient.gw2v2Emblem(configure: RequestConfigurator<List<String>>? = null): RequestBuilder<List<String>> = request(
    path = "/v2/emblem",
    parameters = mapOfNonNullValues("v" to "2022-03-09T02:00:00.000Z"),
    replaceInPath = mapOf(),
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(String.serializer()),
    configure = configure
)

@JvmOverloads
public fun GW2APIClient.gw2v2EmblemIDs(type: String, configure: RequestConfigurator<List<Int>>? = null): RequestBuilder<List<Int>> = request(
    path = "/v2/emblem/:type",
    parameters = mapOfNonNullValues("v" to "2022-03-09T02:00:00.000Z"),
    replaceInPath = mapOf(":type" to type),
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(Int.serializer()),
    configure = configure
)

@JvmOverloads
public fun GW2APIClient.gw2v2EmblemByID(type: String, id: Int, configure: RequestConfigurator<GW2v2EmblemPart>? = null): RequestBuilder<GW2v2EmblemPart> = request(
    path = "/v2/emblem/:type",
    parameters = mapOfNonNullValues("id" to id.toString(), "v" to "2022-03-09T02:00:00.000Z"),
    replaceInPath = mapOf(":type" to type),
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2EmblemPart.serializer(),
    configure = configure
)

@JvmOverloads
public fun GW2APIClient.gw2v2EmblemByIDs(type: String, ids: Collection<Int>, configure: RequestConfigurator<List<GW2v2EmblemPart>>? = null): RequestBuilder<List<GW2v2EmblemPart>> = request(
    path = "/v2/emblem/:type",
    parameters = mapOfNonNullValues("ids" to ids.joinToString(","), "v" to "2022-03-09T02:00:00.000Z"),
    replaceInPath = mapOf(":type" to type),
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2EmblemPart.serializer()),
    configure = configure
)

@JvmOverloads
public fun GW2APIClient.gw2v2EmblemAll(type: String, configure: RequestConfigurator<List<GW2v2EmblemPart>>? = null): RequestBuilder<List<GW2v2EmblemPart>> = request(
    path = "/v2/emblem/:type",
    parameters = mapOfNonNullValues("ids" to "all", "v" to "2022-03-09T02:00:00.000Z"),
    replaceInPath = mapOf(":type" to type),
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2EmblemPart.serializer()),
    configure = configure
)

@JvmOverloads
public fun GW2APIClient.gw2v2EmblemByPage(type: String, page: Int, pageSize: Int = 200, configure: RequestConfigurator<List<GW2v2EmblemPart>>? = null): RequestBuilder<List<GW2v2EmblemPart>> = request(
    path = "/v2/emblem/:type",
    parameters = mapOfNonNullValues("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString(), "v" to "2022-03-09T02:00:00.000Z"),
    replaceInPath = mapOf(":type" to type),
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2EmblemPart.serializer()),
    configure = configure
)