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

class GW2v2MapTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Map>(
            """
            {
                "id": 516,
                "name": "Alle Mühen umsonst",
                "min_level": 10,
                "max_level": 10,
                "default_floor": 1,
                "type": "Instance",
                "floors": [
                    1
                ],
                "region_id": 5,
                "region_name": "Befleckte Küste",
                "continent_id": 1,
                "continent_name": "Tyria",
                "map_rect": [
                    [
                        -21504,
                        -46080
                    ],
                    [
                        24576,
                        49152
                    ]
                ],
                "continent_rect": [
                    [
                        9344,
                        16128
                    ],
                    [
                        11264,
                        20096
                    ]
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Map>(
            """
            {
                "id": 1226,
                "name": "Das Ödland",
                "min_level": 80,
                "max_level": 80,
                "default_floor": 1,
                "type": "Public",
                "floors": [
                    1,
                    3,
                    49,
                    2,
                    0
                ],
                "region_id": 12,
                "region_name": "Kristallwüste",
                "continent_id": 1,
                "continent_name": "Tyria",
                "map_rect": [
                    [
                        -43008,
                        -61440
                    ],
                    [
                        43008,
                        61440
                    ]
                ],
                "continent_rect": [
                    [
                        25472,
                        31808
                    ],
                    [
                        29056,
                        36928
                    ]
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Map>(
            """
            {
                "id": 1227,
                "name": "Geheiligter Boden: Grab der Altehrwürdigen Könige",
                "min_level": 80,
                "max_level": 80,
                "default_floor": 1,
                "type": "Instance",
                "floors": [
                    1,
                    3,
                    49,
                    2,
                    0
                ],
                "region_id": 12,
                "region_name": "Kristallwüste",
                "continent_id": 1,
                "continent_name": "Tyria",
                "map_rect": [
                    [
                        -61440,
                        -30720
                    ],
                    [
                        61440,
                        30720
                    ]
                ],
                "continent_rect": [
                    [
                        24488,
                        23360
                    ],
                    [
                        29608,
                        25920
                    ]
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Map>(
            """
            {
                "id": 1228,
                "name": "Elon-Flusslande",
                "min_level": 80,
                "max_level": 80,
                "default_floor": 1,
                "type": "Public",
                "floors": [
                    1,
                    3,
                    49,
                    2,
                    0
                ],
                "region_id": 12,
                "region_name": "Kristallwüste",
                "continent_id": 1,
                "continent_name": "Tyria",
                "map_rect": [
                    [
                        -43008,
                        -39936
                    ],
                    [
                        43008,
                        43008
                    ]
                ],
                "continent_rect": [
                    [
                        25472,
                        28352
                    ],
                    [
                        29056,
                        31808
                    ]
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Map>(
            """
            {
                "id": 1405,
                "name": "Gendarran-Felder (privat)",
                "min_level": 80,
                "max_level": 80,
                "default_floor": 66,
                "type": "Instance",
                "floors": [
                    66
                ],
                "region_id": 4,
                "region_name": "Kryta",
                "continent_id": 1,
                "continent_name": "Tyria",
                "map_rect": [
                    [
                        -49152,
                        -24576
                    ],
                    [
                        52224,
                        24576
                    ]
                ],
                "continent_rect": [
                    [
                        13440,
                        12288
                    ],
                    [
                        17664,
                        14336
                    ]
                ]
            }
            """.trimIndent()
        )
    }

}