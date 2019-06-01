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
import kotlinx.serialization.*
import kotlin.jvm.*

/**
 * Queries the `/v2/dailycrafting` endpoint.
 *
 * ## The /v2/dailycrafting endpoint
 *
 * > This resource returns information about the items that can be crafted once per day.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       No
 * Localized:           No
 * Cache time:          24 hours
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/dailycrafting]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2019-04-08)
 */
@GW2APIv2DataIds("dailycrafting")
fun gw2v2DailyCrafting(): RequestBuilder<Collection<String>> = query(
    endpoint = "/v2/dailycrafting",
    converter = jsonArrayParser(String.serializer())
).withCacheTime(24u, TimeUnit.HOURS)