package kz.home.ys.algo.medium.maximumElementAfterDecreasingAndRearranging;

class MaximumElementAfterDecreasingAndRearranging {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        int[] count = new int[n + 1];
        for (int num : arr) count[Math.min(n, num)]++;

        int ans = 1;
        for (int num = 2; num <= n; num++) {
            ans = Math.min(ans + count[num], num);
        }

        return ans;
    }
}