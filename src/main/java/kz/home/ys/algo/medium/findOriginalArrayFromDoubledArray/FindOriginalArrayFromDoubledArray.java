package kz.home.ys.algo.medium.findOriginalArrayFromDoubledArray;

import java.util.Arrays;

class FindOriginalArrayFromDoubledArray {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) return new int[0];

        Arrays.sort(changed);

        int idx = 0;
        int[] original = new int[n / 2];
        boolean[] taken = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (taken[i]) continue;
            int originalElem = changed[i];
            boolean foundChanged = false;
            for (int j = i + 1; j < n; j++) {
                int changedElem = changed[j];
                if (changedElem > originalElem * 2) break;
                else if (changedElem == originalElem * 2 && !taken[j]) {
                    taken[j] = true;
                    foundChanged = true;
                    break;
                }
            }
            if (foundChanged) {
                original[idx++] = originalElem;
            } else {
                return new int[0];
            }
        }

        if (idx == original.length) return original;
        else return new int[0];
    }
}