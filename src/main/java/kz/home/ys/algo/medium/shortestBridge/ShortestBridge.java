package kz.home.ys.algo.medium.shortestBridge;

import java.util.LinkedList;

class ShortestBridge {

    private int[][] grid;
    private int n;
    private LinkedList<int[]> queue;

    public int shortestBridge(int[][] grid) {
        /* 
        
        BFS

        Approach:
        1) find one island
        2) add all lands of the island to the queue
        3) from lands get next levels of waters till we achieve next land
        4) return number of levels we went through

        time - O(N)
        space - O(N)

        */


        this.grid = grid;
        this.n = grid.length;
        this.queue = new LinkedList<>();
        int firstI = -1;
        int firstJ = -1;
        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    firstI = i;
                    firstJ = j;
                    break outer;
                }
            }
        }

        getAllLandsOfFirstIsland(firstI, firstJ);

        int minFlipsAmount = 0;
        while (!queue.isEmpty()) {
            minFlipsAmount++;
            int size = queue.size();
            while (size > 0) {
                int[] curr = queue.removeLast();
                int i = curr[0];
                int j = curr[1];
                for (int[] neighbour : getNeighbourPositions(i, j)) {
                    int nI = neighbour[0];
                    int nJ = neighbour[1];
                    if (isNotOutOfBound(nI, nJ)) {
                        int nPosition = grid[nI][nJ];
                        grid[nI][nJ] = -1;
                        if (nPosition == 0) {
                            queue.addFirst(new int[]{nI, nJ});
                        } else if (nPosition == 1) {
                            return minFlipsAmount;
                        }
                    }
                }
                grid[i][j] = 2;

                size--;
            }
        }

        return minFlipsAmount;
    }

    private void getAllLandsOfFirstIsland(int i, int j) {
        grid[i][j] = 2;
        queue.addFirst(new int[]{i, j});
        for (int[] neighbour : getNeighbourPositions(i, j)) {
            int nI = neighbour[0];
            int nJ = neighbour[1];
            if (isNotOutOfBound(nI, nJ) && grid[nI][nJ] == 1) {
                getAllLandsOfFirstIsland(nI, nJ);
            }
        }
    }

    private boolean isNotOutOfBound(int i, int j) {
        return i >= 0 && j >= 0 && i < n && j < n;
    }

    private int[][] getNeighbourPositions(int i, int j) {
        int[][] neighbours = new int[4][2];
        neighbours[0] = new int[]{i - 1, j};
        neighbours[1] = new int[]{i + 1, j};
        neighbours[2] = new int[]{i, j - 1};
        neighbours[3] = new int[]{i, j + 1};
        return neighbours;
    }
}





