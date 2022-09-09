package kz.home.ys.algo.easy.nextGreaterElementI;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class NextGreaterElementIStack {

    // time - O(N1 + N2)
    // space - O(N2)
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> numsToGreaterIndexes = new HashMap<>();

        for (int num2 : nums2) {
            while (!stack.isEmpty() && num2 > stack.peek()) {
                numsToGreaterIndexes.put(stack.pop(), num2);
            }
            stack.push(num2);
        }
        
        while (!stack.isEmpty()) {
            numsToGreaterIndexes.put(stack.pop(), -1);
        }
        
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = numsToGreaterIndexes.get(nums1[i]);
        }
        
        return result;
    }
}