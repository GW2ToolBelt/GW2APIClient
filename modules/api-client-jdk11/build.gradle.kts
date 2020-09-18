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
@file:Suppress("UnstableApiUsage")
import com.gw2tb.gw2apiclient.build.*
import com.gw2tb.gw2apiclient.build.BuildType
import org.jetbrains.kotlin.gradle.tasks.*

plugins {
    kotlin("jvm")
    id("org.jetbrains.dokka")
    signing
    `maven-publish`
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11

    withSourcesJar()
}

kotlin {
    explicitApi()
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "11"
    }

    jar {
        manifest {
            attributes(mapOf(
                "Name" to project.name,
                "Specification-Version" to project.version,
                "Specification-Vendor" to "Leon Linhart <themrmilchmann@gmail.com>",
                "Implementation-Version" to project.version,
                "Implementation-Vendor" to "Leon Linhart <themrmilchmann@gmail.com>",
                "Automatic-Module-Name" to "com.gw2tb.gw2api.client.jdk11"
            ))
        }
    }

    create<Jar>("javadocJar") {
        dependsOn(dokkaJavadoc)

        archiveClassifier.set("javadoc")
        from(dokkaJavadoc.get().outputs)
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            artifact(tasks["javadocJar"])

            pom {
                name.set(project.name)
                description.set("JDK11 standard HttpClient implementation for GW2APIClient.")
                packaging = "jar"
                url.set("https://github.com/GW2ToolBelt/GW2APIClient")

                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://github.com/GW2ToolBelt/GW2APIClient/blob/master/LICENSE")
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
                    connection.set("scm:git:git://github.com/GW2ToolBelt/GW2APIClient.git")
                    developerConnection.set("scm:git:git://github.com/GW2ToolBelt/GW2APIClient.git")
                    url.set("https://github.com/GW2ToolBelt/GW2APIClient.git")
                }
            }
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

dependencies {
    api(project(":api-client"))
    implementation(group = "org.jetbrains.kotlinx", name = "kotlinx-coroutines-jdk8", version = Dependencies.kotlinxCoroutinesVersion)
}