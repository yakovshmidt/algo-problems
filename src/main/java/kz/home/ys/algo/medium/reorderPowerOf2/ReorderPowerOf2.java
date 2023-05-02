package kz.home.ys.algo.medium.reorderPowerOf2;

import java.util.Arrays;

class ReorderPowerOf2 {

    // time - O(log(^2)N)
    // space - O(logN)
    public boolean reorderedPowerOf2(int n) {
        int[] a = count(n);
        for (int i = 0; i < 31; i++) {
            if (Arrays.equals(a, count(1 << i))) {
                return true;
            }
        }
        return false;
    }

    private int[] count(int n) {
        int[] ans = new int[10];
        while (n > 0) {
            ans[n % 10]++;
            n /= 10;
        }
        return ans;
    }
}