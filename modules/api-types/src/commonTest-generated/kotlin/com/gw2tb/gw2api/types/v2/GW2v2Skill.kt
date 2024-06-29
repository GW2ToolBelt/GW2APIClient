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

class GW2v2SkillTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Rite of the Great Dwarf",
                "facts": [
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 45
                    },
                    {
                        "text": "StunBreak",
                        "type": "StunBreak",
                        "icon": "https://render.guildwars2.com/file/DCF0719729165FD8910E034CA4E0780F90582D15/156654.png",
                        "value": true
                    },
                    {
                        "text": "Number of Targets",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                        "value": 5
                    },
                    {
                        "text": "Radius",
                        "type": "Distance",
                        "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                        "distance": 600
                    }
                ],
                "description": "Legendary Dwarf. Channel the power of the Rite of the Great Dwarf to turn yourself and nearby allies to stone to reduce incoming damage.",
                "icon": "https://render.guildwars2.com/file/D8AEB219F1A057F3F4E47E5E54A12BBABFC8474F/961437.png",
                "flags": [],
                "id": 32588,
                "chat_link": "[&Bkx/AAA=]",
                "categories": [
                    "LegendaryDwarf"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Hunter's Verdict",
                "facts": [
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 40
                    },
                    {
                        "text": "Pull",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/D5F6EBC4630F0E10F3DDB7A6DBB63592CD4B00BC/2440717.png",
                        "value": 1200
                    }
                ],
                "description": "Pull all enemies tethered by the Spear of Justice to you, breaking the link. This ability's recharge is separate from that of Spear of Justice.",
                "icon": "https://render.guildwars2.com/file/02C8A032F60414D0FAB7D0AFD965B5BA0947D6F8/103703.png",
                "type": "Profession",
                "weapon_type": "None",
                "professions": [
                    "Guardian"
                ],
                "slot": "Profession_1",
                "flags": [],
                "specialization": 27,
                "id": 33134,
                "chat_link": "[&Bm6BAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Cosmic Ray",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 1200
                    },
                    {
                        "text": "Healing",
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/D4347C52157B040943051D7E09DEAD7AF63D4378/156662.png",
                        "value": 231,
                        "target": "Healing"
                    },
                    {
                        "text": "Damage",
                        "type": "Damage",
                        "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                        "hit_count": 1,
                        "dmg_multiplier": 0.75
                    }
                ],
                "description": "Celestial Avatar.  Call down energy onto the targeted area to heal allies.",
                "icon": "https://render.guildwars2.com/file/ADD8B8B5B1EA72760ABB7313EAA8B0DAEC135F5E/1128620.png",
                "type": "Weapon",
                "weapon_type": "Staff",
                "professions": [
                    "Ranger"
                ],
                "slot": "Weapon_1",
                "flags": [],
                "id": 33387,
                "chat_link": "[&BmuCAAA=]",
                "categories": [
                    "CelestialAvatar"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Natural Convergence",
                "facts": [
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 10
                    },
                    {
                        "text": "Pulse Damage",
                        "type": "Damage",
                        "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                        "hit_count": 1,
                        "dmg_multiplier": 0.75
                    },
                    {
                        "text": "Final Damage",
                        "type": "Damage",
                        "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                        "hit_count": 1,
                        "dmg_multiplier": 2
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/070325E519C178D502A8160523766070D30C0C19/102838.png",
                        "duration": 1,
                        "status": "Crippled",
                        "description": "Movement speed decreased by 50%; stacks duration.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/F60D1EF5271D7B9319610855676D320CD25F01C6/961397.png",
                        "duration": 1,
                        "status": "Slow",
                        "description": "Skills and actions are slower.",
                        "apply_count": 1
                    },
                    {
                        "text": "Pulses",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                        "value": 3
                    },
                    {
                        "text": "Radius",
                        "type": "Distance",
                        "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                        "distance": 360
                    },
                    {
                        "text": "Number of Targets",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                        "value": 5
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/397A613651BFCA2832B6469CE34735580A2C120E/102844.png",
                        "duration": 1,
                        "status": "Immobile",
                        "description": "Unable to move; stacks duration.",
                        "apply_count": 5
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/3D3A1C2D6D791C05179AB871902D28782C65C244/415959.png",
                        "duration": 2,
                        "status": "Stability",
                        "description": "Cannot be knocked down, pushed back, pulled, launched, stunned, dazed, floated, sunk, feared, or taunted.",
                        "apply_count": 2
                    }
                ],
                "description": "Celestial Avatar. Channel your celestial powers, pulsing cripple and slow. Once the channel ends, any foes still within its radius will be trapped by a black hole, immobilizing them.",
                "icon": "https://render.guildwars2.com/file/08A7C5E751190ED5596C9112005D791D20AA3B31/1128629.png",
                "type": "Weapon",
                "weapon_type": "Staff",
                "professions": [
                    "Ranger"
                ],
                "slot": "Weapon_5",
                "flags": [],
                "id": 34070,
                "chat_link": "[&BhaFAAA=]",
                "categories": [
                    "CelestialAvatar"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Platform Crush",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 1200
                    }
                ],
                "description": "The unstable environment rains down debris from the airships in the trees, dealing damage upon impact.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34112,
                "chat_link": "[&BkCFAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Time Bomb",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 1200
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 15
                    }
                ],
                "description": "A timed bomb explodes, dealing damage to all foes in the area of impact.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34152,
                "chat_link": "[&BmiFAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Platform Crush",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 1200
                    }
                ],
                "description": "The unstable environment rains down debris from the airships in the trees, dealing damage upon impact.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34174,
                "chat_link": "[&Bn6FAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "\"Search and Rescue!\"",
                "facts": [
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 60
                    },
                    {
                        "text": "Radius",
                        "type": "Distance",
                        "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                        "distance": 600
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/F69996772B9E18FD18AD0AABAB25D7E3FC42F261/102835.png",
                        "duration": 8,
                        "status": "Regeneration",
                        "description": "Gain health every second; stacks duration.",
                        "apply_count": 1
                    },
                    {
                        "text": "Number of Allied Targets",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                        "value": 5
                    }
                ],
                "description": "Command.Your pet teleports a downed ally within range of you and begins reviving them. Grant regeneration to nearby allies.",
                "icon": "https://render.guildwars2.com/file/4345CDEAFF22E0A45DE84F42ED6B4862760D5731/104014.png",
                "type": "Utility",
                "weapon_type": "None",
                "professions": [
                    "Ranger"
                ],
                "slot": "Utility",
                "flags": [],
                "id": 34309,
                "chat_link": "[&BgWGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Feedback",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 1200
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 32
                    },
                    {
                        "text": "Shield Duration",
                        "type": "Time",
                        "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                        "duration": 6
                    },
                    {
                        "text": "Radius",
                        "type": "Distance",
                        "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                        "distance": 240
                    },
                    {
                        "text": "Combo Field",
                        "type": "ComboField",
                        "icon": "https://render.guildwars2.com/file/59E0DB6A699810641C959926ADFEF73E08CC255B/156655.png",
                        "field_type": "Ethereal"
                    }
                ],
                "description": "Glamour. Create a dome around your foes that reflects projectiles.",
                "icon": "https://render.guildwars2.com/file/A5720B5C9ED8CB02A3272944C50DF8426E22C5A0/103773.png",
                "type": "Utility",
                "weapon_type": "None",
                "professions": [
                    "Mesmer"
                ],
                "slot": "Utility",
                "flags": [],
                "id": 34326,
                "chat_link": "[&BhaGAAA=]",
                "categories": [
                    "Glamour"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Sweep",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 300
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 1.5
                    }
                ],
                "description": "Forward sweep-attack; damages foes on impact.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34335,
                "chat_link": "[&Bh+GAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Well of the Profane",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 3000
                    }
                ],
                "description": "Matthias creates a deadly pool of magic where Unstable Blood Magic was purged.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34336,
                "chat_link": "[&BiCGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Swing",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 600
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 20
                    }
                ],
                "description": "Berg leaps forward with his hammer, dealing damage upon contact.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34343,
                "chat_link": "[&BieGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Fiery Vortex",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 180
                    }
                ],
                "description": "Narella shoots fiery tornadoes that drag foes, dealing damage every second.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34344,
                "chat_link": "[&BiiGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Unrelenting Assault",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 300
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 10
                    },
                    {
                        "text": "Damage",
                        "type": "Damage",
                        "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                        "hit_count": 1,
                        "dmg_multiplier": 0.715
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/2FA9DF9D6BC17839BBEA14723F1C53D645DDB5E1/102852.png",
                        "duration": 8,
                        "status": "Might",
                        "description": "Increased outgoing damage; stacks intensity.",
                        "apply_count": 1
                    },
                    {
                        "text": "Number of Hits",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                        "value": 7
                    }
                ],
                "description": "Shadowstep and unleash fierce attacks on nearby foes. Gain might each time you damage a foe.",
                "icon": "https://render.guildwars2.com/file/A1E252A0C9F506B73465E09919D119D706702DD8/1013004.png",
                "flags": [],
                "id": 34345,
                "chat_link": "[&BimGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Swing",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 180
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 1.4
                    }
                ],
                "description": "Berg swings his hammer, damaging foes.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34353,
                "chat_link": "[&BjGGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Tormenting Bite",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 180
                    }
                ],
                "description": "The slubling bites you and inflicts torment.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34354,
                "chat_link": "[&BjKGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Snowstorm",
                "description": "Matthias pulses snowstorm damage every 3 seconds to all targets in the area.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34356,
                "chat_link": "[&BjSGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Jab",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 300
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 1.5
                    }
                ],
                "description": "Slothasor jabs foes.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34359,
                "chat_link": "[&BjeGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Spontaneous Combustion",
                "description": "Matthias pulses heat-wave damage every 3 seconds to all targets in the area.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34363,
                "chat_link": "[&BjuGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Bleeding Bite",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 180
                    }
                ],
                "description": "The slubling bites you and inflicts bleeding.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34368,
                "chat_link": "[&BkCGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Oppressive Gaze",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 2000
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 15
                    }
                ],
                "description": "A mutated Matthias charges and fires a beam shot directly in front of him, dealing massive damage to all targets hit.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34371,
                "chat_link": "[&BkOGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Flame Spray",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 1000
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 0.25
                    }
                ],
                "description": "Narella shoots forward a burst of flame, dealing decreased damage the farther it is from its target.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34375,
                "chat_link": "[&BkeGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Oppressive Gaze",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 2000
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 15
                    }
                ],
                "description": "Matthias charges and fires a beam that's shot directly in front of him, dealing massive damage to all targets hit.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34380,
                "chat_link": "[&BkyGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Hail of Bullets",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 1200
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 5
                    }
                ],
                "description": "Zane fires a hail of bullets in a cone that increases in size with each shot.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34383,
                "chat_link": "[&Bk+GAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Volatile Poison",
                "icon": "https://render.guildwars2.com/file/2A0F50179DD54E31405336CF1D099A61B0A5993D/1377815.png",
                "description": "",
                "flags": [],
                "id": 34387,
                "chat_link": "[&BlOGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Swing",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 180
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 5
                    }
                ],
                "description": "Berg swings his hammer, bashing his target.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34388,
                "chat_link": "[&BlSGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_26() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Unrelenting Assault",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 450
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 12
                    },
                    {
                        "text": "Damage",
                        "type": "Damage",
                        "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                        "hit_count": 1,
                        "dmg_multiplier": 0.715
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/2FA9DF9D6BC17839BBEA14723F1C53D645DDB5E1/102852.png",
                        "duration": 8,
                        "status": "Might",
                        "description": "Increased outgoing damage; stacks intensity.",
                        "apply_count": 1
                    },
                    {
                        "text": "Number of Hits",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                        "value": 7
                    },
                    {
                        "text": "Evade",
                        "type": "Time",
                        "icon": "https://render.guildwars2.com/file/9F19DB1D3E1629390F2360F2D866651BBC0F6155/1938788.png",
                        "duration": 2
                    }
                ],
                "description": "Shadowstep and unleash fierce attacks on nearby foes. Gain might each time you damage a foe.",
                "icon": "https://render.guildwars2.com/file/A1E252A0C9F506B73465E09919D119D706702DD8/1013004.png",
                "flags": [],
                "id": 34396,
                "chat_link": "[&BlyGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_27() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Snipe",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 2000
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 2
                    }
                ],
                "description": "Zane fires a shot that bounces to the next closest foe on hit.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34398,
                "chat_link": "[&Bl6GAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_28() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Shards of Rage",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 1500
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 25
                    }
                ],
                "description": "Matthias fires a volley of projectiles that can be reflected. Applies stacks of Blood Fueled on hit.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34404,
                "chat_link": "[&BmSGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_29() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Shards of Rage",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 1500
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 25
                    }
                ],
                "description": "Matthias fires a volley of projectiles that can be reflected. Applies stacks of Blood Fueled on hit.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34411,
                "chat_link": "[&BmuGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_30() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Surrender",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 2000
                    }
                ],
                "description": "Spirits sacrificed on the Bloodstone pulse massive damage to targets standing in their path.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34413,
                "chat_link": "[&Bm2GAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_31() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Flak Shot",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 1200
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 5
                    }
                ],
                "description": "Narella fires a series of projectiles that deal damage on impact and leave deadly pools behind.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34417,
                "chat_link": "[&BnGGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_32() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Vulnerable Spit",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 900
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 5
                    }
                ],
                "description": "The slubling spits multiple projectiles that convert boons to conditions upon hitting its target.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34431,
                "chat_link": "[&Bn+GAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_33() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Fiery Spit",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 900
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 1
                    }
                ],
                "description": "The slubling spits a projectile that inflicts burning.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34438,
                "chat_link": "[&BoaGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_34() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Blood Shards",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 1500
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 8
                    }
                ],
                "description": "Matthias fires a stream of projectiles at a target. Reflected projectiles remove stacks of Blood Shield.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34440,
                "chat_link": "[&BoiGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_35() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Overhead Smash",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 200
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 5
                    }
                ],
                "description": "Berg swings his hammer in a massive overhead smash, dealing a large amount of damage to all targets on impact.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34448,
                "chat_link": "[&BpCGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_36() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Unstable Blood Magic",
                "icon": "https://render.guildwars2.com/file/93A3056DB159317C28972799036140B39A77009E/1377824.png",
                "description": "",
                "flags": [],
                "id": 34450,
                "chat_link": "[&BpKGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_37() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Sweep",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 300
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 1.5
                    }
                ],
                "description": "Forward sweep-attack; damages foes on impact.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34455,
                "chat_link": "[&BpeGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_38() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Poisonous Spit",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 1200
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 1
                    }
                ],
                "description": "The slubling spits a projectile that inflicts poison.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34460,
                "chat_link": "[&BpyGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_39() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Slowing Thump",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 200
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 8
                    }
                ],
                "description": "The slubling bounces and slows nearby targets.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34462,
                "chat_link": "[&Bp6GAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_40() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Slow Burn",
                "icon": "https://render.guildwars2.com/file/9C7F49591CE027BAF50CF29371466F0EBCAA2828/1377819.png",
                "description": "",
                "flags": [],
                "id": 34464,
                "chat_link": "[&BqCGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_41() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Fiery Vortex",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 180
                    }
                ],
                "description": "The fiery tornado pulls foes, dealing damage every second they're caught in the vortex.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34466,
                "chat_link": "[&BqKGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_42() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Corruption",
                "description": "Matthias corrupts a target, dealing pulsing damage to all foes in an area. Can be cleansed by entering uncorrupted fountains.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34473,
                "chat_link": "[&BqmGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_43() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Tantrum",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 3000
                    }
                ],
                "description": "Slothasor pounds the ground in irritation, causing violent tremors in the caves, dealing damage on impact, and knocking foes down.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34479,
                "chat_link": "[&Bq+GAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_44() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Blood Shards",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 1500
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 8
                    }
                ],
                "description": "Matthias fires a stream of projectiles at a target. Reflected projectiles remove stacks of Blood Shield.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34480,
                "chat_link": "[&BrCGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_45() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Volatile Poison",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 3000
                    }
                ],
                "description": "A pool of poison left behind after purging the volatile-poison condition.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34481,
                "chat_link": "[&BrGGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_46() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Spore Release",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 3000
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 30
                    }
                ],
                "description": "Slothasor shakes spores off its back, damaging foes on impact.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34482,
                "chat_link": "[&BrKGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_47() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Poison Spatter",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 1200
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 5
                    }
                ],
                "description": "The slubling spits multiple projectiles that convert boons to conditions upon hitting its target.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34488,
                "chat_link": "[&BriGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_48() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Crippling Thump",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 200
                    },
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 8
                    }
                ],
                "description": "The slubling bounces, crippling nearby targets.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34503,
                "chat_link": "[&BseGAAA=]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_49() {
        json.decodeFromString<GW2v2Skill>(
            """
            {
                "name": "Volatile Aura",
                "facts": [
                    {
                        "text": "Range",
                        "type": "Range",
                        "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                        "value": 2000
                    }
                ],
                "description": "Slothasor pulses a volatile aura that deals damage to all foes within a 2000 range every 3 seconds.",
                "icon": "https://render.guildwars2.com/file/1D55D34FB4EE20B1962E315245E40CA5E1042D0E/62248.png",
                "flags": [],
                "id": 34505,
                "chat_link": "[&BsmGAAA=]"
            }
            """.trimIndent()
        )
    }

}