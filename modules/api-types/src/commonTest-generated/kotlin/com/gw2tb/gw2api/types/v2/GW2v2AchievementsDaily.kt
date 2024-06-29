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

class GW2v2AchievementsDailyTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2AchievementsDaily>(
            """
            {
                "pve": [
                    {
                        "id": 1974,
                        "level": {
                            "min": 70,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 1973,
                        "level": {
                            "min": 1,
                            "max": 69
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 1931,
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
                        "id": 1956,
                        "level": {
                            "min": 15,
                            "max": 80
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 1953,
                        "level": {
                            "min": 11,
                            "max": 14
                        },
                        "required_access": [
                            "GuildWars2",
                            "HeartOfThorns",
                            "PathOfFire"
                        ]
                    },
                    {
                        "id": 1989,
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
                        "id": 2817,
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
                        "id": 1857,
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
                        "id": 1848,
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
                        "id": 1852,
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
                        "id": 1843,
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
                        "id": 1845,
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
                        "id": 2327,
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
                        "id": 2592,
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
                        "id": 3238,
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
                        "id": 2978,
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
                        "id": 2899,
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
                        "id": 2962,
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
                        "id": 2932,
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
                        "id": 5447,
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
                        "id": 5449,
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
                        "id": 5437,
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
                        "id": 5446,
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
                        "id": 4244,
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
                        "id": 4218,
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
                        "id": 4210,
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
                        "id": 4224,
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