package kz.home.ys.algo.google.googleInterviewLeetCodePremium.treesAndGraphs.wordLadder;

import java.util.*;

class WordLadderBidirectionalDFS {

    private int L;
    private final Map<String, List<String>> allCombinations;

    public WordLadderBidirectionalDFS() {
        this.L = 0;
        this.allCombinations = new HashMap<>();
    }

    // time - O(M^2*N) - where M is length of word and N is size of word list
    // space - O(M^2*N)
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        this.L = beginWord.length();

        // time - O(N * M^2) - where N is wordList.length, M is word.length(). M^2 because forming a newWord takes M.
        for (String word : wordList) {
            for (int i = 0; i < this.L; i++) {
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1);

                this.allCombinations.putIfAbsent(newWord, new ArrayList<>());
                this.allCombinations.get(newWord).add(word);
            }
        }

        Queue<Pair<String, Integer>> beginQueue = new LinkedList<>();
        Queue<Pair<String, Integer>> endQueue = new LinkedList<>();
        beginQueue.add(new Pair<>(beginWord, 1));
        endQueue.add(new Pair<>(endWord, 1));
        Map<String, Integer> beginVisited = new HashMap<>();
        Map<String, Integer> endVisited = new HashMap<>();
        beginVisited.put(beginWord, 1);
        endVisited.put(endWord, 1);
        int result;
        while (!beginQueue.isEmpty() && !endQueue.isEmpty()) {
            if (beginQueue.size() <= endQueue.size()) {
                result = visitWordNode(beginQueue, beginVisited, endVisited);
            } else {
                result = visitWordNode(endQueue, endVisited, beginVisited);
            }

            if (result > -1) {
                return result;
            }
        }
        return -1;
    }

    private int visitWordNode(Queue<Pair<String, Integer>> queue,
                              Map<String, Integer> visited,
                              Map<String, Integer> otherVisited) {
        for (int i = queue.size(); i > 0; i--) {
            Pair<String, Integer> pair = queue.remove();
            String word = pair.getKey();
            Integer level = pair.getValue();

            for (int j = 0; j < this.L; j++) {
                String newWord = word.substring(0, j) + '*' + word.substring(j + 1, L);

                for (String adjacentWord : this.allCombinations.getOrDefault(newWord, new ArrayList<>())) {
                    if (otherVisited.containsKey(adjacentWord)) {
                        return level + otherVisited.get(adjacentWord);
                    }

                    if (!visited.containsKey(adjacentWord)) {
                        visited.put(adjacentWord, level + 1);
                        queue.add(new Pair<>(adjacentWord, level + 1));
                    }
                }
            }
        }
        return -1;
    }
}