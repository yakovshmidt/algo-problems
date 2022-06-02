package kz.home.ys.algo.medium.arithmeticSlices;

class ArithmeticSlicesBruteForce {
    
    // time - O(N^3)
    // space - O(1)
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;
        
        int numberOfArithmeticSlices = 0;
        for (int l = 0; l < nums.length; l++) {  // time - O(N)
            if (nums.length - 1 - l < 2) break;
            for (int r = nums.length - 1; r >= 0; r--) {  // time - O(N)
                if (r - l < 2) break;
                boolean isArithmeticSlice = isArithmeticSlice(nums, l, r);  // time - O(N)
                if (isArithmeticSlice) numberOfArithmeticSlices++;
            }
        }
        
        return numberOfArithmeticSlices;
    }
    
    private boolean isArithmeticSlice(int[] nums, int l, int r) {
        int diff = nums[r] - nums[r - 1];
        r--;
        while (l < r) {
            if (nums[r] - nums[r - 1] != diff) return false;
            r--;
        }
        return true;
    }
}