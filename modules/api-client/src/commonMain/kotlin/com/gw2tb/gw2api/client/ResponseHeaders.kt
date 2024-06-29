/*
 * Copyright (c) 2018-2024 Leon Linhart
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

import kotlin.jvm.JvmInline

/**
 * The headers of a Response.
 *
 * @since   0.4.0
 */
@JvmInline
public value class ResponseHeaders(
    private val headers: Map<String, List<String>>
) : Map<String, List<String>> by headers {

    public companion object {

        /**
         * The `x-page-size` header.
         *
         * @since   0.4.0
         */
        public const val X_PAGE_SIZE: String = "x-page-size"

        /**
         * The `x-page-total` header.
         *
         * @since   0.4.0
         */
        public const val X_PAGE_TOTAL: String = "x-page-total"

    }

    /**
     * Returns the page size or `null` if it could not be parsed from the [X_PAGE_SIZE] header.
     *
     * @since   0.4.0
     */
    public val pageSizeOrNull: Int?
        get() = this[X_PAGE_SIZE]?.singleOrNull()?.toIntOrNull()

    /**
     * Returns the total number of pages or `null` if it could not be parsed from the [X_PAGE_TOTAL] header.
     *
     * @since   0.4.0
     */
    public val pageTotalOrNull: Int?
        get() = this[X_PAGE_SIZE]?.singleOrNull()?.toIntOrNull()

}