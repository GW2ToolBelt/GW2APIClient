### 0.5.0

_Released 2024 Jul 22_

#### Overview

This release is a long overdue major update to the project. The entire API
surface has been touched up and improved to provide a better developer
experience.

The most significant change is the decoupling of request creation from request
execution:

```kotlin
// Old
suspend fun main() {
  val client = GW2APIClient(...)
  val requestBuilder = client.gw2v2Build()

  val request = coroutineScope { requestBuilder.execute(this) }
  val response = request.get()

  val gw2v2Build = response.data.getOrNull() ?: error("Could not decode request")

  println("Build ID: ${gw2v2Build.id}")
}
```

Whereas the old way to create request contained a lot of ceremony to support
asynchronous and synchronous execution at the same time, the new way is much
more straightforward:

```kotlin
// New
suspend fun main() {
  val client = Gw2ApiClient()
  val gw2v2Build = client.executeAsync(gw2v2Build()).dataOrNull ?: error("Failed to fetch build ID.")

  println("Build ID: {$gw2v2Build.id}")
}
```

There is no full migration guide available. Please refer to the updated
documentation for more information.

#### Improvements

- Added an explicit Java module descriptor for `api-types`.
- Added a simple API to allow blocking execution of requests on the JVM.
  - This is especially useful in combination with virtual threads.
- Replaced placeholder exception that is thrown when an unknown type is
  encountered with a `SerializationException`.
- Migrated to schema version `2022-03-23T19:00:00.000Z`.

#### Breaking Changes

- Migrated to schema version `2022-03-23T19:00:00.000Z`.
- The entire API client has been rewritten to decouple request creation from
  execution. Please see the updated documentation for more information.


---

### 0.4.0

_Released 2022 Jul 27_

#### Improvements

- Updated to [api-generator](https://github.com/GW2ToolBelt/api-generator) to [0.6.0](https://github.com/GW2ToolBelt/api-generator/releases/tag/v0.6.0).
- Cleaned up caching.
    - Renamed `CacheAccessor` to `CacheAccess`.
    - Cache time overwrites were removed for now.
- Cleaned up the `RateLimiter` interface and related hooks.
    - A default `TokenBucketRateLimiter` implementation is now available.
    - API clients are now configured to use a rate limiter by default.
- Introduced the `DecodingResult` abstraction to improve error-handling
  capabilities for malformed data from the API.
- Introduced the `ResponseHeaders` abstraction that wraps headers of a
  `Response` and provides utilities.
- Improved documentation throughout the entire library.

#### Breaking Changes

- All modules now require Kotlin 1.7
- JVM modules now require Java 11
- The library was significantly reworked and many things were either renamed or
  relocated. Detailed migration guidelines are not available for this release.


---

### 0.3.0

_Released 2021 Jul 14_

#### Improvements

- Updated to [api-generator](https://github.com/GW2ToolBelt/api-generator) to [0.4.0](https://github.com/GW2ToolBelt/api-generator/releases/tag/v0.4.0).
- `Result` is now used to catch exceptions during deserialization.


---

### 0.2.0

_Released 2021 Jan 25_

#### Improvements

- Updated to [api-generator](https://github.com/GW2ToolBelt/api-generator) to [0.3.0](https://github.com/GW2ToolBelt/api-generator/releases/tag/v0.3.0).


---

### 0.1.0

_Released 2020 Dec 24_

#### Overview

**GW2APIClient** is a cross-platform client for the official Guild Wars 2 API.
By leveraging [Kotlin Multiplatform](https://kotlinlang.org/docs/reference/multiplatform.html),
GW2APIClient can be used on a large variety of platforms (including Android, the
JVM, and JS) and interoperates seamlessly with various popular programming
languages.

GW2APIClient provides low-level access to the data provided by Guild Wars 2's
API. It does not provide higher-level abstractions, visualizations or analytical
functionality but may be used to build such tools.