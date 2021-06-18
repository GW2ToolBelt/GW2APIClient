/*
 * Copyright (c) 2018-2021 Leon Linhart
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
import org.jetbrains.kotlin.gradle.tasks.*

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.dokka")
    signing
    `maven-publish`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
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
            compileKotlinTask.apply {
                dependsOn(project(":").tasks["generate"])
            }

            kotlinOptions {
                languageVersion = "1.5"
                apiVersion = "1.5"
            }
        }
    }

    js(IR) {
        browser()
        nodejs()
    }
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
                useExperimentalAnnotation("kotlin.RequiresOptIn")
                useExperimentalAnnotation("kotlin.time.ExperimentalTime")
                useExperimentalAnnotation("kotlinx.coroutines.ExperimentalCoroutinesApi")
            }
        }

        commonMain {
            kotlin.srcDir("src/commonMain-generated/kotlin")

            dependencies {
                api(projects.apiTypes)
                api(libs.kotlinx.coroutines.core)
            }
        }

        getByName("jvmMain") {
            dependencies {
                api(libs.kotlinx.coroutines.jdk8)
            }
        }

        val nonJvmMain by creating {
            dependsOn(commonMain.get())
        }

        getByName("jsMain") {
            dependsOn(nonJvmMain)
        }
    }

}

tasks {
    withType<JavaCompile> {
        options.release.set(8)
    }

    withType<KotlinCompile> {
        dependsOn(project(":").tasks["generate"])
    }

    getByName<org.gradle.jvm.tasks.Jar>("jvmJar") {
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
    publications.withType<MavenPublication>().all {
        artifact(tasks["javadocJar"])

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