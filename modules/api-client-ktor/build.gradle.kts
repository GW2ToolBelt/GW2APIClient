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
plugins {
    alias(libs.plugins.dokkatoo.html)
    id("com.gw2tb.multiplatform-module")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api(projects.apiClient)
                api(libs.ktor.client.core)
            }
        }

        commonTest {
            dependencies {
                implementation(libs.kotlin.test)
                implementation(libs.ktor.client.mock)
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
                implementation(libs.junit.jupiter.api)
                implementation(libs.kotlin.test.junit5)
                implementation(libs.ktor.client.apache)

                runtimeOnly(libs.junit.jupiter.engine)
            }
        }

        named("wasmJsMain") {
            dependsOn(nonJvmMain)
        }
    }
}

tasks {
    named<Jar>("jvmJar") {
        manifest {
            attributes(mapOf(
                "Name" to project.name,
                "Specification-Version" to project.version,
                "Specification-Vendor" to "Leon Linhart <themrmilchmann@gmail.com>",
                "Implementation-Version" to project.version,
                "Implementation-Vendor" to "Leon Linhart <themrmilchmann@gmail.com>",
                "Automatic-Module-Name" to "com.gw2tb.gw2api.client.ktor"
            ))
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
            name = "GW2APIClient Ktor Implementation"
            description = "Ktor HttpClient implementation for GW2APIClient."

            packaging = "jar"
        }
    }
}