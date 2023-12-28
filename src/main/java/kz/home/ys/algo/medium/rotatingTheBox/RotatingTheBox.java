package kz.home.ys.algo.medium.rotatingTheBox;

import java.util.Arrays;

class RotatingTheBox {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;

        char[][] resultedBox = new char[n][m];
        int newCol = m - 1;
        for (char[] rows : box) {
            for (int col = 0; col < n; col++) {
                resultedBox[col][newCol] = rows[col];
            }
            newCol--;
        }

        for (int col = 0; col < m; col++) {
            int idxToPlace = n - 1;
            int currIdx = n - 1;
            while (currIdx >= 0) {
                if (resultedBox[currIdx][col] == '*') {
                    idxToPlace = currIdx - 1;
                } else if (resultedBox[currIdx][col] == '#') {
                    resultedBox[currIdx][col] = '.';
                    resultedBox[idxToPlace][col] = '#';
                    idxToPlace--;
                }
                currIdx--;
            }
        }

        return resultedBox;
    }
}