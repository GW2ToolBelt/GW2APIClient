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
@file:Suppress("RedundantVisibilityModifier", "MemberVisibilityCanBePrivate")
package com.gw2tb.gw2api.client

import kotlinx.serialization.*

/**
 * An intermediate object for building [RequestTemplate] instances.
 *
 * @since   0.1.0
 */
public class RequestBuilder<T> internal constructor(
    private val path: String,
    private val parameters: Map<String, String>,
    private val requiredPermissions: Collection<String>,
    private val supportedLanguages: Set<Language>,
    private val serializer: KSerializer<T>,
    private val headers: Map<String, String>,
    apiKey: String?,
    language: Language?
) {

    /**
     * The API key for the request.
     *
     * @since   0.4.0
     */
    @Suppress("CanBePrimaryConstructorProperty")
    public var apiKey: String? = apiKey

    /**
     * Sets the [apiKey] for the request and returns the receiver.
     *
     * @return  the receiver
     *
     * @since   0.4.0
     */
    public fun withAPIKey(value: String?): RequestBuilder<T> = apply { apiKey = value }

    /**
     * The language for the request.
     *
     * Setting the language to an unsupported value for the endpoint targeted by this request, throws an [IllegalArgumentException].
     *
     * @since   0.4.0
     */
    public var language: Language? = language
        set(value) {
            require(supportedLanguages.isNotEmpty()) { "Localization is not supported for endpoint $path." }
            require(value in supportedLanguages) { "Language '$value' is not supported for endpoint $path. (Supported languages are: ${supportedLanguages.joinToString()})" }

            field = value
        }

    /**
     * Sets the [language] for the request and returns the receiver.
     *
     * @return  the receiver
     *
     * @since   0.4.0
     */
    public fun withLanguage(value: Language): RequestBuilder<T> = apply { language = value }

    internal fun toTemplate(): RequestTemplate<T> = RequestTemplate(
        path = path,
        parameters = parameters,
        requiredPermissions = requiredPermissions,
        supportedLanguages = supportedLanguages,
        serializer = serializer,

        headers = headers,
        apiKey = apiKey,
        language = language
    )

}