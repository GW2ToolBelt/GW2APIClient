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
package com.gw2tb.gw2api.generator.internal.codegen

import com.gw2tb.apigen.model.Name
import com.gw2tb.apigen.model.QualifiedTypeName
import com.gw2tb.apigen.schema.*

private val KotlinTypeInfo.listSerializer get() = "ListSerializer($serializer)"
private val KotlinTypeInfo.nullableListSerializer get() = "ListSerializer($serializer.nullable)"

internal fun SchemaPrimitiveOrAlias.toKotlinType(): KotlinTypeInfo = when (this) {
    is SchemaBitfield -> "ULong"
    is SchemaBoolean -> "Boolean"
    is SchemaDecimal -> "Double"
    is SchemaInteger -> "Int"
    is SchemaString -> "String"
    is SchemaTypeReference -> name.toKotlinName()
}.let { name -> KotlinTypeInfo(name, "$name.serializer()") }

internal data class KotlinTypeInfo(
    val name: String,
    val serializer: String = "$name.serializer()"
)

internal fun SchemaTypeUse.toKotlinType(
    apiVersion: Int?,
    titleCaseName: String? = null,
    qualified: Boolean = false
): KotlinTypeInfo = when (this) {
    is SchemaPrimitive -> toKotlinType()
    is SchemaArray -> {
        val itemType = elements.toKotlinType(apiVersion, titleCaseName, qualified = qualified)

        KotlinTypeInfo(
            name = "List<${itemType.name}${if (nullableElements) "?" else ""}>",
            serializer = if (nullableElements) itemType.nullableListSerializer else itemType.listSerializer
        )
    }
    is SchemaMap -> {
        val keyType = keys.toKotlinType()
        val valueType = values.toKotlinType(apiVersion, titleCaseName, qualified = qualified)

        KotlinTypeInfo(
            name = "Map<${keyType.name}, ${valueType.name}${if (nullableValues) "?" else ""}>",
            serializer = "MapSerializer(${keyType.serializer}, ${valueType.serializer})"
        )
    }
    is SchemaTypeReference -> KotlinTypeInfo(name.toKotlinName(apiVersion, qualified = qualified))
    else -> error("Unsupported SchemaType: $this")
}

internal fun QualifiedTypeName.toKotlinName(apiVersion: Int? = null, qualified: Boolean = false): String {
    val qualifier = when {
        qualified && this is QualifiedTypeName.Declaration && nest != null -> buildString {
            append("GW2v$apiVersion")
            append(nest!!.first().toTitleCase())
            append(nest!!.drop(1).joinToString(separator = ".", prefix = ".", postfix = ".", transform = Name::toTitleCase))
        }
        else -> null
    } ?: ""

    val name = name.toTitleCase()

    return qualifier + when {
        this is QualifiedTypeName.Alias -> "GW2$name"
        this is QualifiedTypeName.Declaration && nest == null -> "GW2v$apiVersion$name"
        else -> when (name) {
            "Map" -> "GameMap"
            else -> name
        }
    }
}