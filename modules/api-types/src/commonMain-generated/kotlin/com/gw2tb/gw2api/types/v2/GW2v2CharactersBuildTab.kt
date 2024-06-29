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

// Generated for type: CharactersBuildTab

/**
 * Information about a character's build tab.
 *
 * @param tab the tab's ID
 * @param isActive a flag indicating whether this tab is the active tab
 * @param build the stored build
 */
@Serializable
public data class GW2v2CharactersBuildTab(
    /** This field holds the tab's ID. */
    val tab: Int,
    /** This field holds a flag indicating whether this tab is the active tab. */
    @SerialName("is_active")
    val isActive: Boolean,
    /** This field holds the stored build. */
    val build: Build
) {

    /**
     * Information about a build.
     *
     * @param name the build's name
     * @param profession the build's profession
     * @param specializations the build's specializations
     * @param skills the build's skills
     * @param aquaticSkills the build's aquatic skills
     * @param legends the build's legend IDs
     * @param aquaticLegends the build's aquatic legend IDs
     */
    @Serializable
    public data class Build(
        /** This field holds the build's name. */
        val name: String,
        /** This field holds the build's profession. */
        val profession: String,
        /** This field holds the build's specializations. */
        val specializations: List<Specialization>,
        /** This field holds the build's skills. */
        val skills: Skills,
        /** This field holds the build's aquatic skills. */
        @SerialName("aquatic_skills")
        val aquaticSkills: Skills,
        /** This field holds the build's legend IDs. */
        val legends: List<String?>? = null,
        /** This field holds the build's aquatic legend IDs. */
        @SerialName("aquatic_legends")
        val aquaticLegends: List<String?>? = null
    ) {

        /**
         * Information about a build's specialization.
         *
         * @param id the specialization's ID
         * @param traits the IDs of the selected traits
         */
        @Serializable
        public data class Specialization(
            /** This field holds the specialization's ID. */
            val id: Int? = null,
            /** This field holds the IDs of the selected traits. */
            val traits: List<Int?>
        )

        /**
         * Information about a build's skills.
         *
         * @param heal the heal skill's ID
         * @param utilities the IDs of the utility skills
         * @param elite the elite skill's ID
         */
        @Serializable
        public data class Skills(
            /** This field holds the heal skill's ID. */
            val heal: Int? = null,
            /** This field holds the IDs of the utility skills. */
            val utilities: List<Int?>,
            /** This field holds the elite skill's ID. */
            val elite: Int? = null
        )

    }

}