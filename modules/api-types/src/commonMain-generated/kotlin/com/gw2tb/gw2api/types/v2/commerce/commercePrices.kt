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
 * Information about an item listed in the trading post.
 *
 * @param id the item's ID
 * @param whitelisted indicates whether or not a free to play account can purchase or sell this item on the trading post
 * @param buys the buy information
 * @param sells the sell information
 */
@Serializable
public data class GW2v2CommercePrices(
    val id: Int,
    val whitelisted: Boolean,
    val buys: Buys,
    val sells: Sells
) {

    /**
     * Information about an item's buy listing.
     *
     * @param unitPrice the highest buy order price in coins
     * @param quantity the amount of items being bought
     */
    @Serializable
    public data class Buys(
        @SerialName("unit_price")
        val unitPrice: Int,
        val quantity: Int
    )

    /**
     * Information about an item's sell listing.
     *
     * @param unitPrice the lowest sell order price in coins
     * @param quantity the amount of items being sold
     */
    @Serializable
    public data class Sells(
        @SerialName("unit_price")
        val unitPrice: Int,
        val quantity: Int
    )

}