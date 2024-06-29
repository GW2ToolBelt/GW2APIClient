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

// Generated for type: AchievementCategory

/**
 * Information about an achievement category.
 *
 * @param id the achievement category's ID
 * @param icon the URL for the achievement category's icon
 * @param name the achievement category's localized name
 * @param description the achievement category's localized description
 * @param order a number that can be used to sort the list of categories
 * @param achievements an array containing information about the achievements that this category contains
 * @param tomorrow an array containing information about the achievements that this category will contain the next day
 */
@Serializable
public data class GW2v2AchievementCategory(
    /** This field holds the achievement category's ID. */
    val id: GW2AchievementCategoryId,
    /** This field holds the URL for the achievement category's icon. */
    val icon: String,
    /** This field holds the achievement category's localized name. */
    val name: String,
    /** This field holds the achievement category's localized description. */
    val description: String,
    /** This field holds a number that can be used to sort the list of categories. */
    val order: Int,
    /** This field holds an array containing information about the achievements that this category contains. */
    val achievements: List<Entry>,
    /** This field holds an array containing information about the achievements that this category will contain the next day. */
    val tomorrow: List<Entry>? = null
) {

    /**
     * An achievement entry of a category.
     *
     * @param id the achievement's ID
     * @param flags additional informational flags
     * @param requiredAccess the access constraints for the achievement
     * @param level the level constraints for the achievement
     */
    @Serializable
    public data class Entry(
        /** This field holds the achievement's ID. */
        val id: GW2AchievementId,
        /** This field holds additional informational flags. */
        val flags: List<String>? = null,
        /** This field holds the access constraints for the achievement. */
        @SerialName("required_access")
        val requiredAccess: AccessConstraint? = null,
        /** This field holds the level constraints for the achievement. */
        val level: LevelConstraint? = null
    ) {

        /**
         * Information about the product requirements for an achievement.
         *
         * @param product the product
         * @param condition the type of the condition
         */
        @Serializable
        public data class AccessConstraint(
            /** This field holds the product. */
            val product: String,
            /** This field holds the type of the condition. */
            val condition: ConditionType
        ) {

            @Suppress("ClassName")
            private object __ConditionTypeSerializer : KSerializer<ConditionType> {

                override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("ConditionType", PrimitiveKind.STRING)

                override fun deserialize(decoder: Decoder): ConditionType = when (val value = decoder.decodeString()) {
                    "HasAccess" -> ConditionType.HasAccess
                    "NoAccess" -> ConditionType.NoAccess
                    else -> ConditionType.Unknown(value)
                }

                override fun serialize(encoder: Encoder, value: ConditionType) {
                    encoder.encodeString(value.value)
                }

            }


            /** Information about a condition for an access constraint. */
            @Serializable(with = __ConditionTypeSerializer::class)
            public sealed class ConditionType {

                public abstract val value: String

                /** An unknown value. */
                public data class Unknown(override val value: String) : ConditionType()

                /** the account has access */
                @Serializable
                public data object HasAccess : ConditionType() {
                    override val value: String get() = "HasAccess"
                }

                /** the account does not have access */
                @Serializable
                public data object NoAccess : ConditionType() {
                    override val value: String get() = "NoAccess"
                }

            }

        }

        @Suppress("ClassName")
        @Serializer(forClass = LevelConstraint::class)
        private object __LevelConstraintGeneratedSerializer : KSerializer<LevelConstraint?>

        @Suppress("ClassName")
        private object __LevelConstraintSerializer : JsonTupleSerializer<LevelConstraint?>(__LevelConstraintGeneratedSerializer)

        /** Information about the level requirements for an achievement. */
        @Serializable(with = __LevelConstraintSerializer::class)
        public data class LevelConstraint(
            /** This field holds the minimum level for the achievement. */
            public val minimum: Int,
            /** This field holds the maximum level for the achievement. */
            public val maximum: Int
        )

    }

}