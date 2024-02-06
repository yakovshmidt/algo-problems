package kz.home.ys.algo.medium.platesBetweenCandles;

import java.util.Arrays;

class PlatesBetweenCandles {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int[] prefixSum = new int[s.length() + 1];
        int[] next = new int[s.length() + 1];
        int[] prev = new int[s.length() + 1];
        Arrays.fill(next, Integer.MAX_VALUE);
        int[] result = new int[queries.length];
        for (int i = 0; i < s.length(); i++) {
            prefixSum[i + 1] = prefixSum[i] + (s.charAt(i) == '|' ? 1 : 0);
            prev[i + 1] = s.charAt(i) == '|' ? i : prev[i];
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            next[i] = s.charAt(i) == '|' ? i : next[i + 1];
        }

        for (int i = 0; i < queries.length; i++) {
            int l = next[queries[i][0]], r = prev[queries[i][1] + 1];
            result[i] = l < r ? r - l - (prefixSum[r] - prefixSum[l]) : 0;
        }

        return result;
    }
}