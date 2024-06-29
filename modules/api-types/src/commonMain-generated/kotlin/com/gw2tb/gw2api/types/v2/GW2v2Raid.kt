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

// Generated for type: Raid

/**
 * Information about a raid.
 *
 * @param id the raid's ID
 * @param wings the raid's wings
 */
@Serializable
public data class GW2v2Raid(
    /** This field holds the raid's ID. */
    val id: String,
    /** This field holds the raid's wings. */
    val wings: List<Wing>
) {

    /**
     * Information about a wing.
     *
     * @param id the wing's ID
     * @param events the wing's events
     */
    @Serializable
    public data class Wing(
        /** This field holds the wing's ID. */
        val id: String,
        /** This field holds the wing's events. */
        val events: List<Event>
    ) {

        /**
         * Information about an event.
         *
         * @param id the event's ID
         * @param type the event's type
         */
        @Serializable
        public data class Event(
            /** This field holds the event's ID. */
            val id: String,
            /** This field holds the event's type. */
            val type: String
        )

    }

}