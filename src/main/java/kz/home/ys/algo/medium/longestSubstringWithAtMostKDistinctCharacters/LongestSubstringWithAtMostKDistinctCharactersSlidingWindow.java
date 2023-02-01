package kz.home.ys.algo.medium.longestSubstringWithAtMostKDistinctCharacters;

import java.util.HashMap;
import java.util.Map;

class LongestSubstringWithAtMostKDistinctCharactersSlidingWindow {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int maxLength = 0;
        int currLength = 0;
        int currDistinctLength = 0;
        Map<Character, Integer> lettersToCount = new HashMap<>();
        int l = 0;
        int r = 0;

        while (r < s.length()) {
            while (r < s.length() && currDistinctLength <= k) {
                char curr = s.charAt(r);
                if (lettersToCount.containsKey(curr)) {
                    lettersToCount.put(curr, lettersToCount.get(curr) + 1);
                } else {
                    lettersToCount.put(curr, lettersToCount.getOrDefault(curr, 0) + 1);
                    currDistinctLength++;
                }
                currLength++;
                if (currDistinctLength == k) maxLength = Math.max(maxLength, currLength);
                r++;  
            }

            while (l < r && currDistinctLength >= k) {
                char curr = s.charAt(l);
                int count = lettersToCount.get(curr);
                if (count == 1) {
                    lettersToCount.remove(curr);
                    currDistinctLength--;
                } else {
                    lettersToCount.put(curr, lettersToCount.get(curr) - 1);
                }
                currLength--;
                l++;  
            }
        }
        return maxLength;
    }
}




