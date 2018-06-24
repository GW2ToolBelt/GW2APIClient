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
import org.jetbrains.kotlin.gradle.dsl.*

plugins {
    id("kotlin-platform-jvm")
    id("kotlinx-serialization")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

kotlin {
    experimental.coroutines = Coroutines.ENABLE
}

tasks.withType<Test> {
    useTestNG()
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