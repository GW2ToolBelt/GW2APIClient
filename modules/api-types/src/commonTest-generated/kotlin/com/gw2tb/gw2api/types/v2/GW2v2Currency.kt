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

class GW2v2CurrencyTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Currency>(
            """
            {
                "id": 1,
                "name": "Münze",
                "description": "Die Hauptwährung in Tyria. Können bei Händlern in der ganzen Welt ausgegeben werden.",
                "order": 101,
                "icon": "https://render.guildwars2.com/file/98457F504BA2FAC8457F532C4B30EDC23929ACF9/619316.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Currency>(
            """
            {
                "id": 2,
                "name": "Karma",
                "description": "Kann durch verschiedene Aktivitäten verdient und bei Händlern in der ganzen Welt ausgegeben werden.",
                "order": 102,
                "icon": "https://render.guildwars2.com/file/94953FA23D3E0D23559624015DFEA4CFAA07F0E5/155026.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Currency>(
            """
            {
                "id": 3,
                "name": "Lorbeer",
                "description": "Kann durch Login-Belohnungstruhen verdient werden. Kann in den großen Städten ausgegeben werden. Verwendbar zum Kauf verschiedener Belohnungen.",
                "order": 104,
                "icon": "https://render.guildwars2.com/file/A1BD345AD9192C3A585BE2F6CB0617C5A797A1E2/619317.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Currency>(
            """
            {
                "id": 4,
                "name": "Edelstein",
                "description": "Können über die Schwarzlöwen-Handelsgesellschaft gekauft und ausgegeben werden.",
                "order": 100,
                "icon": "https://render.guildwars2.com/file/220061640ECA41C0577758030357221B4ECCE62C/502065.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Currency>(
            """
            {
                "id": 5,
                "name": "Ascalonische Träne",
                "description": "Können in den Katakomben von Ascalon verdient werden. Können in Löwenstein ausgegeben werden, um seltene und exotische Ausrüstung, Runen und Sigille, Handwerksmaterialien und \"Gabe Ascalons\"-Komponenten zu kaufen, die zur Herstellung legendärer Waffen verwendet werden.",
                "order": 402,
                "icon": "https://render.guildwars2.com/file/2AA9C0B030BE152B915E0174D7F0495FDA711C54/619318.png"
            }
            """.trimIndent()
        )
    }

}