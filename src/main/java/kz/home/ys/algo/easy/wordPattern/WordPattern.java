package kz.home.ys.algo.easy.wordPattern;

import java.util.HashMap;
import java.util.Map;

class WordPattern {

    // time - O(N)
    // space - O(N)
    public boolean wordPattern(String pattern, String s) {
        char[] patterns = pattern.toCharArray();
        String[] words = s.split(" ");

        if (patterns.length != words.length) return false;

        Map<Character, String> patternsToWords = new HashMap<>();
        Map<String, Character> wordsToPatterns = new HashMap<>();
        for (int i = 0; i < patterns.length; i++) {
            char currPattern = patterns[i];
            String currWord = words[i];
            if (!patternsToWords.containsKey(currPattern) && !wordsToPatterns.containsKey(currWord)) {
                patternsToWords.put(currPattern, currWord);
                wordsToPatterns.put(currWord, currPattern);
            } else {
                String prevWord = patternsToWords.get(currPattern);
                Character prevPattern = wordsToPatterns.get(currWord);
                if (prevWord != null && prevPattern != null) {
                    if (currPattern == prevPattern && currWord.equals(prevWord)) {
                        continue;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}