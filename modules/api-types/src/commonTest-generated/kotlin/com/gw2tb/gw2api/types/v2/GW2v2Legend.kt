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

class GW2v2LegendTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Legend>(
            """
            {
                "id": "Legend1",
                "code": 1,
                "swap": 28085,
                "heal": 27220,
                "elite": 27760,
                "utilities": [
                    28379,
                    27014,
                    26644
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Legend>(
            """
            {
                "id": "Legend2",
                "code": 2,
                "swap": 28134,
                "heal": 26937,
                "elite": 28406,
                "utilities": [
                    29209,
                    28231,
                    27107
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Legend>(
            """
            {
                "id": "Legend3",
                "code": 3,
                "swap": 28419,
                "heal": 27372,
                "elite": 27975,
                "utilities": [
                    28516,
                    26679,
                    26557
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Legend>(
            """
            {
                "id": "Legend4",
                "code": 4,
                "swap": 28494,
                "heal": 28219,
                "elite": 28287,
                "utilities": [
                    27322,
                    27505,
                    27917
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Legend>(
            """
            {
                "id": "Legend5",
                "code": 5,
                "swap": 41858,
                "heal": 45686,
                "elite": 45773,
                "utilities": [
                    42949,
                    40485,
                    41220
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2Legend>(
            """
            {
                "id": "Legend6",
                "code": 6,
                "swap": 28195,
                "heal": 28427,
                "elite": 27356,
                "utilities": [
                    26821,
                    27025,
                    27715
                ]
            }
            """.trimIndent()
        )
    }

}