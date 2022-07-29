/*
 * Copyright (c) 2018-2022 Leon Linhart
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
package com.gw2tb.gw2api.types.mumble

import kotlinx.serialization.*

/**
 * The definition Guild Wars 2's use of the `identity` field of the MumbleLink protocol.
 *
 * @param name the name of the currently played character
 * @param profession the current profession (class) of the currently played character
 * @param spec the ID of the current elite-specialization of the currently played character, or 0
 * @param race the ID of the race of the currently played character
 * @param mapId the ID of the current map
 * @param worldId the ID of the current world
 * @param teamColorId the ID of the current team
 * @param commander whether or not the player currently is commanding a squad
 * @param map the ID of the current map
 * @param foV the scaling of the FOV
 * @param uISize the selected UI size
 */
@Serializable
public data class MumbleLinkIdentity(
    /** This field holds the name of the currently played character. */
    val name: String,
    /** This field holds the current profession (class) of the currently played character. */
    val profession: Int,
    /** This field holds the ID of the current elite-specialization of the currently played character, or 0. */
    val spec: Int,
    /** This field holds the ID of the race of the currently played character. */
    val race: Int,
    /** This field holds the ID of the current map. */
    @SerialName("map_id")
    val mapId: Int,
    /** This field holds the ID of the current world. */
    @SerialName("world_id")
    val worldId: Int,
    /** This field holds the ID of the current team. */
    @SerialName("team_color_id")
    val teamColorId: Int,
    /** This field holds whether or not the player currently is commanding a squad. */
    val commander: Boolean,
    /** This field holds the ID of the current map. */
    val map: Int,
    /** This field holds the scaling of the FOV. */
    @SerialName("fov")
    val foV: Double,
    /** This field holds the selected UI size. */
    @SerialName("uisz")
    val uISize: Int
)