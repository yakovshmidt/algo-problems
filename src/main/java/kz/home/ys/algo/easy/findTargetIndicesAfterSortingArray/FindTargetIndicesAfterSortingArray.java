package kz.home.ys.algo.easy.findTargetIndicesAfterSortingArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        
        int firstFrequencyIdx = binarySearch(nums, target);

        if (firstFrequencyIdx == -1) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();

        int l = firstFrequencyIdx;
        while (l < nums.length && nums[l] == target) {
            result.add(l++);
        }

        return result;
    }

    private int binarySearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int leftmost = -1; 
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] > target) {
                r = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                leftmost = m;
                r = m - 1;
            }
        }

        return leftmost;
    }
}