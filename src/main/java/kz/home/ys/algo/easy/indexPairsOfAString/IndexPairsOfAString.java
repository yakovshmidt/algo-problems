package kz.home.ys.algo.easy.indexPairsOfAString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class IndexPairsOfAString {
    public int[][] indexPairs(String text, String[] words) {
        // time - O(WORDS_LENGTH * AVERAGE_WORD_LENGTH)
        // space - O(WORDS_LENGTH * AVERAGE_WORD_LENGTH)
        TrieNode trie = fillTrieNode(words);

        // time - O(TEXT * TEXT)
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            TrieNode curr = trie;
            int r = i;
            while (r < text.length() && curr.children.containsKey(text.charAt(r))) {
                curr = curr.children.get(text.charAt(r++));
                if (curr.isWord) {
                    result.add(new int[]{i, r - 1});
                }
            }
        }

        int[][] answer = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    private TrieNode fillTrieNode(String[] words) {
        TrieNode trie = new TrieNode();
        for (String word : words) {
            trie.add(word);
        }
        return trie;
    }

    static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public boolean isWord = false;

        public void add(String str) {
            TrieNode node = this;
            for (int i = 0; i < str.length(); i++) {
                char letter = str.charAt(i);
                if (!node.children.containsKey(letter)) {
                    node.children.put(letter, new TrieNode());
                }
                node = node.children.get(letter);
            }
            node.isWord = true;
        }
    }
}