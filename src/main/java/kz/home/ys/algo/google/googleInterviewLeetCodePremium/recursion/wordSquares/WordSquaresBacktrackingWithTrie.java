package kz.home.ys.algo.google.googleInterviewLeetCodePremium.recursion.wordSquares;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class WordSquaresBacktrackingWithTrie {

    // time - O(N * 26^L * L)
    // space - O(N*L + N * (L / 2)) - N is number of words and L is length of a single word
    public List<List<String>> wordSquares(String[] words) {
        TrieNode trie = buildTrie(words);
        List<List<String>> results = new ArrayList<>();
        for (String word : words) {
            LinkedList<String> wordSquares = new LinkedList<>();
            wordSquares.addLast(word);
            backtracking(1, wordSquares, results, word.length(), trie, words);
        }

        return results;
    }

    private void backtracking(int step, LinkedList<String> wordSquares, List<List<String>> results, int length, TrieNode trie, String[] words) {
        if (step == length) {
            results.add(new ArrayList<>(wordSquares));
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (String word : wordSquares) {
            sb.append(word.charAt(step));
        }
        String prefix = sb.toString();
        List<Integer> wordIndexesByPrefix = findWordIndexesByPrefix(trie, prefix);
        for (Integer wordIndex : wordIndexesByPrefix) {
            wordSquares.addLast(words[wordIndex]);
            backtracking(step + 1, wordSquares, results, length, trie, words);
            wordSquares.removeLast();
        }
    }

    private List<Integer> findWordIndexesByPrefix(TrieNode trie, String prefix) {
        for (int i = 0; i < prefix.length(); i++) {
            char letter = prefix.charAt(i);

            if (trie.children.containsKey(letter)) {
                trie = trie.children.get(letter);
            } else {
                return new ArrayList<>();
            }
        }
        return trie.wordIndexes;
    }

    private TrieNode buildTrie(String[] words) {
        TrieNode trie = new TrieNode();

        for (int wordIndex = 0; wordIndex < words.length; ++wordIndex) {
            String word = words[wordIndex];

            TrieNode node = trie;
            for (Character letter : word.toCharArray()) {
                if (node.children.containsKey(letter)) {
                    node = node.children.get(letter);
                } else {
                    TrieNode newNode = new TrieNode();
                    node.children.put(letter, newNode);
                    node = newNode;
                }
                node.wordIndexes.add(wordIndex);
            }
        }

        return trie;
    }

    static class TrieNode {
        HashMap<Character, TrieNode> children = new HashMap<>();
        List<Integer> wordIndexes = new ArrayList<>();

        public TrieNode() {
        }
    }
}






