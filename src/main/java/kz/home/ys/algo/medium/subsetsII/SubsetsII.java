package kz.home.ys.algo.medium.subsetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SubsetsII {

    // time - O(N*log(N)*2^N) -> O(2^N)
    // space - O(N)
    public List<List<Integer>> subsetsWithoutDuplicates(int[] nums) {
        Arrays.sort(nums);  // time - O(N*log(N))
        List<List<Integer>> subsets = new ArrayList<>();
        subsets(nums, subsets, 0, new ArrayList<>());
        return subsets;
    }

    private void subsets(int[] nums,
                         List<List<Integer>> subsets,
                         int curr,
                         List<Integer> subset) {
        subsets.add(new ArrayList<>(subset));

        // time - O(N * 2^N)
        for (int i = curr; i < nums.length; i++) {
            if (i > curr && nums[i] == nums[i - 1]) continue;
            subset.add(nums[i]);
            subsets(nums, subsets, i + 1, subset);
            subset.remove(subset.size() - 1);
        }
    }
}