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

// Generated for type: Account

/**
 * Information about a player's account.
 *
 * @param id the unique persistent account GUID
 * @param age the age of the account in seconds
 * @param name the unique account name
 * @param world the ID of the home world the account is assigned to
 * @param guilds an array containing the IDs of all guilds the account is a member in
 * @param guildLeader an array containing the IDs of all guilds the account is a leader of
 * @param created the ISO-8601 standard timestamp of when the account was created
 * @param access an array of what content this account has access to
 * @param commander a flag indicating whether the commander tag is unlocked for the account
 * @param fractalLevel the account's personal fractal level
 * @param dailyAP the daily AP the account has
 * @param monthlyAP the monthly AP the account has
 * @param wvwRank the account's personal wvw rank
 * @param lastModified the ISO-8601 standard timestamp of when the account information last changed (as perceived by the API)
 * @param buildStorageSlots the number of the account's account-wide build storage slots unlocked
 */
@Serializable
public data class GW2v2Account(
    /** This field holds the unique persistent account GUID. */
    val id: String,
    /** This field holds the age of the account in seconds. */
    val age: Int,
    /** This field holds the unique account name. */
    val name: String,
    /** This field holds the ID of the home world the account is assigned to. */
    val world: Int,
    /** This field holds an array containing the IDs of all guilds the account is a member in. */
    val guilds: List<String>,
    /** This field holds an array containing the IDs of all guilds the account is a leader of. */
    @SerialName("guild_leader")
    val guildLeader: List<String>? = null,
    /** This field holds the ISO-8601 standard timestamp of when the account was created. */
    val created: String,
    /** This field holds an array of what content this account has access to. */
    val access: List<String>,
    /** This field holds a flag indicating whether the commander tag is unlocked for the account. */
    val commander: Boolean,
    /** This field holds the account's personal fractal level. */
    @SerialName("fractal_level")
    val fractalLevel: Int? = null,
    /** This field holds the daily AP the account has. */
    @SerialName("daily_ap")
    val dailyAP: Int? = null,
    /** This field holds the monthly AP the account has. */
    @SerialName("monthly_ap")
    val monthlyAP: Int? = null,
    /** This field holds the account's personal wvw rank. */
    @SerialName("wvw_rank")
    val wvwRank: Int? = null,
    /** This field holds the ISO-8601 standard timestamp of when the account information last changed (as perceived by the API). */
    @SerialName("last_modified")
    val lastModified: String,
    /** This field holds the number of the account's account-wide build storage slots unlocked. */
    @SerialName("build_storage_slots")
    val buildStorageSlots: Int? = null
)