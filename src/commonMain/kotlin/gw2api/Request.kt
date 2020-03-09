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
package gw2api

import kotlinx.coroutines.*
import kotlin.coroutines.*

/**
 * TODO doc
 *
 * @since   0.1.0
 */
public class Request<out T> internal constructor(
    public val host: String,
    public val path: String,
    public val encodedPath: String,
    public val apiKey: String?,
    func: (Request<T>) -> Deferred<Response<T>>
) {

    private val deferred: Deferred<Response<T>> = func(this)

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    suspend fun get(): Response<T> = suspendCoroutine { continuation ->
        deferred.invokeOnCompletion { cause ->
            if (cause !== null) {
                continuation.resumeWithException(cause)
            } else {
                continuation.resume(deferred.getCompleted())
            }
        }
    }

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    fun then(action: (Response<T>) -> Unit) {
        deferred.invokeOnCompletion {
            action.invoke(deferred.getCompleted())
        }
    }

}