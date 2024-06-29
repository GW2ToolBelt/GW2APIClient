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

class GW2v2PvpHeroTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2PvpHero>(
            """
            {
                "id": "115C140F-C2F5-40EB-8EA2-C3773F2AE468",
                "name": "Nika",
                "description": "Nika war eine fähige Assassinin, die als junges Mädchen im Kloster von Shing Jea ausgebildet wurde. Sie schloss sich der Obsidian-Flamme an, um Cantha zu dienen.",
                "type": "Spezialisierter Held",
                "stats": {
                    "offense": 3,
                    "defense": 2,
                    "speed": 4
                },
                "overlay": "https://render.guildwars2.com/file/2CACF4120E370D1997A4C3D69BF592D7CC1870C8/993693.png",
                "underlay": "https://render.guildwars2.com/file/103108E0D8EDD22C577FA4171618D004A82AD955/993694.png",
                "skins": [
                    {
                        "id": 1,
                        "name": "Nika",
                        "icon": "https://render.guildwars2.com/file/4602BDC15B73422011AC664425D93750707F04F3/1058576.png",
                        "default": true,
                        "unlock_items": [
                            70076
                        ]
                    },
                    {
                        "id": 7,
                        "name": "Schattenassassine Nika",
                        "icon": "https://render.guildwars2.com/file/01643F1BD1202007BEE8E37F7DA3EA31AEE9536C/1322841.png",
                        "default": false,
                        "unlock_items": [
                            72077
                        ]
                    },
                    {
                        "id": 15,
                        "name": "Festliche Nika",
                        "icon": "https://render.guildwars2.com/file/002248777FC6341B1650040AF1ADBD79A4772CA5/1322839.png",
                        "default": false,
                        "unlock_items": [
                            77642
                        ]
                    },
                    {
                        "id": 11,
                        "name": "Leisetreter-Nika",
                        "icon": "https://render.guildwars2.com/file/DB2DCD0AEDDCD0474F4FC2426203384E06D2380D/1322842.png",
                        "default": false,
                        "unlock_items": [
                            73002
                        ]
                    },
                    {
                        "id": 12,
                        "name": "Läufer-Nika",
                        "icon": "https://render.guildwars2.com/file/CE35793C96D74CC657736D15FB02C7B64E610208/1322843.png",
                        "default": false,
                        "unlock_items": [
                            76274
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2PvpHero>(
            """
            {
                "id": "B7EA9889-5F16-4636-9705-4FCAF8B39ECD",
                "name": "Lichtbringer Tybalt Linkeprank",
                "description": "Tybalt gehörte früher der Eisen-Legion an, doch er wurde ehrlos entlassen, nachdem eine Explosion seinen Trupp ausgelöscht und seine rechte Pranke verstümmelt hatte, wodurch er seinen Spitznamen bekam. Tybalt schloss sich später dem Orden der Gerüchte an, wo er sechs Jahre lang klerikale Dienste verrichtete und das Sicherheitssystem für die Heilige Halle der Geheimnisse konzipierte. Nachdem er eine Auferstandene Kreatur in Löwenstein entdeckt hatte, begab sich Tybalt mit seinen Verbündeten auf die Klaueninsel, um Wachkommandant Talon vor dem bevorstehenden Angriff zu warnen. Leider kamen sie zu spät, und Tybalt opferte sich, damit Trahearne und der verwundete Löwengardist sich in Sicherheit bringen konnten.",
                "type": "Defensiver Held",
                "stats": {
                    "offense": 3,
                    "defense": 4,
                    "speed": 2
                },
                "overlay": "https://render.guildwars2.com/file/24F404D0E9A169366AF811D650FE9CCE2D51C069/993701.png",
                "underlay": "https://render.guildwars2.com/file/F257C025F0714C0039E9E51B92B265CBB0E59B76/993702.png",
                "skins": [
                    {
                        "id": 5,
                        "name": "Lichtbringer Tybalt Linkeprank",
                        "icon": "https://render.guildwars2.com/file/1192A90AE007DB4D3ADDFEACF1A8B1407B084A6D/1341593.png",
                        "default": true,
                        "unlock_items": [
                            77708
                        ]
                    },
                    {
                        "id": 18,
                        "name": "Steampunk-Tybalt",
                        "icon": "https://render.guildwars2.com/file/09492402E20C2293BDAD0CFDD2EB1F922DF9EE3C/1341592.png",
                        "default": false,
                        "unlock_items": [
                            77684
                        ]
                    },
                    {
                        "id": 19,
                        "name": "Orrianische Rüstung -Tybalt",
                        "icon": "https://render.guildwars2.com/file/B2A53A023C6FA8F43CCE09F4A5B26FB84CA40422/1341450.png",
                        "default": false,
                        "unlock_items": [
                            77704
                        ]
                    },
                    {
                        "id": 20,
                        "name": "Ruhmreicher Elite-Tybalt",
                        "icon": "https://render.guildwars2.com/file/0BB2305F530FFAE2BDF7FA75AE02A1D98002041B/1341449.png",
                        "default": false,
                        "unlock_items": [
                            77691
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2PvpHero>(
            """
            {
                "id": "BEA79596-CA8B-4D46-9B9C-EA1B606BCF42",
                "name": "Turai Ossa",
                "description": "Turai Ossa war seit den Altehrwürdigen Königen der erste Herrscher über ein vereintes Elona. Seine Seele und die Seelen seiner Anhänger waren in der Kristallwüste gefangen, wo sie darauf warteten, dass Turai aufsteigen und Aufnahme in der Halle der Helden finden könne.",
                "type": "Defensiver Held",
                "stats": {
                    "offense": 2,
                    "defense": 4,
                    "speed": 3
                },
                "overlay": "https://render.guildwars2.com/file/24F404D0E9A169366AF811D650FE9CCE2D51C069/993701.png",
                "underlay": "https://render.guildwars2.com/file/F257C025F0714C0039E9E51B92B265CBB0E59B76/993702.png",
                "skins": [
                    {
                        "id": 8,
                        "name": "Phalanx Turai Ossa",
                        "icon": "https://render.guildwars2.com/file/9E615DBF964144F4A67020E6DBAEC4757D3299C5/1322844.png",
                        "default": false,
                        "unlock_items": [
                            74686
                        ]
                    },
                    {
                        "id": 9,
                        "name": "Strahlender Turai Ossa",
                        "icon": "https://render.guildwars2.com/file/F299240615B9234CA007605576FEA36C0297CBC1/1322845.png",
                        "default": false,
                        "unlock_items": [
                            76488
                        ]
                    },
                    {
                        "id": 17,
                        "name": "Festlicher Turai Ossa",
                        "icon": "https://render.guildwars2.com/file/9AF357C3792B25164305A21DC7BAB260707B105A/1322840.png",
                        "default": false,
                        "unlock_items": [
                            77638
                        ]
                    },
                    {
                        "id": 3,
                        "name": "Turai Ossa",
                        "icon": "https://render.guildwars2.com/file/B61ED3D01BBE5D17AC53F6E5C5EB59087CB7BCD6/1058577.png",
                        "default": true,
                        "unlock_items": []
                    },
                    {
                        "id": 14,
                        "name": "Schutzwall Turai Ossa",
                        "icon": "https://render.guildwars2.com/file/A454A74056F430521C7834185448A4C524B2E8C4/1322846.png",
                        "default": false,
                        "unlock_items": [
                            76461
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2PvpHero>(
            """
            {
                "id": "CF977AE5-C605-4586-A802-3E25F0F35772",
                "name": "Grymm Svaard",
                "description": "Grymm war ein Söldner und verdingte sich auf so namhaften Schiffen wie auf \"Salmas Gnade\" unter Kapitän Osh Moran, auf der \"Stolz\" unter Kapitän Cobiah Marriner und auf der \"Lockvogel des Nadirs\" unter Kapitän Yomm.",
                "type": "Offensiver Held",
                "stats": {
                    "offense": 4,
                    "defense": 3,
                    "speed": 2
                },
                "overlay": "https://render.guildwars2.com/file/12EB77241892B5C3BB6966C53BFC145C78D34BB9/993705.png",
                "underlay": "https://render.guildwars2.com/file/AC38C162F8557C35AB25D332D7483EDC0FC0C662/993706.png",
                "skins": [
                    {
                        "id": 10,
                        "name": "Schurke Grymm Svaard",
                        "icon": "https://render.guildwars2.com/file/4F7146D75C146C3AC534C87C23731C9FBF2D7CA6/1322836.png",
                        "default": false,
                        "unlock_items": [
                            72772
                        ]
                    },
                    {
                        "id": 4,
                        "name": "Flammenschreiter Grymm Svaard",
                        "icon": "https://render.guildwars2.com/file/99B30114157025E8E3C4EE9226E66E000A067B29/1322835.png",
                        "default": false,
                        "unlock_items": [
                            74423
                        ]
                    },
                    {
                        "id": 2,
                        "name": "Grymm Svaard",
                        "icon": "https://render.guildwars2.com/file/0D6C65171A2E634FA5D1B35306E992F6A7431124/1058575.png",
                        "default": true,
                        "unlock_items": [
                            72443
                        ]
                    },
                    {
                        "id": 16,
                        "name": "Festlicher Grymm Svaard",
                        "icon": "https://render.guildwars2.com/file/A0C4352FA16FF92C3B3BB0739E79C7CF34E8B9F0/1322838.png",
                        "default": false,
                        "unlock_items": [
                            77607
                        ]
                    },
                    {
                        "id": 13,
                        "name": "Abtei Grymm Svaard",
                        "icon": "https://render.guildwars2.com/file/357744AEA47BCD6D591AF8FFBCCFED010B379C15/1322837.png",
                        "default": false,
                        "unlock_items": [
                            73989
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }

}