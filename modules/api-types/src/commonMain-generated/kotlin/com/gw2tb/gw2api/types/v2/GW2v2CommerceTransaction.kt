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

// Generated for type: CommerceTransaction

/**
 * Information about a transaction.
 *
 * @param id the transaction's ID
 * @param itemId the item's ID
 * @param price the price in coins
 * @param quantity the quantity of the item
 * @param created the ISO-8601 standard timestamp of when the transaction was created
 * @param purchased the ISO-8601 standard timestamp of when the transaction was completed
 */
@Serializable
public data class GW2v2CommerceTransaction(
    /** This field holds the transaction's ID. */
    val id: Int,
    /** This field holds the item's ID. */
    @SerialName("item_id")
    val itemId: GW2ItemId,
    /** This field holds the price in coins. */
    val price: Int,
    /** This field holds the quantity of the item. */
    val quantity: Int,
    /** This field holds the ISO-8601 standard timestamp of when the transaction was created. */
    val created: String,
    /** This field holds the ISO-8601 standard timestamp of when the transaction was completed. */
    val purchased: String? = null
)