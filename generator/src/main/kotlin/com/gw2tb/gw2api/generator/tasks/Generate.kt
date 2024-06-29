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
package com.gw2tb.gw2api.generator.tasks

import com.gw2tb.apigen.APIGenerator
import com.gw2tb.apigen.model.Language
import com.gw2tb.apigen.model.v2.SchemaVersion
import com.gw2tb.apigen.schema.model.APIVersion
import com.gw2tb.gw2api.generator.internal.codegen.*
import com.gw2tb.gw2api.generator.internal.codegen.asComment
import com.gw2tb.gw2api.generator.internal.codegen.impl.asPrintableFileSequence
import com.gw2tb.gw2api.generator.internal.codegen.impl.asPrintableTestFileSequence
import com.gw2tb.gw2api.generator.internal.codegen.impl.printToString
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileSystemOperations
import org.gradle.api.provider.Property
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.property
import java.io.File
import javax.inject.Inject

@CacheableTask
public open class Generate @Inject constructor(
    private val fsOperations: FileSystemOperations
) : DefaultTask() {

    @get:Input
    public val schemaVersion: Property<SchemaVersion> = project.objects.property()

    @get:Input
    public val licenseHeader: Property<String> = project.objects.property()

    @get:OutputDirectory
    public val queriesDirectory: DirectoryProperty = project.objects.directoryProperty()

    @get:OutputDirectory
    public val queriesTestDirectory: DirectoryProperty = project.objects.directoryProperty()

    @get:OutputDirectory
    public val typesDirectory: DirectoryProperty = project.objects.directoryProperty()

    @get:OutputDirectory
    public val typesTestDirectory: DirectoryProperty = project.objects.directoryProperty()

    init {
        queriesDirectory.finalizeValueOnRead()
        queriesTestDirectory.finalizeValueOnRead()
        typesDirectory.finalizeValueOnRead()
        typesTestDirectory.finalizeValueOnRead()
    }

    @TaskAction
    public fun generate() {
        val schemaVersion = schemaVersion.get()
        val licenseHeader = licenseHeader.orNull ?: ""

        val queriesDirectory = queriesDirectory.get().asFile
        val queriesTestDirectory = queriesTestDirectory.get().asFile

        val typesDirectory = typesDirectory.get().asFile
        val typesTestDirectory = typesTestDirectory.get().asFile

        fsOperations.delete {
            delete(queriesDirectory, queriesTestDirectory, typesDirectory, typesTestDirectory)
        }

        fun writeFile(directory: File, location: String, content: String) {
            File(directory, "$location.kt").also { it.parentFile.mkdirs() }.writeText(buildString {
                if (licenseHeader.isNotEmpty()) appendLine(licenseHeader.asComment)
                append(content)
            })
        }

        fun PrintableFile.writeFile(directory: File) = writeFile(directory, path, content)
        fun Sequence<PrintableFile>.writeAll(directory: File) {
            forEach { it.writeFile(directory) }
        }

        val generator = APIGenerator(
            v2SchemaVersion = schemaVersion,
            includeMumbleLink = true
        )

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
                |${Language.values().map { language -> """${language.name}("${language.language}")""" }.joinToString(separator = ",$n") { "$t$it" }};
                |
                |    public companion object {
                |        /**
                |         * The languages supported by V1 of the Guild Wars 2 API.
                |         *
                |         * @since  0.3.0
                |         */
                |        public val API_V1: Set<Language> = setOf(${generator.apiV1.supportedLanguages.joinToString(separator = ", ") { it.name }})
                |        /**
                |         * The languages supported by V2 of the Guild Wars 2 API.
                |         *
                |         * @since  0.1.0
                |         */
                |        public val API_V2: Set<Language> = setOf(${generator.apiV2.supportedLanguages.joinToString(separator = ", ") { it.name }})
                |    }
                |}
                """.trimMargin()
        )

        /* MumbleLink `identity` type */
        val mumbleIdentity = generator.mumbleIdentity ?: error("MumbleLink Identity does not exist")

        writeFile(
            directory = typesDirectory,
            location = "com/gw2tb/gw2api/types/mumble/MumbleLinkIdentity",
            content =
                """
                |package com.gw2tb.gw2api.types.mumble
                |
                |import com.gw2tb.gw2api.types.*
                |
                |import kotlinx.serialization.*
                |
                |${mumbleIdentity.printToString()}
                """.trimMargin()
        )

        fun printApiVersion(apiVersion: APIVersion, number: Int) {
            apiVersion.supportedQueries.asPrintableFileSequence(
                apiVersion = number,
                schemaVersion = if (number == 2) schemaVersion else null,
                lookupAlias = { name -> generator.aliases[name]!! }
            ).writeAll(queriesDirectory)

            apiVersion.supportedTypes.asPrintableFileSequence(apiVersion = number).writeAll(typesDirectory)
            apiVersion.supportedTypes.asPrintableTestFileSequence(apiVersion = number).writeAll(typesTestDirectory)
        }

        generator.aliases.asPrintableFileSequence().writeAll(typesDirectory)
        printApiVersion(generator.apiV1, number = 1)
        printApiVersion(generator.apiV2, number = 2)
    }

}