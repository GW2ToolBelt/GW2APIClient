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

class GW2v2CharactersSABTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2CharactersSAB>(
            """
            {
                "zones": [
                    {
                        "id": 1,
                        "mode": "normal",
                        "world": 1,
                        "zone": 1
                    },
                    {
                        "id": 2,
                        "mode": "normal",
                        "world": 1,
                        "zone": 2
                    },
                    {
                        "id": 3,
                        "mode": "normal",
                        "world": 1,
                        "zone": 3
                    },
                    {
                        "id": 4,
                        "mode": "normal",
                        "world": 2,
                        "zone": 1
                    },
                    {
                        "id": 5,
                        "mode": "normal",
                        "world": 2,
                        "zone": 2
                    },
                    {
                        "id": 6,
                        "mode": "normal",
                        "world": 2,
                        "zone": 3
                    },
                    {
                        "id": 13,
                        "mode": "infantile",
                        "world": 1,
                        "zone": 1
                    },
                    {
                        "id": 14,
                        "mode": "infantile",
                        "world": 1,
                        "zone": 2
                    },
                    {
                        "id": 15,
                        "mode": "infantile",
                        "world": 1,
                        "zone": 3
                    },
                    {
                        "id": 16,
                        "mode": "infantile",
                        "world": 2,
                        "zone": 1
                    },
                    {
                        "id": 17,
                        "mode": "infantile",
                        "world": 2,
                        "zone": 2
                    },
                    {
                        "id": 18,
                        "mode": "infantile",
                        "world": 2,
                        "zone": 3
                    },
                    {
                        "id": 25,
                        "mode": "tribulation",
                        "world": 1,
                        "zone": 1
                    },
                    {
                        "id": 26,
                        "mode": "tribulation",
                        "world": 1,
                        "zone": 2
                    },
                    {
                        "id": 27,
                        "mode": "tribulation",
                        "world": 1,
                        "zone": 3
                    },
                    {
                        "id": 28,
                        "mode": "tribulation",
                        "world": 2,
                        "zone": 1
                    },
                    {
                        "id": 29,
                        "mode": "tribulation",
                        "world": 2,
                        "zone": 2
                    }
                ],
                "unlocks": [
                    {
                        "id": 1,
                        "name": "chain_stick"
                    },
                    {
                        "id": 3,
                        "name": "slingshot"
                    },
                    {
                        "id": 6,
                        "name": "whip"
                    },
                    {
                        "id": 9,
                        "name": "mini_bomb"
                    },
                    {
                        "id": 10
                    },
                    {
                        "id": 12,
                        "name": "candle"
                    },
                    {
                        "id": 13,
                        "name": "torch"
                    },
                    {
                        "id": 15,
                        "name": "wooden_whistle"
                    },
                    {
                        "id": 18,
                        "name": "digger"
                    },
                    {
                        "id": 19,
                        "name": "nice_scoop"
                    },
                    {
                        "id": 21,
                        "name": "glove_of_wisdom"
                    },
                    {
                        "id": 24,
                        "name": "bauble_purse"
                    },
                    {
                        "id": 25,
                        "name": "bauble_tote_bag"
                    },
                    {
                        "id": 27,
                        "name": "moto_breath"
                    },
                    {
                        "id": 28,
                        "name": "moto_finger"
                    },
                    {
                        "id": 31,
                        "name": "health_vessel_1"
                    },
                    {
                        "id": 32,
                        "name": "health_vessel_2"
                    },
                    {
                        "id": 34,
                        "name": "medium_health_potion"
                    }
                ],
                "songs": [
                    {
                        "id": 1,
                        "name": "secret_song"
                    },
                    {
                        "id": 2,
                        "name": "gatekeeper_lullaby"
                    },
                    {
                        "id": 3,
                        "name": "shatter_serenade"
                    }
                ]
            }
            """.trimIndent()
        )
    }

}