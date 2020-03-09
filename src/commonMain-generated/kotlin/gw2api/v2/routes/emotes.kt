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

fun GW2APIClient.gw2v2EmotesIds(configure: (RequestBuilder<List<String>>.() -> Unit)? = null): RequestBuilder<List<String>> = request(
    path = "/emotes",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = String.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2EmotesById(id: String, configure: (RequestBuilder<GW2v2Emotes>.() -> Unit)? = null): RequestBuilder<GW2v2Emotes> = request(
    path = "/emotes",
    parameters = mapOf("id" to id.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Emotes.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2EmotesByIds(ids: Collection<String>, configure: (RequestBuilder<List<GW2v2Emotes>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Emotes>> = request(
    path = "/emotes",
    parameters = mapOf("ids" to ids.joinToString(",")),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Emotes.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2EmotesAll(configure: (RequestBuilder<List<GW2v2Emotes>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Emotes>> = request(
    path = "/emotes",
    parameters = mapOf("ids" to "all"),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Emotes.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2EmotesByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2Emotes>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Emotes>> = request(
    path = "/emotes",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Emotes.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2Emotes(
    val id: String,
    val commands: List<Int>,
    @SerialName("unlock_items")
    val unlockItems: List<Int>
)