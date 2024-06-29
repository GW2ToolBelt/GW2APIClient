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

// Generated for type: TokenInfo

@Suppress("ClassName")
@Serializer(forClass = GW2v2TokenInfo::class)
private object __GW2v2TokenInfoGeneratedSerializer : KSerializer<GW2v2TokenInfo>

@Suppress("ClassName")
private object __GW2v2TokenInfoSerializer0 : JsonInlineSerializer<GW2v2TokenInfo>(__GW2v2TokenInfoGeneratedSerializer) {
    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("com.gw2tb.gw2api.types.v2.GW2v2TokenInfo") {
        element("id", String.serializer().descriptor, isOptional = false)
        element("name", String.serializer().descriptor, isOptional = false)
        element("permissions", ListSerializer(String.serializer()).descriptor, isOptional = false)
        element("type", String.serializer().descriptor, isOptional = false)
        element("expires_at", String.serializer().descriptor, isOptional = false)
        element("issued_at", String.serializer().descriptor, isOptional = false)
        element("urls", ListSerializer(String.serializer()).descriptor, isOptional = false)
    }
    override fun transformDeserialize(element: JsonElement): JsonElement {
        require(element is JsonObject)
        return buildJsonObject {
            if ("id" in element) put("id", element["id"]!!)
            if ("name" in element) put("name", element["name"]!!)
            if ("permissions" in element) put("permissions", element["permissions"]!!)
            if ("type" in element) put("type", element["type"]!!)
            if ("expires_at" in element || "issued_at" in element || "urls" in element) put("subtoken_details", buildJsonObject {
                if ("expires_at" in element) put("expires_at", element["expires_at"]!!)
                if ("issued_at" in element) put("issued_at", element["issued_at"]!!)
                if ("urls" in element) put("urls", element["urls"]!!)
            })
        }
    }
    override fun transformSerialize(element: JsonElement): JsonElement {
        require(element is JsonObject)
        return buildJsonObject {
            for ((k, v) in element.entries) when (k) {
                "subtoken_details" -> element["subtoken_details"]!!.jsonObject.forEach { put(it.key, it.value) }
                else -> put(k, v)
            }
        }
    }
}

/**
 * Information about an API key.
 *
 * @param id the API key that was requested
 * @param name the name given to the API key by the account owner
 * @param permissions an array of strings describing which permissions the API key has
 * @param type the type of the access token given
 * @param subtokenDetails 
 */
@Serializable(with = __GW2v2TokenInfoSerializer0::class)
public data class GW2v2TokenInfo(
    /** This field holds the API key that was requested. */
    val id: String,
    /** This field holds the name given to the API key by the account owner. */
    val name: String,
    /** This field holds an array of strings describing which permissions the API key has. */
    val permissions: List<String>,
    /** This field holds the type of the access token given. */
    val type: String,
    /** This field holds . */
    @SerialName("subtoken_details")
    @SerializeInline
    val subtokenDetails: SubtokenDetails? = null
) {

    /**
     * Additional information about a subtoken
     *
     * @param expiresAt if a subtoken is given, ISO8601 timestamp indicating when the given subtoken expires
     * @param issuedAt if a subtoken is given, ISO8601 timestamp indicating when the given subtoken was created
     * @param urls an array of strings describing what endpoints are available to this token (if the given subtoken is restricted to a list of URLs)
     */
    @Serializable
    public data class SubtokenDetails(
        /** This field holds if a subtoken is given, ISO8601 timestamp indicating when the given subtoken expires. */
        @SerialName("expires_at")
        val expiresAt: String,
        /** This field holds if a subtoken is given, ISO8601 timestamp indicating when the given subtoken was created. */
        @SerialName("issued_at")
        val issuedAt: String,
        /** This field holds an array of strings describing what endpoints are available to this token (if the given subtoken is restricted to a list of URLs). */
        val urls: List<String>
    )

}