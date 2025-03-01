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
 * Returns an array of item IDs for recipes using a given item as ingredient.
 *
 * ```
 * Authenticated:       No
 * Paginated:           No
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          N/A
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/recipes/search]
 *
 * @param input the item ID of the crafting ingredient
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2RecipesSearchByInput(input: Int, configure: RequestConfigurer? = null): RequestTemplate<List<GW2RecipeId>> = RequestTemplate(
    path = "/v2/recipes/search",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "input" to input),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2RecipeId.serializer()),
    configure = configure
)

/**
 * Returns an array of item IDs for recipes using a given item as ingredient.
 *
 * ```
 * Authenticated:       No
 * Paginated:           No
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          N/A
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/recipes/search]
 *
 * @param input the item ID of the crafting ingredient
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmSynthetic
@JvmName("gw2v2RecipesSearchByInput-Alias")
public fun gw2v2RecipesSearchByInput(input: GW2ItemId, configure: RequestConfigurer? = null): RequestTemplate<List<GW2RecipeId>> = RequestTemplate(
    path = "/v2/recipes/search",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "input" to input),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2RecipeId.serializer()),
    configure = configure
)

/**
 * Returns an array of item IDs for recipes to craft a given item.
 *
 * ```
 * Authenticated:       No
 * Paginated:           No
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          N/A
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/recipes/search]
 *
 * @param output the item ID of the crafting result
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2RecipesSearchByOutput(output: Int, configure: RequestConfigurer? = null): RequestTemplate<List<GW2RecipeId>> = RequestTemplate(
    path = "/v2/recipes/search",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "output" to output),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2RecipeId.serializer()),
    configure = configure
)

/**
 * Returns an array of item IDs for recipes to craft a given item.
 *
 * ```
 * Authenticated:       No
 * Paginated:           No
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          N/A
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/recipes/search]
 *
 * @param output the item ID of the crafting result
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmSynthetic
@JvmName("gw2v2RecipesSearchByOutput-Alias")
public fun gw2v2RecipesSearchByOutput(output: GW2ItemId, configure: RequestConfigurer? = null): RequestTemplate<List<GW2RecipeId>> = RequestTemplate(
    path = "/v2/recipes/search",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "output" to output),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2RecipeId.serializer()),
    configure = configure
)