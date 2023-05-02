package kz.home.ys.algo.easy.signOfTheProductOfAnArray;

class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        /* 
        
        Constraints:
        1 <= nums.length <= 1000
        -100 <= nums[i] <= 100
        
        Approach:
        Input: nums = [-1,-2,-3,-4,3,2,1]

        1. iterate over the array and check whether final number is positive, negative, or zero
        2. return the value

        time - O(N)
        space - O(1)

        */

        boolean isNegative = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) return 0;
            else if (nums[i] < 0) isNegative = !isNegative;
        }

        return isNegative ? -1 : 1;
    }
}