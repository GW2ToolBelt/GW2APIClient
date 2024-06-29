/*
 * Copyright (c) 2018-2024 Leon Linhart
 * MACHINE GENERATED FILE, DO NOT EDIT
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package com.gw2tb.gw2api.types.v2

import com.gw2tb.gw2api.types.*
import com.gw2tb.gw2api.types.internal.*

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

// Generated for type: GuildLogEntry

@Suppress("ClassName")
private object __JsonParametricSerializer_GW2v2GuildLogEntry : JsonContentPolymorphicSerializer<GW2v2GuildLogEntry>(GW2v2GuildLogEntry::class) {
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<GW2v2GuildLogEntry> {
        return when (val type = element.jsonObject["type"]?.jsonPrimitive?.content) {
            "joined" -> GW2v2GuildLogEntry.Joined.serializer()
            "invited" -> GW2v2GuildLogEntry.Invited.serializer()
            "kick" -> GW2v2GuildLogEntry.Kick.serializer()
            "rank_change" -> GW2v2GuildLogEntry.RankChange.serializer()
            "treasury" -> GW2v2GuildLogEntry.Treasury.serializer()
            "stash" -> GW2v2GuildLogEntry.Stash.serializer()
            "motd" -> GW2v2GuildLogEntry.Motd.serializer()
            "upgrade" -> GW2v2GuildLogEntry.Upgrade.serializer()
            null -> throw SerializationException("Disambiguator property not found")
            else -> throw SerializationException("Invalid disambiguator value for GW2v2GuildLogEntry: $type")
        }
    }
}

/** Information about a logged guild event. */
@Serializable(with = __JsonParametricSerializer_GW2v2GuildLogEntry::class)
public sealed class GW2v2GuildLogEntry {

    /** This field holds the log entry's ID. */
    public abstract val id: Int

    /** This field holds ISO-8601 timestamp for when the log entry was created. */
    public abstract val time: String

    /** This field holds the account name of the guild member who generated this log entry. */
    public abstract val user: String?

    /** This field holds the type of log entry. */
    public abstract val type: String

    @Suppress("ClassName")
    @Serializer(forClass = Joined::class)
    private object __JoinedGeneratedSerializer : KSerializer<Joined>

    @Suppress("ClassName")
    private object __JoinedSerializer0 : JsonTransformingSerializer<Joined>(__JoinedGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * A log entry indicating that the user joined the guild.
     *
     * @param id the log entry's ID
     * @param time ISO-8601 timestamp for when the log entry was created
     * @param user the account name of the guild member who generated this log entry
     * @param type the type of log entry
     */
    @Serializable(with = __JoinedSerializer0::class)
    public data class Joined(
        override val id: Int,
        override val time: String,
        override val user: String? = null,
        override val type: String
    ) : GW2v2GuildLogEntry()

    @Suppress("ClassName")
    @Serializer(forClass = Invited::class)
    private object __InvitedGeneratedSerializer : KSerializer<Invited>

    @Suppress("ClassName")
    private object __InvitedSerializer0 : JsonTransformingSerializer<Invited>(__InvitedGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * A log entry indicating that the user has been invited to the guild.
     *
     * @param id the log entry's ID
     * @param time ISO-8601 timestamp for when the log entry was created
     * @param user the account name of the guild member who generated this log entry
     * @param type the type of log entry
     * @param invitedBy the account name of the guild member who invited the user
     */
    @Serializable(with = __InvitedSerializer0::class)
    public data class Invited(
        override val id: Int,
        override val time: String,
        override val user: String? = null,
        override val type: String,
        /** This field holds the account name of the guild member who invited the user. */
        @SerialName("invited_by")
        val invitedBy: String
    ) : GW2v2GuildLogEntry()

    @Suppress("ClassName")
    @Serializer(forClass = Kick::class)
    private object __KickGeneratedSerializer : KSerializer<Kick>

    @Suppress("ClassName")
    private object __KickSerializer0 : JsonTransformingSerializer<Kick>(__KickGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * A log entry indicating that the user has been kicked from the guild.
     *
     * @param id the log entry's ID
     * @param time ISO-8601 timestamp for when the log entry was created
     * @param user the account name of the guild member who generated this log entry
     * @param type the type of log entry
     * @param kickedBy the account name of the guild member who kicked the user
     */
    @Serializable(with = __KickSerializer0::class)
    public data class Kick(
        override val id: Int,
        override val time: String,
        override val user: String? = null,
        override val type: String,
        /** This field holds the account name of the guild member who kicked the user. */
        @SerialName("kicked_by")
        val kickedBy: String
    ) : GW2v2GuildLogEntry()

    @Suppress("ClassName")
    @Serializer(forClass = RankChange::class)
    private object __RankChangeGeneratedSerializer : KSerializer<RankChange>

    @Suppress("ClassName")
    private object __RankChangeSerializer0 : JsonTransformingSerializer<RankChange>(__RankChangeGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * A log entry indicating that the rank for the user changed.
     *
     * @param id the log entry's ID
     * @param time ISO-8601 timestamp for when the log entry was created
     * @param user the account name of the guild member who generated this log entry
     * @param type the type of log entry
     * @param changedBy the account name of the guild member who changed the rank of the user
     * @param oldRank the name of the old rank
     * @param newRank the name of the new rank
     */
    @Serializable(with = __RankChangeSerializer0::class)
    public data class RankChange(
        override val id: Int,
        override val time: String,
        override val user: String? = null,
        override val type: String,
        /** This field holds the account name of the guild member who changed the rank of the user. */
        @SerialName("changed_by")
        val changedBy: String,
        /** This field holds the name of the old rank. */
        @SerialName("old_rank")
        val oldRank: String,
        /** This field holds the name of the new rank. */
        @SerialName("new_rank")
        val newRank: String
    ) : GW2v2GuildLogEntry()

    @Suppress("ClassName")
    @Serializer(forClass = Treasury::class)
    private object __TreasuryGeneratedSerializer : KSerializer<Treasury>

    @Suppress("ClassName")
    private object __TreasurySerializer0 : JsonTransformingSerializer<Treasury>(__TreasuryGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * A log entry indicating that the user has deposited an item into the guild's treasury.
     *
     * @param id the log entry's ID
     * @param time ISO-8601 timestamp for when the log entry was created
     * @param user the account name of the guild member who generated this log entry
     * @param type the type of log entry
     * @param itemId the item's ID
     * @param count how many of the item was deposited
     */
    @Serializable(with = __TreasurySerializer0::class)
    public data class Treasury(
        override val id: Int,
        override val time: String,
        override val user: String? = null,
        override val type: String,
        /** This field holds the item's ID. */
        @SerialName("item_id")
        val itemId: Int,
        /** This field holds how many of the item was deposited. */
        val count: Int
    ) : GW2v2GuildLogEntry()

    @Suppress("ClassName")
    @Serializer(forClass = Stash::class)
    private object __StashGeneratedSerializer : KSerializer<Stash>

    @Suppress("ClassName")
    private object __StashSerializer0 : JsonTransformingSerializer<Stash>(__StashGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * A log entry indicating that the user has deposited/withdrawn an item into the guild stash.
     *
     * @param id the log entry's ID
     * @param time ISO-8601 timestamp for when the log entry was created
     * @param user the account name of the guild member who generated this log entry
     * @param type the type of log entry
     * @param operation the action (may be "deposit", "withdraw" or "move"
     * @param itemId the item's ID
     * @param count how many of the item was deposited
     * @param coins the amount of deposited coins
     */
    @Serializable(with = __StashSerializer0::class)
    public data class Stash(
        override val id: Int,
        override val time: String,
        override val user: String? = null,
        override val type: String,
        /** This field holds the action (may be "deposit", "withdraw" or "move". */
        val operation: String,
        /** This field holds the item's ID. */
        @SerialName("item_id")
        val itemId: Int,
        /** This field holds how many of the item was deposited. */
        val count: Int,
        /** This field holds the amount of deposited coins. */
        val coins: Int
    ) : GW2v2GuildLogEntry()

    @Suppress("ClassName")
    @Serializer(forClass = Motd::class)
    private object __MotdGeneratedSerializer : KSerializer<Motd>

    @Suppress("ClassName")
    private object __MotdSerializer0 : JsonTransformingSerializer<Motd>(__MotdGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * A log entry indicating that the user has changed the guild's MOTD.
     *
     * @param id the log entry's ID
     * @param time ISO-8601 timestamp for when the log entry was created
     * @param user the account name of the guild member who generated this log entry
     * @param type the type of log entry
     * @param motd the new message of the day
     */
    @Serializable(with = __MotdSerializer0::class)
    public data class Motd(
        override val id: Int,
        override val time: String,
        override val user: String? = null,
        override val type: String,
        /** This field holds the new message of the day. */
        val motd: String
    ) : GW2v2GuildLogEntry()

    @Suppress("ClassName")
    @Serializer(forClass = Upgrade::class)
    private object __UpgradeGeneratedSerializer : KSerializer<Upgrade>

    @Suppress("ClassName")
    private object __UpgradeSerializer0 : JsonTransformingSerializer<Upgrade>(__UpgradeGeneratedSerializer) {
        override fun transformDeserialize(element: JsonElement): JsonElement =
            JsonObject(element.jsonObject - "__virtualType")
    }

    /**
     * A log entry indicating that the user has interacted with a guild upgrade.
     *
     * @param id the log entry's ID
     * @param time ISO-8601 timestamp for when the log entry was created
     * @param user the account name of the guild member who generated this log entry
     * @param type the type of log entry
     * @param action the action (may be "queued", "cancelled", "completed" or "sped_up"
     * @param count how many upgrade were added
     * @param upgradeId the ID of the completed upgrade
     * @param recipeId the recipe that generated the upgrade
     */
    @Serializable(with = __UpgradeSerializer0::class)
    public data class Upgrade(
        override val id: Int,
        override val time: String,
        override val user: String? = null,
        override val type: String,
        /** This field holds the action (may be "queued", "cancelled", "completed" or "sped_up". */
        val action: String,
        /** This field holds how many upgrade were added. */
        val count: Int? = null,
        /** This field holds the ID of the completed upgrade. */
        @SerialName("upgrade_id")
        val upgradeId: Int,
        /** This field holds the recipe that generated the upgrade. */
        @SerialName("recipe_id")
        val recipeId: Int? = null
    ) : GW2v2GuildLogEntry()

}