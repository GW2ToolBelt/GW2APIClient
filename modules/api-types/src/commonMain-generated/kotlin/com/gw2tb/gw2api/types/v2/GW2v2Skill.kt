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

// Generated for type: Skill

/**
 * Information about a skill.
 *
 * @param id the skill's ID
 * @param name the skill's localized name
 * @param description the skill's localized description
 * @param icon a render service URL for the skill's icon
 * @param chatLink the skill's chat code
 * @param flags additional skill flags
 * @param type the type of skill
 * @param weaponType the type of weapon that the skill is on. (May be "None".)
 * @param professions the IDs of the professions that can use the skill
 * @param specialization the ID of the specialization required for the skill
 * @param slot the slot that the skill fits into
 * @param facts an array of facts describing the skill's effect
 * @param traitedFacts Information about a trait's fact (i.e. effect/property) that is only active if a specific trait is active.
 * @param categories the categories that the skill falls under
 * @param attunement the attunement required for the skill
 * @param cost the cost associated with the skill
 * @param dualWield the type of off-hand weapon that must be equipped for this dual-wield skill to appear
 * @param flipSkill the ID of the skill that the skill flips over into
 * @param initiative the skill's initiative cost
 * @param nextChain the ID of the next skill in the chain
 * @param prevChain the ID of the previous skill in the chain
 * @param transformSkills the IDs of the skills that will replace the player's skills when using the skill
 * @param bundleSkills the IDs of the skills that will replace the player's skills when using the skill
 * @param toolbeltSkill the ID of the associated toolbelt skill
 */
@Serializable
public data class GW2v2Skill(
    /** This field holds the skill's ID. */
    val id: Int,
    /** This field holds the skill's localized name. */
    val name: String,
    /** This field holds the skill's localized description. */
    val description: String,
    /** This field holds a render service URL for the skill's icon. */
    val icon: String,
    /** This field holds the skill's chat code. */
    @SerialName("chat_link")
    val chatLink: String,
    /** This field holds additional skill flags. */
    val flags: List<String>? = null,
    /** This field holds the type of skill. */
    val type: String? = null,
    /** This field holds the type of weapon that the skill is on. (May be "None".). */
    @SerialName("weapon_type")
    val weaponType: String? = null,
    /** This field holds the IDs of the professions that can use the skill. */
    val professions: List<String>? = null,
    /** This field holds the ID of the specialization required for the skill. */
    val specialization: Int? = null,
    /** This field holds the slot that the skill fits into. */
    val slot: String? = null,
    /** This field holds an array of facts describing the skill's effect. */
    val facts: List<Fact>? = null,
    /** This field holds Information about a trait's fact (i.e. effect/property) that is only active if a specific trait is active.. */
    @SerialName("traited_facts")
    val traitedFacts: List<TraitedFact>? = null,
    /** This field holds the categories that the skill falls under. */
    val categories: List<String>? = null,
    /** This field holds the attunement required for the skill. */
    val attunement: String? = null,
    /** This field holds the cost associated with the skill. */
    val cost: Int? = null,
    /** This field holds the type of off-hand weapon that must be equipped for this dual-wield skill to appear. */
    @SerialName("dual_wield")
    val dualWield: String? = null,
    /** This field holds the ID of the skill that the skill flips over into. */
    @SerialName("flip_skill")
    val flipSkill: Int? = null,
    /** This field holds the skill's initiative cost. */
    val initiative: Int? = null,
    /** This field holds the ID of the next skill in the chain. */
    @SerialName("next_chain")
    val nextChain: Int? = null,
    /** This field holds the ID of the previous skill in the chain. */
    @SerialName("prev_chain")
    val prevChain: Int? = null,
    /** This field holds the IDs of the skills that will replace the player's skills when using the skill. */
    @SerialName("transform_skills")
    val transformSkills: List<Int>? = null,
    /** This field holds the IDs of the skills that will replace the player's skills when using the skill. */
    @SerialName("bundle_skills")
    val bundleSkills: List<Int>? = null,
    /** This field holds the ID of the associated toolbelt skill. */
    @SerialName("toolbelt_skill")
    val toolbeltSkill: Int? = null
) {

    @Suppress("ClassName")
    private object __JsonParametricSerializer_Fact : JsonContentPolymorphicSerializer<Fact>(Fact::class) {
        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<Fact> {
            return when (val type = element.jsonObject["type"]?.jsonPrimitive?.content) {
                "AttributeAdjust" -> Fact.AttributeAdjust.serializer()
                "Buff" -> Fact.Buff.serializer()
                "BuffConversion" -> Fact.BuffConversion.serializer()
                "ComboField" -> Fact.ComboField.serializer()
                "ComboFinisher" -> Fact.ComboFinisher.serializer()
                "Damage" -> Fact.Damage.serializer()
                "Distance" -> Fact.Distance.serializer()
                "NoData" -> Fact.NoData.serializer()
                "Number" -> Fact.Number.serializer()
                "Percent" -> Fact.Percent.serializer()
                "PrefixedBuff" -> Fact.PrefixedBuff.serializer()
                "Radius" -> Fact.Radius.serializer()
                "Range" -> Fact.Range.serializer()
                "Recharge" -> Fact.Recharge.serializer()
                "StunBreak" -> Fact.StunBreak.serializer()
                "Time" -> Fact.Time.serializer()
                "Unblockable" -> Fact.Unblockable.serializer()
                null -> throw SerializationException("Disambiguator property not found")
                else -> throw SerializationException("Invalid disambiguator value for Fact: $type")
            }
        }
    }

    /** Information about a trait's fact (i.e. effect/property). */
    @Serializable(with = __JsonParametricSerializer_Fact::class)
    public sealed class Fact {

        /** This field holds the type of the fact. */
        public abstract val type: String

        /** This field holds the URL for the fact's icon. */
        public abstract val icon: String?

        /** This field holds an arbitrary localized string describing the fact. */
        public abstract val text: String?

        @Suppress("ClassName")
        @Serializer(forClass = AttributeAdjust::class)
        private object __AttributeAdjustGeneratedSerializer : KSerializer<AttributeAdjust>

        @Suppress("ClassName")
        private object __AttributeAdjustSerializer0 : JsonTransformingSerializer<AttributeAdjust>(__AttributeAdjustGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about an attribute adjustment.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param value the amount 'target' gets adjusted, based on a level 80 character at base stats
         * @param target the attribute this fact adjusts
         */
        @Serializable(with = __AttributeAdjustSerializer0::class)
        public data class AttributeAdjust(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds the amount 'target' gets adjusted, based on a level 80 character at base stats. */
            val value: Int? = null,
            /** This field holds the attribute this fact adjusts. */
            val target: String? = null
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Buff::class)
        private object __BuffGeneratedSerializer : KSerializer<Buff>

        @Suppress("ClassName")
        private object __BuffSerializer0 : JsonTransformingSerializer<Buff>(__BuffGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a buff.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param status the boon, condition, or effect referred to by the fact
         * @param duration the duration of the effect in seconds
         * @param description the description of the status effect
         * @param applyCount the number of stacks applied
         */
        @Serializable(with = __BuffSerializer0::class)
        public data class Buff(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds the boon, condition, or effect referred to by the fact. */
            val status: String,
            /** This field holds the duration of the effect in seconds. */
            val duration: Int? = null,
            /** This field holds the description of the status effect. */
            val description: String? = null,
            /** This field holds the number of stacks applied. */
            @SerialName("apply_count")
            val applyCount: Int? = null
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = BuffConversion::class)
        private object __BuffConversionGeneratedSerializer : KSerializer<BuffConversion>

        @Suppress("ClassName")
        private object __BuffConversionSerializer0 : JsonTransformingSerializer<BuffConversion>(__BuffConversionGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a buff-conversion.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param source the attribute that is used to calculate the attribute gain
         * @param percent how much of the source attribute is added to target
         * @param target the attribute that gets added to
         */
        @Serializable(with = __BuffConversionSerializer0::class)
        public data class BuffConversion(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds the attribute that is used to calculate the attribute gain. */
            val source: String,
            /** This field holds how much of the source attribute is added to target. */
            val percent: Int,
            /** This field holds the attribute that gets added to. */
            val target: String
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = ComboField::class)
        private object __ComboFieldGeneratedSerializer : KSerializer<ComboField>

        @Suppress("ClassName")
        private object __ComboFieldSerializer0 : JsonTransformingSerializer<ComboField>(__ComboFieldGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a combo-field.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param fieldType the type of the field
         */
        @Serializable(with = __ComboFieldSerializer0::class)
        public data class ComboField(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds the type of the field. */
            @SerialName("field_type")
            val fieldType: String
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = ComboFinisher::class)
        private object __ComboFinisherGeneratedSerializer : KSerializer<ComboFinisher>

        @Suppress("ClassName")
        private object __ComboFinisherSerializer0 : JsonTransformingSerializer<ComboFinisher>(__ComboFinisherGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a combo-finisher.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param finisherType the type of finisher
         * @param percent the percent chance that the finisher will trigger
         */
        @Serializable(with = __ComboFinisherSerializer0::class)
        public data class ComboFinisher(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds the type of finisher. */
            @SerialName("finisher_type")
            val finisherType: String,
            /** This field holds the percent chance that the finisher will trigger. */
            val percent: Int
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Damage::class)
        private object __DamageGeneratedSerializer : KSerializer<Damage>

        @Suppress("ClassName")
        private object __DamageSerializer0 : JsonTransformingSerializer<Damage>(__DamageGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about damage.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param hitCount the amount of times the damage hits
         * @param damageMultiplier the damage multiplier
         */
        @Serializable(with = __DamageSerializer0::class)
        public data class Damage(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds the amount of times the damage hits. */
            @SerialName("hit_count")
            val hitCount: Int,
            /** This field holds the damage multiplier. */
            @SerialName("dmg_multiplier")
            val damageMultiplier: Double
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Distance::class)
        private object __DistanceGeneratedSerializer : KSerializer<Distance>

        @Suppress("ClassName")
        private object __DistanceSerializer0 : JsonTransformingSerializer<Distance>(__DistanceGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about range.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param distance the distance value
         */
        @Serializable(with = __DistanceSerializer0::class)
        public data class Distance(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds the distance value. */
            val distance: Int
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = NoData::class)
        private object __NoDataGeneratedSerializer : KSerializer<NoData>

        @Suppress("ClassName")
        private object __NoDataSerializer0 : JsonTransformingSerializer<NoData>(__NoDataGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * No (special) additional information.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         */
        @Serializable(with = __NoDataSerializer0::class)
        public data class NoData(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Number::class)
        private object __NumberGeneratedSerializer : KSerializer<Number>

        @Suppress("ClassName")
        private object __NumberSerializer0 : JsonTransformingSerializer<Number>(__NumberGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * An additional number.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param value the number value as referenced by text
         */
        @Serializable(with = __NumberSerializer0::class)
        public data class Number(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds the number value as referenced by text. */
            val value: Int
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Percent::class)
        private object __PercentGeneratedSerializer : KSerializer<Percent>

        @Suppress("ClassName")
        private object __PercentSerializer0 : JsonTransformingSerializer<Percent>(__PercentGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * An additional percentage value.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param percent the percentage value as referenced by text
         */
        @Serializable(with = __PercentSerializer0::class)
        public data class Percent(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds the percentage value as referenced by text. */
            val percent: Double
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = PrefixedBuff::class)
        private object __PrefixedBuffGeneratedSerializer : KSerializer<PrefixedBuff>

        @Suppress("ClassName")
        private object __PrefixedBuffSerializer0 : JsonTransformingSerializer<PrefixedBuff>(__PrefixedBuffGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a prefixed buff.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param status the boon, condition, or effect referred to by the fact
         * @param duration the duration of the effect in seconds
         * @param description the description of the status effect
         * @param applyCount the number of stacks applied
         * @param prefix A buff's prefix icon and description.
         */
        @Serializable(with = __PrefixedBuffSerializer0::class)
        public data class PrefixedBuff(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds the boon, condition, or effect referred to by the fact. */
            val status: String? = null,
            /** This field holds the duration of the effect in seconds. */
            val duration: Int? = null,
            /** This field holds the description of the status effect. */
            val description: String? = null,
            /** This field holds the number of stacks applied. */
            @SerialName("apply_count")
            val applyCount: Int? = null,
            /** This field holds A buff's prefix icon and description.. */
            val prefix: Prefix
        ) : Fact() {

            /**
             * Information about a buff's prefix.
             *
             * @param text the prefix text
             * @param icon the prefix icon url
             * @param status the prefix status
             * @param description the prefix description
             */
            @Serializable
            public data class Prefix(
                /** This field holds the prefix text. */
                val text: String,
                /** This field holds the prefix icon url. */
                val icon: String,
                /** This field holds the prefix status. */
                val status: String? = null,
                /** This field holds the prefix description. */
                val description: String? = null
            )

        }

        @Suppress("ClassName")
        @Serializer(forClass = Radius::class)
        private object __RadiusGeneratedSerializer : KSerializer<Radius>

        @Suppress("ClassName")
        private object __RadiusSerializer0 : JsonTransformingSerializer<Radius>(__RadiusGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a radius.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param distance the radius value
         */
        @Serializable(with = __RadiusSerializer0::class)
        public data class Radius(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds the radius value. */
            val distance: Int
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Range::class)
        private object __RangeGeneratedSerializer : KSerializer<Range>

        @Suppress("ClassName")
        private object __RangeSerializer0 : JsonTransformingSerializer<Range>(__RangeGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about range.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param value the range of the trait/skill
         */
        @Serializable(with = __RangeSerializer0::class)
        public data class Range(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds the range of the trait/skill. */
            val value: Int
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Recharge::class)
        private object __RechargeGeneratedSerializer : KSerializer<Recharge>

        @Suppress("ClassName")
        private object __RechargeSerializer0 : JsonTransformingSerializer<Recharge>(__RechargeGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about recharge.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param value the recharge time in seconds
         */
        @Serializable(with = __RechargeSerializer0::class)
        public data class Recharge(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds the recharge time in seconds. */
            val value: Double
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = StunBreak::class)
        private object __StunBreakGeneratedSerializer : KSerializer<StunBreak>

        @Suppress("ClassName")
        private object __StunBreakSerializer0 : JsonTransformingSerializer<StunBreak>(__StunBreakGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a stunbreak.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param value always true
         */
        @Serializable(with = __StunBreakSerializer0::class)
        public data class StunBreak(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds always true. */
            val value: Boolean
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Time::class)
        private object __TimeGeneratedSerializer : KSerializer<Time>

        @Suppress("ClassName")
        private object __TimeSerializer0 : JsonTransformingSerializer<Time>(__TimeGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about time.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param duration the time value in seconds
         */
        @Serializable(with = __TimeSerializer0::class)
        public data class Time(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds the time value in seconds. */
            val duration: Int
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Unblockable::class)
        private object __UnblockableGeneratedSerializer : KSerializer<Unblockable>

        @Suppress("ClassName")
        private object __UnblockableSerializer0 : JsonTransformingSerializer<Unblockable>(__UnblockableGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * A fact, indicating that a trait/skill is unblockable.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param value always true
         */
        @Serializable(with = __UnblockableSerializer0::class)
        public data class Unblockable(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            /** This field holds always true. */
            val value: Boolean
        ) : Fact()

    }

    @Suppress("ClassName")
    private object __JsonParametricSerializer_TraitedFact : JsonContentPolymorphicSerializer<TraitedFact>(TraitedFact::class) {
        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<TraitedFact> {
            return when (val type = element.jsonObject["type"]?.jsonPrimitive?.content) {
                "AttributeAdjust" -> TraitedFact.AttributeAdjust.serializer()
                "Buff" -> TraitedFact.Buff.serializer()
                "BuffConversion" -> TraitedFact.BuffConversion.serializer()
                "ComboField" -> TraitedFact.ComboField.serializer()
                "ComboFinisher" -> TraitedFact.ComboFinisher.serializer()
                "Damage" -> TraitedFact.Damage.serializer()
                "Distance" -> TraitedFact.Distance.serializer()
                "NoData" -> TraitedFact.NoData.serializer()
                "Number" -> TraitedFact.Number.serializer()
                "Percent" -> TraitedFact.Percent.serializer()
                "PrefixedBuff" -> TraitedFact.PrefixedBuff.serializer()
                "Radius" -> TraitedFact.Radius.serializer()
                "Range" -> TraitedFact.Range.serializer()
                "Recharge" -> TraitedFact.Recharge.serializer()
                "StunBreak" -> TraitedFact.StunBreak.serializer()
                "Time" -> TraitedFact.Time.serializer()
                "Unblockable" -> TraitedFact.Unblockable.serializer()
                null -> throw SerializationException("Disambiguator property not found")
                else -> throw SerializationException("Invalid disambiguator value for TraitedFact: $type")
            }
        }
    }

    /** a list of traited facts */
    @Serializable(with = __JsonParametricSerializer_TraitedFact::class)
    public sealed class TraitedFact {

        /** This field holds the type of the fact. */
        public abstract val type: String

        /** This field holds the URL for the fact's icon. */
        public abstract val icon: String?

        /** This field holds an arbitrary localized string describing the fact. */
        public abstract val text: String?

        /** This field holds specifies which trait has to be selected in order for this fact to take effect. */
        public abstract val requiresTrait: Int

        /** This field holds the array index of the facts object it will override, if the trait specified in requires_trait is selected. */
        public abstract val overrides: Int?

        @Suppress("ClassName")
        @Serializer(forClass = AttributeAdjust::class)
        private object __AttributeAdjustGeneratedSerializer : KSerializer<AttributeAdjust>

        @Suppress("ClassName")
        private object __AttributeAdjustSerializer0 : JsonTransformingSerializer<AttributeAdjust>(__AttributeAdjustGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about an attribute adjustment.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param value the amount 'target' gets adjusted, based on a level 80 character at base stats
         * @param target the attribute this fact adjusts
         */
        @Serializable(with = __AttributeAdjustSerializer0::class)
        public data class AttributeAdjust(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds the amount 'target' gets adjusted, based on a level 80 character at base stats. */
            val value: Int? = null,
            /** This field holds the attribute this fact adjusts. */
            val target: String? = null
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Buff::class)
        private object __BuffGeneratedSerializer : KSerializer<Buff>

        @Suppress("ClassName")
        private object __BuffSerializer0 : JsonTransformingSerializer<Buff>(__BuffGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a buff.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param status the boon, condition, or effect referred to by the fact
         * @param duration the duration of the effect in seconds
         * @param description the description of the status effect
         * @param applyCount the number of stacks applied
         */
        @Serializable(with = __BuffSerializer0::class)
        public data class Buff(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds the boon, condition, or effect referred to by the fact. */
            val status: String,
            /** This field holds the duration of the effect in seconds. */
            val duration: Int? = null,
            /** This field holds the description of the status effect. */
            val description: String? = null,
            /** This field holds the number of stacks applied. */
            @SerialName("apply_count")
            val applyCount: Int? = null
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = BuffConversion::class)
        private object __BuffConversionGeneratedSerializer : KSerializer<BuffConversion>

        @Suppress("ClassName")
        private object __BuffConversionSerializer0 : JsonTransformingSerializer<BuffConversion>(__BuffConversionGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a buff-conversion.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param source the attribute that is used to calculate the attribute gain
         * @param percent how much of the source attribute is added to target
         * @param target the attribute that gets added to
         */
        @Serializable(with = __BuffConversionSerializer0::class)
        public data class BuffConversion(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds the attribute that is used to calculate the attribute gain. */
            val source: String,
            /** This field holds how much of the source attribute is added to target. */
            val percent: Int,
            /** This field holds the attribute that gets added to. */
            val target: String
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = ComboField::class)
        private object __ComboFieldGeneratedSerializer : KSerializer<ComboField>

        @Suppress("ClassName")
        private object __ComboFieldSerializer0 : JsonTransformingSerializer<ComboField>(__ComboFieldGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a combo-field.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param fieldType the type of the field
         */
        @Serializable(with = __ComboFieldSerializer0::class)
        public data class ComboField(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds the type of the field. */
            @SerialName("field_type")
            val fieldType: String
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = ComboFinisher::class)
        private object __ComboFinisherGeneratedSerializer : KSerializer<ComboFinisher>

        @Suppress("ClassName")
        private object __ComboFinisherSerializer0 : JsonTransformingSerializer<ComboFinisher>(__ComboFinisherGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a combo-finisher.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param finisherType the type of finisher
         * @param percent the percent chance that the finisher will trigger
         */
        @Serializable(with = __ComboFinisherSerializer0::class)
        public data class ComboFinisher(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds the type of finisher. */
            @SerialName("finisher_type")
            val finisherType: String,
            /** This field holds the percent chance that the finisher will trigger. */
            val percent: Int
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Damage::class)
        private object __DamageGeneratedSerializer : KSerializer<Damage>

        @Suppress("ClassName")
        private object __DamageSerializer0 : JsonTransformingSerializer<Damage>(__DamageGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about damage.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param hitCount the amount of times the damage hits
         * @param damageMultiplier the damage multiplier
         */
        @Serializable(with = __DamageSerializer0::class)
        public data class Damage(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds the amount of times the damage hits. */
            @SerialName("hit_count")
            val hitCount: Int,
            /** This field holds the damage multiplier. */
            @SerialName("dmg_multiplier")
            val damageMultiplier: Double
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Distance::class)
        private object __DistanceGeneratedSerializer : KSerializer<Distance>

        @Suppress("ClassName")
        private object __DistanceSerializer0 : JsonTransformingSerializer<Distance>(__DistanceGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about range.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param distance the distance value
         */
        @Serializable(with = __DistanceSerializer0::class)
        public data class Distance(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds the distance value. */
            val distance: Int
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = NoData::class)
        private object __NoDataGeneratedSerializer : KSerializer<NoData>

        @Suppress("ClassName")
        private object __NoDataSerializer0 : JsonTransformingSerializer<NoData>(__NoDataGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * No (special) additional information.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         */
        @Serializable(with = __NoDataSerializer0::class)
        public data class NoData(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Number::class)
        private object __NumberGeneratedSerializer : KSerializer<Number>

        @Suppress("ClassName")
        private object __NumberSerializer0 : JsonTransformingSerializer<Number>(__NumberGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * An additional number.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param value the number value as referenced by text
         */
        @Serializable(with = __NumberSerializer0::class)
        public data class Number(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds the number value as referenced by text. */
            val value: Int
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Percent::class)
        private object __PercentGeneratedSerializer : KSerializer<Percent>

        @Suppress("ClassName")
        private object __PercentSerializer0 : JsonTransformingSerializer<Percent>(__PercentGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * An additional percentage value.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param percent the percentage value as referenced by text
         */
        @Serializable(with = __PercentSerializer0::class)
        public data class Percent(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds the percentage value as referenced by text. */
            val percent: Double
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = PrefixedBuff::class)
        private object __PrefixedBuffGeneratedSerializer : KSerializer<PrefixedBuff>

        @Suppress("ClassName")
        private object __PrefixedBuffSerializer0 : JsonTransformingSerializer<PrefixedBuff>(__PrefixedBuffGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a prefixed buff.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param status the boon, condition, or effect referred to by the fact
         * @param duration the duration of the effect in seconds
         * @param description the description of the status effect
         * @param applyCount the number of stacks applied
         * @param prefix A buff's prefix icon and description.
         */
        @Serializable(with = __PrefixedBuffSerializer0::class)
        public data class PrefixedBuff(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds the boon, condition, or effect referred to by the fact. */
            val status: String? = null,
            /** This field holds the duration of the effect in seconds. */
            val duration: Int? = null,
            /** This field holds the description of the status effect. */
            val description: String? = null,
            /** This field holds the number of stacks applied. */
            @SerialName("apply_count")
            val applyCount: Int? = null,
            /** This field holds A buff's prefix icon and description.. */
            val prefix: Prefix
        ) : TraitedFact() {

            /**
             * Information about a buff's prefix.
             *
             * @param text the prefix text
             * @param icon the prefix icon url
             * @param status the prefix status
             * @param description the prefix description
             */
            @Serializable
            public data class Prefix(
                /** This field holds the prefix text. */
                val text: String,
                /** This field holds the prefix icon url. */
                val icon: String,
                /** This field holds the prefix status. */
                val status: String? = null,
                /** This field holds the prefix description. */
                val description: String? = null
            )

        }

        @Suppress("ClassName")
        @Serializer(forClass = Radius::class)
        private object __RadiusGeneratedSerializer : KSerializer<Radius>

        @Suppress("ClassName")
        private object __RadiusSerializer0 : JsonTransformingSerializer<Radius>(__RadiusGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a radius.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param distance the radius value
         */
        @Serializable(with = __RadiusSerializer0::class)
        public data class Radius(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds the radius value. */
            val distance: Int
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Range::class)
        private object __RangeGeneratedSerializer : KSerializer<Range>

        @Suppress("ClassName")
        private object __RangeSerializer0 : JsonTransformingSerializer<Range>(__RangeGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about range.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param value the range of the trait/skill
         */
        @Serializable(with = __RangeSerializer0::class)
        public data class Range(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds the range of the trait/skill. */
            val value: Int
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Recharge::class)
        private object __RechargeGeneratedSerializer : KSerializer<Recharge>

        @Suppress("ClassName")
        private object __RechargeSerializer0 : JsonTransformingSerializer<Recharge>(__RechargeGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about recharge.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param value the recharge time in seconds
         */
        @Serializable(with = __RechargeSerializer0::class)
        public data class Recharge(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds the recharge time in seconds. */
            val value: Double
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = StunBreak::class)
        private object __StunBreakGeneratedSerializer : KSerializer<StunBreak>

        @Suppress("ClassName")
        private object __StunBreakSerializer0 : JsonTransformingSerializer<StunBreak>(__StunBreakGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a stunbreak.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param value always true
         */
        @Serializable(with = __StunBreakSerializer0::class)
        public data class StunBreak(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds always true. */
            val value: Boolean
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Time::class)
        private object __TimeGeneratedSerializer : KSerializer<Time>

        @Suppress("ClassName")
        private object __TimeSerializer0 : JsonTransformingSerializer<Time>(__TimeGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about time.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param duration the time value in seconds
         */
        @Serializable(with = __TimeSerializer0::class)
        public data class Time(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds the time value in seconds. */
            val duration: Int
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Unblockable::class)
        private object __UnblockableGeneratedSerializer : KSerializer<Unblockable>

        @Suppress("ClassName")
        private object __UnblockableSerializer0 : JsonTransformingSerializer<Unblockable>(__UnblockableGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * A fact, indicating that a trait/skill is unblockable.
         *
         * @param type the type of the fact
         * @param icon the URL for the fact's icon
         * @param text an arbitrary localized string describing the fact
         * @param requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @param overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         * @param value always true
         */
        @Serializable(with = __UnblockableSerializer0::class)
        public data class Unblockable(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            /** This field holds always true. */
            val value: Boolean
        ) : TraitedFact()

    }

}