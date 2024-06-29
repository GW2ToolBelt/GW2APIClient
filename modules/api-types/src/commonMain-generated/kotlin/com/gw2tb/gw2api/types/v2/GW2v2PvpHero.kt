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

// Generated for type: PvpHero

/**
 * Information about a PvP hero.
 *
 * @param id the PvP hero's ID
 * @param name the hero's localized name
 * @param description the hero's localized description
 * @param type the flavor type describing the hero
 * @param stats the hero's stats
 * @param overlay the render service URL for the hero's overlay art
 * @param underlay the render service URL for the hero's underlay art
 * @param skins the hero's skins
 */
@Serializable
public data class GW2v2PvpHero(
    /** This field holds the PvP hero's ID. */
    val id: String,
    /** This field holds the hero's localized name. */
    val name: String,
    /** This field holds the hero's localized description. */
    val description: String,
    /** This field holds the flavor type describing the hero. */
    val type: String,
    /** This field holds the hero's stats. */
    val stats: Stats,
    /** This field holds the render service URL for the hero's overlay art. */
    val overlay: String,
    /** This field holds the render service URL for the hero's underlay art. */
    val underlay: String,
    /** This field holds the hero's skins. */
    val skins: List<Skin>
) {

    /**
     * Information about a hero's stats.
     *
     * @param offense the offense stat
     * @param defense the defense stat
     * @param speed the speed stat
     */
    @Serializable
    public data class Stats(
        /** This field holds the offense stat. */
        val offense: Int,
        /** This field holds the defense stat. */
        val defense: Int,
        /** This field holds the speed stat. */
        val speed: Int
    )

    /**
     * Information about a PvP hero's skin.
     *
     * @param id the PvP hero skin's ID
     * @param name the hero skin's localized name
     * @param icon a render service URL for the skin's icon
     * @param default whether the skin is the champion's default skin
     * @param unlockItems an array of item IDs used to unlock the skin
     */
    @Serializable
    public data class Skin(
        /** This field holds the PvP hero skin's ID. */
        val id: Int,
        /** This field holds the hero skin's localized name. */
        val name: String,
        /** This field holds a render service URL for the skin's icon. */
        val icon: String,
        /** This field holds whether the skin is the champion's default skin. */
        val default: Boolean,
        /** This field holds an array of item IDs used to unlock the skin. */
        @SerialName("unlock_items")
        val unlockItems: List<GW2ItemId>
    )

}