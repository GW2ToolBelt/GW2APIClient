/*
 * Copyright (c) 2018-2025 Leon Linhart
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
/** Provides type-safe definitions for the objects returned by the Guild Wars 2 API. */
@SuppressWarnings("module")
module com.gw2tb.gw2api.client {

    requires transitive kotlin.stdlib;

    requires transitive com.gw2tb.gw2api.types;
    requires transitive kotlinx.coroutines.core;

    requires kotlinx.atomicfu;
    requires kotlinx.datetime;

    exports com.gw2tb.gw2api.client;
    exports com.gw2tb.gw2api.client.exceptions;
    exports com.gw2tb.gw2api.client.v1;
    exports com.gw2tb.gw2api.client.v2;

    exports com.gw2tb.gw2api.client.internal to
        com.gw2tb.gw2api.client.jdk11,
        com.gw2tb.gw2api.client.ktor;

    exports com.gw2tb.gw2api.client.internal.http to
        com.gw2tb.gw2api.client.jdk11,
        com.gw2tb.gw2api.client.ktor;

}