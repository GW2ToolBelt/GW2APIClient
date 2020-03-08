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

fun GW2APIClient.gw2v2WorldsIds(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/worlds",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = Int.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WorldsById(id: Int, configure: (RequestBuilder<GW2v2Worlds>.() -> Unit)? = null): RequestBuilder<GW2v2Worlds> = request(
    path = "/worlds",
    parameters = mapOf("id" to id.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Worlds.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2WorldsByIds(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2Worlds>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Worlds>> = request(
    path = "/worlds",
    parameters = mapOf("ids" to ids.joinToString(",")),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Worlds.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WorldsAll(configure: (RequestBuilder<List<GW2v2Worlds>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Worlds>> = request(
    path = "/worlds",
    parameters = mapOf("ids" to "all"),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Worlds.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WorldsByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2Worlds>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Worlds>> = request(
    path = "/worlds",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Worlds.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2Worlds(
    val id: Int,
    val name: String,
    val population: String
)