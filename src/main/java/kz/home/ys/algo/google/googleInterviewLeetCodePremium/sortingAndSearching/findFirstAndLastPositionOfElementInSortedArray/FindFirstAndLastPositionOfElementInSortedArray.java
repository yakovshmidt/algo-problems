package kz.home.ys.algo.google.googleInterviewLeetCodePremium.sortingAndSearching.findFirstAndLastPositionOfElementInSortedArray;

class FindFirstAndLastPositionOfElementInSortedArray {

    // time - O(log(N))
    // space - O(1)
    public int[] searchRange(int[] nums, int target) {
        int firstOccurrence = binarySearch(nums, target, true);
        
        if (firstOccurrence == -1) {
            return new int[] {-1, -1};
        }
        
        int secondOccurrence = binarySearch(nums, target, false);
        
        if (secondOccurrence == -1) {
            return new int[] {-1, -1};
        }
        return new int[]{firstOccurrence, secondOccurrence};
    }
    
    private int binarySearch(int[] nums, int target, boolean isFirst) {
        int begin = 0, end = nums.length - 1;
        while (begin <= end) {
            int mid = begin + (end - begin) / 2;
            
            if (nums[mid] == target) {
                if (isFirst) {
                    if (mid == begin || nums[mid - 1] != target) {
                        return mid;
                    }
                    end = mid - 1;
                } else {
                    if (mid == end || nums[mid + 1] != target) {
                        return mid;
                    }
                    begin = mid + 1;
                }
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }
        return -1;
    }
}