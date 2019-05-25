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
import kotlin.jvm.*

/**
 * Queries the `/v2/wvw/ranks` endpoint.
 *
 * ## The /v2/wvw/ranks endpoint
 *
 * > This resource returns information about the available ranks in the World versus World game mode.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/wvw/ranks]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2WvWRanksById
 * @see gw2v2WvWRanksByIds
 * @see gw2v2WvWRanksByPage
 * @see gw2v2WvWRanksAll
 *
 * @since   0.1.0 (API: 2016-09-19)
 */
@GW2APIv2DataIds("wvw/ranks")
fun gw2v2WvWRanksIds(): RequestBuilder<Collection<Int>> = query(
    endpoint = "/v2/wvw/ranks",
    converter = jsonArrayParser(JSONIntParser)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/wvw/ranks` endpoint.
 *
 * ## The /v2/wvw/ranks endpoint
 *
 * > This resource returns information about the available ranks in the World versus World game mode.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/wvw/ranks]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2WvWRanksIds
 * @see gw2v2WvWRanksByIds
 * @see gw2v2WvWRanksByPage
 * @see gw2v2WvWRanksAll
 *
 * @since   0.1.0 (API: 2016-09-19)
 */
@GW2APIv2DataById("wvw/ranks")
fun gw2v2WvWRanksById(id: Int): RequestBuilder<GW2v2WvWRanks> = query(
    endpoint = "/v2/wvw/ranks",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonParser<GW2v2WvWRanks>(),
    params = mapOf("id" to id)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/wvw/ranks` endpoint.
 *
 * ## The /v2/wvw/ranks endpoint
 *
 * > This resource returns information about the available ranks in the World versus World game mode.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/wvw/ranks]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2WvWRanksIds
 * @see gw2v2WvWRanksById
 * @see gw2v2WvWRanksByPage
 * @see gw2v2WvWRanksAll
 *
 * @since   0.1.0 (API: 2016-09-19)
 */
@GW2APIv2DataByIds("wvw/ranks")
fun gw2v2WvWRanksByIds(ids: Collection<Int>): RequestBuilder<Collection<GW2v2WvWRanks>> = query(
    endpoint = "/v2/wvw/ranks",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<GW2v2WvWRanks>(),
    params = mapOf("ids" to ids.joinToString(","))
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/wvw/ranks` endpoint.
 *
 * ## The /v2/wvw/ranks endpoint
 *
 * > This resource returns information about the available ranks in the World versus World game mode.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/wvw/ranks]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2WvWRanksIds
 * @see gw2v2WvWRanksById
 * @see gw2v2WvWRanksByIds
 * @see gw2v2WvWRanksAll
 *
 * @since   0.1.0 (API: 2016-09-19)
 */
@GW2APIv2DataByPage("wvw/ranks")
fun gw2v2WvWRanksByPage(page: Int, pageSize: Int): RequestBuilder<Collection<GW2v2WvWRanks>> = query(
    endpoint = "/v2/wvw/ranks",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<GW2v2WvWRanks>(),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/wvw/ranks` endpoint.
 *
 * ## The /v2/wvw/ranks endpoint
 *
 * > This resource returns information about the available ranks in the World versus World game mode.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/wvw/ranks]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2WvWRanksIds
 * @see gw2v2WvWRanksById
 * @see gw2v2WvWRanksByIds
 * @see gw2v2WvWRanksByPage
 *
 * @since   0.1.0 (API: 2016-09-19)
 */
@GW2APIv2DataAll("wvw/ranks")
fun gw2v2WvWRanksAll(): RequestBuilder<Collection<GW2v2WvWRanks>> = query(
    endpoint = "/v2/wvw/ranks",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<GW2v2WvWRanks>(),
    params = mapOf("ids" to "all")
).setCacheTime(60 * 60 * 24, false)