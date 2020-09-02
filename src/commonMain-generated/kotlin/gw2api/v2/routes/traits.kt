/*
 * Copyright (c) 2018-2020 Leon Linhart
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
@file:JvmName("GW2v2")
@file:JvmMultifileClass
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package gw2api.v2

import gw2api.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*
import kotlin.jvm.*

/**
 * Creates a request used to query the list of available IDs.
 *
 * Returns information about the traits available in the game.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/traits]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2TraitsIDs(configure: (RequestBuilder<List<Int>>.() -> Unit)? = null): RequestBuilder<List<Int>> = request(
    path = "/v2/traits",
    parameters = mapOf("v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(Int.serializer()),
    configure = configure
)

/**
 * Creates a request used to query a single [item](GW2v2Trait) by its ID.
 *
 * Returns information about the traits available in the game.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/traits]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2TraitsByID(id: Int, configure: (RequestBuilder<GW2v2Trait>.() -> Unit)? = null): RequestBuilder<GW2v2Trait> = request(
    path = "/v2/traits",
    parameters = mapOf("id" to id.toString(), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = GW2v2Trait.serializer(),
    configure = configure
)

/**
 * Creates a request used to query one or more [items](GW2v2Trait) by their IDs.
 *
 * Returns information about the traits available in the game.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/traits]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2TraitsByIDs(ids: Collection<Int>, configure: (RequestBuilder<List<GW2v2Trait>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Trait>> = request(
    path = "/v2/traits",
    parameters = mapOf("ids" to ids.joinToString(","), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2Trait.serializer()),
    configure = configure
)

/**
 * Creates a request used to query all available [items](GW2v2Trait).
 *
 * Returns information about the traits available in the game.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/traits]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2TraitsAll(configure: (RequestBuilder<List<GW2v2Trait>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Trait>> = request(
    path = "/v2/traits",
    parameters = mapOf("ids" to "all", "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2Trait.serializer()),
    configure = configure
)

/**
 * Creates a request used to query one or more [items](GW2v2Trait) by page.
 *
 * Returns information about the traits available in the game.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           Yes
 * Cache time:          60m
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/traits]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
public fun GW2APIClient.gw2v2TraitsByPage(page: Int, pageSize: Int = 200, configure: (RequestBuilder<List<GW2v2Trait>>.() -> Unit)? = null): RequestBuilder<List<GW2v2Trait>> = request(
    path = "/v2/traits",
    parameters = mapOf("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString(), "v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = mapOf(),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = Language.API_V2,
    serializer = ListSerializer(GW2v2Trait.serializer()),
    configure = configure
)

/**
 * Information about a trait.
 *
 * @param id the trait's ID
 * @param tier the trait's tier
 * @param order the trait's order
 * @param name the trait's name
 * @param description the trait's description
 * @param slot the slot for the trait
 * @param facts a list of facts
 * @param traitedFacts Information about a trait's fact (i.e. effect/property) that is only active if a specific trait is active.
 * @param skills a list of skills related to this trait
 * @param specialization the specialization that this trait is part of
 * @param icon the URL for the trait's icon
 */
@Serializable
public data class GW2v2Trait(
    val id: Int,
    val tier: Int,
    val order: Int,
    val name: String,
    val description: String,
    val slot: String,
    val facts: List<Fact>? = null,
    @SerialName("traited_facts")
    val traitedFacts: List<TraitedFact>? = null,
    val skills: List<Skill>? = null,
    val specialization: Int,
    val icon: String
) {

    @Suppress("ClassName")
    private object __JsonParametricSerializer_Fact : JsonContentPolymorphicSerializer<Fact>(Fact::class) {
        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out Fact> {
            return when (element.jsonObject["type"]!!.jsonPrimitive.content) {
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
                "Time" -> Fact.Time.serializer()
                "Unblockable" -> Fact.Unblockable.serializer()
                else -> TODO()
            }
        }
    }

    /**
     * Information about a trait's fact (i.e. effect/property).
     *
     * @property type the type of the fact
     * @property icon the URL for the fact's icon
     * @property text an arbitrary localized string describing the fact
     */
    @Serializable(with = __JsonParametricSerializer_Fact::class)
    public sealed class Fact {

        public abstract val type: String
        public abstract val icon: String?
        public abstract val text: String?

        @Suppress("ClassName")
        @Serializer(forClass = AttributeAdjust::class)
        private object __AttributeAdjustGeneratedSerializer : KSerializer<AttributeAdjust>

        @Suppress("ClassName")
        private object __AttributeAdjustSerializer : JsonTransformingSerializer<AttributeAdjust>(__AttributeAdjustGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about an attribute adjustment.
         *
         * @param value the amount 'target' gets adjusted, based on a level 80 character at base stats
         * @param target the attribute this fact adjusts
         */
        @Serializable(with = __AttributeAdjustSerializer::class)
        public data class AttributeAdjust(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            val value: Int? = null,
            val target: String? = null
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Buff::class)
        private object __BuffGeneratedSerializer : KSerializer<Buff>

        @Suppress("ClassName")
        private object __BuffSerializer : JsonTransformingSerializer<Buff>(__BuffGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a buff.
         *
         * @param status the boon, condition, or effect referred to by the fact
         * @param duration the duration of the effect in seconds
         * @param description the description of the status effect
         * @param applyCount the number of stacks applied
         */
        @Serializable(with = __BuffSerializer::class)
        public data class Buff(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            val status: String,
            val duration: Int? = null,
            val description: String? = null,
            @SerialName("apply_count")
            val applyCount: Int? = null
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = BuffConversion::class)
        private object __BuffConversionGeneratedSerializer : KSerializer<BuffConversion>

        @Suppress("ClassName")
        private object __BuffConversionSerializer : JsonTransformingSerializer<BuffConversion>(__BuffConversionGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a buff-conversion.
         *
         * @param source the attribute that is used to calculate the attribute gain
         * @param percent how much of the source attribute is added to target
         * @param target the attribute that gets added to
         */
        @Serializable(with = __BuffConversionSerializer::class)
        public data class BuffConversion(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            val source: String,
            val percent: Int,
            val target: String
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = ComboField::class)
        private object __ComboFieldGeneratedSerializer : KSerializer<ComboField>

        @Suppress("ClassName")
        private object __ComboFieldSerializer : JsonTransformingSerializer<ComboField>(__ComboFieldGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a combo-field.
         *
         * @param fieldType the type of the field
         */
        @Serializable(with = __ComboFieldSerializer::class)
        public data class ComboField(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("field_type")
            val fieldType: String
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = ComboFinisher::class)
        private object __ComboFinisherGeneratedSerializer : KSerializer<ComboFinisher>

        @Suppress("ClassName")
        private object __ComboFinisherSerializer : JsonTransformingSerializer<ComboFinisher>(__ComboFinisherGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a combo-finisher.
         *
         * @param finisherType the type of finisher
         * @param percent the percent chance that the finisher will trigger
         */
        @Serializable(with = __ComboFinisherSerializer::class)
        public data class ComboFinisher(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("finisher_type")
            val finisherType: String,
            val percent: Int
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Damage::class)
        private object __DamageGeneratedSerializer : KSerializer<Damage>

        @Suppress("ClassName")
        private object __DamageSerializer : JsonTransformingSerializer<Damage>(__DamageGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about damage.
         *
         * @param hitCount the amount of times the damage hits
         * @param damageMultiplier the damage multiplier
         */
        @Serializable(with = __DamageSerializer::class)
        public data class Damage(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("hit_count")
            val hitCount: Int,
            @SerialName("dmg_multiplier")
            val damageMultiplier: Double
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Distance::class)
        private object __DistanceGeneratedSerializer : KSerializer<Distance>

        @Suppress("ClassName")
        private object __DistanceSerializer : JsonTransformingSerializer<Distance>(__DistanceGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about range.
         *
         * @param distance the distance value
         */
        @Serializable(with = __DistanceSerializer::class)
        public data class Distance(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            val distance: Int
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = NoData::class)
        private object __NoDataGeneratedSerializer : KSerializer<NoData>

        @Suppress("ClassName")
        private object __NoDataSerializer : JsonTransformingSerializer<NoData>(__NoDataGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /** No (special) additional information. */
        @Serializable(with = __NoDataSerializer::class)
        public data class NoData(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Number::class)
        private object __NumberGeneratedSerializer : KSerializer<Number>

        @Suppress("ClassName")
        private object __NumberSerializer : JsonTransformingSerializer<Number>(__NumberGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * An additional number.
         *
         * @param value the number value as referenced by text
         */
        @Serializable(with = __NumberSerializer::class)
        public data class Number(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            val value: Int
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Percent::class)
        private object __PercentGeneratedSerializer : KSerializer<Percent>

        @Suppress("ClassName")
        private object __PercentSerializer : JsonTransformingSerializer<Percent>(__PercentGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * An additional percentage value.
         *
         * @param percent the percentage value as referenced by text
         */
        @Serializable(with = __PercentSerializer::class)
        public data class Percent(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            val percent: Int
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = PrefixedBuff::class)
        private object __PrefixedBuffGeneratedSerializer : KSerializer<PrefixedBuff>

        @Suppress("ClassName")
        private object __PrefixedBuffSerializer : JsonTransformingSerializer<PrefixedBuff>(__PrefixedBuffGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a prefixed buff.
         *
         * @param status the boon, condition, or effect referred to by the fact
         * @param duration the duration of the effect in seconds
         * @param description the description of the status effect
         * @param applyCount the number of stacks applied
         * @param prefix 
         */
        @Serializable(with = __PrefixedBuffSerializer::class)
        public data class PrefixedBuff(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            val status: String,
            val duration: Int? = null,
            val description: String? = null,
            @SerialName("apply_count")
            val applyCount: Int? = null,
            val prefix: Prefix
        ) : Fact() {

            /**
             * Information about a buff's prefix.
             *
             * @param text 
             * @param icon 
             * @param status 
             * @param description 
             */
            @Serializable
            public data class Prefix(
                val text: String,
                val icon: String,
                val status: String,
                val description: String
            )

        }

        @Suppress("ClassName")
        @Serializer(forClass = Radius::class)
        private object __RadiusGeneratedSerializer : KSerializer<Radius>

        @Suppress("ClassName")
        private object __RadiusSerializer : JsonTransformingSerializer<Radius>(__RadiusGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a radius.
         *
         * @param distance the radius value
         */
        @Serializable(with = __RadiusSerializer::class)
        public data class Radius(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            val distance: Int
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Range::class)
        private object __RangeGeneratedSerializer : KSerializer<Range>

        @Suppress("ClassName")
        private object __RangeSerializer : JsonTransformingSerializer<Range>(__RangeGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about range.
         *
         * @param value the range of the trait/skill
         */
        @Serializable(with = __RangeSerializer::class)
        public data class Range(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            val value: Int
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Recharge::class)
        private object __RechargeGeneratedSerializer : KSerializer<Recharge>

        @Suppress("ClassName")
        private object __RechargeSerializer : JsonTransformingSerializer<Recharge>(__RechargeGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about recharge.
         *
         * @param value the recharge time in seconds
         */
        @Serializable(with = __RechargeSerializer::class)
        public data class Recharge(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            val value: Int
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Time::class)
        private object __TimeGeneratedSerializer : KSerializer<Time>

        @Suppress("ClassName")
        private object __TimeSerializer : JsonTransformingSerializer<Time>(__TimeGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about time.
         *
         * @param duration the time value in seconds
         */
        @Serializable(with = __TimeSerializer::class)
        public data class Time(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            val duration: Int
        ) : Fact()

        @Suppress("ClassName")
        @Serializer(forClass = Unblockable::class)
        private object __UnblockableGeneratedSerializer : KSerializer<Unblockable>

        @Suppress("ClassName")
        private object __UnblockableSerializer : JsonTransformingSerializer<Unblockable>(__UnblockableGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * A fact, indicating that a trait/skill is unlockable.
         *
         * @param value always true
         */
        @Serializable(with = __UnblockableSerializer::class)
        public data class Unblockable(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            val value: Boolean
        ) : Fact()

    }

    @Suppress("ClassName")
    private object __JsonParametricSerializer_TraitedFact : JsonContentPolymorphicSerializer<TraitedFact>(TraitedFact::class) {
        override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out TraitedFact> {
            return when (element.jsonObject["type"]!!.jsonPrimitive.content) {
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
                "Time" -> TraitedFact.Time.serializer()
                "Unblockable" -> TraitedFact.Unblockable.serializer()
                else -> TODO()
            }
        }
    }

    /**
     * a list of traited facts
     *
     * @property type the type of the fact
     * @property icon the URL for the fact's icon
     * @property text an arbitrary localized string describing the fact
     * @property requiresTrait specifies which trait has to be selected in order for this fact to take effect
     * @property overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
     */
    @Serializable(with = __JsonParametricSerializer_TraitedFact::class)
    public sealed class TraitedFact {

        public abstract val type: String
        public abstract val icon: String?
        public abstract val text: String?
        public abstract val requiresTrait: Int
        public abstract val overrides: Int?

        @Suppress("ClassName")
        @Serializer(forClass = AttributeAdjust::class)
        private object __AttributeAdjustGeneratedSerializer : KSerializer<AttributeAdjust>

        @Suppress("ClassName")
        private object __AttributeAdjustSerializer : JsonTransformingSerializer<AttributeAdjust>(__AttributeAdjustGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about an attribute adjustment.
         *
         * @param value the amount 'target' gets adjusted, based on a level 80 character at base stats
         * @param target the attribute this fact adjusts
         */
        @Serializable(with = __AttributeAdjustSerializer::class)
        public data class AttributeAdjust(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            val value: Int? = null,
            val target: String? = null
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Buff::class)
        private object __BuffGeneratedSerializer : KSerializer<Buff>

        @Suppress("ClassName")
        private object __BuffSerializer : JsonTransformingSerializer<Buff>(__BuffGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a buff.
         *
         * @param status the boon, condition, or effect referred to by the fact
         * @param duration the duration of the effect in seconds
         * @param description the description of the status effect
         * @param applyCount the number of stacks applied
         */
        @Serializable(with = __BuffSerializer::class)
        public data class Buff(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            val status: String,
            val duration: Int? = null,
            val description: String? = null,
            @SerialName("apply_count")
            val applyCount: Int? = null
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = BuffConversion::class)
        private object __BuffConversionGeneratedSerializer : KSerializer<BuffConversion>

        @Suppress("ClassName")
        private object __BuffConversionSerializer : JsonTransformingSerializer<BuffConversion>(__BuffConversionGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a buff-conversion.
         *
         * @param source the attribute that is used to calculate the attribute gain
         * @param percent how much of the source attribute is added to target
         * @param target the attribute that gets added to
         */
        @Serializable(with = __BuffConversionSerializer::class)
        public data class BuffConversion(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            val source: String,
            val percent: Int,
            val target: String
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = ComboField::class)
        private object __ComboFieldGeneratedSerializer : KSerializer<ComboField>

        @Suppress("ClassName")
        private object __ComboFieldSerializer : JsonTransformingSerializer<ComboField>(__ComboFieldGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a combo-field.
         *
         * @param fieldType the type of the field
         */
        @Serializable(with = __ComboFieldSerializer::class)
        public data class ComboField(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            @SerialName("field_type")
            val fieldType: String
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = ComboFinisher::class)
        private object __ComboFinisherGeneratedSerializer : KSerializer<ComboFinisher>

        @Suppress("ClassName")
        private object __ComboFinisherSerializer : JsonTransformingSerializer<ComboFinisher>(__ComboFinisherGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a combo-finisher.
         *
         * @param finisherType the type of finisher
         * @param percent the percent chance that the finisher will trigger
         */
        @Serializable(with = __ComboFinisherSerializer::class)
        public data class ComboFinisher(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            @SerialName("finisher_type")
            val finisherType: String,
            val percent: Int
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Damage::class)
        private object __DamageGeneratedSerializer : KSerializer<Damage>

        @Suppress("ClassName")
        private object __DamageSerializer : JsonTransformingSerializer<Damage>(__DamageGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about damage.
         *
         * @param hitCount the amount of times the damage hits
         * @param damageMultiplier the damage multiplier
         */
        @Serializable(with = __DamageSerializer::class)
        public data class Damage(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            @SerialName("hit_count")
            val hitCount: Int,
            @SerialName("dmg_multiplier")
            val damageMultiplier: Double
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Distance::class)
        private object __DistanceGeneratedSerializer : KSerializer<Distance>

        @Suppress("ClassName")
        private object __DistanceSerializer : JsonTransformingSerializer<Distance>(__DistanceGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about range.
         *
         * @param distance the distance value
         */
        @Serializable(with = __DistanceSerializer::class)
        public data class Distance(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            val distance: Int
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = NoData::class)
        private object __NoDataGeneratedSerializer : KSerializer<NoData>

        @Suppress("ClassName")
        private object __NoDataSerializer : JsonTransformingSerializer<NoData>(__NoDataGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /** No (special) additional information. */
        @Serializable(with = __NoDataSerializer::class)
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
        private object __NumberSerializer : JsonTransformingSerializer<Number>(__NumberGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * An additional number.
         *
         * @param value the number value as referenced by text
         */
        @Serializable(with = __NumberSerializer::class)
        public data class Number(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            val value: Int
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Percent::class)
        private object __PercentGeneratedSerializer : KSerializer<Percent>

        @Suppress("ClassName")
        private object __PercentSerializer : JsonTransformingSerializer<Percent>(__PercentGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * An additional percentage value.
         *
         * @param percent the percentage value as referenced by text
         */
        @Serializable(with = __PercentSerializer::class)
        public data class Percent(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            val percent: Int
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = PrefixedBuff::class)
        private object __PrefixedBuffGeneratedSerializer : KSerializer<PrefixedBuff>

        @Suppress("ClassName")
        private object __PrefixedBuffSerializer : JsonTransformingSerializer<PrefixedBuff>(__PrefixedBuffGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a prefixed buff.
         *
         * @param status the boon, condition, or effect referred to by the fact
         * @param duration the duration of the effect in seconds
         * @param description the description of the status effect
         * @param applyCount the number of stacks applied
         * @param prefix 
         */
        @Serializable(with = __PrefixedBuffSerializer::class)
        public data class PrefixedBuff(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            val status: String,
            val duration: Int? = null,
            val description: String? = null,
            @SerialName("apply_count")
            val applyCount: Int? = null,
            val prefix: Prefix
        ) : TraitedFact() {

            /**
             * Information about a buff's prefix.
             *
             * @param text 
             * @param icon 
             * @param status 
             * @param description 
             */
            @Serializable
            public data class Prefix(
                val text: String,
                val icon: String,
                val status: String,
                val description: String
            )

        }

        @Suppress("ClassName")
        @Serializer(forClass = Radius::class)
        private object __RadiusGeneratedSerializer : KSerializer<Radius>

        @Suppress("ClassName")
        private object __RadiusSerializer : JsonTransformingSerializer<Radius>(__RadiusGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about a radius.
         *
         * @param distance the radius value
         */
        @Serializable(with = __RadiusSerializer::class)
        public data class Radius(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            val distance: Int
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Range::class)
        private object __RangeGeneratedSerializer : KSerializer<Range>

        @Suppress("ClassName")
        private object __RangeSerializer : JsonTransformingSerializer<Range>(__RangeGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about range.
         *
         * @param value the range of the trait/skill
         */
        @Serializable(with = __RangeSerializer::class)
        public data class Range(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            val value: Int
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Recharge::class)
        private object __RechargeGeneratedSerializer : KSerializer<Recharge>

        @Suppress("ClassName")
        private object __RechargeSerializer : JsonTransformingSerializer<Recharge>(__RechargeGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about recharge.
         *
         * @param value the recharge time in seconds
         */
        @Serializable(with = __RechargeSerializer::class)
        public data class Recharge(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            val value: Int
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Time::class)
        private object __TimeGeneratedSerializer : KSerializer<Time>

        @Suppress("ClassName")
        private object __TimeSerializer : JsonTransformingSerializer<Time>(__TimeGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * Additional information about time.
         *
         * @param duration the time value in seconds
         */
        @Serializable(with = __TimeSerializer::class)
        public data class Time(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            val duration: Int
        ) : TraitedFact()

        @Suppress("ClassName")
        @Serializer(forClass = Unblockable::class)
        private object __UnblockableGeneratedSerializer : KSerializer<Unblockable>

        @Suppress("ClassName")
        private object __UnblockableSerializer : JsonTransformingSerializer<Unblockable>(__UnblockableGeneratedSerializer) {
            override fun transformDeserialize(element: JsonElement): JsonElement =
                JsonObject(element.jsonObject - "__virtualType")
        }

        /**
         * A fact, indicating that a trait/skill is unlockable.
         *
         * @param value always true
         */
        @Serializable(with = __UnblockableSerializer::class)
        public data class Unblockable(
            override val type: String,
            override val icon: String? = null,
            override val text: String? = null,
            @SerialName("requires_trait")
            override val requiresTrait: Int,
            override val overrides: Int? = null,
            val value: Boolean
        ) : TraitedFact()

    }

    /**
     * Information about a skill related to a trait.
     *
     * @param iD the skill's ID
     * @param name the skill's name
     * @param description the skill's description
     * @param icon the URL of the skill's icon
     * @param facts a list of facts of the skill
     * @param traitedFacts a list of traited facts of the skill
     */
    @Serializable
    public data class Skill(
        @SerialName("id")
        val iD: Int,
        val name: String,
        val description: String,
        val icon: String,
        val facts: List<Fact>? = null,
        @SerialName("traited_facts")
        val traitedFacts: List<TraitedFact>? = null
    ) {

        @Suppress("ClassName")
        private object __JsonParametricSerializer_Fact : JsonContentPolymorphicSerializer<Fact>(Fact::class) {
            override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out Fact> {
                return when (element.jsonObject["type"]!!.jsonPrimitive.content) {
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
                    "Time" -> Fact.Time.serializer()
                    "Unblockable" -> Fact.Unblockable.serializer()
                    else -> TODO()
                }
            }
        }

        /**
         * Information about a trait's effects.
         *
         * @property type the type of the fact
         * @property icon the URL for the fact's icon
         * @property text an arbitrary localized string describing the fact
         */
        @Serializable(with = __JsonParametricSerializer_Fact::class)
        public sealed class Fact {

            public abstract val type: String
            public abstract val icon: String?
            public abstract val text: String?

            @Suppress("ClassName")
            @Serializer(forClass = AttributeAdjust::class)
            private object __AttributeAdjustGeneratedSerializer : KSerializer<AttributeAdjust>

            @Suppress("ClassName")
            private object __AttributeAdjustSerializer : JsonTransformingSerializer<AttributeAdjust>(__AttributeAdjustGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about an attribute adjustment.
             *
             * @param value the amount 'target' gets adjusted, based on a level 80 character at base stats
             * @param target the attribute this fact adjusts
             */
            @Serializable(with = __AttributeAdjustSerializer::class)
            public data class AttributeAdjust(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                val value: Int? = null,
                val target: String? = null
            ) : Fact()

            @Suppress("ClassName")
            @Serializer(forClass = Buff::class)
            private object __BuffGeneratedSerializer : KSerializer<Buff>

            @Suppress("ClassName")
            private object __BuffSerializer : JsonTransformingSerializer<Buff>(__BuffGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about a buff.
             *
             * @param status the boon, condition, or effect referred to by the fact
             * @param duration the duration of the effect in seconds
             * @param description the description of the status effect
             * @param applyCount the number of stacks applied
             */
            @Serializable(with = __BuffSerializer::class)
            public data class Buff(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                val status: String,
                val duration: Int? = null,
                val description: String? = null,
                @SerialName("apply_count")
                val applyCount: Int? = null
            ) : Fact()

            @Suppress("ClassName")
            @Serializer(forClass = BuffConversion::class)
            private object __BuffConversionGeneratedSerializer : KSerializer<BuffConversion>

            @Suppress("ClassName")
            private object __BuffConversionSerializer : JsonTransformingSerializer<BuffConversion>(__BuffConversionGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about a buff-conversion.
             *
             * @param source the attribute that is used to calculate the attribute gain
             * @param percent how much of the source attribute is added to target
             * @param target the attribute that gets added to
             */
            @Serializable(with = __BuffConversionSerializer::class)
            public data class BuffConversion(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                val source: String,
                val percent: Int,
                val target: String
            ) : Fact()

            @Suppress("ClassName")
            @Serializer(forClass = ComboField::class)
            private object __ComboFieldGeneratedSerializer : KSerializer<ComboField>

            @Suppress("ClassName")
            private object __ComboFieldSerializer : JsonTransformingSerializer<ComboField>(__ComboFieldGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about a combo-field.
             *
             * @param fieldType the type of the field
             */
            @Serializable(with = __ComboFieldSerializer::class)
            public data class ComboField(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("field_type")
                val fieldType: String
            ) : Fact()

            @Suppress("ClassName")
            @Serializer(forClass = ComboFinisher::class)
            private object __ComboFinisherGeneratedSerializer : KSerializer<ComboFinisher>

            @Suppress("ClassName")
            private object __ComboFinisherSerializer : JsonTransformingSerializer<ComboFinisher>(__ComboFinisherGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about a combo-finisher.
             *
             * @param finisherType the type of finisher
             * @param percent the percent chance that the finisher will trigger
             */
            @Serializable(with = __ComboFinisherSerializer::class)
            public data class ComboFinisher(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("finisher_type")
                val finisherType: String,
                val percent: Int
            ) : Fact()

            @Suppress("ClassName")
            @Serializer(forClass = Damage::class)
            private object __DamageGeneratedSerializer : KSerializer<Damage>

            @Suppress("ClassName")
            private object __DamageSerializer : JsonTransformingSerializer<Damage>(__DamageGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about damage.
             *
             * @param hitCount the amount of times the damage hits
             * @param damageMultiplier the damage multiplier
             */
            @Serializable(with = __DamageSerializer::class)
            public data class Damage(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("hit_count")
                val hitCount: Int,
                @SerialName("dmg_multiplier")
                val damageMultiplier: Double
            ) : Fact()

            @Suppress("ClassName")
            @Serializer(forClass = Distance::class)
            private object __DistanceGeneratedSerializer : KSerializer<Distance>

            @Suppress("ClassName")
            private object __DistanceSerializer : JsonTransformingSerializer<Distance>(__DistanceGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about range.
             *
             * @param distance the distance value
             */
            @Serializable(with = __DistanceSerializer::class)
            public data class Distance(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                val distance: Int
            ) : Fact()

            @Suppress("ClassName")
            @Serializer(forClass = NoData::class)
            private object __NoDataGeneratedSerializer : KSerializer<NoData>

            @Suppress("ClassName")
            private object __NoDataSerializer : JsonTransformingSerializer<NoData>(__NoDataGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /** No (special) additional information. */
            @Serializable(with = __NoDataSerializer::class)
            public data class NoData(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null
            ) : Fact()

            @Suppress("ClassName")
            @Serializer(forClass = Number::class)
            private object __NumberGeneratedSerializer : KSerializer<Number>

            @Suppress("ClassName")
            private object __NumberSerializer : JsonTransformingSerializer<Number>(__NumberGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * An additional number.
             *
             * @param value the number value as referenced by text
             */
            @Serializable(with = __NumberSerializer::class)
            public data class Number(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                val value: Int
            ) : Fact()

            @Suppress("ClassName")
            @Serializer(forClass = Percent::class)
            private object __PercentGeneratedSerializer : KSerializer<Percent>

            @Suppress("ClassName")
            private object __PercentSerializer : JsonTransformingSerializer<Percent>(__PercentGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * An additional percentage value.
             *
             * @param percent the percentage value as referenced by text
             */
            @Serializable(with = __PercentSerializer::class)
            public data class Percent(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                val percent: Int
            ) : Fact()

            @Suppress("ClassName")
            @Serializer(forClass = PrefixedBuff::class)
            private object __PrefixedBuffGeneratedSerializer : KSerializer<PrefixedBuff>

            @Suppress("ClassName")
            private object __PrefixedBuffSerializer : JsonTransformingSerializer<PrefixedBuff>(__PrefixedBuffGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about a prefixed buff.
             *
             * @param status the boon, condition, or effect referred to by the fact
             * @param duration the duration of the effect in seconds
             * @param description the description of the status effect
             * @param applyCount the number of stacks applied
             * @param prefix 
             */
            @Serializable(with = __PrefixedBuffSerializer::class)
            public data class PrefixedBuff(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                val status: String,
                val duration: Int? = null,
                val description: String? = null,
                @SerialName("apply_count")
                val applyCount: Int? = null,
                val prefix: Prefix
            ) : Fact() {

                /**
                 * Information about a buff's prefix.
                 *
                 * @param text 
                 * @param icon 
                 * @param status 
                 * @param description 
                 */
                @Serializable
                public data class Prefix(
                    val text: String,
                    val icon: String,
                    val status: String,
                    val description: String
                )

            }

            @Suppress("ClassName")
            @Serializer(forClass = Radius::class)
            private object __RadiusGeneratedSerializer : KSerializer<Radius>

            @Suppress("ClassName")
            private object __RadiusSerializer : JsonTransformingSerializer<Radius>(__RadiusGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about a radius.
             *
             * @param distance the radius value
             */
            @Serializable(with = __RadiusSerializer::class)
            public data class Radius(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                val distance: Int
            ) : Fact()

            @Suppress("ClassName")
            @Serializer(forClass = Range::class)
            private object __RangeGeneratedSerializer : KSerializer<Range>

            @Suppress("ClassName")
            private object __RangeSerializer : JsonTransformingSerializer<Range>(__RangeGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about range.
             *
             * @param value the range of the trait/skill
             */
            @Serializable(with = __RangeSerializer::class)
            public data class Range(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                val value: Int
            ) : Fact()

            @Suppress("ClassName")
            @Serializer(forClass = Recharge::class)
            private object __RechargeGeneratedSerializer : KSerializer<Recharge>

            @Suppress("ClassName")
            private object __RechargeSerializer : JsonTransformingSerializer<Recharge>(__RechargeGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about recharge.
             *
             * @param value the recharge time in seconds
             */
            @Serializable(with = __RechargeSerializer::class)
            public data class Recharge(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                val value: Int
            ) : Fact()

            @Suppress("ClassName")
            @Serializer(forClass = Time::class)
            private object __TimeGeneratedSerializer : KSerializer<Time>

            @Suppress("ClassName")
            private object __TimeSerializer : JsonTransformingSerializer<Time>(__TimeGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about time.
             *
             * @param duration the time value in seconds
             */
            @Serializable(with = __TimeSerializer::class)
            public data class Time(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                val duration: Int
            ) : Fact()

            @Suppress("ClassName")
            @Serializer(forClass = Unblockable::class)
            private object __UnblockableGeneratedSerializer : KSerializer<Unblockable>

            @Suppress("ClassName")
            private object __UnblockableSerializer : JsonTransformingSerializer<Unblockable>(__UnblockableGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * A fact, indicating that a trait/skill is unlockable.
             *
             * @param value always true
             */
            @Serializable(with = __UnblockableSerializer::class)
            public data class Unblockable(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                val value: Boolean
            ) : Fact()

        }

        @Suppress("ClassName")
        private object __JsonParametricSerializer_TraitedFact : JsonContentPolymorphicSerializer<TraitedFact>(TraitedFact::class) {
            override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out TraitedFact> {
                return when (element.jsonObject["type"]!!.jsonPrimitive.content) {
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
                    "Time" -> TraitedFact.Time.serializer()
                    "Unblockable" -> TraitedFact.Unblockable.serializer()
                    else -> TODO()
                }
            }
        }

        /**
         * Information about a fact that overrides a trait's effect.
         *
         * @property type the type of the fact
         * @property icon the URL for the fact's icon
         * @property text an arbitrary localized string describing the fact
         * @property requiresTrait specifies which trait has to be selected in order for this fact to take effect
         * @property overrides the array index of the facts object it will override, if the trait specified in requires_trait is selected
         */
        @Serializable(with = __JsonParametricSerializer_TraitedFact::class)
        public sealed class TraitedFact {

            public abstract val type: String
            public abstract val icon: String?
            public abstract val text: String?
            public abstract val requiresTrait: Int
            public abstract val overrides: Int?

            @Suppress("ClassName")
            @Serializer(forClass = AttributeAdjust::class)
            private object __AttributeAdjustGeneratedSerializer : KSerializer<AttributeAdjust>

            @Suppress("ClassName")
            private object __AttributeAdjustSerializer : JsonTransformingSerializer<AttributeAdjust>(__AttributeAdjustGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about an attribute adjustment.
             *
             * @param value the amount 'target' gets adjusted, based on a level 80 character at base stats
             * @param target the attribute this fact adjusts
             */
            @Serializable(with = __AttributeAdjustSerializer::class)
            public data class AttributeAdjust(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("requires_trait")
                override val requiresTrait: Int,
                override val overrides: Int? = null,
                val value: Int? = null,
                val target: String? = null
            ) : TraitedFact()

            @Suppress("ClassName")
            @Serializer(forClass = Buff::class)
            private object __BuffGeneratedSerializer : KSerializer<Buff>

            @Suppress("ClassName")
            private object __BuffSerializer : JsonTransformingSerializer<Buff>(__BuffGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about a buff.
             *
             * @param status the boon, condition, or effect referred to by the fact
             * @param duration the duration of the effect in seconds
             * @param description the description of the status effect
             * @param applyCount the number of stacks applied
             */
            @Serializable(with = __BuffSerializer::class)
            public data class Buff(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("requires_trait")
                override val requiresTrait: Int,
                override val overrides: Int? = null,
                val status: String,
                val duration: Int? = null,
                val description: String? = null,
                @SerialName("apply_count")
                val applyCount: Int? = null
            ) : TraitedFact()

            @Suppress("ClassName")
            @Serializer(forClass = BuffConversion::class)
            private object __BuffConversionGeneratedSerializer : KSerializer<BuffConversion>

            @Suppress("ClassName")
            private object __BuffConversionSerializer : JsonTransformingSerializer<BuffConversion>(__BuffConversionGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about a buff-conversion.
             *
             * @param source the attribute that is used to calculate the attribute gain
             * @param percent how much of the source attribute is added to target
             * @param target the attribute that gets added to
             */
            @Serializable(with = __BuffConversionSerializer::class)
            public data class BuffConversion(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("requires_trait")
                override val requiresTrait: Int,
                override val overrides: Int? = null,
                val source: String,
                val percent: Int,
                val target: String
            ) : TraitedFact()

            @Suppress("ClassName")
            @Serializer(forClass = ComboField::class)
            private object __ComboFieldGeneratedSerializer : KSerializer<ComboField>

            @Suppress("ClassName")
            private object __ComboFieldSerializer : JsonTransformingSerializer<ComboField>(__ComboFieldGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about a combo-field.
             *
             * @param fieldType the type of the field
             */
            @Serializable(with = __ComboFieldSerializer::class)
            public data class ComboField(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("requires_trait")
                override val requiresTrait: Int,
                override val overrides: Int? = null,
                @SerialName("field_type")
                val fieldType: String
            ) : TraitedFact()

            @Suppress("ClassName")
            @Serializer(forClass = ComboFinisher::class)
            private object __ComboFinisherGeneratedSerializer : KSerializer<ComboFinisher>

            @Suppress("ClassName")
            private object __ComboFinisherSerializer : JsonTransformingSerializer<ComboFinisher>(__ComboFinisherGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about a combo-finisher.
             *
             * @param finisherType the type of finisher
             * @param percent the percent chance that the finisher will trigger
             */
            @Serializable(with = __ComboFinisherSerializer::class)
            public data class ComboFinisher(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("requires_trait")
                override val requiresTrait: Int,
                override val overrides: Int? = null,
                @SerialName("finisher_type")
                val finisherType: String,
                val percent: Int
            ) : TraitedFact()

            @Suppress("ClassName")
            @Serializer(forClass = Damage::class)
            private object __DamageGeneratedSerializer : KSerializer<Damage>

            @Suppress("ClassName")
            private object __DamageSerializer : JsonTransformingSerializer<Damage>(__DamageGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about damage.
             *
             * @param hitCount the amount of times the damage hits
             * @param damageMultiplier the damage multiplier
             */
            @Serializable(with = __DamageSerializer::class)
            public data class Damage(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("requires_trait")
                override val requiresTrait: Int,
                override val overrides: Int? = null,
                @SerialName("hit_count")
                val hitCount: Int,
                @SerialName("dmg_multiplier")
                val damageMultiplier: Double
            ) : TraitedFact()

            @Suppress("ClassName")
            @Serializer(forClass = Distance::class)
            private object __DistanceGeneratedSerializer : KSerializer<Distance>

            @Suppress("ClassName")
            private object __DistanceSerializer : JsonTransformingSerializer<Distance>(__DistanceGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about range.
             *
             * @param distance the distance value
             */
            @Serializable(with = __DistanceSerializer::class)
            public data class Distance(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("requires_trait")
                override val requiresTrait: Int,
                override val overrides: Int? = null,
                val distance: Int
            ) : TraitedFact()

            @Suppress("ClassName")
            @Serializer(forClass = NoData::class)
            private object __NoDataGeneratedSerializer : KSerializer<NoData>

            @Suppress("ClassName")
            private object __NoDataSerializer : JsonTransformingSerializer<NoData>(__NoDataGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /** No (special) additional information. */
            @Serializable(with = __NoDataSerializer::class)
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
            private object __NumberSerializer : JsonTransformingSerializer<Number>(__NumberGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * An additional number.
             *
             * @param value the number value as referenced by text
             */
            @Serializable(with = __NumberSerializer::class)
            public data class Number(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("requires_trait")
                override val requiresTrait: Int,
                override val overrides: Int? = null,
                val value: Int
            ) : TraitedFact()

            @Suppress("ClassName")
            @Serializer(forClass = Percent::class)
            private object __PercentGeneratedSerializer : KSerializer<Percent>

            @Suppress("ClassName")
            private object __PercentSerializer : JsonTransformingSerializer<Percent>(__PercentGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * An additional percentage value.
             *
             * @param percent the percentage value as referenced by text
             */
            @Serializable(with = __PercentSerializer::class)
            public data class Percent(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("requires_trait")
                override val requiresTrait: Int,
                override val overrides: Int? = null,
                val percent: Int
            ) : TraitedFact()

            @Suppress("ClassName")
            @Serializer(forClass = PrefixedBuff::class)
            private object __PrefixedBuffGeneratedSerializer : KSerializer<PrefixedBuff>

            @Suppress("ClassName")
            private object __PrefixedBuffSerializer : JsonTransformingSerializer<PrefixedBuff>(__PrefixedBuffGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about a prefixed buff.
             *
             * @param status the boon, condition, or effect referred to by the fact
             * @param duration the duration of the effect in seconds
             * @param description the description of the status effect
             * @param applyCount the number of stacks applied
             * @param prefix 
             */
            @Serializable(with = __PrefixedBuffSerializer::class)
            public data class PrefixedBuff(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("requires_trait")
                override val requiresTrait: Int,
                override val overrides: Int? = null,
                val status: String,
                val duration: Int? = null,
                val description: String? = null,
                @SerialName("apply_count")
                val applyCount: Int? = null,
                val prefix: Prefix
            ) : TraitedFact() {

                /**
                 * Information about a buff's prefix.
                 *
                 * @param text 
                 * @param icon 
                 * @param status 
                 * @param description 
                 */
                @Serializable
                public data class Prefix(
                    val text: String,
                    val icon: String,
                    val status: String,
                    val description: String
                )

            }

            @Suppress("ClassName")
            @Serializer(forClass = Radius::class)
            private object __RadiusGeneratedSerializer : KSerializer<Radius>

            @Suppress("ClassName")
            private object __RadiusSerializer : JsonTransformingSerializer<Radius>(__RadiusGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about a radius.
             *
             * @param distance the radius value
             */
            @Serializable(with = __RadiusSerializer::class)
            public data class Radius(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("requires_trait")
                override val requiresTrait: Int,
                override val overrides: Int? = null,
                val distance: Int
            ) : TraitedFact()

            @Suppress("ClassName")
            @Serializer(forClass = Range::class)
            private object __RangeGeneratedSerializer : KSerializer<Range>

            @Suppress("ClassName")
            private object __RangeSerializer : JsonTransformingSerializer<Range>(__RangeGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about range.
             *
             * @param value the range of the trait/skill
             */
            @Serializable(with = __RangeSerializer::class)
            public data class Range(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("requires_trait")
                override val requiresTrait: Int,
                override val overrides: Int? = null,
                val value: Int
            ) : TraitedFact()

            @Suppress("ClassName")
            @Serializer(forClass = Recharge::class)
            private object __RechargeGeneratedSerializer : KSerializer<Recharge>

            @Suppress("ClassName")
            private object __RechargeSerializer : JsonTransformingSerializer<Recharge>(__RechargeGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about recharge.
             *
             * @param value the recharge time in seconds
             */
            @Serializable(with = __RechargeSerializer::class)
            public data class Recharge(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("requires_trait")
                override val requiresTrait: Int,
                override val overrides: Int? = null,
                val value: Int
            ) : TraitedFact()

            @Suppress("ClassName")
            @Serializer(forClass = Time::class)
            private object __TimeGeneratedSerializer : KSerializer<Time>

            @Suppress("ClassName")
            private object __TimeSerializer : JsonTransformingSerializer<Time>(__TimeGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Additional information about time.
             *
             * @param duration the time value in seconds
             */
            @Serializable(with = __TimeSerializer::class)
            public data class Time(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("requires_trait")
                override val requiresTrait: Int,
                override val overrides: Int? = null,
                val duration: Int
            ) : TraitedFact()

            @Suppress("ClassName")
            @Serializer(forClass = Unblockable::class)
            private object __UnblockableGeneratedSerializer : KSerializer<Unblockable>

            @Suppress("ClassName")
            private object __UnblockableSerializer : JsonTransformingSerializer<Unblockable>(__UnblockableGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * A fact, indicating that a trait/skill is unlockable.
             *
             * @param value always true
             */
            @Serializable(with = __UnblockableSerializer::class)
            public data class Unblockable(
                override val type: String,
                override val icon: String? = null,
                override val text: String? = null,
                @SerialName("requires_trait")
                override val requiresTrait: Int,
                override val overrides: Int? = null,
                val value: Boolean
            ) : TraitedFact()

        }

    }

}