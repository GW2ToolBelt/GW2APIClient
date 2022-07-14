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
package com.gw2tb.gw2api.client.ktor

import com.gw2tb.gw2api.client.*
import com.gw2tb.gw2api.client.http.*
import com.gw2tb.gw2api.client.internal.*
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.util.*
import kotlin.jvm.*

/**
 * [HttpClient] backed [IHttpClient] implementation for [GW2APIClient].
 *
 * @since   0.1.0
 */
@OptIn(InternalGW2APIClientApi::class)
public class KtorHttpClientImpl @JvmOverloads constructor(
    private val httpClient: HttpClient = HttpClient(),
    private val protocol: URLProtocol = URLProtocol.HTTPS
) : IHttpClient {

    override suspend fun send(request: Request<*>): IHttpResponse {
        val url = URLBuilder().apply {
            protocol = this@KtorHttpClientImpl.protocol
            host = request.host
            pathSegments = request.path.removePrefix("/").split("/")

            request.parameters.forEach { (k, v) -> parameters.append(k, v) }
        }.build()

        val httpResponse = httpClient.get(url) {
            if (request.apiKey != null) header("Authorization", "Bearer ${request.apiKey}")
        }

        val headers = httpResponse.headers.toMap()
        val body = httpResponse.body<String>()

        return IHttpResponse(
            status = httpResponse.status.value,
            headers = headers,
            body = body
        )
    }

    override fun close() {
        httpClient.close()
    }

}