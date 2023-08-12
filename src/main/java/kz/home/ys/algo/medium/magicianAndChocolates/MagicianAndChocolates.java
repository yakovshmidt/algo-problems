package kz.home.ys.algo.medium.magicianAndChocolates;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MagicianAndChocolates {
    private static final int MOD = 1_000_000_007;

    public int nchoc(int A, List<Integer> B) {
        /*

        A = 5
        b = [2, 4, 6, 8, 10]

        1) b = [2, 4, 6, 8, 5], r = 10

        2) b = [2, 4, 6, 4, 5], r = 18

        3) b = [2, 4, 3, 4, 5], r = 24

        4) b = [2, 4, 3, 4, 2], r = 29

        5) b = [2, 2, 3, 4, 2], r = 33

        */

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < B.size(); i++) {
            maxHeap.offer(B.get(i));
        }

        int result = 0;

        while (A-- > 0) {
            int currMax = maxHeap.poll();
            result += (currMax % MOD);
            result %= MOD;
            maxHeap.offer(currMax / 2);
        }

        return result;
    }
}
