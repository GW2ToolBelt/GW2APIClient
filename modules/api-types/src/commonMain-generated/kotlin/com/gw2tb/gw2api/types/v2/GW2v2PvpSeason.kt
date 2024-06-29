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

// Generated for type: PvpSeason

/**
 * Information about a PvP season.
 *
 * @param id the PvP season's ID
 * @param name the season's localized name
 * @param start the ISO-8601 standard timestamp of when the season started
 * @param end the ISO-8601 standard timestamp of when the season ended
 * @param active whether the season is currently active
 * @param divisions the season's divisions
 * @param ranks the season's ranks
 * @param leaderboards the season's leaderboards
 */
@Serializable
public data class GW2v2PvpSeason(
    /** This field holds the PvP season's ID. */
    val id: String,
    /** This field holds the season's localized name. */
    val name: String,
    /** This field holds the ISO-8601 standard timestamp of when the season started. */
    val start: String,
    /** This field holds the ISO-8601 standard timestamp of when the season ended. */
    val end: String,
    /** This field holds whether the season is currently active. */
    val active: Boolean,
    /** This field holds the season's divisions. */
    val divisions: List<Division>,
    /** This field holds the season's ranks. */
    val ranks: List<Ranks>? = null,
    /** This field holds the season's leaderboards. */
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
        /** This field holds the division's localized name. */
        val name: String,
        /** This field holds the flags providing additional information about the division. */
        val flags: List<String>,
        /** This field holds the render service URL for the division's large icon. */
        @SerialName("large_icon")
        val largeIcon: String,
        /** This field holds the render service URL for the division's small icon. */
        @SerialName("small_icon")
        val smallIcon: String,
        /** This field holds the render service URL for the division's pip icon. */
        @SerialName("pip_icon")
        val pipIcon: String,
        /** This field holds the division's tiers. */
        val tiers: List<Tier>
    ) {

        /**
         * Information about a division's tier.
         *
         * @param points the number of pips in the tier
         */
        @Serializable
        public data class Tier(
            /** This field holds the number of pips in the tier. */
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
        /** This field holds the rank's localized name. */
        val name: String,
        /** This field holds the rank's localized description. */
        val description: String,
        /** This field holds the render service URL for the rank's icon. */
        val icon: String,
        /** This field holds the render service URL for the rank's overlay icon. */
        val overlay: String,
        /** This field holds the render service URL for the rank's overlay icon. */
        @SerialName("overlay_small")
        val overlaySmall: String,
        /** This field holds the rank's tiers. */
        val tiers: List<Tier>
    ) {

        /**
         * Information about a rank's tier.
         *
         * @param rating the rating required for the tier
         */
        @Serializable
        public data class Tier(
            /** This field holds the rating required for the tier. */
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
        /** This field holds the season's guild leaderboard. */
        val guild: Leaderboard? = null,
        /** This field holds the season's leaderboard. */
        val ladder: Leaderboard? = null,
        /** This field holds the season's legendary rank leaderboard. */
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
            /** This field holds the leaderboard's settings. */
            val settings: Settings,
            /** This field holds the leaderboard's scoring information. */
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
                /** This field holds the setting's name. */
                val name: String,
                /** This field holds the setting's duration (unknown purpose). */
                val duration: String? = null,
                /** This field holds the ID of the primary scoring component. */
                val scoring: String,
                /** This field holds the tiers. */
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
                    /** This field holds the tier's color as hex value. */
                    val color: String? = null,
                    /** This field holds the tier's type. */
                    val type: String? = null,
                    /** This field holds the tier's name. */
                    val name: String? = null,
                    /** This field holds the tier's scoring range. */
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
                /** This field holds the scoring's ID. */
                val id: String,
                /** This field holds the scoring's type. */
                val type: String,
                /** This field holds the scoring's localized description. */
                val description: String,
                /** This field holds the scoring's localized name. */
                val name: String,
                /** This field holds the scoring's ordering ("MoreIsBetter" or "LessIsBetter"). */
                val ordering: String
            )

        }

    }

}