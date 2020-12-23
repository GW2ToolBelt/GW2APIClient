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
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package com.gw2tb.gw2api.types.v2

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*

/**
 * Information about a crafting recipe.
 *
 * @param id the recipe's ID
 * @param type the recipe's type
 * @param outputItemID the ID of the produced item
 * @param outputItemCount the amount of items produced
 * @param craftTimeMillis the time in milliseconds it takes to craft the item
 * @param disciplines the crafting disciplines that can use the recipe
 * @param minRating the minimum rating required to use the recipe
 * @param flags the flags applying to the recipe
 * @param ingredients the recipe's ingredients
 * @param guildIngredients the recipe's guild ingredients
 * @param outputUpgradeID the ID of the produced guild upgrade
 * @param chatLink the recipe's chat code
 */
@Serializable
public data class GW2v2Recipe(
    val id: String,
    val type: String,
    @SerialName("output_item_id")
    val outputItemID: Int,
    @SerialName("output_item_count")
    val outputItemCount: Int,
    @SerialName("time_to_craft_ms")
    val craftTimeMillis: Int,
    val disciplines: List<String>,
    @SerialName("min_rating")
    val minRating: Int,
    val flags: List<String>,
    val ingredients: List<Ingredient>,
    @SerialName("guild_ingredients")
    val guildIngredients: List<Ingredient>? = null,
    @SerialName("output_upgrade_id")
    val outputUpgradeID: Int? = null,
    @SerialName("chat_link")
    val chatLink: String
) {

    /**
     * Information about a recipe guild ingredient.
     *
     * @param upgrade_id the guild ingredient's guild upgrade ID
     * @param count the quantity of this guild ingredient
     */
    @Serializable
    public data class Ingredient(
        @SerialName("upgradeid")
        val upgrade_id: String,
        val count: Int
    )

}