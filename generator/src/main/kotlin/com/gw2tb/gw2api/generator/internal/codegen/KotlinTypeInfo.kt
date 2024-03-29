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
package com.gw2tb.gw2api.generator.internal.codegen

import com.gw2tb.apigen.schema.*

private val KotlinTypeInfo.listSerializer get() = "ListSerializer($serializer)"
private val KotlinTypeInfo.nullableListSerializer get() = "ListSerializer($serializer.nullable)"

internal fun SchemaPrimitive.toKotlinType(): KotlinTypeInfo = when (this) {
    is SchemaBoolean -> "Boolean"
    is SchemaDecimal -> "Double"
    is SchemaInteger -> "Int"
    is SchemaString -> "String"
}.let { name -> KotlinTypeInfo(name, "$name.serializer()") }

internal data class KotlinTypeInfo(
    val name: String,
    val serializer: String = "$name.serializer()"
)

internal fun SchemaTypeUse.toKotlinType(
    apiVersion: String?,
    titleCaseName: String? = null
): KotlinTypeInfo = when (this) {
    is SchemaPrimitive -> toKotlinType()
    is SchemaArray -> {
        val itemType = elements.toKotlinType(apiVersion, titleCaseName)

        KotlinTypeInfo(
            name = "List<${itemType.name}${if (nullableElements) "?" else ""}>",
            serializer = if (nullableElements) itemType.nullableListSerializer else itemType.listSerializer
        )
    }
    is SchemaMap -> {
        val keyType = keys.toKotlinType()
        val valueType = values.toKotlinType(apiVersion, titleCaseName)

        KotlinTypeInfo(
            name = "Map<${keyType.name}, ${valueType.name}${if (nullableValues) "?" else ""}>",
            serializer = "MapSerializer(${keyType.serializer}, ${valueType.serializer})"
        )
    }
    is SchemaTypeReference -> KotlinTypeInfo(typeLocation.toKotlinName(apiVersion))
    else -> error("Unsupported SchemaType: $this")
}