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
import kotlinx.serialization.json.JsonTransformingSerializer

internal open class JsonInlineSerializer<T : Any>(private val serializer: KSerializer<T>) : JsonTransformingSerializer<T>(serializer) {

    // TODO This is currently a placeholder because of an outstanding kotlinx.serialization bug

//    private val inlinedPropertyToNestMapping: Map<String, List<String>> = mutableMapOf()
//
//    init {
//        val queue = mutableListOf<SerialDescriptor>()
//        queue.add(serializer.descriptor)
//
//        while (queue.isNotEmpty()) {
//            val descriptor = queue.removeFirst()
//
//            println(descriptor.elementNames.toList())
//            println(descriptor.elementsCount)
//
//            for (i in 0 until descriptor.elementsCount) {
//                println(descriptor.getElementName(i))
//
//                if (descriptor.getElementDescriptor(i).annotations.any { it is SerializeInline }) {
//                    val elementDescriptor = descriptor.getElementDescriptor(i)
//                    queue.add(elementDescriptor)
//                } else {
//                    element(
//                        elementName = descriptor.getElementName(i),
//                        descriptor = descriptor.getElementDescriptor(i),
//                        annotations = descriptor.getElementDescriptor(i).annotations,
//                        isOptional = descriptor.isElementOptional(i)
//                    )
//                }
//            }
//        }
//
//    }

//    override fun transformDeserialize(element: JsonElement): JsonElement {
//        require(element is JsonObject)
//
//        return buildJsonObject {
//            for ((key, value) in transformDeserialize(element, nest = emptyList())) {
//                put (key, value)
//            }
//        }
//    }
//
//    private fun transformDeserialize(element: JsonElement, nest: List<String>): Sequence<Map.Entry<String, JsonElement>> = sequence {
//        require(element is JsonObject)
//
//        val (elementsToInline, remainingElements) = element.entries.partition { (key, _) ->
//            listOf(*nest.toTypedArray(), key) in inlinedPropertyToNestMapping.values
//        }
//
//        yieldAll(remainingElements)
//        yieldAll(elementsToInline.flatMap { (k, v) -> transformDeserialize(v, listOf(*nest.toTypedArray(), k))  })
//    }
//
//    override fun transformSerialize(element: JsonElement): JsonElement {
//        require(element is JsonObject)
//
//        TODO()
//    }

}