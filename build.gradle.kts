/*
 * Copyright (c) 2018-2025 Leon Linhart
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

plugins {
    alias(buildDeps.plugins.dokka)
    alias(buildDeps.plugins.dokka.javadoc) apply false
    alias(buildDeps.plugins.kotlin.jvm) apply false
    alias(buildDeps.plugins.kotlin.multiplatform) apply false
    id("com.gw2tb.base-conventions") // Required by the Kotlin Multiplatform plugin to download native tools
    id("com.gw2tb.gw2api.generator")
}

dokka {
    dokkaGeneratorIsolation = ProcessIsolation {
        maxHeapSize = "4G"
    }

    dokkaSourceSets.configureEach sourceSet@{
        reportUndocumented = true
        skipEmptyPackages = true
        jdkVersion = 11

        val localKotlinSourceDir = layout.projectDirectory.dir("src/$name/kotlin")
        val version = project.version

        sourceLink {
            localDirectory = localKotlinSourceDir

            remoteUrl("https://github.com/GW2ToolBelt/GW2APIClient/tree/v${version}/src/${this@sourceSet.name}/kotlin")
            remoteLineSuffix = "#L"
        }
    }

    dokkaPublications.configureEach {
        moduleName = "GW2APIClient"

        // TODO Remaining warnings are silly atm. Reevaluate this flag in the future.
//        failOnWarning = true
    }
}

tasks {
    register<Generate>("generate") {
        schemaVersion = SchemaVersion.V2_SCHEMA_2024_07_20T01_00_00_000Z

        licenseHeader = file("docs/LICENSE_HEADER_GEN").readText()

        queriesDirectory = file("modules/api-client/src/commonMain-generated/kotlin")
        queriesTestDirectory = file("modules/api-client/src/commonTest-generated/kotlin")

        typesDirectory = file("modules/api-types/src/commonMain-generated/kotlin")
        typesTestDirectory = file("modules/api-types/src/commonTest-generated/kotlin")
    }

    dokkaGeneratePublicationHtml {
        outputDirectory = layout.projectDirectory.dir("docs/site/api")
    }
}

dependencies {
    dokka(projects.apiClient)
    dokka(projects.apiClientJdk11)
    dokka(projects.apiClientKtor)
    dokka(projects.apiTypes)
}