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

class GW2v2PetTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Pet>(
            """
            {
                "id": 1,
                "name": "Junger Dschungelpirscher",
                "description": "Dschungelpirscher erlegen ihre Beute durch schiere Kraft. Sie stürzen sich mit einem mächtigen, ihre Verbündete antreibenden Gebrüll ins Gefecht und zerfetzen ihre Beute mit Zähnen und Klauen. Sie lieben es auch, wenn man ihnen den Bauch krault. Acht",
                "icon": "https://render.guildwars2.com/file/EF1CBC60372CC60E420AD479A3504D90207A9A3F/52535.png",
                "skills": [
                    {
                        "id": 12658
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Pet>(
            """
            {
                "id": 2,
                "name": "Junger Eber",
                "description": "Dieser Eber ist ein zäher, starker Kämpfer mit bösen Hauern. Seine Attacken hauen die meisten Gegner von den Beinen. In feiner Gesellschaft ist er wahrscheinlich fehl am Platz, aber der Waldläufer schätzt ihn als besten Freund. Acht",
                "icon": "https://render.guildwars2.com/file/F4A7D5033C6BBB14F4EDE9F0946190047D2AA96F/52537.png",
                "skills": [
                    {
                        "id": 12754
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Pet>(
            """
            {
                "id": 3,
                "name": "Junger Schneeluchs",
                "description": "Luchse sind ausdauernde Jäger, die bei der Verfolgung ihrer Beute über große Entfernungen springen können. Wenn sie sich sicher fühlen, rollen sie sich manchmal auf den Rücken und strecken ihre Pfoten in die Luft. Acht",
                "icon": "https://render.guildwars2.com/file/6C1D64F7D34D073A7E1860B754A33DBCBFCC6CE6/52539.png",
                "skills": [
                    {
                        "id": 12680
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Pet>(
            """
            {
                "id": 4,
                "name": "Junger Kryta-Spürhund",
                "description": "Dieser krytanische Hund ist ein treuer Gefährte mit ausgeprägtem Beschützerinstinkt. Er nutzt seine außerordentliche Kraft und Zähigkeit im Kampf für seinen Herrn und kann durch sein Heulen Gegner vor Angst erstarren lassen. Acht",
                "icon": "https://render.guildwars2.com/file/76E6FF0DCD60DFC7287FB14542234EFAAA92194F/52541.png",
                "skills": [
                    {
                        "id": 12715
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Pet>(
            """
            {
                "id": 5,
                "name": "Junger Braunbär",
                "description": "Braunbären sind unglaublich stark und haben einen ausgeprägten Beschützerinstinkt. Sie gehen selbstlos in den Kampf, um die Aufmerksamkeit von ihren Herren abzulenken, und können Angriffe abschütteln, die jede andere Kreatur sofort töten würden. Acht",
                "icon": "https://render.guildwars2.com/file/1B51DCA656B8ED7A2C1C48AC03A4BCD6EDA66901/52543.png",
                "skills": [
                    {
                        "id": 12666
                    },
                    {
                        "id": 12691
                    }
                ]
            }
            """.trimIndent()
        )
    }

}