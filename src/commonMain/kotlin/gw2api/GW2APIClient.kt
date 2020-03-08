/*
 * Copyright 2018-2020 Leon Linhart
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gw2api

import gw2api.misc.*
import io.ktor.client.*
import io.ktor.utils.io.core.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * TODO doc
 *
 * @since   0.1.0
 */
public class GW2APIClient(
    public val httpClient: HttpClient,
    public val host: String = OFFICIAL_HOST,
    private val cacheAccessor: CacheAccessor? = null,
    private val rateLimiter: RateLimiter? = null,
    public val checkPermissions: Boolean = false,
    public val json: Json = Json(JsonConfiguration.Stable)
) : Closeable by httpClient {

    public companion object {
        /**
         * TODO doc
         *
         * @since   0.1.0
         */
        public const val OFFICIAL_HOST = "api.guildwars2.com"
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