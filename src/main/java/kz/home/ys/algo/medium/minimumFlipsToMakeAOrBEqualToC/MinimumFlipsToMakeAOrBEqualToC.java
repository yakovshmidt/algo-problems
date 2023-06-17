package kz.home.ys.algo.medium.minimumFlipsToMakeAOrBEqualToC;

import java.util.Arrays;

class MinimumFlipsToMakeAOrBEqualToC {

    // time - O(N)
    // space - O(N)
    public int minFlips(int a, int b, int c) {
        int[] binaryA = getBinaryArray(a);
        int[] binaryB = getBinaryArray(b);
        int[] binaryC = getBinaryArray(c);

        int numberOfFlips = 0;
        for (int i = 0; i < binaryC.length; i++) {
            if (binaryA[i] == binaryB[i]) {
                if (binaryA[i] == 1) {
                    if (binaryC[i] == 0) numberOfFlips += 2;
                } else {
                    if (binaryC[i] == 1) numberOfFlips++;
                }
            } else if (binaryA[i] != binaryB[i]) {
                if (binaryC[i] == 0) numberOfFlips++;
            }
        }
        return numberOfFlips;
    }

    private int[] getBinaryArray(int number) {
        int[] binaryArray = new int[32];
        int idx = 0;
        while (number > 0) {
            binaryArray[idx++] = number % 2;
            number /= 2;
        }
        return binaryArray;
    }
}