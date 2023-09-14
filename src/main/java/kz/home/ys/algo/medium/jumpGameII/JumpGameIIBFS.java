package kz.home.ys.algo.medium.jumpGameII;

import java.util.ArrayDeque;
import java.util.Deque;

class JumpGameIIBFS {

    public int jump(int[] nums) {
      int n = nums.length;
      boolean[] visited = new boolean[n];
      Deque<Integer> deque = new ArrayDeque<>();
      deque.addLast(0);

      int level = 0;
      while (!deque.isEmpty()) {
        int size = deque.size();
        while (size > 0) {
          int idx = deque.removeFirst();
          visited[idx] = true;

          if (idx == n - 1) return level;

          int numOfJumps = nums[idx];
          while (numOfJumps > 0) {
            int nextIdx = idx + numOfJumps;
            if (nextIdx < n && !visited[nextIdx]) deque.addLast(nextIdx);
            numOfJumps--;
          }

          size--;
        }

        level++;          
      }

      return -1;
    }
}