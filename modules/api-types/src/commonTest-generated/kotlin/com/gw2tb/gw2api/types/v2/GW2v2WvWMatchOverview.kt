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

class GW2v2WvwMatchOverviewTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2WvwMatchOverview>(
            """
            {
                "id": "2-1",
                "worlds": {
                    "red": 2202,
                    "blue": 2007,
                    "green": 2002
                },
                "all_worlds": {
                    "red": [
                        2011,
                        2202
                    ],
                    "blue": [
                        2104,
                        2007
                    ],
                    "green": [
                        2008,
                        2002
                    ]
                },
                "start_time": "2021-04-09T18:00:00Z",
                "end_time": "2021-04-16T17:58:00Z"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2WvwMatchOverview>(
            """
            {
                "id": "2-2",
                "worlds": {
                    "red": 2207,
                    "blue": 2301,
                    "green": 2012
                },
                "all_worlds": {
                    "red": [
                        2001,
                        2207
                    ],
                    "blue": [
                        2301
                    ],
                    "green": [
                        2004,
                        2012
                    ]
                },
                "start_time": "2021-04-09T18:00:00Z",
                "end_time": "2021-04-16T17:58:00Z"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2WvwMatchOverview>(
            """
            {
                "id": "2-3",
                "worlds": {
                    "red": 2010,
                    "blue": 2005,
                    "green": 2204
                },
                "all_worlds": {
                    "red": [
                        2105,
                        2010
                    ],
                    "blue": [
                        2014,
                        2005
                    ],
                    "green": [
                        2206,
                        2204
                    ]
                },
                "start_time": "2021-04-09T18:00:00Z",
                "end_time": "2021-04-16T17:58:00Z"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2WvwMatchOverview>(
            """
            {
                "id": "2-4",
                "worlds": {
                    "red": 2003,
                    "blue": 2101,
                    "green": 2013
                },
                "all_worlds": {
                    "red": [
                        2102,
                        2003
                    ],
                    "blue": [
                        2103,
                        2101
                    ],
                    "green": [
                        2009,
                        2013
                    ]
                },
                "start_time": "2021-04-09T18:00:00Z",
                "end_time": "2021-04-16T17:58:00Z"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2WvwMatchOverview>(
            """
            {
                "id": "2-5",
                "worlds": {
                    "red": 2203,
                    "blue": 2205,
                    "green": 2006
                },
                "all_worlds": {
                    "red": [
                        2203
                    ],
                    "blue": [
                        2201,
                        2205
                    ],
                    "green": [
                        2006
                    ]
                },
                "start_time": "2021-04-09T18:00:00Z",
                "end_time": "2021-04-16T17:58:00Z"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2WvwMatchOverview>(
            """
            {
                "id": "1-1",
                "worlds": {
                    "red": 1020,
                    "blue": 1016,
                    "green": 1019
                },
                "all_worlds": {
                    "red": [
                        1017,
                        1020
                    ],
                    "blue": [
                        1015,
                        1016
                    ],
                    "green": [
                        1018,
                        1019
                    ]
                },
                "start_time": "2021-04-10T02:00:00Z",
                "end_time": "2021-04-17T01:58:00Z"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2WvwMatchOverview>(
            """
            {
                "id": "1-2",
                "worlds": {
                    "red": 1001,
                    "blue": 1009,
                    "green": 1004
                },
                "all_worlds": {
                    "red": [
                        1002,
                        1001
                    ],
                    "blue": [
                        1022,
                        1009
                    ],
                    "green": [
                        1011,
                        1004
                    ]
                },
                "start_time": "2021-04-10T02:00:00Z",
                "end_time": "2021-04-17T01:58:00Z"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2WvwMatchOverview>(
            """
            {
                "id": "1-3",
                "worlds": {
                    "red": 1012,
                    "blue": 1014,
                    "green": 1008
                },
                "all_worlds": {
                    "red": [
                        1007,
                        1012
                    ],
                    "blue": [
                        1024,
                        1014
                    ],
                    "green": [
                        1013,
                        1008
                    ]
                },
                "start_time": "2021-04-10T02:00:00Z",
                "end_time": "2021-04-17T01:58:00Z"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2WvwMatchOverview>(
            """
            {
                "id": "1-4",
                "worlds": {
                    "red": 1021,
                    "blue": 1005,
                    "green": 1003
                },
                "all_worlds": {
                    "red": [
                        1023,
                        1021
                    ],
                    "blue": [
                        1006,
                        1005
                    ],
                    "green": [
                        1010,
                        1003
                    ]
                },
                "start_time": "2021-04-10T02:00:00Z",
                "end_time": "2021-04-17T01:58:00Z"
            }
            """.trimIndent()
        )
    }

}