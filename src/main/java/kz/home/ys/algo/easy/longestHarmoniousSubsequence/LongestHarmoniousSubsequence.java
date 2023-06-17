package kz.home.ys.algo.easy.longestHarmoniousSubsequence;

import java.util.Arrays;

class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int prevCount = 1;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (i > 0 && nums[i] - nums[i - 1] == 1) {
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    count++;
                    i++;
                }
                max = Math.max(max, count + prevCount);
                prevCount = count;
            } else {
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    count++;
                    i++;
                }
                prevCount = count;
            }
        }
        return max;
    }
}