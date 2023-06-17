package kz.home.ys.algo.easy.maximumProductOfThreeNumbers;

import java.util.Arrays;

class MaximumProductOfThreeNumbers {

    // time - O(N*Log(N))
    // space - O(1) or O(N) - depends on sorting algo implementation
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                max = Math.max(max, nums[i] * nums[l] * nums[r]);
                l++;
                r--;
            }
        }
        return max;
    }
}