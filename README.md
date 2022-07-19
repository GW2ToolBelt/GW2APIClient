# GW2APIClient

[![License](https://img.shields.io/badge/license-MIT-green.svg?style=flat-square&label=License)](https://github.com/GW2ToolBelt/GW2APIClient/blob/master/LICENSE)
[![Maven Central](https://img.shields.io/maven-central/v/com.gw2tb.gw2api/api-client.svg?style=flat-square&label=Maven%20Central)](https://maven-badges.herokuapp.com/maven-central/com.gw2tb.gw2api/api-client)
[![JavaDoc](https://img.shields.io/maven-central/v/com.gw2tb.gw2api/api-client.svg?style=flat-square&label=JavaDoc&color=blue)](https://javadoc.io/doc/com.gw2tb.gw2api/api-client)
![Kotlin](https://img.shields.io/badge/Kotlin-1%2E7-green.svg?style=flat-square&color=a97bff&logo=Kotlin)
![Java](https://img.shields.io/badge/Java-11-green.svg?style=flat-square&color=b07219&logo=Java)

**GW2APIClient** is a cross-platform client for the official Guild Wars 2 API.
By leveraging [Kotlin Multiplatform](https://kotlinlang.org/docs/reference/multiplatform.html),
GW2APIClient can be used on a large variety of platforms (including Android, the
JVM, and JS) and interoperates seamlessly with various popular programming
languages.

GW2APIClient provides low-level access to the data provided by Guild Wars 2's
API. It does not provide higher-level abstractions, visualizations or analytical
functionality but may be used to build such tools.

The [api-generator](https://github.com/GW2Toolbelt/api-generator) is used to
generate the types and endpoint definitions for this library. Head over to its
repository to learn more about Guild Wars 2's API.


## Getting Started

GW2APIClient consists of two primary modules:


### API Types

The `api-types` module provides type-safe definitions for the objects returned
by the Guild Wars 2 API. [kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization)
is used for built-in support for serialization from and to JSON.


### API Client

The `api-client` module provides definitions for the endpoints available as part
of the Guild Wars 2 API.

The following example retrieves the first 1000 items listed in `/v2/items` in
parallel and prints their ids and names:

```kotlin
suspend fun main() = coroutineScope {
    val client = GW2APIClient(/* JDKHttpClientImpl() or KtorHttpClientImpl() */)
    val itemIds = client.gw2v2ItemsIDs().execute(this).get().data ?: error("Request failed.")

    val items = itemIds.take(1000).chunked(200).map { ids ->
        async {
            client.gw2v2ItemsByIDs(ids).execute(this).get().data ?: error("Request failed.")
        }
    }.awaitAll().flatten()

    for (item in items) {
        println("[${item.id}] ${item.name}")
    }
}
```

The `api-client-{jdk11|ktor}` modules provide implementations using Java 11's
HttpClient or Ktor's HttpClient respectively.


## Supported Platforms

The library is written in platform-independent Kotlin code and can be used on
Android, JavaScript and the JVM and native targets. Currently, prebuilt binaries
are only available for the JVM (and Android) and JS.


## Building from source

### Setup

This project uses [Gradle's toolchain support](https://docs.gradle.org/7.5/userguide/toolchains.html)
to detect and select the JDKs required to run the build. Please refer to the
build scripts to find out which toolchains are requested.

An installed JDK 1.8 (or later) is required to use Gradle.

### Building

Once the setup is complete, invoke the respective Gradle tasks using the
following command on Unix/macOS:

    ./gradlew <tasks>
    
or the following command on Windows:

    gradlew <tasks>
    
Important Gradle tasks to remember are:
- `clean`                   - clean build results
- `build`                   - assemble and test the Java library
- `publishToMavenLocal`     - build and install all public artifacts to the
                              local maven repository

Additionally `tasks` may be used to print a list of all available tasks.


## License

#### GW2APIClient

```
Copyright (c) 2018-2022 Leon Linhart

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

--------------------------------------------------------------------------------

#### Guild Wars 2

> ©2010–2018 ArenaNet, LLC. All rights reserved. Guild Wars, Guild Wars 2, Heart
of Thorns, Guild Wars 2: Path of Fire, ArenaNet, NCSOFT, the Interlocking NC
Logo, and all associated logos and designs are trademarks or registered
trademarks of NCSOFT Corporation. All other trademarks are the property of their
respective owners.

As taken from [Guild Wars 2 Content Terms of Use](https://www.guildwars2.com/en/legal/guild-wars-2-content-terms-of-use/)
on 2019-09-09 17:31 CET.