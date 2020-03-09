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

fun GW2APIClient.gw2v2ItemStatsIds(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/itemstats",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = Int.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2ItemStatsById(id: Int, configure: (RequestBuilder<GW2v2ItemStats>.() -> Unit)? = null): RequestBuilder<GW2v2ItemStats> = request(
    path = "/itemstats",
    parameters = mapOf("id" to id.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2ItemStats.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2ItemStatsByIds(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2ItemStats>>.() -> Unit)? = null): RequestBuilder<List<GW2v2ItemStats>> = request(
    path = "/itemstats",
    parameters = mapOf("ids" to ids.joinToString(",")),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2ItemStats.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2ItemStatsAll(configure: (RequestBuilder<List<GW2v2ItemStats>>.() -> Unit)? = null): RequestBuilder<List<GW2v2ItemStats>> = request(
    path = "/itemstats",
    parameters = mapOf("ids" to "all"),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2ItemStats.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2ItemStatsByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2ItemStats>>.() -> Unit)? = null): RequestBuilder<List<GW2v2ItemStats>> = request(
    path = "/itemstats",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2ItemStats.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2ItemStats(
    val id: Int,
    val name: String,
    val attributes: List<Attributes>
) {

    @Serializable
    data class Attributes(
        val attribute: String,
        val multiplier: Double,
        val value: Int
    )

}