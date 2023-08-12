package kz.home.ys.algo.easy.rangeSumQueryImmutable;

import kz.home.ys.algo.helper.Pair;

import java.util.HashMap;
import java.util.Map;

class RangeSumQueryImmutable {

    private final int[] sum;

    public RangeSumQueryImmutable(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return sum[right + 1] - sum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */