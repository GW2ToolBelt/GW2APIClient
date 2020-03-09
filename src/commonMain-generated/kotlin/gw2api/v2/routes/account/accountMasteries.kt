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

fun GW2APIClient.gw2v2AccountMasteries(configure: (RequestBuilder<List<GW2v2AccountMasteries>>.() -> Unit)? = null): RequestBuilder<List<GW2v2AccountMasteries>> = request(
    path = "/account/masteries",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2AccountMasteries.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2AccountMasteries(
    val id: Int,
    val level: Int
)