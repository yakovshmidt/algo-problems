package kz.home.ys.algo.easy.missingNumber;

import java.util.Arrays;

class MissingNumberUsingSorting {

    // time - O(N*log(N))
    // space - O(1) - if we do not consider extra space for sorting
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int idx;
        for (idx = 0; idx < nums.length; idx++) {
            if (idx != nums[idx]) return idx;
        }
        return idx;
    }
}