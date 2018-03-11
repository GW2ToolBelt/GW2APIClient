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

import gw2api.v2.*
import kotlinx.coroutines.experimental.*
import kotlinx.serialization.json.*
import kotlin.coroutines.experimental.*

internal fun <T> query(
    endpoint: String,
    params: Map<String, Any> = emptyMap(),
    requiresAuthentication: Boolean = false,
    requiredPermissions: Collection<String> = emptyList(),
    converter: (String) -> T
): RequestBuilder<T> = RequestBuilder(
    "api.guildwars2.com",
    endpoint,
    params,
    requiresAuthentication,
    requiredPermissions,
    converter
)

internal expect fun <T> Continuation<Response<T>>.queryNetwork(
    url: String,
    endpoint: String,
    cacheTime: Int,
    overrideCacheTime: Boolean,
    converter: (String) -> T,
    rateController: RateController?,
    cache: (Response<T>) -> Unit
)

internal inline fun <reified T : Any> jsonParser(): (String) -> T = { str -> JSON.parse(str) }

/**
 * TODO
 *
 * @since   0.1.0
 */
expect class Request<out T> internal constructor(
    url: String,
    endpoint: String,
    response: Deferred<Response<T>>
) {

    val url: String
    val endpoint: String

    suspend fun get(): Response<T>

    fun then(action: (Response<T>) -> Unit)

}

/**
 * TODO
 *
 * @since   0.1.0
 */
class RequestBuilder<out T> internal constructor(
    private var baseURL: String,
    private val endpoint: String,
    private val params: Map<String, Any>,
    private val requiresAuthentication: Boolean,
    private val requiredPermissions: Collection<String>,
    private val converter: (String) -> T
) {

    private lateinit var apiKey: String
    private var cacheTime = 0L
    private var overrideCacheTime = false
    private var skipCache = false
    private var isClientAssertive = false

    private var cacheController: CacheController? = null
    private var rateController: RateController? = null

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
        baseURL = url
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
     * @throws IllegalStateException    if the [CacheController] has not been set yet
     *
     * @since   0.1.0
     */
    @Suppress("UNUSED")
    fun setCacheTime(cacheTime: Long, overrideCacheTime: Boolean): RequestBuilder<T> = apply {
        if (cacheController === null) throw IllegalStateException("CacheController has not been set")

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

    /**
     * Sets the [CacheController] for the request.
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
     * @param cacheController   the cache-controller for the request
     *
     * @return  this builder instance
     *
     * @since   0.1.0
     */
    @Suppress("UNUSED")
    fun setCacheController(cacheController: CacheController): RequestBuilder<T> = apply {
        this.cacheController = cacheController
    }

    /**
     * Sets the [RateController] for the request.
     *
     *
     * **Consecutive calls override the previously set value.**
     *
     * @param rateController    the rate-controller to be used for the request
     *
     * @return  this builder instance
     *
     * @since   0.1.0
     */
    @Suppress("UNUSED")
    fun setRateController(rateController: RateController): RequestBuilder<T> = apply {
        this.rateController = rateController
    }

    /**
     * Builds a request with the specified settings, executes and returns the [Request] object.
     *
     * @return  the [Request] object
     *
     * @since   0.1.0
     */
    @Suppress("UNUSED", "MemberVisibilityCanBePrivate")
    fun execute(): Request<T> {
        val url = "$baseURL$endpoint".let {
            val p = params.map { "${it.key}=${it.value}" }.joinToString("&").let {
                "?${if (this::apiKey.isInitialized) "access_token=$apiKey" else ""}$it"
            }

            "$it${if (p.isEmpty()) "" else p}"
        }

        val futureResponse = async {
            suspendCoroutine<Response<T>> { continuation ->
                fun invokeQuery() {
                    // TODO query cache

                    continuation.queryNetwork(url, endpoint, cacheTime.toInt() * 1000 /* seconds -> millis */, overrideCacheTime, converter, rateController) {
                        // TODO cache response
                    }
                }

                if (isClientAssertive && endpoint == "/v2/tokeninfo") {
                    if (!this@RequestBuilder::apiKey.isInitialized)
                        continuation.resumeWithException(IllegalStateException("No token has been specified"))

                    invokeQuery()
                } else if (isClientAssertive && (requiresAuthentication || requiredPermissions.isNotEmpty())) {
                    if (requiresAuthentication && !this@RequestBuilder::apiKey.isInitialized)
                        continuation.resumeWithException(IllegalStateException("No token has been specified"))

                    gw2v2TokenInfo().execute().then {
                        if (requiredPermissions.any { perm -> perm !in it.data!!.permissions })
                            continuation.resumeWithException(IllegalStateException("Client does not have the necessary permissions"))

                        invokeQuery()
                    }
                } else {
                    invokeQuery()
                }
            }
        }

        return Request(url, endpoint, futureResponse)
    }

}

/**
 * TODO
 *
 * @since   0.1.0
 */
data class Response<out T>(
    val data: T?,
    val expirationDate: Long
) {

    /**
     * TODO
     *
     * @since   0.1.0
     */
    val hasExpired: Boolean get() = TODO()

}