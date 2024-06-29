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

// Generated for type: SkinDetails

@Suppress("ClassName")
private object __JsonParametricSerializer_GW2v1SkinDetails : JsonContentPolymorphicSerializer<GW2v1SkinDetails>(GW2v1SkinDetails::class) {
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<GW2v1SkinDetails> {
        return when (val type = element.jsonObject["type"]?.jsonPrimitive?.content) {
            "Armor" -> GW2v1SkinDetails.Armor.serializer()
            "Back" -> GW2v1SkinDetails.Back.serializer()
            "Gathering" -> GW2v1SkinDetails.Gathering.serializer()
            "Weapon" -> GW2v1SkinDetails.Weapon.serializer()
            null -> throw SerializationException("Disambiguator property not found")
            else -> throw SerializationException("Invalid disambiguator value for GW2v1SkinDetails: $type")
        }
    }
}

/** Information about a skin. */
@Serializable(with = __JsonParametricSerializer_GW2v1SkinDetails::class)
public sealed class GW2v1SkinDetails {

    /** This field holds the skin's ID. */
    public abstract val skinId: GW2SkinId

    /** This field holds the skin's localized name. */
    public abstract val name: String

    /** This field holds the skin's type. */
    public abstract val type: String

    /** This field holds the skin's rarity. */
    public abstract val rarity: String

    /** This field holds additional skin flags (ShowInWardrobe, NoCost, HideIfLocked, OverrideRarity). */
    public abstract val flags: List<String>

    /** This field holds the IDs of the races that can use this skin, or empty if it can be used by any race. */
    public abstract val restrictions: List<String>

    /** This field holds the icon's file ID to be used with the render service. */
    public abstract val iconFileId: String

    /** This field holds the icon's file signature to be used with the render service. */
    public abstract val iconFileSignature: String

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
     * @param skinId the skin's ID
     * @param name the skin's localized name
     * @param type the skin's type
     * @param rarity the skin's rarity
     * @param flags additional skin flags (ShowInWardrobe, NoCost, HideIfLocked, OverrideRarity)
     * @param restrictions the IDs of the races that can use this skin, or empty if it can be used by any race
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     */
    @Serializable(with = __ArmorSerializer0::class)
    public data class Armor(
        @SerialName("skin_id")
        override val skinId: GW2SkinId,
        override val name: String,
        override val type: String,
        override val rarity: String,
        override val flags: List<String>,
        override val restrictions: List<String>,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        public val armor: Armor
    ) : GW2v1SkinDetails() {

        /**
         * Additional information about an armor skin.
         *
         * @param armorType the skin's armor slot
         * @param weightClass the skin's armor weight
         * @param dyeSlots the skin's dye slots
         */
        @Serializable
        public data class Armor(
            /** This field holds the skin's armor slot. */
            @SerialName("type")
            val armorType: String,
            /** This field holds the skin's armor weight. */
            @SerialName("weight_class")
            val weightClass: String,
            /** This field holds the skin's dye slots. */
            @SerialName("dye_slots")
            val dyeSlots: DyeSlots
        )

        /**
         * Information about a skin's sye slots.
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
        public data class DyeSlots(
            /** This field holds the dye slot overrides for asuarn male characters. */
            @SerialName("asura_male")
            val asuraMale: List<DyeSlot?>,
            /** This field holds the dye slot overrides for asuarn female characters. */
            @SerialName("asura_female")
            val asuraFemale: List<DyeSlot?>,
            /** This field holds the dye slot overrides for charr male characters. */
            @SerialName("charr_male")
            val charrMale: List<DyeSlot?>,
            /** This field holds the dye slot overrides for charr female characters. */
            @SerialName("charr_female")
            val charrFemale: List<DyeSlot?>,
            /** This field holds the dye slot overrides for human male characters. */
            @SerialName("human_male")
            val humanMale: List<DyeSlot?>,
            /** This field holds the dye slot overrides for human female characters. */
            @SerialName("human_female")
            val humanFemale: List<DyeSlot?>,
            /** This field holds the dye slot overrides for norn male characters. */
            @SerialName("norn_male")
            val nornMale: List<DyeSlot?>,
            /** This field holds the dye slot overrides for norn female characters. */
            @SerialName("norn_female")
            val nornFemale: List<DyeSlot?>,
            /** This field holds the dye slot overrides for sylvari male characters. */
            @SerialName("sylvari_male")
            val sylvariMale: List<DyeSlot?>,
            /** This field holds the dye slot overrides for sylvari female characters. */
            @SerialName("sylvari_female")
            val sylvariFemale: List<DyeSlot?>
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
                val colorId: GW2ColorId,
                /** This field holds the material type. */
                val material: String
            )

        }

    }

    @Suppress("ClassName")
    @Serializer(forClass = Back::class)
    private object __BackGeneratedSerializer : KSerializer<Back>

    @Suppress("ClassName")
    private object __BackSerializer0 : JsonTransformingSerializer<Back>(__BackGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * Additional information about a backpack skin.
     *
     * @param skinId the skin's ID
     * @param name the skin's localized name
     * @param type the skin's type
     * @param rarity the skin's rarity
     * @param flags additional skin flags (ShowInWardrobe, NoCost, HideIfLocked, OverrideRarity)
     * @param restrictions the IDs of the races that can use this skin, or empty if it can be used by any race
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     */
    @Serializable(with = __BackSerializer0::class)
    public data class Back(
        @SerialName("skin_id")
        override val skinId: GW2SkinId,
        override val name: String,
        override val type: String,
        override val rarity: String,
        override val flags: List<String>,
        override val restrictions: List<String>,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        public val back: Back
    ) : GW2v1SkinDetails() {

        /** Additional information about a backpack skin. */
        @Serializable
        public data object Back

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
     * @param skinId the skin's ID
     * @param name the skin's localized name
     * @param type the skin's type
     * @param rarity the skin's rarity
     * @param flags additional skin flags (ShowInWardrobe, NoCost, HideIfLocked, OverrideRarity)
     * @param restrictions the IDs of the races that can use this skin, or empty if it can be used by any race
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     */
    @Serializable(with = __GatheringSerializer0::class)
    public data class Gathering(
        @SerialName("skin_id")
        override val skinId: GW2SkinId,
        override val name: String,
        override val type: String,
        override val rarity: String,
        override val flags: List<String>,
        override val restrictions: List<String>,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        public val gathering: Gathering
    ) : GW2v1SkinDetails() {

        /** Additional information about a gathering tool skin. */
        @Serializable
        public data object Gathering

    }

    @Suppress("ClassName")
    @Serializer(forClass = Weapon::class)
    private object __WeaponGeneratedSerializer : KSerializer<Weapon>

    @Suppress("ClassName")
    private object __WeaponSerializer0 : JsonTransformingSerializer<Weapon>(__WeaponGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * Additional information about a gathering tool skin.
     *
     * @param skinId the skin's ID
     * @param name the skin's localized name
     * @param type the skin's type
     * @param rarity the skin's rarity
     * @param flags additional skin flags (ShowInWardrobe, NoCost, HideIfLocked, OverrideRarity)
     * @param restrictions the IDs of the races that can use this skin, or empty if it can be used by any race
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     */
    @Serializable(with = __WeaponSerializer0::class)
    public data class Weapon(
        @SerialName("skin_id")
        override val skinId: GW2SkinId,
        override val name: String,
        override val type: String,
        override val rarity: String,
        override val flags: List<String>,
        override val restrictions: List<String>,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        public val weapon: Weapon
    ) : GW2v1SkinDetails() {

        /**
         * Additional information about a gathering tool skin.
         *
         * @param weaponType the skin's weapon type
         * @param damageType the skin's damage type
         */
        @Serializable
        public data class Weapon(
            /** This field holds the skin's weapon type. */
            @SerialName("weapon_type")
            val weaponType: String,
            /** This field holds the skin's damage type. */
            @SerialName("damage_type")
            val damageType: String
        )

    }

}