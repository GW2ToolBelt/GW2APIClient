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

class GW2v2CharactersEquipmentTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2CharactersEquipment>(
            """
            {
                "equipment": [
                    {
                        "id": 68357,
                        "slot": "HelmAquatic",
                        "stats": {
                            "id": 161,
                            "attributes": {
                                "Power": 60,
                                "Precision": 43,
                                "CritDamage": 43
                            }
                        },
                        "binding": "Character",
                        "bound_to": "Linux Die Bestie",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 77536,
                        "slot": "Backpack",
                        "skin": 6892,
                        "stats": {
                            "id": 584,
                            "attributes": {
                                "Power": 63,
                                "Precision": 40,
                                "CritDamage": 40
                            }
                        },
                        "binding": "Account",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ],
                        "dyes": [
                            null,
                            null,
                            null,
                            null
                        ]
                    },
                    {
                        "id": 83036,
                        "slot": "Coat",
                        "upgrades": [
                            24836
                        ],
                        "stats": {
                            "id": 161,
                            "attributes": {
                                "Power": 141,
                                "Precision": 101,
                                "CritDamage": 101
                            }
                        },
                        "binding": "Account",
                        "location": "EquippedFromLegendaryArmory",
                        "tabs": [
                            1
                        ],
                        "dyes": [
                            473,
                            473,
                            443,
                            null
                        ]
                    },
                    {
                        "id": 48078,
                        "slot": "Boots",
                        "upgrades": [
                            24836
                        ],
                        "skin": 7486,
                        "binding": "Account",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ],
                        "dyes": [
                            473,
                            473,
                            473,
                            null
                        ]
                    },
                    {
                        "id": 48080,
                        "slot": "Gloves",
                        "upgrades": [
                            24836
                        ],
                        "skin": 6308,
                        "binding": "Account",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ],
                        "dyes": [
                            2,
                            443,
                            473,
                            60
                        ]
                    },
                    {
                        "id": 82902,
                        "slot": "Helm",
                        "skin": 9544,
                        "stats": {
                            "id": 161,
                            "attributes": {
                                "Power": 63,
                                "Precision": 45,
                                "CritDamage": 45
                            }
                        },
                        "binding": "Account",
                        "location": "EquippedFromLegendaryArmory",
                        "tabs": [
                            1
                        ],
                        "dyes": [
                            67,
                            443,
                            480,
                            null
                        ]
                    },
                    {
                        "id": 83497,
                        "slot": "Leggings",
                        "upgrades": [
                            24836
                        ],
                        "skin": 5726,
                        "stats": {
                            "id": 161,
                            "attributes": {
                                "Power": 94,
                                "Precision": 67,
                                "CritDamage": 67
                            }
                        },
                        "binding": "Account",
                        "location": "EquippedFromLegendaryArmory",
                        "tabs": [
                            1
                        ],
                        "dyes": [
                            67,
                            384,
                            480,
                            null
                        ]
                    },
                    {
                        "id": 48083,
                        "slot": "Shoulders",
                        "upgrades": [
                            24836
                        ],
                        "skin": 7763,
                        "binding": "Account",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ],
                        "dyes": [
                            455,
                            2,
                            null,
                            443
                        ]
                    },
                    {
                        "id": 39232,
                        "slot": "Accessory1",
                        "binding": "Account",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 94975,
                        "slot": "Accessory2",
                        "stats": {
                            "id": 584,
                            "attributes": {
                                "Power": 110,
                                "Precision": 74,
                                "CritDamage": 74
                            }
                        },
                        "binding": "Account",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 49402,
                        "slot": "Ring1",
                        "binding": "Account",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 49403,
                        "slot": "Ring2",
                        "binding": "Account",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 95380,
                        "slot": "Amulet",
                        "stats": {
                            "id": 584,
                            "attributes": {
                                "Power": 157,
                                "Precision": 108,
                                "CritDamage": 108
                            }
                        },
                        "binding": "Account",
                        "location": "EquippedFromLegendaryArmory",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 28430,
                        "slot": "WeaponAquaticA",
                        "upgrades": [
                            24554
                        ],
                        "binding": "Character",
                        "bound_to": "Linux Die Bestie",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 30698,
                        "slot": "WeaponA1",
                        "upgrades": [
                            24615,
                            24554
                        ],
                        "stats": {
                            "id": 161,
                            "attributes": {
                                "Power": 251,
                                "Precision": 179,
                                "CritDamage": 179
                            }
                        },
                        "binding": "Account",
                        "location": "EquippedFromLegendaryArmory",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 17875,
                        "slot": "WeaponB1",
                        "upgrades": [
                            24641
                        ],
                        "skin": 4877,
                        "binding": "Character",
                        "bound_to": "Linux Die Bestie",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 30702,
                        "slot": "WeaponB2",
                        "stats": {
                            "id": 161,
                            "attributes": {
                                "Power": 125,
                                "Precision": 90,
                                "CritDamage": 90
                            }
                        },
                        "binding": "Account",
                        "location": "EquippedFromLegendaryArmory",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 22997,
                        "slot": "Sickle",
                        "binding": "Account",
                        "location": "Equipped"
                    },
                    {
                        "id": 23030,
                        "slot": "Axe",
                        "binding": "Account",
                        "location": "Equipped"
                    },
                    {
                        "id": 23031,
                        "slot": "Pick",
                        "binding": "Account",
                        "location": "Equipped"
                    }
                ]
            }
            """.trimIndent()
        )
    }

}