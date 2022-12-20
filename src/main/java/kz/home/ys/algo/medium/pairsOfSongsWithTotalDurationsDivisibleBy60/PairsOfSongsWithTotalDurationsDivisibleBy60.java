package kz.home.ys.algo.medium.pairsOfSongsWithTotalDurationsDivisibleBy60;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class PairsOfSongsWithTotalDurationsDivisibleBy60 {

    // time - O(log(N) * O(M)) - where N is length of TreeSet and M is length of time input array
    // space - O(N + M)
    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> timeToCount = createTimeToCount(time);
        TreeSet<Integer> higherValues = createHigherTime();

        int result = 0;
        for (int curr : time) {
            timeToCount.put(curr, timeToCount.get(curr) - 1);
            int higher = higherValues.higher(curr);
            int searchingValue = higher - curr;
            while (searchingValue <= 500) {
                if (timeToCount.containsKey(searchingValue) && timeToCount.get(searchingValue) > 0) {
                    result += timeToCount.get(searchingValue);
                }
                searchingValue += 60;
            }
        }
        return result;
    }

    private TreeSet<Integer> createHigherTime() {
        TreeSet<Integer> higherTime = new TreeSet<>();
        higherTime.add(60);
        higherTime.add(120);
        higherTime.add(180);
        higherTime.add(240);
        higherTime.add(300);
        higherTime.add(360);
        higherTime.add(420);
        higherTime.add(480);
        higherTime.add(540);
        return higherTime;
    }

    private Map<Integer, Integer> createTimeToCount(int[] time) {
        Map<Integer, Integer> timeToCount = new HashMap<>();
        for (int curr : time) {
            timeToCount.put(curr, timeToCount.getOrDefault(curr, 0) + 1);
        }
        return timeToCount;
    }
}