package kz.home.ys.algo.medium.topKFrequentElements;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class TopKFrequentElementsWithMap {

    // time - O(N * N*log(K))
    // space - O(N + K)
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> valuesToFrequencies = new HashMap<>();
        Map<Integer, Set<Integer>> frequenciesToValues = new HashMap<>();

        int maxFrequency = 0;

        for (int num : nums) {
            int prevFrequency = valuesToFrequencies.getOrDefault(num, 0);
            int currFrequency = prevFrequency + 1;
            valuesToFrequencies.put(num, currFrequency);

            if (prevFrequency != 0) {
                frequenciesToValues.get(prevFrequency).remove(num);
                if (frequenciesToValues.get(prevFrequency).isEmpty()) frequenciesToValues.remove(prevFrequency);
            }
            Set<Integer> values = frequenciesToValues.getOrDefault(currFrequency, new HashSet<>());
            values.add(num);
            frequenciesToValues.put(currFrequency, values);

            maxFrequency = Math.max(maxFrequency, currFrequency);
        }

        int[] result = new int[k];
        int idx = 0;

        outer: while (true) {
            while (!frequenciesToValues.containsKey(maxFrequency)) {
                maxFrequency--;
            }
            for (int num : frequenciesToValues.get(maxFrequency)) {
                result[idx++] = num;
                if (--k <= 0) break outer;
            }

            maxFrequency--;
        }

        return result;
    }
}