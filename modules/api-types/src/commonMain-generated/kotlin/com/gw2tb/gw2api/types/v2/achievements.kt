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

/**
 * Information about an achievement.
 *
 * @param id the achievement's ID
 * @param icon the URL for the achievement's icon
 * @param name the achievement's name
 * @param description the achievement's description
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
    val id: Int,
    val icon: String? = null,
    val name: String,
    val description: String,
    val requirement: String,
    @SerialName("locked_text")
    val lockedText: String,
    val type: String,
    val flags: List<String>,
    val tiers: List<Tier>,
    val prerequisites: List<Int>? = null,
    val rewards: List<Rewards>? = null,
    val bits: List<Bit>? = null,
    @SerialName("point_cap")
    val pointCap: Int? = null
) {

    /**
     * Information about an achievement's tier.
     *
     * @param count the number of "things" (achievement-specific) that must be completed to achieve this tier
     * @param points the amount of AP awarded for completing this tier
     */
    @Serializable
    public data class Tier(
        val count: Int,
        val points: Int
    )

    @Suppress("ClassName")
    private object __JsonParametricSerializer_Rewards : JsonContentPolymorphicSerializer<Rewards>(Rewards::class) {
        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out Rewards> {
            return when (element.jsonObject["type"]!!.jsonPrimitive.content) {
                "Coins" -> Rewards.Coins.serializer()
                "Items" -> Rewards.Items.serializer()
                "Mastery" -> Rewards.Mastery.serializer()
                "Title" -> Rewards.Title.serializer()
                else -> TODO()
            }
        }
    }

    /**
     * Information about an achievement reward.
     *
     * @property type the type of reward
     */
    @Serializable(with = __JsonParametricSerializer_Rewards::class)
    public sealed class Rewards {

        public abstract val type: String

        @Suppress("ClassName")
        @Serializer(forClass = Coins::class)
        private object __CoinsGeneratedSerializer : KSerializer<Coins>

        @Suppress("ClassName")
        private object __CoinsSerializer : JsonTransformingSerializer<Coins>(__CoinsGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Information about a coin reward.
         *
         * @param count the amount of coins
         */
        @Serializable(with = __CoinsSerializer::class)
        public data class Coins(
            override val type: String,
            val count: Int
        ) : Rewards()

        @Suppress("ClassName")
        @Serializer(forClass = Items::class)
        private object __ItemsGeneratedSerializer : KSerializer<Items>

        @Suppress("ClassName")
        private object __ItemsSerializer : JsonTransformingSerializer<Items>(__ItemsGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Information about an item reward.
         *
         * @param id the item's ID
         * @param count the amount of the item
         */
        @Serializable(with = __ItemsSerializer::class)
        public data class Items(
            override val type: String,
            val id: Int,
            val count: Int
        ) : Rewards()

        @Suppress("ClassName")
        @Serializer(forClass = Mastery::class)
        private object __MasteryGeneratedSerializer : KSerializer<Mastery>

        @Suppress("ClassName")
        private object __MasterySerializer : JsonTransformingSerializer<Mastery>(__MasteryGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Information about a mastery point reward.
         *
         * @param id the mastery point's ID
         * @param region the mastery point's region
         */
        @Serializable(with = __MasterySerializer::class)
        public data class Mastery(
            override val type: String,
            val id: Int,
            val region: String
        ) : Rewards()

        @Suppress("ClassName")
        @Serializer(forClass = Title::class)
        private object __TitleGeneratedSerializer : KSerializer<Title>

        @Suppress("ClassName")
        private object __TitleSerializer : JsonTransformingSerializer<Title>(__TitleGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Information about a title reward
         *
         * @param id the title's ID
         */
        @Serializable(with = __TitleSerializer::class)
        public data class Title(
            override val type: String,
            val id: Int
        ) : Rewards()

    }

    /**
     * Information about an achievement bit.
     *
     * @param type the bit's type
     * @param id the ID of the bit's object
     * @param text the bit's text
     */
    @Serializable
    public data class Bit(
        val type: String,
        val id: Int? = null,
        val text: String? = null
    )

}