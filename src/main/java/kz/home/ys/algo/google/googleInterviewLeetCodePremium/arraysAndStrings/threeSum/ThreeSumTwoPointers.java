package kz.home.ys.algo.google.googleInterviewLeetCodePremium.arraysAndStrings.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSumTwoPointers {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r] + nums[i];
                if ((l > i + 1 && nums[l] == nums[l - 1]) || sum < 0) {
                    l++;
                } else if ((r < nums.length - 1 && nums[r] == nums[r + 1]) || sum > 0) {
                    r--;
                } else {
                    result.add(List.of(nums[i], nums[l], nums[r]));

                    l++;
                    r--;
                }
            }
        }

        return result;
    }
}