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

fun GW2APIClient.gw2v2RacesIds(configure: (RequestBuilder<List<String>>.() -> Unit)? = null): RequestBuilder<List<String>> = request(
    path = "/races",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = String.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2RacesById(id: String, configure: (RequestBuilder<GW2v2Races>.() -> Unit)? = null): RequestBuilder<GW2v2Races> = request(
    path = "/races",
    parameters = mapOf("id" to id.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Races.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2RacesByIds(ids: Collection<String>, configure: (RequestBuilder<List<GW2v2Races>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Races>> = request(
    path = "/races",
    parameters = mapOf("ids" to ids.joinToString(",")),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Races.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2RacesAll(configure: (RequestBuilder<List<GW2v2Races>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Races>> = request(
    path = "/races",
    parameters = mapOf("ids" to "all"),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Races.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2RacesByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2Races>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Races>> = request(
    path = "/races",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Races.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2Races(
    val id: String,
    val name: String,
    val skills: List<Int>
)