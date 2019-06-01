/*
 * Copyright 2018-2019 Leon Linhart
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

import gw2api.misc.*
import io.ktor.client.*
import io.ktor.http.*
import kotlinx.coroutines.*
import kotlin.jvm.*

/**
 * TODO doc
 *
 * @since   0.1.0
 */
class RequestBuilder<out T> internal constructor(
    private val endpoint: String,
    private val params: Map<String, String>,
    private val replaceInPath: Map<String, String> = emptyMap(),
    private val requiresAuthentication: Boolean,
    private val requiredPermissions: Collection<String>,
    private val isLocalized: Boolean,
    private val supportedLanguages: List<Language>,
    private val converter: (String) -> T
) {

    companion object {
        const val host = "api.guildwars2.com"

        @JvmStatic
        val httpClient by lazy { HttpClient() }
    }

    // Query customization

    private var apiKey: String? = null
    private var language: Language? = null

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    fun withAPIKey(value: String?): RequestBuilder<T> = apply { apiKey = value }

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    fun withLanguage(value: Language): RequestBuilder<T> = apply {
        if (value !in supportedLanguages) throw IllegalArgumentException()
        language = value
    }

    private var checkPermissions: Boolean = false

    // Host

    private var httpClient: HttpClient? = null
    private var protocol: URLProtocol = URLProtocol.HTTPS
    private lateinit var host: String
    private var port: UShort = 0u

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    fun withClient(value: HttpClient): RequestBuilder<T> = apply { httpClient = value }

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    fun withProtocol(value: URLProtocol): RequestBuilder<T> = apply {
        protocol = value
    }

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    @JvmOverloads
    fun withHost(value: String, port: UShort = 0u): RequestBuilder<T> = apply {
        host = value
        this.port = port
    }

    // Caching

    private var cacheAccessor: CacheAccessor? = null
    private var cacheTime: ULong = 0u
    private var overrideCacheTime: Boolean = false

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    fun withCache(accessor: CacheAccessor?): RequestBuilder<T> = apply { cacheAccessor = accessor }

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    @JvmOverloads
    fun withCacheTime(value: ULong, unit: TimeUnit, override: Boolean = false): RequestBuilder<T> = apply {
        cacheTime = unit.toSeconds(value.toLong()).toULong()
        overrideCacheTime = override
    }

    // Rate Limiting

    private var rateLimiter: RateLimiter? = null

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    fun withRateLimiter(value: RateLimiter?): RequestBuilder<T> = apply { rateLimiter = value }

    // Execution

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    @JvmOverloads
    fun execute(
        scope: CoroutineScope = GlobalScope
    ): Request<T> {
        val endpoint = endpoint
        val apiKey = apiKey
        val language = language ?: Language.ENGLISH

        if (!this::host.isInitialized) host = RequestBuilder.host

        val url = URLBuilder(host).apply {
            protocol = this@RequestBuilder.protocol
            host = this@RequestBuilder.host
            port = this@RequestBuilder.port.let { port -> if (port > 0u) port.toInt() else protocol.defaultPort }

            var path = endpoint
            replaceInPath.entries.forEach { (k, v) -> path = path.replace(k, v) }

            encodedPath = path

            with (parameters) {
                this@RequestBuilder.params.forEach { (k, v) -> append(k, v) }
                if (apiKey !== null) append("access_token", apiKey)
                if (this@RequestBuilder.isLocalized) append("lang", language.code)
            }
        }

        return Request(
            endpoint = endpoint,
            apiKey = apiKey,
            host = url.host,
            port = url.port.toUShort(),
            requiresAuthentication = requiresAuthentication,
            requiredPermissions = requiredPermissions,
            checkPermissions = checkPermissions,
            httpClient = httpClient ?: RequestBuilder.httpClient,
            cacheAccessor = cacheAccessor,
            cacheTime = cacheTime,
            overrideCacheTime = overrideCacheTime,
            rateLimiter = rateLimiter,
            coroutineScope = scope,
            url = url.buildString(),
            converter = converter
        )
    }

}