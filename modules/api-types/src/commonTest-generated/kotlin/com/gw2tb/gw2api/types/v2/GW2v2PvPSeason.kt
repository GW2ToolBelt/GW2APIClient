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

class GW2v2PvpSeasonTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2PvpSeason>(
            """
            {
                "id": "91C6E5B8-6CA7-4C2B-9F8E-BCA8EDD0653A",
                "name": "Erste PvP-Liga-2v2-Saison",
                "start": "2020-02-25T20:00:00.000Z",
                "end": "2020-03-24T00:00:00.000Z",
                "active": false,
                "divisions": [
                    {
                        "name": "Coelinblau",
                        "flags": [],
                        "large_icon": "https://render.guildwars2.com/file/CBACFFCD30B623FCCAF3CC7296056265F15E09BB/1614868.png",
                        "small_icon": "https://render.guildwars2.com/file/0673802F661E33D2BAFB400F56E502ACAE9468F4/1614874.png",
                        "pip_icon": "https://render.guildwars2.com/file/DF4AE7C6B85711B5EF0A970851672FFE230FE61D/1614836.png",
                        "tiers": [
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            }
                        ]
                    },
                    {
                        "name": "Jaspis",
                        "flags": [],
                        "large_icon": "https://render.guildwars2.com/file/769445B8AFC30D92345AB6A84ACD02A223B5B1B5/1614869.png",
                        "small_icon": "https://render.guildwars2.com/file/6E0EF5120B6E095ED894A4E3BFC69F141EEF652E/1614876.png",
                        "pip_icon": "https://render.guildwars2.com/file/65192C9BEF0C080CACB5005B7B074C7EE37C6527/1614837.png",
                        "tiers": [
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            }
                        ]
                    },
                    {
                        "name": "Safran",
                        "flags": [],
                        "large_icon": "https://render.guildwars2.com/file/509921D3BFDC049BC20758B71AD85592A043A439/1614870.png",
                        "small_icon": "https://render.guildwars2.com/file/6BE7DAD4635AF66FA4017A4D217F609FC95CE3A6/1614878.png",
                        "pip_icon": "https://render.guildwars2.com/file/0E9EFE4F06A46D124EF970375CB0FE7C5646DEBD/1614838.png",
                        "tiers": [
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            }
                        ]
                    },
                    {
                        "name": "Persimone (wiederholbar)",
                        "flags": [
                            "Repeatable"
                        ],
                        "large_icon": "https://render.guildwars2.com/file/5807B5E8BC4658DE9CB44664C125A6A3900D80A9/1614871.png",
                        "small_icon": "https://render.guildwars2.com/file/AA9C38331B5F97511697C66E236E54BB151CF93C/1614880.png",
                        "pip_icon": "https://render.guildwars2.com/file/D7A1BE091BEB55FFFBE529F84DAF0EA23B9E0943/1614839.png",
                        "tiers": [
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            }
                        ]
                    }
                ],
                "ranks": [
                    {
                        "name": "Bronze",
                        "description": "Dieses PvP-Liga-Abzeichen bekommt Ihr, wenn Ihr eine Bronze-Effizienzwertung erreicht.",
                        "icon": "https://render.guildwars2.com/file/6C5C27021FBF30026F1A5B0B5648D84F6A12C361/1614805.png",
                        "overlay": "https://render.guildwars2.com/file/7CDD58197C21E0D1F5076D5F2437060D13A03276/1614803.png",
                        "overlay_small": "https://render.guildwars2.com/file/B64F6C01E17554BC777F68D106294F3FC1BACBA7/1614804.png",
                        "tiers": [
                            {
                                "rating": 699
                            },
                            {
                                "rating": 799
                            },
                            {
                                "rating": 899
                            }
                        ]
                    },
                    {
                        "name": "Silber",
                        "description": "Dieses PvP-Liga-Abzeichen bekommt Ihr, wenn Ihr eine Silber-Effizienzwertung erreicht.",
                        "icon": "https://render.guildwars2.com/file/031107A75BA0A8267F2925032CAA006C92D1024C/1614808.png",
                        "overlay": "https://render.guildwars2.com/file/E9710E98D90E3DCB1B6ABA08DF09059630E04A0B/1614806.png",
                        "overlay_small": "https://render.guildwars2.com/file/1E0CB9F01C7C58DC60CB67C26B6697D42A09A701/1614807.png",
                        "tiers": [
                            {
                                "rating": 999
                            },
                            {
                                "rating": 1099
                            },
                            {
                                "rating": 1199
                            }
                        ]
                    },
                    {
                        "name": "Gold",
                        "description": "Dieses PvP-Liga-Abzeichen bekommt Ihr, wenn Ihr eine Gold-Effizienzwertung erreicht.",
                        "icon": "https://render.guildwars2.com/file/B11206B5D509587AB9726FAC9101F4E1062CC15E/1614811.png",
                        "overlay": "https://render.guildwars2.com/file/39D36849D82301ACAC1F0746E4E270DEEB64A097/1614809.png",
                        "overlay_small": "https://render.guildwars2.com/file/3C3096652D111C287F45FD1B6DAB500CE3227A64/1614810.png",
                        "tiers": [
                            {
                                "rating": 1299
                            },
                            {
                                "rating": 1399
                            },
                            {
                                "rating": 1499
                            }
                        ]
                    },
                    {
                        "name": "Platin",
                        "description": "Dieses PvP-Liga-Abzeichen bekommt Ihr, wenn Ihr eine Platin-Effizienzwertung erreicht.",
                        "icon": "https://render.guildwars2.com/file/9723D561C0FE045711651678C2599A2D27122D0D/1614814.png",
                        "overlay": "https://render.guildwars2.com/file/BFF6A83B453F005436B252BD57183EB63D38B36F/1614812.png",
                        "overlay_small": "https://render.guildwars2.com/file/E6E0CD64A9D93C011B29CAFAE5355C1B4D5FE61E/1614813.png",
                        "tiers": [
                            {
                                "rating": 1599
                            },
                            {
                                "rating": 1699
                            },
                            {
                                "rating": 1799
                            }
                        ]
                    },
                    {
                        "name": "Legendär",
                        "description": "Dieses PvP-Liga-Abzeichen bekommt Ihr, wenn Ihr eine legendäre Effizienzwertung erreicht.",
                        "icon": "https://render.guildwars2.com/file/C9A7F6735DC310292AC09CFCE453AAFE1DC0970A/1614817.png",
                        "overlay": "https://render.guildwars2.com/file/0DFDCF280AF0D9033DFD68BC0175109EF0377B7D/1614815.png",
                        "overlay_small": "https://render.guildwars2.com/file/D29D750A334BCAD47DF4F5397D6EA999101BE8BE/1614816.png",
                        "tiers": [
                            {
                                "rating": 1899
                            },
                            {
                                "rating": 1999
                            },
                            {
                                "rating": 2099
                            }
                        ]
                    }
                ],
                "leaderboards": {
                    "ladder": {
                        "settings": {
                            "name": "",
                            "duration": null,
                            "scoring": "C4137CA9-1CA0-467E-933C-89B1B69C0D65",
                            "tiers": [
                                {
                                    "range": [
                                        250,
                                        1
                                    ]
                                }
                            ]
                        },
                        "scorings": [
                            {
                                "id": "C4137CA9-1CA0-467E-933C-89B1B69C0D65",
                                "type": "Integer",
                                "description": "Effizienzwertung, die Zeitabzug mit einschließt.",
                                "name": "Wertung",
                                "ordering": "MoreIsBetter"
                            },
                            {
                                "id": "05328AEF-D235-4BF1-A4F9-E15940F3E5A1",
                                "type": "Integer",
                                "description": "",
                                "name": "Siege",
                                "ordering": "MoreIsBetter"
                            },
                            {
                                "id": "B8C979CB-2565-4AE1-916D-913B00D6270E",
                                "type": "Integer",
                                "description": "",
                                "name": "Niederlagen",
                                "ordering": "LessIsBetter"
                            }
                        ]
                    }
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2PvpSeason>(
            """
            {
                "id": "B88D04C3-E53F-41AF-8770-A84D75DA10EC",
                "name": "Vierundzwanzigste PvP-Liga-Saison",
                "start": "2020-10-27T19:00:00.000Z",
                "end": "2020-12-22T01:00:00.000Z",
                "active": false,
                "divisions": [
                    {
                        "name": "Coelinblau",
                        "flags": [],
                        "large_icon": "https://render.guildwars2.com/file/CBACFFCD30B623FCCAF3CC7296056265F15E09BB/1614868.png",
                        "small_icon": "https://render.guildwars2.com/file/0673802F661E33D2BAFB400F56E502ACAE9468F4/1614874.png",
                        "pip_icon": "https://render.guildwars2.com/file/DF4AE7C6B85711B5EF0A970851672FFE230FE61D/1614836.png",
                        "tiers": [
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            }
                        ]
                    },
                    {
                        "name": "Jaspis",
                        "flags": [],
                        "large_icon": "https://render.guildwars2.com/file/769445B8AFC30D92345AB6A84ACD02A223B5B1B5/1614869.png",
                        "small_icon": "https://render.guildwars2.com/file/6E0EF5120B6E095ED894A4E3BFC69F141EEF652E/1614876.png",
                        "pip_icon": "https://render.guildwars2.com/file/65192C9BEF0C080CACB5005B7B074C7EE37C6527/1614837.png",
                        "tiers": [
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            }
                        ]
                    },
                    {
                        "name": "Safran",
                        "flags": [],
                        "large_icon": "https://render.guildwars2.com/file/509921D3BFDC049BC20758B71AD85592A043A439/1614870.png",
                        "small_icon": "https://render.guildwars2.com/file/6BE7DAD4635AF66FA4017A4D217F609FC95CE3A6/1614878.png",
                        "pip_icon": "https://render.guildwars2.com/file/0E9EFE4F06A46D124EF970375CB0FE7C5646DEBD/1614838.png",
                        "tiers": [
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            }
                        ]
                    },
                    {
                        "name": "Persimone",
                        "flags": [],
                        "large_icon": "https://render.guildwars2.com/file/5807B5E8BC4658DE9CB44664C125A6A3900D80A9/1614871.png",
                        "small_icon": "https://render.guildwars2.com/file/AA9C38331B5F97511697C66E236E54BB151CF93C/1614880.png",
                        "pip_icon": "https://render.guildwars2.com/file/D7A1BE091BEB55FFFBE529F84DAF0EA23B9E0943/1614839.png",
                        "tiers": [
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            },
                            {
                                "points": 20
                            }
                        ]
                    },
                    {
                        "name": "Amaranth",
                        "flags": [],
                        "large_icon": "https://render.guildwars2.com/file/9CEAC0D269EC685D2818320FACC4130151C9B4B7/1614872.png",
                        "small_icon": "https://render.guildwars2.com/file/18A56E0F97DF075C30EA05CD1B571DEB024E0815/1614882.png",
                        "pip_icon": "https://render.guildwars2.com/file/76EA60C4256FA580F167036739006D5B7D0791A1/1614840.png",
                        "tiers": [
                            {
                                "points": 30
                            },
                            {
                                "points": 30
                            },
                            {
                                "points": 30
                            },
                            {
                                "points": 30
                            },
                            {
                                "points": 30
                            }
                        ]
                    },
                    {
                        "name": "Byzantium (Wiederholbar)",
                        "flags": [
                            "Repeatable"
                        ],
                        "large_icon": "https://render.guildwars2.com/file/52F72F4C72B517B0955D00CE0415E9B778191395/1614873.png",
                        "small_icon": "https://render.guildwars2.com/file/EDA19B7B0FF77E7044087F02D909AC0846A228BC/1614884.png",
                        "pip_icon": "https://render.guildwars2.com/file/32A2E3C56EE514912A0AF41C9904AFAF64082D0B/1614841.png",
                        "tiers": [
                            {
                                "points": 30
                            },
                            {
                                "points": 30
                            },
                            {
                                "points": 30
                            },
                            {
                                "points": 30
                            },
                            {
                                "points": 30
                            },
                            {
                                "points": 30
                            }
                        ]
                    }
                ],
                "ranks": [
                    {
                        "name": "Bronze",
                        "description": "Dieses PvP-Liga-Abzeichen bekommt Ihr, wenn Ihr eine Bronze-Effizienzwertung erreicht.",
                        "icon": "https://render.guildwars2.com/file/6C5C27021FBF30026F1A5B0B5648D84F6A12C361/1614805.png",
                        "overlay": "https://render.guildwars2.com/file/7CDD58197C21E0D1F5076D5F2437060D13A03276/1614803.png",
                        "overlay_small": "https://render.guildwars2.com/file/B64F6C01E17554BC777F68D106294F3FC1BACBA7/1614804.png",
                        "tiers": [
                            {
                                "rating": 699
                            },
                            {
                                "rating": 799
                            },
                            {
                                "rating": 899
                            }
                        ]
                    },
                    {
                        "name": "Silber",
                        "description": "Dieses PvP-Liga-Abzeichen bekommt Ihr, wenn Ihr eine Silber-Effizienzwertung erreicht.",
                        "icon": "https://render.guildwars2.com/file/031107A75BA0A8267F2925032CAA006C92D1024C/1614808.png",
                        "overlay": "https://render.guildwars2.com/file/E9710E98D90E3DCB1B6ABA08DF09059630E04A0B/1614806.png",
                        "overlay_small": "https://render.guildwars2.com/file/1E0CB9F01C7C58DC60CB67C26B6697D42A09A701/1614807.png",
                        "tiers": [
                            {
                                "rating": 999
                            },
                            {
                                "rating": 1099
                            },
                            {
                                "rating": 1199
                            }
                        ]
                    },
                    {
                        "name": "Gold",
                        "description": "Dieses PvP-Liga-Abzeichen bekommt Ihr, wenn Ihr eine Gold-Effizienzwertung erreicht.",
                        "icon": "https://render.guildwars2.com/file/B11206B5D509587AB9726FAC9101F4E1062CC15E/1614811.png",
                        "overlay": "https://render.guildwars2.com/file/39D36849D82301ACAC1F0746E4E270DEEB64A097/1614809.png",
                        "overlay_small": "https://render.guildwars2.com/file/3C3096652D111C287F45FD1B6DAB500CE3227A64/1614810.png",
                        "tiers": [
                            {
                                "rating": 1299
                            },
                            {
                                "rating": 1399
                            },
                            {
                                "rating": 1499
                            }
                        ]
                    },
                    {
                        "name": "Platin",
                        "description": "Dieses PvP-Liga-Abzeichen bekommt Ihr, wenn Ihr eine Platin-Effizienzwertung erreicht.",
                        "icon": "https://render.guildwars2.com/file/9723D561C0FE045711651678C2599A2D27122D0D/1614814.png",
                        "overlay": "https://render.guildwars2.com/file/BFF6A83B453F005436B252BD57183EB63D38B36F/1614812.png",
                        "overlay_small": "https://render.guildwars2.com/file/E6E0CD64A9D93C011B29CAFAE5355C1B4D5FE61E/1614813.png",
                        "tiers": [
                            {
                                "rating": 1599
                            },
                            {
                                "rating": 1699
                            },
                            {
                                "rating": 1799
                            }
                        ]
                    },
                    {
                        "name": "Legendär",
                        "description": "Dieses PvP-Liga-Abzeichen bekommt Ihr, wenn Ihr eine legendäre Effizienzwertung erreicht.",
                        "icon": "https://render.guildwars2.com/file/C9A7F6735DC310292AC09CFCE453AAFE1DC0970A/1614817.png",
                        "overlay": "https://render.guildwars2.com/file/0DFDCF280AF0D9033DFD68BC0175109EF0377B7D/1614815.png",
                        "overlay_small": "https://render.guildwars2.com/file/D29D750A334BCAD47DF4F5397D6EA999101BE8BE/1614816.png",
                        "tiers": [
                            {
                                "rating": 1899
                            },
                            {
                                "rating": 1999
                            },
                            {
                                "rating": 2099
                            }
                        ]
                    }
                ],
                "leaderboards": {
                    "ladder": {
                        "settings": {
                            "name": "",
                            "duration": null,
                            "scoring": "0F86D504-63C2-4465-80AA-C278E1CB7800",
                            "tiers": [
                                {
                                    "range": [
                                        1,
                                        1
                                    ]
                                },
                                {
                                    "range": [
                                        2,
                                        2
                                    ]
                                },
                                {
                                    "range": [
                                        3,
                                        3
                                    ]
                                },
                                {
                                    "range": [
                                        10,
                                        4
                                    ]
                                },
                                {
                                    "range": [
                                        25,
                                        11
                                    ]
                                },
                                {
                                    "range": [
                                        100,
                                        26
                                    ]
                                },
                                {
                                    "range": [
                                        250,
                                        101
                                    ]
                                }
                            ]
                        },
                        "scorings": [
                            {
                                "id": "0F86D504-63C2-4465-80AA-C278E1CB7800",
                                "type": "Integer",
                                "description": "Effizienzwertung, die Zeitabzug mit einschließt.",
                                "name": "Wertung",
                                "ordering": "MoreIsBetter"
                            },
                            {
                                "id": "8A5F1199-CFD8-44CE-84C3-811C5EE8B16C",
                                "type": "Integer",
                                "description": "",
                                "name": "Siege",
                                "ordering": "MoreIsBetter"
                            },
                            {
                                "id": "FECEE3A5-B66C-44A3-B81E-65EA43829E1D",
                                "type": "Integer",
                                "description": "",
                                "name": "Niederlagen",
                                "ordering": "LessIsBetter"
                            }
                        ]
                    }
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2PvpSeason>(
            """
            {
                "id": "D1777261-555B-4B72-A27E-BDC96EC393D5",
                "name": "Dritte PvP-Liga-Saison",
                "start": "2016-05-17T19:00:00.000Z",
                "end": "2016-07-11T23:00:00.000Z",
                "active": false,
                "divisions": [
                    {
                        "name": "Division 1: Bernstein",
                        "flags": [],
                        "large_icon": "https://render.guildwars2.com/file/02ED75461164551455297DA4955862552C2452BE/1313334.png",
                        "small_icon": "https://render.guildwars2.com/file/6357FE56301B2F4AD1F309E62739B0110DA2452A/1313340.png",
                        "pip_icon": "https://render.guildwars2.com/file/47BDF237FF800552EDD69D28BC926031FC4B64A9/1313346.png",
                        "tiers": [
                            {
                                "points": 3
                            },
                            {
                                "points": 3
                            },
                            {
                                "points": 3
                            },
                            {
                                "points": 3
                            },
                            {
                                "points": 3
                            }
                        ]
                    },
                    {
                        "name": "Division 2: Smaragd",
                        "flags": [
                            "CanLosePoints"
                        ],
                        "large_icon": "https://render.guildwars2.com/file/200E21BCEE2030F80A6BF51D263BF6A06E6FB365/1313335.png",
                        "small_icon": "https://render.guildwars2.com/file/61223078386A6EBE0175E55AC5139417DDA1B41C/1313341.png",
                        "pip_icon": "https://render.guildwars2.com/file/29925CE31790C4C7A8122B36612D56AC41DFA008/1313347.png",
                        "tiers": [
                            {
                                "points": 4
                            },
                            {
                                "points": 4
                            },
                            {
                                "points": 4
                            },
                            {
                                "points": 4
                            },
                            {
                                "points": 4
                            }
                        ]
                    },
                    {
                        "name": "Division 3: Saphir",
                        "flags": [
                            "CanLosePoints"
                        ],
                        "large_icon": "https://render.guildwars2.com/file/EA98E99EAB380555E899AC73566C5D703632330C/1313336.png",
                        "small_icon": "https://render.guildwars2.com/file/400C2D032BE81ACB07AC3DFC967393599F5B7067/1313342.png",
                        "pip_icon": "https://render.guildwars2.com/file/C7049912A2084D4C752B2B30615C1AE731149601/1313348.png",
                        "tiers": [
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            }
                        ]
                    },
                    {
                        "name": "Division 4: Rubin",
                        "flags": [
                            "CanLosePoints",
                            "CanLoseTiers"
                        ],
                        "large_icon": "https://render.guildwars2.com/file/3902B664FACDDC41925A0ED7E0C0932A3DDD53BF/1313337.png",
                        "small_icon": "https://render.guildwars2.com/file/640D0EB6009C60F372E7C9E5951E667E4118A2FD/1313343.png",
                        "pip_icon": "https://render.guildwars2.com/file/AC281A9291CD25250764C60ECFC773A2C67B1225/1313349.png",
                        "tiers": [
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            }
                        ]
                    },
                    {
                        "name": "Division 5: Diamant",
                        "flags": [
                            "CanLosePoints",
                            "CanLoseTiers"
                        ],
                        "large_icon": "https://render.guildwars2.com/file/B59BEBA950BA90083D409DE42BA8789F300F305D/1313338.png",
                        "small_icon": "https://render.guildwars2.com/file/F40A6880FB80C53F39D32B021737256371BE26B6/1313344.png",
                        "pip_icon": "https://render.guildwars2.com/file/F8E6757D23AA4495CDC9AE28E1B1FEB844BD2B1A/1313350.png",
                        "tiers": [
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            }
                        ]
                    },
                    {
                        "name": "Division 6: Legendär",
                        "flags": [
                            "CanLosePoints",
                            "CanLoseTiers",
                            "Repeatable"
                        ],
                        "large_icon": "https://render.guildwars2.com/file/97E44C1BB3B7434639D470E9F25DD9C601ACEDD9/1313339.png",
                        "small_icon": "https://render.guildwars2.com/file/540530F225A8B39990DBB165227A0624F10DFF9A/1313345.png",
                        "pip_icon": "https://render.guildwars2.com/file/7BD522452275401F6C9EE2C29F08DAEC0C52F144/1313351.png",
                        "tiers": [
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            },
                            {
                                "points": 5
                            }
                        ]
                    }
                ],
                "leaderboards": {
                    "legendary": {
                        "settings": {
                            "name": "",
                            "duration": null,
                            "scoring": "E6487336-4B5B-4BFA-9CFA-9FF232CAEF85",
                            "tiers": [
                                {
                                    "range": [
                                        1,
                                        0.95
                                    ]
                                },
                                {
                                    "range": [
                                        0.95,
                                        0.9
                                    ]
                                },
                                {
                                    "range": [
                                        0.9,
                                        0.75
                                    ]
                                }
                            ]
                        },
                        "scorings": [
                            {
                                "id": "E6487336-4B5B-4BFA-9CFA-9FF232CAEF85",
                                "type": "Integer",
                                "description": "Aktueller Prestige-Rang. Prestige-Rang kann durch Siege oder Niederlagen in der legendären Division in Matches mit Rangwertung erhalten oder verloren werden.",
                                "name": "Prestige",
                                "ordering": "MoreIsBetter"
                            }
                        ]
                    },
                    "guild": {
                        "settings": {
                            "name": "",
                            "duration": null,
                            "scoring": "16F74226-5DDF-4FE7-ADC5-72A49DA30572",
                            "tiers": [
                                {
                                    "color": "#E5E4E2",
                                    "type": "Rank",
                                    "name": "Platin",
                                    "range": [
                                        1,
                                        1
                                    ]
                                },
                                {
                                    "color": "#EAC117",
                                    "type": "Rank",
                                    "name": "Gold",
                                    "range": [
                                        25,
                                        2
                                    ]
                                },
                                {
                                    "color": "#C0C0C0",
                                    "type": "Rank",
                                    "name": "Silber",
                                    "range": [
                                        100,
                                        26
                                    ]
                                },
                                {
                                    "color": "#D2691E",
                                    "type": "Rank",
                                    "name": "Bronze",
                                    "range": [
                                        250,
                                        101
                                    ]
                                },
                                {
                                    "color": "#C87533",
                                    "type": "Rank",
                                    "name": "Kupfer",
                                    "range": [
                                        1000,
                                        251
                                    ]
                                }
                            ]
                        },
                        "scorings": [
                            {
                                "id": "16F74226-5DDF-4FE7-ADC5-72A49DA30572",
                                "type": "Integer",
                                "description": "Die Team-Wertung zeigt das Fähigkeitsniveau Eures Teams an.",
                                "name": "Fertigkeitswertung",
                                "ordering": "MoreIsBetter"
                            },
                            {
                                "id": "9A9CB2FD-7D73-4DFE-8FDD-A97A9C7C0B0C",
                                "type": "Integer",
                                "description": "",
                                "name": "Siege",
                                "ordering": "MoreIsBetter"
                            },
                            {
                                "id": "9064DD25-2C75-48D6-88C9-7FAD18DC784D",
                                "type": "Integer",
                                "description": "",
                                "name": "Niederlagen",
                                "ordering": "LessIsBetter"
                            }
                        ]
                    }
                }
            }
            """.trimIndent()
        )
    }

}