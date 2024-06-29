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

// Generated for type: PvpStandings

/**
 * Information about an account's PvP standings.
 *
 * @param current the season's current standing
 * @param best the season's best standing
 * @param seasonId the season's ID
 */
@Serializable
public data class GW2v2PvpStandings(
    /** This field holds the season's current standing. */
    val current: Current,
    /** This field holds the season's best standing. */
    val best: Best,
    /** This field holds the season's ID. */
    @SerialName("season_id")
    val seasonId: String
) {

    /**
     * Information about the current standing.
     *
     * @param totalPoints the total number of points
     * @param division the index of the reached division
     * @param tier the index of the reached tier
     * @param points the number of pips towards the next tier
     * @param repeats the number of times the account maxed out the repeat division
     * @param rating the rating level
     * @param decay the decay value
     */
    @Serializable
    public data class Current(
        /** This field holds the total number of points. */
        @SerialName("total_points")
        val totalPoints: Int,
        /** This field holds the index of the reached division. */
        val division: Int,
        /** This field holds the index of the reached tier. */
        val tier: Int,
        /** This field holds the number of pips towards the next tier. */
        val points: Int,
        /** This field holds the number of times the account maxed out the repeat division. */
        val repeats: Int,
        /** This field holds the rating level. */
        val rating: Int? = null,
        /** This field holds the decay value. */
        val decay: Int? = null
    )

    /**
     * Information about the season's best standing.
     *
     * @param totalPoints the total number of points
     * @param division the index of the reached division
     * @param tier the index of the reached tier
     * @param points the number of pips towards the next tier
     * @param repeats the number of times the account maxed out the repeat division
     */
    @Serializable
    public data class Best(
        /** This field holds the total number of points. */
        @SerialName("total_points")
        val totalPoints: Int,
        /** This field holds the index of the reached division. */
        val division: Int,
        /** This field holds the index of the reached tier. */
        val tier: Int,
        /** This field holds the number of pips towards the next tier. */
        val points: Int,
        /** This field holds the number of times the account maxed out the repeat division. */
        val repeats: Int
    )

}