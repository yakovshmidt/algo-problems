package kz.home.ys.algo.medium.constructQuadTree;
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
};

class ConstructQuadTree {
    public Node construct(int[][] grid) {
        return constructHelper(grid, 0, 0, grid.length);
    }

    private Node constructHelper(int[][] grid, int rowStart, int colStart, int length) {
        boolean sameValue = true;
        for (int row = rowStart; row < rowStart + length; row++) {
            for (int col = colStart; col < colStart + length; col++) {
                if (grid[row][col] != grid[rowStart][colStart]) {
                    sameValue = false;
                    break;
                }
            }
        }

        if (!sameValue) {
            return new Node(
                false, 
                false,
                constructHelper(grid, rowStart, colStart, length / 2),
                constructHelper(grid, rowStart, colStart + length / 2, length / 2),
                constructHelper(grid, rowStart + length / 2, colStart, length / 2),
                constructHelper(grid, rowStart + length / 2, colStart + length / 2, length / 2)
            );
        } else {
            return new Node(grid[rowStart][colStart] == 1, true);
        }
    }
}