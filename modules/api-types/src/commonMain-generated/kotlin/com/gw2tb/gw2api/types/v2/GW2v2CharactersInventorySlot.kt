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

// Generated for type: CharactersInventorySlot

/**
 * Information about a bag in a character's inventory.
 *
 * @param bags the character's inventory bags
 */
@Serializable
public data class GW2v2CharactersInventorySlot(
    /** This field holds the character's inventory bags. */
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
        /** This field holds the bag's item ID. */
        val id: GW2ItemId,
        /** This field holds the bag's size. */
        val size: Int,
        /** This field holds the bag's content. */
        val inventory: List<Item?>
    ) {

        /**
         * Information about an item in a character's inventory.
         *
         * @param id the item's ID
         * @param count the amount of items in the stack
         * @param charges the amount of charges remaining on the item
         * @param skin the ID of the skin applied to the item
         * @param upgrades an array of item IDs for each rune or signet applied to the item
         * @param upgradeSlotIndices the slot of the corresponding upgrade
         * @param infusions an array of item IDs for each infusion applied to the item
         * @param stats contains information on the stats chosen if the item offers an option for stats/prefix
         * @param binding the binding of the material
         * @param boundTo name of the character the item is bound to
         */
        @Serializable
        public data class Item(
            /** This field holds the item's ID. */
            val id: GW2ItemId,
            /** This field holds the amount of items in the stack. */
            val count: Int,
            /** This field holds the amount of charges remaining on the item. */
            val charges: Int? = null,
            /** This field holds the ID of the skin applied to the item. */
            val skin: GW2SkinId? = null,
            /** This field holds an array of item IDs for each rune or signet applied to the item. */
            val upgrades: List<GW2ItemId>? = null,
            /** This field holds the slot of the corresponding upgrade. */
            @SerialName("upgrade_slot_indices")
            val upgradeSlotIndices: List<Int>? = null,
            /** This field holds an array of item IDs for each infusion applied to the item. */
            val infusions: List<GW2ItemId>? = null,
            /** This field holds contains information on the stats chosen if the item offers an option for stats/prefix. */
            val stats: Stats? = null,
            /** This field holds the binding of the material. */
            val binding: String? = null,
            /** This field holds name of the character the item is bound to. */
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
                /** This field holds the itemstat ID. */
                val id: GW2ItemStatId,
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

    }

}