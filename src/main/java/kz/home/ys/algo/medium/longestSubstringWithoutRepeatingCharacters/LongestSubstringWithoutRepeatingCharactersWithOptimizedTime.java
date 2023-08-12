package kz.home.ys.algo.medium.longestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

class LongestSubstringWithoutRepeatingCharactersWithOptimizedTime {

    // time - O(N)
    // space - O(min(M, N)) - where N is s and M is alphabet
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        
        Map<Character, Integer> lettersToIndices = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxLength = 0;
        while (r < s.length()) {
            char letter = s.charAt(r);

            if (lettersToIndices.containsKey(letter)) {
                l = Math.max(l, lettersToIndices.get(letter));
            }

            maxLength = Math.max(maxLength, r - l + 1);
            lettersToIndices.put(letter, r + 1);
            r++;
        }
        return maxLength;
    }
}