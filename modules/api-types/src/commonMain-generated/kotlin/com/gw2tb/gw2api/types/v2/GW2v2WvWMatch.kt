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
 * General information about a WvW match.
 *
 * @param id the match's ID
 * @param startTime the ISO-8601 standard timestamp of when the match's start
 * @param endTime the ISO-8601 standard timestamp of when the match's end
 * @param scores the total scores by team color
 * @param worlds the IDs of the three primary servers by team color
 * @param allWorlds the IDs of the servers by team color
 * @param deaths the total deaths by team color
 * @param kills the total kills by team color
 * @param victoryPoints the victory points by team color
 * @param skirmishes the match's skirmishes
 * @param maps the total scores by map
 */
@Serializable
public data class GW2v2WvWMatch(
    val id: String,
    @SerialName("start_time")
    val startTime: String,
    @SerialName("end_time")
    val endTime: String,
    val scores: Map<String, Int>,
    val worlds: Map<String, Int>,
    @SerialName("all_worlds")
    val allWorlds: Map<String, List<Int>>,
    val deaths: Map<String, Int>,
    val kills: Map<String, Int>,
    @SerialName("victory_points")
    val victoryPoints: Map<String, Int>,
    val skirmishes: List<Skirmish>,
    val maps: List<GameMap>
) {

    /**
     * Information about skirmish scores.
     *
     * @param id the skirmish's ID
     * @param scores the scores by team color
     * @param mapScores the scores by map
     */
    @Serializable
    public data class Skirmish(
        val id: Int,
        val scores: Map<String, Int>,
        @SerialName("map_scores")
        val mapScores: List<MapScores>
    ) {

        /**
         * Map-specific information about scores.
         *
         * @param type the map's type (i.e. "Center", "RedHome", "BlueHome", or "GreenHome")
         * @param scores the scores by team color
         */
        @Serializable
        public data class MapScores(
            val type: String,
            val scores: Map<String, Int>
        )

    }

    /**
     * Map-specific information about scores.
     *
     * @param id the map's ID
     * @param type the map's type (i.e. "Center", "RedHome", "BlueHome", or "GreenHome")
     * @param scores the scores by team color
     * @param deaths the deaths by team color
     * @param kills the kills by team color
     * @param objectives the list of the map's objective
     * @param bonuses the bonuses granted by this map
     */
    @Serializable
    public data class GameMap(
        val id: Int,
        val type: String,
        val scores: Map<String, Int>,
        val deaths: Map<String, Int>,
        val kills: Map<String, Int>,
        val objectives: List<Objective>,
        val bonuses: List<Bonus>
    ) {

        /**
         * Information about a map objective.
         *
         * @param id the objective's ID
         * @param type the objective's type
         * @param owner the objective's owner (i.e. "Red", "Green", "Blue", or "Neutral")
         * @param lastFlipped the ISO-8601 standard timestamp of when the objective was last flipped
         * @param claimedBy the guild ID of the guild that currently has claimed this objective
         * @param claimedAt the ISO-8601 standard timestamp of when the objective was claimed
         * @param pointsTick the amount of points per tick given by the objective
         * @param pointsCapture the amount of points awarded for capturing the objective
         * @param guildUpgrades the IDs of the currently slotted guild upgrades
         * @param yaksDelivered the total number of shipments delivered to the objective
         */
        @Serializable
        public data class Objective(
            val id: String,
            val type: String,
            val owner: String,
            @SerialName("last_flipped")
            val lastFlipped: String,
            @SerialName("claimed_by")
            val claimedBy: String? = null,
            @SerialName("claimed_at")
            val claimedAt: String? = null,
            @SerialName("points_tick")
            val pointsTick: Int,
            @SerialName("points_capture")
            val pointsCapture: Int,
            @SerialName("guild_upgrades")
            val guildUpgrades: List<Int>? = null,
            @SerialName("yaks_delivered")
            val yaksDelivered: Int? = null
        )

        /**
         * Information about a bonus.
         *
         * @param type the type of the bonus
         * @param owner the owner of the bonus (i.e. "Red", "Green", "Blue")
         */
        @Serializable
        public data class Bonus(
            val type: String,
            val owner: String
        )

    }

}