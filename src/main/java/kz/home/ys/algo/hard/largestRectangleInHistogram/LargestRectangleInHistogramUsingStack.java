package kz.home.ys.algo.hard.largestRectangleInHistogram;

import java.util.Stack;

class LargestRectangleInHistogramUsingStack {
    public int largestRectangleArea(int[] heights) {
        /*
        
        Constraints:
        * 1 <= heights.length <= 10^5
        * 0 <= heights[i] <= 10^4

        Approach:
        1) Stack

        Example:

        Time: O(N)

        Space: O(N)
        
        */

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            while (stack.peek() != -1 && heights[stack.peek()] >= heights[i]) {
                int currHeight = heights[stack.pop()];
                int currWidth = i - stack.peek() - 1;
                maxArea = Math.max(maxArea, currHeight * currWidth);
            }
            stack.push(i);
        }
        while (stack.peek() != -1) {
            int currHeight = heights[stack.pop()];
            int currWidth = heights.length - stack.peek() - 1;
            maxArea = Math.max(maxArea, currHeight * currWidth);
        }
        return maxArea;
    }
}