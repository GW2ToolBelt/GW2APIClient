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
package com.gw2tb.gw2api.types.internal

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.elementNames
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.*

// Taken from https://github.com/Kotlin/kotlinx.serialization/issues/1906#issuecomment-1229225113

/**
 * Serializes objects of type [T] into tuples of their properties, in the order defined by their serializer.
 */
internal open class JsonTupleSerializer<T>(
    private val serializer: KSerializer<T?>,
) : KSerializer<T?> {

    override val descriptor: SerialDescriptor get() = serializer.descriptor

    final override fun serialize(encoder: Encoder, value: T?) {
        val output = encoder.asJsonEncoder()

        if (value != null) {
            var element = output.json.encodeToJsonElement(serializer, value)
            element = transformSerialize(element)
            output.encodeJsonElement(element)
        } else {
            output.encodeJsonElement(JsonArray(emptyList()))
        }
    }

    final override fun deserialize(decoder: Decoder): T? {
        val input = decoder.asJsonDecoder()
        val element = input.decodeJsonElement()
        return input.json.decodeFromJsonElement(serializer, transformDeserialize(element) ?: return null)
    }

    private val propertyNames = serializer.descriptor.elementNames.toList()

    private fun transformDeserialize(element: JsonElement): JsonElement? =
        if (element is JsonArray) tupleToObject(element) else element

    private fun tupleToObject(element: JsonArray): JsonObject? {
        if (element.size == 0) return null

        require(element.size == propertyNames.size) {
            "Unexpected tuple length ${element.size} for ${serializer.descriptor.serialName}, " +
                "expected ${propertyNames.size} values for properties $propertyNames"
        }

        return buildJsonObject {
            propertyNames.forEachIndexed { index, propName ->
                put(propName, element[index])
            }
        }
    }

    private fun transformSerialize(element: JsonElement): JsonElement =
        if (element is JsonObject) objectToTuple(element) else element

    private fun objectToTuple(element: JsonObject) = buildJsonArray {
        propertyNames.forEach { propName ->
            // some properties might not be serialized in object form (e.g. default values)
            // but tuples are positional, so we need explicit nulls
            add(element[propName] ?: JsonNull)
        }
    }

}

private fun Decoder.asJsonDecoder(): JsonDecoder = this as? JsonDecoder
    ?: throw IllegalStateException(
        "This serializer can be used only with Json format." +
            "Expected Decoder to be JsonDecoder, got ${this::class}"
    )

private fun Encoder.asJsonEncoder() = this as? JsonEncoder
    ?: throw IllegalStateException(
        "This serializer can be used only with Json format." +
            "Expected Encoder to be JsonEncoder, got ${this::class}"
    )