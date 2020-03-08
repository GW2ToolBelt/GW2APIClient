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

fun GW2APIClient.gw2v2Account(configure: (RequestBuilder<GW2v2Account>.() -> Unit)? = null): RequestBuilder<GW2v2Account> = request(
    path = "/account",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Account.serializer(),
    configure = configure
)

@Serializable
data class GW2v2Account(
    val id: String,
    val age: Int,
    val name: String,
    val world: Int,
    val guilds: List<String>,
    @SerialName("guild_leader")
    val guildLeader: List<String>,
    val created: String,
    val access: List<String>,
    val commander: Boolean,
    @SerialName("fractal_level")
    val fractalLevel: Int,
    @SerialName("daily_ap")
    val dailyAP: Int,
    @SerialName("monthly_ap")
    val monthAP: Int,
    @SerialName("wvw_rank")
    val wvwRank: Int
)