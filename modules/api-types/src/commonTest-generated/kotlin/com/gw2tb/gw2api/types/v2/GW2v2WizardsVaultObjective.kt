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

class GW2v2WizardsVaultObjectiveTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 1,
                "title": "Complete 3 Events",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 2,
                "title": "Compete in 1 Player vs. Player Team Battle",
                "track": "PvP",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 3,
                "title": "Complete 5 Bounty Missions in Crystal Oasis or Group Events",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 4,
                "title": "Complete the Chaos Crystal Cavern Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 5,
                "title": "Defeat 50 Veteran-Rank Enemies",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 7,
                "title": "Complete 5 Bounty Missions in Desert Highlands or Group Events",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 8,
                "title": "View a Vista in the Crystal Desert",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 10,
                "title": "Participate in 1 Defense Event in World vs. World",
                "track": "WvW",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 11,
                "title": "Complete the Gang War of Echovald Meta-Event, Events in Echovald Wilds, or Events in Maguuma Jungle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 13,
                "title": "Capture 5 World vs. World objectives in the Edge of the Mists",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 15,
                "title": "Complete King of the Jungle Meta-Event, Events in Tangled Depths, or Events in Ascalon",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 16,
                "title": "Complete 1 Event in Cantha",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 18,
                "title": "Defeat 3 Enemy Players in a Structured PvP Match",
                "track": "PvP",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 19,
                "title": "Defeat the Claw of Jormag World Boss or Complete Events in Frostgorge Sound",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 20,
                "title": "Perform 3 Combo Skills in Combat",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 21,
                "title": "Loot 10 Defeated Enemies",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 28,
                "title": "Defeat 1 Enemy Supply Caravan in World vs. World",
                "track": "WvW",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 29,
                "title": "Complete the Path to Ascension Meta-Event, Events in the Elon Riverlands, or Events in Kryta",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 30,
                "title": "View a Vista in the Heart of Maguuma",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 31,
                "title": "Defeat the Great Jungle Wurm World Boss or Complete Events in Caledon Forest",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 32,
                "title": "Escort 10 Allied Supply Caravans to Their Destinations in World vs. World",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 36,
                "title": "Win 1 Game in Conquest Mode after Completing the Map's Secondary Objective",
                "track": "PvP",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 37,
                "title": "Earn 50 Rank Points in PvP Matches",
                "track": "PvP",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 38,
                "title": "Complete the Shattered Ice Ruins Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 40,
                "title": "Complete the Collapsed Observatory Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 43,
                "title": "Craft 10 Items",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_26() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 44,
                "title": "Complete the Loreclaw Expanse Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_27() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 45,
                "title": "Complete any Strike Mission",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_28() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 46,
                "title": "Capture 10 World vs. World Objectives",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_29() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 47,
                "title": "Identify 100 Pieces of Unidentified Gear",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_30() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 50,
                "title": "Defeat 10 World vs. World Invaders",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_31() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 55,
                "title": "Defeat the Fire Elemental World Boss or Complete Events in Metrica Province",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_32() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 56,
                "title": "Complete the Dark Reverie Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_33() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 57,
                "title": "Complete 10 Events",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_34() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 58,
                "title": "Defeat 10 Enemies in the Crystal Desert",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_35() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 59,
                "title": "Defeat 1 Legendary-Rank Enemy",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_36() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 60,
                "title": "Defeat the Shadow Behemoth World Boss or Complete Events in Queensdale",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_37() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 61,
                "title": "Complete the Not So Secret Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_38() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 62,
                "title": "Complete a Renown Heart",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_39() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 63,
                "title": "Complete 1 Fractal in the Fractals of the Mists",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_40() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 65,
                "title": "Salvage 10 Items",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_41() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 69,
                "title": "Complete Aetherblade Assault Meta-Event, Events in Seitung Province, or Events in Maguuma Jungle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_42() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 70,
                "title": "Defeat 100 Mordrem or Nightmare Court",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_43() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 72,
                "title": "Complete Unlocking the Wizard's Tower Meta-Event, Events in Skywatch Archipelago, or Events in the Shiverpeak Mountains",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_44() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 74,
                "title": "Complete the Branded Mine Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_45() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 77,
                "title": "Defeat 100 Void Enemies or Sons of Svanir",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_46() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 78,
                "title": "Earn a Top Scoreboard Stat on Your Team in a PvP Match",
                "track": "PvP",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_47() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 79,
                "title": "Gather 15 Resources with a Logging Axe",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_48() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 80,
                "title": "Neutralize 5 Enemy Capture Points in Rated Player vs. Player Conquest Matches",
                "track": "PvP",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_49() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 83,
                "title": "Defeat 10 enemies in Cantha.",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_50() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 84,
                "title": "Complete the Defense of Amnytas Meta-Event, Events in Amnytas, or Events in the Shiverpeak Mountains",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_51() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 85,
                "title": "Deal 500,000 Damage to Enemy Players in Structured Player vs. Player or World vs. World",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_52() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 87,
                "title": "Complete 5 Bounty Missions in Elon Riverlands or Group Events",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_53() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 88,
                "title": "Identify 10 Pieces of Unidentified Gear",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_54() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 91,
                "title": "Defeat 30 Players in Structured Player vs. Player",
                "track": "PvP",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_55() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 92,
                "title": "View a Vista in the Horn of Maguuma",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_56() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 94,
                "title": "Destroy 10 Enemy Supply Caravans in World vs. World",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_57() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 95,
                "title": "Harvest 10 Resources with a Harvesting Sickle",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_58() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 98,
                "title": "Earn 200 WvW Experience",
                "track": "WvW",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_59() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 99,
                "title": "Capture 1 Camp Objective in World vs. World",
                "track": "WvW",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_60() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 100,
                "title": "Salvage 50 Items",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_61() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 101,
                "title": "Complete the Retrospective Runaround Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_62() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 104,
                "title": "Defeat 10 enemies in the Heart of Maguuma.",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_63() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 105,
                "title": "Complete the Coddler's Cove Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_64() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 107,
                "title": "Capture 1 Sentry Point in World vs. World",
                "track": "WvW",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_65() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 108,
                "title": "Compete in 10 Structured Player vs. Player Matches",
                "track": "PvP",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_66() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 109,
                "title": "Capture 10 Ruin, Shrine, or Mercenary Camp Objectives in World vs. World",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_67() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 110,
                "title": "Earn a Top Scoreboard Stat on Your Team in a PvP Match 5 Times",
                "track": "PvP",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_68() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 115,
                "title": "Gather 25 Crafting Resources",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_69() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 116,
                "title": "Complete the Tribulation Caverns Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_70() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 117,
                "title": "Participate in 1 Kryptis Rift Event",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_71() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 120,
                "title": "Complete 7 Kryptis Rift Hunts or Group Events",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_72() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 121,
                "title": "Complete 5 Bounty Missions in the Desolation or Group Events",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_73() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 122,
                "title": "Craft 3 Masterwork Items",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_74() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 123,
                "title": "Gather 100 Crafting Resources by Mining, Logging, Fishing, or Harvesting Resource Nodes",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_75() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 124,
                "title": "Complete the Battle for the Jade Sea Meta-Event, Events in Dragon's End, or Events in Maguuma Jungle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_76() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 125,
                "title": "Dodge 3 Enemy Attacks Using a Dodge Roll",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_77() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 127,
                "title": "Defeat 1 Elite Enemy",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_78() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 128,
                "title": "Gather 15 Resources with a Mining Pick",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_79() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 129,
                "title": "Complete the Grendich Gamble Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_80() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 130,
                "title": "Complete the Spekk's Laboratory Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_81() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 132,
                "title": "Defeat 10 enemies in the Horn of Maguuma.",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_82() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 133,
                "title": "Log In",
                "track": "PvE",
                "acclaim": 5
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_83() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 134,
                "title": "Defeat the Megadestroyer World Boss or Complete Events in Mount Maelstrom",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_84() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 135,
                "title": "Defeat 10 Champion-Rank Enemies",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_85() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 137,
                "title": "Capture 3 Keeps in World vs. World",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_86() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 138,
                "title": "Complete Kaineng Blackout Meta-Event, Events in New Kaineng City, or Events in Maguuma Jungle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_87() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 139,
                "title": "Capture 1 Ruin or Shrine Objective in World vs. World",
                "track": "WvW",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_88() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 140,
                "title": "Defeat 5 Veteran Enemies",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_89() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 141,
                "title": "Defeat 3 Enemies While Defending a Capture Point in Rated Player vs. Player Conquest Matches",
                "track": "PvP",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_90() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 143,
                "title": "Defeat 100 Jade Mechs or Inquest",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_91() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 144,
                "title": "Defeat 25 Enemy Guards in World vs. World",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_92() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 145,
                "title": "Win 3 Structured Player vs. Player Rated Games",
                "track": "PvP",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_93() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 146,
                "title": "Complete the Crimson Plateau Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_94() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 147,
                "title": "Complete the Obsidian Sanctum Jumping Puzzle in the Obsidian Sanctum Map",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_95() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 148,
                "title": "Complete the Pig Iron Quarry Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_96() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 149,
                "title": "Defeat 25 Enemies",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_97() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 150,
                "title": "Defeat 100 Awakened or Risen",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_98() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 152,
                "title": "Complete Destroy the Ravenous Wanderer Meta-Event, Events in Gyala Delve, or Events in Maguuma Jungle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_99() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 153,
                "title": "Complete Forged with Fire Meta-Event, Events in the Domain of Vabbi, or Events in Kryta",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_100() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 155,
                "title": "Defeat 3 Enemy Invaders in World vs. World",
                "track": "WvW",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_101() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 156,
                "title": "Complete the Weyandt's Revenge Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_102() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 157,
                "title": "Earn 1 reward from a PvP Reward Track",
                "track": "PvP",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_103() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 159,
                "title": "Defeat the Inquest Golem Mark II World Boss or Complete Events in Mount Maelstrom",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_104() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 161,
                "title": "Complete the Skipping Stones Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_105() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 163,
                "title": "Restore 50,000 Health to Yourself or Allied Players",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_106() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 164,
                "title": "Catch 5 Fish",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_107() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 166,
                "title": "Earn 10,000 WvW Experience",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_108() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 167,
                "title": "Participate in 1 Player vs. Player Tournament Match",
                "track": "PvP",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_109() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 168,
                "title": "Complete 1 Event in the Heart of Maguuma",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_110() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 169,
                "title": "Complete 5 Bounty Missions in the Domain of Vabbi or Group Events",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_111() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 170,
                "title": "Complete the Behem Gauntlet Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_112() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 171,
                "title": "Win 5 Games in Structured Player vs. Player",
                "track": "PvP",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_113() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 173,
                "title": "Complete 1 Event in the Crystal Desert",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_114() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 174,
                "title": "Deal 100,000 Damage to Enemy Players",
                "track": "PvP",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_115() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 176,
                "title": "Complete the Emerald Sanctum or Sapphire Sanctum Jumping Puzzle",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_116() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 177,
                "title": "Earn 5 Rewards from Structured Player vs. Player Reward Tracks",
                "track": "PvP",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_117() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 178,
                "title": "Defeat the Svanir Shaman Chief World Boss or Complete Events in Wayfarer Foothills",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_118() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 179,
                "title": "Complete 1 Event in the Horn of Maguuma",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_119() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 180,
                "title": "Complete the Antre of Adjournment Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_120() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 181,
                "title": "Capture 5 Camps in World vs. World",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_121() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 182,
                "title": "Break 1 Enemy's Defiance Bar",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_122() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 184,
                "title": "Earn 1,000 PvP Rank Points",
                "track": "PvP",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_123() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 186,
                "title": "Complete the Professor Portmatt's Lab Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_124() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 187,
                "title": "Defeat 5 Enemy Guards in World vs. World",
                "track": "WvW",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_125() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 188,
                "title": "View a Vista in Cantha",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_126() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 189,
                "title": "Complete the Fawcett's Bounty Jumping Puzzle",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_127() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 190,
                "title": "Defeat 100 Kryptis or Bandits",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_128() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 192,
                "title": "Capture 5 Towers in World vs. World",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_129() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 193,
                "title": "Defeat 100 Forged or Flame Legion",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_130() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 196,
                "title": "Defeat the Shatterer World Boss or Complete Events in Blazeridge Steppes",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_131() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 197,
                "title": "Complete Battle in Tarir Meta-Event, Events in Auric Basin, or Events in Ascalon",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_132() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 198,
                "title": "Complete Dragon's Stand Meta-Event, Events in Dragon's Stand, or Events in Ascalon",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_133() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 199,
                "title": "Create 1 Item with the Mystic Forge",
                "track": "PvE",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_134() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 201,
                "title": "Complete Maws of Torment Meta-Event, Events in the Desolation, or Events in Kryta",
                "track": "PvE",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_135() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 202,
                "title": "Escort 1 Supply Caravan to Its Destination in World vs. World",
                "track": "WvW",
                "acclaim": 10
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_136() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 206,
                "title": "Defend 10 World vs. World Objectives",
                "track": "WvW",
                "acclaim": 50
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_137() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 228,
                "title": "(Festival) Complete the (Annual) World 1 Classic Achievement",
                "track": "PvE",
                "acclaim": 100
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_138() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 229,
                "title": "Defeat Knaebelag the Terror and Complete the Fangs That Gnash Achievement",
                "track": "PvE",
                "acclaim": 500
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_139() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 230,
                "title": "(Festival) Complete the (Annual) Zone Runner Achievement",
                "track": "PvE",
                "acclaim": 100
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_140() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 231,
                "title": "Complete the Story Chapter Eventide's March",
                "track": "PvE",
                "acclaim": 500
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_141() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 233,
                "title": "Complete the Temple of Febe Strike Mission",
                "track": "PvE",
                "acclaim": 400
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_142() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 234,
                "title": "Legendary Armor 2: Complete an Astral Legendary Armor Achievement",
                "track": "PvE",
                "acclaim": 300
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_143() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 235,
                "title": "(Festival) Complete the (Annual) Super Adventure Box Nostalgia Achievement",
                "track": "PvE",
                "acclaim": 300
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_144() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 236,
                "title": "Complete the Inner Nayos Mastery II Achievement",
                "track": "PvE",
                "acclaim": 300
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_145() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 240,
                "title": "Complete Tier 1 of an Artisan of Arms Achievement",
                "track": "PvE",
                "acclaim": 300
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_146() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 241,
                "title": "Defeat Legendary Kryptis during Convergences",
                "track": "PvE",
                "acclaim": 300
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_147() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 242,
                "title": "(Festival) Complete the (Annual) World 2 Classic Achievement",
                "track": "PvE",
                "acclaim": 100
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_148() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 243,
                "title": "Complete the Inner Nayos: Nyedra Surrounds Savior Achievement",
                "track": "PvE",
                "acclaim": 300
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_149() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 244,
                "title": "Legendary Armor 1: Speak With Lyhr about Armor Crafting",
                "track": "PvE",
                "acclaim": 150
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_150() {
        json.decodeFromString<GW2v2WizardsVaultObjective>(
            """
            {
                "id": 245,
                "title": "Legendary Armor 3: Forge a Piece of Legendary Obsidian Armor",
                "track": "PvE",
                "acclaim": 500
            }
            """.trimIndent()
        )
    }

}