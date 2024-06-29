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

class GW2v2BackstoryQuestionTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 7,
                "title": "Meine Persönlichkeit",
                "description": "Auch schwierige Situationen meistere ich mit ______.",
                "answers": [
                    "7-53",
                    "7-54",
                    "7-55"
                ],
                "order": 1
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 10,
                "title": "Mein Kolleg",
                "description": "Ich bin ein Mitglied am Kolleg für ______.",
                "answers": [
                    "10-67",
                    "10-68",
                    "10-69"
                ],
                "order": 2,
                "races": [
                    "Asura"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 11,
                "title": "Meine erste Erfindung war ______.",
                "description": "Meine erste Erfindung war ______.",
                "answers": [
                    "11-70",
                    "11-71",
                    "11-72"
                ],
                "order": 3,
                "races": [
                    "Asura"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 12,
                "title": "Mein erster Mentor",
                "description": "Mein erster wissenschaftlicher Betreuer, der mir (fast) alles beigebracht hat, was ich weiß, war ______.",
                "answers": [
                    "12-73",
                    "12-74",
                    "12-75",
                    "12-76"
                ],
                "order": 4,
                "races": [
                    "Asura"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 15,
                "title": "",
                "description": "Ich bin stolz auf meine Zugehörigkeit zur _____.",
                "answers": [
                    "15-84",
                    "15-85",
                    "15-86"
                ],
                "order": 2,
                "races": [
                    "Charr"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 16,
                "title": "",
                "description": "Ich würde sterben für meinen Trupp, besonders für ______. Wir trainieren immer gemeinsam.",
                "answers": [
                    "16-87",
                    "16-88",
                    "16-89",
                    "16-90",
                    "16-91"
                ],
                "order": 3,
                "races": [
                    "Charr"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 17,
                "title": "",
                "description": "Man sagt, mein Erzeuger sei ein ______.",
                "answers": [
                    "17-92",
                    "17-93",
                    "17-94"
                ],
                "order": 4,
                "races": [
                    "Charr"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 21,
                "title": "Soziale Klasse",
                "description": "Ich bin ______ aufgewachsen.",
                "answers": [
                    "21-107",
                    "21-105",
                    "21-106"
                ],
                "order": 2,
                "races": [
                    "Human"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 22,
                "title": "Was ich bedaure",
                "description": "Zu den Dingen, die ich am meisten bereue gehört, dass ich ______.",
                "answers": [
                    "22-108",
                    "22-109",
                    "22-110"
                ],
                "order": 3,
                "races": [
                    "Human"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 25,
                "title": "Mein Totemgeist",
                "description": "Als ich noch sehr klein war, hatte ich eine Vision. Ein Geist der Wildnis sprach zu mir und bot mir seinen Schutz an. Dieser Geist war ______.",
                "answers": [
                    "25-117",
                    "25-118",
                    "25-119",
                    "25-120"
                ],
                "order": 4,
                "races": [
                    "Norn"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 26,
                "title": "Eigenschaft eines großen Helden",
                "description": "Meine wichtigste Eigenschaft ist die notwendige ______.",
                "answers": [
                    "26-121",
                    "26-122",
                    "26-123"
                ],
                "order": 2,
                "races": [
                    "Norn"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 27,
                "title": "Mein peinlichster Moment",
                "description": "Bei einem festlichen Bierrat neulich in Hoelbrak ______.",
                "answers": [
                    "27-124",
                    "27-125",
                    "27-126"
                ],
                "order": 3,
                "races": [
                    "Norn"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 30,
                "title": "Mein Geburtszyklus",
                "description": "Der Blasse Baum weckte mich während des ______.",
                "answers": [
                    "30-133",
                    "30-134",
                    "30-135",
                    "30-136"
                ],
                "order": 4,
                "races": [
                    "Sylvari"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 31,
                "title": "Ventaris Lehre",
                "description": "Ich glaube, die wichtigste von Ventaris Lehren lautet: ______.",
                "answers": [
                    "31-137",
                    "31-138",
                    "31-140"
                ],
                "order": 3,
                "races": [
                    "Sylvari"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 32,
                "title": "Mein Traum",
                "description": "Ich träumte von einer Aufgabe, die mich auf den Plan ruft. Es war eine Vision des ______.",
                "answers": [
                    "32-141",
                    "32-142",
                    "32-143"
                ],
                "order": 2,
                "races": [
                    "Sylvari"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 36,
                "title": "Die sechs Götter",
                "description": "Man sagt, ______ habe mich gesegnet, als ich noch ein Kind war.",
                "answers": [
                    "36-153",
                    "36-154",
                    "36-155",
                    "36-156",
                    "36-157",
                    "36-158"
                ],
                "order": 4,
                "races": [
                    "Human"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 181,
                "title": "Mein nützlichstes Werkzeug.",
                "description": "Mein nützlichstes Werkzeug ist ______.",
                "answers": [
                    "181-178",
                    "181-179",
                    "181-180"
                ],
                "order": 0,
                "professions": [
                    "Engineer"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 182,
                "title": "Umhang",
                "description": "Als Zeichen meiner Hingabe trage ich einen ______.",
                "answers": [
                    "182-166",
                    "182-176",
                    "182-177"
                ],
                "order": 0,
                "professions": [
                    "Guardian"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 183,
                "title": "Tiergefährte",
                "description": "Mein Tiergefährte, ______, kämpft an meiner Seite und beschützt mich.",
                "answers": [
                    "183-171",
                    "183-172",
                    "183-173",
                    "183-174",
                    "183-175",
                    "183-181",
                    "183-182",
                    "183-1"
                ],
                "order": 0,
                "professions": [
                    "Ranger"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 184,
                "title": "Totenschädel",
                "description": "Der Tod ist des Nekromanten steter Begleiter. Zur Erinnerung zeichne ich mein Gesicht mit dem Symbol eines ______.",
                "answers": [
                    "184-167",
                    "184-168",
                    "184-169"
                ],
                "order": 0,
                "professions": [
                    "Necromancer"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 185,
                "title": "Helm",
                "description": "Auf dem Schlachtfeld trage ich ______. So erkennt man mich und erweist mir den gebührenden Respekt.",
                "answers": [
                    "185-163",
                    "185-164",
                    "185-165"
                ],
                "order": 0,
                "professions": [
                    "Warrior"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 186,
                "title": "Schmuckstück",
                "description": "Ich studiere alle Elemente, doch der Edelstein, den ich trage, zeigt meine Hingabe zum Element ______.",
                "answers": [
                    "186-159",
                    "186-160",
                    "186-161",
                    "186-162"
                ],
                "order": 0,
                "professions": [
                    "Elementalist"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 187,
                "title": "Die Kleidung, die ich trage.",
                "description": "Bei meiner Arbeit muss man eines verstanden haben: wie mächtig ______ ist.",
                "answers": [
                    "187-184",
                    "187-185",
                    "187-186"
                ],
                "order": 0,
                "professions": [
                    "Thief"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 188,
                "title": "Das Gesicht, das ich trage.",
                "description": "Die Maske eines Mesmers erschafft ein Image. Ich begegne der Welt am liebsten mit _______.",
                "answers": [
                    "188-187",
                    "188-188",
                    "188-189"
                ],
                "order": 0,
                "professions": [
                    "Mesmer"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2BackstoryQuestion>(
            """
            {
                "id": 189,
                "title": "Augenbinde",
                "description": "Ich kämpfe mit meiner ______-Augenbinde, um die Ablenkungen der physischen Welt auszublenden und mein inneres magisches Auge zu fokussieren.",
                "answers": [
                    "189-187",
                    "189-188",
                    "189-189"
                ],
                "order": 0,
                "professions": [
                    "Revenant"
                ]
            }
            """.trimIndent()
        )
    }

}