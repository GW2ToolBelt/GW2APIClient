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
package com.gw2tb.gw2api.types.v1

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*

/**
 * Information about a WvW match.
 *
 * @param matchID the match's ID
 * @param scores the total scores
 * @param maps the map information
 */
@Serializable
public data class GW2v1WvWMatchDetails(
    @SerialName("match_id")
    val matchID: String,
    val scores: List<Int>,
    val maps: List<GameMap>
) {

    /**
     * Map-specific information about scores.
     *
     * @param type the map's type (i.e. "Center", "RedHome", "BlueHome", or "GreenHome")
     * @param scores the scores
     * @param objectives the map's objectives
     * @param bonuses the bonuses granted by this map
     */
    @Serializable
    public data class GameMap(
        val type: String,
        val scores: List<Int>,
        val objectives: List<Objective>,
        val bonuses: List<Bonus>
    ) {

        /**
         * Information about an objective.
         *
         * @param id the objective's ID
         * @param owner the objective's owner (i.e. "Red", "Green", "Blue", or "Neutral")
         * @param ownerGuild the guild ID of the guild that currently has claimed this objective
         */
        @Serializable
        public data class Objective(
            val id: Int,
            val owner: String,
            @SerialName("owner_guild")
            val ownerGuild: String? = null
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