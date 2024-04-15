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

import com.gw2tb.gw2api.types.*
import com.gw2tb.gw2api.types.internal.*

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

// Generated for type: AchievementCategory

/**
 * Information about an achievement category.
 *
 * @param id the achievement category's ID
 * @param icon the URL for the achievement category's icon
 * @param name the achievement category's localized name
 * @param description the achievement category's localized description
 * @param order a number that can be used to sort the list of categories
 * @param achievements an array containing the IDs of the achievements that this category contains
 */
@Serializable
public data class GW2v2AchievementCategory(
    /** This field holds the achievement category's ID. */
    val id: GW2AchievementCategoryId,
    /** This field holds the URL for the achievement category's icon. */
    val icon: String,
    /** This field holds the achievement category's localized name. */
    val name: String,
    /** This field holds the achievement category's localized description. */
    val description: String,
    /** This field holds a number that can be used to sort the list of categories. */
    val order: Int,
    /** This field holds an array containing the IDs of the achievements that this category contains. */
    val achievements: List<GW2AchievementId>
)