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

// Generated for type: Mailcarrier

/**
 * Information about a mailcarrier.
 *
 * @param id the mailcarrier's ID
 * @param icon the URL for the mailcarrier's icon
 * @param name the mailcarrier's name
 * @param order a number that can be used to sort the list of mailcarriers
 * @param unlockItems the IDs of the items that can be used to unlock the mailcarrier
 * @param flags additional flags describing the mailcarrier
 */
@Serializable
public data class GW2v2Mailcarrier(
    /** This field holds the mailcarrier's ID. */
    val id: Int,
    /** This field holds the URL for the mailcarrier's icon. */
    val icon: String,
    /** This field holds the mailcarrier's name. */
    val name: String,
    /** This field holds a number that can be used to sort the list of mailcarriers. */
    val order: Int,
    /** This field holds the IDs of the items that can be used to unlock the mailcarrier. */
    @SerialName("unlock_items")
    val unlockItems: List<GW2ItemId>,
    /** This field holds additional flags describing the mailcarrier. */
    val flags: List<String>
)