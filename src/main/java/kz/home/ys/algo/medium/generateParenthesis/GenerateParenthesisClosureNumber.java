package kz.home.ys.algo.medium.generateParenthesis;

import java.util.ArrayList;
import java.util.List;

class GenerateParenthesisClosureNumber {

    // time - ???
    // space - ???
    public List<String> generateParenthesis(int n) {
        List<String> parenthesis = new ArrayList<>();
        if (n == 0) {
            parenthesis.add("");
        } else {
            for (int c = 0; c < n; ++c) {
                for (String left : generateParenthesis(c)) {
                    for (String right : generateParenthesis(n - 1 - c)) {
                        parenthesis.add("(" + left + ")" + right);
                    }
                }
            }
        }
        return parenthesis;
    }
}