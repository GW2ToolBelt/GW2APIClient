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

class GW2v2MiniTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Mini>(
            """
            {
                "id": 1,
                "name": "Mini Rytlock",
                "icon": "https://render.guildwars2.com/file/795ED1B945A29EC3E3066797DF57FFB25ABAA631/340551.png",
                "order": 1,
                "item_id": 21047
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Mini>(
            """
            {
                "id": 2,
                "name": "Mini Servitor-Golem",
                "icon": "https://render.guildwars2.com/file/B3DC031CFBF3A257A058C4FC41C8450AD510A7CD/65888.png",
                "order": 1,
                "item_id": 20949
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Mini>(
            """
            {
                "id": 3,
                "name": "Mini Felsfell-Waschbär",
                "icon": "https://render.guildwars2.com/file/107AF7A2AE7EC90C5EF9066A27BB7C320F977CBB/62861.png",
                "order": 1,
                "item_id": 20950
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Mini>(
            """
            {
                "id": 4,
                "name": "Mini Orangefarbene Tigerkatze",
                "icon": "https://render.guildwars2.com/file/E0A25EF9B503E4801967F3AE27C310486BE7CF45/65887.png",
                "order": 1,
                "item_id": 20948
            }
            """.trimIndent()
        )
    }

}