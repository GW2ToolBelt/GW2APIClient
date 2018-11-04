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

import gw2api.misc.*
import kotlinx.serialization.*
import kotlinx.serialization.internal.*
import kotlinx.serialization.json.*

internal fun <T> query(
    endpoint: String,
    params: Map<String, Any> = emptyMap(),
    replaceInPath: Map<String, String> = emptyMap(),
    requiresAuthentication: Boolean = false,
    requiredPermissions: Collection<String> = emptyList(),
    isLocalized: Boolean = false,
    supportedLanguages: List<Language> = emptyList(),
    converter: (String) -> T
): RequestBuilder<T> = RequestBuilder(
    endpoint,
    params.mapValues { (_, v) -> v.toString() },
    replaceInPath,
    requiresAuthentication,
    requiredPermissions,
    isLocalized,
    supportedLanguages,
    converter
)

internal typealias JSONIntParser = IntSerializer
internal typealias JSONStringParser = StringSerializer

@UseExperimental(ImplicitReflectionSerializer::class)
internal inline fun <reified T : Any> jsonParser(serializer: KSerializer<T> = T::class.serializer()): (String) -> T = { str ->
    JSON.parse(serializer, str)
}

@UseExperimental(ImplicitReflectionSerializer::class)
internal inline fun <reified T : Any> jsonArrayParser(serializer: KSerializer<T> = T::class.serializer()): (String) -> Collection<T> = jsonParser(serializer.list)