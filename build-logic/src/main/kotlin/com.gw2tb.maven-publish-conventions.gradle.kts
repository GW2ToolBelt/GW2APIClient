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
import com.gw2tb.build.*
import com.gw2tb.build.BuildType

plugins {
    id("com.gw2tb.base-conventions")
    `maven-publish`
    signing
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
    publications.withType<MavenPublication>().configureEach {
        pom {
            name.set(project.name)
            description.set("A library for generating programs that interface with the official Guild Wars 2 API.")
            url.set("https://github.com/GW2ToolBelt/GW2APIClient")

            licenses {
                license {
                    name.set("MIT")
                    url.set("https://github.com/GW2ToolBelt/GW2APIClient/blob/master/LICENSE")
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
                connection.set("scm:git:git://github.com/GW2ToolBelt/GW2APIClient.git")
                developerConnection.set("scm:git:git://github.com/GW2ToolBelt/GW2APIClient.git")
                url.set("https://github.com/GW2ToolBelt/GW2APIClient.git")
            }
        }
    }
}

signing {
    isRequired = (deployment.type === BuildType.RELEASE)
    sign(publishing.publications)
}