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

class GW2v2AccountBankSlotTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2AccountBankSlot>(
            """
            {
                "id": 77665,
                "count": 1,
                "binding": "Character",
                "bound_to": "Hans Wurst"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2AccountBankSlot>(
            """
            {
                "id": 68532,
                "count": 1,
                "upgrades": [
                    67914
                ],
                "upgrade_slot_indices": [
                    0
                ],
                "binding": "Account",
                "stats": {
                    "id": 159,
                    "attributes": {
                        "Power": 53,
                        "Precision": 75,
                        "ConditionDamage": 53
                    }
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2AccountBankSlot>(
            """
            {
                "id": 74,
                "count": 1,
                "skin": 1409,
                "dyes": [
                    2,
                    443,
                    2,
                    1
                ],
                "binding": "Account"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2AccountBankSlot>(
            """
            {
                "id": 19918,
                "count": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2AccountBankSlot>(
            """
            {
                "id": 68532,
                "count": 1,
                "upgrades": [
                    67914
                ],
                "upgrade_slot_indices": [
                    0
                ],
                "binding": "Account"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2AccountBankSlot>(
            """
            {
                "id": 93781,
                "count": 3,
                "binding": "Account"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2AccountBankSlot>(
            """
            {
                "id": 66220,
                "count": 49,
                "binding": "Account"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2AccountBankSlot>(
            """
            {
                "id": 85947,
                "count": 1,
                "binding": "Account"
            }
            """.trimIndent()
        )
    }

}