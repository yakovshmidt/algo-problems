package kz.home.ys.algo.hard.shortestPalindrome;

class ShortestPalindromeWithKMP {

    public String shortestPalindrome(String s) {
        int n = s.length();
        String reversed = new StringBuilder(s).reverse().toString();
        String newS = s + "#" + reversed;
        int newN = newS.length();
        int[] lps = new int[newN];
        for (int i = 1; i < newN; i++) {
            int t = lps[i - 1];
            while (t > 0 && newS.charAt(i) != newS.charAt(t)) {
                t = lps[t - 1];
            }
            if (newS.charAt(i) == newS.charAt(t)) {
                ++t;
            }
            lps[i] = t;
        }
        return reversed.substring(0, n - lps[newN - 1]) + s;
    }
}