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
import org.jetbrains.kotlin.gradle.targets.js.yarn.yarn

plugins {
    `maven-publish`
    signing
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.dokka)
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
            compileKotlinTask.dependsOn(project(":").tasks["generate"])

            kotlinOptions {
                languageVersion = "1.7"
                apiVersion = "1.7"
            }
        }
    }

    js(IR) {
        browser {
            testTask {
                useMocha {
                    // https://github.com/Kotlin/kotlinx.coroutines/issues/3077
                    timeout = "10s"
                }
            }
        }
        nodejs {
            testTask {
                useMocha {
                    // https://github.com/Kotlin/kotlinx.coroutines/issues/3077
                    timeout = "10s"
                }
            }
        }
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
                api(projects.apiTypes)
                api(libs.kotlinx.coroutines.core)
            }
        }

        commonTest {
            kotlin.srcDir("src/commonTest-generated/kotlin")

            dependencies {
                implementation(projects.apiClientKtor)

                implementation(libs.kotlin.test.common)
                implementation(libs.kotlinx.coroutines.test)
            }
        }

        val nonJvmMain by creating {
            dependsOn(commonMain.get())
        }

        getByName("jsMain") {
            dependsOn(nonJvmMain)
        }

        named("jsTest") {
            dependencies {
                api(libs.kotlin.test.js)
            }
        }

        named("jvmMain") {
            dependencies {
                api(libs.kotlinx.coroutines.jdk8)
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

    named<org.gradle.jvm.tasks.Jar>("jvmJar") {
        manifest {
            attributes(mapOf(
                "Name" to project.name,
                "Specification-Version" to project.version,
                "Specification-Vendor" to "Leon Linhart <themrmilchmann@gmail.com>",
                "Implementation-Version" to project.version,
                "Implementation-Vendor" to "Leon Linhart <themrmilchmann@gmail.com>",
                "Automatic-Module-Name" to "com.gw2tb.gw2api.client"
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
            name.set("GW2APIClient Query Definitions")
            description.set("Definitions for the various queries supported by the official Guild Wars 2 API.")
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