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

class GW2v2WorldTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1001,
                "name": "Amboss-Stein",
                "population": "VeryHigh"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1002,
                "name": "Borlis-Pass",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1003,
                "name": "Yakbiegung",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1004,
                "name": "Steinkreis von Denravi",
                "population": "VeryHigh"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1005,
                "name": "Maguuma",
                "population": "Full"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1006,
                "name": "Hochofen der Betrübnis",
                "population": "Medium"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1007,
                "name": "Tor des Wahnsinns",
                "population": "Medium"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1008,
                "name": "Jade-Steinbruch",
                "population": "Full"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1009,
                "name": "Fort Espenwald",
                "population": "Full"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1010,
                "name": "Ehmry-Bucht",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1011,
                "name": "Sturmklippen-Insel",
                "population": "Full"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1012,
                "name": "Finsterfreistatt",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1013,
                "name": "Heilige Halle von Rall",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1014,
                "name": "Kristallwüste",
                "population": "VeryHigh"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1015,
                "name": "Janthir-Insel",
                "population": "Medium"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1016,
                "name": "Meer des Leids",
                "population": "Full"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1017,
                "name": "Befleckte Küste",
                "population": "VeryHigh"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1018,
                "name": "Nördliche Zittergipfel",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1019,
                "name": "Schwarztor",
                "population": "Full"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1020,
                "name": "Fergusons Kreuzung",
                "population": "Full"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1021,
                "name": "Drachenbrand",
                "population": "VeryHigh"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1022,
                "name": "Kaineng",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1023,
                "name": "Devonas Ruh",
                "population": "Medium"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 1024,
                "name": "Eredon-Terrasse",
                "population": "VeryHigh"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2001,
                "name": "Riss des Kummers",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2002,
                "name": "Ödnis",
                "population": "Full"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_26() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2003,
                "name": "Gandara",
                "population": "Full"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_27() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2004,
                "name": "Schwarzwasser",
                "population": "Medium"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_28() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2005,
                "name": "Feuerring",
                "population": "VeryHigh"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_29() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2006,
                "name": "Unterwelt",
                "population": "VeryHigh"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_30() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2007,
                "name": "Ferne Zittergipfel",
                "population": "Full"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_31() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2008,
                "name": "Weißflankgrat",
                "population": "Medium"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_32() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2009,
                "name": "Ruinen von Surmia",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_33() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2010,
                "name": "Seemannsruh",
                "population": "Full"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_34() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2011,
                "name": "Vaabi",
                "population": "Medium"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_35() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2012,
                "name": "Piken-Platz",
                "population": "Full"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_36() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2013,
                "name": "Auroralichtung",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_37() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2014,
                "name": "Gunnars Feste",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_38() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2101,
                "name": "Jademeer [FR]",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_39() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2102,
                "name": "Fort Ranik [FR]",
                "population": "Medium"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_40() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2103,
                "name": "Fels der Weissagung [FR]",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_41() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2104,
                "name": "Vizunah-Platz [FR]",
                "population": "Medium"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_42() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2105,
                "name": "Arborstein [FR]",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_43() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2201,
                "name": "Kodasch [DE]",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_44() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2202,
                "name": "Flussufer [DE]",
                "population": "Full"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_45() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2203,
                "name": "Elonaspitze [DE]",
                "population": "Full"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_46() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2204,
                "name": "Abaddons Maul [DE]",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_47() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2205,
                "name": "Drakkar-See [DE]",
                "population": "VeryHigh"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_48() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2206,
                "name": "Millersund [DE]",
                "population": "High"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_49() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2207,
                "name": "Dzagonur [DE]",
                "population": "Full"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_50() {
        json.decodeFromString<GW2v2World>(
            """
            {
                "id": 2301,
                "name": "Baruch-Bucht [ES]",
                "population": "VeryHigh"
            }
            """.trimIndent()
        )
    }

}