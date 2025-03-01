/*
 * Copyright (c) 2018-2025 Leon Linhart
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

import kotlinx.atomicfu.locks.SynchronizedObject
import kotlinx.atomicfu.locks.synchronized
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.format.DateTimeComponents
import kotlin.time.Duration.Companion.seconds

/**
 * Provides basic access to a response caching implementation.
 *
 * This interface does not make any guarantees about the caching behavior of its implementations.
 *
 * @since   0.1.0
 */
public interface CacheAccess {

    /**
     * Memoizes the given [Gw2ApiResponse].
     *
     * @param response  the response to be memoized
     *
     * @since   0.1.0
     */
    public fun <T> memoize(response: Gw2ApiResponse<T>)

    /**
     * Queries the cache for a given [Gw2ApiRequest] and returns the cached [Gw2ApiResponse] or `null` if no appropriate
     * response was cached.
     *
     * @param request   the request for which the cache should be checked
     *
     * @return  the cached response or `null`
     *
     * @since   0.1.0
     */
    public fun <T> query(request: Gw2ApiRequest<T>): Gw2ApiResponse<T>?

}

/**
 * A simple in-memory cache implementation.
 *
 * @since   0.9.0
 */
public class SimpleInMemoryCache : CacheAccess {

    private val lock = SynchronizedObject()
    private val cachedResponses = mutableMapOf<Gw2ApiRequest<*>, CachedEntry>()
    private val timeSource = Clock.System

    override fun <T> memoize(response: Gw2ApiResponse<T>) {
        val expiresAt = response.extractExpirationHeader() ?: return

        synchronized(lock) {
            cachedResponses[response.request] = CachedEntry(response, expiresAt)
            cachedResponses.entries.removeAll { it.value.expiresAt <= timeSource.now() }
        }
    }

    override fun <T> query(request: Gw2ApiRequest<T>): Gw2ApiResponse<T>? {
        synchronized(lock) {
            val entry = cachedResponses[request] ?: return null

            if (entry.expiresAt <= timeSource.now()) {
                cachedResponses.remove(request)
                return null
            }

            @Suppress("UNCHECKED_CAST")
            return entry.response as Gw2ApiResponse<T>
        }
    }

    private data class CachedEntry(
        val response: Gw2ApiResponse<*>,
        val expiresAt: Instant
    )

    private fun <T> Gw2ApiResponse<T>.extractExpirationHeader(): Instant? {
        val cacheControl = headers["Cache-Control"]

        when {
            cacheControl == null -> {}
            "no-store" in cacheControl -> return null
            "no-cache" in cacheControl -> return null
            else -> {
                val maxAge = cacheControl.find { it.startsWith("max-age=") }?.removePrefix("max-age=")
                if (maxAge != null) return timeSource.now() + maxAge.toLong().seconds
            }
        }

        return headers["Expires"]?.singleOrNull()?.let(DateTimeComponents.Formats.RFC_1123::parse)?.toInstantUsingOffset()
    }

}