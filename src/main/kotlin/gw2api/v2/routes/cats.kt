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
 * Queries the `/v2/cats` endpoint.
 *
 * ## The /v2/cats endpoint
 *
 * > This resource returns information about home instance cats.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/cats]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CatsById
 * @see gw2v2CatsByIds
 * @see gw2v2CatsByPage
 * @see gw2v2CatsAll
 *
 * @since   0.1.0 (API:  2017-05-26)
 */
@GW2APIv2DataIds("cats")
fun gw2v2CatsIds(): RequestBuilder<Collection<Int>> = query(
    endpoint = "/v2/cats",
    converter = jsonArrayParser(JSONIntParser)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/cats` endpoint.
 *
 * ## The /v2/cats endpoint
 *
 * > This resource returns information about home instance cats.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/cats]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CatsIds
 * @see gw2v2CatsByIds
 * @see gw2v2CatsByPage
 * @see gw2v2CatsAll
 *
 * @since   0.1.0 (API:  2017-05-26)
 */
@GW2APIv2DataById("cats")
fun gw2v2CatsById(id: String): RequestBuilder<GW2v2Cat> = query(
    endpoint = "/v2/cats",
    converter = jsonParser<GW2v2Cat>(),
    params = mapOf("id" to id)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/cats` endpoint.
 *
 * ## The /v2/cats endpoint
 *
 * > This resource returns information about home instance cats.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/cats]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CatsIds
 * @see gw2v2CatsById
 * @see gw2v2CatsByPage
 * @see gw2v2CatsAll
 *
 * @since   0.1.0 (API:  2017-05-26)
 */
@GW2APIv2DataByIds("cats")
fun gw2v2CatsByIds(ids: Collection<String>): RequestBuilder<Collection<GW2v2Cat>> = query(
    endpoint = "/v2/cats",
    converter = jsonArrayParser<GW2v2Cat>(),
    params = mapOf("ids" to ids.joinToString(","))
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/cats` endpoint.
 *
 * ## The /v2/cats endpoint
 *
 * > This resource returns information about home instance cats.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/cats]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CatsIds
 * @see gw2v2CatsById
 * @see gw2v2CatsByIds
 * @see gw2v2CatsAll
 *
 * @since   0.1.0 (API:  2017-05-26)
 */
@GW2APIv2DataByPage("cats")
fun gw2v2CatsByPage(page: Int, pageSize: Int): RequestBuilder<Collection<GW2v2Cat>> = query(
    endpoint = "/v2/cats",
    converter = jsonArrayParser<GW2v2Cat>(),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/cats` endpoint.
 *
 * ## The /v2/cats endpoint
 *
 * > This resource returns information about home instance cats.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/cats]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CatsIds
 * @see gw2v2CatsById
 * @see gw2v2CatsByIds
 * @see gw2v2CatsByPage
 *
 * @since   0.1.0 (API:  2017-05-26)
 */
@GW2APIv2DataAll("cats")
fun gw2v2CatsAll(): RequestBuilder<Collection<GW2v2Cat>> = query(
    endpoint = "/v2/cats",
    converter = jsonArrayParser<GW2v2Cat>(),
    params = mapOf("ids" to "all")
).setCacheTime(60 * 60 * 24, false)