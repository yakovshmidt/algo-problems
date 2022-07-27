package kz.home.ys.algo.hard.wordSearchII;

import java.util.*;

class WordSearchII {

    // time - O(ROW*COL*4^ROW*COL*WORD_LENGTH)
    // space - O(ROW*COL)
    public List<String> findWords(char[][] board, String[] words) {
        TrieNode node = fillTrieNode(words);
        Set<String> foundWords = new HashSet<>();
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, visited, foundWords, node, "");
            }
        }

        return new ArrayList<>(foundWords);
    }

    private void dfs(char[][] board, int i, int j, boolean[][] visited, Set<String> foundWords, TrieNode node, String wordPrefix) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j] || !node.children.containsKey(board[i][j])) return;

        visited[i][j] = true;
        node = node.children.get(board[i][j]);
        wordPrefix = wordPrefix + board[i][j];

        if (node.isWord) foundWords.add(wordPrefix);

        dfs(board, i - 1, j, visited, foundWords, node, wordPrefix);
        dfs(board, i + 1, j, visited, foundWords, node, wordPrefix);
        dfs(board, i, j - 1, visited, foundWords, node, wordPrefix);
        dfs(board, i, j + 1, visited, foundWords, node, wordPrefix);

        visited[i][j] = false;
    }

    private TrieNode fillTrieNode(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            root.add(word);
        }
        return root;
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