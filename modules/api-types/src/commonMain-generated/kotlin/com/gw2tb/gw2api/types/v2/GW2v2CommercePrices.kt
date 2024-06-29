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

// Generated for type: CommercePrices

/**
 * Information about an item listed in the trading post.
 *
 * @param id the item's ID
 * @param whitelisted indicates whether a free to play account can purchase or sell this item on the trading post
 * @param buys the buy information
 * @param sells the sell information
 */
@Serializable
public data class GW2v2CommercePrices(
    /** This field holds the item's ID. */
    val id: GW2ItemId,
    /** This field holds indicates whether a free to play account can purchase or sell this item on the trading post. */
    val whitelisted: Boolean,
    /** This field holds the buy information. */
    val buys: BuyListing,
    /** This field holds the sell information. */
    val sells: SellListing
) {

    /**
     * Information about an item's buy listing.
     *
     * @param unitPrice the highest buy order price in coins
     * @param quantity the amount of items being bought
     */
    @Serializable
    public data class BuyListing(
        /** This field holds the highest buy order price in coins. */
        @SerialName("unit_price")
        val unitPrice: Int,
        /** This field holds the amount of items being bought. */
        val quantity: Int
    )

    /**
     * Information about an item's sell listing.
     *
     * @param unitPrice the lowest sell order price in coins
     * @param quantity the amount of items being sold
     */
    @Serializable
    public data class SellListing(
        /** This field holds the lowest sell order price in coins. */
        @SerialName("unit_price")
        val unitPrice: Int,
        /** This field holds the amount of items being sold. */
        val quantity: Int
    )

}