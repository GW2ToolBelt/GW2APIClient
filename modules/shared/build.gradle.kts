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
    id("kotlin-platform-common")
}

kotlin {
    experimental.coroutines = Coroutines.ENABLE
}

dependencies {
    compile(kotlin("stdlib-common"))
    compile("org.jetbrains.kotlinx:kotlinx-coroutines-core-common:0.22.5")
    compile("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:0.5.1")

    testCompile(kotlin("test-common"))
    testCompile(kotlin("test-annotations-common"))
}