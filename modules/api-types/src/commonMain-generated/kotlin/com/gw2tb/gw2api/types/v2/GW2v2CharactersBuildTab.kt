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
 * Information about a character's build tab.
 *
 * @param tab the tab's ID
 * @param isActive a flag indicating whether or not this tab is the active tab
 * @param build the stored build
 */
@Serializable
public data class GW2v2CharactersBuildTab(
    val tab: Int,
    @SerialName("is_active")
    val isActive: Boolean,
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
        val name: String,
        val profession: String,
        val specializations: List<Specialization>,
        val skills: Skills,
        @SerialName("aquatic_skills")
        val aquaticSkills: Skills,
        val legends: List<String?>? = null,
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
            val id: Int? = null,
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
            val heal: Int? = null,
            val utilities: List<Int?>,
            val elite: Int? = null
        )

    }

}