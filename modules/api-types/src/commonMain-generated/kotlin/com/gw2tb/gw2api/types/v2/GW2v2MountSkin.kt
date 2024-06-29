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

// Generated for type: MountSkin

/**
 * Information about a mount skin.
 *
 * @param id the mount skin's ID
 * @param name the mount skin's name
 * @param icon a render service URL for the mount skin's icon
 * @param mount the mount type id for the mount skin
 * @param dyeSlots the mount skin's dye slots
 */
@Serializable
public data class GW2v2MountSkin(
    /** This field holds the mount skin's ID. */
    val id: Int,
    /** This field holds the mount skin's name. */
    val name: String,
    /** This field holds a render service URL for the mount skin's icon. */
    val icon: String,
    /** This field holds the mount type id for the mount skin. */
    val mount: String,
    /** This field holds the mount skin's dye slots. */
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
        val colorId: Int,
        /** This field holds the slot's material. */
        val material: String
    )

}