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

class GW2v2WvwUpgradeTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2WvwUpgrade>(
            """
            {
                "id": 18,
                "tiers": [
                    {
                        "name": "Gesichert",
                        "yaks_required": 20,
                        "upgrades": [
                            {
                                "name": "Öltöpfe aufstellen",
                                "description": "Verstärkt das Ziel mit Töpfen brennenden Öls.",
                                "icon": "https://render.guildwars2.com/file/F5AC92A6AE1503EE3B0A940EEE6768C928396663/587138.png"
                            },
                            {
                                "name": "Kanonen bauen",
                                "description": "Verstärkt das Ziel mit Kanonen.",
                                "icon": "https://render.guildwars2.com/file/CFA860C6D3AC505CFA2C4B644A64459E9FEED114/105217.png"
                            },
                            {
                                "name": "Zusätzliche Wachen",
                                "description": "Heuert zusätzliche Wachen an, um das Ziel zu beschützen.",
                                "icon": "https://render.guildwars2.com/file/D77C0CDB74642221B0F50BAE2EB50DD90A134C2D/105219.png"
                            },
                            {
                                "name": "Lager-Erweiterung",
                                "description": "Erhöht den maximalen Vorrats-Lagerplatz des Ziels um 400.",
                                "icon": "https://render.guildwars2.com/file/A73BF1A307D62B047B913DBBAE7409089DFE4DC9/544540.png"
                            }
                        ]
                    },
                    {
                        "name": "Verstärkt",
                        "yaks_required": 40,
                        "upgrades": [
                            {
                                "name": "Verstärkte Mauern",
                                "description": "Erhöht die Lebenspunkte und Verteidigungswerte der Mauern und Tore des Ziels auf Verstärkungsniveau.",
                                "icon": "https://render.guildwars2.com/file/0D354B0726B363BC0CC8F3E02F3209993C79351D/105214.png"
                            },
                            {
                                "name": "Mörser bauen",
                                "description": "Verstärkt das Ziel mit Mörsern.",
                                "icon": "https://render.guildwars2.com/file/049438CC945BD99676B30DC3FFB67E74CA2FACDC/598970.png"
                            },
                            {
                                "name": "Dienstleister anwerben",
                                "description": "Heuert einen Händler für Belagerungswaffen, einen Bankier und einen Rüstungsschmied für das Ziel an.",
                                "icon": "https://render.guildwars2.com/file/7393E6E9F421E2D75EF17C3C6DDBBFEE0D2CA0B1/105222.png"
                            },
                            {
                                "name": "Patrouillen anwerben",
                                "description": "Heuert Wachen an, die im Bereich um das Ziel auf Patrouille gehen.",
                                "icon": "https://render.guildwars2.com/file/7754BEF9551B719EA003EE7435BB76BAA3F73015/105223.png"
                            }
                        ]
                    },
                    {
                        "name": "Befestigt",
                        "yaks_required": 80,
                        "upgrades": [
                            {
                                "name": "Befestigte Mauern",
                                "description": "Erhöht die Lebenspunkte und Verteidigungswerte der Mauern und Tore des Ziels auf Befestigungsniveau.",
                                "icon": "https://render.guildwars2.com/file/24069AEFB574400F4E3CAE081D71E1B10BE402FB/105216.png"
                            },
                            {
                                "name": "Wegmarke errichten",
                                "description": "Verstärkt das Ziel mit einer Wegmarke.",
                                "icon": "https://render.guildwars2.com/file/FB06F90A5AAFE819959C3523B2A22B120E38C05D/105224.png"
                            },
                            {
                                "name": "Wachen-Training",
                                "description": "Erhöht die Stufen aller Wachen im Ziel.",
                                "icon": "https://render.guildwars2.com/file/FBA615BBE324B39DB2616C0B45BBA45E446D16D1/105220.png"
                            },
                            {
                                "name": "Lager-Erweiterung",
                                "description": "Erhöht den maximalen Vorrats-Lagerplatz des Ziels um 400.",
                                "icon": "https://render.guildwars2.com/file/A73BF1A307D62B047B913DBBAE7409089DFE4DC9/544540.png"
                            }
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2WvwUpgrade>(
            """
            {
                "id": 24,
                "tiers": [
                    {
                        "name": "Gesichert",
                        "yaks_required": 20,
                        "upgrades": [
                            {
                                "name": "Öltopf aufstellen",
                                "description": "Verstärkt das Ziel mit einem Topf brennenden Öls.",
                                "icon": "https://render.guildwars2.com/file/F5AC92A6AE1503EE3B0A940EEE6768C928396663/587138.png"
                            },
                            {
                                "name": "Kanone bauen",
                                "description": "Verstärkt das Ziel mit einer Kanone.",
                                "icon": "https://render.guildwars2.com/file/CFA860C6D3AC505CFA2C4B644A64459E9FEED114/105217.png"
                            },
                            {
                                "name": "Ausstatter anwerben",
                                "description": "Heuert einen Händler für Allgemeinwaren für das Ziel an.",
                                "icon": "https://render.guildwars2.com/file/10ADAF395F3FA119FB2F9D6E9E923D201C9D3A76/105221.png"
                            },
                            {
                                "name": "Lager-Erweiterung",
                                "description": "Erhöht den maximalen Vorrats-Lagerplatz des Ziels um 200.",
                                "icon": "https://render.guildwars2.com/file/A73BF1A307D62B047B913DBBAE7409089DFE4DC9/544540.png"
                            }
                        ]
                    },
                    {
                        "name": "Verstärkt",
                        "yaks_required": 40,
                        "upgrades": [
                            {
                                "name": "Verstärkte Mauern",
                                "description": "Erhöht die Lebenspunkte und Verteidigungswerte der Mauern und Tore des Ziels auf Verstärkungsniveau.",
                                "icon": "https://render.guildwars2.com/file/0D354B0726B363BC0CC8F3E02F3209993C79351D/105214.png"
                            },
                            {
                                "name": "Mörser bauen",
                                "description": "Verstärkt das Ziel mit einem Mörser.",
                                "icon": "https://render.guildwars2.com/file/049438CC945BD99676B30DC3FFB67E74CA2FACDC/598970.png"
                            },
                            {
                                "name": "Belagerungsmeister anwerben",
                                "description": "Heuert einen Händler für Belagerungswaffen für das Ziel an.",
                                "icon": "https://render.guildwars2.com/file/7393E6E9F421E2D75EF17C3C6DDBBFEE0D2CA0B1/105222.png"
                            },
                            {
                                "name": "Zusätzliche Wachen",
                                "description": "Heuert zusätzliche Wachen an, um das Ziel zu beschützen.",
                                "icon": "https://render.guildwars2.com/file/D77C0CDB74642221B0F50BAE2EB50DD90A134C2D/105219.png"
                            }
                        ]
                    },
                    {
                        "name": "Befestigt",
                        "yaks_required": 80,
                        "upgrades": [
                            {
                                "name": "Befestigte Mauern",
                                "description": "Erhöht die Lebenspunkte und Verteidigungswerte der Mauern und Tore des Ziels auf Befestigungsniveau.",
                                "icon": "https://render.guildwars2.com/file/24069AEFB574400F4E3CAE081D71E1B10BE402FB/105216.png"
                            },
                            {
                                "name": "Patrouille anwerben",
                                "description": "Heuert Wachen an, die im Bereich um das Ziel auf Patrouille gehen.",
                                "icon": "https://render.guildwars2.com/file/7754BEF9551B719EA003EE7435BB76BAA3F73015/105223.png"
                            },
                            {
                                "name": "Wachen-Training",
                                "description": "Erhöht die Stufen aller Wachen im Ziel.",
                                "icon": "https://render.guildwars2.com/file/FBA615BBE324B39DB2616C0B45BBA45E446D16D1/105220.png"
                            },
                            {
                                "name": "Lager-Erweiterung",
                                "description": "Erhöht den maximalen Vorrats-Lagerplatz des Ziels um 200.",
                                "icon": "https://render.guildwars2.com/file/A73BF1A307D62B047B913DBBAE7409089DFE4DC9/544540.png"
                            }
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2WvwUpgrade>(
            """
            {
                "id": 25,
                "tiers": [
                    {
                        "name": "Gesichert",
                        "yaks_required": 20,
                        "upgrades": [
                            {
                                "name": "Öltöpfe aufstellen",
                                "description": "Verstärkt das Ziel mit Töpfen brennenden Öls.",
                                "icon": "https://render.guildwars2.com/file/F5AC92A6AE1503EE3B0A940EEE6768C928396663/587138.png"
                            },
                            {
                                "name": "Kanonen bauen",
                                "description": "Verstärkt das Ziel mit Kanonen.",
                                "icon": "https://render.guildwars2.com/file/CFA860C6D3AC505CFA2C4B644A64459E9FEED114/105217.png"
                            },
                            {
                                "name": "Zusätzliche Wachen",
                                "description": "Heuert zusätzliche Wachen an, um das Ziel zu beschützen.",
                                "icon": "https://render.guildwars2.com/file/D77C0CDB74642221B0F50BAE2EB50DD90A134C2D/105219.png"
                            },
                            {
                                "name": "Lager-Erweiterung",
                                "description": "Erhöht den maximalen Vorrats-Lagerplatz des Ziels um 400.",
                                "icon": "https://render.guildwars2.com/file/A73BF1A307D62B047B913DBBAE7409089DFE4DC9/544540.png"
                            }
                        ]
                    },
                    {
                        "name": "Verstärkt",
                        "yaks_required": 40,
                        "upgrades": [
                            {
                                "name": "Verstärkte Mauern",
                                "description": "Erhöht die Lebenspunkte und Verteidigungswerte der Mauern und Tore des Ziels auf Verstärkungsniveau.",
                                "icon": "https://render.guildwars2.com/file/0D354B0726B363BC0CC8F3E02F3209993C79351D/105214.png"
                            },
                            {
                                "name": "Mörser bauen",
                                "description": "Verstärkt das Ziel mit Mörsern.",
                                "icon": "https://render.guildwars2.com/file/049438CC945BD99676B30DC3FFB67E74CA2FACDC/598970.png"
                            },
                            {
                                "name": "Dienstleister anwerben",
                                "description": "Heuert einen Händler für Belagerungswaffen, einen Bankier und einen Rüstungsschmied für das Ziel an.",
                                "icon": "https://render.guildwars2.com/file/7393E6E9F421E2D75EF17C3C6DDBBFEE0D2CA0B1/105222.png"
                            },
                            {
                                "name": "Patrouillen anwerben",
                                "description": "Heuert Wachen an, die im Bereich um das Ziel auf Patrouille gehen.",
                                "icon": "https://render.guildwars2.com/file/7754BEF9551B719EA003EE7435BB76BAA3F73015/105223.png"
                            }
                        ]
                    },
                    {
                        "name": "Befestigt",
                        "yaks_required": 80,
                        "upgrades": [
                            {
                                "name": "Befestigte Mauern",
                                "description": "Erhöht die Lebenspunkte und Verteidigungswerte der Mauern und Tore des Ziels auf Befestigungsniveau.",
                                "icon": "https://render.guildwars2.com/file/24069AEFB574400F4E3CAE081D71E1B10BE402FB/105216.png"
                            },
                            {
                                "name": "Wegmarke errichten",
                                "description": "Verstärkt das Ziel mit einer Wegmarke.",
                                "icon": "https://render.guildwars2.com/file/FB06F90A5AAFE819959C3523B2A22B120E38C05D/105224.png"
                            },
                            {
                                "name": "Wachen-Training",
                                "description": "Erhöht die Stufen aller Wachen im Ziel.",
                                "icon": "https://render.guildwars2.com/file/FBA615BBE324B39DB2616C0B45BBA45E446D16D1/105220.png"
                            },
                            {
                                "name": "Lager-Erweiterung",
                                "description": "Erhöht den maximalen Vorrats-Lagerplatz des Ziels um 400.",
                                "icon": "https://render.guildwars2.com/file/A73BF1A307D62B047B913DBBAE7409089DFE4DC9/544540.png"
                            }
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2WvwUpgrade>(
            """
            {
                "id": 53,
                "tiers": [
                    {
                        "name": "Gesichert",
                        "yaks_required": 20,
                        "upgrades": [
                            {
                                "name": "Öltöpfe aufstellen",
                                "description": "Verstärkt das Ziel mit Töpfen brennenden Öls.",
                                "icon": "https://render.guildwars2.com/file/F5AC92A6AE1503EE3B0A940EEE6768C928396663/587138.png"
                            },
                            {
                                "name": "Kanonen bauen",
                                "description": "Verstärkt das Ziel mit Kanonen.",
                                "icon": "https://render.guildwars2.com/file/CFA860C6D3AC505CFA2C4B644A64459E9FEED114/105217.png"
                            },
                            {
                                "name": "Zusätzliche Wachen",
                                "description": "Heuert zusätzliche Wachen an, um das Ziel zu beschützen.",
                                "icon": "https://render.guildwars2.com/file/D77C0CDB74642221B0F50BAE2EB50DD90A134C2D/105219.png"
                            },
                            {
                                "name": "Lager-Erweiterung",
                                "description": "Erhöht den maximalen Vorrats-Lagerplatz des Ziels um 400.",
                                "icon": "https://render.guildwars2.com/file/A73BF1A307D62B047B913DBBAE7409089DFE4DC9/544540.png"
                            }
                        ]
                    },
                    {
                        "name": "Verstärkt",
                        "yaks_required": 40,
                        "upgrades": [
                            {
                                "name": "Verstärkte Mauern",
                                "description": "Erhöht die Lebenspunkte und Verteidigungswerte der Mauern und Tore des Ziels auf Verstärkungsniveau.",
                                "icon": "https://render.guildwars2.com/file/0D354B0726B363BC0CC8F3E02F3209993C79351D/105214.png"
                            },
                            {
                                "name": "Mörser bauen",
                                "description": "Verstärkt das Ziel mit Mörsern.",
                                "icon": "https://render.guildwars2.com/file/049438CC945BD99676B30DC3FFB67E74CA2FACDC/598970.png"
                            },
                            {
                                "name": "Dienstleister anwerben",
                                "description": "Heuert einen Händler für Belagerungswaffen, einen Bankier und einen Rüstungsschmied für das Ziel an.",
                                "icon": "https://render.guildwars2.com/file/7393E6E9F421E2D75EF17C3C6DDBBFEE0D2CA0B1/105222.png"
                            },
                            {
                                "name": "Patrouillen anwerben",
                                "description": "Heuert Wachen an, die im Bereich um das Ziel auf Patrouille gehen.",
                                "icon": "https://render.guildwars2.com/file/7754BEF9551B719EA003EE7435BB76BAA3F73015/105223.png"
                            }
                        ]
                    },
                    {
                        "name": "Befestigt",
                        "yaks_required": 80,
                        "upgrades": [
                            {
                                "name": "Befestigte Mauern",
                                "description": "Erhöht die Lebenspunkte und Verteidigungswerte der Mauern und Tore des Ziels auf Befestigungsniveau.",
                                "icon": "https://render.guildwars2.com/file/24069AEFB574400F4E3CAE081D71E1B10BE402FB/105216.png"
                            },
                            {
                                "name": "Wegmarke errichten",
                                "description": "Verstärkt das Ziel mit einer Wegmarke.",
                                "icon": "https://render.guildwars2.com/file/FB06F90A5AAFE819959C3523B2A22B120E38C05D/105224.png"
                            },
                            {
                                "name": "Wachen-Training",
                                "description": "Erhöht die Stufen aller Wachen im Ziel.",
                                "icon": "https://render.guildwars2.com/file/FBA615BBE324B39DB2616C0B45BBA45E446D16D1/105220.png"
                            },
                            {
                                "name": "Lager-Erweiterung",
                                "description": "Erhöht den maximalen Vorrats-Lagerplatz des Ziels um 400.",
                                "icon": "https://render.guildwars2.com/file/A73BF1A307D62B047B913DBBAE7409089DFE4DC9/544540.png"
                            }
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2WvwUpgrade>(
            """
            {
                "id": 54,
                "tiers": [
                    {
                        "name": "Gesichert",
                        "yaks_required": 20,
                        "upgrades": [
                            {
                                "name": "Öltopf aufstellen",
                                "description": "Verstärkt das Ziel mit einem Topf brennenden Öls.",
                                "icon": "https://render.guildwars2.com/file/F5AC92A6AE1503EE3B0A940EEE6768C928396663/587138.png"
                            },
                            {
                                "name": "Kanone bauen",
                                "description": "Verstärkt das Ziel mit einer Kanone.",
                                "icon": "https://render.guildwars2.com/file/CFA860C6D3AC505CFA2C4B644A64459E9FEED114/105217.png"
                            },
                            {
                                "name": "Ausstatter anwerben",
                                "description": "Heuert einen Händler für Allgemeinwaren für das Ziel an.",
                                "icon": "https://render.guildwars2.com/file/10ADAF395F3FA119FB2F9D6E9E923D201C9D3A76/105221.png"
                            },
                            {
                                "name": "Lager-Erweiterung",
                                "description": "Erhöht den maximalen Vorrats-Lagerplatz des Ziels um 200.",
                                "icon": "https://render.guildwars2.com/file/A73BF1A307D62B047B913DBBAE7409089DFE4DC9/544540.png"
                            }
                        ]
                    },
                    {
                        "name": "Verstärkt",
                        "yaks_required": 40,
                        "upgrades": [
                            {
                                "name": "Verstärkte Mauern",
                                "description": "Erhöht die Lebenspunkte und Verteidigungswerte der Mauern und Tore des Ziels auf Verstärkungsniveau.",
                                "icon": "https://render.guildwars2.com/file/0D354B0726B363BC0CC8F3E02F3209993C79351D/105214.png"
                            },
                            {
                                "name": "Mörser bauen",
                                "description": "Verstärkt das Ziel mit einem Mörser.",
                                "icon": "https://render.guildwars2.com/file/049438CC945BD99676B30DC3FFB67E74CA2FACDC/598970.png"
                            },
                            {
                                "name": "Belagerungsmeister anwerben",
                                "description": "Heuert einen Händler für Belagerungswaffen für das Ziel an.",
                                "icon": "https://render.guildwars2.com/file/7393E6E9F421E2D75EF17C3C6DDBBFEE0D2CA0B1/105222.png"
                            },
                            {
                                "name": "Zusätzliche Wachen",
                                "description": "Heuert zusätzliche Wachen an, um das Ziel zu beschützen.",
                                "icon": "https://render.guildwars2.com/file/D77C0CDB74642221B0F50BAE2EB50DD90A134C2D/105219.png"
                            }
                        ]
                    },
                    {
                        "name": "Befestigt",
                        "yaks_required": 80,
                        "upgrades": [
                            {
                                "name": "Befestigte Mauern",
                                "description": "Erhöht die Lebenspunkte und Verteidigungswerte der Mauern und Tore des Ziels auf Befestigungsniveau.",
                                "icon": "https://render.guildwars2.com/file/24069AEFB574400F4E3CAE081D71E1B10BE402FB/105216.png"
                            },
                            {
                                "name": "Patrouille anwerben",
                                "description": "Heuert Wachen an, die im Bereich um das Ziel auf Patrouille gehen.",
                                "icon": "https://render.guildwars2.com/file/7754BEF9551B719EA003EE7435BB76BAA3F73015/105223.png"
                            },
                            {
                                "name": "Wachen-Training",
                                "description": "Erhöht die Stufen aller Wachen im Ziel.",
                                "icon": "https://render.guildwars2.com/file/FBA615BBE324B39DB2616C0B45BBA45E446D16D1/105220.png"
                            },
                            {
                                "name": "Lager-Erweiterung",
                                "description": "Erhöht den maximalen Vorrats-Lagerplatz des Ziels um 200.",
                                "icon": "https://render.guildwars2.com/file/A73BF1A307D62B047B913DBBAE7409089DFE4DC9/544540.png"
                            }
                        ]
                    }
                ]
            }
            """.trimIndent()
        )
    }

}