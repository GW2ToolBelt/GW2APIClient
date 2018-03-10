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
 * GW2APIClient supports client side rate limiting in order to reduce the load on the remote API and to enable easier
 * debugging of applications.
 *
 * The calls that are made to the remote API **should never be tracked manually** since a query against a remote API is
 * indistinguishable from a query against the cache. (Additionally, when using client side validation, it is just as
 * possible that a client makes two queries against the remote API instead of one.)
 *
 * @since   0.1.0
 */
interface RateController {

    /**
     * Whether or not this rate controller can be resetted **manually**.
     *
     * @see reset
     *
     * @since   0.1.0
     */
    val isResettable: Boolean

    /**
     * TODO
     *
     * @since   0.1.0
     */
    fun reset()

    /**
     * TODO
     *
     * @return the number of calls that are still available in the current interval
     *
     * @since   0.1.0
     */
    fun increment(endpoint: String): Int

    /**
     * TODO
     *
     * @throws RateLimitException   if the rate limit has been exceeded
     *
     * @since   0.1.0
     */
    fun tryIncrement(endpoint: String) {
        increment(endpoint).let {
            if (it <= 0)
                throw RateLimitException()
        }
    }

}