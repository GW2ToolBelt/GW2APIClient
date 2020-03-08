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
import gw2api.v2.*
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.coroutines.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlin.jvm.*

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

    private var cacheTime: ULong = 0u
    private var overrideCacheTime: Boolean = false

    @JvmOverloads
    fun withCacheTime(value: ULong, unit: TimeUnit, override: Boolean = false): RequestBuilder<T> = apply {
        cacheTime = unit.toSeconds(value.toLong()).toULong()
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
    @JvmOverloads
    public fun execute(
        scope: CoroutineScope = GlobalScope
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
                        if (!perm.data.permissions.containsAll(requiredPermissions)) {
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
                        data = json.parse(serializer, httpResponse.readText())
                    ).also { cacheAccessor?.memoize(it) }
                }

                rateLimiter.let { rateLimiter -> if (rateLimiter !== null) rateLimiter.execute(httpCall) else httpCall.await() }
            }
        }
    }

}