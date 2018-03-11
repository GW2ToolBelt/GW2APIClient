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
package gw2api

/**
 *
 *
 * GW2APIClient supports caching to optimize performance and to reduce load on the remote API. By default, all responses
 * are cached in memory until they expire. This behaviour, can be customized or replaced, as documented in
 * [CacheController].
 *
 * The expiration time of a response is determined using the following formula:
 *
 * 1. If the remote's response contains an expiration header, the header's expiration time is used, unless the cache
 *    timeout is explicitly overwritten (by setting [overrideCacheTime] to `true`).
 * 2. If the remote's response does not contain an expiration header (or the cache timeout is explicitly
 *    overwritten), the custom cache-time is used instead.
 * 3. If the cache-time has not been set explicitly, a reasonable default (that is documented in the endpoint's
 *    query method) will be used instead.
 *
 * With [RequestBuilder.setSkipCache] it is possible to bypass the cache lookup. (The response will still be cached.)
 *
 * @since   0.1.0
 */
interface CacheController {

    fun dispose() {}

}