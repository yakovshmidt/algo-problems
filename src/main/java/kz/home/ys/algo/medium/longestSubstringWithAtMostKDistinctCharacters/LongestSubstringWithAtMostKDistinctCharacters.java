package kz.home.ys.algo.medium.longestSubstringWithAtMostKDistinctCharacters;

import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithAtMostKDistinctCharacters {

    // time - O(N^2)
    // space - O(N)
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int maxResult = 0;
        int currResult;
        Set<Character> visited = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            visited.clear();
            currResult = 0;
            for (int j = i; j < s.length(); j++) {
                char curr = s.charAt(j);
                if (visited.contains(curr)) {
                    if (visited.size() <= k) {
                        currResult++;
                        maxResult = Math.max(currResult, maxResult);
                    } else {
                        break;
                    }
                } else {
                    if (visited.size() < k) {
                        visited.add(curr);
                        currResult++;
                        maxResult = Math.max(currResult, maxResult);
                    } else {
                        break;
                    }
                }
            }
        }
        return maxResult;
    }
}




