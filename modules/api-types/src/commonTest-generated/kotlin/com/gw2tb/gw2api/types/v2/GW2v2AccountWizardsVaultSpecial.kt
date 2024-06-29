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

class GW2v2AccountWizardsVaultSpecialTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2AccountWizardsVaultSpecial>(
            """
            {
                "objectives": [
                    {
                        "id": 231,
                        "title": "Complete the Story Chapter Eventide's March",
                        "track": "PvE",
                        "acclaim": 500,
                        "progress_current": 1,
                        "progress_complete": 1,
                        "claimed": true
                    },
                    {
                        "id": 229,
                        "title": "Defeat Knaebelag the Terror and Complete the Fangs That Gnash Achievement",
                        "track": "PvE",
                        "acclaim": 500,
                        "progress_current": 1,
                        "progress_complete": 1,
                        "claimed": true
                    },
                    {
                        "id": 240,
                        "title": "Complete Tier 1 of an Artisan of Arms Achievement",
                        "track": "PvE",
                        "acclaim": 300,
                        "progress_current": 0,
                        "progress_complete": 1,
                        "claimed": false
                    },
                    {
                        "id": 241,
                        "title": "Defeat Legendary Kryptis during Convergences",
                        "track": "PvE",
                        "acclaim": 300,
                        "progress_current": 2,
                        "progress_complete": 2,
                        "claimed": true
                    },
                    {
                        "id": 233,
                        "title": "Complete the Temple of Febe Strike Mission",
                        "track": "PvE",
                        "acclaim": 400,
                        "progress_current": 1,
                        "progress_complete": 3,
                        "claimed": false
                    },
                    {
                        "id": 243,
                        "title": "Complete the Inner Nayos: Nyedra Surrounds Savior Achievement",
                        "track": "PvE",
                        "acclaim": 300,
                        "progress_current": 1,
                        "progress_complete": 1,
                        "claimed": true
                    },
                    {
                        "id": 236,
                        "title": "Complete the Inner Nayos Mastery II Achievement",
                        "track": "PvE",
                        "acclaim": 300,
                        "progress_current": 1,
                        "progress_complete": 1,
                        "claimed": true
                    },
                    {
                        "id": 245,
                        "title": "Legendary Armor 3: Forge a Piece of Legendary Obsidian Armor",
                        "track": "PvE",
                        "acclaim": 500,
                        "progress_current": 1,
                        "progress_complete": 1,
                        "claimed": true
                    },
                    {
                        "id": 234,
                        "title": "Legendary Armor 2: Complete an Astral Legendary Armor Achievement",
                        "track": "PvE",
                        "acclaim": 300,
                        "progress_current": 1,
                        "progress_complete": 1,
                        "claimed": true
                    },
                    {
                        "id": 244,
                        "title": "Legendary Armor 1: Speak With Lyhr about Armor Crafting",
                        "track": "PvE",
                        "acclaim": 150,
                        "progress_current": 1,
                        "progress_complete": 1,
                        "claimed": true
                    },
                    {
                        "id": 235,
                        "title": "(Festival) Complete the (Annual) Super Adventure Box Nostalgia Achievement",
                        "track": "PvE",
                        "acclaim": 300,
                        "progress_current": 1,
                        "progress_complete": 1,
                        "claimed": true
                    },
                    {
                        "id": 228,
                        "title": "(Festival) Complete the (Annual) World 1 Classic Achievement",
                        "track": "PvE",
                        "acclaim": 100,
                        "progress_current": 1,
                        "progress_complete": 1,
                        "claimed": true
                    },
                    {
                        "id": 242,
                        "title": "(Festival) Complete the (Annual) World 2 Classic Achievement",
                        "track": "PvE",
                        "acclaim": 100,
                        "progress_current": 1,
                        "progress_complete": 1,
                        "claimed": true
                    },
                    {
                        "id": 230,
                        "title": "(Festival) Complete the (Annual) Zone Runner Achievement",
                        "track": "PvE",
                        "acclaim": 100,
                        "progress_current": 1,
                        "progress_complete": 1,
                        "claimed": true
                    }
                ]
            }
            """.trimIndent()
        )
    }

}