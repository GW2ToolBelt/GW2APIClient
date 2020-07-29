/*
 * Copyright (c) 2018-2020 Leon Linhart
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
@file:JvmName("GW2v2")
@file:JvmMultifileClass
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package gw2api.v2

import gw2api.*
import gw2api.extra.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*
import kotlin.jvm.*

fun GW2APIClient.gw2v2ItemsIds(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/v2/items",
    parameters = mapOf("v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = Int.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2ItemsById(id: Int, configure: (RequestBuilder<GW2v2Items>.() -> Unit)? = null): RequestBuilder<GW2v2Items> = request(
    path = "/v2/items",
    parameters = mapOf("id" to id.toString(), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Items.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2ItemsByIds(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2Items>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Items>> = request(
    path = "/v2/items",
    parameters = mapOf("ids" to ids.joinToString(","), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Items.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2ItemsByPage(page: Int, pageSize: Int = 200, configure: (RequestBuilder<List<GW2v2Items>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Items>> = request(
    path = "/v2/items",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString(), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Items.serializer().list,
    configure = configure
)

@Suppress("ClassName")
@Serializer(forClass = GW2v2Items::class)
private object __GW2v2ItemsGeneratedSerializer : KSerializer<GW2v2Items>

@Suppress("ClassName")
private object __GW2v2ItemsSerializer : JsonTransformingSerializer<GW2v2Items>(__GW2v2ItemsGeneratedSerializer, "__GW2v2ItemsSerializer") {
    override fun readTransform(element: JsonElement): JsonElement =
        JsonObject(element.jsonObject.mapValues { (key, value) ->
            when (key) {
                "details" -> JsonObject(value.jsonObject + ("__virtualType" to JsonPrimitive(element.jsonObject["type"]!!.primitive.content)))
                else -> value
            }
        })
}

@Serializable(with = __GW2v2ItemsSerializer::class)
data class GW2v2Items(
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
    val upgradesInto: List<UpgradesInto>? = null,
    @SerialName("upgrades_from")
    val upgradesFrom: List<UpgradesFrom>? = null,
    val details: Details? = null
) {

    @Serializable
    data class UpgradesInto(
        val upgrade: String,
        @SerialName("item_id")
        val itemId: Int
    )

    @Serializable
    data class UpgradesFrom(
        val upgrade: String,
        @SerialName("item_id")
        val itemId: Int
    )

    @Suppress("ClassName")
    private object __JsonParametricSerializer_Details : JsonParametricSerializer<Details>(Details::class) {
        override fun selectSerializer(element: JsonElement): KSerializer<out Details> {
            return when (element.jsonObject["__virtualType"]!!.content) {
                "Armor" -> Details.Armor.serializer()
                "Back" -> Details.Back.serializer()
                "Bag" -> Details.Bag.serializer()
                "Consumable" -> Details.Consumable.serializer()
                "Container" -> Details.Container.serializer()
                "Gathering" -> Details.Gathering.serializer()
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
    
    @Serializable(with = __JsonParametricSerializer_Details::class)
    sealed class Details {
    
        @Suppress("ClassName")
        @Serializer(forClass = Armor::class)
        private object __ArmorGeneratedSerializer : KSerializer<Armor>
    
        @Suppress("ClassName")
        private object __ArmorSerializer : JsonTransformingSerializer<Armor>(__ArmorGeneratedSerializer, "__ArmorSerializer") {
            override fun readTransform(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }
    
        @Serializable(with = __ArmorSerializer::class)
        data class Armor(
            val type: String,
            @SerialName("weight_class")
            val weightClass: String,
            val defense: Int,
            @SerialName("infusion_slots")
            val infusionSlots: List<InfusionSlots>,
            @SerialName("infix_upgrade")
            val infixUpgrade: InfixUpgrade? = null,
            @SerialName("suffix_item_id")
            val suffixItemId: Int? = null,
            @SerialName("secondary_suffix_item_id")
            val secondarySuffixItemId: String? = null,
            @SerialName("stat_choices")
            val statChoices: List<Int>? = null,
            @SerialName("attribute_adjustment")
            val attributeAdjustment: Double? = null
        ) : Details() {
    
            @Serializable
            data class InfusionSlots(
                val flags: List<String>,
                @SerialName("item_id")
                val itemId: Int? = null
            )
    
            @Serializable
            data class InfixUpgrade(
                val id: Int,
                val attributes: List<Attributes>,
                val buff: Buff? = null
            ) {
    
                @Serializable
                data class Attributes(
                    val attribute: String,
                    val modifier: Int
                )
    
                @Serializable
                data class Buff(
                    @SerialName("skill_id")
                    val skillId: Int,
                    val description: String? = null
                )
    
            }
    
        }
    
        @Suppress("ClassName")
        @Serializer(forClass = Back::class)
        private object __BackGeneratedSerializer : KSerializer<Back>
    
        @Suppress("ClassName")
        private object __BackSerializer : JsonTransformingSerializer<Back>(__BackGeneratedSerializer, "__BackSerializer") {
            override fun readTransform(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }
    
        @Serializable(with = __BackSerializer::class)
        data class Back(
            @SerialName("infusion_slots")
            val infusionSlots: List<InfusionSlots>,
            @SerialName("infix_upgrade")
            val infixUpgrade: InfixUpgrade? = null,
            @SerialName("suffix_item_id")
            val suffixItemId: Int? = null,
            @SerialName("secondary_suffix_item_id")
            val secondarySuffixItemId: String? = null,
            @SerialName("stat_choices")
            val statChoices: List<Int>? = null,
            @SerialName("attribute_adjustment")
            val attributeAdjustment: Double? = null
        ) : Details() {
    
            @Serializable
            data class InfusionSlots(
                val flags: List<String>,
                @SerialName("item_id")
                val itemId: Int? = null
            )
    
            @Serializable
            data class InfixUpgrade(
                val id: Int,
                val attributes: List<Attributes>,
                val buff: Buff? = null
            ) {
    
                @Serializable
                data class Attributes(
                    val attribute: String,
                    val modifier: Int
                )
    
                @Serializable
                data class Buff(
                    @SerialName("skill_id")
                    val skillId: Int,
                    val description: String? = null
                )
    
            }
    
        }
    
        @Suppress("ClassName")
        @Serializer(forClass = Bag::class)
        private object __BagGeneratedSerializer : KSerializer<Bag>
    
        @Suppress("ClassName")
        private object __BagSerializer : JsonTransformingSerializer<Bag>(__BagGeneratedSerializer, "__BagSerializer") {
            override fun readTransform(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }
    
        @Serializable(with = __BagSerializer::class)
        data class Bag(
            val size: Int,
            @SerialName("no_sell_or_sort")
            val noSellOrSort: Boolean
        ) : Details()
    
        @Suppress("ClassName")
        @Serializer(forClass = Consumable::class)
        private object __ConsumableGeneratedSerializer : KSerializer<Consumable>
    
        @Suppress("ClassName")
        private object __ConsumableSerializer : JsonTransformingSerializer<Consumable>(__ConsumableGeneratedSerializer, "__ConsumableSerializer") {
            override fun readTransform(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }
    
        @Serializable(with = __ConsumableSerializer::class)
        data class Consumable(
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
            val guildUpgradeId: List<Int>? = null,
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
        private object __ContainerSerializer : JsonTransformingSerializer<Container>(__ContainerGeneratedSerializer, "__ContainerSerializer") {
            override fun readTransform(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }
    
        @Serializable(with = __ContainerSerializer::class)
        data class Container(
            val type: String
        ) : Details()
    
        @Suppress("ClassName")
        @Serializer(forClass = Gathering::class)
        private object __GatheringGeneratedSerializer : KSerializer<Gathering>
    
        @Suppress("ClassName")
        private object __GatheringSerializer : JsonTransformingSerializer<Gathering>(__GatheringGeneratedSerializer, "__GatheringSerializer") {
            override fun readTransform(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }
    
        @Serializable(with = __GatheringSerializer::class)
        data class Gathering(
            val type: String
        ) : Details()
    
        @Suppress("ClassName")
        @Serializer(forClass = Gizmo::class)
        private object __GizmoGeneratedSerializer : KSerializer<Gizmo>
    
        @Suppress("ClassName")
        private object __GizmoSerializer : JsonTransformingSerializer<Gizmo>(__GizmoGeneratedSerializer, "__GizmoSerializer") {
            override fun readTransform(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }
    
        @Serializable(with = __GizmoSerializer::class)
        data class Gizmo(
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
        private object __MiniPetSerializer : JsonTransformingSerializer<MiniPet>(__MiniPetGeneratedSerializer, "__MiniPetSerializer") {
            override fun readTransform(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }
    
        @Serializable(with = __MiniPetSerializer::class)
        data class MiniPet(
            @SerialName("minipet_id")
            val minipetId: Int
        ) : Details()
    
        @Suppress("ClassName")
        @Serializer(forClass = Tool::class)
        private object __ToolGeneratedSerializer : KSerializer<Tool>
    
        @Suppress("ClassName")
        private object __ToolSerializer : JsonTransformingSerializer<Tool>(__ToolGeneratedSerializer, "__ToolSerializer") {
            override fun readTransform(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }
    
        @Serializable(with = __ToolSerializer::class)
        data class Tool(
            val type: String,
            val charges: Int
        ) : Details()
    
        @Suppress("ClassName")
        @Serializer(forClass = Trinket::class)
        private object __TrinketGeneratedSerializer : KSerializer<Trinket>
    
        @Suppress("ClassName")
        private object __TrinketSerializer : JsonTransformingSerializer<Trinket>(__TrinketGeneratedSerializer, "__TrinketSerializer") {
            override fun readTransform(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }
    
        @Serializable(with = __TrinketSerializer::class)
        data class Trinket(
            val type: String,
            @SerialName("infusion_slots")
            val infusionSlots: List<InfusionSlots>,
            @SerialName("infix_upgrade")
            val infixUpgrade: InfixUpgrade? = null,
            @SerialName("suffix_item_id")
            val suffixItemId: Int? = null,
            @SerialName("secondary_suffix_item_id")
            val secondarySuffixItemId: String? = null,
            @SerialName("stat_choices")
            val statChoices: List<Int>? = null,
            @SerialName("attribute_adjustment")
            val attributeAdjustment: Double? = null
        ) : Details() {
    
            @Serializable
            data class InfusionSlots(
                val flags: List<String>,
                @SerialName("item_id")
                val itemId: Int? = null
            )
    
            @Serializable
            data class InfixUpgrade(
                val id: Int,
                val attributes: List<Attributes>,
                val buff: Buff? = null
            ) {
    
                @Serializable
                data class Attributes(
                    val attribute: String,
                    val modifier: Int
                )
    
                @Serializable
                data class Buff(
                    @SerialName("skill_id")
                    val skillId: Int,
                    val description: String? = null
                )
    
            }
    
        }
    
        @Suppress("ClassName")
        @Serializer(forClass = UpgradeComponent::class)
        private object __UpgradeComponentGeneratedSerializer : KSerializer<UpgradeComponent>
    
        @Suppress("ClassName")
        private object __UpgradeComponentSerializer : JsonTransformingSerializer<UpgradeComponent>(__UpgradeComponentGeneratedSerializer, "__UpgradeComponentSerializer") {
            override fun readTransform(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }
    
        @Serializable(with = __UpgradeComponentSerializer::class)
        data class UpgradeComponent(
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
        ) : Details() {
    
            @Serializable
            data class InfixUpgrade(
                val id: Int,
                val attributes: List<Attributes>,
                val buff: Buff? = null
            ) {
    
                @Serializable
                data class Attributes(
                    val attribute: String,
                    val modifier: Int
                )
    
                @Serializable
                data class Buff(
                    @SerialName("skill_id")
                    val skillId: Int,
                    val description: String? = null
                )
    
            }
    
        }
    
        @Suppress("ClassName")
        @Serializer(forClass = Weapon::class)
        private object __WeaponGeneratedSerializer : KSerializer<Weapon>
    
        @Suppress("ClassName")
        private object __WeaponSerializer : JsonTransformingSerializer<Weapon>(__WeaponGeneratedSerializer, "__WeaponSerializer") {
            override fun readTransform(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }
    
        @Serializable(with = __WeaponSerializer::class)
        data class Weapon(
            val type: String,
            @SerialName("min_power")
            val minPower: Int,
            @SerialName("max_power")
            val maxPower: Int,
            @SerialName("damage_type")
            val damageType: String,
            val defense: Int,
            @SerialName("infusion_slots")
            val infusionSlots: List<InfusionSlots>,
            @SerialName("infix_upgrade")
            val infixUpgrade: InfixUpgrade? = null,
            @SerialName("suffix_item_id")
            val suffixItemId: Int? = null,
            @SerialName("secondary_suffix_item_id")
            val secondarySuffixItemId: String? = null,
            @SerialName("stat_choices")
            val statChoices: List<Int>? = null,
            @SerialName("attribute_adjustment")
            val attributeAdjustment: Double? = null
        ) : Details() {
    
            @Serializable
            data class InfusionSlots(
                val flags: List<String>,
                @SerialName("item_id")
                val itemId: Int? = null
            )
    
            @Serializable
            data class InfixUpgrade(
                val id: Int,
                val attributes: List<Attributes>,
                val buff: Buff? = null
            ) {
    
                @Serializable
                data class Attributes(
                    val attribute: String,
                    val modifier: Int
                )
    
                @Serializable
                data class Buff(
                    @SerialName("skill_id")
                    val skillId: Int,
                    val description: String? = null
                )
    
            }
    
        }
    
    }

}