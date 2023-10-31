package kz.home.ys.algo.medium.numberOfMatchingSequences;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class NumberOfMatchingSequences {
    public int numMatchingSubseq(String s, String[] words) {
        /* 
        
        Constraints:
        * 1 <= s.length <= 5 * 10^4
        * what the letters can s contain? - lowercase English letters
        * 1 <= words.length <= 5000
        * what the letters can words[i] contain? lowercase English letters
        * 1 <= words[i].length() <= 50

        time - O(WORDS_LENGTH * MAX_WORD_LENGTH * LOG(MAX_NUMBER_OF_REPEATED_LETTERS_IN_S))
        space - O(S)

        */

        Map<Character, TreeSet<Integer>> sAsMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sAsMap.putIfAbsent(s.charAt(i), new TreeSet<>());
            sAsMap.get(s.charAt(i)).add(i);
        }
        
        int numberOfSubsequences = 0;
        int currIndex = -1;
        for (String word : words) {
            boolean foundWord = true;
            for (char letter : word.toCharArray()) {
                if (!sAsMap.containsKey(letter)) {
                    foundWord = false;
                    break;
                }
                TreeSet<Integer> indices = sAsMap.get(letter);
                try {
                    currIndex = indices.higher(currIndex);
                } catch (NullPointerException e) {
                    foundWord = false;
                    break;
                }
            }
            if (foundWord) numberOfSubsequences++;
            currIndex = -1;
        }

        return numberOfSubsequences;
    }
}