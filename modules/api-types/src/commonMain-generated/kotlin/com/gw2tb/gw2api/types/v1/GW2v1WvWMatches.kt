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
 * Information about WvW matches.
 *
 * @param wvWMatches the matches
 */
@Serializable
public data class GW2v1WvWMatches(
    @SerialName("wvw_matches")
    val wvWMatches: List<WvWMatch>
) {

    /**
     * Information about a WvW match.
     *
     * @param wvWMatchID the match's ID
     * @param redWorldID the ID of the red team's primary server
     * @param blueWorldID the ID of the blue team's primary server
     * @param greenWorldID the ID of the green team's primary server
     * @param startTime the ISO-8601 standard timestamp of when the match's start
     * @param endTime the ISO-8601 standard timestamp of when the match's end
     */
    @Serializable
    public data class WvWMatch(
        @SerialName("wvw_match_id")
        val wvWMatchID: String,
        @SerialName("red_world_id")
        val redWorldID: Int,
        @SerialName("blue_world_id")
        val blueWorldID: Int,
        @SerialName("green_world_id")
        val greenWorldID: Int,
        @SerialName("start_time")
        val startTime: String,
        @SerialName("end_time")
        val endTime: String
    )

}