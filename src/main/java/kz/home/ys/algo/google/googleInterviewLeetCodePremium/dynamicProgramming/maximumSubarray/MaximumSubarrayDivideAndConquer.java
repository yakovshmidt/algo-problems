package kz.home.ys.algo.google.googleInterviewLeetCodePremium.dynamicProgramming.maximumSubarray;

class MaximumSubarrayDivideAndConquer {

    // time - O(N * log(N))
    // space - O(log(N))
    public int maxSubArray(int[] nums) {
        return maxSubArray(nums, 0, nums.length - 1);
    }
    
    private int maxSubArray(int[] nums, int startIdx, int endIdx) {
        if (startIdx > endIdx) return Integer.MIN_VALUE;
        
        int mid = Math.floorDiv(startIdx + endIdx, 2);
        
        int currSum = 0;
        int leftMaxSum = 0;
        for (int i = mid - 1; i >= 0; i--) {
            currSum += nums[i];
            leftMaxSum = Math.max(leftMaxSum, currSum);
        }
        
        currSum = 0;
        int rightMaxSum = 0;
        for (int i = mid + 1; i < nums.length; i++) {
            currSum += nums[i];
            rightMaxSum = Math.max(rightMaxSum, currSum);
        }
        
        int currentMaxSubArray = rightMaxSum + leftMaxSum + nums[mid];
        
        int leftMaxSubArray = maxSubArray(nums, startIdx, mid - 1);
        int rightMaxSubArray = maxSubArray(nums, mid + 1, endIdx);
        
        return Math.max(currentMaxSubArray, Math.max(leftMaxSubArray, rightMaxSubArray));
    }
}