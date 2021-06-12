/*
 * Copyright (c) 2018-2021 Leon Linhart
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
package com.gw2tb.gw2apiclient.build.codegen

import com.gw2tb.apigen.schema.*

private val KotlinTypeInfo.listSerializer get() = "ListSerializer($serializer)"
private val KotlinTypeInfo.nullableListSerializer get() = "ListSerializer($serializer.nullable)"

internal fun SchemaPrimitive.toKotlinType(): KotlinTypeInfo = when (this) {
    SchemaBoolean -> "Boolean"
    SchemaDecimal -> "Double"
    SchemaInteger -> "Int"
    SchemaString -> "String"
}.let { name -> KotlinTypeInfo(name, "$name.serializer()") }

internal data class KotlinTypeInfo(
    val name: String,
    val serializer: String = "$name.serializer()"
) {
    override fun toString() = name
}

internal fun SchemaType.toKotlinType(lenient: Boolean = false, titleCaseName: String? = null): KotlinTypeInfo = when (this) {
    is SchemaPrimitive -> toKotlinType()
    is SchemaArray -> {
        val itemType = items.toKotlinType(lenient = lenient, titleCaseName = titleCaseName)
        KotlinTypeInfo("List<${itemType.name}${if (nullableItems) "?" else ""}>", if (nullableItems) itemType.nullableListSerializer else itemType.listSerializer)
    }
    is SchemaMap -> {
        val keyType = keys.toKotlinType()
        val valueType = values.toKotlinType(lenient = lenient, titleCaseName = titleCaseName)
        KotlinTypeInfo("Map<${keyType.name}, ${valueType.name}${if (nullableValues) "?" else ""}>", "MapSerializer(${keyType.serializer}, ${valueType.serializer})")
    }
    is SchemaClass -> {
        val name = titleCaseName ?: when (name) {
            "Map" -> "GameMap"
            else -> name
        }

        if (lenient)
            KotlinTypeInfo("Result<$name>", "LenientSerializer($name.serializer())")
        else
            KotlinTypeInfo(name)

    }
    else -> error("Unsupported SchemaType: $this")
}