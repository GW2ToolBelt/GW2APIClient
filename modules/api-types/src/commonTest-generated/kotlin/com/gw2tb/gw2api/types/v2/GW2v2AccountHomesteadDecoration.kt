/*
 * Copyright (c) 2018-2026 Leon Linhart
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

class GW2v2AccountHomesteadDecorationTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 35,
                "count": 92
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 70,
                "count": 6
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 125,
                "count": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 131,
                "count": 4
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 154,
                "count": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 202,
                "count": 3
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 292,
                "count": 43
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 300,
                "count": 3
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 306,
                "count": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 312,
                "count": 2
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 327,
                "count": 5
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 367,
                "count": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 385,
                "count": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 402,
                "count": 71
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 419,
                "count": 7
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 436,
                "count": 3
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 523,
                "count": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 570,
                "count": 97
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 589,
                "count": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 600,
                "count": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 610,
                "count": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 613,
                "count": 4
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 622,
                "count": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 641,
                "count": 6
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 673,
                "count": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 692,
                "count": 3
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_26() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 707,
                "count": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_27() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 727,
                "count": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_28() {
        json.decodeFromString<GW2v2AccountHomesteadDecoration>(
            """
            {
                "id": 759,
                "count": 1
            }
            """.trimIndent()
        )
    }

}