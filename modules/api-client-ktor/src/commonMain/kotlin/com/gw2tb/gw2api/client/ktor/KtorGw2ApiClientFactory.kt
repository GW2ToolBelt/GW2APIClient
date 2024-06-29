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
@file:JvmName("KtorGw2ApiClientFactory")
package com.gw2tb.gw2api.client.ktor

import com.gw2tb.gw2api.client.*
import io.ktor.client.engine.*
import kotlin.jvm.JvmName

/**
 * Builds a new [Gw2ApiClient] using the default [HttpClientEngine] discovered by Ktor.
 *
 * The default [HttpClientEngine] discovered by Ktor will be used as the underlying HTTP engine.
 *
 * @param block additional configuration for the client
 *
 * @since   0.5.0
 */
public expect fun buildGw2ApiClient(block: Gw2ApiClientConfigurer): Gw2ApiClient

/**
 * Builds a new [Gw2ApiClient] using the specified [HttpClientEngine].
 *
 *
 * @param engine    the engine to use for the client
 * @param block     additional configuration for the client
 *
 * @since   0.5.0
 */
public expect fun buildGw2ApiClient(
    engine: HttpClientEngine,
    block: Gw2ApiClientConfigurer
): Gw2ApiClient

/**
 * Creates a new [Gw2ApiClient] using the specified [HttpClientEngine].
 *
 * The default [HttpClientEngine] discovered by Ktor will be used as the underlying HTTP engine.
 *
 * @since   0.5.0
 */
@Suppress("NOTHING_TO_INLINE")
@JvmName("newGw2ApiClient")
public inline fun Gw2ApiClient(): Gw2ApiClient =
    buildGw2ApiClient {}

/**
 * Creates a new [Gw2ApiClient] using the specified [HttpClientEngine].
 *
 * @param engine    the engine to use for the client
 *
 * @since   0.5.0
 */
@Suppress("NOTHING_TO_INLINE")
@JvmName("newGw2ApiClient")
public inline fun Gw2ApiClient(engine: HttpClientEngine): Gw2ApiClient =
    buildGw2ApiClient(engine = engine) {}