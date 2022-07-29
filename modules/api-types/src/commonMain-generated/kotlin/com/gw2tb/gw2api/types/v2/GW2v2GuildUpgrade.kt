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
private object __JsonParametricSerializer_GW2v2GuildUpgrade : JsonContentPolymorphicSerializer<GW2v2GuildUpgrade>(GW2v2GuildUpgrade::class) {
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out GW2v2GuildUpgrade> {
        return when (element.jsonObject["type"]!!.jsonPrimitive.content) {
            "AccumulatingCurrency" -> GW2v2GuildUpgrade.AccumulatingCurrency.serializer()
            "BankBag" -> GW2v2GuildUpgrade.BankBag.serializer()
            "Boost" -> GW2v2GuildUpgrade.Boost.serializer()
            "Claimable" -> GW2v2GuildUpgrade.Claimable.serializer()
            "Consumable" -> GW2v2GuildUpgrade.Consumable.serializer()
            "Decoration" -> GW2v2GuildUpgrade.Decoration.serializer()
            "GuildHall" -> GW2v2GuildUpgrade.GuildHall.serializer()
            "GuildHallExpedition" -> GW2v2GuildUpgrade.GuildHallExpedition.serializer()
            "Hub" -> GW2v2GuildUpgrade.Hub.serializer()
            "Queue" -> GW2v2GuildUpgrade.Queue.serializer()
            "Unlock" -> GW2v2GuildUpgrade.Unlock.serializer()
            else -> TODO()
        }
    }
}

/** Information about a guild upgrade. */
@Serializable(with = __JsonParametricSerializer_GW2v2GuildUpgrade::class)
public sealed class GW2v2GuildUpgrade {

    /** This field holds the upgrade's ID. */
    public abstract val id: Int
    /** This field holds the upgrade's name. */
    public abstract val name: String
    /** This field holds the upgrade's description. */
    public abstract val description: String
    /** This field holds the upgrade's type. */
    public abstract val type: String
    /** This field holds the URL for the upgrade's icon. */
    public abstract val icon: String
    /** This field holds the time it takes to build the upgrade. */
    public abstract val buildTime: Int
    /** This field holds the prerequisite level the guild must be at to build the upgrade. */
    public abstract val requiredLevel: Int
    /** This field holds the amount of guild experience that will be awarded upon building the upgrade. */
    public abstract val experience: Int
    /** This field holds an array of upgrade IDs that must be completed before this can be built. */
    public abstract val prerequisites: List<Int>
    /** This field holds an array of objects describing the upgrade's cost. */
    public abstract val costs: List<Cost>

    /**
     * Information about an upgrade's cost.
     *
     * @param type the cost's type
     * @param name the cost's name
     * @param count the amount needed
     * @param itemID the ID of the cost's item
     */
    @Serializable
    public data class Cost(
        /** This field holds the cost's type. */
        val type: String,
        /** This field holds the cost's name. */
        val name: String,
        /** This field holds the amount needed. */
        val count: Int,
        /** This field holds the ID of the cost's item. */
        @SerialName("item_id")
        val itemID: Int? = null
    )

    @Suppress("ClassName")
    @Serializer(forClass = AccumulatingCurrency::class)
    private object __AccumulatingCurrencyGeneratedSerializer : KSerializer<AccumulatingCurrency>

    @Suppress("ClassName")
    private object __AccumulatingCurrencySerializer : JsonTransformingSerializer<AccumulatingCurrency>(__AccumulatingCurrencyGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /** Information about a mine capacity upgrade. */
    @Serializable(with = __AccumulatingCurrencySerializer::class)
    public data class AccumulatingCurrency(
        override val id: Int,
        override val name: String,
        override val description: String,
        override val type: String,
        override val icon: String,
        @SerialName("build_time")
        override val buildTime: Int,
        @SerialName("required_level")
        override val requiredLevel: Int,
        override val experience: Int,
        override val prerequisites: List<Int>,
        override val costs: List<Cost>
    ) : GW2v2GuildUpgrade()

    @Suppress("ClassName")
    @Serializer(forClass = BankBag::class)
    private object __BankBagGeneratedSerializer : KSerializer<BankBag>

    @Suppress("ClassName")
    private object __BankBagSerializer : JsonTransformingSerializer<BankBag>(__BankBagGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * Information about a guild bank upgrades.
     *
     * @param id the upgrade's ID
     * @param name the upgrade's name
     * @param description the upgrade's description
     * @param type the upgrade's type
     * @param icon the URL for the upgrade's icon
     * @param buildTime the time it takes to build the upgrade
     * @param requiredLevel the prerequisite level the guild must be at to build the upgrade
     * @param experience the amount of guild experience that will be awarded upon building the upgrade
     * @param prerequisites an array of upgrade IDs that must be completed before this can be built
     * @param costs an array of objects describing the upgrade's cost@param bagMaxItems the maximum item slots of the guild bank tab
     * @param bagMaxCoins the maximum amount of coins that can be stored in the bank tab
     */
    @Serializable(with = __BankBagSerializer::class)
    public data class BankBag(
        override val id: Int,
        override val name: String,
        override val description: String,
        override val type: String,
        override val icon: String,
        @SerialName("build_time")
        override val buildTime: Int,
        @SerialName("required_level")
        override val requiredLevel: Int,
        override val experience: Int,
        override val prerequisites: List<Int>,
        override val costs: List<Cost>,
        /** This field holds the maximum item slots of the guild bank tab. */
        @SerialName("bag_max_items")
        val bagMaxItems: Int,
        /** This field holds the maximum amount of coins that can be stored in the bank tab. */
        @SerialName("bag_max_coins")
        val bagMaxCoins: Int
    ) : GW2v2GuildUpgrade()

    @Suppress("ClassName")
    @Serializer(forClass = Boost::class)
    private object __BoostGeneratedSerializer : KSerializer<Boost>

    @Suppress("ClassName")
    private object __BoostSerializer : JsonTransformingSerializer<Boost>(__BoostGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /** Information about a permanent guild buffs upgrade. */
    @Serializable(with = __BoostSerializer::class)
    public data class Boost(
        override val id: Int,
        override val name: String,
        override val description: String,
        override val type: String,
        override val icon: String,
        @SerialName("build_time")
        override val buildTime: Int,
        @SerialName("required_level")
        override val requiredLevel: Int,
        override val experience: Int,
        override val prerequisites: List<Int>,
        override val costs: List<Cost>
    ) : GW2v2GuildUpgrade()

    @Suppress("ClassName")
    @Serializer(forClass = Claimable::class)
    private object __ClaimableGeneratedSerializer : KSerializer<Claimable>

    @Suppress("ClassName")
    private object __ClaimableSerializer : JsonTransformingSerializer<Claimable>(__ClaimableGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /** Information about a guild WvW tactics. */
    @Serializable(with = __ClaimableSerializer::class)
    public data class Claimable(
        override val id: Int,
        override val name: String,
        override val description: String,
        override val type: String,
        override val icon: String,
        @SerialName("build_time")
        override val buildTime: Int,
        @SerialName("required_level")
        override val requiredLevel: Int,
        override val experience: Int,
        override val prerequisites: List<Int>,
        override val costs: List<Cost>
    ) : GW2v2GuildUpgrade()

    @Suppress("ClassName")
    @Serializer(forClass = Consumable::class)
    private object __ConsumableGeneratedSerializer : KSerializer<Consumable>

    @Suppress("ClassName")
    private object __ConsumableSerializer : JsonTransformingSerializer<Consumable>(__ConsumableGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /** Information about a banners and guild siege. */
    @Serializable(with = __ConsumableSerializer::class)
    public data class Consumable(
        override val id: Int,
        override val name: String,
        override val description: String,
        override val type: String,
        override val icon: String,
        @SerialName("build_time")
        override val buildTime: Int,
        @SerialName("required_level")
        override val requiredLevel: Int,
        override val experience: Int,
        override val prerequisites: List<Int>,
        override val costs: List<Cost>
    ) : GW2v2GuildUpgrade()

    @Suppress("ClassName")
    @Serializer(forClass = Decoration::class)
    private object __DecorationGeneratedSerializer : KSerializer<Decoration>

    @Suppress("ClassName")
    private object __DecorationSerializer : JsonTransformingSerializer<Decoration>(__DecorationGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /** Information about a decoration that must be crafted by a Scribe. */
    @Serializable(with = __DecorationSerializer::class)
    public data class Decoration(
        override val id: Int,
        override val name: String,
        override val description: String,
        override val type: String,
        override val icon: String,
        @SerialName("build_time")
        override val buildTime: Int,
        @SerialName("required_level")
        override val requiredLevel: Int,
        override val experience: Int,
        override val prerequisites: List<Int>,
        override val costs: List<Cost>
    ) : GW2v2GuildUpgrade()

    @Suppress("ClassName")
    @Serializer(forClass = GuildHall::class)
    private object __GuildHallGeneratedSerializer : KSerializer<GuildHall>

    @Suppress("ClassName")
    private object __GuildHallSerializer : JsonTransformingSerializer<GuildHall>(__GuildHallGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /** Information about claiming a Guild Hall. */
    @Serializable(with = __GuildHallSerializer::class)
    public data class GuildHall(
        override val id: Int,
        override val name: String,
        override val description: String,
        override val type: String,
        override val icon: String,
        @SerialName("build_time")
        override val buildTime: Int,
        @SerialName("required_level")
        override val requiredLevel: Int,
        override val experience: Int,
        override val prerequisites: List<Int>,
        override val costs: List<Cost>
    ) : GW2v2GuildUpgrade()

    @Suppress("ClassName")
    @Serializer(forClass = GuildHallExpedition::class)
    private object __GuildHallExpeditionGeneratedSerializer : KSerializer<GuildHallExpedition>

    @Suppress("ClassName")
    private object __GuildHallExpeditionSerializer : JsonTransformingSerializer<GuildHallExpedition>(__GuildHallExpeditionGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /** Information about an expedition unlock. */
    @Serializable(with = __GuildHallExpeditionSerializer::class)
    public data class GuildHallExpedition(
        override val id: Int,
        override val name: String,
        override val description: String,
        override val type: String,
        override val icon: String,
        @SerialName("build_time")
        override val buildTime: Int,
        @SerialName("required_level")
        override val requiredLevel: Int,
        override val experience: Int,
        override val prerequisites: List<Int>,
        override val costs: List<Cost>
    ) : GW2v2GuildUpgrade()

    @Suppress("ClassName")
    @Serializer(forClass = Hub::class)
    private object __HubGeneratedSerializer : KSerializer<Hub>

    @Suppress("ClassName")
    private object __HubSerializer : JsonTransformingSerializer<Hub>(__HubGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /** Information about Guild Initiative office unlock. */
    @Serializable(with = __HubSerializer::class)
    public data class Hub(
        override val id: Int,
        override val name: String,
        override val description: String,
        override val type: String,
        override val icon: String,
        @SerialName("build_time")
        override val buildTime: Int,
        @SerialName("required_level")
        override val requiredLevel: Int,
        override val experience: Int,
        override val prerequisites: List<Int>,
        override val costs: List<Cost>
    ) : GW2v2GuildUpgrade()

    @Suppress("ClassName")
    @Serializer(forClass = Queue::class)
    private object __QueueGeneratedSerializer : KSerializer<Queue>

    @Suppress("ClassName")
    private object __QueueSerializer : JsonTransformingSerializer<Queue>(__QueueGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /** Information about Workshop Restoration 1. */
    @Serializable(with = __QueueSerializer::class)
    public data class Queue(
        override val id: Int,
        override val name: String,
        override val description: String,
        override val type: String,
        override val icon: String,
        @SerialName("build_time")
        override val buildTime: Int,
        @SerialName("required_level")
        override val requiredLevel: Int,
        override val experience: Int,
        override val prerequisites: List<Int>,
        override val costs: List<Cost>
    ) : GW2v2GuildUpgrade()

    @Suppress("ClassName")
    @Serializer(forClass = Unlock::class)
    private object __UnlockGeneratedSerializer : KSerializer<Unlock>

    @Suppress("ClassName")
    private object __UnlockSerializer : JsonTransformingSerializer<Unlock>(__UnlockGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /** Information about permanent unlocks, such as merchants and arena decorations. */
    @Serializable(with = __UnlockSerializer::class)
    public data class Unlock(
        override val id: Int,
        override val name: String,
        override val description: String,
        override val type: String,
        override val icon: String,
        @SerialName("build_time")
        override val buildTime: Int,
        @SerialName("required_level")
        override val requiredLevel: Int,
        override val experience: Int,
        override val prerequisites: List<Int>,
        override val costs: List<Cost>
    ) : GW2v2GuildUpgrade()

}