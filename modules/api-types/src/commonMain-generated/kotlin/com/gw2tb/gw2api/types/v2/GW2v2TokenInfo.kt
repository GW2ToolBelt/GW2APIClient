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
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package com.gw2tb.gw2api.types.v2

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*

/**
 * Information about an API key.
 *
 * @param id the API key that was requested
 * @param name the name given to the API key by the account owner
 * @param permissions an array of strings describing which permissions the API key has
 * @param type the type of the access token given
 * @param expiresAt if a subtoken is given, ISO8601 timestamp indicating when the given subtoken expires
 * @param issuedAt if a subtoken is given, ISO8601 timestamp indicating when the given subtoken was created
 * @param urls an array of strings describing what endpoints are available to this token (if the given subtoken is restricted to a list of URLs)
 */
@Serializable
public data class GW2v2TokenInfo(
    /** This field holds the API key that was requested. */
    val id: String,
    /** This field holds the name given to the API key by the account owner. */
    val name: String,
    /** This field holds an array of strings describing which permissions the API key has. */
    val permissions: List<String>,
    /** This field holds the type of the access token given. */
    val type: String,
    /** This field holds if a subtoken is given, ISO8601 timestamp indicating when the given subtoken expires. */
    @SerialName("expires_at")
    val expiresAt: String? = null,
    /** This field holds if a subtoken is given, ISO8601 timestamp indicating when the given subtoken was created. */
    @SerialName("issued_at")
    val issuedAt: String? = null,
    /** This field holds an array of strings describing what endpoints are available to this token (if the given subtoken is restricted to a list of URLs). */
    val urls: List<String>? = null
)