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

class GW2v1SkinDetailsTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v1SkinDetails>(
            """
            {
                "skin_id": "1350",
                "name": "Zodiac Light Vest",
                "type": "Armor",
                "flags": [
                    "ShowInWardrobe"
                ],
                "restrictions": [],
                "rarity": "Basic",
                "icon_file_id": "740312",
                "icon_file_signature": "021048C317DFFFB6727E0955A2D6C7EFFBE9425B",
                "armor": {
                    "type": "Coat",
                    "weight_class": "Light",
                    "dye_slots": {
                        "asura_female": [
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Cloth"
                            },
                            null
                        ],
                        "asura_male": [
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Cloth"
                            },
                            null
                        ],
                        "charr_female": [
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Cloth"
                            },
                            null
                        ],
                        "charr_male": [
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Cloth"
                            },
                            null
                        ],
                        "human_female": [
                            {
                                "color_id": 1,
                                "material": "Leather"
                            },
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Cloth"
                            },
                            null
                        ],
                        "human_male": [
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Cloth"
                            },
                            null
                        ],
                        "norn_female": [
                            {
                                "color_id": 1,
                                "material": "Leather"
                            },
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Cloth"
                            },
                            null
                        ],
                        "norn_male": [
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Cloth"
                            },
                            null
                        ],
                        "sylvari_female": [
                            {
                                "color_id": 1,
                                "material": "Leather"
                            },
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Cloth"
                            },
                            null
                        ],
                        "sylvari_male": [
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Metal"
                            },
                            {
                                "color_id": 1,
                                "material": "Cloth"
                            },
                            null
                        ]
                    }
                }
            }
            """.trimIndent()
        )
    }

}