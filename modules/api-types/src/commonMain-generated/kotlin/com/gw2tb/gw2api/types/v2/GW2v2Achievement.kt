/*
 * Copyright (c) 2018-2026 Leon Linhart
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

import kotlin.uuid.*
import kotlin.time.*

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

// Generated for type: Achievement

/**
 * Information about an achievement.
 *
 * @param id the achievement's ID
 * @param icon the URL for the achievement's icon
 * @param name the achievement's localized name
 * @param description the achievement's localized description
 * @param requirement the achievement's requirement as listed in-game
 * @param lockedText the achievement's in-game description prior to unlocking it
 * @param type the achievement's type
 * @param flags the achievement's categories
 * @param tiers the achievement's tiers
 * @param prerequisites the IDs of the achievements that are required to progress this achievement
 * @param rewards the achievement's rewards
 * @param bits the achievement's bits
 * @param pointCap the maximum number of AP that can be rewarded by an achievement flagged as "Repeatable"
 */
@Serializable
public data class GW2v2Achievement(
    /** This field holds the achievement's ID. */
    val id: GW2AchievementId,
    /** This field holds the URL for the achievement's icon. */
    val icon: String? = null,
    /** This field holds the achievement's localized name. */
    val name: String,
    /** This field holds the achievement's localized description. */
    val description: String,
    /** This field holds the achievement's requirement as listed in-game. */
    val requirement: String,
    /** This field holds the achievement's in-game description prior to unlocking it. */
    @SerialName("locked_text")
    val lockedText: String,
    /** This field holds the achievement's type. */
    val type: String,
    /** This field holds the achievement's categories. */
    val flags: List<String>,
    /** This field holds the achievement's tiers. */
    val tiers: List<Tier>,
    /** This field holds the IDs of the achievements that are required to progress this achievement. */
    val prerequisites: List<Long>? = null,
    /** This field holds the achievement's rewards. */
    val rewards: List<Reward>? = null,
    /** This field holds the achievement's bits. */
    val bits: List<Bit>? = null,
    /** This field holds the maximum number of AP that can be rewarded by an achievement flagged as "Repeatable". */
    @SerialName("point_cap")
    val pointCap: Long? = null
) {

    /**
     * Information about an achievement's tier.
     *
     * @param count the number of "things" (achievement-specific) that must be completed to achieve this tier
     * @param points the amount of AP awarded for completing this tier
     */
    @Serializable
    public data class Tier(
        /** This field holds the number of "things" (achievement-specific) that must be completed to achieve this tier. */
        val count: Long,
        /** This field holds the amount of AP awarded for completing this tier. */
        val points: Long
    )

    @Suppress("ClassName")
    private object __JsonParametricSerializer_Reward : JsonContentPolymorphicSerializer<Reward>(Reward::class) {
        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<Reward> {
            return when (val type = element.jsonObject["type"]?.jsonPrimitive?.content) {
                "Coins" -> Reward.Coins.serializer()
                "Items" -> Reward.Items.serializer()
                "Mastery" -> Reward.Mastery.serializer()
                "Title" -> Reward.Title.serializer()
                null -> throw SerializationException("Disambiguator property not found")
                else -> throw SerializationException("Invalid disambiguator value for Reward: $type")
            }
        }
    }

    /** Information about an achievement reward. */
    @Serializable(with = __JsonParametricSerializer_Reward::class)
    public sealed class Reward {

        /** This field holds the type of reward. */
        public abstract val type: String

        @Suppress("ClassName")
        @Serializer(forClass = Coins::class)
        private object __CoinsGeneratedSerializer : KSerializer<Coins>

        @Suppress("ClassName")
        private object __CoinsSerializer0 : JsonTransformingSerializer<Coins>(__CoinsGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Information about a coin reward.
         *
         * @param type the type of reward
         * @param count the amount of coins
         */
        @Serializable(with = __CoinsSerializer0::class)
        public data class Coins(
            override val type: String,
            /** This field holds the amount of coins. */
            val count: Long
        ) : Reward()

        @Suppress("ClassName")
        @Serializer(forClass = Items::class)
        private object __ItemsGeneratedSerializer : KSerializer<Items>

        @Suppress("ClassName")
        private object __ItemsSerializer0 : JsonTransformingSerializer<Items>(__ItemsGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Information about an item reward.
         *
         * @param type the type of reward
         * @param id the item's ID
         * @param count the amount of the item
         */
        @Serializable(with = __ItemsSerializer0::class)
        public data class Items(
            override val type: String,
            /** This field holds the item's ID. */
            val id: GW2ItemId,
            /** This field holds the amount of the item. */
            val count: Long
        ) : Reward()

        @Suppress("ClassName")
        @Serializer(forClass = Mastery::class)
        private object __MasteryGeneratedSerializer : KSerializer<Mastery>

        @Suppress("ClassName")
        private object __MasterySerializer0 : JsonTransformingSerializer<Mastery>(__MasteryGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Information about a mastery point reward.
         *
         * @param type the type of reward
         * @param id the mastery point's ID
         * @param region the mastery point's region
         */
        @Serializable(with = __MasterySerializer0::class)
        public data class Mastery(
            override val type: String,
            /** This field holds the mastery point's ID. */
            val id: GW2MasteryId,
            /** This field holds the mastery point's region. */
            val region: String
        ) : Reward()

        @Suppress("ClassName")
        @Serializer(forClass = Title::class)
        private object __TitleGeneratedSerializer : KSerializer<Title>

        @Suppress("ClassName")
        private object __TitleSerializer0 : JsonTransformingSerializer<Title>(__TitleGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Information about a title reward
         *
         * @param type the type of reward
         * @param id the title's ID
         */
        @Serializable(with = __TitleSerializer0::class)
        public data class Title(
            override val type: String,
            /** This field holds the title's ID. */
            val id: GW2TitleId
        ) : Reward()

    }

    @Suppress("ClassName")
    private object __JsonParametricSerializer_Bit : JsonContentPolymorphicSerializer<Bit>(Bit::class) {
        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<Bit> {
            return when (val type = element.jsonObject["type"]?.jsonPrimitive?.content) {
                "Item" -> Bit.Item.serializer()
                "MiniPet" -> Bit.MiniPet.serializer()
                "Skin" -> Bit.Skin.serializer()
                "Text" -> Bit.Text.serializer()
                null -> throw SerializationException("Disambiguator property not found")
                else -> throw SerializationException("Invalid disambiguator value for Bit: $type")
            }
        }
    }

    /** Information about an achievement bit. */
    @Serializable(with = __JsonParametricSerializer_Bit::class)
    public sealed class Bit {

        /** This field holds the type of bit. */
        public abstract val type: String

        /** This field holds the bit's textual description. */
        public abstract val text: String?

        @Suppress("ClassName")
        @Serializer(forClass = Item::class)
        private object __ItemGeneratedSerializer : KSerializer<Item>

        @Suppress("ClassName")
        private object __ItemSerializer0 : JsonTransformingSerializer<Item>(__ItemGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Information about an achievement bit tied to an item.
         *
         * @param type the type of bit
         * @param text the bit's textual description
         * @param id the item's ID
         */
        @Serializable(with = __ItemSerializer0::class)
        public data class Item(
            override val type: String,
            override val text: String? = null,
            /** This field holds the item's ID. */
            val id: GW2ItemId
        ) : Bit()

        @Suppress("ClassName")
        @Serializer(forClass = MiniPet::class)
        private object __MiniPetGeneratedSerializer : KSerializer<MiniPet>

        @Suppress("ClassName")
        private object __MiniPetSerializer0 : JsonTransformingSerializer<MiniPet>(__MiniPetGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Information about an achievement bit tied to a mini pet.
         *
         * @param type the type of bit
         * @param text the bit's textual description
         * @param id the mini pet's ID
         */
        @Serializable(with = __MiniPetSerializer0::class)
        public data class MiniPet(
            override val type: String,
            override val text: String? = null,
            /** This field holds the mini pet's ID. */
            val id: GW2MiniId
        ) : Bit()

        @Suppress("ClassName")
        @Serializer(forClass = Skin::class)
        private object __SkinGeneratedSerializer : KSerializer<Skin>

        @Suppress("ClassName")
        private object __SkinSerializer0 : JsonTransformingSerializer<Skin>(__SkinGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Information about an achievement bit tied to a skin.
         *
         * @param type the type of bit
         * @param text the bit's textual description
         * @param id the skin's ID
         */
        @Serializable(with = __SkinSerializer0::class)
        public data class Skin(
            override val type: String,
            override val text: String? = null,
            /** This field holds the skin's ID. */
            val id: GW2SkinId
        ) : Bit()

        @Suppress("ClassName")
        @Serializer(forClass = Text::class)
        private object __TextGeneratedSerializer : KSerializer<Text>

        @Suppress("ClassName")
        private object __TextSerializer0 : JsonTransformingSerializer<Text>(__TextGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Information about a text-only achievement bit.
         *
         * @param type the type of bit
         * @param text the bit's textual description
         * @param text the bit's textual description
         */
        @Serializable(with = __TextSerializer0::class)
        public data class Text(
            override val type: String,
            override val text: String
        ) : Bit()

    }

}