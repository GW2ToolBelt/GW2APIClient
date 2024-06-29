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

class GW2v2QuagganTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "404",
                "url": "https://static.staticwars.com/quaggans/404.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "aloha",
                "url": "https://static.staticwars.com/quaggans/aloha.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "attack",
                "url": "https://static.staticwars.com/quaggans/attack.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "bear",
                "url": "https://static.staticwars.com/quaggans/bear.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "bowl",
                "url": "https://static.staticwars.com/quaggans/bowl.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "box",
                "url": "https://static.staticwars.com/quaggans/box.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "breakfast",
                "url": "https://static.staticwars.com/quaggans/breakfast.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "bubble",
                "url": "https://static.staticwars.com/quaggans/bubble.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "cake",
                "url": "https://static.staticwars.com/quaggans/cake.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "cheer",
                "url": "https://static.staticwars.com/quaggans/cheer.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "coffee",
                "url": "https://static.staticwars.com/quaggans/coffee.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "construction",
                "url": "https://static.staticwars.com/quaggans/construction.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "cow",
                "url": "https://static.staticwars.com/quaggans/cow.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "cry",
                "url": "https://static.staticwars.com/quaggans/cry.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "elf",
                "url": "https://static.staticwars.com/quaggans/elf.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "ghost",
                "url": "https://static.staticwars.com/quaggans/ghost.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "girl",
                "url": "https://static.staticwars.com/quaggans/girl.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "hat",
                "url": "https://static.staticwars.com/quaggans/hat.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "helmut",
                "url": "https://static.staticwars.com/quaggans/helmut.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "hoodie-down",
                "url": "https://static.staticwars.com/quaggans/hoodie-down.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "hoodie-up",
                "url": "https://static.staticwars.com/quaggans/hoodie-up.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "killerwhale",
                "url": "https://static.staticwars.com/quaggans/killerwhale.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "knight",
                "url": "https://static.staticwars.com/quaggans/knight.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "lollipop",
                "url": "https://static.staticwars.com/quaggans/lollipop.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "lost",
                "url": "https://static.staticwars.com/quaggans/lost.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "moving",
                "url": "https://static.staticwars.com/quaggans/moving.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_26() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "party",
                "url": "https://static.staticwars.com/quaggans/party.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_27() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "present",
                "url": "https://static.staticwars.com/quaggans/present.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_28() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "quaggan",
                "url": "https://static.staticwars.com/quaggans/quaggan.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_29() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "rain",
                "url": "https://static.staticwars.com/quaggans/rain.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_30() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "scifi",
                "url": "https://static.staticwars.com/quaggans/scifi.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_31() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "seahawks",
                "url": "https://static.staticwars.com/quaggans/seahawks.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_32() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "sleep",
                "url": "https://static.staticwars.com/quaggans/sleep.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_33() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "summer",
                "url": "https://static.staticwars.com/quaggans/summer.jpg"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_34() {
        json.decodeFromString<GW2v2Quaggan>(
            """
            {
                "id": "vacation",
                "url": "https://static.staticwars.com/quaggans/vacation.jpg"
            }
            """.trimIndent()
        )
    }

}