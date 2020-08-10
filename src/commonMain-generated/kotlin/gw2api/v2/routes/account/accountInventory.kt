/*
 * Copyright (c) 2018-2020 Leon Linhart
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
@file:JvmName("GW2v2")
@file:JvmMultifileClass
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package gw2api.v2

import gw2api.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*
import kotlin.jvm.*

public fun GW2APIClient.gw2v2AccountInventory(configure: (RequestBuilder<List<GW2v2AccountInventory>>.() -> Unit)? = null): RequestBuilder<List<GW2v2AccountInventory>> = request(
    path = "/v2/account/inventory",
    parameters = mapOf("v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2AccountInventory.serializer()),
    configure = configure
)

@Serializable
public data class GW2v2AccountInventory(
    val id: Int,
    val count: Int,
    val charges: Int? = null,
    val skin: Int? = null,
    val upgrades: List<Int>? = null,
    val infusions: List<Int>? = null,
    val stats: Stats? = null,
    val binding: String? = null
) {

    @Serializable
    public data class Stats(
        val id: Int,
        @SerialName("Power")
        val power: Int? = null,
        @SerialName("Precision")
        val precision: Int? = null,
        @SerialName("Toughness")
        val toughness: Int? = null,
        @SerialName("Vitality")
        val vitality: Int? = null,
        @SerialName("ConditionDamage")
        val conditionDamage: Int? = null,
        @SerialName("ConditionDuration")
        val conditionDuration: Int? = null,
        @SerialName("Healing")
        val healing: Int? = null,
        @SerialName("BoonDuration")
        val boonDuration: Int? = null
    )

}