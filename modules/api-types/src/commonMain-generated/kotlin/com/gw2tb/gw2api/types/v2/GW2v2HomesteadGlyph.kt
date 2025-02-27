/*
 * Copyright (c) 2018-2025 Leon Linhart
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

// Generated for type: HomesteadGlyph

/**
 * Information about a glyph that can be stored in a homestead.
 *
 * @param id the glyph's ID
 * @param itemId the ID of the glyph item
 * @param slot the slot the glyph can be stored in
 */
@Serializable
public data class GW2v2HomesteadGlyph(
    /** This field holds the glyph's ID. */
    val id: GW2HomesteadGlyphId,
    /** This field holds the ID of the glyph item. */
    @SerialName("item_id")
    val itemId: GW2ItemId,
    /** This field holds the slot the glyph can be stored in. */
    val slot: Slot
) {

    @Suppress("ClassName")
    private object __SlotSerializer : KSerializer<Slot> {

        override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("Slot", PrimitiveKind.STRING)

        override fun deserialize(decoder: Decoder): Slot = when (val value = decoder.decodeString()) {
            "harvesting" -> Slot.Harvesting
            "logging" -> Slot.Logging
            "mining" -> Slot.Mining
            else -> Slot.Unknown(value)
        }

        override fun serialize(encoder: Encoder, value: Slot) {
            encoder.encodeString(value.value)
        }

    }


    /** the type of slot */
    @Serializable(with = __SlotSerializer::class)
    public sealed class Slot {

        public abstract val value: String

        /** An unknown value. */
        public data class Unknown(override val value: String) : Slot()

        /** the harvesting slot */
        @Serializable
        public data object Harvesting : Slot() {
            override val value: String get() = "harvesting"
        }

        /** the logging slot */
        @Serializable
        public data object Logging : Slot() {
            override val value: String get() = "logging"
        }

        /** the mining slot */
        @Serializable
        public data object Mining : Slot() {
            override val value: String get() = "mining"
        }

    }

}