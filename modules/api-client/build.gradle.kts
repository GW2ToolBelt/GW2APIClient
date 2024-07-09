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
    id("com.gw2tb.multiplatform-module")
}

kotlin {
    sourceSets {
        commonMain {
            kotlin.srcDir(files("src/commonMain-generated/kotlin").builtBy(project(":").tasks["generate"]))

            dependencies {
                api(projects.apiTypes)
                api(libs.kotlinx.coroutines.core)
            }
        }

        commonTest {
            kotlin.srcDir(files("src/commonTest-generated/kotlin").builtBy(project(":").tasks["generate"]))

            dependencies {
                implementation(projects.apiClientKtor)
                implementation(libs.kotlin.test)
                implementation(libs.kotlinx.coroutines.test)
            }
        }

        val nonJvmMain by creating {
            dependsOn(commonMain.get())
        }

        named("nativeMain") {
            dependsOn(nonJvmMain)
        }

        named("jsMain") {
            dependsOn(nonJvmMain)
        }

        named("jvmTest") {
            dependencies {
                api(libs.kotlin.test.junit5)
                implementation(libs.ktor.client.apache)
            }
        }

        named("wasmJsMain") {
            dependsOn(nonJvmMain)
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
                "com.gw2tb.gw2api.client=${kotlinClasses.get().asFile.absolutePath}"
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
            name = "Guild Wars 2 API Query Definitions"
            description = "Definitions for the queries supported by the official Guild Wars 2 API."

            packaging = "jar"
        }
    }
}