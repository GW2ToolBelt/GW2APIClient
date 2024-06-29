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
package com.gw2tb.gw2api.generator.internal.codegen.impl

import com.gw2tb.apigen.model.Name
import com.gw2tb.apigen.model.QualifiedTypeName
import com.gw2tb.apigen.model.joinToString
import com.gw2tb.apigen.schema.SchemaAlias
import com.gw2tb.apigen.schema.SchemaInteger
import com.gw2tb.gw2api.generator.internal.codegen.PrintableFile
import com.gw2tb.gw2api.generator.internal.codegen.asDocComment
import com.gw2tb.gw2api.generator.internal.codegen.n
import com.gw2tb.gw2api.generator.internal.codegen.toKotlinType

internal fun Map<QualifiedTypeName.Alias, SchemaAlias>.asPrintableFileSequence(): Sequence<PrintableFile> {
    return entries.asSequence().map { (name, type) ->
        val content = buildList {
            if (type.type is SchemaInteger) {
                add(
                    """
                    |@Suppress("unused")
                    |internal object LenientGW2${type.name.toTitleCase()}Serializer : LenientSerializer<GW2${type.name.toTitleCase()}?>(
                    |    { GW2${type.name.toTitleCase()}(it.toInt()) },
                    |    GW2${type.name.toTitleCase()}.serializer().nullable
                    |)
                    """.trimMargin()
                )
            }

            add(type.printToString())
        }.joinToString(separator = "$n$n")

        PrintableFile(
            "com/gw2tb/gw2api/types/${name.name.toTitleCase()}",
            """
            |@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
            |package com.gw2tb.gw2api.types
            |
            |import com.gw2tb.gw2api.types.internal.*
            |
            |import kotlin.jvm.JvmInline
            |import kotlinx.serialization.*
            |import kotlinx.serialization.builtins.*
            |import kotlinx.serialization.json.*
            |
            |// Generated for type: ${name.joinToString(transform = Name::toTitleCase)}
            |
            |$content
            """.trimMargin()
        )
    }
}

private fun SchemaAlias.printToString(): String {
    val typeInfo = type.toKotlinType()

    return buildString {
        appendLine(description.asDocComment)

        appendLine("@Serializable")
        appendLine("@JvmInline")

        append(
            """
            public value class GW2${name.toTitleCase()}(
                /** The raw (type-unsafe) value. */
                public val raw: ${typeInfo.name}
            ) {
                override fun toString(): String = raw.toString()
            }""".trimIndent()
        )
    }
}