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

class GW2v2WvwAbilityTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2WvwAbility>(
            """
            {
                "id": 2,
                "name": "Wachenschinder",
                "description": "Erhöht den Schaden an feindlichen Wachen",
                "icon": "https://render.guildwars2.com/file/C5E6E906927E2C6311036C11F1306CCF57CBF259/544537.png",
                "ranks": [
                    {
                        "cost": 1,
                        "effect": "4 % Schaden an Wachen"
                    },
                    {
                        "cost": 3,
                        "effect": "8 % Schaden (gesamt) an Wachen"
                    },
                    {
                        "cost": 6,
                        "effect": "12 % Schaden (gesamt) an Wachen"
                    },
                    {
                        "cost": 10,
                        "effect": "16 % Schaden (gesamt) an Wachen. Alle Wachenschinder-Boni wirken nun auch bei gegnerischen Herren und Aufsehern."
                    },
                    {
                        "cost": 15,
                        "effect": "20 % Schaden (gesamt) an Wachen, Herren und Aufsehern. Erhaltet 50 % Eurer Ausdauer zurück, wenn Ihr Wachen, Herren oder Aufseher tötet."
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2WvwAbility>(
            """
            {
                "id": 3,
                "name": "Verteidigung gegen Wachen",
                "description": "Verringert den Schaden, den Euch feindliche Wachen zufügen",
                "icon": "https://render.guildwars2.com/file/0C450AE1344F410E08D0E4A851F0EFD77210D615/544541.png",
                "ranks": [
                    {
                        "cost": 1,
                        "effect": "4 % weniger Schaden durch Wachen"
                    },
                    {
                        "cost": 3,
                        "effect": "8 % weniger Schaden (gesamt) durch Wachen"
                    },
                    {
                        "cost": 6,
                        "effect": "12 % weniger Schaden (gesamt) durch Wachen"
                    },
                    {
                        "cost": 10,
                        "effect": "16 % weniger Schaden (gesamt) durch Wachen. Alle Verteidigung gegen Wachen-Boni wirken bei Herren und Aufsehern."
                    },
                    {
                        "cost": 15,
                        "effect": "20 % weniger Schaden (gesamt) durch Wachen, Herren und Aufseher. Erhaltet für 10 Sekunden Vergeltung, wenn Ihr Schaden durch Wachen, Herren oder Aufseher erleidet. Dieser Effekt wird einmal alle 20 Sekunden ausgelöst."
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2WvwAbility>(
            """
            {
                "id": 4,
                "name": "Schrecken der Söldner",
                "description": "Erhöht den Schaden an und verringert den Schaden von Söldnern",
                "icon": "https://render.guildwars2.com/file/33E377E353512ACD4AB52F4DEFA41B58EF73A92D/544538.png",
                "ranks": [
                    {
                        "cost": 1,
                        "effect": "4 % erhöhter Schaden und Verteidigung gegen Söldner"
                    },
                    {
                        "cost": 2,
                        "effect": "8 % erhöhter Schaden und Verteidigung (gesamt) gegen Söldner"
                    },
                    {
                        "cost": 3,
                        "effect": "12 % erhöhter Schaden und Verteidigung (gesamt) gegen Söldner"
                    },
                    {
                        "cost": 4,
                        "effect": "16 % erhöhter Schaden und Verteidigung (gesamt) gegen Söldner"
                    },
                    {
                        "cost": 5,
                        "effect": "20 % erhöhter Schaden und Verteidigung (gesamt) gegen Söldner"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2WvwAbility>(
            """
            {
                "id": 5,
                "name": "Belagerungsbunker",
                "description": "Verringert den Schaden, den Euch Belagerungswaffen zufügen",
                "icon": "https://render.guildwars2.com/file/A1B55D6AC11CA15BB6D84E040D7841E741446E7F/544539.png",
                "ranks": [
                    {
                        "cost": 1,
                        "effect": "2 % mehr Verteidigung gegen Belagerungswaffen"
                    },
                    {
                        "cost": 3,
                        "effect": "4 % mehr Verteidigung (gesamt) gegen Belagerungswaffen"
                    },
                    {
                        "cost": 6,
                        "effect": "6 % mehr Verteidigung (gesamt) gegen Belagerungswaffen"
                    },
                    {
                        "cost": 10,
                        "effect": "8 % mehr Verteidigung (gesamt) gegen Belagerungswaffen"
                    },
                    {
                        "cost": 15,
                        "effect": "10 % mehr Verteidigung (gesamt) gegen Belagerungswaffen"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2WvwAbility>(
            """
            {
                "id": 6,
                "name": "Belagerungsmacht",
                "description": "Erhöht den Schaden, der mit Belagerungswaffen verursacht wird",
                "icon": "https://render.guildwars2.com/file/A45EE7F1D2C6DD654F1868EAFC5BFF400395CA40/544535.png",
                "ranks": [
                    {
                        "cost": 1,
                        "effect": "2 % mehr Schaden durch Belagerungswaffen"
                    },
                    {
                        "cost": 3,
                        "effect": "4 % mehr Schaden (gesamt) durch Belagerungswaffen"
                    },
                    {
                        "cost": 6,
                        "effect": "6 % mehr Schaden (gesamt) durch Belagerungswaffen"
                    },
                    {
                        "cost": 10,
                        "effect": "8 % mehr Schaden (gesamt) durch Belagerungswaffen"
                    },
                    {
                        "cost": 15,
                        "effect": "10 % mehr Schaden (gesamt) durch Belagerungswaffen"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2WvwAbility>(
            """
            {
                "id": 7,
                "name": "Vorrats-Tragekapazität",
                "description": "Erhöht die Menge an Vorräten, die Ihr tragen könnt",
                "icon": "https://render.guildwars2.com/file/A73BF1A307D62B047B913DBBAE7409089DFE4DC9/544540.png",
                "ranks": [
                    {
                        "cost": 5,
                        "effect": "Erhöht die Vorrats-Tragekapazität um 1"
                    },
                    {
                        "cost": 15,
                        "effect": "Erhöht die Vorrats-Tragekapazität um 2 (gesamt)"
                    },
                    {
                        "cost": 25,
                        "effect": "Erhöht die Vorrats-Tragekapazität um 3 (gesamt)"
                    },
                    {
                        "cost": 40,
                        "effect": "Erhöht die Vorrats-Tragekapazität um 4 (gesamt)"
                    },
                    {
                        "cost": 60,
                        "effect": "Erhöht die Vorrats-Tragekapazität um 5 (gesamt)"
                    }
                ]
            }
            """.trimIndent()
        )
    }

}