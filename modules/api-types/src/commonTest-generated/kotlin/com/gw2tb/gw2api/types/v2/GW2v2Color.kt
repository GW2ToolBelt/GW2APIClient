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

class GW2v2ColorTest {

    private val json = Json {
        useAlternativeNames = false // https://github.com/Kotlin/kotlinx.serialization/issues/1512
    }

    @Test
    fun testType_00() {
        json.decodeFromString<GW2v2Color>(
            """
            {
                "id": 1,
                "name": "Farbentferner",
                "base_rgb": [
                    128,
                    26,
                    26
                ],
                "cloth": {
                    "brightness": 15,
                    "contrast": 1.25,
                    "hue": 38,
                    "saturation": 0.28125,
                    "lightness": 1.44531,
                    "rgb": [
                        124,
                        108,
                        83
                    ]
                },
                "leather": {
                    "brightness": -8,
                    "contrast": 1,
                    "hue": 34,
                    "saturation": 0.3125,
                    "lightness": 1.09375,
                    "rgb": [
                        65,
                        49,
                        29
                    ]
                },
                "metal": {
                    "brightness": 5,
                    "contrast": 1.05469,
                    "hue": 38,
                    "saturation": 0.101563,
                    "lightness": 1.36719,
                    "rgb": [
                        96,
                        91,
                        83
                    ]
                },
                "fur": {
                    "brightness": 15,
                    "contrast": 1.25,
                    "hue": 38,
                    "saturation": 0.28125,
                    "lightness": 1.44531,
                    "rgb": [
                        124,
                        108,
                        83
                    ]
                },
                "categories": []
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_01() {
        json.decodeFromString<GW2v2Color>(
            """
            {
                "id": 376,
                "name": "Lachs",
                "base_rgb": [
                    128,
                    26,
                    26
                ],
                "cloth": {
                    "brightness": 7,
                    "contrast": 1.17188,
                    "hue": 5,
                    "saturation": 0.859375,
                    "lightness": 1.05469,
                    "rgb": [
                        133,
                        36,
                        26
                    ]
                },
                "leather": {
                    "brightness": 7,
                    "contrast": 1.17188,
                    "hue": 5,
                    "saturation": 0.78125,
                    "lightness": 1.05469,
                    "rgb": [
                        127,
                        39,
                        30
                    ]
                },
                "metal": {
                    "brightness": 7,
                    "contrast": 1.25,
                    "hue": 5,
                    "saturation": 0.703125,
                    "lightness": 1.17188,
                    "rgb": [
                        126,
                        41,
                        32
                    ]
                },
                "fur": {
                    "brightness": 7,
                    "contrast": 1.17188,
                    "hue": 5,
                    "saturation": 0.859375,
                    "lightness": 1.05469,
                    "rgb": [
                        133,
                        36,
                        26
                    ]
                },
                "categories": [
                    "Orange",
                    "Vibrant",
                    "Starter"
                ]
            }
            """.trimIndent()
        )
    }
    
    @Test
    fun testType_02() {
        json.decodeFromString<GW2v2Color>(
            """
            {
                "id": 1672,
                "name": "Prismatisch",
                "base_rgb": [
                    128,
                    26,
                    26
                ],
                "cloth": {
                    "brightness": 87,
                    "contrast": 1.99219,
                    "hue": 245,
                    "saturation": 1.99219,
                    "lightness": 1.99219,
                    "rgb": [
                        217,
                        176,
                        255
                    ]
                },
                "leather": {
                    "brightness": 87,
                    "contrast": 1.99219,
                    "hue": 245,
                    "saturation": 1.99219,
                    "lightness": 1.99219,
                    "rgb": [
                        217,
                        176,
                        255
                    ]
                },
                "metal": {
                    "brightness": 87,
                    "contrast": 1.99219,
                    "hue": 245,
                    "saturation": 1.99219,
                    "lightness": 1.99219,
                    "rgb": [
                        217,
                        176,
                        255
                    ]
                },
                "fur": {
                    "brightness": 87,
                    "contrast": 1.99219,
                    "hue": 245,
                    "saturation": 1.99219,
                    "lightness": 1.99219,
                    "rgb": [
                        217,
                        176,
                        255
                    ]
                },
                "item": 94367,
                "categories": [
                    "Blue",
                    "Vibrant",
                    "Exclusive"
                ]
            }
            """.trimIndent()
        )
    }

}