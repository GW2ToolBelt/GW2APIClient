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
 * Returns information about the available sub-endpoints.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          INFINITE
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/pvp/seasons/:id/leaderboards]
 *
 * @param id the season's ID
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2PvPSeasonsLeaderboards(id: String, configure: RequestConfigurer? = null): RequestTemplate<List<String>> = RequestTemplate(
    path = "/v2/pvp/seasons/:id/leaderboards",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z"),
    replaceInPath = mapOfNonNullValues("id" to id),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(String.serializer()),
    configure = configure
)

/**
 * Returns information about the available sub-endpoints.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          INFINITE
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/pvp/seasons/:id/leaderboards/:board]
 *
 * @param id the season's ID
 * @param board the board
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2PvPSeasonsLeaderboards(id: String, board: String, configure: RequestConfigurer? = null): RequestTemplate<List<String>> = RequestTemplate(
    path = "/v2/pvp/seasons/:id/leaderboards",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z"),
    replaceInPath = mapOfNonNullValues("id" to id, "board" to board),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(String.serializer()),
    configure = configure
)

/**
 * Returns information about a PvP leaderboard.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/pvp/seasons/:id/leaderboards/:board/:region]
 *
 * @param id the season's ID
 * @param board the board
 * @param region the region
 * @param page the index of the requested page
 * @param pageSize the size of the requested page
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2PvPSeasonsLeaderboardsByPage(id: String, board: String, region: String, page: Int, pageSize: Int? = null, configure: RequestConfigurer? = null): RequestTemplate<List<GW2v2PvpSeasonsLeaderboardEntry>> = RequestTemplate(
    path = "/v2/pvp/seasons/:id/leaderboards",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "page" to page, "page_size" to pageSize),
    replaceInPath = mapOfNonNullValues("id" to id, "board" to board, "region" to region),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2PvpSeasonsLeaderboardEntry.serializer()),
    configure = configure
)

/**
 * Returns information about a PvP leaderboard.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/pvp/seasons/:id/leaderboards/:board/:region]
 *
 * @param id the season's ID
 * @param board the board
 * @param region the region
 * @param page the index of the requested page
 * @param pageSize the size of the requested page
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmSynthetic
@JvmName("gw2v2PvPSeasonsLeaderboardsByPage-Alias")
public fun gw2v2PvPSeasonsLeaderboardsByPage(id: GW2PvpSeasonId, board: String, region: String, page: Int, pageSize: Int? = null, configure: RequestConfigurer? = null): RequestTemplate<List<GW2v2PvpSeasonsLeaderboardEntry>> = RequestTemplate(
    path = "/v2/pvp/seasons/:id/leaderboards",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z", "page" to page, "page_size" to pageSize),
    replaceInPath = mapOfNonNullValues("id" to id, "board" to board, "region" to region),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2PvpSeasonsLeaderboardEntry.serializer()),
    configure = configure
)