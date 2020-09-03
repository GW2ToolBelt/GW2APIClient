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
import gw2api.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*
import kotlin.jvm.*

/**
 * Creates a request used to query the resource.
 *
 * Returns information about an account's transactions.
 *
 * ```
 * Authenticated:       Yes (ACCOUNT, TRADINGPOST)
 * Paginated:           No
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          INFINITE
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/transactions]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2CommerceTransactions(configure: (RequestBuilder<List<String>>.() -> Unit)? = null): RequestBuilder<List<String>> = request(
    path = "/v2/commerce/transactions",
    parameters = mapOfNonNullValues("v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(String.serializer()),
    configure = configure
)

/**
 * Creates a request used to query the resource.
 *
 * Returns information about an account's transactions.
 *
 * ```
 * Authenticated:       No
 * Paginated:           No
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          INFINITE
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/transactions/:relevance]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2CommerceTransactions(relevance: String, configure: (RequestBuilder<List<String>>.() -> Unit)? = null): RequestBuilder<List<String>> = request(
    path = "/v2/commerce/transactions/:relevance",
    parameters = mapOfNonNullValues("v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(":relevance" to relevance),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(String.serializer()),
    configure = configure
)

/**
 * Creates a request used to query all available [items](GW2v2CommerceTransaction).
 *
 * Returns information about an account's transactions.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          1m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/transactions/:relevance/:type]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2CommerceTransactions(relevance: String, type: String, configure: (RequestBuilder<List<GW2v2CommerceTransaction>>.() -> Unit)? = null): RequestBuilder<List<GW2v2CommerceTransaction>> = request(
    path = "/v2/commerce/transactions/:relevance/:type",
    parameters = mapOfNonNullValues("ids" to "all", "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(":relevance" to relevance, ":type" to type),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2CommerceTransaction.serializer()),
    configure = configure
)

/**
 * Creates a request used to query one or more [items](GW2v2CommerceTransaction) by page.
 *
 * Returns information about an account's transactions.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          1m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/transactions/:relevance/:type]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2CommerceTransactionsByPage(relevance: String, type: String, page: Int, pageSize: Int = 200, configure: (RequestBuilder<List<GW2v2CommerceTransaction>>.() -> Unit)? = null): RequestBuilder<List<GW2v2CommerceTransaction>> = request(
    path = "/v2/commerce/transactions/:relevance/:type",
    parameters = mapOfNonNullValues("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString(), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(":relevance" to relevance, ":type" to type),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2CommerceTransaction.serializer()),
    configure = configure
)

/**
 * Information about a transaction.
 *
 * @param id the transaction's ID
 * @param itemID the item's ID
 * @param price the price in coins
 * @param quantity the quantity of the item
 * @param created the ISO-8601 standard timestamp of when the transaction was created
 * @param purchased the ISO-8601 standard timestamp of when the transaction was completed
 */
@Serializable
public data class GW2v2CommerceTransaction(
    val id: Int,
    @SerialName("item_id")
    val itemID: Int,
    val price: Int,
    val quantity: Int,
    val created: String,
    val purchased: String? = null
)