package kz.home.ys.algo.medium.combinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class CombinationSumII {

    // time - O(2^N) - because each number can have another call or not
    // space - O(N) - each step can store all the numbers from candidates
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> allUniqueCombinations = new ArrayList<>();
        backtrack(allUniqueCombinations, candidates, new LinkedList<>(), 0, target);
        return allUniqueCombinations;
    }
    
    private void backtrack(List<List<Integer>> combinations,
                           int[] candidates,
                           LinkedList<Integer> curr,
                           int idx,
                           int remain) {
        if (remain == 0) {
            combinations.add(new ArrayList<>(curr));
            return;
        }
        
        for (int i = idx; i < candidates.length; ++i) {
            int pick = candidates[i];
            if (i > idx && pick == candidates[i - 1]) continue;
         
            if (remain - pick < 0) return;

            curr.addLast(pick);
            backtrack(combinations, candidates, curr, i + 1, remain - pick);
            curr.removeLast();
        }
    }
}