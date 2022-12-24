package kz.home.ys.algo.google.googleInterviewLeetCodePremium.treesAndGraphs.wordLadder;

import java.util.*;

class WordLadderDFS {

    // time - O(M^2*N) - where M is length of word and N is size of word list
    // space - O(M^2*N)
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int N = beginWord.length();

        Map<String, List<String>> allCombinations = new HashMap<>();

        for (String word : wordList) {
            for (int i = 0; i < N; i++) {
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1);

                allCombinations.putIfAbsent(newWord, new ArrayList<>());
                allCombinations.get(newWord).add(word);
            }
        }

        Queue<Pair<String, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(beginWord, 1));
        Set<String> visited = new HashSet<>();
        while (!queue.isEmpty()) { 
            Pair<String, Integer> pair = queue.remove();
            String word = pair.getKey();
            Integer level = pair.getValue();
            for (int i = 0; i < N; i++) {
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1);

                for (String adjacentWord : allCombinations.getOrDefault(newWord, new ArrayList<>())) {
                    if (adjacentWord.equals(endWord)) return level + 1;

                    if (!visited.contains(adjacentWord)) {
                        queue.add(new Pair<>(adjacentWord, level + 1));
                        visited.add(adjacentWord);
                    }
                }
            }
        }
        return 0;
    }
}