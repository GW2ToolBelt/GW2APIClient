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
 * Returns information about homestead decoration categories.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/homestead/decorations/categories]
 *
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2HomesteadDecorationsCategoriesIds(configure: RequestConfigurer? = null): RequestTemplate<List<GW2HomesteadDecorationCategoryId>> = RequestTemplate(
    path = "/v2/homestead/decorations/categories",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z"),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2HomesteadDecorationCategoryId.serializer()),
    configure = configure
)

/**
 * Returns information about homestead decoration categories.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/homestead/decorations/categories]
 *
 * @param id the ID of the requested object
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2HomesteadDecorationsCategoriesById(id: Int, configure: RequestConfigurer? = null): RequestTemplate<GW2v2HomesteadDecorationCategory> = RequestTemplate(
    path = "/v2/homestead/decorations/categories",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "id" to id),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = Language.API_V2,
    serializer = GW2v2HomesteadDecorationCategory.serializer(),
    configure = configure
)

/**
 * Returns information about homestead decoration categories.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/homestead/decorations/categories]
 *
 * @param id the ID of the requested object
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmSynthetic
@JvmName("gw2v2HomesteadDecorationsCategoriesById-Alias")
public fun gw2v2HomesteadDecorationsCategoriesById(id: GW2HomesteadDecorationCategoryId, configure: RequestConfigurer? = null): RequestTemplate<GW2v2HomesteadDecorationCategory> = RequestTemplate(
    path = "/v2/homestead/decorations/categories",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "id" to id),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = Language.API_V2,
    serializer = GW2v2HomesteadDecorationCategory.serializer(),
    configure = configure
)

/**
 * Returns information about homestead decoration categories.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/homestead/decorations/categories]
 *
 * @param ids the IDs of the requested objects
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2HomesteadDecorationsCategoriesByIds(ids: List<Int>, configure: RequestConfigurer? = null): RequestTemplate<List<GW2v2HomesteadDecorationCategory>> = RequestTemplate(
    path = "/v2/homestead/decorations/categories",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "ids" to ids),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2HomesteadDecorationCategory.serializer()),
    configure = configure
)

/**
 * Returns information about homestead decoration categories.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/homestead/decorations/categories]
 *
 * @param ids the IDs of the requested objects
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmSynthetic
@JvmName("gw2v2HomesteadDecorationsCategoriesByIds-Alias")
public fun gw2v2HomesteadDecorationsCategoriesByIds(ids: List<GW2HomesteadDecorationCategoryId>, configure: RequestConfigurer? = null): RequestTemplate<List<GW2v2HomesteadDecorationCategory>> = RequestTemplate(
    path = "/v2/homestead/decorations/categories",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "ids" to ids),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2HomesteadDecorationCategory.serializer()),
    configure = configure
)

/**
 * Returns information about homestead decoration categories.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/homestead/decorations/categories]
 *
 * @param page the index of the requested page
 * @param pageSize the size of the requested page
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2HomesteadDecorationsCategoriesByPage(page: Int, pageSize: Int? = null, configure: RequestConfigurer? = null): RequestTemplate<List<GW2v2HomesteadDecorationCategory>> = RequestTemplate(
    path = "/v2/homestead/decorations/categories",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "page" to page, "page_size" to pageSize),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2HomesteadDecorationCategory.serializer()),
    configure = configure
)