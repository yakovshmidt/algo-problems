package kz.home.ys.algo.medium.mergeOperationsToTurnArrayIntoAPalindrome;

public class MergeOperationsToTurnArrayIntoAPalindrome {

    public int minimumOperations(int[] nums) {
        int l = 0, r = nums.length - 1;
        int result = 0;
        int left = nums[l], right = nums[r];
        while (l < r) {
            if (left == right) {
                l++;
                r--;
                left = nums[l];
                right = nums[r];
            } else if (left < right) {
                l++;
                result++;
                left += nums[l];
            } else {
                r--;
                result++;
                right += nums[r];
            }
        }

        return result;
    }
}
