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

class GW2v2NoveltyTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Novelty>(
            """
            {
                "id": 1,
                "name": "Verschönerter Lenkdrachen",
                "description": "<c=@abilitytype>Getragener Gegenstand.</c> Rüstet ein Bündel als Dekoration aus, oder um Fertigkeiten einzusetzen, die nichts mit Kämpfen zu tun haben.",
                "icon": "https://render.guildwars2.com/file/7B043D640ED57517051D5FC038D7CDDDE5F82933/2015154.png",
                "slot": "HeldItem",
                "unlock_item": [
                    88124
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Novelty>(
            """
            {
                "id": 2,
                "name": "Melodische Bassgitarre",
                "description": "<c=@abilitytype>Musikinstrument.</c> Rüstet ein Instrument aus und spielt eine Melodie.",
                "icon": "https://render.guildwars2.com/file/2FD55ABA480D23E3740145B5802800554245DB11/960182.png",
                "slot": "Music",
                "unlock_item": [
                    36174
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Novelty>(
            """
            {
                "id": 3,
                "name": "Duskks Welt 2 Super-Ghettoblaster",
                "description": "<c=@abilitytype>Musikinstrument.</c> Rüstet ein Instrument aus und spielt eine Melodie.",
                "icon": "https://render.guildwars2.com/file/49126005BA2E197E5A60F9CFDA530EE432307776/1664072.png",
                "slot": "Music",
                "unlock_item": [
                    80932
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Novelty>(
            """
            {
                "id": 4,
                "name": "Wackelkopf-Labor",
                "description": "<c=@abilitytype>Spielzeug.</c> Setzt einen Extra-Gegenstand zum Interagieren ein.",
                "icon": "https://render.guildwars2.com/file/37E7F8187724466DF3E9C1D2AE03BD5D6F034BC4/819618.png",
                "slot": "Miscellaneous",
                "unlock_item": [
                    36172
                ]
            }
            """.trimIndent()
        )
    }

}