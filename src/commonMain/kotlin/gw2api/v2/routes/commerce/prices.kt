/*
 * Copyright 2018-2019 Leon Linhart
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@file:JvmName("GW2v2")
@file:JvmMultifileClass
@file:Suppress("PackageDirectoryMismatch")
package gw2api.v2

import gw2api.*
import gw2api.extra.*
import gw2api.misc.*
import kotlinx.serialization.*
import kotlin.jvm.*

/**
 * Queries the `/v2/commerce/prices` endpoint.
 *
 * ## The /v2/commerce/prices endpoint
 *
 * > This resource returns current aggregated buy and sell listing information from the trading post.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       No
 * Localized:           No
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/prices]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CommercePricesById
 * @see gw2v2CommercePricesByIds
 * @see gw2v2CommercePricesByPage
 * @see gw2v2CommercePricesAll
 *
 * @since   0.1.0 (API: 2016-09-19)
 */
@GW2APIv2DataIds("commerce/prices")
fun gw2v2CommercePricesIds(): RequestBuilder<Collection<Int>> = query(
    endpoint = "/v2/commerce/prices",
    converter = jsonArrayParser(Int.serializer())
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/commerce/prices` endpoint.
 *
 * ## The /v2/commerce/prices endpoint
 *
 * > This resource returns current aggregated buy and sell listing information from the trading post.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       No
 * Localized:           Yes
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/prices]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CommercePricesIds
 * @see gw2v2CommercePricesByIds
 * @see gw2v2CommercePricesByPage
 * @see gw2v2CommercePricesAll
 *
 * @since   0.1.0 (API: 2016-09-19)
 */
@GW2APIv2DataById("commerce/prices")
fun gw2v2CommercePricesById(id: Int): RequestBuilder<GW2v2CommercePrices> = query(
    endpoint = "/v2/commerce/prices",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonParser(GW2v2CommercePrices.serializer()),
    params = mapOf("id" to id)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/commerce/prices` endpoint.
 *
 * ## The /v2/commerce/prices endpoint
 *
 * > This resource returns current aggregated buy and sell listing information from the trading post.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       No
 * Localized:           Yes
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/prices]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CommercePricesIds
 * @see gw2v2CommercePricesById
 * @see gw2v2CommercePricesByPage
 * @see gw2v2CommercePricesAll
 *
 * @since   0.1.0 (API: 2016-09-19)
 */
@GW2APIv2DataByIds("commerce/prices")
fun gw2v2CommercePricesByIds(ids: Collection<Int>): RequestBuilder<Collection<GW2v2CommercePrices>> = query(
    endpoint = "/v2/commerce/prices",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser(GW2v2CommercePrices.serializer()),
    params = mapOf("ids" to ids.joinToString(","))
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/commerce/prices` endpoint.
 *
 * ## The /v2/commerce/prices endpoint
 *
 * > This resource returns current aggregated buy and sell listing information from the trading post.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       No
 * Localized:           Yes
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/prices]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CommercePricesIds
 * @see gw2v2CommercePricesById
 * @see gw2v2CommercePricesByIds
 * @see gw2v2CommercePricesAll
 *
 * @since   0.1.0 (API: 2016-09-19)
 */
@GW2APIv2DataByPage("commerce/prices")
fun gw2v2CommercePricesByPage(page: Int, pageSize: Int): RequestBuilder<Collection<GW2v2CommercePrices>> = query(
    endpoint = "/v2/commerce/prices",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser(GW2v2CommercePrices.serializer()),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/commerce/prices` endpoint.
 *
 * ## The /v2/commerce/prices endpoint
 *
 * > This resource returns current aggregated buy and sell listing information from the trading post.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       No
 * Localized:           Yes
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/prices]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CommercePricesIds
 * @see gw2v2CommercePricesById
 * @see gw2v2CommercePricesByIds
 * @see gw2v2CommercePricesByPage
 *
 * @since   0.1.0 (API: 2016-09-19)
 */
@GW2APIv2DataAll("commerce/prices")
fun gw2v2CommercePricesAll(): RequestBuilder<Collection<GW2v2CommercePrices>> = query(
    endpoint = "/v2/commerce/prices",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser(GW2v2CommercePrices.serializer()),
    params = mapOf("ids" to "all")
).setCacheTime(60 * 60 * 24, false)