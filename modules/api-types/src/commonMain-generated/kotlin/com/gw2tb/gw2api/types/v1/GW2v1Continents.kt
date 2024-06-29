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
package com.gw2tb.gw2api.types.v1

import com.gw2tb.gw2api.types.*
import com.gw2tb.gw2api.types.internal.*

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

// Generated for type: Continents

/**
 * Information about continents.
 *
 * @param continents the continents
 */
@Serializable
public data class GW2v1Continents(
    /** This field holds the continents. */
    val continents: Map<GW2ContinentId, Continent>
) {

    /**
     * Information about a continent.
     *
     * @param name the continent's localized name
     * @param continentDims the width and height of the continent
     * @param minZoom the minimal zoom level for use with the map tile service
     * @param maxZoom the maximum zoom level for use with the map tile service
     * @param floors the IDs of the continent's floors
     */
    @Serializable
    public data class Continent(
        /** This field holds the continent's localized name. */
        val name: String,
        /** This field holds the width and height of the continent. */
        @SerialName("continent_dims")
        val continentDims: List<Int>,
        /** This field holds the minimal zoom level for use with the map tile service. */
        @SerialName("min_zoom")
        val minZoom: Int,
        /** This field holds the maximum zoom level for use with the map tile service. */
        @SerialName("max_zoom")
        val maxZoom: Int,
        /** This field holds the IDs of the continent's floors. */
        val floors: List<GW2FloorId>
    )

}