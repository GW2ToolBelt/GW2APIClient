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
 * Queries the `/v2/worlds` endpoint.
 *
 * ## The /v2/worlds endpoint
 *
 * > This resource returns information about the available worlds, or servers.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/worlds]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2WorldsById
 * @see gw2v2WorldsByIds
 * @see gw2v2WorldsByPage
 * @see gw2v2WorldsAll
 *
 * @since   0.1.0 (API: 2015-08-21)
 */
@Suppress("UNUSED")
fun gw2v2WorldsIds(): RequestBuilder<Collection<Int>> = query(
    endpoint = "/v2/worlds",
    converter = jsonArrayParser(JSONIntParser)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/worlds` endpoint.
 *
 * ## The /v2/worlds endpoint
 *
 * > This resource returns information about the available worlds, or servers.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/worlds]
 *
 * @param id    the id for the world to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2WorldsIds
 * @see gw2v2WorldsByIds
 * @see gw2v2WorldsByPage
 * @see gw2v2WorldsAll
 *
 * @since   0.1.0 (API: 2015-08-21)
 */
@Suppress("UNUSED")
fun gw2v2WorldsById(id: Int): RequestBuilder<World> = query(
    endpoint = "/v2/worlds",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonParser<World>(),
    params = mapOf("id" to id)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/worlds` endpoint.
 *
 * ## The /v2/worlds endpoint
 *
 * > This resource returns information about the available worlds, or servers.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/worlds]
 *
 * @param ids   the ids for the worlds to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2WorldsIds
 * @see gw2v2WorldsById
 * @see gw2v2WorldsByPage
 * @see gw2v2WorldsAll
 *
 * @since   0.1.0 (API: 2015-08-21)
 */
@Suppress("UNUSED")
fun gw2v2WorldsByIds(ids: Collection<Int>): RequestBuilder<Collection<World>> = query(
    endpoint = "/v2/worlds",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<World>(),
    params = mapOf("ids" to ids.joinToString(","))
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/worlds` endpoint.
 *
 * ## The /v2/worlds endpoint
 *
 * > This resource returns information about the available worlds, or servers.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/worlds]
 *
 * @param page      the index of the page
 * @param pageSize  the size of the page (must be in the range `[1,200]`)
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2WorldsIds
 * @see gw2v2WorldsById
 * @see gw2v2WorldsByIds
 * @see gw2v2WorldsAll
 *
 * @since   0.1.0 (API: 2015-08-21)
 */
@Suppress("UNUSED")
fun gw2v2WorldsByPage(page: Int, pageSize: Int): RequestBuilder<Collection<World>> = query(
    endpoint = "/v2/worlds",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<World>(),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/worlds` endpoint.
 *
 * ## The /v2/worlds endpoint
 *
 * > This resource returns information about the available worlds, or servers.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/worlds]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2WorldsIds
 * @see gw2v2WorldsById
 * @see gw2v2WorldsByIds
 * @see gw2v2WorldsByPage
 *
 * @since   0.1.0 (API: 2015-08-21)
 */
@Suppress("UNUSED")
fun gw2v2WorldsAll(): RequestBuilder<Collection<World>> = query(
    endpoint = "/v2/worlds",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<World>(),
    params = mapOf("ids" to "all")
).setCacheTime(60 * 60 * 24, false)

/**
 * This resource returns information about the available worlds, or servers.
 *
 * ## Notes
 *
 * - The first digit of the id indicates the world's region. `1` is North America, `2` is Europe.
 * - The second digit of the id currently correlates with the world's assigned language: `1` means French, `2` means
 *   German, and `3` means Spanish.
 *
 *
 * ## Examples
 *
 * `https://api.guildwars2.com/v2/worlds?ids=1001,1002,1003`
 *
 * ```
 * [
 *   { "id": 1001, "name": "Anvil Rock", "population": "Medium" },
 *   { "id": 1002, "name": "Borlis Pass", "population": "Medium" },
 *   { "id": 1003, "name": "Yak's Bend", "population": "Full" }
 * ]
 * ```
 *
 * **Querying all worlds**
 *
 * `https://api.guildwars2.com/v2/worlds?ids=all`
 *
 * ```
 * [
 *   { "id": 1001, "name": "Anvil Rock", "population": "Medium" },
 *   { "id": 1002, "name": "Borlis Pass", "population": "Medium" },
 *   { "id": 1003, "name": "Yak's Bend", "population": "Full" },
 *   { "id": 1004, "name": "Henge of Denravi", "population": "High" },
 *   { "id": 1005, "name": "Maguuma", "population": "VeryHigh" },
 *   { "id": 1006, "name": "Sorrow's Furnace", "population": "Medium" },
 *   { "id": 1007, "name": "Gate of Madness", "population": "Medium" },
 *   { "id": 1008, "name": "Jade Quarry", "population": "Full" },
 *   { "id": 1009, "name": "Fort Aspenwood", "population": "VeryHigh" },
 *   { "id": 1010, "name": "Ehmry Bay", "population": "Medium" },
 *   { "id": 1011, "name": "Stormbluff Isle", "population": "VeryHigh" },
 *   { "id": 1012, "name": "Darkhaven", "population": "High" },
 *   { "id": 1013, "name": "Sanctum of Rall", "population": "Medium" },
 *   { "id": 1014, "name": "Crystal Desert", "population": "VeryHigh" },
 *   { "id": 1015, "name": "Isle of Janthir", "population": "Medium" },
 *   { "id": 1016, "name": "Sea of Sorrows", "population": "High" },
 *   { "id": 1017, "name": "Tarnished Coast", "population": "Full" },
 *   { "id": 1018, "name": "Northern Shiverpeaks", "population": "High" },
 *   { "id": 1019, "name": "Blackgate", "population": "Full" },
 *   { "id": 1020, "name": "Ferguson's Crossing", "population": "Medium" },
 *   { "id": 1021, "name": "Dragonbrand", "population": "High" },
 *   { "id": 1022, "name": "Kaineng", "population": "Medium" },
 *   { "id": 1023, "name": "Devona's Rest", "population": "Medium" },
 *   { "id": 1024, "name": "Eredon Terrace", "population": "Medium" },
 *   { "id": 2001, "name": "Fissure of Woe", "population": "Medium" },`
 *   { "id": 2002, "name": "Desolation", "population": "VeryHigh" },
 *   { "id": 2003, "name": "Gandara", "population": "VeryHigh" },
 *   { "id": 2004, "name": "Blacktide", "population": "Medium" },
 *   { "id": 2005, "name": "Ring of Fire", "population": "Medium" },
 *   { "id": 2006, "name": "Underworld", "population": "Medium" },
 *   { "id": 2007, "name": "Far Shiverpeaks", "population": "VeryHigh" },
 *   { "id": 2008, "name": "Whiteside Ridge", "population": "Medium" },
 *   { "id": 2009, "name": "Ruins of Surmia", "population": "Medium" },
 *   { "id": 2010, "name": "Seafarer's Rest", "population": "Full" },
 *   { "id": 2011, "name": "Vabbi", "population": "Medium" },
 *   { "id": 2012, "name": "Piken Square", "population": "VeryHigh" },
 *   { "id": 2013, "name": "Aurora Glade", "population": "High" },
 *   { "id": 2014, "name": "Gunnar's Hold", "population": "High" },
 *   { "id": 2101, "name": "Jade Sea [FR]", "population": "VeryHigh" },
 *   { "id": 2102, "name": "Fort Ranik [FR]", "population": "Medium" },
 *   { "id": 2103, "name": "Augury Rock [FR]", "population": "High" },
 *   { "id": 2104, "name": "Vizunah Square [FR]", "population": "VeryHigh" },
 *   { "id": 2105, "name": "Arborstone [FR]", "population": "Medium" },
 *   { "id": 2201, "name": "Kodash [DE]", "population": "Full" },
 *   { "id": 2202, "name": "Riverside [DE]", "population": "VeryHigh" },
 *   { "id": 2203, "name": "Elona Reach [DE]", "population": "VeryHigh" },
 *   { "id": 2204, "name": "Abaddon's Mouth [DE]", "population": "VeryHigh" },
 *   { "id": 2205, "name": "Drakkar Lake [DE]", "population": "VeryHigh" },
 *   { "id": 2206, "name": "Miller's Sound [DE]", "population": "Medium" },
 *   { "id": 2207, "name": "Dzagonur [DE]", "population": "Medium" },
 *   { "id": 2301, "name": "Baruch Bay [SP]", "population": "VeryHigh" }
 * ]
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/worlds]
 *
 * @param id            the world id
 * @param name          the world name
 * @param population    the world population level (One of: "Low", "Medium", "High", "VeryHigh", "Full")
 *
 * @see gw2v2WorldsIds
 * @see gw2v2WorldsById
 * @see gw2v2WorldsByIds
 * @see gw2v2WorldsByPage
 * @see gw2v2WorldsAll
 *
 * @since   0.1.0 (API: 2015-08-21)
 */
@Serializable
data class World(
    /** @since  0.1.0 (API: 2015-08-21) */
    @Suppress("MemberVisibilityCanBePrivate")
    val id: Int,
    /** @since  0.1.0 (API: 2015-08-21) */
    @Suppress("MemberVisibilityCanBePrivate")
    val name: String,
    /** @since  0.1.0 (API: 2015-08-21) */
    @Suppress("MemberVisibilityCanBePrivate")
    val population: String
)