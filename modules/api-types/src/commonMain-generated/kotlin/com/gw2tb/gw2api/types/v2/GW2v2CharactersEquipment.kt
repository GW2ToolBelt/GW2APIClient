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
package com.gw2tb.gw2api.types.v2

import com.gw2tb.gw2api.types.*
import com.gw2tb.gw2api.types.internal.*

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

// Generated for type: CharactersEquipment

/**
 * Information about a character's equipment.
 *
 * @param equipment the character's equipment
 */
@Serializable
public data class GW2v2CharactersEquipment(
    /** This field holds the character's equipment. */
    val equipment: List<EquipmentSlot>
) {

    /**
     * Information a character's equipment slot.
     *
     * @param id the equipment piece's item ID
     * @param slot the equipment piece's slot
     * @param skin the ID of the skin transmuted onto the equipment piece
     * @param dyes the IDs of the dyes applied to the item
     * @param upgrades the IDs of the upgrade components slotted into the item
     * @param infusions the IDs of the infusions slotted into the item
     * @param charges the amount of charges remaining on the item
     * @param binding the binding of the item
     * @param boundTo name of the character the item is bound to
     * @param stats contains information on the stats chosen if the item offers an option for stats/prefix
     * @param location the storage location of the equipment piece
     * @param tabs the IDs of the tabs in which this item is used
     */
    @Serializable
    public data class EquipmentSlot(
        /** This field holds the equipment piece's item ID. */
        val id: GW2ItemId,
        /** This field holds the equipment piece's slot. */
        val slot: String? = null,
        /** This field holds the ID of the skin transmuted onto the equipment piece. */
        val skin: GW2SkinId? = null,
        /** This field holds the IDs of the dyes applied to the item. */
        val dyes: List<GW2DyeId?>? = null,
        /** This field holds the IDs of the upgrade components slotted into the item. */
        val upgrades: List<GW2ItemId>? = null,
        /** This field holds the IDs of the infusions slotted into the item. */
        val infusions: List<GW2ItemId>? = null,
        /** This field holds the amount of charges remaining on the item. */
        val charges: Int? = null,
        /** This field holds the binding of the item. */
        val binding: String? = null,
        /** This field holds name of the character the item is bound to. */
        @SerialName("bound_to")
        val boundTo: String? = null,
        /** This field holds contains information on the stats chosen if the item offers an option for stats/prefix. */
        val stats: Stats? = null,
        /** This field holds the storage location of the equipment piece. */
        val location: String,
        /** This field holds the IDs of the tabs in which this item is used. */
        val tabs: List<Int>? = null
    ) {

        /**
         * Information about an item's stats.
         *
         * @param id the itemstat ID
         * @param attributes the item's attributes
         */
        @Serializable
        public data class Stats(
            /** This field holds the itemstat ID. */
            val id: GW2ItemStatId,
            /** This field holds the item's attributes. */
            val attributes: Attributes
        ) {

            /**
             * Information about an item's attributes.
             *
             * @param power the amount of power given by the item
             * @param precision the amount of precision given by the item
             * @param critDamage the amount of crit damage given by the item
             * @param toughness the amount of toughness given by the item
             * @param vitality the amount of vitality given by the item
             * @param conditionDamage the amount of condition damage given by the item
             * @param conditionDuration the amount of condition duration given by the item
             * @param healing the amount of healing given by the item
             * @param boonDuration the amount of boon duration given by the item
             */
            @Serializable
            public data class Attributes(
                /** This field holds the amount of power given by the item. */
                @SerialName("Power")
                val power: Int? = null,
                /** This field holds the amount of precision given by the item. */
                @SerialName("Precision")
                val precision: Int? = null,
                /** This field holds the amount of crit damage given by the item. */
                @SerialName("CritDamage")
                val critDamage: Int? = null,
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

    }

}