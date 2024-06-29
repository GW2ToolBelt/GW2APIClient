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

class GW2v2OutfitTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Outfit>(
            """
            {
                "id": 1,
                "name": "Koch-Kleidungsset",
                "icon": "https://render.guildwars2.com/file/1509D1B76FCECC111E28D2F50EBEAD5DA102995A/340522.png",
                "unlock_items": [
                    64756
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Outfit>(
            """
            {
                "id": 2,
                "name": "\"Verrückter König\"-Kleidungsset",
                "icon": "https://render.guildwars2.com/file/041DC1695CF0DD1A4438D45ACB036C510E1AFFB4/499488.png",
                "unlock_items": [
                    65196
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Outfit>(
            """
            {
                "id": 3,
                "name": "Piratenkapitän-Kleidungsset",
                "icon": "https://render.guildwars2.com/file/983CE77CC0D921A1EE100D4ECFFE3F01FC61CC6B/66637.png",
                "unlock_items": [
                    64754
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Outfit>(
            """
            {
                "id": 4,
                "name": "Hexen-Kleidungsset",
                "icon": "https://render.guildwars2.com/file/F90DEF6BD1FA9EE60DC93BA31B0D367EBA60EC7A/499499.png",
                "unlock_items": [
                    65201
                ]
            }
            """.trimIndent()
        )
    }

}