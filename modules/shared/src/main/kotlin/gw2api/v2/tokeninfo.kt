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
 * ## The /v2/tokeninfo endpoint
 *
 * > This resource returns information about the supplied API key.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          1 minute
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/tokeninfo]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2015-05-28)
 */
@Suppress("UNUSED")
fun gw2v2TokenInfo(): RequestBuilder<TokenInfo> = query(
    endpoint = "/v2/tokeninfo",
    requiresAuthentication = true,
    converter = jsonParser<TokenInfo>()
).setCacheTime(60, false)

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
data class TokenInfo(
    /** @since  0.1.0 (API: 2015-06-09) */
    @Suppress("MemberVisibilityCanBePrivate")
    val id: String,
    /** @since  0.1.0 (API: 2015-05-28) */
    @Suppress("MemberVisibilityCanBePrivate")
    val name: String,
    /** @since  0.1.0 (API: 2015-05-28) */
    val permissions: Collection<String>
)