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

// Generated for type: Maps

/**
 * Information about maps.
 *
 * @param maps the maps
 */
@Serializable
public data class GW2v1Maps(
    /** This field holds the maps. */
    val maps: Map<GW2MapId, GameMap>
) {

    /**
     * Information about a map.
     *
     * @param mapName the map's localized name
     * @param type the type of map
     * @param minLevel the minimum level of the map
     * @param maxLevel the maximum level of the map
     * @param defaultFloor the ID of the map's default floor
     * @param floors the IDs of the floors available on the map
     * @param regionId the ID of the region the map belongs to
     * @param regionName the name of the region the map belongs to
     * @param continentId the ID of the continent the map belongs to
     * @param continentName the name of the continent the map belongs to
     * @param mapRect the dimensions of the map, given as the coordinates of the lower-left (SW) and upper-right (NE) corners
     * @param continentRect the dimensions of the map within the continent coordinate system, given as the coordinates of the upper-left (NW) and lower-right (SE) corners
     */
    @Serializable
    public data class GameMap(
        /** This field holds the map's localized name. */
        @SerialName("map_name")
        val mapName: String,
        /** This field holds the type of map. */
        val type: String,
        /** This field holds the minimum level of the map. */
        @SerialName("min_level")
        val minLevel: Int,
        /** This field holds the maximum level of the map. */
        @SerialName("max_level")
        val maxLevel: Int,
        /** This field holds the ID of the map's default floor. */
        @SerialName("default_floor")
        val defaultFloor: GW2FloorId,
        /** This field holds the IDs of the floors available on the map. */
        val floors: List<Int>,
        /** This field holds the ID of the region the map belongs to. */
        @SerialName("region_id")
        val regionId: GW2RegionId,
        /** This field holds the name of the region the map belongs to. */
        @SerialName("region_name")
        val regionName: String? = null,
        /** This field holds the ID of the continent the map belongs to. */
        @SerialName("continent_id")
        val continentId: GW2ContinentId,
        /** This field holds the name of the continent the map belongs to. */
        @SerialName("continent_name")
        val continentName: String? = null,
        /** This field holds the dimensions of the map, given as the coordinates of the lower-left (SW) and upper-right (NE) corners. */
        @SerialName("map_rect")
        val mapRect: List<List<Int>>,
        /** This field holds the dimensions of the map within the continent coordinate system, given as the coordinates of the upper-left (NW) and lower-right (SE) corners. */
        @SerialName("continent_rect")
        val continentRect: List<List<Int>>
    )

}