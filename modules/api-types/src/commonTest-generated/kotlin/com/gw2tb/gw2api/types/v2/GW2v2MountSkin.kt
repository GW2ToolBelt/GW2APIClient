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

class GW2v2MountSkinTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2MountSkin>(
            """
            {
                "id": 1,
                "name": "Raptor",
                "icon": "https://render.guildwars2.com/file/2F4AAA52F573C5425BFCD7525FB70C9E6DCAD791/1766903.png",
                "dye_slots": [
                    {
                        "color_id": 19,
                        "material": "leather"
                    }
                ],
                "mount": "raptor"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2MountSkin>(
            """
            {
                "id": 2,
                "name": "Schweberochen",
                "icon": "https://render.guildwars2.com/file/BD357CB6A25EEFA961B974B6E980DFB0A396A5A4/1766901.png",
                "dye_slots": [
                    {
                        "color_id": 590,
                        "material": "leather"
                    }
                ],
                "mount": "skimmer"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2MountSkin>(
            """
            {
                "id": 329,
                "name": "Rennkuckuck",
                "icon": "https://render.guildwars2.com/file/B501D9066B2E04790ED7CA400CA820A5CF5F112A/2352258.png",
                "dye_slots": [
                    {
                        "color_id": 336,
                        "material": "cloth"
                    },
                    {
                        "color_id": 4,
                        "material": "cloth"
                    },
                    {
                        "color_id": 1576,
                        "material": "cloth"
                    },
                    {
                        "color_id": 673,
                        "material": "cloth"
                    }
                ],
                "mount": "raptor"
            }
            """.trimIndent()
        )
    }

}