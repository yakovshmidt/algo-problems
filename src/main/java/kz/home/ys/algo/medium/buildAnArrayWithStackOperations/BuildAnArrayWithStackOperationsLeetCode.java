package kz.home.ys.algo.medium.buildAnArrayWithStackOperations;

import java.util.ArrayList;
import java.util.List;

class BuildAnArrayWithStackOperationsLeetCode {

    private static final String PUSH = "Push";
    private static final String POP = "Pop";

    public List<String> buildArray(int[] target, int n) {
        List<String> answer = new ArrayList<>();
        int i = 1;
        int j = 0;
        while (i <= n && j < target.length) {
            answer.add(PUSH);
            if (target[j] == i) j++;
            else answer.add(POP);
            i++;
        }
        return answer;
    }
}