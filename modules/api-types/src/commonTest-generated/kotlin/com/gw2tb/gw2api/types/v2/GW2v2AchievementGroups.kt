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

class GW2v2AchievementGroupsTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2AchievementGroups>(
            """
            {
                "id": "B42E2379-9599-46CA-9D4A-40A27E192BBE",
                "name": "Path of Fire",
                "description": "Erfolge für bewältigte Ziele in der gesamten Wüste.",
                "order": 6,
                "categories": [
                    174,
                    176,
                    178,
                    179,
                    181,
                    182,
                    185,
                    189,
                    190
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2AchievementGroups>(
            """
            {
                "id": "45410F60-AB66-4146-A0F7-CE99250C4CB0",
                "name": "Sammlungen",
                "description": "Erfolge für das Sammeln von Gegenständen und das Freischalten von Skins in der Garderobe.",
                "order": 12,
                "categories": [
                    77,
                    75,
                    114,
                    76,
                    117,
                    118,
                    173,
                    237,
                    125
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2AchievementGroups>(
            """
            {
                "id": "65B4B678-607E-4D97-B458-076C3E96A810",
                "name": "Heart of Thorns",
                "description": "Erfolge für bewältigte Ziele im Dschungel.",
                "order": 7,
                "categories": [
                    108,
                    109,
                    110,
                    111,
                    112,
                    116
                ]
            }
            """.trimIndent()
        )
    }

}