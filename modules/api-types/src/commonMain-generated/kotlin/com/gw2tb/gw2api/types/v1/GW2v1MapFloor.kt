/*
 * Copyright (c) 2018-2025 Leon Linhart
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

// Generated for type: MapFloor

/**
 * Information about a map floor.
 *
 * @param textureDims the width and height of the texture
 * @param clampedView a rectangle of downloadable textures (Every tile coordinate outside this rectangle is not available on the tile server.)
 * @param regions the floor's regions
 */
@Serializable
public data class GW2v1MapFloor(
    /** This field holds the width and height of the texture. */
    @SerialName("texture_dims")
    val textureDims: List<Int>,
    /** This field holds a rectangle of downloadable textures (Every tile coordinate outside this rectangle is not available on the tile server.). */
    @SerialName("clamped_view")
    val clampedView: List<List<Int>>? = null,
    /** This field holds the floor's regions. */
    val regions: Map<GW2RegionId, Region>
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
        /** This field holds the region's localized name. */
        val name: String,
        /** This field holds the coordinate of the region's label. */
        @SerialName("label_coord")
        val labelCoord: List<Double>,
        /** This field holds the dimensions of the region, given as the coordinates of the upper-left (NW) and lower-right (SE) corners. */
        @SerialName("continent_rect")
        val continentRect: List<List<Int>>,
        /** This field holds the region's maps. */
        val maps: Map<GW2MapId, GameMap>
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
            /** This field holds the map's localized name. */
            val name: String,
            /** This field holds the minimum level of the map. */
            @SerialName("min_level")
            val minLevel: Int,
            /** This field holds the maximum level of the map. */
            @SerialName("max_level")
            val maxLevel: Int,
            /** This field holds the ID of the map's default floor. */
            @SerialName("default_floor")
            val defaultFloor: Int,
            /** This field holds the dimensions of the map, given as the coordinates of the lower-left (SW) and upper-right (NE) corners. */
            @SerialName("map_rect")
            val mapRect: List<List<Int>>,
            /** This field holds the dimensions of the map within the continent coordinate system, given as the coordinates of the upper-left (NW) and lower-right (SE) corners. */
            @SerialName("continent_rect")
            val continentRect: List<List<Int>>,
            /** This field holds the coordinate of the map's label. */
            @SerialName("label_coord")
            val labelCoord: List<Double>? = null,
            /** This field holds the points of interest on the floor (i.e. landmarks, vistas and waypoints). */
            @SerialName("points_of_interest")
            val pointsOfInterest: List<PointOfInterest>,
            /** This field holds the god shrines on the floor. */
            @SerialName("god_shrines")
            val godShrines: List<GodShrine>? = null,
            /** This field holds the tasks on the floor. */
            val tasks: List<Task>,
            /** This field holds the skill challenges on the floor. */
            @SerialName("skill_challenges")
            val skillChallenges: List<SkillChallenge>,
            /** This field holds the sectors on the floor. */
            val sectors: List<Sector>,
            /** This field holds the adventures on the floor. */
            val adventures: List<Adventure>,
            /** This field holds the mastery points on the floor. */
            @SerialName("training_points")
            val masteryPoints: List<MasteryPoint>
        ) {

            /**
             * Information about a point of interest (i.e. a landmark, vista or waypoint).
             *
             * @param poiId the PoI's ID
             * @param name the PoI's localized name
             * @param type the type of the PoI (landmark, vista, or waypoint)
             * @param floor the PoI's floor
             * @param coord the PoI's coordinates
             * @param marker the PoI's marker icon
             */
            @Serializable
            public data class PointOfInterest(
                /** This field holds the PoI's ID. */
                @SerialName("poi_id")
                val poiId: Int,
                /** This field holds the PoI's localized name. */
                val name: String? = null,
                /** This field holds the type of the PoI (landmark, vista, or waypoint). */
                val type: String,
                /** This field holds the PoI's floor. */
                val floor: Int,
                /** This field holds the PoI's coordinates. */
                val coord: List<Double>,
                /** This field holds the PoI's marker icon. */
                val marker: Marker? = null
            ) {

                /**
                 * Information about a PoI's marker icon.
                 *
                 * @param fileId the icon's file ID to be used with the render service
                 * @param signature the icon's file signature to be used with the render service
                 */
                @Serializable
                public data class Marker(
                    /** This field holds the icon's file ID to be used with the render service. */
                    @SerialName("file_id")
                    val fileId: Int,
                    /** This field holds the icon's file signature to be used with the render service. */
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
             * @param poiId the god shrine's PoI ID
             * @param coord the god shrine's coordinates
             */
            @Serializable
            public data class GodShrine(
                /** This field holds the god shrine's ID. */
                val id: Int,
                /** This field holds the god shrine's localized name. */
                val name: String,
                /** This field holds the god shrine's localized name (when contested). */
                @SerialName("name_contested")
                val nameContested: String? = null,
                /** This field holds the god shrine's icon. */
                val icon: String? = null,
                /** This field holds the god shrine's icon (when contested). */
                @SerialName("icon_contested")
                val iconContested: String? = null,
                /** This field holds the god shrine's PoI ID. */
                @SerialName("poi_id")
                val poiId: Int,
                /** This field holds the god shrine's coordinates. */
                val coord: List<Double>
            )

            /**
             * Information about a task.
             *
             * @param taskId the task's ID
             * @param objective the adventure's localized objective
             * @param level the task's level
             * @param coord the task's coordinates
             * @param bounds the task's bounds
             */
            @Serializable
            public data class Task(
                /** This field holds the task's ID. */
                @SerialName("task_id")
                val taskId: Int,
                /** This field holds the adventure's localized objective. */
                val objective: String,
                /** This field holds the task's level. */
                val level: Int,
                /** This field holds the task's coordinates. */
                val coord: List<Double>,
                /** This field holds the task's bounds. */
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
                /** This field holds the skill challenge's ID (unique within an expansion). */
                @SerialName("idx")
                val id: Int,
                /** This field holds the skill challenge's expansion ID. */
                val expac: Int,
                /** This field holds the skill challenge's coordinates. */
                val coord: List<Double>
            )

            /**
             * Information about a sector.
             *
             * @param sectorId the sector's ID
             * @param name the sector's localized name
             * @param level the sector's level
             * @param coord the sector's coordinates
             * @param bounds the sector's bounds
             */
            @Serializable
            public data class Sector(
                /** This field holds the sector's ID. */
                @SerialName("sector_id")
                val sectorId: Int,
                /** This field holds the sector's localized name. */
                val name: String? = null,
                /** This field holds the sector's level. */
                val level: Int,
                /** This field holds the sector's coordinates. */
                val coord: List<Double>,
                /** This field holds the sector's bounds. */
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
                /** This field holds the adventure's ID. */
                val guid: String,
                /** This field holds the adventure's localized name. */
                val name: String,
                /** This field holds the adventure's coordinates. */
                val coord: List<Double>,
                /** This field holds the adventure's leaderboard. */
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
                    /** This field holds the leaderboard's ID. */
                    val guid: String,
                    /** This field holds the leaderboard's localized title. */
                    val title: String,
                    /** This field holds the leaderboard's localized description. */
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
                /** This field holds the mastery point's ID. */
                val id: Int,
                /** This field holds the mastery point's localized name. */
                val name: String,
                /** This field holds the mastery point's localized description. */
                val description: String,
                /** This field holds the mastery region. */
                val type: String,
                /** This field holds the mastery point's coordinates. */
                val coord: List<Double>
            )

        }

    }

}