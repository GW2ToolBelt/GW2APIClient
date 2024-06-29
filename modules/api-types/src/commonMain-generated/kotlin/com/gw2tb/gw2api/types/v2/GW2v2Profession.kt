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

// Generated for type: Profession

/**
 * Information about a playable profession.
 *
 * @param id the profession's ID
 * @param name the profession's localized name
 * @param code the profession's palette code
 * @param icon a render service URL for the profession's icon
 * @param bigIcon a render service URL for a big version of the profession's icon
 * @param specializations the IDs of the profession's specializations
 * @param weapons information about the weapons usable by this profession
 * @param flags additional flags describing this profession's properties (e.g. NoRacialSkills)
 * @param skills the profession specific skills
 * @param training array of trainings of this profession
 * @param skillsByPalette mappings from palette IDs to skill IDs
 */
@Serializable
public data class GW2v2Profession(
    /** This field holds the profession's ID. */
    val id: String,
    /** This field holds the profession's localized name. */
    val name: String,
    /** This field holds the profession's palette code. */
    val code: Int,
    /** This field holds a render service URL for the profession's icon. */
    val icon: String,
    /** This field holds a render service URL for a big version of the profession's icon. */
    @SerialName("icon_big")
    val bigIcon: String,
    /** This field holds the IDs of the profession's specializations. */
    val specializations: List<Int>,
    /** This field holds information about the weapons usable by this profession. */
    val weapons: Map<String, Weapon>,
    /** This field holds additional flags describing this profession's properties (e.g. NoRacialSkills). */
    val flags: List<String>,
    /** This field holds the profession specific skills. */
    val skills: List<Skill>,
    /** This field holds array of trainings of this profession. */
    val training: List<Training>,
    /** This field holds mappings from palette IDs to skill IDs. */
    @SerialName("skills_by_palette")
    val skillsByPalette: List<List<Int>>
) {

    /**
     * Information about a profession's weapon and it's skills.
     *
     * @param specialization the ID of the profession's specializations required for this weapon
     * @param flags additional flags describing this weapon's properties (e.g. MainHand, OffHand, TwoHand, Aquatic)
     * @param skills the skills for the weapon if wielded by this profession
     */
    @Serializable
    public data class Weapon(
        /** This field holds the ID of the profession's specializations required for this weapon. */
        val specialization: Int? = null,
        /** This field holds additional flags describing this weapon's properties (e.g. MainHand, OffHand, TwoHand, Aquatic). */
        val flags: List<String>,
        /** This field holds the skills for the weapon if wielded by this profession. */
        val skills: List<Skill>
    ) {

        /**
         * Information about a weapon's skills.
         *
         * @param id the skill's ID
         * @param slot the skill's slot
         * @param attunement the elementalist attunement for this skill
         * @param offhand the offhand weapon for this skill
         */
        @Serializable
        public data class Skill(
            /** This field holds the skill's ID. */
            val id: Int,
            /** This field holds the skill's slot. */
            val slot: String,
            /** This field holds the elementalist attunement for this skill. */
            val attunement: String? = null,
            /** This field holds the offhand weapon for this skill. */
            val offhand: String? = null
        )

    }

    /**
     * Information about a profession skill.
     *
     * @param id the skill's ID
     * @param slot the skill's slot
     * @param type the skill's type
     * @param attunement the elementalist attunement for this skill
     * @param source the profession ID of the source of the stolen skill
     */
    @Serializable
    public data class Skill(
        /** This field holds the skill's ID. */
        val id: Int,
        /** This field holds the skill's slot. */
        val slot: String,
        /** This field holds the skill's type. */
        val type: String,
        /** This field holds the elementalist attunement for this skill. */
        val attunement: String? = null,
        /** This field holds the profession ID of the source of the stolen skill. */
        val source: String? = null
    )

    /**
     * Information about training track.
     *
     * @param id the training's ID
     * @param category the training's category
     * @param name the training's localized name
     * @param track array of skill/trait in the training track
     */
    @Serializable
    public data class Training(
        /** This field holds the training's ID. */
        val id: Int,
        /** This field holds the training's category. */
        val category: String,
        /** This field holds the training's localized name. */
        val name: String,
        /** This field holds array of skill/trait in the training track. */
        val track: List<Track>
    ) {

        /**
         * Information about a skill/trait in a track.
         *
         * @param cost the amount of skill points required to unlock this step
         * @param type the type of the step (e.g. Skill, Trait)
         * @param skillId the ID of the skill unlocked by this step
         * @param traitId the ID of the trait unlocked by this step
         */
        @Serializable
        public data class Track(
            /** This field holds the amount of skill points required to unlock this step. */
            val cost: Int,
            /** This field holds the type of the step (e.g. Skill, Trait). */
            val type: String,
            /** This field holds the ID of the skill unlocked by this step. */
            @SerialName("skill_id")
            val skillId: Int? = null,
            /** This field holds the ID of the trait unlocked by this step. */
            @SerialName("trait_id")
            val traitId: Int? = null
        )

    }

}