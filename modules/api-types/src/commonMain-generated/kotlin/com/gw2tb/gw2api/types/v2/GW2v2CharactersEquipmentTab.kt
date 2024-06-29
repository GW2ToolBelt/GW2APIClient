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

// Generated for type: CharactersEquipmentTab

/**
 * Information about a character's equipment tab.
 *
 * @param tab the tab's ID
 * @param name the equipment configuration's name
 * @param isActive a flag indicating whether this tab is the active tab
 * @param equipment the stored equipment
 * @param equipmentPvp the character's PvP equipment
 */
@Serializable
public data class GW2v2CharactersEquipmentTab(
    /** This field holds the tab's ID. */
    val tab: Int,
    /** This field holds the equipment configuration's name. */
    val name: String,
    /** This field holds a flag indicating whether this tab is the active tab. */
    @SerialName("is_active")
    val isActive: Boolean,
    /** This field holds the stored equipment. */
    val equipment: List<Equipment>,
    /** This field holds the character's PvP equipment. */
    @SerialName("equipment_pvp")
    val equipmentPvp: PvpEquipment
) {

    /**
     * Information about a piece of equipment.
     *
     * @param id the equipped item's ID
     * @param slot the slot in which the equipment piece is slotted into
     * @param skin the ID of the skin transmuted onto the equipment piece
     * @param dyes the IDs of the dyes applied to the item
     * @param upgrades the IDs of the upgrade components slotted into the item
     * @param infusions the IDs of the infusions slotted into the item
     * @param binding the binding of the item
     * @param boundTo name of the character the item is bound to
     * @param location the storage location of the equipment piece
     * @param stats information about the stats chosen for the item (if the item offers the option to select stats/prefix)
     */
    @Serializable
    public data class Equipment(
        /** This field holds the equipped item's ID. */
        val id: Int,
        /** This field holds the slot in which the equipment piece is slotted into. */
        val slot: String,
        /** This field holds the ID of the skin transmuted onto the equipment piece. */
        val skin: GW2SkinId? = null,
        /** This field holds the IDs of the dyes applied to the item. */
        val dyes: List<Int?>? = null,
        /** This field holds the IDs of the upgrade components slotted into the item. */
        val upgrades: List<Int>? = null,
        /** This field holds the IDs of the infusions slotted into the item. */
        val infusions: List<Int>? = null,
        /** This field holds the binding of the item. */
        val binding: String? = null,
        /** This field holds name of the character the item is bound to. */
        @SerialName("bound_to")
        val boundTo: String? = null,
        /** This field holds the storage location of the equipment piece. */
        val location: String,
        /** This field holds information about the stats chosen for the item (if the item offers the option to select stats/prefix). */
        val stats: Stats? = null
    ) {

        /**
         * Information about an item's stats.
         *
         * @param id the itemstat ID
         * @param power the amount of power given by the item
         * @param precision the amount of precision given by the item
         * @param toughness the amount of toughness given by the item
         * @param vitality the amount of vitality given by the item
         * @param conditionDamage the amount of condition damage given by the item
         * @param conditionDuration the amount of condition duration given by the item
         * @param healing the amount of healing given by the item
         * @param boonDuration the amount of boon duration given by the item
         */
        @Serializable
        public data class Stats(
            /** This field holds the itemstat ID. */
            val id: Int,
            /** This field holds the amount of power given by the item. */
            @SerialName("Power")
            val power: Int? = null,
            /** This field holds the amount of precision given by the item. */
            @SerialName("Precision")
            val precision: Int? = null,
            /** This field holds the amount of toughness given by the item. */
            @SerialName("Toughness")
            val toughness: Int? = null,
            /** This field holds the amount of vitality given by the item. */
            @SerialName("Vitality")
            val vitality: Int? = null,
            /** This field holds the amount of condition damage given by the item. */
            @SerialName("ConditionDamage")
            val conditionDamage: Int? = null,
            /** This field holds the amount of condition duration given by the item. */
            @SerialName("ConditionDuration")
            val conditionDuration: Int? = null,
            /** This field holds the amount of healing given by the item. */
            @SerialName("Healing")
            val healing: Int? = null,
            /** This field holds the amount of boon duration given by the item. */
            @SerialName("BoonDuration")
            val boonDuration: Int? = null
        )

    }

    /**
     * Information about a character's PvP equipment.
     *
     * @param amulet the ID of the selected amulet
     * @param rune the ID of the selected rune
     * @param sigils the IDs of the selected sigils
     */
    @Serializable
    public data class PvpEquipment(
        /** This field holds the ID of the selected amulet. */
        val amulet: Int? = null,
        /** This field holds the ID of the selected rune. */
        val rune: Int? = null,
        /** This field holds the IDs of the selected sigils. */
        val sigils: List<Int?>
    )

}