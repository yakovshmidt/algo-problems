package kz.home.ys.algo.easy.loggerRateLimiter;

import java.util.HashMap;
import java.util.Map;

class LoggerRateLimiter {

    private final Map<String, Integer> messageToTimestamp;

    public LoggerRateLimiter() {
        messageToTimestamp = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (messageToTimestamp.containsKey(message)) {
            if (timestamp >= messageToTimestamp.get(message)) {
                messageToTimestamp.put(message, timestamp + 10);

                return true;
            } else {
                return false;
            }
        } else {
            messageToTimestamp.put(message, timestamp + 10);

            return true;
        }
    }
}