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

class GW2v2PvpSeasonsLeaderboardEntryTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2PvpSeasonsLeaderboardEntry>(
            """
            {
                "name": "Make Pvp Great Again",
                "id": "7D608B72-9AFD-E511-80D3-AC162DC085C0",
                "team": "Triple Q",
                "team_id": 20,
                "rank": 1,
                "date": "2016-07-11T11:48:39Z",
                "scores": [
                    {
                        "id": "16F74226-5DDF-4FE7-ADC5-72A49DA30572",
                        "value": 1736
                    },
                    {
                        "id": "9A9CB2FD-7D73-4DFE-8FDD-A97A9C7C0B0C",
                        "value": 64
                    },
                    {
                        "id": "9064DD25-2C75-48D6-88C9-7FAD18DC784D",
                        "value": 10
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2PvpSeasonsLeaderboardEntry>(
            """
            {
                "name": "How Can You Be So Bad At This",
                "id": "C21EBC70-04EE-E511-80D3-E4115BD7B405",
                "team": "We Premade In Sapphire With Ts",
                "team_id": 4,
                "rank": 2,
                "date": "2016-07-10T16:25:08Z",
                "scores": [
                    {
                        "id": "16F74226-5DDF-4FE7-ADC5-72A49DA30572",
                        "value": 1688
                    },
                    {
                        "id": "9A9CB2FD-7D73-4DFE-8FDD-A97A9C7C0B0C",
                        "value": 53
                    },
                    {
                        "id": "9064DD25-2C75-48D6-88C9-7FAD18DC784D",
                        "value": 7
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2PvpSeasonsLeaderboardEntry>(
            """
            {
                "name": "Obindo.6802",
                "rank": 1,
                "date": "2016-07-11T16:27:45Z",
                "scores": [
                    {
                        "id": "E6487336-4B5B-4BFA-9CFA-9FF232CAEF85",
                        "value": 49
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2PvpSeasonsLeaderboardEntry>(
            """
            {
                "name": "lex.2164",
                "rank": 2,
                "date": "2016-07-09T12:21:49Z",
                "scores": [
                    {
                        "id": "E6487336-4B5B-4BFA-9CFA-9FF232CAEF85",
                        "value": 46
                    }
                ]
            }
            """.trimIndent()
        )
    }

}