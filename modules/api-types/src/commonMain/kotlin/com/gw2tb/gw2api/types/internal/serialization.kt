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
@file:Suppress("FunctionName")
package com.gw2tb.gw2api.types.internal

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.nullable
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

internal abstract class LenientTransform<T>(private val parser: (String) -> T) : KSerializer<T> {

    override val descriptor: SerialDescriptor
        get() = PrimitiveSerialDescriptor("com.gw2tb.gw2api.types.internal.LenientTransform", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): T {
        return parser(decoder.decodeString())
    }

    override fun serialize(encoder: Encoder, value: T) {

    }

}

internal abstract class NullableLenientTransform<T>(private val parser: (String) -> T) : KSerializer<T?> {

    override val descriptor: SerialDescriptor
        get() = PrimitiveSerialDescriptor("com.gw2tb.gw2api.types.internal.LenientTransform", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): T? {
        return if (decoder.decodeNotNullMark()) {
            val string = decoder.decodeString()
            if (string.isEmpty()) null else parser(string)
        } else {
            decoder.decodeNull()
        }
    }

    override fun serialize(encoder: Encoder, value: T?) {

    }

}

internal object LenientIntTransform : LenientTransform<Int>(String::toInt)

internal object NullableLenientIntTransform : LenientTransform<Int?>(String::toInt)