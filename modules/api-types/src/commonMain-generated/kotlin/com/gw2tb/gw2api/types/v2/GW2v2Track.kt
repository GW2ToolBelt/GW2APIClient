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

import com.gw2tb.gw2api.types.*
import com.gw2tb.gw2api.types.internal.*

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

// Generated for type: Track

@Suppress("ClassName")
private object __GW2v2TrackSerializer : KSerializer<GW2v2Track> {

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("GW2v2Track", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): GW2v2Track = when (val value = decoder.decodeString()) {
        "PvE" -> GW2v2Track.PvE
        "PvP" -> GW2v2Track.PvP
        "WvW" -> GW2v2Track.WvW
        else -> GW2v2Track.Unknown(value)
    }

    override fun serialize(encoder: Encoder, value: GW2v2Track) {
        encoder.encodeString(value.value)
    }

}


/** the objective's track */
@Serializable(with = __GW2v2TrackSerializer::class)
public sealed class GW2v2Track {

    public abstract val value: String

    /** An unknown value. */
    public data class Unknown(override val value: String) : GW2v2Track()

    /** a PvE objective */
    @Serializable
    public data object PvE : GW2v2Track() {
        override val value: String get() = "PvE"
    }

    /** a PvP objective */
    @Serializable
    public data object PvP : GW2v2Track() {
        override val value: String get() = "PvP"
    }

    /** a WvW objective */
    @Serializable
    public data object WvW : GW2v2Track() {
        override val value: String get() = "WvW"
    }

}