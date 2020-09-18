/*
 * Copyright (c) 2018-2020 Leon Linhart
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
import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * TODO doc
 *
 * @since   0.1.0
 */
public class GW2APIClient(
    public val httpClient: IHttpClient,
    public val host: String = OFFICIAL_HOST,
    private val cacheAccessor: CacheAccessor? = null,
    private val rateLimiter: RateLimiter? = null,
    public val checkPermissions: Boolean = false,
    public val json: Json = Json {
        encodeDefaults = false
    }
) : Closeable by httpClient {

    public companion object {
        /**
         * TODO doc
         *
         * @since   0.1.0
         */
        public const val OFFICIAL_HOST: String = "api.guildwars2.com"
    }

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    internal fun <T> request(
        path: String,
        parameters: Map<String, String>,
        replaceInPath: Map<String, String>,
        requiresAuthentication: Boolean,
        requiredPermissions: Set<String>,
        supportedLanguages: Set<Language>,
        serializer: KSerializer<T>,
        configure: (RequestBuilder<T>.() -> Unit)?
    ): RequestBuilder<T> {
        val builder = RequestBuilder(
            this,
            host = host,
            path = path,
            parameters = parameters,
            replaceInPath = replaceInPath,
            requiresAuthentication = requiresAuthentication,
            requiredPermissions = requiredPermissions,
            supportedLanguages = supportedLanguages,
            serializer = serializer,
            json = json,
            cacheAccessor = cacheAccessor,
            rateLimiter = rateLimiter,
            checkPermissions = checkPermissions,
            httpClient = httpClient
        )

        if (configure !== null) configure(builder)

        return builder
    }

}