package kz.home.ys.algo.medium.numberOfProvinces;

class NumberOfProvinces {
    
    // time - O(N)
    // space - O(N)
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];

        int numberOfProvinces = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (visited[i]) continue;
            
            dfs(i, i, visited, isConnected);
            numberOfProvinces++;
        }
        return numberOfProvinces;
    }

    private void dfs(int i, int j, boolean[] visited, int[][] isConnected) {
        if (visited[j] || isConnected[i][j] == 0) return;
        visited[j] = true;
        
        for (int k = 0; k < isConnected.length; k++) {
            dfs(j, k, visited, isConnected);
        }
    }
}