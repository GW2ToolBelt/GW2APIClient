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

/**
 * TODO
 *
 * @since   0.1.0
 */
interface Disposable {

    /**
     * Disposes all references that would stop the disposable from being garbage collected.
     *
     * **This method must never throw an exception indicating, that it is not available for the current disposable.**
     *
     * @throws IllegalStateException    if the controller has already been disposed
     *
     * @since   0.1.0
     */
    fun dispose() {}

}