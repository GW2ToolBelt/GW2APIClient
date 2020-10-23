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
package com.gw2tb.gw2api.client.jdk11

import com.gw2tb.gw2api.client.*
import com.gw2tb.gw2api.client.http.*
import kotlinx.coroutines.future.*
import java.net.*
import java.net.http.*
import java.nio.charset.*

/**
 * [HttpClient] backed [IHttpClient] implementation for [GW2APIClient].
 *
 * @since   0.1.0
 */
public class JDKHttpClientImpl @JvmOverloads constructor(
    private val httpClient: HttpClient = HttpClient.newHttpClient(),
    private val scheme: String = "https"
) : IHttpClient {

    private fun encode(query: String): String = URLEncoder.encode(query, StandardCharsets.UTF_8).replace("%2C", ",")

    override suspend fun send(request: Request<*>): Pair<Map<String, List<String>>, String> {
        val deferred = httpClient.sendAsync(
            HttpRequest.newBuilder().run {
                uri(URI(
                    scheme,
                    request.host,
                    request.path,
                    if (request.parameters.isNotEmpty()) request.parameters.entries.joinToString(separator = "&") { (k, v) ->
                        "${encode(k)}=${encode(v)}"
                    } else null,
                    null
                ))
                if (request.apiKey != null) header("Authorization", "Bearer ${request.apiKey}")
                build()
            }.also {
                   println(it.uri())

            },
            HttpResponse.BodyHandlers.ofString()
        ).asDeferred()

        val httpResponse = deferred.await()
        val headers = httpResponse.headers().map()
        val body = httpResponse.body()

        return (headers to body)
    }

    override fun close() {}

}