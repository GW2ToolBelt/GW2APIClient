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
    id("kotlin-platform-jvm")
    id("kotlinx-serialization")
}

val artifactName = "gw2api-client"

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

kotlin {
    experimental.coroutines = Coroutines.ENABLE
}

tasks {
    "test"(Test::class) {
        useTestNG()
    }

    "jar"(Jar::class) {
        baseName = artifactName

        manifest {
            attributes(mapOf(
                "Name" to project.name,
                "Specification-Version" to project.version,
                "Specification-Vendor" to "Leon Linhart <themrmilchmann@gmail.com>",
                "Implementation-Version" to project.version,
                "Implementation-Vendor" to "Leon Linhart <themrmilchmann@gmail.com>"
            ))
        }
    }

    val sourcesJar = "sourcesJar"(Jar::class) {
        baseName = artifactName
        classifier = "sources"
        from(java.sourceSets["main"].allSource)
    }

    val javadoc = "javadoc"(Javadoc::class)

    val javadocJar = "javadocJar"(Jar::class) {
        dependsOn(javadoc)

        baseName = artifactName
        classifier = "javadoc"
        from(javadoc.outputs)
    }

    "signArchives" {
        dependsOn(sourcesJar, javadocJar)
    }
}

tasks.withType<Test> {
    useTestNG()
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
            artifact(tasks["sourcesJar"])
            artifact(tasks["javadocJar"])

            artifactId = artifactName

            pom {
                name.set(rootProject.name)
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
    expectedBy(project(":shared"))

    compile(kotlin("stdlib-jdk7"))
    compile(kotlin("reflect"))
    compile("org.jetbrains.kotlinx:kotlinx-coroutines-core:${rootProject.extra["kotlinxCoroutinesVersion"]}")
    compile("org.jetbrains.kotlinx:kotlinx-serialization-runtime:${rootProject.extra["kotlinxSerializationVersion"]}")

    compile("com.squareup.okhttp3:okhttp:${rootProject.extra["okhttpVersion"]}")

    testCompile(kotlin("test"))
    testCompile(kotlin("test-testng"))

    testCompile("org.testng:testng:${rootProject.extra["testngVersion"]}")
}