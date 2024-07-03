# GW2APIClient

[![License](https://img.shields.io/badge/license-MIT-green.svg?style=for-the-badge&label=License)](https://github.com/GW2Toolbelt/GW2APIClient/blob/master/LICENSE)
[![Maven Central](https://img.shields.io/maven-central/v/com.gw2tb.gw2api/api-client.svg?style=for-the-badge&label=Maven%20Central)](https://maven-badges.herokuapp.com/maven-central/com.gw2tb.gw2api/api-client)
[![Documentation](https://img.shields.io/maven-central/v/com.gw2tb.gw2api/api-client.svg?style=for-the-badge&label=Documentation&color=blue)](https://gw2toolbelt.github.io/GW2APIClient)
![Kotlin](https://img.shields.io/badge/Kotlin-2%2E0-green.svg?style=for-the-badge&color=a97bff&logo=Kotlin)
![Java](https://img.shields.io/badge/Java-11-green.svg?style=for-the-badge&color=b07219&logo=Java)

A Kotlin Multiplatform library for working with the official [Guild Wars 2](https://www.guildwars2.com)
API.

The core library is fully written in common Kotlin code. Prebuilt binaries are
available for JVM (Java 11 or later), JS, Wasm, and several native targets.[^1]

[^1]: We aim to provide prebuilt libraries for all native targets supported by
Ktor. Despite that, some targets may be missing as target support may change
over time. In case something is missing, please make sure to let us know.


## Usage

GW2APIClient provides low-level access to the data provided by Guild Wars 2's
API. It does not provide higher-level abstractions, visualizations or analytical
functionality but may be used to build such tools.

GW2APIClient consists of two primary modules:


### API Types

The `api-types` module provides type-safe definitions for the objects returned
by the Guild Wars 2 API. [kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization)
is used for built-in support for serialization from and to JSON.

A type definition for the `identity` field exposed by the MumbleLink mechanism
is also available. Check out [GW2ML](https://github.com/GW2ToolBelt/GW2ML) for
reading MumbleLink data.


### API Client

The `api-client` module provides definitions for the endpoints available as part
of the Guild Wars 2 API.

#### Getting Started

To get started with the API client, it is necessary to also pick an
implementation module:

  - `api-client-jdk11` contains an implementation using Java's `HttpClient`.
  - `api-client-ktor` contains an implementation using [Ktor](https://ktor.io).

Once the implementation module is chosen, the API client can be built using the
functions exposed by `JdkGw2ApiClientFactory` or `KtorGw2ApiClientFactory`
respectively:

```kotlin
val client = Gw2ApiClient()
```

#### Implementing Caching

To configure an API client to use a cache, a `CacheAccess` implementation can be
provided when building an API client:

```kotlin
val client = buildGw2ApiClient {
    cacheAccess = MyCacheAccess()
}
```

This library does not provide a cache implementation. Thus, by default no
caching is configured.


#### Configuring Rate Limiting

To configure an API client to perform client-side rate limiting, a `RateLimiter`
can be provided when building an API client:

```kotlin
val client = buildGw2ApiClient {
    rateLimiter = MyRateLimiter()
}
```

By default, API clients are configured to use a `TokenBucketRateLimiter` with a
bucket size of 300 and a refill duration of 1 minute. This configuration roughly
matches the rate limiting behavior of the official API and should prevent
requests from running into rate limits.

However, as the same rate limit applies to all clients on a single IP address,
it may be desirable to adjust the rate limiter to match the specific use case.


#### Configuring Requests

Endpoints may return localized data. For example, the `/v2/items` endpoint may
return item names in different languages. By default, all requests will return
English information. To request localized data for a different language, the
`RequestCustomizer` may be used:

```kotlin
val request = gw2v2ItemsByPage(page = 0, pageSize = 10) {
    language = Language.GERMAN
}
```

Similarly, some endpoints require authentication and an API key has to be
provided:

```kotlin
val request = gw2v2Account() {
    apiKey = "..."
}
```

It is also possible to apply a default configuration to all requests executed by
an API client:

```kotlin
val client = buildGw2ApiClient {
    configureRequests {
        apiKey = "..."
        language = Language.GERMAN
    }
}
```

## Example

### Retrieving the Build ID

The following example demonstrates how to execute a request against the
Guild Wars API to retrieve the current build ID:

```kotlin
suspend fun main() {
    val client = Gw2ApiClient()
    val buildId = client.executeAsync(gw2v2Build()).dataOrNull?.id ?: error("Failed to fetch build ID.")
    
    println("Build ID: ${buildId}")    
}
```

### Retrieving Items

The following example demonstrates one possible way to retrieve multiple items.
First, the IDs of all items are fetched. Those IDs are then chunked into groups
of up to 200 IDs each (as this is the maximum number of items that can be
fetched in one call). Next, requests to fetch the first 10 chunks are started
asynchronously. Finally, the results are combined and printed to the console:

```kotlin
suspend fun main() {
    val client = Gw2ApiClient()
    val itemIds = client.executeAsync(gw2v2ItemsIds()).dataOrNull ?: error("Failed to fetch item IDs.")

    val items = coroutineScope {
        itemIds
            .chunked(size = 200)
            .take(10)
            .map { ids ->
                async { client.executeAsync(gw2v2ItemsByIds(ids)).dataOrNull }
            }
            .awaitAll()
            .filterNotNull()
            .flatten()
    }

    for (item in items) {
        println("[${item.id}] ${item.name}")
    }
}
```


## Supported platforms

The following [targets](https://kotlinlang.org/docs/multiplatform-dsl-reference.html#targets) are supported by this
library:

| Target platform                          | Target preset                                                         |
|------------------------------------------|-----------------------------------------------------------------------|
| Kotlin/JVM (can also be used on Android) | `jvm`                                                                 |
| Kotlin/JS                                | `js`                                                                  |
| iOS                                      | `iosArm64`, `iosX64`, `iosSimulatorArm64`                             |
| watchOS                                  | `watchosArm32`, `watchosArm64`, `watchosX64`, `watchosSimulatorArm64` |
| tvOS                                     | `tvosArm64`, `tvosX64`, `tvosSimulatorArm64`                          |
| macOS                                    | `macosArm64`, `macosX64`                                              |
| Linux                                    | `linuxArm64`, `linuxX64`                                              |
| Windows                                  | `mingwX64`                                                            |


## Building from source

### Setup

This project uses [Gradle's toolchain support](https://docs.gradle.org/8.8/userguide/toolchains.html)
to detect and select the JDKs required to run the build. Please refer to the
build scripts to find out which toolchains are requested.

An installed JDK 1.8 (or later) is required to use Gradle.

## Generating Endpoints

The [api-generator](https://github.com/GW2Toolbelt/api-generator) is used to
generate the types and endpoint definitions for this library. Head over to its
repository to learn more about Guild Wars 2's API.

### Building

Once the setup is complete, invoke the respective Gradle tasks using the
following command on Unix/macOS:

    ./gradlew <tasks>
    
or the following command on Windows:

    gradlew <tasks>
    
Important Gradle tasks to remember are:
- `clean`                   - clean build results
- `build`                   - assemble and test the project
- `publishToMavenLocal`     - build and install all public artifacts to the
                              local maven repository

Additionally `tasks` may be used to print a list of all available tasks.


## License

#### GW2APIClient

```
Copyright (c) 2018-2024 Leon Linhart

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

> © ArenaNet LLC. All rights reserved. NCSOFT, ArenaNet, Guild Wars, Guild
> Wars 2, GW2, Guild Wars 2: Heart of Thorns, Guild Wars 2: Path of Fire, Guild
> Wars 2: End of Dragons, and Guild Wars 2: Secrets of the Obscure and all
> associated logos, designs, and composite marks are trademarks or registered
> trademarks of NCSOFT Corporation.

As taken from [Guild Wars 2 Content Terms of Use](https://www.guildwars2.com/en/legal/guild-wars-2-content-terms-of-use/)
on 2024-01-23 00:57 CET.