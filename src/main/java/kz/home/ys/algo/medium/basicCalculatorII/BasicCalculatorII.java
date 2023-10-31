package kz.home.ys.algo.medium.basicCalculatorII;

import java.util.LinkedList;
import java.util.Stack;

class BasicCalculatorII {
    public int calculate(String s) {
        /*
        
        Constraints:
        1) 1 <= s.length() <= 3 * 10e5
        2) letters in s
        3) is s always valid?

        Approach:

        Time: O(N)
        Space: O(N)
        
        */
        if (s == null || s.isEmpty()) return 0;

        Stack<Integer> stack = new Stack<>();
        int currNumber = 0;
        char operator = '+';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                currNumber = (currNumber * 10) + (ch - '0');
            }
            if (!Character.isDigit(ch) && !Character.isWhitespace(ch) || i == s.length() - 1) {
                if (operator == '-') {
                    stack.push(-currNumber);
                } else if (operator == '+') {
                    stack.push(currNumber);
                } else if (operator == '*') {
                    stack.push(stack.pop() * currNumber);
                } else if (operator == '/') {
                    stack.push(stack.pop() / currNumber);
                }
                operator = ch;
                currNumber = 0;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}