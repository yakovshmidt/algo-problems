package kz.home.ys.algo.hard.raceCar;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RaceCarBFS1 {

    // time - O(2^N)
    // space - O(2^N)
    public int raceCar(int target) {
        Deque<int[]> queue = new LinkedList<>();
        queue.offerLast(new int[]{0, 1});  // position to speed
        Set<String> visited = new HashSet<>();

        for (int level = 0; !queue.isEmpty(); level++) {
            for (int k = queue.size(); k > 0; k--) {
                int[] curr = queue.pollFirst();

                if (curr[0] == target) {
                    return level;
                }

                int[] next = new int[]{curr[0] + curr[1], curr[1] << 1};
                String key = next[0] + " " + next[1];
                if (!visited.contains(key) && 0 < next[0] && next[0] < (target << 1)) {
                    queue.offerLast(next);
                    visited.add(key);
                }

                next = new int[]{curr[0], curr[1] > 0 ? -1 : 1};
                key = next[0] + " " + next[1];
                if (!visited.contains(key) && 0 < next[0] && next[0] < (target << 1)) {
                    queue.offerLast(next);
                    visited.add(key);
                }
            }
        }
        return -1;
    }
}
