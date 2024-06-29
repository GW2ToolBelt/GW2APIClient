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

class GW2v2PvpStatsTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2PvpStats>(
            """
            {
                "pvp_rank": 41,
                "pvp_rank_points": 321074,
                "pvp_rank_rollovers": 0,
                "aggregate": {
                    "wins": 226,
                    "losses": 207,
                    "desertions": 0,
                    "byes": 8,
                    "forfeits": 4
                },
                "professions": {
                    "elementalist": {
                        "wins": 114,
                        "losses": 114,
                        "desertions": 0,
                        "byes": 6,
                        "forfeits": 2
                    },
                    "engineer": {
                        "wins": 1,
                        "losses": 0,
                        "desertions": 0,
                        "byes": 0,
                        "forfeits": 0
                    },
                    "guardian": {
                        "wins": 5,
                        "losses": 2,
                        "desertions": 0,
                        "byes": 0,
                        "forfeits": 0
                    },
                    "mesmer": {
                        "wins": 29,
                        "losses": 28,
                        "desertions": 0,
                        "byes": 2,
                        "forfeits": 1
                    },
                    "necromancer": {
                        "wins": 17,
                        "losses": 22,
                        "desertions": 0,
                        "byes": 0,
                        "forfeits": 1
                    },
                    "ranger": {
                        "wins": 17,
                        "losses": 10,
                        "desertions": 0,
                        "byes": 0,
                        "forfeits": 0
                    },
                    "revenant": {
                        "wins": 40,
                        "losses": 21,
                        "desertions": 0,
                        "byes": 0,
                        "forfeits": 0
                    },
                    "thief": {
                        "wins": 3,
                        "losses": 7,
                        "desertions": 0,
                        "byes": 0,
                        "forfeits": 0
                    },
                    "warrior": {
                        "wins": 0,
                        "losses": 3,
                        "desertions": 0,
                        "byes": 0,
                        "forfeits": 0
                    }
                },
                "ladders": {
                    "2v2ranked": {
                        "wins": 26,
                        "losses": 26,
                        "desertions": 0,
                        "byes": 0,
                        "forfeits": 0
                    },
                    "ranked": {
                        "wins": 94,
                        "losses": 92,
                        "desertions": 0,
                        "byes": 7,
                        "forfeits": 4
                    },
                    "unranked": {
                        "wins": 11,
                        "losses": 8,
                        "desertions": 0,
                        "byes": 1,
                        "forfeits": 0
                    }
                }
            }
            """.trimIndent()
        )
    }

}