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
 * Queries the `/v2/titles` endpoint.
 *
 * ## The /v2/titles endpoint
 *
 * > This resource returns information about the titles that are in the game.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/titles]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2TitlesById
 * @see gw2v2TitlesByIds
 * @see gw2v2TitlesByPage
 * @see gw2v2TitlesAll
 *
 * @since   0.1.0 (API: 2016-04-12)
 */
@GW2APIv2DataIds("titles")
fun gw2v2TitlesIds(): RequestBuilder<Collection<Int>> = query(
    endpoint = "/v2/titles",
    converter = jsonArrayParser(Int.serializer())
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/titles` endpoint.
 *
 * ## The /v2/titles endpoint
 *
 * > This resource returns information about the titles that are in the game.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/titles]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2TitlesIds
 * @see gw2v2TitlesByIds
 * @see gw2v2TitlesByPage
 * @see gw2v2TitlesAll
 *
 * @since   0.1.0 (API: 2016-04-12)
 */
@GW2APIv2DataById("titles")
fun gw2v2TitlesById(id: Int): RequestBuilder<GW2v2Title> = query(
    endpoint = "/v2/titles",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonParser(GW2v2Title.serializer()),
    params = mapOf("id" to id)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/titles` endpoint.
 *
 * ## The /v2/titles endpoint
 *
 * > This resource returns information about the titles that are in the game.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/titles]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2TitlesIds
 * @see gw2v2TitlesById
 * @see gw2v2TitlesByPage
 * @see gw2v2TitlesAll
 *
 * @since   0.1.0 (API: 2016-04-12)
 */
@GW2APIv2DataByIds("titles")
fun gw2v2TitlesByIds(ids: Collection<Int>): RequestBuilder<Collection<GW2v2Title>> = query(
    endpoint = "/v2/titles",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser(GW2v2Title.serializer()),
    params = mapOf("ids" to ids.joinToString(","))
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/titles` endpoint.
 *
 * ## The /v2/titles endpoint
 *
 * > This resource returns information about the titles that are in the game.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/titles]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2TitlesIds
 * @see gw2v2TitlesById
 * @see gw2v2TitlesByIds
 * @see gw2v2TitlesAll
 *
 * @since   0.1.0 (API: 2016-04-12)
 */
@GW2APIv2DataByPage("titles")
fun gw2v2TitlesByPage(page: Int, pageSize: Int): RequestBuilder<Collection<GW2v2Title>> = query(
    endpoint = "/v2/titles",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser(GW2v2Title.serializer()),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/titles` endpoint.
 *
 * ## The /v2/titles endpoint
 *
 * > This resource returns information about the titles that are in the game.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/titles]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2TitlesIds
 * @see gw2v2TitlesById
 * @see gw2v2TitlesByIds
 * @see gw2v2TitlesByPage
 *
 * @since   0.1.0 (API: 2016-04-12)
 */
@GW2APIv2DataAll("titles")
fun gw2v2TitlesAll(): RequestBuilder<Collection<GW2v2Title>> = query(
    endpoint = "/v2/titles",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser(GW2v2Title.serializer()),
    params = mapOf("ids" to "all")
).setCacheTime(60 * 60 * 24, false)