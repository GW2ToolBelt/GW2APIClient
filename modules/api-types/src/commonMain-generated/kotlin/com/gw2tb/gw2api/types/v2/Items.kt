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
    val id: Int,
    val name: String,
    val type: String,
    @SerialName("chat_link")
    val chatLink: String,
    val icon: String? = null,
    val description: String? = null,
    val rarity: String,
    val level: Int,
    @SerialName("vendor_value")
    val vendorValue: Int,
    @SerialName("default_skin")
    val defaultSkin: Int? = null,
    val flags: List<String>,
    @SerialName("game_types")
    val gameTypes: List<String>,
    val restrictions: List<String>,
    @SerialName("upgrades_into")
    val upgradesInto: List<Upgrade>? = null,
    @SerialName("upgrades_from")
    val upgradesFrom: List<Precursor>? = null,
    val details: Details? = null
) {

    /**
     * Information about an item's upgrade.
     *
     * @param upgrade describes the method of upgrading
     * @param itemId the item ID that results from performing the upgrade
     */
    @Serializable
    public data class Upgrade(
        val upgrade: String,
        @SerialName("item_id")
        val itemId: Int
    )

    /**
     * Information about an item's precursor.
     *
     * @param upgrade describes the method of upgrading
     * @param itemId the item ID that results from performing the upgrade
     */
    @Serializable
    public data class Precursor(
        val upgrade: String,
        @SerialName("item_id")
        val itemId: Int
    )

    @Suppress("ClassName")
    private object __JsonParametricSerializer_Details : JsonContentPolymorphicSerializer<Details>(Details::class) {
        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out Details> {
            return when (element.jsonObject["__virtualType"]!!.jsonPrimitive.content) {
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
                else -> TODO()
            }
        }
    }

    /** Additional information about an item. */
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
         * @param attributeAdjustment 
         */
        @Serializable(with = __ArmorSerializer::class)
        public data class Armor(
            val type: String,
            @SerialName("weight_class")
            val weightClass: String,
            val defense: Int,
            @SerialName("infusion_slots")
            val infusionSlots: List<InfusionSlot>,
            @SerialName("infix_upgrade")
            val infixUpgrade: InfixUpgrade? = null,
            @SerialName("suffix_item_id")
            val suffixItemId: Int? = null,
            @SerialName("secondary_suffix_item_id")
            val secondarySuffixItemId: Int? = null,
            @SerialName("stat_choices")
            val statChoices: List<Int>? = null,
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
         * @param suffixItemId the suffix item ID
         * @param secondarySuffixItemId the secondary suffix item ID
         * @param statChoices a list of selectable stat IDs which are visible in /v2/itemstats
         * @param attributeAdjustment 
         */
        @Serializable(with = __BackSerializer::class)
        public data class Back(
            @SerialName("infusion_slots")
            val infusionSlots: List<InfusionSlot>,
            @SerialName("infix_upgrade")
            val infixUpgrade: InfixUpgrade? = null,
            @SerialName("suffix_item_id")
            val suffixItemId: Int? = null,
            @SerialName("secondary_suffix_item_id")
            val secondarySuffixItemId: Int? = null,
            @SerialName("stat_choices")
            val statChoices: List<Int>? = null,
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
            val size: Int,
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
         * @param colorId the dye ID for dye unlocks
         * @param recipeId the recipe ID for recipe unlocks
         * @param extraRecipeIds additional recipe IDs for recipe unlocks
         * @param guildUpgradeId the guild upgrade ID for the item
         * @param applyCount the number of stacks of the effect applied by this item
         * @param name the effect type name of the consumable
         * @param icon the icon of the effect
         * @param skins a list of skin ids which this item unlocks
         */
        @Serializable(with = __ConsumableSerializer::class)
        public data class Consumable(
            val type: String,
            val description: String? = null,
            @SerialName("duration_ms")
            val durationMs: Int? = null,
            @SerialName("unlock_type")
            val unlockType: String? = null,
            @SerialName("color_id")
            val colorId: Int? = null,
            @SerialName("recipe_id")
            val recipeId: Int? = null,
            @SerialName("extra_recipe_ids")
            val extraRecipeIds: List<Int>? = null,
            @SerialName("guild_upgrade_id")
            val guildUpgradeId: Int? = null,
            @SerialName("apply_count")
            val applyCount: Int? = null,
            val name: String? = null,
            val icon: String? = null,
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
         * @param guildUpgradeId the guild upgrade ID for the item
         * @param vendorIds the vendor IDs
         */
        @Serializable(with = __GizmoSerializer::class)
        public data class Gizmo(
            val type: String,
            @SerialName("guild_upgrade_id")
            val guildUpgradeId: Int? = null,
            @SerialName("vendor_ids")
            val vendorIds: List<Int>? = null
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
         * @param minipetId the miniature it unlocks
         */
        @Serializable(with = __MiniPetSerializer::class)
        public data class MiniPet(
            @SerialName("minipet_id")
            val minipetId: Int
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
            val type: String,
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
         * @param suffixItemId the suffix item ID
         * @param secondarySuffixItemId the secondary suffix item ID
         * @param statChoices a list of selectable stat IDs which are visible in /v2/itemstats
         * @param attributeAdjustment 
         */
        @Serializable(with = __TrinketSerializer::class)
        public data class Trinket(
            val type: String,
            @SerialName("infusion_slots")
            val infusionSlots: List<InfusionSlot>,
            @SerialName("infix_upgrade")
            val infixUpgrade: InfixUpgrade? = null,
            @SerialName("suffix_item_id")
            val suffixItemId: Int? = null,
            @SerialName("secondary_suffix_item_id")
            val secondarySuffixItemId: Int? = null,
            @SerialName("stat_choices")
            val statChoices: List<Int>? = null,
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
         * @param attributeAdjustment 
         */
        @Serializable(with = __UpgradeComponentSerializer::class)
        public data class UpgradeComponent(
            val type: String,
            val flags: List<String>,
            @SerialName("infusion_upgrade_flags")
            val infusionUpgradeFlags: List<String>,
            val suffix: String,
            @SerialName("infix_upgrade")
            val infixUpgrade: InfixUpgrade? = null,
            val bonuses: List<String>? = null,
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
         * @param suffixItemId the suffix item ID
         * @param secondarySuffixItemId the secondary suffix item ID
         * @param statChoices a list of selectable stat IDs which are visible in /v2/itemstats
         * @param attributeAdjustment 
         */
        @Serializable(with = __WeaponSerializer::class)
        public data class Weapon(
            val type: String,
            @SerialName("min_power")
            val minPower: Int,
            @SerialName("max_power")
            val maxPower: Int,
            @SerialName("damage_type")
            val damageType: String,
            val defense: Int,
            @SerialName("infusion_slots")
            val infusionSlots: List<InfusionSlot>,
            @SerialName("infix_upgrade")
            val infixUpgrade: InfixUpgrade? = null,
            @SerialName("suffix_item_id")
            val suffixItemId: Int? = null,
            @SerialName("secondary_suffix_item_id")
            val secondarySuffixItemId: Int? = null,
            @SerialName("stat_choices")
            val statChoices: List<Int>? = null,
            @SerialName("attribute_adjustment")
            val attributeAdjustment: Double? = null
        ) : Details()

        /**
         * Information about an item's infix upgrade.
         *
         * @param id the itemstat ID
         * @param attributes the list of attribute bonuses granted by this item
         * @param buff object containing an additional effect
         */
        @Serializable
        public data class InfixUpgrade(
            val id: Int,
            val attributes: List<Attribute>,
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
                val attribute: String,
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
                @SerialName("skill_id")
                val skillId: Int,
                val description: String? = null
            )

        }

        /**
         * Information about an items infusion slot.
         *
         * @param flags infusion slot type of infusion upgrades
         * @param itemId the infusion upgrade in the armor piece
         */
        @Serializable
        public data class InfusionSlot(
            val flags: List<String>,
            @SerialName("item_id")
            val itemId: Int? = null
        )

    }

}