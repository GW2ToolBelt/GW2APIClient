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
package com.gw2tb.gw2api.types.v1

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*

/**
 * Information about events.
 *
 * @param guildID the guild's ID
 * @param guildName the guild's name
 * @param tag the guild's tag
 * @param emblem the guild's emblem
 */
@Serializable
public data class GW2v1GuildDetails(
    @SerialName("guild_id")
    val guildID: String,
    @SerialName("guild_name")
    val guildName: String,
    val tag: String,
    val emblem: Emblem
) {

    /**
     * Information about a guild emblem.
     *
     * @param backgroundID the background's ID
     * @param foregroundID the foreground's ID
     * @param flags the manipulations applied to the emblem
     * @param backgroundColorID the background color's ID
     * @param foregroundPrimaryColorID the foreground primary color's ID
     * @param foregroundSecondaryColorID the foreground secondary color's ID
     */
    @Serializable
    public data class Emblem(
        @SerialName("background_id")
        val backgroundID: Int,
        @SerialName("foreground_id")
        val foregroundID: Int,
        val flags: List<String>,
        @SerialName("background_color_id")
        val backgroundColorID: Int,
        @SerialName("foreground_primary_color_id")
        val foregroundPrimaryColorID: Int,
        @SerialName("foreground_secondary_color_id")
        val foregroundSecondaryColorID: Int
    )

}