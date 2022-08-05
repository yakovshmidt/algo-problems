package kz.home.ys.algo.hard.wordBreakII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class WordBreakII {

    // time - O(NUMBER_OF_WORDS*LEN(LONGEST_WORD)) + O(2^LENGTH_OF_STRING)
    // space - O(NUMBER_OF_UNIQUE_WORDS)
    public List<String> wordBreak(String s, List<String> wordDict) {
        TrieNode trieNode = fillTrie(wordDict);
        List<String> foundWords = new ArrayList<>();
        
        findBrokenWord(s, 0, trieNode, trieNode.letters, foundWords, "");
        return foundWords;
    }

    private void findBrokenWord(String s, int idx, TrieNode root, Map<Character, TrieNode> letters, List<String> foundWords, String word) {
        if (idx >= s.length()) return;
        
        char letter = s.charAt(idx);
        TrieNode curr = letters.get(letter);
        if (letters.containsKey(letter)) {
            word += letter;
            if (curr.isWord) {
                if (idx == s.length() - 1) {
                    foundWords.add(word);
                } else { 
                    findBrokenWord(s, idx + 1, root, curr.letters, foundWords, word);
                    findBrokenWord(s, idx + 1, root, root.letters, foundWords, word + " ");
                }
            } else {
                findBrokenWord(s, idx + 1, root, curr.letters, foundWords, word);
            }
        }
    }
    
    private TrieNode fillTrie(List<String> wordDict) {
        TrieNode root = new TrieNode();
        for (String word : wordDict) {
            TrieNode curr = root;
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                if (!curr.letters.containsKey(letter)) {
                    curr.letters.put(letter, new TrieNode());
                }
                curr = curr.letters.get(letter);
            }
            curr.isWord = true;
        }    
        
        return root;
    }
    
    static class TrieNode {
        public boolean isWord = false;
        public Map<Character, TrieNode> letters = new HashMap<>();
    }
}