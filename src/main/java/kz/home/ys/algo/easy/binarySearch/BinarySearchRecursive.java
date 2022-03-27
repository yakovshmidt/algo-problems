package kz.home.ys.algo.easy.binarySearch;

class BinarySearchRecursive {

    // time - O(log(N))
    // space - O(1) - if we don't take account of stack extra space
    public int search(int[] nums, int target) {
        return searchBST(nums, target, 0, nums.length - 1);
    }
    
    private int searchBST(int[] nums, int target, int low, int high) {
        if (low > high) return -1;
        
        int mid = low + ((high - low) / 2);
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return searchBST(nums, target, low, mid - 1);
        } else {
            return searchBST(nums, target, mid + 1, high);
        }
    }
}