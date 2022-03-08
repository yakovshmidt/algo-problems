package kz.home.ys.algo.medium.threeSumClosest;

import java.util.Arrays;

class ThreeSumClosestUsingInputArraySorting {

    // time - O(Nlog(N)) + O(N^2) -> O(N^2)
    // space - O(N) - because sorting does take extra space
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int bestSum = 100000;  // because of constraints
        for (int i = 0; i < nums.length - 2; i++) {
            
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) return sum;
                
                if (Math.abs(target - sum) < Math.abs(target - bestSum)) bestSum = sum;
                
                if (sum <= target) {
                    l++;
                    while (nums[l - 1] == nums[l] && l < r) l++;
                } else {
                    r--;
                }
            }
        }
        
        return bestSum;
    }
}