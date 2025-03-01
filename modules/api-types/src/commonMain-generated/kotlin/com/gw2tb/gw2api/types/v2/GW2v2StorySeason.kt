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

// Generated for type: StorySeason

/**
 * Information about a Story Journal season.
 *
 * @param id the ID of the season
 * @param name the localized name of the season
 * @param order a number that can be used to sort the list of seasons
 * @param stories the IDs of the stories in the season
 */
@Serializable
public data class GW2v2StorySeason(
    /** This field holds the ID of the season. */
    val id: GW2StorySeasonId,
    /** This field holds the localized name of the season. */
    val name: String,
    /** This field holds a number that can be used to sort the list of seasons. */
    val order: Int,
    /** This field holds the IDs of the stories in the season. */
    val stories: List<GW2StoryId>
)