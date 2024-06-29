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

class GW2v2EmblemPartTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2EmblemPart>(
            """
            {
                "id": 1,
                "layers": [
                    "https://render.guildwars2.com/file/F90A286E11257C357965269863F636CCF8D11EDB/59641.png",
                    "https://render.guildwars2.com/file/E4EA93330BF9EF03917EDF0CBE616411F5383D7F/59643.png",
                    "https://render.guildwars2.com/file/A7E731CF0BFF5EB890C3CA2F0F019901261C4755/59645.png"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2EmblemPart>(
            """
            {
                "id": 2,
                "layers": [
                    "https://render.guildwars2.com/file/F3F9C650FFA87BE906105829CB95D91BEC0A0746/59647.png",
                    "https://render.guildwars2.com/file/F3230BAADC49933F0C01F103631EAB0BC1D3AF52/59649.png",
                    "https://render.guildwars2.com/file/ADFDC592191F7EFB98441423EA012EEDC0A2F318/59651.png"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2EmblemPart>(
            """
            {
                "id": 3,
                "layers": [
                    "https://render.guildwars2.com/file/0D3925B962B318EF945CEB63F4F0E803DB77DF75/59653.png",
                    "https://render.guildwars2.com/file/5A163F727053CA4EE46F602628092B62C0CA5E90/59655.png",
                    "https://render.guildwars2.com/file/80DF9F933B002D15A92394F507DDD7967BB8F5F7/59657.png",
                    "https://render.guildwars2.com/file/0F462C4859701663FCC5BFB60C2A3F74E007D4B1/59659.png"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2EmblemPart>(
            """
            {
                "id": 4,
                "layers": [
                    "https://render.guildwars2.com/file/9B0EB7A549B94C3BAC0B5918D6CD6314324234B9/59661.png",
                    "https://render.guildwars2.com/file/47F41E9B2243283A9C94C46A723CC2057A54ADB5/59663.png",
                    "https://render.guildwars2.com/file/9305F7321A96B7ABC435FBBE185703BE4B9C056C/59665.png"
                ]
            }
            """.trimIndent()
        )
    }

}