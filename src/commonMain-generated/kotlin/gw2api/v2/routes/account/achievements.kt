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

fun GW2APIClient.gw2v2AccountAchievements(configure: (RequestBuilder<List<GW2v2AccountAchievements>>.() -> Unit)? = null): RequestBuilder<List<GW2v2AccountAchievements>> = request(
    path = "/account/achievements",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2AccountAchievements.serializer().list,
    configure = configure
)

@Serializable
data class GW2v2AccountAchievements(
    val id: Int,
    val done: Boolean,
    val bits: List<Int>,
    val current: Int,
    val max: Int,
    val repeated: Int,
    val unlocked: Boolean
)