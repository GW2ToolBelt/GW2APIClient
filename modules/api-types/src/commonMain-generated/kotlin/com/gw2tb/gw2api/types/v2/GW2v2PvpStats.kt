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

// Generated for type: PvpStats

/**
 * Information about an account's PvP stats.
 *
 * @param pvpRank the account's PvP rank
 * @param pvpRankPoints the account's PvP rank points
 * @param pvpRankRollovers the number of times the account leveled up after reaching rank 80
 * @param aggregate the aggregated statistics
 * @param professions the stats by profession ID
 * @param ladders the stats by ladder (e.g. "ranked", "unranked")
 */
@Serializable
public data class GW2v2PvpStats(
    /** This field holds the account's PvP rank. */
    @SerialName("pvp_rank")
    val pvpRank: Int,
    /** This field holds the account's PvP rank points. */
    @SerialName("pvp_rank_points")
    val pvpRankPoints: Int,
    /** This field holds the number of times the account leveled up after reaching rank 80. */
    @SerialName("pvp_rank_rollovers")
    val pvpRankRollovers: Int,
    /** This field holds the aggregated statistics. */
    val aggregate: Stats,
    /** This field holds the stats by profession ID. */
    val professions: Map<String, Stats>,
    /** This field holds the stats by ladder (e.g. "ranked", "unranked"). */
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
        /** This field holds the amount of wins. */
        val wins: Int,
        /** This field holds the amount of losses. */
        val losses: Int,
        /** This field holds the amount desertions. */
        val desertions: Int,
        /** This field holds the amount of byes. */
        val byes: Int,
        /** This field holds the amount of forfeits. */
        val forfeits: Int
    )

}