package kz.home.ys.algo.easy.degreeOfAnArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DegreeOfAnArray {

    // time - O(N)
    // space - O(N)
    public int findShortestSubArray(int[] nums) {
        Map<Integer, List<Integer>> valuesToIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            valuesToIndices.putIfAbsent(nums[i], new ArrayList<>());
            valuesToIndices.get(nums[i]).add(i);
        }

        List<Integer> valuesWithMaxFrequency = new ArrayList<>();
        int maxFrequency = 0;
        for (var entry : valuesToIndices.entrySet()) {
            int currFrequency = entry.getValue().size();
            if (currFrequency > maxFrequency) {
                valuesWithMaxFrequency.clear();
                valuesWithMaxFrequency.add(entry.getKey());
                maxFrequency = currFrequency;
            } else if (currFrequency == maxFrequency) {
                valuesWithMaxFrequency.add(entry.getKey());
            }
        }

        int minSubarraySize = Integer.MAX_VALUE;
        for (int value : valuesWithMaxFrequency) {
            List<Integer> indices = valuesToIndices.get(value);
            minSubarraySize = Math.min(minSubarraySize, indices.get(indices.size() - 1) - indices.get(0) + 1);
        }
        return minSubarraySize;
    }
}