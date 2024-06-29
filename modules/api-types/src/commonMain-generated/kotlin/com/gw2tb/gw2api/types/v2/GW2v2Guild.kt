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

// Generated for type: Guild

/**
 * Information about a guild.
 *
 * @param id the guild's ID
 * @param name the guild's name
 * @param tag the guild's tag
 * @param level the guild's level
 * @param motd the guild's message of the day
 * @param influence the guild's current influence
 * @param aetherium the guild's current aetherium
 * @param favor the guild's current favor
 * @param resonance the guild's current resonance
 * @param memberCount the guild's current member count
 * @param memberCapacity the guild's current member capacity
 * @param emblem the guild's emblem
 */
@Serializable
public data class GW2v2Guild(
    /** This field holds the guild's ID. */
    val id: String,
    /** This field holds the guild's name. */
    val name: String,
    /** This field holds the guild's tag. */
    val tag: String,
    /** This field holds the guild's level. */
    val level: Int,
    /** This field holds the guild's message of the day. */
    val motd: String? = null,
    /** This field holds the guild's current influence. */
    val influence: Int? = null,
    /** This field holds the guild's current aetherium. */
    val aetherium: Int? = null,
    /** This field holds the guild's current favor. */
    val favor: Int? = null,
    /** This field holds the guild's current resonance. */
    val resonance: Int? = null,
    /** This field holds the guild's current member count. */
    @SerialName("member_count")
    val memberCount: Int? = null,
    /** This field holds the guild's current member capacity. */
    @SerialName("member_capacity")
    val memberCapacity: Int? = null,
    /** This field holds the guild's emblem. */
    val emblem: Emblem
) {

    /**
     *
     *
     * @param background the emblem's background
     * @param foreground the emblem's foreground
     * @param flags the manipulations applied to the emblem
     */
    @Serializable
    public data class Emblem(
        /** This field holds the emblem's background. */
        val background: Background,
        /** This field holds the emblem's foreground. */
        val foreground: Foreground,
        /** This field holds the manipulations applied to the emblem. */
        val flags: List<String>
    ) {

        /**
         * Information about a guild emblem's background.
         *
         * @param id the background's ID
         * @param colors the background's colors
         */
        @Serializable
        public data class Background(
            /** This field holds the background's ID. */
            val id: Int,
            /** This field holds the background's colors. */
            val colors: List<Int>
        )

        /**
         * Information about a guild emblem's foreground.
         *
         * @param id the foreground's ID
         * @param colors the foreground's colors
         */
        @Serializable
        public data class Foreground(
            /** This field holds the foreground's ID. */
            val id: Int,
            /** This field holds the foreground's colors. */
            val colors: List<Int>
        )

    }

}