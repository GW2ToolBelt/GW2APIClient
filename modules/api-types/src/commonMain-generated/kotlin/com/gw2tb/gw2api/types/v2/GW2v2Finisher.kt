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

// Generated for type: Finisher

/**
 * Information about a finisher.
 *
 * @param id the finisher's ID
 * @param name the finisher's name
 * @param icon the URL for the finisher's icon
 * @param order a (non-unique) number that can be used as basis to sort the list of finishers
 * @param unlockDetails a description explaining how to acquire the finisher
 * @param unlockItems an array of item IDs used to unlock the finisher
 */
@Serializable
public data class GW2v2Finisher(
    /** This field holds the finisher's ID. */
    val id: Int,
    /** This field holds the finisher's name. */
    val name: String,
    /** This field holds the URL for the finisher's icon. */
    val icon: String,
    /** This field holds a (non-unique) number that can be used as basis to sort the list of finishers. */
    val order: Int,
    /** This field holds a description explaining how to acquire the finisher. */
    @SerialName("unlock_details")
    val unlockDetails: String,
    /** This field holds an array of item IDs used to unlock the finisher. */
    @SerialName("unlock_items")
    val unlockItems: List<GW2ItemId>
)