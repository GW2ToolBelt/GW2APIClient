/*
 * Copyright 2018 Leon Linhart
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

import kotlinx.coroutines.experimental.*
import kotlin.coroutines.experimental.*

class Request<out T> internal constructor(
    internal val response: Deferred<Response<T>>
) {

    suspend fun get(): Response<T> = suspendCoroutine { continuation ->
        response.invokeOnCompletion {
            if (response.isCompletedExceptionally)
                continuation.resumeWithException(response.getCompletionExceptionOrNull()!!)
            else
                continuation.resume(response.getCompleted())
        }
    }

    fun then(action: (Response<T>) -> Unit) {
        response.invokeOnCompletion {
            action.invoke(response.getCompleted())
        }
    }

}