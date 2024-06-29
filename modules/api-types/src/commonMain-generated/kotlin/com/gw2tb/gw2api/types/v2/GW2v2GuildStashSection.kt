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

// Generated for type: GuildStashSection

/**
 * Information about a section of a guild's vault.
 *
 * @param upgradeId the ID of the guild upgrade that granted access to this section of the guild's vault
 * @param size the number of slots in this section of the guild's vault
 * @param coins the number of coins deposited in this section of the guild's vault
 * @param note the description set for this section of the guild's vault
 * @param inventory the items in this section of the guild's vault
 */
@Serializable
public data class GW2v2GuildStashSection(
    /** This field holds the ID of the guild upgrade that granted access to this section of the guild's vault. */
    @SerialName("upgrade_id")
    val upgradeId: Int,
    /** This field holds the number of slots in this section of the guild's vault. */
    val size: Int,
    /** This field holds the number of coins deposited in this section of the guild's vault. */
    val coins: Int,
    /** This field holds the description set for this section of the guild's vault. */
    val note: String,
    /** This field holds the items in this section of the guild's vault. */
    val inventory: List<GuildStashSlot?>
) {

    /**
     * Information about an item in a guild vault's slot.
     *
     * @param id the item's ID
     * @param count the amount of items in the stack
     */
    @Serializable
    public data class GuildStashSlot(
        /** This field holds the item's ID. */
        val id: GW2ItemId,
        /** This field holds the amount of items in the stack. */
        val count: Int
    )

}