/*
 * Copyright (c) 2018-2020 Leon Linhart
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

private val String.listSerializer get() = "ListSerializer($this.serializer())"
private val KotlinTypeInfo.listSerializer get() = "ListSerializer($this.serializer())"

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
    val list by lazy { KotlinTypeInfo("List<$name>", listSerializer) }
    override fun toString() = name
}

internal fun SchemaType.toKotlinType(titleCaseName: String? = null, dataClasses: MutableMap<String, SchemaType>? = null): KotlinTypeInfo = when (this) {
    is SchemaPrimitive -> toKotlinType()
    is SchemaArray -> {
        val itemType = items.toKotlinType(titleCaseName, dataClasses)
        KotlinTypeInfo("List<${itemType.name}${if (nullableItems) "?" else ""}>", itemType.listSerializer)
    }
    is SchemaMap -> {
        val keyType = keys.toKotlinType()
        val valueType = values.toKotlinType(titleCaseName, dataClasses)
        KotlinTypeInfo("Map<${keyType.name}, ${valueType.name}${if (nullableValues) "?" else ""}>")
    }
    is SchemaConditional -> KotlinTypeInfo(titleCaseName!!).also { if (dataClasses != null) dataClasses[it.name] = this }
    is SchemaRecord -> KotlinTypeInfo(name ?: titleCaseName!!).also { if (dataClasses != null) dataClasses[it.name] = this }
    else -> error("Unsupported SchemaType: $this")
}