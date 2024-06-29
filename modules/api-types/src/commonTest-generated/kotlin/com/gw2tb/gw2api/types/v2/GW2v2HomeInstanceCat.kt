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

class GW2v2HomeInstanceCatTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "chicken",
                "id": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "grilled_chicken",
                "id": 2
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "spicy_flank",
                "id": 3
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "spicier_flank",
                "id": 4
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "fire_flank",
                "id": 5
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "prickley_pear_sorbet",
                "id": 6
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "ginger_lime_icecream",
                "id": 7
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "saffron_mango_icecream",
                "id": 8
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "peach_raspberry_icecream",
                "id": 9
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "chicken_day",
                "id": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "chicken_night",
                "id": 11
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "warrior",
                "id": 12
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "mesmer",
                "id": 13
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "ranger",
                "id": 14
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "guardian",
                "id": 15
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "elementalist",
                "id": 16
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "engineer",
                "id": 17
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "revenant",
                "id": 18
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "thief",
                "id": 19
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "necromancer",
                "id": 20
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "lava_skritt",
                "id": 21
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "ghost_peppers",
                "id": 22
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "halloween",
                "id": 23
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "snow_leopard",
                "id": 24
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "frozen",
                "id": 25
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "ice",
                "id": 26
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_26() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "freezer",
                "id": 27
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_27() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "cold",
                "id": 28
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_28() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "cadeucus",
                "id": 29
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_29() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "ghost",
                "id": 32
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_30() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "sab",
                "id": 33
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_31() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "holographic",
                "id": 34
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_32() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "simon",
                "id": 35
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_33() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "wvw_alpine",
                "id": 36
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_34() {
        json.decodeFromString<GW2v2HomeInstanceCat>(
            """
            {
                "hint": "wvw_desert",
                "id": 37
            }
            """.trimIndent()
        )
    }

}