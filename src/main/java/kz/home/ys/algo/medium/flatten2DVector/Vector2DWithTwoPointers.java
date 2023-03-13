package kz.home.ys.algo.medium.flatten2DVector;

import java.util.NoSuchElementException;

class Vector2DWithTwoPointers {

    private Integer rowIdx = 0;
    private Integer colIdx = 0;
    private final int[][] vec;

    public Vector2DWithTwoPointers(int[][] vec) {
        this.vec = vec;
    }

    private void advanceToNext() {
        while (rowIdx < vec.length && colIdx == vec[rowIdx].length) {
            colIdx = 0;
            rowIdx++;
        }
    }

    public int next() {
        if (!hasNext()) throw new NoSuchElementException();

        return vec[rowIdx][colIdx++];
    }

    public boolean hasNext() {
        advanceToNext();

        return rowIdx < vec.length;
    }
}

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D obj = new Vector2D(vec);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */