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

class GW2v2BackstoryAnswerTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2BackstoryAnswer>(
            """
            {
                "id": "7-54",
                "title": "Würde",
                "description": "Ich bewahre meine Würde, selbst wenn ich bis zu den Ohren im Schlamm stecke. Aus diesem Grund werde ich respektiert. Ernsthaftes, rücksichtsvolles Benehmen ebnet den Weg zum Erfolg.",
                "journal": "Auch schwierige Situationen meistere ich mit Würde.",
                "question": 7
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2BackstoryAnswer>(
            """
            {
                "id": "36-158",
                "title": "Kormir",
                "description": "Kormir ist die Göttin der Ordnung, des Geistes und der Wahrheit. Sie war einst sterblich wie ich. Sie inspiriert mich täglich, mutiger zu werden und Herz, Geist und Handeln auf den rechten Weg zu bringen.",
                "journal": "Kormir, die Göttin der Wahrheit, hat mich gesegnet, als ich noch ein Kind war.",
                "question": 36,
                "races": [
                    "Human"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2BackstoryAnswer>(
            """
            {
                "id": "185-163",
                "title": "Spangenhelm",
                "description": "Mein Spangenhelm schüchtert meine Feinde ein und verschafft mir bei Verbündeten Respekt. Wenn ich ihn trage, bin ich fast unverwundbar.",
                "journal": "<br><br>Ich bin ein Krieger und auf dem Schlachtfeld trage ich einen Spangenhelm. Deshalb bin ich nahezu unverwundbar.<br><br>Dies ist meine Geschichte.<br>",
                "question": 185,
                "professions": [
                    "Warrior"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2BackstoryAnswer>(
            """
            {
                "id": "183-172",
                "title": "Bär",
                "description": "Mein Bär und ich bilden eine Einheit im Kampf. Es bedarf nur einer winzigen Geste meinerseits, und schon stürzen wir uns gemeinsam auf den Feind.",
                "journal": "<br><br>Ich bin ein Waldläufer, und ich habe einen Bären, der an meiner Seite kämpft und mich beschützt.<br><br>Dies ist meine Geschichte.<br>",
                "question": 183,
                "professions": [
                    "Ranger"
                ],
                "races": [
                    "Human",
                    "Norn"
                ]
            }
            """.trimIndent()
        )
    }

}