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
import com.gw2tb.apigen.model.v2.*
import com.gw2tb.gw2api.generator.tasks.Generate
import com.gw2tb.gw2apiclient.build.*
import com.gw2tb.gw2apiclient.build.BuildType
import org.jetbrains.dokka.gradle.AbstractDokkaLeafTask
import org.jetbrains.dokka.gradle.AbstractDokkaTask
import org.jetbrains.dokka.gradle.DokkaMultiModuleTask
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.targets.js.yarn.yarn
import java.net.URL

plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.dokka)
    id("com.gw2tb.gw2api.generator")
}

yarn.lockFileName = "kotlin-yarn.lock"
yarn.lockFileDirectory = rootDir

allprojects {
    val nextVersion = "0.5.0"

    group = "com.gw2tb.gw2api"
    version = when (deployment.type) {
        BuildType.SNAPSHOT -> "$nextVersion-SNAPSHOT"
        else -> nextVersion
    }

    repositories {
        mavenCentral()
    }
}

subprojects {
    tasks.withType<AbstractDokkaLeafTask>().configureEach {
        dependsOn(project(":").tasks["generate"])

        dokkaSourceSets.configureEach sourceSet@{
            reportUndocumented.set(true)
            skipEmptyPackages.set(true)
            jdkVersion.set(11)

            val sourceDir = project.file("src/${this@sourceSet.name}/kotlin")
            if (sourceDir.isDirectory) {
                sourceLink {
                    localDirectory.set(sourceDir)
                    remoteUrl.set(URL("https://github.com/GW2ToolBelt/GW2APIClient/blob/master/modules/${project.name}/src/${this@sourceSet.name}/kotlin"))
                    remoteLineSuffix.set("#L")
                }
            }
        }
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

    withType<DokkaMultiModuleTask> {
        outputDirectory.set(layout.buildDirectory.dir("mkdocs/sources/api").map { it.asFile })
        failOnWarning.set(true)
    }
}