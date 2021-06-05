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
package com.gw2tb.gw2apiclient.build.tasks

import com.gw2tb.apigen.*
import com.gw2tb.apigen.model.*
import com.gw2tb.apigen.model.v2.*
import com.gw2tb.gw2apiclient.build.codegen.*
import org.gradle.api.*
import org.gradle.api.tasks.*
import java.io.*

@CacheableTask
open class Generate : DefaultTask() {

    @get:Input
    lateinit var schemaVersion: V2SchemaVersion

    @get:Input
    lateinit var licenseHeader: String

    @get:OutputDirectory
    lateinit var queriesDirectory: File

    @get:OutputDirectory
    lateinit var typesDirectory: File

    @TaskAction
    fun generate() {
        project.delete(queriesDirectory)
        project.delete(typesDirectory)

        fun writeFile(directory: File, location: String, content: String) {
            File(directory, "$location.kt").also { it.parentFile.mkdirs() }.writeText(buildString {
                if (licenseHeader.isNotEmpty()) appendLine(licenseHeader.asComment)
                append(content)
            })
        }

        fun PrintableFile.writeFile(directory: File) = writeFile(directory, path, content)

        /* Languages */
        writeFile(
            directory = queriesDirectory,
            location = "com/gw2tb/gw2api/client/Language",
            content =
                """
                |package com.gw2tb.gw2api.client
                |
                |/**
                | * A languages supported by the Guild Wars 2 API.
                | *
                | * @param code the code for the language
                | *
                | * @since   0.1.0
                | */
                |public enum class Language(public val code: String) {
                |${Language.values().map { language -> """${language.name}("${language.locale.language}")""" }.joinToString(separator = ",$n") { "$t$it" }};
                |
                |    public companion object {
                |        /**
                |         * The languages supported by V1 of the Guild Wars 2 API.
                |         *
                |         * @since  0.3.0
                |         */
                |        public val API_V1: Set<Language> = setOf(${APIVersion.API_V1.supportedLanguages.joinToString(separator = ", ") { it.name }})
                |        /**
                |         * The languages supported by V2 of the Guild Wars 2 API.
                |         *
                |         * @since  0.1.0
                |         */
                |        public val API_V2: Set<Language> = setOf(${APIVersion.API_V2.supportedLanguages.joinToString(separator = ", ") { it.name }})
                |    }
                |}
                """.trimMargin()
        )

        /* MumbleLink `identity` type */
        writeFile(
            directory = typesDirectory,
            location = "com/gw2tb/gw2api/types/mumble/MumbleLinkIdentity",
            content =
                """
                |package com.gw2tb.gw2api.types.mumble
                |
                |import kotlinx.serialization.*
                |
                |${MUMBLELINK_IDENTITY_DEFINITION.toClassString(nest = null, nestedTypesToString = { "" })}
                """.trimMargin()
        )

        /* Queries */
        (sequenceOfPrintableV1Queries() + sequenceOfPrintableV2Queries(schemaVersion)).forEach { printableFile ->
            printableFile.writeFile(directory = queriesDirectory)
        }

        /* Types */
        (sequenceOfPrintableV1Types() + sequenceOfPrintableV2Types(schemaVersion)).forEach { printableFile ->
            printableFile.writeFile(directory = typesDirectory)
        }
    }

}