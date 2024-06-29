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

// Generated for type: DailyAchievement

/**
 * Information about a daily achievement.
 *
 * @param id the achievement's ID
 * @param level the level requirement for the daily achievement to appear
 * @param requiredAccess the GW2 campaigns required to see the daily achievement
 */
@Serializable
public data class GW2v2DailyAchievement(
    /** This field holds the achievement's ID. */
    val id: GW2AchievementId,
    /** This field holds the level requirement for the daily achievement to appear. */
    val level: LevelRequirement,
    /** This field holds the GW2 campaigns required to see the daily achievement. */
    @SerialName("required_access")
    val requiredAccess: List<String>
) {

    /**
     * Information about the level requirement of a daily achievement.
     *
     * @param min the minimum level for a character to the daily achievement
     * @param max the maximum level for a character to the daily achievement
     */
    @Serializable
    public data class LevelRequirement(
        /** This field holds the minimum level for a character to the daily achievement. */
        val min: Int,
        /** This field holds the maximum level for a character to the daily achievement. */
        val max: Int
    )

}