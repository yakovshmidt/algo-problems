package kz.home.ys.algo.medium.uglyNumberII;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class UglyNumberIIUsingBacktracking {
    public int nthUglyNumber(int n) {
        int[] nums = new int[1690];
        nums[0] = 1;
        int ugly, i2 = 0, i3 = 0, i5 = 0;

        for (int i = 1; i < 1690; i++) {
            ugly = Math.min(nums[i2] * 2, Math.min(nums[i3] * 3, nums[i5] * 5));
            nums[i] = ugly;

            if (ugly == nums[i2] * 2) i2++;
            if (ugly == nums[i3] * 3) i3++;
            if (ugly == nums[i5] * 5) i5++;
        }

        return nums[n - 1];
    }
}