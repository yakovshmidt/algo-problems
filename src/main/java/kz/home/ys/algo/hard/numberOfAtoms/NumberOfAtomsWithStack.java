package kz.home.ys.algo.hard.numberOfAtoms;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

class NumberOfAtomsWithStack {

    public String countOfAtoms(String formula) {
        int n = formula.length();

        Stack<Map<String, Integer>> stack = new Stack<>();
        stack.push(new TreeMap<>());

        int right = 0;
        while (right < n) {
            if (formula.charAt(right) == '(') {
                stack.push(new TreeMap<>());
                right++;
            } else if (formula.charAt(right) == ')') {
                Map<String, Integer> top = stack.pop();
                int left = ++right, multiplicity = 1;
                while (right < n && Character.isDigit(formula.charAt(right))) right++;
                if (left < right) multiplicity = Integer.parseInt(formula.substring(left, right));
                for (String name : top.keySet()) {
                    int count = top.get(name);
                    stack.peek().put(name, stack.peek().getOrDefault(name, 0) + count * multiplicity);
                }
            } else {
                int left = right++;
                while (right < n && Character.isLowerCase(formula.charAt(right))) right++;
                String name = formula.substring(left, right);
                left = right;
                while (right < n && Character.isDigit(formula.charAt(right))) right++;
                int multiplicity = left < right ? Integer.parseInt(formula.substring(left, right)) : 1;
                stack.peek().put(name, stack.peek().getOrDefault(name, 0) + multiplicity);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (var entry : stack.pop().entrySet()) {
            ans.append(entry.getKey());
            if (entry.getValue() > 1) ans.append(entry.getValue());
        }

        return ans.toString();
    }
}