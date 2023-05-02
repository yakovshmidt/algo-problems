package kz.home.ys.algo.medium.minimumImpossibleOr;

import java.util.HashSet;
import java.util.Set;

class MinimumImpossibleOr {

    // time - O(N)
    // space - O(N)
    public int minImpossibleOR(int[] nums) {
        Set<Integer> numsAsSet = new HashSet<>();
        for (int num : nums) {
            numsAsSet.add(num);
        }
        for (int i = 0; i < 31; i++) {
            if (!numsAsSet.contains(1 << i)) {
                return 1 << i;
            }
        }

        return -1;
    }
}