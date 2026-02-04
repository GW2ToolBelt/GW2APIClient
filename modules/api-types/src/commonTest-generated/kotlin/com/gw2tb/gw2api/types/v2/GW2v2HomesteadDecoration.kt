/*
 * Copyright (c) 2018-2026 Leon Linhart
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

class GW2v2HomesteadDecorationTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 136,
                "name": "Guild Catapult Siege",
                "description": "Earned by participating in skirmishes.",
                "categories": [
                    11
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/D002621C023C32479913214BC65CDB6D20ED681F/1701379.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 140,
                "name": "Sandstone Pillar",
                "description": "Crafted by scribes.",
                "categories": [
                    16,
                    1
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/A2DBDD1E546A2F5EDAC301BA07FEA20F1B1C12A7/1223799.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 143,
                "name": "Kodan Woodsy Trunk",
                "description": "",
                "categories": [
                    3,
                    19
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/7FA94614BCDAD457DD294EDDFF4B6C290035EA79/3375046.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 148,
                "name": "Djinn Launching Device",
                "description": "",
                "categories": [
                    14
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/7BB87C5B0259FBA253061810AF019A08FA2906DE/2155897.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 149,
                "name": "Signal Lantern",
                "description": "",
                "categories": [
                    16,
                    5
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/712B1E6495B47C632A9D9CE40ECA5E2104139F9E/1769506.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 150,
                "name": "Empty Square Planter",
                "description": "Crafted by scribes.",
                "categories": [
                    6
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/ECD6C6FC05A151415E9431074BCE4D721A1E5002/1224077.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 152,
                "name": "Mushroom",
                "description": "Crafted by scribes.",
                "categories": [
                    7
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/6AE24FC1C7485839AA790F1C6FCDE8A76653BEC4/1224794.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 153,
                "name": "Potted Broad Paddlefrond",
                "description": "Crafted by scribes.",
                "categories": [
                    6,
                    15
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/B1291C70ED54E5E8253BB952550BDCF02EA03351/1225863.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 154,
                "name": "Kodan Writing Desk",
                "description": "",
                "categories": [
                    19,
                    3
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/5B480E36EC11ECB008A21E916506FA6128FBE9CB/3374998.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 158,
                "name": "Comprehensive Disciplines Research Commemorative Statue",
                "description": "Veteran reward for having a completely upgraded guild before Heart of Thorns.",
                "categories": [
                    9
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/B118050E57EE22C1A3F1E52830582EE861AA65CA/1225653.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 162,
                "name": "Effervescent Pod",
                "description": "",
                "categories": [
                    7
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/46CCB10AEBE5BD5ACA7C605DA532DFC40EB3E13F/2140507.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 164,
                "name": "Elonian Teapot",
                "description": "",
                "categories": [
                    16,
                    4
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/A9387B18CFFA01F9475B0A161173794E61010F01/1769524.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 167,
                "name": "Guild Chair",
                "description": "",
                "categories": [
                    2
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/5212D7422B5C22CBD9F5A5290E9BDEA66FB609D8/1225930.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 168,
                "name": "Guild Shield Generator Siege",
                "description": "Earned by participating in skirmishes.",
                "categories": [
                    11
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/537B67BAEF0D1DFABAF61C4EF60D1B266F741763/1701385.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 169,
                "name": "Potted Fan Palm",
                "description": "Crafted by scribes.",
                "categories": [
                    6,
                    15
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/C217C513FC0C2B0746A4B4FAE8F210B707E4CE90/1225825.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 171,
                "name": "Basic Commemorative Statue",
                "description": "A simple commemoration of a momentous event.",
                "categories": [
                    9
                ],
                "max_count": 15,
                "icon": "https://render.guildwars2.com/file/0D17200C24050EAF9FAFBC44EAA45A3A5CED7102/1466237.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 173,
                "name": "Mists Drake Statue",
                "description": "Crafted by scribes.",
                "categories": [
                    9
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/D3069FDD1B55A076D4BD0BDE964864F521344E51/1228102.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 179,
                "name": "Obstacle: Lava Floor",
                "description": "",
                "categories": [
                    11
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/05D8527D664E1599A33F499DA89E0AD9BD66C30F/1202572.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 184,
                "name": "Tea Set",
                "description": "",
                "categories": [
                    19,
                    4
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/540D713F57070AAA1DF126026A2D7B971FDEFC07/3374976.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 185,
                "name": "Square Candlestick",
                "description": "Crafted by scribes.",
                "categories": [
                    5
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/69199C0E95BA240B6CA6ACED5CE60C72C1BB7E03/1227595.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 186,
                "name": "Basic Signpost",
                "description": "A simple sign for directing passersby.",
                "categories": [
                    10
                ],
                "max_count": 15,
                "icon": "https://render.guildwars2.com/file/64DC259F3307371260B975D60A2D69A609BA3D41/1466233.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 188,
                "name": "Squat Thorny Mushroom",
                "description": "Crafted by scribes.",
                "categories": [
                    7
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/413A416F4D684A013210E2EDB12EC1914F70F9DC/1224802.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 190,
                "name": "Elonian Wood Chair",
                "description": "",
                "categories": [
                    16,
                    2
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/0F0F210516D9713EA94B63041D113305374AFDC8/1769418.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 191,
                "name": "Potted Maguuma Lily",
                "description": "Crafted by scribes.",
                "categories": [
                    6,
                    15
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/29214933115D0753D21D43459BA1D9B23D03C807/1225809.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 193,
                "name": "Frost Legion Machine",
                "description": "Earned through the Living World Icebrood Saga episode \"Jormag Rising.\"",
                "categories": [
                    14
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/753679D628A638DDFCBB040A15AC1491B45161DB/2314084.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 194,
                "name": "Chandelier",
                "description": "",
                "categories": [
                    5
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/3F73CE046A675EDF3C0F80C612F1C740C16B15B3/1634119.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_26() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 197,
                "name": "Bonfire",
                "description": "Crafted by scribes.",
                "categories": [
                    5
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/0B6DDA14351ADF3D63E9C81246D30E1C08589D2D/1225125.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_27() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 198,
                "name": "Obstacle: Purple Torch",
                "description": "",
                "categories": [
                    5
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/341210610D401975736DB6AB5CDC1B5C58019BD7/1202580.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_28() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 200,
                "name": "Bronze Conjured Amalgamate Trophy",
                "description": "",
                "categories": [
                    12
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/57FFEF5F62B6CD18C375D46D2A0392444178CA19/2039284.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_29() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 202,
                "name": "Kodan Decorative Wardrobe",
                "description": "",
                "categories": [
                    19,
                    3
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/AF09325871546CA6F7973A989F7AD8730D9929D6/3375050.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_30() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 211,
                "name": "Guild Ballista Siege",
                "description": "Earned by participating in skirmishes.",
                "categories": [
                    11
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/D90AC60063EB33C34AE3C59E3496C5ACE75E1733/1701369.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_31() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 213,
                "name": "Steel Pan",
                "description": "",
                "categories": [
                    19,
                    4
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/E945F3637707CFDC15035020B5DD9238336A0473/3374972.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_32() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 215,
                "name": "Floral Canthan Rug",
                "description": "",
                "categories": [
                    17,
                    4
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/FBBF082ACB7BD8C63AFBEF400804B7C696FAEC10/3374974.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_33() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 224,
                "name": "Kodan Table Setting",
                "description": "",
                "categories": [
                    19,
                    4
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/609877083528ED63BB000194F2436407B29B9408/3374988.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_34() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 225,
                "name": "Kodan Fancy Bed",
                "description": "",
                "categories": [
                    2,
                    19
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/23C70F7AE9B1EE270F94E173E34205306096F10B/3374992.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_35() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 226,
                "name": "Red Throw Pillow",
                "description": "",
                "categories": [
                    2
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/F4EAAF51FEB94FEA65A51B39D7513364A9990C11/1227618.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_36() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 227,
                "name": "Plush Armchair",
                "description": "",
                "categories": [
                    2
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/2AA21D5765353604CEB339E5DD986C3BE52D2463/1227600.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_37() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 234,
                "name": "Purple Balloon",
                "description": "Crafted by scribes.",
                "categories": [
                    14
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/E4734103B5DC341432B39870F09C623D5CB4A960/1226128.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_38() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 236,
                "name": "Fine Armor Stand",
                "description": "Crafted by scribes.",
                "categories": [
                    9
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/3F0862BAB0E93DDEB03101DEFF7502ACFF2CE101/1227576.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_39() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 237,
                "name": "Simple Shelf",
                "description": "",
                "categories": [
                    3
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/45C20380CDAE737A94987E5F56964025C93E775B/1341565.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_40() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 238,
                "name": "Golem Siege",
                "description": "Earned by participating in skirmishes.",
                "categories": [
                    11
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/CB7378D5C960BF01CAA364241F5A7978C6707376/1701381.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_41() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 239,
                "name": "Basic Basket",
                "description": "Purchased from the basic decoration vendor.",
                "categories": [
                    4
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/1305ABB023362DF1DF63DB2E4A28B01B013FE574/1227706.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_42() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 240,
                "name": "Bronze Tequatl Trophy",
                "description": "",
                "categories": [
                    12
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/4F5049271F5B6CB569707078DF2B3E5797D20826/1341368.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_43() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 244,
                "name": "Obstacle: Wide Wall",
                "description": "",
                "categories": [
                    1
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/E0D90C4A0319981AA85E0B0B277D5B9EA2654505/1202576.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_44() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 245,
                "name": "Basic Candle",
                "description": "Purchased from the basic decoration vendor.",
                "categories": [
                    5
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/201F64FFA6BF9AAD2080BE437171B60BF0344770/1227740.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_45() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 247,
                "name": "Ornate Bed",
                "description": "",
                "categories": [
                    2
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/60F801B4B87BE61E7D67E6B209C3ABDB0CBEF0C8/2039198.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_46() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 248,
                "name": "Lattice Planter with Orange Petunias",
                "description": "Crafted by scribes.",
                "categories": [
                    6
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/4164C4E8A92999A0742C997432ED9BACCE4D1A09/1224818.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_47() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 249,
                "name": "Marriner Statue",
                "description": "Crafted by scribes.",
                "categories": [
                    9
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/B6DB98655EBC04045FA9C0D236C1F7F09E3BB608/1227734.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_48() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 250,
                "name": "Kodan Painting",
                "description": "",
                "categories": [
                    19,
                    4
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/367AA933584D174B05B2E25EF45B2A534525D63C/3374982.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_49() {
        json.decodeFromString<GW2v2HomesteadDecoration>(
            """
            {
                "id": 251,
                "name": "Basic Flagpole",
                "description": "Purchased from the commendation vendor.",
                "categories": [
                    10
                ],
                "max_count": 250,
                "icon": "https://render.guildwars2.com/file/0F69690D2C68F7BA0F5C5FB3512409A3DD90B305/1225555.png"
            }
            """.trimIndent()
        )
    }

}