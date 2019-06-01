/*
 * Copyright 2018-2019 Leon Linhart
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gw2api.misc

expect enum class TimeUnit {
    /** Time unit representing one thousandth of a microsecond. */
    NANOSECONDS,
    /** Time unit representing one thousandth of a millisecond. */
    MICROSECONDS,
    /** Time unit representing one thousandth of a second. */
    MILLISECONDS,
    /** Time unit representing one second. */
    SECONDS,
    /** Time unit representing sixty seconds. */
    MINUTES,
    /** Time unit representing sixty minutes. */
    HOURS,
    /** Time unit representing twenty four hours. */
    DAYS;

    fun convert(sourceDuration: Long, sourceUnit: TimeUnit): Long

    fun toNanos(duration: Long): Long

    fun toMicros(duration: Long): Long

    fun toMillis(duration: Long): Long

    fun toSeconds(duration: Long): Long

    fun toMinutes(duration: Long): Long

    fun toHours(duration: Long): Long

    fun toDays(duration: Long): Long

}