/*
 * Copyright (c) 2018-2023 Leon Linhart
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
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
    id("com.gw2tb.maven-publish-conventions")
    kotlin("multiplatform")
}

kotlin {
    explicitApi()

    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }

    targets.configureEach {
        compilations.configureEach {
            compilerOptions.options.apiVersion.set(KotlinVersion.KOTLIN_1_8)
            compilerOptions.options.languageVersion.set(KotlinVersion.KOTLIN_1_8)
        }
    }

    js(IR) {
        browser()
        nodejs()
    }

    jvm {
        withJava()

        compilations.configureEach {
            compilerOptions.options.jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    // TODO Unsupported by Ktor
//    androidNativeArm32()
//    androidNativeArm64()
//    androidNativeX64()
//    androidNativeX86()

    // TODO Unsupported by Ktor (https://github.com/ktorio/ktor/pull/3587)
//    linuxArm64()
    linuxX64()

    iosArm64()
    iosX64()

    iosSimulatorArm64()

    macosArm64()
    macosX64()

    mingwX64()

    tvosArm64()
    tvosX64()

    tvosSimulatorArm64()

    watchosArm32()
    watchosArm64()
    watchosX64()

    // TODO Unsupported by Ktor
//    watchosDeviceArm64()
    watchosSimulatorArm64()
}