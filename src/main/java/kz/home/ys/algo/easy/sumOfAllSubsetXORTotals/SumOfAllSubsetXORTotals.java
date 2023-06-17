package kz.home.ys.algo.easy.sumOfAllSubsetXORTotals;

import java.util.LinkedList;

class SumOfAllSubsetXORTotals {

    private int result = 0;

    public int subsetXORSum(int[] nums) {
        LinkedList<Integer> subset = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            subset.addLast(nums[i]);
            calculateSubset(subset, nums, i + 1);
            subset.removeLast();
        }
        return result;
    }

    private void calculateSubset(LinkedList<Integer> subset, int[] nums, int idx) {
        int curr = subset.getFirst();
        for (int i = 1; i < subset.size(); i++) {
            curr ^= subset.get(i);
        }
        result += curr;
        
        for (int i = idx; i < nums.length; i++) {
            subset.addLast(nums[i]);
            calculateSubset(subset, nums, i + 1);
            subset.removeLast();
        }
    }
}