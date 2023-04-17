import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

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

    /* Not supported by (kotlinx.serialization, Ktor) */
//    androidNativeArm64()
//    androidNativeX64()

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

    /* Not supported by Ktor */
//    linuxArm64()
    linuxX64()

    ios()
    watchos()
    tvos()

    macosX64()
    macosArm64()

    mingwX64()
}