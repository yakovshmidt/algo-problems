package kz.home.ys.algo.medium.removeAllOccurrencesOfASubstring;

import java.util.Stack;

class RemoveAllOccurrencesOfASubstring {

    // time - O(N*M)
    // space - O(N)
    public String removeOccurrences(String s, String part) {
        Stack<Character> stack = new Stack<>();
        for (char letter : s.toCharArray()) {
            stack.push(letter);
            if (stack.size() >= part.length() && part.charAt(part.length() - 1) == stack.peek()) {
                StringBuilder temp = new StringBuilder();
                for (int i = 0; i < part.length(); i++) {
                    temp.append(stack.pop());
                }
                temp.reverse();
                if (!temp.toString().equals(part)) {
                    for (char c : temp.toString().toCharArray()){
                        stack.push(c);
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}