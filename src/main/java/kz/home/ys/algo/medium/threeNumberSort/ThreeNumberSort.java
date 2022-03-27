package kz.home.ys.algo.medium.threeNumberSort;

public class ThreeNumberSort {

    // time - O(N) - where N is length of array
    // space - O(1)
    public int[] threeNumberSort(int[] array, int[] order) {
        int[] counts = getCounts(array, order);
        int[] startIndices = new int[] {0, counts[1], counts[0] + counts[1]};

        for (int i = 0; i < 3; i++) {
            int count = counts[i];
            int idx = startIndices[i];

            while (count > 0) {
                array[idx] = order[i];
                idx++;
                count--;
            }
        }

        return array;
    }

    private int[] getCounts(int[] array, int[] order) {
        int[] counts = new int[]{0, 0, 0};
        int firstOrder = order[0];
        int secondOrder = order[1];
        for (int curr : array) {
            if (curr == firstOrder) {
                counts[0] = counts[0] + 1;
            } else if (curr == secondOrder) {
                counts[1] = counts[1] + 1;
            } else {
                counts[2] = counts[2] + 1;
            }
        }
        return counts;
    }
}