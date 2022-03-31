/*
 * Copyright (c) 2018-2021 Leon Linhart
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
 * Information about a PvP season.
 *
 * @param id the PvP season's ID
 * @param name the season's localized name
 * @param start the ISO-8601 standard timestamp of when the season started
 * @param end the ISO-8601 standard timestamp of when the season ended
 * @param active whether or not the season is currently active
 * @param divisions the season's divisions
 * @param ranks the season's ranks
 * @param leaderboards the season's leaderboards
 */
@Serializable
public data class GW2v2PvPSeason(
    val id: String,
    val name: String,
    val start: String,
    val end: String,
    val active: Boolean,
    val divisions: List<Division>,
    val ranks: List<Ranks>? = null,
    val leaderboards: Leaderboards
) {

    /**
     * Information about a division.
     *
     * @param name the division's localized name
     * @param flags the flags providing additional information about the division
     * @param largeIcon the render service URL for the division's large icon
     * @param smallIcon the render service URL for the division's small icon
     * @param pipIcon the render service URL for the division's pip icon
     * @param tiers the division's tiers
     */
    @Serializable
    public data class Division(
        val name: String,
        val flags: List<String>,
        @SerialName("large_icon")
        val largeIcon: String,
        @SerialName("small_icon")
        val smallIcon: String,
        @SerialName("pip_icon")
        val pipIcon: String,
        val tiers: List<Tier>
    ) {

        /**
         * Information about a division's tier.
         *
         * @param points the number of pips in the tier
         */
        @Serializable
        public data class Tier(
            val points: Int
        )

    }

    /**
     * Information about a season's ranks.
     *
     * @param name the rank's localized name
     * @param description the rank's localized description
     * @param icon the render service URL for the rank's icon
     * @param overlay the render service URL for the rank's overlay icon
     * @param overlaySmall the render service URL for the rank's overlay icon
     * @param tiers the rank's tiers
     */
    @Serializable
    public data class Ranks(
        val name: String,
        val description: String,
        val icon: String,
        val overlay: String,
        @SerialName("overlay_small")
        val overlaySmall: String,
        val tiers: List<Tier>
    ) {

        /**
         * Information about a rank's tier.
         *
         * @param rating the rating required for the tier
         */
        @Serializable
        public data class Tier(
            val rating: Int
        )

    }

    /**
     * Information about a seasons leaderboards.
     *
     * @param guild the season's guild leaderboard
     * @param ladder the season's leaderboard
     * @param legendary the season's legendary rank leaderboard
     */
    @Serializable
    public data class Leaderboards(
        val guild: Leaderboard? = null,
        val ladder: Leaderboard? = null,
        val legendary: Leaderboard? = null
    ) {

        /**
         * Information about a leaderboard.
         *
         * @param settings the leaderboard's settings
         * @param scorings the leaderboard's scoring information
         */
        @Serializable
        public data class Leaderboard(
            val settings: Settings,
            val scorings: List<Scoring>
        ) {

            /**
             * Information about a leaderboard's settings.
             *
             * @param name the setting's name
             * @param duration the setting's duration (unknown purpose)
             * @param scoring the ID of the primary scoring component
             * @param tiers the tiers
             */
            @Serializable
            public data class Settings(
                val name: String,
                val duration: String? = null,
                val scoring: String,
                val tiers: List<Tier>
            ) {

                /**
                 * Information about a leaderboard's tiers.
                 *
                 * @param color the tier's color as hex value
                 * @param type the tier's type
                 * @param name the tier's name
                 * @param range the tier's scoring range
                 */
                @Serializable
                public data class Tier(
                    val color: String? = null,
                    val type: String? = null,
                    val name: String? = null,
                    val range: List<Double>
                )

            }

            /**
             * Information about scoring.
             *
             * @param id the scoring's ID
             * @param type the scoring's type
             * @param description the scoring's localized description
             * @param name the scoring's localized name
             * @param ordering the scoring's ordering ("MoreIsBetter" or "LessIsBetter")
             */
            @Serializable
            public data class Scoring(
                val id: String,
                val type: String,
                val description: String,
                val name: String,
                val ordering: String
            )

        }

    }

}