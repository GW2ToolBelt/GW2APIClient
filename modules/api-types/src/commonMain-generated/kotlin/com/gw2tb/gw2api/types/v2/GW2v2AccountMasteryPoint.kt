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

// Generated for type: AccountMasteryPoint

/**
 * Information about a player's unlocked mastery points for a region.
 *
 * @param totals information about the total mastery points for a region
 * @param unlocked the list of IDs of unlocked mastery points
 */
@Serializable
public data class GW2v2AccountMasteryPoint(
    /** This field holds information about the total mastery points for a region. */
    val totals: List<Total>,
    /** This field holds the list of IDs of unlocked mastery points. */
    val unlocked: List<Int>
) {

    /**
     * Information about the mastery points for a region.
     *
     * @param region the mastery region
     * @param spent the amount of mastery points of this region spent in mastery tracks
     * @param earned the amount of mastery points of this region earned for the account
     */
    @Serializable
    public data class Total(
        /** This field holds the mastery region. */
        val region: String,
        /** This field holds the amount of mastery points of this region spent in mastery tracks. */
        val spent: Int,
        /** This field holds the amount of mastery points of this region earned for the account. */
        val earned: Int
    )

}