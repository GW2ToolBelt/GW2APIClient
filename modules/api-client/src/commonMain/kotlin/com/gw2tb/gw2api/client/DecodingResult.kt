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
@file:OptIn(ExperimentalContracts::class)
package com.gw2tb.gw2api.client

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.SerializationException
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.*
import kotlinx.serialization.serializer
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract
import kotlin.jvm.JvmField
import kotlin.jvm.JvmInline

/**
 * A discriminated union that encapsulates a successful outcome with a value of type [T] or a failure with an arbitrary
 * [Throwable] exception. A schema mismatch is a special type of failure that may be [partially recoverable][tryRecoverPartially].
 *
 * @since   0.4.0
 */
@JvmInline
public value class DecodingResult<out T> @PublishedApi internal constructor(
    @PublishedApi
    internal val value: Any?
) {

    /**
     * Returns `true` if this instance represents a successful outcome.
     * In this case [isFailure] returns `false`.
     *
     * @since   0.4.0
     */
    public val isSuccess: Boolean get() = value !is Failure

    /**
     * Returns `true` if this instance represents a failed outcome.
     * In this case [isSuccess] returns `false`.
     *
     * @since   0.4.0
     */
    public val isFailure: Boolean get() = value is Failure

    /**
     * Returns `true` if this instance represents a schema mismatch.
     * In this case [isSuccess] returns `false`.
     *
     * If `isSchemaMismatch` returns `true`, it might be possible to partially recover the result.
     *
     * @since   0.4.0
     */
    public val isSchemaMismatch: Boolean get() = value is SchemaMismatch

    /**
     * Returns the encapsulated value if this instance represents [success][isSuccess] or `null` if it is [failure][isFailure].
     *
     * @since   0.4.0
     */
    @Suppress("UNCHECKED_CAST", "NOTHING_TO_INLINE")
    public inline fun getOrNull(): T? =
        when {
            isFailure -> null
            else -> value as T
        }

    /**
     * Returns the encapsulated [Throwable] exception if this instance represents [failure][isFailure] or `null` if it
     * is [success][isSuccess].
     *
     * @since   0.4.0
     */
    public fun exceptionOrNull(): Throwable? =
        when (value) {
            is Failure -> value.exception
            else -> null
        }

    @PublishedApi
    internal fun jsonElementOrNull(): JsonElement? =
        when (value) {
            is SchemaMismatch -> value.jsonElement
            else -> null
        }

    /**
     * Returns a string representation of this result.
     *
     * @since   0.4.0
     */
    override fun toString(): String =
        when (value) {
            is Failure -> value.toString()
            else -> "Success($value)"
        }

    public companion object {

        /**
         * Returns an instance that encapsulates the given [value] as successful value.
         *
         * @since   0.4.0
         */
        @Suppress("NOTHING_TO_INLINE")
        public inline fun <T> success(value: T): DecodingResult<T> =
            DecodingResult(value)

        /**
         * Returns an instance that encapsulates the given [Throwable] as failure.
         *
         * @since   0.4.0
         */
        @Suppress("NOTHING_TO_INLINE")
        public inline fun <T> failure(exception: Throwable): DecodingResult<T> =
            DecodingResult(createFailure(exception))

        /**
         * Returns an instance that encapsulates the given [jsonElement] and [Throwable] as schema mismatch.
         *
         * @since   0.4.0
         */
        @Suppress("NOTHING_TO_INLINE")
        public inline fun <T> schemaMismatch(jsonElement: JsonElement, exception: SerializationException): DecodingResult<T> =
            DecodingResult(createSchemaMismatch(jsonElement, exception))

    }

    internal sealed class Failure {
        abstract val exception: Throwable
    }

    internal class SchemaMismatch(
        @JvmField
        val jsonElement: JsonElement,
        override val exception: SerializationException
    ) : Failure() {

        override fun equals(other: Any?): Boolean =
            (this === other) || (other is SchemaMismatch && jsonElement == other.jsonElement && exception == other.exception)

        override fun hashCode(): Int {
            var hash = 7
            hash = 31 * hash + jsonElement.hashCode()
            hash = 31 * hash + exception.hashCode()

            return hash
        }

        override fun toString(): String = "SchemaMismatch($exception)"

    }

    internal class FailureImpl(
        override val exception: Throwable
    ) : Failure() {
        override fun equals(other: Any?): Boolean = (this === other) || (other is FailureImpl && exception == other.exception)
        override fun hashCode(): Int = exception.hashCode()
        override fun toString(): String = "Failure($exception)"
    }

}

/**
 * Creates an instance of the internal marker type [DecodingResult.FailureImpl] to make sure that this class is not
 * exposed in the ABI.
 */
@PublishedApi
internal fun createFailure(exception: Throwable): Any =
    DecodingResult.FailureImpl(exception)

/**
 * Creates an instance of the internal marker type [DecodingResult.SchemaMismatch] to make sure that this class is not
 * exposed in the ABI.
 */
@PublishedApi
internal fun createSchemaMismatch(jsonElement: JsonElement, exception: SerializationException): Any =
    DecodingResult.SchemaMismatch(jsonElement, exception)

@Suppress("FunctionName")
@PublishedApi
internal inline fun <R> runCatching_DecodingResult(block: () -> R): DecodingResult<R> {
    return try {
        DecodingResult.success(block())
    } catch (e: Throwable) {
        DecodingResult.failure(e)
    }
}

internal inline fun <reified T, R> Json.decodeCatching(string: String): DecodingResult<R> {
    return decodeCatching(serializer<T>(), string)
}

internal fun <T, R> Json.decodeCatching(serializer: DeserializationStrategy<T>, string: String): DecodingResult<R> {
    val jsonElement = try {
        decodeFromString<JsonElement>(string)
    } catch (e: SerializationException) {
        return DecodingResult.failure(exception = e)
    }

    return try {
        DecodingResult(decodeFromJsonElement(serializer, jsonElement))
    } catch (e: SerializationException) {
        DecodingResult.schemaMismatch(jsonElement, exception = e)
    }
}

@PublishedApi
internal fun DecodingResult<*>.throwOnFailure() {
    if (value is DecodingResult.Failure) throw value.exception
}

// -- extensions ---

/**
 * Returns the encapsulated value if this instance represents [success][DecodingResult.isSuccess] or throws the
 * encapsulated [Throwable] if it is [failure][DecodingResult.isFailure].
 *
 * @since   0.4.0
 */
@Suppress("NOTHING_TO_INLINE")
public inline fun <T> DecodingResult<T>.getOrThrow(): T {
    throwOnFailure()

    @Suppress("UNCHECKED_CAST")
    return value as T
}

/**
 * Returns the encapsulated value if this instance represents [success][DecodingResult.isSuccess] or the result of
 * [onFailure] for the encapsulated [Throwable] exception if it is [failure][DecodingResult.isFailure].
 *
 * Note, that this function rethrows any [Throwable] exception thrown by [onFailure] function.
 *
 * @since   0.4.0
 */
@Suppress("UNCHECKED_CAST")
public inline fun <R, T : R> DecodingResult<T>.getOrElse(
    onFailure: (exception: Throwable) -> R
): R {
    contract {
        callsInPlace(onFailure, InvocationKind.AT_MOST_ONCE)
    }

    return when (val exception = exceptionOrNull()) {
        null -> value as T
        else -> onFailure(exception)
    }
}

/**
 * Returns the encapsulated value if this instance represents [success][DecodingResult.isSuccess], the result of [onSchemaMismatch]
 * for the encapsulated [JsonElement] and [Throwable] if it is [schema mismatch][DecodingResult.isSchemaMismatch] or the
 * result of [onFailure][DecodingResult.isFailure] for the encapsulated [Throwable] if it is [failure][DecodingResult.isFailure].
 *
 * Note, that this function rethrows any [Throwable] exception thrown by [onSchemaMismatch] or [onFailure].
 *
 * @since   0.4.0
 */
@Suppress("UNCHECKED_CAST")
public inline fun <R, T : R> DecodingResult<T>.getOrElse(
    onSchemaMismatch: (JsonElement, exception: Throwable) -> R,
    onFailure: (exception: Throwable) -> R
): R {
    contract {
        callsInPlace(onSchemaMismatch, InvocationKind.AT_MOST_ONCE)
        callsInPlace(onFailure, InvocationKind.AT_MOST_ONCE)
    }

    return when (val exception = exceptionOrNull()) {
        null -> value as T
        else -> when (val jsonElement = jsonElementOrNull()) {
            null -> onFailure(exception)
            else -> onSchemaMismatch(jsonElement, exception)
        }
    }
}

/**
 * Returns the encapsulated value if this instance represents [success][DecodingResult.isSuccess] or the [defaultValue]
 * if it is [failure][DecodingResult.isFailure].
 *
 * @since   0.4.0
 */
@Suppress("NOTHING_TO_INLINE")
public inline fun <R, T : R> DecodingResult<T>.getOrDefault(defaultValue: R): R {
    if (isFailure) return defaultValue

    @Suppress("UNCHECKED_CAST")
    return value as T
}

/**
 * Returns the result of [onSuccess] for the encapsulated value if this instance represents [success][DecodingResult.isSuccess]
 * or the result of [onFailure] for the encapsulated [Throwable] if this instance represents [failure][DecodingResult.isFailure].
 *
 * Note, that this function rethrows any [Throwable] exception thrown by [onSuccess] or [onFailure].
 *
 * @since   0.4.0
 */
public fun <R, T> DecodingResult<T>.fold(
    onSuccess: (value: T) -> R,
    onFailure: (exception: Throwable) -> R
): R {
    contract {
        callsInPlace(onSuccess, InvocationKind.AT_MOST_ONCE)
        callsInPlace(onFailure, InvocationKind.AT_MOST_ONCE)
    }

    @Suppress("UNCHECKED_CAST")
    return when (val exception = exceptionOrNull()) {
        null -> onSuccess(value as T)
        else -> onFailure(exception)
    }
}

/**
 * Returns the result of [onSuccess] for the encapsulated value if this instance represents [success][DecodingResult.isSuccess],
 * the result of [onSchemaMismatch] for the encapsulated [JsonElement] and [Throwable] if this instance represents a
 * [schema mismatch][DecodingResult.isSchemaMismatch], or the result of [onFailure] for the encapsulated [Throwable] if
 * this instance represents any other failure.
 *
 * Note, that this function rethrows any [Throwable] exception thrown by [onSuccess], [onFailure] or [onSchemaMismatch].
 *
 * @since   0.4.0
 */
public fun <R, T> DecodingResult<T>.fold(
    onSuccess: (value: T) -> R,
    onSchemaMismatch: (JsonElement, exception: Throwable) -> R,
    onFailure: (exception: Throwable) -> R
): R {
    contract {
        callsInPlace(onSuccess, InvocationKind.AT_MOST_ONCE)
        callsInPlace(onSchemaMismatch, InvocationKind.AT_MOST_ONCE)
        callsInPlace(onFailure, InvocationKind.AT_MOST_ONCE)
    }

    @Suppress("UNCHECKED_CAST")
    return when (val exception = exceptionOrNull()) {
        null -> onSuccess(value as T)
        else -> when (val jsonElement = jsonElementOrNull()) {
            null -> onFailure(exception)
            else -> onSchemaMismatch(jsonElement, exception)
        }
    }
}

// transformation

/**
 * Returns the encapsulated result of the given [transform] function applied to the encapsulated value if this instance
 * represents [success][DecodingResult.isSuccess] or the original encapsulated [Throwable] if it is [failure][DecodingResult.isFailure].
 *
 * Note that this function rethrows any [Throwable] exception thrown by the [transform] function. See [mapCatching] for
 * an alternative that encapsulates exceptions.
 *
 * @since   0.4.0
 */
@Suppress("UNCHECKED_CAST")
public inline fun <R, T> DecodingResult<T>.map(transform: (value: T) -> R): DecodingResult<R> {
    contract {
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return when {
        isSuccess -> DecodingResult.success(transform(value as T))
        else -> DecodingResult(value)
    }
}

/**
 * Returns the encapsulated result of the given [transform] function applied to the encapsulated value if this instance
 * represents [success][DecodingResult.isSuccess] or the original encapsulated [Throwable] if it is [failure][DecodingResult.isFailure].
 *
 * This function catches any [Throwable] exception thrown by [transform] function and encapsulates it as a failure.
 * See [map] for an alternative that rethrows exceptions from `transform` function.
 *
 * @since   0.4.0
 */
public inline fun <R, T> DecodingResult<T>.mapCatching(transform: (value: T) -> R): DecodingResult<R> {
    return when {
        isSuccess -> runCatching_DecodingResult {
            @Suppress("UNCHECKED_CAST")
            transform(value as T)
        }
        else -> DecodingResult(value)
    }
}

/**
 * Returns the encapsulated result of the given [transform] function applied to the encapsulated [Throwable] exception
 * if this instance represents [failure][DecodingResult.isFailure] or the original encapsulated value if it is [success][DecodingResult.isSuccess].
 *
 * Note, that this function rethrows any [Throwable] exception thrown by [transform] function.
 * See [recoverCatching] for an alternative that encapsulates exceptions.
 *
 * @since   0.4.0
 */
public inline fun <R, T : R> DecodingResult<T>.recover(transform: (exception: Throwable) -> R): DecodingResult<R> {
    contract {
        callsInPlace(transform, InvocationKind.AT_MOST_ONCE)
    }

    return when (val exception = exceptionOrNull()) {
        null -> this
        else -> DecodingResult.success(transform(exception))
    }
}

/**
 * Returns the encapsulated result of the given [transform] function applied to the encapsulated [Throwable] exception
 * if this instance represents [failure][DecodingResult.isFailure] or the original encapsulated value if it is [success][DecodingResult.isSuccess].
 *
 * This function catches any [Throwable] exception thrown by [transform] function and encapsulates it as a failure.
 * See [recover] for an alternative that rethrows exceptions.
 *
 * @since   0.4.0
 */
public inline fun <R, T : R> DecodingResult<T>.recoverCatching(transform: (exception: Throwable) -> R): DecodingResult<R> {
    return when (val exception = exceptionOrNull()) {
        null -> this
        else -> runCatching_DecodingResult { transform(exception) }
    }
}

/**
 * Tries to recover the response partially if the result represents a [schema mismatch][DecodingResult.isSchemaMismatch].
 * If the result represents another [failure][DecodingResult.isFailure], an [IllegalStateException] is thrown.
 * Successful results are simply transformed.
 *
 * @since   0.4.0
 */
public fun <E> DecodingResult<List<E>>.tryRecoverPartially(json: Json = Json, deserializer: DeserializationStrategy<E>): List<DecodingResult<E>> {
    return if (isSuccess) {
        @Suppress("UNCHECKED_CAST")
        (value as List<E>).map { DecodingResult(it) }
    } else if (value is DecodingResult.SchemaMismatch) {
        value.jsonElement.jsonArray.map { element ->
            try {
                DecodingResult.success(json.decodeFromJsonElement(deserializer, element))
            } catch (e: SerializationException) {
                DecodingResult.schemaMismatch(element, exception = e)
            }
        }
    } else {
        error("Cannot decode invalid data")
    }
}

/**
 * Tries to recover the response partially if the result represents a [schema mismatch][DecodingResult.isSchemaMismatch].
 * If the result represents another [failure][DecodingResult.isFailure], an [IllegalStateException] is thrown.
 * Successful results are simply transformed.
 *
 * @since   0.4.0
 */
public fun <K, V> DecodingResult<Map<K, V>>.tryRecoverPartially(json: Json = Json, keyDeserializer: DeserializationStrategy<K>, deserializer: DeserializationStrategy<V>): Map<K, DecodingResult<V>> {
    return if (isSuccess) {
        @Suppress("UNCHECKED_CAST")
        (value as Map<K, V>).mapValues { DecodingResult(it) }
    } else if (value is DecodingResult.SchemaMismatch) {
        value.jsonElement.jsonObject
            .mapKeys { (key, _) -> json.decodeFromString(keyDeserializer, key) }
            .mapValues { (_, element) ->
                try {
                    DecodingResult.success(json.decodeFromJsonElement(deserializer, element))
                } catch (e: SerializationException) {
                    DecodingResult.schemaMismatch(element, exception = e)
                }
            }
    } else {
        error("Cannot decode invalid data")
    }
}

// "peek" onto value/exception and pipe

/**
 * Performs the given [action] on the encapsulated [Throwable] exception if this instance represents [failure][DecodingResult.isFailure].
 * Returns the receiver `DecodingResult`.
 *
 * @since   0.4.0
 */
public inline fun <T> DecodingResult<T>.onFailure(action: (exception: Throwable) -> Unit): DecodingResult<T> {
    contract {
        callsInPlace(action, InvocationKind.AT_MOST_ONCE)
    }

    val exception = exceptionOrNull()
    if (exception != null) action(exception)

    return this
}

/**
 * Performs the given [action] on the encapsulated value if this instance represents [success][DecodingResult.isSuccess].
 * Returns the receiver `DecodingResult`.
 *
 * @since   0.4.0
 */
public inline fun <T> DecodingResult<T>.onSuccess(action: (value: T) -> Unit): DecodingResult<T> {
    contract {
        callsInPlace(action, InvocationKind.AT_MOST_ONCE)
    }

    if (isSuccess) {
        @Suppress("UNCHECKED_CAST")
        action(value as T)
    }

    return this
}