/*
 * Copyright 2018-2019 Leon Linhart
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
package com.github.themrmilchmann.build

import org.gradle.api.*
import org.gradle.kotlin.dsl.*

private const val DEPLOYMENT_KEY = "com.github.themrmilchmann.build.Deployment"

val Project.deployment: Deployment
    get() =
        if (extra.has(DEPLOYMENT_KEY)) {
            extra[DEPLOYMENT_KEY] as Deployment
        } else
            (when {
                hasProperty("release") -> Deployment(
                    BuildType.RELEASE,
                    "https://oss.sonatype.org/service/local/staging/deploy/maven2/",
                    getProperty("sonatypeUsername"),
                    getProperty("sonatypePassword")
                )
                hasProperty("snapshot") -> Deployment(
                    BuildType.SNAPSHOT,
                    "https://oss.sonatype.org/content/repositories/snapshots/",
                    getProperty("sonatypeUsername"),
                    getProperty("sonatypePassword")
                )
                else -> Deployment(BuildType.LOCAL, repositories.mavenLocal().url.toString())
            }).also { extra[DEPLOYMENT_KEY] = it }

fun Project.getProperty(k: String): String =
    if (extra.has(k))
        extra[k] as String
    else
        System.getenv(k)