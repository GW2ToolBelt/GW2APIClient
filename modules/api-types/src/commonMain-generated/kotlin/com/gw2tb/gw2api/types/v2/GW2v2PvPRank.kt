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
 * Information about a PvP rank.
 *
 * @param id the PvP rank's ID
 * @param finisherID the rank finisher's ID
 * @param name the rank's localized name
 * @param icon a render service URL for the rank's icon
 * @param minRank the minimum PvP level required for the rank
 * @param maxRank the maximum PvP level for the rank
 * @param levels the rank's levels
 */
@Serializable
public data class GW2v2PvPRank(
    val id: Int,
    @SerialName("finisher_id")
    val finisherID: Int,
    val name: String,
    val icon: String,
    @SerialName("min_rank")
    val minRank: Int,
    @SerialName("max_rank")
    val maxRank: Int,
    val levels: List<Level>
) {

    /**
     * Information about a PvP rank's level.
     *
     * @param minRank the minimum PvP level required for the level
     * @param maxRank the maximum PvP level for the level
     * @param points the amount of PvP experience needed to go from the given minimum rank to maximum rank
     */
    @Serializable
    public data class Level(
        @SerialName("min_rank")
        val minRank: Int,
        @SerialName("max_rank")
        val maxRank: Int,
        val points: Int
    )

}