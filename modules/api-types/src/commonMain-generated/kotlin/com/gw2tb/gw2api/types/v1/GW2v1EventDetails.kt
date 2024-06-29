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
package com.gw2tb.gw2api.types.v1

import com.gw2tb.gw2api.types.*
import com.gw2tb.gw2api.types.internal.*

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*
import kotlinx.serialization.json.*

// Generated for type: EventDetails

/**
 * Information about events.
 *
 * @param events the events
 */
@Serializable
public data class GW2v1EventDetails(
    /** This field holds the events. */
    val events: Map<GW2EventId, EventDetails>
) {

    /**
     * Information about an event.
     *
     * @param name the event's name
     * @param level the event's level
     * @param mapId the ID of the map where the event takes place
     * @param flags additional information about the event (e.g. group_event, map_wide, meta_event, dungeon_event)
     * @param location the event's location
     */
    @Serializable
    public data class EventDetails(
        /** This field holds the event's name. */
        val name: String,
        /** This field holds the event's level. */
        val level: Int,
        /** This field holds the ID of the map where the event takes place. */
        @SerialName("map_id")
        val mapId: GW2MapId,
        /** This field holds additional information about the event (e.g. group_event, map_wide, meta_event, dungeon_event). */
        val flags: List<String>,
        /** This field holds the event's location. */
        val location: Location
    ) {

        @Suppress("ClassName")
        private object __JsonParametricSerializer_Location : JsonContentPolymorphicSerializer<Location>(Location::class) {
            override fun selectDeserializer(element: JsonElement): DeserializationStrategy<Location> {
                return when (val type = element.jsonObject["type"]?.jsonPrimitive?.content) {
                    "cylinder" -> Location.Cylinder.serializer()
                    "poly" -> Location.Poly.serializer()
                    "sphere" -> Location.Sphere.serializer()
                    null -> throw SerializationException("Disambiguator property not found")
                    else -> throw SerializationException("Invalid disambiguator value for Location: $type")
                }
            }
        }

        /** Information about an event's location. */
        @Serializable(with = __JsonParametricSerializer_Location::class)
        public sealed class Location {

            /** This field holds the type of location. */
            public abstract val type: String

            @Suppress("ClassName")
            @Serializer(forClass = Cylinder::class)
            private object __CylinderGeneratedSerializer : KSerializer<Cylinder>

            @Suppress("ClassName")
            private object __CylinderSerializer0 : JsonTransformingSerializer<Cylinder>(__CylinderGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Information about a cylindrical event location.
             *
             * @param type the type of location
             * @param center the coordinates (x,y,z) of the cylinder's center (in map coordinates)
             * @param height the cylinder's height
             * @param radius the cylinder's radius
             * @param rotation the cylinder's rotation
             */
            @Serializable(with = __CylinderSerializer0::class)
            public data class Cylinder(
                override val type: String,
                /** This field holds the coordinates (x,y,z) of the cylinder's center (in map coordinates). */
                val center: List<Double>,
                /** This field holds the cylinder's height. */
                val height: Double,
                /** This field holds the cylinder's radius. */
                val radius: Double,
                /** This field holds the cylinder's rotation. */
                val rotation: Double
            ) : Location()

            @Suppress("ClassName")
            @Serializer(forClass = Poly::class)
            private object __PolyGeneratedSerializer : KSerializer<Poly>

            @Suppress("ClassName")
            private object __PolySerializer0 : JsonTransformingSerializer<Poly>(__PolyGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Information about a polygonal event location.
             *
             * @param type the type of location
             * @param center the coordinates (x,y,z) of the polygon's center (in map coordinates)
             * @param zRange the polygon's z-range
             * @param points the polygon's points
             */
            @Serializable(with = __PolySerializer0::class)
            public data class Poly(
                override val type: String,
                /** This field holds the coordinates (x,y,z) of the polygon's center (in map coordinates). */
                val center: List<Double>,
                /** This field holds the polygon's z-range. */
                @SerialName("z_range")
                val zRange: List<Double>,
                /** This field holds the polygon's points. */
                val points: List<List<Double>>
            ) : Location()

            @Suppress("ClassName")
            @Serializer(forClass = Sphere::class)
            private object __SphereGeneratedSerializer : KSerializer<Sphere>

            @Suppress("ClassName")
            private object __SphereSerializer0 : JsonTransformingSerializer<Sphere>(__SphereGeneratedSerializer) {
                override fun transformDeserialize(element: JsonElement): JsonElement =
                    JsonObject(element.jsonObject - "__virtualType")
            }

            /**
             * Information about a spherical event location.
             *
             * @param type the type of location
             * @param center the coordinates (x,y,z) of the sphere's center (in map coordinates)
             * @param radius the sphere's radius
             * @param rotation the sphere's rotation
             */
            @Serializable(with = __SphereSerializer0::class)
            public data class Sphere(
                override val type: String,
                /** This field holds the coordinates (x,y,z) of the sphere's center (in map coordinates). */
                val center: List<Double>,
                /** This field holds the sphere's radius. */
                val radius: Double,
                /** This field holds the sphere's rotation. */
                val rotation: Double
            ) : Location()

        }

    }

}