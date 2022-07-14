/*
 * Copyright (c) 2018-2022 Leon Linhart
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

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*

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
    val id: Int,
    val season: String,
    val name: String,
    val description: String,
    val timeline: String,
    val level: Int,
    val order: Int,
    val chapters: List<Chapter>,
    val races: List<String>? = null,
    val flags: List<String>? = null
) {

    /**
     * Information about a story chapter.
     *
     * @param name the localized name of the chapter
     */
    @Serializable
    public data class Chapter(
        val name: String
    )

}