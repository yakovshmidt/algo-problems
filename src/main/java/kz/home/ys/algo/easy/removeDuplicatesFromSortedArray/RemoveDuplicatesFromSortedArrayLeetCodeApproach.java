package kz.home.ys.algo.easy.removeDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArrayLeetCodeApproach {

    // time - O(N)
    // space - O(1)
    public int removeDuplicates(int[] nums) {
        int current = 0;
        for( int i = 0 ; i < nums.length; i++) {
            nums[current] = nums[i];
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
            current++;
        }
        return current;
    }
}
