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

// Generated for type: PvpAmulet

/**
 * Information about a PvP amulet.
 *
 * @param id the amulet's ID
 * @param name the amulet's localized name
 * @param icon a render service URL for the amulet's icon
 * @param attributes the amulet's stats
 */
@Serializable
public data class GW2v2PvpAmulet(
    /** This field holds the amulet's ID. */
    val id: Int,
    /** This field holds the amulet's localized name. */
    val name: String,
    /** This field holds a render service URL for the amulet's icon. */
    val icon: String,
    /** This field holds the amulet's stats. */
    val attributes: Stats
) {

    /**
     * Information about an amulet's stats.
     *
     * @param agonyResistance the amount of agony resistance given by the amulet
     * @param boonDuration the amount of boon duration given by the amulet
     * @param conditionDamage the amount of condition damage given by the amulet
     * @param conditionDuration the amount of condition duration given by the amulet
     * @param critDamage the amount of crit damage given by the amulet
     * @param healing the amount of healing given by the amulet
     * @param power the amount of power given by the amulet
     * @param precision the amount of precision given by the amulet
     * @param toughness the amount of toughness given by the amulet
     * @param vitality the amount of vitality given by the amulet
     */
    @Serializable
    public data class Stats(
        /** This field holds the amount of agony resistance given by the amulet. */
        @SerialName("AgonyResistance")
        val agonyResistance: Int? = null,
        /** This field holds the amount of boon duration given by the amulet. */
        @SerialName("BoonDuration")
        val boonDuration: Int? = null,
        /** This field holds the amount of condition damage given by the amulet. */
        @SerialName("ConditionDamage")
        val conditionDamage: Int? = null,
        /** This field holds the amount of condition duration given by the amulet. */
        @SerialName("ConditionDuration")
        val conditionDuration: Int? = null,
        /** This field holds the amount of crit damage given by the amulet. */
        @SerialName("CritDamage")
        val critDamage: Int? = null,
        /** This field holds the amount of healing given by the amulet. */
        @SerialName("Healing")
        val healing: Int? = null,
        /** This field holds the amount of power given by the amulet. */
        @SerialName("Power")
        val power: Int? = null,
        /** This field holds the amount of precision given by the amulet. */
        @SerialName("Precision")
        val precision: Int? = null,
        /** This field holds the amount of toughness given by the amulet. */
        @SerialName("Toughness")
        val toughness: Int? = null,
        /** This field holds the amount of vitality given by the amulet. */
        @SerialName("Vitality")
        val vitality: Int? = null
    )

}