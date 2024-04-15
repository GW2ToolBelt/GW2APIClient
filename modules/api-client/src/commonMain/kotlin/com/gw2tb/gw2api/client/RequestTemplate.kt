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

internal fun <T> RequestTemplate(
    path: String,
    parameters: Map<String, String>,
    replaceInPath: Map<String, String>,
    requiredPermissions: Collection<String>,
    supportedLanguages: Set<Language>,
    serializer: KSerializer<T>,
    configure: RequestConfigurer?
): RequestTemplate<T> {
    @Suppress("NAME_SHADOWING")
    val path = path.let {
        var res = it
        replaceInPath.forEach { (k, v) -> res = res.replace(k, v) }
        return@let res
    }

    val template = RequestTemplate(
        path = path,
        serializer = serializer,
        requiredPermissions = requiredPermissions,
        supportedLanguages = supportedLanguages,
        parameters = parameters
    )

    return template.let { if (configure != null) it.configure(configure) else it }
}

/**
 * A template for a request that can be [executed][Gw2ApiClient.executeAsync] by an API client.
 *
 * @param path          the path segment of the URL (relative to the API client's base URL)
 * @param parameters    the query parameters of the request
 * @param headers       the headers of the request
 * @param apiKey        the API key to use for the request
 * @param language      the language to specify for the request
 *
 * @since   0.5.0
 */
public data class RequestTemplate<T> internal constructor(
    val path: String,
    internal val parameters: Map<String, String> = emptyMap(),
    internal val requiredPermissions: Collection<String>,
    internal val supportedLanguages: Set<Language>,
    internal val serializer: KSerializer<T>,

    val headers: Map<String, String> = emptyMap(),
    val apiKey: String? = null,
    val language: Language? = null
)

internal fun <T> RequestTemplate<T>.configure(block: RequestConfigurer): RequestTemplate<T> {
    val builder = toBuilder()
    with(block) { builder.configure() }

    return builder.toTemplate()
}

internal fun <T> RequestTemplate<T>.toBuilder(): RequestBuilder<T> = RequestBuilder(
    path = path,
    parameters = parameters,
    requiredPermissions = requiredPermissions,
    supportedLanguages = supportedLanguages,
    serializer = serializer,
    headers = headers,
    apiKey = apiKey,
    language = language
)