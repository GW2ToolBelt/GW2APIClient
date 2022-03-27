/*
 * Copyright (c) 2018-2021 Leon Linhart
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
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package com.gw2tb.gw2api.types.v2

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*

/**
 * Information about a dye color.
 *
 * @param id the color's ID
 * @param name the color's name
 * @param baseRGB the base RGB values
 * @param cloth detailed information on its appearance when applied on cloth armor
 * @param leather detailed information on its appearance when applied on leather armor
 * @param metal detailed information on its appearance when applied on metal armor
 * @param fur detailed information on its appearance when applied on fur armor
 * @param item the ID of the dye item
 * @param categories the categories of the color
 */
@Serializable
public data class GW2v2Color(
    val id: Int,
    val name: String,
    @SerialName("base_rgb")
    val baseRGB: List<Int>,
    val cloth: Appearance,
    val leather: Appearance,
    val metal: Appearance,
    val fur: Appearance? = null,
    val item: Int? = null,
    val categories: List<String>
) {

    /**
     * Information about the appearance of the color.
     *
     * @param brightness the brightness
     * @param contrast the contrast
     * @param hue the hue in HSL colorspace
     * @param saturation the saturation in HSL colorspace
     * @param lightness the lightness in HSL colorspace
     * @param rGB a list containing precalculated RGB values
     */
    @Serializable
    public data class Appearance(
        val brightness: Int,
        val contrast: Double,
        val hue: Int,
        val saturation: Double,
        val lightness: Double,
        @SerialName("rgb")
        val rGB: List<Int>
    )

}