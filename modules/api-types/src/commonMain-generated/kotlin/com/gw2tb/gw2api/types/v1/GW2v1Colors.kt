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
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package com.gw2tb.gw2api.types.v1

import com.gw2tb.gw2api.types.*
import com.gw2tb.gw2api.types.internal.*

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

// Generated for type: Colors

/**
 * Information about the available dye colors.
 *
 * @param colors the colors
 */
@Serializable
public data class GW2v1Colors(
    /** This field holds the colors. */
    val colors: Map<GW2ColorId, Color>
) {

    /**
     * Information about a dye color.
     *
     * @param name the color's name
     * @param baseRgb the base RGB values
     * @param cloth detailed information on its appearance when applied on cloth armor
     * @param leather detailed information on its appearance when applied on leather armor
     * @param metal detailed information on its appearance when applied on metal armor
     * @param default detailed information on its default appearance
     * @param fur detailed information on its appearance when applied on fur armor
     * @param item the ID of the dye item
     * @param categories the categories of the color
     */
    @Serializable
    public data class Color(
        /** This field holds the color's name. */
        val name: String,
        /** This field holds the base RGB values. */
        @SerialName("base_rgb")
        val baseRgb: List<Int>,
        /** This field holds detailed information on its appearance when applied on cloth armor. */
        val cloth: Appearance,
        /** This field holds detailed information on its appearance when applied on leather armor. */
        val leather: Appearance,
        /** This field holds detailed information on its appearance when applied on metal armor. */
        val metal: Appearance,
        /** This field holds detailed information on its default appearance. */
        val default: Appearance? = null,
        /** This field holds detailed information on its appearance when applied on fur armor. */
        val fur: Appearance? = null,
        /** This field holds the ID of the dye item. */
        val item: GW2ItemId? = null,
        /** This field holds the categories of the color. */
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
         * @param rgb a list containing precalculated RGB values
         */
        @Serializable
        public data class Appearance(
            /** This field holds the brightness. */
            val brightness: Int,
            /** This field holds the contrast. */
            val contrast: Double,
            /** This field holds the hue in HSL colorspace. */
            val hue: Int,
            /** This field holds the saturation in HSL colorspace. */
            val saturation: Double,
            /** This field holds the lightness in HSL colorspace. */
            val lightness: Double,
            /** This field holds a list containing precalculated RGB values. */
            val rgb: List<Int>
        )

    }

}