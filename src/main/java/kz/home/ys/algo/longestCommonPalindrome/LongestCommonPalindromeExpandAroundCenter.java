package kz.home.ys.algo.longestCommonPalindrome;

public class LongestCommonPalindromeExpandAroundCenter {

    // time - O(N^2)
    // space - O(1)
    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            String left = longestPalindrome(s, i, i);
            String right = longestPalindrome(s, i, i + 1);
            String possibleLongestPalindrome = (left.length() > right.length()) ? left : right;
            if (possibleLongestPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = possibleLongestPalindrome;
            }
        }
        return longestPalindrome;
    }

    private String longestPalindrome(String s, int leftIdx, int rightIdx) {
        String longestPalindrome = "";
        while (leftIdx >= 0 && rightIdx < s.length()) {
            char left = s.charAt(leftIdx);
            char right = s.charAt(rightIdx);
            if (left == right) {
                String possibleLongestPalindrome = s.substring(leftIdx, rightIdx + 1);
                if (possibleLongestPalindrome.length() > longestPalindrome.length()) {
                    longestPalindrome = possibleLongestPalindrome;
                }
                leftIdx--;
                rightIdx++;
            } else {
                return longestPalindrome;
            }
        }
        return longestPalindrome;
    }
}