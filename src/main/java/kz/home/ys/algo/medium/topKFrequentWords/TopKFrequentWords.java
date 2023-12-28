package kz.home.ys.algo.medium.topKFrequentWords;

import java.util.*;

class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<Integer, TreeSet<String>> freqToWords = new TreeMap<>(Collections.reverseOrder());

        Trie trie = new Trie();
        trie.addWords(words, freqToWords);

        List<String> result = new ArrayList<>();
        for (var entry : freqToWords.entrySet()) {
            for (String word : entry.getValue()) {
                result.add(word);
                k--;
                if (k == 0) return result;
            }
        }

        return result;
    }

    static class Trie {
        public TrieNode root = new TrieNode();

        public void addWords(String[] words, TreeMap<Integer, TreeSet<String>> freqToWords) {
            for (String word : words) {
                TrieNode curr = root;
                for (char letter : word.toCharArray()) {
                    if (!curr.children.containsKey(letter)) {
                        curr.children.put(letter, new TrieNode());
                    }
                    curr = curr.children.get(letter);
                }
                curr.isWord = true;
                curr.frequency++;

                if (freqToWords.containsKey(curr.frequency - 1)) {
                    freqToWords.get(curr.frequency - 1).remove(word);
                }
                if (!freqToWords.containsKey(curr.frequency)) {
                    freqToWords.put(curr.frequency, new TreeSet<>());
                }
                freqToWords.get(curr.frequency).add(word);
            }
        }
    }

    static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public boolean isWord = false;
        public int frequency = 0;
    }
}