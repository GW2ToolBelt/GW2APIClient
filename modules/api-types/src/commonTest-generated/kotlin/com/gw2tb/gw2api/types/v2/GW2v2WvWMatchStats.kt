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

class GW2v2WvwMatchStatsTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2WvwMatchStats>(
            """
            {
                "id": "2-1",
                "deaths": {
                    "red": 37954,
                    "blue": 41936,
                    "green": 35756
                },
                "kills": {
                    "red": 28694,
                    "blue": 25979,
                    "green": 56435
                },
                "maps": [
                    {
                        "id": 38,
                        "type": "Center",
                        "deaths": {
                            "red": 15247,
                            "blue": 17001,
                            "green": 14528
                        },
                        "kills": {
                            "red": 12171,
                            "blue": 10250,
                            "green": 23283
                        }
                    },
                    {
                        "id": 1099,
                        "type": "RedHome",
                        "deaths": {
                            "red": 7280,
                            "blue": 5215,
                            "green": 5745
                        },
                        "kills": {
                            "red": 5248,
                            "blue": 2918,
                            "green": 8548
                        }
                    },
                    {
                        "id": 96,
                        "type": "BlueHome",
                        "deaths": {
                            "red": 8157,
                            "blue": 9919,
                            "green": 7738
                        },
                        "kills": {
                            "red": 5610,
                            "blue": 6616,
                            "green": 12428
                        }
                    },
                    {
                        "id": 95,
                        "type": "GreenHome",
                        "deaths": {
                            "red": 7270,
                            "blue": 9801,
                            "green": 7745
                        },
                        "kills": {
                            "red": 5665,
                            "blue": 6195,
                            "green": 12176
                        }
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2WvwMatchStats>(
            """
            {
                "id": "2-2",
                "deaths": {
                    "red": 32421,
                    "blue": 34063,
                    "green": 30098
                },
                "kills": {
                    "red": 38747,
                    "blue": 25149,
                    "green": 29005
                },
                "maps": [
                    {
                        "id": 38,
                        "type": "Center",
                        "deaths": {
                            "red": 14495,
                            "blue": 16494,
                            "green": 11180
                        },
                        "kills": {
                            "red": 21070,
                            "blue": 10479,
                            "green": 9601
                        }
                    },
                    {
                        "id": 1099,
                        "type": "RedHome",
                        "deaths": {
                            "red": 4980,
                            "blue": 3292,
                            "green": 4256
                        },
                        "kills": {
                            "red": 4292,
                            "blue": 2642,
                            "green": 4456
                        }
                    },
                    {
                        "id": 96,
                        "type": "BlueHome",
                        "deaths": {
                            "red": 6489,
                            "blue": 6590,
                            "green": 6275
                        },
                        "kills": {
                            "red": 6727,
                            "blue": 5697,
                            "green": 6204
                        }
                    },
                    {
                        "id": 95,
                        "type": "GreenHome",
                        "deaths": {
                            "red": 6457,
                            "blue": 7687,
                            "green": 8387
                        },
                        "kills": {
                            "red": 6658,
                            "blue": 6331,
                            "green": 8744
                        }
                    }
                ]
            }
            """.trimIndent()
        )
    }

}