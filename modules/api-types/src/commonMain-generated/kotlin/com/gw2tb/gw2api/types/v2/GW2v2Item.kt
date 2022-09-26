/*
 * Copyright (c) 2018-2022 Leon Linhart
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
@Serializer(forClass = GW2v2Item::class)
private object __GW2v2ItemGeneratedSerializer : KSerializer<GW2v2Item>

@Suppress("ClassName")
private object __GW2v2ItemSerializer : JsonTransformingSerializer<GW2v2Item>(__GW2v2ItemGeneratedSerializer) {
    override fun transformDeserialize(element: JsonElement): JsonElement =
        JsonObject(element.jsonObject.mapValues { (key, value) ->
            when (key) {
                "details" -> JsonObject(value.jsonObject + ("__virtualType" to JsonPrimitive(element.jsonObject["type"]!!.jsonPrimitive.content)))
                else -> value
            }
        })
}

/**
 * Information about an item.
 *
 * @param id the item's ID
 * @param name the item's name
 * @param type the item's type
 * @param chatLink the chat link
 * @param icon the URL for the item's icon
 * @param description the item's description
 * @param rarity the item's rarity
 * @param level the level required to use the item
 * @param vendorValue the value in coins when selling the item to a vendor
 * @param defaultSkin the ID of the item's default skin
 * @param flags flags applying to the item
 * @param gameTypes the game types in which the item is usable
 * @param restrictions restrictions applied to the item
 * @param upgradesInto lists what items this item can be upgraded into, and the method of upgrading
 * @param upgradesFrom lists what items this item can be upgraded from, and the method of upgrading
 * @param details additional information about the item
 */
@Serializable(with = __GW2v2ItemSerializer::class)
public data class GW2v2Item(
    /** This field holds the item's ID. */
    val id: Int,
    /** This field holds the item's name. */
    val name: String,
    /** This field holds the item's type. */
    val type: String,
    /** This field holds the chat link. */
    @SerialName("chat_link")
    val chatLink: String,
    /** This field holds the URL for the item's icon. */
    val icon: String? = null,
    /** This field holds the item's description. */
    val description: String? = null,
    /** This field holds the item's rarity. */
    val rarity: String,
    /** This field holds the level required to use the item. */
    val level: Int,
    /** This field holds the value in coins when selling the item to a vendor. */
    @SerialName("vendor_value")
    val vendorValue: Int,
    /** This field holds the ID of the item's default skin. */
    @SerialName("default_skin")
    val defaultSkin: Int? = null,
    /** This field holds flags applying to the item. */
    val flags: List<String>,
    /** This field holds the game types in which the item is usable. */
    @SerialName("game_types")
    val gameTypes: List<String>,
    /** This field holds restrictions applied to the item. */
    val restrictions: List<String>,
    /** This field holds lists what items this item can be upgraded into, and the method of upgrading. */
    @SerialName("upgrades_into")
    val upgradesInto: List<Upgrade>? = null,
    /** This field holds lists what items this item can be upgraded from, and the method of upgrading. */
    @SerialName("upgrades_from")
    val upgradesFrom: List<Precursor>? = null,
    /** This field holds additional information about the item. */
    val details: Details? = null
) {

    /**
     * Information about an item's upgrade.
     *
     * @param upgrade describes the method of upgrading
     * @param itemID the ID that results from performing the upgrade
     */
    @Serializable
    public data class Upgrade(
        /** This field holds describes the method of upgrading. */
        val upgrade: String,
        /** This field holds the ID that results from performing the upgrade. */
        @SerialName("item_id")
        val itemID: Int
    )

    /**
     * Information about an item's precursor.
     *
     * @param upgrade describes the method of upgrading
     * @param itemID the ID of the item that is upgraded into the item
     */
    @Serializable
    public data class Precursor(
        /** This field holds describes the method of upgrading. */
        val upgrade: String,
        /** This field holds the ID of the item that is upgraded into the item. */
        @SerialName("item_id")
        val itemID: Int
    )

    @Suppress("ClassName")
    private object __JsonParametricSerializer_Details : JsonContentPolymorphicSerializer<Details>(Details::class) {
        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out Details> {
            return when (val type = element.jsonObject["__virtualType"]?.jsonPrimitive?.content) {
                "Armor" -> Details.Armor.serializer()
                "Back" -> Details.Back.serializer()
                "Bag" -> Details.Bag.serializer()
                "Consumable" -> Details.Consumable.serializer()
                "Container" -> Details.Container.serializer()
                "Gathering" -> Details.GatheringTool.serializer()
                "Gizmo" -> Details.Gizmo.serializer()
                "MiniPet" -> Details.MiniPet.serializer()
                "Tool" -> Details.Tool.serializer()
                "Trinket" -> Details.Trinket.serializer()
                "UpgradeComponent" -> Details.UpgradeComponent.serializer()
                "Weapon" -> Details.Weapon.serializer()
                null -> throw SerializationException("Disambiguator property not found")
                else -> throw SerializationException("Invalid disambiguator value for Details: $type")
            }
        }
    }

    /** Additional information about an item. */
    @Serializable(with = __JsonParametricSerializer_Details::class)
    public sealed class Details {

        /**
         * Information about an items infusion slot.
         *
         * @param flags infusion slot type of infusion upgrades
         * @param itemID the infusion upgrade in the armor piece
         */
        @Serializable
        public data class InfusionSlot(
            /** This field holds infusion slot type of infusion upgrades. */
            val flags: List<String>,
            /** This field holds the infusion upgrade in the armor piece. */
            @SerialName("item_id")
            val itemID: Int? = null
        )

        /**
         * Information about an item's infix upgrade.
         *
         * @param id the itemstat ID
         * @param attributes the list of attribute bonuses granted by this item
         * @param buff object containing an additional effect
         */
        @Serializable
        public data class InfixUpgrade(
            /** This field holds the itemstat ID. */
            val id: Int,
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
             * @param skillID the skill ID of the effect
             * @param description the effect's description
             */
            @Serializable
            public data class Buff(
                /** This field holds the skill ID of the effect. */
                @SerialName("skill_id")
                val skillID: Int,
                /** This field holds the effect's description. */
                val description: String? = null
            )

        }

        @Suppress("ClassName")
        @Serializer(forClass = Armor::class)
        private object __ArmorGeneratedSerializer : KSerializer<Armor>

        @Suppress("ClassName")
        private object __ArmorSerializer : JsonTransformingSerializer<Armor>(__ArmorGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about an armor item.
         *
         * @param type the armor slot type
         * @param weightClass the weight class
         * @param defense the defense value of the armor piece
         * @param infusionSlots infusion slots of the armor piece
         * @param infixUpgrade infix upgrade object
         * @param suffixItemID the suffix item ID
         * @param secondarySuffixItemID the secondary suffix item ID
         * @param statChoices a list of selectable stat IDs which are visible in /v2/itemstats
         * @param attributeAdjustment The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats
         */
        @Serializable(with = __ArmorSerializer::class)
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
            val suffixItemID: Int? = null,
            /** This field holds the secondary suffix item ID. */
            @SerialName("secondary_suffix_item_id")
            val secondarySuffixItemID: Int? = null,
            /** This field holds a list of selectable stat IDs which are visible in /v2/itemstats. */
            @SerialName("stat_choices")
            val statChoices: List<Int>? = null,
            /** This field holds The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats. */
            @SerialName("attribute_adjustment")
            val attributeAdjustment: Double? = null
        ) : Details()

        @Suppress("ClassName")
        @Serializer(forClass = Back::class)
        private object __BackGeneratedSerializer : KSerializer<Back>

        @Suppress("ClassName")
        private object __BackSerializer : JsonTransformingSerializer<Back>(__BackGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a backpiece.
         *
         * @param infusionSlots infusion slots of the back item
         * @param infixUpgrade infix upgrade object
         * @param suffixItemID the suffix item ID
         * @param secondarySuffixItemID the secondary suffix item ID
         * @param statChoices a list of selectable stat IDs which are visible in /v2/itemstats
         * @param attributeAdjustment The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats
         */
        @Serializable(with = __BackSerializer::class)
        public data class Back(
            /** This field holds infusion slots of the back item. */
            @SerialName("infusion_slots")
            val infusionSlots: List<InfusionSlot>,
            /** This field holds infix upgrade object. */
            @SerialName("infix_upgrade")
            val infixUpgrade: InfixUpgrade? = null,
            /** This field holds the suffix item ID. */
            @SerialName("suffix_item_id")
            val suffixItemID: Int? = null,
            /** This field holds the secondary suffix item ID. */
            @SerialName("secondary_suffix_item_id")
            val secondarySuffixItemID: Int? = null,
            /** This field holds a list of selectable stat IDs which are visible in /v2/itemstats. */
            @SerialName("stat_choices")
            val statChoices: List<Int>? = null,
            /** This field holds The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats. */
            @SerialName("attribute_adjustment")
            val attributeAdjustment: Double? = null
        ) : Details()

        @Suppress("ClassName")
        @Serializer(forClass = Bag::class)
        private object __BagGeneratedSerializer : KSerializer<Bag>

        @Suppress("ClassName")
        private object __BagSerializer : JsonTransformingSerializer<Bag>(__BagGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a bag.
         *
         * @param size the number of bag slots
         * @param noSellOrSort whether the bag is invisible
         */
        @Serializable(with = __BagSerializer::class)
        public data class Bag(
            /** This field holds the number of bag slots. */
            val size: Int,
            /** This field holds whether the bag is invisible. */
            @SerialName("no_sell_or_sort")
            val noSellOrSort: Boolean
        ) : Details()

        @Suppress("ClassName")
        @Serializer(forClass = Consumable::class)
        private object __ConsumableGeneratedSerializer : KSerializer<Consumable>

        @Suppress("ClassName")
        private object __ConsumableSerializer : JsonTransformingSerializer<Consumable>(__ConsumableGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a consumable item.
         *
         * @param type the consumable type
         * @param description effect description for consumables applying an effect
         * @param durationMs effect duration in milliseconds
         * @param unlockType unlock type for unlock consumables
         * @param colorID the dye ID for dye unlocks
         * @param recipeID the recipe ID for recipe unlocks
         * @param extraRecipeIDs additional recipe IDs for recipe unlocks
         * @param guildUpgradeID the guild upgrade ID for the item
         * @param applyCount the number of stacks of the effect applied by this item
         * @param name the effect type name of the consumable
         * @param icon the icon of the effect
         * @param skins a list of skin ids which this item unlocks
         */
        @Serializable(with = __ConsumableSerializer::class)
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
            val colorID: Int? = null,
            /** This field holds the recipe ID for recipe unlocks. */
            @SerialName("recipe_id")
            val recipeID: Int? = null,
            /** This field holds additional recipe IDs for recipe unlocks. */
            @SerialName("extra_recipe_ids")
            val extraRecipeIDs: List<Int>? = null,
            /** This field holds the guild upgrade ID for the item. */
            @SerialName("guild_upgrade_id")
            val guildUpgradeID: Int? = null,
            /** This field holds the number of stacks of the effect applied by this item. */
            @SerialName("apply_count")
            val applyCount: Int? = null,
            /** This field holds the effect type name of the consumable. */
            val name: String? = null,
            /** This field holds the icon of the effect. */
            val icon: String? = null,
            /** This field holds a list of skin ids which this item unlocks. */
            val skins: List<Int>? = null
        ) : Details()

        @Suppress("ClassName")
        @Serializer(forClass = Container::class)
        private object __ContainerGeneratedSerializer : KSerializer<Container>

        @Suppress("ClassName")
        private object __ContainerSerializer : JsonTransformingSerializer<Container>(__ContainerGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a container.
         *
         * @param type the container type
         */
        @Serializable(with = __ContainerSerializer::class)
        public data class Container(
            /** This field holds the container type. */
            val type: String
        ) : Details()

        @Suppress("ClassName")
        @Serializer(forClass = GatheringTool::class)
        private object __GatheringToolGeneratedSerializer : KSerializer<GatheringTool>

        @Suppress("ClassName")
        private object __GatheringToolSerializer : JsonTransformingSerializer<GatheringTool>(__GatheringToolGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a gathering tool.
         *
         * @param type the tool type
         */
        @Serializable(with = __GatheringToolSerializer::class)
        public data class GatheringTool(
            /** This field holds the tool type. */
            val type: String
        ) : Details()

        @Suppress("ClassName")
        @Serializer(forClass = Gizmo::class)
        private object __GizmoGeneratedSerializer : KSerializer<Gizmo>

        @Suppress("ClassName")
        private object __GizmoSerializer : JsonTransformingSerializer<Gizmo>(__GizmoGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a gizmo.
         *
         * @param type the gizmo type
         * @param guildUpgradeID the guild upgrade ID for the item
         * @param vendorIDs the vendor IDs
         */
        @Serializable(with = __GizmoSerializer::class)
        public data class Gizmo(
            /** This field holds the gizmo type. */
            val type: String,
            /** This field holds the guild upgrade ID for the item. */
            @SerialName("guild_upgrade_id")
            val guildUpgradeID: Int? = null,
            /** This field holds the vendor IDs. */
            @SerialName("vendor_ids")
            val vendorIDs: List<Int>? = null
        ) : Details()

        @Suppress("ClassName")
        @Serializer(forClass = MiniPet::class)
        private object __MiniPetGeneratedSerializer : KSerializer<MiniPet>

        @Suppress("ClassName")
        private object __MiniPetSerializer : JsonTransformingSerializer<MiniPet>(__MiniPetGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a mini unlock item.
         *
         * @param minipetID the miniature it unlocks
         */
        @Serializable(with = __MiniPetSerializer::class)
        public data class MiniPet(
            /** This field holds the miniature it unlocks. */
            @SerialName("minipet_id")
            val minipetID: Int
        ) : Details()

        @Suppress("ClassName")
        @Serializer(forClass = Tool::class)
        private object __ToolGeneratedSerializer : KSerializer<Tool>

        @Suppress("ClassName")
        private object __ToolSerializer : JsonTransformingSerializer<Tool>(__ToolGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a tool.
         *
         * @param type the tool type
         * @param charges the available charges
         */
        @Serializable(with = __ToolSerializer::class)
        public data class Tool(
            /** This field holds the tool type. */
            val type: String,
            /** This field holds the available charges. */
            val charges: Int
        ) : Details()

        @Suppress("ClassName")
        @Serializer(forClass = Trinket::class)
        private object __TrinketGeneratedSerializer : KSerializer<Trinket>

        @Suppress("ClassName")
        private object __TrinketSerializer : JsonTransformingSerializer<Trinket>(__TrinketGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a trinket.
         *
         * @param type the trinket type
         * @param infusionSlots infusion slots of the trinket
         * @param infixUpgrade infix upgrade object
         * @param suffixItemID the suffix item ID
         * @param secondarySuffixItemID the secondary suffix item ID
         * @param statChoices a list of selectable stat IDs which are visible in /v2/itemstats
         * @param attributeAdjustment The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats
         */
        @Serializable(with = __TrinketSerializer::class)
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
            val suffixItemID: Int? = null,
            /** This field holds the secondary suffix item ID. */
            @SerialName("secondary_suffix_item_id")
            val secondarySuffixItemID: Int? = null,
            /** This field holds a list of selectable stat IDs which are visible in /v2/itemstats. */
            @SerialName("stat_choices")
            val statChoices: List<Int>? = null,
            /** This field holds The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats. */
            @SerialName("attribute_adjustment")
            val attributeAdjustment: Double? = null
        ) : Details()

        @Suppress("ClassName")
        @Serializer(forClass = UpgradeComponent::class)
        private object __UpgradeComponentGeneratedSerializer : KSerializer<UpgradeComponent>

        @Suppress("ClassName")
        private object __UpgradeComponentSerializer : JsonTransformingSerializer<UpgradeComponent>(__UpgradeComponentGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

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
        @Serializable(with = __UpgradeComponentSerializer::class)
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
         * Additional information about a weapon.
         *
         * @param type the weapon type
         * @param minPower minimum weapon strength
         * @param maxPower maximum weapon strength
         * @param damageType the damage type
         * @param defense the defense value of the weapon
         * @param infusionSlots infusion slots of the weapon
         * @param infixUpgrade infix upgrade object
         * @param suffixItemID the suffix item ID
         * @param secondarySuffixItemID the secondary suffix item ID
         * @param statChoices a list of selectable stat IDs which are visible in /v2/itemstats
         * @param attributeAdjustment The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats
         */
        @Serializable(with = __WeaponSerializer::class)
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
            val suffixItemID: Int? = null,
            /** This field holds the secondary suffix item ID. */
            @SerialName("secondary_suffix_item_id")
            val secondarySuffixItemID: Int? = null,
            /** This field holds a list of selectable stat IDs which are visible in /v2/itemstats. */
            @SerialName("stat_choices")
            val statChoices: List<Int>? = null,
            /** This field holds The value to be combined with the gradient multiplier and offset value to calculate the value of an attribute using the itemstats. */
            @SerialName("attribute_adjustment")
            val attributeAdjustment: Double? = null
        ) : Details()

    }

}