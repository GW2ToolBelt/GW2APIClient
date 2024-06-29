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

class GW2v2MasteryTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Mastery>(
            """
            {
                "id": 1,
                "name": "Lehre der Erhabenen",
                "requirement": "Reist zum Güldenen Talkessel, um den Beherrschungspfad der Lehre der Erhabenen freizuschalten.",
                "order": 2,
                "background": "https://render.guildwars2.com/file/4E09B60E16E6A7404B0638A00D0C6A02F7294308/1228720.png",
                "region": "Maguuma",
                "levels": [
                    {
                        "name": "Zeichen der Erhabenen",
                        "description": "Erhaltet die Fähigkeit, die Schriftzeichen der Erhabenen zu lesen. So erhaltet Ihr Zugang zu den Geheimnissen ihrer Zivilisation.",
                        "instruction": "Ihr könnt jetzt mit Erhabenen-Artefakten interagieren, die im Güldenen Talkessel und im Großraum des Maguuma-Dschungels zu finden sind.",
                        "icon": "https://render.guildwars2.com/file/7372DCB5085D75F672B50CB8F3577373B8F90468/1228654.png",
                        "point_cost": 1,
                        "exp_cost": 508000
                    },
                    {
                        "name": "Akzeptanz der Erhabenen",
                        "description": "Erhaltet das Vertrauen der mysteriösen wie fremdartigen Erhabenen und erlangt so Zugang zu den Waren und Angeboten der Vergessenen Stadt.",
                        "instruction": "Ihr könnt jetzt mit den Erhabenen und ihren Repräsentanten Handel treiben. Beherrschungshändler findet Ihr im ganzen Maguuma-Dschungel: Sie werden Euch durch Beherrschungssymbole auf der Karte angezeigt.",
                        "icon": "https://render.guildwars2.com/file/39DBD70271A074DCD6B1EAE1D639BD4D36765EC4/1228651.png",
                        "point_cost": 2,
                        "exp_cost": 1016000
                    },
                    {
                        "name": "Erhabenen-Unterstützung",
                        "description": "Lernt, die Erhabenen-Rückrufgeräte im Maguuma-Dschungel zu benutzen, mit denen Ihr für kurze Zeit Krieger der Erhabenen zum Kämpfen herbeirufen könnt.",
                        "instruction": "Ihr könnt mit den Rückrufgeräten der Erhabenen interagieren, um einen Erhabenen-Verbündeten zu Hilfe zu rufen oder einem bereits herbeigerufenen Verbündeten mehr Kraft zu verleihen.",
                        "icon": "https://render.guildwars2.com/file/B9B7E50E29F554570E63945249002FC6B64C7FFB/1228652.png",
                        "point_cost": 3,
                        "exp_cost": 1778000
                    },
                    {
                        "name": "Reinwaschung der Erhabenen",
                        "description": "Sichert Euch die Verehrung der Erhabenen: Fordert einmal am Tag ihren Champion heraus und schaltet so die größten Schätze der Vergessenen Stadt frei.",
                        "instruction": "Ihr könnt jetzt gegen den Mattierten Verräter unter der Vergessenen Stadt kämpfen. Wenn Ihr den Mattierten Verräter besiegt, erhaltet Ihr einmal pro Tag Zugang zu einer Belohnungstruhe.",
                        "icon": "https://render.guildwars2.com/file/EE132C76A52AC66D0211CED63E74F64B7F4AFB34/1228655.png",
                        "point_cost": 5,
                        "exp_cost": 2540000
                    },
                    {
                        "name": "Erhabenes Sammeln",
                        "description": "Lernt von den Erhabenen, wie man im Maguuma-Dschungel seltene Materialien sammelt. Lernt, aus Erzknoten im Güldenen Talkessel Güldene Späne zu gewinnen.",
                        "instruction": "Beim Erzabbau im Güldenen Talkessel erhaltet Ihr jetzt zusätzlich zu normalen Materialien auch noch Güldene Späne. Außerdem erhaltet Ihr eine Chance, in Erzknoten überall im Herz von Maguuma auf besondere Gegenstände zu stoßen.",
                        "icon": "https://render.guildwars2.com/file/324312530AA1A427AB0951D0BFBC92C4B69774D6/1228653.png",
                        "point_cost": 8,
                        "exp_cost": 3302000
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Mastery>(
            """
            {
                "id": 2,
                "name": "Lehre der Itzel",
                "requirement": "Trainiert Grundlagen des Gleitens im Beherrschungspfad des Gleitens, um den Beherrschungspfad der Lehre der Itzel freizuschalten.",
                "order": 1,
                "background": "https://render.guildwars2.com/file/F2ED9E6B330AA015B8AD06FF222715284E1BC622/1228723.png",
                "region": "Maguuma",
                "levels": [
                    {
                        "name": "Hüpfpilze",
                        "description": "Erlernt, wie man präzise Landungen vollführt und nutzt die Hüpfpilze, die im Herzen von Maguuma zu finden sind, um zu Orten zu gelangen, die vorher unerreichbar waren.",
                        "instruction": "Hüpfpilze findet man überall im Herz von Maguuma. Springt auf die Kappe eines Hüpfpilzes, um in die Luft geschleudert zu werden.",
                        "icon": "https://render.guildwars2.com/file/C1D5574EF6B9B4CC7AB7EC3600993698D39BF975/1228645.png",
                        "point_cost": 1,
                        "exp_cost": 508000
                    },
                    {
                        "name": "Itzel-Sprache",
                        "description": "Lernt den schwierigen Dialekt der Itzel, freundet Euch mit den ortsansässigen Itzel an und erhaltet so Zugang zu Händlern mit exklusiven Warenangeboten.",
                        "instruction": "Ihr könnt jetzt mit den Itzel Handel treiben. Beherrschungshändler findet Ihr im ganzen Maguuma-Dschungel: Sie werden Euch durch Beherrschungssymbole auf der Karte angezeigt.",
                        "icon": "https://render.guildwars2.com/file/68B5A54FEC5F3C7763C5BDD12C0296942ABB0BB2/1228660.png",
                        "point_cost": 2,
                        "exp_cost": 1016000
                    },
                    {
                        "name": "Blitzgeschwindigkeits-Pilze",
                        "description": "Nach zahllosen Stunden auf dem Donnerbalken könnt Ihr die geschwindigkeitssteigernden Pilze, die man im Herzen von Maguuma findet, verdauen. Rennt wie der Blitz, mit freundlicher Unterstützung der Natur!",
                        "instruction": "Blitzgeschwindigkeits-Pilze findet man überall im Herz von Maguuma. Begebt Euch einfach in die Nähe eines Blitzgeschwindigkeits-Pilzes oder geht durch einen hindurch, um eine Geschwindigkeitsverstärkung zu erhalten.",
                        "icon": "https://render.guildwars2.com/file/C2609360DCF254E70C023517E27375AB0FA32236/1228644.png",
                        "point_cost": 3,
                        "exp_cost": 1778000
                    },
                    {
                        "name": "Giftlehre der Itzel",
                        "description": "Lernt alles über die Gifte der Itzel und erhaltet die Fähigkeit, giftige Mordrem-Ranken zu passieren und den giftigen Dünsten Maguumas zu widerstehen.",
                        "instruction": "Ihr könnt Euch jetzt in Gebiete mit giftigen Dünsten begeben und giftige Mordrem-Ranken durchqueren, ohne Schaden zu nehmen.",
                        "icon": "https://render.guildwars2.com/file/4D2F77BE539B0F065B97C8B007E8D7324DA40D3C/1228662.png",
                        "point_cost": 5,
                        "exp_cost": 2540000
                    },
                    {
                        "name": "Itzel-Führung",
                        "description": "Schaut Euch den Kampfstil der Itzel genau an und fordert dann den Champion des Gegners heraus, um einen wertvollen Tagespreis zu erhalten.",
                        "instruction": "Ihr könnt jetzt gegen Mayatl den Grimmigen antreten, indem Ihr mit dem Itzel-Klingentänzer vor dem Dorf der Jaka Itzel sprecht. Besiegt Ihr diesen Champion, könnt Ihr einmal am Tag auf eine Belohnungstruhe zugreifen.",
                        "icon": "https://render.guildwars2.com/file/0735EF06110A01EF69C2710EA1390A45EBE57232/1228661.png",
                        "point_cost": 8,
                        "exp_cost": 3302000
                    },
                    {
                        "name": "Adrenalpilze",
                        "description": "Wenn Ihr lernt Pilze zu essen, kommt es zu einer Mutation Eurer Adrenalindrüsen. Ihr erhaltet eine Welle Adrenalin und könnt Eure Fertigkeiten sofort auffrischen.",
                        "instruction": "Adrenalpilze findet man selten im Herz von Maguuma. Begebt Euch einfach in die Nähe eines Adrenalpilzes oder geht durch einen hindurch, um all Eure Fertigkeiten sofort auffrischen zu lassen.",
                        "icon": "https://render.guildwars2.com/file/EB50DAD5409C937CD17A0A216A7B3E04E0C25307/1228643.png",
                        "point_cost": 12,
                        "exp_cost": 4318000
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Mastery>(
            """
            {
                "id": 3,
                "name": "Lehre der Nuhoch",
                "requirement": "Reist nach Verschlungene Tiefen, um den Beherrschungspfad der Lehre der Nuhoch freizuschalten.",
                "order": 3,
                "background": "https://render.guildwars2.com/file/05AABD5EF4CF91375CE2420575C4B8CE5A084F05/1228724.png",
                "region": "Maguuma",
                "levels": [
                    {
                        "name": "Nuhoch-Jagd",
                        "description": "Lernt, wie Ihr von Feinden in Maguuma spezielle Trophäen erhalten und Sägeblattpilze ernten und so seltene Sammlungen und Gegenstände freischalten könnt.",
                        "instruction": "Ihr habt jetzt die Chance, bei allen im Herz von Maguuma erlegten Kreaturen besondere Gegenstände zu erbeuten. Außerdem könnt Ihr Sägeblattpilze ernten, die überall im Maguuma-Dschungel zu finden sind.",
                        "icon": "https://render.guildwars2.com/file/F9EB68F169FB63A5D552471F2692AA73771D06F0/1228664.png",
                        "point_cost": 1,
                        "exp_cost": 508000
                    },
                    {
                        "name": "Nuhoch-Suhlen",
                        "description": "Meistert die Nuhoch-Suhlen und lernt, diese versteckten Gänge zu nutzen, um an weit entlegene und verborgene Orte zu gelangen.",
                        "instruction": "Ihr könnt jetzt mit Nuhoch-Suhlen interagieren. Wenn Ihr das tut, werdet Ihr sofort zwischen Suhlen-Eingängen und -Ausgängen im Maguuma-Dschungel hin und her transportiert.",
                        "icon": "https://render.guildwars2.com/file/9B51B95FD0BD6FB80F900101977FFD66224605B1/1228668.png",
                        "point_cost": 2,
                        "exp_cost": 1016000
                    },
                    {
                        "name": "Sprache der Nuhoch",
                        "description": "Lernt die traditionelle Sprache der Nuhoch, was Euch in die Lage versetzt, Handel zu treiben und mit den argwöhnischeren Mitgliedern der Gruppe zu sprechen.",
                        "instruction": "Ihr könnt jetzt mit den Nuhoch Handel treiben. Beherrschungshändler findet Ihr im ganzen Maguuma-Dschungel: Sie werden Euch durch Beherrschungssymbole auf der Karte angezeigt.",
                        "icon": "https://render.guildwars2.com/file/7C9EB6B44A1F9D690D4D9A9856A01805395BD9A1/1228665.png",
                        "point_cost": 3,
                        "exp_cost": 1778000
                    },
                    {
                        "name": "Nuhoch-Enttarnung",
                        "description": "Lernt, getarnte Feinde zu entdecken und sie für Euer geschultes Auge sichtbar zu machen.",
                        "instruction": "Ihr könnt jetzt Kreaturen sehen, die im Maguuma-Dschungel normalerweise unsichtbar sind. Verborgene Kreaturen erscheinen Euch hervorgehoben, und Ihr könnt sie leicht finden oder sie meiden.",
                        "icon": "https://render.guildwars2.com/file/1606273520E5106D475C90447904E256E8FE6B98/1228667.png",
                        "point_cost": 5,
                        "exp_cost": 2540000
                    },
                    {
                        "name": "Prüfungen der Nuhoch",
                        "description": "Fordert den Nuhoch-Champion im Kampf heraus, um Euch den Respekt der Nuhoch zu verdienen und ein Lager mit mächtigen Belohnungen freizuschalten.",
                        "instruction": "Ihr könnt jetzt gegen Potoni den Gewaltigen in Teku Nuhoch kämpfen. Wenn Ihr Potoni den Gewaltigen besiegt, erhaltet Ihr einmal pro Tag Zugang zu einer Belohnungstruhe.",
                        "icon": "https://render.guildwars2.com/file/EA0D13224CC35B3F591DBD9812E9EA620C0FFE2F/1228666.png",
                        "point_cost": 8,
                        "exp_cost": 3302000
                    },
                    {
                        "name": "Alchemie der Nuhoch",
                        "description": "Trainiert mit den Nuhoch, um zu lernen, wie man die starke Säure der Chak neutralisiert. Ohne diese Fähigkeit kann die Chak-Säure Gegner vernichten.",
                        "instruction": "Weicht Ihr aus, werden ab sofort sämtliche Stapel von Chak-Globber entfernt, die auf Euch wirken. Außerdem seid Ihr immun gegen die verlangsamenden Effekte von Globber.",
                        "icon": "https://render.guildwars2.com/file/BED24BC7330F366E367FE0C9EA6975739B590A44/1228663.png",
                        "point_cost": 12,
                        "exp_cost": 4318000
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Mastery>(
            """
            {
                "id": 4,
                "name": "Pakt-Kommandeur",
                "requirement": "",
                "order": 0,
                "background": "https://render.guildwars2.com/file/65DE3662C705233AC1073EF297B15AADD7A8A644/1228718.png",
                "region": "Tyria",
                "levels": [
                    {
                        "name": "Pakt-Mentor",
                        "description": "Lernt, ein Mentor für die Helden von Tyria zu sein. Ihr erhaltet das spezielle Mentoren-Abzeichen, einen Chat-Titel und einen Eile-Bonus in Städten für Euch und Eure Gruppe.",
                        "instruction": "Ihr könnt nun das Mentoren-Abzeichen nutzen, das im Gruppenmenü verfügbar ist, und den Mentoren-Chat-Titel über den Mentoren-Schrägstrich-Befehl aktivieren. Eure Gruppe hat außerdem einen permanenten Eile-Bonus von 5 % in Städten.",
                        "icon": "https://render.guildwars2.com/file/D32A52F4E1EB3EC57D035531A31BE217E63DC0F8/1228648.png",
                        "point_cost": 1,
                        "exp_cost": 635000
                    },
                    {
                        "name": "Produktive Auszeit",
                        "description": "Lernt, effizienter zu sein, und erhaltet Bonuserfahrungspunkte durch die Herstellung von Gegenständen.",
                        "instruction": "Ihr erhaltet jetzt 10 % Bonuserfahrungspunkte bei allen Herstellungsprozessen, die Erfahrungspunkte verleihen. Ihr habt außerdem eine um 10 % erhöhte Chance auf kritische Bonuserfahrungspunkte bei der Herstellung von Gegenständen.",
                        "icon": "https://render.guildwars2.com/file/0BCD77C3BF1BFD54162C992EDBF04209B653B865/1228649.png",
                        "point_cost": 2,
                        "exp_cost": 1270000
                    },
                    {
                        "name": "Nachschubsicherung",
                        "description": "Ihr erhaltet Zugriff auf ein Netzwerk von regionalen Händlern in Tyria, die einen begrenzten Vorrat an seltenen Waren zum Handel anbieten. Außerdem erhält Eure Gruppe in Städten einen Eile-Bonus von 15 %.",
                        "instruction": "Ihr könnt jetzt mit Pakt-Vorratsnetz-Agenten handeln, die durch Zentraltyria reisen. Ihr könnt bei jedem Agenten pro Tag für Karma einen Gegenstand kaufen. Außerdem erhält Eure Gruppe einen permanenten Eile-Bonus von 15 % in Städten.",
                        "icon": "https://render.guildwars2.com/file/4E43E92F349620FA060ABF9A3BC052657F7EC35A/1228650.png",
                        "point_cost": 3,
                        "exp_cost": 2222500
                    },
                    {
                        "name": "Adel verpflichtet",
                        "description": "Lernt, wie Ihr Eure Verbündeten schneller und mit weniger Nachteilen wiederbelebt.",
                        "instruction": "Ihr könnt verbündete Spieler nun schneller wiederbeleben und bei erfolgreicher Wiederbelebung die Haltbarkeits- und Angeschlagen-Mali verhindern. Die Geschwindigkeit der Wiederbelebung wird noch einmal erhöht, wenn der Charakter, der wiederbelebt wird, eine niedrigere Stufe hat als Ihr.",
                        "icon": "https://render.guildwars2.com/file/EC25C613ED2A35DB4256F0DF4A5F19389765D8E6/1228647.png",
                        "point_cost": 5,
                        "exp_cost": 3175000
                    },
                    {
                        "name": "Fortschrittliche Logistik",
                        "description": "Lernt, Beute von gefallenen Gegnern automatisch einzusammeln, außerdem erhält Eure Gruppe in Städten einen größeren Eile-Bonus.",
                        "instruction": "Ihr habt jetzt die Möglichkeit, Beute von besiegten Kreaturen sofort in Euer Inventar platzieren zu lassen. Diese Fähigkeit kann im Optionsmenü deaktiviert werden. Außerdem erhält Eure Gruppe einen permanenten Eile-Bonus von 33 % in Städten.",
                        "icon": "https://render.guildwars2.com/file/A41824167F010C0667B3F697DE03E132BD01ED01/1228646.png",
                        "point_cost": 8,
                        "exp_cost": 4127500
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Mastery>(
            """
            {
                "id": 5,
                "name": "Fraktal-Einstimmung",
                "requirement": "",
                "order": 2,
                "background": "https://render.guildwars2.com/file/5A19BB62274C6297773A1A21A94BAB9AB2A0711D/1228721.png",
                "region": "Tyria",
                "levels": [
                    {
                        "name": "Rat befolgen",
                        "description": "Erhaltet mit Dessas Erlaubnis Zugriff auf zusätzliche tägliche Erfolge und spezielle Händler mit einzigartigen Gegenständen im Observatorium Nebelsperre.",
                        "instruction": "Ihr habt zusätzliche tägliche Erfolge für die Fraktal-Schwierigkeitsgrade 21–49 freigeschaltet. Außerdem erhaltet Ihr im Observatorium Nebelsperre Zugriff auf spezielle Händler mit einzigartigen Gegenständen.",
                        "icon": "https://render.guildwars2.com/file/D763657543F51E1FB608D0CBBBF350C1F1CD14C9/1228657.png",
                        "point_cost": 1,
                        "exp_cost": 635000
                    },
                    {
                        "name": "Qual-Kanalisierer",
                        "description": "Längeres Erleiden von Qual bringt verbesserte Belohnungen in den Fraktal-Verliesen ein. Außerdem erhaltet Ihr Zugriff auf Rezepte der Mystischen Schmiede, mit denen Ihr aufgestiegenen Ringen weitere Plätze für Qual-Infusionen hinzufügen könnt. Nebeltränke gewähren Bonusattribute.",
                        "instruction": "Ihr erhaltet jetzt Bonusbelohnungen aus den Bosstruhen in Fraktal-Verliesen. Händler verkaufen jetzt Zutaten zur Einstimmung von Ringen in der Mystischen Schmiede, die Euren aufgestiegenen oder infundierten Ringen zusätzliche Plätze für Qual-Widerstand verleiht. Nebeltränke verwandeln auch einen Prozentsatz Eures Qual-Widerstands in spezifische Attribute, je nach verwendetem Trank.",
                        "icon": "https://render.guildwars2.com/file/11B70969E876E8DD00484B42553C3CEF947CE863/1228656.png",
                        "point_cost": 2,
                        "exp_cost": 1270000
                    },
                    {
                        "name": "Rekursive Bereitstellung",
                        "description": "Größere Einstimmung mit den Fraktalen verleiht Bonusbelohnungen aus Truhen der Nebel und freigeschalteten Fraktal-Chiffrierungen. Auch die Fraktal-Trank-Konvertierung verbessert sich.",
                        "instruction": "Ihr erhaltet jetzt Bonusbelohnungen aus Truhen der Nebel sowie Fraktal-Chiffrierungen. Auch die Nebeltrank-Konvertierung hat sich verbessert.",
                        "icon": "https://render.guildwars2.com/file/9D7273DC6F6211A636A74ED9F6CE3F932A23514C/1228659.png",
                        "point_cost": 3,
                        "exp_cost": 2222500
                    },
                    {
                        "name": "Nebelsperre-Singularitäten",
                        "description": "Erforscht, wie Ihr die lebensrettenden Nebelsperre-Singularitäten in den Fraktalen der Nebel aktiviert. Fraktal-Trank-Konvertierung verbessert sich.",
                        "instruction": "Ihr könnt nun Nebelsperre-Singularitäten in den Fraktalen der Nebel aktivieren, um sofortige Fertigkeiten-Wiederaufladung, zusätzlichen Qual-Widerstand und einen Schild zu erhalten, der Euren Tod in Fraktal-Verliesen verhindern kann. Fraktal-Trank-Konvertierung wurde verbessert.",
                        "icon": "https://render.guildwars2.com/file/65ACE09437747DD1B84A5B9559DD75269A0EEB24/1228658.png",
                        "point_cost": 5,
                        "exp_cost": 3175000
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2Mastery>(
            """
            {
                "id": 6,
                "name": "Legendäre Handwerkskunst",
                "requirement": "",
                "order": 1,
                "background": "https://render.guildwars2.com/file/2E91B0BD09CF08991E079CFB1727412AB12427F4/1228719.png",
                "region": "Tyria",
                "levels": [
                    {
                        "name": "Verehrter Antiquar",
                        "description": "Lernt, wie Ihr mit der Herstellung einer legendären Waffe beginnt, indem Ihr den ersten Rang der Präkursor-Waffensammlungen freischaltet.",
                        "instruction": "Ihr könnt jetzt mit Großmeisterhandwerker Hobbs in Löwenstein sprechen, um mit der Präkursor-Waffensammlung ersten Ranges für eine beliebige legendäre Waffe zu beginnen.",
                        "icon": "https://render.guildwars2.com/file/EB666596D8CA19CBAD0B034FB3DB3F7E0B9D1C0F/1228671.png",
                        "point_cost": 1,
                        "exp_cost": 1270000
                    },
                    {
                        "name": "Magister der Legenden",
                        "description": "Erfahrt mehr über Komponenten, die für die Herstellung von Präkursor-Waffen zweiten Ranges benötigt werden.",
                        "instruction": "Ihr könnt jetzt Komponenten für die Herstellung von Präkursor-Waffen zweiten Ranges bei Großmeisterhandwerker Hobbs in Löwenstein kaufen.",
                        "icon": "https://render.guildwars2.com/file/0C5A24F4086C4FFFD105A0C9EAC480F8B95AC7B5/1228670.png",
                        "point_cost": 3,
                        "exp_cost": 2540000
                    },
                    {
                        "name": "Historiker des Wettrüstens",
                        "description": "Erfahrt mehr über Komponenten, die für die Herstellung von Präkursor-Waffen des dritten und letzten Ranges benötigt werden.",
                        "instruction": "Ihr könnt jetzt Komponenten für die Herstellung von Präkursor-Waffen dritten Ranges bei Großmeisterhandwerker Hobbs in Löwenstein kaufen.",
                        "icon": "https://render.guildwars2.com/file/4521EF3192316745EC58C4A8FEBA2FB2CE4AE577/1228669.png",
                        "point_cost": 6,
                        "exp_cost": 3810000
                    },
                    {
                        "name": "Gelehrter der Geheimnisse",
                        "description": "Erfahrt etwas über die Sammlungen legendärer Waffen, die zur Herstellung der legendären Waffen von Heart of Thorns verwendet werden.",
                        "instruction": "Ihr könnt jetzt Komponenten für die Herstellung der legendären Waffen aus Heart of Thorns bei Großmeisterhandwerker Hobbs in Löwenstein kaufen.",
                        "icon": "https://render.guildwars2.com/file/E4A5BBD50AF41EC2EF94C1483740AFEFB609199F/1228672.png",
                        "point_cost": 9,
                        "exp_cost": 5080000
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2Mastery>(
            """
            {
                "id": 8,
                "name": "Gleiten",
                "requirement": "Reist in das Herz von Maguuma und schließt den Geschichtsabschnitt \"Dem Himmel entrissen\" ab, um den Beherrschungspfad des Gleitens freizuschalten.",
                "order": 0,
                "background": "https://render.guildwars2.com/file/68A54A21C030C5BA742603D3BF0305F344746F95/1228722.png",
                "region": "Maguuma",
                "levels": [
                    {
                        "name": "Grundlagen des Gleitschirms",
                        "description": "Verschafft Euch Zugriff auf einen Gleiter, damit Ihr zwischen den höchsten Punkten im Herz von Maguuma und auf Karten der offenen Welt Zentraltyrias hin- und hergleiten könnt.",
                        "instruction": "Zum Gleiten springt Ihr von einem hohen Punkt ab und drückt dann während des Fallens nochmals die Sprung-Taste.",
                        "icon": "https://render.guildwars2.com/file/A13A40AC0D4F0507780039C24B19D6E9C0D2FE1F/962098.png",
                        "point_cost": 1,
                        "exp_cost": 508000
                    },
                    {
                        "name": "Aufwind-Verwendung",
                        "description": "Durch verbessertes Design Eurer Gleitschirm-Griffe und Flügelschlitze könnt Ihr jetzt voller Selbstvertrauen in die Aufwinde fliegen. Ihr gewinnt so an Höhe und könnt zu vorher unerreichbaren Orten fliegen.",
                        "instruction": "Aufwinde sind wirbelnde Windsäulen, die man im ganzen Maguuma-Dschungel findet. Um sie zu nutzen, gleitet einfach in sie hinein, um einen Höhenschub zu erhalten.",
                        "icon": "https://render.guildwars2.com/file/27C9EDD3F2516E486299ABF50929E759F5BCC4E8/962097.png",
                        "point_cost": 2,
                        "exp_cost": 1016000
                    },
                    {
                        "name": "Techniken des Lehnens",
                        "description": "Lernt, Euch beim Gleiten nach vorn zu lehnen, um schneller zu gleiten, und nach hinten, um in der Luft zu bremsen. Diese Techniken kosten Ausdauer. Je besser Ihr die Techniken beherrscht, desto mehr Ausdauer steht Euch beim Gleiten zur Verfügung.",
                        "instruction": "Nach vorne lehnen: Drückt beim Gleiten die Richtungstaste nach vorn, um einen Geschwindigkeitsschub zu erhalten. Nach hinten lehnen: Um zu bremsen, drückt Ihr beim Gleiten die Richtungstaste nach hinten.",
                        "icon": "https://render.guildwars2.com/file/4D1CAE2F963C7C205BB06C0572040AD33B5BEBD8/962096.png",
                        "point_cost": 3,
                        "exp_cost": 1778000
                    },
                    {
                        "name": "Getarntes Gleiten",
                        "description": "Lernt, für kurze Zeit lautlos und unbemerkt durch die Luft zu gleiten, indem Ihr beim Gleiten ausweicht.",
                        "instruction": "Um Tarnung zu aktivieren, weicht aus, indem Ihr während des Gleitens eine der Bewegungstasten zweimal drückt.",
                        "icon": "https://render.guildwars2.com/file/610A10527F20E26DBF5402FD4131F1EDAAE6D960/962095.png",
                        "point_cost": 5,
                        "exp_cost": 2540000
                    },
                    {
                        "name": "Erweitertes Gleiten",
                        "description": "Lernt, den Gleitschirm so gut zu beherrschen, dass Ihr Ausdauer nur noch zur Ausübung verschiedener Techniken des Lehnens braucht, aber nicht länger um Euch in der Luft zu halten.",
                        "instruction": "Ihr könnt jetzt ohne Ausdauerkosten unbegrenzt weit gleiten. Lehnen kostet jedoch weiterhin Ausdauer.",
                        "icon": "https://render.guildwars2.com/file/FFD8BC49B85A794B729ABBE8DB1102F7D328D86A/962093.png",
                        "point_cost": 8,
                        "exp_cost": 3302000
                    },
                    {
                        "name": "Ley-Linien-Gleiten",
                        "description": "Lernt, in Ley-Linien-Energieströme hinein zu gleiten und Euch vom Strom tragen zu lassen, wodurch Ihr an Orte gelangt, die sonst unzugänglich sind.",
                        "instruction": "Ley-Linien sind Flüsse magischer Energie, die im ganzen Maguuma-Dschungel zu beobachten sind. Zur Nutzung der Ley-Linien gleitet Ihr einfach in sie hinein und lasst Euch vom Energiefluss tragen.",
                        "icon": "https://render.guildwars2.com/file/A003F17064F5300F0C0705E8DB76D4B3EF51CFD3/962094.png",
                        "point_cost": 12,
                        "exp_cost": 4318000
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2Mastery>(
            """
            {
                "id": 12,
                "name": "Schlachtzüge",
                "requirement": "Betretet zum Freischalten das Verlassene Dickicht in der Grasgrünen Schwelle und besiegt einen Boss.",
                "order": 4,
                "background": "https://render.guildwars2.com/file/64A43D09C00EBC0EF307A7C004EF05A8459F0907/1451827.png",
                "region": "Maguuma",
                "levels": [
                    {
                        "name": "Riss-Schmied",
                        "description": "Erlernt die präzise Steuerung von Magie, die kraftvolle Gegner in Risse freigesetzt haben. Durch Manipulation von Ley-Energie könnt Ihr dann Eure Rüstung reparieren.",
                        "instruction": "Repariert an Orten, wo Ihr einen kraftvollen Gegner bezwungen habt, durch Nutzung von Ley-Rissen Eure Rüstung.",
                        "icon": "https://render.guildwars2.com/file/FB2D7C981E2E09725139220DCC90E308170AB7FE/1302710.png",
                        "point_cost": 1,
                        "exp_cost": 508000
                    },
                    {
                        "name": "Explosiver Start",
                        "description": "Erfunden wurde das Schwarzpulver von den Zwergen, doch Ihr könnt seine Verwendung perfektionieren: Lernt, Euch mithilfe einer Explosion sicher in große Höhen zu begeben, ohne Euch dabei die Socken anzukokeln.",
                        "instruction": "Ihr erleidet ab sofort keinen Schaden mehr, wenn Ihr Euch selbst von einer Plattform abfeuern lässt oder Verbündete Euch abfeuern.",
                        "icon": "https://render.guildwars2.com/file/2D4C0BF20D2A1C0B041DC3D5357C0D67225E7479/1302709.png",
                        "point_cost": 1,
                        "exp_cost": 1016000
                    },
                    {
                        "name": "Wasser des Verlassenen Dickichts",
                        "description": "Das Wasser des Verlassenen Dickichts soll verschiedenen Befall heilen. Wer diese Beherrschung besitzt, kann seine Leiden und seinen Befall wegwaschen, wenn sich die Gelegenheit bietet.",
                        "instruction": "Ihr könnt ab sofort im heilenden Wasser des Verlassenen Dickichts baden und Euren Befall abwaschen.",
                        "icon": "https://render.guildwars2.com/file/6120204BB9070AD428112705E3C9145EB33203BD/1377784.png",
                        "point_cost": 3,
                        "exp_cost": 1524000
                    },
                    {
                        "name": "Verlassene Magie",
                        "description": "Lernt, Euch die mächtige Energie zunutze zu machen, die das Verlassene Dickicht durchzieht, und erhaltet dadurch Vorteile im Kampf.",
                        "instruction": "Ihr versteht die Magie des Verlassenen Dickichts jetzt.",
                        "icon": "https://render.guildwars2.com/file/61D637CA3D6F5D355CDC3FAD3CB1DB0DDE34DE67/1451810.png",
                        "point_cost": 3,
                        "exp_cost": 3048000
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2Mastery>(
            """
            {
                "id": 13,
                "name": "Uralte Magien",
                "requirement": "Reist zum Freischalten in den Blutsteinsumpf oder in die Glutbucht.",
                "order": 6,
                "background": "https://render.guildwars2.com/file/929FEABC05B4C9CAA978E0680908E4735CC2C5BC/1477050.png",
                "region": "Maguuma",
                "levels": [
                    {
                        "name": "Magie kontern",
                        "description": "Aufbauend auf uralter asurischer Forschung des Supergenies Zinn hat Taimi einen Weg gefunden, bestimmte kraftvolle magische Fähigkeiten zu kontern. Erlernt diese Beherrschung, um Zugriff auf die besondere Aktionsfertigkeit \"Magie kontern\" zu erhalten, die es Euch ermöglicht, die Angriffe Eures Feindes gegen ihn selbst zu wenden.",
                        "instruction": "Setzt die besondere Aktionsfertigkeit \"Magie kontern\" ein, um bestimmte kraftvolle magische Fähigkeiten von Gegnern zu kontern.",
                        "icon": "https://render.guildwars2.com/file/097B5405639D54EFFD29C600B312ACBDBFDD250D/1477049.png",
                        "point_cost": 1,
                        "exp_cost": 508000
                    },
                    {
                        "name": "Thermoantrieb",
                        "description": "Als die Zwerge es mit Primordus aufnahmen, eigneten sie sich viele Techniken an, um durch Tyrias heißen Kern reisen zu können. Erlernt diese Beherrschung, damit Ihr wie die Zwerge lange Distanzen zurücklegen könnt.",
                        "instruction": "Nutzt Thermoantrieb, um über lange Distanzen zu reisen.",
                        "icon": "https://render.guildwars2.com/file/14AB963FFAA679D6ADC625E6E538DA47CBF1EF34/1494369.png",
                        "point_cost": 3,
                        "exp_cost": 508000
                    },
                    {
                        "name": "Flamme Kodas",
                        "description": "Gewährt die Fähigkeit, mit der Feuermagie der Kodan umzugehen, die auf einem von alters her gezähmten Flammengeist basiert. Das Erlernen dieser Beherrschung schaltet die erste Fertigkeit frei, während Ihr die Flamme des Koda tragt. Sucht Flammenträger der Kodan auf, um zusätzliche Fertigkeiten zu lernen.",
                        "instruction": "Nehmt Euch eine Flamme des Koda, eine der Fackeln aus den Flammenschalen, die überall im Bitterfrost-Grenzland und in Tyria zu finden sind.",
                        "icon": "https://render.guildwars2.com/file/B809083AAF97000B38A309EB57DB9EED2A9BBB5A/1601946.png",
                        "point_cost": 3,
                        "exp_cost": 508000
                    },
                    {
                        "name": "Spektraler Beistand",
                        "description": "Uralte Magien klingen noch immer in Tyria nach, und wer besonders auf sie eingestimmt ist, kann sich manchmal in Zeiten großer Not an sie wenden. Lernt diese Beherrschung, um eine zusätzliche Fertigkeit freizuschalten, die Ihr nutzen könnt, wenn Ihr angeschlagen seid.",
                        "instruction": "Wenn Ihr angeschlagen seid, solltet Ihr Eure neue Fertigkeit einsetzen, um verbliebene Gegner abzuwehren.",
                        "icon": "https://render.guildwars2.com/file/FCFA76723249B00D35FDED21DFD2CC409F4F26D3/1635191.png",
                        "point_cost": 3,
                        "exp_cost": 508000
                    },
                    {
                        "name": "Zugriff des Eichenherzens",
                        "description": "Druiden aus alten Zeiten hatten die Kraft, die Natur zu manipulieren. Lernt diese Beherrschung, um die Essenz des Eichenherzens zu sammeln, die es Euch erlaubt, Euch mithilfe von magischen Ranken zu neuen Höhen aufzuschwingen.",
                        "instruction": "Findet eine Essenz des Eichenherzens, um die Fähigkeit zu erhalten, Euch an anvisierte Stellen zu katapultieren. Diese Fertigkeit kann auch während des Gleitens genutzt werden.",
                        "icon": "https://render.guildwars2.com/file/0BD302C32B7A66659536C9F4F5C4087A1B13E878/1677329.png",
                        "point_cost": 7,
                        "exp_cost": 508000
                    },
                    {
                        "name": "Zaubersänger von Orr",
                        "description": "Durch Orr weht heute noch das Echo uralter Akkorde längst vergessener Klagen. Wer gelernt hat, ihnen Gehör zu schenken, kann kraftvolle Klagegesänge anstimmen und sich Fähigkeiten zunutze machen, die längst der Vergessenheit anheimgefallen waren.",
                        "instruction": "Interagiert mit einem Chor der Echos, wann immer er im Kampf erscheint, um ein beliebiges Klagelied zu erwerben. Tragt diese Klagelieder vor, um Verbündeten zu helfen und Gegner zu behindern.",
                        "icon": "https://render.guildwars2.com/file/24360325D7E12F6E5FE5CD4A23055FF8704B4123/1730817.png",
                        "point_cost": 7,
                        "exp_cost": 508000
                    }
                ]
            }
            """.trimIndent()
        )
    }

}