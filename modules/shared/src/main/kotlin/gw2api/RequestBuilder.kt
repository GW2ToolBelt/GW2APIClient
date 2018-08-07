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

import gw2api.misc.*
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.request.*
import io.ktor.client.response.*
import io.ktor.http.*
import io.ktor.util.date.*
import kotlinx.coroutines.experimental.*

class RequestBuilder<out T> internal constructor(
    private var host: String,
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
        private val httpClient = HttpClient()
    }

    private var protocol: URLProtocol = URLProtocol.HTTPS
    private var port: Int = -1

    // Caching
    private lateinit var cacheController: CacheController
    private var cacheTime: Long = 0L

    // Rate limiting
    private lateinit var rateLimiter: RateLimiter



    init {

    }

    private lateinit var apiKey: String
    private var overrideCacheTime = false
    private var skipCache = false
    private var isClientAssertive = false
    private var language: Language = Language.ENGLISH

    /**
     * Sets the API key for the request.
     *
     * Some endpoints return data that is specific to a single account, and thus, can only be retrieved by using an
     * API key. A user must generate an API key by visiting
     * [account.arena.net/applications](https://account.arena.net/applications) and following the instructions on that
     * side.
     * If client side validation is enabled, querying an endpoint that requires authentication without or with an
     * invalid key or with an api key that does not have the permissions required for that endpoint, the query will fail
     * with an exception.
     *
     *
     * **Consecutive calls override the previously set value.**
     *
     * @param apiKey    the API key for the request
     *
     * @return  this builder instance
     *
     * @since   0.1.0
     */
    @Suppress("UNUSED")
    fun setAPIKey(apiKey: String): RequestBuilder<T> = apply {
        this.apiKey = apiKey
    }

    /**
     * Sets the base URL for the request.
     *
     *
     * **Consecutive calls override the previously set value.**
     *
     * @return url  the base URL for the request
     *
     * @return  this builder instance
     *
     * @since   0.1.0
     */
    @Suppress("UNUSED")
    fun setBaseURL(url: String): RequestBuilder<T> = apply {
        host = url
    }

    /**
     * Sets the cache time for the response.
     *
     * GW2APIClient supports caching to optimize performance and to reduce load on the remote API.
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
     * With [setSkipCache] it is possible to bypass the cache lookup. (The response will still be cached.)
     *
     *
     * **Consecutive calls override the previously set value.**
     *
     * @param cacheTime         time the for the response to be cached
     * @param overrideCacheTime whether or not cache-timeout specified by the remote should be overwritten
     *
     * @return  this builder instance
     *
     * @since   0.1.0
     */
    @Suppress("UNUSED")
    fun setCacheTime(cacheTime: Long, overrideCacheTime: Boolean): RequestBuilder<T> = apply {
        this.cacheTime = cacheTime
        this.overrideCacheTime = overrideCacheTime
    }

    /**
     * TODO
     *
     *
     * **Consecutive calls override the previously set value.**
     *
     * @return  this builder instance
     *
     * @since   0.1.0
     */
    @Suppress("UNUSED")
    fun setClientValidation(value: Boolean): RequestBuilder<T> = apply {
        this.isClientAssertive = value
    }

    /**
     * Sets the [Language] for the request.
     *
     * Whether or not an endpoint is localized is documented in the respective method's documentation.
     *
     * **Consecutive calls override the previously set value.**
     *
     * @return  this builder instance
     *
     * @throws IllegalArgumentException if the specified language is not supported by the endpoint
     *
     * @since   0.1.0
     */
    @Suppress("UNUSED")
    fun setLanguage(language: Language) {
        if (language !in supportedLanguages)
            throw IllegalArgumentException("Language $language not supported by endpoint $endpoint")

        this.language = language
    }

    /**
     * Sets whether or not the cache should be skipped when querying the API.
     *
     * GW2APIClient supports caching to optimize performance and to reduce load on the remote API.
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
     * With [setSkipCache] it is possible to bypass the cache lookup. (The response will still be cached.)
     *
     *
     * **Consecutive calls override the previously set value.**
     *
     * @param skipCache whether or not the cache should be skipped when querying the API
     *
     * @return  this builder instance
     *
     * @since   0.1.0
     */
    @Suppress("UNUSED", "MemberVisibilityCanBePrivate")
    fun setSkipCache(skipCache: Boolean): RequestBuilder<T> = apply {
        this.skipCache = skipCache
    }

    private fun URLBuilder.populate(): URLBuilder {
        protocol = this@RequestBuilder.protocol
        port = this@RequestBuilder.port.let { port -> if (port > 0) port else protocol.defaultPort }
        host = this@RequestBuilder.host

        var path = endpoint
        replaceInPath.forEach {
            path = path.replace(it.key, it.value)
        }

        encodedPath = path

        with (parameters) {
            this@RequestBuilder.params.forEach { (k, v) -> append(k, v) }
            if (this@RequestBuilder::apiKey.isInitialized) append("access_token", this@RequestBuilder.apiKey)
            if (this@RequestBuilder.isLocalized) append("lang", this@RequestBuilder.language.code)
        }

        return this
    }


    fun execute(): Request<T> {
        val deferred = async {
//            val url = URLBuilder()
//                .populate()
//                .build()

            // TODO query cache

            val response = httpClient.get<HttpResponse> {
                url { urlBuilder -> urlBuilder.populate() }
            }

            if (!response.status.isSuccess()) {
                // TODO
            }

            /*
            val headerDate: Long = response.headers["date"]
            val headerExpires: Long = response.headers["expires"]
            val expirationTime = headerExpires.let {
            if (it === null || overrideCacheTime)
                if (cacheTime > 0) headerDate + cacheTime else 0L
            else
                it.toInstant().toEpochMilli()
            } */

            val content = response.readText()
            val data = converter.invoke(content)

            // TODO update cache

            return@async Response(data, 0L) // TODO
        }

        return Request(deferred)
    }

}