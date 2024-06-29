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

// Generated for type: BackstoryAnswer

/**
 * Information about a biography answer.
 *
 * @param id the answer's ID
 * @param title the answer's localized title
 * @param description the answer's localized description
 * @param journal the answer's localized journal entry
 * @param question the ID of the biography question the answer answers
 * @param professions the IDs of the professions that the answer is available for
 * @param races the IDs of the races that the answer is available for
 */
@Serializable
public data class GW2v2BackstoryAnswer(
    /** This field holds the answer's ID. */
    val id: String,
    /** This field holds the answer's localized title. */
    val title: String,
    /** This field holds the answer's localized description. */
    val description: String,
    /** This field holds the answer's localized journal entry. */
    val journal: String,
    /** This field holds the ID of the biography question the answer answers. */
    val question: Int,
    /** This field holds the IDs of the professions that the answer is available for. */
    val professions: List<String>? = null,
    /** This field holds the IDs of the races that the answer is available for. */
    val races: List<String>? = null
)