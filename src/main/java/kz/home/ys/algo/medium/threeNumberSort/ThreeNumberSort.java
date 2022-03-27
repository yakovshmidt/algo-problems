package kz.home.ys.algo.medium.threeNumberSort;

class ThreeNumberSort {

    // time - O(N * M) - where N is length of array and M is length of order
    // space - O(1)
    public int[] threeNumberSort(int[] array, int[] order) {
        int idxToSwap = 0;
        for (int elementToOrder : order) {
            for (int currIdx = 0; currIdx < array.length; currIdx++) {
                if (elementToOrder == array[currIdx]) {
                    swap(array, idxToSwap, currIdx);
                    idxToSwap++;
                }
            }
        }
        return array;
    }

    private void swap(int[] array, int firstIdx, int secondIdx) {
        int temp = array[firstIdx];
        array[firstIdx] = array[secondIdx];
        array[secondIdx] = temp;
    }
}

