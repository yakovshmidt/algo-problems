package kz.home.ys.algo.easy.findTheDifference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class FindTheDifference {

    // time - O(S + T)
    // space - O(T)
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> lettersToCounts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lettersToCounts.put(s.charAt(i), lettersToCounts.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (lettersToCounts.containsKey(t.charAt(i))) {
                lettersToCounts.put(t.charAt(i), lettersToCounts.get(t.charAt(i)) - 1);
                if (lettersToCounts.get(t.charAt(i)) <= 0) {
                    lettersToCounts.remove(t.charAt(i));
                }
            } else {
                return t.charAt(i);
            }
        }

        return new ArrayList<>(lettersToCounts.keySet()).get(0);
    }
}