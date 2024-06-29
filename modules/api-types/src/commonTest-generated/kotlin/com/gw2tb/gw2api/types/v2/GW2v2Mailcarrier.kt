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

class GW2v2MailcarrierTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 1,
                "unlock_items": [
                    68102
                ],
                "order": 4,
                "icon": "https://render.guildwars2.com/file/DC800626B873260155C528297325C07635FFD41E/924620.png",
                "name": "Konfetti-Briefzustellung",
                "flags": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 2,
                "unlock_items": [
                    68682
                ],
                "order": 10,
                "icon": "https://render.guildwars2.com/file/E7D86E3AD54E64AEDD9493E5D86C6919019C02B5/1001225.png",
                "name": "Sylvari-Samenkapsel-Briefbote",
                "flags": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 3,
                "unlock_items": [
                    68104
                ],
                "order": 2,
                "icon": "https://render.guildwars2.com/file/2A18167F02E75F1C49EB0C9ABC357E0A593FB573/919383.png",
                "name": "Geschenkzustellung",
                "flags": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 4,
                "unlock_items": [],
                "order": 0,
                "icon": "https://render.guildwars2.com/file/2364A16ED4095005A090712A4910BF2701B77A0C/919381.png",
                "name": "Brieftaube",
                "flags": [
                    "Default"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 5,
                "unlock_items": [
                    68106
                ],
                "order": 1,
                "icon": "https://render.guildwars2.com/file/07AFEFDA0FF3F44601610E292DFDA206DB381663/919385.png",
                "name": "Greif-Briefbote",
                "flags": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 6,
                "unlock_items": [
                    67355
                ],
                "order": 3,
                "icon": "https://render.guildwars2.com/file/ADA62A66C990014A98273DC4BE7A489EEB185BA8/919387.png",
                "name": "Geisterhafter Briefbote",
                "flags": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 7,
                "unlock_items": [
                    68652
                ],
                "order": 4,
                "icon": "https://render.guildwars2.com/file/0E2B17C5FE901067A868CEEB62803F0848A501DF/947659.png",
                "name": "Briefbote des Roten Kuverts",
                "flags": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 8,
                "unlock_items": [
                    68681
                ],
                "order": 8,
                "icon": "https://render.guildwars2.com/file/1A08C03BB5B15734AF50DD3B0C4C035E2CF61027/951781.png",
                "name": "Schnee-Eulen-Briefbote",
                "flags": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 9,
                "unlock_items": [
                    69774
                ],
                "order": 7,
                "icon": "https://render.guildwars2.com/file/013199A493B300C70224FD7AD4BE4E2CDA136E9D/951780.png",
                "name": "Papageien-Briefbote",
                "flags": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 10,
                "unlock_items": [
                    69745
                ],
                "order": 6,
                "icon": "https://render.guildwars2.com/file/75B0F8F975120D141E501208555E34FD0808FFC9/951779.png",
                "name": "Raben-Briefbote",
                "flags": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 11,
                "unlock_items": [
                    69628
                ],
                "order": 5,
                "icon": "https://render.guildwars2.com/file/B8CA4C59A1EE5754777AE3CA5862451745B8A50B/978004.png",
                "name": "Piloten-Quaggan-Briefbote",
                "flags": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 12,
                "unlock_items": [
                    69715
                ],
                "order": 9,
                "icon": "https://render.guildwars2.com/file/06DD0A07EC2065FDC2984D6EF87F53D5AD3A6599/991355.png",
                "name": "Widergänger-Briefbote",
                "flags": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 13,
                "unlock_items": [
                    67863
                ],
                "order": 3,
                "icon": "https://render.guildwars2.com/file/E4FF1D42FFAA7F58681724F95D552410EC7F7880/1024007.png",
                "name": "Erhabener Briefbote",
                "flags": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 14,
                "unlock_items": [
                    78088
                ],
                "order": 5,
                "icon": "https://render.guildwars2.com/file/11A8F16BC73F94462250F15442EE50B5DD44991D/1418372.png",
                "name": "Super-Bienenhund-Briefbote",
                "flags": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 15,
                "unlock_items": [
                    79341
                ],
                "order": 9,
                "icon": "https://render.guildwars2.com/file/B204ED019F2019C5F40B032C0ED9087CE41F1E30/1478774.png",
                "name": "Jahrestags-Briefbote",
                "flags": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2Mailcarrier>(
            """
            {
                "id": 16,
                "unlock_items": [
                    81215
                ],
                "order": 22,
                "icon": "https://render.guildwars2.com/file/B18044E2D30F29A4BC69BD5BE775BE36B8F3DE96/1691565.png",
                "name": "Briefbote \"Balthasars Hunde\"",
                "flags": []
            }
            """.trimIndent()
        )
    }

}