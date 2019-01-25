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

import gw2api.v2.*
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.response.*
import io.ktor.http.*
import kotlinx.coroutines.*
import kotlin.coroutines.*

/**
 * TODO doc
 *
 * @since   0.1.0
 */
@ExperimentalUnsignedTypes
class Request<out T> internal constructor(
    val endpoint: String,
    val apiKey: String?,
    val host: String,
    val port: UShort,
    requiresAuthentication: Boolean,
    requiredPermissions: Collection<String>,
    checkPermissions: Boolean,
    cacheAccessor: CacheAccessor?,
    cacheTime: ULong,
    overrideCacheTime: Boolean,
    rateLimiter: RateLimiter?,
    coroutineScope: CoroutineScope,
    httpClient: HttpClient,
    url: String,
    converter: (String) -> T
) {

    @ExperimentalCoroutinesApi
    private val deferred: Deferred<Response<T>> = coroutineScope.async {
        cacheAccessor?.let { it.query(this@Request)?.let { cached -> return@async cached } }

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
        if (checkPermissions && requiresAuthentication && endpoint != "/v2/tokeninfo") {
            val perm = gw2v2TokenInfo().execute(coroutineScope).get()

            if (perm.data != null) {
                if (!perm.data.permissions.containsAll(requiredPermissions)) {
                    throw InsufficientPermissionsException("") // TODO
                }
            } else {
                throw UnauthenticatedException("") // TODO
            }
        }

        val httpCall = coroutineScope.async(start = CoroutineStart.LAZY) {
            val response = httpClient.call(url).response

            if (!response.status.isSuccess()) {
                // TODO error handling
            }

            // TODO deserialize response
            val data = converter.invoke(response.readText())
            Response(
                data = data
            ).also { cacheAccessor?.memoize(it) }
        }

        if (rateLimiter !== null) {
            rateLimiter.execute(httpCall)
        } else {
            httpCall.await()
        }
    }
//
//    fun cancel() {
//        deferred.cancel()
//    }

    @ExperimentalCoroutinesApi
    suspend fun get(): Response<T> = suspendCoroutine { continuation ->
        deferred.invokeOnCompletion { cause ->
            if (cause !== null) {
                continuation.resumeWithException(cause)
            } else {
                continuation.resume(deferred.getCompleted())
            }
        }
    }

    @ExperimentalCoroutinesApi
    fun then(action: (Response<T>) -> Unit) {
        deferred.invokeOnCompletion {
            action.invoke(deferred.getCompleted())
        }
    }

}