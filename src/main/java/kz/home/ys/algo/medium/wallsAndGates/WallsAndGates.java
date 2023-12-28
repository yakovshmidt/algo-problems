package kz.home.ys.algo.medium.wallsAndGates;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class WallsAndGates {
    public void wallsAndGates(int[][] rooms) {
        /*
        
        Approach: BFS
        start from gates and iterate until a neighbour is greater
        
        Time - O(N*M)
        Space - O(N*M)

        */
        int rows = rooms.length;
        int cols = rooms[0].length;

        Deque<int[]> deque = new LinkedList<>();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (rooms[row][col] == 0) deque.offerLast(new int[] {row, col});
            }
        }

        while (!deque.isEmpty()) {
            int levelSize = deque.size();
            while (levelSize > 0) {
                int[] cell = deque.removeFirst();
                int row = cell[0];
                int col = cell[1];
                int val = rooms[row][col];

                List<int[]> neighbours = getNeighbours(rooms, row, col);
                for (int[] neighbour : neighbours) {
                    if (rooms[neighbour[0]][neighbour[1]] > val + 1) {
                        rooms[neighbour[0]][neighbour[1]] = val + 1;
                        deque.addLast(neighbour);
                    }
                }

                levelSize--;
            }
        }
    }

    private List<int[]> getNeighbours(int[][] rooms, int row, int col) {
        List<int[]> neighbours = new ArrayList<>();
        if (row + 1 < rooms.length) neighbours.add(new int[] {row + 1, col});
        if (row - 1 >= 0) neighbours.add(new int[] {row - 1, col});
        if (col + 1 < rooms[0].length) neighbours.add(new int[] {row, col + 1});
        if (col - 1 >= 0) neighbours.add(new int[] {row, col - 1});
        return neighbours;
    }
}