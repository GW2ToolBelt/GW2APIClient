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

fun GW2APIClient.gw2v2WvWObjectivesIds(configure: (RequestBuilder<List<String>>.() -> Unit)? = null): RequestBuilder<List<String>> = request(
    path = "/v2/wvw/objectives",
    parameters = mapOf("v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = String.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WvWObjectivesById(id: String, configure: (RequestBuilder<GW2v2WvWObjectives>.() -> Unit)? = null): RequestBuilder<GW2v2WvWObjectives> = request(
    path = "/v2/wvw/objectives",
    parameters = mapOf("id" to id.toString(), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = API_V2_LANGS,
    serializer = GW2v2WvWObjectives.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2WvWObjectivesByIds(ids: Collection<String>, configure: (RequestBuilder<List<GW2v2WvWObjectives>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WvWObjectives>> = request(
    path = "/v2/wvw/objectives",
    parameters = mapOf("ids" to ids.joinToString(","), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = API_V2_LANGS,
    serializer = GW2v2WvWObjectives.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WvWObjectivesAll(configure: (RequestBuilder<List<GW2v2WvWObjectives>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WvWObjectives>> = request(
    path = "/v2/wvw/objectives",
    parameters = mapOf("ids" to "all", "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = API_V2_LANGS,
    serializer = GW2v2WvWObjectives.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WvWObjectivesByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2WvWObjectives>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WvWObjectives>> = request(
    path = "/v2/wvw/objectives",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString(), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = API_V2_LANGS,
    serializer = GW2v2WvWObjectives.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2WvWObjectives(
    val id: String,
    val name: String,
    val type: String,
    @SerialName("sector_id")
    val sectorId: Int,
    @SerialName("map_id")
    val mapId: Int,
    @SerialName("map_type")
    val mapType: String,
    val coord: List<Double>,
    @SerialName("label_coord")
    val labelCoord: List<Double>,
    val marker: String,
    @SerialName("chat_link")
    val chatLink: String,
    @SerialName("upgrade_id")
    val upgradeId: Int?
)