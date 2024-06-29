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

class GW2v1WvwMatchesTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v1WvwMatches>(
            """
            {
                "wvw_matches": [
                    {
                        "wvw_match_id": "2-1",
                        "red_world_id": 2003,
                        "blue_world_id": 2007,
                        "green_world_id": 2002,
                        "start_time": "2021-04-30T18:00:00Z",
                        "end_time": "2021-05-07T17:58:00Z"
                    },
                    {
                        "wvw_match_id": "2-2",
                        "red_world_id": 2204,
                        "blue_world_id": 2202,
                        "green_world_id": 2207,
                        "start_time": "2021-04-30T18:00:00Z",
                        "end_time": "2021-05-07T17:58:00Z"
                    },
                    {
                        "wvw_match_id": "2-3",
                        "red_world_id": 2205,
                        "blue_world_id": 2010,
                        "green_world_id": 2012,
                        "start_time": "2021-04-30T18:00:00Z",
                        "end_time": "2021-05-07T17:58:00Z"
                    },
                    {
                        "wvw_match_id": "2-4",
                        "red_world_id": 2101,
                        "blue_world_id": 2301,
                        "green_world_id": 2005,
                        "start_time": "2021-04-30T18:00:00Z",
                        "end_time": "2021-05-07T17:58:00Z"
                    },
                    {
                        "wvw_match_id": "2-5",
                        "red_world_id": 2006,
                        "blue_world_id": 2013,
                        "green_world_id": 2203,
                        "start_time": "2021-04-30T18:00:00Z",
                        "end_time": "2021-05-07T17:58:00Z"
                    },
                    {
                        "wvw_match_id": "1-1",
                        "red_world_id": 1001,
                        "blue_world_id": 1016,
                        "green_world_id": 1020,
                        "start_time": "2021-05-01T02:00:00Z",
                        "end_time": "2021-05-08T01:58:00Z"
                    },
                    {
                        "wvw_match_id": "1-2",
                        "red_world_id": 1008,
                        "blue_world_id": 1005,
                        "green_world_id": 1019,
                        "start_time": "2021-05-01T02:00:00Z",
                        "end_time": "2021-05-08T01:58:00Z"
                    },
                    {
                        "wvw_match_id": "1-3",
                        "red_world_id": 1004,
                        "blue_world_id": 1012,
                        "green_world_id": 1009,
                        "start_time": "2021-05-01T02:00:00Z",
                        "end_time": "2021-05-08T01:58:00Z"
                    },
                    {
                        "wvw_match_id": "1-4",
                        "red_world_id": 1021,
                        "blue_world_id": 1003,
                        "green_world_id": 1014,
                        "start_time": "2021-05-01T02:00:00Z",
                        "end_time": "2021-05-08T01:58:00Z"
                    }
                ]
            }
            """.trimIndent()
        )
    }

}