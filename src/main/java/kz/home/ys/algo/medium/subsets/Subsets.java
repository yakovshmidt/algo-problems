package kz.home.ys.algo.medium.subsets;

import java.util.ArrayList;
import java.util.List;

class Subsets {
    
    // time - O(N * 2^N) - because there is two paths 0 or 1 on each step
    // space - O(N)
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        
        subsets(nums, subsets, 0, subset);
        
        return subsets;
    }
    
    private void subsets(int[] nums, 
                         List<List<Integer>> subsets,
                         int curr,
                         List<Integer> subset) {
        subsets.add(new ArrayList<>(subset));
        
        for (int i = curr; i < nums.length; i++) {
            subset.add(nums[i]);
            subsets(nums, subsets, i + 1, subset);
            subset.remove(subset.size() - 1);
        }
    }
}