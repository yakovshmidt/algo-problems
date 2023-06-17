package kz.home.ys.algo.medium.binaryTreesWithFactors;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class BinaryTreesWithFactors {

    // time - O(N^2)
    // space - O(N)
    public int numFactoredBinaryTrees(int[] arr) {
        int mod = 1_000_000_007;
        int n = arr.length;
        Arrays.sort(arr);
        long[] dp = new long[arr.length];
        Arrays.fill(dp, 1);

        Map<Integer, Integer> valsToIndices = new HashMap<>();
        for (int i = 0; i < n; i++) {
            valsToIndices.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) { //4
            for (int j = 0; j < i; j++) { //2
                if (arr[i] % arr[j] == 0) {
                    int right = arr[i] / arr[j]; // 2
                    if (valsToIndices.containsKey(right)) {
                        dp[i] = (dp[i] + dp[j] * dp[valsToIndices.get(right)]) % mod;
                    }
                }
            }
        }

        long ans = 0;
        for (long x: dp) ans += x;
        return (int) (ans % mod);
    }
}