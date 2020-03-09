/*
 * Copyright (c) 2018-2020 Leon Linhart
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
package gw2api.v2

import gw2api.*
import gw2api.extra.*
import gw2api.misc.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlin.jvm.*

fun GW2APIClient.gw2v2MapChestsIds(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/v2/mapchests",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = Int.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2MapChestsById(id: Int, configure: (RequestBuilder<GW2v2MapChests>.() -> Unit)? = null): RequestBuilder<GW2v2MapChests> = request(
    path = "/v2/mapchests",
    parameters = mapOf("id" to id.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2MapChests.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2MapChestsByIds(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2MapChests>>.() -> Unit)? = null): RequestBuilder<List<GW2v2MapChests>> = request(
    path = "/v2/mapchests",
    parameters = mapOf("ids" to ids.joinToString(",")),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2MapChests.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2MapChestsAll(configure: (RequestBuilder<List<GW2v2MapChests>>.() -> Unit)? = null): RequestBuilder<List<GW2v2MapChests>> = request(
    path = "/v2/mapchests",
    parameters = mapOf("ids" to "all"),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2MapChests.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2MapChestsByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2MapChests>>.() -> Unit)? = null): RequestBuilder<List<GW2v2MapChests>> = request(
    path = "/v2/mapchests",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2MapChests.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2MapChests(
    val id: Int
)