package kz.home.ys.algo.medium.randomPickIndex;

import java.util.*;

class RandomPickIndex {

    private final Map<Integer, List<Integer>> valueToIndices = new HashMap<>();
    private final Random random = new Random();

    // time - O(N*log(N))
    // space - O(N)
    public RandomPickIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            valueToIndices.putIfAbsent(nums[i], new ArrayList<>());
            valueToIndices.get(nums[i]).add(i);
        }
    }
    

    public int pick(int target) {
        List<Integer> indices = valueToIndices.get(target);
        if (indices.size() == 1) {
            return indices.get(0);
        }
        return indices.get(randomIdxInRange(indices.size() - 1));
    }

    private int randomIdxInRange(int max) {
        return random.nextInt(max);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */