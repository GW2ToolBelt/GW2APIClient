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
@file:JvmName("GW2v1")
@file:JvmMultifileClass
package gw2api.v1

import gw2api.*
import gw2api.extra.*
import kotlin.jvm.*

/**
 * Queries the `/v1/build` endpoint.
 *
 * ## The /v1/build endpoint
 *
 * > This resource returns the current build id of the game. This can be used, for example, to register when event
 *   timers reset due to server restarts.
 *
 * ```
 * Paginated:           No
 * Bulk expanded:       No
 * Authenticated:       No
 * Localized:           No
 * Cache time:          1 minute
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:1/build]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0
 */
@GW2APIv1Data("build")
fun gw2v1Build(): RequestBuilder<GW2v1Build> = query(
    endpoint = "/v1/build",
    converter = jsonParser(GW2v1Build.serializer())
).setCacheTime(60, false)