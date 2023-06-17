package kz.home.ys.algo.easy.validAnagram;

import java.util.HashMap;
import java.util.Map;

class ValidAnagram {

    // time - O(N)
    // space - O(N)
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int n = s.length();

        Map<Character, Integer> lettersToCounts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char letter = s.charAt(i);
            lettersToCounts.put(letter, lettersToCounts.getOrDefault(letter, 0) + 1);
        }

        for (int j = 0; j < t.length(); j++) {
            char letter = t.charAt(j);
            if (lettersToCounts.containsKey(letter)) {
                lettersToCounts.put(letter, lettersToCounts.get(letter) - 1);
                if (lettersToCounts.get(letter) == 0) lettersToCounts.remove(letter);
            } else {
                return false;
            }
        }
        return lettersToCounts.isEmpty();
    }
}