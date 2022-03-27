package kz.home.ys.algo.easy.maximumSubArray;

class MaximumSubArray {

    // Kadane's algorithm
    // time - O(N)
    // space - O(1)
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;
        for (int num : nums) {
            localMax = Math.max(num, num + localMax);
            if (localMax > globalMax) {
                globalMax = localMax;
            }
        }
        return globalMax;
    }
}