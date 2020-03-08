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

fun GW2APIClient.gw2v2AccountWallet(configure: (RequestBuilder<List<GW2v2AccountWallet>>.() -> Unit)? = null): RequestBuilder<List<GW2v2AccountWallet>> = request(
    path = "/account/wallet",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2AccountWallet.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2AccountWallet(
    val id: Int,
    val value: Int
)