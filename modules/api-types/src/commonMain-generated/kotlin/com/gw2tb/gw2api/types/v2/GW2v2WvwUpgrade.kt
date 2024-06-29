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

// Generated for type: WvwUpgrade

/**
 * Information about an upgrade for objectives in the World versus World game mode.
 *
 * @param id the upgrade's ID
 * @param tiers the different tiers of the upgrade
 */
@Serializable
public data class GW2v2WvwUpgrade(
    /** This field holds the upgrade's ID. */
    val id: Int,
    /** This field holds the different tiers of the upgrade. */
    val tiers: List<Tier>
) {

    /**
     * Information about an upgrade tier.
     *
     * @param name the name of the upgrade tier
     * @param yaksRequired the amount of dolyaks required to reach this upgrade tier
     * @param upgrades the upgrades available at the tier
     */
    @Serializable
    public data class Tier(
        /** This field holds the name of the upgrade tier. */
        val name: String,
        /** This field holds the amount of dolyaks required to reach this upgrade tier. */
        @SerialName("yaks_required")
        val yaksRequired: Int,
        /** This field holds the upgrades available at the tier. */
        val upgrades: List<Upgrade>
    ) {

        /**
         * Information about an upgrade.
         *
         * @param name the name of the upgrade
         * @param description the description for the upgrade
         * @param icon the icon link
         */
        @Serializable
        public data class Upgrade(
            /** This field holds the name of the upgrade. */
            val name: String,
            /** This field holds the description for the upgrade. */
            val description: String,
            /** This field holds the icon link. */
            val icon: String
        )

    }

}