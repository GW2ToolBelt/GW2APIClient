### 0.8.0

_Released 2024 Nov 12_

#### Overview

This release was specifically crafted to address a critical bug in the Guild
Wars 2 API which caused header-based authorization to fail. Thus, this release
introduces a mechanism to configure how requests are authenticated:

- `AuthenticationStrategy.HEADER` will remain the default authentication
  strategy and is recommended for most use cases.
- `AuthenticationStrategy.QUERY` is a new authentication strategy that appends
  the API key as a query parameter to the request URL. This strategy is
  considered unsafe outside of server environments. Use with caution.

#### Improvements

- It is now possible to configure how requests are authenticated by configuring
  the `AuthenticationStrategy` for a client.