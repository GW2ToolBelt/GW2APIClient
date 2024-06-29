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

class GW2v1EventDetailsTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v1EventDetails>(
            """
            {
                "events": {
                    "88BEACB7-3064-4489-8B9A-DD6A3370186F": {
                        "name": "Defeat the holograms!",
                        "level": 0,
                        "map_id": 26,
                        "flags": [],
                        "location": {
                            "type": "sphere",
                            "center": [
                                4838.1,
                                35552.4,
                                -6391.19
                            ],
                            "radius": 3000,
                            "rotation": 0
                        }
                    },
                    "E5BF70E5-7219-479D-9C65-650E85745DDA": {
                        "name": "Defend Stygian Deeps from the Risen krait.",
                        "level": 72,
                        "map_id": 51,
                        "flags": [],
                        "location": {
                            "type": "cylinder",
                            "center": [
                                6678.13,
                                7279.49,
                                938.506
                            ],
                            "height": 3797.76,
                            "radius": 3500,
                            "rotation": 0
                        }
                    },
                    "EED8A79F-B374-4AE6-BA6F-B7B98D9D7142": {
                        "name": "Defeat the renegade charr.",
                        "level": 42,
                        "map_id": 20,
                        "flags": [],
                        "location": {
                            "type": "sphere",
                            "center": [
                                -9463.6,
                                -40310.2,
                                -785.799
                            ],
                            "radius": 2500,
                            "rotation": 0
                        }
                    },
                    "4A750A61-4BDA-4991-90A4-EFB4EAA5F33A": {
                        "name": "Intimidate creatures and tame them with a flute.",
                        "level": 80,
                        "map_id": 1211,
                        "flags": [],
                        "location": {
                            "type": "poly",
                            "center": [
                                21444,
                                566.36,
                                -6078.84
                            ],
                            "z_range": [
                                -6887.83,
                                -5269.86
                            ],
                            "points": [
                                [
                                    19146.3,
                                    -6919.47
                                ],
                                [
                                    18251.3,
                                    -5300.14
                                ],
                                [
                                    17382.5,
                                    -2885.75
                                ],
                                [
                                    17452,
                                    -313.54
                                ],
                                [
                                    17427.1,
                                    1712.78
                                ],
                                [
                                    17573.4,
                                    5072.41
                                ],
                                [
                                    18436.3,
                                    6111.05
                                ],
                                [
                                    20932.3,
                                    7983.99
                                ],
                                [
                                    21885.2,
                                    10445.8
                                ],
                                [
                                    23377.9,
                                    9451.03
                                ],
                                [
                                    21137.5,
                                    2751.94
                                ],
                                [
                                    21598.3,
                                    1246.58
                                ],
                                [
                                    24532.1,
                                    691.173
                                ],
                                [
                                    25795.4,
                                    1456.99
                                ],
                                [
                                    26252.7,
                                    411.27
                                ],
                                [
                                    25554.9,
                                    -2667.15
                                ],
                                [
                                    25638.3,
                                    -4669.68
                                ],
                                [
                                    23937.1,
                                    -6445.73
                                ],
                                [
                                    21125.4,
                                    -7372.72
                                ]
                            ]
                        }
                    }
                }
            }
            """.trimIndent()
        )
    }

}