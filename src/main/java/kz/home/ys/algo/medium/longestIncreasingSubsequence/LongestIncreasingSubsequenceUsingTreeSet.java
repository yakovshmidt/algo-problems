package kz.home.ys.algo.medium.longestIncreasingSubsequence;

import java.util.TreeSet;

class LongestIncreasingSubsequenceUsingTreeSet {

    // time - O(N*log(N))
    // space - O(N)
    public int lengthOfLIS(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            Integer curr = set.ceiling(num);
            if (curr != null) {
                set.remove(curr);
                set.add(num);
            } else {
                set.add(num);
            }
        }

        return set.size();
    }
}