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

// Generated for type: Mastery

/**
 * Information about a mastery.
 *
 * @param id the mastery's ID
 * @param name the mastery's name
 * @param requirement the written out requirement to unlock the mastery track
 * @param order the order in which the mastery track appears in a list
 * @param background the URL for the mastery track's background graphic
 * @param region the mastery region the track belongs to
 * @param levels information about each mastery level
 */
@Serializable
public data class GW2v2Mastery(
    /** This field holds the mastery's ID. */
    val id: Int,
    /** This field holds the mastery's name. */
    val name: String,
    /** This field holds the written out requirement to unlock the mastery track. */
    val requirement: String,
    /** This field holds the order in which the mastery track appears in a list. */
    val order: Int,
    /** This field holds the URL for the mastery track's background graphic. */
    val background: String,
    /** This field holds the mastery region the track belongs to. */
    val region: String,
    /** This field holds information about each mastery level. */
    val levels: List<Level>
) {

    /**
     * Information about a mastery level.
     *
     * @param name the mastery level's name
     * @param description the mastery level's description
     * @param instruction the in-game instruction for the mastery level
     * @param icon the URL for the mastery level's icon
     * @param pointCost the amount of mastery points required to unlock the level
     * @param expCost the amount of experience required to unlock the level
     */
    @Serializable
    public data class Level(
        /** This field holds the mastery level's name. */
        val name: String,
        /** This field holds the mastery level's description. */
        val description: String,
        /** This field holds the in-game instruction for the mastery level. */
        val instruction: String,
        /** This field holds the URL for the mastery level's icon. */
        val icon: String,
        /** This field holds the amount of mastery points required to unlock the level. */
        @SerialName("point_cost")
        val pointCost: Int,
        /** This field holds the amount of experience required to unlock the level. */
        @SerialName("exp_cost")
        val expCost: Int
    )

}