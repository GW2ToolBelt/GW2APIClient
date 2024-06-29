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

class GW2v2AccountBuildStorageSlotTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2AccountBuildStorageSlot>(
            """
            {
                "name": "",
                "profession": "Revenant",
                "specializations": [
                    {
                        "id": 3,
                        "traits": [
                            1761,
                            1774,
                            1719
                        ]
                    },
                    {
                        "id": 15,
                        "traits": [
                            1767,
                            1802,
                            1715
                        ]
                    },
                    {
                        "id": 52,
                        "traits": [
                            1806,
                            1738,
                            1772
                        ]
                    }
                ],
                "skills": {
                    "heal": 45686,
                    "utilities": [
                        41220,
                        42949,
                        40485
                    ],
                    "elite": 45773
                },
                "aquatic_skills": {
                    "heal": null,
                    "utilities": [
                        null,
                        null,
                        null
                    ],
                    "elite": null
                },
                "legends": [
                    null,
                    null
                ],
                "aquatic_legends": [
                    null,
                    null
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2AccountBuildStorageSlot>(
            """
            {
                "name": "Test",
                "profession": "Necromancer",
                "specializations": [
                    {
                        "id": 53,
                        "traits": [
                            914,
                            829,
                            853
                        ]
                    },
                    {
                        "id": 50,
                        "traits": [
                            875,
                            894,
                            893
                        ]
                    },
                    {
                        "id": 34,
                        "traits": [
                            2020,
                            1969,
                            2021
                        ]
                    }
                ],
                "skills": {
                    "heal": 10548,
                    "utilities": [
                        10546,
                        29414,
                        10622
                    ],
                    "elite": 30105
                },
                "aquatic_skills": {
                    "heal": 10548,
                    "utilities": [
                        10546,
                        10545,
                        10612
                    ],
                    "elite": 30105
                }
            }
            """.trimIndent()
        )
    }

}