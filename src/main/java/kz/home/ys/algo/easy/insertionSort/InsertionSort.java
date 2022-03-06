package kz.home.ys.algo.easy.insertionSort;

class InsertionSort {

    // time (average, worst) - O(N^2)
    // time (best) - O(N)
    // space - O(1)
    public int[] insertionSort(int[] array) {
        if (array == null) return new int[0];

        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(array, j - 1, j);
                j--;
            }
        }

        return array;
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}

