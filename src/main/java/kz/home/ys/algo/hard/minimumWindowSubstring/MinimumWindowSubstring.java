package kz.home.ys.algo.hard.minimumWindowSubstring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MinimumWindowSubstring {


    public String minWindow(String s, String t) {
        Map<Character, Integer> lettersToCounts = new HashMap<>();
        for (char letter : t.toCharArray()) {
            lettersToCounts.put(letter, lettersToCounts.getOrDefault(letter, 0) + 1);
        }

        String result = "";
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            if (lettersToCounts.containsKey(s.charAt(r))) {
                lettersToCounts.put(s.charAt(r), lettersToCounts.get(s.charAt(r)) - 1);
            }

            if (allLettersAreFound(lettersToCounts)) {
                String subS = s.substring(l, r + 1);

                if (result.equals("") || result.length() > subS.length()) result = subS;

                while (allLettersAreFound(lettersToCounts)) {
                    if (lettersToCounts.containsKey(s.charAt(l))) {
                        lettersToCounts.put(s.charAt(l), lettersToCounts.get(s.charAt(l)) + 1);
                    }
                    l++;
                }
                while (!lettersToCounts.containsKey(s.charAt(l))) {
                    l++;
                }
            }
        }

        return result;
    }

    private boolean allLettersAreFound(Map<Character, Integer> lettersToCounts) {
        Collection<Integer> counts = lettersToCounts.values();
        for (int count : lettersToCounts.values()) {
            if (count != 0) return false;
        }
        return true;
    }
}