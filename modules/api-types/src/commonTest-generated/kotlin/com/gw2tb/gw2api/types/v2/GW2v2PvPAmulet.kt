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

class GW2v2PvpAmuletTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 4,
                "name": "Meucheler-Amulett",
                "icon": "https://render.guildwars2.com/file/02E9EFDEF9587130A25F17AC396913FBBE3C716D/455602.png",
                "attributes": {
                    "Precision": 1200,
                    "Power": 900,
                    "CritDamage": 900
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 8,
                "name": "Berserker-Amulett",
                "icon": "https://render.guildwars2.com/file/5044509F3DB0F391576CCAD891BC654DC5FE79B3/63600.png",
                "attributes": {
                    "Power": 1200,
                    "Precision": 900,
                    "CritDamage": 900
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 9,
                "name": "Faulendes Amulett",
                "icon": "https://render.guildwars2.com/file/AA26E9092621670E6C55A65307B7F43C0CC5F138/63595.png",
                "attributes": {
                    "ConditionDamage": 1200,
                    "Power": 900,
                    "Vitality": 900
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 13,
                "name": "Tollwütiges Amulett",
                "icon": "https://render.guildwars2.com/file/090C47B6BFC5F70B5BA83D3B0F4630A51F07ED34/220642.png",
                "attributes": {
                    "ConditionDamage": 1200,
                    "Precision": 900,
                    "Toughness": 900
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 14,
                "name": "Wüter-Amulett",
                "icon": "https://render.guildwars2.com/file/E156072918919C4CDCA9C075D04CE365B13F724F/220655.png",
                "attributes": {
                    "Precision": 1200,
                    "Power": 900,
                    "ConditionDamage": 900
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 18,
                "name": "Walküren-Amulett",
                "icon": "https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png",
                "attributes": {
                    "Power": 1200,
                    "Vitality": 900,
                    "CritDamage": 900
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 20,
                "name": "Marodeur-Amulett",
                "icon": "https://render.guildwars2.com/file/1A0ED77906F73270CE9CC2E67C68429DD3FAB43E/1010501.png",
                "attributes": {
                    "Power": 1000,
                    "Precision": 1000,
                    "CritDamage": 500,
                    "Vitality": 500
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 22,
                "name": "Finsteres Amulett",
                "icon": "https://render.guildwars2.com/file/6504267032DB14B7507F34685409563C283F08C6/222394.png",
                "attributes": {
                    "ConditionDamage": 1200,
                    "Power": 900,
                    "Precision": 900
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 29,
                "name": "Heilkundigen-Amulett",
                "icon": "https://render.guildwars2.com/file/F5BBC542A696001AAC085192C64EC5E6A2769D56/1341197.png",
                "attributes": {
                    "Power": 1000,
                    "Healing": 1000,
                    "Precision": 500,
                    "Vitality": 500
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 30,
                "name": "Paladin-Amulett",
                "icon": "https://render.guildwars2.com/file/690CCB0FF13943ABD065CECC056B9F439F12963F/1341199.png",
                "attributes": {
                    "Power": 1000,
                    "Precision": 1000,
                    "Toughness": 400,
                    "Vitality": 400
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 31,
                "name": "Weisen-Amulett",
                "icon": "https://render.guildwars2.com/file/58143BE0060D92D1CD32BBD99DD12102F811960A/1341200.png",
                "attributes": {
                    "Power": 1000,
                    "ConditionDamage": 1000,
                    "Vitality": 500,
                    "Healing": 500
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 34,
                "name": "Demolierer-Amulett",
                "icon": "https://render.guildwars2.com/file/C275399647F3744A0E0FEC071938B23EAE370704/1423719.png",
                "attributes": {
                    "Power": 1000,
                    "Precision": 1000,
                    "Toughness": 500,
                    "CritDamage": 500
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 35,
                "name": "Zerstörer-Amulett",
                "icon": "https://render.guildwars2.com/file/7FC9D25204099E6B4CB57D0C05BD24993F1E0627/1423720.png",
                "attributes": {
                    "Power": 1000,
                    "Precision": 1000,
                    "ConditionDamage": 500,
                    "CritDamage": 500
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 40,
                "name": "Zauberer-Amulett",
                "icon": "https://render.guildwars2.com/file/96079F0EB0C6CE0476D230AF7A05F4AAD4807207/1876172.png",
                "attributes": {
                    "Power": 1000,
                    "ConditionDamage": 1000,
                    "Vitality": 500,
                    "Precision": 500
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 41,
                "name": "Avatar-Amulett",
                "icon": "https://render.guildwars2.com/file/AD9E18AA3B1C69200946FA5342B9B5C6A7B05097/1876167.png",
                "attributes": {
                    "Power": 1000,
                    "Precision": 1000,
                    "Healing": 500,
                    "Vitality": 500
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 43,
                "name": "Trauerndes Amulett",
                "icon": "https://render.guildwars2.com/file/4C5B130518E4C07641C1CDD2AA0D62A176C852C5/1876168.png",
                "attributes": {
                    "Power": 1000,
                    "ConditionDamage": 1000,
                    "Precision": 500,
                    "CritDamage": 500
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 44,
                "name": "Marschal-Amulett",
                "icon": "https://render.guildwars2.com/file/E33ABC39C515C4F776B7F4F8B29C422A0752F478/1876170.png",
                "attributes": {
                    "Power": 1000,
                    "Healing": 1000,
                    "Precision": 500,
                    "ConditionDamage": 500
                }
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2PvpAmulet>(
            """
            {
                "id": 45,
                "name": "Säbelrassler-Amulett",
                "icon": "https://render.guildwars2.com/file/11A06FFE4CF0F92EF1BF65E87A99B5E8C4595028/1876171.png",
                "attributes": {
                    "Power": 1000,
                    "Precision": 1000,
                    "ConditionDamage": 500,
                    "Vitality": 500
                }
            }
            """.trimIndent()
        )
    }

}