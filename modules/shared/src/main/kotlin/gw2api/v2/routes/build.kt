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
 * Queries the `/v2/build` endpoint.
 *
 * ## The /v2/build endpoint
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
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/build]
 *
 * @return  the request that is used to query the API
 *
 * @since   0.1.0 (API: 2015-02-13)
 */
fun gw2v2Build(): RequestBuilder<GW2v2Build> = query(
    endpoint = "/v2/build",
    converter = jsonParser<GW2v2Build>()
).setCacheTime(60, false)