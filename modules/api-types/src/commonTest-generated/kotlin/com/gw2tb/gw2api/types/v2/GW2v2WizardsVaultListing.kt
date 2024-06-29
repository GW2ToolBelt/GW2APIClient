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

class GW2v2WizardsVaultListingTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 1,
                "item_id": 101574,
                "item_count": 1,
                "type": "Featured",
                "cost": 500
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 2,
                "item_id": 101617,
                "item_count": 1,
                "type": "Featured",
                "cost": 500
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 3,
                "item_id": 101485,
                "item_count": 1,
                "type": "Featured",
                "cost": 150
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 4,
                "item_id": 101533,
                "item_count": 1,
                "type": "Featured",
                "cost": 375
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 5,
                "item_id": 101469,
                "item_count": 1,
                "type": "Featured",
                "cost": 375
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 6,
                "item_id": 101475,
                "item_count": 1,
                "type": "Featured",
                "cost": 375
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 7,
                "item_id": 101623,
                "item_count": 1,
                "type": "Normal",
                "cost": 1000
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 8,
                "item_id": 100878,
                "item_count": 1,
                "type": "Normal",
                "cost": 6
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 9,
                "item_id": 100595,
                "item_count": 1,
                "type": "Normal",
                "cost": 35
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 10,
                "item_id": 19976,
                "item_count": 1,
                "type": "Normal",
                "cost": 9
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 11,
                "item_id": 68314,
                "item_count": 1,
                "type": "Normal",
                "cost": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 12,
                "item_id": 43766,
                "item_count": 1,
                "type": "Normal",
                "cost": 8
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 13,
                "item_id": 95289,
                "item_count": 1,
                "type": "Normal",
                "cost": 15
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 14,
                "item_id": 45176,
                "item_count": 1,
                "type": "Normal",
                "cost": 6
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 15,
                "item_id": 39124,
                "item_count": 1,
                "type": "Normal",
                "cost": 8
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 16,
                "item_id": 39123,
                "item_count": 1,
                "type": "Normal",
                "cost": 40
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 17,
                "item_id": 100233,
                "item_count": 1,
                "type": "Normal",
                "cost": 1000
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 18,
                "item_id": 49208,
                "item_count": 1,
                "type": "Normal",
                "cost": 400
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 19,
                "item_id": 49207,
                "item_count": 1,
                "type": "Normal",
                "cost": 600
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 20,
                "item_id": 64737,
                "item_count": 1,
                "type": "Normal",
                "cost": 8
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 21,
                "item_id": 92206,
                "item_count": 1,
                "type": "Normal",
                "cost": 500
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 22,
                "item_id": 92209,
                "item_count": 1,
                "type": "Normal",
                "cost": 350
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 23,
                "item_id": 20349,
                "item_count": 1,
                "type": "Normal",
                "cost": 35
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 24,
                "item_id": 19996,
                "item_count": 1,
                "type": "Normal",
                "cost": 95
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 25,
                "item_id": 46746,
                "item_count": 1,
                "type": "Normal",
                "cost": 150
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 26,
                "item_id": 19925,
                "item_count": 1,
                "type": "Normal",
                "cost": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_26() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 27,
                "item_id": 19675,
                "item_count": 1,
                "type": "Normal",
                "cost": 60
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_27() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 28,
                "item_id": 19986,
                "item_count": 1,
                "type": "Normal",
                "cost": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_28() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 29,
                "item_id": 100663,
                "item_count": 1,
                "type": "Legacy",
                "cost": 1200
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_29() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 30,
                "item_id": 100099,
                "item_count": 1,
                "type": "Legacy",
                "cost": 300
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_30() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 31,
                "item_id": 100284,
                "item_count": 1,
                "type": "Legacy",
                "cost": 180
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_31() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 32,
                "item_id": 100593,
                "item_count": 1,
                "type": "Legacy",
                "cost": 450
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_32() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 33,
                "item_id": 100361,
                "item_count": 1,
                "type": "Legacy",
                "cost": 450
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_33() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 34,
                "item_id": 100029,
                "item_count": 1,
                "type": "Legacy",
                "cost": 450
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_34() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 35,
                "item_id": 101199,
                "item_count": 1,
                "type": "Legacy",
                "cost": 450
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_35() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 36,
                "item_id": 101227,
                "item_count": 1,
                "type": "Legacy",
                "cost": 180
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_36() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 37,
                "item_id": 100401,
                "item_count": 1,
                "type": "Legacy",
                "cost": 450
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_37() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 38,
                "item_id": 100172,
                "item_count": 1,
                "type": "Legacy",
                "cost": 450
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_38() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 39,
                "item_id": 100449,
                "item_count": 1,
                "type": "Legacy",
                "cost": 450
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_39() {
        json.decodeFromString<GW2v2WizardsVaultListing>(
            """
            {
                "id": 40,
                "item_id": 101205,
                "item_count": 1,
                "type": "Legacy",
                "cost": 450
            }
            """.trimIndent()
        )
    }

}