package kz.home.ys.algo.medium.kthSmallestElementInASortedMatrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class KthSmallestElementInASortedMatrix {

    // time - O(N^2)
    // space - O(N^2)
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                elements.add(matrix[i][j]);
            }
        }

        Collections.sort(elements);

        return elements.get(k - 1);
    }
}