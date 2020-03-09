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

fun GW2APIClient.gw2v2AccountMaterials(configure: (RequestBuilder<List<GW2v2AccountMaterials>>.() -> Unit)? = null): RequestBuilder<List<GW2v2AccountMaterials>> = request(
    path = "/account/materials",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2AccountMaterials.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2AccountMaterials(
    val id: Int,
    val category: Int,
    val count: Int,
    val binding: String
)