package kz.home.ys.algo.medium.longestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.List;

class LongestIncreasingSubsequenceBST {

    // time - O(N*Log(N))
    // space - O(N)
    public int lengthOfLIS(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
        
        for (int i = 1; i < nums.length; i++) {
            int index = bst(ans, nums[i]);
            if (index < ans.size()) {
                ans.set(index, nums[i]);
            } else {
                ans.add(nums[i]);
            }
        }
        
        return ans.size();
    }
    
    private int bst(List<Integer> ans, int num) {
        int low = 0;
        int high = ans.size() - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ans.get(mid) >= num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }
}