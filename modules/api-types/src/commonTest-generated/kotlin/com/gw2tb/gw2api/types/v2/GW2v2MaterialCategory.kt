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

class GW2v2MaterialCategoryTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2MaterialCategory>(
            """
            {
                "id": 5,
                "name": "Kochmaterialien",
                "items": [
                    12134,
                    12238,
                    12147,
                    12142,
                    12135,
                    12246,
                    12255,
                    12163,
                    12165,
                    12236,
                    12240,
                    12331,
                    12258,
                    12256,
                    12232,
                    12252,
                    12249,
                    12248,
                    12141,
                    12234,
                    12138,
                    12137,
                    12159,
                    12143,
                    12152,
                    24359,
                    24360,
                    12136,
                    12158,
                    12151,
                    12153,
                    12271,
                    12324,
                    12155,
                    12157,
                    12156,
                    12253,
                    12161,
                    12327,
                    12244,
                    12243,
                    12241,
                    12162,
                    12145,
                    12251,
                    12245,
                    12247,
                    12235,
                    12237,
                    12239,
                    12250,
                    12229,
                    12332,
                    12336,
                    12341,
                    12333,
                    12334,
                    12335,
                    12342,
                    12329,
                    12330,
                    12337,
                    12340,
                    12338,
                    12328,
                    12339,
                    12325,
                    12537,
                    12532,
                    12534,
                    12531,
                    12533,
                    12536,
                    12535,
                    12538,
                    12515,
                    12350,
                    12518,
                    12351,
                    12514,
                    12516,
                    12517,
                    12512,
                    12505,
                    12511,
                    12504,
                    12508,
                    12507,
                    12254,
                    12506,
                    12510,
                    12509,
                    12144,
                    12502,
                    12503,
                    12545,
                    12544,
                    12546,
                    12128,
                    12547,
                    12543,
                    36731,
                    66524,
                    66522,
                    73113,
                    74242,
                    74266,
                    73096,
                    73504,
                    81837,
                    82991,
                    82866,
                    82806,
                    84696,
                    83195,
                    91751,
                    91739,
                    91702,
                    91768,
                    91692,
                    91731,
                    91699,
                    91850,
                    91796,
                    91715,
                    91793,
                    91869,
                    91701
                ],
                "order": 6
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2MaterialCategory>(
            """
            {
                "id": 38,
                "name": "Festliche Materialien",
                "items": [
                    36041,
                    47909,
                    36060,
                    48807,
                    36061,
                    48806,
                    36059,
                    48805,
                    86601,
                    86627,
                    77651,
                    38130,
                    38131,
                    38132,
                    38133,
                    38134,
                    38135,
                    43319,
                    43320
                ],
                "order": 10
            }
            """.trimIndent()
        )
    }

}