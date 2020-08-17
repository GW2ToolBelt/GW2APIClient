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
import com.gw2tb.gw2apiclient.build.*
import com.gw2tb.gw2apiclient.build.BuildType
import com.gw2tb.gw2apiclient.build.codegen.*
import org.jetbrains.dokka.gradle.*

plugins {
    kotlin("multiplatform") version "1.4.0"
    kotlin("plugin.serialization") version "1.4.0"
    id("org.jetbrains.dokka") version "1.4.0-rc"
    signing
    `maven-publish`
}

val nextVersion = "0.1.0"

group = "com.gw2tb.gw2-api-client"
val artifactName = "gw2-api-client"
version = when (deployment.type) {
    BuildType.SNAPSHOT -> "$nextVersion-SNAPSHOT"
    else -> nextVersion
}

kotlin {
    explicitApi()

    targets.all {
        compilations.all {
            kotlinOptions {
                languageVersion = "1.4"
                apiVersion = "1.4"
            }
        }

        mavenPublication {
            pom {
                name.set(project.name)
                description.set("Kotlin multiplatform client for the official Guild Wars 2 API")
                packaging = "jar"
                url.set("https://github.com/GW2TB/GW2APIClient")

                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://github.com/GW2TB/GW2APIClient/blob/master/LICENSE")
                        distribution.set("repo")
                    }
                }

                developers {
                    developer {
                        id.set("TheMrMilchmann")
                        name.set("Leon Linhart")
                        email.set("themrmilchmann@gmail.com")
                        url.set("https://github.com/TheMrMilchmann")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/GW2TB/GW2APIClient.git")
                    developerConnection.set("scm:git:git://github.com/GW2TB/GW2APIClient.git")
                    url.set("https://github.com/GW2TB/GW2APIClient.git")
                }
            }
        }
    }

    jvm()

    sourceSets {
        all {
            languageSettings.apply {
                useExperimentalAnnotation("kotlin.time.ExperimentalTime")
            }
        }

        getByName("commonMain") {
            kotlin.srcDir("src/commonMain-generated/kotlin")

            dependencies {
                implementation("io.ktor:ktor-client-core:${Dependencies.ktorVersion}")
                implementation("org.jetbrains.kotlin:kotlin-stdlib-common")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Dependencies.kotlinxCoroutinesVersion}")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:${Dependencies.kotlinxSerializationVersion}")
            }
        }

        getByName("commonTest") {
            kotlin.srcDir("src/commonTest-generated/kotlin")

            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test-common")
                implementation("org.jetbrains.kotlin:kotlin-test-annotations-common")
            }
        }

        getByName("jvmMain").dependencies {
            implementation("io.ktor:ktor-client-core-jvm:${Dependencies.ktorVersion}")
            implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:${Dependencies.kotlinxCoroutinesVersion}")
        }

        getByName("jvmTest").dependencies {
            implementation("org.jetbrains.kotlin:kotlin-test-testng")
            implementation("org.testng:testng:${Dependencies.testngVersion}")
            implementation("io.ktor:ktor-client-mock-jvm:${Dependencies.ktorVersion}")
            implementation("io.ktor:ktor-client-apache:${Dependencies.ktorVersion}")
        }
    }
}

tasks {
    create<Generate>("generate") {
        licenseHeader = file("docs/LICENSE_HEADER_GEN").readText()
        outputDirectory = file("src/commonMain-generated")
    }

    withType<DokkaTask> {
        dokkaSourceSets {
            register("commonMain") {
                displayName = "common"
                platform = "common"
            }
            register("jvmMain") {
                displayName = "jvm"
                platform = "jvm"
            }
        }
    }
}

publishing {
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

repositories {
    mavenCentral()
    jcenter()
    maven("https://kotlin.bintray.com/kotlinx")
}