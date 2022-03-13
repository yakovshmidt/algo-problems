package kz.home.ys.algo.medium.generateParenthesis;

import java.util.ArrayList;
import java.util.List;

class GenerateParenthesisBacktracking {
    
    // time - ???
    // space - ???
    public List<String> generateParenthesis(int n) {
        List<String> parentheses = new ArrayList<>();
        generateParenthesis(parentheses, new StringBuilder(), n, 0, 0);
        return parentheses;
    }
    
    private void generateParenthesis(List<String> parentheses, StringBuilder curr, int max, int opened, int closed) {
        if (opened + closed == max * 2) {
            parentheses.add(curr.toString());
            return;
        } 

        if (opened < max) {
           generateParenthesis(parentheses, curr.append("("), max, opened + 1, closed);
           curr.deleteCharAt(curr.length() - 1);
        }
        if (closed < opened) {
            generateParenthesis(parentheses, curr.append(")"), max, opened, closed + 1);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}