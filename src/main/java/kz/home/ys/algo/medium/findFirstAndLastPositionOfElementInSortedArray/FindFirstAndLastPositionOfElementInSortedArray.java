package kz.home.ys.algo.medium.findFirstAndLastPositionOfElementInSortedArray;

class FindFirstAndLastPositionOfElementInSortedArray {

    // time - O(log(N))
    // space - O(1)
    public int[] searchRange(int[] nums, int target) {
        return new int[] {
            binarySearch(nums, target, true),
            binarySearch(nums, target, false)
        };
    }
    
    private int binarySearch(int[] nums, int target, boolean leftBias) {
        int low = 0;
        int high = nums.length - 1;
        
        int i = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                i = mid;
                if (leftBias) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return i;
    }
}