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

class GW2v2AchievementCategoryTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 6,
                "name": "Fashion",
                "description": "",
                "order": 14,
                "icon": "https://render.guildwars2.com/file/7FCDBD1110A3F8A3172541ED05664165C4A7B918/42683.png",
                "achievements": [
                    {
                        "id": 93
                    },
                    {
                        "id": 94
                    },
                    {
                        "id": 95
                    },
                    {
                        "id": 96
                    },
                    {
                        "id": 97
                    },
                    {
                        "id": 223
                    },
                    {
                        "id": 1567
                    },
                    {
                        "id": 3935
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 36,
                "name": "Support Ellen Kiel",
                "description": "",
                "order": 206,
                "icon": "https://render.guildwars2.com/file/BE6160536DAA6E2F06BC03507325B2CB51639B75/607412.png",
                "achievements": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 37,
                "name": "Support Evon Gnashblade",
                "description": "",
                "order": 207,
                "icon": "https://render.guildwars2.com/file/744850091DAB68170ECB2DA14D072C2F731D71B2/607413.png",
                "achievements": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 79,
                "name": "Halloween Daily",
                "description": "",
                "order": 1,
                "icon": "https://render.guildwars2.com/file/7148FBEFC0071191C91BFD37D1346BF70DA65403/602778.png",
                "achievements": [
                    {
                        "id": 1022
                    },
                    {
                        "id": 1024
                    },
                    {
                        "id": 1025
                    },
                    {
                        "id": 3167,
                        "flags": [
                            "SpecialEvent",
                            "PvE"
                        ]
                    },
                    {
                        "id": 3929
                    },
                    {
                        "id": 4437
                    },
                    {
                        "id": 6775
                    }
                ],
                "tomorrow": [
                    {
                        "id": 1021
                    },
                    {
                        "id": 1023
                    },
                    {
                        "id": 3167,
                        "flags": [
                            "SpecialEvent",
                            "PvE"
                        ]
                    },
                    {
                        "id": 3930
                    },
                    {
                        "id": 3933
                    },
                    {
                        "id": 4451
                    },
                    {
                        "id": 6775
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 88,
                "name": "Daily Fractals",
                "description": "",
                "order": 2,
                "icon": "https://render.guildwars2.com/file/4A5834E40CDC6A0C44085B1F697565002D71CD47/1228226.png",
                "achievements": [
                    {
                        "id": 2153
                    },
                    {
                        "id": 2591
                    },
                    {
                        "id": 2889
                    },
                    {
                        "id": 2896
                    },
                    {
                        "id": 2897
                    },
                    {
                        "id": 2907
                    },
                    {
                        "id": 2929
                    },
                    {
                        "id": 2941
                    },
                    {
                        "id": 2947
                    },
                    {
                        "id": 2950
                    },
                    {
                        "id": 3228
                    },
                    {
                        "id": 5437
                    },
                    {
                        "id": 5446
                    },
                    {
                        "id": 5447
                    },
                    {
                        "id": 5449
                    }
                ],
                "tomorrow": [
                    {
                        "id": 2239
                    },
                    {
                        "id": 2467
                    },
                    {
                        "id": 2909
                    },
                    {
                        "id": 2927
                    },
                    {
                        "id": 2928
                    },
                    {
                        "id": 2948
                    },
                    {
                        "id": 3038
                    },
                    {
                        "id": 3044
                    },
                    {
                        "id": 3045
                    },
                    {
                        "id": 3063
                    },
                    {
                        "id": 3175
                    },
                    {
                        "id": 3177
                    },
                    {
                        "id": 3196
                    },
                    {
                        "id": 3215
                    },
                    {
                        "id": 3229
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 97,
                "name": "Daily",
                "description": "",
                "order": 0,
                "icon": "https://render.guildwars2.com/file/483E3939D1A7010BDEA2970FB27703CAAD5FBB0F/42684.png",
                "achievements": [
                    {
                        "id": 437,
                        "flags": [
                            "WvW"
                        ],
                        "level": [
                            11,
                            80
                        ]
                    },
                    {
                        "id": 1839,
                        "flags": [
                            "PvE"
                        ],
                        "level": [
                            11,
                            79
                        ]
                    },
                    {
                        "id": 1840
                    },
                    {
                        "id": 1850,
                        "flags": [
                            "WvW"
                        ],
                        "level": [
                            11,
                            80
                        ]
                    },
                    {
                        "id": 1851,
                        "flags": [
                            "WvW"
                        ],
                        "level": [
                            31,
                            80
                        ]
                    },
                    {
                        "id": 1852,
                        "flags": [
                            "WvW"
                        ]
                    },
                    {
                        "id": 1857,
                        "flags": [
                            "PvP"
                        ]
                    },
                    {
                        "id": 1902,
                        "flags": [
                            "PvE"
                        ],
                        "level": [
                            31,
                            80
                        ]
                    },
                    {
                        "id": 1932,
                        "required_access": {
                            "product": "PathOfFire",
                            "condition": "NoAccess"
                        },
                        "flags": [
                            "PvE"
                        ],
                        "level": [
                            80,
                            80
                        ]
                    },
                    {
                        "id": 1946,
                        "flags": [
                            "PvE"
                        ],
                        "level": [
                            40,
                            80
                        ]
                    },
                    {
                        "id": 1964,
                        "flags": [
                            "PvE"
                        ],
                        "level": [
                            11,
                            39
                        ]
                    },
                    {
                        "id": 1971,
                        "flags": [
                            "PvE"
                        ]
                    },
                    {
                        "id": 2817,
                        "flags": [
                            "PvP"
                        ],
                        "level": [
                            11,
                            80
                        ]
                    },
                    {
                        "id": 3449,
                        "flags": [
                            "PvP"
                        ],
                        "level": [
                            31,
                            80
                        ]
                    },
                    {
                        "id": 3450,
                        "flags": [
                            "PvP"
                        ],
                        "level": [
                            11,
                            80
                        ]
                    },
                    {
                        "id": 3562,
                        "required_access": {
                            "product": "PathOfFire",
                            "condition": "HasAccess"
                        },
                        "flags": [
                            "PvE"
                        ],
                        "level": [
                            80,
                            80
                        ]
                    }
                ],
                "tomorrow": [
                    {
                        "id": 946,
                        "flags": [
                            "WvW"
                        ]
                    },
                    {
                        "id": 1840
                    },
                    {
                        "id": 1845,
                        "flags": [
                            "WvW"
                        ],
                        "level": [
                            31,
                            80
                        ]
                    },
                    {
                        "id": 1849,
                        "flags": [
                            "WvW"
                        ],
                        "level": [
                            11,
                            80
                        ]
                    },
                    {
                        "id": 1851,
                        "flags": [
                            "WvW"
                        ],
                        "level": [
                            11,
                            80
                        ]
                    },
                    {
                        "id": 1856,
                        "flags": [
                            "PvP"
                        ]
                    },
                    {
                        "id": 1861,
                        "flags": [
                            "PvP"
                        ],
                        "level": [
                            11,
                            80
                        ]
                    },
                    {
                        "id": 1897,
                        "flags": [
                            "PvE"
                        ],
                        "level": [
                            77,
                            80
                        ]
                    },
                    {
                        "id": 1929,
                        "flags": [
                            "PvE"
                        ],
                        "level": [
                            31,
                            76
                        ]
                    },
                    {
                        "id": 1939,
                        "flags": [
                            "PvE"
                        ],
                        "level": [
                            11,
                            80
                        ]
                    },
                    {
                        "id": 1940,
                        "flags": [
                            "PvE"
                        ],
                        "level": [
                            11,
                            54
                        ]
                    },
                    {
                        "id": 1947,
                        "flags": [
                            "PvE"
                        ],
                        "level": [
                            55,
                            80
                        ]
                    },
                    {
                        "id": 1973,
                        "flags": [
                            "PvE"
                        ],
                        "level": [
                            1,
                            69
                        ]
                    },
                    {
                        "id": 1974,
                        "flags": [
                            "PvE"
                        ],
                        "level": [
                            70,
                            80
                        ]
                    },
                    {
                        "id": 3449,
                        "flags": [
                            "PvP"
                        ],
                        "level": [
                            11,
                            80
                        ]
                    },
                    {
                        "id": 3450,
                        "flags": [
                            "PvP"
                        ],
                        "level": [
                            31,
                            80
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 98,
                "name": "Wintersday Daily",
                "description": "",
                "order": 0,
                "icon": "https://render.guildwars2.com/file/C5CE0723E54B4B2F78A2E6E5496A04B54E7A65E6/602777.png",
                "achievements": [
                    {
                        "id": 1263,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 1265,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 2789,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 3253,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 3263,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 4053,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 5067,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 5068,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 5070,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 5071,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 5073,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 5075,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 6820,
                        "flags": [
                            "SpecialEvent"
                        ]
                    }
                ],
                "tomorrow": [
                    {
                        "id": 1262,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 1264,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 1265,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 2789,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 3245,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 3263,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 5067,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 5068,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 5070,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 5071,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 5073,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 5075,
                        "flags": [
                            "SpecialEvent"
                        ]
                    },
                    {
                        "id": 6820,
                        "flags": [
                            "SpecialEvent"
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 99,
                "name": "A Very Merry Wintersday '14",
                "description": "",
                "order": 163,
                "icon": "https://render.guildwars2.com/file/C5CE0723E54B4B2F78A2E6E5496A04B54E7A65E6/602777.png",
                "achievements": []
            }
            """.trimIndent()
        )
    }

}