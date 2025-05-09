/*
 * Copyright (c) 2018-2025 Leon Linhart
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
package com.gw2tb.gw2api.client.v2

import com.gw2tb.gw2api.client.*
import com.gw2tb.gw2api.client.internal.*
import com.gw2tb.gw2api.types.*
import com.gw2tb.gw2api.types.v2.*
import kotlinx.serialization.builtins.*
import kotlin.jvm.*

/**
 * Returns information about an account's transactions.
 *
 * ```
 * Authenticated:       Yes (ACCOUNT, TRADING_POST)
 * Paginated:           Yes
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          INFINITE
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/transactions]
 *
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2CommerceTransactions(configure: RequestConfigurer? = null): RequestTemplate<List<String>> = RequestTemplate(
    path = "/v2/commerce/transactions",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z"),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf("account", "trading_post"),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(String.serializer()),
    configure = configure
)

/**
 * Returns information about an account's transactions.
 *
 * ```
 * Authenticated:       Yes (ACCOUNT, TRADING_POST)
 * Paginated:           Yes
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          INFINITE
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/transactions/:relevance]
 *
 * @param relevance the temporal relevance
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2CommerceTransactions(relevance: String, configure: RequestConfigurer? = null): RequestTemplate<List<String>> = RequestTemplate(
    path = "/v2/commerce/transactions",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z"),
    replaceInPath = mapOfNonNullValues("relevance" to relevance),
    requiredPermissions = setOf("account", "trading_post"),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(String.serializer()),
    configure = configure
)

/**
 * Returns information about an account's transactions.
 *
 * ```
 * Authenticated:       Yes (ACCOUNT, TRADING_POST)
 * Paginated:           Yes
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          1.0m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/transactions/:relevance/:type]
 *
 * @param relevance the temporal relevance
 * @param type the transaction type
 * @param page the index of the requested page
 * @param pageSize the size of the requested page
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2CommerceTransactionsByPage(relevance: String, type: String, page: Int, pageSize: Int? = null, configure: RequestConfigurer? = null): RequestTemplate<List<GW2v2CommerceTransaction>> = RequestTemplate(
    path = "/v2/commerce/transactions",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "page" to page, "page_size" to pageSize),
    replaceInPath = mapOfNonNullValues("relevance" to relevance, "type" to type),
    requiredPermissions = setOf("account", "trading_post"),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2CommerceTransaction.serializer()),
    configure = configure
)