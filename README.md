[![License](https://img.shields.io/badge/license-Apache%202.0-yellowgreen.svg?style=flat-square)](https://github.com/TheMrMilchmann/GW2APIClient/blob/master/LICENSE)
[![Build Status](https://img.shields.io/travis/TheMrMilchmann/GW2APIClient.svg?style=flat-square)](https://travis-ci.org/TheMrMilchmann/GW2APIClient)
[![Maven Central](https://img.shields.io/maven-central/v/com.github.themrmilchmann.gw2api/gw2api.svg?style=flat-square&label=maven%20central)](https://maven-badges.herokuapp.com/maven-central/com.github.themrmilchmann.gw2api/gw2api)

# GW2APIClient

> Kotlin multiplatform client for the official Guild Wars 2 API


### Features

| Feature                                        |   JVM   |   JS    | Native  |
|------------------------------------------------|---------|---------|---------|
| Access to all API v2 endpoints                 |    ✔    |    ✔    |    ✘    |
| Thread-safety                                  |    ✔    |   N.A.  |    ✘    |
| Client side permission checks                  |    ✔    |    ✔    |    ✘    |
| Support for Asynchronous calls                 |    ✔    |    ✔    |    ✘    |
| Rate Limit Controller                          |    ✔    |    ✔    |    ✘    |
| Caching                                        |    ✔    |    ✔    |    ✘    |

> Note that GW2APIClient is WIP and this feature table is inaccurate until the initial release `0.1.0`.

N.A.: Not Applicable

Due to the current limitations of Kotlin multiplatform projects, this API is not designed to be used from Java or
Javascript. Using this library from any language other than Kotlin is highly discouraged. If you're are looking for a
pure Javascript solution, using [queicherius' Javascript wrapper](https://github.com/queicherius/gw2api-client) is
recommended.


### Versioning

GW2APIClient is strictly following [SemVer 2.0.0](https://semver.org/spec/v2.0.0.html).

> Given a version number MAJOR.MINOR.PATCH, increment the:
>  
> - MAJOR version when you make incompatible API changes,
> - MINOR version when you add functionality in a backwards-compatible manner, and
> - PATCH version when you make backwards-compatible bug fixes.
>  
>
>  Additional labels for pre-release and build metadata are available as extensions to the MAJOR.MINOR.PATCH format.

Generally, all additions to the official Guild Wars 2 API should be available in the next minor release of GW2APIClient.
Keep in mind, that GW2APIClient's version is currently `0.y.z` which means that the API is still an early draft and may
change (in a breaking manner) without a major release.


## License

#### GW2APIClient

Copyright 2018 Leon Linhart

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

------------------------------------------------------------------------------------------------------------------------

#### Guild Wars 2

©2010–2018 ArenaNet, LLC. All rights reserved. Guild Wars, Guild Wars 2, Heart of Thorns, Guild Wars 2: Path of Fire,
ArenaNet, NCSOFT, the Interlocking NC Logo, and all associated logos and designs are trademarks or registered trademarks
of NCSOFT Corporation. All other trademarks are the property of their respective owners.