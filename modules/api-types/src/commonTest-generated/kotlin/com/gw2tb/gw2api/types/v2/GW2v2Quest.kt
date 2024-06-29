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

class GW2v2QuestTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Quest>(
            """
            {
                "name": "Explosiver Intellekt",
                "level": 1,
                "story": 8,
                "goals": [
                    {
                        "active": "Haltet die feindlichen Golems auf.",
                        "complete": "Die Inquestur hat eine Flut feindlicher Golems losgelassen, um einen dreisten Datendiebstahl am helllichten Tag zu vertuschen. Mit der Hilfe von Zojja und Meister Funkel habe ich die Agenten der Inquestur besiegt, ihre Golems und ihren monströsen Prototyp X."
                    }
                ],
                "id": 15
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Quest>(
            """
            {
                "name": "Ein Volk der Charr, ein Drache, ein Champion",
                "level": 80,
                "story": 97,
                "goals": [
                    {
                        "active": "",
                        "complete": ""
                    },
                    {
                        "active": "",
                        "complete": ""
                    },
                    {
                        "active": "Verhindert Jormags Erwachen.",
                        "complete": "Wir schafften es nicht rechtzeitig.\n\nUnd selbst wenn, hätte es keine Möglichkeit gegeben, zu ahnen, was passieren würde.\n\nWir hatten die Spitze von Jormags Feste erreicht, die Oberherrschaft-Soldaten ausgeschaltet und das Gebiet gesichert, damit Efram und Malice zu uns stoßen konnten. Als wir in Jormags Kammer stürmten, hatten wir keine Ahnung, was wir erwarten sollten.\n\nDer frühere Blut-Imperator hatte die Svanir dazu benutzt, ihm zu helfen, die Totems von Wolf, Bärin, Schneeleopardin und Rabe zu erobern und hatte sie in einer Art verzerrtem Ritual vor Jormag aufgestellt. Bangar hatte vor, die Geister der Wildnis zu verderben und sie wie eine Karotte zu nutzen, um Jormag kontrollieren zu können, genauso, wie Jormag die Kräfte von Ochse, Adler und Vielfraß benutzt hatte, um Drakkar in den Bjora-Sümpfen zu beherrschen.\n\nEs gelang uns, Bangar aufzuhalten, doch nur kurz. Ryland tat seine Präsenz bald allen kund, indem er seinen Imperator rügte, er versuche, den Alt-Drachen mithilfe der Norn-Geister zu manipulieren. Ryland umgab jedes der vier Totems mit kraftvoller Magie, wobei er sie für Jormag sperrte und sich für ihre Verderbung verbürgte, wenn wir nicht einschritten.\n\nMit der Hilfe Brahams, Rytlocks und Crecias gelang es uns, alle vier großen Geister von ihrem Schicksal zu befreien, doch nicht rechtzeitig, um Jormags Erwachen zu verhindern.\n\nWir hätten niemals erraten können, was als Nächstes geschah: Jormag machte nicht Bangar zu seinem Champion. Stattdessen erwählte er Bangar zu seiner \"Stimme\" und überließ ihn uns wie eine Art ... Geschenk.\n\nRyland spürte eine Gelegenheit, und er ergriff sie. Jormag sah eindeutig etwas in dem jungen Charr, etwas, das er sehr schätzte, und er machte Ryland zu einer monströsen Kreatur aus Eis und Frost. Ryland war Jormags Champion.\n\nFast unmittelbar danach flohen die beiden und ließen uns mit Bangar und tausend Fragen zurück."
                    },
                    {
                        "active": "Trefft Eure Verbündeten zur Nachbesprechung im Auge des Nordens.",
                        "complete": "Aurene nahm kein Blatt vor den Mund. Die Situation ist arg. Schlimmer als wir je hätten ahnen können.\n\nSie sagte, als Jormag erwachte, sei eine Art Beben durch ganz Tyria gegangen. Sie sagte, es habe sich angefühlt, als schreie die Welt vor Schmerzen auf.\n\nJormag ist fort. Ryland ebenfalls. Und wir wissen weder, wo sie sind, noch was sie vorhaben.\n\nDas Einzige, was wir tun können, ist warten. Zum Glück – obwohl ich diesen Ausdruck mit Vorsicht benutze – hat Jormag uns Bangar zurückgelassen, gefesselt durch Eis und seltsame Magie und in der Lage, mit uns an Jormags Stelle zu kommunizieren. Wünscht der Eisdrache, mit uns zu sprechen, wird er dies durch Bangar tun.\n\nAlso haben wir beschlossen, den früheren Imperator im Auge des Nordens unter dem wachsamen Blick Aurenes festzusetzen. Jetzt, da Jormag frei durch die Welt streift, ist niemand sicher. Wir müssen stets wachsam sein und uns auf den unausweichlichen Krieg vorbereiten, den wir alle zu vermeiden gehofft hatten."
                    }
                ],
                "id": 580
            }
            """.trimIndent()
        )
    }

}