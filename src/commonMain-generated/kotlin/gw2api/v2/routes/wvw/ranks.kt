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

fun GW2APIClient.gw2v2WvWRanksIds(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/wvw/ranks",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = Int.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WvWRanksById(id: Int, configure: (RequestBuilder<GW2v2WvWRanks>.() -> Unit)? = null): RequestBuilder<GW2v2WvWRanks> = request(
    path = "/wvw/ranks",
    parameters = mapOf("id" to id.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = API_V2_LANGS,
    serializer = GW2v2WvWRanks.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2WvWRanksByIds(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2WvWRanks>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WvWRanks>> = request(
    path = "/wvw/ranks",
    parameters = mapOf("ids" to ids.joinToString(",")),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = API_V2_LANGS,
    serializer = GW2v2WvWRanks.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WvWRanksAll(configure: (RequestBuilder<List<GW2v2WvWRanks>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WvWRanks>> = request(
    path = "/wvw/ranks",
    parameters = mapOf("ids" to "all"),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = API_V2_LANGS,
    serializer = GW2v2WvWRanks.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WvWRanksByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2WvWRanks>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WvWRanks>> = request(
    path = "/wvw/ranks",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = API_V2_LANGS,
    serializer = GW2v2WvWRanks.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2WvWRanks(
    val id: Int,
    val title: String,
    @SerialName("min_level")
    val minLevel: Int
)