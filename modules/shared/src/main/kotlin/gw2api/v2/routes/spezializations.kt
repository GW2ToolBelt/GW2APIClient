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
import gw2api.misc.*
import kotlinx.serialization.internal.*
import kotlin.jvm.*

/**
 * Queries the `/v2/specializations` endpoint.
 *
 * ## The /v2/specializations endpoint
 *
 * > This resource returns information on currently released specializations.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/specializations]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2SpecializationsById
 * @see gw2v2SpecializationsByIds
 * @see gw2v2SpecializationsByPage
 * @see gw2v2SpecializationsAll
 *
 * @since   0.1.0 (API: 2015-06-24)
 */
fun gw2v2SpecializationsIds(): RequestBuilder<Collection<Int>> = query(
    endpoint = "/v2/specializations",
    converter = jsonArrayParser(IntSerializer)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/specializations` endpoint.
 *
 * ## The /v2/specializations endpoint
 *
 * > This resource returns information on currently released specializations.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/specializations]
 *
 * @param id    the id for the specialization to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2SpecializationsIds
 * @see gw2v2SpecializationsByIds
 * @see gw2v2SpecializationsByPage
 * @see gw2v2SpecializationsAll
 *
 * @since   0.1.0 (API: 2015-06-24)
 */
fun gw2v2SpecializationsById(id: Int): RequestBuilder<GW2v2Specialization> = query(
    endpoint = "/v2/specializations",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonParser<GW2v2Specialization>(),
    params = mapOf("id" to id)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/specializations` endpoint.
 *
 * ## The /v2/specializations endpoint
 *
 * > This resource returns information on currently released specializations.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/specializations]
 *
 * @param ids   the ids for the specializations to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2SpecializationsIds
 * @see gw2v2SpecializationsById
 * @see gw2v2SpecializationsByPage
 * @see gw2v2SpecializationsAll
 *
 * @since   0.1.0 (API: 2015-06-24)
 */
fun gw2v2SpecializationsByIds(ids: Collection<Int>): RequestBuilder<Collection<GW2v2Specialization>> = query(
    endpoint = "/v2/specializations",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<GW2v2Specialization>(),
    params = mapOf("ids" to ids.joinToString(","))
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/specializations` endpoint.
 *
 * ## The /v2/specializations endpoint
 *
 * > This resource returns information on currently released specializations.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/specializations]
 *
 * @param page      the index of the page
 * @param pageSize  the size of the page (must be in the range `[1,200]`)
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2SpecializationsIds
 * @see gw2v2SpecializationsById
 * @see gw2v2SpecializationsByIds
 * @see gw2v2SpecializationsAll
 *
 * @since  0.1.0 (API: 2015-06-24)
 */
fun gw2v2SpecializationsByPage(page: Int, pageSize: Int): RequestBuilder<Collection<GW2v2Specialization>> = query(
    endpoint = "/v2/specializations",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<GW2v2Specialization>(),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/specializations` endpoint.
 *
 * ## The /v2/specializations endpoint
 *
 * > This resource returns information on currently released specializations.
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/specializations]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2SpecializationsIds
 * @see gw2v2SpecializationsById
 * @see gw2v2SpecializationsByIds
 * @see gw2v2SpecializationsByPage
 *
 * @since  0.1.0 (API: 2015-06-24)
 */
fun gw2v2SpecializationsAll(): RequestBuilder<Collection<GW2v2Specialization>> = query(
    endpoint = "/v2/specializations",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<GW2v2Specialization>(),
    params = mapOf("ids" to "all")
).setCacheTime(60 * 60 * 24, false)