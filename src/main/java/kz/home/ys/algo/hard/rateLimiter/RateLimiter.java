package kz.home.ys.algo.hard.rateLimiter;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimiter {

    private int rateLimit;
    private final Map<String, LinkedList<Request>> userRequestMap = new ConcurrentHashMap<>();

    public boolean hit(String user, Instant timestamp) {
        synchronized (user) {
            if (!userRequestMap.containsKey(user)) {
                return addNewUser(user);
            } else {
                if (getTotalElapsedRequests(user) < rateLimit) {
                    userRequestMap.get(user).add(new Request(timestamp, 1));
                    return true;
                } else {
                    boolean actionTaken = false;
                    for (int i = 0; i < userRequestMap.get(user).size(); i++) {
                        Duration duration = Duration.between(timestamp, userRequestMap.get(user).get(i).timestamp);
                        if (duration.getSeconds() >= 60) {
                            userRequestMap.get(user).remove(i);
                            actionTaken = true;
                        } else {
                            break;
                        }
                    }

                    if (actionTaken) {
                        userRequestMap.get(user).add(new Request(timestamp, 1));
                        return true;
                    }

                    return false;
                }
            }
        }
    }

    private boolean addNewUser(String user) {
        userRequestMap.put(user, new LinkedList<>());
        userRequestMap.get(user).add(new Request(Instant.now(), 1));
        return true;
    }

    private int getTotalElapsedRequests(String user) {
        return userRequestMap.get(user).stream().mapToInt(r -> r.count).sum();
    }

    public static class Request {
        public Instant timestamp;
        public int count;

        public Request(Instant timestamp, int count) {
            this.timestamp = timestamp;
            this.count = count;
        }
    }
}
