@file:JvmName("GW2v2")
@file:JvmMultifileClass
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package gw2api.v2

import gw2api.*
import gw2api.extra.*
import gw2api.misc.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlin.jvm.*

fun GW2APIClient.gw2v2ColorsIds(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/colors",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = Int.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2ColorsById(id: Int, configure: (RequestBuilder<GW2v2Colors>.() -> Unit)? = null): RequestBuilder<GW2v2Colors> = request(
    path = "/colors",
    parameters = mapOf("id" to id.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Colors.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2ColorsByIds(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2Colors>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Colors>> = request(
    path = "/colors",
    parameters = mapOf("ids" to ids.joinToString(",")),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Colors.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2ColorsAll(configure: (RequestBuilder<List<GW2v2Colors>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Colors>> = request(
    path = "/colors",
    parameters = mapOf("ids" to "all"),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Colors.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2ColorsByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2Colors>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Colors>> = request(
    path = "/colors",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Colors.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2Colors(
    val id: Int,
    val name: String,
    @SerialName("base_rgb")
    val baseRGB: List<Int>,
    val cloth: Cloth,
    val leather: Leather,
    val metal: Metal,
    val fur: Fur,
    val item: Int,
    val categories: List<String>
) {

    @Serializable
    data class Cloth(
        val brightness: Int,
        val contrast: Double,
        val hue: Int,
        val saturation: Double,
        val lightness: Double,
        val rbg: List<Int>
    )
    @Serializable
    data class Leather(
        val brightness: Int,
        val contrast: Double,
        val hue: Int,
        val saturation: Double,
        val lightness: Double,
        val rbg: List<Int>
    )
    @Serializable
    data class Metal(
        val brightness: Int,
        val contrast: Double,
        val hue: Int,
        val saturation: Double,
        val lightness: Double,
        val rbg: List<Int>
    )
    @Serializable
    data class Fur(
        val brightness: Int,
        val contrast: Double,
        val hue: Int,
        val saturation: Double,
        val lightness: Double,
        val rbg: List<Int>
    )

}