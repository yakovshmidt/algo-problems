package kz.home.ys.algo.easy.longestCommonPrefix;

import java.util.HashMap;
import java.util.Map;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        /*
        
        Constrains:
        * 1 <= strs.length <= 200
        * 0 <= strs[i].length <= 200
        * only lower case English letters

        Approach:
        * Trie -> Prefix tree
        * iterate over all words -> O(N)
        * add each word into the trie -> O(average_length_of_word)

        Time: O(N * average_length_of_word) - where N is number of words

        Space: O(N * average_length_of_word)
        
        */

        Trie trie = new Trie();
        for (String word : strs) { // time - O(WORDS_NUMBER * WORD_LENGTH)
            trie.add(word);
        }

        int n = strs.length;
        TrieNode trieNode = trie.root;
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (!trieNode.isEnd && trieNode.children.size() == 1) {
            char letter = strs[0].charAt(idx++);
            sb.append(letter);
            trieNode = trieNode.children.get(letter);
        }
        return sb.toString();
    }

    public static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public boolean isEnd = false;
    }

    public static class Trie {
        public TrieNode root = new TrieNode();

        public void add(String word) {
            TrieNode curr = root;
            for (char letter : word.toCharArray()) {
                if (!curr.children.containsKey(letter)) {
                    curr.children.put(letter, new TrieNode());
                }
                curr = curr.children.get(letter);
            }
            curr.isEnd = true;
        }
    }
}