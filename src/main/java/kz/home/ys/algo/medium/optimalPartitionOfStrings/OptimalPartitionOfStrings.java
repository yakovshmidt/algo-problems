package kz.home.ys.algo.medium.optimalPartitionOfStrings;

import java.util.HashSet;
import java.util.Set;

class OptimalPartitionOfStrings {

    // time - O(N)
    // space - O(N)
    public int partitionString(String s) {
        Set<Character> visited = new HashSet<>();
        int partitions = 1;
        for (char letter : s.toCharArray()) {
            if (visited.contains(letter)) {
                visited.clear();
                partitions++;
            }
            visited.add(letter);
        } 
        return partitions;
    }
}