package kz.home.ys.algo.medium.nestedListWeightSum;

import java.util.List;

class NestedListWeightSum {
    public int depthSum(List<NestedInteger> nestedList) {
        return dfs(nestedList, 1);
    }

    private int dfs(List<NestedInteger> nestedList, int depth) {
        int sum = 0;
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                sum += nestedInteger.getInteger() * depth;
            } else {
                sum += dfs(nestedInteger.getList(), depth + 1);
            }
        }

        return sum;
    }
}