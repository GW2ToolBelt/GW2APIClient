/*
 * Copyright (c) 2018-2021 Leon Linhart
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

class GW2v2CommercePricesTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2CommercePrices>(
            """
            {
                "id": 24,
                "whitelisted": false,
                "buys": {
                    "quantity": 98540,
                    "unit_price": 297
                },
                "sells": {
                    "quantity": 120348,
                    "unit_price": 386
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2CommercePrices>(
            """
            {
                "id": 68,
                "whitelisted": false,
                "buys": {
                    "quantity": 3156,
                    "unit_price": 79
                },
                "sells": {
                    "quantity": 403,
                    "unit_price": 119
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2CommercePrices>(
            """
            {
                "id": 69,
                "whitelisted": false,
                "buys": {
                    "quantity": 2100,
                    "unit_price": 91
                },
                "sells": {
                    "quantity": 837,
                    "unit_price": 170
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2CommercePrices>(
            """
            {
                "id": 70,
                "whitelisted": false,
                "buys": {
                    "quantity": 3084,
                    "unit_price": 79
                },
                "sells": {
                    "quantity": 506,
                    "unit_price": 119
                }
            }
            """.trimIndent()
        )
    }

}