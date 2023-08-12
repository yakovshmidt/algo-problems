package kz.home.ys.algo.hard.numberOfAtoms;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

class NumberOfAtomsWithStack {

    public String countOfAtoms(String formula) {
        int n = formula.length();

        Stack<Map<String, Integer>> stack = new Stack<>();
        stack.push(new TreeMap<>());

        for (int i = 0; i < n;) {
            if (formula.charAt(i) == '(') {
                stack.push(new TreeMap<>());
                i++;
            } else if (formula.charAt(i) == ')') {
                Map<String, Integer> top = stack.pop();
                int iStart = ++i, multiplicity = 1;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                if (iStart < i) multiplicity = Integer.parseInt(formula.substring(iStart, i));
                for (String name : top.keySet()) {
                    int count = top.get(name);
                    stack.peek().put(name, stack.peek().getOrDefault(name, 0) + count * multiplicity);
                }
            } else {
                int iStart = i++;
                while (i < n && Character.isLowerCase(formula.charAt(i))) i++;
                String name = formula.substring(iStart, i);
                iStart = i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int multiplicity = iStart < i ? Integer.parseInt(formula.substring(iStart, i)) : 1;
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