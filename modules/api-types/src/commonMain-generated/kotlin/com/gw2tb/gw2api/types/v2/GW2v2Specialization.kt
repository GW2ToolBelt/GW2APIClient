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

// Generated for type: Specialization

/**
 * Information about a specialization.
 *
 * @param id the ID of the specialization
 * @param name the localized name of the specialization
 * @param profession the ID of the profession the specialization belongs to
 * @param elite a flag indicating whether the specialization is an elite specialization
 * @param icon a render service URL for the specialization's icon
 * @param background a render service URL for the specialization's background image
 * @param minorTraits a list of all IDs of the specialization's minor traits
 * @param majorTraits a list of all IDs of the specialization's major traits
 * @param weaponTrait the ID of the elite specialization's weapon trait
 * @param professionIcon a render service URL for the elite specialization's icon
 * @param bigProfessionIcon a render service URL for a large variant of the elite specialization's icon
 */
@Serializable
public data class GW2v2Specialization(
    /** This field holds the ID of the specialization. */
    val id: Int,
    /** This field holds the localized name of the specialization. */
    val name: String,
    /** This field holds the ID of the profession the specialization belongs to. */
    val profession: String,
    /** This field holds a flag indicating whether the specialization is an elite specialization. */
    val elite: Boolean,
    /** This field holds a render service URL for the specialization's icon. */
    val icon: String,
    /** This field holds a render service URL for the specialization's background image. */
    val background: String,
    /** This field holds a list of all IDs of the specialization's minor traits. */
    @SerialName("minor_traits")
    val minorTraits: List<Int>,
    /** This field holds a list of all IDs of the specialization's major traits. */
    @SerialName("major_traits")
    val majorTraits: List<Int>,
    /** This field holds the ID of the elite specialization's weapon trait. */
    @SerialName("weapon_trait")
    val weaponTrait: Int? = null,
    /** This field holds a render service URL for the elite specialization's icon. */
    @SerialName("profession_icon")
    val professionIcon: String? = null,
    /** This field holds a render service URL for a large variant of the elite specialization's icon. */
    @SerialName("profession_icon_big")
    val bigProfessionIcon: String? = null
)