package kz.home.ys.algo.easy.missingNumber;

import java.util.HashSet;
import java.util.Set;

class MissingNumberUsignHashSet {

    // time - O(N)
    // space - O(N)
    public int missingNumber(int[] nums) {
        Set<Integer> numsAsSet = new HashSet<>(nums.length);
        for (int num : nums) {
            numsAsSet.add(num);
        }
        
        for (int i = 0; i <= nums.length; i++) {
            if (!numsAsSet.contains(i)) {
                return i;
            }
        }
        
        return -1;
    }
}