/*
 * Copyright 2018-2019 Leon Linhart
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import com.github.themrmilchmann.build.*
import org.jetbrains.kotlin.gradle.plugin.*

plugins {
    signing
    `maven-publish`
    kotlin("multiplatform") version "1.3.31"
    id("kotlinx-serialization") version "1.3.31"
}

val nextVersion = "0.1.0"

group = "com.github.themrmilchmann.gw2api"
val artifactName = "gw2api-client"
version = when (deployment.type) {
    com.github.themrmilchmann.build.BuildType.SNAPSHOT -> "$nextVersion-SNAPSHOT"
    else -> nextVersion
}

kotlin {
    targets {
        configureEach {
            mavenPublication {
                pom {
                    name.set(project.name)
                    description.set("Kotlin multiplatform client for the official Guild Wars 2 API")
                    packaging = "jar"
                    url.set("https://github.com/TheMrMilchmann/GW2APIClient")

                    licenses {
                        license {
                            name.set("The Apache License, Version 2.0")
                            url.set("https://github.com/TheMrMilchmann/GW2APIClient/blob/master/LICENSE")
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
                        connection.set("scm:git:git://github.com/TheMrMilchmann/GW2APIClient.git")
                        developerConnection.set("scm:git:git://github.com/TheMrMilchmann/GW2APIClient.git")
                        url.set("https://github.com/TheMrMilchmann/GW2APIClient.git")
                    }
                }
            }
        }

//        fromPreset(presets.getByName("js"), "js")

        jvm {
            mavenPublication {
                artifactId = artifactName
            }
        }
    }

    sourceSets {
        configureEach {
            languageSettings.apply {
                languageVersion = "1.3"
                apiVersion = "1.3"

                useExperimentalAnnotation("kotlin.Experimental")
            }
        }

        getByName("commonMain").dependencies {
            implementation("io.ktor:ktor-client-core:${Dependencies.ktorVersion}")
            implementation("org.jetbrains.kotlin:kotlin-stdlib-common")
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Dependencies.kotlinxCoroutinesVersion}")
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Dependencies.kotlinxSerializationVersion}")
        }

        getByName("commonTest").dependencies {
            implementation("org.jetbrains.kotlin:kotlin-test-common")
            implementation("org.jetbrains.kotlin:kotlin-test-annotations-common")
        }

//        getByName("jsMain").dependencies {
//
//        }
//
//        getByName("jsTest").dependencies {
//
//        }

        getByName("jvmMain").dependencies {
            implementation("io.ktor:ktor-client-core-jvm:${Dependencies.ktorVersion}")
            implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Dependencies.kotlinxCoroutinesVersion}")
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Dependencies.kotlinxSerializationVersion}")
        }

        getByName("jvmTest").dependencies {
            implementation("org.jetbrains.kotlin:kotlin-test-testng")
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Dependencies.kotlinxSerializationVersion}")
            implementation("org.testng:testng:${Dependencies.testngVersion}")
            implementation("io.ktor:ktor-client-mock-jvm:${Dependencies.ktorVersion}")
            implementation("io.ktor:ktor-client-apache:${Dependencies.ktorVersion}")
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
    sign(publishing.publications)
}

tasks.withType<Sign> {
    onlyIf { deployment.type === com.github.themrmilchmann.build.BuildType.RELEASE }
}

repositories {
    mavenCentral()
    maven("https://kotlin.bintray.com/kotlinx")
}

fun <T : KotlinTarget> NamedDomainObjectCollection<KotlinTarget>.fromPreset(preset: KotlinTargetPreset<T>, name: String, configureAction: T.() -> Unit = {}): T {
    val target = preset.createTarget(name)
    add(target)
    target.run(configureAction)
    return target
}