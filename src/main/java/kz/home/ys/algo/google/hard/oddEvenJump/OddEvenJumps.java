package kz.home.ys.algo.google.hard.oddEvenJump;

import java.util.Map;
import java.util.TreeMap;

class OddEvenJumps {

    public int oddEvenJumps(int[] arr) {
        int N = arr.length;
        int res = 1;
        boolean[] higher = new boolean[N];
        higher[N - 1] = true;
        boolean[] lower = new boolean[N];
        lower[N - 1] = true;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(arr[N - 1], N - 1);

        for (int i = N - 2; i >= 0; i--) {
            Map.Entry<Integer, Integer> hi = map.ceilingEntry(arr[i]);
            Map.Entry<Integer, Integer> lo = map.floorEntry(arr[i]);

            if (hi != null) {
                higher[i] = lower[hi.getValue()];
            }
            if (lo != null) {
                lower[i] = higher[lo.getValue()];
            }
            if (higher[i]) {
                res++;
            }
            map.put(arr[i], i);
        }

        /*
        
        Explanation

        We need to jump higher and lower alternately to the end.

        Take [5,1,3,4,2] as example.

        If we start at 2,
        we can jump either higher first or lower first to the end,
        because we are already at the end.
        higher(2) = true
        lower(2) = true

        If we start at 4,
        we can't jump higher, higher(4) = false
        we can jump lower to 2, lower(4) = higher(2) = true

        If we start at 3,
        we can jump higher to 4, higher(3) = lower(4) = true
        we can jump lower to 2, lower(3) = higher(2) = true

        If we start at 1,
        we can jump higher to 2, higher(1) = lower(2) = true
        we can't jump lower, lower(1) = false

        If we start at 5,
        we can't jump higher, higher(5) = false
        we can jump lower to 4, lower(5) = higher(4) = false


        Complexity

        Time O(NlogN)
        Space O(N)
        
        */

        return res;
    }
}























