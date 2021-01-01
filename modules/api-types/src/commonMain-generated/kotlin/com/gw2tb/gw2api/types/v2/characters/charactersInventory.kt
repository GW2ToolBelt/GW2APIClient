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
 * Information about a bag in a character's inventory.
 *
 * @param bags the character's inventory bags
 */
@Serializable
public data class GW2v2CharactersInventorySlot(
    val bags: List<Bag>
) {

    /**
     * Information about an inventory bag.
     *
     * @param id the bag's item ID
     * @param size the bag's size
     * @param inventory the bag's content
     */
    @Serializable
    public data class Bag(
        val id: Int,
        val size: Int,
        val inventory: List<Inventory?>
    ) {

        /**
         * Information about an item in a character's inventory.
         *
         * @param id the item's ID
         * @param count the amount of items in the stack
         * @param charges the amount of charges remaining on the item
         * @param skin the ID of the skin applied to the item
         * @param upgrades an array of item IDs for each rune or signet applied to the item
         * @param upgradeSlotIndices 
         * @param infusions an array of item IDs for each infusion applied to the item
         * @param stats contains information on the stats chosen if the item offers an option for stats/prefix
         * @param binding the binding of the material
         * @param boundTo name of the character the item is bound to
         */
        @Serializable
        public data class Inventory(
            val id: Int,
            val count: Int,
            val charges: Int? = null,
            val skin: Int? = null,
            val upgrades: List<Int>? = null,
            @SerialName("upgrade_slot_indices")
            val upgradeSlotIndices: List<Int>? = null,
            val infusions: List<Int>? = null,
            val stats: Stats? = null,
            val binding: String? = null,
            @SerialName("bound_to")
            val boundTo: String? = null
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
                val id: Int,
                @SerialName("Power")
                val power: Int? = null,
                @SerialName("Precision")
                val precision: Int? = null,
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