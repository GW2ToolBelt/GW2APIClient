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

class GW2v2AccountWizardsVaultWeeklyTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2AccountWizardsVaultWeekly>(
            """
            {
                "meta_progress_current": 2,
                "meta_progress_complete": 6,
                "meta_reward_item_id": 100137,
                "meta_reward_astral": 450,
                "meta_reward_claimed": false,
                "objectives": [
                    {
                        "id": 59,
                        "title": "Defeat 1 Legendary-Rank Enemy",
                        "track": "PvE",
                        "acclaim": 50,
                        "progress_current": 1,
                        "progress_complete": 1,
                        "claimed": true
                    },
                    {
                        "id": 57,
                        "title": "Complete 10 Events",
                        "track": "PvE",
                        "acclaim": 50,
                        "progress_current": 1,
                        "progress_complete": 10,
                        "claimed": false
                    },
                    {
                        "id": 100,
                        "title": "Salvage 50 Items",
                        "track": "PvE",
                        "acclaim": 50,
                        "progress_current": 50,
                        "progress_complete": 50,
                        "claimed": true
                    },
                    {
                        "id": 146,
                        "title": "Complete the Crimson Plateau Jumping Puzzle",
                        "track": "PvE",
                        "acclaim": 50,
                        "progress_current": 0,
                        "progress_complete": 1,
                        "claimed": false
                    },
                    {
                        "id": 31,
                        "title": "Defeat the Great Jungle Wurm World Boss or Complete Events in Caledon Forest",
                        "track": "PvE",
                        "acclaim": 50,
                        "progress_current": 0,
                        "progress_complete": 10,
                        "claimed": false
                    },
                    {
                        "id": 63,
                        "title": "Complete 1 Fractal in the Fractals of the Mists",
                        "track": "PvE",
                        "acclaim": 50,
                        "progress_current": 0,
                        "progress_complete": 1,
                        "claimed": false
                    },
                    {
                        "id": 143,
                        "title": "Defeat 100 Jade Mechs or Inquest",
                        "track": "PvE",
                        "acclaim": 50,
                        "progress_current": 0,
                        "progress_complete": 100,
                        "claimed": false
                    },
                    {
                        "id": 197,
                        "title": "Complete Battle in Tarir Meta-Event, Events in Auric Basin, or Events in Ascalon",
                        "track": "PvE",
                        "acclaim": 50,
                        "progress_current": 0,
                        "progress_complete": 15,
                        "claimed": false
                    }
                ]
            }
            """.trimIndent()
        )
    }

}