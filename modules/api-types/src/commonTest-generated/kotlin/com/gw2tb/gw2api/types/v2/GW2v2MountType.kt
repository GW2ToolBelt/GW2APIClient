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

class GW2v2MountTypeTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2MountType>(
            """
            {
                "id": "griffon",
                "name": "Greif",
                "default_skin": 4,
                "skins": [
                    4,
                    16,
                    23,
                    25,
                    27,
                    34,
                    40,
                    50,
                    53,
                    62,
                    75,
                    77,
                    80,
                    91,
                    95,
                    100,
                    109,
                    110,
                    115,
                    129,
                    132,
                    141,
                    146,
                    150,
                    155,
                    177,
                    180,
                    181,
                    210,
                    223,
                    244,
                    246,
                    250,
                    267,
                    271,
                    313
                ],
                "skills": [
                    {
                        "id": 40576,
                        "slot": "Weapon_1"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2MountType>(
            """
            {
                "id": "jackal",
                "name": "Schakal",
                "default_skin": 6,
                "skins": [
                    6,
                    14,
                    22,
                    28,
                    30,
                    33,
                    39,
                    46,
                    49,
                    56,
                    68,
                    87,
                    89,
                    90,
                    93,
                    97,
                    102,
                    107,
                    117,
                    131,
                    143,
                    149,
                    153,
                    176,
                    183,
                    203,
                    213,
                    220,
                    224,
                    247,
                    270,
                    272,
                    287,
                    302,
                    309
                ],
                "skills": [
                    {
                        "id": 46089,
                        "slot": "Weapon_1"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2MountType>(
            """
            {
                "id": "raptor",
                "name": "Raptor",
                "default_skin": 1,
                "skins": [
                    1,
                    12,
                    13,
                    17,
                    21,
                    24,
                    29,
                    32,
                    35,
                    48,
                    58,
                    76,
                    81,
                    86,
                    88,
                    94,
                    99,
                    111,
                    126,
                    133,
                    136,
                    138,
                    158,
                    173,
                    175,
                    179,
                    200,
                    205,
                    218,
                    226,
                    237,
                    240,
                    264,
                    266,
                    273,
                    294,
                    298,
                    308,
                    329
                ],
                "skills": [
                    {
                        "id": 40409,
                        "slot": "Weapon_1"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2MountType>(
            """
            {
                "id": "roller_beetle",
                "name": "Rollkäfer",
                "default_skin": 103,
                "skins": [
                    293,
                    103,
                    104,
                    105,
                    108,
                    114,
                    116,
                    144,
                    145,
                    147,
                    170,
                    172,
                    209,
                    216,
                    234,
                    239,
                    277,
                    278,
                    303
                ],
                "skills": [
                    {
                        "id": 51040,
                        "slot": "Weapon_1"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2MountType>(
            """
            {
                "id": "skimmer",
                "name": "Schweberochen",
                "default_skin": 2,
                "skins": [
                    2,
                    19,
                    26,
                    36,
                    37,
                    44,
                    45,
                    47,
                    52,
                    57,
                    70,
                    83,
                    84,
                    85,
                    96,
                    101,
                    112,
                    113,
                    130,
                    137,
                    142,
                    154,
                    168,
                    171,
                    174,
                    217,
                    222,
                    248,
                    268,
                    300,
                    311,
                    312
                ],
                "skills": [
                    {
                        "id": 41253,
                        "slot": "Weapon_1"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2MountType>(
            """
            {
                "id": "skyscale",
                "name": "Himmelsschuppe",
                "default_skin": 186,
                "skins": [
                    186,
                    191,
                    193,
                    194,
                    195,
                    196,
                    198,
                    202,
                    206,
                    211,
                    235,
                    238,
                    242,
                    265,
                    275,
                    280,
                    292,
                    305,
                    306,
                    307
                ],
                "skills": [
                    {
                        "id": 55536,
                        "slot": "Weapon_1"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2MountType>(
            """
            {
                "id": "springer",
                "name": "Springer",
                "default_skin": 3,
                "skins": [
                    3,
                    15,
                    20,
                    31,
                    38,
                    41,
                    42,
                    43,
                    60,
                    61,
                    66,
                    78,
                    79,
                    82,
                    92,
                    98,
                    106,
                    118,
                    134,
                    139,
                    140,
                    148,
                    152,
                    157,
                    169,
                    178,
                    182,
                    208,
                    215,
                    225,
                    231,
                    243,
                    245,
                    276,
                    299
                ],
                "skills": [
                    {
                        "id": 45994,
                        "slot": "Weapon_1"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2MountType>(
            """
            {
                "id": "warclaw",
                "name": "Kriegsklaue",
                "default_skin": 161,
                "skins": [
                    161,
                    162,
                    163,
                    164,
                    165,
                    166,
                    204,
                    207,
                    236,
                    241,
                    251,
                    252,
                    269,
                    279,
                    301,
                    304,
                    310,
                    316
                ],
                "skills": [
                    {
                        "id": 54912,
                        "slot": "Weapon_1"
                    }
                ]
            }
            """.trimIndent()
        )
    }

}