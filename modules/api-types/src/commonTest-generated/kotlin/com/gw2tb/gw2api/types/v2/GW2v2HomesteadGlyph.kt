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

class GW2v2HomesteadGlyphTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "alchemy_harvesting",
                "item_id": 90805,
                "slot": "harvesting"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "alchemy_logging",
                "item_id": 90805,
                "slot": "logging"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "alchemy_mining",
                "item_id": 90805,
                "slot": "mining"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "crucible_harvesting",
                "item_id": 90488,
                "slot": "harvesting"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "crucible_logging",
                "item_id": 90488,
                "slot": "logging"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "crucible_mining",
                "item_id": 90488,
                "slot": "mining"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "forester_harvesting",
                "item_id": 87550,
                "slot": "harvesting"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "forester_logging",
                "item_id": 87550,
                "slot": "logging"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "forester_mining",
                "item_id": 87550,
                "slot": "mining"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "herbalist_harvesting",
                "item_id": 88241,
                "slot": "harvesting"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "herbalist_logging",
                "item_id": 88241,
                "slot": "logging"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "herbalist_mining",
                "item_id": 88241,
                "slot": "mining"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "leatherworker_harvesting",
                "item_id": 87473,
                "slot": "harvesting"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "leatherworker_logging",
                "item_id": 87473,
                "slot": "logging"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "leatherworker_mining",
                "item_id": 87473,
                "slot": "mining"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "prospector_harvesting",
                "item_id": 87534,
                "slot": "harvesting"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "prospector_logging",
                "item_id": 87534,
                "slot": "logging"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "prospector_mining",
                "item_id": 87534,
                "slot": "mining"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "scavenger_harvesting",
                "item_id": 87442,
                "slot": "harvesting"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "scavenger_logging",
                "item_id": 87442,
                "slot": "logging"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "scavenger_mining",
                "item_id": 87442,
                "slot": "mining"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "tailor_harvesting",
                "item_id": 87407,
                "slot": "harvesting"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "tailor_logging",
                "item_id": 87407,
                "slot": "logging"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "tailor_mining",
                "item_id": 87407,
                "slot": "mining"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "unbound_harvesting",
                "item_id": 87428,
                "slot": "harvesting"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "unbound_logging",
                "item_id": 87428,
                "slot": "logging"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_26() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "unbound_mining",
                "item_id": 87428,
                "slot": "mining"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_27() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "virtue_harvesting",
                "item_id": 92820,
                "slot": "harvesting"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_28() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "virtue_logging",
                "item_id": 92820,
                "slot": "logging"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_29() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "virtue_mining",
                "item_id": 92820,
                "slot": "mining"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_30() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "volatility_harvesting",
                "item_id": 87698,
                "slot": "harvesting"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_31() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "volatility_logging",
                "item_id": 87698,
                "slot": "logging"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_32() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "volatility_mining",
                "item_id": 87698,
                "slot": "mining"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_33() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "watchknight_harvesting",
                "item_id": 87438,
                "slot": "harvesting"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_34() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "watchknight_logging",
                "item_id": 87438,
                "slot": "logging"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_35() {
        json.decodeFromString<GW2v2HomesteadGlyph>(
            """
            {
                "id": "watchknight_mining",
                "item_id": 87438,
                "slot": "mining"
            }
            """.trimIndent()
        )
    }

}