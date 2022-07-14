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
import com.gw2tb.apigen.model.v2.*
import com.gw2tb.gw2api.generator.tasks.Generate
import com.gw2tb.gw2apiclient.build.*
import com.gw2tb.gw2apiclient.build.BuildType
import org.jetbrains.kotlin.gradle.targets.js.yarn.yarn

plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
    id("com.gw2tb.gw2api.generator")
}

yarn.lockFileName = "kotlin-yarn.lock"
yarn.lockFileDirectory = rootDir

allprojects {
    val nextVersion = "0.4.0"

    group = "com.gw2tb.gw2api"
    version = when (deployment.type) {
        BuildType.SNAPSHOT -> "$nextVersion-SNAPSHOT"
        else -> nextVersion
    }

    repositories {
        mavenCentral()
    }
}

tasks {
    create<Generate>("generate") {
        schemaVersion.set(V2SchemaVersion.V2_SCHEMA_2022_03_09T02_00_00_000Z)

        licenseHeader.set(file("docs/LICENSE_HEADER_GEN").readText())

        queriesDirectory.set(file("modules/api-client/src/commonMain-generated/kotlin"))
        queriesTestDirectory.set(file("modules/api-client/src/commonTest-generated/kotlin"))

        typesDirectory.set(file("modules/api-types/src/commonMain-generated/kotlin"))
        typesTestDirectory.set(file("modules/api-types/src/commonTest-generated/kotlin"))
    }
}