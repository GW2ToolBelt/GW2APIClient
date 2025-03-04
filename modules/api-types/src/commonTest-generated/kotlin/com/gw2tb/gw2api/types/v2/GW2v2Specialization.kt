/*
 * Copyright (c) 2018-2025 Leon Linhart
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

class GW2v2SpecializationTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 1,
                "name": "Zweikampf",
                "profession": "Mesmer",
                "elite": false,
                "minor_traits": [
                    706,
                    710,
                    707
                ],
                "major_traits": [
                    701,
                    705,
                    700,
                    1889,
                    1960,
                    708,
                    692,
                    1950,
                    704
                ],
                "icon": "https://render.guildwars2.com/file/43C5400906A104C60F30DFE0A145D1E767353573/1012003.png",
                "background": "https://render.guildwars2.com/file/992D53319C5FCD4AE841C592DC2AE91D5906AECF/1012057.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 2,
                "name": "Todesmagie",
                "profession": "Necromancer",
                "elite": false,
                "minor_traits": [
                    856,
                    839,
                    1929
                ],
                "major_traits": [
                    820,
                    857,
                    1922,
                    858,
                    860,
                    855,
                    842,
                    1940,
                    1694
                ],
                "icon": "https://render.guildwars2.com/file/16663C1CDF532AB0DCC0CB08951DD2F49351D5D4/1012008.png",
                "background": "https://render.guildwars2.com/file/B3F92D581B0A036CABB51590E6E560B21708391F/1012067.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 3,
                "name": "Beschwörung",
                "profession": "Revenant",
                "elite": false,
                "minor_traits": [
                    1778,
                    1758,
                    1769
                ],
                "major_traits": [
                    1732,
                    1761,
                    1784,
                    1774,
                    1760,
                    1781,
                    1749,
                    1791,
                    1719
                ],
                "icon": "https://render.guildwars2.com/file/2C4DCE5C0C255F32B51DCF9E4360106823EAF926/1012018.png",
                "background": "https://render.guildwars2.com/file/B73FB47165CB20DE21B1FAE91FE22BDE29B6FB76/1012093.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 4,
                "name": "Stärke",
                "profession": "Warrior",
                "elite": false,
                "minor_traits": [
                    1446,
                    1448,
                    1453
                ],
                "major_traits": [
                    1447,
                    1451,
                    1444,
                    2000,
                    1338,
                    1449,
                    1437,
                    1454,
                    1440
                ],
                "icon": "https://render.guildwars2.com/file/0D48C40A1C042B0BC6DAA4B91AB272E5E90C934C/1012032.png",
                "background": "https://render.guildwars2.com/file/09160450B40ED777650F632F2CE82504B90F5644/1012109.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 5,
                "name": "Druide",
                "profession": "Ranger",
                "elite": true,
                "minor_traits": [
                    1874,
                    1862,
                    1992
                ],
                "major_traits": [
                    1868,
                    2016,
                    1935,
                    2053,
                    2001,
                    2056,
                    2057,
                    2058,
                    2055
                ],
                "weapon_trait": 1965,
                "icon": "https://render.guildwars2.com/file/BE10CB10D8446208729934F3F1BD3A54BEED9AD6/1012013.png",
                "background": "https://render.guildwars2.com/file/306D6ED9D3F09FF5552609EC7DA2046ECD114F90/1012077.png",
                "profession_icon_big": "https://render.guildwars2.com/file/F910F8BBCAF80355FFDB264160C899594300D7B2/1128574.png",
                "profession_icon": "https://render.guildwars2.com/file/033CFD3270277F38215AE60574BCC2000873BDFF/1128575.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 6,
                "name": "Sprengstoff",
                "profession": "Engineer",
                "elite": false,
                "minor_traits": [
                    432,
                    517,
                    429
                ],
                "major_traits": [
                    514,
                    525,
                    1882,
                    482,
                    1892,
                    1944,
                    1541,
                    505,
                    1947
                ],
                "icon": "https://render.guildwars2.com/file/7DCC0CC4CE0E550C36F37F65469FF3103E2F2DA5/1011989.png",
                "background": "https://render.guildwars2.com/file/159455B54672DF9C9BEEC2EB13E05DB07E757E02/1012041.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 7,
                "name": "Draufgänger",
                "profession": "Thief",
                "elite": true,
                "minor_traits": [
                    1994,
                    1887,
                    1837
                ],
                "major_traits": [
                    1933,
                    2023,
                    1949,
                    1884,
                    1893,
                    1975,
                    1833,
                    1964,
                    2047
                ],
                "weapon_trait": 1957,
                "icon": "https://render.guildwars2.com/file/F1985D4E1CE043D7145E030C0AC4CFDABED73A59/1012025.png",
                "background": "https://render.guildwars2.com/file/B969F9B27EE82CBF0E4651FD0F760F702CB5FCED/1012101.png",
                "profession_icon_big": "https://render.guildwars2.com/file/232D31C9A3076F6A6B41167FBDA7D50F70C82260/1128570.png",
                "profession_icon": "https://render.guildwars2.com/file/CEA6755F350FAAE9A7D8796CF8CC10FA1E33081D/1128571.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 8,
                "name": "Schießkunst",
                "profession": "Ranger",
                "elite": false,
                "minor_traits": [
                    1010,
                    1009,
                    1011
                ],
                "major_traits": [
                    1021,
                    1014,
                    986,
                    1001,
                    1000,
                    1070,
                    996,
                    1015,
                    1698
                ],
                "icon": "https://render.guildwars2.com/file/80FEB75663DAE60BAC59495671261C206C0BAFC3/1012014.png",
                "background": "https://render.guildwars2.com/file/100CE796CC2318DA62D2189A02BAAD2AE91BCE1F/1012079.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 9,
                "name": "Repressalie",
                "profession": "Revenant",
                "elite": false,
                "minor_traits": [
                    1783,
                    1757,
                    1713
                ],
                "major_traits": [
                    1811,
                    1728,
                    1810,
                    1766,
                    1782,
                    1740,
                    1779,
                    1770,
                    1790
                ],
                "icon": "https://render.guildwars2.com/file/70B5F7E02769762D5FEE056D0136093BF3F580FF/1029933.png",
                "background": "https://render.guildwars2.com/file/E6100E7B7704EEC632AD5B399C3BE8A84D7F7CED/1012095.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 10,
                "name": "Dominanz",
                "profession": "Mesmer",
                "elite": false,
                "minor_traits": [
                    685,
                    694,
                    1941
                ],
                "major_traits": [
                    686,
                    682,
                    687,
                    693,
                    713,
                    712,
                    681,
                    680,
                    1688
                ],
                "icon": "https://render.guildwars2.com/file/4B61EA5997709A5DC1E46FF50CEDF2A13C1F0C3D/1012002.png",
                "background": "https://render.guildwars2.com/file/2C436DDDC3244409EEBF470A0AE3ED7CED1F99C0/1012055.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 11,
                "name": "Taktik",
                "profession": "Warrior",
                "elite": false,
                "minor_traits": [
                    1480,
                    1485,
                    1481
                ],
                "major_traits": [
                    1469,
                    1474,
                    1471,
                    1486,
                    1479,
                    1482,
                    1667,
                    1470,
                    1711
                ],
                "icon": "https://render.guildwars2.com/file/373162E8DED2793801194E622FEDEF2DBBDA6F10/1012033.png",
                "background": "https://render.guildwars2.com/file/6FCF0E0E0C0E539290A8245F0DA49D0556D71E62/1012110.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 12,
                "name": "Erlösung",
                "profession": "Revenant",
                "elite": false,
                "minor_traits": [
                    1816,
                    1821,
                    1814
                ],
                "major_traits": [
                    1823,
                    1824,
                    1822,
                    1819,
                    1817,
                    1818,
                    1815,
                    1825,
                    1820
                ],
                "icon": "https://render.guildwars2.com/file/0F0144B0E123163E0454B0C3D532282555BE7CE5/1029934.png",
                "background": "https://render.guildwars2.com/file/1043F6D2CFECB77BC21C70B43F580611E5DAD7CD/1012097.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 13,
                "name": "Tapferkeit",
                "profession": "Guardian",
                "elite": false,
                "minor_traits": [
                    582,
                    594,
                    583
                ],
                "major_traits": [
                    588,
                    581,
                    633,
                    580,
                    584,
                    1684,
                    585,
                    586,
                    589
                ],
                "icon": "https://render.guildwars2.com/file/F8A95D6D3904A1F6430CF2D33A02FDF2A6132037/1011997.png",
                "background": "https://render.guildwars2.com/file/12B4C72ADCE4EF2890606111B400630F3832F83D/1012048.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 14,
                "name": "Verderbnis",
                "profession": "Revenant",
                "elite": false,
                "minor_traits": [
                    1799,
                    1801,
                    1744
                ],
                "major_traits": [
                    1793,
                    1789,
                    1741,
                    1727,
                    1726,
                    1714,
                    1795,
                    1720,
                    1721
                ],
                "icon": "https://render.guildwars2.com/file/FF4CBE97A807903DF3495E0ECC380E080291C698/1029931.png",
                "background": "https://render.guildwars2.com/file/5AB700B8AE15619DDD3CAFD60D0203E5EB23C3BE/1012087.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 15,
                "name": "Verwüstung",
                "profession": "Revenant",
                "elite": false,
                "minor_traits": [
                    1808,
                    1724,
                    1792
                ],
                "major_traits": [
                    1776,
                    1767,
                    1755,
                    1786,
                    1765,
                    1802,
                    1715,
                    1800,
                    1754
                ],
                "icon": "https://render.guildwars2.com/file/C95CAFC4DC0D2AF5DB0C66CB0E0B0FA699E45D6C/1029932.png",
                "background": "https://render.guildwars2.com/file/0744C43591FB9C11A7554C9601215CA8022F4216/1012089.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 16,
                "name": "Ausstrahlung",
                "profession": "Guardian",
                "elite": false,
                "minor_traits": [
                    572,
                    571,
                    568
                ],
                "major_traits": [
                    577,
                    566,
                    574,
                    578,
                    567,
                    565,
                    1686,
                    579,
                    1683
                ],
                "icon": "https://render.guildwars2.com/file/16A05D047DFC0828D0E496F46FD8B20F97B42EB3/1011996.png",
                "background": "https://render.guildwars2.com/file/9BE9604B0378D103EB2F551730BF802F2B1F3AA0/1012047.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 17,
                "name": "Wasser",
                "profession": "Elementalist",
                "elite": false,
                "minor_traits": [
                    350,
                    351,
                    1676
                ],
                "major_traits": [
                    348,
                    363,
                    360,
                    364,
                    358,
                    349,
                    362,
                    361,
                    2028
                ],
                "icon": "https://render.guildwars2.com/file/A3D60C0EBE0B33907505C7DED0FD4E4DE565250F/1011987.png",
                "background": "https://render.guildwars2.com/file/F99A435D26057D6865ECBD0794B73D35A69FBB58/1012039.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 18,
                "name": "Berserker",
                "profession": "Warrior",
                "elite": true,
                "minor_traits": [
                    1831,
                    1993,
                    2046
                ],
                "major_traits": [
                    2049,
                    2039,
                    1977,
                    2011,
                    2042,
                    2002,
                    1928,
                    2038,
                    2043
                ],
                "weapon_trait": 1829,
                "icon": "https://render.guildwars2.com/file/B706475993F16D0BD7DFDF3BB30AA144051CDC94/1029935.png",
                "background": "https://render.guildwars2.com/file/665548439B5F7AB8CA63F46906A0630DAAF6069F/1012106.png",
                "profession_icon_big": "https://render.guildwars2.com/file/E39819140FF49CB5C800B064E17EA221C909DFD5/1128566.png",
                "profession_icon": "https://render.guildwars2.com/file/3111C4ACA223F8B654B3453A42F7539D64EE953A/1128567.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 19,
                "name": "Blutmagie",
                "profession": "Necromancer",
                "elite": false,
                "minor_traits": [
                    792,
                    783,
                    1931
                ],
                "major_traits": [
                    780,
                    788,
                    1876,
                    789,
                    799,
                    1844,
                    782,
                    1692,
                    778
                ],
                "icon": "https://render.guildwars2.com/file/D1D9C63AD9CC05FC1B19970556B0C1E0ADD77905/1012006.png",
                "background": "https://render.guildwars2.com/file/47F5CA90475E566650EF540BA82CA69C1C0332B1/1012063.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 20,
                "name": "Schattenkünste",
                "profession": "Thief",
                "elite": false,
                "minor_traits": [
                    1294,
                    1136,
                    1705
                ],
                "major_traits": [
                    1160,
                    1293,
                    1284,
                    1297,
                    1130,
                    1300,
                    1134,
                    1135,
                    1162
                ],
                "icon": "https://render.guildwars2.com/file/B62E5512754BEB1D0116B1DB3B6FA0ECA4DD630C/1012027.png",
                "background": "https://render.guildwars2.com/file/6943976957615E2337BE6B38292BAEB23C2BAAB9/1012103.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 21,
                "name": "Werkzeuge",
                "profession": "Engineer",
                "elite": false,
                "minor_traits": [
                    1979,
                    1872,
                    1936
                ],
                "major_traits": [
                    532,
                    1997,
                    531,
                    512,
                    1946,
                    1832,
                    1856,
                    523,
                    1679
                ],
                "icon": "https://render.guildwars2.com/file/2CBB5AE626A47DF79C9294ECA61D77922A123600/1011993.png",
                "background": "https://render.guildwars2.com/file/4E906A6B625209A213085FD65DB9A4457726759D/1012044.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 22,
                "name": "Verteidigung",
                "profession": "Warrior",
                "elite": false,
                "minor_traits": [
                    1350,
                    1348,
                    1380
                ],
                "major_traits": [
                    1376,
                    1488,
                    1372,
                    1368,
                    1379,
                    1367,
                    1375,
                    1649,
                    1708
                ],
                "icon": "https://render.guildwars2.com/file/5F0B793A5479007078067CD71D0E01B30602189B/1012030.png",
                "background": "https://render.guildwars2.com/file/E0190E3B3745AA61D32CFF92C1FEFFFB56A90D4C/1012107.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 23,
                "name": "Inspiration",
                "profession": "Mesmer",
                "elite": false,
                "minor_traits": [
                    757,
                    1852,
                    1915
                ],
                "major_traits": [
                    756,
                    738,
                    744,
                    751,
                    740,
                    1980,
                    2005,
                    1866,
                    752
                ],
                "icon": "https://render.guildwars2.com/file/BCC2C316C4FC2823679E0FD062C5A87E96E460CC/1012004.png",
                "background": "https://render.guildwars2.com/file/DC30B4FF5377E80F21F4E912E8D548B004C95042/1012059.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 24,
                "name": "Illusionen",
                "profession": "Mesmer",
                "elite": false,
                "minor_traits": [
                    734,
                    723,
                    731
                ],
                "major_traits": [
                    721,
                    1869,
                    691,
                    722,
                    729,
                    1690,
                    733,
                    2035,
                    753
                ],
                "icon": "https://render.guildwars2.com/file/A6D57C63D9EFB3FE75C9DAF8CBE603D8F45A635F/1012005.png",
                "background": "https://render.guildwars2.com/file/B00D98B31B13416811B8484FC146C49B1E055BAC/1012061.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 25,
                "name": "Naturmagie",
                "profession": "Ranger",
                "elite": false,
                "minor_traits": [
                    1055,
                    1056,
                    1059
                ],
                "major_traits": [
                    1062,
                    978,
                    1060,
                    1054,
                    965,
                    964,
                    1038,
                    1988,
                    1697
                ],
                "icon": "https://render.guildwars2.com/file/DC7A387D9AB3EACCDA35AEA872E4EA1007139612/1012015.png",
                "background": "https://render.guildwars2.com/file/01B5C3050EAFB0C47065C333C8AA2B4255374DA7/1012081.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 26,
                "name": "Erde",
                "profession": "Elementalist",
                "elite": false,
                "minor_traits": [
                    278,
                    279,
                    280
                ],
                "major_traits": [
                    282,
                    1507,
                    289,
                    275,
                    281,
                    277,
                    1508,
                    287,
                    1674
                ],
                "icon": "https://render.guildwars2.com/file/BA6BC962A7ABA1330B3AC4141299397C0036559F/1011985.png",
                "background": "https://render.guildwars2.com/file/B9C5BE9716010E3F7F170A52B5B272327CDA49A1/1012037.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_26() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 27,
                "name": "Drachenjäger",
                "profession": "Guardian",
                "elite": true,
                "minor_traits": [
                    1848,
                    1896,
                    1926
                ],
                "major_traits": [
                    1898,
                    1983,
                    1911,
                    2037,
                    1835,
                    1943,
                    1908,
                    1963,
                    1955
                ],
                "weapon_trait": 1826,
                "icon": "https://render.guildwars2.com/file/736DB02E6DA2ACFAD3B9B0F4655113AD214FFA40/1011994.png",
                "background": "https://render.guildwars2.com/file/6BD5F59A7A0EF4F20C1B1D216AFE2B084CC19FF4/1012045.png",
                "profession_icon_big": "https://render.guildwars2.com/file/1B3B15431B002C09BDABEB7C0E28FCF764FDDB23/1128572.png",
                "profession_icon": "https://render.guildwars2.com/file/4161C630AA50667FDCBF01042D07021CE44451C9/1128573.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_27() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 28,
                "name": "Tödliche Künste",
                "profession": "Thief",
                "elite": false,
                "minor_traits": [
                    1279,
                    1280,
                    1257
                ],
                "major_traits": [
                    1245,
                    1276,
                    1164,
                    1169,
                    1292,
                    1704,
                    1291,
                    1167,
                    1269
                ],
                "icon": "https://render.guildwars2.com/file/38F6FA9A5D04CEC605AF6E5D994119281A38A9FA/1012026.png",
                "background": "https://render.guildwars2.com/file/2AA7FB65630AD540E204982978DA9601023B540E/1012102.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_28() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 29,
                "name": "Alchemie",
                "profession": "Engineer",
                "elite": false,
                "minor_traits": [
                    468,
                    487,
                    413
                ],
                "major_traits": [
                    396,
                    509,
                    521,
                    520,
                    469,
                    470,
                    473,
                    1871,
                    1854
                ],
                "icon": "https://render.guildwars2.com/file/2AD4CD9B66F349A6CBC006A14848CF531E97396D/1011988.png",
                "background": "https://render.guildwars2.com/file/A89F18BA0F9A53E662BAE3F39C705559A97B407F/1012040.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_29() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 30,
                "name": "Gefechtsbeherrschung",
                "profession": "Ranger",
                "elite": false,
                "minor_traits": [
                    1080,
                    1083,
                    1068
                ],
                "major_traits": [
                    1069,
                    1067,
                    1075,
                    1016,
                    1700,
                    1846,
                    1064,
                    1912,
                    1888
                ],
                "icon": "https://render.guildwars2.com/file/A026F49FF905C0F8AFAC6EDFDE281AABE1912459/1012016.png",
                "background": "https://render.guildwars2.com/file/08D1BEEC43F45C02DE59AE9010B9391F1FCA2966/1012083.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_30() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 31,
                "name": "Feuer",
                "profession": "Elementalist",
                "elite": false,
                "minor_traits": [
                    320,
                    318,
                    319
                ],
                "major_traits": [
                    296,
                    328,
                    335,
                    325,
                    340,
                    334,
                    1510,
                    294,
                    1675
                ],
                "icon": "https://render.guildwars2.com/file/B4BDAB2452DEF1A34615DDC4F30A157DADC743C5/1011986.png",
                "background": "https://render.guildwars2.com/file/6BB3E8FDEA6E679050D59E411A4AA956D347B045/1012038.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_31() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 32,
                "name": "Tierbeherrschung",
                "profession": "Ranger",
                "elite": false,
                "minor_traits": [
                    1900,
                    974,
                    1065
                ],
                "major_traits": [
                    1861,
                    1072,
                    1606,
                    975,
                    1047,
                    970,
                    1945,
                    968,
                    1066
                ],
                "icon": "https://render.guildwars2.com/file/02D851E1D7186112786D0F67910B58FACB5CCCF6/1012012.png",
                "background": "https://render.guildwars2.com/file/4727784BBF467241CA9F29E4FEDE487FD33E2809/1012075.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_32() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 33,
                "name": "Überleben in der Wildnis",
                "profession": "Ranger",
                "elite": false,
                "minor_traits": [
                    1096,
                    1090,
                    1089
                ],
                "major_traits": [
                    1098,
                    1086,
                    1099,
                    1101,
                    2032,
                    1100,
                    1094,
                    1699,
                    1701
                ],
                "icon": "https://render.guildwars2.com/file/BEDA4B0CCD2E6F5F5C64509D67D3454E47D019F3/1012017.png",
                "background": "https://render.guildwars2.com/file/417DC1B29EF0EADBD9CBE15B462B2D5B6AF328DA/1012085.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_33() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 34,
                "name": "Schnitter",
                "profession": "Necromancer",
                "elite": true,
                "minor_traits": [
                    1905,
                    1879,
                    2018
                ],
                "major_traits": [
                    1974,
                    2020,
                    2026,
                    1969,
                    2008,
                    2031,
                    1932,
                    1919,
                    2021
                ],
                "weapon_trait": 1985,
                "icon": "https://render.guildwars2.com/file/530A582BD864B73AF5CC6C44F9C61954322D9A15/1012009.png",
                "background": "https://render.guildwars2.com/file/3717FBED4FDCD060925205DD09B15C0598E062F4/1012069.png",
                "profession_icon_big": "https://render.guildwars2.com/file/C9A2C304CFBFA3CBBF41DA0EE756C519F5050D5F/1128578.png",
                "profession_icon": "https://render.guildwars2.com/file/6E9C230241E83DFCAA0B0C11ED32ED0CB605C0EC/1128579.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_34() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 35,
                "name": "Kritische Schläge",
                "profession": "Thief",
                "elite": false,
                "minor_traits": [
                    1281,
                    1210,
                    1282
                ],
                "major_traits": [
                    1209,
                    1267,
                    1268,
                    1170,
                    1272,
                    1299,
                    1904,
                    1215,
                    1702
                ],
                "icon": "https://render.guildwars2.com/file/1CDB2736E6CAF79A1B549B06CDED717B3418F7B1/1012024.png",
                "background": "https://render.guildwars2.com/file/29C9C0E8F16ADC18F745CA93CB58BA0C164B5CE1/1012100.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_35() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 36,
                "name": "Waffen",
                "profession": "Warrior",
                "elite": false,
                "minor_traits": [
                    1342,
                    1343,
                    1337
                ],
                "major_traits": [
                    1455,
                    1344,
                    1334,
                    1315,
                    1316,
                    1333,
                    1336,
                    1346,
                    1707
                ],
                "icon": "https://render.guildwars2.com/file/03754E10970D0C68D76A1955245D7CB39AA21E59/1012029.png",
                "background": "https://render.guildwars2.com/file/0A08B2DC35C8D22CC07B9F4C9023F7E9734C1B27/1012105.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_36() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 37,
                "name": "Arkan",
                "profession": "Elementalist",
                "elite": false,
                "minor_traits": [
                    268,
                    264,
                    2004
                ],
                "major_traits": [
                    253,
                    266,
                    1487,
                    265,
                    1673,
                    257,
                    238,
                    263,
                    1511
                ],
                "icon": "https://render.guildwars2.com/file/C7F4C199EC07D0E6CC9417C6F53F53FDD3F92947/1011984.png",
                "background": "https://render.guildwars2.com/file/01F1264B9F05CC52E46434C53DF6BA2A57CE21C5/1012035.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_37() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 38,
                "name": "Schusswaffen",
                "profession": "Engineer",
                "elite": false,
                "minor_traits": [
                    515,
                    536,
                    516
                ],
                "major_traits": [
                    1878,
                    1930,
                    1914,
                    1984,
                    2006,
                    1923,
                    510,
                    526,
                    433
                ],
                "icon": "https://render.guildwars2.com/file/67A2C92B59BC94EDD3D857C2DD18E1A02A631F98/1011990.png",
                "background": "https://render.guildwars2.com/file/2A37FAA50318E4BAE2B193D7A1DF30AAFCE7B139/1012042.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_38() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 39,
                "name": "Flüche",
                "profession": "Necromancer",
                "elite": false,
                "minor_traits": [
                    802,
                    803,
                    810
                ],
                "major_traits": [
                    1883,
                    2013,
                    815,
                    816,
                    1693,
                    812,
                    813,
                    1696,
                    801
                ],
                "icon": "https://render.guildwars2.com/file/C8E1A81601C3D5AC10285505E9F730621C3357CD/1012007.png",
                "background": "https://render.guildwars2.com/file/71E7075E1AC9460AA507A630B54D1395DA465B2D/1012065.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_39() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 40,
                "name": "Chronomant",
                "profession": "Mesmer",
                "elite": true,
                "minor_traits": [
                    2030,
                    1927,
                    1859
                ],
                "major_traits": [
                    1838,
                    1995,
                    1987,
                    2009,
                    1913,
                    1978,
                    1942,
                    2022,
                    1890
                ],
                "weapon_trait": 1910,
                "icon": "https://render.guildwars2.com/file/D9C960059A69F4DB6604DAD6AF06D0F940E76754/1012001.png",
                "background": "https://render.guildwars2.com/file/9D9F0DA395FDB21423981FAC2CABC850CF7E0A62/1012053.png",
                "profession_icon_big": "https://render.guildwars2.com/file/4C919A74282939EC004333292A93A4073CCDFFFD/1128568.png",
                "profession_icon": "https://render.guildwars2.com/file/B0A3C5B4097705AE21E9CB78E53045E327F1C7C9/1128569.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_40() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 41,
                "name": "Luft",
                "profession": "Elementalist",
                "elite": false,
                "minor_traits": [
                    221,
                    222,
                    223
                ],
                "major_traits": [
                    227,
                    224,
                    232,
                    229,
                    214,
                    1502,
                    226,
                    1503,
                    1672
                ],
                "icon": "https://render.guildwars2.com/file/D3DB62FF6055021A717F3C6A0C19502F2C4EC1FF/1011983.png",
                "background": "https://render.guildwars2.com/file/97BE972EC832ABC4F8645FF4A063EFF89B2942B8/1012034.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_41() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 42,
                "name": "Eifer",
                "profession": "Guardian",
                "elite": false,
                "minor_traits": [
                    648,
                    646,
                    649
                ],
                "major_traits": [
                    563,
                    634,
                    1925,
                    628,
                    653,
                    1556,
                    635,
                    637,
                    2017
                ],
                "icon": "https://render.guildwars2.com/file/479676FC6349C7A12D429B685F0D4205ABFF2F94/1011999.png",
                "background": "https://render.guildwars2.com/file/9244C9726D2AD30F9D7E22CF5C7A49601BFAFCC0/1012050.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_42() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 43,
                "name": "Schrotter",
                "profession": "Engineer",
                "elite": true,
                "minor_traits": [
                    1959,
                    2014,
                    1877
                ],
                "major_traits": [
                    1917,
                    1971,
                    1867,
                    1954,
                    1999,
                    1860,
                    1981,
                    2052,
                    1849
                ],
                "weapon_trait": 1951,
                "icon": "https://render.guildwars2.com/file/FEB1B8C559DDB5A04F9C0579F741080259FEF841/1011991.png",
                "background": "https://render.guildwars2.com/file/011D6BF69FF9A9F6E3DCBA1197BAA9281067FF01/1128516.png",
                "profession_icon_big": "https://render.guildwars2.com/file/21C007BE69070E099BF05B4ED04A2D2B90B8FB1F/1128580.png",
                "profession_icon": "https://render.guildwars2.com/file/5749382E61E622D8E9E00FA60D4CEAADA3E12715/1128581.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_43() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 44,
                "name": "Betrugskunst",
                "profession": "Thief",
                "elite": false,
                "minor_traits": [
                    1137,
                    1232,
                    1157
                ],
                "major_traits": [
                    1159,
                    1252,
                    1163,
                    1277,
                    1286,
                    1190,
                    1187,
                    1158,
                    1706
                ],
                "icon": "https://render.guildwars2.com/file/06BF06CDA7150617C5E075265C1E2F15E84B3D64/1012028.png",
                "background": "https://render.guildwars2.com/file/00CDEB242E93EA19125E48B556D2069639D03DBF/1012104.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_44() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 45,
                "name": "Chaos",
                "profession": "Mesmer",
                "elite": false,
                "minor_traits": [
                    666,
                    667,
                    1865
                ],
                "major_traits": [
                    670,
                    675,
                    677,
                    673,
                    668,
                    669,
                    671,
                    674,
                    1687
                ],
                "icon": "https://render.guildwars2.com/file/7FD4DF076AFB31793EFA07220B35B427B3D406C3/1012000.png",
                "background": "https://render.guildwars2.com/file/B20B7C6DDC30F72207D9BE4FB87C2FDCDC292E90/1012051.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_45() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 46,
                "name": "Tugenden",
                "profession": "Guardian",
                "elite": false,
                "minor_traits": [
                    621,
                    604,
                    620
                ],
                "major_traits": [
                    624,
                    625,
                    617,
                    603,
                    610,
                    587,
                    622,
                    554,
                    612
                ],
                "icon": "https://render.guildwars2.com/file/E165042F92999B3BEFA91E280CB807F62EF30218/1011998.png",
                "background": "https://render.guildwars2.com/file/08FE79184543F8314648D3104268789B484AB0BF/1012049.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_46() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 47,
                "name": "Erfindungen",
                "profession": "Engineer",
                "elite": false,
                "minor_traits": [
                    518,
                    508,
                    519
                ],
                "major_traits": [
                    394,
                    1901,
                    507,
                    1678,
                    1834,
                    445,
                    472,
                    1680,
                    1916
                ],
                "icon": "https://render.guildwars2.com/file/91F9AF48FA1DDEB66A449095A4E1A6E901AE203D/1011992.png",
                "background": "https://render.guildwars2.com/file/807C3D97D8B6A25E47B49C905B081419A779201D/1012043.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_47() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 48,
                "name": "Sturmbote",
                "profession": "Elementalist",
                "elite": true,
                "minor_traits": [
                    2025,
                    1938,
                    1948
                ],
                "major_traits": [
                    1952,
                    1962,
                    1886,
                    1891,
                    1902,
                    2015,
                    1839,
                    2033,
                    1986
                ],
                "weapon_trait": 2036,
                "icon": "https://render.guildwars2.com/file/D1970ABC09D07B4275C7E47DDD0EDC0F4CFC050C/1029930.png",
                "background": "https://render.guildwars2.com/file/D22197110A38F5651AA3F4C23914A197DD2C5BA1/1029936.png",
                "profession_icon_big": "https://render.guildwars2.com/file/CDE1093102F02010B30FB210F2AC77A5F00C2535/1128582.png",
                "profession_icon": "https://render.guildwars2.com/file/BC1D0645C1304238F6154C9F366DEBD014FD7AD4/1128583.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_48() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 49,
                "name": "Ehre",
                "profession": "Guardian",
                "elite": false,
                "minor_traits": [
                    564,
                    551,
                    1685
                ],
                "major_traits": [
                    1899,
                    559,
                    654,
                    557,
                    549,
                    562,
                    553,
                    558,
                    1682
                ],
                "icon": "https://render.guildwars2.com/file/A4C0E39152B005EE226DA56D010DEEABB1ADBF2B/1011995.png",
                "background": "https://render.guildwars2.com/file/98C3AB64254E61E59D03D3AF29D75314730E9E72/1012046.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_49() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 50,
                "name": "Seelenernte",
                "profession": "Necromancer",
                "elite": false,
                "minor_traits": [
                    887,
                    891,
                    874
                ],
                "major_traits": [
                    875,
                    898,
                    888,
                    894,
                    861,
                    892,
                    889,
                    893,
                    905
                ],
                "icon": "https://render.guildwars2.com/file/A5A95CB5FADD99F59E07400907F0782B659574A9/1012010.png",
                "background": "https://render.guildwars2.com/file/0956926B4A5109E07EFAB556E5DBEDCBC2B67C3B/1012071.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_50() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 51,
                "name": "Disziplin",
                "profession": "Warrior",
                "elite": false,
                "minor_traits": [
                    1415,
                    1416,
                    1417
                ],
                "major_traits": [
                    1329,
                    1413,
                    1381,
                    1484,
                    1489,
                    1709,
                    1369,
                    1317,
                    1657
                ],
                "icon": "https://render.guildwars2.com/file/D10B771D01C85DA404472EE90F35EF15B0B36240/1012031.png",
                "background": "https://render.guildwars2.com/file/2B80CF6504DA1B0DC8470D45ED5BE9992BEEC2B7/1012108.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_51() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 52,
                "name": "Herold",
                "profession": "Revenant",
                "elite": true,
                "minor_traits": [
                    1777,
                    1737,
                    1788
                ],
                "major_traits": [
                    1813,
                    1806,
                    1716,
                    1738,
                    1743,
                    1730,
                    1746,
                    1772,
                    1803
                ],
                "weapon_trait": 2050,
                "icon": "https://render.guildwars2.com/file/78496E9E95C46527F8E0B974530A07A017DC9B79/1058520.png",
                "background": "https://render.guildwars2.com/file/F2EEC706430942BEC2D51565AECC13135DF304F8/1012091.png",
                "profession_icon_big": "https://render.guildwars2.com/file/513E3D33671326D32ABD070575017451AA229A08/1128576.png",
                "profession_icon": "https://render.guildwars2.com/file/0D29C2DC29FFD156082572B41310D00914029E6C/1128577.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_52() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 53,
                "name": "Bosheit",
                "profession": "Necromancer",
                "elite": false,
                "minor_traits": [
                    913,
                    915,
                    917
                ],
                "major_traits": [
                    914,
                    916,
                    1863,
                    899,
                    829,
                    909,
                    919,
                    853,
                    903
                ],
                "icon": "https://render.guildwars2.com/file/2D34377B04051FFDCDB553C7DCDABCD5DFBB68D7/1012011.png",
                "background": "https://render.guildwars2.com/file/DDF39DBD61CCC1BCDD03B271080869251D097041/1012073.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_53() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 54,
                "name": "Akrobatik",
                "profession": "Thief",
                "elite": false,
                "minor_traits": [
                    1240,
                    1234,
                    1242
                ],
                "major_traits": [
                    1112,
                    1289,
                    1237,
                    1241,
                    1192,
                    1290,
                    1238,
                    1295,
                    1703
                ],
                "icon": "https://render.guildwars2.com/file/E109FF4E65CD3FA4AAC20E9D219C4D5207E1E461/1012023.png",
                "background": "https://render.guildwars2.com/file/0CACB74F6E36F80921C6D6F2F0786B6C1CCCDCA4/1012099.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_54() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 55,
                "name": "Seelenwandler",
                "profession": "Ranger",
                "elite": true,
                "minor_traits": [
                    2151,
                    2156,
                    2127
                ],
                "major_traits": [
                    2134,
                    2071,
                    2072,
                    2119,
                    2085,
                    2161,
                    2155,
                    2128,
                    2143
                ],
                "weapon_trait": 2088,
                "icon": "https://render.guildwars2.com/file/0AA4A2C62C4F2D0E0D59DBEE9C63EB4AF472F0C5/1769893.png",
                "background": "https://render.guildwars2.com/file/D624537D6B50C90B2A329EB16CF8911BDD4C0107/1769902.png",
                "profession_icon_big": "https://render.guildwars2.com/file/7257FBD9A35002DC5155062773D305353AF45E2F/1770214.png",
                "profession_icon": "https://render.guildwars2.com/file/F80AC2AFAAF55C0F7F012C7EBECC90FD01F27FE9/1770215.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_55() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 56,
                "name": "Weber",
                "profession": "Elementalist",
                "elite": true,
                "minor_traits": [
                    2109,
                    2077,
                    2081
                ],
                "major_traits": [
                    2177,
                    2165,
                    2115,
                    2180,
                    2061,
                    2170,
                    2131,
                    2090,
                    2138
                ],
                "weapon_trait": 2149,
                "icon": "https://render.guildwars2.com/file/02FAA82BF2F5BF3E3AD89BCF05FF56B4C86139F4/1769888.png",
                "background": "https://render.guildwars2.com/file/C3D501E451AD49310F05B40924B20A3B7CB14E07/1769897.png",
                "profession_icon_big": "https://render.guildwars2.com/file/06F17108155842F0C37F3E7EF901ABB17D0C9232/1670505.png",
                "profession_icon": "https://render.guildwars2.com/file/C4B549D62A43E1BF490197E212B21879C4214008/1670506.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_56() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 57,
                "name": "Holoschmied",
                "profession": "Engineer",
                "elite": true,
                "minor_traits": [
                    2158,
                    2135,
                    2122
                ],
                "major_traits": [
                    2114,
                    2157,
                    2106,
                    2103,
                    2152,
                    2091,
                    2066,
                    2137,
                    2064
                ],
                "weapon_trait": 2125,
                "icon": "https://render.guildwars2.com/file/F41CDEE4603FC0741669A7F2A7E977D36123DF7C/1769889.png",
                "background": "https://render.guildwars2.com/file/FF0814C6EFA56F9ADA0B3EA7986BADF120F7D11D/1769898.png",
                "profession_icon_big": "https://render.guildwars2.com/file/A84BD2D74D3239451E3FF4EFC0F6A146F3F6653E/1770224.png",
                "profession_icon": "https://render.guildwars2.com/file/5DCFFC66A63466DFEBD29ACFA605CF00C708CBF3/1770225.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_57() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 58,
                "name": "Scharfschütze",
                "profession": "Thief",
                "elite": true,
                "minor_traits": [
                    2171,
                    2172,
                    2084
                ],
                "major_traits": [
                    2145,
                    2173,
                    2136,
                    2118,
                    2078,
                    2160,
                    2111,
                    2093,
                    2146
                ],
                "weapon_trait": 2129,
                "icon": "https://render.guildwars2.com/file/F93EF1717238E9ACC1CA330D4416D324AE08585D/1769895.png",
                "background": "https://render.guildwars2.com/file/09B7D10707C7095C050B34ED68E3E3BB06626C7A/1769904.png",
                "profession_icon_big": "https://render.guildwars2.com/file/2BE4F4AB7F69206BBDABB20CACB1DC7911B33F4E/1770212.png",
                "profession_icon": "https://render.guildwars2.com/file/E4CDA974AF47D2336E02211E4667FE5C9579774F/1770213.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_58() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 59,
                "name": "Illusionist",
                "profession": "Mesmer",
                "elite": true,
                "minor_traits": [
                    2150,
                    2069,
                    2117
                ],
                "major_traits": [
                    2141,
                    2082,
                    2110,
                    2178,
                    2174,
                    2098,
                    2070,
                    2113,
                    2169
                ],
                "weapon_trait": 2087,
                "icon": "https://render.guildwars2.com/file/6403ECA8E6C1683E2C9D075A39C154ED3A7C04A1/1769891.png",
                "background": "https://render.guildwars2.com/file/BB67F76B46052E6E291AFE75807AFC7DD33563E4/1769900.png",
                "profession_icon_big": "https://render.guildwars2.com/file/A879752D07B7E8A154A952AC99D01EDC9FBC60A9/1770216.png",
                "profession_icon": "https://render.guildwars2.com/file/52285431289AE4FE39E8A21D4333E137A5EF0921/1770217.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_59() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 60,
                "name": "Pestbringer",
                "profession": "Necromancer",
                "elite": true,
                "minor_traits": [
                    2147,
                    2121,
                    2096
                ],
                "major_traits": [
                    2167,
                    2074,
                    2102,
                    2059,
                    2067,
                    2123,
                    2112,
                    2164,
                    2080
                ],
                "weapon_trait": 2144,
                "icon": "https://render.guildwars2.com/file/1407ADE7787A6BF6E457F5FA6DFA1062A5FA93FD/1769892.png",
                "background": "https://render.guildwars2.com/file/DEE244AB7045EE31941E222AE4A06A94DCB4360E/1769901.png",
                "profession_icon_big": "https://render.guildwars2.com/file/1556059855E5624F269B049F3D08B7B122B43906/1770220.png",
                "profession_icon": "https://render.guildwars2.com/file/B10D1AB5AA0B0CFE7D26A142E99414C26244359C/1770221.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_60() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 61,
                "name": "Bannbrecher",
                "profession": "Warrior",
                "elite": true,
                "minor_traits": [
                    2175,
                    2162,
                    2130
                ],
                "major_traits": [
                    2107,
                    2153,
                    2140,
                    2126,
                    2097,
                    2095,
                    2163,
                    2168,
                    2060
                ],
                "weapon_trait": 2124,
                "icon": "https://render.guildwars2.com/file/06DFB7E3F267ADD0BB43C7383251343858371D02/1769896.png",
                "background": "https://render.guildwars2.com/file/C0D57D3B17CC0408A2EE17FE2BA0C80A4E1838FA/1769905.png",
                "profession_icon_big": "https://render.guildwars2.com/file/342C1C032B5513EF1CC5082592A8D8A6EEC33197/1770222.png",
                "profession_icon": "https://render.guildwars2.com/file/C105F67C30BBD0FE0A26CB97E90B481419927D50/1770223.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_61() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 62,
                "name": "Aufwiegler",
                "profession": "Guardian",
                "elite": true,
                "minor_traits": [
                    2089,
                    2062,
                    2148
                ],
                "major_traits": [
                    2075,
                    2101,
                    2086,
                    2063,
                    2076,
                    2116,
                    2105,
                    2179,
                    2159
                ],
                "weapon_trait": 2073,
                "icon": "https://render.guildwars2.com/file/6D18B2D3EE0BFA0E4BC851A7D3C39D4330250916/1769890.png",
                "background": "https://render.guildwars2.com/file/7E6454FF9A13DBE93873AF72E192A74622990171/1769899.png",
                "profession_icon_big": "https://render.guildwars2.com/file/AA12C93CBF5D25E40409060D5CD69E27F72B0892/1770210.png",
                "profession_icon": "https://render.guildwars2.com/file/A1287D0FD1159CAC3A58C212C94A4BD0AB32A8D3/1770211.png"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_62() {
        json.decodeFromString<GW2v2Specialization>(
            """
            {
                "id": 63,
                "name": "Abtrünniger",
                "profession": "Revenant",
                "elite": true,
                "minor_traits": [
                    2181,
                    2154,
                    2142
                ],
                "major_traits": [
                    2166,
                    2079,
                    2120,
                    2133,
                    2092,
                    2108,
                    2094,
                    2100,
                    2182
                ],
                "weapon_trait": 2099,
                "icon": "https://render.guildwars2.com/file/0152279F7DD0FCFA21F2D1CC17DE21B2BD58EFF3/1769894.png",
                "background": "https://render.guildwars2.com/file/30377A5829605D7F1209B4064203A83F580548AD/1769903.png",
                "profession_icon_big": "https://render.guildwars2.com/file/132E53C7D89FB623402FE3A808EBF62B5C0A016F/1770218.png",
                "profession_icon": "https://render.guildwars2.com/file/A347E09ED9C6537C7D13EC212229468078C0F0E9/1770219.png"
            }
            """.trimIndent()
        )
    }

}