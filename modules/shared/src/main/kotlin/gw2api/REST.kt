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

internal fun <T> GW2APIClient.query(
    endpoint: String,
    authenticated: Boolean = false,
    params: Map<String, Any> = emptyMap(),
    conv: (String) -> T,
    requiresAuthentication: Boolean = false,
    requiredPermissions: Collection<String> = emptyList(),
    // Dynamic
    cacheTime: Int,
    overrideCacheTime: Boolean,
    skipCache: Boolean
): Request<T> {
    val url = "$baseUrl$endpoint".let {
        val p = params.map { "${it.key}=${it.value}" }.joinToString("&").let {
            "?${if (authenticated) "access_token=$apiKey" else ""}$it"
        }

        "$it${if (p.isEmpty()) "" else p}"
    }

    val futureResponse = async {
        suspendCoroutine<Response<T>> { continuation ->
            fun invokeQuery() {
                // TODO query cache

                continuation.queryNetwork(url, endpoint, cacheTime * 1000 /* seconds -> millis */, overrideCacheTime, conv, rateController) {
                    // TODO cache response
                }
            }

            if (isClientAssertive && endpoint == "/v2/tokeninfo") {
                if (apiKey === null)
                    continuation.resumeWithException(IllegalStateException("No token has been specified"))

                invokeQuery()
            } else if (isClientAssertive && (requiresAuthentication || requiredPermissions.isNotEmpty())) {
                if (requiresAuthentication && apiKey === null)
                    continuation.resumeWithException(IllegalStateException("No token has been specified"))

                v2TokenInfo().then {
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

internal expect fun <T> Continuation<Response<T>>.queryNetwork(
    url: String,
    endpoint: String,
    cacheTime: Int,
    overrideCacheTime: Boolean,
    conv: (String) -> T,
    rateController: RateController?,
    cache: (Response<T>) -> Unit
)
internal inline fun <reified T : Any> jsonParser(): (String) -> T = { str -> JSON.parse(str) }

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

data class Response<out T>(
    val data: T?,
    val expirationDate: Long
) {

    val hasExpired: Boolean get() = true

}