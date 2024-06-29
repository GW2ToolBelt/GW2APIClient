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

class GW2v2GuildPermissionTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "ClaimableEditOptions",
                "name": "Beanspruchungsoptionen bearbeiten",
                "description": "Berechtigt, bei beanspruchbaren Elementen im Besitz der Gilde Optionen zu bearbeiten."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "EditBGM",
                "name": "Gilden-Hallen-Musik wechseln",
                "description": "Wählt eine andere Hintergrundmusik für die Gilden-Halle aus."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "ActivatePlaceables",
                "name": "Platzierbare Verbrauchsgüter verwenden",
                "description": "Benutzt platzierbare Verbrauchsgüter, die in der Werkstatt hergestellt wurden."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "DepositItemsTrove",
                "name": "Schatzgrube – Einlage von Gegenständen",
                "description": "Ihr könnt die größere Schatzgrube der Gilde durchsuchen und Gegenstände darin deponieren."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "WithdrawItemsStash",
                "name": "Gilden-Geheimvorrat – Entnahme von Gegenständen",
                "description": "Ihr könnt dem kleinen Gilden-Geheimvorrat Gegenstände entnehmen."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "WithdrawItemsTrove",
                "name": "Schatzgrube – Entnahme von Gegenständen",
                "description": "Ihr könnt der größeren Schatzgrube der Gilde Gegenstände entnehmen."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "EditAssemblyQueue",
                "name": "Zusammenbau-Warteschlange bearbeiten",
                "description": "Reiht Pläne für den Zusammenbau in der Werkstatt ein und ordnet sie neu."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "WithdrawCoinsStash",
                "name": "Gilden-Geheimvorrat – Entnahme von Gold",
                "description": "Ihr könnt dem kleinen Gilden-Geheimvorrat Geld entnehmen."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "ActivateWorldEvent",
                "name": "Gilden-Welt-Events",
                "description": "Ihr könnt Gilden-Welt-Events aktivieren."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "PlaceArenaDecoration",
                "name": "Arena-Gestalter",
                "description": "Ihr könnt Dekorationen in der Arena platzieren, sie umstellen und aus ihr entfernen."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "DepositItemsStash",
                "name": "Gilden-Geheimvorrat – Einlage von Gegenständen",
                "description": "Ihr könnt den kleinen Gilden-Geheimvorrat durchsuchen und Gegenstände darin deponieren."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "EditMonument",
                "name": "Monument-Gestalter",
                "description": "Die Fähigkeit, der Gilden-Halle Monumente hinzuzufügen und sie daraus zu entfernen."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "StartingRole",
                "name": "Neue Mitglieder hier",
                "description": "Neue Mitglieder beginnen mit diesem Rang. Diese Berechtigung kann nur in einem Rang bestehen."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "SpendFuel",
                "name": "Resonanz einsetzen",
                "description": "Schließt aktuelle Pläne durch Verbrauch von Resonanz sofort ab."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "TeamAdmin",
                "name": "Team-Verwalter",
                "description": "Ihr könnt Teams erstellen oder löschen und Mitglieder hinzufügen oder entfernen."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "EditRoles",
                "name": "Ränge bearbeiten",
                "description": "Erstellt, entfernt oder ändert die Eigenschaften von Rängen, die niedriger als dieser sind."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "Admin",
                "name": "Niedrigere Ränge verwalten",
                "description": "Ladet neue Spieler zum Beitritt in Eure Gilde ein. Befördert, degradiert und entlasst aktuelle Mitglieder niedrigerer Ränge."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "WithdrawCoinsTrove",
                "name": "Schatzgrube – Entnahme von Gold",
                "description": "Ihr könnt der größeren Schatzgrube der Gilde Geld entnehmen."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "DepositCoinsTrove",
                "name": "Schatzgrube – Einlage von Gold",
                "description": "Ihr könnt die größere Schatzgrube der Gilde durchsuchen und Geld darin deponieren."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "PurchaseUpgrades",
                "name": "Aufwertungen erwerben",
                "description": "Erwerbt Aufwertungen für die Gilde."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "EditEmblem",
                "name": "Gilden-Wappen bearbeiten",
                "description": "Ändert das Aussehen des Gilden-Wappens auf allen Rüstungen, Fahnen, Bannern und Objekten."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "ClaimableActivate",
                "name": "Beanspruchungstaktik aktivieren",
                "description": "Berechtigt, bei einem beanspruchbaren Element Aufwertungen zu aktivieren."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "MissionControl",
                "name": "Missions-Kommando",
                "description": "Aktiviert Gilden-Missionen."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "OpenPortal",
                "name": "Gilden-Portal öffnen",
                "description": "Ihr könnt das Gilden-Portal zur Teleportation von Gruppen nutzen."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "SetGuildHall",
                "name": "Gilden-Halle beanspruchen",
                "description": "Ihr könnt eine neue Gilden-Halle für Eure Gilde beanspruchen."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "DepositCoinsStash",
                "name": "Gilden-Geheimvorrat – Einlage von Gold",
                "description": "Ihr könnt den kleinen Gilden-Geheimvorrat durchsuchen und Geld darin deponieren."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_26() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "PlaceDecoration",
                "name": "Gestalter",
                "description": "Ihr könnt Dekorationen in der Gilden-Halle platzieren, sie umstellen und aus ihr entfernen."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_27() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "ClaimableSpend",
                "name": "Aufwertungen für beanspruchbare Elemente verbrauchen",
                "description": "Berechtigt, Ziele zu beanspruchen."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_28() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "EditMOTD",
                "name": "Nachricht des Tages bearbeiten",
                "description": "Ändert die Nachricht des Tages, die an alle Gilden-Mitglieder verschickt wird."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_29() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "EditAnthem",
                "name": "Gilden-Hymne wechseln",
                "description": "Wählt eine andere Gilden-Hymne aus."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_30() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "DecorationAdmin",
                "name": "Alle Dekorationen entfernen",
                "description": "Der Spieler kann alle Dekorationen aus der Gilden-Halle entfernen und wieder im Gilden-Lager deponieren."
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_31() {
        json.decodeFromString<GW2v2GuildPermission>(
            """
            {
                "id": "ClaimableClaim",
                "name": "Ziele beanspruchen",
                "description": "Berechtigt, Ziele zu beanspruchen."
            }
            """.trimIndent()
        )
    }

}