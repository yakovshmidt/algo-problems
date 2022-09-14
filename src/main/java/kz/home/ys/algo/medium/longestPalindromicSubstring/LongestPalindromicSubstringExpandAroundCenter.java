package kz.home.ys.algo.medium.longestPalindromicSubstring;

class LongestPalindromicSubstringExpandAroundCenter {

    // time - O(N^2)
    // space - O(1)
    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = lps(s, i, i);
            String even = lps(s, i, i + 1);
            if (odd.length() > even.length()) {
                res = res.length() > odd.length() ? res : odd;
            } else {
                res = res.length() > even.length() ? res : even;
            }
        }
        return res;
    }
    
    private String lps(String s, int l, int r) {
        String res = "";
        int resLen = 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            if ((r - l + 1) > resLen) {
                res = s.substring(l, r + 1);
                resLen = r - l + 1;
            }
            l--;
            r++;
        }
        return res;
    }
}