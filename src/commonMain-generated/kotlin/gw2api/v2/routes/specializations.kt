/*
 * Copyright (c) 2018-2020 Leon Linhart
 * MACHINE GENERATED FILE, DO NOT EDIT
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
@file:JvmName("GW2v2")
@file:JvmMultifileClass
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package gw2api.v2

import gw2api.*
import gw2api.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*
import kotlin.jvm.*

/**
 * Creates a request used to query the list of available IDs.
 *
 * Returns information about the specializations in the game.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/specializations]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2SpecializationsIDs(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/v2/specializations",
    parameters = mapOfNonNullValues("v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(Int.serializer()),
    configure = configure
)

/**
 * Creates a request used to query a single [item](GW2v2Specialization) by its ID.
 *
 * Returns information about the specializations in the game.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/specializations]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2SpecializationsByID(id: Int, configure: (RequestBuilder<GW2v2Specialization>.() -> Unit)? = null): RequestBuilder<GW2v2Specialization> = request(
    path = "/v2/specializations",
    parameters = mapOfNonNullValues("id" to id.toString(), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = GW2v2Specialization.serializer(),
    configure = configure
)

/**
 * Creates a request used to query one or more [items](GW2v2Specialization) by their IDs.
 *
 * Returns information about the specializations in the game.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/specializations]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2SpecializationsByIDs(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2Specialization>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Specialization>> = request(
    path = "/v2/specializations",
    parameters = mapOfNonNullValues("ids" to ids.joinToString(","), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2Specialization.serializer()),
    configure = configure
)

/**
 * Creates a request used to query all available [items](GW2v2Specialization).
 *
 * Returns information about the specializations in the game.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/specializations]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2SpecializationsAll(configure: (RequestBuilder<List<GW2v2Specialization>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Specialization>> = request(
    path = "/v2/specializations",
    parameters = mapOfNonNullValues("ids" to "all", "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2Specialization.serializer()),
    configure = configure
)

/**
 * Creates a request used to query one or more [items](GW2v2Specialization) by page.
 *
 * Returns information about the specializations in the game.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/specializations]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2SpecializationsByPage(page: Int, pageSize: Int = 200, configure: (RequestBuilder<List<GW2v2Specialization>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Specialization>> = request(
    path = "/v2/specializations",
    parameters = mapOfNonNullValues("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString(), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2Specialization.serializer()),
    configure = configure
)

/**
 * Information about a specialization.
 *
 * @param id the ID of the specialization
 * @param name the localized name of the specialization
 * @param profession the ID of the profession the specialization belongs to
 * @param elite a flag indicating whether or not the specialization is an elite specialization
 * @param icon a render service URL for the specialization's icon
 * @param background a render service URL for the specialization's background image
 * @param minorTraits a list of all IDs of the specialization's minor traits
 * @param majorTraits a list of all IDs of the specialization's major traits
 * @param weaponTrait the ID of the elite specialization's weapon trait
 * @param professionIcon a render service URL for the elite specialization's icon
 * @param bigProfessionIcon a render service URL for a large variant of the elite specialization's icon
 */
@Serializable
public data class GW2v2Specialization(
    val id: Int,
    val name: String,
    val profession: String,
    val elite: Boolean,
    val icon: String,
    val background: String,
    @SerialName("minor_traits")
    val minorTraits: List<Int>,
    @SerialName("major_traits")
    val majorTraits: List<Int>,
    @SerialName("weapon_trait")
    val weaponTrait: Int? = null,
    @SerialName("profession_icon")
    val professionIcon: String? = null,
    @SerialName("profession_icon_big")
    val bigProfessionIcon: String? = null
)