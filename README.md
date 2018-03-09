[![License](https://img.shields.io/badge/license-Apache%202.0-yellowgreen.svg?style=flat-square)](https://github.com/TheMrMilchmann/GW2APIClient/blob/master/LICENSE)
[![Build Status](https://img.shields.io/travis/TheMrMilchmann/GW2APIClient.svg?style=flat-square)](https://travis-ci.org/TheMrMilchmann/GW2APIClient)
[![Coverage Status](https://img.shields.io/codecov/c/github/TheMrMilchmann/GW2APIClient/master.svg?style=flat-square)](https://codecov.io/github/TheMrMilchmann/GW2APIClient)
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

N.A.: Not Applicable

Due to the current limitations of Kotlin multiplatform projects, this API is not designed to be used from Java or
Javascript. Using this library from any language other than Kotlin is highly discouraged. If you're are looking for a
pure Javascript solution, using [queicherius' Javascript wrapper](https://github.com/queicherius/gw2api-client) is
recommended.

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

© 2015 ArenaNet, LLC. All rights reserved. NCSOFT, the interlocking NC logo, ArenaNet, Guild Wars, Guild Wars Factions,
Guild Wars Nightfall, Guild Wars: Eye of the North, Guild Wars 2, Heart of Thorns, and all associated logos and designs
are trademarks or registered trademarks of NCSOFT Corporation. All other trademarks are the property of their respective
owners.