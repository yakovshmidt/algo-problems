package kz.home.ys.algo.hard.boggleBoard;

import java.util.*;

class BoggleBoard {

    public List<String> boggleBoard(char[][] board, String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.add(word);
        }

        List<String> foundWords = new ArrayList<>();

        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                explore(board, row, column, trie.root, foundWords, visited);
            }
        }

        return foundWords;
    }

    private void explore(char[][] board, int row, int column, TrieNode node, List<String> foundWords, boolean[][] visited) {
        if (visited[row][column]) return;

        char letter = board[row][column];

        if (!node.children.containsKey(letter)) return;
        visited[row][column] = true;

        node = node.children.get(letter);
        if (node.children.containsKey('*') && !foundWords.contains(node.word)) {
            foundWords.add(node.word);
        }

        List<Integer[]> neighbors = getNeighbors(row, column, board);
        for (Integer[] neighbor : neighbors) {
            explore(board, neighbor[0], neighbor[1], node, foundWords, visited);
        }
        visited[row][column] = false;
    }

    private List<Integer[]> getNeighbors(int row, int col, char[][] board) {
        List<Integer[]> neighbors = new ArrayList<>();
        if (row > 0 && col > 0) {
            neighbors.add(new Integer[]{row - 1, col - 1});
        }
        if (row > 0 && col < board[0].length - 1) {
            neighbors.add(new Integer[]{row - 1, col + 1});
        }
        if (row < board.length - 1 && col < board[0].length - 1) {
            neighbors.add(new Integer[]{row + 1, col + 1});
        }
        if (row < board.length - 1 && col > 0) {
            neighbors.add(new Integer[]{row + 1, col - 1});
        }
        if (row > 0) {
            neighbors.add(new Integer[]{row - 1, col});
        }
        if (row < board.length - 1) {
            neighbors.add(new Integer[]{row + 1, col});
        }
        if (col > 0) {
            neighbors.add(new Integer[]{row, col - 1});
        }
        if (col < board[0].length - 1) {
            neighbors.add(new Integer[]{row, col + 1});
        }
        return neighbors;
    }

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        String word = "";
    }

    static class Trie {
        TrieNode root;
        char endSymbol;

        public Trie() {
            this.root = new TrieNode();
            this.endSymbol = '*';
        }

        public void add(String str) {
            TrieNode node = this.root;
            for (int i = 0; i < str.length(); i++) {
                char letter = str.charAt(i);
                if (!node.children.containsKey(letter)) {
                    TrieNode newNode = new TrieNode();
                    node.children.put(letter, newNode);
                }
                node = node.children.get(letter);
            }
            node.children.put(this.endSymbol, null);
            node.word = str;
        }
    }
}