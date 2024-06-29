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

class GW2v2HomeInstanceNodeTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "advanced_cloth_rack"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "advanced_leather_rack"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "airship_cargo"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "ancient_wood_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "aurilium_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "bandit_chest"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "basic_cloth_rack"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "basic_harvesting_nodes"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "basic_leather_rack"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "basic_lumber_nodes"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "basic_ore_nodes"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "bauble_gathering_system"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "black_lion_expedition_board"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "black_lion_expedition_board_s4"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "black_lion_hunters_board"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "black_lion_industry_board"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "bloodstone_crystals"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "bound_hatched_chili_pepper_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "brandstone_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "candy_corn_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "commemorative_dragon_pinata"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "crystallized_supply_cache"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "difluorite_crystal_cluster_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "dragon_crystal"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "elder_wood_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "enchanted_treasure_chest"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_26() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "eternal_ice_shard_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_27() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "exalted_chest"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_28() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "flaxseed_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_29() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "garden_plot_01"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_30() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "garden_plot_02"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_31() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "garden_plot_03"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_32() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "ghost_pepper_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_33() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "hard_wood_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_34() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "iron_ore_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_35() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "jade_fragment"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_36() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "king_sized_candy_corn"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_37() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "kournan_supply_cache"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_38() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "krait_obelisk"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_39() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "lotus_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_40() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "mistborn_mote"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_41() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "mistonium_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_42() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "mithril_ore_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_43() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "omnomberry_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_44() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "orichalcum_ore_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_45() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "orrian_oyster_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_46() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "orrian_truffle_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_47() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "petrified_stump"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_48() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "platinum_ore_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_49() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "primordial_orchid"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_50() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "quartz_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_51() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "salvage_pile"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_52() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "snow_truffle_node"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_53() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "sprocket_generator"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_54() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "winterberry_bush"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_55() {
        json.decodeFromString<GW2v2HomeInstanceNode>(
            """
            {
                "id": "wintersday_tree"
            }
            """.trimIndent()
        )
    }

}