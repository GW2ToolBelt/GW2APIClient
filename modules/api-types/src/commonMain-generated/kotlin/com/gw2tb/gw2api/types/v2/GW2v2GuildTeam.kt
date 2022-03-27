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
 * Information about a guild's PvP team.
 *
 * @param id the team's ID (only unique within the guild)
 * @param members the team's members
 * @param name the team's name
 * @param aggregate the aggregated statistics
 * @param ladders the stats by ladder (e.g. "ranked", "unranked")
 * @param games the team's recent PvP games
 * @param seasons the team's season-specific stats
 */
@Serializable
public data class GW2v2GuildTeam(
    val id: Int,
    val members: List<Member>,
    val name: String,
    val aggregate: Stats,
    val ladders: Map<String, Stats>,
    val games: List<PvPGame>,
    val seasons: List<SeasonStats>
) {

    /**
     * Information about a team member.
     *
     * @param name the member's account name
     * @param role the member's role (i.e. "Captain" or "Member")
     */
    @Serializable
    public data class Member(
        val name: String,
        val role: String
    )

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

    /**
     * Information about a team's PvP game.
     *
     * @param id the game's ID
     * @param mapID the map's ID
     * @param started the ISO-8601 standard timestamp of when the game started
     * @param ended the ISO-8601 standard timestamp of when the game ended
     * @param result the game's result for the team ("Victory" or "Defeat")
     * @param team the team's color ("Blue" or "Red")
     * @param ratingType the type of rating of the game
     * @param ratingChange the change in rating for the team
     * @param season the ID of the game's PvP season
     * @param scores the game's final scores
     */
    @Serializable
    public data class PvPGame(
        val id: String,
        @SerialName("map_id")
        val mapID: Int,
        val started: String,
        val ended: String,
        val result: String,
        val team: String,
        @SerialName("rating_type")
        val ratingType: String,
        @SerialName("rating_change")
        val ratingChange: Int? = null,
        val season: String? = null,
        val scores: Scores
    ) {

        /**
         * Information about a PvP game's scores.
         *
         * @param red the red team's score
         * @param blue the blue team's score
         */
        @Serializable
        public data class Scores(
            val red: Int,
            val blue: Int
        )

    }

    /**
     * Information about a team's PvP season.
     *
     * @param id the season's ID
     * @param wins the amount of wins
     * @param losses the amount of losses
     * @param rating the team's rating
     */
    @Serializable
    public data class SeasonStats(
        val id: String,
        val wins: Int,
        val losses: Int,
        val rating: Int
    )

}