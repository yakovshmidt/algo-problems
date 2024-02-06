package kz.home.ys.algo.easy.firstUniqueCharacterInAString;

import java.util.HashMap;
import java.util.Map;

class FirstUniqueCharacterInAString {

    // Time - O(N)
    // Space - O(N)
    public int firstUniqChar(String s) {
        Map<Character, Integer> lettersToFrequencies = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            lettersToFrequencies.put(letter, lettersToFrequencies.getOrDefault(letter, 0) + 1);
        }

        int resultedIdx = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            int frequency = lettersToFrequencies.get(letter);
            if (frequency == 1) {
                resultedIdx = Math.min(resultedIdx, i);
            }
        }

        return resultedIdx == Integer.MAX_VALUE ? -1 : resultedIdx;
    }
}