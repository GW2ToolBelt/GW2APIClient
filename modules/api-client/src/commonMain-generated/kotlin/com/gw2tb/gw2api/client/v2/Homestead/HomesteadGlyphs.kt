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
 * Returns information about glyphs storable in the homestead.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           No
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/homestead/glyphs]
 *
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2HomesteadGlyphsIds(configure: RequestConfigurer? = null): RequestTemplate<List<GW2HomesteadGlyphId>> = RequestTemplate(
    path = "/v2/homestead/glyphs",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z"),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2HomesteadGlyphId.serializer()),
    configure = configure
)

/**
 * Returns information about glyphs storable in the homestead.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           No
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/homestead/glyphs]
 *
 * @param id the ID of the requested object
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2HomesteadGlyphsById(id: String, configure: RequestConfigurer? = null): RequestTemplate<GW2v2HomesteadGlyph> = RequestTemplate(
    path = "/v2/homestead/glyphs",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "id" to id),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = GW2v2HomesteadGlyph.serializer(),
    configure = configure
)

/**
 * Returns information about glyphs storable in the homestead.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           No
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/homestead/glyphs]
 *
 * @param id the ID of the requested object
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmSynthetic
@JvmName("gw2v2HomesteadGlyphsById-Alias")
public fun gw2v2HomesteadGlyphsById(id: GW2HomesteadGlyphId, configure: RequestConfigurer? = null): RequestTemplate<GW2v2HomesteadGlyph> = RequestTemplate(
    path = "/v2/homestead/glyphs",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "id" to id),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = GW2v2HomesteadGlyph.serializer(),
    configure = configure
)

/**
 * Returns information about glyphs storable in the homestead.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           No
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/homestead/glyphs]
 *
 * @param ids the IDs of the requested objects
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2HomesteadGlyphsByIds(ids: List<String>, configure: RequestConfigurer? = null): RequestTemplate<List<GW2v2HomesteadGlyph>> = RequestTemplate(
    path = "/v2/homestead/glyphs",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "ids" to ids),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2HomesteadGlyph.serializer()),
    configure = configure
)

/**
 * Returns information about glyphs storable in the homestead.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           No
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/homestead/glyphs]
 *
 * @param ids the IDs of the requested objects
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmSynthetic
@JvmName("gw2v2HomesteadGlyphsByIds-Alias")
public fun gw2v2HomesteadGlyphsByIds(ids: List<GW2HomesteadGlyphId>, configure: RequestConfigurer? = null): RequestTemplate<List<GW2v2HomesteadGlyph>> = RequestTemplate(
    path = "/v2/homestead/glyphs",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "ids" to ids),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2HomesteadGlyph.serializer()),
    configure = configure
)

/**
 * Returns information about glyphs storable in the homestead.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           No
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/homestead/glyphs]
 *
 * @param page the index of the requested page
 * @param pageSize the size of the requested page
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2HomesteadGlyphsByPage(page: Int, pageSize: Int? = null, configure: RequestConfigurer? = null): RequestTemplate<List<GW2v2HomesteadGlyph>> = RequestTemplate(
    path = "/v2/homestead/glyphs",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "page" to page, "page_size" to pageSize),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2HomesteadGlyph.serializer()),
    configure = configure
)