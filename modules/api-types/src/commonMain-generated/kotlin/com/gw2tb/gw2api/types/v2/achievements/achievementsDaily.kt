/*
 * Copyright (c) 2018-2021 Leon Linhart
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

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*

/**
 * Information about daily achievements.
 *
 * @param pve the PvE achievements
 * @param pvp the PvP achievements
 * @param wvw the WvW achievements
 * @param fractals the fractal achievements
 * @param special the special achievements (e.g. festival dailies)
 */
@Serializable
public data class GW2v2AchievementsDaily(
    val pve: List<Achievement>,
    val pvp: List<Achievement>,
    val wvw: List<Achievement>,
    val fractals: List<Achievement>,
    val special: List<Achievement>
) {

    /**
     * Information about a daily achievement.
     *
     * @param id the achievement's ID
     * @param level the level requirement for the daily achievement to appear
     * @param requiredAccess the GW2 campaigns required to see the daily achievement
     */
    @Serializable
    public data class Achievement(
        val id: Int,
        val level: LevelRequirement,
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
            val min: Int,
            val max: Int
        )

    }

}