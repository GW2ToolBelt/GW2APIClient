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

class GW2v2PvpGameTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2PvpGame>(
            """
            {
                "id": "198AB946-2171-48A0-9885-03095F9DD122",
                "map_id": 795,
                "started": "2020-06-30T11:53:34.695Z",
                "ended": "2020-06-30T12:04:01.695Z",
                "result": "Victory",
                "team": "Red",
                "profession": "Revenant",
                "rating_type": "Ranked",
                "rating_change": 47,
                "season": "088D9941-21E7-4335-A0C2-4365A8D46B1F",
                "scores": {
                    "red": 502,
                    "blue": 441
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2PvpGame>(
            """
            {
                "id": "3C87857E-9EF1-4F79-8481-F40FE23058FC",
                "map_id": 795,
                "started": "2020-06-30T11:41:17.076Z",
                "ended": "2020-06-30T11:50:05.076Z",
                "result": "Victory",
                "team": "Red",
                "profession": "Revenant",
                "rating_type": "Ranked",
                "rating_change": 43,
                "season": "088D9941-21E7-4335-A0C2-4365A8D46B1F",
                "scores": {
                    "red": 501,
                    "blue": 223
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2PvpGame>(
            """
            {
                "id": "7225A964-5410-4944-AAC1-1A74EF405371",
                "map_id": 1328,
                "started": "2020-08-16T21:58:03.920Z",
                "ended": "2020-08-16T21:58:41.920Z",
                "result": "Defeat",
                "team": "Blue",
                "profession": "Revenant",
                "rating_type": "2v2Ranked",
                "rating_change": -68,
                "season": "E6F9F96F-3DD9-449C-9D24-BC2EDF8FBD4E",
                "scores": {
                    "red": 0,
                    "blue": 0
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2PvpGame>(
            """
            {
                "id": "927BE792-3794-4417-85F0-45B01C736982",
                "map_id": 1200,
                "started": "2020-08-16T22:03:15.632Z",
                "ended": "2020-08-16T22:04:37.632Z",
                "result": "Victory",
                "team": "Blue",
                "profession": "Revenant",
                "rating_type": "2v2Ranked",
                "rating_change": 56,
                "season": "E6F9F96F-3DD9-449C-9D24-BC2EDF8FBD4E",
                "scores": {
                    "red": 0,
                    "blue": 0
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2PvpGame>(
            """
            {
                "id": "B27E109E-C6F9-4A08-800D-78FDC4D394F2",
                "map_id": 1200,
                "started": "2020-08-16T22:15:38.899Z",
                "ended": "2020-08-16T22:16:04.899Z",
                "result": "Defeat",
                "team": "Red",
                "profession": "Revenant",
                "rating_type": "2v2Ranked",
                "rating_change": -48,
                "season": "E6F9F96F-3DD9-449C-9D24-BC2EDF8FBD4E",
                "scores": {
                    "red": 0,
                    "blue": 0
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2PvpGame>(
            """
            {
                "id": "C78896A4-4E42-4D58-B6D7-9DA008F48217",
                "map_id": 1200,
                "started": "2020-08-16T22:23:02.325Z",
                "ended": "2020-08-16T22:24:15.325Z",
                "result": "Victory",
                "team": "Red",
                "profession": "Revenant",
                "rating_type": "2v2Ranked",
                "rating_change": 46,
                "season": "E6F9F96F-3DD9-449C-9D24-BC2EDF8FBD4E",
                "scores": {
                    "red": 0,
                    "blue": 0
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2PvpGame>(
            """
            {
                "id": "CEA121FD-88DE-4B79-8C98-BA3068CDF388",
                "map_id": 1328,
                "started": "2020-08-16T21:48:11.830Z",
                "ended": "2020-08-16T21:48:45.830Z",
                "result": "Defeat",
                "team": "Red",
                "profession": "Revenant",
                "rating_type": "2v2Ranked",
                "rating_change": -87,
                "season": "E6F9F96F-3DD9-449C-9D24-BC2EDF8FBD4E",
                "scores": {
                    "red": 0,
                    "blue": 0
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2PvpGame>(
            """
            {
                "id": "D3F73C07-B4C6-42CE-8816-58ECB411C9B0",
                "map_id": 1171,
                "started": "2020-06-30T11:23:13.816Z",
                "ended": "2020-06-30T11:36:47.816Z",
                "result": "Defeat",
                "team": "Blue",
                "profession": "Revenant",
                "rating_type": "Ranked",
                "rating_change": -50,
                "season": "088D9941-21E7-4335-A0C2-4365A8D46B1F",
                "scores": {
                    "red": 500,
                    "blue": 414
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2PvpGame>(
            """
            {
                "id": "D7B36ACB-FBE4-4D75-9092-C0273E951CBB",
                "map_id": 1171,
                "started": "2020-06-28T13:42:19.874Z",
                "ended": "2020-06-28T13:52:52.874Z",
                "result": "Victory",
                "team": "Blue",
                "profession": "Revenant",
                "rating_type": "Ranked",
                "rating_change": 60,
                "season": "088D9941-21E7-4335-A0C2-4365A8D46B1F",
                "scores": {
                    "red": 325,
                    "blue": 500
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2PvpGame>(
            """
            {
                "id": "E5F0E1D1-E400-43F8-9241-A41356CA43C7",
                "map_id": 900,
                "started": "2020-10-01T19:11:19.039Z",
                "ended": "2020-10-01T19:15:04.039Z",
                "result": "Defeat",
                "team": "Red",
                "profession": "Necromancer",
                "rating_type": "None",
                "scores": {
                    "red": 0,
                    "blue": 502
                }
            }
            """.trimIndent()
        )
    }

}