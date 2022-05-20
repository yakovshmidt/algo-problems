package kz.home.ys.algo.medium.combinationSum;

import java.util.ArrayList;
import java.util.List;

class CombinationSum {

    // time - O(2^target)
    // space - O(2^target)
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> allUniqueCombinations = new ArrayList<>();
        dfs(allUniqueCombinations, candidates, target, new ArrayList<>(), 0, 0);
        return allUniqueCombinations;
    }
    
    private void dfs(List<List<Integer>> combinations,
                    int[] candidates,
                    int target,
                    List<Integer> curr,
                    int idx,
                    int total) {
        if (total == target) {
            combinations.add(new ArrayList<>(curr));
            return;
        }
        if (idx >= candidates.length || total > target) {
            return;
        }
        
        curr.add(candidates[idx]);
        dfs(combinations, candidates, target, curr, idx, total + candidates[idx]);
        curr.remove(curr.size() - 1);
        dfs(combinations, candidates, target, curr, idx + 1, total);
    }
}