/*
 * Copyright (c) 2019-2023 Leon Linhart
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
package com.gw2tb.build.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.Transformer
import org.gradle.api.file.CopySpec
import org.gradle.api.file.Directory
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileSystemOperations
import org.gradle.api.file.RegularFile
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.provider.ProviderFactory
import org.gradle.api.tasks.*
import org.gradle.kotlin.dsl.listProperty
import org.gradle.kotlin.dsl.newInstance
import org.gradle.kotlin.dsl.property
import org.gradle.process.ExecOperations
import javax.inject.Inject

@CacheableTask
abstract class MkDocs @Inject internal constructor(
    private val execOperations: ExecOperations,
    private val fsOperations: FileSystemOperations,
    private val objectFactory: ObjectFactory,
    private val providerFactory: ProviderFactory
): DefaultTask() {

    @get:InputFile
    @get:PathSensitive(PathSensitivity.NAME_ONLY)
    val configurationFile: RegularFileProperty = objectFactory.fileProperty()

    @get:Nested
    internal val inputSpecs: ListProperty<AbstractInputSpec> = objectFactory.listProperty()

    @get:Internal
    val workDirectory: DirectoryProperty = objectFactory.directoryProperty()

    @get:Internal
    val inputDirectory: DirectoryProperty = objectFactory.directoryProperty()

    @get:OutputDirectory
    val outputDirectory: DirectoryProperty = objectFactory.directoryProperty()

    init {
        inputs.property("workDirectory", workDirectory.map { it.asFile.absolutePath })
        inputs.property("inputDirectory", inputDirectory.map { it.asFile.absolutePath })

        configurationFile.convention(project.layout.projectDirectory.file("mkdocs.yml"))

        workDirectory.convention(project.layout.buildDirectory.dir("mkdocs"))
        inputDirectory.convention(workDirectory.map { it.dir("sources") })
        outputDirectory.convention(workDirectory.map { it.dir("site") })
    }

    fun inputFile(file: Provider<RegularFile>, block: FileInputSpec.() -> Unit): FileInputSpec =
        objectFactory.newInstance<FileInputSpec>(file)
            .apply(block)
            .also(inputSpecs::add)

    fun inputFile(file: RegularFile, block: FileInputSpec.() -> Unit): FileInputSpec =
        objectFactory.newInstance<FileInputSpec>(providerFactory.provider { file })
            .apply(block)
            .also(inputSpecs::add)

    fun inputFiles(dir: Provider<Directory>, block: DirectoryInputSpec.() -> Unit): DirectoryInputSpec =
        objectFactory.newInstance<DirectoryInputSpec>(dir)
            .apply(block)
            .also(inputSpecs::add)

    fun inputFiles(dir: Directory, block: DirectoryInputSpec.() -> Unit): DirectoryInputSpec =
        objectFactory.newInstance<DirectoryInputSpec>(providerFactory.provider { dir })
            .apply(block)
            .also(inputSpecs::add)

    @TaskAction
    fun generate() {
        fsOperations.delete {
            delete(workDirectory.asFileTree.matching {
                exclude("sources/api")
            })
        }

        inputSpecs.get().forEach { spec ->
            fsOperations.copy {
                into(inputDirectory)
                spec.enrichCopySpec(this)
            }
        }

        execOperations.exec {
            executable = "mkdocs"
            args("build",
                "-f", configurationFile.get().asFile.absolutePath,
                "-d", outputDirectory.get().asFile.absolutePath
            )

            standardOutput = System.out
            errorOutput = System.err
        }
    }

    sealed class AbstractInputSpec {

        internal abstract fun enrichCopySpec(spec: CopySpec)

    }

    abstract class DirectoryInputSpec @Inject internal constructor(
        source: Provider<Directory>,
        objectFactory: ObjectFactory
    ): AbstractInputSpec() {

        @get:InputDirectory
        @get:PathSensitive(PathSensitivity.NAME_ONLY)
        internal val source: DirectoryProperty = objectFactory.directoryProperty().convention(source)

        private val transformers: MutableList<Transformer<String?, String>> = mutableListOf()

        override fun enrichCopySpec(spec: CopySpec) {
            with(spec) {
                from(source)
                transformers.forEach(::filter)
            }
        }

        fun filter(transformer: Transformer<String?, String>) {
            transformers += transformer
        }

    }

    abstract class FileInputSpec @Inject internal constructor(
        source: Provider<RegularFile>,
        objectFactory: ObjectFactory
    ) : AbstractInputSpec() {

        @get:InputFile
        @get:PathSensitive(PathSensitivity.NAME_ONLY)
        internal val source: RegularFileProperty = objectFactory.fileProperty().convention(source)

        @get:Input
        val target: Property<String> = objectFactory.property()

        override fun enrichCopySpec(spec: CopySpec) {
            with(spec) {
                from(source)
                if (target.isPresent) rename(".*", target.get())
            }
        }

    }

}