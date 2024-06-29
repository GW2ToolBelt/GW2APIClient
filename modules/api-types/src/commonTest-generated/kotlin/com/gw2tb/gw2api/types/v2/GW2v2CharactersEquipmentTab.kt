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

class GW2v2CharactersEquipmentTabTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2CharactersEquipmentTab>(
            """
            {
                "tab": 1,
                "name": "",
                "is_active": true,
                "equipment": [
                    {
                        "id": 79830,
                        "slot": "Backpack",
                        "binding": "Account",
                        "location": "Equipped",
                        "dyes": [
                            null,
                            null,
                            null,
                            null
                        ]
                    },
                    {
                        "id": 79745,
                        "slot": "Accessory1",
                        "binding": "Account",
                        "location": "Equipped"
                    },
                    {
                        "id": 79444,
                        "slot": "Accessory2",
                        "binding": "Account",
                        "location": "Equipped"
                    },
                    {
                        "id": 79712,
                        "slot": "Ring1",
                        "binding": "Account",
                        "location": "Equipped"
                    },
                    {
                        "id": 79124,
                        "slot": "Ring2",
                        "binding": "Account",
                        "location": "Equipped"
                    },
                    {
                        "id": 44976,
                        "slot": "WeaponAquaticA",
                        "upgrades": [
                            24567
                        ],
                        "binding": "Character",
                        "bound_to": "Character McCharacterface",
                        "location": "Equipped"
                    },
                    {
                        "id": 82195,
                        "slot": "WeaponA1",
                        "upgrades": [
                            24575
                        ],
                        "skin": 6486,
                        "binding": "Character",
                        "bound_to": "Character McCharacterface",
                        "location": "Equipped"
                    },
                    {
                        "id": 27024,
                        "slot": "WeaponA2",
                        "upgrades": [
                            24551
                        ],
                        "skin": 6417,
                        "binding": "Character",
                        "bound_to": "Character McCharacterface",
                        "location": "Equipped"
                    },
                    {
                        "id": 27325,
                        "slot": "WeaponB1",
                        "upgrades": [
                            24578,
                            24575
                        ],
                        "skin": 6346,
                        "binding": "Character",
                        "bound_to": "Character McCharacterface",
                        "location": "Equipped"
                    }
                ],
                "equipment_pvp": {
                    "amulet": 9,
                    "rune": 21172,
                    "sigils": [
                        21150,
                        81268,
                        21150,
                        81268
                    ]
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2CharactersEquipmentTab>(
            """
            {
                "tab": 2,
                "name": "",
                "is_active": false,
                "equipment": [],
                "equipment_pvp": {
                    "amulet": 9,
                    "rune": 21172,
                    "sigils": [
                        21150,
                        81268,
                        21150,
                        81268
                    ]
                }
            }
            """.trimIndent()
        )
    }

}