package kz.home.ys.algo.easy.validParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class ValidParentheses {

    private static final Map<Character, Character> PARENTHESES;

    static {
        PARENTHESES = new HashMap<>(3);
        PARENTHESES.put('}', '{');
        PARENTHESES.put(')', '(');
        PARENTHESES.put(']', '[');
    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (char curr : s.toCharArray()) {
            if (PARENTHESES.containsKey(curr)) {
                if (stack.isEmpty()) return false;
                else {
                    char prev = stack.pop();
                    if (prev != PARENTHESES.get(curr)) return false;
                }
            } else {
                stack.push(curr);
            }
        }
        
        return stack.isEmpty();
    }
}