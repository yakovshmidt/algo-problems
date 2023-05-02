package kz.home.ys.algo.medium.deleteAndEarn;

import java.util.HashMap;
import java.util.Map;

class DeleteAndEarnRecursive {

    private final Map<Integer, Integer> points = new HashMap<>();
    private final Map<Integer, Integer> cache = new HashMap<>();

    // time - O(N)
    // space - O(N)
    public int deleteAndEarn(int[] nums) {
        int maxNumber = 0;

        for (int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNumber = Math.max(maxNumber, num);
        }

        return maxPoints(maxNumber);
    }

    private int maxPoints(int num) {
        if (num == 0) return 0;
        if (num == 1) return points.getOrDefault(num, 0);
        if (cache.containsKey(num)) return cache.get(num);

        int gain = points.getOrDefault(num, 0);
        cache.put(num, Math.max(maxPoints(num - 1), maxPoints(num - 2) + gain));
        return cache.get(num);
    }
}