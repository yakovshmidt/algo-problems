package kz.home.ys.algo.hard.numberOfAtoms;

import java.util.Map;
import java.util.TreeMap;

class NumberOfAtoms {

    private int right = 0;

    // time - O(N) - where N is length of formula * O(M) - where M is number of unique Atoms
    // space - O(H) - where H is number of sub formulas (to put them onto the Java's stack)
    public String countOfAtoms(String formula) {
        StringBuilder ans = new StringBuilder();
        Map<String, Integer> count = parse(formula);
        for (String name : count.keySet()) {
            ans.append(name);
            int multiplicity = count.get(name);
            if (multiplicity > 1) ans.append(multiplicity);
        }
        right = 0;
        return ans.toString();
    }

    private Map<String, Integer> parse(String formula) {
        int n = formula.length();
        Map<String, Integer> count = new TreeMap<>();
        while (right < n && formula.charAt(right) != ')') {
            if (formula.charAt(right) == '(') {
                right++;
                for (Map.Entry<String, Integer> entry : parse(formula).entrySet()) {
                    count.put(entry.getKey(), count.getOrDefault(entry.getKey(), 0) + entry.getValue());
                }
            } else {
                int left = right++;
                while (right < n && Character.isLowerCase(formula.charAt(right))) right++;
                String name = formula.substring(left, right);
                left = right;
                while (right < n && Character.isDigit(formula.charAt(right))) right++;
                int multiplicity = left < right ? Integer.parseInt(formula.substring(left, right)) : 1;
                count.put(name, count.getOrDefault(name, 0) + multiplicity);
            }
        }
        int left = ++right;
        while (right < n && Character.isDigit(formula.charAt(right))) right++;
        if (left < right) {
            int multiplicity = Integer.parseInt(formula.substring(left, right));
            count.replaceAll((k, v) -> count.get(k) * multiplicity);
        }
        return count;
    }
}