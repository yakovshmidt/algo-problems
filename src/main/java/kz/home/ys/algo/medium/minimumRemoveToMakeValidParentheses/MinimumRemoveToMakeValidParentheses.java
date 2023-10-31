package kz.home.ys.algo.medium.minimumRemoveToMakeValidParentheses;

import java.util.*;

class MinimumRemoveToMakeValidParentheses {

    // time - O(N)
    // space - O(N)
    public String minRemoveToMakeValid(String s) {
        Set<Integer> indicesToExclude = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    indicesToExclude.add(i);
                } else {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            indicesToExclude.add(stack.pop());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (indicesToExclude.contains(i)) continue;
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int i = 1 << ('c' - 'a');

        System.out.println(i);
    }
}