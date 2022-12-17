package kz.home.ys.algo.medium.sortAnArray;

class SortAnArrayWithMergeSort {

    // time - O(N*log(N))
    // space - O(N) - because we use auxiliary arrays
    public int[] sortArray(int[] nums) {
        sort(nums);
        return nums;
    }

    private void sort(int[] nums) {
        int length = nums.length;
        if (length < 2) return;

        int mid = length / 2;

        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[length - mid];

        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = nums[i];
        }
        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = nums[mid + i];
        }

        // time - O(log(N)
        sort(leftHalf);
        sort(rightHalf);

        // time - O(N)
        merge(leftHalf, rightHalf, nums);
    }

    private void merge(int[] leftHalf, int[] rightHalf, int[] nums) {
        int i = 0, j = 0, k = 0;
        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
                nums[k] = leftHalf[i];
                i++;
            } else {
                nums[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftHalf.length) {
            nums[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightHalf.length) {
            nums[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}