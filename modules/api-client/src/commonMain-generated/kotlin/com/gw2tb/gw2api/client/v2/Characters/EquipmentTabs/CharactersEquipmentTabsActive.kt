/*
 * Copyright (c) 2018-2026 Leon Linhart
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

import kotlin.jvm.*
import kotlin.uuid.*
import kotlin.time.*

import kotlinx.serialization.builtins.*

/**
 * Returns information about a character's current equipment.
 *
 * ```
 * Authenticated:       Yes (ACCOUNT, BUILDS, CHARACTERS)
 * Paginated:           No
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          N/A
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters/:id/equipmenttabs/active]
 *
 * @param id the character's ID
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun gw2v2CharactersEquipmentTabsActive(id: String, configure: RequestConfigurer? = null): RequestTemplate<GW2v2CharactersEquipmentTab> = RequestTemplate(
    path = "/v2/characters/:id/equipmenttabs/active",
    parameters = mapOfNonNullValues("v" to "2024-07-20T01:00:00.000Z"),
    replaceInPath = mapOfNonNullValues("id" to id),
    requiredPermissions = setOf("account", "builds", "characters"),
    supportedLanguages = emptySet(),
    serializer = GW2v2CharactersEquipmentTab.serializer(),
    configure = configure
)