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

fun GW2APIClient.gw2v2WorldBossesIds(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/worldbosses",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = Int.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WorldBossesById(id: Int, configure: (RequestBuilder<GW2v2WorldBosses>.() -> Unit)? = null): RequestBuilder<GW2v2WorldBosses> = request(
    path = "/worldbosses",
    parameters = mapOf("id" to id.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2WorldBosses.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2WorldBossesByIds(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2WorldBosses>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WorldBosses>> = request(
    path = "/worldbosses",
    parameters = mapOf("ids" to ids.joinToString(",")),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2WorldBosses.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WorldBossesAll(configure: (RequestBuilder<List<GW2v2WorldBosses>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WorldBosses>> = request(
    path = "/worldbosses",
    parameters = mapOf("ids" to "all"),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2WorldBosses.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WorldBossesByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2WorldBosses>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WorldBosses>> = request(
    path = "/worldbosses",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2WorldBosses.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2WorldBosses(
    val id: Int
)