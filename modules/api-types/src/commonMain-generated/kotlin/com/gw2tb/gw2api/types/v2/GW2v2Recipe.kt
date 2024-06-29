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

// Generated for type: Recipe

/**
 * Information about a crafting recipe.
 *
 * @param id the recipe's ID
 * @param type the recipe's type
 * @param outputItemId the ID of the produced item
 * @param outputItemCount the amount of items produced
 * @param craftTimeMillis the time in milliseconds it takes to craft the item
 * @param disciplines the crafting disciplines that can use the recipe
 * @param minRating the minimum rating required to use the recipe
 * @param flags the flags applying to the recipe
 * @param ingredients the recipe's ingredients
 * @param outputUpgradeId the ID of the produced guild upgrade
 * @param chatLink the recipe's chat code
 */
@Serializable
public data class GW2v2Recipe(
    /** This field holds the recipe's ID. */
    val id: Int,
    /** This field holds the recipe's type. */
    val type: String,
    /** This field holds the ID of the produced item. */
    @SerialName("output_item_id")
    val outputItemId: GW2ItemId,
    /** This field holds the amount of items produced. */
    @SerialName("output_item_count")
    val outputItemCount: Int,
    /** This field holds the time in milliseconds it takes to craft the item. */
    @SerialName("time_to_craft_ms")
    val craftTimeMillis: Int,
    /** This field holds the crafting disciplines that can use the recipe. */
    val disciplines: List<String>,
    /** This field holds the minimum rating required to use the recipe. */
    @SerialName("min_rating")
    val minRating: Int,
    /** This field holds the flags applying to the recipe. */
    val flags: List<String>,
    /** This field holds the recipe's ingredients. */
    val ingredients: List<Ingredient>,
    /** This field holds the ID of the produced guild upgrade. */
    @SerialName("output_upgrade_id")
    val outputUpgradeId: Int? = null,
    /** This field holds the recipe's chat code. */
    @SerialName("chat_link")
    val chatLink: String
) {

    @Suppress("ClassName")
    private object __JsonParametricSerializer_Ingredient : JsonContentPolymorphicSerializer<Ingredient>(Ingredient::class) {
        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<Ingredient> {
            return when (val type = element.jsonObject["type"]?.jsonPrimitive?.content) {
                "Currency" -> Ingredient.Currency.serializer()
                "GuildUpgrade" -> Ingredient.GuildUpgrade.serializer()
                "Item" -> Ingredient.Item.serializer()
                null -> throw SerializationException("Disambiguator property not found")
                else -> throw SerializationException("Invalid disambiguator value for Ingredient: $type")
            }
        }
    }

    /** Information about a recipe ingredient. */
    @Serializable(with = __JsonParametricSerializer_Ingredient::class)
    public sealed class Ingredient {

        /** This field holds the ingredient's type. */
        public abstract val type: String

        /** This field holds the ingredient's ID. */
        public abstract val id: Int

        /** This field holds the amount. */
        public abstract val count: Int

        @Suppress("ClassName")
        @Serializer(forClass = Currency::class)
        private object __CurrencyGeneratedSerializer : KSerializer<Currency>

        @Suppress("ClassName")
        private object __CurrencySerializer0 : JsonTransformingSerializer<Currency>(__CurrencyGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * A currency ingredient.
         *
         * @param type the ingredient's type
         * @param id the ingredient's ID
         * @param count the amount
         */
        @Serializable(with = __CurrencySerializer0::class)
        public data class Currency(
            override val type: String,
            override val id: Int,
            override val count: Int
        ) : Ingredient()

        @Suppress("ClassName")
        @Serializer(forClass = GuildUpgrade::class)
        private object __GuildUpgradeGeneratedSerializer : KSerializer<GuildUpgrade>

        @Suppress("ClassName")
        private object __GuildUpgradeSerializer0 : JsonTransformingSerializer<GuildUpgrade>(__GuildUpgradeGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * A guild upgrade ingredient.
         *
         * @param type the ingredient's type
         * @param id the ingredient's ID
         * @param count the amount
         */
        @Serializable(with = __GuildUpgradeSerializer0::class)
        public data class GuildUpgrade(
            override val type: String,
            override val id: Int,
            override val count: Int
        ) : Ingredient()

        @Suppress("ClassName")
        @Serializer(forClass = Item::class)
        private object __ItemGeneratedSerializer : KSerializer<Item>

        @Suppress("ClassName")
        private object __ItemSerializer0 : JsonTransformingSerializer<Item>(__ItemGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * An item ingredient.
         *
         * @param type the ingredient's type
         * @param id the ingredient's ID
         * @param count the amount
         */
        @Serializable(with = __ItemSerializer0::class)
        public data class Item(
            override val type: String,
            override val id: Int,
            override val count: Int
        ) : Ingredient()

    }

}