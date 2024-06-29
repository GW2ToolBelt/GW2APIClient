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

class GW2v2SkiffTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Skiff>(
            """
            {
                "id": 410,
                "name": "Fishing Skiff",
                "icon": "https://render.guildwars2.com/file/BC08E6346DBFA290A4BE58AE073C9BA1029A57BB/2593817.png",
                "dye_slots": [
                    {
                        "color_id": 376,
                        "material": "metal"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Skiff>(
            """
            {
                "id": 413,
                "name": "Shing Jea Dragon Boat",
                "icon": "https://render.guildwars2.com/file/1055EEB4C9C4EEE1C8A23F08A7C6C303A01E14C0/2472117.png",
                "dye_slots": [
                    {
                        "color_id": 1153,
                        "material": "metal"
                    },
                    {
                        "color_id": 134,
                        "material": "metal"
                    },
                    {
                        "color_id": 1365,
                        "material": "metal"
                    },
                    {
                        "color_id": 90,
                        "material": "metal"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Skiff>(
            """
            {
                "id": 420,
                "name": "Crescent Canoe",
                "icon": "https://render.guildwars2.com/file/0DBDEE02C192D0D417CA01F8532D736C332FF264/2660058.png",
                "dye_slots": [
                    {
                        "color_id": 67,
                        "material": "metal"
                    },
                    {
                        "color_id": 14,
                        "material": "metal"
                    },
                    {
                        "color_id": 454,
                        "material": "metal"
                    },
                    {
                        "color_id": 650,
                        "material": "metal"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Skiff>(
            """
            {
                "id": 428,
                "name": "Winged Reverie Skiff",
                "icon": "https://render.guildwars2.com/file/980F42F02FDED3C65DC36CAE4EA254FF05CB7812/2666733.png",
                "dye_slots": [
                    {
                        "color_id": 456,
                        "material": "metal"
                    },
                    {
                        "color_id": 608,
                        "material": "metal"
                    },
                    {
                        "color_id": 1365,
                        "material": "metal"
                    },
                    {
                        "color_id": 477,
                        "material": "metal"
                    }
                ]
            }
            """.trimIndent()
        )
    }

}