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
fun gw2v2CharactersSAB(id: String): RequestBuilder<GW2v2CharactersSAB> = query(
    endpoint = "/v2/characters/:id/sab",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "progression"),
    converter = jsonParser<GW2v2CharactersSAB>(),
    replaceInPath = mapOf(
        ":id" to id
    )
).setCacheTime(60 * 5, false)