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
 * Queries the `/v2/wvw/abilities` endpoint.
 *
 * ## The /v2/wvw/abilities endpoint
 *
 * > This resource returns information about the available abilities in the World versus World game mode.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/wvw/abilities]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2WvWAbilitiesById
 * @see gw2v2WvWAbilitiesByIds
 * @see gw2v2WvWAbilitiesByPage
 * @see gw2v2WvWAbilitiesAll
 *
 * @since   0.1.0 (API: 2016-09-29)
 */
@GW2APIv2DataIds("wvw/abilities")
fun gw2v2WvWAbilitiesIds(): RequestBuilder<Collection<Int>> = query(
    endpoint = "/v2/wvw/abilities",
    converter = jsonArrayParser(Int.serializer())
).withCacheTime(24u, TimeUnit.HOURS)

/**
 * Queries the `/v2/wvw/abilities` endpoint.
 *
 * ## The /v2/wvw/abilities endpoint
 *
 * > This resource returns information about the available abilities in the World versus World game mode.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/wvw/abilities]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2WvWAbilitiesIds
 * @see gw2v2WvWAbilitiesByIds
 * @see gw2v2WvWAbilitiesByPage
 * @see gw2v2WvWAbilitiesAll
 *
 * @since   0.1.0 (API: 2016-09-29)
 */
@GW2APIv2DataById("wvw/abilities")
fun gw2v2WvWAbilitiesById(id: Int): RequestBuilder<GW2v2WvWAbilities> = query(
    endpoint = "/v2/wvw/abilities",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonParser(GW2v2WvWAbilities.serializer()),
    params = mapOf("id" to id)
).withCacheTime(24u, TimeUnit.HOURS)

/**
 * Queries the `/v2/wvw/abilities` endpoint.
 *
 * ## The /v2/wvw/abilities endpoint
 *
 * > This resource returns information about the available abilities in the World versus World game mode.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/wvw/abilities]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2WvWAbilitiesIds
 * @see gw2v2WvWAbilitiesById
 * @see gw2v2WvWAbilitiesByPage
 * @see gw2v2WvWAbilitiesAll
 *
 * @since   0.1.0 (API: 2016-09-29)
 */
@GW2APIv2DataByIds("wvw/abilities")
fun gw2v2WvWAbilitiesByIds(ids: Collection<Int>): RequestBuilder<Collection<GW2v2WvWAbilities>> = query(
    endpoint = "/v2/wvw/abilities",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser(GW2v2WvWAbilities.serializer()),
    params = mapOf("ids" to ids.joinToString(","))
).withCacheTime(24u, TimeUnit.HOURS)

/**
 * Queries the `/v2/wvw/abilities` endpoint.
 *
 * ## The /v2/wvw/abilities endpoint
 *
 * > This resource returns information about the available abilities in the World versus World game mode.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/wvw/abilities]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2WvWAbilitiesIds
 * @see gw2v2WvWAbilitiesById
 * @see gw2v2WvWAbilitiesByIds
 * @see gw2v2WvWAbilitiesAll
 *
 * @since   0.1.0 (API: 2016-09-29)
 */
@GW2APIv2DataByPage("wvw/abilities")
fun gw2v2WvWAbilitiesByPage(page: Int, pageSize: Int): RequestBuilder<Collection<GW2v2WvWAbilities>> = query(
    endpoint = "/v2/wvw/abilities",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser(GW2v2WvWAbilities.serializer()),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).withCacheTime(24u, TimeUnit.HOURS)

/**
 * Queries the `/v2/wvw/abilities` endpoint.
 *
 * ## The /v2/wvw/abilities endpoint
 *
 * > This resource returns information about the available abilities in the World versus World game mode.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/wvw/abilities]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2WvWAbilitiesIds
 * @see gw2v2WvWAbilitiesById
 * @see gw2v2WvWAbilitiesByIds
 * @see gw2v2WvWAbilitiesByPage
 *
 * @since   0.1.0 (API: 2016-09-29)
 */
@GW2APIv2DataAll("wvw/abilities")
fun gw2v2WvWAbilitiesAll(): RequestBuilder<Collection<GW2v2WvWAbilities>> = query(
    endpoint = "/v2/wvw/abilities",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser(GW2v2WvWAbilities.serializer()),
    params = mapOf("ids" to "all")
).withCacheTime(24u, TimeUnit.HOURS)