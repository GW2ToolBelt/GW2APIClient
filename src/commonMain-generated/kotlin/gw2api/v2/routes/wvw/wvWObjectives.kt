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
    path = "/wvw/objectives",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = String.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WvWObjectivesById(id: String, configure: (RequestBuilder<GW2v2WvWObjectives>.() -> Unit)? = null): RequestBuilder<GW2v2WvWObjectives> = request(
    path = "/wvw/objectives",
    parameters = mapOf("id" to id.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = API_V2_LANGS,
    serializer = GW2v2WvWObjectives.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2WvWObjectivesByIds(ids: Collection<String>, configure: (RequestBuilder<List<GW2v2WvWObjectives>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WvWObjectives>> = request(
    path = "/wvw/objectives",
    parameters = mapOf("ids" to ids.joinToString(",")),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = API_V2_LANGS,
    serializer = GW2v2WvWObjectives.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WvWObjectivesAll(configure: (RequestBuilder<List<GW2v2WvWObjectives>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WvWObjectives>> = request(
    path = "/wvw/objectives",
    parameters = mapOf("ids" to "all"),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = API_V2_LANGS,
    serializer = GW2v2WvWObjectives.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WvWObjectivesByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2WvWObjectives>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WvWObjectives>> = request(
    path = "/wvw/objectives",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString()),
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
    val upgradeId: Int
)