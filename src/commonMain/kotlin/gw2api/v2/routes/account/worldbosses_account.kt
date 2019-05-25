/*
 * Copyright 2018-2019 Leon Linhart
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
// FIXME: file name should be just "worldbosses" (KT-12756)
@file:JvmName("GW2v2")
@file:JvmMultifileClass
@file:Suppress("PackageDirectoryMismatch")
package gw2api.v2

import gw2api.*
import gw2api.extra.*
import gw2api.jsonArrayParser
import gw2api.query
import kotlin.jvm.*

/**
 * Queries the `/v2/account/worldbosses` endpoint.
 *
 * ## The /v2/account/worldbosses endpoint
 *
 * > This resource returns information about which world bosses have been slain by an account today. This endpoint is
 * only accessible with a valid API key.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/account/worldbosses]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2019-04-08)
 */
@GW2APIv2Data("account/worldbosses")
fun gw2v2AccountWorldbosses(): RequestBuilder<Collection<String>> = query(
    endpoint = "/v2/account/worldbosses",
    requiresAuthentication = true,
    requiredPermissions = setOf("progression", "unlocks"),
    converter = jsonArrayParser<String>()
).setCacheTime(60 * 5, false)