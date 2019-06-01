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
@file:JvmName("GW2v2")
@file:JvmMultifileClass
@file:Suppress("PackageDirectoryMismatch")
package gw2api.v2

import gw2api.*
import gw2api.extra.*
import gw2api.misc.*
import kotlin.jvm.*

/**
 * Queries the `/v2/account` endpoint.
 *
 * ## The /v2/account endpoint
 *
 * > This resource returns information about player accounts. This endpoint is only accessible with a valid API key.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       Yes
 * Localized:           No
 * Cache time:          5 minutes
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/account]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2015-02-24)
 */
@GW2APIv2Data("account")
fun gw2v2Account(): RequestBuilder<GW2v2Account> = query(
    endpoint = "/v2/account",
    requiresAuthentication = true,
    requiredPermissions = setOf("account"),
    converter = jsonParser(GW2v2Account.serializer())
).withCacheTime(5u, TimeUnit.MINUTES)