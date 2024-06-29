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
package com.gw2tb.gw2api.client

import com.gw2tb.gw2api.client.internal.http.IHttpClient
import com.gw2tb.gw2api.client.internal.InternalGw2ApiClientApi
import kotlinx.serialization.json.Json

@OptIn(InternalGw2ApiClientApi::class)
public actual class Gw2ApiClient @InternalGw2ApiClientApi actual constructor(
    private val httpClient: IHttpClient,
    private val host: String,
    private val cacheAccess: CacheAccess?,
    private val rateLimiter: RateLimiter?,
    private val json: Json,
    private val requestConfigurers: List<RequestConfigurer>
) : AutoCloseable by httpClient {

    @InternalGw2ApiClientApi
    public actual constructor(httpClient: IHttpClient, builder: Gw2ApiClientBuilder): this(
        httpClient = httpClient,
        host = builder.host,
        cacheAccess = builder.cacheAccess,
        rateLimiter = builder.rateLimiter,
        json = builder.json,
        requestConfigurers = builder.requestConfigurers.toList()
    )

    public actual suspend fun <T> executeAsync(template: RequestTemplate<T>): Gw2ApiResponse<T> {
        @Suppress("NAME_SHADOWING")
        val template = template.let {
            var res = it
            for (requestConfigurer in requestConfigurers) {
                res = template.configure(requestConfigurer)
            }

            res
        }

        val request = Gw2ApiRequest(
            baseUrl = host,
            path = template.path,
            parameters = if (template.language != null) {
                template.parameters + ("lang" to template.language.code)
            } else {
                template.parameters
            },
            headers = if (template.apiKey != null) {
                template.headers + ("Authorization" to "Bearer ${template.apiKey}")
            } else {
                template.headers
            },
            apiKey = template.apiKey,
            language = template.language,
            serializer = template.serializer
        )

        if (cacheAccess !== null) {
            val cachedResponse = cacheAccess.query(request)
            if (cachedResponse !== null) return cachedResponse
        }

        rateLimiter?.acquire()
        val httpResponse = httpClient.sendAsync(request)
        if (httpResponse.status == 429) rateLimiter?.penalize()

        val apiResponse = Gw2ApiResponse(
            request = request,
            statusCode = httpResponse.status,
            headers = Gw2ApiResponse.Headers(httpResponse.headers),
            body = httpResponse.body,
            deserialize = { json.decodeCatching(request.serializer, it) }
        )

        cacheAccess?.memoize(apiResponse)
        return apiResponse
    }

}