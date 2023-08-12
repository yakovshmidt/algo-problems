package kz.home.ys.algo.medium.longestSubstringWithAtMostTwoDistinctCharacters;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostTwoDistinctCharacters {

    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> lettersToCounts = new HashMap<>();
        int l = 0, r = 0;
        int maxSubstring = 0;
        // eceba
        while (r < s.length()) {
            char letter = s.charAt(r++); // e
            lettersToCounts.put(letter, lettersToCounts.getOrDefault(letter, 0) + 1);
            if (lettersToCounts.size() <= 2) maxSubstring = Math.max(maxSubstring, r - l);
            else {
                while (l < r && lettersToCounts.size() > 2) {
                    letter = s.charAt(l++);
                    lettersToCounts.put(letter, lettersToCounts.get(letter) - 1);
                    if (lettersToCounts.get(letter) == 0) lettersToCounts.remove(letter);
                }
            }
        }
        return maxSubstring;
    }
}
