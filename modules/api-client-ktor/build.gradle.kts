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

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.dokka")
    signing
    `maven-publish`
}

tasks {
    create<Jar>("javadocJar") {
        archiveClassifier.set("javadoc")
    }
}

kotlin {
    explicitApi()

    targets.all {
        compilations.all {
            kotlinOptions {
                languageVersion = "1.4"
                apiVersion = "1.4"

                freeCompilerArgs = listOf("-Xopt-in=kotlin.RequiresOptIn")
            }
        }

        mavenPublication {
            artifact(tasks["javadocJar"])

            decorateMavenPom {
                name.set("GW2APIClient Ktor Implementation")
                description.set("Ktor HttpClient implementation for GW2APIClient.")
            }
        }
    }

//    js(IR) {
//        browser()
//        nodejs()
//    }
    jvm {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    sourceSets {
        all {
            languageSettings.apply {
                useExperimentalAnnotation("kotlin.time.ExperimentalTime")
                useExperimentalAnnotation("kotlinx.serialization.ExperimentalSerializationApi")
            }
        }

        getByName("commonMain") {
            kotlin.srcDir("src/commonMain-generated/kotlin")

            dependencies {
                api(project(":api-client"))
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
    getByName<org.gradle.jvm.tasks.Jar>("jvmJar") {
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

//    create<Jar>("javadocJar") {
//        dependsOn(dokkaJavadoc)
//
//        archiveClassifier.set("javadoc")
//        from(dokkaJavadoc.get().outputs)
//
//        // Hook up empty javadoc-jar to main publication, due to maven central requirements.
//        publishing.publications.withType<MavenPublication>().getByName("kotlinMultiplatform").artifact(this)
//    }
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