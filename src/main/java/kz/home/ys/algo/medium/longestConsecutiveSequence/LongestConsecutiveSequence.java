package kz.home.ys.algo.medium.longestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

class LongestConsecutiveSequence {

    // time - O(N)
    // space - O(N)
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        
        int longest = 0;
        for (int num : nums) {
            if (!numsSet.contains(num - 1)) {
                int currentLongest = 1;
                int currentNum = num;
                
                while (numsSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLongest++;
                }
                
                longest = Math.max(longest, currentLongest);
            }
        }
        
        return longest;
    }
}