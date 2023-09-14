package kz.home.ys.algo.hard.longestHappyPrefix;

import java.util.Arrays;

class LongestHappyPrefix {
    public String longestPrefix(String s) {
        int m = s.length();

        int[] lps = new int[m];

        int len = 0;
        int i = 1;

        while (i < m) {
            if (s.charAt(i) == s.charAt(len)) {
                len += 1;
                lps[i] = len;
                i++;
            } else if (len == 0) {
                lps[i] = 0;
                i++;
            } else {
                len = lps[len - 1];
            }
        }

        return s.substring(0, lps[m - 1]);
    }
}