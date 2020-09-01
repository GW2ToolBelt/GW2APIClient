/*
 * Copyright (c) 2018-2020 Leon Linhart
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
@file:JvmName("GW2v2")
@file:JvmMultifileClass
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package gw2api.v2

import gw2api.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*
import kotlin.jvm.*

/**
 * Creates a request used to query the list of available IDs.
 *
 * Returns information about the game's playable professions.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60.0m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/professions]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2ProfessionsIDs(configure: (RequestBuilder<List<String>>.() -> Unit)? = null): RequestBuilder<List<String>> = request(
    path = "/v2/professions",
    parameters = mapOf("v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(String.serializer()),
    configure = configure
)

/**
 * Creates a request used to query a single [item](GW2v2Profession) by its ID.
 *
 * Returns information about the game's playable professions.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60.0m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/professions]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2ProfessionsByID(id: String, configure: (RequestBuilder<GW2v2Profession>.() -> Unit)? = null): RequestBuilder<GW2v2Profession> = request(
    path = "/v2/professions",
    parameters = mapOf("id" to id, "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = GW2v2Profession.serializer(),
    configure = configure
)

/**
 * Creates a request used to query one or more [items](GW2v2Profession) by their IDs.
 *
 * Returns information about the game's playable professions.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60.0m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/professions]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2ProfessionsByIDs(ids: Collection<String>, configure: (RequestBuilder<List<GW2v2Profession>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Profession>> = request(
    path = "/v2/professions",
    parameters = mapOf("ids" to ids.joinToString(","), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2Profession.serializer()),
    configure = configure
)

/**
 * Creates a request used to query all available [items](GW2v2Profession).
 *
 * Returns information about the game's playable professions.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60.0m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/professions]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2ProfessionsAll(configure: (RequestBuilder<List<GW2v2Profession>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Profession>> = request(
    path = "/v2/professions",
    parameters = mapOf("ids" to "all", "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2Profession.serializer()),
    configure = configure
)

/**
 * Creates a request used to query one or more [items](GW2v2Profession) by page.
 *
 * Returns information about the game's playable professions.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60.0m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/professions]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2ProfessionsByPage(page: Int, pageSize: Int = 200, configure: (RequestBuilder<List<GW2v2Profession>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Profession>> = request(
    path = "/v2/professions",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString(), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2Profession.serializer()),
    configure = configure
)

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
    val id: String,
    val name: String,
    val code: Int,
    val icon: String,
    @SerialName("icon_big")
    val bigIcon: String,
    val specializations: List<Int>,
    val weapons: Map<String, Weapons>,
    val flags: List<String>,
    val skills: List<Skill>,
    val training: List<Training>,
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
    public data class Weapons(
        val specialization: Int? = null,
        val flags: List<String>,
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
            val id: Int,
            val slot: String,
            val attunement: String? = null,
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
        val id: Int,
        val slot: String,
        val type: String,
        val attunement: String? = null,
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
        val id: Int,
        val category: String,
        val name: String,
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
            val cost: Int,
            val type: String,
            @SerialName("skill_id")
            val skillId: Int? = null,
            @SerialName("trait_id")
            val traitId: Int? = null
        )
    
    }

}