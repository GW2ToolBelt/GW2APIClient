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
 * Creates a request used to query the resource.
 *
 * Returns information about a player's shared inventory slots.
 *
 * ```
 * Authenticated:       Yes (ACCOUNT, INVENTORIES)
 * Paginated:           No
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          N/A
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/account/inventory]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2AccountInventory(configure: (RequestBuilder<List<GW2v2AccountInventory>>.() -> Unit)? = null): RequestBuilder<List<GW2v2AccountInventory>> = request(
    path = "/v2/account/inventory",
    parameters = mapOf("v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2AccountInventory.serializer()),
    configure = configure
)

/**
 * Information about a stack of items in a player's shared inventory.
 *
 * @param id the item's ID
 * @param count the amount of items in the stack
 * @param charges the amount of charges remaining on the item
 * @param skin the ID of the skin applied to the item
 * @param upgrades the array of item IDs of runes or sigils applied to the item
 * @param infusions the array of item IDs of infusions applied to the item
 * @param stats information about the stats chosen for the item (if the item offers the option to select stats/prefix)
 * @param binding the binding of the item
 */
@Serializable
public data class GW2v2AccountInventory(
    val id: Int,
    val count: Int,
    val charges: Int? = null,
    val skin: Int? = null,
    val upgrades: List<Int>? = null,
    val infusions: List<Int>? = null,
    val stats: Stats? = null,
    val binding: String? = null
) {

    /**
     * Information about an item's stats.
     *
     * @param id the itemstat ID
     * @param power the amount of power given by the item
     * @param precision the amount of precision given by the item
     * @param toughness the amount of toughness given by the item
     * @param vitality the amount of vitality given by the item
     * @param conditionDamage the amount of condition damage given by the item
     * @param conditionDuration the amount of condition duration given by the item
     * @param healing the amount of healing given by the item
     * @param boonDuration the amount of boon duration given by the item
     */
    @Serializable
    public data class Stats(
        val id: Int,
        @SerialName("Power")
        val power: Int? = null,
        @SerialName("Precision")
        val precision: Int? = null,
        @SerialName("Toughness")
        val toughness: Int? = null,
        @SerialName("Vitality")
        val vitality: Int? = null,
        @SerialName("ConditionDamage")
        val conditionDamage: Int? = null,
        @SerialName("ConditionDuration")
        val conditionDuration: Int? = null,
        @SerialName("Healing")
        val healing: Int? = null,
        @SerialName("BoonDuration")
        val boonDuration: Int? = null
    )

}