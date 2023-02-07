package kz.home.ys.algo.medium.wiggleSortII;

class WiggleSortII {

    // time - O(N*log(N))
    // space - O(N)
    public void wiggleSort(int[] nums) {
        /*
        
        Approach:
            
            Example 1: nums = [1,5,1,1,6,4]

            1,5,1,6,1,4
                    |
        
            Example 2: nums = [1,3,2,2,3,1]

            1,3,2,2,3,1

            is odd -> greater than neighbours
            is even -> lower than neighbours

            MAX,1,3,2,3,1,2

            time - O(N)
            space - O(1)
        */

        // 5,5,5,4,4,4,4
        for (int i = 0; i < nums.length - 1; i++) {
            int curr = nums[i]; // 5
            int next = nums[i + 1]; // 5
            if (i % 2 == 0) { // even
                if (curr > next) swap(nums, i, i + 1);
            } else { // odd
                if (curr < next) swap(nums, i, i + 1);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}