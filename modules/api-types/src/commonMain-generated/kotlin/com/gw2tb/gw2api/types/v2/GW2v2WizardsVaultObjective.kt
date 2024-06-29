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

// Generated for type: WizardsVaultObjective

/**
 * Information about a Wizard's Vault's objective.
 *
 * @param id the objective's ID
 * @param title the objective's title
 * @param track the objective's track
 * @param acclaim the amount of Astral Acclaim the player receives for completing the objective
 */
@Serializable
public data class GW2v2WizardsVaultObjective(
    /** This field holds the objective's ID. */
    val id: Int,
    /** This field holds the objective's title. */
    val title: String,
    /** This field holds the objective's track. */
    val track: Track,
    /** This field holds the amount of Astral Acclaim the player receives for completing the objective. */
    val acclaim: Int
) {

    @Suppress("ClassName")
    private object __TrackSerializer : KSerializer<Track> {

        override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("Track", PrimitiveKind.STRING)

        override fun deserialize(decoder: Decoder): Track = when (val value = decoder.decodeString()) {
            "PvE" -> Track.PvE
            "PvP" -> Track.PvP
            "WvW" -> Track.WvW
            else -> Track.Unknown(value)
        }

        override fun serialize(encoder: Encoder, value: Track) {
            encoder.encodeString(value.value)
        }

    }


    /** the objective's track */
    @Serializable(with = __TrackSerializer::class)
    public sealed class Track {

        public abstract val value: String

        /** An unknown value. */
        public data class Unknown(override val value: String) : Track()

        /** a PvE objective */
        @Serializable
        public data object PvE : Track() {
            override val value: String get() = "PvE"
        }

        /** a PvP objective */
        @Serializable
        public data object PvP : Track() {
            override val value: String get() = "PvP"
        }

        /** a WvW objective */
        @Serializable
        public data object WvW : Track() {
            override val value: String get() = "WvW"
        }

    }

}