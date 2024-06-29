/*
 * Copyright (c) 2018-2024 Leon Linhart
 * MACHINE GENERATED FILE, DO NOT EDIT
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.gw2tb.gw2api.types.v2

import kotlin.test.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*

class GW2v2AchievementsDailyTomorrowTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2AchievementsDailyTomorrow>(
            """
            {
                "pve": [
                    {
                        "id": 3888,
                        "level": {
                            "min": 80,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 1978,
                        "level": {
                            "min": 80,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 1984,
                        "level": {
                            "min": 1,
                            "max": 79
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 500,
                        "level": {
                            "min": 11,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 1963,
                        "level": {
                            "min": 11,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 1914,
                        "level": {
                            "min": 31,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    }
                ],
                "pvp": [
                    {
                        "id": 1856,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 2816,
                        "level": {
                            "min": 11,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 3450,
                        "level": {
                            "min": 11,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 3449,
                        "level": {
                            "min": 31,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    }
                ],
                "wvw": [
                    {
                        "id": 1852,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 946,
                        "level": {
                            "min": 11,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 1851,
                        "level": {
                            "min": 11,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 1850,
                        "level": {
                            "min": 31,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    }
                ],
                "fractals": [
                    {
                        "id": 2492,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 2377,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 3184,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 3229,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 3196,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 3175,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 3177,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 2916,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 2949,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 2918,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 2952,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 2954,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 2971,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 2986,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 2923,
                        "level": {
                            "min": 1,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    }
                ],
                "special": []
            }
            """.trimIndent()
        )
    }

}