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

@Suppress("ClassName")
@Serializer(forClass = GW2v2Skin::class)
private object __GW2v2SkinGeneratedSerializer : KSerializer<GW2v2Skin>

@Suppress("ClassName")
private object __GW2v2SkinSerializer : JsonTransformingSerializer<GW2v2Skin>(__GW2v2SkinGeneratedSerializer) {
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
@Serializable(with = __GW2v2SkinSerializer::class)
public data class GW2v2Skin(
    val id: Int,
    val name: String,
    val type: String,
    val flags: List<String>,
    val restrictions: List<String>,
    val icon: String,
    val rarity: String,
    val description: String? = null,
    val details: Details? = null
) {

    @Suppress("ClassName")
    private object __JsonParametricSerializer_Details : JsonContentPolymorphicSerializer<Details>(Details::class) {
        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out Details> {
            return when (element.jsonObject["__virtualType"]!!.jsonPrimitive.content) {
                "Armor" -> Details.Armor.serializer()
                "Gathering" -> Details.Gathering.serializer()
                "Weapon" -> Details.Weapon.serializer()
                else -> TODO()
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
        private object __ArmorSerializer : JsonTransformingSerializer<Armor>(__ArmorGeneratedSerializer) {
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
        @Serializable(with = __ArmorSerializer::class)
        public data class Armor(
            val type: String,
            @SerialName("weight_class")
            val weightClass: String,
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
                val default: List<DyeSlot?>,
                val overrides: Overrides
            ) {

                /**
                 * Information about a dye slot.
                 *
                 * @param colorID the default color's ID
                 * @param material the material type
                 */
                @Serializable
                public data class DyeSlot(
                    @SerialName("color_id")
                    val colorID: Int,
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
                    @SerialName("asuramale")
                    val asuraMale: List<DyeSlot?>? = null,
                    @SerialName("asurafemale")
                    val asuraFemale: List<DyeSlot?>? = null,
                    @SerialName("charrmale")
                    val charrMale: List<DyeSlot?>? = null,
                    @SerialName("charrfemale")
                    val charrFemale: List<DyeSlot?>? = null,
                    @SerialName("humanmale")
                    val humanMale: List<DyeSlot?>? = null,
                    @SerialName("humanfemale")
                    val humanFemale: List<DyeSlot?>? = null,
                    @SerialName("nornmale")
                    val nornMale: List<DyeSlot?>? = null,
                    @SerialName("nornfemale")
                    val nornFemale: List<DyeSlot?>? = null,
                    @SerialName("sylvarimale")
                    val sylvariMale: List<DyeSlot?>? = null,
                    @SerialName("sylvarifemale")
                    val sylvariFemale: List<DyeSlot?>? = null
                )

            }

        }

        @Suppress("ClassName")
        @Serializer(forClass = Gathering::class)
        private object __GatheringGeneratedSerializer : KSerializer<Gathering>

        @Suppress("ClassName")
        private object __GatheringSerializer : JsonTransformingSerializer<Gathering>(__GatheringGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a gathering tool skin.
         *
         * @param type the skin's tool type
         */
        @Serializable(with = __GatheringSerializer::class)
        public data class Gathering(
            val type: String
        ) : Details()

        @Suppress("ClassName")
        @Serializer(forClass = Weapon::class)
        private object __WeaponGeneratedSerializer : KSerializer<Weapon>

        @Suppress("ClassName")
        private object __WeaponSerializer : JsonTransformingSerializer<Weapon>(__WeaponGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a weapon skin.
         *
         * @param type the skin's weapon type
         * @param damageType the skin's damage type
         */
        @Serializable(with = __WeaponSerializer::class)
        public data class Weapon(
            val type: String,
            @SerialName("damage_type")
            val damageType: String
        ) : Details()

    }

}