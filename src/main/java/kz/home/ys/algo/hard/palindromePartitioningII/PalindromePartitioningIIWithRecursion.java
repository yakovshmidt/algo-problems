package kz.home.ys.algo.hard.palindromePartitioningII;

class PalindromePartitioningIIWithRecursion {

    private Integer[][] memoCuts;
    private Boolean[][] memoPalindrome;

    // time - O(N^3)
    // space - O(N^2)
    public int minCut(String s) {
        /*
        
        aabaabaa
        aabaa b aa
        aa baab aa
        aa b aabaa

        visited map -> Map<Str, Patritions> -> a -> 0 - it means that a is a palindrome
                                                 -> baabaa -> 2

        aabaabaa -> a abaabaa
                 -> aa baabaa
                 -> --//--
                 -> aabaaba a
        
        Example 1:
        aab is not a pailndrome -> (a = 1) ab -> return 1
                        check whether ab is palindrome NO
            -> aa b -> 1

        time - O(N^2 * N) -> O(N^3)
        space - O(N^2)

        */

        this.memoCuts = new Integer[s.length()][s.length()];
        this.memoPalindrome = new Boolean[s.length()][s.length()];

        return dp(s, 0, s.length() - 1, s.length() - 1);
    }

    private int dp(String s, int start, int end, int minimumCut) {
        if (start == end || isPalindrome(s, start, end)) {
            return 0;
        }
        if (memoCuts[start][end] != null) {
            return memoCuts[start][end];
        }

        // aab
        for (int currEnd = start; currEnd <= end; currEnd++) {
            if (isPalindrome(s, start, currEnd)) {
                minimumCut = Math.min(minimumCut, 1 + dp(s, currEnd + 1, end, minimumCut));
            }
        }
        return memoCuts[start][end] = minimumCut;
    }

    private boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (memoPalindrome[start][end] != null) {
            return memoPalindrome[start][end];
        }
        return memoPalindrome[start][end] = (s.charAt(start) == s.charAt(end))
            && isPalindrome(s, start + 1, end - 1);
    }
}