package kz.home.ys.algo.hard.raceCar;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RaceCarBFS2 {

    // time - O(2^N)
    // space - O(2^N)
    public int raceCar(int target) {
        Deque<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        int moves = 0, position, speed;

        queue.addLast(new int[]{0, 0, 1}); // moves, position, speed

        while (!queue.isEmpty()) {
            int[] curr = queue.pollFirst();
            moves = curr[0];
            position = curr[1];
            speed = curr[2];

            if (position == target) {
                return moves;
            } else if (visited.contains(position + " " + speed)) {
                continue;
            } else {
                visited.add(position + " " + speed);
                queue.offerLast(new int[]{moves + 1, position + speed, speed * 2});
                if ((position + speed > target && speed > 0) || (position + speed < target && speed < 0)) {
                    queue.addLast(new int[]{moves + 1, position, speed > 0 ? -1 : 1});
                }
            }
        }
        return moves;
    }
}
