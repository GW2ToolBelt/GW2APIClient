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

fun GW2APIClient.gw2v2TokenInfo(configure: (RequestBuilder<GW2v2TokenInfo>.() -> Unit)? = null): RequestBuilder<GW2v2TokenInfo> = request(
    path = "/tokeninfo",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2TokenInfo.serializer(),
    configure = configure
)

@Serializable
data class GW2v2TokenInfo(
    val id: String,
    val name: String,
    val permissions: List<String>
)