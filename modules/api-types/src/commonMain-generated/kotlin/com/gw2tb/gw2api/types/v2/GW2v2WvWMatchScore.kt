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
 * Information about a WvW match scores.
 *
 * @param id the match's ID
 * @param scores the total scores by team color
 * @param victoryPoints the victory points by team color
 * @param skirmishes the match's skirmishes
 * @param maps the total scores by map
 */
@Serializable
public data class GW2v2WvWMatchScore(
    val id: String,
    val scores: Map<String, Int>,
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
        val id: String,
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
     */
    @Serializable
    public data class GameMap(
        val id: String,
        val type: String,
        val scores: Map<String, Int>
    )

}