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

import kotlinx.coroutines.experimental.*
import kotlin.browser.*
import kotlin.coroutines.experimental.*
import kotlin.js.*
import org.w3c.fetch.Request as W3CRequest

internal actual fun <T> Continuation<Response<T>>.queryNetwork(
    url: String,
    endpoint: String,
    cacheTime: Int,
    overrideCacheTime: Boolean,
    converter: (String) -> T,
    rateController: RateController?,
    cache: (Response<T>) -> Unit
) {
    val request = W3CRequest(url)

    rateController?.tryIncrement(endpoint)
    window.fetch(request).then(
        onFulfilled = {
            if (it.ok) {
                val date = Date(it.headers.get("date")!!).getTime().toLong()
                val expires = it.headers.get("expires").let {
                    if (it === null || overrideCacheTime)
                        if (cacheTime > 0) date + cacheTime else 0L
                    else
                        Date(it).getTime().toLong()
                }

                val response = Response(
                    data = converter.invoke(it.body.toString()),
                    expirationDate = expires
                )

                if (expires > 0) cache.invoke(response)
                resume(response)
            } else {
                resumeWithException(IllegalStateException(it.statusText))
            }
        },
        onRejected = {
            resumeWithException(it)
        }
    )
}

actual class Request<out T> internal actual constructor(
    actual val url: String,
    actual val endpoint: String,
    private val response: Deferred<Response<T>>
) {

    actual suspend fun get(): Response<T> = suspendCoroutine { continuation ->
        response.invokeOnCompletion {
            if (response.isCompletedExceptionally)
                continuation.resumeWithException(response.getCompletionExceptionOrNull()!!)
            else
                continuation.resume(response.getCompleted())
        }
    }

    actual fun then(action: (Response<T>) -> Unit) {
        response.invokeOnCompletion {
            action.invoke(response.getCompleted())
        }
    }

}