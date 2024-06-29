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

class GW2v2WvwObjectiveTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2WvwObjective>(
            """
            {
                "id": "94-112",
                "name": "Grenze von",
                "sector_id": 967,
                "type": "Spawn",
                "map_type": "RedHome",
                "map_id": 94,
                "upgrade_id": 7,
                "chat_link": "[&DHAAAABeAAAA]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2WvwObjective>(
            """
            {
                "id": "94-66",
                "name": "Aufstieg des Schnitzers",
                "sector_id": 1385,
                "type": "Ruins",
                "map_type": "RedHome",
                "map_id": 94,
                "marker": "https://render.guildwars2.com/file/52B43242E55961770D78B80ED77BC764F0E57BF2/1635237.png",
                "chat_link": "[&DEIAAABeAAAA]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2WvwObjective>(
            """
            {
                "id": "968-129",
                "name": "Ödland-Docks",
                "sector_id": 1492,
                "type": "Spawn",
                "map_type": "EdgeOfTheMists",
                "map_id": 968,
                "label_coord": [
                    6445.02,
                    11245.3
                ],
                "chat_link": "[&DIEAAADIAwAA]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2WvwObjective>(
            """
            {
                "id": "968-92",
                "name": "Statue",
                "sector_id": 1159,
                "type": "Generic",
                "map_type": "EdgeOfTheMists",
                "map_id": 968,
                "coord": [
                    7557.21,
                    9391.91,
                    -4784.89
                ],
                "label_coord": [
                    7511.39,
                    9421.59
                ],
                "marker": "https://render.guildwars2.com/file/4C0113B6DF2E4E2CBB93244AD50DA49456D5014E/730412.png",
                "chat_link": "[&DFwAAADIAwAA]"
            }
            """.trimIndent()
        )
    }

}