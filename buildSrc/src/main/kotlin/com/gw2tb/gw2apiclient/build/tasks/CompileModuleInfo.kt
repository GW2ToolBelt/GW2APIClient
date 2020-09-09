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
package com.gw2tb.gw2apiclient.build.tasks

import com.github.javaparser.*
import com.github.javaparser.ast.*
import com.github.javaparser.ast.expr.*
import com.github.javaparser.ast.modules.*
import org.gradle.api.*
import org.gradle.api.tasks.*
import org.objectweb.asm.*
import org.objectweb.asm.Opcodes.*

private val String.asBinaryName get(): String {
    val parts = split('.')
    var inClass = false

    return buildString {
        append(parts[0])

        for (i in 1 until parts.size) {
            append(if (inClass || parts[i][0].isUpperCase()) {
                inClass = true
                "$"
            } else "/")
            append(parts[i])
        }
    }
}

@CacheableTask
open class CompileModuleInfo : DefaultTask() {

    @get:InputFile
    @get:PathSensitive(PathSensitivity.RELATIVE)
    val source = project.objects.fileProperty()

    @get:OutputFile
    val output = project.objects.fileProperty()

    @TaskAction
    fun compile() {
        val parser = JavaParser(ParserConfiguration().setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_9))
        val decl = parser.parseModuleDeclaration(source.get().asFile.readText()).result.get()

        val classWriter = ClassWriter(0)
        classWriter.visit(V9, ACC_MODULE, "module-info", null, null, null)

        val moduleAccess: Int = if (decl.isOpen) ACC_SYNTHETIC or ACC_OPEN else ACC_SYNTHETIC
        val mv: ModuleVisitor = classWriter.visitModule(decl.nameAsString, moduleAccess, null)

        decl.findAll(ModuleRequiresDirective::class.java).forEach {
            var mod = 0
            if (it.hasModifier(Modifier.Keyword.STATIC)) mod = mod or ACC_STATIC_PHASE
            if (it.hasModifier(Modifier.Keyword.TRANSITIVE)) mod = mod or ACC_TRANSITIVE

            mv.visitRequire(it.nameAsString, mod, null)
        }

        decl.findAll(ModuleExportsDirective::class.java).forEach {
            mv.visitExport(it.nameAsString, 0, *it.moduleNames.map(Name::asString).toTypedArray())
        }

        decl.findAll(ModuleProvidesDirective::class.java).forEach {
            mv.visitProvide(it.nameAsString.asBinaryName, *it.with.map(Name::asString).map(String::asBinaryName).toTypedArray())
        }

        decl.findAll(ModuleUsesDirective::class.java).forEach {
            mv.visitUse(it.nameAsString.asBinaryName)
        }

        decl.findAll(ModuleOpensDirective::class.java).forEach {
            mv.visitOpen(it.nameAsString, 0, *it.moduleNames.map(Name::asString).toTypedArray())
        }

        mv.visitRequire("java.base", ACC_MANDATED, null)
        mv.visitEnd()

        classWriter.visitEnd()

        val outputFile = output.get().asFile
        outputFile.parentFile.mkdirs()
        outputFile.writeBytes(classWriter.toByteArray())
    }

}