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

// Generated for type: WvwAbility

/**
 * Information about an ability in the World versus World game mode.
 *
 * @param id the ID of the ability
 * @param name the ability's localized name
 * @param description the ability's localized description
 * @param icon a render service URL for the ability's icon
 * @param ranks the ability's ranks
 */
@Serializable
public data class GW2v2WvwAbility(
    /** This field holds the ID of the ability. */
    val id: Int,
    /** This field holds the ability's localized name. */
    val name: String,
    /** This field holds the ability's localized description. */
    val description: String,
    /** This field holds a render service URL for the ability's icon. */
    val icon: String,
    /** This field holds the ability's ranks. */
    val ranks: List<Rank>
) {

    /**
     * Information about an ability's rank.
     *
     * @param cost the WvW experience points required to unlock the rank
     * @param effect the rank's localized effect
     */
    @Serializable
    public data class Rank(
        /** This field holds the WvW experience points required to unlock the rank. */
        val cost: Int,
        /** This field holds the rank's localized effect. */
        val effect: String
    )

}