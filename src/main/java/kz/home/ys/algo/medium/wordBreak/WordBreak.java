package kz.home.ys.algo.medium.wordBreak;

import java.util.List;

class WordBreak {

    // time - O(S*W) - where S is length of "s" and W is number of wordDict list
    // space - O(S)
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[s.length()] = true;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            for (String w : wordDict) {
                if ((i + w.length()) <= s.length() && s.substring(i, i + w.length()).equals(w)) {
                    dp[i] = dp[i + w.length()];
                }
                if (dp[i]) break;
            }
        }
        
        return dp[0];
    }
}