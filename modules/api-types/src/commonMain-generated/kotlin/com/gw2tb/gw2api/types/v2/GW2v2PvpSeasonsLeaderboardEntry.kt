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

// Generated for type: PvpSeasonsLeaderboardEntry

/**
 * Information about a leaderboard entry.
 *
 * @param name the account's name
 * @param id the guild's ID
 * @param rank the account's rank
 * @param team the guild team's name
 * @param teamId the guild team's ID
 * @param date the date at which the rank was reached
 * @param scores the entry's scoring values
 */
@Serializable
public data class GW2v2PvpSeasonsLeaderboardEntry(
    /** This field holds the account's name. */
    val name: String? = null,
    /** This field holds the guild's ID. */
    val id: String? = null,
    /** This field holds the account's rank. */
    val rank: Int,
    /** This field holds the guild team's name. */
    val team: String? = null,
    /** This field holds the guild team's ID. */
    @SerialName("team_id")
    val teamId: Int? = null,
    /** This field holds the date at which the rank was reached. */
    val date: String,
    /** This field holds the entry's scoring values. */
    val scores: List<Scoring>
) {

    /**
     * Information about a leaderboard entry's scoring
     *
     * @param id the scoring's ID
     * @param value the scoring's value
     */
    @Serializable
    public data class Scoring(
        /** This field holds the scoring's ID. */
        val id: String,
        /** This field holds the scoring's value. */
        val value: Int
    )

}