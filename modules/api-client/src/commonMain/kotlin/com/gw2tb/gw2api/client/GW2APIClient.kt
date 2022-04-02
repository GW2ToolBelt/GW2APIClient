/*
 * Copyright (c) 2018-2021 Leon Linhart
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

import com.gw2tb.gw2api.client.http.*
import com.gw2tb.gw2api.client.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * A client that may be used to make requests to the official Guild Wars 2 API
 * (or a mirror).
 *
 * @param httpClient        the HTTP client implementation to use
 * @param host              the host of the API
 * @param cacheAccess       the cache implementation to use
 * @param rateLimiter       the rate-limiter to use
 * @param checkPermissions  whether to perform client-side permission checks
 * @param json              the [Json] instance used for deserialization
 *
 * @since   0.1.0
 */
@OptIn(InternalGW2APIClientApi::class)
public class GW2APIClient(
    private val httpClient: IHttpClient,
    public val host: String = OFFICIAL_HOST,
    private val cacheAccess: CacheAccess? = null,
    private val rateLimiter: RateLimiter? = null,
    public val checkPermissions: Boolean = false,
    public val json: Json = Json {
        /* Disabled by default. See https://github.com/Kotlin/kotlinx.serialization/issues/1512 */
        useAlternativeNames = false
    }
) : Closeable by httpClient {

    public companion object {
        /**
         * The host for the official Guild Wars 2 API.
         *
         * @since   0.1.0
         */
        public const val OFFICIAL_HOST: String = "api.guildwars2.com"
    }

    internal fun <T> request(
        path: String,
        parameters: Map<String, String>,
        replaceInPath: Map<String, String>,
        requiredPermissions: Set<String>,
        supportedLanguages: Set<Language>,
        serializer: KSerializer<T>,
        configure: RequestConfigurator<T>?
    ): RequestBuilder<T> {
        val builder = RequestBuilder(
            this,
            host = host,
            path = path,
            parameters = parameters,
            replaceInPath = replaceInPath,
            requiredPermissions = requiredPermissions,
            supportedLanguages = supportedLanguages,
            serializer = serializer,
            json = json,
            cacheAccess = cacheAccess,
            rateLimiter = rateLimiter,
            checkPermissions = checkPermissions,
            httpClient = httpClient
        )

        if (configure !== null) with(configure) { builder.configure() }

        return builder
    }

}