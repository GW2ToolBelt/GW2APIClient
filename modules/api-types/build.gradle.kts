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
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.dokkatoo.html)
    alias(libs.plugins.kotlin.plugin.serialization)
    id("com.gw2tb.multiplatform-module")
}

kotlin {
    sourceSets {
        configureEach {
            languageSettings {
                optIn("kotlinx.serialization.ExperimentalSerializationApi")
            }
        }

        commonMain {
            kotlin.srcDir(files("src/commonMain-generated/kotlin").builtBy(project(":").tasks["generate"]))

            dependencies {
                api(libs.kotlinx.serialization.json)
            }
        }

        commonTest {
            kotlin.srcDir(files("src/commonTest-generated/kotlin").builtBy(project(":").tasks["generate"]))

            dependencies {
                api(libs.kotlin.test)
            }
        }

        named("jvmTest") {
            dependencies {
                api(libs.kotlin.test.junit5)
            }
        }
    }
}

tasks {
    withType<JavaCompile>().configureEach {
        options.javaModuleVersion = "$version"
    }

    named<JavaCompile>("compileJava") {
        options.compilerArgumentProviders += object : CommandLineArgumentProvider {

            @InputFiles
            @PathSensitive(PathSensitivity.RELATIVE)
            val kotlinClasses = this@tasks.named<KotlinCompile>("compileKotlinJvm").flatMap(KotlinCompile::destinationDirectory)

            override fun asArguments() = listOf(
                "--patch-module",
                "com.gw2tb.gw2api.types=${kotlinClasses.get().asFile.absolutePath}"
            )

        }
    }
}

publishing {
    publications.withType<MavenPublication>().configureEach {
        val emptyJavadocJar = tasks.register<Jar>("${name}JavadocJar") {
            archiveBaseName = "${archiveBaseName.get()}-${name}"
            archiveClassifier = "javadoc"
        }

        artifact(emptyJavadocJar)

        pom {
            name = "Guild Wars 2 API Type Definitions"
            description = "Definitions for the objects returned by the official Guild Wars 2 API."

            packaging = "jar"
        }
    }
}