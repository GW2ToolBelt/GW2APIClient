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
 * Queries the `/v2/legends` endpoint.
 *
 * ## The /v2/legends endpoint
 *
 * > This resource returns information about the Revenant Legends that are in the game.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/legends]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2LegendsById
 * @see gw2v2LegendsByIds
 * @see gw2v2LegendsByPage
 * @see gw2v2LegendsAll
 *
 * @since   0.1.0 (API: 2016-04-22)
 */
@GW2APIv2DataIds("legends")
fun gw2v2LegendsIds(): RequestBuilder<Collection<String>> = query(
    endpoint = "/v2/legends",
    converter = jsonArrayParser(String.serializer())
).withCacheTime(24u, TimeUnit.HOURS)

/**
 * Queries the `/v2/legends` endpoint.
 *
 * ## The /v2/legends endpoint
 *
 * > This resource returns information about the Revenant Legends that are in the game.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/legends]
 *
 * @param id    the id for the raid to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2LegendsIds
 * @see gw2v2LegendsByIds
 * @see gw2v2LegendsByPage
 * @see gw2v2LegendsAll
 *
 * @since   0.1.0 (API: 2016-04-22)
 */
@GW2APIv2DataById("legends")
fun gw2v2LegendsById(id: String): RequestBuilder<GW2v2Legend> = query(
    endpoint = "/v2/legends",
    converter = jsonParser(GW2v2Legend.serializer()),
    params = mapOf("id" to id)
).withCacheTime(24u, TimeUnit.HOURS)

/**
 * Queries the `/v2/legends` endpoint.
 *
 * ## The /v2/legends endpoint
 *
 * > This resource returns information about the Revenant Legends that are in the game.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/legends]
 *
 * @param ids   the ids for the raids to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2LegendsIds
 * @see gw2v2LegendsById
 * @see gw2v2LegendsByPage
 * @see gw2v2LegendsAll
 *
 * @since   0.1.0 (API: 2016-04-22)
 */
@GW2APIv2DataByIds("legends")
fun gw2v2LegendsByIds(ids: Collection<String>): RequestBuilder<Collection<GW2v2Legend>> = query(
    endpoint = "/v2/legends",
    converter = jsonArrayParser(GW2v2Legend.serializer()),
    params = mapOf("ids" to ids.joinToString(","))
).withCacheTime(24u, TimeUnit.HOURS)

/**
 * Queries the `/v2/legends` endpoint.
 *
 * ## The /v2/legends endpoint
 *
 * > This resource returns information about the Revenant Legends that are in the game.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/legends]
 *
 * @param page      the index of the page
 * @param pageSize  the size of the page (must be in the range `[1,200]`)
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2LegendsIds
 * @see gw2v2LegendsById
 * @see gw2v2LegendsByIds
 * @see gw2v2LegendsAll
 *
 * @since   0.1.0 (API: 2016-04-22)
 */
@GW2APIv2DataByPage("legends")
fun gw2v2LegendsByPage(page: Int, pageSize: Int): RequestBuilder<Collection<GW2v2Legend>> = query(
    endpoint = "/v2/legends",
    converter = jsonArrayParser(GW2v2Legend.serializer()),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).withCacheTime(24u, TimeUnit.HOURS)

/**
 * Queries the `/v2/legends` endpoint.
 *
 * ## The /v2/legends endpoint
 *
 * > This resource returns information about the Revenant Legends that are in the game.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/legends]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2LegendsIds
 * @see gw2v2LegendsById
 * @see gw2v2LegendsByIds
 * @see gw2v2LegendsByPage
 *
 * @since   0.1.0 (API: 2016-04-22)
 */
@GW2APIv2DataAll("legends")
fun gw2v2LegendsAll(): RequestBuilder<Collection<GW2v2Legend>> = query(
    endpoint = "/v2/legends",
    converter = jsonArrayParser(GW2v2Legend.serializer()),
    params = mapOf("ids" to "all")
).withCacheTime(24u, TimeUnit.HOURS)