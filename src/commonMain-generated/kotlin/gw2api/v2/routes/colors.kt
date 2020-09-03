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
import gw2api.internal.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*
import kotlin.jvm.*

/**
 * Creates a request used to query the list of available IDs.
 *
 * Returns information about all dye colors in the game.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/colors]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2ColorsIDs(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/v2/colors",
    parameters = mapOfNonNullValues("v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(Int.serializer()),
    configure = configure
)

/**
 * Creates a request used to query a single [item](GW2v2Color) by its ID.
 *
 * Returns information about all dye colors in the game.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/colors]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2ColorsByID(id: Int, configure: (RequestBuilder<GW2v2Color>.() -> Unit)? = null): RequestBuilder<GW2v2Color> = request(
    path = "/v2/colors",
    parameters = mapOfNonNullValues("id" to id.toString(), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = GW2v2Color.serializer(),
    configure = configure
)

/**
 * Creates a request used to query one or more [items](GW2v2Color) by their IDs.
 *
 * Returns information about all dye colors in the game.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/colors]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2ColorsByIDs(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2Color>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Color>> = request(
    path = "/v2/colors",
    parameters = mapOfNonNullValues("ids" to ids.joinToString(","), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2Color.serializer()),
    configure = configure
)

/**
 * Creates a request used to query all available [items](GW2v2Color).
 *
 * Returns information about all dye colors in the game.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/colors]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2ColorsAll(configure: (RequestBuilder<List<GW2v2Color>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Color>> = request(
    path = "/v2/colors",
    parameters = mapOfNonNullValues("ids" to "all", "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2Color.serializer()),
    configure = configure
)

/**
 * Creates a request used to query one or more [items](GW2v2Color) by page.
 *
 * Returns information about all dye colors in the game.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/colors]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2ColorsByPage(page: Int, pageSize: Int = 200, configure: (RequestBuilder<List<GW2v2Color>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Color>> = request(
    path = "/v2/colors",
    parameters = mapOfNonNullValues("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString(), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2Color.serializer()),
    configure = configure
)

/**
 * Information about a dye color.
 *
 * @param id the color's ID
 * @param name the color's name
 * @param baseRGB the base RGB values
 * @param cloth detailed information on its appearance when applied on cloth armor
 * @param leather detailed information on its appearance when applied on leather armor
 * @param metal detailed information on its appearance when applied on metal armor
 * @param fur detailed information on its appearance when applied on fur armor
 * @param item the ID of the dye item
 * @param categories the categories of the color
 */
@Serializable
public data class GW2v2Color(
    val id: Int,
    val name: String,
    @SerialName("base_rgb")
    val baseRGB: List<Int>,
    val cloth: Cloth,
    val leather: Leather,
    val metal: Metal,
    val fur: Fur? = null,
    val item: Int,
    val categories: List<String>
) {

    /**
     * Information about the appearance of the color.
     *
     * @param brightness the brightness
     * @param contrast the contrast
     * @param hue the hue in HSL colorspace
     * @param saturation the saturation in HSL colorspace
     * @param lightness the lightness in HSL colorspace
     * @param rBG a list containing precalculated RGB values
     */
    @Serializable
    public data class Cloth(
        val brightness: Int,
        val contrast: Double,
        val hue: Int,
        val saturation: Double,
        val lightness: Double,
        @SerialName("rbg")
        val rBG: List<Int>
    )

    /**
     * Information about the appearance of the color.
     *
     * @param brightness the brightness
     * @param contrast the contrast
     * @param hue the hue in HSL colorspace
     * @param saturation the saturation in HSL colorspace
     * @param lightness the lightness in HSL colorspace
     * @param rBG a list containing precalculated RGB values
     */
    @Serializable
    public data class Leather(
        val brightness: Int,
        val contrast: Double,
        val hue: Int,
        val saturation: Double,
        val lightness: Double,
        @SerialName("rbg")
        val rBG: List<Int>
    )

    /**
     * Information about the appearance of the color.
     *
     * @param brightness the brightness
     * @param contrast the contrast
     * @param hue the hue in HSL colorspace
     * @param saturation the saturation in HSL colorspace
     * @param lightness the lightness in HSL colorspace
     * @param rBG a list containing precalculated RGB values
     */
    @Serializable
    public data class Metal(
        val brightness: Int,
        val contrast: Double,
        val hue: Int,
        val saturation: Double,
        val lightness: Double,
        @SerialName("rbg")
        val rBG: List<Int>
    )

    /**
     * Information about the appearance of the color.
     *
     * @param brightness the brightness
     * @param contrast the contrast
     * @param hue the hue in HSL colorspace
     * @param saturation the saturation in HSL colorspace
     * @param lightness the lightness in HSL colorspace
     * @param rBG a list containing precalculated RGB values
     */
    @Serializable
    public data class Fur(
        val brightness: Int,
        val contrast: Double,
        val hue: Int,
        val saturation: Double,
        val lightness: Double,
        @SerialName("rbg")
        val rBG: List<Int>
    )

}