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

fun GW2APIClient.gw2v2AccountMasteryPoints(configure: (RequestBuilder<GW2v2AccountMasteryPoints>.() -> Unit)? = null): RequestBuilder<GW2v2AccountMasteryPoints> = request(
    path = "/account/mastery/points",
    parameters = emptyMap(),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2AccountMasteryPoints.serializer(),
    configure = configure
)

@Serializable
data class GW2v2AccountMasteryPoints(
    val totals: List<Totals>,
    val unlocked: List<Int>
) {

    @Serializable
    data class Totals(
        val region: String,
        val spent: Int,
        val earned: Int
    )

}