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

class GW2v2StoryTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Story>(
            """
            {
                "id": 8,
                "season": "215AAA0F-CDAC-4F93-86DA-C155A99B5784",
                "name": "Meine Geschichte",
                "description": "",
                "timeline": "1325 n. E.",
                "level": 1,
                "races": [
                    "Asura"
                ],
                "order": 0,
                "chapters": [
                    {
                        "name": "1. Missglückte Experimente"
                    },
                    {
                        "name": "2. Interessierte Gruppen"
                    },
                    {
                        "name": "3. Rettet den Forscher"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Story>(
            """
            {
                "id": 39,
                "season": "002C2D90-69B5-41A2-A422-8DB6F2EFC53E",
                "name": "Geschichtsstunde Staffel 1",
                "description": "Scarlet Dornstrauch wollte den natürlichen Fluss der Magie für eigennützige Zwecke einspannen, jedenfalls dachten die Leute das. Sie inszenierte ihre Schreckensherrschaft aus den Schatten heraus und sandte Schergen durch ganz Tyria, um jene zu beseitigen, die ihr im Weg standen. Als ihre Pläne entschlüsselt wurden, waren bereits schreckliche Ereignisse in Bewegung geraten, die Tyria für immer verändern sollten.\n\n\n<c=@Quest>Neuigkeiten von ArenaNet</c>\nAusgewählte Missionen von Staffel 1 der Lebendigen Welt können jetzt vom Spähbecken im Auge des Nordens aus erneut gespielt werden. Um die Aufgabe freizuschalten und diese Missionen erneut zu erleben, schließt das Geschichtskapitel \"Visionen der Vergangenheit: Feuer und Stahl\" ab.\n\n<c=@Warning>Nachricht von ArenaNet</c>\nStaffel 1 der Lebendigen Welt war eine Folge von Live-Content-Ereignissen, die von Januar 2013 bis März 2014 lief. Die Handlung war darauf ausgelegt, so erlebt zu werden, wie sie sich ereignete. Gegenwärtig ist sie im Gegensatz zu Staffel 2 nicht als Wiederholung in Episoden verfügbar, deswegen haben wir eine Zusammenfassung erstellt, die Euch über die Ereignisse zwischen dem Ende der Persönlichen Geschichte (ungefähr 1325 n. E.) und Staffel 2 der Lebendigen Welt (1327 n. E.) informieren soll.\n\nWenn Ihr die Zusammenfassung von Staffel 1 abgeschlossen habt, solltet Ihr das Verzeichnis der spielbaren Episoden von Staffel 2 durchsehen. Die Episoden von Staffel 2 sind wiederholbar, nach der Freischaltung für Euren Account könnt Ihr sie also beliebig oft spielen, wann immer Ihr wollt. Ihr könnt die Episoden kostenlos genießen, wenn Ihr mit einem Spieler, der sie freigeschaltet hat, in einer Gruppe seid, oder Ihr könnt sie mit Edelsteinen kaufen, um vollen Zugang zu den zugehörigen Erfolgen und Belohnungen zu haben.",
                "timeline": "1326 n. E. – 1327 n. E.",
                "level": 80,
                "order": 1,
                "chapters": [
                    {
                        "name": "Zusammenfassung von Staffel 1"
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Story>(
            """
            {
                "id": 81,
                "season": "EAB597C0-C484-4FD3-9430-31433BAC81B6",
                "name": "12. Gottesmord",
                "description": "Bezwingt Balthasar.",
                "timeline": "1330 n. E.",
                "level": 80,
                "order": 12,
                "chapters": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Story>(
            """
            {
                "id": 98,
                "season": "EDCAE800-302A-4D9B-8331-3CC769ADA0B3",
                "name": "5. Champions",
                "description": "Der Kommandeur versammelt seine Verbündeten und verteidigt im spannungsgeladenen Höhepunkt von \"Die Eisbrut-Saga\" ganz Tyria vor dem Marsch der beiden Drachen.",
                "timeline": "1333 n. E.",
                "level": 80,
                "order": 7,
                "chapters": [],
                "flags": [
                    "RequiresUnlock"
                ]
            }
            """.trimIndent()
        )
    }

}