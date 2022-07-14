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
package com.gw2tb.gw2api.types.v1

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*

/**
 * Information about a map floor.
 *
 * @param textureDims the width and height of the texture
 * @param clampedView a rectangle of downloadable textures (Every tile coordinate outside this rectangle is not available on the tile server.)
 * @param regions the floor's regions
 */
@Serializable
public data class GW2v1MapFloor(
    @SerialName("texture_dims")
    val textureDims: List<Int>,
    @SerialName("clamped_view")
    val clampedView: List<List<Int>>? = null,
    val regions: Map<Int, Region>
) {

    /**
     * Information about a region.
     *
     * @param name the region's localized name
     * @param labelCoord the coordinate of the region's label
     * @param continentRect the dimensions of the region, given as the coordinates of the upper-left (NW) and lower-right (SE) corners
     * @param maps the region's maps
     */
    @Serializable
    public data class Region(
        val name: String,
        @SerialName("label_coord")
        val labelCoord: List<Double>,
        @SerialName("continent_rect")
        val continentRect: List<List<Int>>,
        val maps: Map<Int, GameMap>
    ) {

        /**
         * Information about a map.
         *
         * @param name the map's localized name
         * @param minLevel the minimum level of the map
         * @param maxLevel the maximum level of the map
         * @param defaultFloor the ID of the map's default floor
         * @param mapRect the dimensions of the map, given as the coordinates of the lower-left (SW) and upper-right (NE) corners
         * @param continentRect the dimensions of the map within the continent coordinate system, given as the coordinates of the upper-left (NW) and lower-right (SE) corners
         * @param labelCoord the coordinate of the map's label
         * @param pointsOfInterest the points of interest on the floor (i.e. landmarks, vistas and waypoints)
         * @param godShrines the god shrines on the floor
         * @param tasks the tasks on the floor
         * @param skillChallenges the skill challenges on the floor
         * @param sectors the sectors on the floor
         * @param adventures the adventures on the floor
         * @param masteryPoints the mastery points on the floor
         */
        @Serializable
        public data class GameMap(
            val name: String,
            @SerialName("min_level")
            val minLevel: Int,
            @SerialName("max_level")
            val maxLevel: Int,
            @SerialName("default_floor")
            val defaultFloor: Int,
            @SerialName("map_rect")
            val mapRect: List<List<Int>>,
            @SerialName("continent_rect")
            val continentRect: List<List<Int>>,
            @SerialName("label_coord")
            val labelCoord: List<Double>? = null,
            @SerialName("points_of_interest")
            val pointsOfInterest: List<PointOfInterest>,
            @SerialName("god_shrines")
            val godShrines: List<GodShrine>? = null,
            val tasks: List<Task>,
            @SerialName("skill_challenges")
            val skillChallenges: List<SkillChallenge>,
            val sectors: List<Sector>,
            val adventures: List<Adventure>,
            @SerialName("training_points")
            val masteryPoints: List<MasteryPoint>
        ) {

            /**
             * Information about a point of interest (i.e. a landmark, vista or waypoint).
             *
             * @param poIID the PoI's ID
             * @param name the PoI's localized name
             * @param type the type of the PoI (landmark, vista, or waypoint)
             * @param floor the PoI's floor
             * @param coord the PoI's coordinates
             * @param marker the PoI's marker icon
             */
            @Serializable
            public data class PointOfInterest(
                @SerialName("poi_id")
                val poIID: Int,
                val name: String? = null,
                val type: String,
                val floor: Int,
                val coord: List<Double>,
                val marker: Marker? = null
            ) {

                /**
                 * Information about a PoI's marker icon.
                 *
                 * @param fileID the icon's file ID to be used with the render service
                 * @param signature the icon's file signature to be used with the render service
                 */
                @Serializable
                public data class Marker(
                    @SerialName("file_id")
                    val fileID: Int,
                    val signature: String
                )

            }

            /**
             * Information about a god shrine.
             *
             * @param id the god shrine's ID
             * @param name the god shrine's localized name
             * @param nameContested the god shrine's localized name (when contested)
             * @param icon the god shrine's icon
             * @param iconContested the god shrine's icon (when contested)
             * @param poIID the god shrine's PoI ID
             * @param coord the god shrine's coordinates
             */
            @Serializable
            public data class GodShrine(
                val id: Int,
                val name: String,
                @SerialName("name_contested")
                val nameContested: String? = null,
                val icon: String? = null,
                @SerialName("icon_contested")
                val iconContested: String? = null,
                @SerialName("poi_id")
                val poIID: Int,
                val coord: List<Double>
            )

            /**
             * Information about a task.
             *
             * @param taskID the task's ID
             * @param objective the adventure's localized objective
             * @param level the task's level
             * @param coord the task's coordinates
             * @param bounds the task's bounds
             */
            @Serializable
            public data class Task(
                @SerialName("task_id")
                val taskID: Int,
                val objective: String,
                val level: Int,
                val coord: List<Double>,
                val bounds: List<List<Double>>
            )

            /**
             * Information about a skill challenge.
             *
             * @param id the skill challenge's ID (unique within an expansion)
             * @param expac the skill challenge's expansion ID
             * @param coord the skill challenge's coordinates
             */
            @Serializable
            public data class SkillChallenge(
                @SerialName("idx")
                val id: Int,
                val expac: Int,
                val coord: List<Double>
            )

            /**
             * Information about a sector.
             *
             * @param sectorID the sector's ID
             * @param name the sector's localized name
             * @param level the sector's level
             * @param coord the sector's coordinates
             * @param bounds the sector's bounds
             */
            @Serializable
            public data class Sector(
                @SerialName("sector_id")
                val sectorID: Int,
                val name: String? = null,
                val level: Int,
                val coord: List<Double>,
                val bounds: List<List<Double>>
            )

            /**
             * Information about an adventure.
             *
             * @param guid the adventure's ID
             * @param name the adventure's localized name
             * @param coord the adventure's coordinates
             * @param leaderboard the adventure's leaderboard
             */
            @Serializable
            public data class Adventure(
                val guid: String,
                val name: String,
                val coord: List<Double>,
                val leaderboard: Leaderboard
            ) {

                /**
                 * Information about an adventure's leaderboard.
                 *
                 * @param guid the leaderboard's ID
                 * @param title the leaderboard's localized title
                 * @param description the leaderboard's localized description
                 */
                @Serializable
                public data class Leaderboard(
                    val guid: String,
                    val title: String,
                    val description: String
                )

            }

            /**
             * Information about a mastery point.
             *
             * @param id the mastery point's ID
             * @param name the mastery point's localized name
             * @param description the mastery point's localized description
             * @param type the mastery region
             * @param coord the mastery point's coordinates
             */
            @Serializable
            public data class MasteryPoint(
                val id: Int,
                val name: String,
                val description: String,
                val type: String,
                val coord: List<Double>
            )

        }

    }

}