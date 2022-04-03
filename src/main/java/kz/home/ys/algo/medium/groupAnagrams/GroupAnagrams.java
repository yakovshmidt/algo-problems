package kz.home.ys.algo.medium.groupAnagrams;

import java.util.*;

class GroupAnagrams {

    // time - O(N) - where N is length of strs
    // space - O(N + M) = where M is number of created array lists in the worst case if we don't have anagrams, just unique words
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> sortedWordToAnagrams = new HashMap<>();
        for (String word : strs) {
            char[] wordAsArray = word.toCharArray();
            Arrays.sort(wordAsArray);
            String sortedWord = String.valueOf(wordAsArray);
            if (sortedWordToAnagrams.containsKey(sortedWord)) {
                sortedWordToAnagrams.get(sortedWord).add(word);
            } else {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(word);
                sortedWordToAnagrams.put(sortedWord, anagrams);
            }
        }

        return new ArrayList<>(sortedWordToAnagrams.values());
    }
}