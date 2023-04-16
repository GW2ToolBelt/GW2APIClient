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

import org.jetbrains.kotlin.gradle.targets.js.yarn.yarn

plugins {
    id("com.gw2tb.maven-publish-conventions")
    alias(libs.plugins.dokka)
    alias(libs.plugins.kotlin.multiplatform)
}

yarn.lockFileName = "kotlin-yarn.lock"
yarn.lockFileDirectory = rootProject.projectDir

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
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
        commonMain {
            kotlin.srcDir("src/commonMain-generated/kotlin")

            dependencies {
                api(projects.apiClient)
                api(libs.ktor.client.core)
            }
        }

        commonTest {
            kotlin.srcDir("src/commonTest-generated/kotlin")

            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test-common")
                implementation("org.jetbrains.kotlin:kotlin-test-annotations-common")
                implementation(libs.ktor.client.mock)
            }
        }

        named("jvmMain") {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
            }
        }

        named("jvmTest") {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test-junit5")
                implementation(libs.junit.jupiter.api)
                implementation(libs.ktor.client.apache)

                runtimeOnly(libs.junit.jupiter.engine)
            }
        }
    }
}

tasks {
    withType<JavaCompile>().configureEach {
        options.release.set(11)
    }

    named<org.gradle.jvm.tasks.Jar>("jvmJar") {
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

val emptyJar by tasks.registering(Jar::class)
val emptyJavadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

publishing {
    publications.withType<MavenPublication>().configureEach {
        if (name == "js") artifact(emptyJar)
        artifact(emptyJavadocJar)

        pom {
            name.set("GW2APIClient Ktor Implementation")
            description.set("Ktor HttpClient implementation for GW2APIClient.")

            packaging = "jar"
        }
    }
}