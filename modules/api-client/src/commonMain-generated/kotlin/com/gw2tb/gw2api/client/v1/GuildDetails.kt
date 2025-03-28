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
@file:JvmName("GW2v1")
@file:JvmMultifileClass
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package com.gw2tb.gw2api.client.v1

import com.gw2tb.gw2api.client.*
import com.gw2tb.gw2api.client.internal.*
import com.gw2tb.gw2api.types.*
import com.gw2tb.gw2api.types.v1.*
import kotlinx.serialization.builtins.*
import kotlin.jvm.*

/**
 * Returns information about a guild.
 *
 * ```
 * Authenticated:       No
 * Paginated:           No
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          N/A
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:1/guild_details]
 *
 * @param guildId the ID of the guild
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v1GuildDetailsByID(guildId: String, configure: RequestConfigurer? = null): RequestTemplate<GW2v1GuildDetails> = RequestTemplate(
    path = "/v1/guild_details",
    parameters = mapOfNonNullValues("guild_id" to guildId),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = GW2v1GuildDetails.serializer(),
    configure = configure
)

/**
 * Returns information about a guild.
 *
 * ```
 * Authenticated:       No
 * Paginated:           No
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          N/A
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:1/guild_details]
 *
 * @param guildName the name of the guild
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v1GuildDetailsByName(guildName: String, configure: RequestConfigurer? = null): RequestTemplate<GW2v1GuildDetails> = RequestTemplate(
    path = "/v1/guild_details",
    parameters = mapOfNonNullValues("guild_name" to guildName),
    replaceInPath = mapOfNonNullValues(),
    requiredPermissions = setOf(),
    supportedLanguages = emptySet(),
    serializer = GW2v1GuildDetails.serializer(),
    configure = configure
)