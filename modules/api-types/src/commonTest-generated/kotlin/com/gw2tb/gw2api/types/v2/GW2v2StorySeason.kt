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

class GW2v2StorySeasonTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2StorySeason>(
            """
            {
                "id": "C22AFD21-667A-4AA8-8210-AC74EAEE58BB",
                "name": "Staffel 4 der Lebendigen Welt",
                "order": 7,
                "stories": [
                    87,
                    90,
                    88,
                    85,
                    86,
                    89
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2StorySeason>(
            """
            {
                "id": "215AAA0F-CDAC-4F93-86DA-C155A99B5784",
                "name": "Meine Geschichte",
                "order": 1,
                "stories": [
                    3,
                    8,
                    1,
                    7,
                    10,
                    9,
                    2
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2StorySeason>(
            """
            {
                "id": "EDCAE800-302A-4D9B-8331-3CC769ADA0B3",
                "name": "Die Eisbrut-Saga",
                "order": 11,
                "stories": [
                    98,
                    95,
                    97,
                    94,
                    91,
                    96,
                    93
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2StorySeason>(
            """
            {
                "id": "EAB597C0-C484-4FD3-9430-31433BAC81B6",
                "name": "Path of Fire",
                "order": 6,
                "stories": [
                    72,
                    79,
                    67,
                    68,
                    82,
                    71,
                    83,
                    75,
                    69,
                    80,
                    76,
                    81,
                    78
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2StorySeason>(
            """
            {
                "id": "002C2D90-69B5-41A2-A422-8DB6F2EFC53E",
                "name": "Scarlets Krieg",
                "order": 2,
                "stories": [
                    39
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2StorySeason>(
            """
            {
                "id": "A515A1D3-4BD7-4594-AE30-2C5D05FF5960",
                "name": "Staffel 2 der Lebendigen Welt",
                "order": 3,
                "stories": [
                    14,
                    15,
                    18,
                    13,
                    12,
                    11,
                    17,
                    16
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2StorySeason>(
            """
            {
                "id": "09766A86-D88D-4DF2-9385-259E9A8CA583",
                "name": "Staffel 3 der Lebendigen Welt",
                "order": 5,
                "stories": [
                    65,
                    66,
                    63,
                    64,
                    46,
                    56
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2StorySeason>(
            """
            {
                "id": "B8901E58-DC9D-4525-ADB2-79C93593291E",
                "name": "Heart of Thorns",
                "order": 4,
                "stories": [
                    34,
                    19,
                    31,
                    42,
                    21,
                    26,
                    36,
                    22,
                    25,
                    23,
                    32,
                    27,
                    20,
                    35,
                    41,
                    33
                ]
            }
            """.trimIndent()
        )
    }

}