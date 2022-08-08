package kz.home.ys.algo.medium.longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters {

    // time - O(N)
    // space - O(N)
    public int lengthOfLongestSubstring(String s) {
        Set<Character> visited = new HashSet<>();
        int max = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            while (visited.contains(s.charAt(r))) {
                visited.remove(s.charAt(l));
                l++;
            }
            visited.add(s.charAt(r));
            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}