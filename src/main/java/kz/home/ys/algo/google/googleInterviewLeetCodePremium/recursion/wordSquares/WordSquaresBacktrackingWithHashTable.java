package kz.home.ys.algo.google.googleInterviewLeetCodePremium.recursion.wordSquares;

import java.util.*;

class WordSquaresBacktrackingWithHashTable {

    // time - O(N*26^L)
    // space - O(N*L) - N is number of words and L is length of a single word
    public List<List<String>> wordSquares(String[] words) {
        Map<String, List<String>> prefixes = createPrefixMap(words);
        List<List<String>> results = new ArrayList<>();
        for (String word : words) {
            LinkedList<String> wordSquares = new LinkedList<>();
            wordSquares.add(word);
            backtracking(1, wordSquares, results, word.length(), prefixes);
        }

        return results;
    }

    private Map<String, List<String>> createPrefixMap(String[] words) {
        Map<String, List<String>> prefixes = new HashMap<>();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                String prefix = word.substring(0, i);
                prefixes.putIfAbsent(prefix, new ArrayList<>());
                prefixes.get(prefix).add(word);
            }
        }
        return prefixes;
    }

    private void backtracking(int step, LinkedList<String> wordSquares, List<List<String>> results, int length, Map<String, List<String>> prefixes) {
        if (step == length) {
            results.add(new ArrayList<>(wordSquares));
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (String word : wordSquares) {
            sb.append(word.charAt(step));
        }
        String prefix = sb.toString();
        for (String candidate : prefixes.getOrDefault(prefix, new ArrayList<>())) {
            wordSquares.add(candidate);
            backtracking(step + 1, wordSquares, results, length, prefixes);
            wordSquares.removeLast();
        }
    }
}






