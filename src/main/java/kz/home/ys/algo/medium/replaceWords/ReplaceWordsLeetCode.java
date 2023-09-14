package kz.home.ys.algo.medium.replaceWords;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ReplaceWordsLeetCode {
    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = createTrie(dictionary);
        StringBuilder ans = new StringBuilder();

        for (String word : sentence.split("\\s+")) {
            if (ans.length() > 0) ans.append(" ");

            TrieNode node = trie.root;
            for (char letter : word.toCharArray()) {
                if (!node.children.containsKey(letter) || node.word != null) break;
                node = node.children.get(letter);
            }
            ans.append(node.word != null ? node.word : word);
        }

        return ans.toString();
    }


    private Trie createTrie(List<String> words) {
        Trie trie = new Trie();
        trie.addWords(words);
        return trie;
    }


    static class Trie {
        public TrieNode root = new TrieNode();


        public void addWords(List<String> words) {
            for (String word : words) {
                TrieNode curr = root;
                for (char letter : word.toCharArray()) {
                    if (!curr.children.containsKey(letter)) {
                        curr.children.put(letter, new TrieNode());
                    }
                    curr = curr.children.get(letter);
                }
                curr.word = word;
            }
        }
    }


    static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public String word;
    }
}
