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

// Generated for type: ItemDetails

@Suppress("ClassName")
private object __JsonParametricSerializer_GW2v1ItemDetails : JsonContentPolymorphicSerializer<GW2v1ItemDetails>(GW2v1ItemDetails::class) {
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<GW2v1ItemDetails> {
        return when (val type = element.jsonObject["type"]?.jsonPrimitive?.content) {
            "Armor" -> GW2v1ItemDetails.Armor.serializer()
            "Back" -> GW2v1ItemDetails.Back.serializer()
            "Bag" -> GW2v1ItemDetails.Bag.serializer()
            "Consumable" -> GW2v1ItemDetails.Consumable.serializer()
            "Container" -> GW2v1ItemDetails.Container.serializer()
            "Gathering" -> GW2v1ItemDetails.GatheringTool.serializer()
            "Gizmo" -> GW2v1ItemDetails.Gizmo.serializer()
            "MiniPet" -> GW2v1ItemDetails.MiniPet.serializer()
            "Tool" -> GW2v1ItemDetails.Tool.serializer()
            "Trinket" -> GW2v1ItemDetails.Trinket.serializer()
            "UpgradeComponent" -> GW2v1ItemDetails.UpgradeComponent.serializer()
            "Weapon" -> GW2v1ItemDetails.Weapon.serializer()
            null -> throw SerializationException("Disambiguator property not found")
            else -> throw SerializationException("Invalid disambiguator value for GW2v1ItemDetails: $type")
        }
    }
}

/** Information about an item. */
@Serializable(with = __JsonParametricSerializer_GW2v1ItemDetails::class)
public sealed class GW2v1ItemDetails {

    /** This field holds the item's ID. */
    public abstract val itemId: GW2ItemId

    /** This field holds the item's name. */
    public abstract val name: String

    /** This field holds the item's type. */
    public abstract val type: String

    /** This field holds the icon's file ID to be used with the render service. */
    public abstract val iconFileId: String

    /** This field holds the icon's file signature to be used with the render service. */
    public abstract val iconFileSignature: String

    /** This field holds the item's description. */
    public abstract val description: String?

    /** This field holds the item's rarity. */
    public abstract val rarity: String

    /** This field holds the level required to use the item. */
    public abstract val level: Int

    /** This field holds the value in coins when selling the item to a vendor. */
    public abstract val vendorValue: Int

    /** This field holds the ID of the item's default skin. */
    public abstract val defaultSkin: Int?

    /** This field holds flags applying to the item. */
    public abstract val flags: List<String>

    /** This field holds the game types in which the item is usable. */
    public abstract val gameTypes: List<String>

    /** This field holds restrictions applied to the item. */
    public abstract val restrictions: List<String>

    /** This field holds lists what items this item can be upgraded from and into, and the method of upgrading. */
    public abstract val upgradeRecipes: List<Upgrade>?

    /**
     * Information about an item's upgrade.
     *
     * @param itemId the item's ID
     * @param name the item's name
     * @param type the item's type
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     * @param description the item's description
     * @param rarity the item's rarity
     * @param level the level required to use the item
     * @param vendorValue the value in coins when selling the item to a vendor
     * @param defaultSkin the ID of the item's default skin
     * @param flags flags applying to the item
     * @param gameTypes the game types in which the item is usable
     * @param restrictions restrictions applied to the item
     * @param upgradeRecipes lists what items this item can be upgraded from and into, and the method of upgrading
     * @param type describes the method of upgrading
     * @param from the ID of the item that is upgraded into the item
     * @param into the ID of the item that results from performing the upgrade
     */
    @Serializable
    public data class Upgrade(
        /** This field holds describes the method of upgrading. */
        val type: String,
        /** This field holds the ID of the item that is upgraded into the item. */
        val from: GW2ItemId? = null,
        /** This field holds the ID of the item that results from performing the upgrade. */
        val into: GW2ItemId? = null
    )

    /**
     * Information about an items infusion slot.
     *
     * @param itemId the item's ID
     * @param name the item's name
     * @param type the item's type
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     * @param description the item's description
     * @param rarity the item's rarity
     * @param level the level required to use the item
     * @param vendorValue the value in coins when selling the item to a vendor
     * @param defaultSkin the ID of the item's default skin
     * @param flags flags applying to the item
     * @param gameTypes the game types in which the item is usable
     * @param restrictions restrictions applied to the item
     * @param upgradeRecipes lists what items this item can be upgraded from and into, and the method of upgrading
     * @param flags infusion slot type of infusion upgrades
     * @param itemId the infusion upgrade in the armor piece
     */
    @Serializable
    public data class InfusionSlot(
        /** This field holds infusion slot type of infusion upgrades. */
        val flags: List<String>,
        /** This field holds the infusion upgrade in the armor piece. */
        @SerialName("item_id")
        val itemId: GW2ItemId? = null
    )

    /**
     * Information about an item's infix upgrade.
     *
     * @param itemId the item's ID
     * @param name the item's name
     * @param type the item's type
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     * @param description the item's description
     * @param rarity the item's rarity
     * @param level the level required to use the item
     * @param vendorValue the value in coins when selling the item to a vendor
     * @param defaultSkin the ID of the item's default skin
     * @param flags flags applying to the item
     * @param gameTypes the game types in which the item is usable
     * @param restrictions restrictions applied to the item
     * @param upgradeRecipes lists what items this item can be upgraded from and into, and the method of upgrading
     * @param id the itemstat ID
     * @param attributes the list of attribute bonuses granted by this item
     * @param buff object containing an additional effect
     */
    @Serializable
    public data class InfixUpgrade(
        /** This field holds the itemstat ID. */
        val id: GW2ItemStatId,
        /** This field holds the list of attribute bonuses granted by this item. */
        val attributes: List<Attribute>,
        /** This field holds object containing an additional effect. */
        val buff: Buff? = null
    ) {

        /**
         * Information about an infix upgrade's attribute bonuses.
         *
         * @param attribute the attribute this bonus applies to
         * @param modifier the modifier value
         */
        @Serializable
        public data class Attribute(
            /** This field holds the attribute this bonus applies to. */
            val attribute: String,
            /** This field holds the modifier value. */
            val modifier: Int
        )

        /**
         * Information about an infix upgrade's buffs.
         *
         * @param skillId the skill ID of the effect
         * @param description the effect's description
         */
        @Serializable
        public data class Buff(
            /** This field holds the skill ID of the effect. */
            @SerialName("skill_id")
            val skillId: GW2SkillId,
            /** This field holds the effect's description. */
            val description: String? = null
        )

    }

    @Suppress("ClassName")
    @Serializer(forClass = Armor::class)
    private object __ArmorGeneratedSerializer : KSerializer<Armor>

    @Suppress("ClassName")
    private object __ArmorSerializer0 : JsonTransformingSerializer<Armor>(__ArmorGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * Additional information about an armor item.
     *
     * @param itemId the item's ID
     * @param name the item's name
     * @param type the item's type
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     * @param description the item's description
     * @param rarity the item's rarity
     * @param level the level required to use the item
     * @param vendorValue the value in coins when selling the item to a vendor
     * @param defaultSkin the ID of the item's default skin
     * @param flags flags applying to the item
     * @param gameTypes the game types in which the item is usable
     * @param restrictions restrictions applied to the item
     * @param upgradeRecipes lists what items this item can be upgraded from and into, and the method of upgrading
     */
    @Serializable(with = __ArmorSerializer0::class)
    public data class Armor(
        @SerialName("item_id")
        override val itemId: GW2ItemId,
        override val name: String,
        override val type: String,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        override val description: String? = null,
        override val rarity: String,
        override val level: Int,
        @SerialName("vendor_value")
        override val vendorValue: Int,
        @SerialName("default_skin")
        override val defaultSkin: Int? = null,
        override val flags: List<String>,
        @SerialName("game_types")
        override val gameTypes: List<String>,
        override val restrictions: List<String>,
        @SerialName("upgrade_recipes")
        override val upgradeRecipes: List<Upgrade>? = null,
        public val armor: Armor
    ) : GW2v1ItemDetails() {

        /**
         * Additional information about an armor item.
         *
         * @param type the armor slot type
         * @param weightClass the weight class
         * @param defense the defense value of the armor piece
         * @param infusionSlots infusion slots of the armor piece
         * @param infixUpgrade infix upgrade object
         * @param suffixItemId the suffix item ID
         * @param secondarySuffixItemId the secondary suffix item ID
         * @param statChoices a list of selectable stat IDs which are visible in /v2/itemstats
         * @param attributeAdjustment The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats
         */
        @Serializable
        public data class Armor(
            /** This field holds the armor slot type. */
            val type: String,
            /** This field holds the weight class. */
            @SerialName("weight_class")
            val weightClass: String,
            /** This field holds the defense value of the armor piece. */
            val defense: Int,
            /** This field holds infusion slots of the armor piece. */
            @SerialName("infusion_slots")
            val infusionSlots: List<InfusionSlot>,
            /** This field holds infix upgrade object. */
            @SerialName("infix_upgrade")
            val infixUpgrade: InfixUpgrade? = null,
            /** This field holds the suffix item ID. */
            @SerialName("suffix_item_id")
            @Serializable(with = LenientGW2ItemIdSerializer::class)
            val suffixItemId: GW2ItemId? = null,
            /** This field holds the secondary suffix item ID. */
            @SerialName("secondary_suffix_item_id")
            @Serializable(with = LenientGW2ItemIdSerializer::class)
            val secondarySuffixItemId: GW2ItemId? = null,
            /** This field holds a list of selectable stat IDs which are visible in /v2/itemstats. */
            @SerialName("stat_choices")
            val statChoices: List<GW2ItemStatId>? = null,
            /** This field holds The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats. */
            @SerialName("attribute_adjustment")
            val attributeAdjustment: Double? = null
        )

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
     * Additional information about a backpiece.
     *
     * @param itemId the item's ID
     * @param name the item's name
     * @param type the item's type
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     * @param description the item's description
     * @param rarity the item's rarity
     * @param level the level required to use the item
     * @param vendorValue the value in coins when selling the item to a vendor
     * @param defaultSkin the ID of the item's default skin
     * @param flags flags applying to the item
     * @param gameTypes the game types in which the item is usable
     * @param restrictions restrictions applied to the item
     * @param upgradeRecipes lists what items this item can be upgraded from and into, and the method of upgrading
     */
    @Serializable(with = __BackSerializer0::class)
    public data class Back(
        @SerialName("item_id")
        override val itemId: GW2ItemId,
        override val name: String,
        override val type: String,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        override val description: String? = null,
        override val rarity: String,
        override val level: Int,
        @SerialName("vendor_value")
        override val vendorValue: Int,
        @SerialName("default_skin")
        override val defaultSkin: Int? = null,
        override val flags: List<String>,
        @SerialName("game_types")
        override val gameTypes: List<String>,
        override val restrictions: List<String>,
        @SerialName("upgrade_recipes")
        override val upgradeRecipes: List<Upgrade>? = null,
        public val back: Back
    ) : GW2v1ItemDetails() {

        /**
         * Additional information about a backpiece.
         *
         * @param infusionSlots infusion slots of the back item
         * @param infixUpgrade infix upgrade object
         * @param suffixItemId the suffix item ID
         * @param secondarySuffixItemId the secondary suffix item ID
         * @param statChoices a list of selectable stat IDs which are visible in /v2/itemstats
         * @param attributeAdjustment The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats
         */
        @Serializable
        public data class Back(
            /** This field holds infusion slots of the back item. */
            @SerialName("infusion_slots")
            val infusionSlots: List<InfusionSlot>,
            /** This field holds infix upgrade object. */
            @SerialName("infix_upgrade")
            val infixUpgrade: InfixUpgrade? = null,
            /** This field holds the suffix item ID. */
            @SerialName("suffix_item_id")
            @Serializable(with = LenientGW2ItemIdSerializer::class)
            val suffixItemId: GW2ItemId? = null,
            /** This field holds the secondary suffix item ID. */
            @SerialName("secondary_suffix_item_id")
            @Serializable(with = LenientGW2ItemIdSerializer::class)
            val secondarySuffixItemId: GW2ItemId? = null,
            /** This field holds a list of selectable stat IDs which are visible in /v2/itemstats. */
            @SerialName("stat_choices")
            val statChoices: List<GW2ItemStatId>? = null,
            /** This field holds The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats. */
            @SerialName("attribute_adjustment")
            val attributeAdjustment: Double? = null
        )

    }

    @Suppress("ClassName")
    @Serializer(forClass = Bag::class)
    private object __BagGeneratedSerializer : KSerializer<Bag>

    @Suppress("ClassName")
    private object __BagSerializer0 : JsonTransformingSerializer<Bag>(__BagGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * Additional information about a bag.
     *
     * @param itemId the item's ID
     * @param name the item's name
     * @param type the item's type
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     * @param description the item's description
     * @param rarity the item's rarity
     * @param level the level required to use the item
     * @param vendorValue the value in coins when selling the item to a vendor
     * @param defaultSkin the ID of the item's default skin
     * @param flags flags applying to the item
     * @param gameTypes the game types in which the item is usable
     * @param restrictions restrictions applied to the item
     * @param upgradeRecipes lists what items this item can be upgraded from and into, and the method of upgrading
     */
    @Serializable(with = __BagSerializer0::class)
    public data class Bag(
        @SerialName("item_id")
        override val itemId: GW2ItemId,
        override val name: String,
        override val type: String,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        override val description: String? = null,
        override val rarity: String,
        override val level: Int,
        @SerialName("vendor_value")
        override val vendorValue: Int,
        @SerialName("default_skin")
        override val defaultSkin: Int? = null,
        override val flags: List<String>,
        @SerialName("game_types")
        override val gameTypes: List<String>,
        override val restrictions: List<String>,
        @SerialName("upgrade_recipes")
        override val upgradeRecipes: List<Upgrade>? = null,
        public val bag: Bag
    ) : GW2v1ItemDetails() {

        /**
         * Additional information about a bag.
         *
         * @param size the number of bag slots
         * @param noSellOrSort whether the bag is invisible
         */
        @Serializable
        public data class Bag(
            /** This field holds the number of bag slots. */
            val size: Int,
            /** This field holds whether the bag is invisible. */
            @SerialName("no_sell_or_sort")
            val noSellOrSort: Boolean
        )

    }

    @Suppress("ClassName")
    @Serializer(forClass = Consumable::class)
    private object __ConsumableGeneratedSerializer : KSerializer<Consumable>

    @Suppress("ClassName")
    private object __ConsumableSerializer0 : JsonTransformingSerializer<Consumable>(__ConsumableGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * Additional information about a consumable item.
     *
     * @param itemId the item's ID
     * @param name the item's name
     * @param type the item's type
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     * @param description the item's description
     * @param rarity the item's rarity
     * @param level the level required to use the item
     * @param vendorValue the value in coins when selling the item to a vendor
     * @param defaultSkin the ID of the item's default skin
     * @param flags flags applying to the item
     * @param gameTypes the game types in which the item is usable
     * @param restrictions restrictions applied to the item
     * @param upgradeRecipes lists what items this item can be upgraded from and into, and the method of upgrading
     */
    @Serializable(with = __ConsumableSerializer0::class)
    public data class Consumable(
        @SerialName("item_id")
        override val itemId: GW2ItemId,
        override val name: String,
        override val type: String,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        override val description: String? = null,
        override val rarity: String,
        override val level: Int,
        @SerialName("vendor_value")
        override val vendorValue: Int,
        @SerialName("default_skin")
        override val defaultSkin: Int? = null,
        override val flags: List<String>,
        @SerialName("game_types")
        override val gameTypes: List<String>,
        override val restrictions: List<String>,
        @SerialName("upgrade_recipes")
        override val upgradeRecipes: List<Upgrade>? = null,
        public val consumable: Consumable
    ) : GW2v1ItemDetails() {

        /**
         * Additional information about a consumable item.
         *
         * @param type the consumable type
         * @param description effect description for consumables applying an effect
         * @param durationMs effect duration in milliseconds
         * @param unlockType unlock type for unlock consumables
         * @param colorId the dye ID for dye unlocks
         * @param recipeId the recipe ID for recipe unlocks
         * @param extraRecipeIds additional recipe IDs for recipe unlocks
         * @param guildUpgradeId the guild upgrade ID for the item
         * @param applyCount the number of stacks of the effect applied by this item
         * @param name the effect type name of the consumable
         * @param icon the icon of the effect
         * @param skins a list of skin ids which this item unlocks
         */
        @Serializable
        public data class Consumable(
            /** This field holds the consumable type. */
            val type: String,
            /** This field holds effect description for consumables applying an effect. */
            val description: String? = null,
            /** This field holds effect duration in milliseconds. */
            @SerialName("duration_ms")
            val durationMs: Int? = null,
            /** This field holds unlock type for unlock consumables. */
            @SerialName("unlock_type")
            val unlockType: String? = null,
            /** This field holds the dye ID for dye unlocks. */
            @SerialName("color_id")
            val colorId: GW2ColorId? = null,
            /** This field holds the recipe ID for recipe unlocks. */
            @SerialName("recipe_id")
            val recipeId: GW2RecipeId? = null,
            /** This field holds additional recipe IDs for recipe unlocks. */
            @SerialName("extra_recipe_ids")
            val extraRecipeIds: List<GW2RecipeId>? = null,
            /** This field holds the guild upgrade ID for the item. */
            @SerialName("guild_upgrade_id")
            val guildUpgradeId: GW2GuildUpgradeId? = null,
            /** This field holds the number of stacks of the effect applied by this item. */
            @SerialName("apply_count")
            val applyCount: Int? = null,
            /** This field holds the effect type name of the consumable. */
            val name: String? = null,
            /** This field holds the icon of the effect. */
            val icon: String? = null,
            /** This field holds a list of skin ids which this item unlocks. */
            val skins: List<GW2SkinId>? = null
        )

    }

    @Suppress("ClassName")
    @Serializer(forClass = Container::class)
    private object __ContainerGeneratedSerializer : KSerializer<Container>

    @Suppress("ClassName")
    private object __ContainerSerializer0 : JsonTransformingSerializer<Container>(__ContainerGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * Additional information about a container.
     *
     * @param itemId the item's ID
     * @param name the item's name
     * @param type the item's type
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     * @param description the item's description
     * @param rarity the item's rarity
     * @param level the level required to use the item
     * @param vendorValue the value in coins when selling the item to a vendor
     * @param defaultSkin the ID of the item's default skin
     * @param flags flags applying to the item
     * @param gameTypes the game types in which the item is usable
     * @param restrictions restrictions applied to the item
     * @param upgradeRecipes lists what items this item can be upgraded from and into, and the method of upgrading
     */
    @Serializable(with = __ContainerSerializer0::class)
    public data class Container(
        @SerialName("item_id")
        override val itemId: GW2ItemId,
        override val name: String,
        override val type: String,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        override val description: String? = null,
        override val rarity: String,
        override val level: Int,
        @SerialName("vendor_value")
        override val vendorValue: Int,
        @SerialName("default_skin")
        override val defaultSkin: Int? = null,
        override val flags: List<String>,
        @SerialName("game_types")
        override val gameTypes: List<String>,
        override val restrictions: List<String>,
        @SerialName("upgrade_recipes")
        override val upgradeRecipes: List<Upgrade>? = null,
        public val container: Container
    ) : GW2v1ItemDetails() {

        /**
         * Additional information about a container.
         *
         * @param type the container type
         */
        @Serializable
        public data class Container(
            /** This field holds the container type. */
            val type: String
        )

    }

    @Suppress("ClassName")
    @Serializer(forClass = GatheringTool::class)
    private object __GatheringToolGeneratedSerializer : KSerializer<GatheringTool>

    @Suppress("ClassName")
    private object __GatheringToolSerializer0 : JsonTransformingSerializer<GatheringTool>(__GatheringToolGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * Additional information about a gathering tool.
     *
     * @param itemId the item's ID
     * @param name the item's name
     * @param type the item's type
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     * @param description the item's description
     * @param rarity the item's rarity
     * @param level the level required to use the item
     * @param vendorValue the value in coins when selling the item to a vendor
     * @param defaultSkin the ID of the item's default skin
     * @param flags flags applying to the item
     * @param gameTypes the game types in which the item is usable
     * @param restrictions restrictions applied to the item
     * @param upgradeRecipes lists what items this item can be upgraded from and into, and the method of upgrading
     */
    @Serializable(with = __GatheringToolSerializer0::class)
    public data class GatheringTool(
        @SerialName("item_id")
        override val itemId: GW2ItemId,
        override val name: String,
        override val type: String,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        override val description: String? = null,
        override val rarity: String,
        override val level: Int,
        @SerialName("vendor_value")
        override val vendorValue: Int,
        @SerialName("default_skin")
        override val defaultSkin: Int? = null,
        override val flags: List<String>,
        @SerialName("game_types")
        override val gameTypes: List<String>,
        override val restrictions: List<String>,
        @SerialName("upgrade_recipes")
        override val upgradeRecipes: List<Upgrade>? = null,
        public val gathering: GatheringTool
    ) : GW2v1ItemDetails() {

        /**
         * Additional information about a gathering tool.
         *
         * @param type the tool type
         */
        @Serializable
        public data class GatheringTool(
            /** This field holds the tool type. */
            val type: String
        )

    }

    @Suppress("ClassName")
    @Serializer(forClass = Gizmo::class)
    private object __GizmoGeneratedSerializer : KSerializer<Gizmo>

    @Suppress("ClassName")
    private object __GizmoSerializer0 : JsonTransformingSerializer<Gizmo>(__GizmoGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * Additional information about a gizmo.
     *
     * @param itemId the item's ID
     * @param name the item's name
     * @param type the item's type
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     * @param description the item's description
     * @param rarity the item's rarity
     * @param level the level required to use the item
     * @param vendorValue the value in coins when selling the item to a vendor
     * @param defaultSkin the ID of the item's default skin
     * @param flags flags applying to the item
     * @param gameTypes the game types in which the item is usable
     * @param restrictions restrictions applied to the item
     * @param upgradeRecipes lists what items this item can be upgraded from and into, and the method of upgrading
     */
    @Serializable(with = __GizmoSerializer0::class)
    public data class Gizmo(
        @SerialName("item_id")
        override val itemId: GW2ItemId,
        override val name: String,
        override val type: String,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        override val description: String? = null,
        override val rarity: String,
        override val level: Int,
        @SerialName("vendor_value")
        override val vendorValue: Int,
        @SerialName("default_skin")
        override val defaultSkin: Int? = null,
        override val flags: List<String>,
        @SerialName("game_types")
        override val gameTypes: List<String>,
        override val restrictions: List<String>,
        @SerialName("upgrade_recipes")
        override val upgradeRecipes: List<Upgrade>? = null,
        public val gizmo: Gizmo
    ) : GW2v1ItemDetails() {

        /**
         * Additional information about a gizmo.
         *
         * @param type the gizmo type
         * @param guildUpgradeId the guild upgrade ID for the item
         * @param vendorIds the vendor IDs
         */
        @Serializable
        public data class Gizmo(
            /** This field holds the gizmo type. */
            val type: String,
            /** This field holds the guild upgrade ID for the item. */
            @SerialName("guild_upgrade_id")
            val guildUpgradeId: GW2GuildUpgradeId? = null,
            /** This field holds the vendor IDs. */
            @SerialName("vendor_ids")
            val vendorIds: List<Int>? = null
        )

    }

    @Suppress("ClassName")
    @Serializer(forClass = MiniPet::class)
    private object __MiniPetGeneratedSerializer : KSerializer<MiniPet>

    @Suppress("ClassName")
    private object __MiniPetSerializer0 : JsonTransformingSerializer<MiniPet>(__MiniPetGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * Additional information about a mini unlock item.
     *
     * @param itemId the item's ID
     * @param name the item's name
     * @param type the item's type
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     * @param description the item's description
     * @param rarity the item's rarity
     * @param level the level required to use the item
     * @param vendorValue the value in coins when selling the item to a vendor
     * @param defaultSkin the ID of the item's default skin
     * @param flags flags applying to the item
     * @param gameTypes the game types in which the item is usable
     * @param restrictions restrictions applied to the item
     * @param upgradeRecipes lists what items this item can be upgraded from and into, and the method of upgrading
     */
    @Serializable(with = __MiniPetSerializer0::class)
    public data class MiniPet(
        @SerialName("item_id")
        override val itemId: GW2ItemId,
        override val name: String,
        override val type: String,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        override val description: String? = null,
        override val rarity: String,
        override val level: Int,
        @SerialName("vendor_value")
        override val vendorValue: Int,
        @SerialName("default_skin")
        override val defaultSkin: Int? = null,
        override val flags: List<String>,
        @SerialName("game_types")
        override val gameTypes: List<String>,
        override val restrictions: List<String>,
        @SerialName("upgrade_recipes")
        override val upgradeRecipes: List<Upgrade>? = null,
        public val mini_pet: MiniPet
    ) : GW2v1ItemDetails() {

        /**
         * Additional information about a mini unlock item.
         *
         * @param minipetId the miniature it unlocks
         */
        @Serializable
        public data class MiniPet(
            /** This field holds the miniature it unlocks. */
            @SerialName("minipet_id")
            val minipetId: GW2MiniId
        )

    }

    @Suppress("ClassName")
    @Serializer(forClass = Tool::class)
    private object __ToolGeneratedSerializer : KSerializer<Tool>

    @Suppress("ClassName")
    private object __ToolSerializer0 : JsonTransformingSerializer<Tool>(__ToolGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * Additional information about a tool.
     *
     * @param itemId the item's ID
     * @param name the item's name
     * @param type the item's type
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     * @param description the item's description
     * @param rarity the item's rarity
     * @param level the level required to use the item
     * @param vendorValue the value in coins when selling the item to a vendor
     * @param defaultSkin the ID of the item's default skin
     * @param flags flags applying to the item
     * @param gameTypes the game types in which the item is usable
     * @param restrictions restrictions applied to the item
     * @param upgradeRecipes lists what items this item can be upgraded from and into, and the method of upgrading
     */
    @Serializable(with = __ToolSerializer0::class)
    public data class Tool(
        @SerialName("item_id")
        override val itemId: GW2ItemId,
        override val name: String,
        override val type: String,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        override val description: String? = null,
        override val rarity: String,
        override val level: Int,
        @SerialName("vendor_value")
        override val vendorValue: Int,
        @SerialName("default_skin")
        override val defaultSkin: Int? = null,
        override val flags: List<String>,
        @SerialName("game_types")
        override val gameTypes: List<String>,
        override val restrictions: List<String>,
        @SerialName("upgrade_recipes")
        override val upgradeRecipes: List<Upgrade>? = null,
        public val tool: Tool
    ) : GW2v1ItemDetails() {

        /**
         * Additional information about a tool.
         *
         * @param type the tool type
         * @param charges the available charges
         */
        @Serializable
        public data class Tool(
            /** This field holds the tool type. */
            val type: String,
            /** This field holds the available charges. */
            val charges: Int
        )

    }

    @Suppress("ClassName")
    @Serializer(forClass = Trinket::class)
    private object __TrinketGeneratedSerializer : KSerializer<Trinket>

    @Suppress("ClassName")
    private object __TrinketSerializer0 : JsonTransformingSerializer<Trinket>(__TrinketGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * Additional information about a trinket.
     *
     * @param itemId the item's ID
     * @param name the item's name
     * @param type the item's type
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     * @param description the item's description
     * @param rarity the item's rarity
     * @param level the level required to use the item
     * @param vendorValue the value in coins when selling the item to a vendor
     * @param defaultSkin the ID of the item's default skin
     * @param flags flags applying to the item
     * @param gameTypes the game types in which the item is usable
     * @param restrictions restrictions applied to the item
     * @param upgradeRecipes lists what items this item can be upgraded from and into, and the method of upgrading
     */
    @Serializable(with = __TrinketSerializer0::class)
    public data class Trinket(
        @SerialName("item_id")
        override val itemId: GW2ItemId,
        override val name: String,
        override val type: String,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        override val description: String? = null,
        override val rarity: String,
        override val level: Int,
        @SerialName("vendor_value")
        override val vendorValue: Int,
        @SerialName("default_skin")
        override val defaultSkin: Int? = null,
        override val flags: List<String>,
        @SerialName("game_types")
        override val gameTypes: List<String>,
        override val restrictions: List<String>,
        @SerialName("upgrade_recipes")
        override val upgradeRecipes: List<Upgrade>? = null,
        public val trinket: Trinket
    ) : GW2v1ItemDetails() {

        /**
         * Additional information about a trinket.
         *
         * @param type the trinket type
         * @param infusionSlots infusion slots of the trinket
         * @param infixUpgrade infix upgrade object
         * @param suffixItemId the suffix item ID
         * @param secondarySuffixItemId the secondary suffix item ID
         * @param statChoices a list of selectable stat IDs which are visible in /v2/itemstats
         * @param attributeAdjustment The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats
         */
        @Serializable
        public data class Trinket(
            /** This field holds the trinket type. */
            val type: String,
            /** This field holds infusion slots of the trinket. */
            @SerialName("infusion_slots")
            val infusionSlots: List<InfusionSlot>,
            /** This field holds infix upgrade object. */
            @SerialName("infix_upgrade")
            val infixUpgrade: InfixUpgrade? = null,
            /** This field holds the suffix item ID. */
            @SerialName("suffix_item_id")
            @Serializable(with = LenientGW2ItemIdSerializer::class)
            val suffixItemId: GW2ItemId? = null,
            /** This field holds the secondary suffix item ID. */
            @SerialName("secondary_suffix_item_id")
            @Serializable(with = LenientGW2ItemIdSerializer::class)
            val secondarySuffixItemId: GW2ItemId? = null,
            /** This field holds a list of selectable stat IDs which are visible in /v2/itemstats. */
            @SerialName("stat_choices")
            val statChoices: List<GW2ItemStatId>? = null,
            /** This field holds The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats. */
            @SerialName("attribute_adjustment")
            val attributeAdjustment: Double? = null
        )

    }

    @Suppress("ClassName")
    @Serializer(forClass = UpgradeComponent::class)
    private object __UpgradeComponentGeneratedSerializer : KSerializer<UpgradeComponent>

    @Suppress("ClassName")
    private object __UpgradeComponentSerializer0 : JsonTransformingSerializer<UpgradeComponent>(__UpgradeComponentGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * Additional information about an upgrade component.
     *
     * @param itemId the item's ID
     * @param name the item's name
     * @param type the item's type
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     * @param description the item's description
     * @param rarity the item's rarity
     * @param level the level required to use the item
     * @param vendorValue the value in coins when selling the item to a vendor
     * @param defaultSkin the ID of the item's default skin
     * @param flags flags applying to the item
     * @param gameTypes the game types in which the item is usable
     * @param restrictions restrictions applied to the item
     * @param upgradeRecipes lists what items this item can be upgraded from and into, and the method of upgrading
     */
    @Serializable(with = __UpgradeComponentSerializer0::class)
    public data class UpgradeComponent(
        @SerialName("item_id")
        override val itemId: GW2ItemId,
        override val name: String,
        override val type: String,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        override val description: String? = null,
        override val rarity: String,
        override val level: Int,
        @SerialName("vendor_value")
        override val vendorValue: Int,
        @SerialName("default_skin")
        override val defaultSkin: Int? = null,
        override val flags: List<String>,
        @SerialName("game_types")
        override val gameTypes: List<String>,
        override val restrictions: List<String>,
        @SerialName("upgrade_recipes")
        override val upgradeRecipes: List<Upgrade>? = null,
        public val upgrade_component: UpgradeComponent
    ) : GW2v1ItemDetails() {

        /**
         * Additional information about an upgrade component.
         *
         * @param type the type of the upgrade component
         * @param flags the items that can be upgraded with the upgrade component
         * @param infusionUpgradeFlags applicable infusion slot for infusion upgrades
         * @param suffix the suffix appended to the item name when the component is applied
         * @param infixUpgrade infix upgrade object
         * @param bonuses the bonuses from runes
         * @param attributeAdjustment The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats
         */
        @Serializable
        public data class UpgradeComponent(
            /** This field holds the type of the upgrade component. */
            val type: String,
            /** This field holds the items that can be upgraded with the upgrade component. */
            val flags: List<String>,
            /** This field holds applicable infusion slot for infusion upgrades. */
            @SerialName("infusion_upgrade_flags")
            val infusionUpgradeFlags: List<String>,
            /** This field holds the suffix appended to the item name when the component is applied. */
            val suffix: String,
            /** This field holds infix upgrade object. */
            @SerialName("infix_upgrade")
            val infixUpgrade: InfixUpgrade? = null,
            /** This field holds the bonuses from runes. */
            val bonuses: List<String>? = null,
            /** This field holds The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats. */
            @SerialName("attribute_adjustment")
            val attributeAdjustment: Double? = null
        )

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
     * Additional information about a weapon.
     *
     * @param itemId the item's ID
     * @param name the item's name
     * @param type the item's type
     * @param iconFileId the icon's file ID to be used with the render service
     * @param iconFileSignature the icon's file signature to be used with the render service
     * @param description the item's description
     * @param rarity the item's rarity
     * @param level the level required to use the item
     * @param vendorValue the value in coins when selling the item to a vendor
     * @param defaultSkin the ID of the item's default skin
     * @param flags flags applying to the item
     * @param gameTypes the game types in which the item is usable
     * @param restrictions restrictions applied to the item
     * @param upgradeRecipes lists what items this item can be upgraded from and into, and the method of upgrading
     */
    @Serializable(with = __WeaponSerializer0::class)
    public data class Weapon(
        @SerialName("item_id")
        override val itemId: GW2ItemId,
        override val name: String,
        override val type: String,
        @SerialName("icon_file_id")
        override val iconFileId: String,
        @SerialName("icon_file_signature")
        override val iconFileSignature: String,
        override val description: String? = null,
        override val rarity: String,
        override val level: Int,
        @SerialName("vendor_value")
        override val vendorValue: Int,
        @SerialName("default_skin")
        override val defaultSkin: Int? = null,
        override val flags: List<String>,
        @SerialName("game_types")
        override val gameTypes: List<String>,
        override val restrictions: List<String>,
        @SerialName("upgrade_recipes")
        override val upgradeRecipes: List<Upgrade>? = null,
        public val weapon: Weapon
    ) : GW2v1ItemDetails() {

        /**
         * Additional information about a weapon.
         *
         * @param type the weapon type
         * @param minPower minimum weapon strength
         * @param maxPower maximum weapon strength
         * @param damageType the damage type
         * @param defense the defense value of the weapon
         * @param infusionSlots infusion slots of the weapon
         * @param infixUpgrade infix upgrade object
         * @param suffixItemId the suffix item ID
         * @param secondarySuffixItemId the secondary suffix item ID
         * @param statChoices a list of selectable stat IDs which are visible in /v2/itemstats
         * @param attributeAdjustment The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats
         */
        @Serializable
        public data class Weapon(
            /** This field holds the weapon type. */
            val type: String,
            /** This field holds minimum weapon strength. */
            @SerialName("min_power")
            val minPower: Int,
            /** This field holds maximum weapon strength. */
            @SerialName("max_power")
            val maxPower: Int,
            /** This field holds the damage type. */
            @SerialName("damage_type")
            val damageType: String,
            /** This field holds the defense value of the weapon. */
            val defense: Int,
            /** This field holds infusion slots of the weapon. */
            @SerialName("infusion_slots")
            val infusionSlots: List<InfusionSlot>,
            /** This field holds infix upgrade object. */
            @SerialName("infix_upgrade")
            val infixUpgrade: InfixUpgrade? = null,
            /** This field holds the suffix item ID. */
            @SerialName("suffix_item_id")
            @Serializable(with = LenientGW2ItemIdSerializer::class)
            val suffixItemId: GW2ItemId? = null,
            /** This field holds the secondary suffix item ID. */
            @SerialName("secondary_suffix_item_id")
            @Serializable(with = LenientGW2ItemIdSerializer::class)
            val secondarySuffixItemId: GW2ItemId? = null,
            /** This field holds a list of selectable stat IDs which are visible in /v2/itemstats. */
            @SerialName("stat_choices")
            val statChoices: List<GW2ItemStatId>? = null,
            /** This field holds The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats. */
            @SerialName("attribute_adjustment")
            val attributeAdjustment: Double? = null
        )

    }

}