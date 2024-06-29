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

// Generated for type: CharactersSAB

/**
 * Information about a character's Super Adventure Box (SAB) progression.
 *
 * @param zones the character's completed zones
 * @param unlocks the character's unlocked unlocks
 * @param songs the character's unlocked songs
 */
@Serializable
public data class GW2v2CharactersSAB(
    /** This field holds the character's completed zones. */
    val zones: List<Zone>,
    /** This field holds the character's unlocked unlocks. */
    val unlocks: List<Unlock>,
    /** This field holds the character's unlocked songs. */
    val songs: List<Song>
) {

    /**
     * Information about a zone completed by a character.
     *
     * @param id the zone's ID
     * @param mode the mode used when completing this zone
     * @param world the world this zone is in
     * @param zone the zone's number
     */
    @Serializable
    public data class Zone(
        /** This field holds the zone's ID. */
        val id: Int,
        /** This field holds the mode used when completing this zone. */
        val mode: String,
        /** This field holds the world this zone is in. */
        val world: Int,
        /** This field holds the zone's number. */
        val zone: Int
    )

    /**
     * Information about an unlock unlocked by a character.
     *
     * @param id the unlock's ID
     * @param name an unlocalized name describing the unlock
     */
    @Serializable
    public data class Unlock(
        /** This field holds the unlock's ID. */
        val id: Int,
        /** This field holds an unlocalized name describing the unlock. */
        val name: String? = null
    )

    /**
     * Information about a song unlocked by a character.
     *
     * @param id the song's ID
     * @param name an unlocalized name describing the song
     */
    @Serializable
    public data class Song(
        /** This field holds the song's ID. */
        val id: Int,
        /** This field holds an unlocalized name describing the song. */
        val name: String? = null
    )

}