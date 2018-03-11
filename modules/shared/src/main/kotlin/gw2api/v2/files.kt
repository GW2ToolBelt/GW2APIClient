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
 * Queries the `/v2/files` endpoint.
 *
 * ## The /v2/files endpoint
 *
 * > This resource returns commonly requested in-game assets that may be used to enhance API-derived applications.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/files]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2FilesById
 * @see gw2v2FilesByIds
 * @see gw2v2FilesByPage
 * @see gw2v2FilesAll
 *
 * @since   0.1.0 (API: 2015-02-13)
 */
@Suppress("UNUSED")
fun gw2v2FilesIds(): RequestBuilder<Collection<String>> = query(
    endpoint = "/v2/files",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonParser<Collection<String>>()
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/files` endpoint.
 *
 * ## The /v2/files endpoint
 *
 * > This resource returns commonly requested in-game assets that may be used to enhance API-derived applications.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/files]
 *
 * @param id    the id for the file to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2FilesIds
 * @see gw2v2FilesByIds
 * @see gw2v2FilesByPage
 * @see gw2v2FilesAll
 *
 * @since   0.1.0 (API: 2015-02-13)
 */
@Suppress("UNUSED")
fun gw2v2FilesById(id: Int): RequestBuilder<File> = query(
    endpoint = "/v2/files",
    converter = jsonParser<File>(),
    params = mapOf("id" to id)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/files` endpoint.
 *
 * ## The /v2/files endpoint
 *
 * > This resource returns commonly requested in-game assets that may be used to enhance API-derived applications.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/files]
 *
 * @param ids   the ids for the files to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2FilesIds
 * @see gw2v2FilesById
 * @see gw2v2FilesByPage
 * @see gw2v2FilesAll
 *
 * @since   0.1.0 (API: 2015-02-13)
 */
@Suppress("UNUSED")
fun gw2v2FilesByIds(ids: Collection<Int>): RequestBuilder<Collection<File>> = query(
    endpoint = "/v2/files",
    converter = jsonParser<Collection<File>>(),
    params = mapOf("ids" to ids.joinToString(","))
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/files` endpoint.
 *
 * ## The /v2/files endpoint
 *
 * > This resource returns commonly requested in-game assets that may be used to enhance API-derived applications.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/files]
 *
 * @param page      the index of the page
 * @param pageSize  the size of the page (must be in the range `[1,200]`)
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2FilesIds
 * @see gw2v2FilesById
 * @see gw2v2FilesByIds
 * @see gw2v2FilesAll
 *
 * @since   0.1.0 (API: 2015-02-13)
 */
@Suppress("UNUSED")
fun gw2v2FilesByPage(page: Int, pageSize: Int): RequestBuilder<Collection<File>> = query(
    endpoint = "/v2/files",
    converter = jsonParser<Collection<File>>(),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/files` endpoint.
 *
 * ## The /v2/files endpoint
 *
 * > This resource returns commonly requested in-game assets that may be used to enhance API-derived applications.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/files]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2FilesIds
 * @see gw2v2FilesById
 * @see gw2v2FilesByIds
 * @see gw2v2FilesByPage
 *
 * @since   0.1.0 (API: 2015-02-13)
 */
@Suppress("UNUSED")
fun gw2v2FilesAll(): RequestBuilder<Collection<File>> = query(
    endpoint = "/v2/files",
    converter = jsonParser<Collection<File>>(),
    params = mapOf("ids" to "all")
).setCacheTime(60 * 60 * 24, false)

/**
 * This resource returns commonly requested in-game assets that may be used to enhance API-derived applications.
 *
 * ## Examples
 *
 * `https://api.guildwars2.com/v2/files?ids=all`
 *
 * ```
 * [
 *   { "id": "map_complete",
 *     "icon": "https://render.guildwars2.com/file/5A4E663071250EC72668C09E3C082E595A380BF7/528724.png" },
 *   { "id": "map_dungeon",
 *     "icon": "https://render.guildwars2.com/file/943538394A94A491C8632FBEF6203C2013443555/102478.png" },
 *   ...
 * ]
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/files]
 *
 * @param id    the file identifier
 * @param icon  the URL to the image
 *
 * @see gw2v2FilesIds
 * @see gw2v2FilesById
 * @see gw2v2FilesByIds
 * @see gw2v2FilesByPage
 * @see gw2v2FilesAll
 *
 * @since  0.1.0 (API: 2015-02-13)
 */
@Serializable
data class File(
    /** @since  0.1.0 (API: 2015-02-13) */
    @Suppress("MemberVisibilityCanBePrivate")
    val id: String,
    /** @since  0.1.0 (API: 2015-02-13) */
    @Suppress("MemberVisibilityCanBePrivate")
    val icon: String
)