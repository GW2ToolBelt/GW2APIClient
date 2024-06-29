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

class GW2v2PvpStandingsTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2PvpStandings>(
            """
            {
                "current": {
                    "total_points": 56,
                    "division": 0,
                    "tier": 2,
                    "points": 16,
                    "repeats": 0,
                    "rating": 1252
                },
                "best": {
                    "total_points": 56,
                    "division": 0,
                    "tier": 2,
                    "points": 16,
                    "repeats": 0
                },
                "season_id": "088D9941-21E7-4335-A0C2-4365A8D46B1F"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2PvpStandings>(
            """
            {
                "current": {
                    "total_points": 35,
                    "division": 0,
                    "tier": 1,
                    "points": 15,
                    "repeats": 0,
                    "rating": 958
                },
                "best": {
                    "total_points": 35,
                    "division": 0,
                    "tier": 1,
                    "points": 15,
                    "repeats": 0
                },
                "season_id": "8EF1F7AD-D51F-4891-826F-6BFD067F4FDC"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2PvpStandings>(
            """
            {
                "current": {
                    "total_points": 343,
                    "division": 3,
                    "tier": 0,
                    "points": 3,
                    "repeats": 1,
                    "rating": 1208
                },
                "best": {
                    "total_points": 343,
                    "division": 3,
                    "tier": 0,
                    "points": 3,
                    "repeats": 1
                },
                "season_id": "91C6E5B8-6CA7-4C2B-9F8E-BCA8EDD0653A"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2PvpStandings>(
            """
            {
                "current": {
                    "total_points": 31,
                    "division": 0,
                    "tier": 1,
                    "points": 11,
                    "repeats": 0,
                    "rating": 1350
                },
                "best": {
                    "total_points": 31,
                    "division": 0,
                    "tier": 1,
                    "points": 11,
                    "repeats": 0
                },
                "season_id": "0D6725D3-16E4-4748-8386-AEEF61BCF0F4"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2PvpStandings>(
            """
            {
                "current": {
                    "total_points": 34,
                    "division": 0,
                    "tier": 1,
                    "points": 14,
                    "repeats": 0,
                    "rating": 1103
                },
                "best": {
                    "total_points": 34,
                    "division": 0,
                    "tier": 1,
                    "points": 14,
                    "repeats": 0
                },
                "season_id": "E6F9F96F-3DD9-449C-9D24-BC2EDF8FBD4E"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2PvpStandings>(
            """
            {
                "current": {
                    "total_points": 859,
                    "division": 5,
                    "tier": 0,
                    "points": 9,
                    "repeats": 2,
                    "rating": 1266,
                    "decay": 233
                },
                "best": {
                    "total_points": 859,
                    "division": 5,
                    "tier": 0,
                    "points": 9,
                    "repeats": 2
                },
                "season_id": "A54849B7-7DBD-4958-91EF-72E18CD659BA"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2PvpStandings>(
            """
            {
                "current": {
                    "total_points": 60,
                    "division": 1,
                    "tier": 0,
                    "points": 0,
                    "repeats": 0,
                    "rating": 1082
                },
                "best": {
                    "total_points": 60,
                    "division": 1,
                    "tier": 0,
                    "points": 0,
                    "repeats": 0
                },
                "season_id": "38A58E29-D4EB-4429-9226-D8C80DC7CF53"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2PvpStandings>(
            """
            {
                "current": {
                    "total_points": 105,
                    "division": 1,
                    "tier": 2,
                    "points": 5,
                    "repeats": 0,
                    "rating": 1150,
                    "decay": 600
                },
                "best": {
                    "total_points": 105,
                    "division": 1,
                    "tier": 2,
                    "points": 5,
                    "repeats": 0
                },
                "season_id": "B1B3AD3A-4EAA-4B54-8573-F5827DB47CBF"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2PvpStandings>(
            """
            {
                "current": {
                    "total_points": 293,
                    "division": 3,
                    "tier": 2,
                    "points": 13,
                    "repeats": 0,
                    "rating": 1185
                },
                "best": {
                    "total_points": 293,
                    "division": 3,
                    "tier": 2,
                    "points": 13,
                    "repeats": 0
                },
                "season_id": "336FF20F-D3FA-484C-B939-562180F98886"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2PvpStandings>(
            """
            {
                "current": {
                    "total_points": 26,
                    "division": 0,
                    "tier": 1,
                    "points": 6,
                    "repeats": 0,
                    "rating": 1280
                },
                "best": {
                    "total_points": 26,
                    "division": 0,
                    "tier": 1,
                    "points": 6,
                    "repeats": 0
                },
                "season_id": "99373A3D-1E25-447C-9E18-C347871AF239"
            }
            """.trimIndent()
        )
    }

}