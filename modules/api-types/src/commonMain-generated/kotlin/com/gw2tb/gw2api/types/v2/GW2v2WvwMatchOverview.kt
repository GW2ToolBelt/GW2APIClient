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

// Generated for type: WvwMatchOverview

/**
 * General information about a WvW match.
 *
 * @param id the match's ID
 * @param worlds the IDs of the three primary servers by team color
 * @param allWorlds the IDs of the servers by team color
 * @param startTime the ISO-8601 standard timestamp of when the match's start
 * @param endTime the ISO-8601 standard timestamp of when the match's end
 */
@Serializable
public data class GW2v2WvwMatchOverview(
    /** This field holds the match's ID. */
    val id: String,
    /** This field holds the IDs of the three primary servers by team color. */
    val worlds: Map<String, Int>,
    /** This field holds the IDs of the servers by team color. */
    @SerialName("all_worlds")
    val allWorlds: Map<String, List<Int>>,
    /** This field holds the ISO-8601 standard timestamp of when the match's start. */
    @SerialName("start_time")
    val startTime: String,
    /** This field holds the ISO-8601 standard timestamp of when the match's end. */
    @SerialName("end_time")
    val endTime: String
)