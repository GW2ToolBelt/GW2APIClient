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
public data class GW2v2PvPHero(
    val id: String,
    val name: String,
    val description: String,
    val type: String,
    val stats: Stats,
    val overlay: String,
    val underlay: String,
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
        val offense: Int,
        val defense: Int,
        val speed: Int
    )

    /**
     * Information about a PvP hero's skin.
     *
     * @param id the PvP hero skin's ID
     * @param name the hero skin's localized name
     * @param icon a render service URL for the skin's icon
     * @param default whether or not the skin is the champion's default skin
     * @param unlockItems an array of item IDs used to unlock the skin
     */
    @Serializable
    public data class Skin(
        val id: Int,
        val name: String,
        val icon: String,
        val default: Boolean,
        @SerialName("unlock_items")
        val unlockItems: List<Int>
    )

}