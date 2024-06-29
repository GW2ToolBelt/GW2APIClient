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

class GW2v2ContinentTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Continent>(
            """
            {
                "name": "Tyria",
                "continent_dims": [
                    49152,
                    49152
                ],
                "min_zoom": 0,
                "max_zoom": 7,
                "floors": [
                    0,
                    1,
                    2,
                    3,
                    4,
                    5,
                    6,
                    7,
                    8,
                    9,
                    10,
                    11,
                    12,
                    13,
                    14,
                    15,
                    16,
                    17,
                    18,
                    -2,
                    -3,
                    -4,
                    -5,
                    -6,
                    -7,
                    -8,
                    -9,
                    -10,
                    -11,
                    -12,
                    -13,
                    -14,
                    -15,
                    -16,
                    -18,
                    -19,
                    -20,
                    -21,
                    -22,
                    20,
                    21,
                    22,
                    23,
                    24,
                    25,
                    28,
                    29,
                    39,
                    42,
                    26,
                    27,
                    30,
                    34,
                    36,
                    37,
                    38,
                    40,
                    41,
                    43,
                    44,
                    45,
                    46,
                    47,
                    48,
                    49,
                    -24,
                    -26,
                    -27,
                    -28,
                    -29,
                    -30,
                    -31,
                    -33,
                    -34,
                    -35,
                    -36,
                    -32,
                    50,
                    51,
                    -37,
                    -53,
                    -55,
                    -56,
                    -38,
                    53,
                    -57,
                    54,
                    -39,
                    -42,
                    -40,
                    -41,
                    60,
                    61,
                    62,
                    -43,
                    55,
                    56,
                    57,
                    58,
                    63,
                    64,
                    65,
                    66,
                    67,
                    68
                ],
                "id": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Continent>(
            """
            {
                "name": "Die Nebel",
                "continent_dims": [
                    16384,
                    16384
                ],
                "min_zoom": 0,
                "max_zoom": 6,
                "floors": [
                    1,
                    3,
                    5,
                    6,
                    7,
                    8,
                    9,
                    10,
                    11,
                    12,
                    13,
                    14,
                    15,
                    16,
                    18,
                    19,
                    20,
                    21,
                    22,
                    23,
                    24,
                    25,
                    26,
                    27,
                    28,
                    29,
                    30,
                    31,
                    51,
                    -27,
                    -28,
                    -29,
                    -30,
                    -31,
                    35,
                    32,
                    -32,
                    -33,
                    37,
                    39,
                    40,
                    41,
                    -52,
                    44,
                    -34,
                    -35,
                    58
                ],
                "id": 2
            }
            """.trimIndent()
        )
    }

}