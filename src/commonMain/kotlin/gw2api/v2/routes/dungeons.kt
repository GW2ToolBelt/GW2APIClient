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
 * Queries the `/v2/dungeons` endpoint.
 *
 * ## The /v2/dungeons endpoint
 *
 * > This resource returns details about each dungeon and it's associated paths.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/dungeons]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2DungeonsById
 * @see gw2v2DungeonsByIds
 * @see gw2v2DungeonsByPage
 * @see gw2v2DungeonsAll
 *
 * @since   0.1.0 (API: 2017-03-01)
 */
@GW2APIv2DataIds("dungeons")
fun gw2v2DungeonsIds(): RequestBuilder<Collection<String>> = query(
    endpoint = "/v2/dungeons",
    converter = jsonArrayParser(String.serializer())
).withCacheTime(24u, TimeUnit.HOURS)

/**
 * Queries the `/v2/dungeons` endpoint.
 *
 * ## The /v2/dungeons endpoint
 *
 * > This resource returns details about each dungeon and it's associated paths.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/dungeons]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2DungeonsIds
 * @see gw2v2DungeonsByIds
 * @see gw2v2DungeonsByPage
 * @see gw2v2DungeonsAll
 *
 * @since   0.1.0 (API: 2017-03-01)
 */
@GW2APIv2DataById("dungeons")
fun gw2v2DungeonsById(id: String): RequestBuilder<GW2v2Dungeon> = query(
    endpoint = "/v2/dungeons",
    converter = jsonParser(GW2v2Dungeon.serializer()),
    params = mapOf("id" to id)
).withCacheTime(24u, TimeUnit.HOURS)

/**
 * Queries the `/v2/dungeons` endpoint.
 *
 * ## The /v2/dungeons endpoint
 *
 * > This resource returns details about each dungeon and it's associated paths.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/dungeons]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2DungeonsIds
 * @see gw2v2DungeonsById
 * @see gw2v2DungeonsByPage
 * @see gw2v2DungeonsAll
 *
 * @since   0.1.0 (API: 2017-03-01)
 */
@GW2APIv2DataByIds("dungeons")
fun gw2v2DungeonsByIds(ids: Collection<String>): RequestBuilder<Collection<GW2v2Dungeon>> = query(
    endpoint = "/v2/dungeons",
    converter = jsonArrayParser(GW2v2Dungeon.serializer()),
    params = mapOf("ids" to ids.joinToString(","))
).withCacheTime(24u, TimeUnit.HOURS)

/**
 * Queries the `/v2/dungeons` endpoint.
 *
 * ## The /v2/dungeons endpoint
 *
 * > This resource returns details about each dungeon and it's associated paths.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/dungeons]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2DungeonsIds
 * @see gw2v2DungeonsById
 * @see gw2v2DungeonsByIds
 * @see gw2v2DungeonsAll
 *
 * @since   0.1.0 (API: 2017-03-01)
 */
@GW2APIv2DataByPage("dungeons")
fun gw2v2DungeonsByPage(page: Int, pageSize: Int): RequestBuilder<Collection<GW2v2Dungeon>> = query(
    endpoint = "/v2/dungeons",
    converter = jsonArrayParser(GW2v2Dungeon.serializer()),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).withCacheTime(24u, TimeUnit.HOURS)

/**
 * Queries the `/v2/dungeons` endpoint.
 *
 * ## The /v2/dungeons endpoint
 *
 * > This resource returns details about each dungeon and it's associated paths.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/dungeons]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2DungeonsIds
 * @see gw2v2DungeonsById
 * @see gw2v2DungeonsByIds
 * @see gw2v2DungeonsByPage
 *
 * @since   0.1.0 (API: 2017-03-01)
 */
@GW2APIv2DataAll("dungeons")
fun gw2v2DungeonsAll(): RequestBuilder<Collection<GW2v2Dungeon>> = query(
    endpoint = "/v2/dungeons",
    converter = jsonArrayParser(GW2v2Dungeon.serializer()),
    params = mapOf("ids" to "all")
).withCacheTime(24u, TimeUnit.HOURS)