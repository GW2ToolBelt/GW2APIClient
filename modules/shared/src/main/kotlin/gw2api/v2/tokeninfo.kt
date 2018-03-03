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
 * Queries the `/v2/tokeninfo` endpoint.
 *
 * ## The `/v2/tokeninfo` endpoint
 *
 * > Returns information about the supplied API key.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          1 minute
 * ```
 *
 *
 * ### Authentication
 *
 * Some endpoints return data that is specific to a single account, and thus, can only be retrieved by using an
 * authentication key. (These keys will be referred to as keys or API keys throughout this documentation.) A user
 * must generate an API key by visiting [account.arena.net/applications](https://account.arena.net/applications) and
 * following the instructions on that side.
 * Keys are not passed by request but instead stored in a client instance in order to support
 * [rate controlling][RateController].
 * If client side assertions are enabled, querying an endpoint that requires authentication with an unauthenticated
 * receiver client, or, with an client which's api key does not have the permissions required for that endpoint, the
 * query will fail with an exception.
 *
 *
 * ### Caching
 *
 * GW2APIClient supports caching to optimize performance and to reduce load on the remote API. By default, all responses
 * are cached in memory until they expire. This behaviour, can be customized or replaced, as documented in
 * [CacheController].
 *
 * The expiration time of a response is determined using the following formula:
 *
 * 1. If the remote's responds contains an expiration header, the header's expiration time is used, unless the cache
 *    timeout is explicitly overwritten (by setting [overrideCacheTime] to `true`).
 * 2. If the remote's responds does not contain an expiration header, (or the cache timeout is explicitly overwritten),
 *    the [cacheTime] is used instead.
 * 3. If the [cacheTime] has not been set explicitly, a reasonable default (that is documented in the "endpoint
 *    description" section) will be used instead.
 *
 * Unless the [skipCache] is set, all requests will lookup the cache before querying the remote API.
 *
 *
 * @receiver                the client that will query the endpoint
 * @param cacheTime         the amount of seconds the response should be cached. (This has no effect if the response if
 *                          retrieved from cache storage.)
 * @param overrideCacheTime if the remote's responds contains an expiration header, [cacheTime] will be ignored unless
 *                          this is set to `true`
 * @param skipCache         if the local cache should be skipped regardless of cached responses (The received response
 *                          will be written to the cache regardless of what this is set to.)
 *
 * @return the request that is used to query the API
 *
 * @throws UnauthenticatedException if the client is not authenticated, that is, it has no token or it's token is
 *                                  invalid
 *
 * @since   0.1.0 (API: 2015-05-28)
 */
@Suppress("UNUSED")
fun GW2APIView.v2TokenInfo(
    cacheTime: Int = 60,
    overrideCacheTime: Boolean = false,
    skipCache: Boolean = false
): Request<TokenInfo> = query(
    endpoint = "/v2/tokeninfo",
    authenticated = true,
    requiresAuthentication = true,
    conv = jsonParser(),
    cacheTime = cacheTime,
    overrideCacheTime = overrideCacheTime,
    skipCache = skipCache
)

/**
 * @see v2TokenInfo
 *
 * @since   0.1.0 (API: 2015-05-28)
 */
@Serializable
data class TokenInfo(
    /** @since  0.1.0 (API: 2015-06-09) */
    val id: String,
    /** @since  0.1.0 (API: 2015-05-28) */
    val name: String,
    /** @since  0.1.0 (API: 2015-05-28) */
    val permissions: Collection<String>
)