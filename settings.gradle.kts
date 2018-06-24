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
rootProject.name = "GW2APIClient"

fun hasBuildscript(it: File) = File(it, "build.gradle.kts").exists()

file("modules").listFiles(File::isDirectory).filter(this::hasBuildscript).forEach {
    val projectName = it.name

    include(projectName)
    project(":$projectName").projectDir = it
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://kotlin.bintray.com/kotlinx")
    }

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "kotlin-platform-common" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${gradle.rootProject.extra["kotlinVersion"]}")
                "kotlin-platform-js" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${gradle.rootProject.extra["kotlinVersion"]}")
                "kotlin-platform-jvm" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${gradle.rootProject.extra["kotlinVersion"]}")
                "kotlinx-serialization" -> useModule("org.jetbrains.kotlinx:kotlinx-gradle-serialization-plugin:${gradle.rootProject.extra["kotlinxSerializationVersion"]}")
            }
        }
    }
}