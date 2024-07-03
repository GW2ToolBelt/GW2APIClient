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

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.math.min
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.minutes
import kotlin.time.TimeSource
import kotlin.time.times

/**
 * A `RateLimiter` provides logic necessary to limit the rate of execution of any sort of requests. For this purpose, a
 * rate limiter distributes permits at a configurable rate. Permits can be acquired and do not have to be released.
 *
 * `RateLimiter` implementations must specify the algorithms and configurations they use for distributing permits. This
 * interface does not provide any guarantees about fairness but implementations may choose to.
 *
 * @since   0.1.0
 */
public interface RateLimiter {

    /**
     * Suspends the coroutine until a single permit was acquired.
     *
     * @since   0.4.0
     */
    public suspend fun acquire() {
        acquire(permits = 1)
            .onEach { permits -> check(permits == 1) { "Unexpected number of permits granted. Expected 1, got $permits" } }
            .collect()
    }

    /**
     * Returns a flow that emits the number of granted permits in intervals until all requested [permits] have been
     * granted.
     *
     * @since   0.4.0
     */
    public fun acquire(permits: Int): Flow<Int>

    /**
     * Applies a penalty to this rate limiter for hitting the limit.
     *
     * @since   0.4.0
     */
    public suspend fun penalize()

}

/**
 * A [RateLimiter] implementation that uses the token bucket algorithm.
 *
 * @param bucketSize        the size of the bucket
 * @param refillDuration    the maximum time until the bucket is filled after being fully depleted
 *
 * @since   0.4.0
 */
public class TokenBucketRateLimiter(
    private val bucketSize: Int = 300,
    private val refillDuration: Duration = 1.minutes
) : RateLimiter {

    private var currentPermits: Int = 0
    private var nextInterval: TimeSource.Monotonic.ValueTimeMark = TimeSource.Monotonic.markNow()
    private var inCurrent: Boolean = false

    private val mutex = Mutex()
    private val penalties: MutableSharedFlow<Duration> = MutableSharedFlow()

    override fun acquire(permits: Int): Flow<Int> {
        require(permits > 0)

        return flow {
            var remainingPermits: Int = permits
            var grantedPermits: Int

            val sleepTime = mutex.withLock {
                val now = TimeSource.Monotonic.markNow()

                if (now > nextInterval) {
                    nextInterval = TimeSource.Monotonic.markNow() + refillDuration
                    currentPermits = bucketSize
                    inCurrent = true
                }

                grantedPermits = min(currentPermits, remainingPermits)
                remainingPermits -= grantedPermits

                currentPermits -= grantedPermits

                val sleepTime = if (inCurrent) Duration.ZERO else (nextInterval - now).absoluteValue

                if (currentPermits == 0) {
                    if (!inCurrent) nextInterval += refillDuration

                    val requiredIntervals = remainingPermits / bucketSize

                    nextInterval += requiredIntervals * refillDuration
                    currentPermits = bucketSize - (remainingPermits % bucketSize)
                    inCurrent = false
                }

                sleepTime
            }

            tailrec suspend fun delayWithPenalty(duration: Duration) {
                if (!duration.isPositive()) return

                var penalty = Duration.ZERO

                withTimeoutOrNull(duration) {
                    penalties
                        .onEach { penalty += it }
                        .launchIn(this)
                }

                if (penalty.isPositive())
                    delayWithPenalty(penalty)
            }

            delayWithPenalty(duration = sleepTime)
            emit(grantedPermits)

            while (remainingPermits > 0) {
                grantedPermits = min(remainingPermits, bucketSize)
                remainingPermits -= grantedPermits

                delayWithPenalty(duration = refillDuration)
                emit(grantedPermits)
            }
        }
    }

    override suspend fun penalize() {
        val refillSeconds = refillDuration * 60
        val refillSecondsPerPermit = refillSeconds / bucketSize

        val penaltySeconds = refillSecondsPerPermit / 2
        val penaltyMillis = penaltySeconds / 1000

        mutex.withLock {
            nextInterval += penaltyMillis
            penalties.emit(penaltyMillis)
        }
    }

}