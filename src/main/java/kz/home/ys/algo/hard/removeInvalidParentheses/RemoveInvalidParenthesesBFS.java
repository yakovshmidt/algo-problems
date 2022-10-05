package kz.home.ys.algo.hard.removeInvalidParentheses;

import java.util.*;

class RemoveInvalidParenthesesBFS {

    // time - O(2^N * N) -> O(N)
    // space - O(N)
    public List<String> removeInvalidParentheses(String s) {
        List<String> validParentheses = new ArrayList<>();

        Queue<String> bfs = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        bfs.add(s);
        visited.add(s);

        boolean reached = false;
        while (!bfs.isEmpty()) {
            int count = bfs.size();
            for (int i = 0; i < count; i++) {
                String subS = bfs.poll();

                if (isValidSubstring(subS)) {
                    validParentheses.add(subS);
                    reached = true;
                }

                if (reached) continue;

                for (int idx = 0; idx < subS.length(); idx++) {
                    if (subS.charAt(idx) != '(' && subS.charAt(idx) != ')') continue;

                    String subSubS = subS.substring(0, idx) + subS.substring(idx + 1);

                    if (!visited.contains(subSubS)) {
                        bfs.add(subSubS);
                        visited.add(subSubS);
                    }
                }
            }
            if (reached) break;
        }

        return validParentheses;
    }

    private boolean isValidSubstring(String s) {
        Stack<Character> stack = new Stack<>();
        for (int idx = 0; idx < s.length(); idx++) {
            char letterOrParenthese = s.charAt(idx);
            if (letterOrParenthese == '(') {
                stack.push(letterOrParenthese);
            } else if (letterOrParenthese == ')') {
                if (stack.isEmpty() || stack.pop() == ')') return false;
            }
        }
        return stack.isEmpty();
    }
}