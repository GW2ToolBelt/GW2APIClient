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
 * Information about a character's equipment.
 *
 * @param equipment the character's equipment
 */
@Serializable
public data class GW2v2CharactersEquipment(
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
        val id: Int,
        val slot: String? = null,
        val skin: Int? = null,
        val dyes: List<Int?>? = null,
        val upgrades: List<Int>? = null,
        val infusions: List<Int>? = null,
        val charges: Int? = null,
        val binding: String? = null,
        @SerialName("bound_to")
        val boundTo: String? = null,
        val stats: Stats? = null,
        val location: String,
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
            val id: Int,
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
                @SerialName("Power")
                val power: Int? = null,
                @SerialName("Precision")
                val precision: Int? = null,
                @SerialName("CritDamage")
                val critDamage: Int? = null,
                @SerialName("Toughness")
                val toughness: Int? = null,
                @SerialName("Vitality")
                val vitality: Int? = null,
                @SerialName("ConditionDamage")
                val conditionDamage: Int? = null,
                @SerialName("ConditionDuration")
                val conditionDuration: Int? = null,
                @SerialName("Healing")
                val healing: Int? = null,
                @SerialName("BoonDuration")
                val boonDuration: Int? = null
            )

        }

    }

}