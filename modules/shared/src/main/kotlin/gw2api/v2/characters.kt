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

import gw2api.*
import kotlinx.serialization.*

/**
 * Queries the `/v2/characters` endpoint.
 *
 * ## The /v2/characters endpoint
 *
 * > This resource returns information about characters attached to a specific account.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2CharactersById
 * @see gw2v2CharactersByIds
 * @see gw2v2CharactersByPage
 * @see gw2v2CharactersAll
 *
 * @since   0.1.0 (API:  2015-03-04)
 */
@Suppress("UNUSED")
fun gw2v2CharactersIds(): RequestBuilder<Collection<String>> = query(
    endpoint = "/v2/files",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "characters"),
    converter = jsonArrayParser(JSONStringParser)
).setCacheTime(60 * 5, false)


/**
 * Queries the `/v2/characters` endpoint.
 *
 * ## The /v2/characters endpoint
 *
 * > This resource returns information about characters attached to a specific account.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param id    the id for the file to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2FilesIds
 * @see gw2v2FilesByIds
 * @see gw2v2FilesByPage
 * @see gw2v2FilesAll
 *
 * @since   0.1.0 (API: 2015-03-04)
 */
@Suppress("UNUSED")
fun gw2v2CharactersById(id: String): RequestBuilder<File> = query(
    endpoint = "/v2/characters",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "characters"),
    converter = jsonParser<File>(),
    params = mapOf("id" to id)
).setCacheTime(60 * 5, false)

/**
 * Queries the `/v2/characters` endpoint.
 *
 * ## The /v2/characters endpoint
 *
 * > This resource returns information about characters attached to a specific account.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param ids   the ids for the files to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2FilesIds
 * @see gw2v2FilesById
 * @see gw2v2FilesByPage
 * @see gw2v2FilesAll
 *
 * @since   0.1.0 (API: 2015-03-04)
 */
@Suppress("UNUSED")
fun gw2v2CharactersByIds(ids: Collection<String>): RequestBuilder<Collection<File>> = query(
    endpoint = "/v2/characters",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "characters"),
    converter = jsonArrayParser<File>(),
    params = mapOf("ids" to ids.joinToString(","))
).setCacheTime(60 * 5, false)

/**
 * Queries the `/v2/characters` endpoint.
 *
 * ## The /v2/characters endpoint
 *
 * > This resource returns information about characters attached to a specific account.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param page      the index of the page
 * @param pageSize  the size of the page (must be in the range `[1,200]`)
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2FilesIds
 * @see gw2v2FilesById
 * @see gw2v2FilesByIds
 * @see gw2v2FilesAll
 *
 * @since   0.1.0 (API: 2015-03-04)
 */
@Suppress("UNUSED")
fun gw2v2CharactersByPage(page: Int, pageSize: Int): RequestBuilder<Collection<File>> = query(
    endpoint = "/v2/characters",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "characters"),
    converter = jsonArrayParser<File>(),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).setCacheTime(60 * 5, false)

/**
 * Queries the `/v2/characters` endpoint.
 *
 * ## The /v2/characters endpoint
 *
 * > This resource returns information about characters attached to a specific account.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2FilesIds
 * @see gw2v2FilesById
 * @see gw2v2FilesByIds
 * @see gw2v2FilesByPage
 *
 * @since   0.1.0 (API: 2015-03-04)
 */
@Suppress("UNUSED")
fun gw2v2CharactersAll(): RequestBuilder<Collection<Character>> = query(
    endpoint = "/v2/characters",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "characters"),
    converter = jsonArrayParser<Character>(),
    params = mapOf("ids" to "all")
).setCacheTime(60 * 5, false)

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
data class Character(
    /** @since  0.1.0 (API: 2015-03-04) */
    @Suppress("MemberVisibilityCanBePrivate")
    val name: String,
    /** @since  0.1.0 (API: 2015-03-04) */
    @Suppress("MemberVisibilityCanBePrivate")
    val race: String,
    /** @since  0.1.0 (API: 2015-03-04) */
    @Suppress("MemberVisibilityCanBePrivate")
    val gender: String,
    /** @since  0.1.0 (API: 2015-03-04) */
    @Suppress("MemberVisibilityCanBePrivate")
    val profession: String,
    /** @since  0.1.0 (API: 2015-03-04) */
    @Suppress("MemberVisibilityCanBePrivate")
    val level: Int,
    /** @since  0.1.0 (API: 2015-03-04) */
    @Suppress("MemberVisibilityCanBePrivate")
    @Optional
    val guild: String? = null,
    /** @since  0.1.0 (API: 2015-06-12) */
    @Suppress("MemberVisibilityCanBePrivate")
    val age: Int,
    /** @since  0.1.0 (API: 2015-06-12) */
    @Suppress("MemberVisibilityCanBePrivate")
    val created: String,
    /** @since  0.1.0 (API: 2015-06-12) */
    @Suppress("MemberVisibilityCanBePrivate")
    val deaths: Int,
    /** @since  0.1.0 (API: 2016-04-16) */
    @Suppress("MemberVisibilityCanBePrivate")
    @Optional
    val title: Int? = null,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    val backstory: Collection<String>,
    /** @since  0.1.0 (API: 2015-07-01) */
    @Suppress("MemberVisibilityCanBePrivate")
    val crafting: Collection<CraftingDiscipline>,
    /** @since  0.1.0 (API: 2015-06-18) */
    @Suppress("MemberVisibilityCanBePrivate")
    val equipment: Collection<EquipmentSlot>,
    /** @since  0.1.0 (API: 2015-06-18) */
    @Suppress("MemberVisibilityCanBePrivate")
    val bags: Collection<Bag>,
    /** @since  0.1.0 (API: 2015-12-03) */
    @Suppress("MemberVisibilityCanBePrivate")
    val recipes: Collection<Recipes>,
    /** @since  0.1.0 (API: 2016-01-15) */
    @Suppress("MemberVisibilityCanBePrivate")
    val skills: Skills,
    /** @since  0.1.0 (API: 2015-08-22) */
    @Suppress("MemberVisibilityCanBePrivate")
    val specializations: Specializations,
    /** @since  0.1.0 (API: 2016-06-01) */
    @Suppress("MemberVisibilityCanBePrivate")
    val training: Training,
    /** @since  0.1.0 (API: 2016-09-29) */
    @Suppress("MemberVisibilityCanBePrivate")
    @SerialName("wvw_abilities")
    val wvwAbilities: WvWAbilities,
    /** @since  0.1.0 (API: 2016-03-25) */
    @Suppress("MemberVisibilityCanBePrivate")
    @SerialName("equipment_pvp")
    val equipmentPvP: EquipmentPvP,
    /** @since  0.1.0 (API: 2015-03-04) */
    @Suppress("MemberVisibilityCanBePrivate")
    val flags: Collection<String>
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
        @Suppress("MemberVisibilityCanBePrivate")
        val discipline: String,
        /** @since  0.1.0 (API: 2015-07-01) */
        @Suppress("MemberVisibilityCanBePrivate")
        val rating: Int,
        /** @since  0.1.0 (API: 2015-07-01) */
        @Suppress("MemberVisibilityCanBePrivate")
        val active: Boolean
    )

    /**
     * @param id        the item id, resolvable against `/v2/items`
     * @param slot      the equipment slot in which the item is slotted
     * @param infusions returns an array of infusion item ids which can be resolved against /v2/items (Optional)
     * @param upgrades  returns an array of upgrade component item ids which can be resolved against /v2/items (Optional)
     * @param skin      skin id for the given equipment piece which can be resolved against /v2/skins (Optional)
     * @param stats     contains information on the stats chosen if the item offers an option for stats/prefix (Optional)
     * @param binding   describes which kind of binding the item has (Optional)
     * @param charges   the amount of charges remaining on the item (Optional)
     * @param boundTo   name of the character the item is bound to (Optional - only if character bound)
     * @param dyes      array of selected dyes for the equipment piece (Values default to `null` if no dye is selected)
     *
     * @since   0.1.0 (API: 2015-06-18)
     */
    @Serializable
    data class EquipmentSlot(
        /** @since  0.1.0 (API: 2015-06-18) */
        @Suppress("MemberVisibilityCanBePrivate")
        val id: Int,
        /** @since  0.1.0 (API: 2015-06-18) */
        @Suppress("MemberVisibilityCanBePrivate")
        val slot: String,
        /** @since  0.1.0 (API: 2015-06-18) */
        @Suppress("MemberVisibilityCanBePrivate")
        @Optional
        val infusions: Collection<Int>? = null,
        /** @since  0.1.0 (API: 2015-06-18) */
        @Suppress("MemberVisibilityCanBePrivate")
        @Optional
        val upgrades: Collection<Int>? = null,
        /** @since  0.1.0 (API: 2015-06-18) */
        @Suppress("MemberVisibilityCanBePrivate")
        @Optional
        val skin: Int? = null,
        /** @since  0.1.0 (API: 2016-05-18) */
        @Suppress("MemberVisibilityCanBePrivate")
        @Optional
        val stats: Stats? = null,
        /** @since  0.1.0 (API: 2015-06-18) */
        @Suppress("MemberVisibilityCanBePrivate")
        @Optional
        val binding: String? = null,
        /** @since  0.1.0 (API: 2015-06-18) */
        @Suppress("MemberVisibilityCanBePrivate")
        @Optional
        val charges: Int? = null,
        /** @since  0.1.0 (API: 2015-06-18) */
        @Suppress("MemberVisibilityCanBePrivate")
        @Optional
        @SerialName("bound_to")
        val boundTo: String? = null,
        /** @since  0.1.0 (API: 2017-04-20) */
        @Suppress("MemberVisibilityCanBePrivate")
        val dyes: Collection<Int?>
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
            @Suppress("MemberVisibilityCanBePrivate")
            val id: Int,
            /** @since  0.1.0 (API: 2015-06-18) */
            @Suppress("MemberVisibilityCanBePrivate")
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
             *
             * @since   0.1.0 (API: 2015-06-18)
             */
            @Serializable
            data class Attributes(
                /** @since  0.1.0 (API: 2015-06-18) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("Power")
                val power: Int? = null,
                /** @since  0.1.0 (API: 2015-06-18) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("Precision")
                val precision: Int? = null,
                /** @since  0.1.0 (API: 2015-06-18) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("Toughness")
                val toughness: Int? = null,
                /** @since  0.1.0 (API: 2015-06-18) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("Vitality")
                val vitality: Int? = null,
                /** @since  0.1.0 (API: 2015-06-18) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("Condition Damage")
                val conditionDamage: Int? = null,
                /** @since  0.1.0 (API: 2015-06-18) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("Condition Duration")
                val conditionDuration: Int? = null,
                /** @since  0.1.0 (API: 2015-06-18) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("Healing")
                val healing: Int? = null,
                /** @since  0.1.0 (API: 2015-06-18) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("BoonDuration")
                val boonDuration: Int? = null
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
        @Suppress("MemberVisibilityCanBePrivate")
        val id: Int,
        /** @since  0.1.0 (API: 2015-06-18) */
        @Suppress("MemberVisibilityCanBePrivate")
        val size: Int,
        /** @since  0.1.0 (API: 2015-06-18) */
        @Suppress("MemberVisibilityCanBePrivate")
        val inventory: Collection<Slot>
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
         * @since   0.1.0 (API: 2015-06-18)
         */
        @Serializable
        data class Slot(
            /** @since  0.1.0 (API: 2015-06-18) */
            @Suppress("MemberVisibilityCanBePrivate")
            val id: Int,
            /** @since  0.1.0 (API: 2015-06-18) */
            @Suppress("MemberVisibilityCanBePrivate")
            val count: Int,
            /** @since  0.1.0 (API: 2015-06-18) */
            @Suppress("MemberVisibilityCanBePrivate")
            @Optional
            val infusions: Collection<Int>? = null,
            /** @since  0.1.0 (API: 2015-06-18) */
            @Suppress("MemberVisibilityCanBePrivate")
            @Optional
            val upgrades: Collection<Int>? = null,
            /** @since  0.1.0 (API: 2015-06-18) */
            @Suppress("MemberVisibilityCanBePrivate")
            @Optional
            val skin: Int? = null,
            /** @since  0.1.0 (API: 2015-06-18) */
            @Suppress("MemberVisibilityCanBePrivate")
            @Optional
            val stats: Stats? = null,
            /** @since  0.1.0 (API: 2015-10-29) */
            @Suppress("MemberVisibilityCanBePrivate")
            @Optional
            val binding: String? = null,
            /** @since  0.1.0 (API: 2015-10-29) */
            @Suppress("MemberVisibilityCanBePrivate")
            @Optional
            @SerialName("bound_to")
            val boundTo: String? = null
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
                @Suppress("MemberVisibilityCanBePrivate")
                val id: Int,
                /** @since  0.1.0 (API: 2015-06-18) */
                @Suppress("MemberVisibilityCanBePrivate")
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
                 *
                 * @since   0.1.0 (API: 2015-05-18)
                 */
                @Serializable
                data class Attributes(
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Suppress("MemberVisibilityCanBePrivate")
                    @Optional
                    @SerialName("Power")
                    val power: Int? = null,
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Suppress("MemberVisibilityCanBePrivate")
                    @Optional
                    @SerialName("Precision")
                    val precision: Int? = null,
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Suppress("MemberVisibilityCanBePrivate")
                    @Optional
                    @SerialName("Toughness")
                    val toughness: Int? = null,
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Suppress("MemberVisibilityCanBePrivate")
                    @Optional
                    @SerialName("Vitality")
                    val vitality: Int? = null,
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Suppress("MemberVisibilityCanBePrivate")
                    @Optional
                    @SerialName("Condition Damage")
                    val conditionDamage: Int? = null,
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Suppress("MemberVisibilityCanBePrivate")
                    @Optional
                    @SerialName("Condition Duration")
                    val conditionDuration: Int? = null,
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Suppress("MemberVisibilityCanBePrivate")
                    @Optional
                    @SerialName("Healing")
                    val healing: Int? = null,
                    /** @since  0.1.0 (API: 2015-06-18) */
                    @Suppress("MemberVisibilityCanBePrivate")
                    @Optional
                    @SerialName("BoonDuration")
                    val boonDuration: Int? = null
                )

            }

        }

    }

    /**
     * @param recipes   an array of ids of unlocked recipes
     *
     * @since   0.1.0 (API: 2015-12-03)
     */
    @Serializable
    data class Recipes(
        /** @since  0.1.0 (API: 2015-12-03) */
        @Suppress("MemberVisibilityCanBePrivate")
        val recipes: Collection<Int>
    )

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
        @Suppress("MemberVisibilityCanBePrivate")
        val pve: SkillSet,
        /** @since  0.1.0 (API: 2016-01-15) */
        @Suppress("MemberVisibilityCanBePrivate")
        val pvp: SkillSet,
        /** @since  0.1.0 (API: 2016-01-15) */
        @Suppress("MemberVisibilityCanBePrivate")
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
            @Suppress("MemberVisibilityCanBePrivate")
            val heal: Int,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Suppress("MemberVisibilityCanBePrivate")
            val utilities: Collection<Int>,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Suppress("MemberVisibilityCanBePrivate")
            val elite: Int,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Suppress("MemberVisibilityCanBePrivate")
            @Optional
            val legends: Collection<Int>? = null
        )

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
        @Suppress("MemberVisibilityCanBePrivate")
        val pve: Collection<Specialization>,
        /** @since  0.1.0 (API: 2015-08-22) */
        @Suppress("MemberVisibilityCanBePrivate")
        val pvp: Collection<Specialization>,
        /** @since  0.1.0 (API: 2015-08-22) */
        @Suppress("MemberVisibilityCanBePrivate")
        val wvw: Collection<Specialization>
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
            @Suppress("MemberVisibilityCanBePrivate")
            val id: Int,
            /** @since  0.1.0 (API: 2015-08-22) */
            @Suppress("MemberVisibilityCanBePrivate")
            val traits: Collection<Int>
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
    data class Training(
        /** @since  0.1.0 (API: 2016-06-01) */
        @Suppress("MemberVisibilityCanBePrivate")
        val id: Int,
        /** @since  0.1.0 (API: 2016-06-01) */
        @Suppress("MemberVisibilityCanBePrivate")
        val spent: Int,
        /** @since  0.1.0 (API: 2016-06-01) */
        @Suppress("MemberVisibilityCanBePrivate")
        val done: Boolean
    )

    /**
     * @param id    ability id, can be resolved against `/v2/wvw/abilities`
     * @param rank  current rank for the given ability
     *
     * @since   0.1.0 (API: 2016-09-29)
     */
    @Serializable
    data class WvWAbilities(
        /** @since  0.1.0 (API: 2016-09-29) */
        @Suppress("MemberVisibilityCanBePrivate")
        val id: Int,
        /** @since  0.1.0 (API: 2016-09-29) */
        @Suppress("MemberVisibilityCanBePrivate")
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
        @Suppress("MemberVisibilityCanBePrivate")
        val amulet: Int,
        /** @since  0.1.0 (API: 2016-03-25) */
        @Suppress("MemberVisibilityCanBePrivate")
        val rune: Int,
        /** @since  0.1.0 (API: 2016-03-25) */
        @Suppress("MemberVisibilityCanBePrivate")
        val sigils: Collection<Int>
    )

}

/**
 * Queries the `/v2/characters/:id/backstory` endpoint.
 *
 * ## The /v2/characters/:id/backstory endpoint
 *
 * > Backstory information of a single character.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2016-05-19)
 */
@Suppress("UNUSED")
fun gw2v2CharactersBackstory(id: String): RequestBuilder<Collection<String>> = query(
    endpoint = "/v2/characters/:id/backstory",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "characters"),
    converter = jsonArrayParser<String>(),
    replaceInPath = mapOf(
        ":id" to id
    )
).setCacheTime(60 * 5, false)

/**
 * Queries the `/v2/characters/:id/core` endpoint.
 *
 * ## The /v2/characters/:id/core endpoint
 *
 * > Core information (name, race, ...) of a single character.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2016-05-19)
 */
@Suppress("UNUSED")
fun gw2v2CharactersCore(id: String): RequestBuilder<CharactersCore> = query(
    endpoint = "/v2/characters/:id/core",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "characters"),
    converter = jsonParser<CharactersCore>(),
    replaceInPath = mapOf(
        ":id" to id
    )
).setCacheTime(60 * 5, false)

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
data class CharactersCore(
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    val name: String,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    val race: String,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    val gender: String,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    val profession: String,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    val level: Int,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    @Optional
    val guild: String? = null,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    val age: Int,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    val created: String,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    val deaths: Int,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    @Optional
    val title: Int? = null
)

/**
 * Queries the `/v2/characters/:id/crafting` endpoint.
 *
 * ## The /v2/characters/:id/crafting endpoint
 *
 * > Crafting disciplines of a single character.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2016-05-19)
 */
@Suppress("UNUSED")
fun gw2v2CharactersCrafting(id: String): RequestBuilder<Collection<CharactersCrafting>> = query(
    endpoint = "/v2/characters/:id/crafting",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "characters"),
    converter = jsonArrayParser<CharactersCrafting>(),
    replaceInPath = mapOf(
        ":id" to id
    )
).setCacheTime(60 * 5, false)

/**
 * Crafting disciplines of a single character.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param discipline    the name of the discipline
 * @param rating        the current crafting level for the given discipline and character
 * @param active        describes if the given discipline is currently active or not on the character
 *
 * @since  0.1.0 (API: 2016-05-19)
 */
@Serializable
data class CharactersCrafting(
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    val discipline: String,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    val rating: Int,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    val active: Boolean
)

/**
 * Queries the `/v2/characters/:id/equipment` endpoint.
 *
 * ## The /v2/characters/:id/equipment endpoint
 *
 * > Equipment of a single character.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2016-05-19)
 */
@Suppress("UNUSED")
fun gw2v2CharactersEquipment(id: String): RequestBuilder<Collection<CharactersEquipment>> = query(
    endpoint = "/v2/characters/:id/equipment",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "characters", "builds|inventories"),
    converter = jsonArrayParser<CharactersEquipment>(),
    replaceInPath = mapOf(
        ":id" to id
    )
).setCacheTime(60 * 5, false)

/**
 * Equipment of a single character.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param id        the item id, resolvable against `/v2/items`
 * @param slot      the equipment slot in which the item is slotted
 * @param infusions returns an array of infusion item ids which can be resolved against /v2/items (Optional)
 * @param upgrades  returns an array of upgrade component item ids which can be resolved against /v2/items (Optional)
 * @param skin      skin id for the given equipment piece which can be resolved against /v2/skins (Optional)
 * @param stats     contains information on the stats chosen if the item offers an option for stats/prefix (Optional)
 * @param binding   describes which kind of binding the item has (Optional)
 * @param charges   the amount of charges remaining on the item (Optional)
 * @param boundTo   name of the character the item is bound to (Optional - only if character bound)
 * @param dyes      array of selected dyes for the equipment piece (Values default to `null` if no dye is selected)
 *
 * @since   0.1.0 (API: 2016-05-19)
 */
@Serializable
data class CharactersEquipment(
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    val id: Int,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    val slot: String,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    @Optional
    val infusions: Collection<Int>? = null,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    @Optional
    val upgrades: Collection<Int>? = null,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    @Optional
    val skin: Int? = null,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    @Optional
    val stats: Stats? = null,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    @Optional
    val binding: String? = null,
    /** @since  0.1.0 (API: 2016-06-28) */
    @Suppress("MemberVisibilityCanBePrivate")
    @Optional
    val charges: Int? = null,
    /** @since  0.1.0 (API: 2016-05-19) */
    @Suppress("MemberVisibilityCanBePrivate")
    @Optional
    @SerialName("bound_to")
    val boundTo: String? = null,
    /** @since  0.1.0 (API: 2017-04-20) */
    @Suppress("MemberVisibilityCanBePrivate")
    val dyes: Collection<Int?>
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
        @Suppress("MemberVisibilityCanBePrivate")
        val id: Int,
        /** @since  0.1.0 (API: 2016-05-19) */
        @Suppress("MemberVisibilityCanBePrivate")
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
         *
         * @since   0.1.0 (API: 2016-05-19)
         */
        @Serializable
        data class Attributes(
            /** @since  0.1.0 (API: 2016-05-19) */
            @Suppress("MemberVisibilityCanBePrivate")
            @Optional
            @SerialName("Power")
            val power: Int? = null,
            /** @since  0.1.0 (API: 2016-05-19) */
            @Suppress("MemberVisibilityCanBePrivate")
            @Optional
            @SerialName("Precision")
            val precision: Int? = null,
            /** @since  0.1.0 (API: 2016-05-19) */
            @Suppress("MemberVisibilityCanBePrivate")
            @Optional
            @SerialName("Toughness")
            val toughness: Int? = null,
            /** @since  0.1.0 (API: 2016-05-19) */
            @Suppress("MemberVisibilityCanBePrivate")
            @Optional
            @SerialName("Vitality")
            val vitality: Int? = null,
            /** @since  0.1.0 (API: 2016-05-19) */
            @Suppress("MemberVisibilityCanBePrivate")
            @Optional
            @SerialName("Condition Damage")
            val conditionDamage: Int? = null,
            /** @since  0.1.0 (API: 2016-05-19) */
            @Suppress("MemberVisibilityCanBePrivate")
            @Optional
            @SerialName("Condition Duration")
            val conditionDuration: Int? = null,
            /** @since  0.1.0 (API: 2016-05-19) */
            @Suppress("MemberVisibilityCanBePrivate")
            @Optional
            @SerialName("Healing")
            val healing: Int? = null,
            /** @since  0.1.0 (API: 2016-05-19) */
            @Suppress("MemberVisibilityCanBePrivate")
            @Optional
            @SerialName("BoonDuration")
            val boonDuration: Int? = null
        )

    }

}

/**
 * Queries the `/v2/characters/:id/heropoints` endpoint.
 *
 * ## The /v2/characters/:id/heropoints endpoint
 *
 * > Heropoint information of a single character.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2017-04-20)
 */
@Suppress("UNUSED")
fun gw2v2CharactersHeropoints(id: String): RequestBuilder<Collection<String>> = query(
    endpoint = "/v2/characters/:id/heropoints",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "characters", "progression"),
    converter = jsonArrayParser<String>(),
    replaceInPath = mapOf(
        ":id" to id
    )
).setCacheTime(60 * 5, false)

/**
 * Queries the `/v2/characters/:id/inventory` endpoint.
 *
 * ## The /v2/characters/:id/inventory endpoint
 *
 * > Inventory of a single character.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2016-05-16)
 */
@Suppress("UNUSED")
fun gw2v2CharactersInventory(id: String): RequestBuilder<Collection<CharactersBag>> = query(
    endpoint = "/v2/characters/:id/inventory",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "characters", "inventories"),
    converter = jsonArrayParser<CharactersBag>(),
    replaceInPath = mapOf(
        ":id" to id
    )
).setCacheTime(60 * 5, false)

/**
 * Inventory of a single character.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param id        the bag's item id which can be resolved against `/v2/items`
 * @param size      the amount of slots available with this bag
 * @param inventory contains one object structure per item, object is `null` if no item is in the given bag slot
 *
 * @since   0.1.0 (API: 2016-05-16)
 */
@Serializable
data class CharactersBag(
    /** @since  0.1.0 (API: 2016-05-16) */
    @Suppress("MemberVisibilityCanBePrivate")
    val id: Int,
    /** @since  0.1.0 (API: 2016-05-16) */
    @Suppress("MemberVisibilityCanBePrivate")
    val size: Int,
    /** @since  0.1.0 (API: 2016-05-16) */
    @Suppress("MemberVisibilityCanBePrivate")
    val inventory: Collection<Slot>
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
        @Suppress("MemberVisibilityCanBePrivate")
        val id: Int,
        /** @since  0.1.0 (API: 2016-05-16) */
        @Suppress("MemberVisibilityCanBePrivate")
        val count: Int,
        /** @since  0.1.0 (API: 2016-05-16) */
        @Suppress("MemberVisibilityCanBePrivate")
        @Optional
        val infusions: Collection<Int>? = null,
        /** @since  0.1.0 (API: 2016-05-16) */
        @Suppress("MemberVisibilityCanBePrivate")
        @Optional
        val upgrades: Collection<Int>? = null,
        /** @since  0.1.0 (API: 2016-05-16) */
        @Suppress("MemberVisibilityCanBePrivate")
        @Optional
        val skin: Int? = null,
        /** @since  0.1.0 (API: 2016-05-16) */
        @Suppress("MemberVisibilityCanBePrivate")
        @Optional
        val stats: Stats? = null,
        /** @since  0.1.0 (API: 2016-05-16) */
        @Suppress("MemberVisibilityCanBePrivate")
        @Optional
        val binding: String? = null,
        /** @since  0.1.0 (API: 2016-05-16) */
        @Suppress("MemberVisibilityCanBePrivate")
        @Optional
        @SerialName("bound_to")
        val boundTo: String? = null
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
            @Suppress("MemberVisibilityCanBePrivate")
            val id: Int,
            /** @since  0.1.0 (API: 2016-05-16) */
            @Suppress("MemberVisibilityCanBePrivate")
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
             *
             * @since   0.1.0 (API: 2016-05-16)
             */
            @Serializable
            data class Attributes(
                /** @since  0.1.0 (API: 2016-05-16) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("Power")
                val power: Int? = null,
                /** @since  0.1.0 (API: 2016-05-16) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("Precision")
                val precision: Int? = null,
                /** @since  0.1.0 (API: 2016-05-16) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("Toughness")
                val toughness: Int? = null,
                /** @since  0.1.0 (API: 2016-05-16) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("Vitality")
                val vitality: Int? = null,
                /** @since  0.1.0 (API: 2016-05-16) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("Condition Damage")
                val conditionDamage: Int? = null,
                /** @since  0.1.0 (API: 2016-05-16) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("Condition Duration")
                val conditionDuration: Int? = null,
                /** @since  0.1.0 (API: 2016-05-16) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("Healing")
                val healing: Int? = null,
                /** @since  0.1.0 (API: 2016-05-16) */
                @Suppress("MemberVisibilityCanBePrivate")
                @Optional
                @SerialName("BoonDuration")
                val boonDuration: Int? = null
            )

        }

    }

}

/**
 * Queries the `/v2/characters/:id/recipes` endpoint.
 *
 * ## The /v2/characters/:id/recipes endpoint
 *
 * > Unlocked recipes of a single character.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2016-05-16)
 */
@Suppress("UNUSED")
fun gw2v2CharactersRecipes(id: String): RequestBuilder<CharactersRecipes> = query(
    endpoint = "/v2/characters/:id/recipes",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "characters", "inventories"),
    converter = jsonParser<CharactersRecipes>(),
    replaceInPath = mapOf(
        ":id" to id
    )
).setCacheTime(60 * 5, false)

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
data class CharactersRecipes(
    /** @since  0.1.0 (API: 2016-05-16) */
    @Suppress("MemberVisibilityCanBePrivate")
    val recipes: Collection<Int>
)

/**
 * Queries the `/v2/characters/:id/sab` endpoint.
 *
 * ## The /v2/characters/:id/sab endpoint
 *
 * > Zone progress and unlocks in the SAB for this character.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2017-04-11)
 */
@Suppress("UNUSED")
fun gw2v2CharactersSAB(id: String): RequestBuilder<CharactersSAB> = query(
    endpoint = "/v2/characters/:id/sab",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "progression"),
    converter = jsonParser<CharactersSAB>(),
    replaceInPath = mapOf(
        ":id" to id
    )
).setCacheTime(60 * 5, false)

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
data class CharactersSAB(
    /** @since  0.1.0 (API: 2017-04-11) */
    @Suppress("MemberVisibilityCanBePrivate")
    val zones: Collection<Zone>,
    /** @since  0.1.0 (API: 2017-04-11) */
    @Suppress("MemberVisibilityCanBePrivate")
    val unlocks: Collection<Unlock>,
    /** @since  0.1.0 (API: 2017-04-11) */
    @Suppress("MemberVisibilityCanBePrivate")
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
        @Suppress("MemberVisibilityCanBePrivate")
        val id: Int,
        /** @since  0.1.0 (API: 2017-04-11) */
        @Suppress("MemberVisibilityCanBePrivate")
        val mode: String,
        /** @since  0.1.0 (API: 2017-04-11) */
        @Suppress("MemberVisibilityCanBePrivate")
        val world: Int,
        /** @since  0.1.0 (API: 2017-04-11) */
        @Suppress("MemberVisibilityCanBePrivate")
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
        @Suppress("MemberVisibilityCanBePrivate")
        val id: Int,
        /** @since  0.1.0 (API: 2017-04-11) */
        @Suppress("MemberVisibilityCanBePrivate")
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
        @Suppress("MemberVisibilityCanBePrivate")
        val id: Int,
        /** @since  0.1.0 (API: 2017-04-11) */
        @Suppress("MemberVisibilityCanBePrivate")
        val name: String
    )

}

/**
 * Queries the `/v2/characters/:id/skills` endpoint.
 *
 * ## The /v2/characters/:id/skills endpoint
 *
 * > Skills in use by a single character.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2016-05-16)
 */
@Suppress("UNUSED")
fun gw2v2CharactersSkills(id: String): RequestBuilder<CharactersSkills> = query(
    endpoint = "/v2/characters/:id/skills",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "builds", "characters"),
    converter = jsonParser<CharactersSkills>(),
    replaceInPath = mapOf(
        ":id" to id
    )
).setCacheTime(60 * 5, false)

/**
 * Skills in use by a single character.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param pve   contains the information on each slotted utility for PvE
 * @param pvp   contains the information on each slotted utility for PvP
 * @param wvw   contains the information on each slotted utility for WvW
 *
 * @since   0.1.0 (API: 2016-05-16)
 */
@Serializable
data class CharactersSkills(
    /** @since  0.1.0 (API: 2016-05-16) */
    @Suppress("MemberVisibilityCanBePrivate")
    val pve: SkillSet,
    /** @since  0.1.0 (API: 2016-05-16) */
    @Suppress("MemberVisibilityCanBePrivate")
    val pvp: SkillSet,
    /** @since  0.1.0 (API: 2016-05-16) */
    @Suppress("MemberVisibilityCanBePrivate")
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
        @Suppress("MemberVisibilityCanBePrivate")
        val heal: Int,
        /** @since  0.1.0 (API: 2016-05-16) */
        @Suppress("MemberVisibilityCanBePrivate")
        val utilities: Collection<Int>,
        /** @since  0.1.0 (API: 2016-05-16) */
        @Suppress("MemberVisibilityCanBePrivate")
        val elite: Int,
        /** @since  0.1.0 (API: 2016-05-16) */
        @Suppress("MemberVisibilityCanBePrivate")
        @Optional
        val legends: Collection<Int>? = null
    )

}

/**
 * Queries the `/v2/characters/:id/specializations` endpoint.
 *
 * ## The /v2/characters/:id/specializations endpoint
 *
 * > Specialization information of a single character.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2016-05-16)
 */
@Suppress("UNUSED")
fun gw2v2CharactersSpecializations(id: String): RequestBuilder<CharactersSpecializations> = query(
    endpoint = "/v2/characters/:id/specializations",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "builds", "characters"),
    converter = jsonParser<CharactersSpecializations>(),
    replaceInPath = mapOf(
        ":id" to id
    )
).setCacheTime(60 * 5, false)

/**
 * Specialization information of a single character.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param pve   contains the information on each slotted specialization and trait for PvE
 * @param pvp   contains the information on each slotted specialization and trait for PvP
 * @param wvw   contains the information on each slotted specialization and trait for WvW
 *
 * @since   0.1.0 (API: 2016-05-16)
 */
@Serializable
data class CharactersSpecializations(
    /** @since  0.1.0 (API: 2016-05-16) */
    @Suppress("MemberVisibilityCanBePrivate")
    val pve: Collection<Specialization>,
    /** @since  0.1.0 (API: 2016-05-16) */
    @Suppress("MemberVisibilityCanBePrivate")
    val pvp: Collection<Specialization>,
    /** @since  0.1.0 (API: 2016-05-16) */
    @Suppress("MemberVisibilityCanBePrivate")
    val wvw: Collection<Specialization>
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
        @Suppress("MemberVisibilityCanBePrivate")
        val id: Int,
        /** @since  0.1.0 (API: 2016-05-16) */
        @Suppress("MemberVisibilityCanBePrivate")
        val traits: Collection<Int>
    )

}

/**
 * Queries the `/v2/characters/:id/training` endpoint.
 *
 * ## The /v2/characters/:id/training endpoint
 *
 * > Training information of a single character.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2016-05-16)
 */
@Suppress("UNUSED")
fun gw2v2CharactersTraining(id: String): RequestBuilder<Collection<CharactersTraining>> = query(
    endpoint = "/v2/characters/:id/training",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "builds", "characters"),
    converter = jsonArrayParser<CharactersTraining>(),
    replaceInPath = mapOf(
        ":id" to id
    )
).setCacheTime(60 * 5, false)

/**
 * Specialization information of a single character.
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters]
 *
 * @param id    skill tree id, can be compared against the training section for each /v2/professions
 * @param spent shows how many hero points have been spent in this tree
 * @param done  states whether or not the tree is fully trained
 *
 * @since   0.1.0 (API: 2016-05-16)
 */
@Serializable
data class CharactersTraining(
    /** @since  0.1.0 (API: 2016-05-16) */
    @Suppress("MemberVisibilityCanBePrivate")
    val id: Int,
    /** @since  0.1.0 (API: 2016-05-16) */
    @Suppress("MemberVisibilityCanBePrivate")
    val spent: Int,
    /** @since  0.1.0 (API: 2016-05-16) */
    @Suppress("MemberVisibilityCanBePrivate")
    val done: Boolean
)
