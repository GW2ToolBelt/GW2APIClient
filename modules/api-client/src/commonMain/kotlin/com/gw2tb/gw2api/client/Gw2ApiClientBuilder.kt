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

import kotlinx.serialization.json.Json

/**
 * An intermediate object for building [Gw2ApiClient] instances.
 *
 * @since   0.5.0
 */
public class Gw2ApiClientBuilder internal constructor() {

    /**
     * The host URL to use for API requests.
     *
     * The value should be a valid URL without a trailing slash or query parameters.
     *
     * @since   0.5.0
     */
    public var host: String = Gw2ApiClientDefaults.host

    /**
     * The cache access object to use for caching API responses.
     *
     * This value is optional and defaults to `null`.
     *
     * @since   0.5.0
     */
    public var cacheAccess: CacheAccess? = null

    /**
     * The rate limiter to use for rate limiting API requests.
     *
     * By default, a [TokenBucketRateLimiter] with a bucket size of 300 and a refill duration of one minute is used.
     *
     * @since   0.5.0
     */
    public var rateLimiter: RateLimiter? = Gw2ApiClientDefaults.rateLimiter()

    /**
     * The [Json] instance used for deserialization.
     *
     * @since   0.5.0
     */
    public var json: Json = Gw2ApiClientDefaults.json

// For some reason, this fails when compiling for the JVM:
//    internal val requestConfigurers: MutableList<RequestConfigurer> = ArrayList(initialCapacity = 1)
    internal val requestConfigurers: MutableList<RequestConfigurer> = mutableListOf()

    /**
     * Adds a [RequestConfigurer] that is used to configure each request before it is sent.
     *
     * @param configurer    the [RequestConfigurer] to add
     *
     * @since   0.5.0
     */
    public fun configureRequest(configurer: RequestConfigurer) {
        requestConfigurers += configurer
    }

}

/**
 * Defaults values for [Gw2ApiClient] instances.
 *
 * @since   0.5.0
 */
public object Gw2ApiClientDefaults {

    /**
     * The default host URL to use for API requests.
     *
     * @since   0.5.0
     */
    @Suppress("MayBeConstant") // We don't want the compiler to inline it
    public val host: String = "https://api.guildwars2.com"

    /**
     * The default [Json] instance used for deserialization.
     *
     * @since   0.5.0
     */
    public val json: Json = Json {
        /* Disabled by default. See https://github.com/Kotlin/kotlinx.serialization/issues/1512 */
        useAlternativeNames = false
    }

    /**
     * Creates a new [RateLimiter] instance that is configured for the defaults of the official Guild Wars 2 API.
     *
     * @since   0.5.0
     */
    public fun rateLimiter(): RateLimiter =
        TokenBucketRateLimiter()

}