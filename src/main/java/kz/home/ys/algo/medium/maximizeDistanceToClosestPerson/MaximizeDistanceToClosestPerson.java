package kz.home.ys.algo.medium.maximizeDistanceToClosestPerson;

import java.util.Arrays;

class MaximizeDistanceToClosestPerson {

    // Time - O(N)
    // Space - O(N)
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int[] prefixes = new int[n];
        int[] suffixes = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (seats[i] == 0) {
                prefixes[i] = (i == 0 ? 0 : prefixes[i - 1]) + 1;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (seats[i] == 0) {
                suffixes[i] = (i == n - 1 ? 0 : suffixes[i + 1]) + 1;
            }
        }

        int result = 0;
        if (seats[0] == 0) {
            result = Math.max(result, suffixes[0]);
        }
        for (int i = 0; i < n; i++) {
            result = Math.max(result, Math.min(prefixes[i], suffixes[i]));
        }
        if (seats[n - 1] == 0) {
            result = Math.max(result, prefixes[n - 1]);
        }

        return result;
    }
}