package kz.home.ys.algo.easy.removeDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArrayMyApproach {

    // time - O(N)
    // space - O(1)
    public int removeDuplicates(int[] nums) {
        int idxToReplace = 1;
        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i - 1];
            int curr = nums[i];
            if (prev != curr) {
                nums[idxToReplace] = curr;
                idxToReplace++;
            }
        }
        return idxToReplace;
    }
}
