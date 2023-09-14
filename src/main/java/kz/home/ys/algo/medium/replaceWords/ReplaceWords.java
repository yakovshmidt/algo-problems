package kz.home.ys.algo.medium.replaceWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = createTrie(dictionary);
        List<Integer> spaceIndices = new ArrayList<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') spaceIndices.add(i);
        }
        spaceIndices.add(sentence.length());

        StringBuilder sb = new StringBuilder();
        int spaceIdx = 0;
        int i = 0;
        while (i < sentence.length()) {
            int nextI = spaceIndices.get(spaceIdx) + 1;
            char letter = sentence.charAt(i);
            if (trie.root.children.containsKey(letter)) {
                TrieNode node = trie.root;
                int j = i;
                while (j < sentence.length() && node.children.containsKey(sentence.charAt(j))) {
                    node = node.children.get(sentence.charAt(j));
                    j++;
                    if (node.word != null) break;
                }
                if (node.word != null) {
                    sb.append(node.word);
                    spaceIdx++;
                } else {
                    sb.append(sentence, i, spaceIndices.get(spaceIdx++));
                }
            } else {
                sb.append(sentence, i, spaceIndices.get(spaceIdx++));
            }
            sb.append(" ");
            i = nextI;
        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
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
