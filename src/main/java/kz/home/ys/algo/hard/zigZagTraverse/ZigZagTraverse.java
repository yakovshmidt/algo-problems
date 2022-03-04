package kz.home.ys.algo.hard.zigZagTraverse;

import java.util.ArrayList;
import java.util.List;

public class ZigZagTraverse {

    // time - O(N)
    // space - O(N)
    public List<Integer> zigzagTraverse(List<List<Integer>> array) {
        int height = array.size() - 1;
        int width = array.get(0).size() - 1;
        List<Integer> result = new ArrayList<>();
        int row = 0;
        int col = 0;
        boolean goingDown = true;
        while (!isOutOfBound(row, col, height, width)) {
            result.add(array.get(row).get(col));
            if (goingDown) {
                if (col == 0 || row == height) {
                    goingDown = false;
                    if (row == height) {
                        col++;
                    } else {
                        row++;
                    }
                } else {
                    row++;
                    col--;
                }
            } else {
                if (row == 0 || col == width) {
                    goingDown = true;
                    if (col == width) {
                        row++;
                    } else {
                        col++;
                    }
                } else {
                    row--;
                    col++;
                }
            }
        }

        return result;
    }

    private boolean isOutOfBound(int row, int col, int height, int width) {
        return row < 0 || col < 0 || row > height || col > width;
    }
}
