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

import com.gw2tb.gw2api.types.*
import com.gw2tb.gw2api.types.internal.*

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

// Generated for type: AccountWizardsVaultListings

/**
 * Information about a player's available Wizard's Vault listings.
 *
 * @param id the listing's ID
 * @param itemId the ID of the listed item
 * @param itemCount the amount of items the player receives
 * @param type the type of the listing
 * @param cost the cost of this listing (in Astral Acclaim)
 * @param purchased the amount of times this listing has been purchased
 * @param purchaseLimit the maximum amount of times this listing can be purchased
 */
@Serializable
public data class GW2v2AccountWizardsVaultListings(
    /** This field holds the listing's ID. */
    val id: Int,
    /** This field holds the ID of the listed item. */
    @SerialName("item_id")
    val itemId: GW2ItemId,
    /** This field holds the amount of items the player receives. */
    @SerialName("item_count")
    val itemCount: Int,
    /** This field holds the type of the listing. */
    val type: GW2v2Type,
    /** This field holds the cost of this listing (in Astral Acclaim). */
    val cost: Int,
    /** This field holds the amount of times this listing has been purchased. */
    val purchased: Int? = null,
    /** This field holds the maximum amount of times this listing can be purchased. */
    @SerialName("purchase_limit")
    val purchaseLimit: Int? = null
)