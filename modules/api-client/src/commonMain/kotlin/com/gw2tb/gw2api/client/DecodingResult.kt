/*
 * Copyright (c) 2018-2022 Leon Linhart
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
@file:OptIn(InternalGW2APIClientApi::class)
package com.gw2tb.gw2api.client

import com.gw2tb.gw2api.client.internal.InternalGW2APIClientApi
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.SerializationException
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.*
import kotlin.jvm.JvmField
import kotlin.jvm.JvmInline

@JvmInline
public value class DecodingResult<out T> @InternalGW2APIClientApi internal constructor(
    @PublishedApi
    internal val value: Any?
) {

    /**
     * Returns `true` if this instance represents a successful outcome.
     * In this case [isFailure] returns `false`.
     */
    public val isSuccess: Boolean get() = value !is Failure

    /**
     * Returns `true` if this instance represents a failed outcome.
     * In this case [isSuccess] returns `false`.
     */
    public val isFailure: Boolean get() = value is Failure

    @Suppress("UNCHECKED_CAST")
    public inline fun getOrNull(): T? =
        when {
            isFailure -> null
            else -> value as T
        }

    internal sealed class Failure

    internal class SchemaMismatch(
        @JvmField
        val jsonElement: JsonElement,
        @JvmField
        val exception: SerializationException
    )

    internal class DecodingFailure()

}

internal inline fun <reified T, R> Json.decodeCatching(string: String): DecodingResult<R> {
    val jsonElement = try {
        decodeFromString<JsonElement>(string)
    } catch (e: SerializationException) {
        return DecodingResult(DecodingResult.DecodingFailure())
    }

    return try {
        DecodingResult(decodeFromJsonElement<T>(jsonElement))
    } catch (e: SerializationException) {
        DecodingResult(DecodingResult.SchemaMismatch(jsonElement, exception = e))
    }
}

internal fun <T, R> Json.decodeCatching(serializer: DeserializationStrategy<T>, string: String): DecodingResult<R> {
    val jsonElement = try {
        decodeFromString<JsonElement>(string)
    } catch (e: SerializationException) {
        return DecodingResult(DecodingResult.DecodingFailure())
    }

    return try {
        DecodingResult(decodeFromJsonElement<T>(serializer, jsonElement))
    } catch (e: SerializationException) {
        DecodingResult(DecodingResult.SchemaMismatch(jsonElement, exception = e))
    }
}

public fun <E> DecodingResult<List<E>>.tryDecodePartial(json: Json = Json, deserializer: DeserializationStrategy<E>): List<DecodingResult<E>> {
    return if (isSuccess) {
        (value as List<E>).map { DecodingResult(it) }
    } else if (value is DecodingResult.SchemaMismatch) {
        value.jsonElement.jsonArray.map { element ->
            try {
                DecodingResult(json.decodeFromJsonElement(deserializer, element))
            } catch (e: SerializationException) {
                DecodingResult(DecodingResult.SchemaMismatch(element, exception = e))
            }
        }
    } else {
        TODO("error")
    }
}

public fun <K, V> DecodingResult<Map<K, V>>.tryDecodePartial(json: Json = Json, keyDeserializer: DeserializationStrategy<K>, deserializer: DeserializationStrategy<V>): Map<K, DecodingResult<V>> {
    return if (isSuccess) {
        (value as Map<K, V>).mapValues { DecodingResult(it) }
    } else if (value is DecodingResult.SchemaMismatch) {
        value.jsonElement.jsonObject
            .mapKeys { (key, _) -> json.decodeFromString(keyDeserializer, key) }
            .mapValues { (_, element) ->
                try {
                    DecodingResult(json.decodeFromJsonElement(deserializer, element))
                } catch (e: SerializationException) {
                    DecodingResult(DecodingResult.SchemaMismatch(element, exception = e))
                }
            }
    } else {
        TODO("error")
    }
}