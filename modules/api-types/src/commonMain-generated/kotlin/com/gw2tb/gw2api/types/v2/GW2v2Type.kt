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

// Generated for type: Type

@Suppress("ClassName")
private object __GW2v2TypeSerializer : KSerializer<GW2v2Type> {

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("GW2v2Type", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): GW2v2Type = when (val value = decoder.decodeString()) {
        "Featured" -> GW2v2Type.Featured
        "Normal" -> GW2v2Type.Normal
        "Legacy" -> GW2v2Type.Legacy
        else -> GW2v2Type.Unknown(value)
    }

    override fun serialize(encoder: Encoder, value: GW2v2Type) {
        encoder.encodeString(value.value)
    }

}


/** the type of the listing */
@Serializable(with = __GW2v2TypeSerializer::class)
public sealed class GW2v2Type {

    public abstract val value: String

    /** An unknown value. */
    public data class Unknown(override val value: String) : GW2v2Type()

    /** a featured listing */
    @Serializable
    public data object Featured : GW2v2Type() {
        override val value: String get() = "Featured"
    }

    /** a normal listing in the current rewards tab */
    @Serializable
    public data object Normal : GW2v2Type() {
        override val value: String get() = "Normal"
    }

    /** a normal listing in the legacy rewards tab */
    @Serializable
    public data object Legacy : GW2v2Type() {
        override val value: String get() = "Legacy"
    }

}