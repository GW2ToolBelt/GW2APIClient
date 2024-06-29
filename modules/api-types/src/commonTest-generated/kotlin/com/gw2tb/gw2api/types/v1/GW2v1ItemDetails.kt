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
package com.gw2tb.gw2api.types.v1

import kotlin.test.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*

class GW2v1ItemDetailsTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v1ItemDetails>(
            """
            {
                "item_id": "37086",
                "name": "Ring of Red Death",
                "description": "",
                "type": "Trinket",
                "level": "80",
                "rarity": "Ascended",
                "vendor_value": "495",
                "icon_file_id": "511826",
                "icon_file_signature": "B155B37AD048CA9054F749043C3E4E99973DF8DF",
                "upgrade_recipes": [
                    {
                        "type": "Attuned",
                        "into": 75187
                    },
                    {
                        "type": "Infused",
                        "into": 49403
                    }
                ],
                "game_types": [
                    "Activity",
                    "Wvw",
                    "Dungeon",
                    "Pve"
                ],
                "flags": [
                    "HideSuffix",
                    "AccountBound",
                    "NotUpgradeable",
                    "Unique",
                    "AccountBindOnUse"
                ],
                "restrictions": [],
                "trinket": {
                    "type": "Ring",
                    "infusion_slots": [
                        {
                            "flags": [
                                "Infusion"
                            ]
                        }
                    ],
                    "attribute_adjustment": 268.884,
                    "infix_upgrade": {
                        "id": 584,
                        "buff": {
                            "skill_id": "15742",
                            "description": "+32 Power\n+18 Ferocity\n+18 Precision"
                        },
                        "attributes": [
                            {
                                "attribute": "Power",
                                "modifier": 126
                            },
                            {
                                "attribute": "Precision",
                                "modifier": 85
                            },
                            {
                                "attribute": "CritDamage",
                                "modifier": 85
                            }
                        ]
                    },
                    "suffix_item_id": "",
                    "secondary_suffix_item_id": ""
                }
            }
            """.trimIndent()
        )
    }

}