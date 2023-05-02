package kz.home.ys.algo.medium.minimumNumberOfStepsToMakeTwoStringsAnagram;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {

    public int minSteps(String s, String t) {
        /*

        Constraints:
        s.length == t.length
        1 <= s.length == t.length <= 5 * 10^4
        only lowercase English letters

        Approach:
        Input: s = "bab", t = "aba"
        s:
            b -> 2
            a -> 1

        t:
            b -> 1
            a -> 2

        1. create 2 hash maps
        2. compare them by keys
            2.1. t contains a key from s -> get value and
            2.2. t does not contain

        time - O(2*N) -> O(N)
        space - O(2*N) -> O(N)

        */

        Map<Character, Integer> sCounts = new HashMap<>();
        for (char letter : s.toCharArray()) {
            sCounts.put(letter, sCounts.getOrDefault(letter, 0) + 1);
        }
        Map<Character, Integer> tCounts = new HashMap<>();
        for (char letter : t.toCharArray()) {
            tCounts.put(letter, tCounts.getOrDefault(letter, 0) + 1);
        }

        int minSteps = 0;
        for (var entry : sCounts.entrySet()) {
            char letter = entry.getKey();
            int sCount = entry.getValue();
            if (tCounts.containsKey(letter)) {
                int tCount = tCounts.get(letter);
                if (tCount < sCount) {
                    minSteps += (sCount - tCount);
                }
            } else {
                minSteps += sCount;
            }
        }
        return minSteps;
    }
}
