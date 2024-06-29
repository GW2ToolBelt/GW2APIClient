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

class GW2v2EmoteTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Emote>(
            """
            {
                "commands": [
                    "/geargrind",
                    "/coureur",
                    "/Endlos",
                    "/corredor"
                ],
                "id": "geargrind",
                "unlock_items": [
                    20312
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Emote>(
            """
            {
                "commands": [
                    "/playdead",
                    "/faitlemort",
                    "/Yacer"
                ],
                "id": "playdead",
                "unlock_items": [
                    93507
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Emote>(
            """
            {
                "commands": [
                    "/rockout",
                    "/hardrock",
                    "/Abrocken",
                    "/rockear"
                ],
                "id": "rockout",
                "unlock_items": [
                    91956
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Emote>(
            """
            {
                "commands": [
                    "/shiver",
                    "/tremble",
                    "/zittern",
                    "/tiritar"
                ],
                "id": "shiver",
                "unlock_items": [
                    92787
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Emote>(
            """
            {
                "commands": [
                    "/shuffle",
                    "/mezclador"
                ],
                "id": "shuffle",
                "unlock_items": [
                    20312
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2Emote>(
            """
            {
                "commands": [
                    "/step",
                    "/esquive",
                    "/Schritt",
                    "/paso"
                ],
                "id": "step",
                "unlock_items": [
                    20312
                ]
            }
            """.trimIndent()
        )
    }

}