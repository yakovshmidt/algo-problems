package kz.home.ys.algo.google.googleInterviewLeetCodePremium.treesAndGraphs.wordLadder;

import java.util.*;

class WordLadderTrie {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord.equals(endWord)) return 1;

        if (!isEndWordInEndList(endWord, wordList)) return 0;

        TrieNode trie = createTrie(wordList);

        Set<String> visited = new HashSet<>();
        Deque<String> queue = new LinkedList<>();
        queue.addFirst(beginWord);
        int result = 0;
        while (!queue.isEmpty()) {
            result++;

            int size = queue.size();

            while (size > 0) {
                String word = queue.pollLast();

                if (word.equals(endWord)) return result;

                List<String> neighbours = new ArrayList<>();
                for (int i = 0; i < word.length(); i++) {
                    String modifiedWord = word.substring(0, i) + '*' + word.substring(i + 1);
                    getNeighbours(trie, modifiedWord, 0, visited, neighbours);
                }

                for (String neighbour : neighbours) {
                    queue.addFirst(neighbour);
                }
                size--;
            }
        }
        return 0;
    }

    private void getNeighbours(TrieNode trie,
                               String word,
                               int idx,
                               Set<String> visited,
                               List<String> neighbours) {
        if (word.length() == idx) {
            if (trie.word != null) {
                if (!visited.contains(trie.word)) {
                    neighbours.add(trie.word);
                }
                visited.add(trie.word);
                return;
            }
        }

        char letter = word.charAt(idx);

        if (letter == '*') {
            for (var entry : trie.lettersToNodes.entrySet()) {
                getNeighbours(entry.getValue(), word, idx + 1, visited, neighbours);
            }
        } else {
            if (trie.lettersToNodes.containsKey(letter)) {
                getNeighbours(trie.lettersToNodes.get(letter), word, idx + 1, visited, neighbours);
            }
        }
    }

    private boolean isEndWordInEndList(String endWord, List<String> wordList) {
        for (String wordInWordList : wordList) {
            if (endWord.equals(wordInWordList)) {
                return true;
            }
        }
        return false;
    }

    private TrieNode createTrie(List<String> wordList) {
        TrieNode node = new TrieNode();
        for (String word : wordList) {
            TrieNode curr = node;
            for (int idx = 0; idx < word.length(); idx++) {
                char letter = word.charAt(idx);
                curr.lettersToNodes.putIfAbsent(letter, new TrieNode());
                curr = curr.lettersToNodes.get(letter);
                if (idx == word.length() - 1) {
                    curr.word = word;
                }
            }
        }
        return node;
    }

    static class TrieNode {
        Map<Character, TrieNode> lettersToNodes = new HashMap<>();
        String word;

        public TrieNode() {
        }
    }
}