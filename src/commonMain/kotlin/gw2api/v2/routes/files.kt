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
@GW2APIv2DataIds("files")
fun gw2v2FilesIds(): RequestBuilder<Collection<String>> = query(
    endpoint = "/v2/files",
    converter = jsonArrayParser(String.serializer())
).withCacheTime(24u, TimeUnit.HOURS)

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
@GW2APIv2DataById("files")
fun gw2v2FilesById(id: String): RequestBuilder<GW2v2File> = query(
    endpoint = "/v2/files",
    converter = jsonParser(GW2v2File.serializer()),
    params = mapOf("id" to id)
).withCacheTime(24u, TimeUnit.HOURS)

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
@GW2APIv2DataByIds("files")
fun gw2v2FilesByIds(ids: Collection<String>): RequestBuilder<Collection<GW2v2File>> = query(
    endpoint = "/v2/files",
    converter = jsonArrayParser(GW2v2File.serializer()),
    params = mapOf("ids" to ids.joinToString(","))
).withCacheTime(24u, TimeUnit.HOURS)

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
@GW2APIv2DataByPage("files")
fun gw2v2FilesByPage(page: Int, pageSize: Int): RequestBuilder<Collection<GW2v2File>> = query(
    endpoint = "/v2/files",
    converter = jsonArrayParser(GW2v2File.serializer()),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).withCacheTime(24u, TimeUnit.HOURS)

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
@GW2APIv2DataAll("files")
fun gw2v2FilesAll(): RequestBuilder<Collection<GW2v2File>> = query(
    endpoint = "/v2/files",
    converter = jsonArrayParser(GW2v2File.serializer()),
    params = mapOf("ids" to "all")
).withCacheTime(24u, TimeUnit.HOURS)