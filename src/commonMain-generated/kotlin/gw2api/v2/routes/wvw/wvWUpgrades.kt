/*
 * Copyright (c) 2018-2020 Leon Linhart
 * MACHINE GENERATED FILE, DO NOT EDIT
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
@file:JvmName("GW2v2")
@file:JvmMultifileClass
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package gw2api.v2

import gw2api.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*
import kotlin.jvm.*

/**
 * Creates a request used to query the list of available IDs.
 *
 * Returns information about available upgrades for objectives in the World versus World game mode.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60.0m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/wvw/upgrades]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2WvWUpgradesIDs(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/v2/wvw/upgrades",
    parameters = mapOf("v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(Int.serializer()),
    configure = configure
)

/**
 * Creates a request used to query a single [item](GW2v2WvWUpgrade) by its ID.
 *
 * Returns information about available upgrades for objectives in the World versus World game mode.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60.0m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/wvw/upgrades]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2WvWUpgradesByID(id: Int, configure: (RequestBuilder<GW2v2WvWUpgrade>.() -> Unit)? = null): RequestBuilder<GW2v2WvWUpgrade> = request(
    path = "/v2/wvw/upgrades",
    parameters = mapOf("id" to id.toString(), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = GW2v2WvWUpgrade.serializer(),
    configure = configure
)

/**
 * Creates a request used to query one or more [items](GW2v2WvWUpgrade) by their IDs.
 *
 * Returns information about available upgrades for objectives in the World versus World game mode.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60.0m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/wvw/upgrades]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2WvWUpgradesByIDs(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2WvWUpgrade>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WvWUpgrade>> = request(
    path = "/v2/wvw/upgrades",
    parameters = mapOf("ids" to ids.joinToString(","), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2WvWUpgrade.serializer()),
    configure = configure
)

/**
 * Creates a request used to query all available [items](GW2v2WvWUpgrade).
 *
 * Returns information about available upgrades for objectives in the World versus World game mode.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60.0m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/wvw/upgrades]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2WvWUpgradesAll(configure: (RequestBuilder<List<GW2v2WvWUpgrade>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WvWUpgrade>> = request(
    path = "/v2/wvw/upgrades",
    parameters = mapOf("ids" to "all", "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2WvWUpgrade.serializer()),
    configure = configure
)

/**
 * Creates a request used to query one or more [items](GW2v2WvWUpgrade) by page.
 *
 * Returns information about available upgrades for objectives in the World versus World game mode.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60.0m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/wvw/upgrades]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2WvWUpgradesByPage(page: Int, pageSize: Int = 200, configure: (RequestBuilder<List<GW2v2WvWUpgrade>>.() -> Unit)? = null): RequestBuilder<List<GW2v2WvWUpgrade>> = request(
    path = "/v2/wvw/upgrades",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString(), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2WvWUpgrade.serializer()),
    configure = configure
)

/**
 * Information about an upgrade for objectives in the World versus World game mode.
 *
 * @param id the ID of the upgrade
 * @param tiers the different tiers of the upgrade
 */
@Serializable
public data class GW2v2WvWUpgrade(
    val id: Int,
    val tiers: Tiers
) {

    /**
     * Information about an upgrade tier.
     *
     * @param name the name of the upgrade tier
     * @param yaksRequired the amount of dolyaks required to reach this upgrade tier
     * @param upgrades the upgrades available at the tier
     */
    @Serializable
    public data class Tiers(
        val name: String,
        @SerialName("yaks_required")
        val yaksRequired: Int,
        val upgrades: Upgrades
    ) {
    
        /**
         * Information about an upgrade.
         *
         * @param name the name of the upgrade
         * @param description the description for the upgrade
         * @param icon the icon link
         */
        @Serializable
        public data class Upgrades(
            val name: String,
            val description: String,
            val icon: String
        )
    
    }

}