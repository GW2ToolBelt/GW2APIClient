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

class GW2v2AccountWalletCurrencyTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 1,
                "value": 7793345
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 2,
                "value": 2979783
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 3,
                "value": 659
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 4,
                "value": 0
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 5,
                "value": 25
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 6,
                "value": 40
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 7,
                "value": 2428
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 10,
                "value": 109
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 11,
                "value": 2
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 13,
                "value": 390
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 14,
                "value": 233
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 15,
                "value": 3119
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 16,
                "value": 11
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 18,
                "value": 294
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 19,
                "value": 125
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 20,
                "value": 145
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 22,
                "value": 1932
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 23,
                "value": 3552
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 24,
                "value": 331
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 25,
                "value": 212
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 26,
                "value": 1295
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 27,
                "value": 4100
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 28,
                "value": 24
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 30,
                "value": 105
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 31,
                "value": 8
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 32,
                "value": 44237
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_26() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 33,
                "value": 475
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_27() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 34,
                "value": 13009
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_28() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 35,
                "value": 417
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_29() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 36,
                "value": 644
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_30() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 37,
                "value": 38
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_31() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 38,
                "value": 309
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_32() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 40,
                "value": 138
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_33() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 41,
                "value": 103
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_34() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 42,
                "value": 283
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_35() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 43,
                "value": 91
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_36() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 44,
                "value": 162
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_37() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 45,
                "value": 37051
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_38() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 47,
                "value": 71
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_39() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 49,
                "value": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_40() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 50,
                "value": 6554
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_41() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 51,
                "value": 54
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_42() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 52,
                "value": 29
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_43() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 53,
                "value": 35
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_44() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 54,
                "value": 4
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_45() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 56,
                "value": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_46() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 57,
                "value": 61
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_47() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 58,
                "value": 5348
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_48() {
        json.decodeFromString<GW2v2AccountWalletCurrency>(
            """
            {
                "id": 60,
                "value": 123
            }
            """.trimIndent()
        )
    }

}