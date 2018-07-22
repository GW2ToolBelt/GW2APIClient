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
@file:JvmName("GW2v2")
@file:JvmMultifileClass
package gw2api.v2

import gw2api.*
import gw2api.extra.*
import kotlin.jvm.*

/**
 * Queries the `/v2/raids` endpoint.
 *
 * ## The /v2/raids endpoint
 *
 * > This resource returns details about each raid and it's associated wings.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/raids]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2RaidsById
 * @see gw2v2RaidsByIds
 * @see gw2v2RaidsByPage
 * @see gw2v2RaidsAll
 *
 * @since   0.1.0 (API: 2017-02-13)
 */
@GW2APIv2DataIds("raids")
fun gw2v2RaidsIds(): RequestBuilder<Collection<String>> = query(
    endpoint = "/v2/raids",
    converter = jsonArrayParser(JSONStringParser)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/raids` endpoint.
 *
 * ## The /v2/raids endpoint
 *
 * > This resource returns details about each raid and it's associated wings.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/raids]
 *
 * @param id    the id for the raid to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2RaidsIds
 * @see gw2v2RaidsByIds
 * @see gw2v2RaidsByPage
 * @see gw2v2RaidsAll
 *
 * @since   0.1.0 (API: 2017-02-13)
 */
@GW2APIv2DataById("raids")
fun gw2v2RaidsById(id: String): RequestBuilder<GW2v2Raid> = query(
    endpoint = "/v2/raids",
    converter = jsonParser<GW2v2Raid>(),
    params = mapOf("id" to id)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/raids` endpoint.
 *
 * ## The /v2/raids endpoint
 *
 * > This resource returns details about each raid and it's associated wings.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/raids]
 *
 * @param ids   the ids for the raids to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2RaidsIds
 * @see gw2v2RaidsById
 * @see gw2v2RaidsByPage
 * @see gw2v2RaidsAll
 *
 * @since   0.1.0 (API: 2017-02-13)
 */
@GW2APIv2DataByIds("raids")
fun gw2v2RaidsByIds(ids: Collection<String>): RequestBuilder<Collection<GW2v2Raid>> = query(
    endpoint = "/v2/raids",
    converter = jsonArrayParser<GW2v2Raid>(),
    params = mapOf("ids" to ids.joinToString(","))
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/raids` endpoint.
 *
 * ## The /v2/raids endpoint
 *
 * > This resource returns details about each raid and it's associated wings.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/raids]
 *
 * @param page      the index of the page
 * @param pageSize  the size of the page (must be in the range `[1,200]`)
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2RaidsIds
 * @see gw2v2RaidsById
 * @see gw2v2RaidsByIds
 * @see gw2v2RaidsAll
 *
 * @since   0.1.0 (API: 2017-02-13)
 */
@GW2APIv2DataByPage("raids")
fun gw2v2RaidsByPage(page: Int, pageSize: Int): RequestBuilder<Collection<GW2v2Raid>> = query(
    endpoint = "/v2/raids",
    converter = jsonArrayParser<GW2v2Raid>(),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/raids` endpoint.
 *
 * ## The /v2/raids endpoint
 *
 * > This resource returns details about each raid and it's associated wings.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/raids]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2RaidsIds
 * @see gw2v2RaidsById
 * @see gw2v2RaidsByIds
 * @see gw2v2RaidsByPage
 *
 * @since   0.1.0 (API: 2017-02-13)
 */
@GW2APIv2DataAll("raids")
fun gw2v2RaidsAll(): RequestBuilder<Collection<GW2v2Raid>> = query(
    endpoint = "/v2/raids",
    converter = jsonArrayParser<GW2v2Raid>(),
    params = mapOf("ids" to "all")
).setCacheTime(60 * 60 * 24, false)