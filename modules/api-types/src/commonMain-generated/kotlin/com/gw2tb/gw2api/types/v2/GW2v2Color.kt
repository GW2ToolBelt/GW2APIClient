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
package com.gw2tb.gw2api.types.v2

import com.gw2tb.gw2api.types.*
import com.gw2tb.gw2api.types.internal.*

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

// Generated for type: Color

/**
 * Information about a dye color.
 *
 * @param id the color's ID
 * @param name the color's name
 * @param baseRgb the base RGB values
 * @param cloth detailed information on its appearance when applied on cloth armor
 * @param leather detailed information on its appearance when applied on leather armor
 * @param metal detailed information on its appearance when applied on metal armor
 * @param fur detailed information on its appearance when applied on fur armor
 * @param item the ID of the dye item
 * @param categories the categories of the color
 */
@Serializable
public data class GW2v2Color(
    /** This field holds the color's ID. */
    val id: Int,
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
    /** This field holds detailed information on its appearance when applied on fur armor. */
    val fur: Appearance? = null,
    /** This field holds the ID of the dye item. */
    val item: Int? = null,
    /** This field holds the categories of the color. */
    val categories: Categories? = null
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

    @Suppress("ClassName")
    @Serializer(forClass = Categories::class)
    private object __CategoriesGeneratedSerializer : KSerializer<Categories?>

    @Suppress("ClassName")
    private object __CategoriesSerializer : JsonTupleSerializer<Categories?>(__CategoriesGeneratedSerializer)

    /** The color's categories. */
    @Serializable(with = __CategoriesSerializer::class)
    public data class Categories(
        /** This field holds the color's hue. */
        public val hue: Hue,
        /** This field holds the color's material. */
        public val material: Material,
        /** This field holds the color's rarity. */
        public val rarity: Rarity
    ) {

        @Suppress("ClassName")
        private object __HueSerializer : KSerializer<Hue> {

            override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("Hue", PrimitiveKind.STRING)

            override fun deserialize(decoder: Decoder): Hue = when (val value = decoder.decodeString()) {
                "Blue" -> Hue.Blue
                "Brown" -> Hue.Brown
                "Gray" -> Hue.Gray
                "Green" -> Hue.Green
                "Orange" -> Hue.Orange
                "Purple" -> Hue.Purple
                "Red" -> Hue.Red
                "Yellow" -> Hue.Yellow
                else -> Hue.Unknown(value)
            }

            override fun serialize(encoder: Encoder, value: Hue) {
                encoder.encodeString(value.value)
            }

        }


        /** A hue. */
        @Serializable(with = __HueSerializer::class)
        public sealed class Hue {

            public abstract val value: String

            /** An unknown value. */
            public data class Unknown(override val value: String) : Hue()

            /** Blue */
            @Serializable
            public data object Blue : Hue() {
                override val value: String get() = "Blue"
            }

            /** Brown */
            @Serializable
            public data object Brown : Hue() {
                override val value: String get() = "Brown"
            }

            /** Gray */
            @Serializable
            public data object Gray : Hue() {
                override val value: String get() = "Gray"
            }

            /** Green */
            @Serializable
            public data object Green : Hue() {
                override val value: String get() = "Green"
            }

            /** Orange */
            @Serializable
            public data object Orange : Hue() {
                override val value: String get() = "Orange"
            }

            /** Purple */
            @Serializable
            public data object Purple : Hue() {
                override val value: String get() = "Purple"
            }

            /** Red */
            @Serializable
            public data object Red : Hue() {
                override val value: String get() = "Red"
            }

            /** Yellow */
            @Serializable
            public data object Yellow : Hue() {
                override val value: String get() = "Yellow"
            }

        }

        @Suppress("ClassName")
        private object __MaterialSerializer : KSerializer<Material> {

            override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("Material", PrimitiveKind.STRING)

            override fun deserialize(decoder: Decoder): Material = when (val value = decoder.decodeString()) {
                "Vibrant" -> Material.Vibrant
                "Leather" -> Material.Leather
                "Metal" -> Material.Metal
                else -> Material.Unknown(value)
            }

            override fun serialize(encoder: Encoder, value: Material) {
                encoder.encodeString(value.value)
            }

        }


        /** The material of a color. */
        @Serializable(with = __MaterialSerializer::class)
        public sealed class Material {

            public abstract val value: String

            /** An unknown value. */
            public data class Unknown(override val value: String) : Material()

            /** Vibrant */
            @Serializable
            public data object Vibrant : Material() {
                override val value: String get() = "Vibrant"
            }

            /** Leather */
            @Serializable
            public data object Leather : Material() {
                override val value: String get() = "Leather"
            }

            /** Metal */
            @Serializable
            public data object Metal : Material() {
                override val value: String get() = "Metal"
            }

        }

        @Suppress("ClassName")
        private object __RaritySerializer : KSerializer<Rarity> {

            override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("Rarity", PrimitiveKind.STRING)

            override fun deserialize(decoder: Decoder): Rarity = when (val value = decoder.decodeString()) {
                "Starter" -> Rarity.Starter
                "Common" -> Rarity.Common
                "Uncommon" -> Rarity.Uncommon
                "Rare" -> Rarity.Rare
                "Exclusive" -> Rarity.Exclusive
                else -> Rarity.Unknown(value)
            }

            override fun serialize(encoder: Encoder, value: Rarity) {
                encoder.encodeString(value.value)
            }

        }


        /** The rarity of a color. */
        @Serializable(with = __RaritySerializer::class)
        public sealed class Rarity {

            public abstract val value: String

            /** An unknown value. */
            public data class Unknown(override val value: String) : Rarity()

            /** Indicates that the color is unlocked from the start. */
            @Serializable
            public data object Starter : Rarity() {
                override val value: String get() = "Starter"
            }

            /** Common rarity. */
            @Serializable
            public data object Common : Rarity() {
                override val value: String get() = "Common"
            }

            /** Uncommon rarity. */
            @Serializable
            public data object Uncommon : Rarity() {
                override val value: String get() = "Uncommon"
            }

            /** Rare rarity. */
            @Serializable
            public data object Rare : Rarity() {
                override val value: String get() = "Rare"
            }

            /** Exclusive rarity. */
            @Serializable
            public data object Exclusive : Rarity() {
                override val value: String get() = "Exclusive"
            }

        }

    }

}