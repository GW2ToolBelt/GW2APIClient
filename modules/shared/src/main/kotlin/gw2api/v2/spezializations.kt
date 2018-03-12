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
import kotlinx.serialization.internal.*

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
@Suppress("UNUSED")
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
@Suppress("UNUSED")
fun gw2v2SpecializationsById(id: Int): RequestBuilder<Specialization> = query(
    endpoint = "/v2/specializations",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonParser<Specialization>(),
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
@Suppress("UNUSED")
fun gw2v2SpecializationsByIds(ids: Collection<Int>): RequestBuilder<Collection<Specialization>> = query(
    endpoint = "/v2/specializations",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<Specialization>(),
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
@Suppress("UNUSED")
fun gw2v2SpecializationsByPage(page: Int, pageSize: Int): RequestBuilder<Collection<Specialization>> = query(
    endpoint = "/v2/specializations",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<Specialization>(),
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
@Suppress("UNUSED")
fun gw2v2SpecializationsAll(): RequestBuilder<Collection<Specialization>> = query(
    endpoint = "/v2/specializations",
    isLocalized = true,
    supportedLanguages = API_V2_LANGS,
    converter = jsonArrayParser<Specialization>(),
    params = mapOf("ids" to "all")
).setCacheTime(60 * 60 * 24, false)

/**
 * This resource returns information on currently released specializations.
 *
 * ## Notes
 *
 * - The first digit of the id indicates the world's region. `1` is North America, `2` is Europe.
 * - The second digit of the id currently correlates with the world's assigned language: `1` means French, `2` means
 *   German, and `3` means Spanish.
 *
 *
 * ## Examples
 *
 * `https://api.guildwars2.com/v2/specializations/1`
 *
 * ```
 * {
 *   "id": 1,
 *   "name": "Dueling",
 *   "profession": "Mesmer",
 *   "elite": false,
 *   "minor_traits": [
 *     706,
 *     710,
 *     707
 *     ],
 *   "major_traits": [
 *     701,
 *     705,
 *     700,
 *     1889,
 *     1960,
 *     708,
 *     692,
 *     1950,
 *     704
 *   ],
 *   "icon": "https://render.guildwars2.com/file/43C5400906A104C60F30DFE0A145D1E767353573/1012003.png",
 *   "background": "https://render.guildwars2.com/file/992D53319C5FCD4AE841C592DC2AE91D5906AECF/1012057.png"
 * }
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/specializations]
 *
 * @param id                the specialization's id
 * @param name              the name of the specialization
 * @param profession        the profession that this specialization belongs to
 * @param elite             `true` if this specialization is an Elite specialization, `false` otherwise
 * @param icon              a URL to an icon of the specialization
 * @param background        a URL to the background image of the specialization
 * @param minorTraits       contains a list of IDs specifying the minor traits in the specialization
 * @param majorTraits       contains a list of IDs specifying the major traits in the specialization
 * @param weaponTrait       the weapon trait of the specialization (Optional - Elite specialization only)
 * @param professionIcon    the profession icon that overrides the default profession icon (Optional - Elite
 *                          specialization only)
 * @param professionIconBig a bigger version of [professionIcon] (Optional - Elite specialization only)
 *
 * @see gw2v2SpecializationsIds
 * @see gw2v2SpecializationsById
 * @see gw2v2SpecializationsByIds
 * @see gw2v2SpecializationsByPage
 * @see gw2v2SpecializationsAll
 *
 * @since  0.1.0 (API: 2015-06-24)
 */
@Serializable
data class Specialization(
    /** @since  0.1.0 (API: 2015-06-24) */
    @Suppress("MemberVisibilityCanBePrivate")
    val id: Int,
    /** @since  0.1.0 (API: 2015-06-24) */
    @Suppress("MemberVisibilityCanBePrivate")
    val name: String,
    /** @since  0.1.0 (API: 2015-06-24) */
    @Suppress("MemberVisibilityCanBePrivate")
    val profession: String,
    /** @since  0.1.0 (API: 2015-06-24) */
    @Suppress("MemberVisibilityCanBePrivate")
    val elite: Boolean,
    /** @since  0.1.0 (API: 2015-06-24) */
    @Suppress("MemberVisibilityCanBePrivate")
    val icon: String,
    /** @since  0.1.0 (API: 2015-05-08) */
    @Suppress("MemberVisibilityCanBePrivate")
    val background: String,
    /** @since  0.1.0 (API: 2015-06-24) */
    @Suppress("MemberVisibilityCanBePrivate")
    @SerialName("minor_traits")
    val minorTraits: Collection<Int>,
    /** @since  0.1.0 (API: 2015-06-24) */
    @Suppress("MemberVisibilityCanBePrivate")
    @SerialName("major_traits")
    val majorTraits: Collection<Int>,
    /** @since  0.1.0 (API: 2016-04-13) */
    @Suppress("MemberVisibilityCanBePrivate")
    @Optional
    @SerialName("weapon_trait")
    val weaponTrait: Int? = null,
    /** @since  0.1.0 (API: 2016-03-14) */
    @Suppress("MemberVisibilityCanBePrivate")
    @Optional
    @SerialName("profession_icon")
    val professionIcon: String? = null,
    /** @since  0.1.0 (API: 2016-03-14) */
    @Suppress("MemberVisibilityCanBePrivate")
    @Optional
    @SerialName("profession_icon_big")
    val professionIconBig: String? = null
)