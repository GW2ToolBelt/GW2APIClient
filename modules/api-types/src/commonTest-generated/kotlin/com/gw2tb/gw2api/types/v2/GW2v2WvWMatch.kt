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

class GW2v2WvwMatchTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2WvwMatch>(
            """
            {
                "id": "2-1",
                "start_time": "2021-06-04T18:00:00Z",
                "end_time": "2021-06-11T17:58:00Z",
                "scores": {
                    "red": 451275,
                    "blue": 407492,
                    "green": 434523
                },
                "worlds": {
                    "red": 2005,
                    "blue": 2202,
                    "green": 2002
                },
                "all_worlds": {
                    "red": [
                        2012,
                        2005
                    ],
                    "blue": [
                        2206,
                        2202
                    ],
                    "green": [
                        2102,
                        2002
                    ]
                },
                "deaths": {
                    "red": 39528,
                    "blue": 30361,
                    "green": 31361
                },
                "kills": {
                    "red": 37255,
                    "blue": 29906,
                    "green": 30009
                },
                "victory_points": {
                    "red": 344,
                    "blue": 318,
                    "green": 322
                },
                "skirmishes": [
                    {
                        "id": 1,
                        "scores": {
                            "red": 6831,
                            "blue": 7810,
                            "green": 5101
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1557,
                                    "blue": 3020,
                                    "green": 1458
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1954,
                                    "blue": 1632,
                                    "green": 742
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 1776,
                                    "blue": 2187,
                                    "green": 1115
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1544,
                                    "blue": 971,
                                    "green": 1786
                                }
                            }
                        ]
                    },
                    {
                        "id": 2,
                        "scores": {
                            "red": 5150,
                            "blue": 7635,
                            "green": 5292
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2090,
                                    "blue": 2509,
                                    "green": 2316
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2144,
                                    "blue": 1740,
                                    "green": 513
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 450,
                                    "blue": 2296,
                                    "green": 513
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 466,
                                    "blue": 1090,
                                    "green": 1950
                                }
                            }
                        ]
                    },
                    {
                        "id": 3,
                        "scores": {
                            "red": 5648,
                            "blue": 5801,
                            "green": 4687
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1770,
                                    "blue": 2928,
                                    "green": 1823
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2323,
                                    "blue": 204,
                                    "green": 309
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 747,
                                    "blue": 1306,
                                    "green": 628
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 808,
                                    "blue": 1363,
                                    "green": 1927
                                }
                            }
                        ]
                    },
                    {
                        "id": 4,
                        "scores": {
                            "red": 5205,
                            "blue": 2767,
                            "green": 5713
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1410,
                                    "blue": 1070,
                                    "green": 2644
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2617,
                                    "blue": 168,
                                    "green": 504
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 930,
                                    "blue": 1183,
                                    "green": 554
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 248,
                                    "blue": 346,
                                    "green": 2011
                                }
                            }
                        ]
                    },
                    {
                        "id": 5,
                        "scores": {
                            "red": 4149,
                            "blue": 3063,
                            "green": 5945
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1288,
                                    "blue": 916,
                                    "green": 2472
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2196,
                                    "blue": 221,
                                    "green": 927
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 245,
                                    "blue": 1673,
                                    "green": 511
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 420,
                                    "blue": 253,
                                    "green": 2035
                                }
                            }
                        ]
                    },
                    {
                        "id": 6,
                        "scores": {
                            "red": 5882,
                            "blue": 3652,
                            "green": 3958
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2167,
                                    "blue": 1464,
                                    "green": 1354
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2655,
                                    "blue": 263,
                                    "green": 395
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 577,
                                    "blue": 1538,
                                    "green": 480
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 483,
                                    "blue": 387,
                                    "green": 1729
                                }
                            }
                        ]
                    },
                    {
                        "id": 7,
                        "scores": {
                            "red": 6810,
                            "blue": 4212,
                            "green": 3996
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2880,
                                    "blue": 1588,
                                    "green": 1210
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2667,
                                    "blue": 529,
                                    "green": 503
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 484,
                                    "blue": 1636,
                                    "green": 705
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 779,
                                    "blue": 459,
                                    "green": 1578
                                }
                            }
                        ]
                    },
                    {
                        "id": 8,
                        "scores": {
                            "red": 5937,
                            "blue": 4771,
                            "green": 6240
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2388,
                                    "blue": 1779,
                                    "green": 2871
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2346,
                                    "blue": 477,
                                    "green": 610
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 639,
                                    "blue": 2107,
                                    "green": 611
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 564,
                                    "blue": 408,
                                    "green": 2148
                                }
                            }
                        ]
                    },
                    {
                        "id": 9,
                        "scores": {
                            "red": 4939,
                            "blue": 5800,
                            "green": 6893
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2253,
                                    "blue": 2602,
                                    "green": 2780
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1815,
                                    "blue": 455,
                                    "green": 1207
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 422,
                                    "blue": 2117,
                                    "green": 810
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 449,
                                    "blue": 626,
                                    "green": 2096
                                }
                            }
                        ]
                    },
                    {
                        "id": 10,
                        "scores": {
                            "red": 5854,
                            "blue": 5073,
                            "green": 6499
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2998,
                                    "blue": 2138,
                                    "green": 2124
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1851,
                                    "blue": 391,
                                    "green": 1296
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 446,
                                    "blue": 2203,
                                    "green": 885
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 559,
                                    "blue": 341,
                                    "green": 2194
                                }
                            }
                        ]
                    },
                    {
                        "id": 11,
                        "scores": {
                            "red": 6646,
                            "blue": 5005,
                            "green": 6181
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 3241,
                                    "blue": 2002,
                                    "green": 2003
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2170,
                                    "blue": 435,
                                    "green": 1394
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 625,
                                    "blue": 2232,
                                    "green": 672
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 610,
                                    "blue": 336,
                                    "green": 2112
                                }
                            }
                        ]
                    },
                    {
                        "id": 12,
                        "scores": {
                            "red": 6274,
                            "blue": 5627,
                            "green": 6024
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 3143,
                                    "blue": 2322,
                                    "green": 2244
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2091,
                                    "blue": 485,
                                    "green": 1326
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 346,
                                    "blue": 2368,
                                    "green": 662
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 694,
                                    "blue": 452,
                                    "green": 1792
                                }
                            }
                        ]
                    },
                    {
                        "id": 13,
                        "scores": {
                            "red": 7070,
                            "blue": 8858,
                            "green": 6536
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2270,
                                    "blue": 3186,
                                    "green": 2791
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2524,
                                    "blue": 776,
                                    "green": 1446
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 906,
                                    "blue": 2893,
                                    "green": 542
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1370,
                                    "blue": 2003,
                                    "green": 1757
                                }
                            }
                        ]
                    },
                    {
                        "id": 14,
                        "scores": {
                            "red": 6723,
                            "blue": 8412,
                            "green": 5731
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2184,
                                    "blue": 3119,
                                    "green": 2725
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1956,
                                    "blue": 629,
                                    "green": 530
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 847,
                                    "blue": 3012,
                                    "green": 471
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1736,
                                    "blue": 1652,
                                    "green": 2005
                                }
                            }
                        ]
                    },
                    {
                        "id": 15,
                        "scores": {
                            "red": 6467,
                            "blue": 5164,
                            "green": 5199
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2037,
                                    "blue": 2146,
                                    "green": 2386
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2261,
                                    "blue": 401,
                                    "green": 239
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 732,
                                    "blue": 1832,
                                    "green": 540
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1437,
                                    "blue": 785,
                                    "green": 2034
                                }
                            }
                        ]
                    },
                    {
                        "id": 16,
                        "scores": {
                            "red": 3622,
                            "blue": 3287,
                            "green": 5880
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1183,
                                    "blue": 1192,
                                    "green": 2725
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1823,
                                    "blue": 304,
                                    "green": 659
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 233,
                                    "blue": 1507,
                                    "green": 549
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 383,
                                    "blue": 284,
                                    "green": 1947
                                }
                            }
                        ]
                    },
                    {
                        "id": 17,
                        "scores": {
                            "red": 3822,
                            "blue": 3552,
                            "green": 5544
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1503,
                                    "blue": 1023,
                                    "green": 2370
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1641,
                                    "blue": 249,
                                    "green": 707
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 236,
                                    "blue": 1999,
                                    "green": 387
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 442,
                                    "blue": 281,
                                    "green": 2080
                                }
                            }
                        ]
                    },
                    {
                        "id": 18,
                        "scores": {
                            "red": 4353,
                            "blue": 5709,
                            "green": 3729
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1673,
                                    "blue": 2432,
                                    "green": 1238
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1840,
                                    "blue": 521,
                                    "green": 421
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 244,
                                    "blue": 2503,
                                    "green": 219
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 596,
                                    "blue": 253,
                                    "green": 1851
                                }
                            }
                        ]
                    },
                    {
                        "id": 19,
                        "scores": {
                            "red": 6067,
                            "blue": 6168,
                            "green": 2902
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2193,
                                    "blue": 3020,
                                    "green": 960
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2229,
                                    "blue": 442,
                                    "green": 396
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 789,
                                    "blue": 2398,
                                    "green": 345
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 856,
                                    "blue": 308,
                                    "green": 1201
                                }
                            }
                        ]
                    },
                    {
                        "id": 20,
                        "scores": {
                            "red": 6497,
                            "blue": 5148,
                            "green": 4520
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2318,
                                    "blue": 2035,
                                    "green": 1947
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1786,
                                    "blue": 490,
                                    "green": 758
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 1517,
                                    "blue": 2094,
                                    "green": 586
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 876,
                                    "blue": 529,
                                    "green": 1229
                                }
                            }
                        ]
                    },
                    {
                        "id": 21,
                        "scores": {
                            "red": 5687,
                            "blue": 5573,
                            "green": 5147
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2839,
                                    "blue": 2484,
                                    "green": 2096
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1262,
                                    "blue": 814,
                                    "green": 989
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 982,
                                    "blue": 1725,
                                    "green": 690
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 604,
                                    "blue": 550,
                                    "green": 1372
                                }
                            }
                        ]
                    },
                    {
                        "id": 22,
                        "scores": {
                            "red": 4537,
                            "blue": 5703,
                            "green": 7511
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2073,
                                    "blue": 2259,
                                    "green": 4021
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1285,
                                    "blue": 894,
                                    "green": 1372
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 537,
                                    "blue": 1896,
                                    "green": 709
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 642,
                                    "blue": 654,
                                    "green": 1409
                                }
                            }
                        ]
                    },
                    {
                        "id": 23,
                        "scores": {
                            "red": 6225,
                            "blue": 6019,
                            "green": 6579
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2822,
                                    "blue": 2836,
                                    "green": 3653
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1824,
                                    "blue": 528,
                                    "green": 768
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 756,
                                    "blue": 2103,
                                    "green": 598
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 823,
                                    "blue": 552,
                                    "green": 1560
                                }
                            }
                        ]
                    },
                    {
                        "id": 24,
                        "scores": {
                            "red": 6832,
                            "blue": 7057,
                            "green": 5925
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2618,
                                    "blue": 3505,
                                    "green": 3420
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2277,
                                    "blue": 745,
                                    "green": 523
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 725,
                                    "blue": 2123,
                                    "green": 507
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1212,
                                    "blue": 684,
                                    "green": 1475
                                }
                            }
                        ]
                    },
                    {
                        "id": 25,
                        "scores": {
                            "red": 8479,
                            "blue": 7297,
                            "green": 5770
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2527,
                                    "blue": 2350,
                                    "green": 2371
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2612,
                                    "blue": 1287,
                                    "green": 577
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 1495,
                                    "blue": 2452,
                                    "green": 961
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1845,
                                    "blue": 1208,
                                    "green": 1861
                                }
                            }
                        ]
                    },
                    {
                        "id": 26,
                        "scores": {
                            "red": 7464,
                            "blue": 4791,
                            "green": 4963
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 3108,
                                    "blue": 2043,
                                    "green": 2391
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2133,
                                    "blue": 373,
                                    "green": 375
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 1326,
                                    "blue": 1780,
                                    "green": 469
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 897,
                                    "blue": 595,
                                    "green": 1728
                                }
                            }
                        ]
                    },
                    {
                        "id": 27,
                        "scores": {
                            "red": 5945,
                            "blue": 2925,
                            "green": 5397
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2165,
                                    "blue": 1344,
                                    "green": 2766
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1788,
                                    "blue": 222,
                                    "green": 595
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 1271,
                                    "blue": 1169,
                                    "green": 471
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 721,
                                    "blue": 190,
                                    "green": 1565
                                }
                            }
                        ]
                    },
                    {
                        "id": 28,
                        "scores": {
                            "red": 2674,
                            "blue": 3218,
                            "green": 6506
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 455,
                                    "blue": 1071,
                                    "green": 3183
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1349,
                                    "blue": 164,
                                    "green": 1059
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 347,
                                    "blue": 1800,
                                    "green": 485
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 523,
                                    "blue": 183,
                                    "green": 1779
                                }
                            }
                        ]
                    },
                    {
                        "id": 29,
                        "scores": {
                            "red": 1655,
                            "blue": 4841,
                            "green": 5417
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 635,
                                    "blue": 1842,
                                    "green": 2127
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 557,
                                    "blue": 605,
                                    "green": 950
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 170,
                                    "blue": 2185,
                                    "green": 250
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 293,
                                    "blue": 209,
                                    "green": 2090
                                }
                            }
                        ]
                    },
                    {
                        "id": 30,
                        "scores": {
                            "red": 6148,
                            "blue": 3862,
                            "green": 2553
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2234,
                                    "blue": 1367,
                                    "green": 1029
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2364,
                                    "blue": 393,
                                    "green": 163
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 761,
                                    "blue": 1446,
                                    "green": 224
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 789,
                                    "blue": 656,
                                    "green": 1137
                                }
                            }
                        ]
                    },
                    {
                        "id": 31,
                        "scores": {
                            "red": 7753,
                            "blue": 3950,
                            "green": 2634
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 3084,
                                    "blue": 1374,
                                    "green": 1166
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2699,
                                    "blue": 664,
                                    "green": 319
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 334,
                                    "blue": 1577,
                                    "green": 523
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1636,
                                    "blue": 335,
                                    "green": 626
                                }
                            }
                        ]
                    },
                    {
                        "id": 32,
                        "scores": {
                            "red": 5734,
                            "blue": 4798,
                            "green": 3490
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1919,
                                    "blue": 1669,
                                    "green": 1875
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1943,
                                    "blue": 559,
                                    "green": 510
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 383,
                                    "blue": 2019,
                                    "green": 417
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1489,
                                    "blue": 551,
                                    "green": 688
                                }
                            }
                        ]
                    },
                    {
                        "id": 33,
                        "scores": {
                            "red": 5031,
                            "blue": 4617,
                            "green": 5424
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1841,
                                    "blue": 1437,
                                    "green": 2737
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2053,
                                    "blue": 892,
                                    "green": 658
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 474,
                                    "blue": 1941,
                                    "green": 458
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 663,
                                    "blue": 347,
                                    "green": 1571
                                }
                            }
                        ]
                    },
                    {
                        "id": 34,
                        "scores": {
                            "red": 4123,
                            "blue": 5227,
                            "green": 6059
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2032,
                                    "blue": 1685,
                                    "green": 2977
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 978,
                                    "blue": 814,
                                    "green": 1100
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 521,
                                    "blue": 2240,
                                    "green": 402
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 592,
                                    "blue": 488,
                                    "green": 1580
                                }
                            }
                        ]
                    },
                    {
                        "id": 35,
                        "scores": {
                            "red": 5412,
                            "blue": 4658,
                            "green": 6151
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2228,
                                    "blue": 1861,
                                    "green": 2907
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1732,
                                    "blue": 387,
                                    "green": 426
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 956,
                                    "blue": 2040,
                                    "green": 444
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 496,
                                    "blue": 370,
                                    "green": 2374
                                }
                            }
                        ]
                    },
                    {
                        "id": 36,
                        "scores": {
                            "red": 5406,
                            "blue": 7085,
                            "green": 6337
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2737,
                                    "blue": 3240,
                                    "green": 3024
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1646,
                                    "blue": 1045,
                                    "green": 460
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 422,
                                    "blue": 2205,
                                    "green": 485
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 601,
                                    "blue": 595,
                                    "green": 2368
                                }
                            }
                        ]
                    },
                    {
                        "id": 37,
                        "scores": {
                            "red": 5817,
                            "blue": 8842,
                            "green": 5213
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1991,
                                    "blue": 3056,
                                    "green": 2186
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1718,
                                    "blue": 1955,
                                    "green": 407
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 1022,
                                    "blue": 2401,
                                    "green": 427
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1086,
                                    "blue": 1430,
                                    "green": 2193
                                }
                            }
                        ]
                    },
                    {
                        "id": 38,
                        "scores": {
                            "red": 7039,
                            "blue": 5604,
                            "green": 5493
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2515,
                                    "blue": 2069,
                                    "green": 2290
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2353,
                                    "blue": 481,
                                    "green": 234
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 398,
                                    "blue": 2093,
                                    "green": 405
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1773,
                                    "blue": 961,
                                    "green": 2564
                                }
                            }
                        ]
                    },
                    {
                        "id": 39,
                        "scores": {
                            "red": 4986,
                            "blue": 3820,
                            "green": 5490
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1760,
                                    "blue": 1635,
                                    "green": 2383
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2422,
                                    "blue": 266,
                                    "green": 272
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 281,
                                    "blue": 1581,
                                    "green": 898
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 523,
                                    "blue": 338,
                                    "green": 1937
                                }
                            }
                        ]
                    },
                    {
                        "id": 40,
                        "scores": {
                            "red": 1655,
                            "blue": 3299,
                            "green": 8027
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 525,
                                    "blue": 1531,
                                    "green": 2896
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 613,
                                    "blue": 337,
                                    "green": 1485
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 216,
                                    "blue": 1237,
                                    "green": 1530
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 301,
                                    "blue": 194,
                                    "green": 2116
                                }
                            }
                        ]
                    },
                    {
                        "id": 41,
                        "scores": {
                            "red": 1861,
                            "blue": 3771,
                            "green": 8078
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 782,
                                    "blue": 1560,
                                    "green": 3040
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 622,
                                    "blue": 528,
                                    "green": 1471
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 266,
                                    "blue": 1597,
                                    "green": 1038
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 191,
                                    "blue": 86,
                                    "green": 2529
                                }
                            }
                        ]
                    },
                    {
                        "id": 42,
                        "scores": {
                            "red": 6011,
                            "blue": 3788,
                            "green": 3592
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2534,
                                    "blue": 1510,
                                    "green": 1568
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2035,
                                    "blue": 360,
                                    "green": 263
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 440,
                                    "blue": 1565,
                                    "green": 467
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1002,
                                    "blue": 353,
                                    "green": 1294
                                }
                            }
                        ]
                    },
                    {
                        "id": 43,
                        "scores": {
                            "red": 6349,
                            "blue": 4472,
                            "green": 3006
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2713,
                                    "blue": 1674,
                                    "green": 1175
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2476,
                                    "blue": 314,
                                    "green": 254
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 273,
                                    "blue": 2074,
                                    "green": 405
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 887,
                                    "blue": 410,
                                    "green": 1172
                                }
                            }
                        ]
                    },
                    {
                        "id": 44,
                        "scores": {
                            "red": 4973,
                            "blue": 5329,
                            "green": 3454
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1755,
                                    "blue": 2263,
                                    "green": 1372
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1903,
                                    "blue": 394,
                                    "green": 413
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 490,
                                    "blue": 2107,
                                    "green": 587
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 825,
                                    "blue": 565,
                                    "green": 1082
                                }
                            }
                        ]
                    },
                    {
                        "id": 45,
                        "scores": {
                            "red": 5476,
                            "blue": 4798,
                            "green": 4675
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1870,
                                    "blue": 1960,
                                    "green": 2093
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2530,
                                    "blue": 317,
                                    "green": 285
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 403,
                                    "blue": 2067,
                                    "green": 636
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 673,
                                    "blue": 454,
                                    "green": 1661
                                }
                            }
                        ]
                    },
                    {
                        "id": 46,
                        "scores": {
                            "red": 4341,
                            "blue": 4668,
                            "green": 5377
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1888,
                                    "blue": 1694,
                                    "green": 2256
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1652,
                                    "blue": 604,
                                    "green": 482
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 368,
                                    "blue": 1994,
                                    "green": 634
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 433,
                                    "blue": 376,
                                    "green": 2005
                                }
                            }
                        ]
                    },
                    {
                        "id": 47,
                        "scores": {
                            "red": 5408,
                            "blue": 4611,
                            "green": 5917
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2003,
                                    "blue": 1613,
                                    "green": 2608
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2304,
                                    "blue": 366,
                                    "green": 337
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 477,
                                    "blue": 2317,
                                    "green": 576
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 624,
                                    "blue": 315,
                                    "green": 2396
                                }
                            }
                        ]
                    },
                    {
                        "id": 48,
                        "scores": {
                            "red": 5972,
                            "blue": 4740,
                            "green": 5230
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2220,
                                    "blue": 1826,
                                    "green": 2567
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2499,
                                    "blue": 211,
                                    "green": 387
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 545,
                                    "blue": 2422,
                                    "green": 348
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 708,
                                    "blue": 281,
                                    "green": 1928
                                }
                            }
                        ]
                    },
                    {
                        "id": 49,
                        "scores": {
                            "red": 9765,
                            "blue": 7049,
                            "green": 5267
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 3126,
                                    "blue": 2462,
                                    "green": 2009
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2759,
                                    "blue": 427,
                                    "green": 507
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 2018,
                                    "blue": 3739,
                                    "green": 1110
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1862,
                                    "blue": 421,
                                    "green": 1641
                                }
                            }
                        ]
                    },
                    {
                        "id": 50,
                        "scores": {
                            "red": 6810,
                            "blue": 5263,
                            "green": 5026
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2754,
                                    "blue": 2306,
                                    "green": 1901
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2462,
                                    "blue": 479,
                                    "green": 452
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 622,
                                    "blue": 2118,
                                    "green": 476
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 972,
                                    "blue": 360,
                                    "green": 2197
                                }
                            }
                        ]
                    },
                    {
                        "id": 51,
                        "scores": {
                            "red": 5820,
                            "blue": 3476,
                            "green": 4874
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2942,
                                    "blue": 1433,
                                    "green": 2005
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1721,
                                    "blue": 453,
                                    "green": 292
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 752,
                                    "blue": 1323,
                                    "green": 583
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 405,
                                    "blue": 267,
                                    "green": 1994
                                }
                            }
                        ]
                    },
                    {
                        "id": 52,
                        "scores": {
                            "red": 6527,
                            "blue": 2576,
                            "green": 4540
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2324,
                                    "blue": 1500,
                                    "green": 2128
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2244,
                                    "blue": 264,
                                    "green": 278
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 1286,
                                    "blue": 681,
                                    "green": 267
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 673,
                                    "blue": 131,
                                    "green": 1867
                                }
                            }
                        ]
                    },
                    {
                        "id": 53,
                        "scores": {
                            "red": 5155,
                            "blue": 2846,
                            "green": 4407
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2853,
                                    "blue": 895,
                                    "green": 1143
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1556,
                                    "blue": 139,
                                    "green": 1226
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 479,
                                    "blue": 1609,
                                    "green": 232
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 267,
                                    "blue": 203,
                                    "green": 1806
                                }
                            }
                        ]
                    },
                    {
                        "id": 54,
                        "scores": {
                            "red": 5195,
                            "blue": 4180,
                            "green": 4244
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2462,
                                    "blue": 984,
                                    "green": 1605
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2117,
                                    "blue": 348,
                                    "green": 475
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 159,
                                    "blue": 2632,
                                    "green": 255
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 457,
                                    "blue": 216,
                                    "green": 1909
                                }
                            }
                        ]
                    },
                    {
                        "id": 55,
                        "scores": {
                            "red": 6108,
                            "blue": 4706,
                            "green": 3831
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2920,
                                    "blue": 1449,
                                    "green": 1221
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2389,
                                    "blue": 378,
                                    "green": 427
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 338,
                                    "blue": 2381,
                                    "green": 411
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 461,
                                    "blue": 498,
                                    "green": 1772
                                }
                            }
                        ]
                    },
                    {
                        "id": 56,
                        "scores": {
                            "red": 3161,
                            "blue": 5455,
                            "green": 4896
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1631,
                                    "blue": 2151,
                                    "green": 1351
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 789,
                                    "blue": 606,
                                    "green": 960
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 428,
                                    "blue": 2243,
                                    "green": 627
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 313,
                                    "blue": 455,
                                    "green": 1958
                                }
                            }
                        ]
                    },
                    {
                        "id": 57,
                        "scores": {
                            "red": 3488,
                            "blue": 5820,
                            "green": 5292
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1772,
                                    "blue": 2031,
                                    "green": 1724
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 941,
                                    "blue": 973,
                                    "green": 933
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 424,
                                    "blue": 2297,
                                    "green": 550
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 351,
                                    "blue": 519,
                                    "green": 2085
                                }
                            }
                        ]
                    },
                    {
                        "id": 58,
                        "scores": {
                            "red": 4074,
                            "blue": 4991,
                            "green": 6754
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2090,
                                    "blue": 1795,
                                    "green": 2009
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1189,
                                    "blue": 1015,
                                    "green": 1201
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 391,
                                    "blue": 1914,
                                    "green": 842
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 404,
                                    "blue": 267,
                                    "green": 2702
                                }
                            }
                        ]
                    },
                    {
                        "id": 59,
                        "scores": {
                            "red": 4444,
                            "blue": 5339,
                            "green": 6694
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1923,
                                    "blue": 1903,
                                    "green": 2647
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1678,
                                    "blue": 928,
                                    "green": 739
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 459,
                                    "blue": 2138,
                                    "green": 504
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 384,
                                    "blue": 370,
                                    "green": 2804
                                }
                            }
                        ]
                    },
                    {
                        "id": 60,
                        "scores": {
                            "red": 5176,
                            "blue": 5578,
                            "green": 7092
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2194,
                                    "blue": 2289,
                                    "green": 3413
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2179,
                                    "blue": 624,
                                    "green": 456
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 370,
                                    "blue": 2251,
                                    "green": 563
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 433,
                                    "blue": 414,
                                    "green": 2660
                                }
                            }
                        ]
                    },
                    {
                        "id": 61,
                        "scores": {
                            "red": 5530,
                            "blue": 7433,
                            "green": 6439
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1843,
                                    "blue": 2250,
                                    "green": 2867
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1869,
                                    "blue": 1403,
                                    "green": 278
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 938,
                                    "blue": 2863,
                                    "green": 419
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 880,
                                    "blue": 917,
                                    "green": 2875
                                }
                            }
                        ]
                    },
                    {
                        "id": 62,
                        "scores": {
                            "red": 5362,
                            "blue": 6100,
                            "green": 6040
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2146,
                                    "blue": 3122,
                                    "green": 2790
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2256,
                                    "blue": 232,
                                    "green": 321
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 437,
                                    "blue": 2320,
                                    "green": 596
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 523,
                                    "blue": 426,
                                    "green": 2333
                                }
                            }
                        ]
                    },
                    {
                        "id": 63,
                        "scores": {
                            "red": 6099,
                            "blue": 2504,
                            "green": 5907
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2278,
                                    "blue": 1002,
                                    "green": 2650
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2625,
                                    "blue": 232,
                                    "green": 280
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 683,
                                    "blue": 1060,
                                    "green": 594
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 513,
                                    "blue": 210,
                                    "green": 2383
                                }
                            }
                        ]
                    },
                    {
                        "id": 64,
                        "scores": {
                            "red": 5047,
                            "blue": 2017,
                            "green": 7032
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1489,
                                    "blue": 319,
                                    "green": 3349
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2705,
                                    "blue": 361,
                                    "green": 380
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 710,
                                    "blue": 1149,
                                    "green": 855
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 143,
                                    "blue": 188,
                                    "green": 2448
                                }
                            }
                        ]
                    },
                    {
                        "id": 65,
                        "scores": {
                            "red": 4316,
                            "blue": 3194,
                            "green": 6729
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 958,
                                    "blue": 723,
                                    "green": 3262
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2755,
                                    "blue": 322,
                                    "green": 393
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 385,
                                    "blue": 1893,
                                    "green": 533
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 218,
                                    "blue": 256,
                                    "green": 2541
                                }
                            }
                        ]
                    },
                    {
                        "id": 66,
                        "scores": {
                            "red": 5901,
                            "blue": 3677,
                            "green": 4220
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1935,
                                    "blue": 1286,
                                    "green": 2049
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2771,
                                    "blue": 375,
                                    "green": 134
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 620,
                                    "blue": 1757,
                                    "green": 265
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 575,
                                    "blue": 259,
                                    "green": 1772
                                }
                            }
                        ]
                    },
                    {
                        "id": 67,
                        "scores": {
                            "red": 5700,
                            "blue": 4701,
                            "green": 3361
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2219,
                                    "blue": 2049,
                                    "green": 1336
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2446,
                                    "blue": 463,
                                    "green": 333
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 358,
                                    "blue": 1851,
                                    "green": 622
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 677,
                                    "blue": 338,
                                    "green": 1070
                                }
                            }
                        ]
                    },
                    {
                        "id": 68,
                        "scores": {
                            "red": 4345,
                            "blue": 4949,
                            "green": 4002
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1860,
                                    "blue": 2024,
                                    "green": 1619
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1332,
                                    "blue": 595,
                                    "green": 621
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 624,
                                    "blue": 1821,
                                    "green": 446
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 529,
                                    "blue": 509,
                                    "green": 1316
                                }
                            }
                        ]
                    },
                    {
                        "id": 69,
                        "scores": {
                            "red": 4066,
                            "blue": 4808,
                            "green": 5551
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1856,
                                    "blue": 1744,
                                    "green": 2643
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1430,
                                    "blue": 367,
                                    "green": 709
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 336,
                                    "blue": 2012,
                                    "green": 636
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 444,
                                    "blue": 685,
                                    "green": 1563
                                }
                            }
                        ]
                    },
                    {
                        "id": 70,
                        "scores": {
                            "red": 5738,
                            "blue": 4220,
                            "green": 5192
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2109,
                                    "blue": 1580,
                                    "green": 2996
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2145,
                                    "blue": 301,
                                    "green": 329
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 850,
                                    "blue": 1653,
                                    "green": 427
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 634,
                                    "blue": 686,
                                    "green": 1440
                                }
                            }
                        ]
                    },
                    {
                        "id": 71,
                        "scores": {
                            "red": 6364,
                            "blue": 4957,
                            "green": 4550
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2754,
                                    "blue": 2068,
                                    "green": 2079
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2292,
                                    "blue": 327,
                                    "green": 275
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 633,
                                    "blue": 1841,
                                    "green": 623
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 685,
                                    "blue": 721,
                                    "green": 1573
                                }
                            }
                        ]
                    },
                    {
                        "id": 72,
                        "scores": {
                            "red": 6163,
                            "blue": 6105,
                            "green": 5038
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2386,
                                    "blue": 2592,
                                    "green": 2286
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2659,
                                    "blue": 573,
                                    "green": 407
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 495,
                                    "blue": 2357,
                                    "green": 629
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 623,
                                    "blue": 583,
                                    "green": 1716
                                }
                            }
                        ]
                    },
                    {
                        "id": 73,
                        "scores": {
                            "red": 6473,
                            "blue": 7528,
                            "green": 4635
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2316,
                                    "blue": 2581,
                                    "green": 1915
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2409,
                                    "blue": 1478,
                                    "green": 375
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 917,
                                    "blue": 2291,
                                    "green": 712
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 831,
                                    "blue": 1178,
                                    "green": 1633
                                }
                            }
                        ]
                    },
                    {
                        "id": 74,
                        "scores": {
                            "red": 6462,
                            "blue": 6029,
                            "green": 4625
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2181,
                                    "blue": 3418,
                                    "green": 2466
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2592,
                                    "blue": 358,
                                    "green": 295
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 859,
                                    "blue": 1649,
                                    "green": 495
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 830,
                                    "blue": 604,
                                    "green": 1369
                                }
                            }
                        ]
                    },
                    {
                        "id": 75,
                        "scores": {
                            "red": 5623,
                            "blue": 3401,
                            "green": 5191
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1853,
                                    "blue": 1569,
                                    "green": 2373
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2386,
                                    "blue": 203,
                                    "green": 779
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 905,
                                    "blue": 1378,
                                    "green": 291
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 479,
                                    "blue": 251,
                                    "green": 1748
                                }
                            }
                        ]
                    },
                    {
                        "id": 76,
                        "scores": {
                            "red": 3317,
                            "blue": 2322,
                            "green": 7252
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 354,
                                    "blue": 1541,
                                    "green": 3317
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1504,
                                    "blue": 133,
                                    "green": 851
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 876,
                                    "blue": 630,
                                    "green": 1161
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 583,
                                    "blue": 18,
                                    "green": 1923
                                }
                            }
                        ]
                    },
                    {
                        "id": 77,
                        "scores": {
                            "red": 1381,
                            "blue": 1773,
                            "green": 9985
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 197,
                                    "blue": 403,
                                    "green": 4699
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 455,
                                    "blue": 43,
                                    "green": 1939
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 526,
                                    "blue": 1236,
                                    "green": 896
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 203,
                                    "blue": 91,
                                    "green": 2451
                                }
                            }
                        ]
                    },
                    {
                        "id": 78,
                        "scores": {
                            "red": 3563,
                            "blue": 4464,
                            "green": 4085
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1438,
                                    "blue": 2152,
                                    "green": 882
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1263,
                                    "blue": 402,
                                    "green": 837
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 377,
                                    "blue": 1659,
                                    "green": 262
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 485,
                                    "blue": 251,
                                    "green": 2104
                                }
                            }
                        ]
                    },
                    {
                        "id": 79,
                        "scores": {
                            "red": 5847,
                            "blue": 4768,
                            "green": 2985
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1959,
                                    "blue": 2305,
                                    "green": 1290
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 2426,
                                    "blue": 294,
                                    "green": 230
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 537,
                                    "blue": 1596,
                                    "green": 478
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 925,
                                    "blue": 573,
                                    "green": 987
                                }
                            }
                        ]
                    },
                    {
                        "id": 80,
                        "scores": {
                            "red": 4696,
                            "blue": 5238,
                            "green": 2790
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 1272,
                                    "blue": 2089,
                                    "green": 1590
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1610,
                                    "blue": 760,
                                    "green": 118
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 664,
                                    "blue": 1709,
                                    "green": 449
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1150,
                                    "blue": 680,
                                    "green": 633
                                }
                            }
                        ]
                    },
                    {
                        "id": 81,
                        "scores": {
                            "red": 6911,
                            "blue": 4423,
                            "green": 3014
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2424,
                                    "blue": 1884,
                                    "green": 1650
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1943,
                                    "blue": 509,
                                    "green": 219
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 1054,
                                    "blue": 1667,
                                    "green": 393
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1490,
                                    "blue": 363,
                                    "green": 752
                                }
                            }
                        ]
                    },
                    {
                        "id": 82,
                        "scores": {
                            "red": 7066,
                            "blue": 4538,
                            "green": 3429
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 2880,
                                    "blue": 1755,
                                    "green": 1676
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1928,
                                    "blue": 532,
                                    "green": 371
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 1003,
                                    "blue": 1674,
                                    "green": 476
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1255,
                                    "blue": 577,
                                    "green": 906
                                }
                            }
                        ]
                    },
                    {
                        "id": 83,
                        "scores": {
                            "red": 6643,
                            "blue": 4187,
                            "green": 3569
                        },
                        "map_scores": [
                            {
                                "type": "Center",
                                "scores": {
                                    "red": 3015,
                                    "blue": 1557,
                                    "green": 1790
                                }
                            },
                            {
                                "type": "RedHome",
                                "scores": {
                                    "red": 1991,
                                    "blue": 342,
                                    "green": 209
                                }
                            },
                            {
                                "type": "BlueHome",
                                "scores": {
                                    "red": 607,
                                    "blue": 1429,
                                    "green": 636
                                }
                            },
                            {
                                "type": "GreenHome",
                                "scores": {
                                    "red": 1030,
                                    "blue": 859,
                                    "green": 934
                                }
                            }
                        ]
                    }
                ],
                "maps": [
                    {
                        "id": 38,
                        "type": "Center",
                        "scores": {
                            "red": 173132,
                            "blue": 160460,
                            "green": 187348
                        },
                        "bonuses": [],
                        "objectives": [
                            {
                                "id": "38-131",
                                "type": "Spawn",
                                "owner": "Green",
                                "last_flipped": "2021-06-09T19:03:52Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "38-20",
                                "type": "Tower",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T09:25:01Z",
                                "claimed_by": "8AAA6DE3-1A0F-EB11-81A8-CDE2AC1EED30",
                                "claimed_at": "2021-06-11T09:36:04Z",
                                "points_tick": 10,
                                "points_capture": 10,
                                "yaks_delivered": 140,
                                "guild_upgrades": [
                                    329,
                                    345
                                ]
                            },
                            {
                                "id": "38-10",
                                "type": "Camp",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:19:07Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 3,
                                "points_capture": 3,
                                "yaks_delivered": 35,
                                "guild_upgrades": []
                            },
                            {
                                "id": "38-9",
                                "type": "Castle",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T10:42:35Z",
                                "claimed_by": "ED47ACDB-D884-E411-A3E6-AC162DC0E835",
                                "claimed_at": "2021-06-11T10:48:53Z",
                                "points_tick": 30,
                                "points_capture": 30,
                                "yaks_delivered": 140,
                                "guild_upgrades": [
                                    168,
                                    147,
                                    559,
                                    298,
                                    590,
                                    389
                                ]
                            },
                            {
                                "id": "38-4",
                                "type": "Camp",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:25:17Z",
                                "claimed_by": "5369C6A8-E00D-4356-A10C-AC1B57AD6426",
                                "claimed_at": "2021-06-11T15:25:40Z",
                                "points_tick": 3,
                                "points_capture": 3,
                                "yaks_delivered": 25,
                                "guild_upgrades": []
                            },
                            {
                                "id": "38-6",
                                "type": "Camp",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:31:14Z",
                                "claimed_by": "B0050D16-6CE3-E311-88E3-AC162DC0E835",
                                "claimed_at": "2021-06-11T15:36:13Z",
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 12,
                                "guild_upgrades": []
                            },
                            {
                                "id": "38-124",
                                "type": "Spawn",
                                "owner": "Red",
                                "last_flipped": "2021-06-09T19:03:52Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "38-11",
                                "type": "Tower",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T13:09:43Z",
                                "claimed_by": "6B7F8DD0-6AF8-4B8B-AF33-3F6C6F6D0A65",
                                "claimed_at": "2021-06-11T13:09:55Z",
                                "points_tick": 6,
                                "points_capture": 6,
                                "yaks_delivered": 47,
                                "guild_upgrades": [
                                    483,
                                    306
                                ]
                            },
                            {
                                "id": "38-12",
                                "type": "Tower",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:20:51Z",
                                "claimed_by": "303813E4-95D3-EA11-81A8-83C7278578E0",
                                "claimed_at": "2021-06-11T15:20:54Z",
                                "points_tick": 4,
                                "points_capture": 4,
                                "yaks_delivered": 16,
                                "guild_upgrades": []
                            },
                            {
                                "id": "38-5",
                                "type": "Camp",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:35:06Z",
                                "claimed_by": "2E3A7316-3F09-4341-A8E8-32CF942A727D",
                                "claimed_at": "2021-06-11T15:36:08Z",
                                "points_tick": 3,
                                "points_capture": 3,
                                "yaks_delivered": 21,
                                "guild_upgrades": []
                            },
                            {
                                "id": "38-16",
                                "type": "Tower",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T06:43:33Z",
                                "claimed_by": "5DF87C62-E637-E511-AF00-AC162DC028B5",
                                "claimed_at": "2021-06-11T06:44:30Z",
                                "points_tick": 10,
                                "points_capture": 10,
                                "yaks_delivered": 140,
                                "guild_upgrades": [
                                    583,
                                    147,
                                    559,
                                    513,
                                    399,
                                    306
                                ]
                            },
                            {
                                "id": "38-8",
                                "type": "Camp",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:42:52Z",
                                "claimed_by": "E87CF024-E267-E611-80D3-E83935B5B448",
                                "claimed_at": "2021-06-11T15:46:39Z",
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 2,
                                "guild_upgrades": []
                            },
                            {
                                "id": "38-1",
                                "type": "Keep",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T08:24:28Z",
                                "claimed_by": "6384CBDE-D86A-E911-81A8-B942C6BB2B96",
                                "claimed_at": "2021-06-11T08:29:17Z",
                                "points_tick": 20,
                                "points_capture": 20,
                                "yaks_delivered": 140,
                                "guild_upgrades": [
                                    418,
                                    329,
                                    559,
                                    178,
                                    590,
                                    306
                                ]
                            },
                            {
                                "id": "38-123",
                                "type": "Mercenary",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T13:05:48Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "38-22",
                                "type": "Tower",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T15:33:15Z",
                                "claimed_by": "7348C76C-EEA9-4CA6-A133-CC3890D8CE0B",
                                "claimed_at": "2021-06-11T15:33:33Z",
                                "points_tick": 4,
                                "points_capture": 4,
                                "yaks_delivered": 2,
                                "guild_upgrades": [
                                    306
                                ]
                            },
                            {
                                "id": "38-126",
                                "type": "Mercenary",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:37:36Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "38-17",
                                "type": "Tower",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:35:53Z",
                                "claimed_by": "61F73BB2-C952-EB11-81A9-971484D88F04",
                                "claimed_at": "2021-06-11T15:35:57Z",
                                "points_tick": 4,
                                "points_capture": 4,
                                "yaks_delivered": 4,
                                "guild_upgrades": []
                            },
                            {
                                "id": "38-14",
                                "type": "Tower",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:15:25Z",
                                "claimed_by": "A5470667-D7A8-EA11-81A8-CD1049069AE5",
                                "claimed_at": "2021-06-11T15:15:28Z",
                                "points_tick": 4,
                                "points_capture": 4,
                                "yaks_delivered": 11,
                                "guild_upgrades": []
                            },
                            {
                                "id": "38-125",
                                "type": "Mercenary",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T13:00:57Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "38-19",
                                "type": "Tower",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T09:27:08Z",
                                "claimed_by": "19B79742-DEC2-E811-81A8-D0A7E04E41B6",
                                "claimed_at": "2021-06-11T10:04:28Z",
                                "points_tick": 10,
                                "points_capture": 10,
                                "yaks_delivered": 140,
                                "guild_upgrades": [
                                    583,
                                    147,
                                    559,
                                    513,
                                    345,
                                    306
                                ]
                            },
                            {
                                "id": "38-3",
                                "type": "Keep",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T08:34:17Z",
                                "claimed_by": "72054096-9FC6-4847-908E-B6872CEEDAE4",
                                "claimed_at": "2021-06-11T10:04:07Z",
                                "points_tick": 20,
                                "points_capture": 20,
                                "yaks_delivered": 140,
                                "guild_upgrades": [
                                    418,
                                    147,
                                    559,
                                    178,
                                    590,
                                    389
                                ]
                            },
                            {
                                "id": "38-130",
                                "type": "Spawn",
                                "owner": "Blue",
                                "last_flipped": "2021-06-09T19:03:52Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "38-21",
                                "type": "Tower",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:44:47Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 4,
                                "points_capture": 4,
                                "yaks_delivered": 1,
                                "guild_upgrades": []
                            },
                            {
                                "id": "38-18",
                                "type": "Tower",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:48:35Z",
                                "claimed_by": "93595F2D-DCD6-E311-A8FE-AC162DC05865",
                                "claimed_at": "2021-06-11T15:48:42Z",
                                "points_tick": 4,
                                "points_capture": 4,
                                "yaks_delivered": 0,
                                "guild_upgrades": []
                            },
                            {
                                "id": "38-2",
                                "type": "Keep",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T03:09:51Z",
                                "claimed_by": "824B362C-5A0D-4E8A-B328-DC086702AD88",
                                "claimed_at": "2021-06-11T03:17:02Z",
                                "points_tick": 20,
                                "points_capture": 20,
                                "yaks_delivered": 140,
                                "guild_upgrades": [
                                    418,
                                    147,
                                    483,
                                    513,
                                    590,
                                    389
                                ]
                            },
                            {
                                "id": "38-7",
                                "type": "Camp",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T15:37:46Z",
                                "claimed_by": "8B85582F-42BD-4A07-AF6A-6D11DE137F62",
                                "claimed_at": "2021-06-11T15:37:52Z",
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 16,
                                "guild_upgrades": []
                            },
                            {
                                "id": "38-13",
                                "type": "Tower",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T08:36:43Z",
                                "claimed_by": "D6223D2A-6CAE-E611-80D3-441EA14F1E40",
                                "claimed_at": "2021-06-11T11:28:09Z",
                                "points_tick": 8,
                                "points_capture": 8,
                                "yaks_delivered": 113,
                                "guild_upgrades": [
                                    583,
                                    147,
                                    559,
                                    513,
                                    590,
                                    389
                                ]
                            },
                            {
                                "id": "38-15",
                                "type": "Tower",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T03:45:18Z",
                                "claimed_by": "810D3262-856C-EA11-81B7-AD7CCA945DAC",
                                "claimed_at": "2021-06-11T03:45:37Z",
                                "points_tick": 10,
                                "points_capture": 10,
                                "yaks_delivered": 140,
                                "guild_upgrades": [
                                    583,
                                    147,
                                    483,
                                    513,
                                    590,
                                    306
                                ]
                            }
                        ],
                        "deaths": {
                            "red": 18953,
                            "blue": 11171,
                            "green": 15347
                        },
                        "kills": {
                            "red": 16532,
                            "blue": 13372,
                            "green": 14397
                        }
                    },
                    {
                        "id": 1099,
                        "type": "RedHome",
                        "scores": {
                            "red": 164334,
                            "blue": 44570,
                            "green": 50645
                        },
                        "bonuses": [
                            {
                                "type": "Bloodlust",
                                "owner": "Red"
                            }
                        ],
                        "objectives": [
                            {
                                "id": "1099-116",
                                "type": "Camp",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:31:53Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 0,
                                "guild_upgrades": []
                            },
                            {
                                "id": "1099-118",
                                "type": "Ruins",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:44:42Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "1099-114",
                                "type": "Keep",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:49:35Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 8,
                                "points_capture": 8,
                                "yaks_delivered": 0,
                                "guild_upgrades": []
                            },
                            {
                                "id": "1099-107",
                                "type": "Spawn",
                                "owner": "Blue",
                                "last_flipped": "2021-06-09T19:05:03Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "1099-99",
                                "type": "Camp",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:41:45Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 5,
                                "guild_upgrades": []
                            },
                            {
                                "id": "1099-113",
                                "type": "Keep",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T08:53:00Z",
                                "claimed_by": "BD05AC45-6370-4B31-8C60-86FE9B8088B7",
                                "claimed_at": "2021-06-11T08:53:03Z",
                                "points_tick": 20,
                                "points_capture": 20,
                                "yaks_delivered": 140,
                                "guild_upgrades": [
                                    418,
                                    329,
                                    559,
                                    178,
                                    399,
                                    389
                                ]
                            },
                            {
                                "id": "1099-119",
                                "type": "Ruins",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:49:25Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "1099-115",
                                "type": "Camp",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:40:16Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 6,
                                "guild_upgrades": []
                            },
                            {
                                "id": "1099-110",
                                "type": "Tower",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T13:26:28Z",
                                "claimed_by": "1A38A4D5-30E2-41FB-8999-0DA9B8FA4DD5",
                                "claimed_at": "2021-06-11T14:04:57Z",
                                "points_tick": 4,
                                "points_capture": 4,
                                "yaks_delivered": 7,
                                "guild_upgrades": [
                                    483,
                                    306
                                ]
                            },
                            {
                                "id": "1099-106",
                                "type": "Keep",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T09:12:16Z",
                                "claimed_by": "19B79742-DEC2-E811-81A8-D0A7E04E41B6",
                                "claimed_at": "2021-06-11T10:14:08Z",
                                "points_tick": 16,
                                "points_capture": 16,
                                "yaks_delivered": 129,
                                "guild_upgrades": [
                                    418,
                                    147,
                                    483,
                                    178,
                                    590,
                                    306
                                ]
                            },
                            {
                                "id": "1099-122",
                                "type": "Ruins",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:41:45Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "1099-105",
                                "type": "Tower",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T15:04:15Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 6,
                                "points_capture": 6,
                                "yaks_delivered": 22,
                                "guild_upgrades": []
                            },
                            {
                                "id": "1099-102",
                                "type": "Tower",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T08:19:06Z",
                                "claimed_by": "2A5C012B-6D80-E711-80D4-E4115BE8E905",
                                "claimed_at": "2021-06-11T13:58:46Z",
                                "points_tick": 10,
                                "points_capture": 10,
                                "yaks_delivered": 140,
                                "guild_upgrades": []
                            },
                            {
                                "id": "1099-117",
                                "type": "Spawn",
                                "owner": "Red",
                                "last_flipped": "2021-06-09T19:05:03Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "1099-120",
                                "type": "Ruins",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:43:16Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "1099-109",
                                "type": "Camp",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:44:06Z",
                                "claimed_by": "FBA40DE5-43E7-43D1-A952-870C8634367D",
                                "claimed_at": "2021-06-11T15:44:08Z",
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 1,
                                "guild_upgrades": []
                            },
                            {
                                "id": "1099-101",
                                "type": "Camp",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:41:34Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 0,
                                "guild_upgrades": []
                            },
                            {
                                "id": "1099-121",
                                "type": "Ruins",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:48:07Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "1099-104",
                                "type": "Tower",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T15:41:09Z",
                                "claimed_by": "58FEC3BB-D098-4B8A-94CC-1AB90052B8A7",
                                "claimed_at": "2021-06-11T15:41:14Z",
                                "points_tick": 4,
                                "points_capture": 4,
                                "yaks_delivered": 1,
                                "guild_upgrades": []
                            },
                            {
                                "id": "1099-108",
                                "type": "Spawn",
                                "owner": "Green",
                                "last_flipped": "2021-06-09T19:05:03Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "1099-100",
                                "type": "Camp",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:48:18Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 0,
                                "guild_upgrades": []
                            }
                        ],
                        "deaths": {
                            "red": 6365,
                            "blue": 5514,
                            "green": 3307
                        },
                        "kills": {
                            "red": 6305,
                            "blue": 4245,
                            "green": 3411
                        }
                    },
                    {
                        "id": 96,
                        "type": "BlueHome",
                        "scores": {
                            "red": 52950,
                            "blue": 160061,
                            "green": 47143
                        },
                        "bonuses": [
                            {
                                "type": "Bloodlust",
                                "owner": "Blue"
                            }
                        ],
                        "objectives": [
                            {
                                "id": "96-53",
                                "type": "Camp",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:39:13Z",
                                "claimed_by": "8C37AD1C-48F9-42B3-8D37-D7EC4336A652",
                                "claimed_at": "2021-06-11T15:39:19Z",
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 0,
                                "guild_upgrades": []
                            },
                            {
                                "id": "96-40",
                                "type": "Tower",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T02:19:55Z",
                                "claimed_by": "3C34FC0A-CFB2-4F43-A12C-FBDEDA2B836B",
                                "claimed_at": "2021-06-11T02:32:42Z",
                                "points_tick": 8,
                                "points_capture": 8,
                                "yaks_delivered": 124,
                                "guild_upgrades": [
                                    583,
                                    147,
                                    559,
                                    513,
                                    590,
                                    306
                                ]
                            },
                            {
                                "id": "96-35",
                                "type": "Tower",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T14:29:36Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 4,
                                "points_capture": 4,
                                "yaks_delivered": 2,
                                "guild_upgrades": []
                            },
                            {
                                "id": "96-36",
                                "type": "Tower",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T14:58:01Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 6,
                                "points_capture": 6,
                                "yaks_delivered": 20,
                                "guild_upgrades": []
                            },
                            {
                                "id": "96-33",
                                "type": "Keep",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T15:16:22Z",
                                "claimed_by": "806214AC-B788-EA11-81A8-CDE2AC1EED30",
                                "claimed_at": "2021-06-11T15:16:24Z",
                                "points_tick": 8,
                                "points_capture": 8,
                                "yaks_delivered": 1,
                                "guild_upgrades": []
                            },
                            {
                                "id": "96-111",
                                "type": "Spawn",
                                "owner": "Blue",
                                "last_flipped": "2021-06-09T19:03:59Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "96-64",
                                "type": "Ruins",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T14:22:33Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "96-39",
                                "type": "Camp",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T15:38:50Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 2,
                                "guild_upgrades": []
                            },
                            {
                                "id": "96-52",
                                "type": "Camp",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T15:46:45Z",
                                "claimed_by": "41BAF1A9-803D-4410-8CF3-DE4EEB302880",
                                "claimed_at": "2021-06-11T15:46:47Z",
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 0,
                                "guild_upgrades": []
                            },
                            {
                                "id": "96-66",
                                "type": "Ruins",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T14:21:18Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "96-112",
                                "type": "Spawn",
                                "owner": "Red",
                                "last_flipped": "2021-06-09T19:03:59Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "96-34",
                                "type": "Camp",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:43:54Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 0,
                                "guild_upgrades": []
                            },
                            {
                                "id": "96-32",
                                "type": "Keep",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T14:55:38Z",
                                "claimed_by": "B958C1AF-D711-E511-A343-AC162DAE0BED",
                                "claimed_at": "2021-06-11T15:39:52Z",
                                "points_tick": 12,
                                "points_capture": 12,
                                "yaks_delivered": 23,
                                "guild_upgrades": []
                            },
                            {
                                "id": "96-62",
                                "type": "Ruins",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T15:35:28Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "96-51",
                                "type": "Camp",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:48:44Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 0,
                                "guild_upgrades": []
                            },
                            {
                                "id": "96-37",
                                "type": "Keep",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T02:32:01Z",
                                "claimed_by": "824B362C-5A0D-4E8A-B328-DC086702AD88",
                                "claimed_at": "2021-06-11T02:32:37Z",
                                "points_tick": 20,
                                "points_capture": 20,
                                "yaks_delivered": 140,
                                "guild_upgrades": [
                                    418,
                                    147,
                                    483,
                                    178,
                                    590,
                                    389
                                ]
                            },
                            {
                                "id": "96-103",
                                "type": "Spawn",
                                "owner": "Green",
                                "last_flipped": "2021-06-09T19:03:59Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "96-65",
                                "type": "Ruins",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T14:18:09Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "96-38",
                                "type": "Tower",
                                "owner": "Blue",
                                "last_flipped": "2021-06-10T04:54:16Z",
                                "claimed_by": "9CDFE94E-A596-E411-925A-AC162DAE5AD5",
                                "claimed_at": "2021-06-10T04:54:22Z",
                                "points_tick": 10,
                                "points_capture": 10,
                                "yaks_delivered": 140,
                                "guild_upgrades": [
                                    583,
                                    147,
                                    483,
                                    513,
                                    590,
                                    389
                                ]
                            },
                            {
                                "id": "96-50",
                                "type": "Camp",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T15:46:35Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 0,
                                "guild_upgrades": []
                            },
                            {
                                "id": "96-63",
                                "type": "Ruins",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T14:20:32Z",
                                "points_tick": 0,
                                "points_capture": 0
                            }
                        ],
                        "deaths": {
                            "red": 6930,
                            "blue": 7352,
                            "green": 5014
                        },
                        "kills": {
                            "red": 7589,
                            "blue": 6608,
                            "green": 4314
                        }
                    },
                    {
                        "id": 95,
                        "type": "GreenHome",
                        "scores": {
                            "red": 60859,
                            "blue": 42401,
                            "green": 149387
                        },
                        "bonuses": [
                            {
                                "type": "Bloodlust",
                                "owner": "Green"
                            }
                        ],
                        "objectives": [
                            {
                                "id": "95-53",
                                "type": "Camp",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:45:06Z",
                                "claimed_by": "5369C6A8-E00D-4356-A10C-AC1B57AD6426",
                                "claimed_at": "2021-06-11T15:47:01Z",
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 4,
                                "guild_upgrades": []
                            },
                            {
                                "id": "95-40",
                                "type": "Tower",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:27:23Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 4,
                                "points_capture": 4,
                                "yaks_delivered": 4,
                                "guild_upgrades": []
                            },
                            {
                                "id": "95-35",
                                "type": "Tower",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:45:24Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 4,
                                "points_capture": 4,
                                "yaks_delivered": 2,
                                "guild_upgrades": []
                            },
                            {
                                "id": "95-36",
                                "type": "Tower",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T04:08:06Z",
                                "claimed_by": "606429EF-33EB-E311-BC6C-AC162DC0070D",
                                "claimed_at": "2021-06-11T04:08:30Z",
                                "points_tick": 10,
                                "points_capture": 10,
                                "yaks_delivered": 140,
                                "guild_upgrades": [
                                    583,
                                    147,
                                    483,
                                    513,
                                    590,
                                    306
                                ]
                            },
                            {
                                "id": "95-33",
                                "type": "Keep",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:39:34Z",
                                "claimed_by": "2F581C8B-3F93-E911-81B7-AD7CCA945DAC",
                                "claimed_at": "2021-06-11T15:40:17Z",
                                "points_tick": 8,
                                "points_capture": 8,
                                "yaks_delivered": 5,
                                "guild_upgrades": []
                            },
                            {
                                "id": "95-111",
                                "type": "Spawn",
                                "owner": "Green",
                                "last_flipped": "2021-06-09T19:05:03Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "95-64",
                                "type": "Ruins",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T13:22:27Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "95-39",
                                "type": "Camp",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:05:56Z",
                                "claimed_by": "C57452E8-6DA1-4E7D-B007-E1D34FE368DF",
                                "claimed_at": "2021-06-11T15:05:58Z",
                                "points_tick": 3,
                                "points_capture": 3,
                                "yaks_delivered": 22,
                                "guild_upgrades": []
                            },
                            {
                                "id": "95-52",
                                "type": "Camp",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:31:06Z",
                                "claimed_by": "61F1F797-8544-E611-80D3-E4115BE8BBE8",
                                "claimed_at": "2021-06-11T15:31:17Z",
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 7,
                                "guild_upgrades": [
                                    383,
                                    562
                                ]
                            },
                            {
                                "id": "95-66",
                                "type": "Ruins",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T13:14:15Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "95-112",
                                "type": "Spawn",
                                "owner": "Blue",
                                "last_flipped": "2021-06-09T19:05:03Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "95-34",
                                "type": "Camp",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T15:46:24Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 0,
                                "guild_upgrades": []
                            },
                            {
                                "id": "95-32",
                                "type": "Keep",
                                "owner": "Red",
                                "last_flipped": "2021-06-11T06:51:25Z",
                                "claimed_by": "895172CA-B226-E711-80D3-AC162DC0847D",
                                "claimed_at": "2021-06-11T06:58:09Z",
                                "points_tick": 20,
                                "points_capture": 20,
                                "yaks_delivered": 140,
                                "guild_upgrades": [
                                    418,
                                    329,
                                    483,
                                    178,
                                    590,
                                    306
                                ]
                            },
                            {
                                "id": "95-62",
                                "type": "Ruins",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T13:42:13Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "95-51",
                                "type": "Camp",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:44:55Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 0,
                                "guild_upgrades": []
                            },
                            {
                                "id": "95-37",
                                "type": "Keep",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T15:23:10Z",
                                "claimed_by": "1B241205-DABD-E511-80D3-E4115BD7186D",
                                "claimed_at": "2021-06-11T15:23:39Z",
                                "points_tick": 8,
                                "points_capture": 8,
                                "yaks_delivered": 17,
                                "guild_upgrades": [
                                    483,
                                    389
                                ]
                            },
                            {
                                "id": "95-103",
                                "type": "Spawn",
                                "owner": "Red",
                                "last_flipped": "2021-06-09T19:05:03Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "95-65",
                                "type": "Ruins",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T12:52:10Z",
                                "points_tick": 0,
                                "points_capture": 0
                            },
                            {
                                "id": "95-38",
                                "type": "Tower",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T11:21:51Z",
                                "claimed_by": "D27065EA-4CEA-45FD-9AEC-28BA2B121D9F",
                                "claimed_at": "2021-06-11T11:39:36Z",
                                "points_tick": 6,
                                "points_capture": 6,
                                "yaks_delivered": 41,
                                "guild_upgrades": [
                                    583,
                                    329,
                                    483,
                                    513,
                                    399,
                                    306
                                ]
                            },
                            {
                                "id": "95-50",
                                "type": "Camp",
                                "owner": "Blue",
                                "last_flipped": "2021-06-11T15:44:15Z",
                                "claimed_by": null,
                                "claimed_at": null,
                                "points_tick": 2,
                                "points_capture": 2,
                                "yaks_delivered": 0,
                                "guild_upgrades": []
                            },
                            {
                                "id": "95-63",
                                "type": "Ruins",
                                "owner": "Green",
                                "last_flipped": "2021-06-11T13:43:23Z",
                                "points_tick": 0,
                                "points_capture": 0
                            }
                        ],
                        "deaths": {
                            "red": 7280,
                            "blue": 6324,
                            "green": 7693
                        },
                        "kills": {
                            "red": 6829,
                            "blue": 5681,
                            "green": 7887
                        }
                    }
                ]
            }
            """.trimIndent()
        )
    }

}