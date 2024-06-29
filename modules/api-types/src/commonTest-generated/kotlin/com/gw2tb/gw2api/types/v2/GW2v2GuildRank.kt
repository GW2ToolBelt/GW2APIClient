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

class GW2v2GuildRankTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2GuildRank>(
            """
            {
                "id": "Kohl Kopf",
                "order": 1,
                "permissions": [
                    "Admin",
                    "EditRoles",
                    "ClaimableEditOptions",
                    "EditBGM",
                    "ActivatePlaceables",
                    "DepositItemsTrove",
                    "WithdrawItemsStash",
                    "WithdrawItemsTrove",
                    "EditAssemblyQueue",
                    "WithdrawCoinsStash",
                    "ActivateWorldEvent",
                    "PlaceArenaDecoration",
                    "DepositItemsStash",
                    "EditMonument",
                    "SpendFuel",
                    "TeamAdmin",
                    "WithdrawCoinsTrove",
                    "DepositCoinsTrove",
                    "PurchaseUpgrades",
                    "EditEmblem",
                    "ClaimableActivate",
                    "MissionControl",
                    "OpenPortal",
                    "SetGuildHall",
                    "DepositCoinsStash",
                    "PlaceDecoration",
                    "ClaimableSpend",
                    "EditMOTD",
                    "EditAnthem",
                    "DecorationAdmin",
                    "ClaimableClaim"
                ],
                "icon": "https://render.guildwars2.com/file/EB3B3BC73EE3252092F162A855FA0A4425232A03/156377.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2GuildRank>(
            """
            {
                "id": "Kohlmmandeur",
                "order": 3,
                "permissions": [],
                "icon": "https://render.guildwars2.com/file/2F25BCE10A3A0AA3F8DA282148C8652060DA94C9/156379.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2GuildRank>(
            """
            {
                "id": "Kohltist",
                "order": 2,
                "permissions": [
                    "Admin",
                    "ClaimableEditOptions",
                    "EditBGM",
                    "ActivatePlaceables",
                    "DepositItemsTrove",
                    "WithdrawItemsStash",
                    "WithdrawItemsTrove",
                    "EditAssemblyQueue",
                    "WithdrawCoinsStash",
                    "ActivateWorldEvent",
                    "PlaceArenaDecoration",
                    "DepositItemsStash",
                    "SpendFuel",
                    "TeamAdmin",
                    "WithdrawCoinsTrove",
                    "DepositCoinsTrove",
                    "PurchaseUpgrades",
                    "EditEmblem",
                    "ClaimableActivate",
                    "MissionControl",
                    "OpenPortal",
                    "SetGuildHall",
                    "DepositCoinsStash",
                    "PlaceDecoration",
                    "ClaimableSpend",
                    "EditMOTD",
                    "EditAnthem",
                    "ClaimableClaim"
                ],
                "icon": "https://render.guildwars2.com/file/396104DEF6981E1906804678F7F9CEEB96C26E32/156378.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2GuildRank>(
            """
            {
                "id": "Lauch",
                "order": 5,
                "permissions": [
                    "StartingRole"
                ],
                "icon": "https://render.guildwars2.com/file/B7E3FD3210E9E2E80C917E0F9E0FA85CE2EC052B/156370.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2GuildRank>(
            """
            {
                "id": "Spargeltarzan",
                "order": 4,
                "permissions": [],
                "icon": "https://render.guildwars2.com/file/30EB1BDA3850EF59AFEFAA005DA19605250D3620/156373.png"
            }
            """.trimIndent()
        )
    }

}