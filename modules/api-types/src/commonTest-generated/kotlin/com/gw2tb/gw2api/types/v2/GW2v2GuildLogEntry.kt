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

class GW2v2GuildLogEntryTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2GuildLogEntry>(
            """
            {
                "id": 1190,
                "time": "2015-12-10T23:58:49.106Z",
                "type": "treasury",
                "user": "Lawton Campbell.9413",
                "item_id": 24299,
                "count": 150
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2GuildLogEntry>(
            """
            {
                "id": 1111,
                "time": "2015-12-10T23:52:01.099Z",
                "type": "motd",
                "user": "Lawton Campbell.9413",
                "motd": "FSFOSDFJS"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2GuildLogEntry>(
            """
            {
                "id": 1375,
                "time": "2016-02-16T01:08:07.538Z",
                "type": "invited",
                "user": "Lawton Campbell.9413",
                "invited_by": "Lawton Campbell.9413"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2GuildLogEntry>(
            """
            {
                "id": 1533,
                "time": "2016-03-04T18:54:02.785Z",
                "type": "stash",
                "user": "Lawton Campbell.9413",
                "operation": "deposit",
                "item_id": 0,
                "count": 0,
                "coins": 20000
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2GuildLogEntry>(
            """
            {
                "id": 1286,
                "time": "2015-12-23T00:48:20.539Z",
                "type": "upgrade",
                "upgrade_id": 364,
                "action": "queued",
                "user": "Lawton Campbell.9413"
            }
            """.trimIndent()
        )
    }

}