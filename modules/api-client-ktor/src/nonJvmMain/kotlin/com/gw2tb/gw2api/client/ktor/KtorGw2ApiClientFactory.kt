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
package com.gw2tb.gw2api.client.ktor

import com.gw2tb.gw2api.client.*
import com.gw2tb.gw2api.client.internal.http.IHttpClient
import com.gw2tb.gw2api.client.internal.http.IHttpResponse
import com.gw2tb.gw2api.client.internal.InternalGw2ApiClientApi
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.util.*

public actual fun buildGw2ApiClient(block: Gw2ApiClientConfigurer): Gw2ApiClient {
    val proxy = KtorHttpClientProxy(HttpClient())

    @OptIn(InternalGw2ApiClientApi::class)
    return Gw2ApiClient(proxy, block)
}

public actual fun buildGw2ApiClient(
    engine: HttpClientEngine,
    block: Gw2ApiClientConfigurer
): Gw2ApiClient {
    val proxy = KtorHttpClientProxy(HttpClient(engine))

    @OptIn(InternalGw2ApiClientApi::class)
    return Gw2ApiClient(proxy, block)
}

@OptIn(InternalGw2ApiClientApi::class)
private class KtorHttpClientProxy(private val httpClient: HttpClient) : IHttpClient {

    override fun close() {
        httpClient.close()
    }

    override suspend fun sendAsync(request: Gw2ApiRequest<*>): IHttpResponse {
        val baseUrl = Url(request.baseUrl)

        val url = URLBuilder().apply {
            protocol = baseUrl.protocol
            host = baseUrl.host
            pathSegments = request.path.removePrefix("/").split("/")
            pathSegments = request.path.removePrefix("/").split("/")

            request.parameters.forEach { (k, v) -> parameters.append(k, v) }
        }.build()

        val httpResponse = httpClient.get(url) {
            headers {
                request.headers.forEach { (k, v) ->
                    append(k, v)
                }
            }
        }

        return IHttpResponse(
            status = httpResponse.status.value,
            headers = httpResponse.headers.toMap(),
            body = httpResponse.body()
        )
    }

}