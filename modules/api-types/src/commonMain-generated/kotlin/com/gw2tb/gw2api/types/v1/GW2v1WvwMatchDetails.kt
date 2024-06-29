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
package com.gw2tb.gw2api.types.v1

import com.gw2tb.gw2api.types.*
import com.gw2tb.gw2api.types.internal.*

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

// Generated for type: WvwMatchDetails

/**
 * Information about a WvW match.
 *
 * @param matchId the match's ID
 * @param scores the total scores
 * @param maps the map information
 */
@Serializable
public data class GW2v1WvwMatchDetails(
    /** This field holds the match's ID. */
    @SerialName("match_id")
    val matchId: GW2WvwMatchId,
    /** This field holds the total scores. */
    val scores: List<Int>,
    /** This field holds the map information. */
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
        /** This field holds the map's type (i.e. "Center", "RedHome", "BlueHome", or "GreenHome"). */
        val type: String,
        /** This field holds the scores. */
        val scores: List<Int>,
        /** This field holds the map's objectives. */
        val objectives: List<Objective>,
        /** This field holds the bonuses granted by this map. */
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
            /** This field holds the objective's ID. */
            val id: Int,
            /** This field holds the objective's owner (i.e. "Red", "Green", "Blue", or "Neutral"). */
            val owner: String,
            /** This field holds the guild ID of the guild that currently has claimed this objective. */
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
            /** This field holds the type of the bonus. */
            val type: String,
            /** This field holds the owner of the bonus (i.e. "Red", "Green", "Blue"). */
            val owner: String
        )

    }

}