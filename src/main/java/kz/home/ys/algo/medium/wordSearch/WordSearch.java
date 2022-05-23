package kz.home.ys.algo.medium.wordSearch;

class WordSearch {
    
    // time - O(N*M*4^WORD_LENGTH)
    // space - O(N*M)
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dfs(board, word, visited, 0, i, j)) return true;
            }
        }
        
        return false;
    }
    
    private boolean dfs(char[][] board, String word, boolean[][] visited, int idx, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length || visited[i][j] || board[i][j] != word.charAt(idx)) return false;

        visited[i][j] = true;

        if (idx == word.length() - 1) return true;
        
        boolean found = dfs(board, word, visited, idx + 1, i + 1, j)
            || dfs(board, word, visited, idx + 1, i - 1, j)
            || dfs(board, word, visited, idx + 1, i, j + 1)
            || dfs(board, word, visited, idx + 1, i, j - 1);
     
        visited[i][j] = false;
        return found;
    }
}