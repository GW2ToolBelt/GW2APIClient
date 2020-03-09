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

fun GW2APIClient.gw2v2CommerceListingsIds(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/commerce/listings",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = Int.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2CommerceListingsById(id: Int, configure: (RequestBuilder<GW2v2CommerceListings>.() -> Unit)? = null): RequestBuilder<GW2v2CommerceListings> = request(
    path = "/commerce/listings",
    parameters = mapOf("id" to id.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2CommerceListings.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2CommerceListingsByIds(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2CommerceListings>>.() -> Unit)? = null): RequestBuilder<List<GW2v2CommerceListings>> = request(
    path = "/commerce/listings",
    parameters = mapOf("ids" to ids.joinToString(",")),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2CommerceListings.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2CommerceListingsByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2CommerceListings>>.() -> Unit)? = null): RequestBuilder<List<GW2v2CommerceListings>> = request(
    path = "/commerce/listings",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2CommerceListings.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2CommerceListings(
    val id: Int,
    val buys: List<Buys>,
    val sells: List<Sells>
) {

    @Serializable
    data class Buys(
        val listings: Int,
        @SerialName("unit_price")
        val unitPrice: Int,
        val quantity: Int
    )

    @Serializable
    data class Sells(
        val listings: Int,
        @SerialName("unit_price")
        val unitPrice: Int,
        val quantity: Int
    )

}