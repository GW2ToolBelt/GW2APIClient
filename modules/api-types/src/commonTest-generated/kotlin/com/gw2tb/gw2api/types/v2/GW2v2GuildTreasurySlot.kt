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

class GW2v2GuildTreasurySlotTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2GuildTreasurySlot>(
            """
            {
                "item_id": 9576,
                "count": 0,
                "needed_by": [
                    {
                        "upgrade_id": 350,
                        "count": 3
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2GuildTreasurySlot>(
            """
            {
                "item_id": 19663,
                "count": 0,
                "needed_by": [
                    {
                        "upgrade_id": 428,
                        "count": 30
                    },
                    {
                        "upgrade_id": 504,
                        "count": 30
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2GuildTreasurySlot>(
            """
            {
                "item_id": 19684,
                "count": 0,
                "needed_by": [
                    {
                        "upgrade_id": 169,
                        "count": 300
                    },
                    {
                        "upgrade_id": 234,
                        "count": 50
                    },
                    {
                        "upgrade_id": 322,
                        "count": 100
                    },
                    {
                        "upgrade_id": 354,
                        "count": 100
                    },
                    {
                        "upgrade_id": 434,
                        "count": 300
                    },
                    {
                        "upgrade_id": 450,
                        "count": 100
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2GuildTreasurySlot>(
            """
            {
                "item_id": 19685,
                "count": 0,
                "needed_by": [
                    {
                        "upgrade_id": 350,
                        "count": 100
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2GuildTreasurySlot>(
            """
            {
                "item_id": 19709,
                "count": 0,
                "needed_by": [
                    {
                        "upgrade_id": 169,
                        "count": 300
                    },
                    {
                        "upgrade_id": 234,
                        "count": 50
                    },
                    {
                        "upgrade_id": 322,
                        "count": 100
                    },
                    {
                        "upgrade_id": 354,
                        "count": 100
                    },
                    {
                        "upgrade_id": 434,
                        "count": 300
                    },
                    {
                        "upgrade_id": 450,
                        "count": 100
                    }
                ]
            }
            """.trimIndent()
        )
    }

}