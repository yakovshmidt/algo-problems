package kz.home.ys.algo.medium.optimalPartitionOfStrings;

import java.util.Arrays;

class OptimalPartitionOfStringsWithoutExtraSpace {

    // time - O(N)
    // space - O(1)
    public int partitionString(String s) {
        int[] lastSeen = new int[26];
        Arrays.fill(lastSeen, -1);
        int partitions = 1;
        int substringStart = 0;
        for (int i = 0; i < s.length(); i++) {
            if (lastSeen[s.charAt(i) - 'a'] >= substringStart) {
                partitions++;
                substringStart = i;
            }
            lastSeen[s.charAt(i) - 'a'] = i;
        } 
        return partitions;
    }
}