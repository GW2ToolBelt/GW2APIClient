/*
 * Copyright (c) 2018-2022 Leon Linhart
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
@file:Suppress("RedundantVisibilityModifier", "MemberVisibilityCanBePrivate")
package com.gw2tb.gw2api.client

import com.gw2tb.gw2api.client.http.*
import com.gw2tb.gw2api.client.internal.*
import com.gw2tb.gw2api.client.v2.*
import kotlinx.coroutines.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*

/**
 * A builder for a [Request].
 *
 * @property host                   the host of the API
 * @property cacheAccess            the cache implementation to use
 * @property rateLimiter            the rate-limiter to use
 * @property checkPermissions       whether to perform client-side permission checks
 *
 * @since   0.1.0
 */
@OptIn(InternalGW2APIClientApi::class)
public class RequestBuilder<T> internal constructor(
    private val client: GW2APIClient,
    private val httpClient: IHttpClient,
    private val host: String,
    private val path: String,
    private val parameters: Map<String, String>,
    private val replaceInPath: Map<String, String>,
    private val requiredPermissions: Collection<String>,
    private val supportedLanguages: Set<Language>,
    private val serializer: KSerializer<T>,
    private val json: Json,
    public var cacheAccess: CacheAccess?,
    public var rateLimiter: RateLimiter?,
    public var checkPermissions: Boolean
) {

    /**
     * The API key for the request.
     *
     * @since   0.4.0
     */
    public var apiKey: String? = null

    /**
     * Sets the [apiKey] for the request and returns the receiver.
     *
     * @since   0.4.0
     */
    public fun withAPIKey(value: String?): RequestBuilder<T> = apply { apiKey = value }

    /**
     * Sets the [cacheAccess] for the request and returns the receiver.
     *
     * By default, the [CacheAccess] is inherited from the API client.
     * Setting this value to `null` disables caching.
     *
     * @since   0.4.0
     */
    public fun withCacheAccess(value: CacheAccess?): RequestBuilder<T> = apply { cacheAccess = value }

    /**
     * The language for the request.
     *
     * Setting the language to an unsupported value for the endpoint targeted by this request, throws an [IllegalArgumentException].
     *
     * @since   0.4.0
     */
    public var language: Language? = null
        set(value) {
            require(supportedLanguages.isNotEmpty()) { "Localization is not supported for endpoint $path." }
            require(value in supportedLanguages) { "Language '$value' is not supported for endpoint $path. (Supported languages are: ${supportedLanguages.joinToString()})" }

            field = value
        }

    /**
     * Sets the [rateLimiter] for the request and returns the receiver.
     *
     * By default, the [RateLimiter] is inherited from the API client.
     * Setting this value to `null` disables rate limiting.
     *
     * @since   0.4.0
     */
    public fun withRateLimiter(value: RateLimiter?): RequestBuilder<T> = apply { rateLimiter = value }

    /**
     * Sets the [language] for the request and returns the receiver.
     *
     * @since   0.4.0
     */
    public fun withLanguage(value: Language): RequestBuilder<T> = apply { language = value }

    /**
     * Sets whether client-side permissions are enabled for the request and returns the receiver.
     *
     * @since   0.4.0
     */
    public fun withPermissionChecks(value: Boolean): RequestBuilder<T> = apply { checkPermissions = value }

    /**
     * Executes the request within the given `scope` and returns a [Request] instance.
     *
     * @param scope the scope to use
     *
     * @return  the request
     *
     * @since   0.1.0
     */
    public fun execute(
        scope: CoroutineScope
    ): Request<T> {
        val cacheAccess = cacheAccess
        val rateLimiter = rateLimiter
        val checkPermissions = checkPermissions

        return Request(
            host = host,
            path = path.let {
                var path = it
                replaceInPath.forEach { (k, v) -> path = path.replace(k, v) }
                return@let path
            },
            parameters = HashMap(parameters).let {
                var parameters: Map<String, String> = it
                if (language !== null || supportedLanguages.isNotEmpty()) parameters = parameters + ("lang" to (language ?: Language.ENGLISH).code)
                return@let parameters
            },
            apiKey = apiKey
        ) { request ->
            scope.async {
                if (cacheAccess !== null) {
                    val cachedResponse = cacheAccess.query(request)
                    if (cachedResponse !== null) return@async cachedResponse
                }

                /*
                 * Perform basic client-side permission checks to avoid flooding the remote API with "bad requests".
                 *
                 * This check only occurs if
                 * - the `checkPermissions` flag is set appropriately,
                 * - the endpoint requires authentication, and
                 * - the endpoint is not "/v2/tokeninfo". (*)
                 *
                 * (*) The "/v2/tokeninfo" requires authentication and would qualify for client-side permission checks. In
                 *     order to avoid running into recursive calls it is therefore explicitly handled separately.
                 */
                if (checkPermissions && requiredPermissions.isNotEmpty() && path != "/v2/tokeninfo") {
                    val perm = client.gw2v2TokenInfo {
                        apiKey = this@RequestBuilder.apiKey
                    }.execute(scope).get()

                    if (perm.data.isSuccess) {
                        if (!perm.data.getOrNull()!!.permissions.containsAll(requiredPermissions)) {
                            throw InsufficientPermissionsException("Insufficient permissions for endpoint $path: ${perm.data.getOrNull()!!.permissions} (Required permissions ${requiredPermissions.joinToString()})")
                        }
                    } else {
                        throw UnauthenticatedException("Endpoint $path requires authentication but no API key was provided. (Required permissions ${requiredPermissions.joinToString()})")
                    }
                }

                val httpCall = scope.async(start = CoroutineStart.LAZY) httpCall@{
                    val httpResponse = httpClient.send(request)

                    val response = Response(
                        request = request,
                        status = httpResponse.status,
                        headers = ResponseHeaders(httpResponse.headers),
                        body = httpResponse.body,
                        dataFun = { body -> json.decodeCatching(serializer, body) }
                    )

                    if (response.status == 429 /* = RATE_LIMIT_EXCEEDED */)
                        rateLimiter?.penalize()

                    if (cacheAccess !== null)
                        cacheAccess.memoize(response)

                    return@httpCall response
                }

                rateLimiter?.acquire()
                httpCall.await()
            }
        }
    }

}