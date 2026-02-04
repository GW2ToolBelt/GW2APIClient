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

class GW2v2LogoTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "ArenaNet-Path-of-Fire-logo",
                "url": "https://static.staticwars.com/logos/ArenaNet-Path-of-Fire-logo.webm"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "ArenaNet-Path-of-Fire-logo-black",
                "url": "https://static.staticwars.com/logos/ArenaNet-Path-of-Fire-logo-black.webm"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "Guild-Wars-2-exp-1-Heart-of-Thorns-logo",
                "url": "https://static.staticwars.com/logos/Guild-Wars-2-exp-1-Heart-of-Thorns-logo.webm"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_03() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "Guild-Wars-2-exp-2-Path-of-Fire-logo",
                "url": "https://static.staticwars.com/logos/Guild-Wars-2-exp-2-Path-of-Fire-logo.webm"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_04() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "Guild-Wars-2-exp-3-End-of-Dragons-logo-sfx",
                "url": "https://static.staticwars.com/logos/Guild-Wars-2-exp-3-End-of-Dragons-logo-sfx.webm"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_05() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "Guild-Wars-2-exp-4-Secrets-of-the-Obscure-logo-sfx",
                "url": "https://static.staticwars.com/logos/Guild-Wars-2-exp-4-Secrets-of-the-Obscure-logo-sfx.webm"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_06() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "Guild-Wars-2-exp-5-Janthir-Wilds-logo",
                "url": "https://static.staticwars.com/logos/Guild-Wars-2-exp-5-Janthir-Wilds-logo.webm"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_07() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "Guild-Wars-2-Icebrood-Saga-logo-de",
                "url": "https://static.staticwars.com/logos/Guild-Wars-2-Icebrood-Saga-logo-de.webm"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_08() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "Guild-Wars-2-Icebrood-Saga-logo-en",
                "url": "https://static.staticwars.com/logos/Guild-Wars-2-Icebrood-Saga-logo-en.webm"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_09() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "Guild-Wars-2-Icebrood-Saga-logo-es",
                "url": "https://static.staticwars.com/logos/Guild-Wars-2-Icebrood-Saga-logo-es.webm"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_10() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "Guild-Wars-2-Icebrood-Saga-logo-fr",
                "url": "https://static.staticwars.com/logos/Guild-Wars-2-Icebrood-Saga-logo-fr.webm"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_11() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "Guild-Wars-2-logo-de",
                "url": "https://static.staticwars.com/logos/Guild-Wars-2-logo-de.webm"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_12() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "Guild-Wars-2-logo-en",
                "url": "https://static.staticwars.com/logos/Guild-Wars-2-logo-en.webm"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_13() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "Guild-Wars-2-logo-es",
                "url": "https://static.staticwars.com/logos/Guild-Wars-2-logo-es.webm"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_14() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "Guild-Wars-2-logo-fr",
                "url": "https://static.staticwars.com/logos/Guild-Wars-2-logo-fr.webm"
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_15() {
        json.decodeFromString<GW2v2Logo>(
            """
            {
                "id": "Guild-Wars-2-Pro-League-logo-low",
                "url": "https://static.staticwars.com/logos/Guild-Wars-2-Pro-League-logo-low.webm"
            }
            """.trimIndent()
        )
    }

}