package kz.home.ys.algo.easy.sumOfAllSubsetXORTotals;

class SumOfAllSubsetXORTotalsLeetCode {

    public int subsetXORSum(int[] nums) {
        return calculateSubset(nums, 0, 0);
    }

    private int calculateSubset(int[] nums, int idx, int currentXor) {
        if (idx == nums.length) return currentXor;

        int withElement = calculateSubset(nums, idx + 1, currentXor ^ nums[idx]);
        int withoutElement = calculateSubset(nums, idx + 1, currentXor);

        return withElement + withoutElement;
    }
}