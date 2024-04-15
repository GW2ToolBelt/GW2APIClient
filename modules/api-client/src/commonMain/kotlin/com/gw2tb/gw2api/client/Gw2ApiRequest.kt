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

import kotlinx.serialization.KSerializer

/**
 * An HTTP request against the Guild Wars 2 API.
 *
 * @param baseUrl       the base URL for the request
 * @param path          the path for the request
 * @param parameters    the query parameters for the request
 * @param headers       the headers for the request
 * @param apiKey        the API key to use for the request
 * @param language      the language to specify for the request
 * @param serializer    the serializer used to decode the response
 *
 * @since   0.5.0
 */
public class Gw2ApiRequest<T> internal constructor(
    public val baseUrl: String,
    public val path: String,
    public val parameters: Map<String, String> = emptyMap(),
    public val headers: Map<String, String> = emptyMap(),
    public val apiKey: String?,
    public val language: Language?,
    internal val serializer: KSerializer<T>
) {

    override fun equals(other: Any?): Boolean = when {
        this === other -> true
        other is Gw2ApiRequest<*> -> baseUrl == other.baseUrl && path == other.path && parameters == other.parameters
            && headers == other.headers && apiKey == other.apiKey && language == other.language && serializer == other.serializer
        else -> false
    }

    override fun hashCode(): Int {
        var result = baseUrl.hashCode()
        result = 31 * result + path.hashCode()
        result = 31 * result + parameters.hashCode()
        result = 31 * result + headers.hashCode()
        result = 31 * result + (apiKey?.hashCode() ?: 0)
        result = 31 * result + (language?.hashCode() ?: 0)
        result = 31 * result + serializer.hashCode()
        return result
    }

    override fun toString(): String =
        "Gw2ApiRequest(baseUrl='$baseUrl', path='$path', parameters=$parameters, headers=$headers, apiKey=$apiKey, language=$language, serializer=$serializer)"

}