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

// Generated for type: WvwObjective

/**
 * Information about an objective in the World versus World game mode.
 *
 * @param id the ID of the objective
 * @param name the name of the objective
 * @param type the type of the objective
 * @param sectorId the map sector the objective can be found in
 * @param mapId the ID of the map the objective can be found on
 * @param mapType the type of the map the objective can be found on
 * @param coord an array of three numbers representing the X, Y and Z coordinates of the objectives marker on the map
 * @param labelCoord an array of two numbers representing the X and Y coordinates of the sector centroid
 * @param marker the icon link
 * @param chatLink the chat code for the objective
 * @param upgradeId the ID of the upgrades available for the objective
 */
@Serializable
public data class GW2v2WvwObjective(
    /** This field holds the ID of the objective. */
    val id: String,
    /** This field holds the name of the objective. */
    val name: String,
    /** This field holds the type of the objective. */
    val type: String,
    /** This field holds the map sector the objective can be found in. */
    @SerialName("sector_id")
    val sectorId: Int,
    /** This field holds the ID of the map the objective can be found on. */
    @SerialName("map_id")
    val mapId: Int,
    /** This field holds the type of the map the objective can be found on. */
    @SerialName("map_type")
    val mapType: String,
    /** This field holds an array of three numbers representing the X, Y and Z coordinates of the objectives marker on the map. */
    val coord: List<Double>? = null,
    /** This field holds an array of two numbers representing the X and Y coordinates of the sector centroid. */
    @SerialName("label_coord")
    val labelCoord: List<Double>? = null,
    /** This field holds the icon link. */
    val marker: String? = null,
    /** This field holds the chat code for the objective. */
    @SerialName("chat_link")
    val chatLink: String,
    /** This field holds the ID of the upgrades available for the objective. */
    @SerialName("upgrade_id")
    val upgradeId: Int? = null
)