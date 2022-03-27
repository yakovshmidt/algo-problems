package kz.home.ys.algo.easy.containsDuplicate;

import java.util.Arrays;

class ContainsDuplicateViaSorting {
    
    // time - O(N * log(N))
    // space - O(1)
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) return false;
        
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}