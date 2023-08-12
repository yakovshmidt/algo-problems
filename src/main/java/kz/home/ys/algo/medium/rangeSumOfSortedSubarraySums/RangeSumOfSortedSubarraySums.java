package kz.home.ys.algo.medium.rangeSumOfSortedSubarraySums;

import java.util.Arrays;

class RangeSumOfSortedSubarraySums {

    private static final int MOD = 1_000_000_007;

    public int rangeSum(int[] nums, int n, int left, int right) {
        /*

        Approach:
        1) using sliding window get all the possible combinations -> O(N^2)
        2) sort gotten array -> O(N*Log(N))
        3) iterate from left to right -> O(RIGHT - LEFT)

        time - O(N^2)
        space - O(N * (N + 1 ) / 2)

        */

        int idx = 0;
        int[] sums = new int[n * (n + 1) / 2];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                sums[idx++] = sum;
            }
        }

        Arrays.sort(sums);

        int result = 0;
        for (int i = left; i <= right; i++) {
            result += sums[i - 1];
            result %= MOD;
        }

        return result;
    }
}