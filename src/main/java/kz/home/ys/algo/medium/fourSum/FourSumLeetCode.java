package kz.home.ys.algo.medium.fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FourSumLeetCode {

    // time - O(N^(k - 1)) - where k is number of elements to sum up
    // space - O(N) -> space is O(k) where k in the worst case is N
    public List<List<Integer>> kSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, target, 4, 0);
    }

    private List<List<Integer>> kSum(int[] nums, long target, int k, int idx) {
        List<List<Integer>> res = new ArrayList<>();

        if (nums.length - idx < k) return res;

        if (k == 2) return twoSum(nums, target, idx);

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i - 1] == nums[i]) continue;

            for (List<Integer> subset : kSum(nums, target - nums[i], k - 1, i + 1)) {
                res.add(new ArrayList<>(List.of(nums[i])));
                res.get(res.size() - 1).addAll(subset);
            }
        }

        return res;
    }

    private List<List<Integer>> twoSum(int[] nums, long target, int idx) {
        List<List<Integer>> res = new ArrayList<>();
        int l = idx;
        int r = nums.length - 1;

        while (l < r) {
            int twoSum = nums[l] + nums[r];
            if (twoSum < target || (l > idx && nums[l] == nums[l - 1])) l++;
            else if (twoSum > target || (r < nums.length - 1 && nums[r] == nums[r + 1])) r--;
            else {
                res.add(Arrays.asList(nums[l++], nums[r--]));
            }
        }

        return res;
    }
}
