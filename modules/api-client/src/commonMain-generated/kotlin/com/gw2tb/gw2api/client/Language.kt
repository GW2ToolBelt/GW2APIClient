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
package com.gw2tb.gw2api.client

/**
 * A languages supported by the Guild Wars 2 API.
 *
 * @param code the code for the language
 *
 * @since   0.1.0
 */
public enum class Language(public val code: String) {
    CHINESE("zh"),
    ENGLISH("en"),
    FRENCH("fr"),
    GERMAN("de"),
    SPANISH("es");

    public companion object {
        /**
         * The languages supported by V1 of the Guild Wars 2 API.
         *
         * @since  0.3.0
         */
        public val API_V1: Set<Language> = setOf(ENGLISH, FRENCH, GERMAN, SPANISH)
        /**
         * The languages supported by V2 of the Guild Wars 2 API.
         *
         * @since  0.1.0
         */
        public val API_V2: Set<Language> = setOf(CHINESE, ENGLISH, FRENCH, GERMAN, SPANISH)
    }
}