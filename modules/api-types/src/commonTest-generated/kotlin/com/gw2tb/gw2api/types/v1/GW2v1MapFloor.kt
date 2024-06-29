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
package com.gw2tb.gw2api.types.v1

import kotlin.test.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*

class GW2v1MapFloorTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v1MapFloor>(
            """
            {
                "texture_dims": [
                    49152,
                    49152
                ],
                "clamped_view": [
                    [
                        0,
                        0
                    ],
                    [
                        38000,
                        48000
                    ]
                ],
                "regions": {
                    "1": {
                        "name": "Shiverpeak Mountains",
                        "label_coord": [
                            19840,
                            13568
                        ],
                        "continent_rect": [
                            [
                                17664,
                                8064
                            ],
                            [
                                23808,
                                21376
                            ]
                        ],
                        "maps": {
                            "26": {
                                "name": "Dredgehaunt Cliffs",
                                "min_level": 40,
                                "max_level": 50,
                                "default_floor": 1,
                                "label_coord": [
                                    20608,
                                    16576
                                ],
                                "map_rect": [
                                    [
                                        -27648,
                                        -36864
                                    ],
                                    [
                                        27648,
                                        39936
                                    ]
                                ],
                                "continent_rect": [
                                    [
                                        19456,
                                        14976
                                    ],
                                    [
                                        21760,
                                        18176
                                    ]
                                ],
                                "points_of_interest": [
                                    {
                                        "poi_id": 1577,
                                        "name": "Bear's Jaws Shrine",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            19765.9,
                                            16239.2
                                        ]
                                    },
                                    {
                                        "poi_id": 561,
                                        "name": "Landslide Lee",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            20002.2,
                                            16128.5
                                        ]
                                    },
                                    {
                                        "poi_id": 558,
                                        "name": "Shelter Pointe",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            19609,
                                            16592.9
                                        ]
                                    },
                                    {
                                        "poi_id": 559,
                                        "name": "Vpered Drill",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            20502.8,
                                            16770
                                        ]
                                    },
                                    {
                                        "poi_id": 1266,
                                        "name": "Firebase Molek",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            20609.6,
                                            17606
                                        ]
                                    },
                                    {
                                        "poi_id": 1267,
                                        "name": "Tomb of Morlog",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            19702.7,
                                            18020.4
                                        ]
                                    },
                                    {
                                        "poi_id": 1268,
                                        "name": "Tomb of Blackpowder",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            20088.6,
                                            17381.5
                                        ]
                                    },
                                    {
                                        "poi_id": 1269,
                                        "name": "Tomb of Stoneskin",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            20609.9,
                                            16905.7
                                        ]
                                    },
                                    {
                                        "poi_id": 566,
                                        "name": "The Speaking Place",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            21575.8,
                                            15971.2
                                        ]
                                    },
                                    {
                                        "poi_id": 565,
                                        "name": "Talecrafting Steading",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            21057.5,
                                            15420.4
                                        ]
                                    },
                                    {
                                        "poi_id": 562,
                                        "name": "Travelen's Steading",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            20035.6,
                                            15392.8
                                        ]
                                    },
                                    {
                                        "poi_id": 1291,
                                        "name": "Brandalf's Steading",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            20942.5,
                                            15221.8
                                        ]
                                    },
                                    {
                                        "poi_id": 555,
                                        "name": "Fridgardr Lodge",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            20839.2,
                                            17357.9
                                        ]
                                    },
                                    {
                                        "poi_id": 564,
                                        "name": "Skovtrolde Hearthstead",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            20647.6,
                                            15245.6
                                        ]
                                    },
                                    {
                                        "poi_id": 1486,
                                        "name": "Falooaloo",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            19760.9,
                                            15379.5
                                        ]
                                    },
                                    {
                                        "poi_id": 1579,
                                        "name": "Raven's Wing Shrine",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            21577.7,
                                            16505.6
                                        ]
                                    },
                                    {
                                        "poi_id": 563,
                                        "name": "Bergtrolde",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            20458.5,
                                            15746
                                        ]
                                    },
                                    {
                                        "poi_id": 560,
                                        "name": "Theign Kenning",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            20737.7,
                                            15902.6
                                        ]
                                    },
                                    {
                                        "poi_id": 557,
                                        "name": "Esjudare Scratch",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            19656.2,
                                            17271.3
                                        ]
                                    },
                                    {
                                        "poi_id": 1700,
                                        "name": "Ghost Stones",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            19924.2,
                                            15969.2
                                        ]
                                    },
                                    {
                                        "poi_id": 554,
                                        "name": "Leaning Grade",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            19889.7,
                                            16594.8
                                        ]
                                    },
                                    {
                                        "poi_id": 1578,
                                        "name": "Leopard's Snarl Shrine",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            19625.9,
                                            15262.8
                                        ]
                                    },
                                    {
                                        "poi_id": 556,
                                        "name": "Mantelet Refuge",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            20927.3,
                                            17842.1
                                        ]
                                    },
                                    {
                                        "poi_id": 1580,
                                        "name": "Wolf's Lair Shrine",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            20723.6,
                                            15004.4
                                        ]
                                    },
                                    {
                                        "poi_id": 602,
                                        "name": "Grey Road Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            20684.6,
                                            17105.3
                                        ]
                                    },
                                    {
                                        "poi_id": 1572,
                                        "name": "",
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            19667,
                                            16126.6
                                        ]
                                    },
                                    {
                                        "poi_id": 610,
                                        "name": "Graupel Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            20805.7,
                                            15265.5
                                        ]
                                    },
                                    {
                                        "poi_id": 604,
                                        "name": "Toran Hollow Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            19683.1,
                                            16311
                                        ]
                                    },
                                    {
                                        "poi_id": 1570,
                                        "name": "",
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            20675.2,
                                            15258.4
                                        ]
                                    },
                                    {
                                        "poi_id": 609,
                                        "name": "Mountain's Tail Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            21164.7,
                                            15744
                                        ]
                                    },
                                    {
                                        "poi_id": 1575,
                                        "name": "",
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            20947.7,
                                            17761.8
                                        ]
                                    },
                                    {
                                        "poi_id": 1573,
                                        "name": "",
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            20524.4,
                                            16696.5
                                        ]
                                    },
                                    {
                                        "poi_id": 612,
                                        "name": "Travelen's Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            20141.4,
                                            15425.3
                                        ]
                                    },
                                    {
                                        "poi_id": 606,
                                        "name": "Kenning Testing Ground Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            20806.8,
                                            16337.3
                                        ]
                                    },
                                    {
                                        "poi_id": 1343,
                                        "name": "Sorrow's Embrace Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            19768.4,
                                            17691.8
                                        ]
                                    },
                                    {
                                        "poi_id": 605,
                                        "name": "Hessdallen Kenning Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            20307.5,
                                            16045
                                        ]
                                    },
                                    {
                                        "poi_id": 599,
                                        "name": "Frostland Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            20659.1,
                                            17906.6
                                        ]
                                    },
                                    {
                                        "poi_id": 611,
                                        "name": "Havfrue Basin Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            20504,
                                            15514.2
                                        ]
                                    },
                                    {
                                        "poi_id": 598,
                                        "name": "Tribulation Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            20121.5,
                                            17733.4
                                        ]
                                    },
                                    {
                                        "poi_id": 1571,
                                        "name": "",
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            19709.6,
                                            18048
                                        ]
                                    },
                                    {
                                        "poi_id": 1569,
                                        "name": "",
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            20371,
                                            16003.8
                                        ]
                                    },
                                    {
                                        "poi_id": 608,
                                        "name": "Nottowr Fault Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            21558,
                                            15649.7
                                        ]
                                    },
                                    {
                                        "poi_id": 613,
                                        "name": "Wyrmblood Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            19922.2,
                                            15772.4
                                        ]
                                    },
                                    {
                                        "poi_id": 603,
                                        "name": "Steelbrachen Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            19936.6,
                                            17105
                                        ]
                                    },
                                    {
                                        "poi_id": 1576,
                                        "name": "",
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            21268.3,
                                            17897.9
                                        ]
                                    },
                                    {
                                        "poi_id": 1574,
                                        "name": "",
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            19896.3,
                                            15373
                                        ]
                                    },
                                    {
                                        "poi_id": 1732,
                                        "name": "Sorrow's Embrace",
                                        "type": "unlock",
                                        "floor": 1,
                                        "coord": [
                                            19676.3,
                                            17719.4
                                        ],
                                        "marker": {
                                            "file_id": 102478,
                                            "signature": "943538394A94A491C8632FBEF6203C2013443555"
                                        }
                                    },
                                    {
                                        "poi_id": 1262,
                                        "name": "Granite Citadel Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            21445.2,
                                            17323.6
                                        ]
                                    },
                                    {
                                        "poi_id": 601,
                                        "name": "Seven Pines Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            21048.4,
                                            16879.4
                                        ]
                                    },
                                    {
                                        "poi_id": 607,
                                        "name": "Wide Expanse Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            21383.4,
                                            16227.5
                                        ]
                                    },
                                    {
                                        "poi_id": 600,
                                        "name": "Dociu Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            21240.3,
                                            17650.7
                                        ]
                                    }
                                ],
                                "god_shrines": [],
                                "tasks": [
                                    {
                                        "task_id": 7,
                                        "objective": "Help Explorer Brokkar sabotage dredge munitions.",
                                        "level": 49,
                                        "coord": [
                                            20414.9,
                                            17761.3
                                        ],
                                        "bounds": [
                                            [
                                                20482.3,
                                                17739.6
                                            ],
                                            [
                                                20386.4,
                                                17710.4
                                            ],
                                            [
                                                20325.1,
                                                17724.4
                                            ],
                                            [
                                                20320.2,
                                                17768.7
                                            ],
                                            [
                                                20315.9,
                                                17812.6
                                            ],
                                            [
                                                20312.6,
                                                17854.9
                                            ],
                                            [
                                                20248.7,
                                                17885.9
                                            ],
                                            [
                                                20192.9,
                                                17953.1
                                            ],
                                            [
                                                20175.9,
                                                18068.4
                                            ],
                                            [
                                                20232.2,
                                                18098.9
                                            ],
                                            [
                                                20300.6,
                                                18088
                                            ],
                                            [
                                                20355.8,
                                                18032.8
                                            ],
                                            [
                                                20449.6,
                                                18012.5
                                            ],
                                            [
                                                20544.7,
                                                17951.1
                                            ],
                                            [
                                                20544.4,
                                                17806.1
                                            ],
                                            [
                                                20482.3,
                                                17739.6
                                            ]
                                        ]
                                    },
                                    {
                                        "task_id": 8,
                                        "objective": "Help Magister Kathryn wound dredge forces.",
                                        "level": 50,
                                        "coord": [
                                            20101.6,
                                            17793.3
                                        ],
                                        "bounds": [
                                            [
                                                19643.6,
                                                18118.3
                                            ],
                                            [
                                                19805.3,
                                                18158
                                            ],
                                            [
                                                19946.4,
                                                18103.7
                                            ],
                                            [
                                                20055.8,
                                                18022.9
                                            ],
                                            [
                                                20170.6,
                                                17881.1
                                            ],
                                            [
                                                20150,
                                                17760.8
                                            ],
                                            [
                                                20041.9,
                                                17693.3
                                            ],
                                            [
                                                19920.5,
                                                17653.2
                                            ],
                                            [
                                                19850.2,
                                                17706.2
                                            ],
                                            [
                                                19717.2,
                                                17781.1
                                            ],
                                            [
                                                19626.8,
                                                17917.4
                                            ],
                                            [
                                                19643.6,
                                                18118.3
                                            ]
                                        ]
                                    },
                                    {
                                        "task_id": 4,
                                        "objective": "Help the Priory thwart dredge excavation in Dostoev Sky Peak.",
                                        "level": 46,
                                        "coord": [
                                            20626.2,
                                            16662.7
                                        ],
                                        "bounds": [
                                            [
                                                20715.8,
                                                17037
                                            ],
                                            [
                                                20590,
                                                17071.2
                                            ],
                                            [
                                                20475.4,
                                                17160.3
                                            ],
                                            [
                                                20364.9,
                                                17046.4
                                            ],
                                            [
                                                20224.8,
                                                17004.7
                                            ],
                                            [
                                                20148.9,
                                                16834.6
                                            ],
                                            [
                                                20069.3,
                                                16677.3
                                            ],
                                            [
                                                20099.6,
                                                16562
                                            ],
                                            [
                                                20242,
                                                16498.6
                                            ],
                                            [
                                                20343,
                                                16429.1
                                            ],
                                            [
                                                20471.6,
                                                16401.8
                                            ],
                                            [
                                                20572.9,
                                                16426.1
                                            ],
                                            [
                                                20661.1,
                                                16489.2
                                            ],
                                            [
                                                20776.7,
                                                16530
                                            ],
                                            [
                                                20868.6,
                                                16507.5
                                            ],
                                            [
                                                20926.6,
                                                16598
                                            ],
                                            [
                                                20958.3,
                                                16737.5
                                            ],
                                            [
                                                20958.6,
                                                16902.5
                                            ],
                                            [
                                                20863.3,
                                                16952.8
                                            ],
                                            [
                                                20792.7,
                                                16985.2
                                            ],
                                            [
                                                20715.8,
                                                17037
                                            ]
                                        ]
                                    },
                                    {
                                        "task_id": 5,
                                        "objective": "Help Arcanist Vance study dwarven relics at Granite Citadel.",
                                        "level": 47,
                                        "coord": [
                                            21449.1,
                                            17498.8
                                        ],
                                        "bounds": [
                                            [
                                                21400.2,
                                                17078.1
                                            ],
                                            [
                                                21460.1,
                                                17099
                                            ],
                                            [
                                                21487.6,
                                                17228.7
                                            ],
                                            [
                                                21564.9,
                                                17196.6
                                            ],
                                            [
                                                21614.5,
                                                17334.9
                                            ],
                                            [
                                                21620.3,
                                                17564.4
                                            ],
                                            [
                                                21607.8,
                                                17660
                                            ],
                                            [
                                                21537.1,
                                                17698.3
                                            ],
                                            [
                                                21480,
                                                17712.4
                                            ],
                                            [
                                                21404.7,
                                                17710.1
                                            ],
                                            [
                                                21373.1,
                                                17703.3
                                            ],
                                            [
                                                21342.2,
                                                17659.6
                                            ],
                                            [
                                                21288.7,
                                                17610.5
                                            ],
                                            [
                                                21311.5,
                                                17527.7
                                            ],
                                            [
                                                21235.3,
                                                17384.3
                                            ],
                                            [
                                                21306.6,
                                                17244.8
                                            ],
                                            [
                                                21358.9,
                                                17153
                                            ],
                                            [
                                                21400.2,
                                                17078.1
                                            ]
                                        ]
                                    },
                                    {
                                        "task_id": 6,
                                        "objective": "Help Magister Roslin infiltrate Black Earth Mine.",
                                        "level": 48,
                                        "coord": [
                                            21282.4,
                                            17658.3
                                        ],
                                        "bounds": [
                                            [
                                                21477.8,
                                                18156.9
                                            ],
                                            [
                                                21608.8,
                                                18169.7
                                            ],
                                            [
                                                21751.5,
                                                18078.5
                                            ],
                                            [
                                                21748.7,
                                                17750.5
                                            ],
                                            [
                                                21601.6,
                                                17675.8
                                            ],
                                            [
                                                21534.9,
                                                17713.9
                                            ],
                                            [
                                                21414.2,
                                                17729.3
                                            ],
                                            [
                                                21365.6,
                                                17714.2
                                            ],
                                            [
                                                21333,
                                                17668.6
                                            ],
                                            [
                                                21271.9,
                                                17614.1
                                            ],
                                            [
                                                21180.1,
                                                17587.1
                                            ],
                                            [
                                                21117.3,
                                                17706.8
                                            ],
                                            [
                                                21037,
                                                17780.9
                                            ],
                                            [
                                                21022,
                                                17839.7
                                            ],
                                            [
                                                20994.3,
                                                17918.7
                                            ],
                                            [
                                                20983.7,
                                                17975.5
                                            ],
                                            [
                                                21154.1,
                                                18142.8
                                            ],
                                            [
                                                21346,
                                                18191.1
                                            ],
                                            [
                                                21477.8,
                                                18156.9
                                            ]
                                        ]
                                    },
                                    {
                                        "task_id": 9,
                                        "objective": "Protect the Snow Leopard shrine from the Svanir.",
                                        "level": 42,
                                        "coord": [
                                            19851.5,
                                            15603
                                        ],
                                        "bounds": [
                                            [
                                                19583.6,
                                                15437.8
                                            ],
                                            [
                                                19544.4,
                                                15300.4
                                            ],
                                            [
                                                19632.3,
                                                15181.9
                                            ],
                                            [
                                                19895.3,
                                                15174.5
                                            ],
                                            [
                                                19989.4,
                                                15263.8
                                            ],
                                            [
                                                19985,
                                                15338.7
                                            ],
                                            [
                                                19865.2,
                                                15386.9
                                            ],
                                            [
                                                19833.7,
                                                15456.5
                                            ],
                                            [
                                                19893.8,
                                                15593.5
                                            ],
                                            [
                                                19764.6,
                                                15687.5
                                            ],
                                            [
                                                19593.6,
                                                15610.9
                                            ],
                                            [
                                                19583.6,
                                                15437.8
                                            ]
                                        ]
                                    },
                                    {
                                        "task_id": 10,
                                        "objective": "Defend Travelen's Steading against Svanir attacks.",
                                        "level": 43,
                                        "coord": [
                                            20013.3,
                                            15410.2
                                        ],
                                        "bounds": [
                                            [
                                                19977.5,
                                                15350.7
                                            ],
                                            [
                                                19871.7,
                                                15389.3
                                            ],
                                            [
                                                19843.8,
                                                15454.8
                                            ],
                                            [
                                                19877.3,
                                                15518.2
                                            ],
                                            [
                                                20058,
                                                15604.8
                                            ],
                                            [
                                                20292.8,
                                                15544.2
                                            ],
                                            [
                                                20378.2,
                                                15359.2
                                            ],
                                            [
                                                20273.6,
                                                15280.2
                                            ],
                                            [
                                                19977.5,
                                                15350.7
                                            ]
                                        ]
                                    },
                                    {
                                        "task_id": 11,
                                        "objective": "Help the grawl stave off Svanir attacks.",
                                        "level": 44,
                                        "coord": [
                                            20844.3,
                                            15681.8
                                        ],
                                        "bounds": [
                                            [
                                                20736.7,
                                                15704
                                            ],
                                            [
                                                20729.6,
                                                15467.7
                                            ],
                                            [
                                                20992.6,
                                                15287.7
                                            ],
                                            [
                                                21384.6,
                                                15395.6
                                            ],
                                            [
                                                21441.1,
                                                15492
                                            ],
                                            [
                                                21380.9,
                                                15608.8
                                            ],
                                            [
                                                21256.3,
                                                15611.4
                                            ],
                                            [
                                                21143.9,
                                                15755.1
                                            ],
                                            [
                                                20819.2,
                                                15773.5
                                            ],
                                            [
                                                20736.7,
                                                15704
                                            ]
                                        ]
                                    },
                                    {
                                        "task_id": 2,
                                        "objective": "Assist the skritt of Ratatosk.",
                                        "level": 45,
                                        "coord": [
                                            21395.6,
                                            15728.6
                                        ],
                                        "bounds": [
                                            [
                                                21736.5,
                                                15601.3
                                            ],
                                            [
                                                21627.6,
                                                15460.7
                                            ],
                                            [
                                                21500.3,
                                                15500.2
                                            ],
                                            [
                                                21433,
                                                15589.4
                                            ],
                                            [
                                                21407.5,
                                                15634.3
                                            ],
                                            [
                                                21343.3,
                                                15669.4
                                            ],
                                            [
                                                21282.7,
                                                15663.1
                                            ],
                                            [
                                                21243.3,
                                                15713.3
                                            ],
                                            [
                                                21228.9,
                                                15810.2
                                            ],
                                            [
                                                21243.4,
                                                16018.4
                                            ],
                                            [
                                                21393.2,
                                                16134
                                            ],
                                            [
                                                21438.4,
                                                16210
                                            ],
                                            [
                                                21503.3,
                                                16225.4
                                            ],
                                            [
                                                21622.7,
                                                16169.4
                                            ],
                                            [
                                                21748.2,
                                                16007.4
                                            ],
                                            [
                                                21736.5,
                                                15601.3
                                            ]
                                        ]
                                    },
                                    {
                                        "task_id": 1,
                                        "objective": "Assist Daphne in halting the encroaching corruption.",
                                        "level": 40,
                                        "coord": [
                                            19644.7,
                                            16604.2
                                        ],
                                        "bounds": [
                                            [
                                                19879.3,
                                                16376.9
                                            ],
                                            [
                                                19825.6,
                                                16330.5
                                            ],
                                            [
                                                19758.2,
                                                16334.6
                                            ],
                                            [
                                                19597,
                                                16428.5
                                            ],
                                            [
                                                19547.8,
                                                16495.6
                                            ],
                                            [
                                                19545.2,
                                                16681.1
                                            ],
                                            [
                                                19584.7,
                                                16912
                                            ],
                                            [
                                                19675.6,
                                                17092.4
                                            ],
                                            [
                                                19965.5,
                                                17061.1
                                            ],
                                            [
                                                20156.7,
                                                16814.3
                                            ],
                                            [
                                                20036.3,
                                                16537.6
                                            ],
                                            [
                                                19879.3,
                                                16376.9
                                            ]
                                        ]
                                    },
                                    {
                                        "task_id": 3,
                                        "objective": "Help Antal the Patient impress the skritt in Kolkorensburg.",
                                        "level": 41,
                                        "coord": [
                                            20135.5,
                                            16038.7
                                        ],
                                        "bounds": [
                                            [
                                                20421.4,
                                                15797.4
                                            ],
                                            [
                                                20368.9,
                                                15610.2
                                            ],
                                            [
                                                20221.7,
                                                15568.2
                                            ],
                                            [
                                                19986.6,
                                                15652.2
                                            ],
                                            [
                                                20017,
                                                15789.8
                                            ],
                                            [
                                                19958.3,
                                                15860
                                            ],
                                            [
                                                19835.6,
                                                15900
                                            ],
                                            [
                                                19809.8,
                                                16068.6
                                            ],
                                            [
                                                19846.1,
                                                16173.4
                                            ],
                                            [
                                                19937,
                                                16175.4
                                            ],
                                            [
                                                20028.6,
                                                16186.2
                                            ],
                                            [
                                                20162.2,
                                                16127.9
                                            ],
                                            [
                                                20203.9,
                                                16010.5
                                            ],
                                            [
                                                20302.2,
                                                15933
                                            ],
                                            [
                                                20421.4,
                                                15797.4
                                            ]
                                        ]
                                    }
                                ],
                                "skill_challenges": [
                                    {
                                        "expac": 0,
                                        "idx": 29,
                                        "coord": [
                                            20381.6,
                                            16613.8
                                        ]
                                    },
                                    {
                                        "expac": 0,
                                        "idx": 91,
                                        "coord": [
                                            19572.7,
                                            17262.6
                                        ]
                                    },
                                    {
                                        "expac": 0,
                                        "idx": 58,
                                        "coord": [
                                            20668.7,
                                            15883.5
                                        ]
                                    },
                                    {
                                        "expac": 0,
                                        "idx": 90,
                                        "coord": [
                                            21598.7,
                                            15951.9
                                        ]
                                    },
                                    {
                                        "expac": 0,
                                        "idx": 33,
                                        "coord": [
                                            21287.3,
                                            16397.8
                                        ]
                                    },
                                    {
                                        "expac": 0,
                                        "idx": 89,
                                        "coord": [
                                            21659.2,
                                            18082.4
                                        ]
                                    }
                                ],
                                "sectors": [
                                    {
                                        "sector_id": 526,
                                        "name": "Dostoev Sky Peak",
                                        "level": 46,
                                        "coord": [
                                            20564.9,
                                            16726.1
                                        ],
                                        "bounds": [
                                            [
                                                20141.6,
                                                16586.4
                                            ],
                                            [
                                                20180.5,
                                                16493.1
                                            ],
                                            [
                                                20440.8,
                                                16262.2
                                            ],
                                            [
                                                20538.2,
                                                16287.4
                                            ],
                                            [
                                                20691.6,
                                                16533.4
                                            ],
                                            [
                                                20957.9,
                                                16638.9
                                            ],
                                            [
                                                20935.5,
                                                16910.6
                                            ],
                                            [
                                                20896.6,
                                                16986.1
                                            ],
                                            [
                                                20808.5,
                                                16967
                                            ],
                                            [
                                                20611.9,
                                                17046
                                            ],
                                            [
                                                20415.2,
                                                17158.4
                                            ],
                                            [
                                                20160.9,
                                                16843.6
                                            ],
                                            [
                                                20141.6,
                                                16586.4
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 1067,
                                        "name": "Forsaken Halls",
                                        "level": 43,
                                        "coord": [
                                            21474.9,
                                            15110.5
                                        ],
                                        "bounds": [
                                            [
                                                21746.3,
                                                15193.8
                                            ],
                                            [
                                                21744.4,
                                                14976.5
                                            ],
                                            [
                                                21199.6,
                                                15011.5
                                            ],
                                            [
                                                21209.5,
                                                15260.3
                                            ],
                                            [
                                                21746.3,
                                                15193.8
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 528,
                                        "name": "The Wide Expanse",
                                        "level": 46,
                                        "coord": [
                                            21375.2,
                                            16402.8
                                        ],
                                        "bounds": [
                                            [
                                                20957.5,
                                                16640.6
                                            ],
                                            [
                                                21281.2,
                                                16710.9
                                            ],
                                            [
                                                21696.5,
                                                16565.2
                                            ],
                                            [
                                                21793.2,
                                                16423.2
                                            ],
                                            [
                                                21849.4,
                                                16260.2
                                            ],
                                            [
                                                21918.5,
                                                16188.4
                                            ],
                                            [
                                                21218.1,
                                                16120.5
                                            ],
                                            [
                                                20969.8,
                                                16182.4
                                            ],
                                            [
                                                20692.9,
                                                16533.5
                                            ],
                                            [
                                                20957.5,
                                                16640.6
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 527,
                                        "name": "Nakrojos Pass",
                                        "level": 48,
                                        "coord": [
                                            21425.2,
                                            16889.5
                                        ],
                                        "bounds": [
                                            [
                                                21234.6,
                                                17102
                                            ],
                                            [
                                                21391.5,
                                                16984
                                            ],
                                            [
                                                21584.5,
                                                17059.5
                                            ],
                                            [
                                                21686,
                                                17204
                                            ],
                                            [
                                                21738.8,
                                                17004.8
                                            ],
                                            [
                                                21746.3,
                                                16717
                                            ],
                                            [
                                                21697.8,
                                                16563.9
                                            ],
                                            [
                                                21280.9,
                                                16710.3
                                            ],
                                            [
                                                20957.1,
                                                16638.5
                                            ],
                                            [
                                                20934.8,
                                                16910.8
                                            ],
                                            [
                                                21234.6,
                                                17102
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 523,
                                        "name": "The Grey Road",
                                        "level": 48,
                                        "coord": [
                                            20939.3,
                                            17231
                                        ],
                                        "bounds": [
                                            [
                                                20415.5,
                                                17157.8
                                            ],
                                            [
                                                20610.3,
                                                17046.1
                                            ],
                                            [
                                                20807.6,
                                                16966.8
                                            ],
                                            [
                                                20897.2,
                                                16985.4
                                            ],
                                            [
                                                20934.7,
                                                16909.3
                                            ],
                                            [
                                                21234.8,
                                                17101.1
                                            ],
                                            [
                                                21217,
                                                17270.4
                                            ],
                                            [
                                                21307.5,
                                                17469.7
                                            ],
                                            [
                                                21299.3,
                                                17655.3
                                            ],
                                            [
                                                21079.8,
                                                17753.8
                                            ],
                                            [
                                                20528.8,
                                                17225.1
                                            ],
                                            [
                                                20415.5,
                                                17157.8
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 521,
                                        "name": "Betrayal Grounds",
                                        "level": 48,
                                        "coord": [
                                            21516.8,
                                            17602.1
                                        ],
                                        "bounds": [
                                            [
                                                21299.7,
                                                17655.1
                                            ],
                                            [
                                                21490.8,
                                                17679.4
                                            ],
                                            [
                                                21591.3,
                                                17802.6
                                            ],
                                            [
                                                21725.1,
                                                17806.7
                                            ],
                                            [
                                                21646.2,
                                                17430.8
                                            ],
                                            [
                                                21619,
                                                17444.5
                                            ],
                                            [
                                                21457.3,
                                                17529
                                            ],
                                            [
                                                21305.6,
                                                17469.1
                                            ],
                                            [
                                                21299.7,
                                                17655.1
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 530,
                                        "name": "Troll's Teeth",
                                        "level": 42,
                                        "coord": [
                                            20158.2,
                                            16101
                                        ],
                                        "bounds": [
                                            [
                                                19794.3,
                                                16419.9
                                            ],
                                            [
                                                20181,
                                                16494.3
                                            ],
                                            [
                                                20441.5,
                                                16263.3
                                            ],
                                            [
                                                20609.6,
                                                15987.2
                                            ],
                                            [
                                                20613.7,
                                                15869.2
                                            ],
                                            [
                                                20361.3,
                                                15763.4
                                            ],
                                            [
                                                20293.8,
                                                15912.7
                                            ],
                                            [
                                                19958.3,
                                                16061.3
                                            ],
                                            [
                                                19800.1,
                                                16048.5
                                            ],
                                            [
                                                19790.7,
                                                16091.5
                                            ],
                                            [
                                                19895.8,
                                                16200
                                            ],
                                            [
                                                19794.3,
                                                16419.9
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 537,
                                        "name": "Ulukk's Hunger",
                                        "level": 45,
                                        "coord": [
                                            21578,
                                            15341.7
                                        ],
                                        "bounds": [
                                            [
                                                21634.4,
                                                15419
                                            ],
                                            [
                                                21768.1,
                                                15332.6
                                            ],
                                            [
                                                21789.6,
                                                15284.8
                                            ],
                                            [
                                                21758.3,
                                                15194.1
                                            ],
                                            [
                                                21405.7,
                                                15235.7
                                            ],
                                            [
                                                21422.5,
                                                15364
                                            ],
                                            [
                                                21408.2,
                                                15439.1
                                            ],
                                            [
                                                21437.2,
                                                15463.9
                                            ],
                                            [
                                                21634.4,
                                                15419
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 538,
                                        "name": "Ratatosk",
                                        "level": 45,
                                        "coord": [
                                            21677.7,
                                            15719.4
                                        ],
                                        "bounds": [
                                            [
                                                21917.8,
                                                16204.4
                                            ],
                                            [
                                                21964.8,
                                                16047.5
                                            ],
                                            [
                                                22048.6,
                                                15887.3
                                            ],
                                            [
                                                22196.5,
                                                15767.7
                                            ],
                                            [
                                                21805.6,
                                                15514.9
                                            ],
                                            [
                                                21767,
                                                15333.3
                                            ],
                                            [
                                                21634.4,
                                                15418.7
                                            ],
                                            [
                                                21480.1,
                                                15448.9
                                            ],
                                            [
                                                21467,
                                                15572.7
                                            ],
                                            [
                                                21342.6,
                                                15643.8
                                            ],
                                            [
                                                21293.3,
                                                15672
                                            ],
                                            [
                                                21215.2,
                                                16122.3
                                            ],
                                            [
                                                21917.8,
                                                16204.4
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 534,
                                        "name": "Snowslide Ravine",
                                        "level": 43,
                                        "coord": [
                                            20232.8,
                                            15191.4
                                        ],
                                        "bounds": [
                                            [
                                                20564.4,
                                                14934.5
                                            ],
                                            [
                                                20475.2,
                                                15275.1
                                            ],
                                            [
                                                20454.5,
                                                15416.2
                                            ],
                                            [
                                                20282.3,
                                                15559
                                            ],
                                            [
                                                19931.2,
                                                15554.8
                                            ],
                                            [
                                                19926.9,
                                                15344
                                            ],
                                            [
                                                19941.3,
                                                14927.1
                                            ],
                                            [
                                                20093.6,
                                                14992.3
                                            ],
                                            [
                                                20244.8,
                                                14926.4
                                            ],
                                            [
                                                20413.6,
                                                14984.2
                                            ],
                                            [
                                                20564.4,
                                                14934.5
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 529,
                                        "name": "Theign Spiritwalk",
                                        "level": 44,
                                        "coord": [
                                            20715.1,
                                            16051.1
                                        ],
                                        "bounds": [
                                            [
                                                20441.9,
                                                16261.9
                                            ],
                                            [
                                                20608.5,
                                                15986.6
                                            ],
                                            [
                                                20613.7,
                                                15869.4
                                            ],
                                            [
                                                20695.7,
                                                15723.2
                                            ],
                                            [
                                                20875.2,
                                                15712
                                            ],
                                            [
                                                21001.1,
                                                15901.8
                                            ],
                                            [
                                                20970.1,
                                                16183
                                            ],
                                            [
                                                20692.6,
                                                16533.7
                                            ],
                                            [
                                                20537.1,
                                                16288.7
                                            ],
                                            [
                                                20441.9,
                                                16261.9
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 532,
                                        "name": "Wyrmblood Lake",
                                        "level": 42,
                                        "coord": [
                                            19660.9,
                                            15333.9
                                        ],
                                        "bounds": [
                                            [
                                                19938.7,
                                                14921.5
                                            ],
                                            [
                                                19927.8,
                                                15344.3
                                            ],
                                            [
                                                19938.9,
                                                15754.8
                                            ],
                                            [
                                                19779.2,
                                                15955.9
                                            ],
                                            [
                                                19465.8,
                                                16047.1
                                            ],
                                            [
                                                19437.6,
                                                15638.7
                                            ],
                                            [
                                                19412.1,
                                                15355.4
                                            ],
                                            [
                                                19375.2,
                                                15133.7
                                            ],
                                            [
                                                19467.1,
                                                14859.7
                                            ],
                                            [
                                                19682.9,
                                                14809.8
                                            ],
                                            [
                                                19844.5,
                                                14851.7
                                            ],
                                            [
                                                19938.7,
                                                14921.5
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 533,
                                        "name": "Kolkorensburg",
                                        "level": 42,
                                        "coord": [
                                            20043.1,
                                            15825.9
                                        ],
                                        "bounds": [
                                            [
                                                19797.5,
                                                16050
                                            ],
                                            [
                                                19958.3,
                                                16061.9
                                            ],
                                            [
                                                20294.2,
                                                15912.9
                                            ],
                                            [
                                                20360.2,
                                                15762.9
                                            ],
                                            [
                                                20281.9,
                                                15559.1
                                            ],
                                            [
                                                19932.4,
                                                15553.7
                                            ],
                                            [
                                                19939.4,
                                                15754.1
                                            ],
                                            [
                                                19780.9,
                                                15952.7
                                            ],
                                            [
                                                19797.5,
                                                16050
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 535,
                                        "name": "Graupel Kohn",
                                        "level": 44,
                                        "coord": [
                                            20751.9,
                                            15299.6
                                        ],
                                        "bounds": [
                                            [
                                                20613.6,
                                                15869.9
                                            ],
                                            [
                                                20695.6,
                                                15723.5
                                            ],
                                            [
                                                20874.7,
                                                15712.5
                                            ],
                                            [
                                                20967.5,
                                                15372.3
                                            ],
                                            [
                                                21226,
                                                15260
                                            ],
                                            [
                                                21189.4,
                                                14982.6
                                            ],
                                            [
                                                20988.3,
                                                14984
                                            ],
                                            [
                                                20965.9,
                                                14854.8
                                            ],
                                            [
                                                20834.2,
                                                14864.8
                                            ],
                                            [
                                                20787,
                                                14922.4
                                            ],
                                            [
                                                20565.2,
                                                14934.6
                                            ],
                                            [
                                                20475.3,
                                                15274.9
                                            ],
                                            [
                                                20454.1,
                                                15415.3
                                            ],
                                            [
                                                20281,
                                                15558.9
                                            ],
                                            [
                                                20360.9,
                                                15763.3
                                            ],
                                            [
                                                20613.6,
                                                15869.9
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 531,
                                        "name": "Toran Hollow",
                                        "level": 40,
                                        "coord": [
                                            19627.2,
                                            16230.9
                                        ],
                                        "bounds": [
                                            [
                                                19465.9,
                                                16043.9
                                            ],
                                            [
                                                19779.4,
                                                15954.1
                                            ],
                                            [
                                                19800,
                                                16047.3
                                            ],
                                            [
                                                19791.7,
                                                16091.8
                                            ],
                                            [
                                                19896.4,
                                                16200.5
                                            ],
                                            [
                                                19794.6,
                                                16419.3
                                            ],
                                            [
                                                19461.3,
                                                16567.5
                                            ],
                                            [
                                                19327.1,
                                                16546.2
                                            ],
                                            [
                                                19328.5,
                                                16207.7
                                            ],
                                            [
                                                19465.9,
                                                16043.9
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 518,
                                        "name": "Frostland Melt",
                                        "level": 49,
                                        "coord": [
                                            20710,
                                            17921.7
                                        ],
                                        "bounds": [
                                            [
                                                20415.5,
                                                17157.8
                                            ],
                                            [
                                                20528.7,
                                                17224.4
                                            ],
                                            [
                                                21079.3,
                                                17753.5
                                            ],
                                            [
                                                21082.1,
                                                17804.1
                                            ],
                                            [
                                                20974.4,
                                                17918.9
                                            ],
                                            [
                                                20991,
                                                18153.3
                                            ],
                                            [
                                                20781.2,
                                                18196.5
                                            ],
                                            [
                                                20721.4,
                                                18273.9
                                            ],
                                            [
                                                20620.7,
                                                18280.5
                                            ],
                                            [
                                                20561,
                                                18196.6
                                            ],
                                            [
                                                20396.2,
                                                18180.9
                                            ],
                                            [
                                                20368.8,
                                                17920
                                            ],
                                            [
                                                20415.5,
                                                17157.8
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 1075,
                                        "name": "Tribulation Caverns",
                                        "level": 50,
                                        "coord": [
                                            19603,
                                            17879.5
                                        ],
                                        "bounds": [
                                            [
                                                19615.7,
                                                17745.1
                                            ],
                                            [
                                                19679.6,
                                                17785.5
                                            ],
                                            [
                                                19690.5,
                                                17952.8
                                            ],
                                            [
                                                19610.8,
                                                18004
                                            ],
                                            [
                                                19607.3,
                                                18060.1
                                            ],
                                            [
                                                19684.8,
                                                18122.2
                                            ],
                                            [
                                                19598.1,
                                                18259.2
                                            ],
                                            [
                                                19385.8,
                                                18190.1
                                            ],
                                            [
                                                19345.3,
                                                17951.1
                                            ],
                                            [
                                                19485.4,
                                                17641.9
                                            ],
                                            [
                                                19668.2,
                                                17620.8
                                            ],
                                            [
                                                19717.3,
                                                17622
                                            ],
                                            [
                                                19718.8,
                                                17660.6
                                            ],
                                            [
                                                19634.5,
                                                17697.2
                                            ],
                                            [
                                                19615.7,
                                                17745.1
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 520,
                                        "name": "Black Earth Coalmine",
                                        "level": 49,
                                        "coord": [
                                            21419.4,
                                            18012.4
                                        ],
                                        "bounds": [
                                            [
                                                20989.2,
                                                18158.2
                                            ],
                                            [
                                                21241.2,
                                                18158.2
                                            ],
                                            [
                                                21477.5,
                                                18276.4
                                            ],
                                            [
                                                21611.9,
                                                18269
                                            ],
                                            [
                                                21699.5,
                                                18145.5
                                            ],
                                            [
                                                21729.1,
                                                18030.3
                                            ],
                                            [
                                                21705,
                                                17878.8
                                            ],
                                            [
                                                21727,
                                                17803.1
                                            ],
                                            [
                                                21591.7,
                                                17802.1
                                            ],
                                            [
                                                21404,
                                                17988.5
                                            ],
                                            [
                                                21220.4,
                                                17927.4
                                            ],
                                            [
                                                21081.5,
                                                17804.4
                                            ],
                                            [
                                                20974.1,
                                                17918.8
                                            ],
                                            [
                                                20989.2,
                                                18158.2
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 519,
                                        "name": "Dociu Excavation",
                                        "level": 49,
                                        "coord": [
                                            21309.4,
                                            17801.7
                                        ],
                                        "bounds": [
                                            [
                                                21082.6,
                                                17804.1
                                            ],
                                            [
                                                21219.3,
                                                17927.8
                                            ],
                                            [
                                                21403.8,
                                                17989.2
                                            ],
                                            [
                                                21591.5,
                                                17802.7
                                            ],
                                            [
                                                21490.9,
                                                17679.3
                                            ],
                                            [
                                                21299.8,
                                                17655.3
                                            ],
                                            [
                                                21078.3,
                                                17753.8
                                            ],
                                            [
                                                21082.6,
                                                17804.1
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 522,
                                        "name": "Spearhead Bane",
                                        "level": 48,
                                        "coord": [
                                            21461.2,
                                            17276.3
                                        ],
                                        "bounds": [
                                            [
                                                21216.1,
                                                17269.9
                                            ],
                                            [
                                                21234,
                                                17100.6
                                            ],
                                            [
                                                21390.3,
                                                16983.6
                                            ],
                                            [
                                                21585,
                                                17059.5
                                            ],
                                            [
                                                21678.6,
                                                17207.8
                                            ],
                                            [
                                                21664.1,
                                                17424.5
                                            ],
                                            [
                                                21618.6,
                                                17442.6
                                            ],
                                            [
                                                21456.9,
                                                17529.5
                                            ],
                                            [
                                                21307.2,
                                                17468.7
                                            ],
                                            [
                                                21216.1,
                                                17269.9
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 514,
                                        "name": "De Molish Post",
                                        "level": 50,
                                        "coord": [
                                            20248.1,
                                            18070.5
                                        ],
                                        "bounds": [
                                            [
                                                20070.5,
                                                18276.4
                                            ],
                                            [
                                                20402.2,
                                                18180.7
                                            ],
                                            [
                                                20386.3,
                                                18071.5
                                            ],
                                            [
                                                20372.9,
                                                17924
                                            ],
                                            [
                                                20188.2,
                                                17907.6
                                            ],
                                            [
                                                20068.3,
                                                18062.5
                                            ],
                                            [
                                                20070.5,
                                                18276.4
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 513,
                                        "name": "Tribulation Rift",
                                        "level": 50,
                                        "coord": [
                                            19816,
                                            17914.8
                                        ],
                                        "bounds": [
                                            [
                                                20190.2,
                                                17907.2
                                            ],
                                            [
                                                20069.4,
                                                18061.1
                                            ],
                                            [
                                                20072.8,
                                                18275.1
                                            ],
                                            [
                                                19871.2,
                                                18310.9
                                            ],
                                            [
                                                19599.6,
                                                18257.9
                                            ],
                                            [
                                                19683.3,
                                                18120.9
                                            ],
                                            [
                                                19607.3,
                                                18060.1
                                            ],
                                            [
                                                19611,
                                                18004.7
                                            ],
                                            [
                                                19688,
                                                17952.2
                                            ],
                                            [
                                                19675.4,
                                                17787.7
                                            ],
                                            [
                                                19617.3,
                                                17745.2
                                            ],
                                            [
                                                19632.6,
                                                17696.1
                                            ],
                                            [
                                                19719.6,
                                                17659.5
                                            ],
                                            [
                                                19718.7,
                                                17620.1
                                            ],
                                            [
                                                19841.8,
                                                17617.6
                                            ],
                                            [
                                                20108.6,
                                                17705
                                            ],
                                            [
                                                20165.4,
                                                17769.8
                                            ],
                                            [
                                                20190.2,
                                                17907.2
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 524,
                                        "name": "Rat's Run",
                                        "level": 49,
                                        "coord": [
                                            20220.1,
                                            17112.5
                                        ],
                                        "bounds": [
                                            [
                                                20408.7,
                                                17325.3
                                            ],
                                            [
                                                20415.8,
                                                17158.3
                                            ],
                                            [
                                                20161.3,
                                                16845
                                            ],
                                            [
                                                20054.3,
                                                17045.6
                                            ],
                                            [
                                                20055.4,
                                                17043.3
                                            ],
                                            [
                                                20225.1,
                                                17257.6
                                            ],
                                            [
                                                20408.7,
                                                17325.3
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 517,
                                        "name": "Kapellenburg",
                                        "level": 49,
                                        "coord": [
                                            20160.8,
                                            17321.1
                                        ],
                                        "bounds": [
                                            [
                                                20055.7,
                                                17042.7
                                            ],
                                            [
                                                20225.5,
                                                17257.7
                                            ],
                                            [
                                                20409,
                                                17327.4
                                            ],
                                            [
                                                20396,
                                                17549.6
                                            ],
                                            [
                                                20087,
                                                17514.4
                                            ],
                                            [
                                                19985.9,
                                                17418.9
                                            ],
                                            [
                                                19966.4,
                                                17137
                                            ],
                                            [
                                                20055.7,
                                                17042.7
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 515,
                                        "name": "Dissun's Mine",
                                        "level": 41,
                                        "coord": [
                                            19628.9,
                                            17283.1
                                        ],
                                        "bounds": [
                                            [
                                                19840.3,
                                                17619.8
                                            ],
                                            [
                                                19737.9,
                                                17529.1
                                            ],
                                            [
                                                19794.9,
                                                17268.3
                                            ],
                                            [
                                                19771.6,
                                                17131.9
                                            ],
                                            [
                                                19685.5,
                                                17017.1
                                            ],
                                            [
                                                19573.5,
                                                16928.7
                                            ],
                                            [
                                                19530.2,
                                                16959.3
                                            ],
                                            [
                                                19457,
                                                16968.6
                                            ],
                                            [
                                                19376.6,
                                                17422.7
                                            ],
                                            [
                                                19482.1,
                                                17646.6
                                            ],
                                            [
                                                19668.2,
                                                17621.8
                                            ],
                                            [
                                                19840.3,
                                                17619.8
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 516,
                                        "name": "Heimdahl's Last Stand",
                                        "level": 49,
                                        "coord": [
                                            20035.3,
                                            17539.4
                                        ],
                                        "bounds": [
                                            [
                                                20188.2,
                                                17907.6
                                            ],
                                            [
                                                20377.8,
                                                17924.3
                                            ],
                                            [
                                                20404.6,
                                                17547.8
                                            ],
                                            [
                                                20087.8,
                                                17514.1
                                            ],
                                            [
                                                19986.8,
                                                17418.5
                                            ],
                                            [
                                                19966.5,
                                                17137.4
                                            ],
                                            [
                                                19772.1,
                                                17131
                                            ],
                                            [
                                                19795.2,
                                                17268
                                            ],
                                            [
                                                19733.3,
                                                17528.1
                                            ],
                                            [
                                                19840.6,
                                                17618.8
                                            ],
                                            [
                                                20108.4,
                                                17707.2
                                            ],
                                            [
                                                20162.6,
                                                17770.5
                                            ],
                                            [
                                                20188.2,
                                                17907.6
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 536,
                                        "name": "Mountain's Tail",
                                        "level": 45,
                                        "coord": [
                                            21245.6,
                                            15594.6
                                        ],
                                        "bounds": [
                                            [
                                                21000.5,
                                                15901.4
                                            ],
                                            [
                                                20874.8,
                                                15712
                                            ],
                                            [
                                                20966.8,
                                                15371.8
                                            ],
                                            [
                                                21221.9,
                                                15260.7
                                            ],
                                            [
                                                21408.5,
                                                15236
                                            ],
                                            [
                                                21427.1,
                                                15363.3
                                            ],
                                            [
                                                21419.5,
                                                15430.8
                                            ],
                                            [
                                                21447.3,
                                                15454.1
                                            ],
                                            [
                                                21479.7,
                                                15449.6
                                            ],
                                            [
                                                21467.5,
                                                15572.5
                                            ],
                                            [
                                                21293.4,
                                                15671.9
                                            ],
                                            [
                                                21215.8,
                                                16122.3
                                            ],
                                            [
                                                20969.7,
                                                16183.5
                                            ],
                                            [
                                                21000.5,
                                                15901.4
                                            ]
                                        ]
                                    },
                                    {
                                        "sector_id": 525,
                                        "name": "Steelbrachen",
                                        "level": 40,
                                        "coord": [
                                            19816.8,
                                            16843.1
                                        ],
                                        "bounds": [
                                            [
                                                19686.4,
                                                17018.8
                                            ],
                                            [
                                                19586,
                                                16932.3
                                            ],
                                            [
                                                19537.7,
                                                16966
                                            ],
                                            [
                                                19460.9,
                                                16973
                                            ],
                                            [
                                                19459,
                                                16570.9
                                            ],
                                            [
                                                19794.4,
                                                16419.2
                                            ],
                                            [
                                                20180.6,
                                                16493.9
                                            ],
                                            [
                                                20140.2,
                                                16587.9
                                            ],
                                            [
                                                20162.3,
                                                16843.7
                                            ],
                                            [
                                                20056.1,
                                                17043.4
                                            ],
                                            [
                                                19966.2,
                                                17137.5
                                            ],
                                            [
                                                19772.3,
                                                17131.1
                                            ],
                                            [
                                                19686.4,
                                                17018.8
                                            ]
                                        ]
                                    }
                                ],
                                "training_points": [
                                    {
                                        "id": 319,
                                        "name": "",
                                        "description": "",
                                        "coord": [
                                            20422.8,
                                            16848.3
                                        ],
                                        "type": "Tyria"
                                    }
                                ],
                                "adventures": []
                            }
                        }
                    }
                }
            }
            """.trimIndent()
        )
    }

}