package kz.home.ys.algo.medium.longestRepeatingCharacterReplacement;

import java.util.HashMap;
import java.util.Map;

class LongestRepeatingCharacterReplacement {

    // time - O(N)
    // space - O(N)
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> letters = new HashMap<>(26);
        int result = 0;
        int l = 0;
        int max = 0;
        for (int r = 0; r < s.length(); r++) {
            letters.put(s.charAt(r), letters.getOrDefault(s.charAt(r), 0) + 1);
            max = Math.max(max, letters.get(s.charAt(r)));

            while ((r - l + 1 - max) > k) {
                letters.put(s.charAt(l), letters.get(s.charAt(l)) - 1);
                l++;
            }

            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}