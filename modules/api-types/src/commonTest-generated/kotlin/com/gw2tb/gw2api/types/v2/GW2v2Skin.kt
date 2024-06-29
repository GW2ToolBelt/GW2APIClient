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

class GW2v2SkinTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Skin>(
            """
            {
                "name": "Kabbalisten-Kapuze",
                "type": "Armor",
                "flags": [
                    "ShowInWardrobe"
                ],
                "restrictions": [],
                "rarity": "Basic",
                "id": 103,
                "icon": "https://render.guildwars2.com/file/16E5686EC33001A0D77FF5D4320EFBCA39130826/61411.png",
                "details": {
                    "type": "Helm",
                    "weight_class": "Light",
                    "dye_slots": {
                        "default": [
                            {
                                "color_id": 1383,
                                "material": "cloth"
                            },
                            {
                                "color_id": 1383,
                                "material": "leather"
                            },
                            {
                                "color_id": 1383,
                                "material": "leather"
                            },
                            null
                        ],
                        "overrides": {}
                    }
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Skin>(
            """
            {
                "name": "Glorreiches Schuhwerk",
                "type": "Armor",
                "flags": [
                    "ShowInWardrobe"
                ],
                "restrictions": [],
                "rarity": "Basic",
                "id": 115,
                "icon": "https://render.guildwars2.com/file/5C63AF3E5541CBBF54C8656DD8F5E274590BEA52/699213.png",
                "details": {
                    "type": "Boots",
                    "weight_class": "Light",
                    "dye_slots": {
                        "default": [
                            {
                                "color_id": 1383,
                                "material": "cloth"
                            },
                            {
                                "color_id": 1383,
                                "material": "cloth"
                            },
                            {
                                "color_id": 1383,
                                "material": "cloth"
                            },
                            null
                        ],
                        "overrides": {
                            "HumanFemale": [
                                null,
                                null,
                                {
                                    "color_id": 1383,
                                    "material": "leather"
                                },
                                {
                                    "color_id": 79,
                                    "material": "metal"
                                }
                            ],
                            "NornFemale": [
                                null,
                                null,
                                {
                                    "color_id": 1383,
                                    "material": "leather"
                                },
                                {
                                    "color_id": 79,
                                    "material": "metal"
                                }
                            ],
                            "SylvariFemale": [
                                null,
                                null,
                                {
                                    "color_id": 1383,
                                    "material": "leather"
                                },
                                {
                                    "color_id": 79,
                                    "material": "metal"
                                }
                            ]
                        }
                    }
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Skin>(
            """
            {
                "name": "Starrblick des Khan-Ur",
                "type": "Armor",
                "flags": [
                    "ShowInWardrobe"
                ],
                "restrictions": [
                    "Charr"
                ],
                "rarity": "Basic",
                "id": 8941,
                "icon": "https://render.guildwars2.com/file/BD587A0D3F9B28A9D595424C9208527209059104/2199545.png",
                "details": {
                    "type": "Helm",
                    "weight_class": "Heavy",
                    "dye_slots": {
                        "default": [
                            null,
                            null,
                            null,
                            null
                        ],
                        "overrides": {
                            "CharrFemale": [
                                {
                                    "color_id": 1383,
                                    "material": "metal"
                                },
                                {
                                    "color_id": 1383,
                                    "material": "cloth"
                                },
                                {
                                    "color_id": 1383,
                                    "material": "cloth"
                                },
                                {
                                    "color_id": 79,
                                    "material": "cloth"
                                }
                            ],
                            "CharrMale": [
                                {
                                    "color_id": 1383,
                                    "material": "metal"
                                },
                                {
                                    "color_id": 1383,
                                    "material": "cloth"
                                },
                                {
                                    "color_id": 1383,
                                    "material": "cloth"
                                },
                                {
                                    "color_id": 79,
                                    "material": "cloth"
                                }
                            ]
                        }
                    }
                }
            }
            """.trimIndent()
        )
    }

}