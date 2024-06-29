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

class GW2v2TraitTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 1980,
                "tier": 2,
                "order": 2,
                "name": "Protected Phantasms",
                "description": "Phantasms spawn with aegis.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/DFB4D1B50AE4D6A275B349E15B179261EE3EB0AF/102854.png",
                        "duration": 5,
                        "status": "Aegis",
                        "description": "Block the next incoming attack; stacks duration.",
                        "apply_count": 1
                    }
                ],
                "specialization": 23,
                "icon": "https://render.guildwars2.com/file/1503DDC5B62526D71901E3A7F891A6F4445D80C8/1012527.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 1981,
                "tier": 3,
                "order": 0,
                "name": "Adaptive Armor",
                "description": "Barriers you receive are stronger. Reduce incoming condition damage while you have barrier.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Barrier Increase",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/357922487919E8E84B914EAC13D5796DDDC42D14/1770209.png",
                        "percent": 15
                    },
                    {
                        "text": "Condition Damage Reduced",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                        "percent": 20
                    }
                ],
                "specialization": 43,
                "icon": "https://render.guildwars2.com/file/14BD5F0ADF34A1ECDD9FD4672A1597B441B141D8/1128521.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 1983,
                "tier": 1,
                "order": 1,
                "name": "Dulled Senses",
                "description": "Cripple enemies that you disable.<br><c=@reminder>Disables include stun, daze, knockback, pull, knockdown, sink, float, launch, taunt, and fear.</c>",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/070325E519C178D502A8160523766070D30C0C19/102838.png",
                        "duration": 4,
                        "status": "Crippled",
                        "description": "Movement speed decreased by 50%; stacks duration.",
                        "apply_count": 1
                    }
                ],
                "specialization": 27,
                "icon": "https://render.guildwars2.com/file/7BFEAC083B4402807D310CCFF1147B2325CF364A/1012395.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 1984,
                "tier": 2,
                "order": 0,
                "name": "Pinpoint Distribution",
                "description": "Grant increased condition damage to nearby allies.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/68380515301D93ABD5E7A4C89748F80CD819EB3F/1012357.png",
                        "duration": 9,
                        "status": "Pinpoint Distribution",
                        "description": "Increases condition damage up to 100 points.",
                        "apply_count": 1
                    },
                    {
                        "text": "Interval",
                        "type": "Time",
                        "icon": "https://render.guildwars2.com/file/B75E91EB22E0DFCC1D08030204055946506D56F6/1770206.png",
                        "duration": 3
                    },
                    {
                        "text": "Radius",
                        "type": "Distance",
                        "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                        "distance": 600
                    },
                    {
                        "text": "Combat Only",
                        "type": "NoData",
                        "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png"
                    }
                ],
                "specialization": 38,
                "icon": "https://render.guildwars2.com/file/68380515301D93ABD5E7A4C89748F80CD819EB3F/1012357.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 1985,
                "tier": 0,
                "order": 0,
                "name": "Greatsword Proficiency",
                "description": "You can wield greatswords.",
                "slot": "Minor",
                "specialization": 34,
                "icon": "https://render.guildwars2.com/file/804B53EC6EB761C4F74AEE0CDDC90D3966912133/2010284.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 1986,
                "tier": 3,
                "order": 2,
                "name": "Elemental Bastion",
                "description": "Heal allies you grant an aura to. Grant frost aura to nearby allies when struck while below the health threshold.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 30
                    },
                    {
                        "text": "Healing",
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/D4347C52157B040943051D7E09DEAD7AF63D4378/156662.png",
                        "value": 522,
                        "target": "Healing"
                    },
                    {
                        "text": "Healing",
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/D4347C52157B040943051D7E09DEAD7AF63D4378/156662.png",
                        "value": 391,
                        "target": "Healing"
                    },
                    {
                        "text": "Healing",
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/D4347C52157B040943051D7E09DEAD7AF63D4378/156662.png",
                        "value": 391,
                        "target": "Healing"
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/719B80E35C276D68EF0AABB79126CF4CD42E3AF6/2261522.png",
                        "duration": 4,
                        "status": "Frost Aura",
                        "description": "Chill foes that strike you (only once per second for each attacker); incoming damage is reduced by 10%.",
                        "apply_count": 1
                    },
                    {
                        "text": "Health Threshold",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                        "percent": 75
                    },
                    {
                        "text": "Radius",
                        "type": "Distance",
                        "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                        "distance": 360
                    },
                    {
                        "text": "Number of Allied Targets",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                        "value": 5
                    }
                ],
                "specialization": 48,
                "icon": "https://render.guildwars2.com/file/570FD4DD0094280F906ACAAD37705E9B0F4ADA63/1029949.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 1987,
                "tier": 1,
                "order": 2,
                "name": "All's Well That Ends Well",
                "description": "<c=@abilitytype>Wells</c> heal allies when they end.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Healing",
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/D4347C52157B040943051D7E09DEAD7AF63D4378/156662.png",
                        "value": 1310,
                        "target": "Healing"
                    },
                    {
                        "text": "Number of Allied Targets",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                        "value": 5
                    },
                    {
                        "text": "Radius",
                        "type": "Distance",
                        "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                        "distance": 240
                    }
                ],
                "specialization": 40,
                "icon": "https://render.guildwars2.com/file/46D30FCC070170B2F656C3D80005909CD8B0F3F4/1012476.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 1988,
                "tier": 3,
                "order": 1,
                "name": "Protective Ward",
                "description": "When you receive damage, nearby foes are weakened and you gain protection.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 15
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/6CB0E64AF9AA292E332A38C1770CE577E2CDE0E8/102853.png",
                        "duration": 6,
                        "status": "Weakness",
                        "description": "Endurance regeneration decreased by 50%. 50% of hits are Glancing Blows (50% damage). Stacks duration.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/6CB0E64AF9AA292E332A38C1770CE577E2CDE0E8/102853.png",
                        "duration": 4,
                        "status": "Weakness",
                        "description": "Endurance regeneration decreased by 50%. 50% of hits are Glancing Blows (50% damage). Stacks duration.",
                        "apply_count": 1
                    },
                    {
                        "text": "Radius",
                        "type": "Distance",
                        "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                        "distance": 240
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/CD77D1FAB7B270223538A8F8ECDA1CFB044D65F4/102834.png",
                        "duration": 4,
                        "status": "Protection",
                        "description": "Incoming strike damage decreased by 33%; stacks duration.",
                        "apply_count": 1
                    }
                ],
                "specialization": 25,
                "icon": "https://render.guildwars2.com/file/9B7002D2715C18EF2E0E3AD6409B93F223EFDD02/1012637.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 1992,
                "tier": 3,
                "order": 0,
                "name": "Natural Mender",
                "description": "Increase outgoing healing to other allies whenever you heal an ally besides yourself.",
                "slot": "Minor",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/ECB17C0FAE20B0F77EE9043BE449546A6FB41ABE/1128541.png",
                        "duration": 8,
                        "status": "Natural Mender",
                        "description": "Healing to other allies is increased.",
                        "apply_count": 1
                    },
                    {
                        "text": "Maximum Stacks",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                        "value": 10
                    }
                ],
                "specialization": 5,
                "icon": "https://render.guildwars2.com/file/ECB17C0FAE20B0F77EE9043BE449546A6FB41ABE/1128541.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 1993,
                "tier": 2,
                "order": 0,
                "name": "Burst of Aggression",
                "description": "Gain a burst of speed when entering berserk mode.",
                "slot": "Minor",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/D4AB6401A6D6917C3D4F230764452BCCE1035B0D/1012835.png",
                        "duration": 3,
                        "status": "Quickness",
                        "description": "Skills and actions are faster.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/D4AB6401A6D6917C3D4F230764452BCCE1035B0D/1012835.png",
                        "duration": 2,
                        "status": "Quickness",
                        "description": "Skills and actions are faster.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/E04392C3D8ED985125973AEB99D8460C483263F9/103458.png",
                        "duration": 3,
                        "status": "Superspeed",
                        "description": "Movement speed is greatly increased. Maximum duration: 10s",
                        "apply_count": 1
                    }
                ],
                "specialization": 18,
                "icon": "https://render.guildwars2.com/file/77C5CC23125C9FD252762F515F9BE8B3AB0153E6/1058563.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 1994,
                "tier": 1,
                "order": 0,
                "name": "Physical Supremacy",
                "description": "Gain access to physical skills. Your maximum endurance threshold is increased, while Steal is replaced with Swipe.",
                "slot": "Minor",
                "facts": [
                    {
                        "text": "Endurance Threshold Increase",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                        "value": 50
                    }
                ],
                "skills": [
                    {
                        "name": "Swipe",
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
                                "value": 25
                            },
                            {
                                "text": "Unblockable",
                                "type": "NoData",
                                "icon": "https://render.guildwars2.com/file/BA65F2F5A073EB4BCC79085916B978DC0B096A0B/2248876.png"
                            }
                        ],
                        "description": "Shadowstep to your foe and steal from them.",
                        "icon": "https://render.guildwars2.com/file/07B49B4F1BB7613332987FBCEC39E24A0EAD01F6/2128021.png",
                        "flags": [],
                        "id": 55031,
                        "chat_link": "[&BvfWAAA=]",
                        "traited_facts": [
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/3A394C1A0A3257EB27A44842DDEEF0DF000E1241/102850.png",
                                "duration": 10,
                                "status": "Vulnerability",
                                "description": "Damage and condition damage taken are increased; stacks intensity.",
                                "apply_count": 5,
                                "requires_trait": 1169
                            },
                            {
                                "text": "Number of Allied Targets",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                                "value": 5,
                                "requires_trait": 1163
                            }
                        ]
                    }
                ],
                "specialization": 7,
                "icon": "https://render.guildwars2.com/file/0CDF226340671D9E0BAA3BBD6904CAD9DB6780C2/1058555.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 1995,
                "tier": 1,
                "order": 1,
                "name": "Time Catches Up",
                "description": "Activating a <c=@abilitytype>Shatter</c> gives your illusions superspeed. Shatters deal increased damage to movement-impaired foes.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/E04392C3D8ED985125973AEB99D8460C483263F9/103458.png",
                        "duration": 5,
                        "status": "Superspeed",
                        "description": "Movement speed is greatly increased. Maximum duration: 10s",
                        "apply_count": 1
                    },
                    {
                        "text": "Damage Increase",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                        "percent": 10
                    },
                    {
                        "text": "Damage Increase",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                        "percent": 5
                    }
                ],
                "specialization": 40,
                "icon": "https://render.guildwars2.com/file/3836E04A5BF0E8CCB815A8C1627904AB0CE5EE6A/1012474.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 1997,
                "tier": 1,
                "order": 1,
                "name": "Reactive Lenses",
                "description": "Activate Lesser Utility Goggles when blinded or disabled.<br><c=@reminder>Disables include stun, daze, knockback, pull, knockdown, sink, float, launch, taunt, and fear.</c>",
                "slot": "Major",
                "skills": [
                    {
                        "name": "Lesser Utility Goggles",
                        "facts": [
                            {
                                "text": "Recharge",
                                "type": "Recharge",
                                "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                                "value": 40
                            },
                            {
                                "text": "StunBreak",
                                "type": "StunBreak",
                                "icon": "https://render.guildwars2.com/file/DCF0719729165FD8910E034CA4E0780F90582D15/156654.png",
                                "value": true
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/50BAC1B8E10CFAB9E749A5D910D4A9DCF29EBB7C/961398.png",
                                "duration": 3,
                                "status": "Resistance",
                                "description": "Nondamaging conditions currently on you are ineffective; stacks duration.",
                                "apply_count": 1
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/09770136BB76FD0DBE1CC4267DEED54774CB20F6/102837.png",
                                "status": "Blinded",
                                "description": "Next outgoing attack misses; stacks duration."
                            }
                        ],
                        "description": "Gadget. Break out of stun, gaining resistance and clearing blindness.",
                        "icon": "https://render.guildwars2.com/file/4ED8F42447B076AF1DD410430974C7BE7A0F7F61/103417.png",
                        "flags": [],
                        "id": 29812,
                        "chat_link": "[&BnR0AAA=]",
                        "categories": [
                            "Gadget"
                        ],
                        "traited_facts": [
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/CD77D1FAB7B270223538A8F8ECDA1CFB044D65F4/102834.png",
                                "duration": 3,
                                "status": "Protection",
                                "description": "Incoming strike damage decreased by 33%; stacks duration.",
                                "apply_count": 1,
                                "requires_trait": 1679
                            }
                        ]
                    }
                ],
                "specialization": 21,
                "icon": "https://render.guildwars2.com/file/9DFA2D5E0C5E0EBBC0CD011E1FC6181F6D9ED5CC/1012379.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 1999,
                "tier": 2,
                "order": 1,
                "name": "Expert Examination",
                "description": "Stunning or dazing a foe applies vulnerability and weakness to them.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/6CB0E64AF9AA292E332A38C1770CE577E2CDE0E8/102853.png",
                        "duration": 4,
                        "status": "Weakness",
                        "description": "Endurance regeneration decreased by 50%. 50% of hits are Glancing Blows (50% damage). Stacks duration.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/3A394C1A0A3257EB27A44842DDEEF0DF000E1241/102850.png",
                        "duration": 6,
                        "status": "Vulnerability",
                        "description": "Damage and condition damage taken are increased; stacks intensity.",
                        "apply_count": 5
                    }
                ],
                "specialization": 43,
                "icon": "https://render.guildwars2.com/file/B62C0756B53D65A109E64863BC42F958DB6FDA93/1128522.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2000,
                "tier": 2,
                "order": 0,
                "name": "Body Blow",
                "description": "Stuns, dazes, knockbacks, pulls, pushes, and launches inflict bleeding and weakness.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/6CB0E64AF9AA292E332A38C1770CE577E2CDE0E8/102853.png",
                        "duration": 3,
                        "status": "Weakness",
                        "description": "Endurance regeneration decreased by 50%. 50% of hits are Glancing Blows (50% damage). Stacks duration.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/79FF0046A5F9ADA3B4C4EC19ADB4CB124D5F0021/102848.png",
                        "duration": 12,
                        "status": "Bleeding",
                        "description": "Deals damage every second; stacks intensity.",
                        "apply_count": 1
                    }
                ],
                "specialization": 4,
                "icon": "https://render.guildwars2.com/file/537FCF3A01560702E5C5554E03DEBEA40580A309/1012813.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2001,
                "tier": 2,
                "order": 1,
                "name": "Verdant Etching",
                "description": "<c=@abilitytype>Glyphs</c> gain reduced recharge and cast Lesser Seed of Life.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Recharge Reduced",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/AAB7C5387A08367C2F023F19FEE70E1556AD4375/1770202.png",
                        "percent": 20
                    }
                ],
                "skills": [
                    {
                        "name": "Lesser Seed of Life",
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
                                "value": 216,
                                "target": "Healing"
                            },
                            {
                                "text": "Conditions Removed",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                                "value": 1
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
                                "distance": 180
                            },
                            {
                                "text": "Combo Field",
                                "type": "ComboField",
                                "icon": "https://render.guildwars2.com/file/59E0DB6A699810641C959926ADFEF73E08CC255B/156655.png",
                                "field_type": "Light"
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/09770136BB76FD0DBE1CC4267DEED54774CB20F6/102837.png",
                                "duration": 4,
                                "status": "Blinded",
                                "description": "Next outgoing attack misses; stacks duration.",
                                "apply_count": 1
                            }
                        ],
                        "description": "Celestial Avatar. Summon a seed that heals and cleanses nearby allies of conditions when it blossoms.",
                        "icon": "https://render.guildwars2.com/file/761706674AF9092C98D059AB03BD747BFC7DF506/1128623.png",
                        "flags": [],
                        "id": 31776,
                        "chat_link": "[&BiB8AAA=]",
                        "categories": [
                            "CelestialAvatar"
                        ]
                    }
                ],
                "specialization": 5,
                "icon": "https://render.guildwars2.com/file/0BCB5CC47934D9A526600EC87E1966CEDED13514/1128534.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2002,
                "tier": 2,
                "order": 2,
                "name": "Dead or Alive",
                "description": "Receiving fatal damage while in berserk mode ends berserk and heals you. Incoming healing is increased.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 30
                    },
                    {
                        "text": "Healing",
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/D4347C52157B040943051D7E09DEAD7AF63D4378/156662.png",
                        "value": 5220,
                        "target": "Healing"
                    },
                    {
                        "text": "Incoming Healing Increase",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/D4347C52157B040943051D7E09DEAD7AF63D4378/156662.png",
                        "percent": 10
                    }
                ],
                "specialization": 18,
                "icon": "https://render.guildwars2.com/file/DAD5B03B013CD75A7EA842DAD244990C9D685BDD/1058559.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2004,
                "tier": 3,
                "order": 0,
                "name": "Elemental Enchantment",
                "description": "Gain concentration and your attunements gain reduced recharge.",
                "slot": "Minor",
                "facts": [
                    {
                        "text": "Recharge Reduced",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/AAB7C5387A08367C2F023F19FEE70E1556AD4375/1770202.png",
                        "percent": 15
                    },
                    {
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/6574560606F6BA1B32E9CF0F6C9709D1C1F2D9A6/2207782.png",
                        "value": 180,
                        "target": "BoonDuration"
                    },
                    {
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/6574560606F6BA1B32E9CF0F6C9709D1C1F2D9A6/2207782.png",
                        "value": 120,
                        "target": "BoonDuration"
                    }
                ],
                "specialization": 37,
                "icon": "https://render.guildwars2.com/file/C8986CF9A927C8A003ED152702270CC62745E56D/1012293.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2005,
                "tier": 3,
                "order": 0,
                "name": "Mental Defense",
                "description": "Cast Lesser Phantasmal Defender on your attacker when you successfully block or evade an attack.",
                "slot": "Major",
                "skills": [
                    {
                        "name": "Lesser Phantasmal Defender",
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
                                "value": 40
                            },
                            {
                                "text": "Damage",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "hit_count": 1,
                                "dmg_multiplier": 0.4
                            },
                            {
                                "text": "Damage",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "hit_count": 1,
                                "dmg_multiplier": 0.2
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
                                "distance": 240
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/02EED459AD65FAF7DF32A260E479C625070841B9/1228472.png",
                                "duration": 3,
                                "status": "Taunt",
                                "description": "Involuntarily attack foes.",
                                "apply_count": 1
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/02EED459AD65FAF7DF32A260E479C625070841B9/1228472.png",
                                "duration": 1,
                                "status": "Taunt",
                                "description": "Involuntarily attack foes.",
                                "apply_count": 1
                            },
                            {
                                "text": "Increased damage per block",
                                "type": "Percent",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "percent": 50
                            },
                            {
                                "text": "Maximum Damage Increase",
                                "type": "Percent",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "percent": 500
                            }
                        ],
                        "description": "Phantasm. Summon an illusion that taunts your target and all nearby targets while blocking attacks. It explodes when it finishes blocking, dealing increased damage for each attack blocked.",
                        "icon": "https://render.guildwars2.com/file/3439B9C801F6F72F0701A1BA759B249FF428D5C2/103791.png",
                        "flags": [],
                        "id": 30192,
                        "chat_link": "[&BvB1AAA=]",
                        "categories": [
                            "Phantasm"
                        ],
                        "traited_facts": [
                            {
                                "text": "Damage",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "requires_trait": 682,
                                "hit_count": 1,
                                "dmg_multiplier": 0.46,
                                "overrides": 2
                            },
                            {
                                "text": "Damage",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "requires_trait": 682,
                                "hit_count": 1,
                                "dmg_multiplier": 0.26,
                                "overrides": 3
                            }
                        ]
                    }
                ],
                "specialization": 23,
                "icon": "https://render.guildwars2.com/file/EC7602C0FABB72AFB01379563ED7FB76079BB9CA/1012528.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2006,
                "tier": 2,
                "order": 1,
                "name": "Thermal Vision",
                "description": "Gain expertise. Increase your outgoing condition damage when you inflict burning.",
                "slot": "Major",
                "facts": [
                    {
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/4977CD5BAF0A7B6412DCC775C3909F7D4EFE4C65/2229319.png",
                        "value": 150,
                        "target": "ConditionDuration"
                    },
                    {
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/4977CD5BAF0A7B6412DCC775C3909F7D4EFE4C65/2229319.png",
                        "value": 60,
                        "target": "ConditionDuration"
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/F806ACB6130CED2DACC9DD804E4303327073385A/1012358.png",
                        "duration": 4,
                        "status": "Thermal Vision",
                        "apply_count": 1
                    }
                ],
                "specialization": 38,
                "icon": "https://render.guildwars2.com/file/F806ACB6130CED2DACC9DD804E4303327073385A/1012358.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2008,
                "tier": 2,
                "order": 1,
                "name": "Chilling Victory",
                "description": "Striking a chilled foe grants might and life force.<br><c=@reminder>Single attacks can activate this trait more than once before recharging.</c>",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 1
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
                        "text": "Life Force",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                        "percent": 1
                    }
                ],
                "specialization": 34,
                "icon": "https://render.guildwars2.com/file/68624FE2917028DBBC0370BBDDC8DB2C0EDD7CB8/1012574.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2009,
                "tier": 2,
                "order": 0,
                "name": "Danger Time",
                "description": "Gain additional critical-hit chance against slowed enemies. This bonus also applies to your illusions.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/F60D1EF5271D7B9319610855676D320CD25F01C6/961397.png",
                        "duration": 0,
                        "status": "Slow",
                        "description": "Skills and actions are slower.",
                        "apply_count": 1
                    },
                    {
                        "text": "Critical Chance Increase",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/C2CEA567E0C43C199C782809544721AA12A6DF0A/2229323.png",
                        "percent": 15
                    }
                ],
                "specialization": 40,
                "icon": "https://render.guildwars2.com/file/E0A1FF012E170754030A0CB6DFDBAED3E81FAB5B/1012479.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2011,
                "tier": 2,
                "order": 0,
                "name": "Blood Reaction",
                "description": "A percentage of precision is given as a bonus to ferocity. This bonus is doubled in berserk mode.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Attribute Conversion",
                        "type": "BuffConversion",
                        "icon": "https://render.guildwars2.com/file/0658D833944E69E62E08EB18A0B5407F722125BC/2229320.png",
                        "percent": 7,
                        "source": "Precision",
                        "target": "CritDamage"
                    },
                    {
                        "text": "Attribute Conversion",
                        "type": "BuffConversion",
                        "icon": "https://render.guildwars2.com/file/0658D833944E69E62E08EB18A0B5407F722125BC/2229320.png",
                        "percent": 14,
                        "source": "Precision",
                        "target": "CritDamage"
                    }
                ],
                "specialization": 18,
                "icon": "https://render.guildwars2.com/file/2FE06152FB14EF659843EC3CB80FCECD72C61F5D/1029970.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2013,
                "tier": 1,
                "order": 1,
                "name": "Plague Sending",
                "description": "Your first attack after entering shroud transfers conditions.<br><c=@reminder>Only activates if you have conditions.</c>",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Conditions Transferred",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                        "value": 2
                    }
                ],
                "specialization": 39,
                "icon": "https://render.guildwars2.com/file/F004E33D079E4B5762EEF51F94CA493B64FFC4A2/1012547.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2014,
                "tier": 2,
                "order": 0,
                "name": "Speed of Synergy",
                "description": "Using a heal skill grants superspeed in a radius around you. Using a healing skill's associated tool-belt skill grants you personal superspeed.",
                "slot": "Minor",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/E04392C3D8ED985125973AEB99D8460C483263F9/103458.png",
                        "duration": 7,
                        "status": "Superspeed",
                        "description": "Movement speed is greatly increased. Maximum duration: 10s",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/E04392C3D8ED985125973AEB99D8460C483263F9/103458.png",
                        "duration": 5,
                        "status": "Superspeed",
                        "description": "Movement speed is greatly increased. Maximum duration: 10s",
                        "apply_count": 1
                    },
                    {
                        "text": "Ally Superspeed Radius",
                        "type": "Distance",
                        "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                        "distance": 240
                    }
                ],
                "specialization": 43,
                "icon": "https://render.guildwars2.com/file/9EA1A2AEAEEA679A4038D7A136C1C7B61A08C3C1/2175051.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2015,
                "tier": 2,
                "order": 2,
                "name": "Invigorating Torrents",
                "description": "Auras you grant also grant regeneration and vigor.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/58E92EBAF0DB4DA7C4AC04D9B22BCA5ECF0100DE/102843.png",
                        "duration": 5,
                        "status": "Vigor",
                        "description": "Endurance regeneration increased by 50%; stacks duration.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/58E92EBAF0DB4DA7C4AC04D9B22BCA5ECF0100DE/102843.png",
                        "duration": 3,
                        "status": "Vigor",
                        "description": "Endurance regeneration increased by 50%; stacks duration.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/F69996772B9E18FD18AD0AABAB25D7E3FC42F261/102835.png",
                        "duration": 5,
                        "status": "Regeneration",
                        "description": "Gain health every second; stacks duration.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/F69996772B9E18FD18AD0AABAB25D7E3FC42F261/102835.png",
                        "duration": 3,
                        "status": "Regeneration",
                        "description": "Gain health every second; stacks duration.",
                        "apply_count": 1
                    }
                ],
                "specialization": 48,
                "icon": "https://render.guildwars2.com/file/053DD3F436F333340672EB1F7F951F540ADFDBC4/1029947.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_26() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2016,
                "tier": 1,
                "order": 1,
                "name": "Cultivated Synergy",
                "description": "Using your heal skill, heals allies around you and your pet.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Healing",
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/D4347C52157B040943051D7E09DEAD7AF63D4378/156662.png",
                        "value": 1000,
                        "target": "Healing"
                    },
                    {
                        "text": "Number of Allied Targets",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                        "value": 5
                    }
                ],
                "specialization": 5,
                "icon": "https://render.guildwars2.com/file/9DAD4D2E74CDD1C5196848BCBE63BC12CE534B68/1128531.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_27() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2017,
                "tier": 3,
                "order": 2,
                "name": "Symbolic Avenger",
                "description": "Your strike damage is increased whenever your <c=@abilitytype>Symbols</c> hit a foe.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/C1A6EBA29894C831AAEE0D1C47080D12F9BA3AA3/1012458.png",
                        "duration": 15,
                        "status": "Symbolic Avenger",
                        "description": "Deal increased damage per stack.",
                        "apply_count": 1
                    },
                    {
                        "text": "Maximum Stacks",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/B4490FB81AA1E7C06F1B22056AE09A0F54CBE2C4/1770201.png",
                        "value": 5
                    }
                ],
                "specialization": 42,
                "icon": "https://render.guildwars2.com/file/C1A6EBA29894C831AAEE0D1C47080D12F9BA3AA3/1012458.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_28() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2018,
                "tier": 3,
                "order": 0,
                "name": "Cold Shoulder",
                "description": "Chill lasts longer, and chilled foes take increased strike damage from your attacks.",
                "slot": "Minor",
                "facts": [
                    {
                        "text": "Damage Increase",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                        "percent": 10
                    },
                    {
                        "text": "Damage Increase",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                        "percent": 15
                    },
                    {
                        "text": "Duration Increase",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                        "percent": 20
                    }
                ],
                "specialization": 34,
                "icon": "https://render.guildwars2.com/file/9959EB3A12044FF0C708413A0CCA479D0515F17D/1012581.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_29() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2020,
                "tier": 1,
                "order": 1,
                "name": "Chilling Nova",
                "description": "Critical hits against chilled foes cause an explosion that chills adjacent foes.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 8
                    }
                ],
                "skills": [
                    {
                        "name": "Chilling Nova",
                        "facts": [
                            {
                                "text": "Number of Targets",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                                "value": 5
                            },
                            {
                                "text": "Damage",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "hit_count": 1,
                                "dmg_multiplier": 1.125
                            },
                            {
                                "text": "Damage",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "hit_count": 1,
                                "dmg_multiplier": 0.1
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/28C4EC547A3516AF0242E826772DA43A5EAC3DF3/102839.png",
                                "duration": 2,
                                "status": "Chilled",
                                "description": "Movement speed decreased by 66%; skill cooldown increased by 66%; stacks duration.",
                                "apply_count": 1
                            },
                            {
                                "text": "Radius",
                                "type": "Distance",
                                "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                                "distance": 180
                            },
                            {
                                "text": "Cannot Critical Hit",
                                "type": "NoData",
                                "icon": "https://render.guildwars2.com/file/63015872E20761F5E76F803A90666FBE4E262BC9/536051.png"
                            }
                        ],
                        "description": "Create a nova at the target that damages and chills nearby foes.",
                        "icon": "https://render.guildwars2.com/file/1A530DDEE40FC509562E11170D0F620127D70DD0/1012917.png",
                        "flags": [],
                        "id": 29604,
                        "chat_link": "[&BqRzAAA=]"
                    }
                ],
                "specialization": 34,
                "icon": "https://render.guildwars2.com/file/BC1757B4EF53B20D64E83AC495B6B2E4505B04F3/1012571.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_30() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2021,
                "tier": 3,
                "order": 2,
                "name": "Reaper's Onslaught",
                "description": "Gain ferocity and quickness while in Reaper's Shroud. Hitting with Life Reap reduces the recharge time of shroud skills.<br><c=@reminder>Recharge reduction can only occur once per use of Life Reap.</c>",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Recharge Time Reduced",
                        "type": "Time",
                        "icon": "https://render.guildwars2.com/file/AAB7C5387A08367C2F023F19FEE70E1556AD4375/1770202.png",
                        "duration": 1
                    },
                    {
                        "text": "Increased Ferocity",
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/0658D833944E69E62E08EB18A0B5407F722125BC/2229320.png",
                        "value": 300,
                        "target": "CritDamage"
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/D4AB6401A6D6917C3D4F230764452BCCE1035B0D/1012835.png",
                        "duration": 3,
                        "status": "Quickness",
                        "description": "Skills and actions are faster.",
                        "apply_count": 1
                    },
                    {
                        "text": "Interval",
                        "type": "Time",
                        "icon": "https://render.guildwars2.com/file/B75E91EB22E0DFCC1D08030204055946506D56F6/1770206.png",
                        "duration": 3
                    }
                ],
                "specialization": 34,
                "icon": "https://render.guildwars2.com/file/4676081D0C9BDFE3F25E0BD0C7EFAE0139D89A0B/1012578.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_31() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2022,
                "tier": 3,
                "order": 1,
                "name": "Seize the Moment",
                "description": "Gain quickness for each clone you <c=@abilitytype>shatter</c>. Nearby allies also gain quickness.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/D4AB6401A6D6917C3D4F230764452BCCE1035B0D/1012835.png",
                        "duration": 1,
                        "status": "Quickness",
                        "description": "Skills and actions are faster.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/D4AB6401A6D6917C3D4F230764452BCCE1035B0D/1012835.png",
                        "duration": 1,
                        "status": "Quickness",
                        "description": "Skills and actions are faster.",
                        "apply_count": 1
                    },
                    {
                        "text": "Radius",
                        "type": "Distance",
                        "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                        "distance": 240
                    }
                ],
                "specialization": 40,
                "icon": "https://render.guildwars2.com/file/0FF56A2B51F9C30CDA540CC41F0A1FA30CED74A0/1012482.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_32() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2023,
                "tier": 1,
                "order": 1,
                "name": "Escapist's Fortitude",
                "description": "Gain health when you successfully evade an attack. Remove a condition whenever you evade an attack.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 1
                    },
                    {
                        "text": "Healing",
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/D4347C52157B040943051D7E09DEAD7AF63D4378/156662.png",
                        "value": 456,
                        "target": "Healing"
                    },
                    {
                        "text": "Conditions Removed",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                        "value": 1
                    }
                ],
                "specialization": 7,
                "icon": "https://render.guildwars2.com/file/997ABE456858707D663FAD58BFA809BAB83455C1/1058556.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_33() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2025,
                "tier": 1,
                "order": 0,
                "name": "Singularity",
                "description": "Attain elemental singularity by remaining in an attunement for a period of time. Upon attaining singularity, you may overload the attunement to your vicinity. Gain access to <c=@abilitytype>Shouts</c>.",
                "slot": "Minor",
                "skills": [
                    {
                        "name": "Overload Fire",
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
                                "value": 20
                            },
                            {
                                "text": "StunBreak",
                                "type": "StunBreak",
                                "icon": "https://render.guildwars2.com/file/DCF0719729165FD8910E034CA4E0780F90582D15/156654.png",
                                "value": true
                            },
                            {
                                "text": "Pulse Damage",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "hit_count": 1,
                                "dmg_multiplier": 0.9
                            },
                            {
                                "text": "Pulse Damage",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "hit_count": 1,
                                "dmg_multiplier": 1
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/B47BF5803FED2718D7474EAF9617629AD068EE10/102849.png",
                                "duration": 3,
                                "status": "Burning",
                                "description": "Deals damage every second; stacks intensity.",
                                "apply_count": 1
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/2FA9DF9D6BC17839BBEA14723F1C53D645DDB5E1/102852.png",
                                "duration": 16,
                                "status": "Might",
                                "description": "Increased outgoing damage; stacks intensity.",
                                "apply_count": 2
                            },
                            {
                                "text": "Duration",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                                "duration": 5
                            },
                            {
                                "text": "Interval",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/B75E91EB22E0DFCC1D08030204055946506D56F6/1770206.png",
                                "duration": 1
                            },
                            {
                                "text": "Combo Field",
                                "type": "ComboField",
                                "icon": "https://render.guildwars2.com/file/59E0DB6A699810641C959926ADFEF73E08CC255B/156655.png",
                                "field_type": "Fire"
                            },
                            {
                                "text": "Combo Finisher",
                                "type": "ComboFinisher",
                                "icon": "https://render.guildwars2.com/file/A513F3653D33FBA4220D2D307799F8A327A36A3B/156656.png",
                                "percent": 100,
                                "finisher_type": "Whirl"
                            }
                        ],
                        "description": "Overload. Unleash your flames, granting might to allies and burning enemies. Finishing the cast creates a tornado that continues to grant might and burn foes.\nUsing this skill causes the attunement to have a longer recharge.",
                        "icon": "https://render.guildwars2.com/file/3A04F5D420A86664A3044B950E145E022A49D8AA/1029985.png",
                        "flags": [],
                        "id": 29706,
                        "chat_link": "[&Bgp0AAA=]",
                        "categories": [
                            "Overload"
                        ]
                    },
                    {
                        "name": "Overload Water",
                        "facts": [
                            {
                                "text": "Recharge",
                                "type": "Recharge",
                                "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                                "value": 20
                            },
                            {
                                "text": "StunBreak",
                                "type": "StunBreak",
                                "icon": "https://render.guildwars2.com/file/DCF0719729165FD8910E034CA4E0780F90582D15/156654.png",
                                "value": true
                            },
                            {
                                "text": "Healing",
                                "type": "AttributeAdjust",
                                "icon": "https://render.guildwars2.com/file/D4347C52157B040943051D7E09DEAD7AF63D4378/156662.png",
                                "value": 392,
                                "target": "Healing"
                            },
                            {
                                "text": "Final Heal",
                                "type": "AttributeAdjust",
                                "icon": "https://render.guildwars2.com/file/D4347C52157B040943051D7E09DEAD7AF63D4378/156662.png",
                                "value": 3220,
                                "target": "Healing"
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
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/58E92EBAF0DB4DA7C4AC04D9B22BCA5ECF0100DE/102843.png",
                                "duration": 5,
                                "status": "Vigor",
                                "description": "Endurance regeneration increased by 50%; stacks duration.",
                                "apply_count": 1
                            },
                            {
                                "text": "Conditions Removed per Pulse",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                                "value": 1
                            },
                            {
                                "text": "Interval",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/B75E91EB22E0DFCC1D08030204055946506D56F6/1770206.png",
                                "duration": 1
                            },
                            {
                                "text": "Radius",
                                "type": "Distance",
                                "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                                "distance": 360
                            },
                            {
                                "text": "Water Attunement Recharge",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/AAB7C5387A08367C2F023F19FEE70E1556AD4375/1770202.png",
                                "duration": 20
                            },
                            {
                                "text": "Number of Allied Targets",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                                "value": 10
                            },
                            {
                                "text": "Number of Allied Targets",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                                "value": 5
                            }
                        ],
                        "description": "Overload. Create a surge of accumulated water magic, healing and cleansing allies. When the cast ends, heal the area and apply regeneration.\nUsing this skill causes the attunement to have a longer recharge.",
                        "icon": "https://render.guildwars2.com/file/0E3DEF200ACD40FE281956CBA511E934F2B3F82A/1029986.png",
                        "flags": [],
                        "id": 29415,
                        "chat_link": "[&BudyAAA=]",
                        "categories": [
                            "Overload"
                        ],
                        "traited_facts": [
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/719B80E35C276D68EF0AABB79126CF4CD42E3AF6/2261522.png",
                                "duration": 4,
                                "status": "Frost Aura",
                                "description": "Chill foes that strike you (only once per second for each attacker); incoming damage is reduced by 10%.",
                                "apply_count": 1,
                                "requires_trait": 1886
                            }
                        ]
                    },
                    {
                        "name": "Overload Air",
                        "facts": [
                            {
                                "text": "Range",
                                "type": "Range",
                                "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                                "value": 360
                            },
                            {
                                "text": "Recharge",
                                "type": "Recharge",
                                "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                                "value": 20
                            },
                            {
                                "text": "StunBreak",
                                "type": "StunBreak",
                                "icon": "https://render.guildwars2.com/file/DCF0719729165FD8910E034CA4E0780F90582D15/156654.png",
                                "value": true
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
                                "icon": "https://render.guildwars2.com/file/592CC2A120322000BC7234B8522BBE7BAF2F4A57/1029987.png",
                                "duration": 10,
                                "status": "Static Charge",
                                "description": "Your next attack delivers a lightning strike.",
                                "apply_count": 1
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/3A394C1A0A3257EB27A44842DDEEF0DF000E1241/102850.png",
                                "duration": 10,
                                "status": "Vulnerability",
                                "description": "Damage and condition damage taken are increased; stacks intensity.",
                                "apply_count": 1
                            },
                            {
                                "text": "Radius",
                                "type": "Distance",
                                "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                                "distance": 360
                            },
                            {
                                "text": "Attack Interval",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/B75E91EB22E0DFCC1D08030204055946506D56F6/1770206.png",
                                "duration": 1
                            },
                            {
                                "text": "Number of Targets",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                                "value": 3
                            },
                            {
                                "text": "Combo Field",
                                "type": "ComboField",
                                "icon": "https://render.guildwars2.com/file/59E0DB6A699810641C959926ADFEF73E08CC255B/156655.png",
                                "field_type": "Lightning"
                            },
                            {
                                "text": "Field Duration",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                                "duration": 4
                            }
                        ],
                        "description": "Overload. Use your air magic to summon a nimbus that repeatedly strikes nearby enemies. When this ability is complete, imbue your allies with electricity and create a lingering static region that strikes enemies at the same interval.\nUsing this skill causes the attunement to have a longer recharge.",
                        "icon": "https://render.guildwars2.com/file/592CC2A120322000BC7234B8522BBE7BAF2F4A57/1029987.png",
                        "flags": [],
                        "id": 29719,
                        "chat_link": "[&Bhd0AAA=]",
                        "categories": [
                            "Overload"
                        ],
                        "traited_facts": [
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/79F60BF40AB3F306E7367CF3479A4163F76F3944/2261527.png",
                                "duration": 4,
                                "status": "Shocking Aura",
                                "description": "Stun nearby attacking foes with an electric shock (only once per 2 seconds for each attacker).",
                                "apply_count": 1,
                                "requires_trait": 1886
                            }
                        ]
                    },
                    {
                        "name": "Overload Earth",
                        "facts": [
                            {
                                "text": "Recharge",
                                "type": "Recharge",
                                "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                                "value": 20
                            },
                            {
                                "text": "StunBreak",
                                "type": "StunBreak",
                                "icon": "https://render.guildwars2.com/file/DCF0719729165FD8910E034CA4E0780F90582D15/156654.png",
                                "value": true
                            },
                            {
                                "text": "Damage",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "hit_count": 1,
                                "dmg_multiplier": 0.75
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/070325E519C178D502A8160523766070D30C0C19/102838.png",
                                "duration": 3,
                                "status": "Crippled",
                                "description": "Movement speed decreased by 50%; stacks duration.",
                                "apply_count": 1
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/79FF0046A5F9ADA3B4C4EC19ADB4CB124D5F0021/102848.png",
                                "duration": 9,
                                "status": "Bleeding",
                                "description": "Deals damage every second; stacks intensity.",
                                "apply_count": 1
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/397A613651BFCA2832B6469CE34735580A2C120E/102844.png",
                                "duration": 4,
                                "status": "Immobile",
                                "description": "Unable to move; stacks duration.",
                                "apply_count": 1
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/CD77D1FAB7B270223538A8F8ECDA1CFB044D65F4/102834.png",
                                "duration": 1,
                                "status": "Protection",
                                "description": "Incoming strike damage decreased by 33%; stacks duration.",
                                "apply_count": 1
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/3D3A1C2D6D791C05179AB871902D28782C65C244/415959.png",
                                "duration": 4,
                                "status": "Stability",
                                "description": "Cannot be knocked down, pushed back, pulled, launched, stunned, dazed, floated, sunk, feared, or taunted.",
                                "apply_count": 3
                            },
                            {
                                "text": "Interval",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/B75E91EB22E0DFCC1D08030204055946506D56F6/1770206.png",
                                "duration": 1
                            },
                            {
                                "text": "Storm Duration",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                                "duration": 4
                            },
                            {
                                "text": "Radius",
                                "type": "Distance",
                                "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                                "distance": 240
                            },
                            {
                                "text": "Number of Targets",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                                "value": 10
                            },
                            {
                                "text": "Number of Targets",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                                "value": 5
                            },
                            {
                                "text": "Combo Finisher",
                                "type": "ComboFinisher",
                                "icon": "https://render.guildwars2.com/file/A513F3653D33FBA4220D2D307799F8A327A36A3B/156656.png",
                                "percent": 100,
                                "finisher_type": "Blast"
                            }
                        ],
                        "description": "Overload. Ride your stored earth magic around, granting protection to other allies you move over and crippling enemies, then deliver a final immobilizing blast of power to the area, leaving behind a dust cyclone that delivers the same effects as the overload.\nUsing this skill causes the attunement to have a longer recharge.",
                        "icon": "https://render.guildwars2.com/file/975A1DE89BA70721BD0E0F6D601C259066F8D468/1029988.png",
                        "flags": [],
                        "id": 29618,
                        "chat_link": "[&BrJzAAA=]",
                        "categories": [
                            "Overload"
                        ],
                        "traited_facts": [
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/33D27C7FE0017F70749DE84576F56F381DDF0C30/2261524.png",
                                "duration": 4,
                                "status": "Magnetic Aura",
                                "description": "Reflect projectiles with magnetic energy.",
                                "apply_count": 1,
                                "requires_trait": 1886
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/3D3A1C2D6D791C05179AB871902D28782C65C244/415959.png",
                                "duration": 4,
                                "status": "Stability",
                                "description": "Cannot be knocked down, pushed back, pulled, launched, stunned, dazed, floated, sunk, feared, or taunted.",
                                "apply_count": 4,
                                "requires_trait": 1902,
                                "overrides": 7
                            }
                        ]
                    }
                ],
                "specialization": 48,
                "icon": "https://render.guildwars2.com/file/B5B020BD12E7A490DE9551FA06D920AC4F9A6036/1029952.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_34() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2026,
                "tier": 1,
                "order": 2,
                "name": "Relentless Pursuit",
                "description": "Reduces duration of movement-impairing conditions. Additional reduction while in reaper's shroud.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/397A613651BFCA2832B6469CE34735580A2C120E/102844.png",
                        "duration": 0,
                        "status": "Immobile",
                        "description": "Unable to move; stacks duration.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/070325E519C178D502A8160523766070D30C0C19/102838.png",
                        "duration": 0,
                        "status": "Crippled",
                        "description": "Movement speed decreased by 50%; stacks duration.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/28C4EC547A3516AF0242E826772DA43A5EAC3DF3/102839.png",
                        "duration": 0,
                        "status": "Chilled",
                        "description": "Movement speed decreased by 66%; skill cooldown increased by 66%; stacks duration.",
                        "apply_count": 1
                    },
                    {
                        "text": "Duration Decreased",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                        "percent": 33
                    },
                    {
                        "text": "Duration Decreased in Reaper's Shroud",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                        "percent": 66
                    }
                ],
                "specialization": 34,
                "icon": "https://render.guildwars2.com/file/03263B08082BDC390C0C38019CFF1F73B8CE077E/1012572.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_35() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2028,
                "tier": 3,
                "order": 2,
                "name": "Soothing Power",
                "description": "Soothing Mist is more effective.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Effectiveness Increased",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                        "percent": 100
                    }
                ],
                "specialization": 17,
                "icon": "https://render.guildwars2.com/file/6F7761ECC1979C1207C6166DF8EA7BA9B726B609/1012326.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_36() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2030,
                "tier": 1,
                "order": 0,
                "name": "Time Splitter",
                "description": "Gain access to chronomancer shatter skills and <c=@abilitytype>Wells</c>.",
                "slot": "Minor",
                "skills": [
                    {
                        "name": "Split Second",
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
                                "value": 12
                            },
                            {
                                "text": "1 Clone",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "hit_count": 1,
                                "dmg_multiplier": 0.767
                            },
                            {
                                "text": "2 Clones",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "hit_count": 2,
                                "dmg_multiplier": 0.613
                            },
                            {
                                "text": "3 Clones",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "hit_count": 3,
                                "dmg_multiplier": 0.537
                            },
                            {
                                "text": "Radius",
                                "type": "Distance",
                                "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                                "distance": 240
                            },
                            {
                                "text": "Number of Targets",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                                "value": 5
                            },
                            {
                                "text": "Interval",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/B75E91EB22E0DFCC1D08030204055946506D56F6/1770206.png",
                                "duration": 1
                            }
                        ],
                        "description": "Shatter. Destroy all your clones, damaging nearby foes. Strikes again after a delay.\nShatter traits only affect the first strike of this skill.",
                        "icon": "https://render.guildwars2.com/file/14090D7A6472AB06125662EB12E6EC51EDE2EEBB/2175059.png",
                        "flags": [],
                        "id": 56930,
                        "chat_link": "[&BmLeAAA=]",
                        "traited_facts": [
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/2FA9DF9D6BC17839BBEA14723F1C53D645DDB5E1/102852.png",
                                "duration": 8,
                                "status": "Might",
                                "description": "Increased outgoing damage; stacks intensity.",
                                "apply_count": 5,
                                "requires_trait": 1687
                            },
                            {
                                "text": "Critical Chance Increase",
                                "type": "Percent",
                                "icon": "https://render.guildwars2.com/file/C2CEA567E0C43C199C782809544721AA12A6DF0A/2229323.png",
                                "percent": 25,
                                "requires_trait": 2035
                            },
                            {
                                "text": "Conditions Removed",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                                "value": 1,
                                "requires_trait": 740
                            }
                        ]
                    },
                    {
                        "name": "Rewinder",
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
                                "value": 30
                            },
                            {
                                "text": "Damage",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "hit_count": 1,
                                "dmg_multiplier": 0.38
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/289AA0A4644F0E044DED3D3F39CED958E1DDFF53/102880.png",
                                "duration": 3,
                                "status": "Confusion",
                                "description": "Damage received on skill activation; stacks intensity.",
                                "apply_count": 1
                            },
                            {
                                "text": "Radius",
                                "type": "Distance",
                                "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                                "distance": 240
                            },
                            {
                                "text": "Number of Targets",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                                "value": 5
                            },
                            {
                                "text": "Rechage Reduced per Clone",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/AAB7C5387A08367C2F023F19FEE70E1556AD4375/1770202.png",
                                "duration": 3
                            }
                        ],
                        "description": "Shatter. Destroy all your clones, confusing nearby foes and recharging this skill for each clone shattered.",
                        "icon": "https://render.guildwars2.com/file/F59775A05108441C09AC03C30CAD98CC049CCC28/2175058.png",
                        "flags": [],
                        "id": 56928,
                        "chat_link": "[&BmDeAAA=]",
                        "traited_facts": [
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/58E92EBAF0DB4DA7C4AC04D9B22BCA5ECF0100DE/102843.png",
                                "duration": 8,
                                "status": "Vigor",
                                "description": "Endurance regeneration increased by 50%; stacks duration.",
                                "apply_count": 1,
                                "requires_trait": 1687
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/289AA0A4644F0E044DED3D3F39CED958E1DDFF53/102880.png",
                                "duration": 4,
                                "status": "Confusion",
                                "description": "Damage received on skill activation; stacks intensity.",
                                "apply_count": 2,
                                "requires_trait": 734,
                                "overrides": 3
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/070325E519C178D502A8160523766070D30C0C19/102838.png",
                                "duration": 3,
                                "status": "Crippled",
                                "description": "Movement speed decreased by 50%; stacks duration.",
                                "apply_count": 1,
                                "requires_trait": 2035
                            },
                            {
                                "text": "Conditions Removed",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                                "value": 1,
                                "requires_trait": 740
                            }
                        ]
                    },
                    {
                        "name": "Time Sink",
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
                                "value": 38
                            },
                            {
                                "text": "Daze",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/9AE125E930C92FEA0DD99E7EBAEDE4CF5EC556B6/433474.png",
                                "duration": 1
                            },
                            {
                                "text": "Radius",
                                "type": "Distance",
                                "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                                "distance": 240
                            },
                            {
                                "text": "Number of Targets",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                                "value": 1
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/F60D1EF5271D7B9319610855676D320CD25F01C6/961397.png",
                                "duration": 2,
                                "status": "Slow",
                                "description": "Skills and actions are slower.",
                                "apply_count": 1
                            }
                        ],
                        "description": "Shatter. Destroy all your clones, dazing and slowing their targets.",
                        "icon": "https://render.guildwars2.com/file/3A0CF805A4359A10766D1DD04FF0E7D20A05BD17/2175060.png",
                        "flags": [],
                        "id": 56873,
                        "chat_link": "[&BineAAA=]",
                        "traited_facts": [
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/96D90DF84CAFE008233DD1C2606A12C1A0E68048/102842.png",
                                "duration": 10,
                                "status": "Fury",
                                "description": "Critical Chance increased by 20%; stacks duration.",
                                "apply_count": 1,
                                "requires_trait": 1687
                            },
                            {
                                "text": "Number of Targets",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                                "value": 5,
                                "requires_trait": 2035,
                                "overrides": 4
                            },
                            {
                                "text": "Conditions Removed",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                                "value": 1,
                                "requires_trait": 740
                            }
                        ]
                    },
                    {
                        "name": "Continuum Split",
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
                                "value": 105
                            },
                            {
                                "text": "0 Clones",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                                "duration": 2
                            },
                            {
                                "text": "1 Clone",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                                "duration": 3
                            },
                            {
                                "text": "2 Clones",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                                "duration": 5
                            },
                            {
                                "text": "3 Clones",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                                "duration": 6
                            },
                            {
                                "text": "Prevents Capture-Point Contribution",
                                "type": "NoData",
                                "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png"
                            },
                            {
                                "text": "Number of Targets",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                                "value": 1
                            },
                            {
                                "text": "Radius",
                                "type": "Distance",
                                "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                                "distance": 240
                            }
                        ],
                        "description": "Destroy all your clones and create a rift in the space-time continuum. When it expires, you will revert back to your original point with your previous health, endurance, and skill recharges. Duration increases with each illusion shattered.\nThis skill's recharge cannot be reset by other mesmer skills.",
                        "icon": "https://render.guildwars2.com/file/9E7CE10D0E447973F2D9175CF16A103BD076D04B/1012882.png",
                        "flags": [],
                        "id": 29830,
                        "chat_link": "[&BoZ0AAA=]",
                        "traited_facts": [
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/50BAC1B8E10CFAB9E749A5D910D4A9DCF29EBB7C/961398.png",
                                "duration": 3,
                                "status": "Resistance",
                                "description": "Nondamaging conditions currently on you are ineffective; stacks duration.",
                                "apply_count": 1,
                                "requires_trait": 1687
                            },
                            {
                                "text": "Conditions Removed",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                                "value": 1,
                                "requires_trait": 740
                            },
                            {
                                "text": "Duration Increase",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                                "duration": 1,
                                "requires_trait": 2035
                            }
                        ]
                    },
                    {
                        "name": "Continuum Shift",
                        "facts": [
                            {
                                "text": "Range",
                                "type": "Range",
                                "icon": "https://render.guildwars2.com/file/0AAB34BEB1C9F4A25EC612DDBEACF3E20B2810FA/156666.png",
                                "value": 5000
                            }
                        ],
                        "description": "Revert back to the previous timeline. Your health, endurance and cooldowns are reverted to their previous states. You are transported back prematurely if the rift is destroyed.",
                        "icon": "https://render.guildwars2.com/file/4BD3BEF1DE31476B3E40002708049EA1026F1F0B/1012895.png",
                        "flags": [],
                        "id": 30747,
                        "chat_link": "[&Bht4AAA=]"
                    }
                ],
                "specialization": 40,
                "icon": "https://render.guildwars2.com/file/5A9347250FEF7B3431ECE3F6689EDCE20FB96CB6/1012483.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_37() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2031,
                "tier": 2,
                "order": 2,
                "name": "Decimate Defenses",
                "description": "Striking a foe with vulnerability increases your critical hit chance.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Critical Chance per Stack",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/C2CEA567E0C43C199C782809544721AA12A6DF0A/2229323.png",
                        "percent": 2
                    }
                ],
                "specialization": 34,
                "icon": "https://render.guildwars2.com/file/7DED6E45A3F8CEAF782FF0443D5CF90CAC73C5EF/1012575.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_38() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2032,
                "tier": 2,
                "order": 1,
                "name": "Refined Toxins",
                "description": "While you are above the health threshold, your strikes inflict poison. While your pet's health is above the health threshold, its strikes inflict poison.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 5
                    },
                    {
                        "text": "Health Threshold",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                        "percent": 75
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/559B0AF9FB5E1243D2649FAAE660CCB338AACC19/102840.png",
                        "duration": 6,
                        "status": "Poisoned",
                        "description": "Deals damage every second; decreases healing effectiveness by 33%; damage stacks intensity.",
                        "apply_count": 1
                    }
                ],
                "specialization": 33,
                "icon": "https://render.guildwars2.com/file/A5F5CE0A29969CC7074F0DF1EE6F74FEE4FBD676/1012658.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_39() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2033,
                "tier": 3,
                "order": 1,
                "name": "Lucid Singularity",
                "description": "<c=@abilitytype>Overloads</c> remove movement-impairing conditions and reduce the duration of incoming ones.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/397A613651BFCA2832B6469CE34735580A2C120E/102844.png",
                        "duration": 0,
                        "status": "Immobile",
                        "description": "Unable to move; stacks duration.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/070325E519C178D502A8160523766070D30C0C19/102838.png",
                        "duration": 0,
                        "status": "Crippled",
                        "description": "Movement speed decreased by 50%; stacks duration.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/28C4EC547A3516AF0242E826772DA43A5EAC3DF3/102839.png",
                        "duration": 0,
                        "status": "Chilled",
                        "description": "Movement speed decreased by 66%; skill cooldown increased by 66%; stacks duration.",
                        "apply_count": 1
                    },
                    {
                        "text": "Condition Duration Reduction",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                        "percent": 100
                    }
                ],
                "specialization": 48,
                "icon": "https://render.guildwars2.com/file/2E3AEA68A85501D1209EABD2E1603C0151ED9292/1029951.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_40() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2035,
                "tier": 3,
                "order": 1,
                "name": "Master of Fragmentation",
                "description": "Your <c=@abilitytype>Shatter</c> skills are improved.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/52619C5D4F9A61C8F37A0705AE36602F19E164C2/103732.png",
                        "duration": 0,
                        "status": "Mind Wrack",
                        "description": "25% Increased Critical-Hit Chance",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/B8E57C1F08727AF8C39066160B93D175B6A3B9BA/103731.png",
                        "duration": 0,
                        "status": "Cry of Frustration",
                        "description": "Cripples foes on hit.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/0BD64508BF40EFFF3299DFA3D1A63BF2F941A4C9/103769.png",
                        "duration": 0,
                        "status": "Diversion",
                        "description": "Strikes up to five targets within range.",
                        "apply_count": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/D0969802A76808ACD65A56A6D54F2A40E355F7C3/103284.png",
                        "duration": 0,
                        "status": "Distortion",
                        "description": "Reflects Projectiles",
                        "apply_count": 1
                    }
                ],
                "traited_facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/14090D7A6472AB06125662EB12E6EC51EDE2EEBB/2175059.png",
                        "duration": 0,
                        "status": "Split Second",
                        "description": "25% Increased Critical-Hit Chance",
                        "apply_count": 1,
                        "requires_trait": 2030,
                        "overrides": 0
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/F59775A05108441C09AC03C30CAD98CC049CCC28/2175058.png",
                        "duration": 0,
                        "status": "Rewinder",
                        "description": "Cripples foes on hit.",
                        "apply_count": 1,
                        "requires_trait": 2030,
                        "overrides": 1
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/3A0CF805A4359A10766D1DD04FF0E7D20A05BD17/2175060.png",
                        "duration": 0,
                        "status": "Time Sink",
                        "description": "Strikes up to five targets within range.",
                        "apply_count": 1,
                        "requires_trait": 2030,
                        "overrides": 2
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/9E7CE10D0E447973F2D9175CF16A103BD076D04B/1012882.png",
                        "duration": 0,
                        "status": "Continuum Shift",
                        "description": "Base duration increased by 1 second.",
                        "apply_count": 1,
                        "requires_trait": 2030
                    }
                ],
                "specialization": 24,
                "icon": "https://render.guildwars2.com/file/E625ADB94CF699763B23A7A82E255B55A44C1B16/1012517.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_41() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2036,
                "tier": 0,
                "order": 0,
                "name": "Warhorn Proficiency",
                "description": "You can wield the warhorn weapon.",
                "slot": "Minor",
                "specialization": 48,
                "icon": "https://render.guildwars2.com/file/D8DFDDA8C46B0CD0BDA0AE119B61D75103BE3D05/2010286.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_42() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2037,
                "tier": 2,
                "order": 0,
                "name": "Hunter's Determination",
                "description": "Gain aegis and cast Shards of Faith when disabled.<br><c=@reminder>Disables include stun, daze, knockback, pull, knockdown, sink, float, launch, taunt, and fear.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/DFB4D1B50AE4D6A275B349E15B179261EE3EB0AF/102854.png",
                        "duration": 8,
                        "status": "Aegis",
                        "description": "Block the next incoming attack; stacks duration.",
                        "apply_count": 1
                    }
                ],
                "skills": [
                    {
                        "name": "Shards of Faith",
                        "facts": [
                            {
                                "text": "Recharge",
                                "type": "Recharge",
                                "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                                "value": 60
                            },
                            {
                                "text": "StunBreak",
                                "type": "StunBreak",
                                "icon": "https://render.guildwars2.com/file/DCF0719729165FD8910E034CA4E0780F90582D15/156654.png",
                                "value": true
                            },
                            {
                                "text": "Damage",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "hit_count": 1,
                                "dmg_multiplier": 1.5
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/3D3A1C2D6D791C05179AB871902D28782C65C244/415959.png",
                                "duration": 5,
                                "status": "Stability",
                                "description": "Cannot be knocked down, pushed back, pulled, launched, stunned, dazed, floated, sunk, feared, or taunted.",
                                "apply_count": 3
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/070325E519C178D502A8160523766070D30C0C19/102838.png",
                                "duration": 6,
                                "status": "Crippled",
                                "description": "Movement speed decreased by 50%; stacks duration.",
                                "apply_count": 1
                            },
                            {
                                "text": "Apply Buff/Condition",
                                "type": "Buff",
                                "icon": "https://render.guildwars2.com/file/DFB4D1B50AE4D6A275B349E15B179261EE3EB0AF/102854.png",
                                "duration": 8,
                                "status": "Aegis",
                                "description": "Block the next incoming attack; stacks duration.",
                                "apply_count": 1
                            },
                            {
                                "text": "Number of Fragments",
                                "type": "Number",
                                "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                                "value": 3
                            },
                            {
                                "text": "Duration",
                                "type": "Time",
                                "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                                "duration": 10
                            },
                            {
                                "text": "Trigger Radius",
                                "type": "Distance",
                                "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                                "distance": 180
                            },
                            {
                                "text": "Attack Radius",
                                "type": "Distance",
                                "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                                "distance": 240
                            }
                        ],
                        "description": "Trap. Lay a trap that deals damage and unleashes multiple fragments into the area when triggered. Each fragment grants aegis to allies, as long as they don't already have aegis.",
                        "icon": "https://render.guildwars2.com/file/32106907940C3F0AB9E771C014BF59D4DE285241/1012877.png",
                        "flags": [],
                        "id": 31765,
                        "chat_link": "[&BhV8AAA=]",
                        "categories": [
                            "Trap"
                        ]
                    }
                ],
                "specialization": 27,
                "icon": "https://render.guildwars2.com/file/2F6996644F9FF470FE49B4FB1C04B4E0C4A07FF2/1012393.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_43() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2038,
                "tier": 3,
                "order": 1,
                "name": "King of Fires",
                "description": "Increase the duration of burning you apply. Gain fire aura when you critically hit an enemy. Berserker skills detonate fire aura, damaging and burning nearby foes.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Recharge",
                        "type": "Recharge",
                        "icon": "https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png",
                        "value": 15
                    },
                    {
                        "text": "Damage",
                        "type": "Damage",
                        "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                        "hit_count": 1,
                        "dmg_multiplier": 0.7
                    },
                    {
                        "text": "Duration Increase",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                        "percent": 33
                    },
                    {
                        "text": "Duration Increase",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                        "percent": 10
                    },
                    {
                        "text": "Radius",
                        "type": "Distance",
                        "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                        "distance": 240
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/B47BF5803FED2718D7474EAF9617629AD068EE10/102849.png",
                        "duration": 3,
                        "status": "Burning",
                        "description": "Deals damage every second; stacks intensity.",
                        "apply_count": 3
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/2E7050E44690AFE0A396FA0DAD526699392743F3/2261521.png",
                        "duration": 5,
                        "status": "Fire Aura",
                        "description": "Enveloped in a fiery shield that burns foes, grants might each time you are struck (1-second cooldown per attacker).",
                        "apply_count": 1
                    }
                ],
                "specialization": 18,
                "icon": "https://render.guildwars2.com/file/4ED712F8B5383CE8EF69682C0C587801A9F7674A/1058558.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_44() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2039,
                "tier": 1,
                "order": 1,
                "name": "Last Blaze",
                "description": "When you use a <c=@abilitytype>rage</c> skill, inflict burning on nearby enemies.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/B47BF5803FED2718D7474EAF9617629AD068EE10/102849.png",
                        "duration": 4,
                        "status": "Burning",
                        "description": "Deals damage every second; stacks intensity.",
                        "apply_count": 1
                    },
                    {
                        "text": "Burn Radius",
                        "type": "Distance",
                        "icon": "https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png",
                        "distance": 300
                    },
                    {
                        "text": "Number of Targets",
                        "type": "Number",
                        "icon": "https://render.guildwars2.com/file/BBE8191A494B0352259C10EADFDACCE177E6DA5B/1770208.png",
                        "value": 5
                    }
                ],
                "specialization": 18,
                "icon": "https://render.guildwars2.com/file/E2EF11B8156E452E4A79B56ACA914E751B1C7E4F/1058561.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_45() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2042,
                "tier": 2,
                "order": 1,
                "name": "Heat the Soul",
                "description": "Gain condition damage. Gain additional condition damage while wielding a torch. Torch skills gain reduced recharge.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Recharge Reduced",
                        "type": "Percent",
                        "icon": "https://render.guildwars2.com/file/AAB7C5387A08367C2F023F19FEE70E1556AD4375/1770202.png",
                        "percent": 20
                    },
                    {
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/0120CB042BFC2EA6A45BC3DB45155FECDDDE1910/2229318.png",
                        "value": 120,
                        "target": "ConditionDamage"
                    },
                    {
                        "text": "Condition Damage with Torch",
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/0120CB042BFC2EA6A45BC3DB45155FECDDDE1910/2229318.png",
                        "value": 120,
                        "target": "ConditionDamage"
                    }
                ],
                "specialization": 18,
                "icon": "https://render.guildwars2.com/file/0F46971324CD9B11C6C17425AC7C083ED7907455/1058560.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_46() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2043,
                "tier": 3,
                "order": 2,
                "name": "Eternal Champion",
                "description": "Gain toughness while in berserk mode. Gain stability and might when breaking stuns.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/2FA9DF9D6BC17839BBEA14723F1C53D645DDB5E1/102852.png",
                        "duration": 8,
                        "status": "Might",
                        "description": "Increased outgoing damage; stacks intensity.",
                        "apply_count": 3
                    },
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/3D3A1C2D6D791C05179AB871902D28782C65C244/415959.png",
                        "duration": 3,
                        "status": "Stability",
                        "description": "Cannot be knocked down, pushed back, pulled, launched, stunned, dazed, floated, sunk, feared, or taunted.",
                        "apply_count": 1
                    },
                    {
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/432C0F04F740C1377E6D5D56640B57083C031216/2229324.png",
                        "value": 300,
                        "target": "Toughness"
                    }
                ],
                "specialization": 18,
                "icon": "https://render.guildwars2.com/file/F375089AC9F1DB43B9FA783B133DECDF2935690D/1029975.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_47() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2046,
                "tier": 3,
                "order": 0,
                "name": "Fatal Frenzy",
                "description": "Berserk mode increases power and condition damage but reduces toughness.",
                "slot": "Minor",
                "facts": [
                    {
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/D6CAECEA0FD5FADE04DD6970384ADC5DE309C506/2229322.png",
                        "value": 300,
                        "target": "Power"
                    },
                    {
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/0120CB042BFC2EA6A45BC3DB45155FECDDDE1910/2229318.png",
                        "value": 300,
                        "target": "ConditionDamage"
                    },
                    {
                        "type": "AttributeAdjust",
                        "icon": "https://render.guildwars2.com/file/432C0F04F740C1377E6D5D56640B57083C031216/2229324.png",
                        "value": -300,
                        "target": "Toughness"
                    }
                ],
                "specialization": 18,
                "icon": "https://render.guildwars2.com/file/A6EDB2AE070A9F43B60067771C21B251F86A49EE/1029977.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_48() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2047,
                "tier": 3,
                "order": 2,
                "name": "Bounding Dodger",
                "description": "Your dodge ability is replaced by Bound, dealing damage to the area after you evade. Gain increased strike damage for a period of time after you dodge.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Apply Buff/Condition",
                        "type": "Buff",
                        "icon": "https://render.guildwars2.com/file/F3E22D0FDFDB436780BD4ACBA5D135EE40507FFD/1058554.png",
                        "duration": 4,
                        "status": "Bounding Dodger",
                        "description": "You deal bonus damage.",
                        "apply_count": 1
                    }
                ],
                "skills": [
                    {
                        "name": "Bound",
                        "facts": [
                            {
                                "text": "Damage",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "hit_count": 1,
                                "dmg_multiplier": 0.5
                            },
                            {
                                "text": "Damage",
                                "type": "Damage",
                                "icon": "https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png",
                                "hit_count": 1,
                                "dmg_multiplier": 1.75
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
                                "distance": 180
                            },
                            {
                                "text": "Distance Traveled",
                                "type": "Distance",
                                "icon": "https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png",
                                "distance": 300
                            },
                            {
                                "text": "Combo Finisher",
                                "type": "ComboFinisher",
                                "icon": "https://render.guildwars2.com/file/A513F3653D33FBA4220D2D307799F8A327A36A3B/156656.png",
                                "percent": 100,
                                "finisher_type": "Leap"
                            }
                        ],
                        "description": "Leap into an area, and deliver a massive blow to enemies.",
                        "icon": "https://render.guildwars2.com/file/F3E22D0FDFDB436780BD4ACBA5D135EE40507FFD/1058554.png",
                        "flags": [],
                        "id": 31129,
                        "chat_link": "[&Bpl5AAA=]"
                    }
                ],
                "specialization": 7,
                "icon": "https://render.guildwars2.com/file/F3E22D0FDFDB436780BD4ACBA5D135EE40507FFD/1058554.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_49() {
        json.decodeFromString<GW2v2Trait>(
            """
            {
                "id": 2049,
                "tier": 1,
                "order": 0,
                "name": "Smash Brawler",
                "description": "Increases berserk mode duration.",
                "slot": "Major",
                "facts": [
                    {
                        "text": "Duration Increase",
                        "type": "Time",
                        "icon": "https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png",
                        "duration": 5
                    }
                ],
                "specialization": 18,
                "icon": "https://render.guildwars2.com/file/780ACDAE6E6AE10E53470AF821FD246E380E65EB/1029973.png"
            }
            """.trimIndent()
        )
    }

}