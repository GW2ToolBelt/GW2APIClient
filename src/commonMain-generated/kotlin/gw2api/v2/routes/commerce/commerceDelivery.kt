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
 * Returns information about the items and coins currently available for pickup.
 *
 * ```
 * Authenticated:       Yes (ACCOUNT, TRADINGPOST)
 * Paginated:           No
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          N/A
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/delivery]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2CommerceDelivery(configure: (RequestBuilder<GW2v2CommerceDelivery>.() -> Unit)? = null): RequestBuilder<GW2v2CommerceDelivery> = request(
    path = "/v2/commerce/delivery",
    parameters = mapOf("v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2CommerceDelivery.serializer(),
    configure = configure
)

/**
 * Information about the items and coins currently available for pickup.
 *
 * @param coins the amount of coins ready for pickup
 * @param items the items ready for pickup
 */
@Serializable
public data class GW2v2CommerceDelivery(
    val coins: Int,
    val items: List<Item>
) {

    /**
     * Information about an item ready for pickup.
     *
     * @param id the item's ID
     * @param count the amount of this item ready for pickup
     */
    @Serializable
    public data class Item(
        val id: Int,
        val count: Int
    )

}