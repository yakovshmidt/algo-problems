package kz.home.ys.algo.medium.buildAnArrayWithStackOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class BuildAnArrayWithStackOperations {

    private static final String PUSH = "Push";
    private static final String POP = "Pop";

    // time - O(N)
    // space - O(N)
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> stack = buildStack(n);

        List<String> answer = new ArrayList<>();

        for (int targetCurr : target) {
            int stackCurr = stack.pop();
            if (stackCurr == targetCurr) {
                answer.add(PUSH);
            } else {
                int numberOfPops = 0;
                while (stackCurr != targetCurr) {
                    answer.add(PUSH);
                    numberOfPops++;
                    stackCurr = stack.pop();
                }
                while (numberOfPops > 0) {
                    answer.add(POP);
                    numberOfPops--;
                }
                answer.add(PUSH);
            }
        }

        return answer;
    }

    private Stack<Integer> buildStack(int n) {
        Stack<Integer> stack = new Stack<>();
        while (n >= 1) {
            stack.push(n);
            n--;
        }
        return stack;
    }
}