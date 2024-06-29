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

// Generated for type: GuildTreasurySlot

/**
 * Information about an item in a guild's treasury.
 *
 * @param itemId the item's ID
 * @param count the amount of the item in the guild's treasury
 * @param neededBy the currently in-progress upgrades requiring the item
 */
@Serializable
public data class GW2v2GuildTreasurySlot(
    /** This field holds the item's ID. */
    @SerialName("item_id")
    val itemId: GW2ItemId,
    /** This field holds the amount of the item in the guild's treasury. */
    val count: Int,
    /** This field holds the currently in-progress upgrades requiring the item. */
    @SerialName("needed_by")
    val neededBy: List<UpgradeRequirement>
) {

    /**
     * Information about the usage for an item.
     *
     * @param upgradeId the guild upgrade's ID
     * @param count the total amount of the item required for the upgrade
     */
    @Serializable
    public data class UpgradeRequirement(
        /** This field holds the guild upgrade's ID. */
        @SerialName("upgrade_id")
        val upgradeId: Int,
        /** This field holds the total amount of the item required for the upgrade. */
        val count: Int
    )

}