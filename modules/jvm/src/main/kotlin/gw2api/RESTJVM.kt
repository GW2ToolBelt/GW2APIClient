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
import okhttp3.*
import java.io.*
import java.util.*
import kotlin.coroutines.experimental.*
import okhttp3.Callback as OkHttpCallback
import okhttp3.Request as OkHttpRequest
import okhttp3.Response as OkHttpResponse

private val httpClient = OkHttpClient()

internal actual fun <T> Continuation<Response<T>>.queryNetwork(
    url: String,
    endpoint: String,
    cacheTime: Int,
    overrideCacheTime: Boolean,
    converter: (String) -> T,
    rateController: RateController?,
    cache: (Response<T>) -> Unit
) {
    val request = OkHttpRequest.Builder()
        .url(url)
        .cacheControl(CacheControl.FORCE_NETWORK)
        .build()

    rateController?.tryIncrement(endpoint)
    httpClient.newCall(request).enqueue(object : OkHttpCallback {
        override fun onResponse(call: Call, httpResponse: okhttp3.Response) {
            val response = if (httpResponse.isSuccessful) {
                val date = httpResponse.headers().getDate("date")!!.toInstant().toEpochMilli()
                val expires = httpResponse.headers().getDate("expires").let {
                    if (it === null || overrideCacheTime)
                        if (cacheTime > 0) date + cacheTime else 0L
                    else
                        it.toInstant().toEpochMilli()
                }

                Response(
                    data = httpResponse.body()?.let { converter.invoke(it.string()) },
                    expirationDate = expires
                ).also(cache)
            } else {
                Response(
                    data = null,
                    expirationDate = 0L
                )
            }

            resume(response)
        }

        override fun onFailure(call: Call, e: IOException) {
            resumeWithException(e)
        }
    })
}

internal actual fun String.toQueryUrl(path: String, params: Map<String, Any>) = HttpUrl.Builder()
    .scheme("https")
    .host(this)
    .addPathSegments(path)
    .apply { params.forEach { k, v -> addQueryParameter(k, Objects.toString(v)) } }
    .build()
    .toString()

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

    fun await(): Response<T> = runBlocking { response.await() }

    actual fun then(action: (Response<T>) -> Unit) {
        response.invokeOnCompletion {
            action.invoke(response.getCompleted())
        }
    }

}