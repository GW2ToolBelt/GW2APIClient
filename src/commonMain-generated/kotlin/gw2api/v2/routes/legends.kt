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

fun GW2APIClient.gw2v2LegendsIds(configure: (RequestBuilder<List<String>>.() -> Unit)? = null): RequestBuilder<List<String>> = request(
    path = "/legends",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = String.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2LegendsById(id: String, configure: (RequestBuilder<GW2v2Legends>.() -> Unit)? = null): RequestBuilder<GW2v2Legends> = request(
    path = "/legends",
    parameters = mapOf("id" to id.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Legends.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2LegendsByIds(ids: Collection<String>, configure: (RequestBuilder<List<GW2v2Legends>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Legends>> = request(
    path = "/legends",
    parameters = mapOf("ids" to ids.joinToString(",")),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Legends.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2LegendsAll(configure: (RequestBuilder<List<GW2v2Legends>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Legends>> = request(
    path = "/legends",
    parameters = mapOf("ids" to "all"),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Legends.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2LegendsByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2Legends>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Legends>> = request(
    path = "/legends",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Legends.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2Legends(
    val id: String,
    val swap: Int,
    val heal: Int,
    val elite: Int,
    val utilities: List<Int>
)