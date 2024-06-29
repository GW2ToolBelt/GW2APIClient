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
package com.gw2tb.gw2api.types.v1

import com.gw2tb.gw2api.types.*
import com.gw2tb.gw2api.types.internal.*

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

// Generated for type: GuildDetails

/**
 * Information about events.
 *
 * @param guildId the guild's ID
 * @param guildName the guild's name
 * @param tag the guild's tag
 * @param emblem the guild's emblem
 */
@Serializable
public data class GW2v1GuildDetails(
    /** This field holds the guild's ID. */
    @SerialName("guild_id")
    val guildId: GW2GuildId,
    /** This field holds the guild's name. */
    @SerialName("guild_name")
    val guildName: String,
    /** This field holds the guild's tag. */
    val tag: String,
    /** This field holds the guild's emblem. */
    val emblem: Emblem
) {

    /**
     * Information about a guild emblem.
     *
     * @param backgroundId the background's ID
     * @param foregroundId the foreground's ID
     * @param flags the manipulations applied to the emblem
     * @param backgroundColorId the background color's ID
     * @param foregroundPrimaryColorId the foreground primary color's ID
     * @param foregroundSecondaryColorId the foreground secondary color's ID
     */
    @Serializable
    public data class Emblem(
        /** This field holds the background's ID. */
        @SerialName("background_id")
        val backgroundId: Int,
        /** This field holds the foreground's ID. */
        @SerialName("foreground_id")
        val foregroundId: Int,
        /** This field holds the manipulations applied to the emblem. */
        val flags: List<String>,
        /** This field holds the background color's ID. */
        @SerialName("background_color_id")
        val backgroundColorId: Int,
        /** This field holds the foreground primary color's ID. */
        @SerialName("foreground_primary_color_id")
        val foregroundPrimaryColorId: Int,
        /** This field holds the foreground secondary color's ID. */
        @SerialName("foreground_secondary_color_id")
        val foregroundSecondaryColorId: Int
    )

}