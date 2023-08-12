package kz.home.ys.algo.hard.largestRectangleInHistogram;

class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        /*
        
        Constraints:
        * 1 <= heights.length <= 10^5
        * 0 <= heights[i] <= 10^4

        Approach:
        1) Divide and conquer

        Example:

        Time: O(N^2) in worst case, O(N*log(N)) in avarage case

        Space: O(N)
        
        */

        return divideAndConquer(heights, 0, heights.length - 1);
    }

    private int divideAndConquer(int[] heights, int startIdx, int endIdx) {
        if (startIdx > endIdx) return 0;

        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        for (int i = startIdx; i <= endIdx; i++) {
            if (heights[i] < min) {
                min = heights[i];
                minIdx = i;
            }
        }

        int currResult = (endIdx - startIdx + 1) * min;

        return Math.max(
            currResult, 
            Math.max(
                divideAndConquer(heights, startIdx, minIdx - 1), 
                divideAndConquer(heights, minIdx + 1, endIdx)
            )
        );
    }
}