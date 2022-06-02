package kz.home.ys.algo.medium.arithmeticSlices;

class ArithmeticSlicesDP {
    
    // time - O(N)
    // space - O(1)
    public int numberOfArithmeticSlices(int[] nums) {
        int dp = 0;
        int result = 0;
        for (int r = 2; r < nums.length; r++) {
            boolean isArithmeticSlice = nums[r] - nums[r - 1] == nums[r - 1] - nums[r - 2];
            if (isArithmeticSlice) {
                dp = dp + 1;
                result += dp;
            } else {
                dp = 0;
            }
        }
        
        return result;
    }
}