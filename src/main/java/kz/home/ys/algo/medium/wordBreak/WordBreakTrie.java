package kz.home.ys.algo.medium.wordBreak;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class WordBreakTrie {
    public boolean wordBreak(String s, List<String> wordDict) {
        Trie trie = buildTrie(wordDict);

        boolean[] dp = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || dp[i - 1]) {
                TrieNode node = trie.node;
                for (int j = i; j < s.length(); j++) {
                    if (!node.children.containsKey(s.charAt(i))) {
                        break;
                    }

                    node = node.children.get(s.charAt(i));
                    if (node.isWord) dp[j] = true;
                }
            }
        }

        return dp[s.length() - 1];
    }

    private Trie buildTrie(List<String> wordDict) {
        Trie trie = new Trie();
        for (String word : wordDict) {
            TrieNode curr = trie.node;
            for (char letter : word.toCharArray()) {
                if (!curr.children.containsKey(letter)) {
                    curr.children.put(letter, new TrieNode());
                }
                curr = curr.children.get(letter);
            }
            curr.isWord = true;
        }
        return trie;
    }

    public static class Trie {
        public TrieNode node = new TrieNode();
    }

    public static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public boolean isWord = false;
    }
}