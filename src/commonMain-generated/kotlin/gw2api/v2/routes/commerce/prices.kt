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

fun GW2APIClient.gw2v2CommercePricesIds(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/commerce/prices",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = Int.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2CommercePricesById(id: Int, configure: (RequestBuilder<GW2v2CommercePrices>.() -> Unit)? = null): RequestBuilder<GW2v2CommercePrices> = request(
    path = "/commerce/prices",
    parameters = mapOf("id" to id.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2CommercePrices.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2CommercePricesByIds(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2CommercePrices>>.() -> Unit)? = null): RequestBuilder<List<GW2v2CommercePrices>> = request(
    path = "/commerce/prices",
    parameters = mapOf("ids" to ids.joinToString(",")),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2CommercePrices.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2CommercePricesByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2CommercePrices>>.() -> Unit)? = null): RequestBuilder<List<GW2v2CommercePrices>> = request(
    path = "/commerce/prices",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2CommercePrices.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2CommercePrices(
    val id: Int,
    val whitelisted: Boolean,
    val buys: Buys,
    val sells: Sells
) {

    @Serializable
    data class Buys(
        @SerialName("unit_price")
        val unitPrice: Int,
        val quantity: Int
    )

    @Serializable
    data class Sells(
        @SerialName("unit_price")
        val unitPrice: Int,
        val quantity: Int
    )

}