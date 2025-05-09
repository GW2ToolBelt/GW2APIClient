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

// Generated for type: Skiff

/**
 * Information about a skiff skin.
 *
 * @param id the skin's ID
 * @param name the skin's name
 * @param icon a render service URL for the skin's icon
 * @param dyeSlots the skin's dye slots
 */
@Serializable
public data class GW2v2Skiff(
    /** This field holds the skin's ID. */
    val id: GW2SkiffId,
    /** This field holds the skin's name. */
    val name: String,
    /** This field holds a render service URL for the skin's icon. */
    val icon: String,
    /** This field holds the skin's dye slots. */
    @SerialName("dye_slots")
    val dyeSlots: List<DyeSlot>
) {

    /**
     * Information about a dye slot.
     *
     * @param colorId the ID of the color
     * @param material the slot's material
     */
    @Serializable
    public data class DyeSlot(
        /** This field holds the ID of the color. */
        @SerialName("color_id")
        val colorId: GW2ColorId,
        /** This field holds the slot's material. */
        val material: String
    )

}