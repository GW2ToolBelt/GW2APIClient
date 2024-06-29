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

class GW2v1WvwMatchDetailsTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v1WvwMatchDetails>(
            """
            {
                "match_id": "2-1",
                "scores": [
                    82462,
                    50482,
                    126869
                ],
                "maps": [
                    {
                        "type": "Center",
                        "scores": [
                            30202,
                            20885,
                            48858
                        ],
                        "bonuses": [],
                        "objectives": [
                            {
                                "id": 131,
                                "owner": "Green"
                            },
                            {
                                "id": 20,
                                "owner": "Red",
                                "owner_guild": "310FD997-A506-E711-80D3-E4115BD7B405"
                            },
                            {
                                "id": 10,
                                "owner": "Green",
                                "owner_guild": "1B241205-DABD-E511-80D3-E4115BD7186D"
                            },
                            {
                                "id": 9,
                                "owner": "Green",
                                "owner_guild": "C7E29445-C48B-EA11-81A8-F161567B2263"
                            },
                            {
                                "id": 4,
                                "owner": "Green",
                                "owner_guild": "848AC23C-F1CF-4030-88D2-42B25C483758"
                            },
                            {
                                "id": 6,
                                "owner": "Red"
                            },
                            {
                                "id": 124,
                                "owner": "Red"
                            },
                            {
                                "id": 11,
                                "owner": "Green",
                                "owner_guild": "9048F5AB-5D79-E711-80D3-E4115BD7186D"
                            },
                            {
                                "id": 12,
                                "owner": "Green",
                                "owner_guild": "AFF21519-1B24-41C9-9AAA-F4C9B9C13B8E"
                            },
                            {
                                "id": 5,
                                "owner": "Red"
                            },
                            {
                                "id": 16,
                                "owner": "Green"
                            },
                            {
                                "id": 8,
                                "owner": "Red",
                                "owner_guild": "261499CB-DF55-E711-80D3-E83935B5B448"
                            },
                            {
                                "id": 1,
                                "owner": "Red",
                                "owner_guild": "0C5F015C-1DD3-E911-81A8-E944283D67C1"
                            },
                            {
                                "id": 123,
                                "owner": "Green"
                            },
                            {
                                "id": 22,
                                "owner": "Blue"
                            },
                            {
                                "id": 126,
                                "owner": "Green"
                            },
                            {
                                "id": 17,
                                "owner": "Green"
                            },
                            {
                                "id": 14,
                                "owner": "Green",
                                "owner_guild": "5E797E1E-60BC-E411-AF00-AC162DC028B5"
                            },
                            {
                                "id": 125,
                                "owner": "Red"
                            },
                            {
                                "id": 19,
                                "owner": "Red",
                                "owner_guild": "518DA20E-4697-E311-8BA5-AC162DAAE275"
                            },
                            {
                                "id": 3,
                                "owner": "Green",
                                "owner_guild": "89A3721B-1E6C-E911-81B7-AD7CCA945DAC"
                            },
                            {
                                "id": 130,
                                "owner": "Blue"
                            },
                            {
                                "id": 21,
                                "owner": "Green"
                            },
                            {
                                "id": 18,
                                "owner": "Green"
                            },
                            {
                                "id": 2,
                                "owner": "Blue",
                                "owner_guild": "52E59078-0AF4-E411-925A-AC162DAE5AD5"
                            },
                            {
                                "id": 7,
                                "owner": "Green",
                                "owner_guild": "9974EFC2-F382-E911-81AA-A77AA130EAB8"
                            },
                            {
                                "id": 13,
                                "owner": "Green",
                                "owner_guild": "D86B68CA-01B2-E511-80D4-E4115BD19D24"
                            },
                            {
                                "id": 15,
                                "owner": "Blue",
                                "owner_guild": "29F66DC8-7CE0-E411-A3E6-AC162DC0E835"
                            }
                        ]
                    },
                    {
                        "type": "RedHome",
                        "scores": [
                            30669,
                            6437,
                            22559
                        ],
                        "bonuses": [
                            {
                                "type": "Bloodlust",
                                "owner": "Red"
                            }
                        ],
                        "objectives": [
                            {
                                "id": 116,
                                "owner": "Blue",
                                "owner_guild": "3E0CB3AE-F780-E311-BC6C-AC162DC0070D"
                            },
                            {
                                "id": 118,
                                "owner": "Red"
                            },
                            {
                                "id": 114,
                                "owner": "Red",
                                "owner_guild": "ECBC561A-7FD9-E411-A278-AC162DC0070D"
                            },
                            {
                                "id": 107,
                                "owner": "Blue"
                            },
                            {
                                "id": 99,
                                "owner": "Red",
                                "owner_guild": "DC30858F-1E85-4176-BBBE-2F609B22D6DE"
                            },
                            {
                                "id": 113,
                                "owner": "Red",
                                "owner_guild": "A1881F59-F59A-48CB-8CAA-877F6F0F8287"
                            },
                            {
                                "id": 119,
                                "owner": "Red"
                            },
                            {
                                "id": 115,
                                "owner": "Red"
                            },
                            {
                                "id": 110,
                                "owner": "Green",
                                "owner_guild": "1B241205-DABD-E511-80D3-E4115BD7186D"
                            },
                            {
                                "id": 106,
                                "owner": "Green",
                                "owner_guild": "4F851848-B3F8-E311-A006-AC162DAAE275"
                            },
                            {
                                "id": 122,
                                "owner": "Red"
                            },
                            {
                                "id": 105,
                                "owner": "Red",
                                "owner_guild": "D6759823-3E4F-E911-81A8-CDE2AC1EED30"
                            },
                            {
                                "id": 102,
                                "owner": "Red",
                                "owner_guild": "45F97544-A93B-E911-81A8-F161567B2263"
                            },
                            {
                                "id": 117,
                                "owner": "Red"
                            },
                            {
                                "id": 120,
                                "owner": "Red"
                            },
                            {
                                "id": 109,
                                "owner": "Red"
                            },
                            {
                                "id": 101,
                                "owner": "Blue"
                            },
                            {
                                "id": 121,
                                "owner": "Red"
                            },
                            {
                                "id": 104,
                                "owner": "Red",
                                "owner_guild": "9C4C14D0-6E96-E411-925A-AC162DAE5AD5"
                            },
                            {
                                "id": 108,
                                "owner": "Green"
                            },
                            {
                                "id": 100,
                                "owner": "Blue",
                                "owner_guild": "92C3D1C5-C783-4846-B48C-7C004B01DB87"
                            }
                        ]
                    },
                    {
                        "type": "BlueHome",
                        "scores": [
                            11307,
                            17124,
                            19572
                        ],
                        "bonuses": [
                            {
                                "type": "Bloodlust",
                                "owner": "Blue"
                            }
                        ],
                        "objectives": [
                            {
                                "id": 53,
                                "owner": "Red",
                                "owner_guild": "6D6860BB-0AF2-4305-BC69-10B8147D8D71"
                            },
                            {
                                "id": 40,
                                "owner": "Blue",
                                "owner_guild": "D35728A0-A853-43C1-B73B-616D3A402496"
                            },
                            {
                                "id": 35,
                                "owner": "Red",
                                "owner_guild": "D6759823-3E4F-E911-81A8-CDE2AC1EED30"
                            },
                            {
                                "id": 36,
                                "owner": "Green",
                                "owner_guild": "9E07A0AA-BC78-E811-81A8-B942C6BB2B96"
                            },
                            {
                                "id": 33,
                                "owner": "Red",
                                "owner_guild": "E33B6E88-1E8B-4E55-97F6-192DFBDA1F92"
                            },
                            {
                                "id": 111,
                                "owner": "Blue"
                            },
                            {
                                "id": 64,
                                "owner": "Blue"
                            },
                            {
                                "id": 39,
                                "owner": "Blue",
                                "owner_guild": "0887D559-6009-E511-A34A-E4115BDF481D"
                            },
                            {
                                "id": 52,
                                "owner": "Green"
                            },
                            {
                                "id": 66,
                                "owner": "Blue"
                            },
                            {
                                "id": 112,
                                "owner": "Red"
                            },
                            {
                                "id": 34,
                                "owner": "Red",
                                "owner_guild": "490293E8-7E40-4276-A71B-3D103D7243CA"
                            },
                            {
                                "id": 32,
                                "owner": "Green",
                                "owner_guild": "22D70408-838A-E611-80D3-E4115BD7B405"
                            },
                            {
                                "id": 62,
                                "owner": "Blue"
                            },
                            {
                                "id": 51,
                                "owner": "Green"
                            },
                            {
                                "id": 37,
                                "owner": "Blue",
                                "owner_guild": "D60D6E5C-A7B5-47EB-97D0-6E3F46ECA550"
                            },
                            {
                                "id": 103,
                                "owner": "Green"
                            },
                            {
                                "id": 65,
                                "owner": "Blue"
                            },
                            {
                                "id": 38,
                                "owner": "Blue",
                                "owner_guild": "B70D21BB-272B-E511-AF00-AC162DC028B5"
                            },
                            {
                                "id": 50,
                                "owner": "Green"
                            },
                            {
                                "id": 63,
                                "owner": "Blue"
                            }
                        ]
                    },
                    {
                        "type": "GreenHome",
                        "scores": [
                            10284,
                            6036,
                            35880
                        ],
                        "bonuses": [
                            {
                                "type": "Bloodlust",
                                "owner": "Green"
                            }
                        ],
                        "objectives": [
                            {
                                "id": 53,
                                "owner": "Blue",
                                "owner_guild": "762C0271-9FEB-428D-B50B-9CF666BAA7B8"
                            },
                            {
                                "id": 40,
                                "owner": "Green",
                                "owner_guild": "519F61B2-8473-E511-AEFB-AC162DC05865"
                            },
                            {
                                "id": 35,
                                "owner": "Blue",
                                "owner_guild": "CB328554-BA05-E711-80D4-E4115BE8E905"
                            },
                            {
                                "id": 36,
                                "owner": "Red",
                                "owner_guild": "CA28EB4F-39A7-4A32-9F39-2620F674E8BB"
                            },
                            {
                                "id": 33,
                                "owner": "Green",
                                "owner_guild": "367BEEC3-BD11-E411-A6E5-AC162DC0E835"
                            },
                            {
                                "id": 111,
                                "owner": "Green"
                            },
                            {
                                "id": 64,
                                "owner": "Green"
                            },
                            {
                                "id": 39,
                                "owner": "Green",
                                "owner_guild": "3351E3BA-1AD3-E711-81A1-06A730DD8514"
                            },
                            {
                                "id": 52,
                                "owner": "Green"
                            },
                            {
                                "id": 66,
                                "owner": "Green"
                            },
                            {
                                "id": 112,
                                "owner": "Blue"
                            },
                            {
                                "id": 34,
                                "owner": "Blue"
                            },
                            {
                                "id": 32,
                                "owner": "Green",
                                "owner_guild": "61F1F797-8544-E611-80D3-E4115BE8BBE8"
                            },
                            {
                                "id": 62,
                                "owner": "Green"
                            },
                            {
                                "id": 51,
                                "owner": "Green",
                                "owner_guild": "E5284EA6-17E3-46D5-8171-9622E57A5F0F"
                            },
                            {
                                "id": 37,
                                "owner": "Green",
                                "owner_guild": "D109E8AC-4C0D-E511-A3E6-AC162DC0E835"
                            },
                            {
                                "id": 103,
                                "owner": "Red"
                            },
                            {
                                "id": 65,
                                "owner": "Green"
                            },
                            {
                                "id": 38,
                                "owner": "Green",
                                "owner_guild": "0FF5F05C-00E1-E711-81A1-12F8D90C0B0C"
                            },
                            {
                                "id": 50,
                                "owner": "Blue"
                            },
                            {
                                "id": 63,
                                "owner": "Green"
                            }
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }

}