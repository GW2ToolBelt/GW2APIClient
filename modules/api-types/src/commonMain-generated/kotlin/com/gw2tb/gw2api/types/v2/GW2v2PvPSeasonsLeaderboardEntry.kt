/*
 * Copyright (c) 2018-2022 Leon Linhart
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
 * Information about a leaderboard entry.
 *
 * @param name the account's name
 * @param id the guild's ID
 * @param rank the account's rank
 * @param team the guild team's name
 * @param teamID the guild team's ID
 * @param date the date at which the rank was reached
 * @param scores the entry's scoring values
 */
@Serializable
public data class GW2v2PvPSeasonsLeaderboardEntry(
    val name: String? = null,
    val id: String? = null,
    val rank: Int,
    val team: String? = null,
    @SerialName("team_id")
    val teamID: Int? = null,
    val date: String,
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
        val id: String,
        val value: Int
    )

}