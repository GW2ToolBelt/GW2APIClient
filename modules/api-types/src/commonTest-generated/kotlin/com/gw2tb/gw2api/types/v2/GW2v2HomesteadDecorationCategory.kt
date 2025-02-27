/*
 * Copyright (c) 2018-2025 Leon Linhart
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

class GW2v2HomesteadDecorationCategoryTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 1,
                "name": "Architecture"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 2,
                "name": "Table, Seating, Etc."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 3,
                "name": "Storage"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 4,
                "name": "Decor"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 5,
                "name": "Lighting"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 6,
                "name": "Planters and Topiaries"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 7,
                "name": "Trees and Foliage"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 8,
                "name": "Natural Features"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 9,
                "name": "Sculptures"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 10,
                "name": "Flags, Signs, Markers, Etc."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 11,
                "name": "Weapons and Traps"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 12,
                "name": "Trophies"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 13,
                "name": "Racing"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 14,
                "name": "Other"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 15,
                "name": "Heart of Thorns"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 16,
                "name": "Path of Fire"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 17,
                "name": "End of Dragons"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 18,
                "name": "Secrets of the Obscure"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 19,
                "name": "Janthir Wilds"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 20,
                "name": "Lunar New Year"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 21,
                "name": "Super Adventure Box"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 22,
                "name": "Dragon Bash"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 23,
                "name": "Festival of the Four Winds"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 24,
                "name": "Shadow of the Mad King"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 25,
                "name": "Wintersday"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v2HomesteadDecorationCategory>(
            """
            {
                "id": 26,
                "name": "Black Lion Decorations"
            }
            """.trimIndent()
        )
    }

}