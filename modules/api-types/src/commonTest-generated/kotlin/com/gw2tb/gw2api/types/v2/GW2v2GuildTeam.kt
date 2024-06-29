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

class GW2v2GuildTeamTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2GuildTeam>(
            """
            {
                "id": 1,
                "members": [
                    {
                        "name": "Lawton.9413",
                        "role": "Captain"
                    },
                    {
                        "name": "NotLawton.3149",
                        "role": "Member"
                    }
                ],
                "name": "1v1 Me Bro",
                "aggregate": {
                    "wins": 3,
                    "losses": 0,
                    "desertions": 0,
                    "byes": 0,
                    "forfeits": 0
                },
                "ladders": {
                    "unranked": {
                        "wins": 3,
                        "losses": 0,
                        "desertions": 0,
                        "byes": 0,
                        "forfeits": 0
                    }
                },
                "games": [
                    {
                        "id": "98EBE4DC-E36B-4A6C-A38C-A5B898AF53A4",
                        "map_id": 549,
                        "started": "2015-08-29T13:42:45.000Z",
                        "ended": "2015-08-29T13:53:49.000Z",
                        "result": "Victory",
                        "team": "Blue",
                        "scores": {
                            "red": 344,
                            "blue": 500
                        },
                        "rating_type": "Ranked"
                    }
                ],
                "seasons": [
                    {
                        "id": "44B85826-B5ED-4890-8C77-82DDF9F2CF2B",
                        "wins": 1,
                        "losses": 0,
                        "rating": 1437
                    }
                ]
            }
            """.trimIndent()
        )
    }

}