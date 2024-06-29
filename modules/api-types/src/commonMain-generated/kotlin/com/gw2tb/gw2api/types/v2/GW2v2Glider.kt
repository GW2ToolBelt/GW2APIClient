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

// Generated for type: Glider

/**
 * Information about a glider.
 *
 * @param id the glider's ID
 * @param name the glider's name
 * @param description the glider's description
 * @param icon the URL for the glider's icon
 * @param order a (non-unique) number that can be used as basis to sort the list of gliders
 * @param defaultDyes the IDs of the dyes that are applied to the glider by default
 * @param unlockItems an array of item IDs used to unlock the glider
 */
@Serializable
public data class GW2v2Glider(
    /** This field holds the glider's ID. */
    val id: Int,
    /** This field holds the glider's name. */
    val name: String,
    /** This field holds the glider's description. */
    val description: String,
    /** This field holds the URL for the glider's icon. */
    val icon: String,
    /** This field holds a (non-unique) number that can be used as basis to sort the list of gliders. */
    val order: Int,
    /** This field holds the IDs of the dyes that are applied to the glider by default. */
    @SerialName("default_dyes")
    val defaultDyes: List<Int>,
    /** This field holds an array of item IDs used to unlock the glider. */
    @SerialName("unlock_items")
    val unlockItems: List<GW2ItemId>
)