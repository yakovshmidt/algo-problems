package kz.home.ys.algo.medium.leftmostColumnWithAtLeastAOne;

import java.util.List;

class LeftmostColumnWithAtLeastAOne {

    // time - O(R * log(C))
    // space - O(1)
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dimensions = binaryMatrix.dimensions();
        int rows = dimensions.get(0);
        int rightCol = dimensions.get(1);
        
        int minColIdx = Integer.MAX_VALUE;
        for (int rowIdx = 0; rowIdx < rows; rowIdx++) {
            int leftCol = 0;
            boolean oneFound = false;
            while (leftCol < rightCol) {
                int midCol = leftCol + (rightCol - leftCol) / 2;
                if (binaryMatrix.get(rowIdx, midCol) == 1) {
                    rightCol = midCol;
                    oneFound = true;
                } else {
                    leftCol = midCol + 1;
                }
            }
            if (oneFound) minColIdx = Math.min(minColIdx, leftCol);
        }

        return (minColIdx == Integer.MAX_VALUE) ? -1 : minColIdx;
    }
}