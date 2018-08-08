/*
 * Copyright 2018 Leon Linhart
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gw2api.v2

import kotlinx.serialization.*

/**
 * This resource returns information about player accounts. This endpoint is only accessible with a valid API key.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/account]
 *
 * @param id            the unique persistent account GUID
 * @param age           the age of the account in seconds
 * @param name          the unique account name with numerical suffix
 * @param world         the id of the home world the account is assigned to (can be resolved via /v2/worlds)
 * @param commander     true if the player has bought a commander tag
 * @param guilds        a list of guilds assigned to the given account
 * @param access        a list of what content this account has access to
 * @param fractalLevel  the account's personal fractal reward level (requires the additional progression scope)
 * @param dailyAP       the daily AP the account has (requires the additional progression scope)
 * @param monthlyAP     the monthly AP the account has (requires the additional progression scope)
 * @param wvwRank       the account's personal wvw rank (requires the additional progression scope)
 *
 * @see gw2v2Account
 *
 * @since   0.1.0 (API: 2015-02-24)
 */
@Serializable
data class GW2v2Account(
    /** @since  0.1.0 (API: 2015-02-24) */
    val id: String,
    /** @since  0.1.0 (API: 2016-12-09) */
    val age: Long,
    /** @since  0.1.0 (API: 2015-02-24) */
    val name: String,
    /** @since  0.1.0 (API: 2015-02-24) */
    val world: Int,
    /** @since  0.1.0 (API: 2015-06-18) */
    val commander: Boolean,
    /** @since  0.1.0 (API: 2015-03-27) */
    val guilds: Collection<String>,
    /** @since  0.1.0 (API: 2015-10-13) */
    val access: Collection<String>,
    /** @since  0.1.0 (API: 2015-06-12) */
    val created: String,
    /** @since  0.1.0 (API: 2015-11-29) */
    @SerialName("guild_leader")
    val guildLeader: Collection<String>,
    /** @since  0.1.0 (API: 2016-06-18) */
    @Optional
    @SerialName("fractal_level")
    val fractalLevel: Int? = null,
    /** @since  0.1.0 (API: 2015-12-22) */
    @Optional
    @SerialName("daily_ap")
    val dailyAP: Int? = null,
    /** @since  0.1.0 (API: 2015-12-22) */
    @Optional
    @SerialName("monthly_ap")
    val monthlyAP: Int? = null,
    /** @since  0.1.0 (API: 2016-03-05) */
    @Optional
    @SerialName("wvw_rank")
    val wvwRank: Int? = null
)

/**
 * This resource returns the current build id of the game. This can be used, for example, to register when event timers
 * reset due to server restarts.
 *
 * ## Example
 *
 * `https://api.guildwars2.com/v2/build`
 *
 * ```
 * {
 *   "id": 45075
 * }
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/build]
 *
 * @param id    the current build id as number
 *
 * @see gw2v2Build
 *
 * @since   0.1.0 (API: 2015-02-13)
 */
@Serializable
data class GW2v2Build(
    /** @since  0.1.0 (API: 2015-02-13) */
    val id: Int
)

/**
 * This resource returns information about cats.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/build]
 *
 * @param id    the id of the cat
 * @param hint  the hint for the cat
 *
 * @see gw2v2CatsIds
 * @see gw2v2CatsById
 * @see gw2v2CatsByIds
 * @see gw2v2CatsByPage
 * @see gw2v2CatsAll
 *
 * @since   0.1.0 (API: 2017-05-26)
 */
@Serializable
data class GW2v2Cat(
    /** @since  0.1.0 (API: 2017-05-26) */
    val id: Int,
    /** @since  0.1.0 (API: 2017-05-26) */
    val hint: String
)

/**
 * This resource returns information about characters attached to a specific account.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param name              the character's name
 * @param race              the character's race
 * @param gender            the character's gender
 * @param profession        the character's profession
 * @param level             the character's level
 * @param guild             the guild id of the character's currently represented guild (Optional)
 * @param age               the amount of seconds this character was played
 * @param created           ISO 8601 representation of the character's creation time
 * @param deaths            the amount of times the character has been defeated
 * @param title             the id of the character's currently selected title (Optional)
 * @param crafting          an array containing an entry for each crafting discipline the character has unlocked
 * @param equipment         an array containing an entry for each piece of equipment currently on the selected character
 * @param bags              contains one object structure per bag in the character's inventory
 * @param skills            contains the pve, pvp, and wvw objects for the current utilities equipped
 * @param specializations   contains the pve, pvp, and wvw objects for the current specializations and traits equipped
 * @param training          contains objects for each skill tree trained
 * @param wvwAbilities      contains information on each trained wvw ability
 * @param equipmentPvP      contains information on character's pvp equipment setup
 * @param flags             returns character flags
 *
 * @since   0.1.0 (API: 2015-03-04)
 */
@Serializable
data class GW2v2Character(
    /** @since  0.1.0 (API: 2015-03-04) */
    val name: String,
    /** @since  0.1.0 (API: 2015-03-04) */
    val race: String,
    /** @since  0.1.0 (API: 2015-03-04) */
    val gender: String,
    /** @since  0.1.0 (API: 2015-03-04) */
    val profession: String,
    /** @since  0.1.0 (API: 2015-03-04) */
    val level: Int,
    /** @since  0.1.0 (API: 2015-03-04) */
    @Optional
    val guild: String? = null,
    /** @since  0.1.0 (API: 2015-06-12) */
    val age: Int,
    /** @since  0.1.0 (API: 2015-06-12) */
    val created: String,
    /** @since  0.1.0 (API: 2015-06-12) */
    val deaths: Int,
    /** @since  0.1.0 (API: 2016-04-16) */
    @Optional
    val title: Int? = null,
    /** @since  0.1.0 (API: 2016-05-19) */
    val backstory: Collection<String>,
    /** @since  0.1.0 (API: 2015-07-01) */
    val crafting: Collection<CraftingDiscipline>,
    /** @since  0.1.0 (API: 2015-06-18) */
    val equipment: Collection<EquipmentSlot>,
    /** @since  0.1.0 (API: 2015-06-18) */
    val bags: Collection<Bag?>,
    /** @since  0.1.0 (API: 2015-12-03) */
    val recipes: Collection<Int>,
    /** @since  0.1.0 (API: 2016-01-15) */
    val skills: Skills,
    /** @since  0.1.0 (API: 2015-08-22) */
    val specializations: Specializations,
    /** @since  0.1.0 (API: 2016-06-01) */
    val training: Collection<Tree>,
    /** @since  0.1.0 (API: 2016-09-29) */
    @SerialName("wvw_abilities")
    val wvwAbilities: Collection<WvWAbility>,
    /** @since  0.1.0 (API: 2016-03-25) */
    @SerialName("equipment_pvp")
    val equipmentPvP: EquipmentPvP,
    /** @since  0.1.0 (API: 2015-03-04) */
    @Optional
    val flags: Collection<String>? = null
) {

    /**
     * @param discipline    the name of the discipline
     * @param rating        the current crafting level for the given discipline and character
     * @param active        describes if the given discipline is currently active or not on the character
     *
     * @since  0.1.0 (API: 2015-07-01)
     */
    @Serializable
    data class CraftingDiscipline(
        /** @since  0.1.0 (API: 2015-07-01) */
        val discipline: String,
        /** @since  0.1.0 (API: 2015-07-01) */
        val rating: Int,
        /** @since  0.1.0 (API: 2015-07-01) */
        val active: Boolean
    )

    /**
     * @param id        the item id, resolvable against `/v2/items`
     * @param slot      the equipment slot in which the item is slotted
     * @param infusions returns an array of infusion item ids which can be resolved against /v2/items (Optional)
     * @param upgrades  returns an array of upgrade component item ids which can be resolved against /v2/items (Optional)
     * @param skin      skin id for the given equipment piece which can be resolved against /v2/skins (Optional)
     * @param stats     contains information on the stats chosen if the item offers an option for stats/prefix (Optional)
     * @param charges   the amount of charges remaining on the item (Optional)
     * @param binding   describes which kind of binding the item has (Optional)
     * @param boundTo   name of the character the item is bound to (Optional - only if character bound)
     * @param dyes      array of selected dyes for the equipment piece (Values default to `null` if no dye is selected)
     *                  (Optional)
     *
     * @since   0.1.0 (API: 2015-06-18)
     */
    @Serializable
    data class EquipmentSlot(
        /** @since  0.1.0 (API: 2015-06-18) */
        val id: Int,
        /** @since  0.1.0 (API: 2015-06-18) */
        val slot: String,
        /** @since  0.1.0 (API: 2015-06-18) */
        @Optional
        val infusions: Collection<Int>? = null,
        /** @since  0.1.0 (API: 2015-06-18) */
        @Optional
        val upgrades: Collection<Int>? = null,
        /** @since  0.1.0 (API: 2015-06-18) */
        @Optional
        val skin: Int? = null,
        /** @since  0.1.0 (API: 2016-05-18) */
        @Optional
        val stats: Stats? = null,
        /** @since  0.1.0 (API: 2015-06-18) */
        @Optional
        val charges: Int? = null,
        /** @since  0.1.0 (API: 2015-06-18) */
        @Optional
        val binding: String? = null,
        /** @since  0.1.0 (API: 2015-06-18) */
        @Optional
        @SerialName("bound_to")
        val boundTo: String? = null,
        /** @since  0.1.0 (API: 2017-04-20) */
        @Optional
        val dyes: Collection<Int?>? = null
    ) {

        /**
         * @param id            the itemstat id, can be resolved against `/v2/itemstats`
         * @param attributes    contains a summary of the stats on the item
         *
         * @since   0.1.0 (API: 2015-06-18)
         */
        @Serializable
        data class Stats(
            /** @since  0.1.0 (API: 2015-06-18) */
            val id: Int,
            /** @since  0.1.0 (API: 2015-06-18) */
            val attributes: Attributes
        ) {

            /**
             * @param power             shows the amount of power given (Optional)
             * @param precision         shows the amount of Precision given (Optional)
             * @param toughness         shows the amount of Toughness given (Optional)
             * @param vitality          shows the amount of Vitality given (Optional)
             * @param conditionDamage   shows the amount of Condition Damage given (Optional)
             * @param conditionDuration shows the amount of Condition Duration given (Optional)
             * @param healing           shows the amount of Healing Power given (Optional)
             * @param boonDuration      shows the amount of Boon Duration given (Optional)
             * @param critDamage        shows the amount of Crit Damage given (Optional)
             *
             * @since   0.1.0 (API: 2015-06-18)
             */
            @Serializable
            data class Attributes(
                /** @since  0.1.0 (API: 2015-06-18) */
                @Optional
                @SerialName("Power")
                val power: Int? = null,
                /** @since  0.1.0 (API: 2015-06-18) */
                @Optional
                @SerialName("Precision")
                val precision: Int? = null,
                /** @since  0.1.0 (API: 2015-06-18) */
                @Optional
                @SerialName("Toughness")
                val toughness: Int? = null,
                /** @since  0.1.0 (API: 2015-06-18) */
                @Optional
                @SerialName("Vitality")
                val vitality: Int? = null,
                /** @since  0.1.0 (API: 2015-06-18) */
                @Optional
                @SerialName("ConditionDamage")
                val conditionDamage: Int? = null,
                /** @since  0.1.0 (API: 2015-06-18) */
                @Optional
                @SerialName("ConditionDuration")
                val conditionDuration: Int? = null,
                /** @since  0.1.0 (API: 2015-06-18) */
                @Optional
                @SerialName("Healing")
                val healing: Int? = null,
                /** @since  0.1.0 (API: 2015-06-18) */
                @Optional
                @SerialName("BoonDuration")
                val boonDuration: Int? = null,
                /** @since  0.1.0 (API: 2016-05-19) */
                @Optional
                @SerialName("CritDamage")
                val critDamage: Int? = null
            )

        }

    }

    /**
     * @param id        the bag's item id which can be resolved against `/v2/items`
     * @param size      the amount of slots available with this bag
     * @param inventory contains one object structure per item, object is `null` if no item is in the given bag slot
     *
     * @since   0.1.0 (API: 2015-06-18)
     */
    @Serializable
    data class Bag(
        /** @since  0.1.0 (API: 2015-06-18) */
        val id: Int,
        /** @since  0.1.0 (API: 2015-06-18) */
        val size: Int,
        /** @since  0.1.0 (API: 2015-06-18) */
        val inventory: Collection<Slot?>
    ) {

        /**
         * @param id        the item id which can be resolved against `/v2/items`
         * @param count     amount of item in the stack. (In range [1,250])
         * @param infusions returns an array of infusion item ids which can be resolved against `/v2/items` (Optional)
         * @param upgrades  returns an array of upgrade component item ids which can be resolved against `/v2/items`
         *                  (Optional)
         * @param skin      skin id for the given equipment piece (Optional)
         * @param stats     contains information on the stats chosen if the item offers an option for stats/prefix
         *                  (Optional)
         * @param charges   the amount of charges remaining on the item (Optional)
         * @param binding   describes which kind of binding the item has (Optional)
         * @param boundTo   name of the character the item is bound to (Optional)
         *
         * @since   0.1.0 (API: 2015-06-18)
         */
        @Serializable
        data class Slot(
            /** @since  0.1.0 (API: 2015-06-18) */
            val id: Int,
            /** @since  0.1.0 (API: 2015-06-18) */
            val count: Int,
            /** @since  0.1.0 (API: 2015-06-18) */
            @Optional
            val infusions: Collection<Int>? = null,
            /** @since  0.1.0 (API: 2015-06-18) */
            @Optional
            val upgrades: Collection<Int>? = null,
            /** @since  0.1.0 (API: 2015-06-18) */
            @Optional
            val skin: Int? = null,
            /** @since  0.1.0 (API: 2015-06-18) */
            @Optional
            val stats: Stats? = null,
            /** @since  0.1.0 (API: 2015-06-18) */
            @Optional
            val charges: Int? = null,
            /** @since  0.1.0 (API: 2015-10-29) */
            @Optional
            val binding: String? = null,
            /** @since  0.1.0 (API: 2015-10-29) */
            @Optional
            @SerialName("bound_to")
            val boundTo: String? = null,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Optional
            val dyes: Collection<Int?>? = null
        ) {

            /**
             * @param id            the itemstat id, can be resolved against `/v2/itemstats`
             * @param attributes    contains a summary of the stats on the item
             *
             * @since   0.1.0 (API: 2016-05-18)
             */
            @Serializable
            data class Stats(
                /** @since  0.1.0 (API: 2015-06-18) */
                val id: Int,
                /** @since  0.1.0 (API: 2015-06-18) */
                val attributes: Attributes
            ) {

                /**
                 * @param power             shows the amount of power given (Optional)
                 * @param precision         shows the amount of Precision given (Optional)
                 * @param toughness         shows the amount of Toughness given (Optional)
                 * @param vitality          shows the amount of Vitality given (Optional)
                 * @param conditionDamage   shows the amount of Condition Damage given (Optional)
                 * @param conditionDuration shows the amount of Condition Duration given (Optional)
                 * @param healing           shows the amount of Healing Power given (Optional)
                 * @param boonDuration      shows the amount of Boon Duration given (Optional)
                 * @param critDamage        shows the amount of Crit Damage given (Optional)
                 *
                 * @since   0.1.0 (API: 2015-05-18)
                 */
                @Serializable
                data class Attributes(
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Optional
                    @SerialName("Power")
                    val power: Int? = null,
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Optional
                    @SerialName("Precision")
                    val precision: Int? = null,
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Optional
                    @SerialName("Toughness")
                    val toughness: Int? = null,
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Optional
                    @SerialName("Vitality")
                    val vitality: Int? = null,
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Optional
                    @SerialName("ConditionDamage")
                    val conditionDamage: Int? = null,
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Optional
                    @SerialName("ConditionDuration")
                    val conditionDuration: Int? = null,
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Optional
                    @SerialName("Healing")
                    val healing: Int? = null,
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Optional
                    @SerialName("BoonDuration")
                    val boonDuration: Int? = null,
                    /** @since  0.1.0 (API: 2016-05-19) */
                    @Optional
                    @SerialName("CritDamage")
                    val critDamage: Int? = null
                )

            }

        }

    }

    /**
     * @param pve   contains the information on each slotted utility for PvE
     * @param pvp   contains the information on each slotted utility for PvP
     * @param wvw   contains the information on each slotted utility for WvW
     *
     * @since   0.1.0 (API: 2016-01-15)
     */
    @Serializable
    data class Skills(
        /** @since  0.1.0 (API: 2016-01-15) */
        val pve: SkillSet,
        /** @since  0.1.0 (API: 2016-01-15) */
        val pvp: SkillSet,
        /** @since  0.1.0 (API: 2016-01-15) */
        val wvw: SkillSet
    ) {

        /**
         * @param heal      contains the skill id for the heal skill, resolvable against `/v2/skills`
         * @param utilities each integer corresponds to a skill id for the equipped utilities, resolvable against
         *                  `/v2/skills`
         * @param elite     contains the skill id for the elite skill, resolvable against `/v2/skills`
         * @param legends   each string corresponds to a Revenant legend, resolvable against `/v2/legends` (Optional -
         *                  revenant only)
         *
         * @since   0.1.0 (API: 2016-05-16)
         */
        @Serializable
        data class SkillSet(
            /** @since  0.1.0 (API: 2016-05-16) */
            val heal: Int?,
            /** @since  0.1.0 (API: 2016-05-16) */
            val utilities: Collection<Int?>,
            /** @since  0.1.0 (API: 2016-05-16) */
            val elite: Int?,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Optional
            val legends: Collection<String>? = null,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Optional
            val pets: Pets? = null
        ) {

            /**
             * @param terrestrial   terrestrial pets
             * @param aquatic       aquatic pets
             *
             * @since   0.1.0 (API: 2016-05-16)
             */
            @Serializable
            data class Pets(
                /** @since  0.1.0 (API: 2016-05-16) */
                val terrestrial: Collection<Int?>,
                /** @since  0.1.0 (API: 2016-05-16) */
                val aquatic: Collection<Int?>
            )

        }

    }

    /**
     * @param pve   contains the information on each slotted specialization and trait for PvE
     * @param pvp   contains the information on each slotted specialization and trait for PvP
     * @param wvw   contains the information on each slotted specialization and trait for WvW
     *
     * @since   0.1.0 (API: 2015-08-22)
     */
    @Serializable
    data class Specializations(
        /** @since  0.1.0 (API: 2015-08-22) */
        val pve: Collection<Specialization?>,
        /** @since  0.1.0 (API: 2015-08-22) */
        val pvp: Collection<Specialization?>,
        /** @since  0.1.0 (API: 2015-08-22) */
        val wvw: Collection<Specialization?>
    ) {

        /**
         * @param id        specialization id
         * @param traits    returns ids for each selected trait
         *
         * @since   0.1.0 (API: 2015-08-22)
         */
        @Serializable
        data class Specialization(
            /** @since  0.1.0 (API: 2015-08-22) */
            val id: Int,
            /** @since  0.1.0 (API: 2015-08-22) */
            val traits: Collection<Int?>
        )

    }

    /**
     * @param id    skill tree id, can be compared against the training section for each /v2/professions
     * @param spent shows how many hero points have been spent in this tree
     * @param done  states whether or not the tree is fully trained
     *
     * @since   0.1.0 (API: 2016-06-01)
     */
    @Serializable
    data class Tree(
        /** @since  0.1.0 (API: 2016-06-01) */
        val id: Int,
        /** @since  0.1.0 (API: 2016-06-01) */
        val spent: Int,
        /** @since  0.1.0 (API: 2016-06-01) */
        val done: Boolean
    )

    /**
     * @param id    ability id, can be resolved against `/v2/wvw/abilities`
     * @param rank  current rank for the given ability
     *
     * @since   0.1.0 (API: 2016-09-29)
     */
    @Serializable
    data class WvWAbility(
        /** @since  0.1.0 (API: 2016-09-29) */
        val id: Int,
        /** @since  0.1.0 (API: 2016-09-29) */
        val rank: Int
    )

    /**
     * @param amulet    id for the equipped pvp amulet
     * @param rune      id for the equipped pvp rune
     * @param sigils    returns the id for all equipped pvp sigils
     *
     * @since   0.1.0 (API: 2016-03-25)
     */
    @Serializable
    data class EquipmentPvP(
        /** @since  0.1.0 (API: 2016-03-25) */
        val amulet: Int?,
        /** @since  0.1.0 (API: 2016-03-25) */
        val rune: Int?,
        /** @since  0.1.0 (API: 2016-03-25) */
        val sigils: Collection<Int?>
    )

}

/**
 * Backstory information of a single character.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param backstory an array of strings representing backstory answer ids pertaining to the questions answered during character creation
 *
 * @since   0.1.0 (API: 2016-05-19)
 */
@Serializable
data class GW2v2CharactersBackstory(
    /** @since  0.1.0 (API: 2016-05-19) */
    val backstory: Collection<String>
)

/**
 * Core information (name, race, ...) of a single character.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param name          the character's name
 * @param race          the character's race
 * @param gender        the character's gender
 * @param profession    the character's profession
 * @param level         the character's level
 * @param guild         the guild id of the character's currently represented guild (Optional)
 * @param age           the amount of seconds this character was played
 * @param created       ISO 8601 representation of the character's creation time
 * @param deaths        the amount of times this character has been defeated
 * @param title         the currently selected title for the character (Optional)
 *
 * @since   0.1.0 (API: 2016-05-19)
 */
@Serializable
data class GW2v2CharactersCore(
    /** @since  0.1.0 (API: 2016-05-19) */
    val name: String,
    /** @since  0.1.0 (API: 2016-05-19) */
    val race: String,
    /** @since  0.1.0 (API: 2016-05-19) */
    val gender: String,
    /** @since  0.1.0 (API: 2016-05-19) */
    val profession: String,
    /** @since  0.1.0 (API: 2016-05-19) */
    val level: Int,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Optional
    val guild: String? = null,
    /** @since  0.1.0 (API: 2016-05-19) */
    val age: Int,
    /** @since  0.1.0 (API: 2016-05-19) */
    val created: String,
    /** @since  0.1.0 (API: 2016-05-19) */
    val deaths: Int,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Optional
    val title: Int? = null
)

/**
 * Crafting disciplines of a single character.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param crafting   a list of crafting disciplines
 *
 * @since  0.1.0 (API: 2016-05-19)
 */
@Serializable
data class GW2v2CharactersCrafting(
    val crafting: Collection<Discipline>
) {

    /**
     * @param discipline    the name of the discipline
     * @param rating        the current crafting level for the given discipline and character
     * @param active        describes if the given discipline is currently active or not on the character
     *
     * @since  0.1.0 (API: 2016-05-19)
     */
    @Serializable
    data class Discipline(
        /** @since  0.1.0 (API: 2016-05-19) */
        val discipline: String,
        /** @since  0.1.0 (API: 2016-05-19) */
        val rating: Int,
        /** @since  0.1.0 (API: 2016-05-19) */
        val active: Boolean
    )

}

/**
 * Equipment of a single character.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param equipment an array containing an entry for each piece of equipment currently on the selected character
 *
 * @since   0.1.0 (API: 2016-05-19)
 */
@Serializable
data class GW2v2CharactersEquipment(
    /** @since  0.1.0 (API: 2016-05-19) */
    val equipment: Collection<Item>
) {

    /**
     * @param id        the item id, resolvable against `/v2/items`
     * @param slot      the equipment slot in which the item is slotted
     * @param infusions returns an array of infusion item ids which can be resolved against /v2/items (Optional)
     * @param upgrades  returns an array of upgrade component item ids which can be resolved against /v2/items (Optional)
     * @param skin      skin id for the given equipment piece which can be resolved against /v2/skins (Optional)
     * @param stats     contains information on the stats chosen if the item offers an option for stats/prefix (Optional)
     * @param charges   the amount of charges remaining on the item (Optional)
     * @param binding   describes which kind of binding the item has (Optional)
     * @param boundTo   name of the character the item is bound to (Optional - only if character bound)
     * @param dyes      array of selected dyes for the equipment piece (Values default to `null` if no dye is selected)
     *                  (Optional)
     *
     * @since   0.1.0 (API: 2016-05-19)
     */
    @Serializable
    data class Item(
        /** @since  0.1.0 (API: 2016-05-19) */
        val id: Int,
        /** @since  0.1.0 (API: 2016-05-19) */
        val slot: String,
        /** @since  0.1.0 (API: 2016-05-19) */
        @Optional
        val infusions: Collection<Int>? = null,
        /** @since  0.1.0 (API: 2016-05-19) */
        @Optional
        val upgrades: Collection<Int>? = null,
        /** @since  0.1.0 (API: 2016-05-19) */
        @Optional
        val skin: Int? = null,
        /** @since  0.1.0 (API: 2016-05-19) */
        @Optional
        val stats: Stats? = null,
        /** @since  0.1.0 (API: 2016-05-19) */
        @Optional
        val binding: String? = null,
        /** @since  0.1.0 (API: 2016-06-28) */
        @Optional
        val charges: Int? = null,
        /** @since  0.1.0 (API: 2016-05-19) */
        @Optional
        @SerialName("bound_to")
        val boundTo: String? = null,
        /** @since  0.1.0 (API: 2017-04-20) */
        @Optional
        val dyes: Collection<Int?>? = null
    ) {

        /**
         * @param id            the itemstat id, can be resolved against `/v2/itemstats`
         * @param attributes    contains a summary of the stats on the item
         *
         * @since   0.1.0 (API: 2016-05-19)
         */
        @Serializable
        data class Stats(
            /** @since  0.1.0 (API: 2016-05-19) */
            val id: Int,
            /** @since  0.1.0 (API: 2016-05-19) */
            val attributes: Attributes
        ) {

            /**
             * @param power             shows the amount of power given (Optional)
             * @param precision         shows the amount of Precision given (Optional)
             * @param toughness         shows the amount of Toughness given (Optional)
             * @param vitality          shows the amount of Vitality given (Optional)
             * @param conditionDamage   shows the amount of Condition Damage given (Optional)
             * @param conditionDuration shows the amount of Condition Duration given (Optional)
             * @param healing           shows the amount of Healing Power given (Optional)
             * @param boonDuration      shows the amount of Boon Duration given (Optional)
             * @param critDamage        shows the amount of Crit Damage given (Optional)
             *
             * @since   0.1.0 (API: 2016-05-19)
             */
            @Serializable
            data class Attributes(
                /** @since  0.1.0 (API: 2016-05-19) */
                @Optional
                @SerialName("Power")
                val power: Int? = null,
                /** @since  0.1.0 (API: 2016-05-19) */
                @Optional
                @SerialName("Precision")
                val precision: Int? = null,
                /** @since  0.1.0 (API: 2016-05-19) */
                @Optional
                @SerialName("Toughness")
                val toughness: Int? = null,
                /** @since  0.1.0 (API: 2016-05-19) */
                @Optional
                @SerialName("Vitality")
                val vitality: Int? = null,
                /** @since  0.1.0 (API: 2016-05-19) */
                @Optional
                @SerialName("ConditionDamage")
                val conditionDamage: Int? = null,
                /** @since  0.1.0 (API: 2016-05-19) */
                @Optional
                @SerialName("ConditionDuration")
                val conditionDuration: Int? = null,
                /** @since  0.1.0 (API: 2016-05-19) */
                @Optional
                @SerialName("Healing")
                val healing: Int? = null,
                /** @since  0.1.0 (API: 2016-05-19) */
                @Optional
                @SerialName("BoonDuration")
                val boonDuration: Int? = null,
                /** @since  0.1.0 (API: 2016-05-19) */
                @Optional
                @SerialName("CritDamage")
                val critDamage: Int? = null
            )

        }

    }

}

/**
 * Inventory of a single character.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param bags  contains one object structure per bag in the character's inventory
 *
 * @since   0.1.0 (API: 2016-05-16)
 */
@Serializable
data class GW2v2CharactersInventory(
    /** @since  0.1.0 (API: 2016-05-16) */
    val bags: Collection<Bag?>
) {

    /**
     * @param id        the bag's item id which can be resolved against `/v2/items`
     * @param size      the amount of slots available with this bag
     * @param inventory contains one object structure per item, object is `null` if no item is in the given bag slot
     *
     * @since   0.1.0 (API: 2016-05-16)
     */
    @Serializable
    data class Bag(
        /** @since  0.1.0 (API: 2016-05-16) */
        val id: Int,
        /** @since  0.1.0 (API: 2016-05-16) */
        val size: Int,
        /** @since  0.1.0 (API: 2016-05-16) */
        val inventory: Collection<Slot?>
    ) {

        /**
         * @param id        the item id which can be resolved against `/v2/items`
         * @param count     amount of item in the stack. (In range [1,250])
         * @param infusions returns an array of infusion item ids which can be resolved against `/v2/items` (Optional)
         * @param upgrades  returns an array of upgrade component item ids which can be resolved against `/v2/items`
         *                  (Optional)
         * @param skin      skin id for the given equipment piece (Optional)
         * @param stats     contains information on the stats chosen if the item offers an option for stats/prefix
         *                  (Optional)
         * @param binding   describes which kind of binding the item has (Optional)
         * @param boundTo   name of the character the item is bound to (Optional)
         *
         * @since   0.1.0 (API: 2016-05-16)
         */
        @Serializable
        data class Slot(
            /** @since  0.1.0 (API: 2016-05-16) */
            val id: Int,
            /** @since  0.1.0 (API: 2016-05-16) */
            val count: Int,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Optional
            val infusions: Collection<Int>? = null,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Optional
            val upgrades: Collection<Int>? = null,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Optional
            val skin: Int? = null,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Optional
            val stats: Stats? = null,
            /** @since  0.1.0 (API: 2015-06-18) */
            @Optional
            val charges: Int? = null,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Optional
            val binding: String? = null,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Optional
            @SerialName("bound_to")
            val boundTo: String? = null,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Optional
            val dyes: Collection<Int?>? = null
        ) {

            /**
             * @param id            the itemstat id, can be resolved against `/v2/itemstats`
             * @param attributes    contains a summary of the stats on the item
             *
             * @since   0.1.0 (API: 2016-05-16)
             */
            @Serializable
            data class Stats(
                /** @since  0.1.0 (API: 2016-05-16) */
                val id: Int,
                /** @since  0.1.0 (API: 2016-05-16) */
                val attributes: Attributes
            ) {

                /**
                 * @param power             shows the amount of power given (Optional)
                 * @param precision         shows the amount of Precision given (Optional)
                 * @param toughness         shows the amount of Toughness given (Optional)
                 * @param vitality          shows the amount of Vitality given (Optional)
                 * @param conditionDamage   shows the amount of Condition Damage given (Optional)
                 * @param conditionDuration shows the amount of Condition Duration given (Optional)
                 * @param healing           shows the amount of Healing Power given (Optional)
                 * @param boonDuration      shows the amount of Boon Duration given (Optional)
                 * @param critDamage        shows the amount of Crit Damage given (Optional)
                 *
                 * @since   0.1.0 (API: 2016-05-16)
                 */
                @Serializable
                data class Attributes(
                    /** @since  0.1.0 (API: 2016-05-16) */
                    @Optional
                    @SerialName("Power")
                    val power: Int? = null,
                    /** @since  0.1.0 (API: 2016-05-16) */
                    @Optional
                    @SerialName("Precision")
                    val precision: Int? = null,
                    /** @since  0.1.0 (API: 2016-05-16) */
                    @Optional
                    @SerialName("Toughness")
                    val toughness: Int? = null,
                    /** @since  0.1.0 (API: 2016-05-16) */
                    @Optional
                    @SerialName("Vitality")
                    val vitality: Int? = null,
                    /** @since  0.1.0 (API: 2016-05-16) */
                    @Optional
                    @SerialName("ConditionDamage")
                    val conditionDamage: Int? = null,
                    /** @since  0.1.0 (API: 2016-05-16) */
                    @Optional
                    @SerialName("ConditionDuration")
                    val conditionDuration: Int? = null,
                    /** @since  0.1.0 (API: 2016-05-16) */
                    @Optional
                    @SerialName("Healing")
                    val healing: Int? = null,
                    /** @since  0.1.0 (API: 2016-05-16) */
                    @Optional
                    @SerialName("BoonDuration")
                    val boonDuration: Int? = null,
                    /** @since  0.1.0 (API: 2016-05-19) */
                    @Optional
                    @SerialName("CritDamage")
                    val critDamage: Int? = null
                )

            }

        }

    }

}

/**
 * Unlocked recipes of a single character.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param recipes   an array of ids of unlocked recipes
 *
 * @since   0.1.0 (API: 2016-05-16)
 */
@Serializable
data class GW2v2CharactersRecipes(
    /** @since  0.1.0 (API: 2016-05-16) */
    val recipes: Collection<Int>
)

/**
 * Zone progress and unlocks in the SAB for this character.
 *
 * ## Notes
 *
 * ### Unlocks
 *
 * ```
 *  1 = chain_stick
 *  3 = slingshot
 *  6 = whip
 *  9 = mini_bomb
 * 12 = candle
 * 13 = torch
 * 15 = wooden_whistle
 * 18 = digger
 * 19 = nice_scoop
 * 21 = glove_of_wisdom
 * 24 = bauble_purse
 * 25 = bauble_tote_bag
 * 27 = moto_breath
 * 28 = moto_finger
 * 31 = health_vessel_1
 * 32 = health_vessel_2
 * 34 = medium_health_potion
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param zones     contains objects describing which worlds, and in which difficult, have been cleared
 * @param unlocks   contains objects describing the unlocks on the given character
 * @param songs     contains the objects of unlocked songs on the character
 *
 * @since   0.1.0 (API: 2017-04-11)
 */
@Serializable
data class GW2v2CharactersSAB(
    /** @since  0.1.0 (API: 2017-04-11) */
    val zones: Collection<Zone>,
    /** @since  0.1.0 (API: 2017-04-11) */
    val unlocks: Collection<Unlock>,
    /** @since  0.1.0 (API: 2017-04-11) */
    val songs: Collection<Song>
) {

    /**
     * @param id    the world id
     * @param mode  the difficulty mode cleared
     * @param world the world number
     * @param zone  the zone number
     *
     * @since   0.1.0 (API: 2017-04-11)
     */
    @Serializable
    data class Zone(
        /** @since  0.1.0 (API: 2017-04-11) */
        val id: Int,
        /** @since  0.1.0 (API: 2017-04-11) */
        val mode: String,
        /** @since  0.1.0 (API: 2017-04-11) */
        val world: Int,
        /** @since  0.1.0 (API: 2017-04-11) */
        val zone: Int
    )

    /**
     * @param id    the id of the unlock
     * @param name  the name of the upgrade
     *
     * @since   0.1.0 (API: 2017-04-11)
     */
    @Serializable
    data class Unlock(
        /** @since  0.1.0 (API: 2017-04-11) */
        val id: Int,
        /** @since  0.1.0 (API: 2017-04-11) */
        val name: String
    )

    /**
     * @param id    the id of the song
     * @param name  the name of the song
     *
     * @since   0.1.0 (API: 2017-04-11)
     */
    @Serializable
    data class Song(
        /** @since  0.1.0 (API: 2017-04-11) */
        val id: Int,
        /** @since  0.1.0 (API: 2017-04-11) */
        val name: String
    )

}

/**
 * Skills in use by a single character.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param skills    contains the pve, pvp, and wvw objects for the current utilities equipped
 *
 * @since   0.1.0 (API: 2016-05-16)
 */
@Serializable
data class GW2v2CharactersSkills(
    /** @since  0.1.0 (API: 2016-05-16) */
    val skills: Skills
) {

    /**
     * @param pve   contains the information on each slotted utility for PvE
     * @param pvp   contains the information on each slotted utility for PvP
     * @param wvw   contains the information on each slotted utility for WvW
     *
     * @since   0.1.0 (API: 2016-05-16)
     */
    @Serializable
    data class Skills(
        /** @since  0.1.0 (API: 2016-05-16) */
        val pve: SkillSet,
        /** @since  0.1.0 (API: 2016-05-16) */
        val pvp: SkillSet,
        /** @since  0.1.0 (API: 2016-05-16) */
        val wvw: SkillSet
    ) {

        /**
         * @param heal      contains the skill id for the heal skill, resolvable against `/v2/skills`
         * @param utilities each integer corresponds to a skill id for the equipped utilities, resolvable against
         *                  `/v2/skills`
         * @param elite     contains the skill id for the elite skill, resolvable against `/v2/skills`
         * @param legends   each string corresponds to a Revenant legend, resolvable against `/v2/legends` (Optional -
         *                  revenant only)
         *
         * @since   0.1.0 (API: 2016-05-16)
         */
        @Serializable
        data class SkillSet(
            /** @since  0.1.0 (API: 2016-05-16) */
            val heal: Int?,
            /** @since  0.1.0 (API: 2016-05-16) */
            val utilities: Collection<Int?>,
            /** @since  0.1.0 (API: 2016-05-16) */
            val elite: Int?,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Optional
            val legends: Collection<String>? = null,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Optional
            val pets: Pets? = null
        ) {

            /**
             * @param terrestrial   terrestrial pets
             * @param aquatic       aquatic pets
             *
             * @since   0.1.0 (API: 2016-05-16)
             */
            @Serializable
            data class Pets(
                /** @since  0.1.0 (API: 2016-05-16) */
                val terrestrial: Collection<Int?>,
                /** @since  0.1.0 (API: 2016-05-16) */
                val aquatic: Collection<Int?>
            )

        }

    }

}

/**
 * GW2v2Specialization information of a single character.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param specializations   contains the pve, pvp, and wvw objects for the current specializations and traits equipped
 *
 * @since   0.1.0 (API: 2016-05-16)
 */
@Serializable
data class GW2v2CharactersSpecializations(
    /** @since  0.1.0 (API: 2016-05-16) */
    val specializations: Specializations
) {

    /**
     * @param pve   contains the information on each slotted specialization and trait for PvE
     * @param pvp   contains the information on each slotted specialization and trait for PvP
     * @param wvw   contains the information on each slotted specialization and trait for WvW
     *
     * @since   0.1.0 (API: 2016-05-16)
     */
    @Serializable
    data class Specializations(
        /** @since  0.1.0 (API: 2016-05-16) */
        val pve: Collection<Specialization?>,
        /** @since  0.1.0 (API: 2016-05-16) */
        val pvp: Collection<Specialization?>,
        /** @since  0.1.0 (API: 2016-05-16) */
        val wvw: Collection<Specialization?>
    ) {

        /**
         * @param id        specialization id
         * @param traits    returns ids for each selected trait
         *
         * @since   0.1.0 (API: 2016-05-16)
         */
        @Serializable
        data class Specialization(
            /** @since  0.1.0 (API: 2016-05-16) */
            val id: Int,
            /** @since  0.1.0 (API: 2016-05-16) */
            val traits: Collection<Int?>
        )

    }

}

/**
 * GW2v2Specialization information of a single character.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param training  contains objects for each skill tree trained
 *
 * @since   0.1.0 (API: 2016-05-16)
 */
@Serializable
data class GW2v2CharactersTraining(
    /** @since  0.1.0 (API: 2016-05-16) */
    val training: Collection<Tree>
) {

    /**
     * @param id    skill tree id, can be compared against the training section for each /v2/professions
     * @param spent shows how many hero points have been spent in this tree
     * @param done  states whether or not the tree is fully trained
     *
     * @since   0.1.0 (API: 2016-05-16)
     */
    @Serializable
    data class Tree(
        /** @since  0.1.0 (API: 2016-05-16) */
        val id: Int,
        /** @since  0.1.0 (API: 2016-05-16) */
        val spent: Int,
        /** @since  0.1.0 (API: 2016-05-16) */
        val done: Boolean
    )

}

/**
 * This resource returns all dye colors in the game, including localized names and their color component information.
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/colors]
 *
 * @see gw2v2ColorsIds
 * @see gw2v2ColorsById
 * @see gw2v2ColorsByIds
 * @see gw2v2ColorsByPage
 * @see gw2v2ColorsAll
 *
 * @since   0.1.0 (API: 2015-02-13)
 */
@Serializable
data class GW2v2Color(
    /** @since  0.1.0 (API: 2015-02-13) */
    val id: Int,
    /** @since  0.1.0 (API: 2015-02-13) */
    val name: String,
    /** @since  0.1.0 (API: 2015-02-13) */
    @SerialName("base_rgb")
    val baseRGB: Collection<Int>,
    /** @since  0.1.0 (API: 2015-02-13) */
    val cloth: DetailedInformationObject,
    /** @since  0.1.0 (API: 2015-02-13) */
    val leather: DetailedInformationObject,
    /** @since  0.1.0 (API: 2015-02-13) */
    val metal: DetailedInformationObject,
    /** @since  0.1.0 (API: 2015-02-13) */
    @Optional
    val item: Int? = null,
    /** @since  0.1.0 (API: 2015-02-13) */
    val categories: Collection<String>
) {

    /** @since  0.1.0 (API: 2015-02-13) */
    @Serializable
    data class DetailedInformationObject(
        /** @since  0.1.0 (API: 2015-02-13) */
        val brightness: Double,
        /** @since  0.1.0 (API: 2015-02-13) */
        val contrast: Double,
        /** @since  0.1.0 (API: 2015-02-13) */
        val hue: Double,
        /** @since  0.1.0 (API: 2015-02-13) */
        val saturation: Double,
        /** @since  0.1.0 (API: 2015-02-13) */
        val lightness: Double,
        /** @since  0.1.0 (API: 2015-02-13) */
        val rgb: Collection<Int>
    )

}

/**
 * This resource returns a list of the currencies contained in the account wallet.
 *
 * ## Example
 *
 * `https://api.guildwars2.com/v2/currencies/1`
 *
 * ```
 * {
 *   "id": 1,
 *   "name": "Coin",
 *   "description": "The primary currency of Tyria. Spent at vendors throughout the world.",
 *   "order": 10,
 *   "icon": "https://render.guildwars2.com/file/98457F504BA2FAC8457F532C4B30EDC23929ACF9/619316.png"
 * }
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/currencies]
 *
 * @param id            the currency's id
 * @param name          the currency's name
 * @param description   a description of the currency
 * @param order         a number that can be used to sort the list of currencies when ordered from least to greatest (An
 *                      arbitrary number indicating what order the currencies are sorted in-game; lowest currencies come
 *                      first.)
 * @param icon          a URL to an icon for the currency
 *
 * @see gw2v2CurrenciesIds
 * @see gw2v2CurrenciesById
 * @see gw2v2CurrenciesByIds
 * @see gw2v2CurrenciesByPage
 * @see gw2v2CurrenciesAll
 *
 * @since   0.1.0 (API: 2015-08-21)
 */
@Serializable
data class GW2v2Currency(
    /** @since  0.1.0 (API: 2015-08-21) */
    val id: Int,
    /** @since  0.1.0 (API: 2015-08-21) */
    val name: String,
    /** @since  0.1.0 (API: 2015-08-21) */
    val description: String,
    /** @since  0.1.0 (API: 2015-08-21) */
    val order: Int,
    /** @since  0.1.0 (API: 2015-08-21) */
    val icon: String
)

/**
 * This resource returns commonly requested in-game assets that may be used to enhance API-derived applications.
 *
 * ## Examples
 *
 * `https://api.guildwars2.com/v2/files?ids=all`
 *
 * ```
 * [
 *   { "id": "map_complete",
 *     "icon": "https://render.guildwars2.com/file/5A4E663071250EC72668C09E3C082E595A380BF7/528724.png" },
 *   { "id": "map_dungeon",
 *     "icon": "https://render.guildwars2.com/file/943538394A94A491C8632FBEF6203C2013443555/102478.png" },
 *   ...
 * ]
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/files]
 *
 * @param id    the file identifier
 * @param icon  the URL to the image
 *
 * @see gw2v2FilesIds
 * @see gw2v2FilesById
 * @see gw2v2FilesByIds
 * @see gw2v2FilesByPage
 * @see gw2v2FilesAll
 *
 * @since   0.1.0 (API: 2015-02-13)
 */
@Serializable
data class GW2v2File(
    /** @since  0.1.0 (API: 2015-02-13) */
    val id: String,
    /** @since  0.1.0 (API: 2015-02-13) */
    val icon: String
)

/**
 * This resource returns quaggan images
 *
 * ## Examples
 *
 * `https://api.guildwars2.com/v2/quaggans/box`
 *
 * ```
 * {
 *   "id": "box",
 *   "url": "https://static.staticwars.com/quaggans/box.jpg"
 * }
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/quaggans]
 *
 * @param id    the quaggan identifier
 * @param url   the URL to the quaggan image
 *
 * @see gw2v2QuaggansIds
 * @see gw2v2QuaggansById
 * @see gw2v2QuaggansByIds
 * @see gw2v2QuaggansByPage
 * @see gw2v2QuaggansAll
 *
 * @since   0.1.0 (API: 2014-07-16)
 */
@Serializable
data class GW2v2Quaggan(
    /** @since  0.1.0 (API: 2014-07-16) */
    val id: String,
    /** @since  0.1.0 (API: 2014-07-16) */
    val url: String
)

/**
 * Information about races and their available skills.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/races]
 *
 * @param id        the id of the race
 * @param name      the name of the race
 * @param skills    an array of skill ids resolvable against /v2/skills
 *
 * @see gw2v2RacesIds
 * @see gw2v2RacesById
 * @see gw2v2RacesByIds
 * @see gw2v2RacesByPage
 * @see gw2v2RacesAll
 *
 * @since   0.1.0 (API: 2017-01-20)
 */
@Serializable
data class GW2v2Race(
    /** @since  0.1.0 (API: 2017-20-01) */
    val id: String,
    /** @since  0.1.0 (API: 2017-20-01) */
    val name: String,
    /** @since  0.1.0 (API: 2017-20-01) */
    val skills: Collection<Int>
)

/**
 * This resource returns details about each raid and it's associated wings.
 *
 * ## Examples
 *
 * `https://api.guildwars2.com/v2/files?id=forsaken_thicket`
 *
 * ```
 * {
 *   "id": "forsaken_thicket",
 *   "wings": [
 *     {
 *       "id": "spirit_vale",
 *       "events": [
 *         {
 *           "id": "vale_guardian",
 *           "type": "Boss"
 *         },
 *         {
 *           "id": "spirit_woods",
 *           "type": "Checkpoint"
 *         },
 *         {
 *           "id": "gorseval",
 *           "type": "Boss"
 *         },
 *         {
 *           "id": "sabetha",
 *           "type": "Boss"
 *         }
 *       ]
 *     },
 *     {
 *       "id": "salvation_pass",
 *       "events": [
 *         {
 *           "id": "slothasor",
 *           "type": "Boss"
 *         },
 *         {
 *           "id": "bandit_trio",
 *           "type": "Boss"
 *         },
 *         {
 *           "id": "matthias",
 *           "type": "Boss"
 *         }
 *       ]
 *     },
 *     {
 *       "id": "stronghold_of_the_faithful",
 *       "events": [
 *         {
 *           "id": "escort",
 *           "type": "Boss"
 *         },
 *         {
 *           "id": "keep_construct",
 *           "type": "Boss"
 *         },
 *         {
 *           "id": "twisted_castle",
 *           "type": "Checkpoint"
 *         },
 *         {
 *           "id": "xera",
 *           "type": "Boss"
 *         }
 *       ]
 *     }
 *   ]
 * }
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/raids]
 *
 * @param id    the name of the raid
 * @param wings an array of the raid's wings
 *
 * @see gw2v2RaidsIds
 * @see gw2v2RaidsById
 * @see gw2v2RaidsByIds
 * @see gw2v2RaidsByPage
 * @see gw2v2RaidsAll
 *
 * @since   0.1.0 (API: 2017-02-13)
 */
@Serializable
data class GW2v2Raid(
    /** @since  0.1.0 (API: 2017-02-13) */
    val id: String,
    /** @since  0.1.0 (API: 2014-07-16) */
    val wings: Collection<Wing>
) {

    /**
     * @param id        the given name for the raid wing
     * @param events    array of the wing's events
     *
     * @since   0.1.0 (API: 2017-02-13)
     */
    @Serializable
    data class Wing(
        /** @since  0.1.0 (API: 2017-02-13) */
        val id: String,
        /** @since  0.1.0 (API: 2017-02-13) */
        val events: Collection<Event>
    ) {

        /**
         * @param id    the event/encounter name
         * @param type  the type of the event (One of: "Checkpoint", "Boss")
         *
         * @since   0.1.0 (API: 2017-02-13)
         */
        @Serializable
        data class Event(
            /** @since  0.1.0 (API: 2017-02-13) */
            val id: String,
            /** @since  0.1.0 (API: 2017-02-13) */
            val type: String
        )

    }

}

/**
 * This resource returns information on currently released specializations.
 *
 * ## Notes
 *
 * - The first digit of the id indicates the world's region. `1` is North America, `2` is Europe.
 * - The second digit of the id currently correlates with the world's assigned language: `1` means French, `2` means
 *   German, and `3` means Spanish.
 *
 *
 * ## Examples
 *
 * `https://api.guildwars2.com/v2/specializations/1`
 *
 * ```
 * {
 *   "id": 1,
 *   "name": "Dueling",
 *   "profession": "Mesmer",
 *   "elite": false,
 *   "minor_traits": [
 *     706,
 *     710,
 *     707
 *     ],
 *   "major_traits": [
 *     701,
 *     705,
 *     700,
 *     1889,
 *     1960,
 *     708,
 *     692,
 *     1950,
 *     704
 *   ],
 *   "icon": "https://render.guildwars2.com/file/43C5400906A104C60F30DFE0A145D1E767353573/1012003.png",
 *   "background": "https://render.guildwars2.com/file/992D53319C5FCD4AE841C592DC2AE91D5906AECF/1012057.png"
 * }
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/specializations]
 *
 * @param id                the specialization's id
 * @param name              the name of the specialization
 * @param profession        the profession that this specialization belongs to
 * @param elite             `true` if this specialization is an Elite specialization, `false` otherwise
 * @param icon              a URL to an icon of the specialization
 * @param background        a URL to the background image of the specialization
 * @param minorTraits       contains a list of IDs specifying the minor traits in the specialization
 * @param majorTraits       contains a list of IDs specifying the major traits in the specialization
 * @param weaponTrait       the weapon trait of the specialization (Optional - Elite specialization only)
 * @param professionIcon    the profession icon that overrides the default profession icon (Optional - Elite
 *                          specialization only)
 * @param professionIconBig a bigger version of [professionIcon] (Optional - Elite specialization only)
 *
 * @see gw2v2SpecializationsIds
 * @see gw2v2SpecializationsById
 * @see gw2v2SpecializationsByIds
 * @see gw2v2SpecializationsByPage
 * @see gw2v2SpecializationsAll
 *
 * @since  0.1.0 (API: 2015-06-24)
 */
@Serializable
data class GW2v2Specialization(
    /** @since  0.1.0 (API: 2015-06-24) */
    val id: Int,
    /** @since  0.1.0 (API: 2015-06-24) */
    val name: String,
    /** @since  0.1.0 (API: 2015-06-24) */
    val profession: String,
    /** @since  0.1.0 (API: 2015-06-24) */
    val elite: Boolean,
    /** @since  0.1.0 (API: 2015-06-24) */
    val icon: String,
    /** @since  0.1.0 (API: 2015-05-08) */
    val background: String,
    /** @since  0.1.0 (API: 2015-06-24) */
    @SerialName("minor_traits")
    val minorTraits: Collection<Int>,
    /** @since  0.1.0 (API: 2015-06-24) */
    @SerialName("major_traits")
    val majorTraits: Collection<Int>,
    /** @since  0.1.0 (API: 2016-04-13) */
    @Optional
    @SerialName("weapon_trait")
    val weaponTrait: Int? = null,
    /** @since  0.1.0 (API: 2016-03-14) */
    @Optional
    @SerialName("profession_icon")
    val professionIcon: String? = null,
    /** @since  0.1.0 (API: 2016-03-14) */
    @Optional
    @SerialName("profession_icon_big")
    val professionIconBig: String? = null
)

/**
 * This resource returns information about the supplied API key.
 *
 * ## Example
 *
 * ### Request
 *
 * ```
 * https://api.guildwars2.com/v2/tokeninfo
 * Authorization: Bearer <access token>
 * ```
 *
 * ### Response
 *
 * ```
 * {
 *   "id": "ABCDE02B-8888-FEBA-1234-DE98765C7DEF",
 *   "name": "My API Key",
 *   "permissions": [
 *     "account",
 *     "characters",
 *     "tradingpost",
 *     "unlocks",
 *     "build"
 *   ]
 * }
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/tokeninfo]
 *
 * @param id            the API key that was requested
 * @param name          the name given to the API key by the account owner. (**Warning**: The value of this field is not
 *                      escaped and may contain valid HTML, JavaScript, other code. Handle with care.)
 * @param permissions   array of strings describing which permissions the API key has
 *
 * @see gw2v2TokenInfo
 *
 * @since   0.1.0 (API: 2015-05-28)
 */
@Serializable
data class GW2v2TokenInfo(
    /** @since  0.1.0 (API: 2015-06-09) */
    val id: String,
    /** @since  0.1.0 (API: 2015-05-28) */
    val name: String,
    /** @since  0.1.0 (API: 2015-05-28) */
    val permissions: Collection<String>
)

/**
 * This resource returns information about the available worlds, or servers.
 *
 * ## Notes
 *
 * - The first digit of the id indicates the world's region. `1` is North America, `2` is Europe.
 * - The second digit of the id currently correlates with the world's assigned language: `1` means French, `2` means
 *   German, and `3` means Spanish.
 *
 *
 * ## Examples
 *
 * `https://api.guildwars2.com/v2/worlds?ids=1001,1002,1003`
 *
 * ```
 * [
 *   { "id": 1001, "name": "Anvil Rock", "population": "Medium" },
 *   { "id": 1002, "name": "Borlis Pass", "population": "Medium" },
 *   { "id": 1003, "name": "Yak's Bend", "population": "Full" }
 * ]
 * ```
 *
 * **Querying all worlds**
 *
 * `https://api.guildwars2.com/v2/worlds?ids=all`
 *
 * ```
 * [
 *   { "id": 1001, "name": "Anvil Rock", "population": "Medium" },
 *   { "id": 1002, "name": "Borlis Pass", "population": "Medium" },
 *   { "id": 1003, "name": "Yak's Bend", "population": "Full" },
 *   { "id": 1004, "name": "Henge of Denravi", "population": "High" },
 *   { "id": 1005, "name": "Maguuma", "population": "VeryHigh" },
 *   { "id": 1006, "name": "Sorrow's Furnace", "population": "Medium" },
 *   { "id": 1007, "name": "Gate of Madness", "population": "Medium" },
 *   { "id": 1008, "name": "Jade Quarry", "population": "Full" },
 *   { "id": 1009, "name": "Fort Aspenwood", "population": "VeryHigh" },
 *   { "id": 1010, "name": "Ehmry Bay", "population": "Medium" },
 *   { "id": 1011, "name": "Stormbluff Isle", "population": "VeryHigh" },
 *   { "id": 1012, "name": "Darkhaven", "population": "High" },
 *   { "id": 1013, "name": "Sanctum of Rall", "population": "Medium" },
 *   { "id": 1014, "name": "Crystal Desert", "population": "VeryHigh" },
 *   { "id": 1015, "name": "Isle of Janthir", "population": "Medium" },
 *   { "id": 1016, "name": "Sea of Sorrows", "population": "High" },
 *   { "id": 1017, "name": "Tarnished Coast", "population": "Full" },
 *   { "id": 1018, "name": "Northern Shiverpeaks", "population": "High" },
 *   { "id": 1019, "name": "Blackgate", "population": "Full" },
 *   { "id": 1020, "name": "Ferguson's Crossing", "population": "Medium" },
 *   { "id": 1021, "name": "Dragonbrand", "population": "High" },
 *   { "id": 1022, "name": "Kaineng", "population": "Medium" },
 *   { "id": 1023, "name": "Devona's Rest", "population": "Medium" },
 *   { "id": 1024, "name": "Eredon Terrace", "population": "Medium" },
 *   { "id": 2001, "name": "Fissure of Woe", "population": "Medium" },`
 *   { "id": 2002, "name": "Desolation", "population": "VeryHigh" },
 *   { "id": 2003, "name": "Gandara", "population": "VeryHigh" },
 *   { "id": 2004, "name": "Blacktide", "population": "Medium" },
 *   { "id": 2005, "name": "Ring of Fire", "population": "Medium" },
 *   { "id": 2006, "name": "Underworld", "population": "Medium" },
 *   { "id": 2007, "name": "Far Shiverpeaks", "population": "VeryHigh" },
 *   { "id": 2008, "name": "Whiteside Ridge", "population": "Medium" },
 *   { "id": 2009, "name": "Ruins of Surmia", "population": "Medium" },
 *   { "id": 2010, "name": "Seafarer's Rest", "population": "Full" },
 *   { "id": 2011, "name": "Vabbi", "population": "Medium" },
 *   { "id": 2012, "name": "Piken Square", "population": "VeryHigh" },
 *   { "id": 2013, "name": "Aurora Glade", "population": "High" },
 *   { "id": 2014, "name": "Gunnar's Hold", "population": "High" },
 *   { "id": 2101, "name": "Jade Sea [FR]", "population": "VeryHigh" },
 *   { "id": 2102, "name": "Fort Ranik [FR]", "population": "Medium" },
 *   { "id": 2103, "name": "Augury Rock [FR]", "population": "High" },
 *   { "id": 2104, "name": "Vizunah Square [FR]", "population": "VeryHigh" },
 *   { "id": 2105, "name": "Arborstone [FR]", "population": "Medium" },
 *   { "id": 2201, "name": "Kodash [DE]", "population": "Full" },
 *   { "id": 2202, "name": "Riverside [DE]", "population": "VeryHigh" },
 *   { "id": 2203, "name": "Elona Reach [DE]", "population": "VeryHigh" },
 *   { "id": 2204, "name": "Abaddon's Mouth [DE]", "population": "VeryHigh" },
 *   { "id": 2205, "name": "Drakkar Lake [DE]", "population": "VeryHigh" },
 *   { "id": 2206, "name": "Miller's Sound [DE]", "population": "Medium" },
 *   { "id": 2207, "name": "Dzagonur [DE]", "population": "Medium" },
 *   { "id": 2301, "name": "Baruch Bay [SP]", "population": "VeryHigh" }
 * ]
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/worlds]
 *
 * @param id            the world id
 * @param name          the world name
 * @param population    the world population level (One of: "Low", "Medium", "High", "VeryHigh", "Full")
 *
 * @see gw2v2WorldsIds
 * @see gw2v2WorldsById
 * @see gw2v2WorldsByIds
 * @see gw2v2WorldsByPage
 * @see gw2v2WorldsAll
 *
 * @since   0.1.0 (API: 2015-08-21)
 */
@Serializable
data class GW2v2World(
    /** @since  0.1.0 (API: 2015-08-21) */
    val id: Int,
    /** @since  0.1.0 (API: 2015-08-21) */
    val name: String,
    /** @since  0.1.0 (API: 2015-08-21) */
    val population: String
)