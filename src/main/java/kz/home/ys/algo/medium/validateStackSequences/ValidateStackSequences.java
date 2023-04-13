package kz.home.ys.algo.medium.validateStackSequences;

import java.util.Stack;

class ValidateStackSequences {

    // time - O(N)
    // space - O(N)
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = popped.length;
        Stack<Integer> stack = new Stack<>();

        int j = 0;
        for (int p : pushed) {
            stack.push(p);

            while (!stack.isEmpty() && j < n && stack.peek() == popped[j]) {
                j++;
                stack.pop();
            }
        }

        return stack.isEmpty(); 
    }
}