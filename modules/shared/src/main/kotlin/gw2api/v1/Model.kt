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
package gw2api.v1

import kotlinx.serialization.*

/**
 * This resource returns the current build id of the game. This can be used, for example, to register when event timers
 * reset due to server restarts.
 *
 * ## Example
 *
 * `https://api.guildwars2.com/v1/build`
 *
 * ```
 * {
 *   "id": 45075
 * }
 * ```
 *
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:1/build]
 *
 * @param id    the current build id as number
 *
 * @see gw2v1Build
 *
 * @since   0.1.0
 */
@Serializable
data class GW2v1Build(
    /** @since  0.1.0 (API: 2015-02-13) */
    val id: Int
)