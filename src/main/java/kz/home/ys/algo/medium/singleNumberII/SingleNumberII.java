package kz.home.ys.algo.medium.singleNumberII;

import java.util.Arrays;

class SingleNumberII {

    // time - O(N*Log(N))
    // space - O(N)
    public int singleNumber(int[] nums) {
        if (nums.length < 3) return nums[0];

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 3) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}