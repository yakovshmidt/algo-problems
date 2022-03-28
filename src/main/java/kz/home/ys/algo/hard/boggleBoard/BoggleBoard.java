package kz.home.ys.algo.hard.boggleBoard;

import java.util.*;

class BoggleBoard {

    public List<String> boggleBoard(char[][] board, String[] words) {
        Map<Character, List<String>> firstLetterToWords = mapWords(words);
        Set<String> foundWords = new HashSet<>();
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                char currLetter = board[row][col];
                if (firstLetterToWords.containsKey(currLetter)) {
                    List<String> sortedWordsByFirstLetter = firstLetterToWords.get(currLetter);
                    for (String word : sortedWordsByFirstLetter) {
                        boolean[][] visited = new boolean[board.length][board[0].length];
                        addWordIfFound(board, row, col, word, 0, "", foundWords, visited);
                    }
                }
            }
        }

        return new ArrayList<>(foundWords);
    }

    private Map<Character, List<String>> mapWords(String[] words) {
        Map<Character, List<String>> firstLetterToWords = new HashMap<>();
        for (String word : words) {
            char firstLetter = word.charAt(0);
            if (firstLetterToWords.containsKey(firstLetter)) {
                firstLetterToWords.get(firstLetter).add(word);
            } else {
                List<String> currWords = new ArrayList<>();
                currWords.add(word);
                firstLetterToWords.put(firstLetter, currWords);
            }
        }
        return firstLetterToWords;
    }

    private void addWordIfFound(char[][] board,
                                int row,
                                int column,
                                String word,
                                int currIdx,
                                String prefix,
                                Set<String> foundWords,
                                boolean[][] visited) {
        if (prefix.equals("NOTRE-PEAT")) {
            System.out.println("hi");
        }

        if (word.equals(prefix)) {
            foundWords.add(word);
            return;
        }
        if (currIdx >= word.length()) return;
        if (visited[row][column]) return;

        char wordLetter = word.charAt(currIdx);
        if (wordLetter == board[row][column]) {
            int nextIdx = currIdx + 1;
            String nextPrefix = prefix + wordLetter;
            List<Integer[]> neighbors = getNeighbors(row, column, board);
            visited[row][column] = true;
            for (Integer[] neighbor : neighbors) {
                addWordIfFound(board, neighbor[0], neighbor[1], word, nextIdx, nextPrefix, foundWords, visited);
            }
        }
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
}

