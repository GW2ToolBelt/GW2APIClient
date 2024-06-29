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

class GW2v1MapsTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v1Maps>(
            """
            {
                "maps": {
                    "15": {
                        "map_name": "Königintal",
                        "min_level": 1,
                        "max_level": 15,
                        "default_floor": 1,
                        "type": "Public",
                        "floors": [
                            1,
                            65,
                            3,
                            2,
                            0
                        ],
                        "region_id": 4,
                        "region_name": "Kryta",
                        "continent_id": 1,
                        "continent_name": "Tyria",
                        "map_rect": [
                            [
                                -43008,
                                -27648
                            ],
                            [
                                43008,
                                30720
                            ]
                        ],
                        "continent_rect": [
                            [
                                9856,
                                11648
                            ],
                            [
                                13440,
                                14080
                            ]
                        ]
                    },
                    "33": {
                        "map_name": "Katakomben von Ascalon",
                        "min_level": 30,
                        "max_level": 32,
                        "default_floor": -2,
                        "type": "Instance",
                        "floors": [
                            -2
                        ],
                        "region_id": 2,
                        "region_name": "Ascalon",
                        "continent_id": 1,
                        "continent_name": "Tyria",
                        "map_rect": [
                            [
                                -15360,
                                -12288
                            ],
                            [
                                15360,
                                12288
                            ]
                        ],
                        "continent_rect": [
                            [
                                27648,
                                13056
                            ],
                            [
                                28928,
                                14080
                            ]
                        ]
                    },
                    "1412": {
                        "map_name": "Drachensturm",
                        "min_level": 80,
                        "max_level": 80,
                        "default_floor": 59,
                        "type": "Instance",
                        "floors": [
                            59
                        ],
                        "region_id": 1,
                        "region_name": "Zittergipfelgebirge",
                        "continent_id": 1,
                        "continent_name": "Tyria",
                        "map_rect": [
                            [
                                -18432,
                                -18432
                            ],
                            [
                                18432,
                                18432
                            ]
                        ],
                        "continent_rect": [
                            [
                                19200,
                                9728
                            ],
                            [
                                20736,
                                11264
                            ]
                        ]
                    }
                }
            }
            """.trimIndent()
        )
    }

}