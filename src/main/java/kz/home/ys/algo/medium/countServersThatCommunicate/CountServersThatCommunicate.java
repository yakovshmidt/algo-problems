package kz.home.ys.algo.medium.countServersThatCommunicate;

class CountServersThatCommunicate {
    public int countServers(int[][] grid) {
        /*
        
        [
            [1,1,0,0], -> 2
            [0,0,1,1], -> 2
            [0,0,1,0], -> 1
            [0,0,0,1]  -> 1
             1 1 2 1

            Time - O(N * M)
            Space - O(N + M)
        ]
        
        */

        int[] rowNumberOfServers = new int[grid.length];
        int[] colNumberOfServers = new int[grid[0].length];

        int totalServers = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                int col = row[j];
                if (col == 1) {
                    rowNumberOfServers[i]++;
                    colNumberOfServers[j]++;
                    totalServers++;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                int col = row[j];
                if (col == 1) {
                    if (rowNumberOfServers[i] == 1 && colNumberOfServers[j] == 1) {
                        totalServers--;
                    }
                }
            }
        }

        return totalServers;
    }
}