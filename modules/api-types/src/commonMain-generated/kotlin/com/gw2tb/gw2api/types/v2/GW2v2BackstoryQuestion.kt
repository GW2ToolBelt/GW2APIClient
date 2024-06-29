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

// Generated for type: BackstoryQuestion

/**
 * Information about a biography question.
 *
 * @param id the question's ID
 * @param title the question's localized title
 * @param description the question's localized description
 * @param answers the IDs of the possible answers to the question
 * @param order a number that can be used to sort the list of questions
 * @param professions the IDs of the professions that the question is presented to
 * @param races the IDs of the races that the question is presented to
 */
@Serializable
public data class GW2v2BackstoryQuestion(
    /** This field holds the question's ID. */
    val id: Int,
    /** This field holds the question's localized title. */
    val title: String,
    /** This field holds the question's localized description. */
    val description: String,
    /** This field holds the IDs of the possible answers to the question. */
    val answers: List<String>,
    /** This field holds a number that can be used to sort the list of questions. */
    val order: Int,
    /** This field holds the IDs of the professions that the question is presented to. */
    val professions: List<String>? = null,
    /** This field holds the IDs of the races that the question is presented to. */
    val races: List<String>? = null
)