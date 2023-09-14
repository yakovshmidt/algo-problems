package kz.home.ys.algo.medium.maximumSumObtainedOfAnyPermutation;

import java.util.Arrays;

class MaximumSumObtainedOfAnyPermutation {

    // time - O(N*log(N))
    // space - O(N)
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        long mod = 1_000_000_007;
        int[] frequencies = new int[nums.length + 1];
        for (int[] request : requests) {
            frequencies[request[0]]++;
            frequencies[request[1] + 1]--;
        }

        long[] arr = new long[nums.length];
        long curr = 0;
        for (int i = 0; i < arr.length; i++) {
            curr += frequencies[i];
            arr[i] = curr;
        }

        Arrays.sort(arr);
        Arrays.sort(nums);

        long ans = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans = (ans + arr[i] * (long)nums[i]) % mod;
        }
     

        return (int) ans;
    }
}