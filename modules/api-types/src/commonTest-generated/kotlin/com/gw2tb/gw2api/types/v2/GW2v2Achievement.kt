/*
 * Copyright (c) 2018-2026 Leon Linhart
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
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2Achievement>(
            """
            {
                "id": 2190,
                "name": "Ley-Stein-Rüstung",
                "description": "",
                "requirement": "Schaltet alle  Skins für Ley-Stein-Rüstungen in Eurer Garderobe frei.",
                "locked_text": "",
                "type": "ItemSet",
                "flags": [
                    "IgnoreNearlyComplete",
                    "Pvp",
                    "RepairOnLogin",
                    "Permanent"
                ],
                "bits": [
                    {
                        "type": "Skin",
                        "id": 6420
                    },
                    {
                        "type": "Skin",
                        "id": 6185
                    },
                    {
                        "type": "Skin",
                        "id": 6426
                    },
                    {
                        "type": "Skin",
                        "id": 6248
                    },
                    {
                        "type": "Skin",
                        "id": 6241
                    },
                    {
                        "type": "Skin",
                        "id": 6151
                    },
                    {
                        "type": "Skin",
                        "id": 6315
                    },
                    {
                        "type": "Skin",
                        "id": 6433
                    },
                    {
                        "type": "Skin",
                        "id": 6308
                    },
                    {
                        "type": "Skin",
                        "id": 6339
                    },
                    {
                        "type": "Skin",
                        "id": 6436
                    },
                    {
                        "type": "Skin",
                        "id": 6332
                    },
                    {
                        "type": "Skin",
                        "id": 6148
                    },
                    {
                        "type": "Skin",
                        "id": 6154
                    },
                    {
                        "type": "Skin",
                        "id": 6232
                    },
                    {
                        "type": "Skin",
                        "id": 6317
                    },
                    {
                        "type": "Skin",
                        "id": 6146
                    },
                    {
                        "type": "Skin",
                        "id": 6354
                    }
                ],
                "tiers": [
                    {
                        "count": 6,
                        "points": 1
                    },
                    {
                        "count": 12,
                        "points": 1
                    },
                    {
                        "count": 18,
                        "points": 3
                    }
                ],
                "rewards": [
                    {
                        "type": "Item",
                        "id": 49208,
                        "count": 1
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2Achievement>(
            """
            {
                "id": 8745,
                "name": "Mini Collection—Janthir Wilds",
                "description": "Fuzzy felines, bees, and bearkin!",
                "requirement": "Collect  minis.",
                "locked_text": "",
                "type": "ItemSet",
                "flags": [
                    "IgnoreNearlyComplete",
                    "Pvp",
                    "RepairOnLogin",
                    "Permanent"
                ],
                "bits": [
                    {
                        "type": "Minipet",
                        "id": 931,
                        "text": "Complete the achievement Gettin' the Crew Together."
                    },
                    {
                        "type": "Minipet",
                        "id": 955,
                        "text": "Drops from the event Defeat the Bog Queen before she floods the area with maggots, or can be purchased from the Trading Post or Gharr Leadclaw in Lowland Shore."
                    },
                    {
                        "type": "Minipet",
                        "id": 956,
                        "text": "Drops from Convergence: Mount Balrior, or can be purchased from the Trading Post."
                    },
                    {
                        "type": "Minipet",
                        "id": 950,
                        "text": "Drops from Convergence: Mount Balrior, or can be purchased from the Trading Post."
                    },
                    {
                        "type": "Minipet",
                        "id": 932,
                        "text": "Complete the story step Strangers among Lands."
                    },
                    {
                        "type": "Minipet",
                        "id": 949,
                        "text": "Drops from Convergence: Mount Balrior, or can be purchased from the Trading Post."
                    },
                    {
                        "type": "Minipet",
                        "id": 947,
                        "text": "Drops from Convergence: Mount Balrior, or can be purchased from the Trading Post."
                    },
                    {
                        "type": "Minipet",
                        "id": 948,
                        "text": "Drops from Convergence: Mount Balrior, or can be purchased from the Trading Post."
                    },
                    {
                        "type": "Minipet",
                        "id": 952,
                        "text": "Drops from Convergence: Mount Balrior, or can be purchased from the Trading Post."
                    },
                    {
                        "type": "Minipet",
                        "id": 935,
                        "text": "Purchased from Vast Caldera in Coursing Upland in Lowland Shore."
                    },
                    {
                        "type": "Minipet",
                        "id": 926,
                        "text": "Complete the achievement Autumn's Vale Renown Mastery."
                    },
                    {
                        "type": "Minipet",
                        "id": 928,
                        "text": "Purchased from Arid Esker in Echoing Hills in Janthir Syntri."
                    },
                    {
                        "type": "Minipet",
                        "id": 927,
                        "text": "Purchased from Whispers of Wind in Festering Basin in Janthir Syntri."
                    },
                    {
                        "type": "Minipet",
                        "id": 929,
                        "text": "Complete the achievement Forager's Hunt Renown Mastery."
                    },
                    {
                        "type": "Minipet",
                        "id": 930,
                        "text": "Purchased from Guiding Breath in Harvest Den in Lowland Shore."
                    },
                    {
                        "type": "Minipet",
                        "id": 934,
                        "text": "Drops from the Bloodstone Corridor survey lane in Mistburned Barrens, or can be purchased from the renown heart vendor."
                    },
                    {
                        "type": "Minipet",
                        "id": 960,
                        "text": "Drops from Wraith's Pass survey lane in Mistburned Barrens, or can be purchased from the renown heart vendor."
                    },
                    {
                        "type": "Minipet",
                        "id": 959,
                        "text": "Complete the achievement Scouring the Archive."
                    },
                    {
                        "type": "Minipet",
                        "id": 961,
                        "text": "Purchased from the renown heart vendor in Mistburned Barrens."
                    },
                    {
                        "type": "Minipet",
                        "id": 965,
                        "text": "Drops from the A Titanic Voyage meta-event in Bava Nisos or can be purchased from the Trading Post."
                    },
                    {
                        "type": "Minipet",
                        "id": 970,
                        "text": "Drops from the A Titanic Voyage meta-event in Bava Nisos or can be purchased from the Trading Post."
                    },
                    {
                        "type": "Minipet",
                        "id": 969,
                        "text": "Drops from the A Titanic Voyage meta-event in Bava Nisos or can be purchased from the Trading Post."
                    },
                    {
                        "type": "Minipet",
                        "id": 966,
                        "text": "Drops from the A Titanic Voyage meta-event in Bava Nisos or can be purchased from the Trading Post."
                    },
                    {
                        "type": "Minipet",
                        "id": 964,
                        "text": "Complete the achievement Titan Terminus by completing Convergence: Mount Balrior with gold timing on all encounters."
                    },
                    {
                        "type": "Minipet",
                        "id": 967,
                        "text": "Complete the achievement Mastery of Masteries: Janthir Wilds."
                    },
                    {
                        "type": "Minipet",
                        "id": 963,
                        "text": "Purchased from Ward Trader Sampaguita in Mantle's Arrival in Bava Nisos."
                    }
                ],
                "tiers": [
                    {
                        "count": 6,
                        "points": 7
                    },
                    {
                        "count": 12,
                        "points": 7
                    },
                    {
                        "count": 18,
                        "points": 7
                    },
                    {
                        "count": 25,
                        "points": 9
                    },
                    {
                        "count": 26,
                        "points": 0
                    }
                ],
                "rewards": [
                    {
                        "type": "Title",
                        "id": 583
                    }
                ]
            }
            """.trimIndent()
        )
    }

}