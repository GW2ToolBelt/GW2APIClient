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

class GW2v2WvwMatchScoreTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2WvwMatchScore>(
            """
            {
                "id": "2-1",
                "scores": {
                    "red": 299391,
                    "blue": 302398,
                    "green": 608728
                },
                "victory_points": {
                    "red": 246,
                    "blue": 245,
                    "green": 349
                },
                "skirmishes": [
                    {
                        "id": 1,
                        "scores": {
                            "red": 7211,
                            "blue": 8859,
                            "green": 8984
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2553,
                                    "blue": 1835,
                                    "green": 2276
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1602,
                                    "blue": 1453,
                                    "green": 1938
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 896,
                                    "blue": 3036,
                                    "green": 2461
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 2160,
                                    "blue": 2535,
                                    "green": 2309
                                }
                            }
                        ]
                    },
                    {
                        "id": 2,
                        "scores": {
                            "red": 8458,
                            "blue": 7336,
                            "green": 8389
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 4055,
                                    "blue": 2346,
                                    "green": 2746
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1703,
                                    "blue": 881,
                                    "green": 1455
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 1072,
                                    "blue": 2798,
                                    "green": 1819
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1628,
                                    "blue": 1311,
                                    "green": 2369
                                }
                            }
                        ]
                    },
                    {
                        "id": 3,
                        "scores": {
                            "red": 4330,
                            "blue": 5110,
                            "green": 7736
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2453,
                                    "blue": 1993,
                                    "green": 2919
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 766,
                                    "blue": 746,
                                    "green": 1512
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 263,
                                    "blue": 1836,
                                    "green": 1074
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 848,
                                    "blue": 535,
                                    "green": 2231
                                }
                            }
                        ]
                    },
                    {
                        "id": 4,
                        "scores": {
                            "red": 2227,
                            "blue": 2860,
                            "green": 9489
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1424,
                                    "blue": 960,
                                    "green": 3996
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 478,
                                    "blue": 347,
                                    "green": 1647
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 192,
                                    "blue": 1364,
                                    "green": 1694
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 133,
                                    "blue": 189,
                                    "green": 2152
                                }
                            }
                        ]
                    }
                ],
                "maps": [
                    {
                        "id": 38,
                        "type": "Center",
                        "scores": {
                            "red": 125066,
                            "blue": 124417,
                            "green": 246360
                        }
                    },
                    {
                        "id": 1099,
                        "type": "RedHome",
                        "scores": {
                            "red": 96792,
                            "blue": 40305,
                            "green": 91528
                        }
                    },
                    {
                        "id": 96,
                        "type": "BlueHome",
                        "scores": {
                            "red": 37935,
                            "blue": 102467,
                            "green": 93691
                        }
                    },
                    {
                        "id": 95,
                        "type": "GreenHome",
                        "scores": {
                            "red": 39598,
                            "blue": 35209,
                            "green": 177149
                        }
                    }
                ]
            }
            """.trimIndent()
        )
    }

}