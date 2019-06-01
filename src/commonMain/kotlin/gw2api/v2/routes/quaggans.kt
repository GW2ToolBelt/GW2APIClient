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
import kotlinx.serialization.*
import kotlin.jvm.*

/**
 * Queries the `/v2/quaggans` endpoint.
 *
 * ## The /v2/quaggans endpoint
 *
 * > This resource returns quaggan images.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/quaggans]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2QuaggansById
 * @see gw2v2QuaggansByIds
 * @see gw2v2QuaggansByPage
 * @see gw2v2QuaggansAll
 *
 * @since   0.1.0 (API: 2014-07-16)
 */
@GW2APIv2DataIds("quaggans")
fun gw2v2QuaggansIds(): RequestBuilder<Collection<String>> = query(
    endpoint = "/v2/quaggans",
    converter = jsonArrayParser(String.serializer())
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/quaggans` endpoint.
 *
 * ## The /v2/quaggans endpoint
 *
 * > This resource returns quaggan images.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/quaggans]
 *
 * @param id    the id for the quaggan to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2QuaggansIds
 * @see gw2v2QuaggansByIds
 * @see gw2v2QuaggansByPage
 * @see gw2v2QuaggansAll
 *
 * @since   0.1.0 (API: 2014-07-16)
 */
@GW2APIv2DataById("quaggans")
fun gw2v2QuaggansById(id: String): RequestBuilder<GW2v2Quaggan> = query(
    endpoint = "/v2/quaggans",
    converter = jsonParser(GW2v2Quaggan.serializer()),
    params = mapOf("id" to id)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/quaggans` endpoint.
 *
 * ## The /v2/quaggans endpoint
 *
 * > This resource returns quaggan images.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/quaggans]
 *
 * @param ids   the ids for the quaggans to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2QuaggansIds
 * @see gw2v2QuaggansById
 * @see gw2v2QuaggansByPage
 * @see gw2v2QuaggansAll
 *
 * @since   0.1.0 (API: 2014-07-16)
 */
@GW2APIv2DataByIds("quaggans")
fun gw2v2QuaggansByIds(ids: Collection<String>): RequestBuilder<Collection<GW2v2Quaggan>> = query(
    endpoint = "/v2/quaggans",
    converter = jsonArrayParser(GW2v2Quaggan.serializer()),
    params = mapOf("ids" to ids.joinToString(","))
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/quaggans` endpoint.
 *
 * ## The /v2/quaggans endpoint
 *
 * > This resource returns quaggan images.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/quaggans]
 *
 * @param page      the index of the page
 * @param pageSize  the size of the page (must be in the range `[1,200]`)
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2QuaggansIds
 * @see gw2v2QuaggansById
 * @see gw2v2QuaggansByIds
 * @see gw2v2QuaggansAll
 *
 * @since   0.1.0 (API: 2014-07-16)
 */
@GW2APIv2DataByPage("quaggans")
fun gw2v2QuaggansByPage(page: Int, pageSize: Int): RequestBuilder<Collection<GW2v2Quaggan>> = query(
    endpoint = "/v2/quaggans",
    converter = jsonArrayParser(GW2v2Quaggan.serializer()),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/quaggans` endpoint.
 *
 * ## The /v2/quaggans endpoint
 *
 * > This resource returns quaggan images.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/quaggans]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2QuaggansIds
 * @see gw2v2QuaggansById
 * @see gw2v2QuaggansByIds
 * @see gw2v2QuaggansByPage
 *
 * @since   0.1.0 (API: 2014-07-16)
 */
@GW2APIv2DataAll("quaggans")
fun gw2v2QuaggansAll(): RequestBuilder<Collection<GW2v2Quaggan>> = query(
    endpoint = "/v2/quaggans",
    converter = jsonArrayParser(GW2v2Quaggan.serializer()),
    params = mapOf("ids" to "all")
).setCacheTime(60 * 60 * 24, false)