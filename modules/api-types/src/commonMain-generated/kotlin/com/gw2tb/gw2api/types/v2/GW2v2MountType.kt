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

// Generated for type: MountType

/**
 * Information about a mount type.
 *
 * @param id the mount type's ID
 * @param name the mount type's name
 * @param defaultSkin the ID of the mount type's default skin
 * @param skins the IDs of the skins available for the mount type
 * @param skills the mount type's skills
 */
@Serializable
public data class GW2v2MountType(
    /** This field holds the mount type's ID. */
    val id: String,
    /** This field holds the mount type's name. */
    val name: String,
    /** This field holds the ID of the mount type's default skin. */
    @SerialName("default_skin")
    val defaultSkin: Int,
    /** This field holds the IDs of the skins available for the mount type. */
    val skins: List<Int>,
    /** This field holds the mount type's skills. */
    val skills: List<Skill>
) {

    /**
     * Information about a mount skill.
     *
     * @param id the mount skill's ID
     * @param slot the mount skill's slot
     */
    @Serializable
    public data class Skill(
        /** This field holds the mount skill's ID. */
        val id: Int,
        /** This field holds the mount skill's slot. */
        val slot: String
    )

}