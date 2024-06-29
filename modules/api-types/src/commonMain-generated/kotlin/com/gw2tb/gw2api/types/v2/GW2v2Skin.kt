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

// Generated for type: Skin

@Suppress("ClassName")
@Serializer(forClass = GW2v2Skin::class)
private object __GW2v2SkinGeneratedSerializer : KSerializer<GW2v2Skin>

@Suppress("ClassName")
private object __GW2v2SkinSerializer0 : JsonTransformingSerializer<GW2v2Skin>(__GW2v2SkinGeneratedSerializer) {
    override fun transformDeserialize(element: JsonElement): JsonElement =
        JsonObject(element.jsonObject.mapValues { (key, value) ->
            when (key) {
                "details" -> JsonObject(value.jsonObject + ("__virtualType" to JsonPrimitive(element.jsonObject["type"]!!.jsonPrimitive.content)))
                else -> value
            }
        })
}

/**
 * Information about a skin.
 *
 * @param id the skin's ID
 * @param name the skin's localized name
 * @param type the skin's type
 * @param flags additional skin flags (ShowInWardrobe, NoCost, HideIfLocked, OverrideRarity)
 * @param restrictions the IDs of the races that can use this skin, or empty if it can be used by any race
 * @param icon a render service URL for the skin's icon
 * @param rarity the skin's rarity
 * @param description the skin's description
 * @param details additional information about the skin
 */
@Serializable(with = __GW2v2SkinSerializer0::class)
public data class GW2v2Skin(
    /** This field holds the skin's ID. */
    val id: GW2SkinId,
    /** This field holds the skin's localized name. */
    val name: String,
    /** This field holds the skin's type. */
    val type: String,
    /** This field holds additional skin flags (ShowInWardrobe, NoCost, HideIfLocked, OverrideRarity). */
    val flags: List<String>,
    /** This field holds the IDs of the races that can use this skin, or empty if it can be used by any race. */
    val restrictions: List<String>,
    /** This field holds a render service URL for the skin's icon. */
    val icon: String,
    /** This field holds the skin's rarity. */
    val rarity: String,
    /** This field holds the skin's description. */
    val description: String? = null,
    /** This field holds additional information about the skin. */
    val details: Details? = null
) {

    @Suppress("ClassName")
    private object __JsonParametricSerializer_Details : JsonContentPolymorphicSerializer<Details>(Details::class) {
        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<Details> {
            return when (val type = element.jsonObject["__virtualType"]?.jsonPrimitive?.content) {
                "Armor" -> Details.Armor.serializer()
                "Gathering" -> Details.Gathering.serializer()
                "Weapon" -> Details.Weapon.serializer()
                null -> throw SerializationException("Disambiguator property not found")
                else -> throw SerializationException("Invalid disambiguator value for Details: $type")
            }
        }
    }

    /** Additional information about a skin. */
    @Serializable(with = __JsonParametricSerializer_Details::class)
    public sealed class Details {

        @Suppress("ClassName")
        @Serializer(forClass = Armor::class)
        private object __ArmorGeneratedSerializer : KSerializer<Armor>

        @Suppress("ClassName")
        private object __ArmorSerializer0 : JsonTransformingSerializer<Armor>(__ArmorGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about an armor skin.
         *
         * @param type the skin's armor slot
         * @param weightClass the skin's armor weight
         * @param dyeSlots the skin's dye slots
         */
        @Serializable(with = __ArmorSerializer0::class)
        public data class Armor(
            /** This field holds the skin's armor slot. */
            val type: String,
            /** This field holds the skin's armor weight. */
            @SerialName("weight_class")
            val weightClass: String,
            /** This field holds the skin's dye slots. */
            @SerialName("dye_slots")
            val dyeSlots: DyeSlots
        ) : Details() {

            /**
             * Information about a skin's sye slots.
             *
             * @param default the default dye slots
             * @param overrides the race/gender dye slot overrides
             */
            @Serializable
            public data class DyeSlots(
                /** This field holds the default dye slots. */
                val default: List<DyeSlot?>,
                /** This field holds the race/gender dye slot overrides. */
                val overrides: Overrides
            ) {

                /**
                 * Information about a dye slot.
                 *
                 * @param colorId the default color's ID
                 * @param material the material type
                 */
                @Serializable
                public data class DyeSlot(
                    /** This field holds the default color's ID. */
                    @SerialName("color_id")
                    val colorId: Int,
                    /** This field holds the material type. */
                    val material: String
                )

                /**
                 * Information about race/gender dye slot overrides.
                 *
                 * @param asuraMale the dye slot overrides for asuarn male characters
                 * @param asuraFemale the dye slot overrides for asuarn female characters
                 * @param charrMale the dye slot overrides for charr male characters
                 * @param charrFemale the dye slot overrides for charr female characters
                 * @param humanMale the dye slot overrides for human male characters
                 * @param humanFemale the dye slot overrides for human female characters
                 * @param nornMale the dye slot overrides for norn male characters
                 * @param nornFemale the dye slot overrides for norn female characters
                 * @param sylvariMale the dye slot overrides for sylvari male characters
                 * @param sylvariFemale the dye slot overrides for sylvari female characters
                 */
                @Serializable
                public data class Overrides(
                    /** This field holds the dye slot overrides for asuarn male characters. */
                    @SerialName("AsuraMale")
                    val asuraMale: List<DyeSlot?>? = null,
                    /** This field holds the dye slot overrides for asuarn female characters. */
                    @SerialName("AsuraFemale")
                    val asuraFemale: List<DyeSlot?>? = null,
                    /** This field holds the dye slot overrides for charr male characters. */
                    @SerialName("CharrMale")
                    val charrMale: List<DyeSlot?>? = null,
                    /** This field holds the dye slot overrides for charr female characters. */
                    @SerialName("CharrFemale")
                    val charrFemale: List<DyeSlot?>? = null,
                    /** This field holds the dye slot overrides for human male characters. */
                    @SerialName("HumanMale")
                    val humanMale: List<DyeSlot?>? = null,
                    /** This field holds the dye slot overrides for human female characters. */
                    @SerialName("HumanFemale")
                    val humanFemale: List<DyeSlot?>? = null,
                    /** This field holds the dye slot overrides for norn male characters. */
                    @SerialName("NornMale")
                    val nornMale: List<DyeSlot?>? = null,
                    /** This field holds the dye slot overrides for norn female characters. */
                    @SerialName("NornFemale")
                    val nornFemale: List<DyeSlot?>? = null,
                    /** This field holds the dye slot overrides for sylvari male characters. */
                    @SerialName("SylvariMale")
                    val sylvariMale: List<DyeSlot?>? = null,
                    /** This field holds the dye slot overrides for sylvari female characters. */
                    @SerialName("SylvariFemale")
                    val sylvariFemale: List<DyeSlot?>? = null
                )

            }

        }

        @Suppress("ClassName")
        @Serializer(forClass = Gathering::class)
        private object __GatheringGeneratedSerializer : KSerializer<Gathering>

        @Suppress("ClassName")
        private object __GatheringSerializer0 : JsonTransformingSerializer<Gathering>(__GatheringGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a gathering tool skin.
         *
         * @param type the skin's tool type
         */
        @Serializable(with = __GatheringSerializer0::class)
        public data class Gathering(
            /** This field holds the skin's tool type. */
            val type: String
        ) : Details()

        @Suppress("ClassName")
        @Serializer(forClass = Weapon::class)
        private object __WeaponGeneratedSerializer : KSerializer<Weapon>

        @Suppress("ClassName")
        private object __WeaponSerializer0 : JsonTransformingSerializer<Weapon>(__WeaponGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a weapon skin.
         *
         * @param type the skin's weapon type
         * @param damageType the skin's damage type
         */
        @Serializable(with = __WeaponSerializer0::class)
        public data class Weapon(
            /** This field holds the skin's weapon type. */
            val type: String,
            /** This field holds the skin's damage type. */
            @SerialName("damage_type")
            val damageType: String
        ) : Details()

    }

}