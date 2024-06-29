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

// Generated for type: Story

/**
 * Information about a Story Journal season.
 *
 * @param id the ID of the story
 * @param season the ID of the story's season
 * @param name the localized name of the story
 * @param description the localized description of the story
 * @param timeline the in-game date of the story
 * @param level the minimum level required to start to begin the story
 * @param order a number that can be used to sort the list of stories
 * @param chapters the story's chapters
 * @param races the races eligible to participate in the story
 * @param flags additional requirements for a character to participate in the story
 */
@Serializable
public data class GW2v2Story(
    /** This field holds the ID of the story. */
    val id: Int,
    /** This field holds the ID of the story's season. */
    val season: String,
    /** This field holds the localized name of the story. */
    val name: String,
    /** This field holds the localized description of the story. */
    val description: String,
    /** This field holds the in-game date of the story. */
    val timeline: String,
    /** This field holds the minimum level required to start to begin the story. */
    val level: Int,
    /** This field holds a number that can be used to sort the list of stories. */
    val order: Int,
    /** This field holds the story's chapters. */
    val chapters: List<Chapter>,
    /** This field holds the races eligible to participate in the story. */
    val races: List<String>? = null,
    /** This field holds additional requirements for a character to participate in the story. */
    val flags: List<String>? = null
) {

    /**
     * Information about a story chapter.
     *
     * @param name the localized name of the chapter
     */
    @Serializable
    public data class Chapter(
        /** This field holds the localized name of the chapter. */
        val name: String
    )

}