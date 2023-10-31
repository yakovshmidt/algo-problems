package kz.home.ys.algo.medium.numberOfSubsequencesThatSatisfyTheGivenSumCondition;

import java.util.Arrays;

public class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {

    public int numSubseq(int[] nums, int target) {
        int answer = 0;
        int mod = 1_000_000_007;

        int[] power = new int[nums.length];
        power[0] = 1;
        for (int i = 1; i < power.length; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }

        // time - O(N*log(N))
        // space - O(N)
        Arrays.sort(nums);

        // time - O(N)
        // space - O(1)
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] + nums[r] <= target) {
                answer += power[r - l];
                answer %= mod;
                l++;
            } else {
                r--;
            }
        }
        return answer;
    }
}
