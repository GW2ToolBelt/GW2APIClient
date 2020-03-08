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

fun GW2APIClient.gw2v2CurrenciesIds(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/currencies",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = Int.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2CurrenciesById(id: Int, configure: (RequestBuilder<GW2v2Currencies>.() -> Unit)? = null): RequestBuilder<GW2v2Currencies> = request(
    path = "/currencies",
    parameters = mapOf("id" to id.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Currencies.serializer(),
    configure = configure
)

fun GW2APIClient.gw2v2CurrenciesByIds(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2Currencies>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Currencies>> = request(
    path = "/currencies",
    parameters = mapOf("ids" to ids.joinToString(",")),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Currencies.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2CurrenciesAll(configure: (RequestBuilder<List<GW2v2Currencies>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Currencies>> = request(
    path = "/currencies",
    parameters = mapOf("ids" to "all"),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Currencies.serializer().list,
    configure = configure
)

fun GW2APIClient.gw2v2CurrenciesByPage(page: Int, pageSize: Int, configure: (RequestBuilder<List<GW2v2Currencies>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Currencies>> = request(
    path = "/currencies",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString()),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Currencies.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2Currencies(
    val id: Int,
    val name: String,
    val description: String,
    val icon: String,
    val order: Int
)