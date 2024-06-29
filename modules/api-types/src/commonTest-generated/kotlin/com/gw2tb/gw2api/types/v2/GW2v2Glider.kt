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

class GW2v2GliderTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Glider>(
            """
            {
                "id": 1,
                "unlock_items": [
                    70048
                ],
                "order": 3,
                "icon": "https://render.guildwars2.com/file/5978F84C08E69460B7FD34346745E7183562A35A/951784.png",
                "name": "Schwarzfederflügel-Gleitschirm",
                "description": "<c=@reminder>Nur für begrenzte Zeit über die Schwarzlöwen-Handelsgesellschaft erhältlich.</c>\n\nWenn Ihr einen Schwarzfederflügel-Rucksack tragt, sprecht mit einem Späher in der Grasgrünen Schwelle, um kostenlos einen passenden Gleitschirm zu erhalten.",
                "default_dyes": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Glider>(
            """
            {
                "id": 83,
                "unlock_items": [
                    92564
                ],
                "order": 75,
                "icon": "https://render.guildwars2.com/file/0608D69C09FD723E97EBE00E6F0CD83F5D1FBA63/2236610.png",
                "name": "Sternenlicht-Flügel-Gleitschirm",
                "description": "Dieser Gleitschirm kann eingefärbt werden.\n\n<c=@reminder>Nur zu bestimmten Zeiten des Jahres ausschließlich in Schwarzlöwen-Truhen zu finden.</c>",
                "default_dyes": [
                    315,
                    710,
                    78,
                    603
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Glider>(
            """
            {
                "id": 84,
                "unlock_items": [
                    92689
                ],
                "order": 76,
                "icon": "https://render.guildwars2.com/file/77DEEFAFD5795A1AE6FF5ACFE0B0E8391D750C97/2247642.png",
                "name": "Walgeist-Gleitschirm",
                "description": "Dieser Gleitschirm kann eingefärbt werden.\n\n<c=@reminder>Nur zu bestimmten Zeiten des Jahres ausschließlich in Schwarzlöwen-Truhen zu finden.</c>",
                "default_dyes": [
                    640,
                    691,
                    1539,
                    615
                ]
            }
            """.trimIndent()
        )
    }

}