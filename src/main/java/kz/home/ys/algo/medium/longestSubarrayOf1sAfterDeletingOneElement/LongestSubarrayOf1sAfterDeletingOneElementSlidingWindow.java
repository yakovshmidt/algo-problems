package kz.home.ys.algo.medium.longestSubarrayOf1sAfterDeletingOneElement;

class LongestSubarrayOf1sAfterDeletingOneElementSlidingWindow {

    // time - O(N)
    // space - O(N)
    public int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int l = 0;
        int r = 0;
        int max = Integer.MIN_VALUE;
        while (r < nums.length) {
            int right = nums[r];
            if (right == 0) zeroCount++;
            r++;
            while (l < r && zeroCount > 1) {
                int left = nums[l];
                if (left == 0) zeroCount--;
                l++;
            }
            max = Math.max(max, r - l - 1);
        }
        return max;
    }
}