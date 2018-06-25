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
@file:JvmName("GW2v2")
@file:JvmMultifileClass
package gw2api.v2

import gw2api.*
import kotlin.jvm.*

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
fun gw2v2CharactersBackstory(id: String): RequestBuilder<GW2v2CharactersBackstory> = query(
    endpoint = "/v2/characters/:id/backstory",
    requiresAuthentication = true,
    requiredPermissions = setOf("account", "characters"),
    converter = jsonParser<GW2v2CharactersBackstory>(),
    replaceInPath = mapOf(
        ":id" to id
    )
).setCacheTime(60 * 5, false)