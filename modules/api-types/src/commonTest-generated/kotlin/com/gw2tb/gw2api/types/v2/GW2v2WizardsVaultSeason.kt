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

class GW2v2WizardsVaultSeasonTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2WizardsVaultSeason>(
            """
            {
                "title": "The Realm of Dreams Season",
                "start": "2023-04-09T16:00:00Z",
                "end": "2024-05-21T16:00:00Z",
                "listings": [
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
                    32,
                    33,
                    34,
                    35,
                    36,
                    37,
                    38,
                    39,
                    40
                ],
                "objectives": [
                    1,
                    2,
                    3,
                    4,
                    5,
                    7,
                    8,
                    10,
                    11,
                    13,
                    15,
                    16,
                    18,
                    19,
                    20,
                    21,
                    28,
                    29,
                    30,
                    31,
                    32,
                    36,
                    37,
                    38,
                    40,
                    43,
                    44,
                    45,
                    46,
                    47,
                    50,
                    55,
                    56,
                    57,
                    58,
                    59,
                    60,
                    61,
                    62,
                    63,
                    65,
                    69,
                    70,
                    72,
                    74,
                    77,
                    78,
                    79,
                    80,
                    83,
                    84,
                    85,
                    87,
                    88,
                    91,
                    92,
                    94,
                    95,
                    98,
                    99,
                    100,
                    101,
                    104,
                    105,
                    107,
                    108,
                    109,
                    110,
                    115,
                    116,
                    117,
                    120,
                    121,
                    122,
                    123,
                    124,
                    125,
                    127,
                    128,
                    129,
                    130,
                    132,
                    133,
                    134,
                    135,
                    137,
                    138,
                    139,
                    140,
                    141,
                    143,
                    144,
                    145,
                    146,
                    147,
                    148,
                    149,
                    150,
                    152,
                    153,
                    155,
                    156,
                    157,
                    159,
                    161,
                    163,
                    164,
                    166,
                    167,
                    168,
                    169,
                    170,
                    171,
                    173,
                    174,
                    176,
                    177,
                    178,
                    179,
                    180,
                    181,
                    182,
                    184,
                    186,
                    187,
                    188,
                    189,
                    190,
                    192,
                    193,
                    196,
                    197,
                    198,
                    199,
                    201,
                    202,
                    206,
                    228,
                    229,
                    230,
                    231,
                    233,
                    234,
                    235,
                    236,
                    240,
                    241,
                    242,
                    243,
                    244,
                    245
                ]
            }
            """.trimIndent()
        )
    }

}