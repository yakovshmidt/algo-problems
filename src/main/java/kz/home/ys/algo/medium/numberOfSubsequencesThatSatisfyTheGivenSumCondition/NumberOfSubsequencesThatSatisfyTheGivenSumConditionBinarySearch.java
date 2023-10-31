package kz.home.ys.algo.medium.numberOfSubsequencesThatSatisfyTheGivenSumCondition;

import java.util.Arrays;

class NumberOfSubsequencesThatSatisfyTheGivenSumConditionBinarySearch {

    public int numSubseq(int[] nums, int target) {
        int answer = 0;
        int mod = 1_000_000_007;

        int[] power = new int[nums.length];
        power[0] = 1;
        for (int i = 1; i < power.length; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }

        Arrays.sort(nums);

        for (int l = 0; l < nums.length; l++) {
            int r = binarySearch(nums, target - nums[l]) - 1;
            if (r >= l) {
                answer += power[r - l];
                answer %= mod;
            }
        }
        return answer;
    }

    private int binarySearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}