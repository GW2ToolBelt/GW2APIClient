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
@file:Suppress("RedundantVisibilityModifier", "MemberVisibilityCanBePrivate")
package com.gw2tb.gw2api.client

import com.gw2tb.gw2api.client.http.*
import com.gw2tb.gw2api.client.internal.*
import com.gw2tb.gw2api.client.v2.*
import kotlinx.coroutines.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlin.jvm.*
import kotlin.time.*

/**
 * A builder for a [Request].
 *
 * @param requiresAuthentication    whether or not the endpoint requires authentication
 * @param requiredPermissions       the permissions required by the endpoint
 * @param supportedLanguages        the languages supported by the endpoint
 * @param cacheAccessor             the cache implementation to use
 * @param rateLimiter               the rate-limiter to use
 * @param checkPermissions          whether or not to perform client-side permission checks
 *
 * @since   0.1.0
 */
@OptIn(InternalGW2APIClientApi::class)
public class RequestBuilder<T> internal constructor(
    private val client: GW2APIClient,
    private val host: String,
    private val path: String,
    private val parameters: Map<String, String>,
    private val replaceInPath: Map<String, String>,
    public val requiresAuthentication: Boolean,
    public val requiredPermissions: Collection<String>,
    public val supportedLanguages: Set<Language>,
    private val serializer: KSerializer<T>,
    private val json: Json,
    public var cacheAccessor: CacheAccessor?,
    public var rateLimiter: RateLimiter?,
    public var checkPermissions: Boolean,
    private val httpClient: IHttpClient
) {

    public var apiKey: String? = null
    public fun withAPIKey(value: String?): RequestBuilder<T> = apply { apiKey = value }

    public var language: Language? = null
        set(value) {
            check(supportedLanguages.isNotEmpty()) { "Localization is not supported for endpoint $path." }
            check(value in supportedLanguages) { "Language '$value' is not supported for endpoint $path. (Supported languages are: ${supportedLanguages.joinToString()})" }

            field = value
        }

    public fun withLanguage(value: Language): RequestBuilder<T> = apply { language = value }

    private var cacheTime: Duration = Duration.ZERO
    private var overrideCacheTime: Boolean = false

    @JvmOverloads
    public fun withCacheTime(duration: Duration, override: Boolean = false): RequestBuilder<T> = apply {
        require(duration.isPositive())
        cacheTime = duration
        overrideCacheTime = override
    }

    public fun withCacheAccessor(value: CacheAccessor?): RequestBuilder<T> = apply { cacheAccessor = value }
    public fun withRateLimiter(value: RateLimiter?): RequestBuilder<T> = apply { rateLimiter = value }
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
                cacheAccessor?.let { cache -> cache.query(request)?.let { cached -> return@async cached } }

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
                if (checkPermissions && requiresAuthentication && path != "/v2/tokeninfo") {
                    val perm = client.gw2v2TokenInfo {
                        apiKey = this@RequestBuilder.apiKey
                    }.execute(scope).get()

                    if (perm.data != null) {
                        if (!perm.data!!.permissions.containsAll(requiredPermissions)) {
                            throw InsufficientPermissionsException("Insufficient permissions for endpoint $path: ${perm.data!!.permissions} (Required permissions ${requiredPermissions.joinToString()})")
                        }
                    } else {
                        throw UnauthenticatedException("Endpoint $path requires authentication but no API key was provided. (Required permissions ${requiredPermissions.joinToString()})")
                    }
                }

                val httpCall = scope.async(start = CoroutineStart.LAZY) {
                    val response = httpClient.send(request)

                    Response(
                        request = request,
                        status = response.status,
                        headers = response.headers,
                        body = response.body,
                        dataFun = { body -> runCatching { json.decodeFromString(serializer, body) }.getOrNull() }
                    ).also { cacheAccessor?.memoize(it) }
                }

                rateLimiter.also { rateLimiter -> if (rateLimiter !== null) rateLimiter.execute(request) { httpCall.start() } else httpCall.start() }
                httpCall.await()
            }
        }
    }

}