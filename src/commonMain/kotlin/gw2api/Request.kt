/*
 * Copyright 2018-2019 Leon Linhart
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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