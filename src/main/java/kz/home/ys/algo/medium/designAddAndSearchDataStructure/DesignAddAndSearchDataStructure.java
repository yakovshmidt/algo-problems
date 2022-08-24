package kz.home.ys.algo.medium.designAddAndSearchDataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DesignAddAndSearchDataStructure {
    
    private final TrieNode trie;

    public DesignAddAndSearchDataStructure() {
        trie = new TrieNode();
    }
    
    // time - O(M) - where M is the longest word, and N is number of words
    // space - O(M * N) - where M is the longest word, and N is number of words
    public void addWord(String word) {
        TrieNode curr = trie;  // aa
        for (char letter : word.toCharArray()) {  // b
            if (!curr.children.containsKey(letter)) {
                curr.children.put(letter, new TrieNode());
            }
            curr = curr.children.get(letter);
        }
        curr.isWord = true;
    }
    
    // time - O(N + 26^N) -> O(26^N)
    // space - O(26^N)
    public boolean search(String word) {
        return dfs(word, 0, trie);
    }
    
    private boolean dfs(String word, int i, TrieNode node) {
        for (int idx = i; idx < word.length(); idx++) {
            char letter = word.charAt(idx);
            if (letter == '.') {
                List<TrieNode> children = new ArrayList<>(node.children.values());
                for (TrieNode child : children) {
                    if (dfs(word, idx + 1, child)) return true;
                }
                return false;
            } else {
                if (!node.children.containsKey(letter)) return false;
                
                node = node.children.get(letter);
            }
        }
        
        return node.isWord;
    }
    
    static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public boolean isWord = false;
        
        public TrieNode() {
        }
    }
}