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

class GW2v2FinisherTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Finisher>(
            """
            {
                "id": 1,
                "unlock_details": "<c=@reminder>Schaltet diesen PvP-Rang-Todesstoß frei, indem Ihr Rangpunkte verdient und Euren PvP-Rang erhöht.</c>",
                "unlock_items": [],
                "order": 18,
                "icon": "https://render.guildwars2.com/file/807516C20D08B908946167EADD57980163EECA4E/620101.png",
                "name": "Kaninchenrang-Todesstoß"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Finisher>(
            """
            {
                "id": 2,
                "unlock_details": "<c=@reminder>Schaltet diesen PvP-Rang-Todesstoß frei, indem Ihr Rangpunkte verdient und Euren PvP-Rang erhöht.</c>",
                "unlock_items": [],
                "order": 17,
                "icon": "https://render.guildwars2.com/file/6A68492F14AB3AFC5A95BCE008BDE8B50EB82CAF/620104.png",
                "name": "Hirschrang-Todesstoß"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Finisher>(
            """
            {
                "id": 3,
                "unlock_details": "<c=@reminder>Schaltet diesen PvP-Rang-Todesstoß frei, indem Ihr Rangpunkte verdient und Euren PvP-Rang erhöht.</c>",
                "unlock_items": [],
                "order": 16,
                "icon": "https://render.guildwars2.com/file/0CA368AB05A9580612F6BEECE80BA0051ED3C658/620107.png",
                "name": "Dolyakrang-Todesstoß"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Finisher>(
            """
            {
                "id": 4,
                "unlock_details": "<c=@reminder>Schaltet diesen PvP-Rang-Todesstoß frei, indem Ihr Rangpunkte verdient und Euren PvP-Rang erhöht.</c>",
                "unlock_items": [],
                "order": 15,
                "icon": "https://render.guildwars2.com/file/C42552A84EEBD24E46A304AF1F8048D20004033C/620110.png",
                "name": "Wolfrang-Todesstoß"
            }
            """.trimIndent()
        )
    }

}