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