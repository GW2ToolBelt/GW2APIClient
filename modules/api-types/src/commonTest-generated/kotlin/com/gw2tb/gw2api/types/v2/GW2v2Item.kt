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

class GW2v2ItemTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Item>(
            """
            {
                "name": "((208738))",
                "description": "",
                "type": "Weapon",
                "level": 0,
                "rarity": "Basic",
                "vendor_value": 0,
                "default_skin": 2809,
                "game_types": [
                    "Activity",
                    "Wvw",
                    "Dungeon",
                    "Pve"
                ],
                "flags": [
                    "NoSell",
                    "SoulbindOnAcquire",
                    "SoulBindOnUse"
                ],
                "restrictions": [],
                "id": 6,
                "chat_link": "[&AgEGAAAA]",
                "icon": "https://render.guildwars2.com/file/CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4/60984.png",
                "details": {
                    "type": "SmallBundle",
                    "damage_type": "Choking",
                    "min_power": 105,
                    "max_power": 117,
                    "defense": 0,
                    "infusion_slots": [],
                    "attribute_adjustment": 7.8
                }
            }
            """.trimIndent()
        )
    }

}