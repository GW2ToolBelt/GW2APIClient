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