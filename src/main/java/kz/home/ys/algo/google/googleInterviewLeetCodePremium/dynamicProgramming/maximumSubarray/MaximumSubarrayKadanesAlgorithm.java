package kz.home.ys.algo.google.googleInterviewLeetCodePremium.dynamicProgramming.maximumSubarray;

class MaximumSubarrayKadanesAlgorithm {

    // time - O(N)
    // space - O(1)
    public int maxSubArray(int[] nums) {
        // Kadane's algo
        
        int totalMax = nums[0];
        int maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            maxSoFar = Math.max(num, maxSoFar + num);
            totalMax = Math.max(totalMax, maxSoFar);
        }
        
        return totalMax;
    }
}