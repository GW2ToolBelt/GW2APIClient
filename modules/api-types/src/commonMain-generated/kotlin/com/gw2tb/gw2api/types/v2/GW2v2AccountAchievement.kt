/*
 * Copyright (c) 2018-2024 Leon Linhart
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
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package com.gw2tb.gw2api.types.v2

import com.gw2tb.gw2api.types.*
import com.gw2tb.gw2api.types.internal.*

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

// Generated for type: AccountAchievement

/**
 * Information about a player's progress towards an achievement.
 *
 * @param id the achievement's ID
 * @param done a flag indicating whether the account has completed the achievement
 * @param bits an array of numbers (whose exact meaning differs) giving information about the progress towards an achievement
 * @param current the account's current progress towards the achievement
 * @param max the amount of progress required to complete the achievement
 * @param repeated the number of times the achievement has been completed (if the achievement is repeatable)
 * @param unlocked a flag indicating whether the achievement is unlocked (if the achievement can be unlocked)
 */
@Serializable
public data class GW2v2AccountAchievement(
    /** This field holds the achievement's ID. */
    val id: GW2AchievementId,
    /** This field holds a flag indicating whether the account has completed the achievement. */
    val done: Boolean,
    /** This field holds an array of numbers (whose exact meaning differs) giving information about the progress towards an achievement. */
    val bits: List<Int>? = null,
    /** This field holds the account's current progress towards the achievement. */
    val current: Int? = null,
    /** This field holds the amount of progress required to complete the achievement. */
    val max: Int? = null,
    /** This field holds the number of times the achievement has been completed (if the achievement is repeatable). */
    val repeated: Int? = null,
    /** This field holds a flag indicating whether the achievement is unlocked (if the achievement can be unlocked). */
    val unlocked: Boolean? = null
)