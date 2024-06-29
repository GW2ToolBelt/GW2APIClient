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

// Generated for type: WvwMatchScore

/**
 * Information about a WvW match scores.
 *
 * @param id the match's ID
 * @param scores the total scores by team color
 * @param victoryPoints the victory points by team color
 * @param skirmishes the match's skirmishes
 * @param maps the total scores by map
 */
@Serializable
public data class GW2v2WvwMatchScore(
    /** This field holds the match's ID. */
    val id: String,
    /** This field holds the total scores by team color. */
    val scores: Map<String, Int>,
    /** This field holds the victory points by team color. */
    @SerialName("victory_points")
    val victoryPoints: Map<String, Int>,
    /** This field holds the match's skirmishes. */
    val skirmishes: List<Skirmish>,
    /** This field holds the total scores by map. */
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
        /** This field holds the skirmish's ID. */
        val id: Int,
        /** This field holds the scores by team color. */
        val scores: Map<String, Int>,
        /** This field holds the scores by map. */
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
            /** This field holds the map's type (i.e. "Center", "RedHome", "BlueHome", or "GreenHome"). */
            val type: String,
            /** This field holds the scores by team color. */
            val scores: Map<String, Int>
        )

    }

    /**
     * Map-specific information about scores.
     *
     * @param id the map's ID
     * @param type the map's type (i.e. "Center", "RedHome", "BlueHome", or "GreenHome")
     * @param scores the scores by team color
     */
    @Serializable
    public data class GameMap(
        /** This field holds the map's ID. */
        val id: Int,
        /** This field holds the map's type (i.e. "Center", "RedHome", "BlueHome", or "GreenHome"). */
        val type: String,
        /** This field holds the scores by team color. */
        val scores: Map<String, Int>
    )

}