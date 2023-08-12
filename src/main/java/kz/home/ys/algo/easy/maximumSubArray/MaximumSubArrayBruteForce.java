package kz.home.ys.algo.easy.maximumSubArray;

class MaximumSubArrayBruteForce {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum = nums[i];
            maxSum = Math.max(maxSum, currSum);
            for (int j = i + 1; j < nums.length; j++) {
                currSum += nums[j];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
}