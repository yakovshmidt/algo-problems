package kz.home.ys.algo.hard.removeInvalidParentheses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class RemoveInvalidParenthesesLeetCodeBacktracking {
    
    private final Set<String> validExpressions = new HashSet<>();
    private int minimumRemoved = Integer.MAX_VALUE;
    
    public List<String> removeInvalidParentheses(String s) {
        recurse(s, 0, 0, 0, new StringBuilder(), 0);
        return new ArrayList<>(validExpressions);
    }
    
    private void recurse(String s, int index, int leftCount, int rightCount, StringBuilder expression, int removedCount) {
        if (index == s.length()) {
            if (leftCount == rightCount) {
                if (removedCount <= minimumRemoved) {
                    String possibleAnswer = expression.toString();
                    
                    if (removedCount < minimumRemoved) {
                        validExpressions.clear();
                        minimumRemoved = removedCount;
                    }
                    validExpressions.add(possibleAnswer);
                }
            }
        } else {
            char curr = s.charAt(index);
            int length = expression.length();
            
            if (curr != '(' && curr != ')') {
                expression.append(curr);
                recurse(s, index + 1, leftCount, rightCount, expression, removedCount);
                expression.deleteCharAt(length);
            } else {
                recurse(s, index + 1, leftCount, rightCount, expression, removedCount + 1);
                expression.append(curr);
                if (curr == '(') {
                    recurse(s, index + 1, leftCount + 1, rightCount, expression, removedCount);
                } else if (rightCount < leftCount) {
                    recurse(s, index + 1, leftCount, rightCount + 1, expression, removedCount);
                }
                
                expression.deleteCharAt(length);
            }
        }
    }
}