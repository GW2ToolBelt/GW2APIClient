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
 * Queries the `/v2/colors` endpoint.
 *
 * ## The /v2/colors endpoint
 *
 * > This resource returns all dye colors in the game, including localized names and their color component information.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/colors]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2ColorsById
 * @see gw2v2ColorsByIds
 * @see gw2v2ColorsByPage
 * @see gw2v2ColorsAll
 *
 * @since   0.1.0 (API: 2015-02-13)
 */
@GW2APIv2DataIds("colors")
fun gw2v2ColorsIds(): RequestBuilder<Collection<Int>> = query(
    endpoint = "/v2/colors",
    converter = jsonArrayParser(JSONIntParser)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/colors` endpoint.
 *
 * ## The /v2/colors endpoint
 *
 * > This resource returns all dye colors in the game, including localized names and their color component information.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/colors]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2ColorsIds
 * @see gw2v2ColorsByIds
 * @see gw2v2ColorsByPage
 * @see gw2v2ColorsAll
 *
 * @since   0.1.0 (API: 2015-02-13)
 */
@GW2APIv2DataById("colors")
fun gw2v2ColorsById(id: Int): RequestBuilder<GW2v2Color> = query(
    endpoint = "/v2/colors",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonParser<GW2v2Color>(),
    params = mapOf("id" to id)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/colors` endpoint.
 *
 * ## The /v2/colors endpoint
 *
 * > This resource returns all dye colors in the game, including localized names and their color component information.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/colors]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2ColorsIds
 * @see gw2v2ColorsById
 * @see gw2v2ColorsByPage
 * @see gw2v2ColorsAll
 *
 * @since   0.1.0 (API: 2015-02-13)
 */
@GW2APIv2DataByIds("colors")
fun gw2v2ColorsByIds(ids: Collection<Int>): RequestBuilder<Collection<GW2v2Color>> = query(
    endpoint = "/v2/colors",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<GW2v2Color>(),
    params = mapOf("ids" to ids.joinToString(","))
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/colors` endpoint.
 *
 * ## The /v2/colors endpoint
 *
 * > This resource returns all dye colors in the game, including localized names and their color component information.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/colors]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2ColorsIds
 * @see gw2v2ColorsById
 * @see gw2v2ColorsByIds
 * @see gw2v2ColorsAll
 *
 * @since   0.1.0 (API: 2015-02-13)
 */
@GW2APIv2DataByPage("colors")
fun gw2v2ColorsByPage(page: Int, pageSize: Int): RequestBuilder<Collection<GW2v2Color>> = query(
    endpoint = "/v2/colors",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<GW2v2Color>(),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/colors` endpoint.
 *
 * ## The /v2/colors endpoint
 *
 * > This resource returns all dye colors in the game, including localized names and their color component information.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/colors]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2ColorsIds
 * @see gw2v2ColorsById
 * @see gw2v2ColorsByIds
 * @see gw2v2ColorsByPage
 *
 * @since   0.1.0 (API: 2015-02-13)
 */
@GW2APIv2DataAll("colors")
fun gw2v2ColorsAll(): RequestBuilder<Collection<GW2v2Color>> = query(
    endpoint = "/v2/colors",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<GW2v2Color>(),
    params = mapOf("ids" to "all")
).setCacheTime(60 * 60 * 24, false)