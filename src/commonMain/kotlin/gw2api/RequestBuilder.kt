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
@file:Suppress("RedundantVisibilityModifier", "MemberVisibilityCanBePrivate")
package gw2api

import gw2api.v2.*
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.coroutines.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlin.jvm.*
import kotlin.time.*

/**
 * TODO doc
 *
 * @since   0.1.0
 */
public class RequestBuilder<out T> internal constructor(
    private val client: GW2APIClient,
    private val host: String,
    private val path: String,
    private val parameters: Map<String, String>,
    private val replaceInPath: Map<String, String>,
    private val requiresAuthentication: Boolean,
    private val requiredPermissions: Collection<String>,
    private val supportedLanguages: Set<Language>,
    private val serializer: KSerializer<T>,
    private val json: Json,
    public var cacheAccessor: CacheAccessor?,
    public var rateLimiter: RateLimiter?,
    public var checkPermissions: Boolean,
    public var httpClient: HttpClient
) {

    public var apiKey: String? = null
    public fun withAPIKey(value: String?): RequestBuilder<T> = apply { apiKey = value }

    public var language: Language? = null
        set(value) {
            check(supportedLanguages.isNotEmpty())
            check(language in supportedLanguages)

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
     * TODO doc
     *
     * @since   0.1.0
     */
    public fun execute(
        scope: CoroutineScope
    ): Request<T> {
        val apiKey = apiKey
        val url = URLBuilder(host).apply {
            host = this@RequestBuilder.host

            val modifiedPath = this@RequestBuilder.path.let {
                var path = it
                replaceInPath.forEach { (k, v) -> path = path.replace(k, v) }
                return@let path
            }

            path(modifiedPath.split("/"))
            with (parameters) {
                this@RequestBuilder.parameters.forEach { (k, v) -> append(k, v) }
                if (apiKey !== null) append("access_token", apiKey)
                if (language !== null || supportedLanguages.isNotEmpty()) append("lang", (language ?: Language.ENGLISH).code)
            }
        }.build()

        return Request(
            host = url.host,
            path = path,
            encodedPath = url.encodedPath,
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
                 *     order to avoid running into recursive calls it is therefor explicitly handled separately.
                 */
                if (checkPermissions && requiresAuthentication && path != "/v2/tokeninfo") {
                    val perm = client.gw2v2TokenInfo {
                        this@RequestBuilder.apiKey = apiKey
                    }.execute(scope).get()

                    if (perm.data != null) {
                        if (!perm.data!!.permissions.containsAll(requiredPermissions)) {
                            throw InsufficientPermissionsException("") // TODO
                        }
                    } else {
                        throw UnauthenticatedException("") // TODO
                    }
                }

                val httpCall = scope.async(start = CoroutineStart.LAZY) {
                    val httpResponse = httpClient.get<HttpResponse>(url)
                    if (!httpResponse.status.isSuccess()) {
                        // TODO error handling
                    }

                    Response(
                        dataFun = httpResponse.readText().let { text -> { json.decodeFromString(serializer, text) } } // TODO handle parsing errors properly
                    ).also { cacheAccessor?.memoize(it) }
                }

                rateLimiter.also { rateLimiter -> if (rateLimiter !== null) rateLimiter.execute(httpCall) else httpCall.start() }
                httpCall.await()
            }
        }
    }

}