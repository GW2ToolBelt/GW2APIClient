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
 * Information about an account's PvP stats.
 *
 * @param pvPRank the account's PvP rank
 * @param pvPRankPoints the account's PvP rank points
 * @param pvPRankRollovers the number of times the account leveled up after reaching rank 80
 * @param aggregate the aggregated statistics
 * @param professions the stats by profession ID
 * @param ladders the stats by ladder (e.g. "ranked", "unranked")
 */
@Serializable
public data class GW2v2PvPStats(
    @SerialName("pvp_rank")
    val pvPRank: Int,
    @SerialName("pvp_rank_points")
    val pvPRankPoints: Int,
    @SerialName("pvp_rank_rollovers")
    val pvPRankRollovers: Int,
    val aggregate: Stats,
    val professions: Map<String, Stats>,
    val ladders: Map<String, Stats>
) {

    /**
     * Information about category-specific PvP stats.
     *
     * @param wins the amount of wins
     * @param losses the amount of losses
     * @param desertions the amount desertions
     * @param byes the amount of byes
     * @param forfeits the amount of forfeits
     */
    @Serializable
    public data class Stats(
        val wins: Int,
        val losses: Int,
        val desertions: Int,
        val byes: Int,
        val forfeits: Int
    )

}