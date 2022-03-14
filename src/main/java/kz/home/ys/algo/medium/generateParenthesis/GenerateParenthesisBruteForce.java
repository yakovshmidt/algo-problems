package kz.home.ys.algo.medium.generateParenthesis;

import java.util.ArrayList;
import java.util.List;

class GenerateParenthesisBruteForce {

    public List<String> generateParenthesis(int n) {
        List<String> balancedParenthesis = new ArrayList<>();
        generateAllCombinationsOfParenthesis(balancedParenthesis, new char[n * 2], 0);
        return balancedParenthesis;
    }

    private void generateAllCombinationsOfParenthesis(List<String> balancedParenthesis, char[] curr, int pos) {
        if (curr.length == pos) {
            if (isValid(curr)) {
                balancedParenthesis.add(new String(curr));
            }
        } else {
            curr[pos] = '(';
            generateAllCombinationsOfParenthesis(balancedParenthesis, curr, pos + 1);
            curr[pos] = ')';
            generateAllCombinationsOfParenthesis(balancedParenthesis, curr, pos + 1);
        }
    }

    private boolean isValid(char[] curr) {
        int balance = 0;
        for (char c : curr) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return balance == 0;
    }
}