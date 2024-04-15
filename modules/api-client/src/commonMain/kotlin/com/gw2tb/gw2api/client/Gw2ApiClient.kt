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

import com.gw2tb.gw2api.client.internal.*
import com.gw2tb.gw2api.client.internal.http.IHttpClient
import kotlinx.serialization.json.*

/**
 * Creates a new [Gw2ApiClient] using the provided [IHttpClient] and the given configuration.
 *
 * @param httpClient    the HTTP client implementation to use
 * @param block         the configuration block
 *
 * @since   0.5.0
 */
@InternalGw2ApiClientApi
public fun Gw2ApiClient(httpClient: IHttpClient, block: Gw2ApiClientConfigurer): Gw2ApiClient {
    val builder = Gw2ApiClientBuilder()
    with(block) { builder.configure() }

    return Gw2ApiClient(httpClient, builder)
}

/**
 * A client that may be used to make requests to the official Guild Wars 2 API
 * (or a mirror).
 *
 * @param httpClient        the HTTP client implementation to use
 * @param host              the host of the API
 * @param cacheAccess       the cache implementation to use
 * @param rateLimiter       the rate-limiter to use
 * @param json              the [Json] instance used for deserialization
 *
 * @since   0.5.0
 */
@OptIn(InternalGw2ApiClientApi::class)
public expect class Gw2ApiClient @InternalGw2ApiClientApi constructor(
    httpClient: IHttpClient,
    host: String,
    cacheAccess: CacheAccess?,
    rateLimiter: RateLimiter?,
    json: Json,
    requestConfigurers: List<RequestConfigurer>
) {

    @InternalGw2ApiClientApi
    public constructor(httpClient: IHttpClient, builder: Gw2ApiClientBuilder)

    /**
     * Asynchronously executes the given request.
     *
     * @param template  the request template
     *
     * @return  the response
     *
     * @since   0.5.0
     */
    public suspend fun <T> executeAsync(template: RequestTemplate<T>): Gw2ApiResponse<T>

}