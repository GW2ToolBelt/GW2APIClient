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

fun GW2APIClient.gw2v2WvWUpgradesIds(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/wvw/upgrades",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = Int.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WvWUpgradesById(id: Int, configure: (RequestBuilder<GW2v2WvWUpgrades>.() -> Unit)? = null): RequestBuilder<GW2v2WvWUpgrades> = request(
    path = "/wvw/upgrades",
    parameters = mapOf("id" to id.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = API_V2_LANGS,
    serializer = GW2v2WvWUpgrades.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2WvWUpgradesByIds(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2WvWUpgrades>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WvWUpgrades>> = request(
    path = "/wvw/upgrades",
    parameters = mapOf("ids" to ids.joinToString(",")),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = API_V2_LANGS,
    serializer = GW2v2WvWUpgrades.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WvWUpgradesAll(configure: (RequestBuilder<List<GW2v2WvWUpgrades>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WvWUpgrades>> = request(
    path = "/wvw/upgrades",
    parameters = mapOf("ids" to "all"),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = API_V2_LANGS,
    serializer = GW2v2WvWUpgrades.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2WvWUpgradesByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2WvWUpgrades>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WvWUpgrades>> = request(
    path = "/wvw/upgrades",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = API_V2_LANGS,
    serializer = GW2v2WvWUpgrades.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2WvWUpgrades(
    val id: Int,
    val tiers: Tiers
) {

    @Serializable
    data class Tiers(
        val name: String,
        @SerialName("yaks_required")
        val yaksRequired: Int,
        val upgrades: Upgrades
    ) {
    
        @Serializable
        data class Upgrades(
            val name: String,
            val description: String,
            val icon: String
        )
    
    }

}