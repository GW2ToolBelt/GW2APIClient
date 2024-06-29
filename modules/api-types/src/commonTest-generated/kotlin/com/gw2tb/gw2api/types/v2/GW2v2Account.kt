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

class GW2v2AccountTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Account>(
            """
            {
                "id": "123E4567-E89B-12D3-A456-426614174000",
                "name": "Shooterking.1234",
                "age": 10744800,
                "last_modified": "2021-01-06T14:14:00Z",
                "world": 2201,
                "guilds": [
                    "123E4567-E89B-12D3-A456-426614174000",
                    "4FB44673-C2CF-E611-80D3-AC162DC085C0"
                ],
                "guild_leader": [
                    "123E4567-E89B-12D3-A456-426614174000"
                ],
                "created": "2015-11-03T15:49:00Z",
                "access": [
                    "GuildWars2",
                    "HeartOfThorns",
                    "PlayForFree",
                    "PathOfFire"
                ],
                "commander": true,
                "fractal_level": 100,
                "daily_ap": 3225,
                "monthly_ap": 0,
                "wvw_rank": 370,
                "build_storage_slots": 6
            }
            """.trimIndent()
        )
    }

}