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