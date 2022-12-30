package kz.home.ys.algo.easy.loggerRateLimiter;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoggerRateLimiterTest {

    @Test
    public void testShouldPrintMessage() {
        LoggerRateLimiter loggerRateLimiter = new LoggerRateLimiter();

        assertTrue(loggerRateLimiter.shouldPrintMessage(1, "foo"));
        assertTrue(loggerRateLimiter.shouldPrintMessage(2, "bar"));
        assertFalse(loggerRateLimiter.shouldPrintMessage(3, "bar"));
        assertFalse(loggerRateLimiter.shouldPrintMessage(8, "bar"));
        assertFalse(loggerRateLimiter.shouldPrintMessage(10, "foo"));
        assertTrue(loggerRateLimiter.shouldPrintMessage(11, "foo"));
    }
}