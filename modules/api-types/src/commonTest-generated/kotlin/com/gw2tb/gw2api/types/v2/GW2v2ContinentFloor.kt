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

class GW2v2ContinentFloorTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2ContinentFloor>(
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
                    "2": {
                        "name": "Ascalon",
                        "label_coord": [
                            26880,
                            12544
                        ],
                        "continent_rect": [
                            [
                                23552,
                                8448
                            ],
                            [
                                31744,
                                19328
                            ]
                        ],
                        "maps": {
                            "19": {
                                "name": "Plains of Ashford",
                                "min_level": 1,
                                "max_level": 15,
                                "default_floor": 1,
                                "label_coord": [
                                    27136,
                                    14592
                                ],
                                "map_rect": [
                                    [
                                        -49152,
                                        -24576
                                    ],
                                    [
                                        49152,
                                        24576
                                    ]
                                ],
                                "continent_rect": [
                                    [
                                        25088,
                                        13568
                                    ],
                                    [
                                        29184,
                                        15616
                                    ]
                                ],
                                "points_of_interest": {
                                    "338": {
                                        "name": "Swordcross Outpost",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            27796.4,
                                            14329
                                        ],
                                        "id": 338,
                                        "chat_link": "[&BFIBAAA=]"
                                    },
                                    "339": {
                                        "name": "Foefire's Heart",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            28464.6,
                                            13742.2
                                        ],
                                        "id": 339,
                                        "chat_link": "[&BFMBAAA=]"
                                    },
                                    "340": {
                                        "name": "The Viewing Hill",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            27953.3,
                                            13895
                                        ],
                                        "id": 340,
                                        "chat_link": "[&BFQBAAA=]"
                                    },
                                    "341": {
                                        "name": "Calhaan's Haunt",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            26373.3,
                                            14016.2
                                        ],
                                        "id": 341,
                                        "chat_link": "[&BFUBAAA=]"
                                    },
                                    "342": {
                                        "name": "Victory Cenotaph",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            26582.1,
                                            14706
                                        ],
                                        "id": 342,
                                        "chat_link": "[&BFYBAAA=]"
                                    },
                                    "343": {
                                        "name": "The Wrecking Yard",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            25766,
                                            14146
                                        ],
                                        "id": 343,
                                        "chat_link": "[&BFcBAAA=]"
                                    },
                                    "344": {
                                        "name": "Stonecrag Kraal",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            28963,
                                            14162.2
                                        ],
                                        "id": 344,
                                        "chat_link": "[&BFgBAAA=]"
                                    },
                                    "345": {
                                        "name": "Sharptail Encampment",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            25688.2,
                                            14952
                                        ],
                                        "id": 345,
                                        "chat_link": "[&BFkBAAA=]"
                                    },
                                    "346": {
                                        "name": "Igni Castrum",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            26322.5,
                                            15254.2
                                        ],
                                        "id": 346,
                                        "chat_link": "[&BFoBAAA=]"
                                    },
                                    "347": {
                                        "name": "Exterminatus HQ",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            26237,
                                            14796.9
                                        ],
                                        "id": 347,
                                        "chat_link": "[&BFsBAAA=]"
                                    },
                                    "348": {
                                        "name": "Ghostsummit",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            27507.9,
                                            14044.3
                                        ],
                                        "id": 348,
                                        "chat_link": "[&BFwBAAA=]"
                                    },
                                    "349": {
                                        "name": "Deadgod's Lair",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            27058.2,
                                            13959.9
                                        ],
                                        "id": 349,
                                        "chat_link": "[&BF0BAAA=]"
                                    },
                                    "383": {
                                        "name": "Vir's Gate Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            25713.7,
                                            14647.6
                                        ],
                                        "id": 383,
                                        "chat_link": "[&BH8BAAA=]"
                                    },
                                    "384": {
                                        "name": "Smokestead Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            25370.5,
                                            14205.8
                                        ],
                                        "id": 384,
                                        "chat_link": "[&BIABAAA=]"
                                    },
                                    "385": {
                                        "name": "Greysteel Armory Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            25353.9,
                                            13789.2
                                        ],
                                        "id": 385,
                                        "chat_link": "[&BIEBAAA=]"
                                    },
                                    "386": {
                                        "name": "Martyr's Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            26793.4,
                                            13833.7
                                        ],
                                        "id": 386,
                                        "chat_link": "[&BIIBAAA=]"
                                    },
                                    "387": {
                                        "name": "Temperus Point Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            26392.5,
                                            14545.8
                                        ],
                                        "id": 387,
                                        "chat_link": "[&BIMBAAA=]"
                                    },
                                    "388": {
                                        "name": "Ashford Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            27053.2,
                                            15023
                                        ],
                                        "id": 388,
                                        "chat_link": "[&BIQBAAA=]"
                                    },
                                    "389": {
                                        "name": "Adorea Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            26598.9,
                                            15107.5
                                        ],
                                        "id": 389,
                                        "chat_link": "[&BIUBAAA=]"
                                    },
                                    "390": {
                                        "name": "Ascalonian Catacombs Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            27665,
                                            14048.8
                                        ],
                                        "id": 390,
                                        "chat_link": "[&BIYBAAA=]"
                                    },
                                    "391": {
                                        "name": "Ascalon City Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            28219.2,
                                            13768.3
                                        ],
                                        "id": 391,
                                        "chat_link": "[&BIcBAAA=]"
                                    },
                                    "392": {
                                        "name": "Watchcrag Tower Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            28745.2,
                                            14435
                                        ],
                                        "id": 392,
                                        "chat_link": "[&BIgBAAA=]"
                                    },
                                    "393": {
                                        "name": "Duskrend Overlook Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            28926.1,
                                            14883.3
                                        ],
                                        "id": 393,
                                        "chat_link": "[&BIkBAAA=]"
                                    },
                                    "394": {
                                        "name": "Irondock Shipyard Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            28092,
                                            14958.2
                                        ],
                                        "id": 394,
                                        "chat_link": "[&BIoBAAA=]"
                                    },
                                    "915": {
                                        "name": "Camp Keiran",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            28089.8,
                                            15486.9
                                        ],
                                        "id": 915,
                                        "chat_link": "[&BJMDAAA=]"
                                    },
                                    "916": {
                                        "name": "Mock's Niche",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            25205,
                                            13663.8
                                        ],
                                        "id": 916,
                                        "chat_link": "[&BJQDAAA=]"
                                    },
                                    "917": {
                                        "name": "Three Legions Court",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            25431.7,
                                            14581.9
                                        ],
                                        "id": 917,
                                        "chat_link": "[&BJUDAAA=]"
                                    },
                                    "918": {
                                        "name": "Shards of War",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            27254.6,
                                            14048.7
                                        ],
                                        "id": 918,
                                        "chat_link": "[&BJYDAAA=]"
                                    },
                                    "919": {
                                        "name": "Feritas Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            26077,
                                            14218.5
                                        ],
                                        "id": 919,
                                        "chat_link": "[&BJcDAAA=]"
                                    },
                                    "920": {
                                        "name": "Guardpoint Decimus Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            25714.8,
                                            15161.8
                                        ],
                                        "id": 920,
                                        "chat_link": "[&BJgDAAA=]"
                                    },
                                    "921": {
                                        "name": "Spirit Hunter Camp Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            27128.2,
                                            14334.6
                                        ],
                                        "id": 921,
                                        "chat_link": "[&BJkDAAA=]"
                                    },
                                    "967": {
                                        "name": "Loreclaw Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            28393.7,
                                            15333.8
                                        ],
                                        "id": 967,
                                        "chat_link": "[&BMcDAAA=]"
                                    },
                                    "968": {
                                        "name": "Phasmatis Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            28154.9,
                                            14303.9
                                        ],
                                        "id": 968,
                                        "chat_link": "[&BMgDAAA=]"
                                    },
                                    "1372": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            26080,
                                            13876.8
                                        ],
                                        "id": 1372,
                                        "chat_link": "[&BFwFAAA=]"
                                    },
                                    "1373": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            25779.2,
                                            14883.2
                                        ],
                                        "id": 1373,
                                        "chat_link": "[&BF0FAAA=]"
                                    },
                                    "1374": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            26691.9,
                                            15429.8
                                        ],
                                        "id": 1374,
                                        "chat_link": "[&BF4FAAA=]"
                                    },
                                    "1375": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            26624.6,
                                            14440.9
                                        ],
                                        "id": 1375,
                                        "chat_link": "[&BF8FAAA=]"
                                    },
                                    "1376": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            27320,
                                            13876.5
                                        ],
                                        "id": 1376,
                                        "chat_link": "[&BGAFAAA=]"
                                    },
                                    "1377": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            28130.2,
                                            15222.5
                                        ],
                                        "id": 1377,
                                        "chat_link": "[&BGEFAAA=]"
                                    },
                                    "1378": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            28767,
                                            14513.3
                                        ],
                                        "id": 1378,
                                        "chat_link": "[&BGIFAAA=]"
                                    },
                                    "1379": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            29029.1,
                                            13696.6
                                        ],
                                        "id": 1379,
                                        "chat_link": "[&BGMFAAA=]"
                                    },
                                    "1380": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            27724.4,
                                            14449.9
                                        ],
                                        "id": 1380,
                                        "chat_link": "[&BGQFAAA=]"
                                    },
                                    "1381": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            28096.1,
                                            13821.3
                                        ],
                                        "id": 1381,
                                        "chat_link": "[&BGUFAAA=]"
                                    },
                                    "1458": {
                                        "name": "Barradin's Vaults",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            26205.9,
                                            14492.6
                                        ],
                                        "id": 1458,
                                        "chat_link": "[&BLIFAAA=]"
                                    },
                                    "1733": {
                                        "name": "Ascalonian Catacombs",
                                        "type": "unlock",
                                        "floor": 1,
                                        "coord": [
                                            27653.5,
                                            13964.2
                                        ],
                                        "id": 1733,
                                        "chat_link": "[&BMUGAAA=]",
                                        "icon": "https://render.guildwars2.com/file/943538394A94A491C8632FBEF6203C2013443555/102478.png"
                                    },
                                    "1784": {
                                        "name": "Langmar Estate Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            25784.5,
                                            15429.9
                                        ],
                                        "id": 1784,
                                        "chat_link": "[&BPgGAAA=]"
                                    }
                                },
                                "tasks": {
                                    "96": {
                                        "objective": "Help Bryllana Deepmind thin out ghosts.",
                                        "level": 6,
                                        "coord": [
                                            25846.5,
                                            14411.3
                                        ],
                                        "bounds": [
                                            [
                                                25769.4,
                                                14433.8
                                            ],
                                            [
                                                25698.2,
                                                14612.6
                                            ],
                                            [
                                                25958,
                                                14682.7
                                            ],
                                            [
                                                26124.3,
                                                14688.9
                                            ],
                                            [
                                                26201.4,
                                                14609.6
                                            ],
                                            [
                                                26266.9,
                                                14437.9
                                            ],
                                            [
                                                26336.4,
                                                14377.9
                                            ],
                                            [
                                                26298.8,
                                                14229.9
                                            ],
                                            [
                                                26093.8,
                                                14170.5
                                            ],
                                            [
                                                25887.1,
                                                14264.6
                                            ],
                                            [
                                                25769.4,
                                                14433.8
                                            ]
                                        ],
                                        "id": 96,
                                        "chat_link": "[&BGAAAAA=]"
                                    },
                                    "97": {
                                        "objective": "Help Kyra Sharptracker thin out ghosts.",
                                        "level": 6,
                                        "coord": [
                                            25621.6,
                                            14956.1
                                        ],
                                        "bounds": [
                                            [
                                                25678.6,
                                                14757.9
                                            ],
                                            [
                                                25508.5,
                                                14825.1
                                            ],
                                            [
                                                25358.2,
                                                14974.2
                                            ],
                                            [
                                                25344.3,
                                                15369.7
                                            ],
                                            [
                                                25496.3,
                                                15389.8
                                            ],
                                            [
                                                25766.8,
                                                15484.1
                                            ],
                                            [
                                                26035.3,
                                                15270.2
                                            ],
                                            [
                                                26187.6,
                                                15063.7
                                            ],
                                            [
                                                26103.5,
                                                14717.2
                                            ],
                                            [
                                                25963.7,
                                                14689.7
                                            ],
                                            [
                                                25839.1,
                                                14661.9
                                            ],
                                            [
                                                25678.6,
                                                14757.9
                                            ]
                                        ],
                                        "id": 97,
                                        "chat_link": "[&BGEAAAA=]"
                                    },
                                    "98": {
                                        "objective": "Help Crucibis Forgeweld run the armory.",
                                        "level": 2,
                                        "coord": [
                                            25594.9,
                                            13985.4
                                        ],
                                        "bounds": [
                                            [
                                                25368,
                                                13943.7
                                            ],
                                            [
                                                25454.1,
                                                14100.5
                                            ],
                                            [
                                                25534.1,
                                                14080.2
                                            ],
                                            [
                                                25631.5,
                                                14048.3
                                            ],
                                            [
                                                25692.7,
                                                14024.2
                                            ],
                                            [
                                                25804.7,
                                                13980.6
                                            ],
                                            [
                                                25882.6,
                                                13935.9
                                            ],
                                            [
                                                25905.1,
                                                13806.7
                                            ],
                                            [
                                                25864.5,
                                                13684.8
                                            ],
                                            [
                                                25502.2,
                                                13859.9
                                            ],
                                            [
                                                25368,
                                                13943.7
                                            ]
                                        ],
                                        "id": 98,
                                        "chat_link": "[&BGIAAAA=]"
                                    },
                                    "100": {
                                        "objective": "Help Strum Bassclash secure Lake Feritas.",
                                        "level": 4,
                                        "coord": [
                                            25931.5,
                                            13874.6
                                        ],
                                        "bounds": [
                                            [
                                                26110.3,
                                                14068.6
                                            ],
                                            [
                                                26165.2,
                                                13998
                                            ],
                                            [
                                                26121.8,
                                                13659.8
                                            ],
                                            [
                                                25903.1,
                                                13636.5
                                            ],
                                            [
                                                25845.9,
                                                13678.3
                                            ],
                                            [
                                                25883.3,
                                                13807.5
                                            ],
                                            [
                                                25859.7,
                                                13939.7
                                            ],
                                            [
                                                25954,
                                                14003.8
                                            ],
                                            [
                                                26110.3,
                                                14068.6
                                            ]
                                        ],
                                        "id": 100,
                                        "chat_link": "[&BGQAAAA=]"
                                    },
                                    "101": {
                                        "objective": "Help Scar Stripeclaw organize the wrecking yard.",
                                        "level": 3,
                                        "coord": [
                                            25770.1,
                                            14119.7
                                        ],
                                        "bounds": [
                                            [
                                                26099.8,
                                                14087
                                            ],
                                            [
                                                25928.9,
                                                14009.9
                                            ],
                                            [
                                                25867.1,
                                                13944
                                            ],
                                            [
                                                25787.7,
                                                13988.6
                                            ],
                                            [
                                                25528.5,
                                                14088.5
                                            ],
                                            [
                                                25718.6,
                                                14344.5
                                            ],
                                            [
                                                25917.5,
                                                14165.1
                                            ],
                                            [
                                                26060.8,
                                                14178.3
                                            ],
                                            [
                                                26099.8,
                                                14087
                                            ]
                                        ],
                                        "id": 101,
                                        "chat_link": "[&BGUAAAA=]"
                                    },
                                    "102": {
                                        "objective": "Help Latera Painstorm fight the Flame Legion.",
                                        "level": 5,
                                        "coord": [
                                            26177.8,
                                            13869.6
                                        ],
                                        "bounds": [
                                            [
                                                26165.1,
                                                13991.1
                                            ],
                                            [
                                                26122.4,
                                                13648.7
                                            ],
                                            [
                                                26222.5,
                                                13570.1
                                            ],
                                            [
                                                26381.4,
                                                13583.5
                                            ],
                                            [
                                                26462.5,
                                                13769.1
                                            ],
                                            [
                                                26316.6,
                                                13938.6
                                            ],
                                            [
                                                26298.9,
                                                13954.6
                                            ],
                                            [
                                                26302.8,
                                                13968.5
                                            ],
                                            [
                                                26290.8,
                                                14026.5
                                            ],
                                            [
                                                26244.3,
                                                14047.8
                                            ],
                                            [
                                                26165.1,
                                                13991.1
                                            ]
                                        ],
                                        "id": 102,
                                        "chat_link": "[&BGYAAAA=]"
                                    },
                                    "103": {
                                        "objective": "Defend the Iron Legion fort from Flame Legion.",
                                        "level": 8,
                                        "coord": [
                                            26419.5,
                                            14716.1
                                        ],
                                        "bounds": [
                                            [
                                                26269.3,
                                                14660.2
                                            ],
                                            [
                                                26129.8,
                                                14752.9
                                            ],
                                            [
                                                26255,
                                                14958.7
                                            ],
                                            [
                                                26136.3,
                                                15167.5
                                            ],
                                            [
                                                26270.6,
                                                15378.5
                                            ],
                                            [
                                                26371,
                                                15431.8
                                            ],
                                            [
                                                26474.6,
                                                15382.2
                                            ],
                                            [
                                                26488.1,
                                                15235.3
                                            ],
                                            [
                                                26508.8,
                                                15148.5
                                            ],
                                            [
                                                26494.6,
                                                14996.8
                                            ],
                                            [
                                                26707.9,
                                                14638.7
                                            ],
                                            [
                                                26603.5,
                                                14589.3
                                            ],
                                            [
                                                26360.6,
                                                14611.6
                                            ],
                                            [
                                                26269.3,
                                                14660.2
                                            ]
                                        ],
                                        "id": 103,
                                        "chat_link": "[&BGcAAAA=]"
                                    },
                                    "104": {
                                        "objective": "Help the Blood Legion thin out nuisances.",
                                        "level": 7,
                                        "coord": [
                                            26425.8,
                                            14282.8
                                        ],
                                        "bounds": [
                                            [
                                                26317.5,
                                                14295.9
                                            ],
                                            [
                                                26320.3,
                                                14578.9
                                            ],
                                            [
                                                26429.7,
                                                14582.2
                                            ],
                                            [
                                                26476.5,
                                                14531.2
                                            ],
                                            [
                                                26521.7,
                                                14415.8
                                            ],
                                            [
                                                26743.3,
                                                14413.8
                                            ],
                                            [
                                                26690.6,
                                                14293.8
                                            ],
                                            [
                                                26658.8,
                                                14213.4
                                            ],
                                            [
                                                26664.6,
                                                14081.9
                                            ],
                                            [
                                                26697.2,
                                                13972.1
                                            ],
                                            [
                                                26804.9,
                                                13810.7
                                            ],
                                            [
                                                26681.9,
                                                13797.2
                                            ],
                                            [
                                                26410.4,
                                                13810.6
                                            ],
                                            [
                                                26297.1,
                                                14022.6
                                            ],
                                            [
                                                26317.5,
                                                14295.9
                                            ]
                                        ],
                                        "id": 104,
                                        "chat_link": "[&BGgAAAA=]"
                                    },
                                    "105": {
                                        "objective": "Help Sagum Relicseeker with his research.",
                                        "level": 15,
                                        "coord": [
                                            27385.6,
                                            13873.6
                                        ],
                                        "bounds": [
                                            [
                                                27382.1,
                                                14220.1
                                            ],
                                            [
                                                27342.4,
                                                14022.2
                                            ],
                                            [
                                                27184.7,
                                                13997.4
                                            ],
                                            [
                                                27168,
                                                13934.8
                                            ],
                                            [
                                                27094.9,
                                                13890.8
                                            ],
                                            [
                                                27034.1,
                                                13899.4
                                            ],
                                            [
                                                26956.1,
                                                13911.3
                                            ],
                                            [
                                                26888.8,
                                                13881.5
                                            ],
                                            [
                                                26865,
                                                13821.8
                                            ],
                                            [
                                                26921.6,
                                                13809
                                            ],
                                            [
                                                26968,
                                                13804.1
                                            ],
                                            [
                                                27033.1,
                                                13802
                                            ],
                                            [
                                                27085.9,
                                                13787.4
                                            ],
                                            [
                                                27149.3,
                                                13775.8
                                            ],
                                            [
                                                27221.7,
                                                13682.7
                                            ],
                                            [
                                                27456.4,
                                                13581.6
                                            ],
                                            [
                                                27728.5,
                                                13657.2
                                            ],
                                            [
                                                27729.3,
                                                13975.6
                                            ],
                                            [
                                                27762,
                                                14197.5
                                            ],
                                            [
                                                27616.1,
                                                14327.2
                                            ],
                                            [
                                                27426.9,
                                                14358.3
                                            ],
                                            [
                                                27382.1,
                                                14220.1
                                            ]
                                        ],
                                        "id": 105,
                                        "chat_link": "[&BGkAAAA=]"
                                    },
                                    "106": {
                                        "objective": "Help Gavros Spiritfoe thin out ghosts.",
                                        "level": 10,
                                        "coord": [
                                            27424.1,
                                            14776.9
                                        ],
                                        "bounds": [
                                            [
                                                27090.1,
                                                14272.7
                                            ],
                                            [
                                                27426.3,
                                                14339.9
                                            ],
                                            [
                                                27657,
                                                14609.2
                                            ],
                                            [
                                                27530.5,
                                                14860.1
                                            ],
                                            [
                                                27322.9,
                                                15011.8
                                            ],
                                            [
                                                26963.3,
                                                14760.8
                                            ],
                                            [
                                                26961,
                                                14614.9
                                            ],
                                            [
                                                27090.1,
                                                14272.7
                                            ]
                                        ],
                                        "id": 106,
                                        "chat_link": "[&BGoAAAA=]"
                                    },
                                    "107": {
                                        "objective": "Help Paenula train troops.",
                                        "level": 9,
                                        "coord": [
                                            26711.5,
                                            14856.2
                                        ],
                                        "bounds": [
                                            [
                                                26494.6,
                                                15228.9
                                            ],
                                            [
                                                26514.1,
                                                15144.6
                                            ],
                                            [
                                                26499.5,
                                                14997.4
                                            ],
                                            [
                                                26716.8,
                                                14627.7
                                            ],
                                            [
                                                26973,
                                                14853.5
                                            ],
                                            [
                                                27336.7,
                                                15045.2
                                            ],
                                            [
                                                27402.9,
                                                15134.9
                                            ],
                                            [
                                                27392,
                                                15272.3
                                            ],
                                            [
                                                27102.6,
                                                15420.6
                                            ],
                                            [
                                                26978.3,
                                                15490.6
                                            ],
                                            [
                                                26875,
                                                15503.7
                                            ],
                                            [
                                                26742.7,
                                                15415.5
                                            ],
                                            [
                                                26664.9,
                                                15384.4
                                            ],
                                            [
                                                26616.2,
                                                15350.3
                                            ],
                                            [
                                                26494.6,
                                                15228.9
                                            ]
                                        ],
                                        "id": 107,
                                        "chat_link": "[&BGsAAAA=]"
                                    },
                                    "108": {
                                        "objective": "Help Mei Hawkslayer disrupt separatist activity.",
                                        "level": 12,
                                        "coord": [
                                            27852.4,
                                            15336.6
                                        ],
                                        "bounds": [
                                            [
                                                27933.4,
                                                15551.3
                                            ],
                                            [
                                                28345.1,
                                                15533
                                            ],
                                            [
                                                28406,
                                                15508.8
                                            ],
                                            [
                                                28462.4,
                                                15452.1
                                            ],
                                            [
                                                28482.2,
                                                15205.7
                                            ],
                                            [
                                                28240.5,
                                                15146.3
                                            ],
                                            [
                                                27866,
                                                15278.7
                                            ],
                                            [
                                                27726.1,
                                                15422.7
                                            ],
                                            [
                                                27933.4,
                                                15551.3
                                            ]
                                        ],
                                        "id": 108,
                                        "chat_link": "[&BGwAAAA=]"
                                    },
                                    "109": {
                                        "objective": "Assist Sesto Headsplitter with his work.",
                                        "level": 11,
                                        "coord": [
                                            28158.3,
                                            14911.2
                                        ],
                                        "bounds": [
                                            [
                                                28388.9,
                                                14793.5
                                            ],
                                            [
                                                28236.2,
                                                15143.8
                                            ],
                                            [
                                                27878.2,
                                                15270.2
                                            ],
                                            [
                                                27774,
                                                15085.1
                                            ],
                                            [
                                                27769.3,
                                                14778.3
                                            ],
                                            [
                                                27941.7,
                                                14542.8
                                            ],
                                            [
                                                28388.9,
                                                14793.5
                                            ]
                                        ],
                                        "id": 109,
                                        "chat_link": "[&BG0AAAA=]"
                                    },
                                    "110": {
                                        "objective": "Help Researcher Irkz study skale poison.",
                                        "level": 12,
                                        "coord": [
                                            28975.1,
                                            15354.7
                                        ],
                                        "bounds": [
                                            [
                                                28476.4,
                                                15385.5
                                            ],
                                            [
                                                28608.3,
                                                15390.1
                                            ],
                                            [
                                                28691.9,
                                                15409.7
                                            ],
                                            [
                                                28783.8,
                                                15465.4
                                            ],
                                            [
                                                28814.4,
                                                15488.5
                                            ],
                                            [
                                                28890.7,
                                                15582.3
                                            ],
                                            [
                                                29202.4,
                                                15428.8
                                            ],
                                            [
                                                29053.6,
                                                15135.3
                                            ],
                                            [
                                                28927.3,
                                                15094.2
                                            ],
                                            [
                                                28530.3,
                                                15086
                                            ],
                                            [
                                                28492.5,
                                                15217.1
                                            ],
                                            [
                                                28476.4,
                                                15385.5
                                            ]
                                        ],
                                        "id": 110,
                                        "chat_link": "[&BG4AAAA=]"
                                    },
                                    "111": {
                                        "objective": "Help Androchus thin out ogres.",
                                        "level": 13,
                                        "coord": [
                                            28646.7,
                                            14672.1
                                        ],
                                        "bounds": [
                                            [
                                                29193,
                                                14753.4
                                            ],
                                            [
                                                29246.9,
                                                14172.3
                                            ],
                                            [
                                                29208.9,
                                                14035.8
                                            ],
                                            [
                                                29053.5,
                                                13963.9
                                            ],
                                            [
                                                28912.1,
                                                13970.2
                                            ],
                                            [
                                                28667.9,
                                                14099.1
                                            ],
                                            [
                                                28502.3,
                                                14449.3
                                            ],
                                            [
                                                28499.9,
                                                14730.1
                                            ],
                                            [
                                                29193,
                                                14753.4
                                            ]
                                        ],
                                        "id": 111,
                                        "chat_link": "[&BG8AAAA=]"
                                    },
                                    "112": {
                                        "objective": "Help Ghyrtratus Fiendmauler retake Ascalon City.",
                                        "level": 14,
                                        "coord": [
                                            28227.8,
                                            13727.3
                                        ],
                                        "bounds": [
                                            [
                                                28604.7,
                                                14236.7
                                            ],
                                            [
                                                28670.2,
                                                14102.6
                                            ],
                                            [
                                                28749.3,
                                                13790.9
                                            ],
                                            [
                                                28673.9,
                                                13620
                                            ],
                                            [
                                                28114.2,
                                                13632
                                            ],
                                            [
                                                28010.4,
                                                13638.2
                                            ],
                                            [
                                                27850.2,
                                                13557.2
                                            ],
                                            [
                                                27832.5,
                                                13928.1
                                            ],
                                            [
                                                28006.9,
                                                14285.9
                                            ],
                                            [
                                                28551.9,
                                                14316.6
                                            ],
                                            [
                                                28604.7,
                                                14236.7
                                            ]
                                        ],
                                        "id": 112,
                                        "chat_link": "[&BHAAAAA=]"
                                    },
                                    "347": {
                                        "objective": "Rid the training area of pests.",
                                        "level": 3,
                                        "coord": [
                                            25288.4,
                                            13780.9
                                        ],
                                        "bounds": [
                                            [
                                                25074.3,
                                                13749.4
                                            ],
                                            [
                                                25259.1,
                                                13980.9
                                            ],
                                            [
                                                25614,
                                                13781.1
                                            ],
                                            [
                                                25562.5,
                                                13671
                                            ],
                                            [
                                                25416.1,
                                                13549.4
                                            ],
                                            [
                                                25074.3,
                                                13749.4
                                            ]
                                        ],
                                        "id": 347,
                                        "chat_link": "[&BFsBAAA=]"
                                    },
                                    "348": {
                                        "objective": "Help Tolona Ironrustler with her farm.",
                                        "level": 2,
                                        "coord": [
                                            25325.8,
                                            14132.1
                                        ],
                                        "bounds": [
                                            [
                                                25349.6,
                                                14140.9
                                            ],
                                            [
                                                25367.2,
                                                14089.8
                                            ],
                                            [
                                                25364.4,
                                                14053.6
                                            ],
                                            [
                                                25335.4,
                                                13984.1
                                            ],
                                            [
                                                25239.9,
                                                13922.8
                                            ],
                                            [
                                                25234.8,
                                                14024.5
                                            ],
                                            [
                                                25240.3,
                                                14142.8
                                            ],
                                            [
                                                25232.5,
                                                14234.9
                                            ],
                                            [
                                                25279.2,
                                                14258.7
                                            ],
                                            [
                                                25349.6,
                                                14140.9
                                            ]
                                        ],
                                        "id": 348,
                                        "chat_link": "[&BFwBAAA=]"
                                    }
                                },
                                "skill_challenges": [
                                    {
                                        "coord": [
                                            25325.2,
                                            13744.3
                                        ],
                                        "id": "0-13"
                                    },
                                    {
                                        "coord": [
                                            27193.1,
                                            14818.9
                                        ],
                                        "id": "0-30"
                                    },
                                    {
                                        "coord": [
                                            26919.9,
                                            14909.5
                                        ],
                                        "id": "0-12"
                                    },
                                    {
                                        "coord": [
                                            26505.7,
                                            15594.2
                                        ],
                                        "id": "0-40"
                                    },
                                    {
                                        "coord": [
                                            28657,
                                            13650.2
                                        ],
                                        "id": "0-32"
                                    },
                                    {
                                        "coord": [
                                            28430.2,
                                            14038.3
                                        ],
                                        "id": "0-14"
                                    }
                                ],
                                "sectors": {
                                    "270": {
                                        "name": "Village of Smokestead",
                                        "level": 3,
                                        "coord": [
                                            25388.3,
                                            14449.9
                                        ],
                                        "bounds": [
                                            [
                                                25088,
                                                14166.5
                                            ],
                                            [
                                                25228.7,
                                                14187
                                            ],
                                            [
                                                25610.9,
                                                14208.8
                                            ],
                                            [
                                                25777.1,
                                                14359.8
                                            ],
                                            [
                                                25758.7,
                                                14467.5
                                            ],
                                            [
                                                25656.6,
                                                14737.2
                                            ],
                                            [
                                                25390.3,
                                                14644.9
                                            ],
                                            [
                                                25302.5,
                                                14701.8
                                            ],
                                            [
                                                24981.8,
                                                14780.6
                                            ],
                                            [
                                                25088,
                                                14245.3
                                            ],
                                            [
                                                25088,
                                                14166.5
                                            ]
                                        ],
                                        "id": 270,
                                        "chat_link": "[&BA4BAAA=]"
                                    },
                                    "271": {
                                        "name": "Tela Range",
                                        "level": 4,
                                        "coord": [
                                            25217.5,
                                            13735.3
                                        ],
                                        "bounds": [
                                            [
                                                25034.3,
                                                13960.5
                                            ],
                                            [
                                                25217.1,
                                                13952.5
                                            ],
                                            [
                                                25457.7,
                                                13781
                                            ],
                                            [
                                                25464.5,
                                                13726.6
                                            ],
                                            [
                                                25385.4,
                                                13628.7
                                            ],
                                            [
                                                25253.3,
                                                13431.9
                                            ],
                                            [
                                                25027.6,
                                                13571.1
                                            ],
                                            [
                                                24900.2,
                                                13829.8
                                            ],
                                            [
                                                25034.3,
                                                13960.5
                                            ]
                                        ],
                                        "id": 271,
                                        "chat_link": "[&BA8BAAA=]"
                                    },
                                    "272": {
                                        "name": "Victor's Presidium",
                                        "level": 6,
                                        "coord": [
                                            25851.5,
                                            14970.6
                                        ],
                                        "bounds": [
                                            [
                                                25609.7,
                                                15078.3
                                            ],
                                            [
                                                25339,
                                                15060.8
                                            ],
                                            [
                                                25299.5,
                                                14700.7
                                            ],
                                            [
                                                25386.6,
                                                14642.6
                                            ],
                                            [
                                                25656.9,
                                                14735
                                            ],
                                            [
                                                25760.8,
                                                14469.1
                                            ],
                                            [
                                                26010.9,
                                                14628.2
                                            ],
                                            [
                                                26188.4,
                                                14481.6
                                            ],
                                            [
                                                26192.7,
                                                14781.8
                                            ],
                                            [
                                                26377.5,
                                                15124.3
                                            ],
                                            [
                                                26384.1,
                                                15257.5
                                            ],
                                            [
                                                26262.3,
                                                15329.5
                                            ],
                                            [
                                                25907.4,
                                                15266.2
                                            ],
                                            [
                                                25805.1,
                                                15431.7
                                            ],
                                            [
                                                25709,
                                                15395.6
                                            ],
                                            [
                                                25733.8,
                                                15146
                                            ],
                                            [
                                                25609.7,
                                                15078.3
                                            ]
                                        ],
                                        "id": 272,
                                        "chat_link": "[&BBABAAA=]"
                                    },
                                    "273": {
                                        "name": "Lake Feritas",
                                        "level": 5,
                                        "coord": [
                                            25946.1,
                                            13740.2
                                        ],
                                        "bounds": [
                                            [
                                                26193.2,
                                                14049.2
                                            ],
                                            [
                                                26381.5,
                                                13840.9
                                            ],
                                            [
                                                26158.3,
                                                13705.1
                                            ],
                                            [
                                                26053.3,
                                                13524.7
                                            ],
                                            [
                                                25854.6,
                                                13546.8
                                            ],
                                            [
                                                25698.7,
                                                13430.3
                                            ],
                                            [
                                                25583.4,
                                                13549.1
                                            ],
                                            [
                                                25698.9,
                                                13737.5
                                            ],
                                            [
                                                25858.4,
                                                13815
                                            ],
                                            [
                                                25980.8,
                                                14203.3
                                            ],
                                            [
                                                26193.2,
                                                14049.2
                                            ]
                                        ],
                                        "id": 273,
                                        "chat_link": "[&BBEBAAA=]"
                                    },
                                    "274": {
                                        "name": "Old Duke's Estate",
                                        "level": 6,
                                        "coord": [
                                            26018.2,
                                            14337.7
                                        ],
                                        "bounds": [
                                            [
                                                26012.2,
                                                14631.2
                                            ],
                                            [
                                                25758.3,
                                                14468.5
                                            ],
                                            [
                                                25775.1,
                                                14358.7
                                            ],
                                            [
                                                25980,
                                                14203
                                            ],
                                            [
                                                26192.9,
                                                14049.3
                                            ],
                                            [
                                                26390.8,
                                                14315.4
                                            ],
                                            [
                                                26012.2,
                                                14631.2
                                            ]
                                        ],
                                        "id": 274,
                                        "chat_link": "[&BBIBAAA=]"
                                    },
                                    "275": {
                                        "name": "Decimus Stones",
                                        "level": 7,
                                        "coord": [
                                            25543.8,
                                            15221.8
                                        ],
                                        "bounds": [
                                            [
                                                25337.3,
                                                15374
                                            ],
                                            [
                                                25519.2,
                                                15382.5
                                            ],
                                            [
                                                25723.2,
                                                15294.8
                                            ],
                                            [
                                                25731,
                                                15143.7
                                            ],
                                            [
                                                25613,
                                                15077.2
                                            ],
                                            [
                                                25339.3,
                                                15058.4
                                            ],
                                            [
                                                25337.3,
                                                15374
                                            ]
                                        ],
                                        "id": 275,
                                        "chat_link": "[&BBMBAAA=]"
                                    },
                                    "276": {
                                        "name": "Charr's Triumph",
                                        "level": 8,
                                        "coord": [
                                            26584.1,
                                            14756.9
                                        ],
                                        "bounds": [
                                            [
                                                27008,
                                                14763.4
                                            ],
                                            [
                                                26940.5,
                                                14597.9
                                            ],
                                            [
                                                26418.8,
                                                14318.1
                                            ],
                                            [
                                                26216.7,
                                                14484.8
                                            ],
                                            [
                                                26219.7,
                                                14783.6
                                            ],
                                            [
                                                26405.9,
                                                15127.9
                                            ],
                                            [
                                                26720.5,
                                                15077.5
                                            ],
                                            [
                                                26742.7,
                                                14902.2
                                            ],
                                            [
                                                27008,
                                                14763.4
                                            ]
                                        ],
                                        "id": 276,
                                        "chat_link": "[&BBQBAAA=]"
                                    },
                                    "277": {
                                        "name": "Martyr's Woods",
                                        "level": 7,
                                        "coord": [
                                            26822,
                                            14090.5
                                        ],
                                        "bounds": [
                                            [
                                                26792.1,
                                                14510.6
                                            ],
                                            [
                                                26907.6,
                                                14584.6
                                            ],
                                            [
                                                26922.2,
                                                14478
                                            ],
                                            [
                                                27023.4,
                                                14371.1
                                            ],
                                            [
                                                27073.6,
                                                14313.2
                                            ],
                                            [
                                                27155.6,
                                                14247.9
                                            ],
                                            [
                                                27244.8,
                                                14241.2
                                            ],
                                            [
                                                27247.7,
                                                14127
                                            ],
                                            [
                                                27192.6,
                                                14039.9
                                            ],
                                            [
                                                27204.9,
                                                13990.3
                                            ],
                                            [
                                                27134.5,
                                                13895.9
                                            ],
                                            [
                                                26948.5,
                                                13925.4
                                            ],
                                            [
                                                26744,
                                                13870.2
                                            ],
                                            [
                                                26654,
                                                13750.8
                                            ],
                                            [
                                                26549.8,
                                                13617
                                            ],
                                            [
                                                26306.2,
                                                13735.8
                                            ],
                                            [
                                                26389.5,
                                                13848.6
                                            ],
                                            [
                                                26310,
                                                13890.2
                                            ],
                                            [
                                                26237.9,
                                                14082.7
                                            ],
                                            [
                                                26401.3,
                                                14289.2
                                            ],
                                            [
                                                26792.1,
                                                14510.6
                                            ]
                                        ],
                                        "id": 277,
                                        "chat_link": "[&BBUBAAA=]"
                                    },
                                    "278": {
                                        "name": "Ashford Forum",
                                        "level": 9,
                                        "coord": [
                                            26977.5,
                                            15023.1
                                        ],
                                        "bounds": [
                                            [
                                                26881.1,
                                                15212.6
                                            ],
                                            [
                                                27149.3,
                                                15254.5
                                            ],
                                            [
                                                27299.2,
                                                15134.5
                                            ],
                                            [
                                                27133,
                                                14824.4
                                            ],
                                            [
                                                26979.3,
                                                14760.2
                                            ],
                                            [
                                                26710.6,
                                                14900.4
                                            ],
                                            [
                                                26690,
                                                15075.4
                                            ],
                                            [
                                                26881.1,
                                                15212.6
                                            ]
                                        ],
                                        "id": 278,
                                        "chat_link": "[&BBYBAAA=]"
                                    },
                                    "279": {
                                        "name": "Lake Adorea",
                                        "level": 11,
                                        "coord": [
                                            26824.8,
                                            15321.8
                                        ],
                                        "bounds": [
                                            [
                                                26545.5,
                                                15588.8
                                            ],
                                            [
                                                26779.6,
                                                15486.2
                                            ],
                                            [
                                                26909,
                                                15575.9
                                            ],
                                            [
                                                27154.2,
                                                15380.2
                                            ],
                                            [
                                                27329.2,
                                                15367.6
                                            ],
                                            [
                                                27411.8,
                                                15257.9
                                            ],
                                            [
                                                27395.1,
                                                15051
                                            ],
                                            [
                                                27149.8,
                                                15251.1
                                            ],
                                            [
                                                26880.8,
                                                15213.8
                                            ],
                                            [
                                                26689.8,
                                                15074.4
                                            ],
                                            [
                                                26376.4,
                                                15125
                                            ],
                                            [
                                                26383.8,
                                                15257.1
                                            ],
                                            [
                                                26263.2,
                                                15328.8
                                            ],
                                            [
                                                26278.9,
                                                15547.7
                                            ],
                                            [
                                                26545.5,
                                                15588.8
                                            ]
                                        ],
                                        "id": 279,
                                        "chat_link": "[&BBcBAAA=]"
                                    },
                                    "280": {
                                        "name": "Devast District",
                                        "level": 10,
                                        "coord": [
                                            27320.4,
                                            14574.3
                                        ],
                                        "bounds": [
                                            [
                                                27394.1,
                                                15051.7
                                            ],
                                            [
                                                27544.4,
                                                14939.5
                                            ],
                                            [
                                                27618,
                                                14716.6
                                            ],
                                            [
                                                27813.8,
                                                14523.5
                                            ],
                                            [
                                                27685.8,
                                                14375.5
                                            ],
                                            [
                                                27565.2,
                                                14350.4
                                            ],
                                            [
                                                27331.5,
                                                14293.9
                                            ],
                                            [
                                                27244.7,
                                                14236.1
                                            ],
                                            [
                                                27153.3,
                                                14244.9
                                            ],
                                            [
                                                27073.7,
                                                14307.9
                                            ],
                                            [
                                                26918.2,
                                                14477.1
                                            ],
                                            [
                                                26904.6,
                                                14599.1
                                            ],
                                            [
                                                27132.2,
                                                14542.3
                                            ],
                                            [
                                                27129.9,
                                                14821.3
                                            ],
                                            [
                                                27297.1,
                                                15134
                                            ],
                                            [
                                                27394.1,
                                                15051.7
                                            ]
                                        ],
                                        "id": 280,
                                        "chat_link": "[&BBgBAAA=]"
                                    },
                                    "281": {
                                        "name": "Windrock Maze",
                                        "level": 12,
                                        "coord": [
                                            27623.9,
                                            15197.3
                                        ],
                                        "bounds": [
                                            [
                                                27412.3,
                                                15258.1
                                            ],
                                            [
                                                27393.7,
                                                15051.4
                                            ],
                                            [
                                                27547.7,
                                                14938
                                            ],
                                            [
                                                27698.2,
                                                14993.5
                                            ],
                                            [
                                                27898.9,
                                                15265.1
                                            ],
                                            [
                                                27773.7,
                                                15406.9
                                            ],
                                            [
                                                27643.3,
                                                15467.8
                                            ],
                                            [
                                                27412.3,
                                                15258.1
                                            ]
                                        ],
                                        "id": 281,
                                        "chat_link": "[&BBkBAAA=]"
                                    },
                                    "282": {
                                        "name": "Ascalon Basin",
                                        "level": 12,
                                        "coord": [
                                            28447.8,
                                            15147.5
                                        ],
                                        "bounds": [
                                            [
                                                27898,
                                                15268.3
                                            ],
                                            [
                                                28214.6,
                                                15207.5
                                            ],
                                            [
                                                28528.3,
                                                15389.7
                                            ],
                                            [
                                                28690.5,
                                                15397.3
                                            ],
                                            [
                                                28851.4,
                                                15514.9
                                            ],
                                            [
                                                28835.2,
                                                15669.5
                                            ],
                                            [
                                                28912.8,
                                                15759
                                            ],
                                            [
                                                29032.4,
                                                15882.6
                                            ],
                                            [
                                                29252.7,
                                                15594.7
                                            ],
                                            [
                                                29272.4,
                                                15498.4
                                            ],
                                            [
                                                29193.6,
                                                15121.5
                                            ],
                                            [
                                                28674.9,
                                                15082.1
                                            ],
                                            [
                                                28407.9,
                                                14681.4
                                            ],
                                            [
                                                28283.7,
                                                14702
                                            ],
                                            [
                                                28102.2,
                                                14597.4
                                            ],
                                            [
                                                28077.5,
                                                14460.8
                                            ],
                                            [
                                                27875.1,
                                                14462.8
                                            ],
                                            [
                                                27618,
                                                14717.2
                                            ],
                                            [
                                                27539.5,
                                                14942.2
                                            ],
                                            [
                                                27694.6,
                                                15000.5
                                            ],
                                            [
                                                27898,
                                                15268.3
                                            ]
                                        ],
                                        "id": 282,
                                        "chat_link": "[&BBoBAAA=]"
                                    },
                                    "283": {
                                        "name": "Phasmatis Corridor",
                                        "level": 13,
                                        "coord": [
                                            27670.8,
                                            14185.8
                                        ],
                                        "bounds": [
                                            [
                                                27872.3,
                                                14474.9
                                            ],
                                            [
                                                27814.4,
                                                14531.2
                                            ],
                                            [
                                                27682.9,
                                                14387.6
                                            ],
                                            [
                                                27328.5,
                                                14297
                                            ],
                                            [
                                                27354.2,
                                                14244.4
                                            ],
                                            [
                                                27374.1,
                                                14194.6
                                            ],
                                            [
                                                27377.5,
                                                14135.8
                                            ],
                                            [
                                                27322.6,
                                                13981.1
                                            ],
                                            [
                                                27428,
                                                13927.9
                                            ],
                                            [
                                                27600.2,
                                                13971.2
                                            ],
                                            [
                                                27710.5,
                                                13959.4
                                            ],
                                            [
                                                27948.8,
                                                13840.2
                                            ],
                                            [
                                                27932.7,
                                                14016.6
                                            ],
                                            [
                                                28241.4,
                                                14354.8
                                            ],
                                            [
                                                28074.4,
                                                14470.7
                                            ],
                                            [
                                                27872.3,
                                                14474.9
                                            ]
                                        ],
                                        "id": 283,
                                        "chat_link": "[&BBsBAAA=]"
                                    },
                                    "284": {
                                        "name": "The Toppled Wall",
                                        "level": 15,
                                        "coord": [
                                            27374.8,
                                            13834.1
                                        ],
                                        "bounds": [
                                            [
                                                27586.2,
                                                13987.4
                                            ],
                                            [
                                                27425.5,
                                                13933.5
                                            ],
                                            [
                                                27329.7,
                                                13981.9
                                            ],
                                            [
                                                27258.4,
                                                13955.2
                                            ],
                                            [
                                                27207.4,
                                                13989.9
                                            ],
                                            [
                                                27133.2,
                                                13901.7
                                            ],
                                            [
                                                26948.3,
                                                13927.3
                                            ],
                                            [
                                                26746.5,
                                                13880.8
                                            ],
                                            [
                                                26532.1,
                                                13615.9
                                            ],
                                            [
                                                27539.3,
                                                13489.5
                                            ],
                                            [
                                                27966.6,
                                                13555
                                            ],
                                            [
                                                27944.1,
                                                13618.8
                                            ],
                                            [
                                                27934.9,
                                                13864.4
                                            ],
                                            [
                                                27695.8,
                                                13975.8
                                            ],
                                            [
                                                27586.2,
                                                13987.4
                                            ]
                                        ],
                                        "id": 284,
                                        "chat_link": "[&BBwBAAA=]"
                                    },
                                    "285": {
                                        "name": "Lamia Mire",
                                        "level": 11,
                                        "coord": [
                                            28321.9,
                                            14501.5
                                        ],
                                        "bounds": [
                                            [
                                                28241.7,
                                                14343.9
                                            ],
                                            [
                                                28532.9,
                                                14280.1
                                            ],
                                            [
                                                28612.3,
                                                14440.2
                                            ],
                                            [
                                                28406.3,
                                                14684.5
                                            ],
                                            [
                                                28282.9,
                                                14703.3
                                            ],
                                            [
                                                28100.5,
                                                14597.8
                                            ],
                                            [
                                                28076.7,
                                                14461
                                            ],
                                            [
                                                28241.7,
                                                14343.9
                                            ]
                                        ],
                                        "id": 285,
                                        "chat_link": "[&BB0BAAA=]"
                                    },
                                    "286": {
                                        "name": "Loreclaw Expanse",
                                        "level": 11,
                                        "coord": [
                                            28365.9,
                                            15449.1
                                        ],
                                        "bounds": [
                                            [
                                                27773.3,
                                                15406.3
                                            ],
                                            [
                                                27898.8,
                                                15264.9
                                            ],
                                            [
                                                28213,
                                                15206.2
                                            ],
                                            [
                                                28535.5,
                                                15390.6
                                            ],
                                            [
                                                28694.3,
                                                15393.7
                                            ],
                                            [
                                                28856.9,
                                                15510.9
                                            ],
                                            [
                                                28840.9,
                                                15664.5
                                            ],
                                            [
                                                28395.5,
                                                15636.7
                                            ],
                                            [
                                                28085,
                                                15568
                                            ],
                                            [
                                                27773.3,
                                                15406.3
                                            ]
                                        ],
                                        "id": 286,
                                        "chat_link": "[&BB4BAAA=]"
                                    },
                                    "287": {
                                        "name": "Cadem Forest",
                                        "level": 13,
                                        "coord": [
                                            28881.7,
                                            14494.2
                                        ],
                                        "bounds": [
                                            [
                                                28407.7,
                                                14682.7
                                            ],
                                            [
                                                28614.4,
                                                14440.6
                                            ],
                                            [
                                                28534.4,
                                                14281.2
                                            ],
                                            [
                                                28524.9,
                                                14204.2
                                            ],
                                            [
                                                28702,
                                                14035
                                            ],
                                            [
                                                28891,
                                                14073.1
                                            ],
                                            [
                                                29166.2,
                                                13986.9
                                            ],
                                            [
                                                29171.4,
                                                14291.2
                                            ],
                                            [
                                                29240.4,
                                                14482.8
                                            ],
                                            [
                                                29175.6,
                                                14827.3
                                            ],
                                            [
                                                29188.3,
                                                14915.2
                                            ],
                                            [
                                                29171.3,
                                                15120.9
                                            ],
                                            [
                                                28674.5,
                                                15083.4
                                            ],
                                            [
                                                28407.7,
                                                14682.7
                                            ]
                                        ],
                                        "id": 287,
                                        "chat_link": "[&BB8BAAA=]"
                                    },
                                    "288": {
                                        "name": "Gunbreach Hills",
                                        "level": 3,
                                        "coord": [
                                            25509,
                                            14010.2
                                        ],
                                        "bounds": [
                                            [
                                                25043.7,
                                                13942.9
                                            ],
                                            [
                                                25217.1,
                                                13952.6
                                            ],
                                            [
                                                25371.5,
                                                13832.8
                                            ],
                                            [
                                                25429.3,
                                                13876
                                            ],
                                            [
                                                25698.1,
                                                13736
                                            ],
                                            [
                                                25859.1,
                                                13812.5
                                            ],
                                            [
                                                25980.3,
                                                14202.6
                                            ],
                                            [
                                                25775.3,
                                                14359.6
                                            ],
                                            [
                                                25611.7,
                                                14205.3
                                            ],
                                            [
                                                25103.7,
                                                14181.2
                                            ],
                                            [
                                                25043.7,
                                                13942.9
                                            ]
                                        ],
                                        "id": 288,
                                        "chat_link": "[&BCABAAA=]"
                                    },
                                    "289": {
                                        "name": "Ascalon City Ruins",
                                        "level": 14,
                                        "coord": [
                                            28266.8,
                                            13869.6
                                        ],
                                        "bounds": [
                                            [
                                                28243.7,
                                                14347.4
                                            ],
                                            [
                                                27929,
                                                14009
                                            ],
                                            [
                                                27955.5,
                                                13664.4
                                            ],
                                            [
                                                27959.4,
                                                13594.6
                                            ],
                                            [
                                                27975.3,
                                                13537.7
                                            ],
                                            [
                                                28195.8,
                                                13511.4
                                            ],
                                            [
                                                28658,
                                                13508.3
                                            ],
                                            [
                                                28698,
                                                14037.3
                                            ],
                                            [
                                                28521.4,
                                                14204.3
                                            ],
                                            [
                                                28532,
                                                14281.6
                                            ],
                                            [
                                                28243.7,
                                                14347.4
                                            ]
                                        ],
                                        "id": 289,
                                        "chat_link": "[&BCEBAAA=]"
                                    },
                                    "290": {
                                        "name": "Devourer's Mouth",
                                        "level": 3,
                                        "coord": [
                                            25500,
                                            13702
                                        ],
                                        "bounds": [
                                            [
                                                25699.2,
                                                13736.9
                                            ],
                                            [
                                                25432.9,
                                                13875.5
                                            ],
                                            [
                                                25372.9,
                                                13836.5
                                            ],
                                            [
                                                25461.3,
                                                13773
                                            ],
                                            [
                                                25461.8,
                                                13730.4
                                            ],
                                            [
                                                25384.3,
                                                13632.7
                                            ],
                                            [
                                                25440.3,
                                                13507.4
                                            ],
                                            [
                                                25600.6,
                                                13565.9
                                            ],
                                            [
                                                25646.6,
                                                13659.9
                                            ],
                                            [
                                                25699.2,
                                                13736.9
                                            ]
                                        ],
                                        "id": 290,
                                        "chat_link": "[&BCIBAAA=]"
                                    },
                                    "291": {
                                        "name": "Abbey Ruins",
                                        "level": 10,
                                        "coord": [
                                            27040.3,
                                            14679.9
                                        ],
                                        "bounds": [
                                            [
                                                27137.1,
                                                14535.6
                                            ],
                                            [
                                                26911.5,
                                                14595.2
                                            ],
                                            [
                                                26980.7,
                                                14762.6
                                            ],
                                            [
                                                27132.1,
                                                14826.1
                                            ],
                                            [
                                                27137.1,
                                                14535.6
                                            ]
                                        ],
                                        "id": 291,
                                        "chat_link": "[&BCMBAAA=]"
                                    },
                                    "292": {
                                        "name": "Agnos Gorge",
                                        "level": 15,
                                        "coord": [
                                            27291.9,
                                            14108.4
                                        ],
                                        "bounds": [
                                            [
                                                27247.7,
                                                14159.8
                                            ],
                                            [
                                                27232.2,
                                                14110
                                            ],
                                            [
                                                27185.9,
                                                14039.6
                                            ],
                                            [
                                                27203,
                                                13990
                                            ],
                                            [
                                                27249.9,
                                                13950.5
                                            ],
                                            [
                                                27331.9,
                                                13980.6
                                            ],
                                            [
                                                27343.6,
                                                14034.3
                                            ],
                                            [
                                                27380.1,
                                                14131.3
                                            ],
                                            [
                                                27379.1,
                                                14165.7
                                            ],
                                            [
                                                27377.2,
                                                14197.8
                                            ],
                                            [
                                                27334.5,
                                                14296.4
                                            ],
                                            [
                                                27237.7,
                                                14244.6
                                            ],
                                            [
                                                27247.7,
                                                14159.8
                                            ]
                                        ],
                                        "id": 292,
                                        "chat_link": "[&BCQBAAA=]"
                                    },
                                    "293": {
                                        "name": "Human's Lament",
                                        "level": 14,
                                        "coord": [
                                            28962.5,
                                            13741.3
                                        ],
                                        "bounds": [
                                            [
                                                28670.6,
                                                13751.4
                                            ],
                                            [
                                                28655.8,
                                                13512.1
                                            ],
                                            [
                                                28830.6,
                                                13538.2
                                            ],
                                            [
                                                28932.4,
                                                13453.9
                                            ],
                                            [
                                                29153.9,
                                                13509.1
                                            ],
                                            [
                                                29241.2,
                                                13610.1
                                            ],
                                            [
                                                29168.7,
                                                13781.6
                                            ],
                                            [
                                                29181.6,
                                                13891
                                            ],
                                            [
                                                29167.4,
                                                13994.1
                                            ],
                                            [
                                                28888,
                                                14076.7
                                            ],
                                            [
                                                28697.6,
                                                14036.5
                                            ],
                                            [
                                                28670.6,
                                                13751.4
                                            ]
                                        ],
                                        "id": 293,
                                        "chat_link": "[&BCUBAAA=]"
                                    },
                                    "567": {
                                        "name": "Facula Castrum",
                                        "level": 5,
                                        "coord": [
                                            26353.5,
                                            13640
                                        ],
                                        "bounds": [
                                            [
                                                26379.3,
                                                13840.4
                                            ],
                                            [
                                                26460.4,
                                                13795.7
                                            ],
                                            [
                                                26539.7,
                                                13623.8
                                            ],
                                            [
                                                26583.6,
                                                13524.2
                                            ],
                                            [
                                                26310.3,
                                                13469.8
                                            ],
                                            [
                                                26049.2,
                                                13524.1
                                            ],
                                            [
                                                26152.3,
                                                13701.8
                                            ],
                                            [
                                                26379.3,
                                                13840.4
                                            ]
                                        ],
                                        "id": 567,
                                        "chat_link": "[&BDcCAAA=]"
                                    },
                                    "1104": {
                                        "name": "Langmar Estate",
                                        "level": 15,
                                        "coord": [
                                            25451.9,
                                            15261.5
                                        ],
                                        "bounds": [
                                            [
                                                25716.8,
                                                15394.8
                                            ],
                                            [
                                                25807,
                                                15427.5
                                            ],
                                            [
                                                25721.1,
                                                15643
                                            ],
                                            [
                                                25030.1,
                                                15607.6
                                            ],
                                            [
                                                25011,
                                                14761.6
                                            ],
                                            [
                                                25304,
                                                14694.3
                                            ],
                                            [
                                                25344.6,
                                                15054.4
                                            ],
                                            [
                                                25342.3,
                                                15370.6
                                            ],
                                            [
                                                25519.9,
                                                15378.2
                                            ],
                                            [
                                                25722.1,
                                                15282.8
                                            ],
                                            [
                                                25716.8,
                                                15394.8
                                            ]
                                        ],
                                        "id": 1104,
                                        "chat_link": "[&BFAEAAA=]"
                                    }
                                },
                                "adventures": [],
                                "id": 19,
                                "mastery_points": []
                            },
                            "371": {
                                "name": "Hero's Canton (Home)",
                                "min_level": 0,
                                "max_level": 0,
                                "default_floor": 1,
                                "label_coord": [
                                    24320,
                                    14076
                                ],
                                "map_rect": [
                                    [
                                        -18432,
                                        -24576
                                    ],
                                    [
                                        18432,
                                        24576
                                    ]
                                ],
                                "continent_rect": [
                                    [
                                        23552,
                                        13568
                                    ],
                                    [
                                        25088,
                                        15616
                                    ]
                                ],
                                "points_of_interest": {},
                                "tasks": {},
                                "skill_challenges": [],
                                "sectors": {},
                                "id": 371,
                                "mastery_points": [],
                                "adventures": []
                            },
                            "372": {
                                "name": "Blood Tribune Quarters",
                                "min_level": 0,
                                "max_level": 0,
                                "default_floor": 1,
                                "label_coord": [
                                    24320,
                                    14076
                                ],
                                "map_rect": [
                                    [
                                        -18432,
                                        -24576
                                    ],
                                    [
                                        18432,
                                        24576
                                    ]
                                ],
                                "continent_rect": [
                                    [
                                        23552,
                                        13568
                                    ],
                                    [
                                        25088,
                                        15616
                                    ]
                                ],
                                "points_of_interest": {},
                                "tasks": {},
                                "skill_challenges": [],
                                "sectors": {},
                                "id": 372,
                                "mastery_points": [],
                                "adventures": []
                            }
                        },
                        "id": 2
                    },
                    "10": {
                        "name": "Heart of Maguuma",
                        "label_coord": [
                            3100,
                            18100
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
                            "1033": {
                                "name": "Buried Insight",
                                "min_level": 80,
                                "max_level": 80,
                                "default_floor": 0,
                                "label_coord": [
                                    2968,
                                    18688
                                ],
                                "map_rect": [
                                    [
                                        -39936,
                                        -27648
                                    ],
                                    [
                                        39936,
                                        27648
                                    ]
                                ],
                                "continent_rect": [
                                    [
                                        2560,
                                        17408
                                    ],
                                    [
                                        5888,
                                        19712
                                    ]
                                ],
                                "points_of_interest": {
                                    "1988": {
                                        "name": "Arboreal Overlook",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            3412.04,
                                            18657.2
                                        ],
                                        "id": 1988,
                                        "chat_link": "[&BMQHAAA=]"
                                    },
                                    "1998": {
                                        "name": "Ley Line Node",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            3533.89,
                                            19326.9
                                        ],
                                        "id": 1998,
                                        "chat_link": "[&BM4HAAA=]"
                                    },
                                    "2001": {
                                        "name": "Vine Wall",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            5568.2,
                                            19466.7
                                        ],
                                        "id": 2001,
                                        "chat_link": "[&BNEHAAA=]"
                                    },
                                    "2008": {
                                        "name": "Ley Flow",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            4171.76,
                                            18708.1
                                        ],
                                        "id": 2008,
                                        "chat_link": "[&BNgHAAA=]"
                                    },
                                    "2010": {
                                        "name": "Rata Novus Command Center",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            4881.26,
                                            18727
                                        ],
                                        "id": 2010,
                                        "chat_link": "[&BNoHAAA=]"
                                    },
                                    "2011": {
                                        "name": "Tranquil Refuge",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            3425.73,
                                            19065.1
                                        ],
                                        "id": 2011,
                                        "chat_link": "[&BNsHAAA=]"
                                    },
                                    "2012": {
                                        "name": "Chak Staging Area",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            3547.12,
                                            18167.4
                                        ],
                                        "id": 2012,
                                        "chat_link": "[&BNwHAAA=]"
                                    },
                                    "2015": {
                                        "name": "Decrepit Chak Nest",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            4933.91,
                                            17894.1
                                        ],
                                        "id": 2015,
                                        "chat_link": "[&BN8HAAA=]"
                                    },
                                    "2020": {
                                        "name": "Ogre Crash Site",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            4097.18,
                                            19111.4
                                        ],
                                        "id": 2020,
                                        "chat_link": "[&BOQHAAA=]"
                                    },
                                    "2022": {
                                        "name": "Kaana's Terrace",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            4182.21,
                                            17905.4
                                        ],
                                        "id": 2022,
                                        "chat_link": "[&BOYHAAA=]"
                                    },
                                    "2023": {
                                        "name": "Gnarled Roots",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            3157.56,
                                            18659.8
                                        ],
                                        "id": 2023,
                                        "chat_link": "[&BOcHAAA=]"
                                    },
                                    "2035": {
                                        "name": "Cascade Descent",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            5444.67,
                                            18861.3
                                        ],
                                        "id": 2035,
                                        "chat_link": "[&BPMHAAA=]"
                                    },
                                    "2039": {
                                        "name": "Rata Novus Perimeter",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            4898.1,
                                            18345.9
                                        ],
                                        "id": 2039,
                                        "chat_link": "[&BPcHAAA=]"
                                    },
                                    "2052": {
                                        "name": "Subterranean Lake",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            4177.52,
                                            17825.5
                                        ],
                                        "id": 2052,
                                        "chat_link": "[&BAQIAAA=]"
                                    },
                                    "2053": {
                                        "name": "Order of Whispers Camp",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            3062.3,
                                            18251.4
                                        ],
                                        "id": 2053,
                                        "chat_link": "[&BAUIAAA=]"
                                    },
                                    "2055": {
                                        "name": "Rata Novus Orchards",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            4767.99,
                                            18622.1
                                        ],
                                        "id": 2055,
                                        "chat_link": "[&BAcIAAA=]"
                                    },
                                    "2058": {
                                        "name": "Sheltered Clearing",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            5169.32,
                                            19098.3
                                        ],
                                        "id": 2058,
                                        "chat_link": "[&BAoIAAA=]"
                                    },
                                    "2063": {
                                        "name": "Twisting Viaduct",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            3049.76,
                                            19414.3
                                        ],
                                        "id": 2063,
                                        "chat_link": "[&BA8IAAA=]"
                                    },
                                    "2068": {
                                        "name": "Terraced Hive",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            5499.7,
                                            18752
                                        ],
                                        "id": 2068,
                                        "chat_link": "[&BBQIAAA=]"
                                    },
                                    "2069": {
                                        "name": "Order of Whispers Outpost",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            3417.45,
                                            18360.2
                                        ],
                                        "id": 2069,
                                        "chat_link": "[&BBUIAAA=]"
                                    }
                                },
                                "tasks": {},
                                "skill_challenges": [],
                                "sectors": {
                                    "1238": {
                                        "name": "Rata Novus Lane",
                                        "level": 80,
                                        "coord": [
                                            4617.83,
                                            18498.9
                                        ],
                                        "bounds": [
                                            [
                                                4435.47,
                                                18384.5
                                            ],
                                            [
                                                4526.16,
                                                18242.8
                                            ],
                                            [
                                                4581.84,
                                                18106
                                            ],
                                            [
                                                4722.97,
                                                18090.5
                                            ],
                                            [
                                                4815.28,
                                                18146.5
                                            ],
                                            [
                                                4772.22,
                                                18384
                                            ],
                                            [
                                                4769.1,
                                                18598.9
                                            ],
                                            [
                                                4723.17,
                                                18795.8
                                            ],
                                            [
                                                4591.34,
                                                18911.3
                                            ],
                                            [
                                                4532.79,
                                                18902.6
                                            ],
                                            [
                                                4483.79,
                                                18772.4
                                            ],
                                            [
                                                4459.88,
                                                18651.7
                                            ],
                                            [
                                                4435.47,
                                                18384.5
                                            ]
                                        ],
                                        "id": 1238,
                                        "chat_link": "[&BNYEAAA=]"
                                    },
                                    "1252": {
                                        "name": "Rata Novus",
                                        "level": 80,
                                        "coord": [
                                            5011.73,
                                            18533.8
                                        ],
                                        "bounds": [
                                            [
                                                4903.78,
                                                18224.9
                                            ],
                                            [
                                                5380.15,
                                                18181.8
                                            ],
                                            [
                                                5576.77,
                                                18343.8
                                            ],
                                            [
                                                5467.15,
                                                18605.5
                                            ],
                                            [
                                                5022.71,
                                                18811.5
                                            ],
                                            [
                                                4875.68,
                                                18825.9
                                            ],
                                            [
                                                4847,
                                                18932.7
                                            ],
                                            [
                                                4720.09,
                                                18797.1
                                            ],
                                            [
                                                4765.45,
                                                18606.7
                                            ],
                                            [
                                                4767.28,
                                                18390.3
                                            ],
                                            [
                                                4803,
                                                18151.2
                                            ],
                                            [
                                                4903.78,
                                                18224.9
                                            ]
                                        ],
                                        "id": 1252,
                                        "chat_link": "[&BOQEAAA=]"
                                    }
                                },
                                "adventures": [],
                                "id": 1033,
                                "mastery_points": []
                            },
                            "1043": {
                                "name": "Auric Basin",
                                "min_level": 80,
                                "max_level": 80,
                                "default_floor": 1,
                                "label_coord": [
                                    1536,
                                    17408
                                ],
                                "map_rect": [
                                    [
                                        -24576,
                                        -33792
                                    ],
                                    [
                                        24576,
                                        33792
                                    ]
                                ],
                                "continent_rect": [
                                    [
                                        512,
                                        16128
                                    ],
                                    [
                                        2560,
                                        18944
                                    ]
                                ],
                                "points_of_interest": {
                                    "1987": {
                                        "name": "Luminate's Throne",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            1277.9,
                                            17545.3
                                        ],
                                        "id": 1987,
                                        "chat_link": "[&BMMHAAA=]"
                                    },
                                    "1990": {
                                        "name": "Forgotten City Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            1550.44,
                                            17582.2
                                        ],
                                        "id": 1990,
                                        "chat_link": "[&BMYHAAA=]"
                                    },
                                    "1992": {
                                        "name": "Thornwatch",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            1642.4,
                                            18772.5
                                        ],
                                        "id": 1992,
                                        "chat_link": "[&BMgHAAA=]"
                                    },
                                    "1993": {
                                        "name": "Northgate",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            1538.07,
                                            17160.2
                                        ],
                                        "id": 1993,
                                        "chat_link": "[&BMkHAAA=]"
                                    },
                                    "1997": {
                                        "name": "Overseer's Cave",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            1297.32,
                                            18480.9
                                        ],
                                        "id": 1997,
                                        "chat_link": "[&BM0HAAA=]"
                                    },
                                    "2000": {
                                        "name": "Bramble Plateau",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            1620.12,
                                            16403.5
                                        ],
                                        "id": 2000,
                                        "chat_link": "[&BNAHAAA=]"
                                    },
                                    "2002": {
                                        "name": "Capitzel Grounds",
                                        "type": "landmark",
                                        "floor": 2,
                                        "coord": [
                                            725.779,
                                            16596.1
                                        ],
                                        "id": 2002,
                                        "chat_link": "[&BNIHAAA=]"
                                    },
                                    "2003": {
                                        "name": "Quazupl Grounds",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            2257.34,
                                            16402.2
                                        ],
                                        "id": 2003,
                                        "chat_link": "[&BNMHAAA=]"
                                    },
                                    "2004": {
                                        "name": "Weeping Glade",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            2229.62,
                                            17872.8
                                        ],
                                        "id": 2004,
                                        "chat_link": "[&BNQHAAA=]"
                                    },
                                    "2006": {
                                        "name": "Wanderer's Waypoint",
                                        "type": "waypoint",
                                        "floor": 2,
                                        "coord": [
                                            904.367,
                                            16436.5
                                        ],
                                        "id": 2006,
                                        "chat_link": "[&BNYHAAA=]"
                                    },
                                    "2007": {
                                        "name": "Inner Chamber",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            1892.99,
                                            17892
                                        ],
                                        "id": 2007,
                                        "chat_link": "[&BNcHAAA=]"
                                    },
                                    "2009": {
                                        "name": "Jawatl Grounds",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            1858.21,
                                            18557.8
                                        ],
                                        "id": 2009,
                                        "chat_link": "[&BNkHAAA=]"
                                    },
                                    "2013": {
                                        "name": "Northwatch Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            1634.49,
                                            16759.6
                                        ],
                                        "id": 2013,
                                        "chat_link": "[&BN0HAAA=]"
                                    },
                                    "2018": {
                                        "name": "Masks of the Fallen",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            1211.12,
                                            17151.8
                                        ],
                                        "id": 2018,
                                        "chat_link": "[&BOIHAAA=]"
                                    },
                                    "2019": {
                                        "name": "Eastgate",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            2121.69,
                                            17535.7
                                        ],
                                        "id": 2019,
                                        "chat_link": "[&BOMHAAA=]"
                                    },
                                    "2024": {
                                        "name": "Legacy Pillars",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            1537.85,
                                            17533.5
                                        ],
                                        "id": 2024,
                                        "chat_link": "[&BOgHAAA=]"
                                    },
                                    "2026": {
                                        "name": "New Skrittington",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            1019,
                                            16909.2
                                        ],
                                        "id": 2026,
                                        "chat_link": "[&BOoHAAA=]"
                                    },
                                    "2028": {
                                        "name": "Endurance Crash Site",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            2051.43,
                                            18234.2
                                        ],
                                        "id": 2028,
                                        "chat_link": "[&BOwHAAA=]"
                                    },
                                    "2029": {
                                        "name": "Westgate",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            1154.96,
                                            17389.5
                                        ],
                                        "id": 2029,
                                        "chat_link": "[&BO0HAAA=]"
                                    },
                                    "2033": {
                                        "name": "Vinetooth Den",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            2444.37,
                                            16981.4
                                        ],
                                        "id": 2033,
                                        "chat_link": "[&BPEHAAA=]"
                                    },
                                    "2038": {
                                        "name": "Southgate",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            1536.58,
                                            17981.6
                                        ],
                                        "id": 2038,
                                        "chat_link": "[&BPYHAAA=]"
                                    },
                                    "2040": {
                                        "name": "Eastwatch Ruins",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            2460.88,
                                            17444.5
                                        ],
                                        "id": 2040,
                                        "chat_link": "[&BPgHAAA=]"
                                    },
                                    "2041": {
                                        "name": "Northwatch Priory Camp",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            1746.81,
                                            16705
                                        ],
                                        "id": 2041,
                                        "chat_link": "[&BPkHAAA=]"
                                    },
                                    "2044": {
                                        "name": "Fahautl Grounds",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            991.642,
                                            17924.3
                                        ],
                                        "id": 2044,
                                        "chat_link": "[&BPwHAAA=]"
                                    },
                                    "2050": {
                                        "name": "Southwatch Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            1459.79,
                                            18206.9
                                        ],
                                        "id": 2050,
                                        "chat_link": "[&BAIIAAA=]"
                                    },
                                    "2054": {
                                        "name": "Westwatch Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            935.863,
                                            17138.1
                                        ],
                                        "id": 2054,
                                        "chat_link": "[&BAYIAAA=]"
                                    },
                                    "2057": {
                                        "name": "Sealed Passageway",
                                        "type": "landmark",
                                        "floor": 0,
                                        "coord": [
                                            1898.66,
                                            17301.1
                                        ],
                                        "id": 2057,
                                        "chat_link": "[&BAkIAAA=]"
                                    },
                                    "2121": {
                                        "name": "Chak Hollow Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            2096.14,
                                            18641
                                        ],
                                        "id": 2121,
                                        "chat_link": "[&BEkIAAA=]"
                                    },
                                    "2128": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            2201.09,
                                            18005.4
                                        ],
                                        "id": 2128,
                                        "chat_link": "[&BFAIAAA=]"
                                    },
                                    "2156": {
                                        "name": "Eastwatch Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            2279.74,
                                            17418.8
                                        ],
                                        "id": 2156,
                                        "chat_link": "[&BGwIAAA=]"
                                    },
                                    "2157": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            909.021,
                                            17947.1
                                        ],
                                        "id": 2157,
                                        "chat_link": "[&BG0IAAA=]"
                                    },
                                    "2220": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            1050.75,
                                            16826.8
                                        ],
                                        "id": 2220,
                                        "chat_link": "[&BKwIAAA=]"
                                    },
                                    "2232": {
                                        "type": "vista",
                                        "floor": 0,
                                        "coord": [
                                            1747.84,
                                            17840.5
                                        ],
                                        "id": 2232,
                                        "chat_link": "[&BLgIAAA=]"
                                    },
                                    "2249": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            2088.69,
                                            17507.8
                                        ],
                                        "id": 2249,
                                        "chat_link": "[&BMkIAAA=]"
                                    },
                                    "2284": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            2017.83,
                                            16341
                                        ],
                                        "id": 2284,
                                        "chat_link": "[&BOwIAAA=]"
                                    }
                                },
                                "tasks": {},
                                "skill_challenges": [
                                    {
                                        "coord": [
                                            1769.14,
                                            16896.6
                                        ],
                                        "id": "1-14"
                                    },
                                    {
                                        "coord": [
                                            1734.59,
                                            17333.9
                                        ],
                                        "id": "1-15"
                                    },
                                    {
                                        "coord": [
                                            2093.8,
                                            16264.1
                                        ],
                                        "id": "1-13"
                                    },
                                    {
                                        "coord": [
                                            2480.98,
                                            18164.9
                                        ],
                                        "id": "1-18"
                                    },
                                    {
                                        "coord": [
                                            874.242,
                                            16608.3
                                        ],
                                        "id": "1-17"
                                    },
                                    {
                                        "coord": [
                                            1982.77,
                                            18889.2
                                        ],
                                        "id": "1-19"
                                    },
                                    {
                                        "coord": [
                                            840.037,
                                            16829.6
                                        ],
                                        "id": "1-20"
                                    },
                                    {
                                        "coord": [
                                            1511.09,
                                            17338.5
                                        ],
                                        "id": "1-16"
                                    },
                                    {
                                        "coord": [
                                            1011.33,
                                            18800.8
                                        ],
                                        "id": "1-11"
                                    },
                                    {
                                        "coord": [
                                            2435.83,
                                            17127
                                        ],
                                        "id": "1-12"
                                    },
                                    {
                                        "coord": [
                                            604.746,
                                            18048.5
                                        ],
                                        "id": "1-21"
                                    }
                                ],
                                "sectors": {
                                    "1218": {
                                        "name": "Southwatch Creep",
                                        "level": 80,
                                        "coord": [
                                            1583.93,
                                            18331.8
                                        ],
                                        "bounds": [
                                            [
                                                1513.2,
                                                17983
                                            ],
                                            [
                                                1602,
                                                17980
                                            ],
                                            [
                                                1847.58,
                                                18120.5
                                            ],
                                            [
                                                1886.59,
                                                18283.6
                                            ],
                                            [
                                                1860.57,
                                                18448.7
                                            ],
                                            [
                                                1809.94,
                                                18470.3
                                            ],
                                            [
                                                1778.14,
                                                18549.2
                                            ],
                                            [
                                                1699.15,
                                                18535.9
                                            ],
                                            [
                                                1416.31,
                                                18529.5
                                            ],
                                            [
                                                1346.35,
                                                18603.2
                                            ],
                                            [
                                                1243.52,
                                                18478.3
                                            ],
                                            [
                                                1247.46,
                                                18156
                                            ],
                                            [
                                                1340.28,
                                                18175.8
                                            ],
                                            [
                                                1513.2,
                                                17983
                                            ]
                                        ],
                                        "id": 1218,
                                        "chat_link": "[&BMIEAAA=]"
                                    },
                                    "1219": {
                                        "name": "Balthazar's Rest",
                                        "level": 80,
                                        "coord": [
                                            1111.3,
                                            18716.1
                                        ],
                                        "bounds": [
                                            [
                                                834.112,
                                                18917.6
                                            ],
                                            [
                                                847.571,
                                                18686
                                            ],
                                            [
                                                1110.18,
                                                18570.7
                                            ],
                                            [
                                                1144.39,
                                                18463.9
                                            ],
                                            [
                                                1245.92,
                                                18469.4
                                            ],
                                            [
                                                1374.44,
                                                18650.8
                                            ],
                                            [
                                                1232.14,
                                                18726
                                            ],
                                            [
                                                1207.25,
                                                18926.6
                                            ],
                                            [
                                                1005.69,
                                                19034.3
                                            ],
                                            [
                                                834.112,
                                                18917.6
                                            ]
                                        ],
                                        "id": 1219,
                                        "chat_link": "[&BMMEAAA=]"
                                    },
                                    "1220": {
                                        "name": "Burnisher Quarry",
                                        "level": 80,
                                        "coord": [
                                            2179.29,
                                            16412.9
                                        ],
                                        "bounds": [
                                            [
                                                1837.49,
                                                16097.5
                                            ],
                                            [
                                                2139.71,
                                                16099.3
                                            ],
                                            [
                                                2331.7,
                                                15996.2
                                            ],
                                            [
                                                2608.16,
                                                16225
                                            ],
                                            [
                                                2585.36,
                                                16619.4
                                            ],
                                            [
                                                2476.1,
                                                16854.8
                                            ],
                                            [
                                                2282.3,
                                                16981.3
                                            ],
                                            [
                                                2176.05,
                                                16629.2
                                            ],
                                            [
                                                2121.11,
                                                16548.7
                                            ],
                                            [
                                                1973.01,
                                                16432.5
                                            ],
                                            [
                                                1852.74,
                                                16304.6
                                            ],
                                            [
                                                1767.74,
                                                16166
                                            ],
                                            [
                                                1837.49,
                                                16097.5
                                            ]
                                        ],
                                        "id": 1220,
                                        "chat_link": "[&BMQEAAA=]"
                                    },
                                    "1222": {
                                        "name": "Westwatch Patch",
                                        "level": 80,
                                        "coord": [
                                            886.757,
                                            17137.4
                                        ],
                                        "bounds": [
                                            [
                                                520.958,
                                                17545.2
                                            ],
                                            [
                                                585.296,
                                                17554.3
                                            ],
                                            [
                                                662.183,
                                                17414.7
                                            ],
                                            [
                                                889.387,
                                                17569.5
                                            ],
                                            [
                                                1103.45,
                                                17412.2
                                            ],
                                            [
                                                1176.79,
                                                17280.5
                                            ],
                                            [
                                                1101.2,
                                                17190.4
                                            ],
                                            [
                                                1071.48,
                                                16982.3
                                            ],
                                            [
                                                1108.48,
                                                16949.7
                                            ],
                                            [
                                                1180.36,
                                                16940
                                            ],
                                            [
                                                1026.96,
                                                16755.7
                                            ],
                                            [
                                                973.596,
                                                16828.9
                                            ],
                                            [
                                                749.438,
                                                16727.5
                                            ],
                                            [
                                                629.004,
                                                16813.4
                                            ],
                                            [
                                                522.767,
                                                17096.8
                                            ],
                                            [
                                                520.958,
                                                17545.2
                                            ]
                                        ],
                                        "id": 1222,
                                        "chat_link": "[&BMYEAAA=]"
                                    },
                                    "1224": {
                                        "name": "Tarnished Treetop",
                                        "level": 80,
                                        "coord": [
                                            926.928,
                                            16469
                                        ],
                                        "bounds": [
                                            [
                                                671.592,
                                                16159.3
                                            ],
                                            [
                                                814.204,
                                                16041.4
                                            ],
                                            [
                                                981.954,
                                                16168.6
                                            ],
                                            [
                                                1311.81,
                                                16064.6
                                            ],
                                            [
                                                1459.72,
                                                16207.1
                                            ],
                                            [
                                                1340.08,
                                                16597.7
                                            ],
                                            [
                                                1282.21,
                                                16581.3
                                            ],
                                            [
                                                1075.04,
                                                16689.6
                                            ],
                                            [
                                                974.329,
                                                16829
                                            ],
                                            [
                                                748.692,
                                                16725.2
                                            ],
                                            [
                                                629.546,
                                                16813.8
                                            ],
                                            [
                                                532.425,
                                                16732.5
                                            ],
                                            [
                                                527.171,
                                                16511.2
                                            ],
                                            [
                                                628.221,
                                                16444.5
                                            ],
                                            [
                                                671.592,
                                                16159.3
                                            ]
                                        ],
                                        "id": 1224,
                                        "chat_link": "[&BMgEAAA=]"
                                    },
                                    "1225": {
                                        "name": "Mossheart Walk",
                                        "level": 80,
                                        "coord": [
                                            2112.83,
                                            18288
                                        ],
                                        "bounds": [
                                            [
                                                1845.31,
                                                18115.6
                                            ],
                                            [
                                                2316.02,
                                                18012.6
                                            ],
                                            [
                                                2425.57,
                                                18368.2
                                            ],
                                            [
                                                2342.69,
                                                18499.6
                                            ],
                                            [
                                                1861.03,
                                                18448.1
                                            ],
                                            [
                                                1886.33,
                                                18283.9
                                            ],
                                            [
                                                1845.31,
                                                18115.6
                                            ]
                                        ],
                                        "id": 1225,
                                        "chat_link": "[&BMkEAAA=]"
                                    },
                                    "1226": {
                                        "name": "Arrowhead Vale",
                                        "level": 80,
                                        "coord": [
                                            1429.04,
                                            16881.2
                                        ],
                                        "bounds": [
                                            [
                                                1362.2,
                                                17076.5
                                            ],
                                            [
                                                1282.12,
                                                16962.4
                                            ],
                                            [
                                                1178.54,
                                                16939.6
                                            ],
                                            [
                                                1025.99,
                                                16753.6
                                            ],
                                            [
                                                1074.22,
                                                16686
                                            ],
                                            [
                                                1281.27,
                                                16582.6
                                            ],
                                            [
                                                1491.35,
                                                16636.9
                                            ],
                                            [
                                                1502.44,
                                                16784.7
                                            ],
                                            [
                                                1765.12,
                                                16803.9
                                            ],
                                            [
                                                1824.46,
                                                16896.3
                                            ],
                                            [
                                                1713.37,
                                                17118.1
                                            ],
                                            [
                                                1635.59,
                                                17104.7
                                            ],
                                            [
                                                1440.79,
                                                17110.1
                                            ],
                                            [
                                                1362.2,
                                                17076.5
                                            ]
                                        ],
                                        "id": 1226,
                                        "chat_link": "[&BMoEAAA=]"
                                    },
                                    "1230": {
                                        "name": "Maguuma Shallows",
                                        "level": 80,
                                        "coord": [
                                            1976.43,
                                            16849.8
                                        ],
                                        "bounds": [
                                            [
                                                1762.62,
                                                16805.2
                                            ],
                                            [
                                                1975,
                                                16574.8
                                            ],
                                            [
                                                1928.1,
                                                16521.2
                                            ],
                                            [
                                                1971.37,
                                                16428.5
                                            ],
                                            [
                                                2122.2,
                                                16545.9
                                            ],
                                            [
                                                2179.43,
                                                16624.1
                                            ],
                                            [
                                                2282.55,
                                                16982.6
                                            ],
                                            [
                                                2149.34,
                                                17209.1
                                            ],
                                            [
                                                1980.18,
                                                17319.3
                                            ],
                                            [
                                                1824.44,
                                                17172.5
                                            ],
                                            [
                                                1714.65,
                                                17118.2
                                            ],
                                            [
                                                1827.22,
                                                16896.8
                                            ],
                                            [
                                                1762.62,
                                                16805.2
                                            ]
                                        ],
                                        "id": 1230,
                                        "chat_link": "[&BM4EAAA=]"
                                    },
                                    "1236": {
                                        "name": "Northwatch Descent",
                                        "level": 80,
                                        "coord": [
                                            1706.67,
                                            16503
                                        ],
                                        "bounds": [
                                            [
                                                1459.13,
                                                16205.4
                                            ],
                                            [
                                                1770.04,
                                                16166.3
                                            ],
                                            [
                                                1854.32,
                                                16302.8
                                            ],
                                            [
                                                1971.88,
                                                16432.6
                                            ],
                                            [
                                                1932.02,
                                                16521.9
                                            ],
                                            [
                                                1979.05,
                                                16574.7
                                            ],
                                            [
                                                1767.58,
                                                16810.3
                                            ],
                                            [
                                                1502.72,
                                                16784.8
                                            ],
                                            [
                                                1491.25,
                                                16634.5
                                            ],
                                            [
                                                1338.74,
                                                16596.6
                                            ],
                                            [
                                                1459.13,
                                                16205.4
                                            ]
                                        ],
                                        "id": 1236,
                                        "chat_link": "[&BNQEAAA=]"
                                    },
                                    "1240": {
                                        "name": "Chak Hollow",
                                        "level": 80,
                                        "coord": [
                                            2144.7,
                                            18670.1
                                        ],
                                        "bounds": [
                                            [
                                                2664.48,
                                                18625.2
                                            ],
                                            [
                                                2601.12,
                                                18991.1
                                            ],
                                            [
                                                2397.58,
                                                18914.1
                                            ],
                                            [
                                                2144.58,
                                                18983.7
                                            ],
                                            [
                                                2009.86,
                                                18905.3
                                            ],
                                            [
                                                1871.02,
                                                18910.8
                                            ],
                                            [
                                                1767.45,
                                                18744.4
                                            ],
                                            [
                                                1790.63,
                                                18605.9
                                            ],
                                            [
                                                1777.6,
                                                18549.7
                                            ],
                                            [
                                                1809.72,
                                                18468.7
                                            ],
                                            [
                                                1860.56,
                                                18446.4
                                            ],
                                            [
                                                2344.63,
                                                18498.3
                                            ],
                                            [
                                                2427.1,
                                                18368.2
                                            ],
                                            [
                                                2559.5,
                                                18369.9
                                            ],
                                            [
                                                2664.48,
                                                18625.2
                                            ]
                                        ],
                                        "id": 1240,
                                        "chat_link": "[&BNgEAAA=]"
                                    },
                                    "1241": {
                                        "name": "Bristleback Chasm",
                                        "level": 80,
                                        "coord": [
                                            2262.92,
                                            17440.5
                                        ],
                                        "bounds": [
                                            [
                                                2128.2,
                                                17438
                                            ],
                                            [
                                                1975.54,
                                                17318.7
                                            ],
                                            [
                                                2146.7,
                                                17210.1
                                            ],
                                            [
                                                2283.05,
                                                16984.1
                                            ],
                                            [
                                                2476.93,
                                                16855.5
                                            ],
                                            [
                                                2586.66,
                                                16959.4
                                            ],
                                            [
                                                2576.08,
                                                17081.7
                                            ],
                                            [
                                                2387.4,
                                                17104.8
                                            ],
                                            [
                                                2271.95,
                                                17271.3
                                            ],
                                            [
                                                2270.73,
                                                17438.1
                                            ],
                                            [
                                                2341.9,
                                                17515.8
                                            ],
                                            [
                                                2316.53,
                                                17729.6
                                            ],
                                            [
                                                2358.73,
                                                17861.1
                                            ],
                                            [
                                                2315.19,
                                                18014.4
                                            ],
                                            [
                                                1950.49,
                                                18096.4
                                            ],
                                            [
                                                1953.99,
                                                17997.5
                                            ],
                                            [
                                                2129.56,
                                                17612.8
                                            ],
                                            [
                                                2128.2,
                                                17438
                                            ]
                                        ],
                                        "id": 1241,
                                        "chat_link": "[&BNkEAAA=]"
                                    },
                                    "1244": {
                                        "name": "Tarir, the Forgotten City",
                                        "level": 80,
                                        "coord": [
                                            1488.89,
                                            17496.9
                                        ],
                                        "bounds": [
                                            [
                                                1362.73,
                                                17076.9
                                            ],
                                            [
                                                1445.32,
                                                17111
                                            ],
                                            [
                                                1643.21,
                                                17101.1
                                            ],
                                            [
                                                1711.03,
                                                17118.6
                                            ],
                                            [
                                                1826.09,
                                                17170.8
                                            ],
                                            [
                                                1975.52,
                                                17316.4
                                            ],
                                            [
                                                2133.2,
                                                17448.4
                                            ],
                                            [
                                                2130.1,
                                                17612.9
                                            ],
                                            [
                                                1953.99,
                                                17998.7
                                            ],
                                            [
                                                1949.91,
                                                18096.3
                                            ],
                                            [
                                                1847.05,
                                                18121
                                            ],
                                            [
                                                1610.19,
                                                17980.8
                                            ],
                                            [
                                                1513.73,
                                                17983.8
                                            ],
                                            [
                                                1342.13,
                                                18175.7
                                            ],
                                            [
                                                1249.99,
                                                18156
                                            ],
                                            [
                                                1204.02,
                                                17895.2
                                            ],
                                            [
                                                1230.44,
                                                17764.9
                                            ],
                                            [
                                                1071.56,
                                                17575.6
                                            ],
                                            [
                                                1104.04,
                                                17413.5
                                            ],
                                            [
                                                1177.76,
                                                17280.7
                                            ],
                                            [
                                                1101.32,
                                                17190.5
                                            ],
                                            [
                                                1071.8,
                                                16982.6
                                            ],
                                            [
                                                1108.52,
                                                16949.6
                                            ],
                                            [
                                                1177.19,
                                                16940.4
                                            ],
                                            [
                                                1281.43,
                                                16960.2
                                            ],
                                            [
                                                1362.73,
                                                17076.9
                                            ]
                                        ],
                                        "id": 1244,
                                        "chat_link": "[&BNwEAAA=]"
                                    },
                                    "1245": {
                                        "name": "Eastwatch Bluff",
                                        "level": 80,
                                        "coord": [
                                            2424.59,
                                            17646.3
                                        ],
                                        "bounds": [
                                            [
                                                2343.59,
                                                17516.3
                                            ],
                                            [
                                                2272.56,
                                                17433
                                            ],
                                            [
                                                2274.6,
                                                17272.7
                                            ],
                                            [
                                                2389.41,
                                                17102.7
                                            ],
                                            [
                                                2576.38,
                                                17080.2
                                            ],
                                            [
                                                2612.72,
                                                17537.3
                                            ],
                                            [
                                                2695.97,
                                                17711.5
                                            ],
                                            [
                                                2540.94,
                                                18219.2
                                            ],
                                            [
                                                2399.07,
                                                18282.1
                                            ],
                                            [
                                                2314.05,
                                                18011.1
                                            ],
                                            [
                                                2359.63,
                                                17863
                                            ],
                                            [
                                                2316.15,
                                                17727.1
                                            ],
                                            [
                                                2343.59,
                                                17516.3
                                            ]
                                        ],
                                        "id": 1245,
                                        "chat_link": "[&BN0EAAA=]"
                                    },
                                    "1248": {
                                        "name": "Griffonfall",
                                        "level": 80,
                                        "coord": [
                                            976.428,
                                            18410.9
                                        ],
                                        "bounds": [
                                            [
                                                1258.84,
                                                18208
                                            ],
                                            [
                                                1245.45,
                                                18471.7
                                            ],
                                            [
                                                1145.66,
                                                18462.9
                                            ],
                                            [
                                                1102.76,
                                                18566.5
                                            ],
                                            [
                                                847.821,
                                                18690.9
                                            ],
                                            [
                                                701.237,
                                                18599.9
                                            ],
                                            [
                                                592.754,
                                                18317.6
                                            ],
                                            [
                                                806.104,
                                                18146.1
                                            ],
                                            [
                                                1087.23,
                                                18234.7
                                            ],
                                            [
                                                1258.84,
                                                18208
                                            ]
                                        ],
                                        "id": 1248,
                                        "chat_link": "[&BOAEAAA=]"
                                    },
                                    "1258": {
                                        "name": "The Falls",
                                        "level": 80,
                                        "coord": [
                                            1082.5,
                                            17987.3
                                        ],
                                        "bounds": [
                                            [
                                                787.742,
                                                17917
                                            ],
                                            [
                                                800.771,
                                                18145.4
                                            ],
                                            [
                                                1092.06,
                                                18236.1
                                            ],
                                            [
                                                1258.3,
                                                18208.7
                                            ],
                                            [
                                                1204.76,
                                                17907.5
                                            ],
                                            [
                                                1229.65,
                                                17764.4
                                            ],
                                            [
                                                1204.23,
                                                17731.9
                                            ],
                                            [
                                                787.742,
                                                17917
                                            ]
                                        ],
                                        "id": 1258,
                                        "chat_link": "[&BOoEAAA=]"
                                    },
                                    "1260": {
                                        "name": "Lastgear Standing",
                                        "level": 80,
                                        "coord": [
                                            780.357,
                                            17786.6
                                        ],
                                        "bounds": [
                                            [
                                                788.121,
                                                17920
                                            ],
                                            [
                                                1203.19,
                                                17733
                                            ],
                                            [
                                                1071.8,
                                                17575.7
                                            ],
                                            [
                                                1104.21,
                                                17413.8
                                            ],
                                            [
                                                888.475,
                                                17573.7
                                            ],
                                            [
                                                662.483,
                                                17414.9
                                            ],
                                            [
                                                548.771,
                                                17601.4
                                            ],
                                            [
                                                595.471,
                                                17759.2
                                            ],
                                            [
                                                533.354,
                                                17845.2
                                            ],
                                            [
                                                532.871,
                                                18177.3
                                            ],
                                            [
                                                634.15,
                                                18279.3
                                            ],
                                            [
                                                801.388,
                                                18145.8
                                            ],
                                            [
                                                788.121,
                                                17920
                                            ]
                                        ],
                                        "id": 1260,
                                        "chat_link": "[&BOwEAAA=]"
                                    },
                                    "1262": {
                                        "name": "Morwood Wilds",
                                        "level": 80,
                                        "coord": [
                                            1556.34,
                                            18708.1
                                        ],
                                        "bounds": [
                                            [
                                                1654.17,
                                                19024.7
                                            ],
                                            [
                                                1203.56,
                                                18928.5
                                            ],
                                            [
                                                1231.91,
                                                18724
                                            ],
                                            [
                                                1373.09,
                                                18651.4
                                            ],
                                            [
                                                1331.43,
                                                18591.9
                                            ],
                                            [
                                                1416.18,
                                                18530.3
                                            ],
                                            [
                                                1698.56,
                                                18534.1
                                            ],
                                            [
                                                1777.12,
                                                18549.8
                                            ],
                                            [
                                                1791.1,
                                                18605.4
                                            ],
                                            [
                                                1769.89,
                                                18740.4
                                            ],
                                            [
                                                1872.77,
                                                18908.8
                                            ],
                                            [
                                                1654.17,
                                                19024.7
                                            ]
                                        ],
                                        "id": 1262,
                                        "chat_link": "[&BO4EAAA=]"
                                    }
                                },
                                "adventures": [],
                                "id": 1043,
                                "mastery_points": [
                                    {
                                        "coord": [
                                            1407.04,
                                            18377.6
                                        ],
                                        "id": 114,
                                        "region": "Maguuma"
                                    },
                                    {
                                        "coord": [
                                            2370.61,
                                            16812.1
                                        ],
                                        "id": 144,
                                        "region": "Maguuma"
                                    },
                                    {
                                        "coord": [
                                            2506.3,
                                            17847.8
                                        ],
                                        "id": 120,
                                        "region": "Maguuma"
                                    },
                                    {
                                        "coord": [
                                            852.217,
                                            17783.2
                                        ],
                                        "id": 119,
                                        "region": "Maguuma"
                                    },
                                    {
                                        "coord": [
                                            1810.11,
                                            18516.3
                                        ],
                                        "id": 116,
                                        "region": "Maguuma"
                                    },
                                    {
                                        "coord": [
                                            1288.42,
                                            17099.3
                                        ],
                                        "id": 137,
                                        "region": "Maguuma"
                                    },
                                    {
                                        "coord": [
                                            1352.53,
                                            17544.1
                                        ],
                                        "id": 40,
                                        "region": "Maguuma"
                                    },
                                    {
                                        "coord": [
                                            840.492,
                                            18018.3
                                        ],
                                        "id": 59,
                                        "region": "Maguuma"
                                    }
                                ]
                            },
                            "1062": {
                                "name": "Spirit Vale",
                                "min_level": 80,
                                "max_level": 80,
                                "default_floor": 1,
                                "label_coord": [
                                    3200,
                                    13056
                                ],
                                "map_rect": [
                                    [
                                        -15360,
                                        -36864
                                    ],
                                    [
                                        15360,
                                        39936
                                    ]
                                ],
                                "continent_rect": [
                                    [
                                        3456,
                                        11012
                                    ],
                                    [
                                        4736,
                                        14212
                                    ]
                                ],
                                "points_of_interest": {
                                    "2309": {
                                        "name": "River of Spirits",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            4127.89,
                                            13202.9
                                        ],
                                        "id": 2309,
                                        "chat_link": "[&BAUJAAA=]"
                                    },
                                    "2310": {
                                        "name": "Abandoned Outpost",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            3974.09,
                                            13038.4
                                        ],
                                        "id": 2310,
                                        "chat_link": "[&BAYJAAA=]"
                                    },
                                    "2311": {
                                        "name": "The Skillet",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            3883.09,
                                            12540.5
                                        ],
                                        "id": 2311,
                                        "chat_link": "[&BAcJAAA=]"
                                    },
                                    "2312": {
                                        "name": "Mysterious Pylons",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            3896.16,
                                            13533.7
                                        ],
                                        "id": 2312,
                                        "chat_link": "[&BAgJAAA=]"
                                    },
                                    "2313": {
                                        "name": "Bandit's Rest",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            3869.88,
                                            12858.4
                                        ],
                                        "id": 2313,
                                        "chat_link": "[&BAkJAAA=]"
                                    },
                                    "2314": {
                                        "name": "Gorseval's Perch",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            4164.36,
                                            12861.2
                                        ],
                                        "id": 2314,
                                        "chat_link": "[&BAoJAAA=]"
                                    }
                                },
                                "tasks": {},
                                "skill_challenges": [],
                                "sectors": {
                                    "1275": {
                                        "name": "Spirit Vale",
                                        "level": 80,
                                        "coord": [
                                            3978.52,
                                            13127.9
                                        ],
                                        "bounds": [
                                            [
                                                3536.56,
                                                12585.5
                                            ],
                                            [
                                                3566.38,
                                                12498.3
                                            ],
                                            [
                                                3733.46,
                                                12400.9
                                            ],
                                            [
                                                3878.78,
                                                12292.1
                                            ],
                                            [
                                                4029.29,
                                                12277.7
                                            ],
                                            [
                                                4215.67,
                                                12276.9
                                            ],
                                            [
                                                4333.25,
                                                12503.2
                                            ],
                                            [
                                                4331.96,
                                                12936.6
                                            ],
                                            [
                                                4286.28,
                                                13434.9
                                            ],
                                            [
                                                4311.93,
                                                13862.8
                                            ],
                                            [
                                                4303.2,
                                                14825.5
                                            ],
                                            [
                                                3584.1,
                                                14820.1
                                            ],
                                            [
                                                3609.97,
                                                13948.6
                                            ],
                                            [
                                                3536.56,
                                                12585.5
                                            ]
                                        ],
                                        "id": 1275,
                                        "chat_link": "[&BPsEAAA=]"
                                    }
                                },
                                "adventures": [],
                                "id": 1062,
                                "mastery_points": []
                            },
                            "1066": {
                                "name": "Claiming the Gilded Hollow",
                                "min_level": 80,
                                "max_level": 80,
                                "default_floor": 47,
                                "label_coord": [
                                    3208,
                                    16688
                                ],
                                "map_rect": [
                                    [
                                        -15360,
                                        -15360
                                    ],
                                    [
                                        15360,
                                        15360
                                    ]
                                ],
                                "continent_rect": [
                                    [
                                        2560,
                                        16128
                                    ],
                                    [
                                        3840,
                                        17408
                                    ]
                                ],
                                "points_of_interest": {},
                                "tasks": {},
                                "skill_challenges": [],
                                "sectors": {
                                    "1299": {
                                        "level": 0,
                                        "coord": [
                                            3169,
                                            16956.6
                                        ],
                                        "bounds": [
                                            [
                                                2627.77,
                                                17416.1
                                            ],
                                            [
                                                2939.92,
                                                17505.2
                                            ],
                                            [
                                                3718.99,
                                                17395
                                            ],
                                            [
                                                3829.29,
                                                16865.6
                                            ],
                                            [
                                                3928.1,
                                                16069.7
                                            ],
                                            [
                                                2564.46,
                                                16136.8
                                            ],
                                            [
                                                2574.5,
                                                17307.8
                                            ],
                                            [
                                                2627.77,
                                                17416.1
                                            ]
                                        ],
                                        "id": 1299,
                                        "chat_link": "[&BBMFAAA=]"
                                    }
                                },
                                "adventures": [],
                                "id": 1066,
                                "mastery_points": []
                            },
                            "1068": {
                                "name": "Gilded Hollow",
                                "min_level": 80,
                                "max_level": 80,
                                "default_floor": 0,
                                "label_coord": [
                                    3208,
                                    16688
                                ],
                                "map_rect": [
                                    [
                                        -15360,
                                        -15360
                                    ],
                                    [
                                        15360,
                                        15360
                                    ]
                                ],
                                "continent_rect": [
                                    [
                                        2560,
                                        16128
                                    ],
                                    [
                                        3840,
                                        17408
                                    ]
                                ],
                                "points_of_interest": {
                                    "2162": {
                                        "name": "Cavern Mine Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            3524.79,
                                            17070.9
                                        ],
                                        "id": 2162,
                                        "chat_link": "[&BHIIAAA=]"
                                    },
                                    "2260": {
                                        "name": "Arena Tower Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            2958.94,
                                            16901.9
                                        ],
                                        "id": 2260,
                                        "chat_link": "[&BNQIAAA=]"
                                    },
                                    "2273": {
                                        "name": "Waterfall Plaza Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            3142.53,
                                            16321.9
                                        ],
                                        "id": 2273,
                                        "chat_link": "[&BOEIAAA=]"
                                    },
                                    "2303": {
                                        "name": "Central Hollow Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            3205.2,
                                            16826.5
                                        ],
                                        "id": 2303,
                                        "chat_link": "[&BP8IAAA=]"
                                    },
                                    "2305": {
                                        "name": "Surface Tunnel Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            2624.78,
                                            17278
                                        ],
                                        "id": 2305,
                                        "chat_link": "[&BAEJAAA=]"
                                    }
                                },
                                "tasks": {},
                                "skill_challenges": [],
                                "sectors": {
                                    "1299": {
                                        "level": 0,
                                        "coord": [
                                            3169,
                                            16956.6
                                        ],
                                        "bounds": [
                                            [
                                                2627.77,
                                                17416.1
                                            ],
                                            [
                                                2939.92,
                                                17505.2
                                            ],
                                            [
                                                3718.99,
                                                17395
                                            ],
                                            [
                                                3829.29,
                                                16865.6
                                            ],
                                            [
                                                3928.1,
                                                16069.7
                                            ],
                                            [
                                                2564.46,
                                                16136.8
                                            ],
                                            [
                                                2574.5,
                                                17307.8
                                            ],
                                            [
                                                2627.77,
                                                17416.1
                                            ]
                                        ],
                                        "id": 1299,
                                        "chat_link": "[&BBMFAAA=]"
                                    }
                                },
                                "adventures": [],
                                "id": 1068,
                                "mastery_points": []
                            },
                            "1101": {
                                "name": "Gilded Hollow",
                                "min_level": 80,
                                "max_level": 80,
                                "default_floor": 0,
                                "label_coord": [
                                    3208,
                                    16688
                                ],
                                "map_rect": [
                                    [
                                        -15360,
                                        -15360
                                    ],
                                    [
                                        15360,
                                        15360
                                    ]
                                ],
                                "continent_rect": [
                                    [
                                        2560,
                                        16128
                                    ],
                                    [
                                        3840,
                                        17408
                                    ]
                                ],
                                "points_of_interest": {
                                    "2162": {
                                        "name": "Cavern Mine Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            3524.79,
                                            17070.9
                                        ],
                                        "id": 2162,
                                        "chat_link": "[&BHIIAAA=]"
                                    },
                                    "2260": {
                                        "name": "Arena Tower Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            2958.94,
                                            16901.9
                                        ],
                                        "id": 2260,
                                        "chat_link": "[&BNQIAAA=]"
                                    },
                                    "2273": {
                                        "name": "Waterfall Plaza Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            3142.53,
                                            16321.9
                                        ],
                                        "id": 2273,
                                        "chat_link": "[&BOEIAAA=]"
                                    },
                                    "2303": {
                                        "name": "Central Hollow Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            3205.2,
                                            16826.5
                                        ],
                                        "id": 2303,
                                        "chat_link": "[&BP8IAAA=]"
                                    },
                                    "2305": {
                                        "name": "Surface Tunnel Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            2624.78,
                                            17278
                                        ],
                                        "id": 2305,
                                        "chat_link": "[&BAEJAAA=]"
                                    }
                                },
                                "tasks": {},
                                "skill_challenges": [],
                                "sectors": {
                                    "1299": {
                                        "level": 0,
                                        "coord": [
                                            3169,
                                            16956.6
                                        ],
                                        "bounds": [
                                            [
                                                2627.77,
                                                17416.1
                                            ],
                                            [
                                                2939.92,
                                                17505.2
                                            ],
                                            [
                                                3718.99,
                                                17395
                                            ],
                                            [
                                                3829.29,
                                                16865.6
                                            ],
                                            [
                                                3928.1,
                                                16069.7
                                            ],
                                            [
                                                2564.46,
                                                16136.8
                                            ],
                                            [
                                                2574.5,
                                                17307.8
                                            ],
                                            [
                                                2627.77,
                                                17416.1
                                            ]
                                        ],
                                        "id": 1299,
                                        "chat_link": "[&BBMFAAA=]"
                                    }
                                },
                                "id": 1101,
                                "mastery_points": [],
                                "adventures": []
                            },
                            "1110": {
                                "name": "Scrap Rifle Field Test",
                                "min_level": 80,
                                "max_level": 80,
                                "default_floor": 0,
                                "label_coord": [
                                    4236,
                                    18364
                                ],
                                "map_rect": [
                                    [
                                        -39936,
                                        -27648
                                    ],
                                    [
                                        39936,
                                        27648
                                    ]
                                ],
                                "continent_rect": [
                                    [
                                        2560,
                                        17408
                                    ],
                                    [
                                        5888,
                                        19712
                                    ]
                                ],
                                "points_of_interest": {},
                                "tasks": {},
                                "skill_challenges": [],
                                "sectors": {
                                    "1237": {
                                        "name": "SCAR Lane",
                                        "level": 80,
                                        "coord": [
                                            5135.97,
                                            18887.2
                                        ],
                                        "bounds": [
                                            [
                                                4837.34,
                                                18931.5
                                            ],
                                            [
                                                4867.6,
                                                18823.6
                                            ],
                                            [
                                                5000.33,
                                                18832.5
                                            ],
                                            [
                                                5459.82,
                                                18600.9
                                            ],
                                            [
                                                5634.75,
                                                18711
                                            ],
                                            [
                                                5613.54,
                                                18878.4
                                            ],
                                            [
                                                5495.59,
                                                18964.3
                                            ],
                                            [
                                                4900.64,
                                                19107.3
                                            ],
                                            [
                                                4782.41,
                                                19044.9
                                            ],
                                            [
                                                4767.7,
                                                18978.2
                                            ],
                                            [
                                                4837.34,
                                                18931.5
                                            ]
                                        ],
                                        "id": 1237,
                                        "chat_link": "[&BNUEAAA=]"
                                    }
                                },
                                "adventures": [],
                                "id": 1110,
                                "mastery_points": []
                            }
                        },
                        "id": 10
                    },
                    "12": {
                        "name": "Crystal Desert",
                        "label_coord": [
                            22350,
                            46000
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
                            "1263": {
                                "name": "Domain of Istan",
                                "min_level": 80,
                                "max_level": 80,
                                "default_floor": 1,
                                "label_coord": [
                                    24400,
                                    45500
                                ],
                                "map_rect": [
                                    [
                                        -46080,
                                        -46080
                                    ],
                                    [
                                        46080,
                                        46080
                                    ]
                                ],
                                "continent_rect": [
                                    [
                                        22550,
                                        43532
                                    ],
                                    [
                                        26390,
                                        47372
                                    ]
                                ],
                                "points_of_interest": {
                                    "2805": {
                                        "name": "Freetrader Haven",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            23888.7,
                                            44095.4
                                        ],
                                        "id": 2805,
                                        "chat_link": "[&BPUKAAA=]"
                                    },
                                    "2806": {
                                        "name": "The Dark Leviathan",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            24047.3,
                                            43993.6
                                        ],
                                        "id": 2806,
                                        "chat_link": "[&BPYKAAA=]"
                                    },
                                    "2807": {
                                        "name": "Temple of Joko",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            24988.5,
                                            45578.9
                                        ],
                                        "id": 2807,
                                        "chat_link": "[&BPcKAAA=]"
                                    },
                                    "2808": {
                                        "name": "Mirror of the Sun",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            23005.8,
                                            44941.7
                                        ],
                                        "id": 2808,
                                        "chat_link": "[&BPgKAAA=]"
                                    },
                                    "2809": {
                                        "name": "Ancient Royal Docks",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            24549.2,
                                            46087.4
                                        ],
                                        "id": 2809,
                                        "chat_link": "[&BPkKAAA=]"
                                    },
                                    "2810": {
                                        "name": "Astralarium Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            23062.2,
                                            44454.7
                                        ],
                                        "id": 2810,
                                        "chat_link": "[&BPoKAAA=]"
                                    },
                                    "2811": {
                                        "name": "Mirror of the Earth",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            22867.6,
                                            44676.1
                                        ],
                                        "id": 2811,
                                        "chat_link": "[&BPsKAAA=]"
                                    },
                                    "2812": {
                                        "name": "The Sun Docks",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            25653.2,
                                            45575.3
                                        ],
                                        "id": 2812,
                                        "chat_link": "[&BPwKAAA=]"
                                    },
                                    "2814": {
                                        "name": "Broken Observation Tower",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            23123.3,
                                            44035
                                        ],
                                        "id": 2814,
                                        "chat_link": "[&BP4KAAA=]"
                                    },
                                    "2815": {
                                        "name": "Stage of Sacrifice",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            25126.9,
                                            45805.5
                                        ],
                                        "id": 2815,
                                        "chat_link": "[&BP8KAAA=]"
                                    },
                                    "2816": {
                                        "name": "Skylight Vault",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            24659.3,
                                            44547
                                        ],
                                        "id": 2816,
                                        "chat_link": "[&BAALAAA=]"
                                    },
                                    "2817": {
                                        "name": "Crucible of the Apostate",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            25500.6,
                                            45067.1
                                        ],
                                        "id": 2817,
                                        "chat_link": "[&BAELAAA=]"
                                    },
                                    "2818": {
                                        "name": "Zehlon Waterworks",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            23143.9,
                                            45529.9
                                        ],
                                        "id": 2818,
                                        "chat_link": "[&BAILAAA=]"
                                    },
                                    "2819": {
                                        "name": "Grotto of the Defeated",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            23400.9,
                                            46463.9
                                        ],
                                        "id": 2819,
                                        "chat_link": "[&BAMLAAA=]"
                                    },
                                    "2821": {
                                        "name": "Clanmarshal's Promenade",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            25137.7,
                                            45390.3
                                        ],
                                        "id": 2821,
                                        "chat_link": "[&BAULAAA=]"
                                    },
                                    "2822": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            23416.3,
                                            45715.6
                                        ],
                                        "id": 2822,
                                        "chat_link": "[&BAYLAAA=]"
                                    },
                                    "2823": {
                                        "name": "Plaza of Resurgence",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            24258.3,
                                            45069.7
                                        ],
                                        "id": 2823,
                                        "chat_link": "[&BAcLAAA=]"
                                    },
                                    "2824": {
                                        "name": "Jakumba's Legacy",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            23180.2,
                                            45194.3
                                        ],
                                        "id": 2824,
                                        "chat_link": "[&BAgLAAA=]"
                                    },
                                    "2825": {
                                        "name": "Chalon Docks Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            25024.9,
                                            44644.3
                                        ],
                                        "id": 2825,
                                        "chat_link": "[&BAkLAAA=]"
                                    },
                                    "2827": {
                                        "name": "The Wobbling Skies",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            23821.3,
                                            44329.3
                                        ],
                                        "id": 2827,
                                        "chat_link": "[&BAsLAAA=]"
                                    },
                                    "2828": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            25026.2,
                                            46330.1
                                        ],
                                        "id": 2828,
                                        "chat_link": "[&BAwLAAA=]"
                                    },
                                    "2830": {
                                        "name": "Palawadan Dormitories",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            25325.4,
                                            45803.9
                                        ],
                                        "id": 2830,
                                        "chat_link": "[&BA4LAAA=]"
                                    },
                                    "2831": {
                                        "name": "Mirror of the Moon",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            23525.6,
                                            44341.3
                                        ],
                                        "id": 2831,
                                        "chat_link": "[&BA8LAAA=]"
                                    },
                                    "2832": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            25015.1,
                                            45579.8
                                        ],
                                        "id": 2832,
                                        "chat_link": "[&BBALAAA=]"
                                    },
                                    "2833": {
                                        "name": "The Skimming Stone",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            24187.8,
                                            44293.4
                                        ],
                                        "id": 2833,
                                        "chat_link": "[&BBELAAA=]"
                                    },
                                    "2835": {
                                        "name": "Mirror of the Stars",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            23179.8,
                                            44815.7
                                        ],
                                        "id": 2835,
                                        "chat_link": "[&BBMLAAA=]"
                                    },
                                    "2837": {
                                        "name": "Mehtani's Blade",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            24101.8,
                                            46562.1
                                        ],
                                        "id": 2837,
                                        "chat_link": "[&BBULAAA=]"
                                    },
                                    "2838": {
                                        "name": "Chahbek Thrust",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            25076.4,
                                            46204.7
                                        ],
                                        "id": 2838,
                                        "chat_link": "[&BBYLAAA=]"
                                    },
                                    "2839": {
                                        "name": "Lahdok Craterlands",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            23856.7,
                                            45005.5
                                        ],
                                        "id": 2839,
                                        "chat_link": "[&BBcLAAA=]"
                                    },
                                    "2840": {
                                        "name": "Hall of Judgment",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            25329.2,
                                            45580.4
                                        ],
                                        "id": 2840,
                                        "chat_link": "[&BBgLAAA=]"
                                    },
                                    "2841": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            23833.1,
                                            44031.2
                                        ],
                                        "id": 2841,
                                        "chat_link": "[&BBkLAAA=]"
                                    },
                                    "2842": {
                                        "name": "Champion's Dawn Waypoint",
                                        "type": "waypoint",
                                        "floor": 1,
                                        "coord": [
                                            23497.3,
                                            45658.9
                                        ],
                                        "id": 2842,
                                        "chat_link": "[&BBoLAAA=]"
                                    },
                                    "2843": {
                                        "name": "Field of the Hopeful",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            23788.1,
                                            46198.7
                                        ],
                                        "id": 2843,
                                        "chat_link": "[&BBsLAAA=]"
                                    },
                                    "2844": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            23125.6,
                                            44411.1
                                        ],
                                        "id": 2844,
                                        "chat_link": "[&BBwLAAA=]"
                                    },
                                    "2845": {
                                        "type": "vista",
                                        "floor": 1,
                                        "coord": [
                                            25311.4,
                                            45213
                                        ],
                                        "id": 2845,
                                        "chat_link": "[&BB0LAAA=]"
                                    },
                                    "2846": {
                                        "name": "Warden's Quarters",
                                        "type": "landmark",
                                        "floor": 1,
                                        "coord": [
                                            24257.9,
                                            44901.5
                                        ],
                                        "id": 2846,
                                        "chat_link": "[&BB4LAAA=]"
                                    }
                                },
                                "tasks": {
                                    "420": {
                                        "objective": "Help the cause of dissenting Astralarium scholars.",
                                        "level": 80,
                                        "coord": [
                                            22914,
                                            44203.4
                                        ],
                                        "bounds": [
                                            [
                                                23121.5,
                                                44414.8
                                            ],
                                            [
                                                24779.7,
                                                45452
                                            ],
                                            [
                                                23121.5,
                                                44414.8
                                            ]
                                        ],
                                        "id": 420,
                                        "chat_link": "[&BKQBAAA=]"
                                    },
                                    "421": {
                                        "objective": "Aid the oppressed of Champion's Dawn on behalf of the Sunspears.",
                                        "level": 80,
                                        "coord": [
                                            23472,
                                            46199.3
                                        ],
                                        "bounds": [
                                            [
                                                22879,
                                                45973.3
                                            ],
                                            [
                                                23560.1,
                                                45501.2
                                            ],
                                            [
                                                23565.2,
                                                45588.5
                                            ],
                                            [
                                                23781.7,
                                                45704.1
                                            ],
                                            [
                                                23869.5,
                                                45851.8
                                            ],
                                            [
                                                23876.4,
                                                45945
                                            ],
                                            [
                                                23941,
                                                45974.5
                                            ],
                                            [
                                                24013.3,
                                                46232.5
                                            ],
                                            [
                                                23871.5,
                                                46418.9
                                            ],
                                            [
                                                23731.5,
                                                46355.8
                                            ],
                                            [
                                                23649.6,
                                                46404.3
                                            ],
                                            [
                                                23655.4,
                                                46543.6
                                            ],
                                            [
                                                23577.4,
                                                46759.8
                                            ],
                                            [
                                                23346.3,
                                                46453.7
                                            ],
                                            [
                                                23083.2,
                                                46204.1
                                            ],
                                            [
                                                22879,
                                                45973.3
                                            ]
                                        ],
                                        "id": 421,
                                        "chat_link": "[&BKUBAAA=]"
                                    },
                                    "422": {
                                        "objective": "Maintain peace and order in the corsair flotilla.",
                                        "level": 80,
                                        "coord": [
                                            23881,
                                            44125.7
                                        ],
                                        "bounds": [
                                            [
                                                23984.4,
                                                44471.9
                                            ],
                                            [
                                                23801.5,
                                                44453.4
                                            ],
                                            [
                                                23696.8,
                                                44173
                                            ],
                                            [
                                                23765.1,
                                                43987.5
                                            ],
                                            [
                                                23910.7,
                                                43874.8
                                            ],
                                            [
                                                24020.9,
                                                43840.7
                                            ],
                                            [
                                                24141.9,
                                                43857.8
                                            ],
                                            [
                                                24273.7,
                                                43929.5
                                            ],
                                            [
                                                24288.7,
                                                44030.7
                                            ],
                                            [
                                                24316.2,
                                                44154.8
                                            ],
                                            [
                                                24321.8,
                                                44332
                                            ],
                                            [
                                                24238.6,
                                                44437.1
                                            ],
                                            [
                                                23984.4,
                                                44471.9
                                            ]
                                        ],
                                        "id": 422,
                                        "chat_link": "[&BKYBAAA=]"
                                    }
                                },
                                "skill_challenges": [],
                                "sectors": {
                                    "1598": {
                                        "name": "Churrhir Cliffs",
                                        "level": 80,
                                        "coord": [
                                            24438.2,
                                            45912.3
                                        ],
                                        "bounds": [
                                            [
                                                23681.5,
                                                45595
                                            ],
                                            [
                                                23837.9,
                                                45631.8
                                            ],
                                            [
                                                23972.8,
                                                45575
                                            ],
                                            [
                                                24047,
                                                45697.9
                                            ],
                                            [
                                                24020.2,
                                                45759.1
                                            ],
                                            [
                                                24039.5,
                                                45898
                                            ],
                                            [
                                                24129,
                                                45990.4
                                            ],
                                            [
                                                24471.4,
                                                46053.5
                                            ],
                                            [
                                                24423.7,
                                                46453.5
                                            ],
                                            [
                                                24525,
                                                46537.8
                                            ],
                                            [
                                                25280.3,
                                                46856
                                            ],
                                            [
                                                25536.3,
                                                46807.9
                                            ],
                                            [
                                                25528,
                                                45999.3
                                            ],
                                            [
                                                24865.5,
                                                45955.1
                                            ],
                                            [
                                                24666.5,
                                                45829.9
                                            ],
                                            [
                                                24563.8,
                                                45683.6
                                            ],
                                            [
                                                24575.5,
                                                45326
                                            ],
                                            [
                                                24389.5,
                                                45323
                                            ],
                                            [
                                                23772.2,
                                                45361.5
                                            ],
                                            [
                                                23681.5,
                                                45595
                                            ]
                                        ],
                                        "id": 1598,
                                        "chat_link": "[&BD4GAAA=]"
                                    },
                                    "1602": {
                                        "name": "Zehlon Breach",
                                        "level": 80,
                                        "coord": [
                                            23219.2,
                                            45408.9
                                        ],
                                        "bounds": [
                                            [
                                                22791.2,
                                                45196.8
                                            ],
                                            [
                                                23357,
                                                45054.6
                                            ],
                                            [
                                                23455.7,
                                                45181.3
                                            ],
                                            [
                                                23578.8,
                                                45297.7
                                            ],
                                            [
                                                23605.6,
                                                45380.4
                                            ],
                                            [
                                                23560.1,
                                                45501.2
                                            ],
                                            [
                                                22879,
                                                45973.3
                                            ],
                                            [
                                                22853.1,
                                                45686.1
                                            ],
                                            [
                                                22892.3,
                                                45408.6
                                            ],
                                            [
                                                22791.2,
                                                45196.8
                                            ]
                                        ],
                                        "id": 1602,
                                        "chat_link": "[&BEIGAAA=]"
                                    },
                                    "1604": {
                                        "name": "The Astralarium",
                                        "level": 80,
                                        "coord": [
                                            23247.7,
                                            44446.4
                                        ],
                                        "bounds": [
                                            [
                                                22876.3,
                                                43949.6
                                            ],
                                            [
                                                23083.9,
                                                43863.9
                                            ],
                                            [
                                                23220.3,
                                                43971.5
                                            ],
                                            [
                                                23325.6,
                                                44006.9
                                            ],
                                            [
                                                23431,
                                                44094.3
                                            ],
                                            [
                                                23368.3,
                                                44138.5
                                            ],
                                            [
                                                23567.5,
                                                44227.8
                                            ],
                                            [
                                                23694.1,
                                                44206.6
                                            ],
                                            [
                                                23673.4,
                                                44386.5
                                            ],
                                            [
                                                23493.3,
                                                44449.7
                                            ],
                                            [
                                                23489.2,
                                                44548.5
                                            ],
                                            [
                                                23600.9,
                                                44621.3
                                            ],
                                            [
                                                23379,
                                                44698
                                            ],
                                            [
                                                23330.8,
                                                44934.8
                                            ],
                                            [
                                                23357,
                                                45054.6
                                            ],
                                            [
                                                22791.2,
                                                45196.8
                                            ],
                                            [
                                                22710.5,
                                                45000.1
                                            ],
                                            [
                                                22630.8,
                                                44720.6
                                            ],
                                            [
                                                22682.7,
                                                44410.8
                                            ],
                                            [
                                                22876.3,
                                                43949.6
                                            ]
                                        ],
                                        "id": 1604,
                                        "chat_link": "[&BEQGAAA=]"
                                    },
                                    "1605": {
                                        "name": "Corsair Flotilla",
                                        "level": 80,
                                        "coord": [
                                            23683.7,
                                            44185.7
                                        ],
                                        "bounds": [
                                            [
                                                22993.3,
                                                43768.1
                                            ],
                                            [
                                                22974.6,
                                                43911.2
                                            ],
                                            [
                                                23083.9,
                                                43863.9
                                            ],
                                            [
                                                23220.3,
                                                43971.5
                                            ],
                                            [
                                                23325.6,
                                                44006.9
                                            ],
                                            [
                                                23431,
                                                44094.3
                                            ],
                                            [
                                                23368.3,
                                                44138.5
                                            ],
                                            [
                                                23567.5,
                                                44227.8
                                            ],
                                            [
                                                23694.1,
                                                44206.6
                                            ],
                                            [
                                                23673.4,
                                                44386.5
                                            ],
                                            [
                                                23493.3,
                                                44449.7
                                            ],
                                            [
                                                23489.2,
                                                44548.5
                                            ],
                                            [
                                                23600.9,
                                                44621.3
                                            ],
                                            [
                                                23892.1,
                                                44559.5
                                            ],
                                            [
                                                24106.6,
                                                44491
                                            ],
                                            [
                                                24258.2,
                                                44468.4
                                            ],
                                            [
                                                24360.8,
                                                44389.4
                                            ],
                                            [
                                                24586.3,
                                                44212.3
                                            ],
                                            [
                                                24587.8,
                                                43728.5
                                            ],
                                            [
                                                23966.4,
                                                43670.7
                                            ],
                                            [
                                                22993.3,
                                                43768.1
                                            ]
                                        ],
                                        "id": 1605,
                                        "chat_link": "[&BEUGAAA=]"
                                    },
                                    "1606": {
                                        "name": "Chalon Docks",
                                        "level": 80,
                                        "coord": [
                                            25101.2,
                                            44678.8
                                        ],
                                        "bounds": [
                                            [
                                                24917.2,
                                                44302.3
                                            ],
                                            [
                                                25288.3,
                                                44453.8
                                            ],
                                            [
                                                25414,
                                                44740.2
                                            ],
                                            [
                                                25259.8,
                                                44959.6
                                            ],
                                            [
                                                25053.5,
                                                44998.6
                                            ],
                                            [
                                                24927.1,
                                                44847.3
                                            ],
                                            [
                                                24951.5,
                                                44667.9
                                            ],
                                            [
                                                24998.2,
                                                44460.4
                                            ],
                                            [
                                                24917.2,
                                                44302.3
                                            ]
                                        ],
                                        "id": 1606,
                                        "chat_link": "[&BEYGAAA=]"
                                    },
                                    "1609": {
                                        "name": "Mordant Crescent<br>Great Hall",
                                        "level": 80,
                                        "coord": [
                                            24273.2,
                                            44948.1
                                        ],
                                        "bounds": [
                                            [
                                                24078.8,
                                                45072.3
                                            ],
                                            [
                                                24073.3,
                                                44819.3
                                            ],
                                            [
                                                24148.6,
                                                44729.9
                                            ],
                                            [
                                                24391.5,
                                                44728.9
                                            ],
                                            [
                                                24474.1,
                                                44822.1
                                            ],
                                            [
                                                24469.5,
                                                45059.3
                                            ],
                                            [
                                                24379.9,
                                                45179
                                            ],
                                            [
                                                24170.1,
                                                45174
                                            ],
                                            [
                                                24078.8,
                                                45072.3
                                            ]
                                        ],
                                        "id": 1609,
                                        "chat_link": "[&BEkGAAA=]"
                                    },
                                    "1610": {
                                        "name": "Heretic's Arena",
                                        "level": 80,
                                        "coord": [
                                            25472.1,
                                            45026.8
                                        ],
                                        "bounds": [
                                            [
                                                25695.4,
                                                44825.9
                                            ],
                                            [
                                                25811,
                                                45010.8
                                            ],
                                            [
                                                25793.2,
                                                45273.4
                                            ],
                                            [
                                                25497.9,
                                                45242.8
                                            ],
                                            [
                                                25252.1,
                                                45163.3
                                            ],
                                            [
                                                25053.5,
                                                44998.6
                                            ],
                                            [
                                                25259.8,
                                                44959.6
                                            ],
                                            [
                                                25414,
                                                44740.2
                                            ],
                                            [
                                                25695.4,
                                                44825.9
                                            ]
                                        ],
                                        "id": 1610,
                                        "chat_link": "[&BEoGAAA=]"
                                    },
                                    "1614": {
                                        "name": "Champion's Dawn",
                                        "level": 80,
                                        "coord": [
                                            23626.7,
                                            46127.4
                                        ],
                                        "bounds": [
                                            [
                                                22879,
                                                45973.3
                                            ],
                                            [
                                                23560.1,
                                                45501.2
                                            ],
                                            [
                                                23565.2,
                                                45588.5
                                            ],
                                            [
                                                23781.7,
                                                45704.1
                                            ],
                                            [
                                                23869.5,
                                                45851.8
                                            ],
                                            [
                                                23876.4,
                                                45945
                                            ],
                                            [
                                                23941,
                                                45974.5
                                            ],
                                            [
                                                24013.3,
                                                46232.5
                                            ],
                                            [
                                                23871.5,
                                                46418.9
                                            ],
                                            [
                                                23731.5,
                                                46355.8
                                            ],
                                            [
                                                23649.6,
                                                46404.3
                                            ],
                                            [
                                                23655.4,
                                                46543.6
                                            ],
                                            [
                                                23577.4,
                                                46759.8
                                            ],
                                            [
                                                23346.3,
                                                46453.7
                                            ],
                                            [
                                                23083.2,
                                                46204.1
                                            ],
                                            [
                                                22879,
                                                45973.3
                                            ]
                                        ],
                                        "id": 1614,
                                        "chat_link": "[&BE4GAAA=]"
                                    },
                                    "1615": {
                                        "name": "Modri Caverns",
                                        "level": 80,
                                        "coord": [
                                            24694.9,
                                            44448.7
                                        ],
                                        "bounds": [
                                            [
                                                24258.2,
                                                44468.4
                                            ],
                                            [
                                                24586.3,
                                                44212.3
                                            ],
                                            [
                                                24856.9,
                                                44256.3
                                            ],
                                            [
                                                24917.2,
                                                44302.3
                                            ],
                                            [
                                                24998.2,
                                                44460.4
                                            ],
                                            [
                                                24951.5,
                                                44667.9
                                            ],
                                            [
                                                24711,
                                                44641.2
                                            ],
                                            [
                                                24563,
                                                44586.8
                                            ],
                                            [
                                                24411.6,
                                                44442.8
                                            ],
                                            [
                                                24258.2,
                                                44468.4
                                            ]
                                        ],
                                        "id": 1615,
                                        "chat_link": "[&BE8GAAA=]"
                                    },
                                    "1616": {
                                        "name": "Palawadan, Jewel of Istan",
                                        "level": 80,
                                        "coord": [
                                            25057.9,
                                            45467.8
                                        ],
                                        "bounds": [
                                            [
                                                25793.2,
                                                45273.4
                                            ],
                                            [
                                                25850.7,
                                                45587.4
                                            ],
                                            [
                                                25765.6,
                                                45904
                                            ],
                                            [
                                                25528,
                                                45999.3
                                            ],
                                            [
                                                24865.5,
                                                45955.1
                                            ],
                                            [
                                                24666.5,
                                                45829.9
                                            ],
                                            [
                                                24563.8,
                                                45683.6
                                            ],
                                            [
                                                24575.5,
                                                45326
                                            ],
                                            [
                                                24389.5,
                                                45323
                                            ],
                                            [
                                                24385.7,
                                                45255.2
                                            ],
                                            [
                                                24689.2,
                                                45005.4
                                            ],
                                            [
                                                24871.5,
                                                45239.9
                                            ],
                                            [
                                                25174.3,
                                                45229.5
                                            ],
                                            [
                                                25252.1,
                                                45163.3
                                            ],
                                            [
                                                25497.9,
                                                45242.8
                                            ],
                                            [
                                                25793.2,
                                                45273.4
                                            ]
                                        ],
                                        "id": 1616,
                                        "chat_link": "[&BFAGAAA=]"
                                    },
                                    "1618": {
                                        "name": "Issnur Bay",
                                        "level": 80,
                                        "coord": [
                                            23985.7,
                                            46090.1
                                        ],
                                        "bounds": [
                                            [
                                                25280.3,
                                                46856
                                            ],
                                            [
                                                24525,
                                                46537.8
                                            ],
                                            [
                                                24423.7,
                                                46453.5
                                            ],
                                            [
                                                24471.4,
                                                46053.5
                                            ],
                                            [
                                                24129,
                                                45990.4
                                            ],
                                            [
                                                24039.5,
                                                45898
                                            ],
                                            [
                                                24020.2,
                                                45759.1
                                            ],
                                            [
                                                24047,
                                                45697.9
                                            ],
                                            [
                                                23972.8,
                                                45575
                                            ],
                                            [
                                                23837.9,
                                                45631.8
                                            ],
                                            [
                                                23681.5,
                                                45595
                                            ],
                                            [
                                                23560.1,
                                                45501.2
                                            ],
                                            [
                                                23565.2,
                                                45588.5
                                            ],
                                            [
                                                23781.7,
                                                45704.1
                                            ],
                                            [
                                                23869.5,
                                                45851.8
                                            ],
                                            [
                                                23876.4,
                                                45945
                                            ],
                                            [
                                                23941,
                                                45974.5
                                            ],
                                            [
                                                24013.3,
                                                46232.5
                                            ],
                                            [
                                                23871.5,
                                                46418.9
                                            ],
                                            [
                                                23731.5,
                                                46355.8
                                            ],
                                            [
                                                23649.6,
                                                46404.3
                                            ],
                                            [
                                                23655.4,
                                                46543.6
                                            ],
                                            [
                                                23577.4,
                                                46759.8
                                            ],
                                            [
                                                24134.8,
                                                46834.3
                                            ],
                                            [
                                                25280.3,
                                                46856
                                            ]
                                        ],
                                        "id": 1618,
                                        "chat_link": "[&BFIGAAA=]"
                                    },
                                    "1619": {
                                        "name": "Sea of Istan",
                                        "level": 80,
                                        "coord": [
                                            25483.8,
                                            44924.5
                                        ],
                                        "bounds": [
                                            [
                                                25499.3,
                                                44349
                                            ],
                                            [
                                                25599.4,
                                                44441.2
                                            ],
                                            [
                                                25880.8,
                                                44611.5
                                            ],
                                            [
                                                26042.9,
                                                44869.4
                                            ],
                                            [
                                                26022.1,
                                                45599.8
                                            ],
                                            [
                                                25836.6,
                                                46258.5
                                            ],
                                            [
                                                25536.3,
                                                46807.9
                                            ],
                                            [
                                                25528,
                                                45999.3
                                            ],
                                            [
                                                25765.6,
                                                45904
                                            ],
                                            [
                                                25850.7,
                                                45587.4
                                            ],
                                            [
                                                25793.2,
                                                45273.4
                                            ],
                                            [
                                                25811,
                                                45010.8
                                            ],
                                            [
                                                25695.4,
                                                44825.9
                                            ],
                                            [
                                                25414,
                                                44740.2
                                            ],
                                            [
                                                25288.3,
                                                44453.8
                                            ],
                                            [
                                                24917.2,
                                                44302.3
                                            ],
                                            [
                                                24856.9,
                                                44256.3
                                            ],
                                            [
                                                24586.3,
                                                44212.3
                                            ],
                                            [
                                                24587.8,
                                                43728.5
                                            ],
                                            [
                                                25258,
                                                44026.8
                                            ],
                                            [
                                                25389.4,
                                                44157.1
                                            ],
                                            [
                                                25499.3,
                                                44349
                                            ]
                                        ],
                                        "id": 1619,
                                        "chat_link": "[&BFMGAAA=]"
                                    },
                                    "1623": {
                                        "name": "Plains of Jarin",
                                        "level": 80,
                                        "coord": [
                                            24237.3,
                                            44970.4
                                        ],
                                        "bounds": [
                                            [
                                                23600.9,
                                                44621.3
                                            ],
                                            [
                                                23379,
                                                44698
                                            ],
                                            [
                                                23330.8,
                                                44934.8
                                            ],
                                            [
                                                23357,
                                                45054.6
                                            ],
                                            [
                                                23455.7,
                                                45181.3
                                            ],
                                            [
                                                23578.8,
                                                45297.7
                                            ],
                                            [
                                                23605.6,
                                                45380.4
                                            ],
                                            [
                                                23560.1,
                                                45501.2
                                            ],
                                            [
                                                23681.5,
                                                45595
                                            ],
                                            [
                                                23772.2,
                                                45361.5
                                            ],
                                            [
                                                24389.5,
                                                45323
                                            ],
                                            [
                                                24385.7,
                                                45255.2
                                            ],
                                            [
                                                24689.9,
                                                45007.3
                                            ],
                                            [
                                                24473.5,
                                                44822.4
                                            ],
                                            [
                                                24469.5,
                                                45059.3
                                            ],
                                            [
                                                24379.9,
                                                45179
                                            ],
                                            [
                                                24170.1,
                                                45174
                                            ],
                                            [
                                                24078.8,
                                                45072.3
                                            ],
                                            [
                                                24073.3,
                                                44819.3
                                            ],
                                            [
                                                24148.6,
                                                44729.9
                                            ],
                                            [
                                                24391.5,
                                                44728.9
                                            ],
                                            [
                                                24473.1,
                                                44822.8
                                            ],
                                            [
                                                24689,
                                                45007.7
                                            ],
                                            [
                                                24871.5,
                                                45239.9
                                            ],
                                            [
                                                25174.3,
                                                45229.5
                                            ],
                                            [
                                                25252.1,
                                                45163.3
                                            ],
                                            [
                                                25053.5,
                                                44998.6
                                            ],
                                            [
                                                24927.1,
                                                44847.3
                                            ],
                                            [
                                                24951.5,
                                                44667.9
                                            ],
                                            [
                                                24711,
                                                44641.2
                                            ],
                                            [
                                                24563,
                                                44586.8
                                            ],
                                            [
                                                24411.6,
                                                44442.8
                                            ],
                                            [
                                                24258.7,
                                                44468.2
                                            ],
                                            [
                                                24106.6,
                                                44491
                                            ],
                                            [
                                                23892.1,
                                                44559.5
                                            ],
                                            [
                                                23600.9,
                                                44621.3
                                            ]
                                        ],
                                        "id": 1623,
                                        "chat_link": "[&BFcGAAA=]"
                                    }
                                },
                                "adventures": [],
                                "id": 1263,
                                "mastery_points": [
                                    {
                                        "coord": [
                                            23422.1,
                                            45966.8
                                        ],
                                        "id": 421,
                                        "region": "Desert"
                                    },
                                    {
                                        "coord": [
                                            25169.3,
                                            45951.7
                                        ],
                                        "id": 419,
                                        "region": "Desert"
                                    },
                                    {
                                        "coord": [
                                            23827,
                                            44306
                                        ],
                                        "id": 425,
                                        "region": "Desert"
                                    }
                                ]
                            },
                            "1268": {
                                "name": "Fahranur, the First City",
                                "min_level": 80,
                                "max_level": 80,
                                "default_floor": 1,
                                "label_coord": [
                                    20200,
                                    45750
                                ],
                                "map_rect": [
                                    [
                                        -15360,
                                        -15360
                                    ],
                                    [
                                        15360,
                                        15360
                                    ]
                                ],
                                "continent_rect": [
                                    [
                                        19536,
                                        45104
                                    ],
                                    [
                                        20816,
                                        46384
                                    ]
                                ],
                                "points_of_interest": {},
                                "tasks": {},
                                "skill_challenges": [],
                                "sectors": {
                                    "1599": {
                                        "name": "Eternal Reservoir",
                                        "level": 80,
                                        "coord": [
                                            20407.1,
                                            45733.4
                                        ],
                                        "bounds": [
                                            [
                                                20201.4,
                                                45668.5
                                            ],
                                            [
                                                20196.3,
                                                45768
                                            ],
                                            [
                                                20227.6,
                                                45876.2
                                            ],
                                            [
                                                20283.8,
                                                45926.3
                                            ],
                                            [
                                                20427.7,
                                                45905
                                            ],
                                            [
                                                20456.1,
                                                45829.6
                                            ],
                                            [
                                                20457.5,
                                                45789.9
                                            ],
                                            [
                                                20466.9,
                                                45775.4
                                            ],
                                            [
                                                20489.8,
                                                45757
                                            ],
                                            [
                                                20506.7,
                                                45707.9
                                            ],
                                            [
                                                20501,
                                                45682.3
                                            ],
                                            [
                                                20503.3,
                                                45660.9
                                            ],
                                            [
                                                20524,
                                                45632.5
                                            ],
                                            [
                                                20502,
                                                45591.6
                                            ],
                                            [
                                                20462.8,
                                                45576.4
                                            ],
                                            [
                                                20306.3,
                                                45587.1
                                            ],
                                            [
                                                20201.4,
                                                45668.5
                                            ]
                                        ],
                                        "id": 1599,
                                        "chat_link": "[&BD8GAAA=]"
                                    },
                                    "1601": {
                                        "name": "Hall of Hadoon",
                                        "level": 80,
                                        "coord": [
                                            19910.9,
                                            46097.4
                                        ],
                                        "bounds": [
                                            [
                                                19959.9,
                                                46271
                                            ],
                                            [
                                                19916.7,
                                                46278.9
                                            ],
                                            [
                                                19916.2,
                                                46357.5
                                            ],
                                            [
                                                19796.4,
                                                46360.3
                                            ],
                                            [
                                                19795.2,
                                                46227.3
                                            ],
                                            [
                                                19701.1,
                                                46220.3
                                            ],
                                            [
                                                19701.9,
                                                46109.2
                                            ],
                                            [
                                                19588.9,
                                                46100.9
                                            ],
                                            [
                                                19589,
                                                45980
                                            ],
                                            [
                                                19854,
                                                45968.3
                                            ],
                                            [
                                                19961.4,
                                                45975.5
                                            ],
                                            [
                                                19988.5,
                                                45926.5
                                            ],
                                            [
                                                20133.8,
                                                45786.4
                                            ],
                                            [
                                                20227.8,
                                                45876.1
                                            ],
                                            [
                                                20132,
                                                45986.8
                                            ],
                                            [
                                                20071.4,
                                                45994.8
                                            ],
                                            [
                                                19964.9,
                                                46070.6
                                            ],
                                            [
                                                19945.8,
                                                46090.1
                                            ],
                                            [
                                                19897.4,
                                                46090.6
                                            ],
                                            [
                                                19896.9,
                                                46133.4
                                            ],
                                            [
                                                20000,
                                                46142.9
                                            ],
                                            [
                                                20000.2,
                                                46195.3
                                            ],
                                            [
                                                19959.9,
                                                46271
                                            ]
                                        ],
                                        "id": 1601,
                                        "chat_link": "[&BEEGAAA=]"
                                    },
                                    "1603": {
                                        "name": "Nadijeh's Assembly",
                                        "level": 80,
                                        "coord": [
                                            19706.8,
                                            45486.3
                                        ],
                                        "bounds": [
                                            [
                                                19674.5,
                                                45645.1
                                            ],
                                            [
                                                19601.4,
                                                45601.5
                                            ],
                                            [
                                                19588.2,
                                                45508.2
                                            ],
                                            [
                                                19603.5,
                                                45402.6
                                            ],
                                            [
                                                19749.9,
                                                45361.2
                                            ],
                                            [
                                                19820.2,
                                                45361.7
                                            ],
                                            [
                                                19816.4,
                                                45492
                                            ],
                                            [
                                                19800.2,
                                                45518.3
                                            ],
                                            [
                                                19674.5,
                                                45645.1
                                            ]
                                        ],
                                        "id": 1603,
                                        "chat_link": "[&BEMGAAA=]"
                                    },
                                    "1608": {
                                        "name": "Jokanur Passage",
                                        "level": 80,
                                        "coord": [
                                            20521.8,
                                            45621.6
                                        ],
                                        "bounds": [
                                            [
                                                20328.1,
                                                45304.3
                                            ],
                                            [
                                                20428.1,
                                                45246.1
                                            ],
                                            [
                                                20559.6,
                                                45228.3
                                            ],
                                            [
                                                20668.7,
                                                45270.7
                                            ],
                                            [
                                                20721,
                                                45360.7
                                            ],
                                            [
                                                20751.9,
                                                45492.2
                                            ],
                                            [
                                                20775.6,
                                                45653.9
                                            ],
                                            [
                                                20718.4,
                                                45732
                                            ],
                                            [
                                                20575.2,
                                                45739.1
                                            ],
                                            [
                                                20598.6,
                                                45940.8
                                            ],
                                            [
                                                20471.6,
                                                45950.7
                                            ],
                                            [
                                                20427.2,
                                                45904.8
                                            ],
                                            [
                                                20455.7,
                                                45829.5
                                            ],
                                            [
                                                20457,
                                                45789.6
                                            ],
                                            [
                                                20466.5,
                                                45775.1
                                            ],
                                            [
                                                20489.3,
                                                45756.9
                                            ],
                                            [
                                                20506.2,
                                                45707.8
                                            ],
                                            [
                                                20500.6,
                                                45682.3
                                            ],
                                            [
                                                20502.9,
                                                45660.9
                                            ],
                                            [
                                                20523.5,
                                                45632.5
                                            ],
                                            [
                                                20501.5,
                                                45592.2
                                            ],
                                            [
                                                20462.6,
                                                45577.1
                                            ],
                                            [
                                                20306.2,
                                                45587.7
                                            ],
                                            [
                                                20326.2,
                                                45502.8
                                            ],
                                            [
                                                20328.1,
                                                45304.3
                                            ]
                                        ],
                                        "id": 1608,
                                        "chat_link": "[&BEgGAAA=]"
                                    },
                                    "1611": {
                                        "name": "Secret Entrance",
                                        "level": 80,
                                        "coord": [
                                            20628.2,
                                            46026.6
                                        ],
                                        "bounds": [
                                            [
                                                20598.2,
                                                45940.4
                                            ],
                                            [
                                                20765.2,
                                                46027.4
                                            ],
                                            [
                                                20774.6,
                                                46107.5
                                            ],
                                            [
                                                20531.3,
                                                46107.4
                                            ],
                                            [
                                                20471.5,
                                                45950.2
                                            ],
                                            [
                                                20598.2,
                                                45940.4
                                            ]
                                        ],
                                        "id": 1611,
                                        "chat_link": "[&BEsGAAA=]"
                                    },
                                    "1612": {
                                        "name": "The Royal Chamber",
                                        "level": 80,
                                        "coord": [
                                            20110.1,
                                            46156.8
                                        ],
                                        "bounds": [
                                            [
                                                20047.4,
                                                46357.8
                                            ],
                                            [
                                                19959.4,
                                                46271.1
                                            ],
                                            [
                                                19999.9,
                                                46195.4
                                            ],
                                            [
                                                19999.8,
                                                46142.9
                                            ],
                                            [
                                                19964.6,
                                                46070.4
                                            ],
                                            [
                                                20070.8,
                                                45994.6
                                            ],
                                            [
                                                20132,
                                                45986.4
                                            ],
                                            [
                                                20201.4,
                                                45996.5
                                            ],
                                            [
                                                20314.6,
                                                46119
                                            ],
                                            [
                                                20316.9,
                                                46241.2
                                            ],
                                            [
                                                20205,
                                                46350
                                            ],
                                            [
                                                20047.4,
                                                46357.8
                                            ]
                                        ],
                                        "id": 1612,
                                        "chat_link": "[&BEwGAAA=]"
                                    },
                                    "1620": {
                                        "name": "Elswyth's Gallery",
                                        "level": 80,
                                        "coord": [
                                            19939.5,
                                            45735.4
                                        ],
                                        "bounds": [
                                            [
                                                19988.7,
                                                45926.8
                                            ],
                                            [
                                                19927.8,
                                                45883.5
                                            ],
                                            [
                                                19869.9,
                                                45914.4
                                            ],
                                            [
                                                19674,
                                                45644.9
                                            ],
                                            [
                                                19800.3,
                                                45518.1
                                            ],
                                            [
                                                19873.9,
                                                45571.9
                                            ],
                                            [
                                                19986.1,
                                                45639.5
                                            ],
                                            [
                                                20092.2,
                                                45698.5
                                            ],
                                            [
                                                20047.9,
                                                45769.9
                                            ],
                                            [
                                                20133.8,
                                                45786.7
                                            ],
                                            [
                                                19988.7,
                                                45926.8
                                            ]
                                        ],
                                        "id": 1620,
                                        "chat_link": "[&BFQGAAA=]"
                                    },
                                    "1621": {
                                        "name": "Vestibule of Faith",
                                        "level": 80,
                                        "coord": [
                                            19975.4,
                                            45403.1
                                        ],
                                        "bounds": [
                                            [
                                                19985.4,
                                                45483.8
                                            ],
                                            [
                                                19986.3,
                                                45640.4
                                            ],
                                            [
                                                19873.7,
                                                45572.2
                                            ],
                                            [
                                                19849.7,
                                                45378.8
                                            ],
                                            [
                                                19819.9,
                                                45362.3
                                            ],
                                            [
                                                19749.9,
                                                45361.8
                                            ],
                                            [
                                                19544.9,
                                                45374.8
                                            ],
                                            [
                                                19542.2,
                                                45195.7
                                            ],
                                            [
                                                20010.5,
                                                45195.6
                                            ],
                                            [
                                                20010.3,
                                                45376.1
                                            ],
                                            [
                                                20296.2,
                                                45369.6
                                            ],
                                            [
                                                20328.4,
                                                45303.7
                                            ],
                                            [
                                                20326.5,
                                                45503.2
                                            ],
                                            [
                                                20296.1,
                                                45468.9
                                            ],
                                            [
                                                20010.8,
                                                45460.4
                                            ],
                                            [
                                                19985.4,
                                                45483.8
                                            ]
                                        ],
                                        "id": 1621,
                                        "chat_link": "[&BFUGAAA=]"
                                    }
                                },
                                "adventures": [],
                                "id": 1268,
                                "mastery_points": []
                            }
                        },
                        "id": 12
                    }
                },
                "id": 0
            }
            """.trimIndent()
        )
    }

}