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
package com.gw2tb.gw2api.types.mumble

import com.gw2tb.gw2api.types.*

import kotlinx.serialization.*

/**
 * The information exposed by MumbleLink's "identity" buffer.
 *
 * @param name the name of the currently played character
 * @param profession the name of the currently played character
 * @param spec the ID of the currently equipped elite-specialization, or zero
 * @param race the ID of the race of the currently played character
 * @param mapID the ID of the current map
 * @param worldID the ID of the current world
 * @param teamColorId the ID of the current team
 * @param commander a flag indicating whether the player currently is commanding a squad
 * @param map the ID of the current map
 * @param fov the scaling of the FOV
 * @param uISize the selected UI size
 */
@Serializable
public data class MumbleLink(
    /** This field holds the name of the currently played character. */
    val name: String,
    /** This field holds the name of the currently played character. */
    val profession: GW2ProfessionId,
    /** This field holds the ID of the currently equipped elite-specialization, or zero. */
    val spec: GW2SpecializationId,
    /** This field holds the ID of the race of the currently played character. */
    val race: GW2RaceId,
    /** This field holds the ID of the current map. */
    @SerialName("map_id")
    val mapID: GW2MapId,
    /** This field holds the ID of the current world. */
    @SerialName("world_id")
    val worldID: ULong,
    /** This field holds the ID of the current team. */
    @SerialName("team_color_id")
    val teamColorId: Int,
    /** This field holds a flag indicating whether the player currently is commanding a squad. */
    val commander: Boolean,
    /** This field holds the ID of the current map. */
    val map: GW2MapId,
    /** This field holds the scaling of the FOV. */
    val fov: Double,
    /** This field holds the selected UI size. */
    @SerialName("uisz")
    val uISize: Int
)