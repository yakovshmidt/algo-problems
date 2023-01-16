package kz.home.ys.algo.medium.evaluateReversePolishNotation;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.BiFunction;

class EvaluateReversePolishNotationUsingStack {

    private final static Map<String, BiFunction<Integer, Integer, Integer>> OPERATIONS = new HashMap<>();

    static {
        OPERATIONS.put("+", Integer::sum);
        OPERATIONS.put("-", (a, b) -> a - b);
        OPERATIONS.put("*", (a, b) -> a * b);
        OPERATIONS.put("/", (a, b) -> a / b);
    }

    // time - O(N)
    // space - O(N)
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (!OPERATIONS.containsKey(token)) {
                stack.push(Integer.parseInt(token));
                continue;
            }

            int second = stack.pop();
            int first = stack.pop();
            stack.push(OPERATIONS.get(token).apply(first, second));
        }

        return stack.pop();
    }
}