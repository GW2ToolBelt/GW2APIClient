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

// Generated for type: RecipeDetails

/**
 * Information about a crafting recipe.
 *
 * @param recipeId the recipe's ID
 * @param type the recipe's type
 * @param outputItemId the ID of the produced item
 * @param outputItemCount the amount of items produced
 * @param craftTimeMillis the time in milliseconds it takes to craft the item
 * @param disciplines the crafting disciplines that can use the recipe
 * @param minRating the minimum rating required to use the recipe
 * @param flags the flags applying to the recipe
 * @param ingredients the recipe's ingredients
 */
@Serializable
public data class GW2v1RecipeDetails(
    /** This field holds the recipe's ID. */
    @SerialName("recipe_id")
    val recipeId: GW2RecipeId,
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
    val ingredients: List<Ingredient>
) {

    /**
     * Information about a recipe ingredient.
     *
     * @param itemId the ingredient's item ID
     * @param count the quantity of this ingredient
     */
    @Serializable
    public data class Ingredient(
        /** This field holds the ingredient's item ID. */
        @SerialName("item_id")
        val itemId: GW2ItemId,
        /** This field holds the quantity of this ingredient. */
        val count: Int
    )

}