package kz.home.ys.algo.easy.searchInsertPosition;

class SearchInsertPosition {

    // time - O(log(N))
    // space - O(1)
    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, target, 0, nums.length - 1);
    }

    private int searchInsert(int[] nums, int target, int low, int high) {
        if (low > high) return low;

        int mid = low + ((high - low) / 2);
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return searchInsert(nums, target, low, mid - 1);
        } else {
            return searchInsert(nums, target, mid + 1, high);
        }
    }
}