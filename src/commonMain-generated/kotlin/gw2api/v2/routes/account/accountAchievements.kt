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
 * Creates a request used to query the resource.
 *
 * Returns a player's progress towards all their achievements.
 *
 * ```
 * Authenticated:       Yes (ACCOUNT, PROGRESSION)
 * Paginated:           No
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          N/A
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/account/achievements]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2AccountAchievements(configure: (RequestBuilder<GW2v2AccountAchievement>.() -> Unit)? = null): RequestBuilder<GW2v2AccountAchievement> = request(
    path = "/v2/account/achievements",
    parameters = mapOfNonNullValues("v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2AccountAchievement.serializer(),
    configure = configure
)

/**
 * Information about a player's progress towards an achievement.
 *
 * @param id the achievement's ID
 * @param done a flag indicating whether or not the account has completed the achievement
 * @param bits an array of numbers (whose exact meaning differs) giving information about the progress towards an achievement
 * @param current the account's current progress towards the achievement
 * @param max the amount of progress required to complete the achievement
 * @param repeated the number of times the achievement has been completed (if the achievement is repeatable)
 * @param unlocked a flag indicating whether or not the achievement is unlocked (if the achievement can be unlocked)
 */
@Serializable
public data class GW2v2AccountAchievement(
    val id: Int,
    val done: Boolean,
    val bits: List<Int>? = null,
    val current: Int? = null,
    val max: Int? = null,
    val repeated: Int? = null,
    val unlocked: Boolean? = null
)