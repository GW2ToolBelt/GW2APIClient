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
package gw2api

/**
 * A view that can be used to query a GW2 API database.
 *
 * @since   0.1.0
 */
interface GW2APIView {

    val baseUrl: String
    val apiKey: String?
    val isClientAssertive: Boolean
    val hasKey: Boolean
    val cacheController: CacheController?
    val rateController: RateController?

}

/**
 * A GW2 api client.
 *
 * @param apiKey            the api key used to authenticate the client
 * @param isClientAssertive whether or not the client should do permission checks before querying the database
 * @param cacheController   the cache controller for this client
 * @param rateController    the rate controller for this client
 *
 * @since   0.1.0
 */
class GW2APIClient(
    override val baseUrl: String = "https://api.guildwars2.com",
    override val apiKey: String? = null,
    override val isClientAssertive: Boolean = true,
    override val cacheController: CacheController? = null,
    override val rateController: RateController? = null
) : GW2APIView {

    /**
     * A live view of this clients database, that skips the cache.
     *
     * @since   0.1.0
     */
    @Suppress("UNUSED")
    val live: GW2APIView by lazy {
        object : GW2APIView {
            override val baseUrl get() = this@GW2APIClient.baseUrl
            override val apiKey get() = this@GW2APIClient.apiKey
            override val isClientAssertive get() = this@GW2APIClient.isClientAssertive
            override val hasKey get() = this@GW2APIClient.hasKey
            override val cacheController get() = null
            override val rateController get() = this@GW2APIClient.rateController
        }
    }

    /**
     * Returns whether or not the holds an API key.
     *
     * @since   0.1.0
     */
    override val hasKey get() = apiKey !== null

}