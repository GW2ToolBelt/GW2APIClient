/*
 * Copyright (c) 2018-2024 Leon Linhart
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.gw2tb.gw2api.client

/**
 * Provides basic access to a response caching implementation.
 *
 * This interface does not make any guarantees about the caching behavior of its implementations.
 *
 * @since   0.1.0
 */
public interface CacheAccess {

    /**
     * Memoizes the given [Gw2ApiResponse].
     *
     * @param response  the response to be memoized
     *
     * @since   0.1.0
     */
    public fun <T> memoize(response: Gw2ApiResponse<T>)

    /**
     * Queries the cache for a given [Gw2ApiRequest] and returns the cached [Gw2ApiResponse] or `null` if no appropriate
     * response was cached.
     *
     * @param request   the request for which the cache should be checked
     *
     * @return  the cached response or `null`
     *
     * @since   0.1.0
     */
    public fun <T> query(request: Gw2ApiRequest<T>): Gw2ApiResponse<T>?

}