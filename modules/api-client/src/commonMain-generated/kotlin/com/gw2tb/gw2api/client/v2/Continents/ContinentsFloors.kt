/*
 * Copyright (c) 2018-2025 Leon Linhart
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
package com.gw2tb.gw2api.client.v2

import com.gw2tb.gw2api.client.*
import com.gw2tb.gw2api.client.internal.*
import com.gw2tb.gw2api.types.*
import com.gw2tb.gw2api.types.v2.*
import kotlinx.serialization.builtins.*
import kotlin.jvm.*

/**
 * Returns information about a continent's floors.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/continents/:id/floors]
 *
 * @param continentId the continent's ID
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2ContinentsFloorsIds(continentId: Int, configure: RequestConfigurer? = null): RequestTemplate<List<GW2FloorId>> = RequestTemplate(
    path = "/v2/continents/:id/floors",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z"),
    replaceInPath = mapOfNonNullValues("id" to continentId),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2FloorId.serializer()),
    configure = configure
)

/**
 * Returns information about a continent's floors.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/continents/:id/floors]
 *
 * @param continentId the continent's ID
 * @param id the ID of the requested object
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2ContinentsFloorsById(continentId: Int, id: Int, configure: RequestConfigurer? = null): RequestTemplate<GW2v2ContinentFloor> = RequestTemplate(
    path = "/v2/continents/:id/floors",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "id" to id),
    replaceInPath = mapOfNonNullValues("id" to continentId),
    requiredPermissions = setOf(),
    supportedLanguages = Language.API_V2,
    serializer = GW2v2ContinentFloor.serializer(),
    configure = configure
)

/**
 * Returns information about a continent's floors.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/continents/:id/floors]
 *
 * @param continentId the continent's ID
 * @param id the ID of the requested object
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmSynthetic
@JvmName("gw2v2ContinentsFloorsById-Alias")
public fun gw2v2ContinentsFloorsById(continentId: Int, id: GW2FloorId, configure: RequestConfigurer? = null): RequestTemplate<GW2v2ContinentFloor> = RequestTemplate(
    path = "/v2/continents/:id/floors",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "id" to id),
    replaceInPath = mapOfNonNullValues("id" to continentId),
    requiredPermissions = setOf(),
    supportedLanguages = Language.API_V2,
    serializer = GW2v2ContinentFloor.serializer(),
    configure = configure
)

/**
 * Returns information about a continent's floors.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/continents/:id/floors]
 *
 * @param continentId the continent's ID
 * @param ids the IDs of the requested objects
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2ContinentsFloorsByIds(continentId: Int, ids: List<Int>, configure: RequestConfigurer? = null): RequestTemplate<List<GW2v2ContinentFloor>> = RequestTemplate(
    path = "/v2/continents/:id/floors",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "ids" to ids),
    replaceInPath = mapOfNonNullValues("id" to continentId),
    requiredPermissions = setOf(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2ContinentFloor.serializer()),
    configure = configure
)

/**
 * Returns information about a continent's floors.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/continents/:id/floors]
 *
 * @param continentId the continent's ID
 * @param ids the IDs of the requested objects
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmSynthetic
@JvmName("gw2v2ContinentsFloorsByIds-Alias")
public fun gw2v2ContinentsFloorsByIds(continentId: Int, ids: List<GW2FloorId>, configure: RequestConfigurer? = null): RequestTemplate<List<GW2v2ContinentFloor>> = RequestTemplate(
    path = "/v2/continents/:id/floors",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "ids" to ids),
    replaceInPath = mapOfNonNullValues("id" to continentId),
    requiredPermissions = setOf(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2ContinentFloor.serializer()),
    configure = configure
)

/**
 * Returns information about a continent's floors.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/continents/:id/floors]
 *
 * @param continentId the continent's ID
 * @param page the index of the requested page
 * @param pageSize the size of the requested page
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2ContinentsFloorsByPage(continentId: Int, page: Int, pageSize: Int? = null, configure: RequestConfigurer? = null): RequestTemplate<List<GW2v2ContinentFloor>> = RequestTemplate(
    path = "/v2/continents/:id/floors",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "page" to page, "page_size" to pageSize),
    replaceInPath = mapOfNonNullValues("id" to continentId),
    requiredPermissions = setOf(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2ContinentFloor.serializer()),
    configure = configure
)