/*
 * Copyright (c) 2018-2022 Leon Linhart
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
@file:Suppress("UnstableApiUsage")

import com.gw2tb.gw2apiclient.build.*
import com.gw2tb.gw2apiclient.build.BuildType
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.plugin.serialization)
    alias(libs.plugins.dokka)
    signing
    `maven-publish`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

kotlin {
    explicitApi()

    targets.configureEach {
        compilations.configureEach {
            kotlinOptions {
                languageVersion = "1.7"
                apiVersion = "1.7"
            }
        }
    }

    js(IR) {
        browser()
        nodejs()
    }
    jvm {
        compilations.configureEach {
            kotlinOptions {
                jvmTarget = "11"
            }
        }
    }

    sourceSets {
        all {
            languageSettings.apply {
                optIn("kotlinx.serialization.ExperimentalSerializationApi")
            }
        }

        commonMain {
            kotlin.srcDir("src/commonMain-generated/kotlin")

            dependencies {
                api(libs.kotlinx.serialization.json)
            }
        }

        commonTest {
            kotlin.srcDir("src/commonTest-generated/kotlin")

            dependencies {
                api(libs.kotlin.test.common)
            }
        }

        named("jsTest") {
            dependencies {
                api(libs.kotlin.test.js)
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
        options.release.set(11)
    }

    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        dependsOn(project(":").tasks["generate"])
    }

    named<org.gradle.jvm.tasks.Jar>("jvmJar") {
        manifest {
            attributes(mapOf(
                "Name" to project.name,
                "Specification-Version" to project.version,
                "Specification-Vendor" to "Leon Linhart <themrmilchmann@gmail.com>",
                "Implementation-Version" to project.version,
                "Implementation-Vendor" to "Leon Linhart <themrmilchmann@gmail.com>",
                "Automatic-Module-Name" to "com.gw2tb.gw2api.types"
            ))
        }
    }

    sourcesJar {
        dependsOn(project(":").tasks["generate"])
    }

    named("jsSourcesJar") {
        dependsOn(project(":").tasks["generate"])
    }

    named("jvmSourcesJar") {
        dependsOn(project(":").tasks["generate"])
    }

    withType<DokkaTask>().configureEach {
        dependsOn(project(":").tasks["generate"])
    }
}

val emptyJar by tasks.registering(Jar::class)
val emptyJavadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

publishing {
    publications.withType<MavenPublication>().configureEach {
        if (name == "js") artifact(emptyJar)
        artifact(emptyJavadocJar)

        decorateMavenPom {
            name.set("GW2API Type Definitions")
            description.set("Definitions for the various objects returned by the official Guild Wars 2 API.")
        }
    }

    repositories {
        maven {
            url = uri(deployment.repo)

            credentials {
                username = deployment.user
                password = deployment.password
            }
        }
    }
}

signing {
    isRequired = (deployment.type === BuildType.RELEASE)
    sign(publishing.publications)
}