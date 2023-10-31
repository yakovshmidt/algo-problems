package kz.home.ys.algo.hard.minimumCostToMakeArrayEqual;

import java.math.BigDecimal;
import java.math.BigInteger;

class Solution {
    public long minCost(int[] nums, int[] cost) {
        long min = Long.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, calculateCost(i, nums, cost));
        }
        return min;
    }

    private long calculateCost(int idx, int[] nums, int[] cost) {
        BigDecimal currCost = new BigDecimal(0);
        for (int i = 0; i < nums.length; i++) {
            if (idx == i) continue;
            currCost.add(new BigDecimal((long) (Math.abs(nums[idx] - nums[i]) * cost[i])));
        }
        return Long.valueOf(currCost.toString());
    }
}