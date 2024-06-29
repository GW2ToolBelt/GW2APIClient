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

class GW2v2CharactersInventorySlotTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2CharactersInventorySlot>(
            """
            {
                "bags": [
                    {
                        "id": 9574,
                        "size": 20,
                        "inventory": [
                            {
                                "id": 76075,
                                "count": 1,
                                "skin": 7165,
                                "upgrades": [
                                    24615
                                ],
                                "upgrade_slot_indices": [
                                    0
                                ],
                                "binding": "Account"
                            },
                            {
                                "id": 73724,
                                "count": 1,
                                "skin": 6178,
                                "upgrades": [
                                    72339
                                ],
                                "upgrade_slot_indices": [
                                    0
                                ],
                                "binding": "Account"
                            },
                            {
                                "id": 46773,
                                "count": 1,
                                "skin": 4683,
                                "upgrades": [
                                    24615,
                                    24554
                                ],
                                "upgrade_slot_indices": [
                                    0,
                                    1
                                ],
                                "binding": "Account"
                            },
                            {
                                "id": 83596,
                                "count": 1,
                                "binding": "Character",
                                "bound_to": "El Gonzo"
                            },
                            {
                                "id": 66961,
                                "count": 1,
                                "binding": "Character",
                                "bound_to": "El Gonzo"
                            },
                            {
                                "id": 77579,
                                "count": 167
                            },
                            {
                                "id": 67379,
                                "count": 1
                            },
                            {
                                "id": 19724,
                                "count": 79
                            },
                            {
                                "id": 36041,
                                "count": 1
                            },
                            {
                                "id": 90064,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 81296,
                                "count": 12,
                                "binding": "Account"
                            },
                            {
                                "id": 43418,
                                "count": 14,
                                "binding": "Character",
                                "bound_to": "El Gonzo"
                            },
                            {
                                "id": 77604,
                                "count": 250
                            },
                            {
                                "id": 24,
                                "count": 8
                            },
                            {
                                "id": 77643,
                                "count": 104
                            },
                            {
                                "id": 77567,
                                "count": 96
                            },
                            {
                                "id": 77630,
                                "count": 175
                            },
                            {
                                "id": 77579,
                                "count": 250
                            },
                            {
                                "id": 78283,
                                "count": 164,
                                "binding": "Account"
                            },
                            {
                                "id": 78177,
                                "count": 1,
                                "binding": "Account"
                            }
                        ]
                    },
                    {
                        "id": 8932,
                        "size": 20,
                        "inventory": [
                            {
                                "id": 67368,
                                "count": 6
                            },
                            {
                                "id": 19739,
                                "count": 10
                            },
                            {
                                "id": 21263,
                                "count": 1
                            },
                            {
                                "id": 21260,
                                "count": 1
                            },
                            {
                                "id": 77666,
                                "count": 72,
                                "binding": "Account"
                            },
                            {
                                "id": 77667,
                                "count": 49
                            },
                            {
                                "id": 77632,
                                "count": 15
                            },
                            {
                                "id": 46735,
                                "count": 250,
                                "binding": "Account"
                            },
                            {
                                "id": 77576,
                                "count": 48
                            },
                            {
                                "id": 19722,
                                "count": 186
                            },
                            {
                                "id": 38063,
                                "count": 3
                            },
                            {
                                "id": 19728,
                                "count": 20
                            },
                            {
                                "id": 19743,
                                "count": 14
                            },
                            {
                                "id": 43319,
                                "count": 65
                            },
                            {
                                "id": 21161,
                                "count": 9
                            },
                            {
                                "id": 78194,
                                "count": 14,
                                "binding": "Account"
                            },
                            {
                                "id": 12464,
                                "count": 5
                            },
                            {
                                "id": 91347,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 90187,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 92338,
                                "count": 3,
                                "binding": "Account"
                            }
                        ]
                    },
                    {
                        "id": 38013,
                        "size": 20,
                        "inventory": [
                            {
                                "id": 19699,
                                "count": 64
                            },
                            {
                                "id": 21157,
                                "count": 1
                            },
                            {
                                "id": 80022,
                                "count": 10,
                                "binding": "Account"
                            },
                            {
                                "id": 94395,
                                "count": 1,
                                "binding": "Character",
                                "bound_to": "El Gonzo"
                            },
                            {
                                "id": 77648,
                                "count": 41
                            },
                            {
                                "id": 38061,
                                "count": 3
                            },
                            {
                                "id": 77569,
                                "count": 17
                            },
                            {
                                "id": 77656,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 71428,
                                "count": 7
                            },
                            {
                                "id": 38062,
                                "count": 4
                            },
                            {
                                "id": 38128,
                                "count": 6
                            },
                            {
                                "id": 77604,
                                "count": 250
                            },
                            {
                                "id": 37077,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 21159,
                                "count": 4
                            },
                            {
                                "id": 21156,
                                "count": 17
                            },
                            {
                                "id": 62914,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 92066,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 41291,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 87557,
                                "count": 7,
                                "binding": "Account"
                            },
                            {
                                "id": 83654,
                                "count": 30,
                                "binding": "Account"
                            }
                        ]
                    },
                    {
                        "id": 9571,
                        "size": 20,
                        "inventory": [
                            {
                                "id": 77604,
                                "count": 39
                            },
                            {
                                "id": 86601,
                                "count": 22
                            },
                            {
                                "id": 43773,
                                "count": 2
                            },
                            {
                                "id": 46735,
                                "count": 245,
                                "binding": "Account"
                            },
                            null,
                            null,
                            null,
                            {
                                "id": 89140,
                                "count": 3
                            },
                            null,
                            null,
                            null,
                            {
                                "id": 68109,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 46735,
                                "count": 250,
                                "binding": "Account"
                            },
                            {
                                "id": 93458,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 21158,
                                "count": 6
                            },
                            {
                                "id": 77651,
                                "count": 53
                            },
                            {
                                "id": 84534,
                                "count": 2,
                                "binding": "Account"
                            },
                            {
                                "id": 87630,
                                "count": 73,
                                "binding": "Account"
                            },
                            {
                                "id": 78600,
                                "count": 2,
                                "binding": "Account"
                            },
                            {
                                "id": 12468,
                                "count": 2
                            }
                        ]
                    },
                    {
                        "id": 38013,
                        "size": 20,
                        "inventory": [
                            {
                                "id": 46735,
                                "count": 250,
                                "binding": "Account"
                            },
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            {
                                "id": 92272,
                                "count": 118,
                                "binding": "Account"
                            },
                            {
                                "id": 92272,
                                "count": 250,
                                "binding": "Account"
                            },
                            {
                                "id": 21160,
                                "count": 5
                            },
                            {
                                "id": 77651,
                                "count": 250
                            },
                            {
                                "id": 77669,
                                "count": 2,
                                "binding": "Account"
                            },
                            {
                                "id": 44205,
                                "count": 32,
                                "binding": "Account"
                            },
                            {
                                "id": 84966,
                                "count": 13,
                                "binding": "Account"
                            },
                            {
                                "id": 43766,
                                "count": 19,
                                "binding": "Account"
                            }
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }

}