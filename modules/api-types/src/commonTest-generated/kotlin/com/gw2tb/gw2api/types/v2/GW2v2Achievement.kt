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

class GW2v2AchievementTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Achievement>(
            """
            {
                "id": 239,
                "name": "Bezwinger",
                "description": "Leichen pflastern Euren Weg.",
                "requirement": "Besiegt  Spieler im PvP.",
                "locked_text": "",
                "type": "Default",
                "flags": [
                    "Pvp",
                    "Permanent"
                ],
                "tiers": [
                    {
                        "count": 1,
                        "points": 1
                    },
                    {
                        "count": 3,
                        "points": 1
                    },
                    {
                        "count": 5,
                        "points": 1
                    },
                    {
                        "count": 10,
                        "points": 1
                    },
                    {
                        "count": 15,
                        "points": 1
                    },
                    {
                        "count": 20,
                        "points": 1
                    },
                    {
                        "count": 30,
                        "points": 1
                    },
                    {
                        "count": 40,
                        "points": 1
                    },
                    {
                        "count": 50,
                        "points": 1
                    },
                    {
                        "count": 75,
                        "points": 1
                    },
                    {
                        "count": 100,
                        "points": 1
                    },
                    {
                        "count": 125,
                        "points": 1
                    },
                    {
                        "count": 150,
                        "points": 1
                    },
                    {
                        "count": 175,
                        "points": 1
                    },
                    {
                        "count": 200,
                        "points": 1
                    },
                    {
                        "count": 225,
                        "points": 1
                    },
                    {
                        "count": 250,
                        "points": 1
                    },
                    {
                        "count": 300,
                        "points": 1
                    },
                    {
                        "count": 350,
                        "points": 1
                    },
                    {
                        "count": 400,
                        "points": 1
                    },
                    {
                        "count": 450,
                        "points": 1
                    },
                    {
                        "count": 500,
                        "points": 1
                    },
                    {
                        "count": 600,
                        "points": 1
                    },
                    {
                        "count": 700,
                        "points": 1
                    },
                    {
                        "count": 800,
                        "points": 1
                    },
                    {
                        "count": 900,
                        "points": 1
                    },
                    {
                        "count": 1000,
                        "points": 1
                    },
                    {
                        "count": 1100,
                        "points": 1
                    },
                    {
                        "count": 1200,
                        "points": 1
                    },
                    {
                        "count": 1300,
                        "points": 1
                    },
                    {
                        "count": 1400,
                        "points": 1
                    },
                    {
                        "count": 1500,
                        "points": 1
                    },
                    {
                        "count": 1600,
                        "points": 1
                    },
                    {
                        "count": 1700,
                        "points": 1
                    },
                    {
                        "count": 1800,
                        "points": 1
                    },
                    {
                        "count": 1900,
                        "points": 1
                    },
                    {
                        "count": 2000,
                        "points": 5
                    }
                ],
                "rewards": [
                    {
                        "type": "Title",
                        "id": 90
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Achievement>(
            """
            {
                "id": 240,
                "name": "Professioneller Assassine",
                "description": "Jetzt geht's los!",
                "requirement": "Besiegt in Spielen in einer bewerteten Arena  feindlichen Spieler.",
                "locked_text": "",
                "type": "Default",
                "flags": [
                    "Pvp",
                    "Permanent"
                ],
                "tiers": [
                    {
                        "count": 10,
                        "points": 1
                    },
                    {
                        "count": 50,
                        "points": 5
                    },
                    {
                        "count": 100,
                        "points": 10
                    },
                    {
                        "count": 200,
                        "points": 10
                    }
                ],
                "rewards": [
                    {
                        "type": "Title",
                        "id": 91
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Achievement>(
            """
            {
                "id": 241,
                "name": "Eroberer",
                "description": "Mal gewinnt man, mal verliert man, mal gewinnt man mehr.",
                "requirement": "Gewinnt  Match im PvP.",
                "locked_text": "",
                "type": "Default",
                "flags": [
                    "IgnoreNearlyComplete",
                    "Pvp",
                    "Permanent"
                ],
                "tiers": [
                    {
                        "count": 1,
                        "points": 1
                    },
                    {
                        "count": 3,
                        "points": 1
                    },
                    {
                        "count": 5,
                        "points": 1
                    },
                    {
                        "count": 7,
                        "points": 1
                    },
                    {
                        "count": 10,
                        "points": 1
                    },
                    {
                        "count": 12,
                        "points": 1
                    },
                    {
                        "count": 14,
                        "points": 1
                    },
                    {
                        "count": 16,
                        "points": 1
                    },
                    {
                        "count": 18,
                        "points": 1
                    },
                    {
                        "count": 20,
                        "points": 1
                    },
                    {
                        "count": 25,
                        "points": 1
                    },
                    {
                        "count": 30,
                        "points": 1
                    },
                    {
                        "count": 35,
                        "points": 1
                    },
                    {
                        "count": 40,
                        "points": 1
                    },
                    {
                        "count": 45,
                        "points": 1
                    },
                    {
                        "count": 50,
                        "points": 1
                    },
                    {
                        "count": 60,
                        "points": 1
                    },
                    {
                        "count": 70,
                        "points": 1
                    },
                    {
                        "count": 80,
                        "points": 1
                    },
                    {
                        "count": 90,
                        "points": 1
                    },
                    {
                        "count": 100,
                        "points": 1
                    },
                    {
                        "count": 120,
                        "points": 1
                    },
                    {
                        "count": 140,
                        "points": 1
                    },
                    {
                        "count": 160,
                        "points": 1
                    },
                    {
                        "count": 180,
                        "points": 1
                    },
                    {
                        "count": 200,
                        "points": 1
                    },
                    {
                        "count": 225,
                        "points": 1
                    },
                    {
                        "count": 250,
                        "points": 1
                    },
                    {
                        "count": 275,
                        "points": 1
                    },
                    {
                        "count": 300,
                        "points": 1
                    },
                    {
                        "count": 325,
                        "points": 1
                    },
                    {
                        "count": 350,
                        "points": 1
                    },
                    {
                        "count": 375,
                        "points": 1
                    },
                    {
                        "count": 400,
                        "points": 1
                    },
                    {
                        "count": 425,
                        "points": 1
                    },
                    {
                        "count": 450,
                        "points": 1
                    },
                    {
                        "count": 475,
                        "points": 1
                    },
                    {
                        "count": 500,
                        "points": 1
                    },
                    {
                        "count": 1000,
                        "points": 5
                    },
                    {
                        "count": 2000,
                        "points": 5
                    },
                    {
                        "count": 5000,
                        "points": 10
                    },
                    {
                        "count": 10000,
                        "points": 10
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Achievement>(
            """
            {
                "id": 247,
                "name": "Gladiator",
                "description": "Sammelt Erfahrungen, Grünschnabel.",
                "requirement": "Erzielt  Rangpunkte.",
                "locked_text": "",
                "type": "Default",
                "flags": [
                    "IgnoreNearlyComplete",
                    "Pvp",
                    "RepairOnLogin",
                    "Permanent"
                ],
                "tiers": [
                    {
                        "count": 50,
                        "points": 1
                    },
                    {
                        "count": 500,
                        "points": 5
                    },
                    {
                        "count": 1000,
                        "points": 5
                    },
                    {
                        "count": 1500,
                        "points": 5
                    },
                    {
                        "count": 2000,
                        "points": 5
                    },
                    {
                        "count": 2500,
                        "points": 5
                    },
                    {
                        "count": 4000,
                        "points": 5
                    },
                    {
                        "count": 5500,
                        "points": 5
                    },
                    {
                        "count": 7000,
                        "points": 5
                    },
                    {
                        "count": 8500,
                        "points": 5
                    }
                ],
                "rewards": [
                    {
                        "type": "Title",
                        "id": 117
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Achievement>(
            """
            {
                "id": 248,
                "name": "Söldner",
                "description": "Ihr seid jetzt keine Belastung mehr.",
                "requirement": "Erzielt  Rangpunkte.",
                "locked_text": "",
                "type": "Default",
                "flags": [
                    "IgnoreNearlyComplete",
                    "Pvp",
                    "RepairOnLogin",
                    "Permanent"
                ],
                "tiers": [
                    {
                        "count": 12500,
                        "points": 5
                    },
                    {
                        "count": 16500,
                        "points": 5
                    },
                    {
                        "count": 20500,
                        "points": 5
                    },
                    {
                        "count": 24500,
                        "points": 5
                    },
                    {
                        "count": 28500,
                        "points": 5
                    },
                    {
                        "count": 32500,
                        "points": 5
                    },
                    {
                        "count": 36500,
                        "points": 5
                    },
                    {
                        "count": 40500,
                        "points": 5
                    },
                    {
                        "count": 44500,
                        "points": 5
                    },
                    {
                        "count": 48500,
                        "points": 5
                    }
                ],
                "prerequisites": [
                    247
                ],
                "rewards": [
                    {
                        "type": "Title",
                        "id": 118
                    }
                ]
            }
            """.trimIndent()
        )
    }

}