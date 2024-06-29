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

class GW2v2RaidTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Raid>(
            """
            {
                "id": "forsaken_thicket",
                "wings": [
                    {
                        "id": "spirit_vale",
                        "events": [
                            {
                                "id": "vale_guardian",
                                "type": "Boss"
                            },
                            {
                                "id": "spirit_woods",
                                "type": "Checkpoint"
                            },
                            {
                                "id": "gorseval",
                                "type": "Boss"
                            },
                            {
                                "id": "sabetha",
                                "type": "Boss"
                            }
                        ]
                    },
                    {
                        "id": "salvation_pass",
                        "events": [
                            {
                                "id": "slothasor",
                                "type": "Boss"
                            },
                            {
                                "id": "bandit_trio",
                                "type": "Boss"
                            },
                            {
                                "id": "matthias",
                                "type": "Boss"
                            }
                        ]
                    },
                    {
                        "id": "stronghold_of_the_faithful",
                        "events": [
                            {
                                "id": "escort",
                                "type": "Boss"
                            },
                            {
                                "id": "keep_construct",
                                "type": "Boss"
                            },
                            {
                                "id": "twisted_castle",
                                "type": "Checkpoint"
                            },
                            {
                                "id": "xera",
                                "type": "Boss"
                            }
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Raid>(
            """
            {
                "id": "bastion_of_the_penitent",
                "wings": [
                    {
                        "id": "bastion_of_the_penitent",
                        "events": [
                            {
                                "id": "cairn",
                                "type": "Boss"
                            },
                            {
                                "id": "mursaat_overseer",
                                "type": "Boss"
                            },
                            {
                                "id": "samarog",
                                "type": "Boss"
                            },
                            {
                                "id": "deimos",
                                "type": "Boss"
                            }
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Raid>(
            """
            {
                "id": "hall_of_chains",
                "wings": [
                    {
                        "id": "hall_of_chains",
                        "events": [
                            {
                                "id": "soulless_horror",
                                "type": "Boss"
                            },
                            {
                                "id": "river_of_souls",
                                "type": "Boss"
                            },
                            {
                                "id": "statues_of_grenth",
                                "type": "Boss"
                            },
                            {
                                "id": "voice_in_the_void",
                                "type": "Boss"
                            }
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Raid>(
            """
            {
                "id": "mythwright_gambit",
                "wings": [
                    {
                        "id": "mythwright_gambit",
                        "events": [
                            {
                                "id": "conjured_amalgamate",
                                "type": "Boss"
                            },
                            {
                                "id": "twin_largos",
                                "type": "Boss"
                            },
                            {
                                "id": "qadim",
                                "type": "Boss"
                            }
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Raid>(
            """
            {
                "id": "the_key_of_ahdashim",
                "wings": [
                    {
                        "id": "the_key_of_ahdashim",
                        "events": [
                            {
                                "id": "gate",
                                "type": "Checkpoint"
                            },
                            {
                                "id": "adina",
                                "type": "Boss"
                            },
                            {
                                "id": "sabir",
                                "type": "Boss"
                            },
                            {
                                "id": "qadim_the_peerless",
                                "type": "Boss"
                            }
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }

}