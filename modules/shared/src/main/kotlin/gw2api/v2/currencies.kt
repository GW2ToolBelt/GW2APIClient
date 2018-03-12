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
package gw2api.v2

import gw2api.*
import gw2api.misc.*
import kotlinx.serialization.*

/**
 * Queries the `/v2/currencies` endpoint.
 *
 * ## The /v2/currencies endpoint
 *
 * > This resource returns a list of the currencies contained in the account wallet.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       No
 * Localized:           Yes (Chinese, English, French, German, Spanish)
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/currencies]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CurrenciesById
 * @see gw2v2CurrenciesByIds
 * @see gw2v2CurrenciesByPage
 * @see gw2v2CurrenciesAll
 *
 * @since   0.1.0 (API: 2015-08-21)
 */
@Suppress("UNUSED")
fun gw2v2CurrenciesIds(): RequestBuilder<Collection<Int>> = query(
    endpoint = "/v2/currencies",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser(JSONIntParser)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/currencies` endpoint.
 *
 * ## The /v2/currencies endpoint
 *
 * > This resource returns a list of the currencies contained in the account wallet.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       No
 * Localized:           Yes (Chinese, English, French, German, Spanish)
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/currencies]
 *
 * @param id    the id for the currency to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CurrenciesIds
 * @see gw2v2CurrenciesByIds
 * @see gw2v2CurrenciesByPage
 * @see gw2v2CurrenciesAll
 *
 * @since   0.1.0 (API: 2015-08-21)
 */
@Suppress("UNUSED")
fun gw2v2CurrenciesById(id: Int): RequestBuilder<Currency> = query(
    endpoint = "/v2/currencies",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonParser<Currency>(),
    params = mapOf("id" to id)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/currencies` endpoint.
 *
 * ## The /v2/currencies endpoint
 *
 * > This resource returns a list of the currencies contained in the account wallet.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       No
 * Localized:           Yes (Chinese, English, French, German, Spanish)
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/currencies]
 *
 * @param ids   the ids for the currencies to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CurrenciesIds
 * @see gw2v2CurrenciesById
 * @see gw2v2CurrenciesByPage
 * @see gw2v2CurrenciesAll
 *
 * @since   0.1.0 (API: 2015-08-21)
 */
@Suppress("UNUSED")
fun gw2v2CurrenciesByIds(ids: Collection<Int>): RequestBuilder<Collection<Currency>> = query(
    endpoint = "/v2/currencies",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<Currency>(),
    params = mapOf("ids" to ids.joinToString(","))
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/currencies` endpoint.
 *
 * ## The /v2/currencies endpoint
 *
 * > This resource returns a list of the currencies contained in the account wallet.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       No
 * Localized:           Yes (Chinese, English, French, German, Spanish)
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/currencies]
 *
 * @param page      the index of the page
 * @param pageSize  the size of the page (must be in the range `[1,200]`)
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CurrenciesIds
 * @see gw2v2CurrenciesById
 * @see gw2v2CurrenciesByIds
 * @see gw2v2CurrenciesAll
 *
 * @since   0.1.0 (API: 2015-08-21)
 */
@Suppress("UNUSED")
fun gw2v2CurrenciesByPage(page: Int, pageSize: Int): RequestBuilder<Collection<Currency>> = query(
    endpoint = "/v2/currencies",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<Currency>(),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/currencies` endpoint.
 *
 * ## The /v2/currencies endpoint
 *
 * > This resource returns a list of the currencies contained in the account wallet.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       No
 * Localized:           Yes (Chinese, English, French, German, Spanish)
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/currencies]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CurrenciesIds
 * @see gw2v2CurrenciesById
 * @see gw2v2CurrenciesByIds
 * @see gw2v2CurrenciesByPage
 *
 * @since   0.1.0 (API: 2015-08-21)
 */
@Suppress("UNUSED")
fun gw2v2CurrenciesAll(): RequestBuilder<Collection<Currency>> = query(
    endpoint = "/v2/currencies",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<Currency>(),
    params = mapOf("ids" to "all")
).setCacheTime(60 * 60 * 24, false)

/**
 * This resource returns a list of the currencies contained in the account wallet.
 *
 * ## Example
 *
 * `https://api.guildwars2.com/v2/currencies/1`
 *
 * ```
 * {
 *   "id": 1,
 *   "name": "Coin",
 *   "description": "The primary currency of Tyria. Spent at vendors throughout the world.",
 *   "order": 10,
 *   "icon": "https://render.guildwars2.com/file/98457F504BA2FAC8457F532C4B30EDC23929ACF9/619316.png"
 * }
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/currencies]
 *
 * @param id            the currency's id
 * @param name          the currency's name
 * @param description   a description of the currency
 * @param order         a number that can be used to sort the list of currencies when ordered from least to greatest (An
 *                      arbitrary number indicating what order the currencies are sorted in-game; lowest currencies come
 *                      first.)
 * @param icon          a URL to an icon for the currency
 *
 * @see gw2v2CurrenciesIds
 * @see gw2v2CurrenciesById
 * @see gw2v2CurrenciesByIds
 * @see gw2v2CurrenciesByPage
 * @see gw2v2CurrenciesAll
 *
 * @since   0.1.0 (API: 2015-08-21)
 */
@Serializable
data class Currency(
    /** @since  0.1.0 (API: 2015-08-21) */
    @Suppress("MemberVisibilityCanBePrivate")
    val id: Int,
    /** @since  0.1.0 (API: 2015-08-21) */
    @Suppress("MemberVisibilityCanBePrivate")
    val name: String,
    /** @since  0.1.0 (API: 2015-08-21) */
    @Suppress("MemberVisibilityCanBePrivate")
    val description: String,
    /** @since  0.1.0 (API: 2015-08-21) */
    @Suppress("MemberVisibilityCanBePrivate")
    val order: Int,
    /** @since  0.1.0 (API: 2015-08-21) */
    @Suppress("MemberVisibilityCanBePrivate")
    val icon: String
)