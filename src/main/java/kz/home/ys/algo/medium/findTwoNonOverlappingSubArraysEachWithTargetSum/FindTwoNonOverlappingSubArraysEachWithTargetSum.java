package kz.home.ys.algo.medium.findTwoNonOverlappingSubArraysEachWithTargetSum;

public class FindTwoNonOverlappingSubArraysEachWithTargetSum {

    private int lengthOne = Integer.MAX_VALUE;
    private int lengthTwo = Integer.MAX_VALUE;

    public int minSumOfLengths(int[] arr, int target) {
        /*

        Constraints
        1 <= arr.length <= 10^5
        1 <= arr[i] <= 1000
        1 <= target <= 10^8

        Approach: Sliding Window
        Input: arr = [4,3,2,6,2,3,4], target = 6
        4 < 6 -> 4,3 > 6
        3 < 6
        3,2 ->

        Input: arr = [7,3,4,7], target = 7
        7 == 7 -> add to the resulted list
        3,4 == 7 add to the resulted list
        7 == 7 add to the resulted list

        [7] [3,4] [7] ->

        int lengthOne;
        int lengthTwo;

        time - O(N)
        space - O(1)

        */

        int l = 0; // 0
        int r = 0; // 0,1
        int sum = 0;
        while (r < arr.length) {
            sum += arr[r++];  // 3,5,4,6,7
            if (sum == target) { // true,false,false
                addMinLength(r++, l);
                l = r - 1;
            } else if (sum < target) { // true,true
            } else {
                while (l < r && sum > target) {
                    sum -= arr[l++]; // 2,2,4,3
                }
                if (sum == target) {
                    addMinLength(r++, l);
                    l = r - 1;
                }
            }
        }
        if (lengthOne == Integer.MAX_VALUE || lengthTwo == Integer.MAX_VALUE) {
            return -1;
        } else {
            return lengthOne + lengthTwo;
        }
    }

    private void addMinLength(int r, int l) {
        if (lengthOne == lengthTwo) {
            lengthOne = Math.min(lengthOne, r - l);
        } else if (lengthOne > lengthTwo) {
            lengthOne = Math.min(lengthOne, r - l);
        } else {
            lengthTwo = Math.min(lengthTwo, r - l);
        }
    }
}
