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
package com.gw2tb.gw2api.types.v1

import kotlin.test.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*

class GW2v1WorldNameTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1001",
                "name": "Roca del Yunque"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1002",
                "name": "Paso de Borlis"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1003",
                "name": "Declive del Yak"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1004",
                "name": "Círculo de Denravi"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1005",
                "name": "Maguuma"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1006",
                "name": "Fragua del Pesar"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1007",
                "name": "Puerta de la Locura"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1008",
                "name": "Cantera de Jade"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1009",
                "name": "Fuerte Aspenwood"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1010",
                "name": "Bahía de Ehmry"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1011",
                "name": "Isla Cimatormenta"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1012",
                "name": "Refugio Oscuro"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1013",
                "name": "Sagrario de Rall"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1014",
                "name": "Desierto de Cristal"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1015",
                "name": "Isla de Janthir"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1016",
                "name": "Mar de los Pesares"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_16() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1017",
                "name": "Costa de Bronce"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_17() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1018",
                "name": "Picosescalofriantes del Norte"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_18() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1019",
                "name": "Puertanegra"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_19() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1020",
                "name": "Encrucijada de Ferguson"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_20() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1021",
                "name": "Marca del Dragón"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_21() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1022",
                "name": "Kaineng"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_22() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1023",
                "name": "Descanso de Devona"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_23() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "1024",
                "name": "Terraza de Eredon"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_24() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2001",
                "name": "Fisura de la Aflicción"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_25() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2002",
                "name": "Desolación"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_26() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2003",
                "name": "Gandara"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_27() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2004",
                "name": "Marea Negra"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_28() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2005",
                "name": "Anillo de fuego"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_29() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2006",
                "name": "Inframundo"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_30() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2007",
                "name": "Lejanas Picosescalofriantes"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_31() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2008",
                "name": "Cadena Laderablanca"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_32() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2009",
                "name": "Ruinas de Surmia"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_33() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2010",
                "name": "Refugio del Viajante"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_34() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2011",
                "name": "Vabbi"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_35() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2012",
                "name": "Plaza de Piken"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_36() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2013",
                "name": "Claro de la Aurora"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_37() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2014",
                "name": "Fuerte de Gunnar"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_38() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2101",
                "name": "Mar de Jade [FR]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_39() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2102",
                "name": "Fuerte Ranik [FR]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_40() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2103",
                "name": "Roca del Augurio [FR]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_41() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2104",
                "name": "Plaza de Vizunah [FR]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_42() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2105",
                "name": "Piedra Arbórea [FR]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_43() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2201",
                "name": "Kodash [DE]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_44() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2202",
                "name": "Ribera [DE]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_45() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2203",
                "name": "Cañón de Elona [DE]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_46() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2204",
                "name": "Boca de Abaddon [DE]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_47() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2205",
                "name": "Lago Drakkar [DE]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_48() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2206",
                "name": "Estrecho de Miller [DE]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_49() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2207",
                "name": "Dzagonur [DE]"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_50() {
        json.decodeFromString<GW2v1WorldName>(
            """
            {
                "id": "2301",
                "name": "Bahía de Baruch [ES]"
            }
            """.trimIndent()
        )
    }

}