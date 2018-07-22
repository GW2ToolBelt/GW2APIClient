/*
 * Copyright 2018 Leon Linhart
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
import gw2apiclient.build.*
import org.jetbrains.kotlin.gradle.dsl.*

plugins {
    signing
    `maven-publish`
    id("kotlin-platform-common")
}

val artifactName = "gw2api-client-common"

kotlin {
    experimental.coroutines = Coroutines.ENABLE
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
    (publications) {
        "mavenJava"(MavenPublication::class) {
            from(components["java"])

            artifactId = artifactName

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
}

signing {
    sign(publishing.publications)
}

val signMavenJavaPublication by tasks.getting {
    onlyIf { deployment.type === gw2apiclient.build.BuildType.RELEASE }
}

dependencies {
    compile(kotlin("stdlib-common"))
    compile("org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${rootProject.extra["kotlinxCoroutinesVersion"]}")
    compile("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${rootProject.extra["kotlinxSerializationVersion"]}")

    testCompile(kotlin("test-common"))
    testCompile(kotlin("test-annotations-common"))
}