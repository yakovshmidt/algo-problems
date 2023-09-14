package kz.home.ys.algo.hard.prefixAndSuffixSearch;

import java.util.HashMap;
import java.util.Map;

class PrefixAndSuffixSearch {

    static class Trie {
        public TrieNode root = new TrieNode();

        public void addWords(String[] words) {
            for (int i = 0; i < words.length; i++) {
                add(words[i], i);
            }
        }

        private void add(String word, int index) {
            StringBuilder suffix = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                suffix.insert(0, word.charAt(i));

                StringBuilder combinedWord = new StringBuilder(suffix);
                combinedWord.append("{");
                combinedWord.append(word);

                TrieNode curr = root;
                boolean isAfterDivider = false;
                for (char letter : combinedWord.toString().toCharArray()) {
                    if (letter == '{') isAfterDivider = true;
                    if (!curr.children.containsKey(letter)) {
                        curr.children.put(letter, new TrieNode());
                    }
                    curr = curr.children.get(letter);
                    if (isAfterDivider) curr.maxIndex = Math.max(curr.maxIndex, index);
                }
            }
        }

        public int find(String prefix, String suffix) {
            TrieNode curr = root;
            for (char letter : suffix.toCharArray()) {
                if (!curr.children.containsKey(letter)) {
                    return -1;
                }
                curr = curr.children.get(letter);
            }

            if (!curr.children.containsKey('{')) return -1;

            curr = curr.children.get('{');
            for (char letter : prefix.toCharArray()) {
                if (!curr.children.containsKey(letter)) {
                    return -1;
                }
                curr = curr.children.get(letter);
            }
            return curr.maxIndex;
        }
    }

    static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public int maxIndex = Integer.MIN_VALUE;
    }

    public Trie trie = new Trie();

    public PrefixAndSuffixSearch(String[] words) {
        trie.addWords(words);
    }

    public int f(String pref, String suff) {
        return trie.find(pref, suff);
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(pref,suff);
 */