package kz.home.ys.algo.medium.implementMagicDictionary;

import java.util.HashMap;
import java.util.Map;

class MagicDictionary {

    private final Trie trie;

    public MagicDictionary() {
        this.trie = new Trie();
    }

    public void buildDict(String[] dictionary) {
        for (String word : dictionary) {
            this.trie.addWord(word);
        }
    }

    public boolean search(String searchWord) {
        return searchHelper(searchWord, 0, this.trie.root, false);
    }

    private boolean searchHelper(String searchWord, int idx, TrieNode node, boolean isOneCharacterChanged) {
        if (idx == searchWord.length()) return node.isWord && isOneCharacterChanged;

        char letter = searchWord.charAt(idx);
        if (node.children.containsKey(letter)) {
            if (searchHelper(searchWord, idx + 1, node.children.get(letter), isOneCharacterChanged)) return true;
        }
        if (!isOneCharacterChanged) {
            for (Map.Entry<Character, TrieNode> entry : node.children.entrySet()) {
                if (entry.getKey() == letter) continue;
                if (searchHelper(searchWord, idx + 1, entry.getValue(), true)) return true;
            }
        }

        return false;
    }

    static class Trie {
        public TrieNode root = new TrieNode();

        public void addWord(String word) {
            TrieNode curr = root;
            for (char letter : word.toCharArray()) {
                if (!curr.children.containsKey(letter)) {
                    curr.children.put(letter, new TrieNode());
                }
                curr = curr.children.get(letter);
            }
            curr.isWord = true;
        }
    }

    static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public boolean isWord = false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */