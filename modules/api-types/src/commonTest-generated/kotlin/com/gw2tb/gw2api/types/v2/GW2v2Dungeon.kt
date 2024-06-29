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

class GW2v2DungeonTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Dungeon>(
            """
            {
                "id": "ascalonian_catacombs",
                "paths": [
                    {
                        "id": "ac_story",
                        "type": "Story"
                    },
                    {
                        "id": "hodgins",
                        "type": "Explorable"
                    },
                    {
                        "id": "detha",
                        "type": "Explorable"
                    },
                    {
                        "id": "tzark",
                        "type": "Explorable"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Dungeon>(
            """
            {
                "id": "caudecus_manor",
                "paths": [
                    {
                        "id": "cm_story",
                        "type": "Story"
                    },
                    {
                        "id": "asura",
                        "type": "Explorable"
                    },
                    {
                        "id": "seraph",
                        "type": "Explorable"
                    },
                    {
                        "id": "butler",
                        "type": "Explorable"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Dungeon>(
            """
            {
                "id": "twilight_arbor",
                "paths": [
                    {
                        "id": "ta_story",
                        "type": "Story"
                    },
                    {
                        "id": "leurent",
                        "type": "Explorable"
                    },
                    {
                        "id": "vevina",
                        "type": "Explorable"
                    },
                    {
                        "id": "aetherpath",
                        "type": "Explorable"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Dungeon>(
            """
            {
                "id": "sorrows_embrace",
                "paths": [
                    {
                        "id": "se_story",
                        "type": "Story"
                    },
                    {
                        "id": "fergg",
                        "type": "Explorable"
                    },
                    {
                        "id": "rasalov",
                        "type": "Explorable"
                    },
                    {
                        "id": "koptev",
                        "type": "Explorable"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Dungeon>(
            """
            {
                "id": "citadel_of_flame",
                "paths": [
                    {
                        "id": "cof_story",
                        "type": "Story"
                    },
                    {
                        "id": "ferrah",
                        "type": "Explorable"
                    },
                    {
                        "id": "magg",
                        "type": "Explorable"
                    },
                    {
                        "id": "rhiannon",
                        "type": "Explorable"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2Dungeon>(
            """
            {
                "id": "honor_of_the_waves",
                "paths": [
                    {
                        "id": "hotw_story",
                        "type": "Story"
                    },
                    {
                        "id": "butcher",
                        "type": "Explorable"
                    },
                    {
                        "id": "plunderer",
                        "type": "Explorable"
                    },
                    {
                        "id": "zealot",
                        "type": "Explorable"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2Dungeon>(
            """
            {
                "id": "crucible_of_eternity",
                "paths": [
                    {
                        "id": "coe_story",
                        "type": "Story"
                    },
                    {
                        "id": "submarine",
                        "type": "Explorable"
                    },
                    {
                        "id": "teleporter",
                        "type": "Explorable"
                    },
                    {
                        "id": "front_door",
                        "type": "Explorable"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2Dungeon>(
            """
            {
                "id": "ruined_city_of_arah",
                "paths": [
                    {
                        "id": "arah_story",
                        "type": "Story"
                    },
                    {
                        "id": "jotun",
                        "type": "Explorable"
                    },
                    {
                        "id": "mursaat",
                        "type": "Explorable"
                    },
                    {
                        "id": "forgotten",
                        "type": "Explorable"
                    },
                    {
                        "id": "seer",
                        "type": "Explorable"
                    }
                ]
            }
            """.trimIndent()
        )
    }

}