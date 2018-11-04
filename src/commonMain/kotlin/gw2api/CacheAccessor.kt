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
 * An accessor providing basic read and write access to a cache.
 *
 * GW2APIClient supports caching to reduce load on remote API servers. However, GW2APIClient does not come with any
 * cache implementations by default.
 *
 * @since   0.1.0
 */
interface CacheAccessor {

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    fun <T> memoize(response: Response<T>)

    /**
     * Attempts to lookup a cached response for the given [request].
     *
     * @return  the cached response or `null`
     *
     * @since   0.1.0
     */
    fun <T> query(request: Request<T>): Response<T>?

}