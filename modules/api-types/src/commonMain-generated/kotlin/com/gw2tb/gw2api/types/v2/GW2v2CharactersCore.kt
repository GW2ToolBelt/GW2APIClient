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

// Generated for type: CharactersCore

/**
 * General Information about a character.
 *
 * @param name the character's name
 * @param race the ID of the character's race
 * @param gender the character's gender
 * @param profession the ID of the character's profession
 * @param level the character's level
 * @param guild the ID of the character's represented guild
 * @param age the amount of seconds the character was played
 * @param created the ISO-8601 standard timestamp of when the character was created
 * @param lastModified the ISO-8601 standard timestamp of when the API record of the character was last modified
 * @param deaths the amount of times the character has been defeated
 * @param title the ID of the character's selected title
 */
@Serializable
public data class GW2v2CharactersCore(
    /** This field holds the character's name. */
    val name: String,
    /** This field holds the ID of the character's race. */
    val race: String,
    /** This field holds the character's gender. */
    val gender: String,
    /** This field holds the ID of the character's profession. */
    val profession: String,
    /** This field holds the character's level. */
    val level: Int,
    /** This field holds the ID of the character's represented guild. */
    val guild: String? = null,
    /** This field holds the amount of seconds the character was played. */
    val age: Int,
    /** This field holds the ISO-8601 standard timestamp of when the character was created. */
    val created: String,
    /** This field holds the ISO-8601 standard timestamp of when the API record of the character was last modified. */
    @SerialName("last_modified")
    val lastModified: String,
    /** This field holds the amount of times the character has been defeated. */
    val deaths: Int,
    /** This field holds the ID of the character's selected title. */
    val title: Int? = null
)