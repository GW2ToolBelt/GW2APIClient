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

import org.jetbrains.kotlin.gradle.tasks.*

plugins {
    alias(libs.plugins.dokkatoo.javadoc)
    alias(libs.plugins.dokkatoo.html)
    alias(libs.plugins.kotlin.jvm)
    id("com.gw2tb.java-library-conventions")
    id("com.gw2tb.maven-publish-conventions")
}

kotlin {
    explicitApi()
}

tasks {
    withType<KotlinCompile>().configureEach {
        kotlinOptions {
            languageVersion = "1.7"
            apiVersion = "1.7"
            jvmTarget = "11"
        }
    }

    register<Jar>("javadocJar") {
        archiveClassifier.set("javadoc")

        from(dokkatooGenerateModuleJavadoc.get().outputs)
    }
}

publishing {
    publications {
        register<MavenPublication>("mavenJava") {
            from(components["java"])
            artifact(tasks["javadocJar"])

            pom {
                name = "GW2APIClient JDK11 HttpClient Implementation"
                description = "JDK11 standard HttpClient implementation for GW2APIClient."

                packaging = "jar"
            }
        }
    }
}

dependencies {
    api(projects.apiClient)

    testImplementation(libs.junit.jupiter.api)
    testRuntimeOnly(libs.junit.jupiter.engine)
}