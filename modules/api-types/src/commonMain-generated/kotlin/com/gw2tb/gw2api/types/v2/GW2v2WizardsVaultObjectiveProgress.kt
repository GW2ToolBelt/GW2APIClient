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

// Generated for type: WizardsVaultObjectiveProgress

/**
 * Information about progress towards a Wizard's Vault objective.
 *
 * @param id the objective's ID
 * @param title the objective's title
 * @param track the objective's track
 * @param acclaim the amount of Astral Acclaim rewarded by the objective
 * @param progressCurrent the current progress towards the objective
 * @param progressComplete the treshold for the objective to be considered complete
 * @param claimed a flag indicating whether the objective has been claimed
 */
@Serializable
public data class GW2v2WizardsVaultObjectiveProgress(
    /** This field holds the objective's ID. */
    val id: Int,
    /** This field holds the objective's title. */
    val title: String,
    /** This field holds the objective's track. */
    val track: String,
    /** This field holds the amount of Astral Acclaim rewarded by the objective. */
    val acclaim: Int,
    /** This field holds the current progress towards the objective. */
    @SerialName("progress_current")
    val progressCurrent: Int,
    /** This field holds the treshold for the objective to be considered complete. */
    @SerialName("progress_complete")
    val progressComplete: Int,
    /** This field holds a flag indicating whether the objective has been claimed. */
    val claimed: Boolean
)