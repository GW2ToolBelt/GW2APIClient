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

class GW2v2GuildUpgradeTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2GuildUpgrade>(
            """
            {
                "id": 638,
                "name": "Gilden-Miniatur-Händler 1",
                "description": "Fügt dem Markt einen Kaufmann hinzu, der Miniaturen mit Eurem Gilden-Wappen darauf verkauft.",
                "build_time": 0,
                "icon": "https://render.guildwars2.com/file/619D25726AC868FE9EA96C352074313DF8DDD5A5/1228502.png",
                "type": "Unlock",
                "required_level": 18,
                "experience": 35,
                "prerequisites": [
                    350
                ],
                "costs": [
                    {
                        "type": "Collectible",
                        "count": 300,
                        "name": "Gilden-Gunst",
                        "item_id": 70701
                    },
                    {
                        "type": "Item",
                        "count": 80,
                        "name": "Orichalcumbarren",
                        "item_id": 19685
                    },
                    {
                        "type": "Item",
                        "count": 80,
                        "name": "Antike Holzplanke",
                        "item_id": 19712
                    },
                    {
                        "type": "Item",
                        "count": 50,
                        "name": "Uhrwerk-Zwischenzahnrad",
                        "item_id": 44941
                    },
                    {
                        "type": "Item",
                        "count": 10,
                        "name": "Flasche Luftschiff-Öl",
                        "item_id": 69434
                    },
                    {
                        "type": "Currency",
                        "count": 3000,
                        "name": "Aetherium"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2GuildUpgrade>(
            """
            {
                "id": 846,
                "name": "Essenz des Eichenherzens",
                "description": "",
                "build_time": 0,
                "icon": "https://render.guildwars2.com/file/A11AA6A29590F803F037FF9A20D22597E86651CB/1676608.png",
                "type": "Decoration",
                "required_level": 0,
                "experience": 0,
                "prerequisites": [],
                "costs": [
                    {
                        "type": "Item",
                        "count": 1,
                        "name": "Essenz des Eichenherzens",
                        "item_id": 81000
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2GuildUpgrade>(
            """
            {
                "id": 1134,
                "name": "Sesam-Käsekuchen",
                "description": "Gourmet-Schmaus: Doppelklicken, um allen in der Nähe Sesam-Käsekuchen zu servieren. Schmaus bleibt für fünf Minuten aktiv.",
                "build_time": 0,
                "icon": "https://render.guildwars2.com/file/9A20FB034061FF773033D4A161A6F61DCC5174CD/2191034.png",
                "type": "Consumable",
                "required_level": 0,
                "experience": 0,
                "prerequisites": [
                    359
                ],
                "costs": [
                    {
                        "type": "Item",
                        "count": 1,
                        "name": "Sesam-Käsekuchen",
                        "item_id": 92537
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2GuildUpgrade>(
            """
            {
                "id": 1135,
                "name": "Sphärifizierte, nelkengewürzte Austernsuppe",
                "description": "Gourmet-Schmaus: Doppelklicken, um allen in der Nähe sphärifizierte, nelkengewürzte Austernsuppe zu servieren. Schmaus bleibt für fünf Minuten aktiv.",
                "build_time": 0,
                "icon": "https://render.guildwars2.com/file/EC5633F8390F1B3D44EFFB03669ECCB62498DCC4/2191075.png",
                "type": "Consumable",
                "required_level": 0,
                "experience": 0,
                "prerequisites": [
                    359
                ],
                "costs": [
                    {
                        "type": "Item",
                        "count": 1,
                        "name": "Sphärifizierte, nelkengewürzte Austernsuppe",
                        "item_id": 92437
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2GuildUpgrade>(
            """
            {
                "id": 1149,
                "name": "Super-Baum-Stamm",
                "description": "Von Schreibern hergestellt.",
                "build_time": 32,
                "icon": "https://render.guildwars2.com/file/5F68B0CEE02BB83B3E5EE755C4243309C7120CD3/2281909.png",
                "type": "Decoration",
                "required_level": 0,
                "experience": 0,
                "prerequisites": [],
                "costs": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2GuildUpgrade>(
            """
            {
                "id": 1163,
                "name": "Frost-Legion-Maschine",
                "description": "Verdient durch den Abschluss der Lebendigen Welt \"Die Eisbrut-Saga\", Episode \"Jormags Erwachen\"",
                "build_time": 0,
                "icon": "https://render.guildwars2.com/file/753679D628A638DDFCBB040A15AC1491B45161DB/2314084.png",
                "type": "Decoration",
                "required_level": 0,
                "experience": 0,
                "prerequisites": [
                    407
                ],
                "costs": [
                    {
                        "type": "Item",
                        "count": 1,
                        "name": "Frost-Legion-Maschinen-Marke",
                        "item_id": 93864
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2GuildUpgrade>(
            """
            {
                "id": 1172,
                "name": "Verschönerter Wintertag-Stern",
                "description": "Von Schreibern hergestellt.",
                "build_time": 30,
                "icon": "https://render.guildwars2.com/file/0391373052E24BA3CDA17368E4F4F9444F690CE6/2376877.png",
                "type": "Decoration",
                "required_level": 0,
                "experience": 0,
                "prerequisites": [],
                "costs": []
            }
            """.trimIndent()
        )
    }

}