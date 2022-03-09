package kz.home.ys.algo.medium.fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FourSumUsingInputArraySorting {

    // time - O(N^3)
    // space - O(N) - because sorting does take extra space
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (i != j - 1 && j > 1 && nums[j] == nums[j - 1]) continue;

                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        result.add(List.of(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        while (nums[l] == nums[l - 1] && l < r) l++;
                    } else if (sum > target) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return result;
    }
}