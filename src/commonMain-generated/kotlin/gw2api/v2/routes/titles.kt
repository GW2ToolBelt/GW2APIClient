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

fun GW2APIClient.gw2v2TitlesIds(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/titles",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = Int.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2TitlesById(id: Int, configure: (RequestBuilder<GW2v2Titles>.() -> Unit)? = null): RequestBuilder<GW2v2Titles> = request(
    path = "/titles",
    parameters = mapOf("id" to id.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Titles.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2TitlesByIds(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2Titles>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Titles>> = request(
    path = "/titles",
    parameters = mapOf("ids" to ids.joinToString(",")),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Titles.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2TitlesAll(configure: (RequestBuilder<List<GW2v2Titles>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Titles>> = request(
    path = "/titles",
    parameters = mapOf("ids" to "all"),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Titles.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2TitlesByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2Titles>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Titles>> = request(
    path = "/titles",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Titles.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2Titles(
    val id: Int,
    val name: String,
    @Deprecated(message = "")
    val achievement: Int,
    val achievements: List<Int>,
    @SerialName("ap_required")
    val apRequired: Int
)