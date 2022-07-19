/*
 * Copyright (c) 2018-2022 Leon Linhart
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

import com.gw2tb.gw2api.client.internal.InternalGW2APIClientApi
import com.gw2tb.gw2api.client.internal.currentTimeMillis
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.math.min

/**
 * TODO doc
 *
 * @since   0.1.0
 */
public interface RateLimiter {

    public suspend fun acquire() {
        acquire(permits = 1)
            .onEach { permits -> check(permits == 1) { "Unexpected number of permits granted. Expected 1, got $permits" } }
            .collect()
    }

    public fun acquire(permits: Int): Flow<Int>

    @InternalGW2APIClientApi
    public suspend fun penalize()

}

public class TokenBucketRateLimiter(
    private val bucketSize: Int = 300,
    private val refillMillis: Long = 1000L * 60
) : RateLimiter {

    private var currentPermits: Int = 0
    private var nextInterval: Long = 0L
    private var inCurrent: Boolean = false

    private val mutex = Mutex()
    private val penalties: MutableSharedFlow<Long> = MutableSharedFlow()

    override fun acquire(permits: Int): Flow<Int> {
        require(permits > 0)

        return flow {
            var remainingPermits: Int = permits
            var grantedPermits: Int

            val sleepTime = mutex.withLock {
                val now = currentTimeMillis()

                if (now > nextInterval) {
                    nextInterval = now + refillMillis
                    currentPermits = bucketSize
                    inCurrent = true
                }

                grantedPermits = min(currentPermits, remainingPermits)
                remainingPermits -= grantedPermits

                currentPermits -= grantedPermits

                val sleepTime = if (inCurrent) 0L else nextInterval - now

                if (currentPermits == 0) {
                    if (!inCurrent) nextInterval += refillMillis

                    val requiredIntervals = remainingPermits / bucketSize

                    nextInterval += requiredIntervals * refillMillis
                    currentPermits = bucketSize - (remainingPermits % bucketSize)
                    inCurrent = false
                }

                sleepTime
            }

            tailrec suspend fun delayWithPenalty(timeMillis: Long) {
                if (timeMillis == 0L) return

                var penalty = 0L

                withTimeoutOrNull(timeMillis) {
                    penalties
                        .onEach { penalty += it }
                        .launchIn(this)
                }

                if (penalty > 0L)
                    delayWithPenalty(penalty)
            }

            delayWithPenalty(timeMillis = sleepTime)
            emit(grantedPermits)

            while (remainingPermits > 0) {
                grantedPermits = min(remainingPermits, bucketSize)
                remainingPermits -= grantedPermits

                delayWithPenalty(timeMillis = refillMillis)
                emit(grantedPermits)
            }
        }
    }

    @InternalGW2APIClientApi
    override suspend fun penalize() {
        val refillSeconds = refillMillis * 60
        val refillSecondsPerPermit = refillSeconds / bucketSize

        val penaltySeconds = refillSecondsPerPermit / 2
        val penaltyMillis = penaltySeconds / 1000

        mutex.withLock {
            nextInterval += penaltyMillis
            penalties.emit(penaltyMillis)
        }
    }

}