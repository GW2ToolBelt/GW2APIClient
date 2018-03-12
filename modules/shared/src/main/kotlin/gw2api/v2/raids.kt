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
 * Queries the `/v2/raids` endpoint.
 *
 * ## The /v2/raids endpoint
 *
 * > This resource returns details about each raid and it's associated wings.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       No
 * Localized:           No
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/raids]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2RaidsById
 * @see gw2v2RaidsByIds
 * @see gw2v2RaidsByPage
 * @see gw2v2RaidsAll
 *
 * @since   0.1.0 (API: 2017-02-13)
 */
@Suppress("UNUSED")
fun gw2v2RaidsIds(): RequestBuilder<Collection<String>> = query(
    endpoint = "/v2/raids",
    converter = jsonArrayParser(JSONStringParser)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/raids` endpoint.
 *
 * ## The /v2/raids endpoint
 *
 * > This resource returns details about each raid and it's associated wings.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       No
 * Localized:           No
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/raids]
 *
 * @param id    the id for the raid to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2RaidsIds
 * @see gw2v2RaidsByIds
 * @see gw2v2RaidsByPage
 * @see gw2v2RaidsAll
 *
 * @since   0.1.0 (API: 2017-02-13)
 */
@Suppress("UNUSED")
fun gw2v2RaidsById(id: String): RequestBuilder<Raid> = query(
    endpoint = "/v2/raids",
    converter = jsonParser<Raid>(),
    params = mapOf("id" to id)
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/raids` endpoint.
 *
 * ## The /v2/raids endpoint
 *
 * > This resource returns details about each raid and it's associated wings.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       No
 * Localized:           No
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/raids]
 *
 * @param ids   the ids for the raids to query
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2RaidsIds
 * @see gw2v2RaidsById
 * @see gw2v2RaidsByPage
 * @see gw2v2RaidsAll
 *
 * @since   0.1.0 (API: 2017-02-13)
 */
@Suppress("UNUSED")
fun gw2v2RaidsByIds(ids: Collection<String>): RequestBuilder<Collection<Raid>> = query(
    endpoint = "/v2/raids",
    converter = jsonArrayParser<Raid>(),
    params = mapOf("ids" to ids.joinToString(","))
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/raids` endpoint.
 *
 * ## The /v2/raids endpoint
 *
 * > This resource returns details about each raid and it's associated wings.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       No
 * Localized:           No
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/raids]
 *
 * @param page      the index of the page
 * @param pageSize  the size of the page (must be in the range `[1,200]`)
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2RaidsIds
 * @see gw2v2RaidsById
 * @see gw2v2RaidsByIds
 * @see gw2v2RaidsAll
 *
 * @since   0.1.0 (API: 2017-02-13)
 */
@Suppress("UNUSED")
fun gw2v2RaidsByPage(page: Int, pageSize: Int): RequestBuilder<Collection<Raid>> = query(
    endpoint = "/v2/raids",
    converter = jsonArrayParser<Raid>(),
    params = mapOf(
        "page" to page,
        "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }
    )
).setCacheTime(60 * 60 * 24, false)

/**
 * Queries the `/v2/raids` endpoint.
 *
 * ## The /v2/raids endpoint
 *
 * > This resource returns details about each raid and it's associated wings.
 *
 * ```
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Authenticated:       No
 * Localized:           No
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/raids]
 *
 * @return  the request that is used to query the API
 *
 * @see gw2v2RaidsIds
 * @see gw2v2RaidsById
 * @see gw2v2RaidsByIds
 * @see gw2v2RaidsByPage
 *
 * @since   0.1.0 (API: 2017-02-13)
 */
@Suppress("UNUSED")
fun gw2v2RaidsAll(): RequestBuilder<Collection<Raid>> = query(
    endpoint = "/v2/raids",
    converter = jsonArrayParser<Raid>(),
    params = mapOf("ids" to "all")
).setCacheTime(60 * 60 * 24, false)

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
data class Raid(
    /** @since  0.1.0 (API: 2017-02-13) */
    @Suppress("MemberVisibilityCanBePrivate")
    val id: String,
    /** @since  0.1.0 (API: 2014-07-16) */
    @Suppress("MemberVisibilityCanBePrivate")
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
        @Suppress("MemberVisibilityCanBePrivate")
        val id: String,
        /** @since  0.1.0 (API: 2017-02-13) */
        @Suppress("MemberVisibilityCanBePrivate")
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
            @Suppress("MemberVisibilityCanBePrivate")
            val id: String,
            /** @since  0.1.0 (API: 2017-02-13) */
            @Suppress("MemberVisibilityCanBePrivate")
            val type: String
        )

    }

}