package kz.home.ys.algo.medium.grayCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GrayCodeWithBacktracking {

    private final List<Integer> result = new ArrayList<>();
    private final Set<Integer> visited = new HashSet<>();

    public List<Integer> grayCode(int n) {
        result.add(0);
        visited.add(0);
        dfs(n);
        return result;
    }

    private boolean dfs(int n) {
        if (result.size() == Math.pow(2, n)) return true;

        int current = result.get(result.size() - 1);
        for (int i = 0; i < n; i++) {
            int next = current ^ (1 << i);
            if (!visited.contains(next)) {
                visited.add(next);
                result.add(next);

                if (dfs(n)) return true;

                visited.remove(next);
                result.remove(result.size() - 1);
            }
        }

        return false;
    }
}