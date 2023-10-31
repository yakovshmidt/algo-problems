package kz.home.ys.algo.easy.missingRanges;

import java.util.ArrayList;
import java.util.List;

class MissingRanges {

    // time - O(N)
    // space - O(1) if we ignore space for input and output
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        if (nums.length == 0) {
            return List.of(List.of(lower, upper));
        }
        
        List<List<Integer>> result = new ArrayList<>();
        int start = nums[0];
        if (lower < start) {
            result.add(List.of(lower, start - 1));
        }
        
        for (int i = 0; i < nums.length - 1; i++) {
            int left = nums[i];
            int right = nums[i + 1];
            if (left + 1 != right) {
                result.add(List.of(left + 1, right - 1));
            }
        }
        
        int end = nums[nums.length - 1];
        if (end < upper) {
            result.add(List.of(end + 1, upper));
        }
        
        return result;
    }
}