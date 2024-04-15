/*
 * Copyright (c) 2018-2024 Leon Linhart
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
@file:JvmName("JdkGw2ApiClientFactory")
package com.gw2tb.gw2api.client.jdk11

import com.gw2tb.gw2api.client.Gw2ApiClient
import com.gw2tb.gw2api.client.Gw2ApiClientConfigurer
import com.gw2tb.gw2api.client.Gw2ApiRequest
import com.gw2tb.gw2api.client.internal.http.IHttpClient
import com.gw2tb.gw2api.client.internal.http.IHttpResponse
import com.gw2tb.gw2api.client.internal.InternalGw2ApiClientApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

/**
 * Builds a new [Gw2ApiClient] using the specified [HttpClient].
 *
 * @param httpClient    the [HttpClient] to use for the client
 * @param block         additional configuration for the client
 *
 * @since   0.5.0
 */
@JvmOverloads
public fun buildGw2ApiClient(
    httpClient: HttpClient = HttpClient.newHttpClient(),
    block: Gw2ApiClientConfigurer
): Gw2ApiClient {
    val proxy = JdkHttpClientProxy(httpClient)

    @OptIn(InternalGw2ApiClientApi::class)
    return Gw2ApiClient(proxy, block)
}

/**
 * Creates a new [Gw2ApiClient] using the specified [HttpClient].
 *
 * @param httpClient    the [HttpClient] to use for the client
 *
 * @since   0.5.0
 */
@Suppress("NOTHING_TO_INLINE")
@JvmName("newGw2ApiClient")
@JvmOverloads
public inline fun Gw2ApiClient(httpClient: HttpClient = HttpClient.newHttpClient()): Gw2ApiClient =
    buildGw2ApiClient(httpClient = httpClient) {}

@OptIn(InternalGw2ApiClientApi::class)
private class JdkHttpClientProxy(private val httpClient: HttpClient) : IHttpClient {

    override fun close() {}

    override fun send(request: Gw2ApiRequest<*>): IHttpResponse =
        sendImpl(request) { httpRequest -> httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString()) }

    override suspend fun sendAsync(request: Gw2ApiRequest<*>): IHttpResponse = coroutineScope {
        sendImpl(request) { httpRequest ->
            async(Dispatchers.IO) {
                httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString())
            }.await()
        }
    }

    private inline fun sendImpl(request: Gw2ApiRequest<*>, send: (HttpRequest) -> HttpResponse<String>): IHttpResponse {
        val httpRequest = HttpRequest.newBuilder().apply {
            GET()

            val hostUri = URI.create(request.baseUrl)

            uri(URI(
                hostUri.scheme,
                hostUri.authority,
                request.path,
                if (request.parameters.isNotEmpty()) request.parameters.entries.joinToString(separator = "&") { (k, v) ->
                    "$k=$v"
                } else null,
                null
            ))

            request.headers.forEach { (k, v) -> header(k, v) }
        }.build()

        val httpResponse = send(httpRequest)

        return IHttpResponse(
            status = httpResponse.statusCode(),
            headers = httpResponse.headers().map(),
            body = httpResponse.body()
        )
    }

}