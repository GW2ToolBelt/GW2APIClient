/*
 * Copyright (c) 2018-2025 Leon Linhart
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

class GW2v2ProfessionTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Profession>(
            """
            {
                "id": "Guardian",
                "name": "Wächter",
                "code": 1,
                "icon": "https://render.guildwars2.com/file/C32BE61FC55C962524624F643897ECF1A9C80462/156634.png",
                "icon_big": "https://render.guildwars2.com/file/6E0D0AC6E0CE5C0C29B3D736ABEA070F4A58540E/156633.png",
                "specializations": [
                    42,
                    16,
                    13,
                    49,
                    46,
                    27,
                    62
                ],
                "weapons": {
                    "Axe": {
                        "specialization": 62,
                        "flags": [
                            "Mainhand"
                        ],
                        "skills": [
                            {
                                "id": 45047,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 40624,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 45402,
                                "slot": "Weapon_3"
                            }
                        ]
                    },
                    "Focus": {
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 9112,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 9082,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Greatsword": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 9137,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 9081,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 9080,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 9146,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 9147,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Hammer": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 9159,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 9194,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 9260,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 9124,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 9195,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Spear": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 9189,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 9190,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 9191,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 9192,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 9193,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Longbow": {
                        "specialization": 27,
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 30471,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 30229,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 29630,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 29789,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 30628,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Mace": {
                        "flags": [
                            "Mainhand"
                        ],
                        "skills": [
                            {
                                "id": 9109,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 9111,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 9086,
                                "slot": "Weapon_3"
                            }
                        ]
                    },
                    "Scepter": {
                        "flags": [
                            "Mainhand"
                        ],
                        "skills": [
                            {
                                "id": 9098,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 9090,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 9099,
                                "slot": "Weapon_3"
                            }
                        ]
                    },
                    "Shield": {
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 15834,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 9087,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 9091,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Staff": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 9122,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 9140,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 9143,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 9265,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 9144,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Sword": {
                        "flags": [
                            "Mainhand"
                        ],
                        "skills": [
                            {
                                "id": 9105,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 9097,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 9107,
                                "slot": "Weapon_3"
                            }
                        ]
                    },
                    "Torch": {
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 9104,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 9088,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Trident": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 9205,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 9207,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 9208,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 9209,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 9206,
                                "slot": "Weapon_5"
                            }
                        ]
                    }
                },
                "flags": [],
                "skills": [
                    {
                        "id": 9115,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 9118,
                        "slot": "Profession_3",
                        "type": "Profession"
                    },
                    {
                        "id": 9120,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 9102,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 9158,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 9083,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 21664,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 9125,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9168,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9175,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9182,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9093,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9150,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9151,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9163,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9084,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9085,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9153,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9152,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9251,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9187,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9253,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9128,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9245,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9248,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9247,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 9246,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 29965,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 9154,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 30461,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 30025,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 29786,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30553,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30364,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30871,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30273,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 41714,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 40915,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 46148,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 44080,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 45460,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 43357,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 44364,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 41780,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 42259,
                        "slot": "Profession_3",
                        "type": "Profession"
                    },
                    {
                        "id": 42371,
                        "slot": "Profession_3",
                        "type": "Profession"
                    },
                    {
                        "id": 41380,
                        "slot": "Profession_1",
                        "type": "Profession"
                    }
                ],
                "training": [
                    {
                        "id": 26,
                        "category": "Skills",
                        "name": "Geisterwaffen-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 9168
                            },
                            {
                                "cost": 5,
                                "type": "Skill",
                                "skill_id": 9182
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 9175
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 9125
                            }
                        ]
                    },
                    {
                        "id": 74,
                        "category": "Skills",
                        "name": "Siegel-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 9158
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 9151
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 9150
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 9093
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 9163
                            },
                            {
                                "cost": 24,
                                "type": "Skill",
                                "skill_id": 30461
                            }
                        ]
                    },
                    {
                        "id": 97,
                        "category": "Skills",
                        "name": "Meditations-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 21664
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 9246
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 9245
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 9247
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 9248
                            },
                            {
                                "cost": 24,
                                "type": "Skill",
                                "skill_id": 9154
                            }
                        ]
                    },
                    {
                        "id": 92,
                        "category": "Skills",
                        "name": "Segnungs-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 9128
                            },
                            {
                                "cost": 5,
                                "type": "Skill",
                                "skill_id": 9187
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 9253
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 9251
                            }
                        ]
                    },
                    {
                        "id": 104,
                        "category": "Skills",
                        "name": "Kampfschrei-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 9083
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 9084
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 9085
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 9153
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 9152
                            },
                            {
                                "cost": 24,
                                "type": "Skill",
                                "skill_id": 29965
                            }
                        ]
                    },
                    {
                        "id": 103,
                        "category": "Specializations",
                        "name": "Eifer",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 648
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 563
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 634
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1925
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 646
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 628
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 653
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1556
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 649
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 635
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 637
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 2017
                            }
                        ]
                    },
                    {
                        "id": 100,
                        "category": "Specializations",
                        "name": "Ausstrahlung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 572
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 577
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 566
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 574
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 571
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 578
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 567
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 565
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 568
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1686
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 579
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1683
                            }
                        ]
                    },
                    {
                        "id": 24,
                        "category": "Specializations",
                        "name": "Tapferkeit",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 582
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 588
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 581
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 633
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 594
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 580
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 584
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1684
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 583
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 585
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 586
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 589
                            }
                        ]
                    },
                    {
                        "id": 45,
                        "category": "Specializations",
                        "name": "Ehre",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 564
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1899
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 559
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 654
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 551
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 557
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 549
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 562
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1685
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 553
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 558
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1682
                            }
                        ]
                    },
                    {
                        "id": 30,
                        "category": "Specializations",
                        "name": "Tugenden",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 621
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 624
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 625
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 617
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 604
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 603
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 610
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 587
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 620
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 622
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 554
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 612
                            }
                        ]
                    },
                    {
                        "id": 85,
                        "category": "EliteSpecializations",
                        "name": "Drachenjäger",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1826
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 1848
                            },
                            {
                                "cost": 55,
                                "type": "Skill",
                                "skill_id": 30025
                            },
                            {
                                "cost": 65,
                                "type": "Trait",
                                "trait_id": 1898
                            },
                            {
                                "cost": 75,
                                "type": "Trait",
                                "trait_id": 1983
                            },
                            {
                                "cost": 85,
                                "type": "Trait",
                                "trait_id": 1911
                            },
                            {
                                "cost": 95,
                                "type": "Trait",
                                "trait_id": 1896
                            },
                            {
                                "cost": 110,
                                "type": "Skill",
                                "skill_id": 29786
                            },
                            {
                                "cost": 125,
                                "type": "Skill",
                                "skill_id": 30553
                            },
                            {
                                "cost": 135,
                                "type": "Trait",
                                "trait_id": 2037
                            },
                            {
                                "cost": 145,
                                "type": "Trait",
                                "trait_id": 1835
                            },
                            {
                                "cost": 155,
                                "type": "Trait",
                                "trait_id": 1943
                            },
                            {
                                "cost": 165,
                                "type": "Trait",
                                "trait_id": 1926
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 30364
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 1908
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 1963
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 1955
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 30871
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 30273
                            }
                        ]
                    },
                    {
                        "id": 417,
                        "category": "EliteSpecializations",
                        "name": "Aufwiegler",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 2073
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 2089
                            },
                            {
                                "cost": 50,
                                "type": "Trait",
                                "trait_id": 2101
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 2062
                            },
                            {
                                "cost": 70,
                                "type": "Trait",
                                "trait_id": 2076
                            },
                            {
                                "cost": 80,
                                "type": "Trait",
                                "trait_id": 2148
                            },
                            {
                                "cost": 90,
                                "type": "Trait",
                                "trait_id": 2179
                            },
                            {
                                "cost": 105,
                                "type": "Skill",
                                "skill_id": 41714
                            },
                            {
                                "cost": 120,
                                "type": "Skill",
                                "skill_id": 46148
                            },
                            {
                                "cost": 130,
                                "type": "Trait",
                                "trait_id": 2075
                            },
                            {
                                "cost": 140,
                                "type": "Trait",
                                "trait_id": 2063
                            },
                            {
                                "cost": 150,
                                "type": "Trait",
                                "trait_id": 2105
                            },
                            {
                                "cost": 165,
                                "type": "Skill",
                                "skill_id": 44080
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 45460
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 2086
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 2116
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 2159
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 40915
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 43357
                            }
                        ]
                    }
                ],
                "skills_by_palette": [
                    [
                        1,
                        12343
                    ],
                    [
                        2,
                        12417
                    ],
                    [
                        3,
                        12371
                    ],
                    [
                        4,
                        12337
                    ],
                    [
                        5,
                        45402
                    ],
                    [
                        7,
                        12373
                    ],
                    [
                        8,
                        12338
                    ],
                    [
                        9,
                        12318
                    ],
                    [
                        11,
                        12319
                    ],
                    [
                        12,
                        12320
                    ],
                    [
                        13,
                        12387
                    ],
                    [
                        14,
                        12323
                    ],
                    [
                        16,
                        12389
                    ],
                    [
                        17,
                        12325
                    ],
                    [
                        20,
                        12391
                    ],
                    [
                        21,
                        12440
                    ],
                    [
                        22,
                        12399
                    ],
                    [
                        23,
                        12447
                    ],
                    [
                        25,
                        12450
                    ],
                    [
                        28,
                        12453
                    ],
                    [
                        29,
                        12401
                    ],
                    [
                        30,
                        12456
                    ],
                    [
                        31,
                        12403
                    ],
                    [
                        32,
                        5939
                    ],
                    [
                        33,
                        12339
                    ],
                    [
                        34,
                        12340
                    ],
                    [
                        35,
                        30628
                    ],
                    [
                        36,
                        12407
                    ],
                    [
                        37,
                        12457
                    ],
                    [
                        49,
                        9082
                    ],
                    [
                        50,
                        9147
                    ],
                    [
                        51,
                        9195
                    ],
                    [
                        53,
                        9086
                    ],
                    [
                        86,
                        9099
                    ],
                    [
                        87,
                        9091
                    ],
                    [
                        89,
                        9144
                    ],
                    [
                        90,
                        9107
                    ],
                    [
                        102,
                        9088
                    ],
                    [
                        111,
                        37873
                    ],
                    [
                        122,
                        5531
                    ],
                    [
                        124,
                        12380
                    ],
                    [
                        127,
                        9083
                    ],
                    [
                        138,
                        9085
                    ],
                    [
                        140,
                        35304
                    ],
                    [
                        152,
                        12385
                    ],
                    [
                        201,
                        5719
                    ],
                    [
                        210,
                        12360
                    ],
                    [
                        251,
                        10586
                    ],
                    [
                        253,
                        9118
                    ],
                    [
                        254,
                        9093
                    ],
                    [
                        255,
                        9251
                    ],
                    [
                        256,
                        9125
                    ],
                    [
                        258,
                        9206
                    ],
                    [
                        259,
                        9102
                    ],
                    [
                        260,
                        9248
                    ],
                    [
                        262,
                        5721
                    ],
                    [
                        265,
                        9193
                    ],
                    [
                        272,
                        15863
                    ],
                    [
                        278,
                        9128
                    ],
                    [
                        287,
                        5603
                    ],
                    [
                        301,
                        9084
                    ],
                    [
                        305,
                        9151
                    ],
                    [
                        306,
                        9163
                    ],
                    [
                        309,
                        9152
                    ],
                    [
                        310,
                        9153
                    ],
                    [
                        311,
                        9154
                    ],
                    [
                        312,
                        9158
                    ],
                    [
                        321,
                        5623
                    ],
                    [
                        323,
                        5732
                    ],
                    [
                        324,
                        12361
                    ],
                    [
                        326,
                        9150
                    ],
                    [
                        327,
                        9247
                    ],
                    [
                        328,
                        9168
                    ],
                    [
                        329,
                        9175
                    ],
                    [
                        330,
                        9182
                    ],
                    [
                        331,
                        9253
                    ],
                    [
                        332,
                        9187
                    ],
                    [
                        337,
                        12362
                    ],
                    [
                        338,
                        12363
                    ],
                    [
                        349,
                        12367
                    ],
                    [
                        369,
                        12324
                    ],
                    [
                        376,
                        9245
                    ],
                    [
                        377,
                        10632
                    ],
                    [
                        379,
                        14490
                    ],
                    [
                        402,
                        6159
                    ],
                    [
                        441,
                        9246
                    ],
                    [
                        456,
                        12344
                    ],
                    [
                        457,
                        12346
                    ],
                    [
                        458,
                        10800
                    ],
                    [
                        468,
                        10375
                    ],
                    [
                        554,
                        1110
                    ],
                    [
                        555,
                        1162
                    ],
                    [
                        559,
                        1118
                    ],
                    [
                        563,
                        1123
                    ],
                    [
                        564,
                        1125
                    ],
                    [
                        568,
                        1129
                    ],
                    [
                        570,
                        1131
                    ],
                    [
                        579,
                        1139
                    ],
                    [
                        580,
                        1141
                    ],
                    [
                        583,
                        1148
                    ],
                    [
                        603,
                        1115
                    ],
                    [
                        2876,
                        12656
                    ],
                    [
                        2877,
                        12658
                    ],
                    [
                        2881,
                        12691
                    ],
                    [
                        2882,
                        12689
                    ],
                    [
                        2883,
                        12685
                    ],
                    [
                        2884,
                        12690
                    ],
                    [
                        2887,
                        12695
                    ],
                    [
                        2888,
                        12703
                    ],
                    [
                        2889,
                        12679
                    ],
                    [
                        2890,
                        12674
                    ],
                    [
                        2891,
                        12680
                    ],
                    [
                        2892,
                        12681
                    ],
                    [
                        2894,
                        12757
                    ],
                    [
                        2895,
                        12664
                    ],
                    [
                        2896,
                        12697
                    ],
                    [
                        2897,
                        12699
                    ],
                    [
                        2898,
                        12700
                    ],
                    [
                        2899,
                        12709
                    ],
                    [
                        2900,
                        12708
                    ],
                    [
                        2902,
                        12711
                    ],
                    [
                        2903,
                        12712
                    ],
                    [
                        2904,
                        12713
                    ],
                    [
                        2905,
                        12714
                    ],
                    [
                        2906,
                        12715
                    ],
                    [
                        2907,
                        12716
                    ],
                    [
                        2908,
                        12717
                    ],
                    [
                        2909,
                        12718
                    ],
                    [
                        2910,
                        12721
                    ],
                    [
                        2911,
                        12722
                    ],
                    [
                        2912,
                        12723
                    ],
                    [
                        2913,
                        12730
                    ],
                    [
                        2914,
                        12731
                    ],
                    [
                        2915,
                        12729
                    ],
                    [
                        2917,
                        12754
                    ],
                    [
                        2918,
                        12755
                    ],
                    [
                        2919,
                        12756
                    ],
                    [
                        2920,
                        12732
                    ],
                    [
                        2923,
                        12744
                    ],
                    [
                        2926,
                        12748
                    ],
                    [
                        2927,
                        12749
                    ],
                    [
                        2966,
                        10586
                    ],
                    [
                        3310,
                        16427
                    ],
                    [
                        3822,
                        20975
                    ],
                    [
                        3878,
                        21664
                    ],
                    [
                        4721,
                        30461
                    ],
                    [
                        4740,
                        30553
                    ],
                    [
                        4745,
                        29965
                    ],
                    [
                        4746,
                        30364
                    ],
                    [
                        4789,
                        30273
                    ],
                    [
                        4796,
                        30025
                    ],
                    [
                        4827,
                        30032
                    ],
                    [
                        4858,
                        30871
                    ],
                    [
                        4862,
                        29786
                    ],
                    [
                        4919,
                        31451
                    ],
                    [
                        4922,
                        31568
                    ],
                    [
                        4928,
                        31639
                    ],
                    [
                        4940,
                        31459
                    ],
                    [
                        4944,
                        31367
                    ],
                    [
                        4963,
                        31438
                    ],
                    [
                        5656,
                        43357
                    ],
                    [
                        5665,
                        44980
                    ],
                    [
                        5699,
                        43636
                    ],
                    [
                        5754,
                        40915
                    ],
                    [
                        5824,
                        42963
                    ],
                    [
                        5827,
                        44080
                    ],
                    [
                        5859,
                        42180
                    ],
                    [
                        5909,
                        46148
                    ],
                    [
                        5942,
                        41156
                    ],
                    [
                        5963,
                        41714
                    ],
                    [
                        5971,
                        45460
                    ]
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Profession>(
            """
            {
                "id": "Warrior",
                "name": "Krieger",
                "code": 2,
                "icon": "https://render.guildwars2.com/file/0A97E13F29B3597A447EEC04A09BE5BD699A2250/156643.png",
                "icon_big": "https://render.guildwars2.com/file/0A76324239946B79C061762095FAB2BDF7A1D8D7/156642.png",
                "specializations": [
                    4,
                    36,
                    22,
                    11,
                    51,
                    18,
                    61
                ],
                "weapons": {
                    "Axe": {
                        "flags": [
                            "Mainhand",
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 14369,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 14421,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 14398,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 14418,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 14399,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Dagger": {
                        "specialization": 61,
                        "flags": [
                            "Mainhand",
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 42745,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 46233,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 44937,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 44004,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 45160,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Greatsword": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 14356,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 14554,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 14447,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 14510,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 14446,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Hammer": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 14358,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 14386,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 14482,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 14359,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 14511,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Spear": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 14437,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 14440,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 14448,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 14441,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 14480,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Longbow": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 14431,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 14519,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 14381,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 14505,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 14504,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Mace": {
                        "flags": [
                            "Mainhand",
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 14376,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 14507,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 14503,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 14518,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 14415,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Rifle": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 14432,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 14416,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 14472,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 14395,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 14360,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Shield": {
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 14361,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 14362,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Speargun": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 14552,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 14466,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 14481,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 14467,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 14465,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Sword": {
                        "flags": [
                            "Mainhand",
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 14364,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 14366,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 14497,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 14498,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 14400,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Torch": {
                        "specialization": 18,
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 29845,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 29940,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Warhorn": {
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 14393,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 14394,
                                "slot": "Weapon_5"
                            }
                        ]
                    }
                },
                "flags": [],
                "skills": [
                    {
                        "id": 14443,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 14544,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 14375,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 14367,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 14353,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 14414,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 14506,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 14396,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 14387,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 14402,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 14401,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 14389,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 21815,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 14502,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14354,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14516,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14388,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14404,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14410,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14479,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14413,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14403,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14372,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14575,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14409,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14528,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14405,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14407,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14408,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14406,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14392,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14412,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14368,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 14419,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 14355,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 14483,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 30435,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 30185,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 29644,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 29679,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 30989,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 29852,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 29923,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 31048,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 30682,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 30851,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 30879,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 30343,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 29941,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30074,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 29613,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30258,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30189,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 41100,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 45333,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 45380,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 43745,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 41919,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 43123,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 45252,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 39972,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 46044,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 41283,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 41543,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 43488,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 44397,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 43566,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 42707,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 40601,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 42803,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 41110,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 42041,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 42494,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 41746,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 41330,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 44165,
                        "slot": "Profession_2",
                        "type": "Profession"
                    }
                ],
                "training": [
                    {
                        "id": 72,
                        "category": "Skills",
                        "name": "Physische Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 14502
                            },
                            {
                                "cost": 5,
                                "type": "Skill",
                                "skill_id": 14354
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 14516
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 14388
                            },
                            {
                                "cost": 22,
                                "type": "Skill",
                                "skill_id": 14483
                            }
                        ]
                    },
                    {
                        "id": 76,
                        "category": "Skills",
                        "name": "Siegel-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 14389
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 14404
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 14410
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 14479
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 14413
                            },
                            {
                                "cost": 24,
                                "type": "Skill",
                                "skill_id": 14355
                            }
                        ]
                    },
                    {
                        "id": 50,
                        "category": "Skills",
                        "name": "Haltungs-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 21815
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 14368
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 14412
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 14392
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 14406
                            }
                        ]
                    },
                    {
                        "id": 64,
                        "category": "Skills",
                        "name": "Kampfschrei-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 14402
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 14403
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 14575
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 14372
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 14409
                            }
                        ]
                    },
                    {
                        "id": 117,
                        "category": "Skills",
                        "name": "Banner-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 14405
                            },
                            {
                                "cost": 5,
                                "type": "Skill",
                                "skill_id": 14528
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 14408
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 14407
                            },
                            {
                                "cost": 22,
                                "type": "Skill",
                                "skill_id": 14419
                            }
                        ]
                    },
                    {
                        "id": 27,
                        "category": "Specializations",
                        "name": "Stärke",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1446
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1447
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1451
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1444
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1448
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 2000
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1338
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1449
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1453
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1437
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1454
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1440
                            }
                        ]
                    },
                    {
                        "id": 87,
                        "category": "Specializations",
                        "name": "Waffen",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1342
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1455
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1344
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1334
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1343
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1315
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1316
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1333
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1337
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1336
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1346
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1707
                            }
                        ]
                    },
                    {
                        "id": 109,
                        "category": "Specializations",
                        "name": "Verteidigung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1350
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1376
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1488
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1372
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1348
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1368
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1379
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1367
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1380
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1375
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1649
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1708
                            }
                        ]
                    },
                    {
                        "id": 55,
                        "category": "Specializations",
                        "name": "Taktik",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1480
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1469
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1474
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1471
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1485
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1486
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1479
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1482
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1481
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1667
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1470
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1711
                            }
                        ]
                    },
                    {
                        "id": 63,
                        "category": "Specializations",
                        "name": "Disziplin",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1415
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1329
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1413
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1381
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1416
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1484
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1489
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1709
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1417
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1369
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1317
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1657
                            }
                        ]
                    },
                    {
                        "id": 62,
                        "category": "EliteSpecializations",
                        "name": "Berserker",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1829
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 1831
                            },
                            {
                                "cost": 55,
                                "type": "Skill",
                                "skill_id": 30189
                            },
                            {
                                "cost": 65,
                                "type": "Trait",
                                "trait_id": 2049
                            },
                            {
                                "cost": 75,
                                "type": "Trait",
                                "trait_id": 2039
                            },
                            {
                                "cost": 85,
                                "type": "Trait",
                                "trait_id": 1977
                            },
                            {
                                "cost": 95,
                                "type": "Trait",
                                "trait_id": 1993
                            },
                            {
                                "cost": 110,
                                "type": "Skill",
                                "skill_id": 29613
                            },
                            {
                                "cost": 125,
                                "type": "Skill",
                                "skill_id": 30258
                            },
                            {
                                "cost": 135,
                                "type": "Trait",
                                "trait_id": 2011
                            },
                            {
                                "cost": 145,
                                "type": "Trait",
                                "trait_id": 2042
                            },
                            {
                                "cost": 155,
                                "type": "Trait",
                                "trait_id": 2002
                            },
                            {
                                "cost": 165,
                                "type": "Trait",
                                "trait_id": 2046
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 30074
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 1928
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 2038
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 2043
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 29941
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 30343
                            }
                        ]
                    },
                    {
                        "id": 415,
                        "category": "EliteSpecializations",
                        "name": "Bannbrecher",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 2124
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 2175
                            },
                            {
                                "cost": 50,
                                "type": "Trait",
                                "trait_id": 2153
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 2162
                            },
                            {
                                "cost": 70,
                                "type": "Trait",
                                "trait_id": 2097
                            },
                            {
                                "cost": 80,
                                "type": "Trait",
                                "trait_id": 2130
                            },
                            {
                                "cost": 90,
                                "type": "Trait",
                                "trait_id": 2168
                            },
                            {
                                "cost": 105,
                                "type": "Skill",
                                "skill_id": 41100
                            },
                            {
                                "cost": 120,
                                "type": "Skill",
                                "skill_id": 45380
                            },
                            {
                                "cost": 130,
                                "type": "Trait",
                                "trait_id": 2107
                            },
                            {
                                "cost": 140,
                                "type": "Trait",
                                "trait_id": 2126
                            },
                            {
                                "cost": 150,
                                "type": "Trait",
                                "trait_id": 2163
                            },
                            {
                                "cost": 165,
                                "type": "Skill",
                                "skill_id": 43745
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 41919
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 2140
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 2095
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 2060
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 43123
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 45333
                            }
                        ]
                    }
                ],
                "skills_by_palette": [
                    [
                        1,
                        12343
                    ],
                    [
                        2,
                        12417
                    ],
                    [
                        3,
                        12371
                    ],
                    [
                        4,
                        12337
                    ],
                    [
                        5,
                        14399
                    ],
                    [
                        7,
                        12373
                    ],
                    [
                        8,
                        12338
                    ],
                    [
                        9,
                        12318
                    ],
                    [
                        10,
                        14354
                    ],
                    [
                        11,
                        12319
                    ],
                    [
                        12,
                        12320
                    ],
                    [
                        13,
                        12387
                    ],
                    [
                        14,
                        12323
                    ],
                    [
                        16,
                        12389
                    ],
                    [
                        17,
                        12325
                    ],
                    [
                        20,
                        12391
                    ],
                    [
                        21,
                        12440
                    ],
                    [
                        22,
                        12399
                    ],
                    [
                        23,
                        12447
                    ],
                    [
                        25,
                        12450
                    ],
                    [
                        28,
                        12453
                    ],
                    [
                        29,
                        12401
                    ],
                    [
                        30,
                        12456
                    ],
                    [
                        31,
                        12403
                    ],
                    [
                        32,
                        5939
                    ],
                    [
                        33,
                        12339
                    ],
                    [
                        34,
                        12340
                    ],
                    [
                        35,
                        14504
                    ],
                    [
                        36,
                        12407
                    ],
                    [
                        37,
                        12457
                    ],
                    [
                        47,
                        45160
                    ],
                    [
                        50,
                        14446
                    ],
                    [
                        51,
                        14511
                    ],
                    [
                        53,
                        14415
                    ],
                    [
                        85,
                        14360
                    ],
                    [
                        87,
                        14362
                    ],
                    [
                        90,
                        14400
                    ],
                    [
                        102,
                        29940
                    ],
                    [
                        103,
                        14394
                    ],
                    [
                        105,
                        14368
                    ],
                    [
                        106,
                        14372
                    ],
                    [
                        110,
                        14388
                    ],
                    [
                        111,
                        37873
                    ],
                    [
                        112,
                        14389
                    ],
                    [
                        113,
                        14392
                    ],
                    [
                        122,
                        5531
                    ],
                    [
                        124,
                        12380
                    ],
                    [
                        140,
                        35304
                    ],
                    [
                        152,
                        12385
                    ],
                    [
                        156,
                        14355
                    ],
                    [
                        166,
                        14402
                    ],
                    [
                        167,
                        14401
                    ],
                    [
                        168,
                        14403
                    ],
                    [
                        169,
                        14404
                    ],
                    [
                        170,
                        14405
                    ],
                    [
                        171,
                        14406
                    ],
                    [
                        172,
                        14407
                    ],
                    [
                        173,
                        14516
                    ],
                    [
                        174,
                        14409
                    ],
                    [
                        175,
                        14410
                    ],
                    [
                        176,
                        14408
                    ],
                    [
                        178,
                        14412
                    ],
                    [
                        179,
                        14413
                    ],
                    [
                        201,
                        5719
                    ],
                    [
                        210,
                        12360
                    ],
                    [
                        238,
                        14419
                    ],
                    [
                        240,
                        14544
                    ],
                    [
                        251,
                        10586
                    ],
                    [
                        262,
                        5721
                    ],
                    [
                        265,
                        14480
                    ],
                    [
                        272,
                        15863
                    ],
                    [
                        287,
                        5603
                    ],
                    [
                        293,
                        14465
                    ],
                    [
                        317,
                        14479
                    ],
                    [
                        321,
                        5623
                    ],
                    [
                        323,
                        5732
                    ],
                    [
                        324,
                        12361
                    ],
                    [
                        337,
                        12362
                    ],
                    [
                        338,
                        12363
                    ],
                    [
                        349,
                        12367
                    ],
                    [
                        369,
                        12324
                    ],
                    [
                        377,
                        10632
                    ],
                    [
                        379,
                        14490
                    ],
                    [
                        380,
                        14483
                    ],
                    [
                        402,
                        6159
                    ],
                    [
                        418,
                        14502
                    ],
                    [
                        429,
                        14528
                    ],
                    [
                        456,
                        12344
                    ],
                    [
                        457,
                        12346
                    ],
                    [
                        458,
                        10800
                    ],
                    [
                        468,
                        10375
                    ],
                    [
                        482,
                        14575
                    ],
                    [
                        554,
                        1110
                    ],
                    [
                        555,
                        1162
                    ],
                    [
                        559,
                        1118
                    ],
                    [
                        563,
                        1123
                    ],
                    [
                        564,
                        1125
                    ],
                    [
                        568,
                        1129
                    ],
                    [
                        570,
                        1131
                    ],
                    [
                        579,
                        1139
                    ],
                    [
                        580,
                        1141
                    ],
                    [
                        583,
                        1148
                    ],
                    [
                        603,
                        1115
                    ],
                    [
                        2876,
                        12656
                    ],
                    [
                        2877,
                        12658
                    ],
                    [
                        2881,
                        12691
                    ],
                    [
                        2882,
                        12689
                    ],
                    [
                        2883,
                        12685
                    ],
                    [
                        2884,
                        12690
                    ],
                    [
                        2887,
                        12695
                    ],
                    [
                        2888,
                        12703
                    ],
                    [
                        2889,
                        12679
                    ],
                    [
                        2890,
                        12674
                    ],
                    [
                        2891,
                        12680
                    ],
                    [
                        2892,
                        12681
                    ],
                    [
                        2894,
                        12757
                    ],
                    [
                        2895,
                        12664
                    ],
                    [
                        2896,
                        12697
                    ],
                    [
                        2897,
                        12699
                    ],
                    [
                        2898,
                        12700
                    ],
                    [
                        2899,
                        12709
                    ],
                    [
                        2900,
                        12708
                    ],
                    [
                        2902,
                        12711
                    ],
                    [
                        2903,
                        12712
                    ],
                    [
                        2904,
                        12713
                    ],
                    [
                        2905,
                        12714
                    ],
                    [
                        2906,
                        12715
                    ],
                    [
                        2907,
                        12716
                    ],
                    [
                        2908,
                        12717
                    ],
                    [
                        2909,
                        12718
                    ],
                    [
                        2910,
                        12721
                    ],
                    [
                        2911,
                        12722
                    ],
                    [
                        2912,
                        12723
                    ],
                    [
                        2913,
                        12730
                    ],
                    [
                        2914,
                        12731
                    ],
                    [
                        2915,
                        12729
                    ],
                    [
                        2917,
                        12754
                    ],
                    [
                        2918,
                        12755
                    ],
                    [
                        2919,
                        12756
                    ],
                    [
                        2920,
                        12732
                    ],
                    [
                        2923,
                        12744
                    ],
                    [
                        2926,
                        12748
                    ],
                    [
                        2927,
                        12749
                    ],
                    [
                        2966,
                        10586
                    ],
                    [
                        3310,
                        16427
                    ],
                    [
                        3822,
                        20975
                    ],
                    [
                        3881,
                        21815
                    ],
                    [
                        4769,
                        29613
                    ],
                    [
                        4802,
                        30343
                    ],
                    [
                        4804,
                        29941
                    ],
                    [
                        4823,
                        30258
                    ],
                    [
                        4827,
                        30032
                    ],
                    [
                        4828,
                        30074
                    ],
                    [
                        4850,
                        30189
                    ],
                    [
                        4919,
                        31451
                    ],
                    [
                        4922,
                        31568
                    ],
                    [
                        4928,
                        31639
                    ],
                    [
                        4940,
                        31459
                    ],
                    [
                        4944,
                        31367
                    ],
                    [
                        4963,
                        31438
                    ],
                    [
                        5665,
                        44980
                    ],
                    [
                        5671,
                        43123
                    ],
                    [
                        5699,
                        43636
                    ],
                    [
                        5738,
                        41919
                    ],
                    [
                        5750,
                        43745
                    ],
                    [
                        5789,
                        45333
                    ],
                    [
                        5824,
                        42963
                    ],
                    [
                        5859,
                        42180
                    ],
                    [
                        5904,
                        45380
                    ],
                    [
                        5942,
                        41156
                    ],
                    [
                        5959,
                        41100
                    ]
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Profession>(
            """
            {
                "id": "Engineer",
                "name": "Ingenieur",
                "code": 3,
                "icon": "https://render.guildwars2.com/file/5CCB361F44CCC7256132405D31E3A24DACCF440A/156632.png",
                "icon_big": "https://render.guildwars2.com/file/A94D00911BD47CDE39A104F90C7D07DE623554ED/156631.png",
                "specializations": [
                    6,
                    38,
                    47,
                    29,
                    21,
                    43,
                    57
                ],
                "weapons": {
                    "Hammer": {
                        "specialization": 43,
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 30501,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 30088,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 30665,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 29840,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 30713,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Pistol": {
                        "flags": [
                            "Mainhand",
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 5827,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 5828,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 5829,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 5831,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 5830,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Rifle": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 6003,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 6004,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 6153,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 6154,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 6005,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Shield": {
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 6053,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 6054,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Speargun": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 6148,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 6147,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 50380,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 6149,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 6145,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Sword": {
                        "specialization": 57,
                        "flags": [
                            "Mainhand"
                        ],
                        "skills": [
                            {
                                "id": 43476,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 44110,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 40160,
                                "slot": "Weapon_3"
                            }
                        ]
                    }
                },
                "flags": [
                    "NoWeaponSwap"
                ],
                "skills": [
                    {
                        "id": 5834,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 5802,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 21659,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 5857,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 5818,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5836,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5837,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5838,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5912,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5821,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5862,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5861,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5860,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5968,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5805,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5812,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5927,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5933,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5904,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 6161,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5865,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5910,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5811,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5825,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5868,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 5832,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 30800,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 30357,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 30101,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 29739,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 31248,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 29921,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30815,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 56920,
                        "slot": "Profession_5",
                        "type": "Profession"
                    },
                    {
                        "id": 40507,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 42009,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 43739,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 42842,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 44646,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 41218,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 42938,
                        "slot": "Profession_5",
                        "type": "Profession"
                    }
                ],
                "training": [
                    {
                        "id": 21,
                        "category": "Skills",
                        "name": "Elixier-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 5821
                            },
                            {
                                "cost": 5,
                                "type": "Skill",
                                "skill_id": 5860
                            },
                            {
                                "cost": 8,
                                "type": "Skill",
                                "skill_id": 5968
                            },
                            {
                                "cost": 12,
                                "type": "Skill",
                                "skill_id": 5861
                            },
                            {
                                "cost": 17,
                                "type": "Skill",
                                "skill_id": 5862
                            },
                            {
                                "cost": 25,
                                "type": "Skill",
                                "skill_id": 5832
                            }
                        ]
                    },
                    {
                        "id": 95,
                        "category": "Skills",
                        "name": "Geschützturm-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 5857
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 5818
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 5836
                            },
                            {
                                "cost": 10,
                                "type": "Skill",
                                "skill_id": 5838
                            },
                            {
                                "cost": 14,
                                "type": "Skill",
                                "skill_id": 5837
                            },
                            {
                                "cost": 19,
                                "type": "Skill",
                                "skill_id": 5912
                            },
                            {
                                "cost": 27,
                                "type": "Skill",
                                "skill_id": 5868
                            }
                        ]
                    },
                    {
                        "id": 71,
                        "category": "Skills",
                        "name": "Kit-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 5802
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 5927
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 5805
                            },
                            {
                                "cost": 10,
                                "type": "Skill",
                                "skill_id": 5933
                            },
                            {
                                "cost": 14,
                                "type": "Skill",
                                "skill_id": 5904
                            },
                            {
                                "cost": 19,
                                "type": "Skill",
                                "skill_id": 5812
                            },
                            {
                                "cost": 27,
                                "type": "Skill",
                                "skill_id": 30800
                            }
                        ]
                    },
                    {
                        "id": 75,
                        "category": "Skills",
                        "name": "Gadget-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 21659
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 5910
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 5865
                            },
                            {
                                "cost": 10,
                                "type": "Skill",
                                "skill_id": 6161
                            },
                            {
                                "cost": 14,
                                "type": "Skill",
                                "skill_id": 5811
                            },
                            {
                                "cost": 19,
                                "type": "Skill",
                                "skill_id": 5825
                            }
                        ]
                    },
                    {
                        "id": 61,
                        "category": "Specializations",
                        "name": "Sprengstoff",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 432
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 514
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 525
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1882
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 517
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 482
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1892
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1944
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 429
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1541
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 505
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1947
                            }
                        ]
                    },
                    {
                        "id": 66,
                        "category": "Specializations",
                        "name": "Schusswaffen",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 515
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1878
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1930
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1914
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 536
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1984
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 2006
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1923
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 516
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 510
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 526
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 433
                            }
                        ]
                    },
                    {
                        "id": 94,
                        "category": "Specializations",
                        "name": "Alchemie",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 468
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 396
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 509
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 521
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 487
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 520
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 469
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 470
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 413
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 473
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1871
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1854
                            }
                        ]
                    },
                    {
                        "id": 51,
                        "category": "Specializations",
                        "name": "Erfindungen",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 518
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 394
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1901
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 507
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 508
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1678
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1834
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 445
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 519
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 472
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1680
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1916
                            }
                        ]
                    },
                    {
                        "id": 32,
                        "category": "Specializations",
                        "name": "Werkzeuge",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1979
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 532
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1997
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 531
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1872
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 512
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1946
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1832
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1936
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1856
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 523
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1679
                            }
                        ]
                    },
                    {
                        "id": 113,
                        "category": "EliteSpecializations",
                        "name": "Schrotter",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1951
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 1959
                            },
                            {
                                "cost": 55,
                                "type": "Skill",
                                "skill_id": 30357
                            },
                            {
                                "cost": 65,
                                "type": "Trait",
                                "trait_id": 1917
                            },
                            {
                                "cost": 75,
                                "type": "Trait",
                                "trait_id": 1971
                            },
                            {
                                "cost": 85,
                                "type": "Trait",
                                "trait_id": 1867
                            },
                            {
                                "cost": 95,
                                "type": "Trait",
                                "trait_id": 2014
                            },
                            {
                                "cost": 110,
                                "type": "Skill",
                                "skill_id": 31248
                            },
                            {
                                "cost": 125,
                                "type": "Skill",
                                "skill_id": 29739
                            },
                            {
                                "cost": 135,
                                "type": "Trait",
                                "trait_id": 1954
                            },
                            {
                                "cost": 145,
                                "type": "Trait",
                                "trait_id": 1999
                            },
                            {
                                "cost": 155,
                                "type": "Trait",
                                "trait_id": 1860
                            },
                            {
                                "cost": 165,
                                "type": "Trait",
                                "trait_id": 1877
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 29921
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 1981
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 2052
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 1849
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 30101
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 30815
                            }
                        ]
                    },
                    {
                        "id": 409,
                        "category": "EliteSpecializations",
                        "name": "Holoschmied",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 2125
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 2158
                            },
                            {
                                "cost": 50,
                                "type": "Trait",
                                "trait_id": 2157
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 2135
                            },
                            {
                                "cost": 70,
                                "type": "Trait",
                                "trait_id": 2152
                            },
                            {
                                "cost": 80,
                                "type": "Trait",
                                "trait_id": 2122
                            },
                            {
                                "cost": 90,
                                "type": "Trait",
                                "trait_id": 2137
                            },
                            {
                                "cost": 105,
                                "type": "Skill",
                                "skill_id": 40507
                            },
                            {
                                "cost": 120,
                                "type": "Skill",
                                "skill_id": 43739
                            },
                            {
                                "cost": 130,
                                "type": "Trait",
                                "trait_id": 2114
                            },
                            {
                                "cost": 140,
                                "type": "Trait",
                                "trait_id": 2103
                            },
                            {
                                "cost": 150,
                                "type": "Trait",
                                "trait_id": 2066
                            },
                            {
                                "cost": 165,
                                "type": "Skill",
                                "skill_id": 42842
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 44646
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 2106
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 2091
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 2064
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 41218
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 42009
                            }
                        ]
                    }
                ],
                "skills_by_palette": [
                    [
                        1,
                        12343
                    ],
                    [
                        2,
                        12417
                    ],
                    [
                        3,
                        12371
                    ],
                    [
                        4,
                        12337
                    ],
                    [
                        7,
                        12373
                    ],
                    [
                        8,
                        12338
                    ],
                    [
                        9,
                        12318
                    ],
                    [
                        11,
                        12319
                    ],
                    [
                        12,
                        12320
                    ],
                    [
                        13,
                        12387
                    ],
                    [
                        14,
                        12323
                    ],
                    [
                        16,
                        12389
                    ],
                    [
                        17,
                        12325
                    ],
                    [
                        20,
                        12391
                    ],
                    [
                        21,
                        12440
                    ],
                    [
                        22,
                        12399
                    ],
                    [
                        23,
                        12447
                    ],
                    [
                        25,
                        12450
                    ],
                    [
                        28,
                        12453
                    ],
                    [
                        29,
                        12401
                    ],
                    [
                        30,
                        12456
                    ],
                    [
                        31,
                        12403
                    ],
                    [
                        32,
                        5939
                    ],
                    [
                        33,
                        12339
                    ],
                    [
                        34,
                        12340
                    ],
                    [
                        36,
                        12407
                    ],
                    [
                        37,
                        12457
                    ],
                    [
                        51,
                        30713
                    ],
                    [
                        54,
                        5830
                    ],
                    [
                        85,
                        6005
                    ],
                    [
                        87,
                        6054
                    ],
                    [
                        90,
                        40160
                    ],
                    [
                        111,
                        37873
                    ],
                    [
                        122,
                        5531
                    ],
                    [
                        124,
                        12380
                    ],
                    [
                        131,
                        50444
                    ],
                    [
                        132,
                        5802
                    ],
                    [
                        134,
                        5805
                    ],
                    [
                        135,
                        5806
                    ],
                    [
                        136,
                        5811
                    ],
                    [
                        140,
                        35304
                    ],
                    [
                        152,
                        12385
                    ],
                    [
                        163,
                        5818
                    ],
                    [
                        201,
                        5719
                    ],
                    [
                        210,
                        12360
                    ],
                    [
                        251,
                        10586
                    ],
                    [
                        257,
                        5821
                    ],
                    [
                        262,
                        5721
                    ],
                    [
                        263,
                        5812
                    ],
                    [
                        272,
                        15863
                    ],
                    [
                        274,
                        5832
                    ],
                    [
                        275,
                        5825
                    ],
                    [
                        276,
                        5834
                    ],
                    [
                        287,
                        5603
                    ],
                    [
                        290,
                        5836
                    ],
                    [
                        291,
                        5837
                    ],
                    [
                        292,
                        5838
                    ],
                    [
                        293,
                        6145
                    ],
                    [
                        294,
                        6161
                    ],
                    [
                        296,
                        5857
                    ],
                    [
                        321,
                        5623
                    ],
                    [
                        323,
                        5732
                    ],
                    [
                        324,
                        12361
                    ],
                    [
                        337,
                        12362
                    ],
                    [
                        338,
                        12363
                    ],
                    [
                        349,
                        12367
                    ],
                    [
                        350,
                        5861
                    ],
                    [
                        351,
                        5862
                    ],
                    [
                        352,
                        5865
                    ],
                    [
                        353,
                        5968
                    ],
                    [
                        369,
                        12324
                    ],
                    [
                        377,
                        10632
                    ],
                    [
                        379,
                        14490
                    ],
                    [
                        393,
                        5868
                    ],
                    [
                        394,
                        5904
                    ],
                    [
                        395,
                        5996
                    ],
                    [
                        396,
                        5860
                    ],
                    [
                        397,
                        5910
                    ],
                    [
                        398,
                        5912
                    ],
                    [
                        402,
                        6159
                    ],
                    [
                        403,
                        5927
                    ],
                    [
                        404,
                        5937
                    ],
                    [
                        405,
                        5933
                    ],
                    [
                        408,
                        30800
                    ],
                    [
                        456,
                        12344
                    ],
                    [
                        457,
                        12346
                    ],
                    [
                        458,
                        10800
                    ],
                    [
                        468,
                        10375
                    ],
                    [
                        469,
                        5967
                    ],
                    [
                        470,
                        5969
                    ],
                    [
                        471,
                        5867
                    ],
                    [
                        472,
                        5972
                    ],
                    [
                        473,
                        5970
                    ],
                    [
                        474,
                        5978
                    ],
                    [
                        475,
                        6164
                    ],
                    [
                        478,
                        5810
                    ],
                    [
                        554,
                        1110
                    ],
                    [
                        555,
                        1162
                    ],
                    [
                        559,
                        1118
                    ],
                    [
                        563,
                        1123
                    ],
                    [
                        564,
                        1125
                    ],
                    [
                        568,
                        1129
                    ],
                    [
                        570,
                        1131
                    ],
                    [
                        579,
                        1139
                    ],
                    [
                        580,
                        1141
                    ],
                    [
                        583,
                        1148
                    ],
                    [
                        603,
                        1115
                    ],
                    [
                        2876,
                        12656
                    ],
                    [
                        2877,
                        12658
                    ],
                    [
                        2881,
                        12691
                    ],
                    [
                        2882,
                        12689
                    ],
                    [
                        2883,
                        12685
                    ],
                    [
                        2884,
                        12690
                    ],
                    [
                        2887,
                        12695
                    ],
                    [
                        2888,
                        12703
                    ],
                    [
                        2889,
                        12679
                    ],
                    [
                        2890,
                        12674
                    ],
                    [
                        2891,
                        12680
                    ],
                    [
                        2892,
                        12681
                    ],
                    [
                        2894,
                        12757
                    ],
                    [
                        2895,
                        12664
                    ],
                    [
                        2896,
                        12697
                    ],
                    [
                        2897,
                        12699
                    ],
                    [
                        2898,
                        12700
                    ],
                    [
                        2899,
                        12709
                    ],
                    [
                        2900,
                        12708
                    ],
                    [
                        2902,
                        12711
                    ],
                    [
                        2903,
                        12712
                    ],
                    [
                        2904,
                        12713
                    ],
                    [
                        2905,
                        12714
                    ],
                    [
                        2906,
                        12715
                    ],
                    [
                        2907,
                        12716
                    ],
                    [
                        2908,
                        12717
                    ],
                    [
                        2909,
                        12718
                    ],
                    [
                        2910,
                        12721
                    ],
                    [
                        2911,
                        12722
                    ],
                    [
                        2912,
                        12723
                    ],
                    [
                        2913,
                        12730
                    ],
                    [
                        2914,
                        12731
                    ],
                    [
                        2915,
                        12729
                    ],
                    [
                        2917,
                        12754
                    ],
                    [
                        2918,
                        12755
                    ],
                    [
                        2919,
                        12756
                    ],
                    [
                        2920,
                        12732
                    ],
                    [
                        2923,
                        12744
                    ],
                    [
                        2926,
                        12748
                    ],
                    [
                        2927,
                        12749
                    ],
                    [
                        2966,
                        10586
                    ],
                    [
                        3310,
                        16427
                    ],
                    [
                        3822,
                        20975
                    ],
                    [
                        3882,
                        21659
                    ],
                    [
                        3883,
                        21661
                    ],
                    [
                        4739,
                        30815
                    ],
                    [
                        4782,
                        29921
                    ],
                    [
                        4812,
                        29739
                    ],
                    [
                        4825,
                        30357
                    ],
                    [
                        4827,
                        30032
                    ],
                    [
                        4856,
                        30725
                    ],
                    [
                        4878,
                        30101
                    ],
                    [
                        4903,
                        31248
                    ],
                    [
                        4919,
                        31451
                    ],
                    [
                        4922,
                        31568
                    ],
                    [
                        4928,
                        31639
                    ],
                    [
                        4940,
                        31459
                    ],
                    [
                        4944,
                        31367
                    ],
                    [
                        4963,
                        31438
                    ],
                    [
                        5616,
                        42009
                    ],
                    [
                        5665,
                        44980
                    ],
                    [
                        5676,
                        42521
                    ],
                    [
                        5679,
                        41218
                    ],
                    [
                        5685,
                        44646
                    ],
                    [
                        5699,
                        43636
                    ],
                    [
                        5717,
                        40507
                    ],
                    [
                        5719,
                        42842
                    ],
                    [
                        5824,
                        42963
                    ],
                    [
                        5859,
                        42180
                    ],
                    [
                        5861,
                        43739
                    ],
                    [
                        5942,
                        41156
                    ]
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Profession>(
            """
            {
                "id": "Ranger",
                "name": "Waldläufer",
                "code": 4,
                "icon": "https://render.guildwars2.com/file/49B10316B424F4E20139EB5E51ADCF24A8724E9B/156640.png",
                "icon_big": "https://render.guildwars2.com/file/FEF2479DC197D40758A8D6E95201F4A7996EB357/156639.png",
                "specializations": [
                    8,
                    30,
                    33,
                    25,
                    32,
                    5,
                    55
                ],
                "weapons": {
                    "Axe": {
                        "flags": [
                            "Mainhand",
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 12466,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 12480,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 12490,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 12638,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 12639,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Dagger": {
                        "specialization": 55,
                        "flags": [
                            "Mainhand",
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 45426,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 43536,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 46123,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 12478,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 12477,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Greatsword": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 12474,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 12525,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 12521,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 12522,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 12475,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Spear": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 12553,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 12559,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 12557,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 12561,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 12552,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Longbow": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 12510,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 12509,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 12573,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 12511,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 12469,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Shortbow": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 12470,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 12468,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 12517,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 12507,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 12508,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Speargun": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 12526,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 12529,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 12528,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 12527,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 12530,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Staff": {
                        "specialization": 5,
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 31710,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 31889,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 31535,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 31700,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 31496,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Sword": {
                        "flags": [
                            "Mainhand"
                        ],
                        "skills": [
                            {
                                "id": 12471,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 12482,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 12481,
                                "slot": "Weapon_3"
                            }
                        ]
                    },
                    "Torch": {
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 12635,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 12504,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Warhorn": {
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 12620,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 12621,
                                "slot": "Weapon_5"
                            }
                        ]
                    }
                },
                "flags": [],
                "skills": [
                    {
                        "id": 31914,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 12483,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 12489,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 21773,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 12476,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12499,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12496,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12492,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12502,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12542,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12500,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12491,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12537,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12494,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12501,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12550,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12498,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12495,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12497,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12493,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12633,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12631,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12632,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 34309,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 12516,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 12580,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 12569,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 31407,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 31322,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 31746,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 31582,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30238,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 31677,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 31869,
                        "slot": "Profession_5",
                        "type": "Profession"
                    },
                    {
                        "id": 45789,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 45717,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 45142,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 44948,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 45970,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 40498,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 44991,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 42042,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 43136,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 43060,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 43726,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 42894,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 43068,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 41461,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 41537,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 41575,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 41524,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 45743,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 40625,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 44514,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 44384,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 40111,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 44617,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 43548,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 41406,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 46432,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 43788,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 43701,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 44097,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 43671,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 42717,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 44885,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 43186,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 41837,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 42797,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 44360,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 41206,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 45479,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 42907,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 40255,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 46386,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 41908,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 44626,
                        "slot": "Profession_3",
                        "type": "Profession"
                    },
                    {
                        "id": 45797,
                        "slot": "Profession_3",
                        "type": "Profession"
                    },
                    {
                        "id": 40588,
                        "slot": "Profession_3",
                        "type": "Profession"
                    },
                    {
                        "id": 43375,
                        "slot": "Profession_3",
                        "type": "Profession"
                    },
                    {
                        "id": 40729,
                        "slot": "Profession_3",
                        "type": "Profession"
                    },
                    {
                        "id": 42809,
                        "slot": "Profession_3",
                        "type": "Profession"
                    },
                    {
                        "id": 42944,
                        "slot": "Profession_5",
                        "type": "Profession"
                    },
                    {
                        "id": 43014,
                        "slot": "Profession_5",
                        "type": "Profession"
                    }
                ],
                "training": [
                    {
                        "id": 77,
                        "category": "Skills",
                        "name": "Siegel-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 12542
                            },
                            {
                                "cost": 5,
                                "type": "Skill",
                                "skill_id": 12491
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 12500
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 12502
                            }
                        ]
                    },
                    {
                        "id": 90,
                        "category": "Skills",
                        "name": "Fallen-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 12489
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 12476
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 12499
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 12496
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 12492
                            }
                        ]
                    },
                    {
                        "id": 48,
                        "category": "Skills",
                        "name": "Überlebens-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 12483
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 12537
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 12494
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 12501
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 12550
                            },
                            {
                                "cost": 24,
                                "type": "Skill",
                                "skill_id": 12580
                            }
                        ]
                    },
                    {
                        "id": 41,
                        "category": "Skills",
                        "name": "Geister-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 21773
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 12498
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 12495
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 12497
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 12493
                            },
                            {
                                "cost": 24,
                                "type": "Skill",
                                "skill_id": 12569
                            }
                        ]
                    },
                    {
                        "id": 82,
                        "category": "Skills",
                        "name": "Kommando-Training",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 12633
                            },
                            {
                                "cost": 5,
                                "type": "Skill",
                                "skill_id": 12632
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 12631
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 34309
                            },
                            {
                                "cost": 22,
                                "type": "Skill",
                                "skill_id": 12516
                            }
                        ]
                    },
                    {
                        "id": 83,
                        "category": "Specializations",
                        "name": "Schießkunst",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1010
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1021
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1014
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 986
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1009
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1001
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1000
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1070
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1011
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 996
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1015
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1698
                            }
                        ]
                    },
                    {
                        "id": 105,
                        "category": "Specializations",
                        "name": "Gefechtsbeherrschung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1080
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1069
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1067
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1075
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1083
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1016
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1700
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1846
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1068
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1064
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1912
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1888
                            }
                        ]
                    },
                    {
                        "id": 65,
                        "category": "Specializations",
                        "name": "Überleben in der Wildnis",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1096
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1098
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1086
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1099
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1090
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1101
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 2032
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1100
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1089
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1094
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1699
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1701
                            }
                        ]
                    },
                    {
                        "id": 101,
                        "category": "Specializations",
                        "name": "Naturmagie",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1055
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1062
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 978
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1060
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1056
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1054
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 965
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 964
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1059
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1038
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1988
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1697
                            }
                        ]
                    },
                    {
                        "id": 46,
                        "category": "Specializations",
                        "name": "Tierbeherrschung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1900
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1861
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1072
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1606
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 974
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 975
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1047
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 970
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1065
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1945
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 968
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1066
                            }
                        ]
                    },
                    {
                        "id": 53,
                        "category": "EliteSpecializations",
                        "name": "Druide",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1965
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 1874
                            },
                            {
                                "cost": 55,
                                "type": "Skill",
                                "skill_id": 31407
                            },
                            {
                                "cost": 65,
                                "type": "Trait",
                                "trait_id": 1868
                            },
                            {
                                "cost": 75,
                                "type": "Trait",
                                "trait_id": 2016
                            },
                            {
                                "cost": 85,
                                "type": "Trait",
                                "trait_id": 1935
                            },
                            {
                                "cost": 95,
                                "type": "Trait",
                                "trait_id": 1862
                            },
                            {
                                "cost": 110,
                                "type": "Skill",
                                "skill_id": 31322
                            },
                            {
                                "cost": 125,
                                "type": "Skill",
                                "skill_id": 31582
                            },
                            {
                                "cost": 135,
                                "type": "Trait",
                                "trait_id": 2053
                            },
                            {
                                "cost": 145,
                                "type": "Trait",
                                "trait_id": 2001
                            },
                            {
                                "cost": 155,
                                "type": "Trait",
                                "trait_id": 2056
                            },
                            {
                                "cost": 165,
                                "type": "Trait",
                                "trait_id": 1992
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 30238
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 2057
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 2058
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 2055
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 31746
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 31677
                            }
                        ]
                    },
                    {
                        "id": 407,
                        "category": "EliteSpecializations",
                        "name": "Seelenwandler",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 2088
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 2151
                            },
                            {
                                "cost": 50,
                                "type": "Trait",
                                "trait_id": 2071
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 2156
                            },
                            {
                                "cost": 70,
                                "type": "Trait",
                                "trait_id": 2085
                            },
                            {
                                "cost": 80,
                                "type": "Trait",
                                "trait_id": 2127
                            },
                            {
                                "cost": 90,
                                "type": "Trait",
                                "trait_id": 2128
                            },
                            {
                                "cost": 105,
                                "type": "Skill",
                                "skill_id": 44948
                            },
                            {
                                "cost": 120,
                                "type": "Skill",
                                "skill_id": 45142
                            },
                            {
                                "cost": 130,
                                "type": "Trait",
                                "trait_id": 2134
                            },
                            {
                                "cost": 140,
                                "type": "Trait",
                                "trait_id": 2119
                            },
                            {
                                "cost": 150,
                                "type": "Trait",
                                "trait_id": 2155
                            },
                            {
                                "cost": 165,
                                "type": "Skill",
                                "skill_id": 45789
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 45970
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 2072
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 2161
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 2143
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 40498
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 45717
                            }
                        ]
                    }
                ],
                "skills_by_palette": [
                    [
                        1,
                        12343
                    ],
                    [
                        2,
                        12417
                    ],
                    [
                        3,
                        12371
                    ],
                    [
                        4,
                        12337
                    ],
                    [
                        5,
                        12639
                    ],
                    [
                        7,
                        12373
                    ],
                    [
                        8,
                        12338
                    ],
                    [
                        9,
                        12318
                    ],
                    [
                        11,
                        12319
                    ],
                    [
                        12,
                        12320
                    ],
                    [
                        13,
                        12387
                    ],
                    [
                        14,
                        12323
                    ],
                    [
                        16,
                        12389
                    ],
                    [
                        17,
                        12325
                    ],
                    [
                        20,
                        12391
                    ],
                    [
                        21,
                        12440
                    ],
                    [
                        22,
                        12399
                    ],
                    [
                        23,
                        12447
                    ],
                    [
                        25,
                        12450
                    ],
                    [
                        27,
                        12476
                    ],
                    [
                        28,
                        12453
                    ],
                    [
                        29,
                        12401
                    ],
                    [
                        30,
                        12456
                    ],
                    [
                        31,
                        12403
                    ],
                    [
                        32,
                        5939
                    ],
                    [
                        33,
                        12339
                    ],
                    [
                        34,
                        12340
                    ],
                    [
                        35,
                        12469
                    ],
                    [
                        36,
                        12407
                    ],
                    [
                        37,
                        12457
                    ],
                    [
                        47,
                        12477
                    ],
                    [
                        50,
                        12475
                    ],
                    [
                        89,
                        31496
                    ],
                    [
                        90,
                        12481
                    ],
                    [
                        102,
                        12504
                    ],
                    [
                        103,
                        12621
                    ],
                    [
                        107,
                        12508
                    ],
                    [
                        111,
                        37873
                    ],
                    [
                        120,
                        12483
                    ],
                    [
                        121,
                        31914
                    ],
                    [
                        122,
                        5531
                    ],
                    [
                        124,
                        12380
                    ],
                    [
                        140,
                        35304
                    ],
                    [
                        152,
                        12385
                    ],
                    [
                        154,
                        12542
                    ],
                    [
                        161,
                        12489
                    ],
                    [
                        180,
                        34309
                    ],
                    [
                        181,
                        12492
                    ],
                    [
                        182,
                        12493
                    ],
                    [
                        183,
                        12632
                    ],
                    [
                        184,
                        12494
                    ],
                    [
                        185,
                        12495
                    ],
                    [
                        186,
                        12496
                    ],
                    [
                        187,
                        12631
                    ],
                    [
                        188,
                        12497
                    ],
                    [
                        189,
                        12498
                    ],
                    [
                        190,
                        12499
                    ],
                    [
                        191,
                        12537
                    ],
                    [
                        192,
                        12580
                    ],
                    [
                        193,
                        12501
                    ],
                    [
                        194,
                        12502
                    ],
                    [
                        201,
                        5719
                    ],
                    [
                        210,
                        12360
                    ],
                    [
                        237,
                        12516
                    ],
                    [
                        251,
                        10586
                    ],
                    [
                        262,
                        5721
                    ],
                    [
                        265,
                        12552
                    ],
                    [
                        272,
                        15863
                    ],
                    [
                        287,
                        5603
                    ],
                    [
                        293,
                        12530
                    ],
                    [
                        321,
                        5623
                    ],
                    [
                        323,
                        5732
                    ],
                    [
                        324,
                        12361
                    ],
                    [
                        337,
                        12362
                    ],
                    [
                        338,
                        12363
                    ],
                    [
                        349,
                        12367
                    ],
                    [
                        369,
                        12324
                    ],
                    [
                        377,
                        10632
                    ],
                    [
                        379,
                        14490
                    ],
                    [
                        402,
                        6159
                    ],
                    [
                        406,
                        12550
                    ],
                    [
                        407,
                        12569
                    ],
                    [
                        421,
                        12633
                    ],
                    [
                        427,
                        12500
                    ],
                    [
                        428,
                        12491
                    ],
                    [
                        456,
                        12344
                    ],
                    [
                        457,
                        12346
                    ],
                    [
                        458,
                        10800
                    ],
                    [
                        468,
                        10375
                    ],
                    [
                        554,
                        1110
                    ],
                    [
                        555,
                        1162
                    ],
                    [
                        559,
                        1118
                    ],
                    [
                        563,
                        1123
                    ],
                    [
                        564,
                        1125
                    ],
                    [
                        568,
                        1129
                    ],
                    [
                        570,
                        1131
                    ],
                    [
                        579,
                        1139
                    ],
                    [
                        580,
                        1141
                    ],
                    [
                        583,
                        1148
                    ],
                    [
                        603,
                        1115
                    ],
                    [
                        2876,
                        12656
                    ],
                    [
                        2877,
                        12658
                    ],
                    [
                        2881,
                        12691
                    ],
                    [
                        2882,
                        12689
                    ],
                    [
                        2883,
                        12685
                    ],
                    [
                        2884,
                        12690
                    ],
                    [
                        2887,
                        12695
                    ],
                    [
                        2888,
                        12703
                    ],
                    [
                        2889,
                        12679
                    ],
                    [
                        2890,
                        12674
                    ],
                    [
                        2891,
                        12680
                    ],
                    [
                        2892,
                        12681
                    ],
                    [
                        2894,
                        12757
                    ],
                    [
                        2895,
                        12664
                    ],
                    [
                        2896,
                        12697
                    ],
                    [
                        2897,
                        12699
                    ],
                    [
                        2898,
                        12700
                    ],
                    [
                        2899,
                        12709
                    ],
                    [
                        2900,
                        12708
                    ],
                    [
                        2902,
                        12711
                    ],
                    [
                        2903,
                        12712
                    ],
                    [
                        2904,
                        12713
                    ],
                    [
                        2905,
                        12714
                    ],
                    [
                        2906,
                        12715
                    ],
                    [
                        2907,
                        12716
                    ],
                    [
                        2908,
                        12717
                    ],
                    [
                        2909,
                        12718
                    ],
                    [
                        2910,
                        12721
                    ],
                    [
                        2911,
                        12722
                    ],
                    [
                        2912,
                        12723
                    ],
                    [
                        2913,
                        12730
                    ],
                    [
                        2914,
                        12731
                    ],
                    [
                        2915,
                        12729
                    ],
                    [
                        2917,
                        12754
                    ],
                    [
                        2918,
                        12755
                    ],
                    [
                        2919,
                        12756
                    ],
                    [
                        2920,
                        12732
                    ],
                    [
                        2923,
                        12744
                    ],
                    [
                        2926,
                        12748
                    ],
                    [
                        2927,
                        12749
                    ],
                    [
                        2966,
                        10586
                    ],
                    [
                        3310,
                        16427
                    ],
                    [
                        3822,
                        20975
                    ],
                    [
                        3877,
                        21773
                    ],
                    [
                        4776,
                        30238
                    ],
                    [
                        4788,
                        31677
                    ],
                    [
                        4792,
                        31582
                    ],
                    [
                        4821,
                        31322
                    ],
                    [
                        4827,
                        30032
                    ],
                    [
                        4838,
                        31746
                    ],
                    [
                        4873,
                        31407
                    ],
                    [
                        4919,
                        31451
                    ],
                    [
                        4922,
                        31568
                    ],
                    [
                        4928,
                        31639
                    ],
                    [
                        4940,
                        31459
                    ],
                    [
                        4944,
                        31367
                    ],
                    [
                        4952,
                        34070
                    ],
                    [
                        4963,
                        31438
                    ],
                    [
                        5613,
                        43375
                    ],
                    [
                        5619,
                        40588
                    ],
                    [
                        5626,
                        40588
                    ],
                    [
                        5628,
                        43375
                    ],
                    [
                        5631,
                        43375
                    ],
                    [
                        5638,
                        45797
                    ],
                    [
                        5648,
                        40729
                    ],
                    [
                        5650,
                        45797
                    ],
                    [
                        5652,
                        40588
                    ],
                    [
                        5662,
                        40588
                    ],
                    [
                        5665,
                        44980
                    ],
                    [
                        5678,
                        45717
                    ],
                    [
                        5684,
                        45970
                    ],
                    [
                        5686,
                        43375
                    ],
                    [
                        5687,
                        40588
                    ],
                    [
                        5699,
                        43636
                    ],
                    [
                        5707,
                        40588
                    ],
                    [
                        5720,
                        45797
                    ],
                    [
                        5722,
                        43375
                    ],
                    [
                        5723,
                        40729
                    ],
                    [
                        5728,
                        44626
                    ],
                    [
                        5735,
                        45797
                    ],
                    [
                        5737,
                        40588
                    ],
                    [
                        5751,
                        44626
                    ],
                    [
                        5767,
                        44626
                    ],
                    [
                        5771,
                        43375
                    ],
                    [
                        5775,
                        40729
                    ],
                    [
                        5777,
                        43375
                    ],
                    [
                        5779,
                        44626
                    ],
                    [
                        5781,
                        43375
                    ],
                    [
                        5782,
                        40729
                    ],
                    [
                        5784,
                        43375
                    ],
                    [
                        5785,
                        43375
                    ],
                    [
                        5793,
                        45797
                    ],
                    [
                        5800,
                        43375
                    ],
                    [
                        5815,
                        45797
                    ],
                    [
                        5817,
                        40729
                    ],
                    [
                        5824,
                        42963
                    ],
                    [
                        5838,
                        43375
                    ],
                    [
                        5842,
                        44626
                    ],
                    [
                        5846,
                        43375
                    ],
                    [
                        5848,
                        40729
                    ],
                    [
                        5852,
                        45797
                    ],
                    [
                        5858,
                        40729
                    ],
                    [
                        5859,
                        42180
                    ],
                    [
                        5862,
                        40588
                    ],
                    [
                        5865,
                        40498
                    ],
                    [
                        5866,
                        44626
                    ],
                    [
                        5870,
                        40588
                    ],
                    [
                        5872,
                        40588
                    ],
                    [
                        5882,
                        45789
                    ],
                    [
                        5884,
                        40729
                    ],
                    [
                        5889,
                        45142
                    ],
                    [
                        5901,
                        40588
                    ],
                    [
                        5907,
                        40588
                    ],
                    [
                        5910,
                        40729
                    ],
                    [
                        5912,
                        40729
                    ],
                    [
                        5914,
                        43375
                    ],
                    [
                        5918,
                        40729
                    ],
                    [
                        5923,
                        40588
                    ],
                    [
                        5934,
                        44948
                    ],
                    [
                        5942,
                        41156
                    ],
                    [
                        5944,
                        44626
                    ],
                    [
                        5962,
                        40588
                    ],
                    [
                        5982,
                        43375
                    ]
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Profession>(
            """
            {
                "id": "Thief",
                "name": "Dieb",
                "code": 5,
                "icon": "https://render.guildwars2.com/file/F9EC00E23F630D6DB20CDA985592EC010E2A5705/156641.png",
                "icon_big": "https://render.guildwars2.com/file/13A2C0EF23F23FF2084875629465279DDA807E3D/103581.png",
                "specializations": [
                    28,
                    35,
                    20,
                    54,
                    44,
                    7,
                    58
                ],
                "weapons": {
                    "Dagger": {
                        "flags": [
                            "Mainhand",
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 13004,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 13097,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 13006,
                                "slot": "Weapon_3",
                                "offhand": "Dagger"
                            },
                            {
                                "id": 13040,
                                "slot": "Weapon_3",
                                "offhand": "Pistol"
                            },
                            {
                                "id": 13110,
                                "slot": "Weapon_3",
                                "offhand": "Nothing"
                            },
                            {
                                "id": 13019,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 16432,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Spear": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 13119,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 13069,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 13122,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 13070,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 13068,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Pistol": {
                        "flags": [
                            "Mainhand",
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 13084,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 13008,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 13011,
                                "slot": "Weapon_3",
                                "offhand": "Pistol"
                            },
                            {
                                "id": 13010,
                                "slot": "Weapon_3",
                                "offhand": "Dagger"
                            },
                            {
                                "id": 13111,
                                "slot": "Weapon_3",
                                "offhand": "Nothing"
                            },
                            {
                                "id": 13012,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 13113,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Rifle": {
                        "specialization": 58,
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 41422,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 41494,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 43916,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 41937,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 40600,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Shortbow": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 13022,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 13041,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 13083,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 13024,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 13025,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Speargun": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 13072,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 13073,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 13074,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 13075,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 13076,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Staff": {
                        "specialization": 7,
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 30614,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 29911,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 30520,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 30775,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 30597,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Sword": {
                        "flags": [
                            "Mainhand"
                        ],
                        "skills": [
                            {
                                "id": 13009,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 13015,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 13016,
                                "slot": "Weapon_3",
                                "offhand": "Dagger"
                            },
                            {
                                "id": 13031,
                                "slot": "Weapon_3",
                                "offhand": "Pistol"
                            },
                            {
                                "id": 13112,
                                "slot": "Weapon_3",
                                "offhand": "Nothing"
                            }
                        ]
                    }
                },
                "flags": [],
                "skills": [
                    {
                        "id": 13014,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 13027,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 13021,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 21778,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 13050,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 13037,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13055,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13096,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13093,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13057,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13026,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13038,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13056,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13046,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13064,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13062,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13060,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13020,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13035,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13066,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13028,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13002,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13044,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13065,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13117,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 13082,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 13132,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 13085,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 30400,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 30868,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30568,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30661,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30369,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 29516,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 45088,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 45508,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 46335,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 41205,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 41372,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 41158,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 43390,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 1131,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Guardian"
                    },
                    {
                        "id": 1118,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Guardian"
                    },
                    {
                        "id": 1162,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Warrior"
                    },
                    {
                        "id": 1167,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Warrior"
                    },
                    {
                        "id": 1115,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Warrior"
                    },
                    {
                        "id": 45094,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Engineer"
                    },
                    {
                        "id": 1110,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Engineer"
                    },
                    {
                        "id": 45094,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Engineer"
                    },
                    {
                        "id": 1110,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Engineer"
                    },
                    {
                        "id": 1139,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Ranger"
                    },
                    {
                        "id": 1125,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Ranger"
                    },
                    {
                        "id": 1148,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Thief"
                    },
                    {
                        "id": 1148,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Thief"
                    },
                    {
                        "id": 1129,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Elementalist"
                    },
                    {
                        "id": 1129,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Elementalist"
                    },
                    {
                        "id": 1123,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Mesmer"
                    },
                    {
                        "id": 1123,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Mesmer"
                    },
                    {
                        "id": 1141,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Necromancer"
                    },
                    {
                        "id": 1141,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Necromancer"
                    },
                    {
                        "id": 31438,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Revenant"
                    },
                    {
                        "id": 31438,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "source": "Revenant"
                    }
                ],
                "training": [
                    {
                        "id": 52,
                        "category": "Skills",
                        "name": "Siegel-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 13064
                            },
                            {
                                "cost": 5,
                                "type": "Skill",
                                "skill_id": 13046
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 13060
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 13062
                            }
                        ]
                    },
                    {
                        "id": 49,
                        "category": "Skills",
                        "name": "Vorbereitungs-Training",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 13057
                            },
                            {
                                "cost": 5,
                                "type": "Skill",
                                "skill_id": 13026
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 13056
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 13038
                            }
                        ]
                    },
                    {
                        "id": 114,
                        "category": "Skills",
                        "name": "Trick-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 13021
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 13028
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 13020
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 13035
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 13066
                            },
                            {
                                "cost": 24,
                                "type": "Skill",
                                "skill_id": 13085
                            }
                        ]
                    },
                    {
                        "id": 70,
                        "category": "Skills",
                        "name": "Gift-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 21778
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 13037
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 13055
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 13096
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 13093
                            },
                            {
                                "cost": 24,
                                "type": "Skill",
                                "skill_id": 13132
                            }
                        ]
                    },
                    {
                        "id": 96,
                        "category": "Skills",
                        "name": "Täuschung-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 13027
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 13002
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 13044
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 13065
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 13117
                            },
                            {
                                "cost": 24,
                                "type": "Skill",
                                "skill_id": 13082
                            }
                        ]
                    },
                    {
                        "id": 59,
                        "category": "Specializations",
                        "name": "Tödliche Künste",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1279
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1245
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1276
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1164
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1280
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1169
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1292
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1704
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1257
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1291
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1167
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1269
                            }
                        ]
                    },
                    {
                        "id": 54,
                        "category": "Specializations",
                        "name": "Kritische Schläge",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1281
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1209
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1267
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1268
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1210
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1170
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1272
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1299
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1282
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1904
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1215
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1702
                            }
                        ]
                    },
                    {
                        "id": 43,
                        "category": "Specializations",
                        "name": "Akrobatik",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1240
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1112
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1289
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1237
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1234
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1241
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1192
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1290
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1242
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1238
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1295
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1703
                            }
                        ]
                    },
                    {
                        "id": 116,
                        "category": "Specializations",
                        "name": "Schattenkünste",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1294
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1160
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1293
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1284
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1136
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1297
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1130
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1300
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1705
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1134
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1135
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1162
                            }
                        ]
                    },
                    {
                        "id": 67,
                        "category": "Specializations",
                        "name": "Betrugskunst",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1137
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1159
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1252
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1163
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1232
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1277
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1286
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1190
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1157
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1187
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1158
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1706
                            }
                        ]
                    },
                    {
                        "id": 106,
                        "category": "EliteSpecializations",
                        "name": "Draufgänger",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1957
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 1994
                            },
                            {
                                "cost": 55,
                                "type": "Skill",
                                "skill_id": 30400
                            },
                            {
                                "cost": 65,
                                "type": "Trait",
                                "trait_id": 1933
                            },
                            {
                                "cost": 75,
                                "type": "Trait",
                                "trait_id": 2023
                            },
                            {
                                "cost": 85,
                                "type": "Trait",
                                "trait_id": 1949
                            },
                            {
                                "cost": 95,
                                "type": "Trait",
                                "trait_id": 1887
                            },
                            {
                                "cost": 110,
                                "type": "Skill",
                                "skill_id": 30661
                            },
                            {
                                "cost": 125,
                                "type": "Skill",
                                "skill_id": 30868
                            },
                            {
                                "cost": 135,
                                "type": "Trait",
                                "trait_id": 1884
                            },
                            {
                                "cost": 145,
                                "type": "Trait",
                                "trait_id": 1893
                            },
                            {
                                "cost": 155,
                                "type": "Trait",
                                "trait_id": 1975
                            },
                            {
                                "cost": 165,
                                "type": "Trait",
                                "trait_id": 1837
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 30568
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 1833
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 1964
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 2047
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 30369
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 29516
                            }
                        ]
                    },
                    {
                        "id": 404,
                        "category": "EliteSpecializations",
                        "name": "Scharfschütze",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 2129
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 2171
                            },
                            {
                                "cost": 50,
                                "type": "Trait",
                                "trait_id": 2173
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 2172
                            },
                            {
                                "cost": 70,
                                "type": "Trait",
                                "trait_id": 2078
                            },
                            {
                                "cost": 80,
                                "type": "Trait",
                                "trait_id": 2084
                            },
                            {
                                "cost": 90,
                                "type": "Trait",
                                "trait_id": 2093
                            },
                            {
                                "cost": 105,
                                "type": "Skill",
                                "skill_id": 45088
                            },
                            {
                                "cost": 120,
                                "type": "Skill",
                                "skill_id": 46335
                            },
                            {
                                "cost": 130,
                                "type": "Trait",
                                "trait_id": 2145
                            },
                            {
                                "cost": 140,
                                "type": "Trait",
                                "trait_id": 2118
                            },
                            {
                                "cost": 150,
                                "type": "Trait",
                                "trait_id": 2111
                            },
                            {
                                "cost": 165,
                                "type": "Skill",
                                "skill_id": 41205
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 41372
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 2136
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 2160
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 2146
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 41158
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 45508
                            }
                        ]
                    }
                ],
                "skills_by_palette": [
                    [
                        1,
                        12343
                    ],
                    [
                        2,
                        12417
                    ],
                    [
                        3,
                        12371
                    ],
                    [
                        4,
                        12337
                    ],
                    [
                        7,
                        12373
                    ],
                    [
                        8,
                        12338
                    ],
                    [
                        9,
                        12318
                    ],
                    [
                        11,
                        12319
                    ],
                    [
                        12,
                        12320
                    ],
                    [
                        13,
                        12387
                    ],
                    [
                        14,
                        12323
                    ],
                    [
                        16,
                        12389
                    ],
                    [
                        17,
                        12325
                    ],
                    [
                        20,
                        12391
                    ],
                    [
                        21,
                        12440
                    ],
                    [
                        22,
                        12399
                    ],
                    [
                        23,
                        12447
                    ],
                    [
                        25,
                        12450
                    ],
                    [
                        28,
                        12453
                    ],
                    [
                        29,
                        12401
                    ],
                    [
                        30,
                        12456
                    ],
                    [
                        31,
                        12403
                    ],
                    [
                        32,
                        5939
                    ],
                    [
                        33,
                        12339
                    ],
                    [
                        34,
                        12340
                    ],
                    [
                        36,
                        12407
                    ],
                    [
                        37,
                        12457
                    ],
                    [
                        40,
                        13082
                    ],
                    [
                        47,
                        16432
                    ],
                    [
                        54,
                        13113
                    ],
                    [
                        85,
                        40600
                    ],
                    [
                        88,
                        13002
                    ],
                    [
                        89,
                        30597
                    ],
                    [
                        90,
                        13112
                    ],
                    [
                        107,
                        13025
                    ],
                    [
                        111,
                        37873
                    ],
                    [
                        122,
                        5531
                    ],
                    [
                        124,
                        12380
                    ],
                    [
                        133,
                        13050
                    ],
                    [
                        137,
                        13020
                    ],
                    [
                        140,
                        35304
                    ],
                    [
                        152,
                        12385
                    ],
                    [
                        201,
                        5719
                    ],
                    [
                        210,
                        12360
                    ],
                    [
                        251,
                        10586
                    ],
                    [
                        262,
                        5721
                    ],
                    [
                        264,
                        13014
                    ],
                    [
                        265,
                        13068
                    ],
                    [
                        266,
                        13021
                    ],
                    [
                        267,
                        13026
                    ],
                    [
                        268,
                        13027
                    ],
                    [
                        269,
                        13028
                    ],
                    [
                        270,
                        13132
                    ],
                    [
                        272,
                        15863
                    ],
                    [
                        281,
                        13035
                    ],
                    [
                        283,
                        13038
                    ],
                    [
                        287,
                        5603
                    ],
                    [
                        293,
                        13076
                    ],
                    [
                        303,
                        13037
                    ],
                    [
                        307,
                        13046
                    ],
                    [
                        308,
                        13044
                    ],
                    [
                        318,
                        13055
                    ],
                    [
                        321,
                        5623
                    ],
                    [
                        323,
                        5732
                    ],
                    [
                        324,
                        12361
                    ],
                    [
                        337,
                        12362
                    ],
                    [
                        338,
                        12363
                    ],
                    [
                        339,
                        13056
                    ],
                    [
                        340,
                        13057
                    ],
                    [
                        341,
                        13093
                    ],
                    [
                        342,
                        13060
                    ],
                    [
                        343,
                        13062
                    ],
                    [
                        344,
                        13064
                    ],
                    [
                        345,
                        13065
                    ],
                    [
                        346,
                        13096
                    ],
                    [
                        347,
                        13066
                    ],
                    [
                        349,
                        12367
                    ],
                    [
                        369,
                        12324
                    ],
                    [
                        377,
                        10632
                    ],
                    [
                        379,
                        14490
                    ],
                    [
                        402,
                        6159
                    ],
                    [
                        415,
                        13085
                    ],
                    [
                        443,
                        13117
                    ],
                    [
                        456,
                        12344
                    ],
                    [
                        457,
                        12346
                    ],
                    [
                        458,
                        10800
                    ],
                    [
                        468,
                        10375
                    ],
                    [
                        554,
                        1110
                    ],
                    [
                        555,
                        1162
                    ],
                    [
                        559,
                        1118
                    ],
                    [
                        563,
                        1123
                    ],
                    [
                        564,
                        1125
                    ],
                    [
                        568,
                        1129
                    ],
                    [
                        570,
                        1131
                    ],
                    [
                        579,
                        1139
                    ],
                    [
                        580,
                        1141
                    ],
                    [
                        583,
                        1148
                    ],
                    [
                        603,
                        1115
                    ],
                    [
                        2876,
                        12656
                    ],
                    [
                        2877,
                        12658
                    ],
                    [
                        2881,
                        12691
                    ],
                    [
                        2882,
                        12689
                    ],
                    [
                        2883,
                        12685
                    ],
                    [
                        2884,
                        12690
                    ],
                    [
                        2887,
                        12695
                    ],
                    [
                        2888,
                        12703
                    ],
                    [
                        2889,
                        12679
                    ],
                    [
                        2890,
                        12674
                    ],
                    [
                        2891,
                        12680
                    ],
                    [
                        2892,
                        12681
                    ],
                    [
                        2894,
                        12757
                    ],
                    [
                        2895,
                        12664
                    ],
                    [
                        2896,
                        12697
                    ],
                    [
                        2897,
                        12699
                    ],
                    [
                        2898,
                        12700
                    ],
                    [
                        2899,
                        12709
                    ],
                    [
                        2900,
                        12708
                    ],
                    [
                        2902,
                        12711
                    ],
                    [
                        2903,
                        12712
                    ],
                    [
                        2904,
                        12713
                    ],
                    [
                        2905,
                        12714
                    ],
                    [
                        2906,
                        12715
                    ],
                    [
                        2907,
                        12716
                    ],
                    [
                        2908,
                        12717
                    ],
                    [
                        2909,
                        12718
                    ],
                    [
                        2910,
                        12721
                    ],
                    [
                        2911,
                        12722
                    ],
                    [
                        2912,
                        12723
                    ],
                    [
                        2913,
                        12730
                    ],
                    [
                        2914,
                        12731
                    ],
                    [
                        2915,
                        12729
                    ],
                    [
                        2917,
                        12754
                    ],
                    [
                        2918,
                        12755
                    ],
                    [
                        2919,
                        12756
                    ],
                    [
                        2920,
                        12732
                    ],
                    [
                        2923,
                        12744
                    ],
                    [
                        2926,
                        12748
                    ],
                    [
                        2927,
                        12749
                    ],
                    [
                        2966,
                        10586
                    ],
                    [
                        3310,
                        16427
                    ],
                    [
                        3822,
                        20975
                    ],
                    [
                        3876,
                        21778
                    ],
                    [
                        4727,
                        30568
                    ],
                    [
                        4756,
                        30400
                    ],
                    [
                        4784,
                        30868
                    ],
                    [
                        4790,
                        30661
                    ],
                    [
                        4827,
                        30032
                    ],
                    [
                        4846,
                        29516
                    ],
                    [
                        4905,
                        30369
                    ],
                    [
                        4919,
                        31451
                    ],
                    [
                        4922,
                        31568
                    ],
                    [
                        4928,
                        31639
                    ],
                    [
                        4940,
                        31459
                    ],
                    [
                        4944,
                        31367
                    ],
                    [
                        4963,
                        31438
                    ],
                    [
                        5617,
                        45088
                    ],
                    [
                        5663,
                        46335
                    ],
                    [
                        5665,
                        44980
                    ],
                    [
                        5693,
                        45508
                    ],
                    [
                        5699,
                        43636
                    ],
                    [
                        5804,
                        41158
                    ],
                    [
                        5824,
                        42963
                    ],
                    [
                        5859,
                        42180
                    ],
                    [
                        5860,
                        41205
                    ],
                    [
                        5920,
                        41372
                    ],
                    [
                        5942,
                        41156
                    ]
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2Profession>(
            """
            {
                "id": "Elementalist",
                "name": "Elementarmagier",
                "code": 6,
                "icon": "https://render.guildwars2.com/file/77B793123251931AFF9FCA24C07E0F704BC4DA49/156630.png",
                "icon_big": "https://render.guildwars2.com/file/BBED46EB20C80D0DDE0F99402493C7E6FFAE1530/156629.png",
                "specializations": [
                    31,
                    41,
                    26,
                    17,
                    37,
                    48,
                    56
                ],
                "weapons": {
                    "Dagger": {
                        "flags": [
                            "Mainhand",
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 15718,
                                "slot": "Weapon_1",
                                "attunement": "Fire"
                            },
                            {
                                "id": 15716,
                                "slot": "Weapon_1",
                                "attunement": "Water"
                            },
                            {
                                "id": 5489,
                                "slot": "Weapon_1",
                                "attunement": "Air"
                            },
                            {
                                "id": 15717,
                                "slot": "Weapon_1",
                                "attunement": "Earth"
                            },
                            {
                                "id": 5496,
                                "slot": "Weapon_2",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5537,
                                "slot": "Weapon_2",
                                "attunement": "Water"
                            },
                            {
                                "id": 5646,
                                "slot": "Weapon_2",
                                "attunement": "Air"
                            },
                            {
                                "id": 5525,
                                "slot": "Weapon_2",
                                "attunement": "Earth"
                            },
                            {
                                "id": 40963,
                                "slot": "Weapon_3",
                                "attunement": "Air"
                            },
                            {
                                "id": 46018,
                                "slot": "Weapon_3",
                                "attunement": "Water"
                            },
                            {
                                "id": 46140,
                                "slot": "Weapon_3",
                                "attunement": "Water"
                            },
                            {
                                "id": 42379,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 44652,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 42330,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5644,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5487,
                                "slot": "Weapon_3",
                                "attunement": "Water"
                            },
                            {
                                "id": 5527,
                                "slot": "Weapon_3",
                                "attunement": "Air"
                            },
                            {
                                "id": 5559,
                                "slot": "Weapon_3",
                                "attunement": "Earth"
                            },
                            {
                                "id": 5520,
                                "slot": "Weapon_4",
                                "attunement": "Water"
                            },
                            {
                                "id": 5691,
                                "slot": "Weapon_4",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5529,
                                "slot": "Weapon_4",
                                "attunement": "Air"
                            },
                            {
                                "id": 5690,
                                "slot": "Weapon_4",
                                "attunement": "Earth"
                            },
                            {
                                "id": 5557,
                                "slot": "Weapon_5",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5558,
                                "slot": "Weapon_5",
                                "attunement": "Water"
                            },
                            {
                                "id": 5687,
                                "slot": "Weapon_5",
                                "attunement": "Air"
                            },
                            {
                                "id": 5522,
                                "slot": "Weapon_5",
                                "attunement": "Earth"
                            }
                        ]
                    },
                    "Focus": {
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 5497,
                                "slot": "Weapon_4",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5556,
                                "slot": "Weapon_4",
                                "attunement": "Water"
                            },
                            {
                                "id": 5530,
                                "slot": "Weapon_4",
                                "attunement": "Air"
                            },
                            {
                                "id": 5555,
                                "slot": "Weapon_4",
                                "attunement": "Earth"
                            },
                            {
                                "id": 5678,
                                "slot": "Weapon_5",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5490,
                                "slot": "Weapon_5",
                                "attunement": "Water"
                            },
                            {
                                "id": 5562,
                                "slot": "Weapon_5",
                                "attunement": "Air"
                            },
                            {
                                "id": 5521,
                                "slot": "Weapon_5",
                                "attunement": "Earth"
                            }
                        ]
                    },
                    "Scepter": {
                        "flags": [
                            "Mainhand"
                        ],
                        "skills": [
                            {
                                "id": 5508,
                                "slot": "Weapon_1",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5693,
                                "slot": "Weapon_1",
                                "attunement": "Water"
                            },
                            {
                                "id": 5526,
                                "slot": "Weapon_1",
                                "attunement": "Air"
                            },
                            {
                                "id": 5500,
                                "slot": "Weapon_1",
                                "attunement": "Earth"
                            },
                            {
                                "id": 5692,
                                "slot": "Weapon_2",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5538,
                                "slot": "Weapon_2",
                                "attunement": "Water"
                            },
                            {
                                "id": 5561,
                                "slot": "Weapon_2",
                                "attunement": "Air"
                            },
                            {
                                "id": 5695,
                                "slot": "Weapon_2",
                                "attunement": "Earth"
                            },
                            {
                                "id": 40794,
                                "slot": "Weapon_3",
                                "attunement": "Air"
                            },
                            {
                                "id": 46014,
                                "slot": "Weapon_3",
                                "attunement": "Water"
                            },
                            {
                                "id": 45742,
                                "slot": "Weapon_3",
                                "attunement": "Water"
                            },
                            {
                                "id": 42954,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 43576,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 42181,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5675,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5510,
                                "slot": "Weapon_3",
                                "attunement": "Water"
                            },
                            {
                                "id": 5694,
                                "slot": "Weapon_3",
                                "attunement": "Air"
                            },
                            {
                                "id": 5696,
                                "slot": "Weapon_3",
                                "attunement": "Earth"
                            }
                        ]
                    },
                    "Staff": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 5491,
                                "slot": "Weapon_1",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5549,
                                "slot": "Weapon_1",
                                "attunement": "Water"
                            },
                            {
                                "id": 5518,
                                "slot": "Weapon_1",
                                "attunement": "Air"
                            },
                            {
                                "id": 5519,
                                "slot": "Weapon_1",
                                "attunement": "Earth"
                            },
                            {
                                "id": 5548,
                                "slot": "Weapon_2",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5550,
                                "slot": "Weapon_2",
                                "attunement": "Water"
                            },
                            {
                                "id": 5552,
                                "slot": "Weapon_2",
                                "attunement": "Air"
                            },
                            {
                                "id": 5528,
                                "slot": "Weapon_2",
                                "attunement": "Earth"
                            },
                            {
                                "id": 42321,
                                "slot": "Weapon_3",
                                "attunement": "Air"
                            },
                            {
                                "id": 44550,
                                "slot": "Weapon_3",
                                "attunement": "Water"
                            },
                            {
                                "id": 41184,
                                "slot": "Weapon_3",
                                "attunement": "Water"
                            },
                            {
                                "id": 43762,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 41125,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 40332,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5679,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5681,
                                "slot": "Weapon_3",
                                "attunement": "Water"
                            },
                            {
                                "id": 5553,
                                "slot": "Weapon_3",
                                "attunement": "Air"
                            },
                            {
                                "id": 5685,
                                "slot": "Weapon_3",
                                "attunement": "Earth"
                            },
                            {
                                "id": 5680,
                                "slot": "Weapon_4",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5515,
                                "slot": "Weapon_4",
                                "attunement": "Water"
                            },
                            {
                                "id": 5682,
                                "slot": "Weapon_4",
                                "attunement": "Air"
                            },
                            {
                                "id": 5683,
                                "slot": "Weapon_4",
                                "attunement": "Earth"
                            },
                            {
                                "id": 5501,
                                "slot": "Weapon_5",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5551,
                                "slot": "Weapon_5",
                                "attunement": "Water"
                            },
                            {
                                "id": 5671,
                                "slot": "Weapon_5",
                                "attunement": "Air"
                            },
                            {
                                "id": 5686,
                                "slot": "Weapon_5",
                                "attunement": "Earth"
                            }
                        ]
                    },
                    "Sword": {
                        "specialization": 56,
                        "flags": [
                            "Mainhand"
                        ],
                        "skills": [
                            {
                                "id": 39964,
                                "slot": "Weapon_1",
                                "attunement": "Fire"
                            },
                            {
                                "id": 41052,
                                "slot": "Weapon_1",
                                "attunement": "Water"
                            },
                            {
                                "id": 44681,
                                "slot": "Weapon_1",
                                "attunement": "Air"
                            },
                            {
                                "id": 43616,
                                "slot": "Weapon_1",
                                "attunement": "Earth"
                            },
                            {
                                "id": 45313,
                                "slot": "Weapon_2",
                                "attunement": "Fire"
                            },
                            {
                                "id": 44405,
                                "slot": "Weapon_2",
                                "attunement": "Water"
                            },
                            {
                                "id": 44998,
                                "slot": "Weapon_2",
                                "attunement": "Air"
                            },
                            {
                                "id": 40709,
                                "slot": "Weapon_2",
                                "attunement": "Earth"
                            },
                            {
                                "id": 42271,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 43074,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 46447,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 42867,
                                "slot": "Weapon_3",
                                "attunement": "Water"
                            },
                            {
                                "id": 40170,
                                "slot": "Weapon_3",
                                "attunement": "Water"
                            },
                            {
                                "id": 46295,
                                "slot": "Weapon_3",
                                "attunement": "Air"
                            },
                            {
                                "id": 44451,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 41167,
                                "slot": "Weapon_3",
                                "attunement": "Water"
                            },
                            {
                                "id": 43803,
                                "slot": "Weapon_3",
                                "attunement": "Air"
                            },
                            {
                                "id": 40139,
                                "slot": "Weapon_3",
                                "attunement": "Earth"
                            }
                        ]
                    },
                    "Trident": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 5598,
                                "slot": "Weapon_1",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5604,
                                "slot": "Weapon_1",
                                "attunement": "Water"
                            },
                            {
                                "id": 5656,
                                "slot": "Weapon_1",
                                "attunement": "Air"
                            },
                            {
                                "id": 5657,
                                "slot": "Weapon_1",
                                "attunement": "Earth"
                            },
                            {
                                "id": 5597,
                                "slot": "Weapon_2",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5605,
                                "slot": "Weapon_2",
                                "attunement": "Water"
                            },
                            {
                                "id": 5655,
                                "slot": "Weapon_2",
                                "attunement": "Air"
                            },
                            {
                                "id": 5658,
                                "slot": "Weapon_2",
                                "attunement": "Earth"
                            },
                            {
                                "id": 40378,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 41712,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 46185,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 46360,
                                "slot": "Weapon_3",
                                "attunement": "Water"
                            },
                            {
                                "id": 41001,
                                "slot": "Weapon_3",
                                "attunement": "Water"
                            },
                            {
                                "id": 39981,
                                "slot": "Weapon_3",
                                "attunement": "Air"
                            },
                            {
                                "id": 5566,
                                "slot": "Weapon_3",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5606,
                                "slot": "Weapon_3",
                                "attunement": "Water"
                            },
                            {
                                "id": 5652,
                                "slot": "Weapon_3",
                                "attunement": "Air"
                            },
                            {
                                "id": 5662,
                                "slot": "Weapon_3",
                                "attunement": "Earth"
                            },
                            {
                                "id": 5599,
                                "slot": "Weapon_4",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5748,
                                "slot": "Weapon_4",
                                "attunement": "Water"
                            },
                            {
                                "id": 5648,
                                "slot": "Weapon_4",
                                "attunement": "Air"
                            },
                            {
                                "id": 5659,
                                "slot": "Weapon_4",
                                "attunement": "Earth"
                            },
                            {
                                "id": 5600,
                                "slot": "Weapon_5",
                                "attunement": "Fire"
                            },
                            {
                                "id": 5607,
                                "slot": "Weapon_5",
                                "attunement": "Water"
                            },
                            {
                                "id": 5650,
                                "slot": "Weapon_5",
                                "attunement": "Air"
                            },
                            {
                                "id": 5661,
                                "slot": "Weapon_5",
                                "attunement": "Earth"
                            }
                        ]
                    },
                    "Warhorn": {
                        "specialization": 48,
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 29548,
                                "slot": "Weapon_4",
                                "attunement": "Fire"
                            },
                            {
                                "id": 30864,
                                "slot": "Weapon_4",
                                "attunement": "Water"
                            },
                            {
                                "id": 30008,
                                "slot": "Weapon_4",
                                "attunement": "Air"
                            },
                            {
                                "id": 29453,
                                "slot": "Weapon_4",
                                "attunement": "Earth"
                            },
                            {
                                "id": 29533,
                                "slot": "Weapon_5",
                                "attunement": "Fire"
                            },
                            {
                                "id": 30446,
                                "slot": "Weapon_5",
                                "attunement": "Water"
                            },
                            {
                                "id": 30795,
                                "slot": "Weapon_5",
                                "attunement": "Air"
                            },
                            {
                                "id": 30336,
                                "slot": "Weapon_5",
                                "attunement": "Earth"
                            }
                        ]
                    }
                },
                "flags": [
                    "NoWeaponSwap"
                ],
                "skills": [
                    {
                        "id": 5494,
                        "slot": "Profession_3",
                        "type": "Profession",
                        "attunement": "Air"
                    },
                    {
                        "id": 5495,
                        "slot": "Profession_4",
                        "type": "Profession",
                        "attunement": "Earth"
                    },
                    {
                        "id": 5492,
                        "slot": "Profession_1",
                        "type": "Profession",
                        "attunement": "Fire"
                    },
                    {
                        "id": 5493,
                        "slot": "Profession_2",
                        "type": "Profession",
                        "attunement": "Water"
                    },
                    {
                        "id": 5569,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 5507,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 5503,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 21656,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 5638,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5641,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5635,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5539,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5506,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5734,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5502,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5573,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5542,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5570,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5572,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5571,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5535,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5554,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5536,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5639,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5540,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5567,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5624,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5546,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 5666,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 5516,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 5534,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 29535,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 30662,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 29948,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30047,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30432,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 29968,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 44239,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 43638,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 44926,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 44612,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 45746,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 40183,
                        "slot": "Utility",
                        "type": "Utility"
                    }
                ],
                "training": [
                    {
                        "id": 33,
                        "category": "Skills",
                        "name": "Beschwörungs-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 5540
                            },
                            {
                                "cost": 5,
                                "type": "Skill",
                                "skill_id": 5624
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 5546
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 5567
                            },
                            {
                                "cost": 22,
                                "type": "Skill",
                                "skill_id": 5516
                            }
                        ]
                    },
                    {
                        "id": 111,
                        "category": "Skills",
                        "name": "Glyphen-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 5569
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 5734
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 5502
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 5506
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 5573
                            },
                            {
                                "cost": 24,
                                "type": "Skill",
                                "skill_id": 5666
                            }
                        ]
                    },
                    {
                        "id": 115,
                        "category": "Skills",
                        "name": "Siegel-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 5542
                            },
                            {
                                "cost": 5,
                                "type": "Skill",
                                "skill_id": 5572
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 5571
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 5570
                            }
                        ]
                    },
                    {
                        "id": 86,
                        "category": "Skills",
                        "name": "Schwarzmagie-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 5507
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 5535
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 5536
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 5639
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 5554
                            },
                            {
                                "cost": 24,
                                "type": "Skill",
                                "skill_id": 5534
                            }
                        ]
                    },
                    {
                        "id": 107,
                        "category": "Skills",
                        "name": "Arkane Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 21656
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 5539
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 5635
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 5641
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 5638
                            }
                        ]
                    },
                    {
                        "id": 34,
                        "category": "Specializations",
                        "name": "Feuer",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 320
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 296
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 328
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 335
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 318
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 325
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 340
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 334
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 319
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1510
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 294
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1675
                            }
                        ]
                    },
                    {
                        "id": 69,
                        "category": "Specializations",
                        "name": "Luft",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 221
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 227
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 224
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 232
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 222
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 229
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 214
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1502
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 223
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 226
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1503
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1672
                            }
                        ]
                    },
                    {
                        "id": 36,
                        "category": "Specializations",
                        "name": "Erde",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 278
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 282
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1507
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 289
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 279
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 275
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 281
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 277
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 280
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1508
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 287
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1674
                            }
                        ]
                    },
                    {
                        "id": 39,
                        "category": "Specializations",
                        "name": "Wasser",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 350
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 348
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 363
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 360
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 351
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 364
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 358
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 349
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1676
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 362
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 361
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 2028
                            }
                        ]
                    },
                    {
                        "id": 93,
                        "category": "Specializations",
                        "name": "Arkan",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 268
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 253
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 266
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1487
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 264
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 265
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1673
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 257
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 2004
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 238
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 263
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1511
                            }
                        ]
                    },
                    {
                        "id": 31,
                        "category": "EliteSpecializations",
                        "name": "Sturmbote",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 2036
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 2025
                            },
                            {
                                "cost": 55,
                                "type": "Skill",
                                "skill_id": 29535
                            },
                            {
                                "cost": 65,
                                "type": "Trait",
                                "trait_id": 1952
                            },
                            {
                                "cost": 75,
                                "type": "Trait",
                                "trait_id": 1962
                            },
                            {
                                "cost": 85,
                                "type": "Trait",
                                "trait_id": 1886
                            },
                            {
                                "cost": 95,
                                "type": "Trait",
                                "trait_id": 1938
                            },
                            {
                                "cost": 110,
                                "type": "Skill",
                                "skill_id": 30662
                            },
                            {
                                "cost": 125,
                                "type": "Skill",
                                "skill_id": 30047
                            },
                            {
                                "cost": 135,
                                "type": "Trait",
                                "trait_id": 1891
                            },
                            {
                                "cost": 145,
                                "type": "Trait",
                                "trait_id": 1902
                            },
                            {
                                "cost": 155,
                                "type": "Trait",
                                "trait_id": 2015
                            },
                            {
                                "cost": 165,
                                "type": "Trait",
                                "trait_id": 1948
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 30432
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 1839
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 2033
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 1986
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 29948
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 29968
                            }
                        ]
                    },
                    {
                        "id": 416,
                        "category": "EliteSpecializations",
                        "name": "Weber",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 2149
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 2109
                            },
                            {
                                "cost": 50,
                                "type": "Trait",
                                "trait_id": 2165
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 2077
                            },
                            {
                                "cost": 70,
                                "type": "Trait",
                                "trait_id": 2061
                            },
                            {
                                "cost": 80,
                                "type": "Trait",
                                "trait_id": 2081
                            },
                            {
                                "cost": 90,
                                "type": "Trait",
                                "trait_id": 2090
                            },
                            {
                                "cost": 105,
                                "type": "Skill",
                                "skill_id": 44239
                            },
                            {
                                "cost": 120,
                                "type": "Skill",
                                "skill_id": 44926
                            },
                            {
                                "cost": 130,
                                "type": "Trait",
                                "trait_id": 2177
                            },
                            {
                                "cost": 140,
                                "type": "Trait",
                                "trait_id": 2180
                            },
                            {
                                "cost": 150,
                                "type": "Trait",
                                "trait_id": 2131
                            },
                            {
                                "cost": 165,
                                "type": "Skill",
                                "skill_id": 44612
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 45746
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 2115
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 2170
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 2138
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 40183
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 43638
                            }
                        ]
                    }
                ],
                "skills_by_palette": [
                    [
                        1,
                        12343
                    ],
                    [
                        2,
                        12417
                    ],
                    [
                        3,
                        12371
                    ],
                    [
                        4,
                        12337
                    ],
                    [
                        7,
                        12373
                    ],
                    [
                        8,
                        12338
                    ],
                    [
                        9,
                        12318
                    ],
                    [
                        11,
                        12319
                    ],
                    [
                        12,
                        12320
                    ],
                    [
                        13,
                        12387
                    ],
                    [
                        14,
                        12323
                    ],
                    [
                        16,
                        12389
                    ],
                    [
                        17,
                        12325
                    ],
                    [
                        20,
                        12391
                    ],
                    [
                        21,
                        12440
                    ],
                    [
                        22,
                        12399
                    ],
                    [
                        23,
                        12447
                    ],
                    [
                        25,
                        12450
                    ],
                    [
                        28,
                        12453
                    ],
                    [
                        29,
                        12401
                    ],
                    [
                        30,
                        12456
                    ],
                    [
                        31,
                        12403
                    ],
                    [
                        32,
                        5939
                    ],
                    [
                        33,
                        12339
                    ],
                    [
                        34,
                        12340
                    ],
                    [
                        36,
                        12407
                    ],
                    [
                        37,
                        12457
                    ],
                    [
                        38,
                        5666
                    ],
                    [
                        47,
                        5522
                    ],
                    [
                        49,
                        5521
                    ],
                    [
                        86,
                        5696
                    ],
                    [
                        89,
                        5686
                    ],
                    [
                        90,
                        40139
                    ],
                    [
                        103,
                        30336
                    ],
                    [
                        111,
                        37873
                    ],
                    [
                        114,
                        5502
                    ],
                    [
                        115,
                        5506
                    ],
                    [
                        116,
                        5503
                    ],
                    [
                        117,
                        5507
                    ],
                    [
                        122,
                        5531
                    ],
                    [
                        124,
                        12380
                    ],
                    [
                        140,
                        35304
                    ],
                    [
                        142,
                        5535
                    ],
                    [
                        143,
                        5570
                    ],
                    [
                        144,
                        5536
                    ],
                    [
                        145,
                        5571
                    ],
                    [
                        150,
                        5534
                    ],
                    [
                        151,
                        5516
                    ],
                    [
                        152,
                        12385
                    ],
                    [
                        201,
                        5719
                    ],
                    [
                        202,
                        5540
                    ],
                    [
                        203,
                        5542
                    ],
                    [
                        210,
                        12360
                    ],
                    [
                        230,
                        5546
                    ],
                    [
                        235,
                        5554
                    ],
                    [
                        246,
                        5641
                    ],
                    [
                        251,
                        10586
                    ],
                    [
                        258,
                        5661
                    ],
                    [
                        261,
                        5567
                    ],
                    [
                        262,
                        5721
                    ],
                    [
                        272,
                        15863
                    ],
                    [
                        279,
                        5569
                    ],
                    [
                        284,
                        5572
                    ],
                    [
                        285,
                        5573
                    ],
                    [
                        287,
                        5603
                    ],
                    [
                        321,
                        5623
                    ],
                    [
                        322,
                        5624
                    ],
                    [
                        323,
                        5732
                    ],
                    [
                        324,
                        12361
                    ],
                    [
                        333,
                        5635
                    ],
                    [
                        334,
                        5638
                    ],
                    [
                        335,
                        5639
                    ],
                    [
                        336,
                        5539
                    ],
                    [
                        337,
                        12362
                    ],
                    [
                        338,
                        12363
                    ],
                    [
                        349,
                        12367
                    ],
                    [
                        369,
                        12324
                    ],
                    [
                        377,
                        10632
                    ],
                    [
                        379,
                        14490
                    ],
                    [
                        402,
                        6159
                    ],
                    [
                        446,
                        5734
                    ],
                    [
                        456,
                        12344
                    ],
                    [
                        457,
                        12346
                    ],
                    [
                        458,
                        10800
                    ],
                    [
                        468,
                        10375
                    ],
                    [
                        554,
                        1110
                    ],
                    [
                        555,
                        1162
                    ],
                    [
                        559,
                        1118
                    ],
                    [
                        563,
                        1123
                    ],
                    [
                        564,
                        1125
                    ],
                    [
                        568,
                        1129
                    ],
                    [
                        570,
                        1131
                    ],
                    [
                        579,
                        1139
                    ],
                    [
                        580,
                        1141
                    ],
                    [
                        583,
                        1148
                    ],
                    [
                        603,
                        1115
                    ],
                    [
                        2876,
                        12656
                    ],
                    [
                        2877,
                        12658
                    ],
                    [
                        2881,
                        12691
                    ],
                    [
                        2882,
                        12689
                    ],
                    [
                        2883,
                        12685
                    ],
                    [
                        2884,
                        12690
                    ],
                    [
                        2887,
                        12695
                    ],
                    [
                        2888,
                        12703
                    ],
                    [
                        2889,
                        12679
                    ],
                    [
                        2890,
                        12674
                    ],
                    [
                        2891,
                        12680
                    ],
                    [
                        2892,
                        12681
                    ],
                    [
                        2894,
                        12757
                    ],
                    [
                        2895,
                        12664
                    ],
                    [
                        2896,
                        12697
                    ],
                    [
                        2897,
                        12699
                    ],
                    [
                        2898,
                        12700
                    ],
                    [
                        2899,
                        12709
                    ],
                    [
                        2900,
                        12708
                    ],
                    [
                        2902,
                        12711
                    ],
                    [
                        2903,
                        12712
                    ],
                    [
                        2904,
                        12713
                    ],
                    [
                        2905,
                        12714
                    ],
                    [
                        2906,
                        12715
                    ],
                    [
                        2907,
                        12716
                    ],
                    [
                        2908,
                        12717
                    ],
                    [
                        2909,
                        12718
                    ],
                    [
                        2910,
                        12721
                    ],
                    [
                        2911,
                        12722
                    ],
                    [
                        2912,
                        12723
                    ],
                    [
                        2913,
                        12730
                    ],
                    [
                        2914,
                        12731
                    ],
                    [
                        2915,
                        12729
                    ],
                    [
                        2917,
                        12754
                    ],
                    [
                        2918,
                        12755
                    ],
                    [
                        2919,
                        12756
                    ],
                    [
                        2920,
                        12732
                    ],
                    [
                        2923,
                        12744
                    ],
                    [
                        2926,
                        12748
                    ],
                    [
                        2927,
                        12749
                    ],
                    [
                        2966,
                        10586
                    ],
                    [
                        3310,
                        16427
                    ],
                    [
                        3822,
                        20975
                    ],
                    [
                        3879,
                        21656
                    ],
                    [
                        4724,
                        30432
                    ],
                    [
                        4726,
                        30047
                    ],
                    [
                        4761,
                        29968
                    ],
                    [
                        4773,
                        29948
                    ],
                    [
                        4803,
                        30662
                    ],
                    [
                        4807,
                        29535
                    ],
                    [
                        4827,
                        30032
                    ],
                    [
                        4919,
                        31451
                    ],
                    [
                        4922,
                        31568
                    ],
                    [
                        4928,
                        31639
                    ],
                    [
                        4940,
                        31459
                    ],
                    [
                        4944,
                        31367
                    ],
                    [
                        4963,
                        31438
                    ],
                    [
                        5621,
                        45746
                    ],
                    [
                        5632,
                        44239
                    ],
                    [
                        5665,
                        44980
                    ],
                    [
                        5699,
                        43636
                    ],
                    [
                        5755,
                        44612
                    ],
                    [
                        5824,
                        42963
                    ],
                    [
                        5851,
                        44926
                    ],
                    [
                        5859,
                        42180
                    ],
                    [
                        5906,
                        43638
                    ],
                    [
                        5941,
                        40183
                    ],
                    [
                        5942,
                        41156
                    ]
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2Profession>(
            """
            {
                "id": "Mesmer",
                "name": "Mesmer",
                "code": 7,
                "icon": "https://render.guildwars2.com/file/E43730AD49A903C3A1B4F27E41DE04EA51A775EC/156636.png",
                "icon_big": "https://render.guildwars2.com/file/AF61567E16A83F145D6FB35D63BF01074A3A5AB9/156635.png",
                "specializations": [
                    10,
                    1,
                    45,
                    23,
                    24,
                    40,
                    59
                ],
                "weapons": {
                    "Axe": {
                        "specialization": 59,
                        "flags": [
                            "Mainhand"
                        ],
                        "skills": [
                            {
                                "id": 44791,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 45243,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 43761,
                                "slot": "Weapon_3"
                            }
                        ]
                    },
                    "Focus": {
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 10186,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 10282,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Greatsword": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 10219,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 10333,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 10218,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 10221,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 10220,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Spear": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 10315,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 10318,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 10251,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 10325,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 10255,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Pistol": {
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 10175,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 10229,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Scepter": {
                        "flags": [
                            "Mainhand"
                        ],
                        "skills": [
                            {
                                "id": 10289,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 10276,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 10168,
                                "slot": "Weapon_3"
                            }
                        ]
                    },
                    "Shield": {
                        "specialization": 40,
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 30769,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 30643,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Staff": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 10273,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 10310,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 10216,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 10331,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 10169,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Sword": {
                        "flags": [
                            "Mainhand",
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 10334,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 10173,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 10170,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 10280,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 10174,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Torch": {
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 10285,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 10189,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Trident": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 10258,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 10259,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 10327,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 10328,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 10260,
                                "slot": "Weapon_5"
                            }
                        ]
                    }
                },
                "flags": [],
                "skills": [
                    {
                        "id": 10192,
                        "slot": "Profession_4",
                        "type": "Profession"
                    },
                    {
                        "id": 10287,
                        "slot": "Profession_3",
                        "type": "Profession"
                    },
                    {
                        "id": 10190,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 10191,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 10176,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 10177,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 10213,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 21750,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 10236,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10232,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10234,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10247,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10211,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10204,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10207,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10237,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10200,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10185,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10244,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 29578,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10201,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10202,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10341,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10267,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10203,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10302,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10197,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10187,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 29519,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 10311,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 10245,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 56930,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 56928,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 56873,
                        "slot": "Profession_3",
                        "type": "Profession"
                    },
                    {
                        "id": 29830,
                        "slot": "Profession_4",
                        "type": "Profession"
                    },
                    {
                        "id": 30359,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 30305,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 29526,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30525,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 29856,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30814,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 40200,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 45449,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 45046,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 42851,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 43064,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 41065,
                        "slot": "Utility",
                        "type": "Utility"
                    }
                ],
                "training": [
                    {
                        "id": 98,
                        "category": "Skills",
                        "name": "Siegel-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 21750
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 10236
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 10232
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 10247
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 10234
                            },
                            {
                                "cost": 24,
                                "type": "Skill",
                                "skill_id": 29519
                            }
                        ]
                    },
                    {
                        "id": 35,
                        "category": "Skills",
                        "name": "Mantra-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 10213
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 10211
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 10207
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 10204
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 10237
                            }
                        ]
                    },
                    {
                        "id": 102,
                        "category": "Skills",
                        "name": "Manipulations-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 10177
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 10200
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 29578
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 10244
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 10185
                            },
                            {
                                "cost": 24,
                                "type": "Skill",
                                "skill_id": 10245
                            }
                        ]
                    },
                    {
                        "id": 73,
                        "category": "Skills",
                        "name": "Glamour-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 10187
                            },
                            {
                                "cost": 5,
                                "type": "Skill",
                                "skill_id": 10203
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 10302
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 10197
                            },
                            {
                                "cost": 22,
                                "type": "Skill",
                                "skill_id": 10311
                            }
                        ]
                    },
                    {
                        "id": 40,
                        "category": "Skills",
                        "name": "Illusion-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 10202
                            },
                            {
                                "cost": 5,
                                "type": "Skill",
                                "skill_id": 10341
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 10201
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 10267
                            }
                        ]
                    },
                    {
                        "id": 56,
                        "category": "Specializations",
                        "name": "Dominanz",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 685
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 686
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 682
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 687
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 694
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 693
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 713
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 712
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1941
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 681
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 680
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1688
                            }
                        ]
                    },
                    {
                        "id": 88,
                        "category": "Specializations",
                        "name": "Zweikampf",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 706
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 701
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 705
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 700
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 710
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1889
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1960
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 708
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 707
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 692
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1950
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 704
                            }
                        ]
                    },
                    {
                        "id": 47,
                        "category": "Specializations",
                        "name": "Chaos",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 666
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 670
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 675
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 677
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 667
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 673
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 668
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 669
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1865
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 671
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 674
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1687
                            }
                        ]
                    },
                    {
                        "id": 112,
                        "category": "Specializations",
                        "name": "Inspiration",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 757
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 756
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 738
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 744
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1852
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 751
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 740
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1980
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1915
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 2005
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1866
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 752
                            }
                        ]
                    },
                    {
                        "id": 81,
                        "category": "Specializations",
                        "name": "Illusionen",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 734
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 721
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1869
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 691
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 723
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 722
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 729
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1690
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 731
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 733
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 2035
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 753
                            }
                        ]
                    },
                    {
                        "id": 68,
                        "category": "EliteSpecializations",
                        "name": "Chronomant",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1910
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 2030
                            },
                            {
                                "cost": 55,
                                "type": "Skill",
                                "skill_id": 30305
                            },
                            {
                                "cost": 65,
                                "type": "Trait",
                                "trait_id": 1838
                            },
                            {
                                "cost": 75,
                                "type": "Trait",
                                "trait_id": 1995
                            },
                            {
                                "cost": 85,
                                "type": "Trait",
                                "trait_id": 1987
                            },
                            {
                                "cost": 95,
                                "type": "Trait",
                                "trait_id": 1927
                            },
                            {
                                "cost": 110,
                                "type": "Skill",
                                "skill_id": 30525
                            },
                            {
                                "cost": 125,
                                "type": "Skill",
                                "skill_id": 30814
                            },
                            {
                                "cost": 135,
                                "type": "Trait",
                                "trait_id": 2009
                            },
                            {
                                "cost": 145,
                                "type": "Trait",
                                "trait_id": 1913
                            },
                            {
                                "cost": 155,
                                "type": "Trait",
                                "trait_id": 1978
                            },
                            {
                                "cost": 165,
                                "type": "Trait",
                                "trait_id": 1859
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 29856
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 1942
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 2022
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 1890
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 29526
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 30359
                            }
                        ]
                    },
                    {
                        "id": 405,
                        "category": "EliteSpecializations",
                        "name": "Illusionist",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 2087
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 2150
                            },
                            {
                                "cost": 55,
                                "type": "Trait",
                                "trait_id": 2082
                            },
                            {
                                "cost": 65,
                                "type": "Trait",
                                "trait_id": 2069
                            },
                            {
                                "cost": 75,
                                "type": "Trait",
                                "trait_id": 2174
                            },
                            {
                                "cost": 85,
                                "type": "Trait",
                                "trait_id": 2117
                            },
                            {
                                "cost": 95,
                                "type": "Trait",
                                "trait_id": 2113
                            },
                            {
                                "cost": 110,
                                "type": "Skill",
                                "skill_id": 40200
                            },
                            {
                                "cost": 125,
                                "type": "Skill",
                                "skill_id": 45046
                            },
                            {
                                "cost": 135,
                                "type": "Trait",
                                "trait_id": 2141
                            },
                            {
                                "cost": 145,
                                "type": "Trait",
                                "trait_id": 2178
                            },
                            {
                                "cost": 155,
                                "type": "Trait",
                                "trait_id": 2070
                            },
                            {
                                "cost": 165,
                                "type": "Skill",
                                "skill_id": 42851
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 43064
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 2110
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 2098
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 2169
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 41065
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 45449
                            }
                        ]
                    }
                ],
                "skills_by_palette": [
                    [
                        1,
                        12343
                    ],
                    [
                        2,
                        12417
                    ],
                    [
                        3,
                        12371
                    ],
                    [
                        4,
                        12337
                    ],
                    [
                        5,
                        43761
                    ],
                    [
                        7,
                        12373
                    ],
                    [
                        8,
                        12338
                    ],
                    [
                        9,
                        12318
                    ],
                    [
                        11,
                        12319
                    ],
                    [
                        12,
                        12320
                    ],
                    [
                        13,
                        12387
                    ],
                    [
                        14,
                        12323
                    ],
                    [
                        16,
                        12389
                    ],
                    [
                        17,
                        12325
                    ],
                    [
                        20,
                        12391
                    ],
                    [
                        21,
                        12440
                    ],
                    [
                        22,
                        12399
                    ],
                    [
                        23,
                        12447
                    ],
                    [
                        25,
                        12450
                    ],
                    [
                        28,
                        12453
                    ],
                    [
                        29,
                        12401
                    ],
                    [
                        30,
                        12456
                    ],
                    [
                        31,
                        12403
                    ],
                    [
                        32,
                        5939
                    ],
                    [
                        33,
                        12339
                    ],
                    [
                        34,
                        12340
                    ],
                    [
                        36,
                        12407
                    ],
                    [
                        37,
                        12457
                    ],
                    [
                        49,
                        10282
                    ],
                    [
                        50,
                        10220
                    ],
                    [
                        54,
                        10229
                    ],
                    [
                        86,
                        10168
                    ],
                    [
                        87,
                        30643
                    ],
                    [
                        89,
                        10169
                    ],
                    [
                        90,
                        10174
                    ],
                    [
                        102,
                        10189
                    ],
                    [
                        111,
                        37873
                    ],
                    [
                        122,
                        5531
                    ],
                    [
                        124,
                        12380
                    ],
                    [
                        140,
                        35304
                    ],
                    [
                        152,
                        12385
                    ],
                    [
                        201,
                        5719
                    ],
                    [
                        210,
                        12360
                    ],
                    [
                        251,
                        10586
                    ],
                    [
                        258,
                        10260
                    ],
                    [
                        262,
                        5721
                    ],
                    [
                        265,
                        10255
                    ],
                    [
                        271,
                        10177
                    ],
                    [
                        272,
                        15863
                    ],
                    [
                        280,
                        10185
                    ],
                    [
                        282,
                        10187
                    ],
                    [
                        287,
                        5603
                    ],
                    [
                        316,
                        10192
                    ],
                    [
                        321,
                        5623
                    ],
                    [
                        323,
                        5732
                    ],
                    [
                        324,
                        12361
                    ],
                    [
                        337,
                        12362
                    ],
                    [
                        338,
                        12363
                    ],
                    [
                        349,
                        12367
                    ],
                    [
                        356,
                        10197
                    ],
                    [
                        357,
                        10200
                    ],
                    [
                        358,
                        10201
                    ],
                    [
                        359,
                        10204
                    ],
                    [
                        360,
                        10207
                    ],
                    [
                        361,
                        10211
                    ],
                    [
                        362,
                        10203
                    ],
                    [
                        363,
                        10202
                    ],
                    [
                        365,
                        10213
                    ],
                    [
                        366,
                        10176
                    ],
                    [
                        369,
                        12324
                    ],
                    [
                        377,
                        10632
                    ],
                    [
                        379,
                        14490
                    ],
                    [
                        383,
                        10302
                    ],
                    [
                        384,
                        10236
                    ],
                    [
                        385,
                        10232
                    ],
                    [
                        386,
                        10247
                    ],
                    [
                        387,
                        10234
                    ],
                    [
                        388,
                        10244
                    ],
                    [
                        389,
                        10237
                    ],
                    [
                        390,
                        10341
                    ],
                    [
                        399,
                        10267
                    ],
                    [
                        402,
                        6159
                    ],
                    [
                        410,
                        10245
                    ],
                    [
                        438,
                        29578
                    ],
                    [
                        444,
                        10311
                    ],
                    [
                        456,
                        12344
                    ],
                    [
                        457,
                        12346
                    ],
                    [
                        458,
                        10800
                    ],
                    [
                        468,
                        10375
                    ],
                    [
                        554,
                        1110
                    ],
                    [
                        555,
                        1162
                    ],
                    [
                        559,
                        1118
                    ],
                    [
                        563,
                        1123
                    ],
                    [
                        564,
                        1125
                    ],
                    [
                        568,
                        1129
                    ],
                    [
                        570,
                        1131
                    ],
                    [
                        579,
                        1139
                    ],
                    [
                        580,
                        1141
                    ],
                    [
                        583,
                        1148
                    ],
                    [
                        603,
                        1115
                    ],
                    [
                        2876,
                        12656
                    ],
                    [
                        2877,
                        12658
                    ],
                    [
                        2881,
                        12691
                    ],
                    [
                        2882,
                        12689
                    ],
                    [
                        2883,
                        12685
                    ],
                    [
                        2884,
                        12690
                    ],
                    [
                        2887,
                        12695
                    ],
                    [
                        2888,
                        12703
                    ],
                    [
                        2889,
                        12679
                    ],
                    [
                        2890,
                        12674
                    ],
                    [
                        2891,
                        12680
                    ],
                    [
                        2892,
                        12681
                    ],
                    [
                        2894,
                        12757
                    ],
                    [
                        2895,
                        12664
                    ],
                    [
                        2896,
                        12697
                    ],
                    [
                        2897,
                        12699
                    ],
                    [
                        2898,
                        12700
                    ],
                    [
                        2899,
                        12709
                    ],
                    [
                        2900,
                        12708
                    ],
                    [
                        2902,
                        12711
                    ],
                    [
                        2903,
                        12712
                    ],
                    [
                        2904,
                        12713
                    ],
                    [
                        2905,
                        12714
                    ],
                    [
                        2906,
                        12715
                    ],
                    [
                        2907,
                        12716
                    ],
                    [
                        2908,
                        12717
                    ],
                    [
                        2909,
                        12718
                    ],
                    [
                        2910,
                        12721
                    ],
                    [
                        2911,
                        12722
                    ],
                    [
                        2912,
                        12723
                    ],
                    [
                        2913,
                        12730
                    ],
                    [
                        2914,
                        12731
                    ],
                    [
                        2915,
                        12729
                    ],
                    [
                        2917,
                        12754
                    ],
                    [
                        2918,
                        12755
                    ],
                    [
                        2919,
                        12756
                    ],
                    [
                        2920,
                        12732
                    ],
                    [
                        2923,
                        12744
                    ],
                    [
                        2926,
                        12748
                    ],
                    [
                        2927,
                        12749
                    ],
                    [
                        2966,
                        10586
                    ],
                    [
                        3310,
                        16427
                    ],
                    [
                        3822,
                        20975
                    ],
                    [
                        3875,
                        21750
                    ],
                    [
                        4743,
                        29856
                    ],
                    [
                        4755,
                        29526
                    ],
                    [
                        4787,
                        30359
                    ],
                    [
                        4815,
                        30814
                    ],
                    [
                        4827,
                        30032
                    ],
                    [
                        4845,
                        29519
                    ],
                    [
                        4848,
                        30305
                    ],
                    [
                        4868,
                        30525
                    ],
                    [
                        4919,
                        31451
                    ],
                    [
                        4922,
                        31568
                    ],
                    [
                        4928,
                        31639
                    ],
                    [
                        4940,
                        31459
                    ],
                    [
                        4944,
                        31367
                    ],
                    [
                        4963,
                        31438
                    ],
                    [
                        5600,
                        41065
                    ],
                    [
                        5614,
                        40200
                    ],
                    [
                        5639,
                        43064
                    ],
                    [
                        5665,
                        44980
                    ],
                    [
                        5699,
                        43636
                    ],
                    [
                        5770,
                        45046
                    ],
                    [
                        5810,
                        42851
                    ],
                    [
                        5824,
                        42963
                    ],
                    [
                        5859,
                        42180
                    ],
                    [
                        5942,
                        41156
                    ],
                    [
                        5958,
                        44677
                    ]
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2Profession>(
            """
            {
                "id": "Necromancer",
                "name": "Nekromant",
                "code": 8,
                "icon": "https://render.guildwars2.com/file/AE56F8670807B87CF6EEE3FC7E6CB9710959E004/156638.png",
                "icon_big": "https://render.guildwars2.com/file/CA5A4E96080FCF057C9DA0ED35C693477580421C/156637.png",
                "specializations": [
                    53,
                    39,
                    2,
                    19,
                    50,
                    34,
                    60
                ],
                "weapons": {
                    "Axe": {
                        "flags": [
                            "Mainhand"
                        ],
                        "skills": [
                            {
                                "id": 10561,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 10528,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 10701,
                                "slot": "Weapon_3"
                            }
                        ]
                    },
                    "Dagger": {
                        "flags": [
                            "Mainhand",
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 10702,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 10563,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 10529,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 10705,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 10706,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Focus": {
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 55050,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 10555,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Greatsword": {
                        "specialization": 34,
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 29705,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 30163,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 30860,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 29855,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 29740,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Spear": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 10692,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 10694,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 10619,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 10695,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 10616,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Scepter": {
                        "flags": [
                            "Mainhand"
                        ],
                        "skills": [
                            {
                                "id": 10698,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 10532,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 10709,
                                "slot": "Weapon_3"
                            }
                        ]
                    },
                    "Staff": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 10596,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 19117,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 10605,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 19116,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 19115,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Torch": {
                        "specialization": 60,
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 45846,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 44296,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Trident": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 10623,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 10624,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 10625,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 10628,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 10629,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Warhorn": {
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 10556,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 10557,
                                "slot": "Weapon_5"
                            }
                        ]
                    }
                },
                "flags": [],
                "skills": [
                    {
                        "id": 10547,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 10548,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 10527,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 21762,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 10546,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10545,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10609,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10607,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10541,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10533,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10589,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10543,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10622,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10612,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10562,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10611,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10583,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10620,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10608,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10685,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10689,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10606,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10602,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10544,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 10574,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 10554,
                        "slot": "Downed_1",
                        "type": "Profession"
                    },
                    {
                        "id": 10690,
                        "slot": "Downed_1",
                        "type": "Profession"
                    },
                    {
                        "id": 10549,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 10646,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 10550,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 30792,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 29442,
                        "slot": "Downed_1",
                        "type": "Profession"
                    },
                    {
                        "id": 29458,
                        "slot": "Downed_1",
                        "type": "Profession"
                    },
                    {
                        "id": 30278,
                        "slot": "Downed_1",
                        "type": "Profession"
                    },
                    {
                        "id": 30825,
                        "slot": "Downed_2",
                        "type": "Profession"
                    },
                    {
                        "id": 29958,
                        "slot": "Downed_3",
                        "type": "Profession"
                    },
                    {
                        "id": 30504,
                        "slot": "Downed_4",
                        "type": "Profession"
                    },
                    {
                        "id": 30557,
                        "slot": "Weapon_5",
                        "type": "Profession"
                    },
                    {
                        "id": 29414,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30670,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 29666,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30772,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 30488,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 30105,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 43148,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 42355,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 40274,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 42935,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 42917,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 41615,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 40813,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 43448,
                        "slot": "Profession_3",
                        "type": "Profession"
                    },
                    {
                        "id": 44428,
                        "slot": "Profession_4",
                        "type": "Profession"
                    },
                    {
                        "id": 44663,
                        "slot": "Profession_5",
                        "type": "Profession"
                    },
                    {
                        "id": 44946,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 42297,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 46474,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 46473,
                        "slot": "Profession_1",
                        "type": "Profession"
                    }
                ],
                "training": [
                    {
                        "id": 23,
                        "category": "Skills",
                        "name": "Siegel-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 21762
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 10612
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 10622
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 10562
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 10611
                            }
                        ]
                    },
                    {
                        "id": 110,
                        "category": "Skills",
                        "name": "Verderbnis-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 10689
                            },
                            {
                                "cost": 5,
                                "type": "Skill",
                                "skill_id": 10602
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 10544
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 10606
                            },
                            {
                                "cost": 22,
                                "type": "Skill",
                                "skill_id": 10549
                            }
                        ]
                    },
                    {
                        "id": 29,
                        "category": "Skills",
                        "name": "Diener-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 10547
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 10541
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 10533
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 10589
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 10543
                            },
                            {
                                "cost": 24,
                                "type": "Skill",
                                "skill_id": 10646
                            }
                        ]
                    },
                    {
                        "id": 79,
                        "category": "Skills",
                        "name": "Brunnen-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 10527
                            },
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 10546
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 10607
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 10545
                            },
                            {
                                "cost": 15,
                                "type": "Skill",
                                "skill_id": 10609
                            }
                        ]
                    },
                    {
                        "id": 38,
                        "category": "Skills",
                        "name": "Spektral-Ausbildung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Skill",
                                "skill_id": 10620
                            },
                            {
                                "cost": 5,
                                "type": "Skill",
                                "skill_id": 10583
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 10608
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 10685
                            },
                            {
                                "cost": 22,
                                "type": "Skill",
                                "skill_id": 10550
                            }
                        ]
                    },
                    {
                        "id": 44,
                        "category": "Specializations",
                        "name": "Bosheit",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 913
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 914
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 916
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1863
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 915
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 899
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 829
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 909
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 917
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 919
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 853
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 903
                            }
                        ]
                    },
                    {
                        "id": 22,
                        "category": "Specializations",
                        "name": "Flüche",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 802
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1883
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 2013
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 815
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 803
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 816
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1693
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 812
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 810
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 813
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1696
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 801
                            }
                        ]
                    },
                    {
                        "id": 80,
                        "category": "Specializations",
                        "name": "Todesmagie",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 856
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 820
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 857
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1922
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 839
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 858
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 860
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 855
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1929
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 842
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1940
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1694
                            }
                        ]
                    },
                    {
                        "id": 28,
                        "category": "Specializations",
                        "name": "Blutmagie",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 792
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 780
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 788
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1876
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 783
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 789
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 799
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1844
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1931
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 782
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1692
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 778
                            }
                        ]
                    },
                    {
                        "id": 57,
                        "category": "Specializations",
                        "name": "Seelenernte",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 887
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 875
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 898
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 888
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 891
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 894
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 861
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 892
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 874
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 889
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 893
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 905
                            }
                        ]
                    },
                    {
                        "id": 108,
                        "category": "EliteSpecializations",
                        "name": "Schnitter",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1985
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 1905
                            },
                            {
                                "cost": 55,
                                "type": "Skill",
                                "skill_id": 30488
                            },
                            {
                                "cost": 65,
                                "type": "Trait",
                                "trait_id": 1974
                            },
                            {
                                "cost": 75,
                                "type": "Trait",
                                "trait_id": 2020
                            },
                            {
                                "cost": 85,
                                "type": "Trait",
                                "trait_id": 2026
                            },
                            {
                                "cost": 95,
                                "type": "Trait",
                                "trait_id": 1879
                            },
                            {
                                "cost": 110,
                                "type": "Skill",
                                "skill_id": 29414
                            },
                            {
                                "cost": 125,
                                "type": "Skill",
                                "skill_id": 30670
                            },
                            {
                                "cost": 135,
                                "type": "Trait",
                                "trait_id": 1969
                            },
                            {
                                "cost": 145,
                                "type": "Trait",
                                "trait_id": 2008
                            },
                            {
                                "cost": 155,
                                "type": "Trait",
                                "trait_id": 2031
                            },
                            {
                                "cost": 165,
                                "type": "Trait",
                                "trait_id": 2018
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 29666
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 1932
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 1919
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 2021
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 30772
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 30105
                            }
                        ]
                    },
                    {
                        "id": 412,
                        "category": "EliteSpecializations",
                        "name": "Pestbringer",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 2144
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 2147
                            },
                            {
                                "cost": 50,
                                "type": "Trait",
                                "trait_id": 2074
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 2121
                            },
                            {
                                "cost": 70,
                                "type": "Trait",
                                "trait_id": 2067
                            },
                            {
                                "cost": 80,
                                "type": "Trait",
                                "trait_id": 2096
                            },
                            {
                                "cost": 90,
                                "type": "Trait",
                                "trait_id": 2164
                            },
                            {
                                "cost": 105,
                                "type": "Skill",
                                "skill_id": 43148
                            },
                            {
                                "cost": 120,
                                "type": "Skill",
                                "skill_id": 40274
                            },
                            {
                                "cost": 130,
                                "type": "Trait",
                                "trait_id": 2167
                            },
                            {
                                "cost": 140,
                                "type": "Trait",
                                "trait_id": 2059
                            },
                            {
                                "cost": 150,
                                "type": "Trait",
                                "trait_id": 2112
                            },
                            {
                                "cost": 165,
                                "type": "Skill",
                                "skill_id": 42935
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 42917
                            },
                            {
                                "cost": 190,
                                "type": "Trait",
                                "trait_id": 2102
                            },
                            {
                                "cost": 200,
                                "type": "Trait",
                                "trait_id": 2123
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 2080
                            },
                            {
                                "cost": 225,
                                "type": "Skill",
                                "skill_id": 41615
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 42355
                            }
                        ]
                    }
                ],
                "skills_by_palette": [
                    [
                        1,
                        12343
                    ],
                    [
                        2,
                        12417
                    ],
                    [
                        3,
                        12371
                    ],
                    [
                        4,
                        12337
                    ],
                    [
                        5,
                        10701
                    ],
                    [
                        7,
                        12373
                    ],
                    [
                        8,
                        12338
                    ],
                    [
                        9,
                        12318
                    ],
                    [
                        11,
                        12319
                    ],
                    [
                        12,
                        12320
                    ],
                    [
                        13,
                        12387
                    ],
                    [
                        14,
                        12323
                    ],
                    [
                        16,
                        12389
                    ],
                    [
                        17,
                        12325
                    ],
                    [
                        18,
                        10527
                    ],
                    [
                        20,
                        12391
                    ],
                    [
                        21,
                        12440
                    ],
                    [
                        22,
                        12399
                    ],
                    [
                        23,
                        12447
                    ],
                    [
                        25,
                        12450
                    ],
                    [
                        28,
                        12453
                    ],
                    [
                        29,
                        12401
                    ],
                    [
                        30,
                        12456
                    ],
                    [
                        31,
                        12403
                    ],
                    [
                        32,
                        5939
                    ],
                    [
                        33,
                        12339
                    ],
                    [
                        34,
                        12340
                    ],
                    [
                        36,
                        12407
                    ],
                    [
                        37,
                        12457
                    ],
                    [
                        47,
                        10706
                    ],
                    [
                        49,
                        10555
                    ],
                    [
                        50,
                        29740
                    ],
                    [
                        86,
                        10709
                    ],
                    [
                        89,
                        19115
                    ],
                    [
                        102,
                        44296
                    ],
                    [
                        103,
                        10557
                    ],
                    [
                        111,
                        37873
                    ],
                    [
                        118,
                        10533
                    ],
                    [
                        122,
                        5531
                    ],
                    [
                        124,
                        12380
                    ],
                    [
                        128,
                        10544
                    ],
                    [
                        129,
                        10546
                    ],
                    [
                        139,
                        10689
                    ],
                    [
                        140,
                        35304
                    ],
                    [
                        146,
                        10549
                    ],
                    [
                        149,
                        10646
                    ],
                    [
                        152,
                        12385
                    ],
                    [
                        155,
                        10547
                    ],
                    [
                        162,
                        10548
                    ],
                    [
                        201,
                        5719
                    ],
                    [
                        210,
                        12360
                    ],
                    [
                        228,
                        10541
                    ],
                    [
                        234,
                        19504
                    ],
                    [
                        245,
                        10562
                    ],
                    [
                        250,
                        10583
                    ],
                    [
                        251,
                        10586
                    ],
                    [
                        258,
                        10629
                    ],
                    [
                        262,
                        5721
                    ],
                    [
                        265,
                        10616
                    ],
                    [
                        272,
                        15863
                    ],
                    [
                        287,
                        5603
                    ],
                    [
                        302,
                        10543
                    ],
                    [
                        304,
                        10602
                    ],
                    [
                        320,
                        10607
                    ],
                    [
                        321,
                        5623
                    ],
                    [
                        323,
                        5732
                    ],
                    [
                        324,
                        12361
                    ],
                    [
                        337,
                        12362
                    ],
                    [
                        338,
                        12363
                    ],
                    [
                        349,
                        12367
                    ],
                    [
                        364,
                        10608
                    ],
                    [
                        367,
                        10611
                    ],
                    [
                        368,
                        10589
                    ],
                    [
                        369,
                        12324
                    ],
                    [
                        371,
                        10545
                    ],
                    [
                        372,
                        10609
                    ],
                    [
                        373,
                        10622
                    ],
                    [
                        374,
                        10612
                    ],
                    [
                        375,
                        10620
                    ],
                    [
                        377,
                        10632
                    ],
                    [
                        378,
                        10550
                    ],
                    [
                        379,
                        14490
                    ],
                    [
                        402,
                        6159
                    ],
                    [
                        409,
                        10606
                    ],
                    [
                        445,
                        10685
                    ],
                    [
                        456,
                        12344
                    ],
                    [
                        457,
                        12346
                    ],
                    [
                        458,
                        10800
                    ],
                    [
                        468,
                        10375
                    ],
                    [
                        554,
                        1110
                    ],
                    [
                        555,
                        1162
                    ],
                    [
                        559,
                        1118
                    ],
                    [
                        563,
                        1123
                    ],
                    [
                        564,
                        1125
                    ],
                    [
                        568,
                        1129
                    ],
                    [
                        570,
                        1131
                    ],
                    [
                        579,
                        1139
                    ],
                    [
                        580,
                        1141
                    ],
                    [
                        583,
                        1148
                    ],
                    [
                        603,
                        1115
                    ],
                    [
                        2876,
                        12656
                    ],
                    [
                        2877,
                        12658
                    ],
                    [
                        2881,
                        12691
                    ],
                    [
                        2882,
                        12689
                    ],
                    [
                        2883,
                        12685
                    ],
                    [
                        2884,
                        12690
                    ],
                    [
                        2887,
                        12695
                    ],
                    [
                        2888,
                        12703
                    ],
                    [
                        2889,
                        12679
                    ],
                    [
                        2890,
                        12674
                    ],
                    [
                        2891,
                        12680
                    ],
                    [
                        2892,
                        12681
                    ],
                    [
                        2894,
                        12757
                    ],
                    [
                        2895,
                        12664
                    ],
                    [
                        2896,
                        12697
                    ],
                    [
                        2897,
                        12699
                    ],
                    [
                        2898,
                        12700
                    ],
                    [
                        2899,
                        12709
                    ],
                    [
                        2900,
                        12708
                    ],
                    [
                        2902,
                        12711
                    ],
                    [
                        2903,
                        12712
                    ],
                    [
                        2904,
                        12713
                    ],
                    [
                        2905,
                        12714
                    ],
                    [
                        2906,
                        12715
                    ],
                    [
                        2907,
                        12716
                    ],
                    [
                        2908,
                        12717
                    ],
                    [
                        2909,
                        12718
                    ],
                    [
                        2910,
                        12721
                    ],
                    [
                        2911,
                        12722
                    ],
                    [
                        2912,
                        12723
                    ],
                    [
                        2913,
                        12730
                    ],
                    [
                        2914,
                        12731
                    ],
                    [
                        2915,
                        12729
                    ],
                    [
                        2917,
                        12754
                    ],
                    [
                        2918,
                        12755
                    ],
                    [
                        2919,
                        12756
                    ],
                    [
                        2920,
                        12732
                    ],
                    [
                        2923,
                        12744
                    ],
                    [
                        2926,
                        12748
                    ],
                    [
                        2927,
                        12749
                    ],
                    [
                        2966,
                        10586
                    ],
                    [
                        3310,
                        16427
                    ],
                    [
                        3822,
                        20975
                    ],
                    [
                        3880,
                        21762
                    ],
                    [
                        4774,
                        30670
                    ],
                    [
                        4801,
                        30488
                    ],
                    [
                        4827,
                        30032
                    ],
                    [
                        4843,
                        29666
                    ],
                    [
                        4849,
                        29414
                    ],
                    [
                        4867,
                        30105
                    ],
                    [
                        4879,
                        30772
                    ],
                    [
                        4919,
                        31451
                    ],
                    [
                        4922,
                        31568
                    ],
                    [
                        4928,
                        31639
                    ],
                    [
                        4940,
                        31459
                    ],
                    [
                        4944,
                        31367
                    ],
                    [
                        4963,
                        31438
                    ],
                    [
                        5665,
                        44980
                    ],
                    [
                        5699,
                        43636
                    ],
                    [
                        5746,
                        40274
                    ],
                    [
                        5752,
                        42917
                    ],
                    [
                        5758,
                        43148
                    ],
                    [
                        5824,
                        42963
                    ],
                    [
                        5859,
                        42180
                    ],
                    [
                        5921,
                        41615
                    ],
                    [
                        5924,
                        42935
                    ],
                    [
                        5942,
                        41156
                    ],
                    [
                        5984,
                        42355
                    ]
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2Profession>(
            """
            {
                "id": "Revenant",
                "name": "Widergänger",
                "code": 9,
                "icon": "https://render.guildwars2.com/file/7C9309BE7A2A48C6A9FBCC70CC1EBEBFD7593C05/961390.png",
                "icon_big": "https://render.guildwars2.com/file/696A48DD61EE01FD1F4FBBBDB82D74611E04EA39/965717.png",
                "specializations": [
                    14,
                    9,
                    12,
                    3,
                    15,
                    52,
                    63
                ],
                "weapons": {
                    "Axe": {
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 28029,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 28409,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Hammer": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 28549,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 28253,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 27976,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 27665,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 28110,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Spear": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 28714,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 28915,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 28827,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 28692,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 28930,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Mace": {
                        "flags": [
                            "Mainhand"
                        ],
                        "skills": [
                            {
                                "id": 27066,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 28357,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 27964,
                                "slot": "Weapon_3"
                            }
                        ]
                    },
                    "Shield": {
                        "specialization": 52,
                        "flags": [
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 29386,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 28262,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Shortbow": {
                        "specialization": 63,
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 40497,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 40175,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 41829,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 43993,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 41820,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Staff": {
                        "flags": [
                            "TwoHand"
                        ],
                        "skills": [
                            {
                                "id": 29180,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 29145,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 29288,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 29321,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 28978,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Sword": {
                        "flags": [
                            "Mainhand",
                            "Offhand"
                        ],
                        "skills": [
                            {
                                "id": 29057,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 29233,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 26699,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 28472,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 28571,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 27074,
                                "slot": "Weapon_5"
                            }
                        ]
                    },
                    "Trident": {
                        "flags": [
                            "TwoHand",
                            "Aquatic"
                        ],
                        "skills": [
                            {
                                "id": 50395,
                                "slot": "Weapon_1"
                            },
                            {
                                "id": 50456,
                                "slot": "Weapon_2"
                            },
                            {
                                "id": 50390,
                                "slot": "Weapon_3"
                            },
                            {
                                "id": 50410,
                                "slot": "Weapon_4"
                            },
                            {
                                "id": 50483,
                                "slot": "Weapon_5"
                            }
                        ]
                    }
                },
                "flags": [
                    "NoRacialSkills"
                ],
                "skills": [
                    {
                        "id": 28419,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 27372,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 28516,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 26679,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 26557,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 27975,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 28494,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 55029,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 28219,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 27322,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 27505,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 27917,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 28287,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 28427,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 28195,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 29148,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 26821,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 27025,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 27715,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 27356,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 28134,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 26937,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 29209,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 28231,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 27107,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 28406,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 28085,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 27220,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 28379,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 27014,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 26644,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 27760,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 29371,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 46409,
                        "slot": "Profession_1",
                        "type": "Profession"
                    },
                    {
                        "id": 45686,
                        "slot": "Heal",
                        "type": "Heal"
                    },
                    {
                        "id": 42949,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 40485,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 41220,
                        "slot": "Utility",
                        "type": "Utility"
                    },
                    {
                        "id": 45773,
                        "slot": "Elite",
                        "type": "Elite"
                    },
                    {
                        "id": 44076,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 42836,
                        "slot": "Profession_3",
                        "type": "Profession"
                    },
                    {
                        "id": 45537,
                        "slot": "Profession_4",
                        "type": "Profession"
                    },
                    {
                        "id": 51675,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 51714,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 51713,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 51696,
                        "slot": "Profession_2",
                        "type": "Profession"
                    },
                    {
                        "id": 51667,
                        "slot": "Profession_2",
                        "type": "Profession"
                    }
                ],
                "training": [
                    {
                        "id": 60,
                        "category": "Skills",
                        "name": "Legendäre Zwergen-Ausbildung",
                        "track": [
                            {
                                "cost": 3,
                                "type": "Skill",
                                "skill_id": 26557
                            },
                            {
                                "cost": 7,
                                "type": "Skill",
                                "skill_id": 26679
                            },
                            {
                                "cost": 11,
                                "type": "Skill",
                                "skill_id": 28516
                            },
                            {
                                "cost": 20,
                                "type": "Skill",
                                "skill_id": 27975
                            }
                        ]
                    },
                    {
                        "id": 58,
                        "category": "Skills",
                        "name": "Legendäre Dämonen-Ausbildung",
                        "track": [
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 28494
                            },
                            {
                                "cost": 6,
                                "type": "Skill",
                                "skill_id": 28219
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 27505
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 27322
                            },
                            {
                                "cost": 17,
                                "type": "Skill",
                                "skill_id": 27917
                            },
                            {
                                "cost": 26,
                                "type": "Skill",
                                "skill_id": 28287
                            }
                        ]
                    },
                    {
                        "id": 99,
                        "category": "Skills",
                        "name": "Legendäre Zentauren-Ausbildung",
                        "track": [
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 28195
                            },
                            {
                                "cost": 6,
                                "type": "Skill",
                                "skill_id": 29148
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 27025
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 27715
                            },
                            {
                                "cost": 17,
                                "type": "Skill",
                                "skill_id": 26821
                            },
                            {
                                "cost": 26,
                                "type": "Skill",
                                "skill_id": 27356
                            }
                        ]
                    },
                    {
                        "id": 25,
                        "category": "Skills",
                        "name": "Legendäre Assassinen-Ausbildung",
                        "track": [
                            {
                                "cost": 4,
                                "type": "Skill",
                                "skill_id": 28134
                            },
                            {
                                "cost": 6,
                                "type": "Skill",
                                "skill_id": 26937
                            },
                            {
                                "cost": 9,
                                "type": "Skill",
                                "skill_id": 29209
                            },
                            {
                                "cost": 13,
                                "type": "Skill",
                                "skill_id": 27107
                            },
                            {
                                "cost": 17,
                                "type": "Skill",
                                "skill_id": 28231
                            },
                            {
                                "cost": 26,
                                "type": "Skill",
                                "skill_id": 28406
                            }
                        ]
                    },
                    {
                        "id": 91,
                        "category": "Specializations",
                        "name": "Verderbnis",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1799
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1793
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1789
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1741
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1801
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1727
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1726
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1714
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1744
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1795
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1720
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1721
                            }
                        ]
                    },
                    {
                        "id": 42,
                        "category": "Specializations",
                        "name": "Repressalie",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1783
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1811
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1728
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1810
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1757
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1766
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1782
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1740
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1713
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1779
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1770
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1790
                            }
                        ]
                    },
                    {
                        "id": 89,
                        "category": "Specializations",
                        "name": "Erlösung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1816
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1823
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1824
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1822
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1821
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1819
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1817
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1818
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1814
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1815
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1825
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1820
                            }
                        ]
                    },
                    {
                        "id": 37,
                        "category": "Specializations",
                        "name": "Beschwörung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1778
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1732
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1761
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1784
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1758
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1774
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1760
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1781
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1769
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1749
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1791
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1719
                            }
                        ]
                    },
                    {
                        "id": 78,
                        "category": "Specializations",
                        "name": "Verwüstung",
                        "track": [
                            {
                                "cost": 2,
                                "type": "Trait",
                                "trait_id": 1808
                            },
                            {
                                "cost": 5,
                                "type": "Trait",
                                "trait_id": 1776
                            },
                            {
                                "cost": 8,
                                "type": "Trait",
                                "trait_id": 1767
                            },
                            {
                                "cost": 11,
                                "type": "Trait",
                                "trait_id": 1755
                            },
                            {
                                "cost": 15,
                                "type": "Trait",
                                "trait_id": 1724
                            },
                            {
                                "cost": 20,
                                "type": "Trait",
                                "trait_id": 1786
                            },
                            {
                                "cost": 25,
                                "type": "Trait",
                                "trait_id": 1765
                            },
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 1802
                            },
                            {
                                "cost": 36,
                                "type": "Trait",
                                "trait_id": 1792
                            },
                            {
                                "cost": 44,
                                "type": "Trait",
                                "trait_id": 1715
                            },
                            {
                                "cost": 52,
                                "type": "Trait",
                                "trait_id": 1800
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 1754
                            }
                        ]
                    },
                    {
                        "id": 84,
                        "category": "EliteSpecializations",
                        "name": "Herold",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 2050
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 1777
                            },
                            {
                                "cost": 60,
                                "type": "Skill",
                                "skill_id": 27220
                            },
                            {
                                "cost": 70,
                                "type": "Trait",
                                "trait_id": 1813
                            },
                            {
                                "cost": 80,
                                "type": "Trait",
                                "trait_id": 1806
                            },
                            {
                                "cost": 90,
                                "type": "Trait",
                                "trait_id": 1716
                            },
                            {
                                "cost": 100,
                                "type": "Trait",
                                "trait_id": 1737
                            },
                            {
                                "cost": 120,
                                "type": "Skill",
                                "skill_id": 26644
                            },
                            {
                                "cost": 140,
                                "type": "Skill",
                                "skill_id": 27014
                            },
                            {
                                "cost": 150,
                                "type": "Trait",
                                "trait_id": 1738
                            },
                            {
                                "cost": 160,
                                "type": "Trait",
                                "trait_id": 1743
                            },
                            {
                                "cost": 170,
                                "type": "Trait",
                                "trait_id": 1730
                            },
                            {
                                "cost": 180,
                                "type": "Trait",
                                "trait_id": 1788
                            },
                            {
                                "cost": 200,
                                "type": "Skill",
                                "skill_id": 28379
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 1746
                            },
                            {
                                "cost": 220,
                                "type": "Trait",
                                "trait_id": 1772
                            },
                            {
                                "cost": 230,
                                "type": "Trait",
                                "trait_id": 1803
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 27760
                            }
                        ]
                    },
                    {
                        "id": 410,
                        "category": "EliteSpecializations",
                        "name": "Abtrünniger",
                        "track": [
                            {
                                "cost": 30,
                                "type": "Trait",
                                "trait_id": 2099
                            },
                            {
                                "cost": 40,
                                "type": "Trait",
                                "trait_id": 2181
                            },
                            {
                                "cost": 50,
                                "type": "Trait",
                                "trait_id": 2079
                            },
                            {
                                "cost": 60,
                                "type": "Trait",
                                "trait_id": 2154
                            },
                            {
                                "cost": 70,
                                "type": "Trait",
                                "trait_id": 2092
                            },
                            {
                                "cost": 80,
                                "type": "Trait",
                                "trait_id": 2142
                            },
                            {
                                "cost": 90,
                                "type": "Trait",
                                "trait_id": 2100
                            },
                            {
                                "cost": 110,
                                "type": "Skill",
                                "skill_id": 45686
                            },
                            {
                                "cost": 130,
                                "type": "Skill",
                                "skill_id": 42949
                            },
                            {
                                "cost": 140,
                                "type": "Trait",
                                "trait_id": 2166
                            },
                            {
                                "cost": 150,
                                "type": "Trait",
                                "trait_id": 2133
                            },
                            {
                                "cost": 160,
                                "type": "Trait",
                                "trait_id": 2094
                            },
                            {
                                "cost": 180,
                                "type": "Skill",
                                "skill_id": 40485
                            },
                            {
                                "cost": 200,
                                "type": "Skill",
                                "skill_id": 41220
                            },
                            {
                                "cost": 210,
                                "type": "Trait",
                                "trait_id": 2120
                            },
                            {
                                "cost": 220,
                                "type": "Trait",
                                "trait_id": 2108
                            },
                            {
                                "cost": 230,
                                "type": "Trait",
                                "trait_id": 2182
                            },
                            {
                                "cost": 250,
                                "type": "Skill",
                                "skill_id": 45773
                            }
                        ]
                    }
                ],
                "skills_by_palette": [
                    [
                        3,
                        12371
                    ],
                    [
                        5,
                        28409
                    ],
                    [
                        16,
                        12389
                    ],
                    [
                        22,
                        12399
                    ],
                    [
                        32,
                        5939
                    ],
                    [
                        36,
                        12407
                    ],
                    [
                        51,
                        28110
                    ],
                    [
                        53,
                        27964
                    ],
                    [
                        87,
                        28262
                    ],
                    [
                        89,
                        28978
                    ],
                    [
                        90,
                        27074
                    ],
                    [
                        107,
                        41820
                    ],
                    [
                        111,
                        37873
                    ],
                    [
                        122,
                        5531
                    ],
                    [
                        124,
                        12380
                    ],
                    [
                        140,
                        35304
                    ],
                    [
                        201,
                        5719
                    ],
                    [
                        251,
                        10586
                    ],
                    [
                        258,
                        50483
                    ],
                    [
                        262,
                        5721
                    ],
                    [
                        265,
                        28930
                    ],
                    [
                        272,
                        15863
                    ],
                    [
                        287,
                        5603
                    ],
                    [
                        321,
                        5623
                    ],
                    [
                        323,
                        5732
                    ],
                    [
                        377,
                        10632
                    ],
                    [
                        379,
                        14490
                    ],
                    [
                        402,
                        6159
                    ],
                    [
                        457,
                        12346
                    ],
                    [
                        468,
                        10375
                    ],
                    [
                        554,
                        1110
                    ],
                    [
                        555,
                        1162
                    ],
                    [
                        559,
                        1118
                    ],
                    [
                        563,
                        1123
                    ],
                    [
                        564,
                        1125
                    ],
                    [
                        568,
                        1129
                    ],
                    [
                        570,
                        1131
                    ],
                    [
                        579,
                        1139
                    ],
                    [
                        580,
                        1141
                    ],
                    [
                        583,
                        1148
                    ],
                    [
                        603,
                        1115
                    ],
                    [
                        2876,
                        12656
                    ],
                    [
                        2877,
                        12658
                    ],
                    [
                        2881,
                        12691
                    ],
                    [
                        2882,
                        12689
                    ],
                    [
                        2883,
                        12685
                    ],
                    [
                        2884,
                        12690
                    ],
                    [
                        2887,
                        12695
                    ],
                    [
                        2888,
                        12703
                    ],
                    [
                        2889,
                        12679
                    ],
                    [
                        2890,
                        12674
                    ],
                    [
                        2891,
                        12680
                    ],
                    [
                        2892,
                        12681
                    ],
                    [
                        2894,
                        12757
                    ],
                    [
                        2895,
                        12664
                    ],
                    [
                        2896,
                        12697
                    ],
                    [
                        2897,
                        12699
                    ],
                    [
                        2898,
                        12700
                    ],
                    [
                        2899,
                        12709
                    ],
                    [
                        2900,
                        12708
                    ],
                    [
                        2902,
                        12711
                    ],
                    [
                        2903,
                        12712
                    ],
                    [
                        2904,
                        12713
                    ],
                    [
                        2905,
                        12714
                    ],
                    [
                        2906,
                        12715
                    ],
                    [
                        2907,
                        12716
                    ],
                    [
                        2908,
                        12717
                    ],
                    [
                        2909,
                        12718
                    ],
                    [
                        2910,
                        12721
                    ],
                    [
                        2911,
                        12722
                    ],
                    [
                        2912,
                        12723
                    ],
                    [
                        2913,
                        12730
                    ],
                    [
                        2914,
                        12731
                    ],
                    [
                        2915,
                        12729
                    ],
                    [
                        2917,
                        12754
                    ],
                    [
                        2918,
                        12755
                    ],
                    [
                        2919,
                        12756
                    ],
                    [
                        2920,
                        12732
                    ],
                    [
                        2923,
                        12744
                    ],
                    [
                        2926,
                        12748
                    ],
                    [
                        2927,
                        12749
                    ],
                    [
                        2966,
                        10586
                    ],
                    [
                        3310,
                        16427
                    ],
                    [
                        3822,
                        20975
                    ],
                    [
                        4492,
                        55029
                    ],
                    [
                        4554,
                        45773
                    ],
                    [
                        4564,
                        41220
                    ],
                    [
                        4570,
                        55029
                    ],
                    [
                        4572,
                        45686
                    ],
                    [
                        4592,
                        55029
                    ],
                    [
                        4610,
                        28085
                    ],
                    [
                        4614,
                        42949
                    ],
                    [
                        4643,
                        55029
                    ],
                    [
                        4651,
                        40485
                    ],
                    [
                        4827,
                        30032
                    ],
                    [
                        4919,
                        31451
                    ],
                    [
                        4922,
                        31568
                    ],
                    [
                        4928,
                        31639
                    ],
                    [
                        4940,
                        31459
                    ],
                    [
                        4944,
                        31367
                    ],
                    [
                        4963,
                        31438
                    ],
                    [
                        5665,
                        44980
                    ],
                    [
                        5666,
                        46409
                    ],
                    [
                        5699,
                        43636
                    ],
                    [
                        5824,
                        42963
                    ],
                    [
                        5859,
                        42180
                    ],
                    [
                        5942,
                        41156
                    ]
                ]
            }
            """.trimIndent()
        )
    }

}