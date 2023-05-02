package kz.home.ys.algo.easy.lastStoneWeight;

import java.util.PriorityQueue;

class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        /* 
        
        Constraints
        * 1 <= stones.length <= 30
        * 1 <= stones[i] <= 1000

        Input: stones = [2,7,4,1,8,1]

        Approach:
        1. PriorityQueue (Max Heap)
        2. we take out two haviest stones, smash them, and return diff or nothing
        3. go on step 2 till there is no or one element

        time - O(N*log(N))
        space - O(N)

        */

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int stone : stones) {
            queue.add(stone);
        }

        while (queue.size() > 1) {
            int y = queue.remove();
            int x = queue.remove();
            if (x != y) queue.add(y - x);
        }

        return (queue.isEmpty()) ? 0 : queue.remove();
    }
}