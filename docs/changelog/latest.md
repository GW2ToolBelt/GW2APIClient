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