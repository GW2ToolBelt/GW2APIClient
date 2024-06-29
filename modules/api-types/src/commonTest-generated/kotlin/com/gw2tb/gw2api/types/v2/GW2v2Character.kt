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

class GW2v2CharacterTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Character>(
            """
            {
                "name": "Linux Debizahn",
                "race": "Charr",
                "gender": "Male",
                "flags": [],
                "profession": "Guardian",
                "level": 80,
                "guild": "EEBAF715-BDC4-4C46-9D9F-1B80EFD20DF0",
                "age": 76925,
                "last_modified": "2022-04-02T14:00:00Z",
                "created": "2017-06-07T10:13:00Z",
                "deaths": 2,
                "crafting": [],
                "title": 117,
                "backstory": [
                    "15-84",
                    "7-55",
                    "17-92",
                    "182-177",
                    "16-90"
                ],
                "wvw_abilities": [],
                "build_tabs_unlocked": 3,
                "active_build_tab": 1,
                "build_tabs": [
                    {
                        "tab": 1,
                        "is_active": true,
                        "build": {
                            "name": "",
                            "profession": "Guardian",
                            "specializations": [
                                {
                                    "id": 42,
                                    "traits": [
                                        634,
                                        653,
                                        2017
                                    ]
                                },
                                {
                                    "id": 16,
                                    "traits": [
                                        574,
                                        565,
                                        1683
                                    ]
                                },
                                {
                                    "id": 62,
                                    "traits": [
                                        2101,
                                        2076,
                                        2179
                                    ]
                                }
                            ],
                            "skills": {
                                "heal": 41714,
                                "utilities": [
                                    40915,
                                    9093,
                                    9251
                                ],
                                "elite": 43357
                            },
                            "aquatic_skills": {
                                "heal": 9102,
                                "utilities": [
                                    null,
                                    null,
                                    null
                                ],
                                "elite": null
                            }
                        }
                    },
                    {
                        "tab": 2,
                        "is_active": false,
                        "build": {
                            "name": "",
                            "profession": "Guardian",
                            "specializations": [
                                {
                                    "id": 42,
                                    "traits": [
                                        634,
                                        628,
                                        2017
                                    ]
                                },
                                {
                                    "id": 13,
                                    "traits": [
                                        581,
                                        584,
                                        586
                                    ]
                                },
                                {
                                    "id": 46,
                                    "traits": [
                                        624,
                                        610,
                                        612
                                    ]
                                }
                            ],
                            "skills": {
                                "heal": 9102,
                                "utilities": [
                                    null,
                                    null,
                                    null
                                ],
                                "elite": null
                            },
                            "aquatic_skills": {
                                "heal": 9102,
                                "utilities": [
                                    null,
                                    null,
                                    null
                                ],
                                "elite": null
                            }
                        }
                    },
                    {
                        "tab": 3,
                        "is_active": false,
                        "build": {
                            "name": "",
                            "profession": "Guardian",
                            "specializations": [
                                {
                                    "id": 13,
                                    "traits": [
                                        588,
                                        584,
                                        585
                                    ]
                                },
                                {
                                    "id": 49,
                                    "traits": [
                                        559,
                                        549,
                                        553
                                    ]
                                },
                                {
                                    "id": 46,
                                    "traits": [
                                        624,
                                        610,
                                        612
                                    ]
                                }
                            ],
                            "skills": {
                                "heal": 9102,
                                "utilities": [
                                    9084,
                                    9085,
                                    9153
                                ],
                                "elite": 9154
                            },
                            "aquatic_skills": {
                                "heal": 9102,
                                "utilities": [
                                    null,
                                    null,
                                    null
                                ],
                                "elite": null
                            }
                        }
                    }
                ],
                "equipment_tabs_unlocked": 2,
                "active_equipment_tab": 1,
                "equipment": [
                    {
                        "id": 79830,
                        "slot": "Backpack",
                        "stats": {
                            "id": 584,
                            "attributes": {
                                "Power": 63,
                                "Precision": 40,
                                "CritDamage": 40
                            }
                        },
                        "binding": "Account",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ],
                        "dyes": [
                            null,
                            null,
                            null,
                            null
                        ]
                    },
                    {
                        "id": 88568,
                        "slot": "Coat",
                        "upgrades": [
                            24797
                        ],
                        "skin": 1090,
                        "binding": "Character",
                        "bound_to": "Linux Debizahn",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ],
                        "dyes": [
                            473,
                            43,
                            454,
                            null
                        ]
                    },
                    {
                        "id": 88570,
                        "slot": "Boots",
                        "upgrades": [
                            24797
                        ],
                        "binding": "Character",
                        "bound_to": "Linux Debizahn",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 88829,
                        "slot": "Gloves",
                        "upgrades": [
                            24797
                        ],
                        "binding": "Character",
                        "bound_to": "Linux Debizahn",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 88690,
                        "slot": "Helm",
                        "upgrades": [
                            24797
                        ],
                        "binding": "Character",
                        "bound_to": "Linux Debizahn",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 88492,
                        "slot": "Leggings",
                        "upgrades": [
                            24797
                        ],
                        "skin": 1066,
                        "binding": "Character",
                        "bound_to": "Linux Debizahn",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ],
                        "dyes": [
                            473,
                            43,
                            454,
                            null
                        ]
                    },
                    {
                        "id": 88836,
                        "slot": "Shoulders",
                        "upgrades": [
                            24797
                        ],
                        "skin": 2044,
                        "binding": "Character",
                        "bound_to": "Linux Debizahn",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ],
                        "dyes": [
                            473,
                            43,
                            43,
                            null
                        ]
                    },
                    {
                        "id": 79745,
                        "slot": "Accessory1",
                        "stats": {
                            "id": 584,
                            "attributes": {
                                "Power": 110,
                                "Precision": 74,
                                "CritDamage": 74
                            }
                        },
                        "binding": "Account",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 79444,
                        "slot": "Accessory2",
                        "stats": {
                            "id": 584,
                            "attributes": {
                                "Power": 110,
                                "Precision": 74,
                                "CritDamage": 74
                            }
                        },
                        "binding": "Account",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 79712,
                        "slot": "Ring1",
                        "stats": {
                            "id": 584,
                            "attributes": {
                                "Power": 126,
                                "Precision": 85,
                                "CritDamage": 85
                            }
                        },
                        "binding": "Account",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 79124,
                        "slot": "Ring2",
                        "stats": {
                            "id": 584,
                            "attributes": {
                                "Power": 126,
                                "Precision": 85,
                                "CritDamage": 85
                            }
                        },
                        "binding": "Account",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 44976,
                        "slot": "WeaponAquaticA",
                        "upgrades": [
                            24567
                        ],
                        "binding": "Character",
                        "bound_to": "Linux Debizahn",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 82195,
                        "slot": "WeaponA1",
                        "upgrades": [
                            24575
                        ],
                        "skin": 6486,
                        "stats": {
                            "id": 161,
                            "attributes": {
                                "Power": 120,
                                "Precision": 85,
                                "CritDamage": 85
                            }
                        },
                        "binding": "Character",
                        "bound_to": "Linux Debizahn",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 27024,
                        "slot": "WeaponA2",
                        "upgrades": [
                            24551
                        ],
                        "skin": 6417,
                        "binding": "Character",
                        "bound_to": "Linux Debizahn",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 27325,
                        "slot": "WeaponB1",
                        "upgrades": [
                            24578,
                            24575
                        ],
                        "skin": 6346,
                        "binding": "Character",
                        "bound_to": "Linux Debizahn",
                        "location": "Equipped",
                        "tabs": [
                            1
                        ]
                    },
                    {
                        "id": 22997,
                        "slot": "Sickle",
                        "binding": "Account",
                        "location": "Equipped"
                    },
                    {
                        "id": 23000,
                        "slot": "Axe",
                        "binding": "Account",
                        "location": "Equipped"
                    },
                    {
                        "id": 23001,
                        "slot": "Pick",
                        "binding": "Account",
                        "location": "Equipped"
                    }
                ],
                "equipment_tabs": [
                    {
                        "tab": 1,
                        "name": "",
                        "is_active": true,
                        "equipment": [
                            {
                                "id": 88568,
                                "slot": "Coat",
                                "upgrades": [
                                    24797
                                ],
                                "skin": 1090,
                                "binding": "Character",
                                "bound_to": "Linux Debizahn",
                                "location": "Equipped",
                                "dyes": [
                                    473,
                                    43,
                                    454,
                                    null
                                ]
                            },
                            {
                                "id": 88570,
                                "slot": "Boots",
                                "upgrades": [
                                    24797
                                ],
                                "binding": "Character",
                                "bound_to": "Linux Debizahn",
                                "location": "Equipped"
                            },
                            {
                                "id": 88829,
                                "slot": "Gloves",
                                "upgrades": [
                                    24797
                                ],
                                "binding": "Character",
                                "bound_to": "Linux Debizahn",
                                "location": "Equipped"
                            },
                            {
                                "id": 88690,
                                "slot": "Helm",
                                "upgrades": [
                                    24797
                                ],
                                "binding": "Character",
                                "bound_to": "Linux Debizahn",
                                "location": "Equipped"
                            },
                            {
                                "id": 88492,
                                "slot": "Leggings",
                                "upgrades": [
                                    24797
                                ],
                                "skin": 1066,
                                "binding": "Character",
                                "bound_to": "Linux Debizahn",
                                "location": "Equipped",
                                "dyes": [
                                    473,
                                    43,
                                    454,
                                    null
                                ]
                            },
                            {
                                "id": 88836,
                                "slot": "Shoulders",
                                "upgrades": [
                                    24797
                                ],
                                "skin": 2044,
                                "binding": "Character",
                                "bound_to": "Linux Debizahn",
                                "location": "Equipped",
                                "dyes": [
                                    473,
                                    43,
                                    43,
                                    null
                                ]
                            },
                            {
                                "id": 79830,
                                "slot": "Backpack",
                                "binding": "Account",
                                "location": "Equipped",
                                "dyes": [
                                    null,
                                    null,
                                    null,
                                    null
                                ]
                            },
                            {
                                "id": 79745,
                                "slot": "Accessory1",
                                "binding": "Account",
                                "location": "Equipped"
                            },
                            {
                                "id": 79444,
                                "slot": "Accessory2",
                                "binding": "Account",
                                "location": "Equipped"
                            },
                            {
                                "id": 79712,
                                "slot": "Ring1",
                                "binding": "Account",
                                "location": "Equipped"
                            },
                            {
                                "id": 79124,
                                "slot": "Ring2",
                                "binding": "Account",
                                "location": "Equipped"
                            },
                            {
                                "id": 44976,
                                "slot": "WeaponAquaticA",
                                "upgrades": [
                                    24567
                                ],
                                "binding": "Character",
                                "bound_to": "Linux Debizahn",
                                "location": "Equipped"
                            },
                            {
                                "id": 82195,
                                "slot": "WeaponA1",
                                "upgrades": [
                                    24575
                                ],
                                "skin": 6486,
                                "binding": "Character",
                                "bound_to": "Linux Debizahn",
                                "location": "Equipped"
                            },
                            {
                                "id": 27024,
                                "slot": "WeaponA2",
                                "upgrades": [
                                    24551
                                ],
                                "skin": 6417,
                                "binding": "Character",
                                "bound_to": "Linux Debizahn",
                                "location": "Equipped"
                            },
                            {
                                "id": 27325,
                                "slot": "WeaponB1",
                                "upgrades": [
                                    24578,
                                    24575
                                ],
                                "skin": 6346,
                                "binding": "Character",
                                "bound_to": "Linux Debizahn",
                                "location": "Equipped"
                            }
                        ],
                        "equipment_pvp": {
                            "amulet": 9,
                            "rune": 21172,
                            "sigils": [
                                21150,
                                81268,
                                21150,
                                81268
                            ]
                        }
                    },
                    {
                        "tab": 2,
                        "name": "",
                        "is_active": false,
                        "equipment": [],
                        "equipment_pvp": {
                            "amulet": 9,
                            "rune": 21172,
                            "sigils": [
                                21150,
                                81268,
                                21150,
                                81268
                            ]
                        }
                    }
                ],
                "recipes": [
                    8012,
                    10136
                ],
                "training": [
                    {
                        "id": 26,
                        "spent": 13,
                        "done": true
                    },
                    {
                        "id": 74,
                        "spent": 24,
                        "done": true
                    },
                    {
                        "id": 97,
                        "spent": 24,
                        "done": true
                    },
                    {
                        "id": 92,
                        "spent": 13,
                        "done": true
                    },
                    {
                        "id": 104,
                        "spent": 24,
                        "done": true
                    },
                    {
                        "id": 103,
                        "spent": 60,
                        "done": true
                    },
                    {
                        "id": 100,
                        "spent": 60,
                        "done": true
                    },
                    {
                        "id": 24,
                        "spent": 60,
                        "done": true
                    },
                    {
                        "id": 45,
                        "spent": 60,
                        "done": true
                    },
                    {
                        "id": 30,
                        "spent": 60,
                        "done": true
                    },
                    {
                        "id": 85,
                        "spent": 250,
                        "done": true
                    },
                    {
                        "id": 417,
                        "spent": 250,
                        "done": true
                    },
                    {
                        "id": 466,
                        "spent": 250,
                        "done": true
                    }
                ],
                "bags": [
                    {
                        "id": 9574,
                        "size": 20,
                        "inventory": [
                            {
                                "id": 19986,
                                "count": 1,
                                "charges": 25,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 20799,
                                "count": 1,
                                "binding": "Account"
                            },
                            {
                                "id": 66961,
                                "count": 1,
                                "binding": "Character",
                                "bound_to": "Linux Debizahn"
                            }
                        ]
                    },
                    {
                        "id": 8932,
                        "size": 20,
                        "inventory": [
                            {
                                "id": 46735,
                                "count": 146,
                                "binding": "Account"
                            },
                            {
                                "id": 24531,
                                "count": 20
                            },
                            {
                                "id": 24523,
                                "count": 15
                            },
                            {
                                "id": 21683,
                                "count": 16
                            },
                            {
                                "id": 24532,
                                "count": 4
                            },
                            {
                                "id": 22331,
                                "count": 16
                            },
                            {
                                "id": 24524,
                                "count": 5
                            },
                            {
                                "id": 21675,
                                "count": 12
                            },
                            {
                                "id": 24476,
                                "count": 13
                            },
                            {
                                "id": 68634,
                                "count": 55
                            },
                            {
                                "id": 68635,
                                "count": 85
                            },
                            {
                                "id": 77699,
                                "count": 84
                            },
                            {
                                "id": 77750,
                                "count": 164
                            },
                            {
                                "id": 77750,
                                "count": 250
                            },
                            {
                                "id": 77750,
                                "count": 250
                            },
                            {
                                "id": 68633,
                                "count": 87
                            },
                            {
                                "id": 68632,
                                "count": 83
                            },
                            {
                                "id": 12464,
                                "count": 7
                            },
                            {
                                "id": 77686,
                                "count": 183
                            },
                            {
                                "id": 77686,
                                "count": 250
                            }
                        ]
                    },
                    {
                        "id": 38013,
                        "size": 20,
                        "inventory": [
                            {
                                "id": 24474,
                                "count": 12
                            },
                            {
                                "id": 24509,
                                "count": 13
                            },
                            {
                                "id": 24473,
                                "count": 15
                            },
                            {
                                "id": 24511,
                                "count": 11
                            },
                            {
                                "id": 24521,
                                "count": 10
                            },
                            {
                                "id": 45176,
                                "count": 24,
                                "binding": "Account"
                            },
                            {
                                "id": 45175,
                                "count": 71,
                                "binding": "Account"
                            },
                            {
                                "id": 24517,
                                "count": 12
                            },
                            {
                                "id": 96464,
                                "count": 8
                            },
                            {
                                "id": 47095,
                                "count": 1,
                                "upgrades": [
                                    24578
                                ],
                                "upgrade_slot_indices": [
                                    0
                                ],
                                "binding": "Account"
                            },
                            {
                                "id": 24475,
                                "count": 8
                            },
                            {
                                "id": 95755,
                                "count": 1
                            },
                            {
                                "id": 24518,
                                "count": 1
                            },
                            {
                                "id": 24515,
                                "count": 1
                            },
                            {
                                "id": 24519,
                                "count": 8
                            },
                            {
                                "id": 68636,
                                "count": 80
                            },
                            {
                                "id": 90011,
                                "count": 68
                            },
                            {
                                "id": 70025,
                                "count": 12,
                                "binding": "Account"
                            },
                            {
                                "id": 12588,
                                "count": 10,
                                "binding": "Account"
                            },
                            {
                                "id": 37899,
                                "count": 1,
                                "binding": "Account"
                            }
                        ]
                    },
                    {
                        "id": 38013,
                        "size": 20,
                        "inventory": [
                            {
                                "id": 24510,
                                "count": 2
                            },
                            {
                                "id": 24512,
                                "count": 1
                            },
                            {
                                "id": 24516,
                                "count": 1
                            },
                            {
                                "id": 24508,
                                "count": 2
                            },
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            {
                                "id": 12488,
                                "count": 7
                            },
                            {
                                "id": 67368,
                                "count": 134
                            },
                            {
                                "id": 12468,
                                "count": 30
                            }
                        ]
                    },
                    {
                        "id": 38013,
                        "size": 20,
                        "inventory": [
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            {
                                "id": 78305,
                                "count": 50,
                                "binding": "Account"
                            },
                            {
                                "id": 12453,
                                "count": 14
                            },
                            {
                                "id": 12467,
                                "count": 22
                            }
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }

}