/*
 * Copyright (c) 2018-2022 Leon Linhart
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
 * Information about a character.
 *
 * @param name the character's name
 * @param race the ID of the character's race
 * @param gender the character's gender
 * @param profession the ID of the characters's profession
 * @param level the character's level
 * @param guild the ID of the character's represented guild
 * @param age the amount of seconds the character was played
 * @param created the ISO-8601 standard timestamp of when the character was created
 * @param lastModified the ISO-8601 standard timestamp of when the API record of the character was last modified
 * @param deaths the amount of times the character has been defeated
 * @param title the ID of the character's selected title
 * @param wvwAbilities information about the WvW abilities of the character
 * @param flags various additional flags
 * @param buildTabsUnlocked the number of build tabs unlocked for the character
 * @param activeBuildTab the ID of the character's active build tab
 * @param equipmentTabsUnlocked the number of equipment tabs unlocked for the character
 * @param activeEquipmentTab the ID of the character's active equipment tab
 * @param backstory the IDs of the character's backstory answers
 * @param buildTabs the character's build tabs
 * @param crafting the character's crafting disciplines
 * @param equipment the character's equipment
 * @param equipmentTabs the character's equipment tabs
 * @param bags the character's inventory bags
 * @param recipes the IDs of the character's crafting recipes
 * @param training the training information for a character's trained skill-trees
 */
@Serializable
public data class GW2v2Character(
    val name: String,
    val race: String,
    val gender: String,
    val profession: String,
    val level: Int,
    val guild: String? = null,
    val age: Int,
    val created: String,
    @SerialName("last_modified")
    val lastModified: String,
    val deaths: Int,
    val title: Int? = null,
    @SerialName("wvw_abilities")
    val wvwAbilities: List<WvWAbility>,
    val flags: List<String>,
    @SerialName("build_tabs_unlocked")
    val buildTabsUnlocked: Int,
    @SerialName("active_build_tab")
    val activeBuildTab: Int,
    @SerialName("equipment_tabs_unlocked")
    val equipmentTabsUnlocked: Int,
    @SerialName("active_equipment_tab")
    val activeEquipmentTab: Int,
    val backstory: List<String>,
    @SerialName("build_tabs")
    val buildTabs: List<GW2v2CharactersBuildTab>,
    val crafting: List<Discipline>,
    val equipment: List<EquipmentSlot>,
    @SerialName("equipment_tabs")
    val equipmentTabs: List<CharactersEquipmentTab>,
    val bags: List<Bag>,
    val recipes: List<Int>,
    val training: List<Training>
) {

    /**
     * Information about a character's WvW ability.
     *
     * @param id the ability's ID
     * @param rank the ability's rank
     */
    @Serializable
    public data class WvWAbility(
        val id: Int,
        val rank: Int
    )

    /**
     * Information about a character's PvP equipment.
     *
     * @param amulet the ID of the character's PvP amulet
     * @param rune the ID of the character's PvP rune
     * @param sigils the IDs of the character's PvP sigils
     */
    @Serializable
    public data class EquipmentPvP(
        val amulet: Int? = null,
        val rune: Int? = null,
        val sigils: List<Int?>
    )

    /**
     * Information about a character's crafting discipline.
     *
     * @param discipline the name of the discipline
     * @param rating the character's crafting level for the discipline
     * @param active a flag indicating whether or not the discipline is currently active on the character
     */
    @Serializable
    public data class Discipline(
        val discipline: String,
        val rating: Int,
        val active: Boolean
    )

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

    /**
     * Information about a character's trained skill-tree.
     *
     * @param id the skill tree's ID
     * @param spent the amount of hero points spent in the tree
     * @param done a flag indicating whether or not the tree is fully trained
     */
    @Serializable
    public data class Training(
        val id: Int,
        val spent: Int,
        val done: Boolean
    )

    /**
     * Information about a character's equipment tab.
     *
     * @param tab the tab's ID
     * @param name the equipment configuration's name
     * @param isActive a flag indicating whether or not this tab is the active tab
     * @param equipment the stored equipment
     * @param equipmentPvP the character's PvP equipment
     */
    @Serializable
    public data class CharactersEquipmentTab(
        val tab: Int,
        val name: String,
        @SerialName("is_active")
        val isActive: Boolean,
        val equipment: List<Equipment>,
        @SerialName("equipment_pvp")
        val equipmentPvP: PvPEquipment
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
            val id: Int,
            val slot: String,
            val skin: Int? = null,
            val dyes: List<Int?>? = null,
            val upgrades: List<Int>? = null,
            val infusions: List<Int>? = null,
            val binding: String? = null,
            @SerialName("bound_to")
            val boundTo: String? = null,
            val location: String,
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

        /**
         * Information about a character's PvP equipment.
         *
         * @param amulet the ID of the selected amulet
         * @param rune the ID of the selected rune
         * @param sigils the IDs of the selected sigils
         */
        @Serializable
        public data class PvPEquipment(
            val amulet: Int,
            val rune: Int,
            val sigils: List<Int?>
        )

    }

}