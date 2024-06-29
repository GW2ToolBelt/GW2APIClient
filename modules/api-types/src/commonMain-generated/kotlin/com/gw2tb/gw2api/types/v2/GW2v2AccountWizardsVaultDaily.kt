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

// Generated for type: AccountWizardsVaultDaily

/**
 * Information about a player's current daily Wizard's Vault objectives.
 *
 * @param metaProgressCurrent the current progress towards the daily meta achievement
 * @param metaProgressComplete the threshold for the daily meta achievement to be considered complete
 * @param metaRewardItemId the item ID of the daily meta achievement reward
 * @param metaRewardAstral the amount of Astral Acclaim rewarded by the daily meta achievement
 * @param metaRewardClaimed a flag indicating whether the daily meta achievement reward has been claimed
 * @param objectives the progress towards the Wizard's Vault objectives
 */
@Serializable
public data class GW2v2AccountWizardsVaultDaily(
    /** This field holds the current progress towards the daily meta achievement. */
    @SerialName("meta_progress_current")
    val metaProgressCurrent: Int,
    /** This field holds the threshold for the daily meta achievement to be considered complete. */
    @SerialName("meta_progress_complete")
    val metaProgressComplete: Int,
    /** This field holds the item ID of the daily meta achievement reward. */
    @SerialName("meta_reward_item_id")
    val metaRewardItemId: GW2ItemId,
    /** This field holds the amount of Astral Acclaim rewarded by the daily meta achievement. */
    @SerialName("meta_reward_astral")
    val metaRewardAstral: Int,
    /** This field holds a flag indicating whether the daily meta achievement reward has been claimed. */
    @SerialName("meta_reward_claimed")
    val metaRewardClaimed: Boolean,
    /** This field holds the progress towards the Wizard's Vault objectives. */
    val objectives: List<GW2v2WizardsVaultObjectiveProgress>
)