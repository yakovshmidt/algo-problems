package kz.home.ys.algo.medium.longestSubarrayOf1sAfterDeletingOneElement;

class LongestSubarrayOf1sAfterDeletingOneElement {

    // time - O(N)
    // space - O(N)
    public int longestSubarray(int[] nums) {
        if (nums.length == 1) return 0;

        int[] prefix = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (i == 0) {
                    prefix[i] = 1;
                } else if (nums[i] == nums[i - 1]) {
                    prefix[i] = prefix[i - 1] + 1;
                } else {
                    prefix[i] = 1;
                }
            } else {
                prefix[i] = 0;
            } 
        }

        int[] postfix = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 1) {
                if (i == nums.length - 1) {
                    postfix[i] = 1;
                } else if (nums[i] == nums[i + 1]) {
                    postfix[i] = postfix[i + 1] + 1;
                } else {
                    postfix[i] = 1;
                }
            } else {
                postfix[i] = 0;
            } 
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int pref = (i - 1 >= 0) ? prefix[i - 1] : 0;
            int post = (i + 1 < nums.length) ? postfix[i + 1] : 0;
            maxSum = Math.max(maxSum, pref + post);
        }

        return maxSum;
    }
}