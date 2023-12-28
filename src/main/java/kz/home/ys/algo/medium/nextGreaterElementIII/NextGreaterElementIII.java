package kz.home.ys.algo.medium.nextGreaterElementIII;

import java.util.Arrays;

class NextGreaterElementIII {

    public int nextGreaterElement(int n) {
        String s = "" + n;
        int l = -1;
        char[] arr = s.toCharArray();
        for (int i = s.length() - 2; i >= 0; i--) {
            if ((s.charAt(i)) < (s.charAt(i + 1))) {
                l = i;
                break;
            }
        }

        if (l == -1) return -1;

        int r = -1;
        for (int i = l + 1; i < s.length(); i++) {
            if ((s.charAt(l)) < (s.charAt(i))) r = i;
        }

        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        Arrays.sort(arr, l + 1, arr.length);

        try {
            return Integer.parseInt(new String(arr));
        } catch (Exception e) {
            return -1;
        }
    }
}