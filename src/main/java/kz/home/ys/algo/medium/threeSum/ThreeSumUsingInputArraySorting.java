package kz.home.ys.algo.medium.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSumUsingInputArraySorting {

    // time - O(Nlog(N)) + O(N^2) -> O(N^2)
    // space - O(N) - because sorting does take extra space
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];

            if (i > 0 && first == nums[i - 1]) continue;

            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int second = nums[l];
                int third = nums[r];
                int sum = first + second + third;
                if (sum < 0) {
                    l++;
                } else if (sum > 0) {
                    r--;
                } else {
                    result.add(List.of(first, second, third));
                    l++;
                    while (nums[l] == nums[l - 1] && l < r) l++;
                }
            }
        }
        return result;
    }
}