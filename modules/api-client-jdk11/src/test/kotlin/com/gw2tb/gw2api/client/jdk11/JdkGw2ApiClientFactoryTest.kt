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
package com.gw2tb.gw2api.client.jdk11

import com.gw2tb.gw2api.client.v2.gw2v2Build
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class JdkGw2ApiClientFactoryTest {

    @Test
    fun testBuildGw2ApiClient() {
        buildGw2ApiClient {}
    }

    @Test
    fun testGw2ApiClient() {
        Gw2ApiClient()
    }

    @Test
    fun testExecute() {
        val client = Gw2ApiClient()
        val c = client.execute(gw2v2Build()).statusCode
        assertTrue(c >= 200 && (c < 400 || c == 429 || c >= 500))
    }

    @Test
    fun testExecuteAsync() = runBlocking {
        val client = Gw2ApiClient()
        val c = client.executeAsync(gw2v2Build()).statusCode
        assertTrue(c >= 200 && (c < 400 || c == 429 || c >= 500))
    }

}