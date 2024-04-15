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

import kotlin.jvm.JvmInline

/**
 * An HTTP response from the Guild Wars 2 API.
 *
 * @param request       the [Gw2ApiRequest] corresponding to this response
 * @param statusCode    the status code for this response
 * @param headers       the received response headers
 * @param body          the raw response body
 *
 * @since   0.5.0
 */
public class Gw2ApiResponse<T> internal constructor(
    public val request: Gw2ApiRequest<T>,
    public val statusCode: Int,
    public val headers: Headers,
    public val body: String,
    private val deserialize: (String) -> DecodingResult<T>
) {

    /**
     * Returns the response body as a [DecodingResult].
     *
     * @since   0.5.0
     */
    public val decodingResult: DecodingResult<T> by lazy {
        deserialize(body)
    }

    /**
     * Returns the decoded response data, or `null` if the decoding failed.
     *
     * When the decoding fails, further information can be obtained from [decodingResult]. In some cases, it might be
     * possible to recover by performing partial decoding using [DecodingResult.tryRecoverPartially].
     *
     * @since   0.5.0
     */
    public val dataOrNull: T? by lazy {
        decodingResult.getOrNull()
    }

    override fun equals(other: Any?): Boolean = when {
        this === other -> true
        other is Gw2ApiResponse<*> -> request == other.request && statusCode == other.statusCode && headers == other.headers && body == other.body
        else -> false
    }

    override fun hashCode(): Int {
        var result = request.hashCode()
        result = 31 * result + statusCode
        result = 31 * result + headers.hashCode()
        result = 31 * result + body.hashCode()
        return result
    }

    override fun toString(): String = "Gw2ApiResponse(request=$request, statusCode=$statusCode, headers=$headers, body='$body')"

    /**
     * The headers of an HTTP response from the Guild Wars 2 API.
     *
     * @since   0.5.0
     */
    @JvmInline
    public value class Headers internal constructor(
        private val headers: Map<String, List<String>>
    ) : Map<String, List<String>> by headers {

        /**
         * The number of entries per page.
         *
         * Usually, this value is only present for paginated requests.
         *
         * @since   0.5.0
         */
        public val pageSize: Int? get() = this["x-page-size"]?.singleOrNull()?.toIntOrNull()

        /**
         * The total number of pages.
         *
         * Usually, this value is only present for paginated requests.
         *
         * @since   0.5.0
         */
        public val pageTotal: Int? get() = this["x-page-total"]?.singleOrNull()?.toIntOrNull()

        /**
         * The number of entries in the current result set.
         *
         * @since   0.5.0
         */
        public val resultCount: Int? get() = this["x-result-count"]?.singleOrNull()?.toIntOrNull()

        /**
         * The total number of entries.
         *
         * @since   0.5.0
         */
        public val resultTotal: Int? get() = this["x-result-total"]?.singleOrNull()?.toIntOrNull()

    }

}