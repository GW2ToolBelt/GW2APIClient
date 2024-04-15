/*
 * Copyright (c) 2018-2022 Leon Linhart
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

class GW2v2AchievementCategoryTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 52,
                "name": "Blut und Verrücktheit",
                "description": "",
                "order": 152,
                "icon": "https://render.guildwars2.com/file/A0510AF3DC025EA7DDDEE037082BCD082E36081D/647965.png",
                "achievements": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 136,
                "name": "Fraktale der Nebel",
                "description": "",
                "order": 502,
                "icon": "https://render.guildwars2.com/file/9A6791950A5F3EBD15C91C2942F1E3C8D5221B28/602779.png",
                "achievements": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 207,
                "name": "Täglicher Jäger versunkener Schätze",
                "description": "",
                "order": 22,
                "icon": "https://render.guildwars2.com/file/9380EEBE040AF400A2EFCC08175F4D9B6CB2F70A/1983619.png",
                "achievements": [
                    4181
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 254,
                "name": "Jormags Erwachen",
                "description": "",
                "order": 1,
                "icon": "https://render.guildwars2.com/file/4BC6585054945E93B7061FBD5B04BF79A198FB78/2314913.png",
                "achievements": [
                    5380,
                    5353,
                    5379,
                    5417,
                    5366,
                    5415,
                    5421,
                    5374,
                    5378,
                    5396,
                    5413,
                    5348,
                    5401,
                    5376,
                    5387,
                    5357,
                    5369,
                    5351,
                    5419,
                    5394,
                    5423,
                    5403,
                    5364,
                    5359,
                    5362,
                    5386,
                    5410,
                    5424,
                    5414,
                    5350,
                    5363,
                    5420,
                    5383,
                    5409,
                    5402,
                    5428,
                    5368,
                    5418,
                    5412,
                    5393,
                    5377,
                    5347,
                    5349,
                    5406,
                    5397,
                    5375,
                    5354,
                    5390,
                    5422,
                    5429,
                    5408,
                    5416,
                    5382,
                    5372,
                    5389,
                    5352,
                    5381,
                    5365,
                    5358,
                    5405,
                    5411,
                    5361,
                    5367,
                    5391,
                    5476
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 256,
                "name": "Meta-Event-Ansturm",
                "description": "",
                "order": 2,
                "icon": "https://render.guildwars2.com/file/C2E37DE77D0C024B06F1E0A5F738524A07E9CF2B/797625.png",
                "achievements": [
                    4773,
                    4755,
                    4767,
                    4768,
                    4772,
                    4761,
                    4769,
                    4756
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 257,
                "name": "Champion-Ansturm",
                "description": "",
                "order": 3,
                "icon": "https://render.guildwars2.com/file/C2E37DE77D0C024B06F1E0A5F738524A07E9CF2B/797625.png",
                "achievements": [
                    4889,
                    4893,
                    4886,
                    4894,
                    4885,
                    4888,
                    4892,
                    4895,
                    4887,
                    4891
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 258,
                "name": "Fraktal \"Sunqua-Gipfel\"",
                "description": "",
                "order": 5,
                "icon": "https://render.guildwars2.com/file/9A6791950A5F3EBD15C91C2942F1E3C8D5221B28/602779.png",
                "achievements": [
                    5438,
                    5456,
                    5451,
                    5442,
                    5445,
                    5450,
                    5440,
                    5443,
                    5439,
                    5444
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 259,
                "name": "Wöchentliche Schlachtzüge",
                "description": "",
                "order": 4,
                "icon": "https://render.guildwars2.com/file/9F5C23543CB8C715B7022635C10AA6D5011E74B3/1302679.png",
                "achievements": [
                    5455
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 260,
                "name": "Fraktal-Ansturm",
                "description": "",
                "order": 503,
                "icon": "https://render.guildwars2.com/file/C2E37DE77D0C024B06F1E0A5F738524A07E9CF2B/797625.png",
                "achievements": [
                    5464,
                    5465,
                    5462,
                    5460,
                    5459
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 261,
                "name": "Wöchentliche Fraktale",
                "description": "",
                "order": 1,
                "icon": "https://render.guildwars2.com/file/9A6791950A5F3EBD15C91C2942F1E3C8D5221B28/602779.png",
                "achievements": [
                    5453,
                    5452,
                    5448,
                    5441
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 262,
                "name": "Anführen der Kristallblüte",
                "description": "",
                "order": 1,
                "icon": "https://render.guildwars2.com/file/C2E37DE77D0C024B06F1E0A5F738524A07E9CF2B/797625.png",
                "achievements": [
                    5479,
                    5532,
                    5519,
                    5477
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2AchievementCategory>(
            """
            {
                "id": 263,
                "name": "Anführen der Ebon-Vorhut",
                "description": "",
                "order": 1,
                "icon": "https://render.guildwars2.com/file/C2E37DE77D0C024B06F1E0A5F738524A07E9CF2B/797625.png",
                "achievements": [
                    5542,
                    5531,
                    5509,
                    5514
                ]
            }
            """.trimIndent()
        )
    }

}