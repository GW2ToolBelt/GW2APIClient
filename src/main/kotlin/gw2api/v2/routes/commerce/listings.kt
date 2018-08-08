/*
 * Copyright 2018 Leon Linhart
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
package gw2api.v2

import gw2api.*
import gw2api.extra.*
import gw2api.misc.*
import kotlin.jvm.*

/**
 * Queries the `/v2/commerce/listings` endpoint.
 *
 * ## The /v2/commerce/listings endpoint
 *
 * > This resource returns current buy and sell listings from the trading post.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/listings]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CommerceListingsById
 * @see gw2v2CommerceListingsByIds
 * @see gw2v2CommerceListingsByPage
 * @see gw2v2CommerceListingsAll
 *
 * @since   0.1.0 (API: 2014-09-08)
 */
@GW2APIv2DataIds("commerce/listings")
fun gw2v2CommerceListingsIds(): RequestBuilder<Collection<Int>> = query(
    endpoint = "/v2/commerce/listings",
    converter = jsonArrayParser(JSONIntParser)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/commerce/listings` endpoint.
 *
 * ## The /v2/commerce/listings endpoint
 *
 * > This resource returns current buy and sell listings from the trading post.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/listings]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CommerceListingsIds
 * @see gw2v2CommerceListingsByIds
 * @see gw2v2CommerceListingsByPage
 * @see gw2v2CommerceListingsAll
 *
 * @since   0.1.0 (API: 2014-09-08)
 */
@GW2APIv2DataById("commerce/listings")
fun gw2v2CommerceListingsById(id: Int): RequestBuilder<GW2v2CommerceListings> = query(
    endpoint = "/v2/commerce/listings",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonParser<GW2v2CommerceListings>(),
    params = mapOf("id" to id)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/commerce/listings` endpoint.
 *
 * ## The /v2/commerce/listings endpoint
 *
 * > This resource returns current buy and sell listings from the trading post.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/listings]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CommerceListingsIds
 * @see gw2v2CommerceListingsById
 * @see gw2v2CommerceListingsByPage
 * @see gw2v2CommerceListingsAll
 *
 * @since   0.1.0 (API: 2014-09-08)
 */
@GW2APIv2DataByIds("commerce/listings")
fun gw2v2CommerceListingsByIds(ids: Collection<Int>): RequestBuilder<Collection<GW2v2CommerceListings>> = query(
    endpoint = "/v2/commerce/listings",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<GW2v2CommerceListings>(),
    params = mapOf("ids" to ids.joinToString(","))
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/commerce/listings` endpoint.
 *
 * ## The /v2/commerce/listings endpoint
 *
 * > This resource returns current buy and sell listings from the trading post.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/listings]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CommerceListingsIds
 * @see gw2v2CommerceListingsById
 * @see gw2v2CommerceListingsByIds
 * @see gw2v2CommerceListingsAll
 *
 * @since   0.1.0 (API: 2014-09-08)
 */
@GW2APIv2DataByPage("commerce/listings")
fun gw2v2CommerceListingsByPage(page: Int, pageSize: Int): RequestBuilder<Collection<GW2v2CommerceListings>> = query(
    endpoint = "/v2/commerce/listings",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<GW2v2CommerceListings>(),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/commerce/listings` endpoint.
 *
 * ## The /v2/commerce/listings endpoint
 *
 * > This resource returns current buy and sell listings from the trading post.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/commerce/listings]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CommerceListingsIds
 * @see gw2v2CommerceListingsById
 * @see gw2v2CommerceListingsByIds
 * @see gw2v2CommerceListingsByPage
 *
 * @since   0.1.0 (API: 2014-09-08)
 */
@GW2APIv2DataAll("commerce/listings")
fun gw2v2CommerceListingsAll(): RequestBuilder<Collection<GW2v2CommerceListings>> = query(
    endpoint = "/v2/commerce/listings",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<GW2v2CommerceListings>(),
    params = mapOf("ids" to "all")
).setCacheTime(60 * 60 * 24, false)