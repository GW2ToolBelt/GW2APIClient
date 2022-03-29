/*
 * Copyright (c) 2018-2021 Leon Linhart
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

class GW2v2RecipeTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Recipe>(
            """
            {
                "type": "Refinement",
                "output_item_id": 19713,
                "output_item_count": 1,
                "min_rating": 75,
                "time_to_craft_ms": 2000,
                "disciplines": [
                    "Artificer",
                    "Weaponsmith",
                    "Scribe",
                    "Huntsman"
                ],
                "flags": [
                    "AutoLearned"
                ],
                "ingredients": [
                    {
                        "item_id": 19726,
                        "count": 2
                    }
                ],
                "id": 1,
                "chat_link": "[&CQEAAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Recipe>(
            """
            {
                "type": "Insignia",
                "output_item_id": 19801,
                "output_item_count": 1,
                "min_rating": 50,
                "time_to_craft_ms": 1000,
                "disciplines": [
                    "Leatherworker",
                    "Armorsmith",
                    "Tailor"
                ],
                "flags": [
                    "AutoLearned"
                ],
                "ingredients": [
                    {
                        "item_id": 71307,
                        "count": 1
                    },
                    {
                        "item_id": 24284,
                        "count": 8
                    }
                ],
                "id": 50,
                "chat_link": "[&CTIAAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Recipe>(
            """
            {
                "type": "Speargun",
                "output_item_id": 14667,
                "output_item_count": 1,
                "min_rating": 300,
                "time_to_craft_ms": 1000,
                "disciplines": [
                    "Huntsman"
                ],
                "flags": [
                ],
                "ingredients": [
                    {
                        "item_id": 19786,
                        "count": 1
                    },
                    {
                        "item_id": 12950,
                        "count": 1
                    },
                    {
                        "item_id": 13052,
                        "count": 1
                    }
                ],
                "id": 5042,
                "chat_link": "[&CbITAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Recipe>(
            """
            {
                "type": "Component",
                "output_item_id": 13058,
                "output_item_count": 1,
                "min_rating": 225,
                "time_to_craft_ms": 1000,
                "disciplines": [
                    "Huntsman"
                ],
                "flags": [
                    "AutoLearned"
                ],
                "ingredients": [
                    {
                        "item_id": 19681,
                        "count": 2
                    }
                ],
                "id": 5087,
                "chat_link": "[&Cd8TAAA=]"
            }
            """.trimIndent()
        )
    }

}